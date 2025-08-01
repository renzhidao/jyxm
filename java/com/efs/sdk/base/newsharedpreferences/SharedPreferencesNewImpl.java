package com.efs.sdk.base.newsharedpreferences;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class SharedPreferencesNewImpl implements SharedPreferences {
    private static final String BACKUP_FILE_SUFFIX = ".bak";
    private static final int CONTENT_LENGTH_LOST = 1;
    private static final int CONTENT_OVER_SIZE = 7;
    private static final int DATA_TYPE_ERROR = 8;
    private static final int DATA_TYPE_INVALID = 9;
    private static final long DELAY_TIME_TO_SAVE = 1000;
    private static final byte FINISH_MARK = (byte) 18;
    private static final int FINISH_MARK_LENGTH = 1;
    private static final int ID_LENGTH = 4;
    private static final int INIT_EXCEPTION = 10;
    private static final int LOAD_BAK_FILE = 12;
    private static final int MAPPED_BUFFER_ERROR = 4;
    private static final int MAX_HANDLERTHREAD = 3;
    private static final long MAX_LOCK_FILE_TIME = 10000;
    private static final int MAX_NUM = Integer.MAX_VALUE;
    private static final int MAX_TRY_TIME = 6;
    private static final int MIN_INCREASE_LENGTH = 1024;
    private static final int MODIFY_ID_LOST = 2;
    private static final int OTHER_EXCEPTION = 11;
    private static final String TAG = "SharedPreferencesNew";
    private static final long TRY_RELOAD_INTERVAL = 60;
    private static final int TRY_SAVE_TIME_DELAY = 2000;
    private static final int TYPE_CAST_EXCEPTION = 13;
    private static final int VALUE_LOST = 3;
    private static final Object mFileMonitorSyncObj = new Object();
    private static HandlerThread[] mHandlerThreadPool = new HandlerThread[3];
    private static final int mSaveMessageID = 21310;
    private static ExecutorService sCachedThreadPool = Executors.newCachedThreadPool();
    private String mBackupFilePath;
    private int mCurTryTime;
    private Vector<Editor> mEditorList;
    private OnSharedPreferenceErrorListener mErrorListener;
    private File mFile;
    private FileChannel mFileChannel;
    private FileMonitor mFileMonitor;
    private Handler mHandler;
    private boolean mIsSaving;
    private final ArrayList<OnSharedPreferenceChangeListener> mListeners;
    private boolean mLoaded;
    private final LinkedHashMap<String, Object> mMap;
    private MappedByteBuffer mMappedByteBuffer;
    private int mModifyErrorCnt;
    private int mModifyID;
    private RunnableEx mSaveRunnable;
    private final Object mSyncObj;
    private final Object mSyncSaveObj;
    private final Runnable mTryReloadRunnable;
    private long mTryReloadStartTime;

    public static class ByteFloatUtils {
        private ByteFloatUtils() {
        }

        public static float bytesToFloat(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getFloat();
        }

        public static byte[] floatToBytes(float f) {
            return ByteBuffer.allocate(4).putFloat(f).array();
        }
    }

    public static class ByteIntUtils {
        private ByteIntUtils() {
        }

        public static int bytesToInt(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getInt();
        }

        public static byte[] intToBytes(int i) {
            return ByteBuffer.allocate(4).putInt(i).array();
        }
    }

    public static class ByteLongUtils {
        private ByteLongUtils() {
        }

        public static long bytesToLong(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getLong();
        }

        public static byte[] longToBytes(long j) {
            return ByteBuffer.allocate(8).putLong(j).array();
        }
    }

    public final class EditorImpl implements Editor {
        private boolean mClear;
        private HashMap<String, Object> mModified = new HashMap();

        public final void apply() {
            SharedPreferencesNewImpl.this.save(this, false, false, true);
        }

        public final Editor clear() {
            synchronized (this) {
                this.mClear = true;
            }
            return this;
        }

        public final boolean commit() {
            SharedPreferencesNewImpl.this.save(this, false, true, false);
            return true;
        }

        public final boolean doClear() {
            boolean z;
            synchronized (this) {
                z = this.mClear;
                this.mClear = false;
            }
            return z;
        }

        public final HashMap<String, Object> getAll() {
            HashMap<String, Object> hashMap;
            synchronized (this) {
                hashMap = this.mModified;
            }
            return hashMap;
        }

        public final Editor putBoolean(String str, boolean z) {
            synchronized (this) {
                this.mModified.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        public final Editor putFloat(String str, float f) {
            synchronized (this) {
                this.mModified.put(str, Float.valueOf(f));
            }
            return this;
        }

        public final Editor putInt(String str, int i) {
            synchronized (this) {
                this.mModified.put(str, Integer.valueOf(i));
            }
            return this;
        }

        public final Editor putLong(String str, long j) {
            synchronized (this) {
                this.mModified.put(str, Long.valueOf(j));
            }
            return this;
        }

        public final Editor putString(String str, String str2) {
            synchronized (this) {
                this.mModified.put(str, str2);
            }
            return this;
        }

        public final Editor putStringSet(String str, Set<String> set) {
            throw new RuntimeException("putStringSet is not supported!");
        }

        public final Editor remove(String str) {
            synchronized (this) {
                this.mModified.put(str, null);
            }
            return this;
        }
    }

    public final class FileMonitor extends FileObserver {
        public FileMonitor(String str, int i) {
            super(str, i);
        }

        public final void onEvent(int i, String str) {
            if (SharedPreferencesNewImpl.this.mListeners.size() > 0) {
                SharedPreferencesNewImpl.this.tryReload();
            } else {
                stopWatching();
            }
        }
    }

    public interface OnSharedPreferenceErrorListener {
        void onError(String str, int i, long j);
    }

    public static abstract class RunnableEx implements Runnable {
        private Object mArg;

        public Object getArg() {
            return this.mArg;
        }

        public void setArg(Object obj) {
            this.mArg = obj;
        }
    }

    public class SUPPORTED_TYPE {
        public static final byte TYPE_BOOLEAN = (byte) 4;
        public static final byte TYPE_FLOAT = (byte) 2;
        public static final byte TYPE_INT = (byte) 1;
        public static final byte TYPE_LONG = (byte) 3;
        public static final byte TYPE_STRING = (byte) 5;

        private SUPPORTED_TYPE() {
        }
    }

    static {
        for (int i = 0; i < 3; i++) {
            mHandlerThreadPool[i] = new HandlerThread("newsp".concat(String.valueOf(i)));
            mHandlerThreadPool[i].start();
        }
    }

    public SharedPreferencesNewImpl(File file) {
        this(file, 0, null, false);
    }

    public SharedPreferencesNewImpl(File file, int i, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this(file, i, onSharedPreferenceErrorListener, false);
    }

    public SharedPreferencesNewImpl(File file, int i, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener, boolean z) {
        this.mMap = new LinkedHashMap();
        this.mListeners = new ArrayList();
        this.mLoaded = true;
        this.mSyncObj = new Object();
        this.mSyncSaveObj = new Object();
        this.mEditorList = new Vector();
        this.mIsSaving = false;
        this.mTryReloadRunnable = new Runnable() {
            public void run() {
                int modifyID = SharedPreferencesNewImpl.this.getModifyID();
                if (modifyID > 0 && modifyID != SharedPreferencesNewImpl.this.mModifyID) {
                    SharedPreferencesNewImpl.this.saveInner(false);
                }
            }
        };
        this.mSaveRunnable = new RunnableEx() {
            public void run() {
                SharedPreferencesNewImpl.this.saveInner(((Boolean) getArg()).booleanValue());
            }
        };
        this.mErrorListener = onSharedPreferenceErrorListener;
        this.mHandler = new Handler(getHandlerThread().getLooper());
        this.mFile = file;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getAbsolutePath());
        stringBuilder.append(BACKUP_FILE_SUFFIX);
        this.mBackupFilePath = stringBuilder.toString();
        if (initBuffer()) {
            startLoadFromDisk(z);
        }
        this.mHandler.post(new Runnable() {
            public void run() {
                try {
                    File file = new File(SharedPreferencesNewImpl.this.mBackupFilePath);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SharedPreferencesNewImpl(File file, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this(file, 0, onSharedPreferenceErrorListener, false);
    }

    public SharedPreferencesNewImpl(File file, boolean z) {
        this(file, 0, null, z);
    }

    private MappedByteBuffer allocBuffer(int i) {
        Buffer buffer = this.mMappedByteBuffer;
        int position = buffer != null ? buffer.position() : 0;
        try {
            this.mMappedByteBuffer = this.mFileChannel.map(MapMode.READ_WRITE, 0, (long) i);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        Buffer buffer2 = this.mMappedByteBuffer;
        if (buffer2 != null) {
            buffer2.position(position);
        }
        return this.mMappedByteBuffer;
    }

    private void awaitLoadedLocked() {
        if (!this.mLoaded) {
            synchronized (this) {
                while (!this.mLoaded) {
                    try {
                        wait();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        tryReload();
    }

    private void backup() {
        Closeable closeable;
        Throwable th;
        Closeable closeable2 = null;
        try {
            File file = new File(this.mBackupFilePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            Closeable fileOutputStream = new FileOutputStream(file);
            try {
                closeable2 = fileOutputStream.getChannel();
                this.mFileChannel.transferTo(0, (long) this.mMappedByteBuffer.capacity(), closeable2);
                safeClose(fileOutputStream);
                safeClose(closeable2);
            } catch (Throwable th2) {
                Throwable th3 = th2;
                closeable = closeable2;
                closeable2 = fileOutputStream;
                th = th3;
                try {
                    th.printStackTrace();
                } finally {
                    safeClose(closeable2);
                    safeClose(closeable);
                }
            }
        } catch (Throwable th22) {
            th = th22;
            closeable = null;
            th.printStackTrace();
        }
    }

    private byte getBCCCode(byte[] bArr) {
        byte b = (byte) 0;
        for (byte b2 : bArr) {
            b = (byte) (b ^ b2);
        }
        return b;
    }

    private byte[] getBytes(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return ((String) obj).getBytes();
                }
                if (obj instanceof Boolean) {
                    int i = 1;
                    byte[] bArr = new byte[1];
                    if (!((Boolean) obj).booleanValue()) {
                        i = 0;
                    }
                    bArr[0] = (byte) i;
                    return bArr;
                } else if (obj instanceof Float) {
                    return ByteFloatUtils.floatToBytes(((Float) obj).floatValue());
                } else {
                    if (obj instanceof Integer) {
                        return ByteIntUtils.intToBytes(((Integer) obj).intValue());
                    }
                    if (obj instanceof Long) {
                        return ByteLongUtils.longToBytes(((Long) obj).longValue());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    /* DevToolsApp WARNING: Missing block: B:24:0x0054, code:
            return -1;
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x005e, code:
            return r4;
     */
    private int getContentLength() {
        /*
        r7 = this;
        r0 = r7.mMappedByteBuffer;
        r1 = -1;
        if (r0 == 0) goto L_0x0062;
    L_0x0005:
        r0 = r7.mFileChannel;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0062;
    L_0x000a:
        r0 = r7.mSyncObj;
        monitor-enter(r0);
        r2 = r7.mMappedByteBuffer;	 Catch:{ all -> 0x005f }
        r3 = 0;
        r2.position(r3);	 Catch:{ all -> 0x005f }
        r2 = 4;
        r3 = new byte[r2];	 Catch:{ all -> 0x005f }
        r4 = r7.mMappedByteBuffer;	 Catch:{ all -> 0x005f }
        r7.safeBufferGet(r4, r3);	 Catch:{ all -> 0x005f }
        r4 = com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.ByteIntUtils.bytesToInt(r3);	 Catch:{ all -> 0x005f }
        r5 = r7.mMappedByteBuffer;	 Catch:{ all -> 0x005f }
        r5.position(r2);	 Catch:{ all -> 0x005f }
        r2 = r7.mMappedByteBuffer;	 Catch:{ all -> 0x005f }
        r2 = r2.get();	 Catch:{ all -> 0x005f }
        r5 = 18;
        if (r2 == r5) goto L_0x0034;
    L_0x002e:
        r3 = r7.getMaskByte(r3);	 Catch:{ all -> 0x005f }
        if (r2 != r3) goto L_0x0036;
    L_0x0034:
        if (r4 >= 0) goto L_0x0055;
    L_0x0036:
        r2 = r7.mErrorListener;	 Catch:{ all -> 0x005f }
        if (r2 == 0) goto L_0x0053;
    L_0x003a:
        r3 = r7.mFile;	 Catch:{ all -> 0x005f }
        if (r3 == 0) goto L_0x0043;
    L_0x003e:
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x005f }
        goto L_0x0044;
    L_0x0043:
        r3 = 0;
    L_0x0044:
        r4 = 1;
        r5 = r7.mFile;	 Catch:{ all -> 0x005f }
        if (r5 == 0) goto L_0x004e;
    L_0x0049:
        r5 = r5.length();	 Catch:{ all -> 0x005f }
        goto L_0x0050;
    L_0x004e:
        r5 = 0;
    L_0x0050:
        r2.onError(r3, r4, r5);	 Catch:{ all -> 0x005f }
    L_0x0053:
        monitor-exit(r0);	 Catch:{ all -> 0x005f }
        return r1;
    L_0x0055:
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r4 <= r1) goto L_0x005d;
    L_0x005a:
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x005d:
        monitor-exit(r0);	 Catch:{ all -> 0x005f }
        return r4;
    L_0x005f:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x005f }
        throw r1;
    L_0x0062:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.getContentLength():int");
    }

    private Pair<Integer, byte[][]> getDataBytes() {
        Object obj;
        ArrayList arrayList;
        synchronized (this.mMap) {
            obj = new byte[(this.mMap.size() * 5)][];
            arrayList = new ArrayList(this.mMap.entrySet());
            this.mEditorList.clear();
        }
        int i = 0;
        int i2 = 0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Entry entry = (Entry) arrayList.get(size);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!(str == null || str.trim().length() <= 0 || value == null)) {
                byte[] bytes = str.getBytes();
                byte[] intToBytes = ByteIntUtils.intToBytes(bytes.length);
                obj[i2] = intToBytes;
                obj[i2 + 1] = bytes;
                int length = (intToBytes.length + bytes.length) + i;
                byte[] bytes2 = getBytes(value);
                bytes = ByteIntUtils.intToBytes(bytes2.length);
                obj[i2 + 2] = bytes;
                obj[i2 + 3] = bytes2;
                int length2 = (bytes.length + bytes2.length) + length;
                obj[i2 + 4] = new byte[]{(byte) getObjectType(value)};
                i = length2 + 1;
                i2 += 5;
            }
        }
        return new Pair(Integer.valueOf(i), obj);
    }

    private HandlerThread getHandlerThread() {
        int nextInt = new Random().nextInt();
        if (nextInt < 0) {
            nextInt = -nextInt;
        }
        return mHandlerThreadPool[nextInt % 3];
    }

    private byte getMaskByte(byte[] bArr) {
        return getBCCCode(bArr);
    }

    private Object getObjectByType(byte[] bArr, int i) {
        if (bArr != null && bArr.length > 0) {
            if (i == 5) {
                try {
                    return new String(bArr);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                boolean z = true;
                if (i == 4) {
                    if (bArr[0] != (byte) 1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                } else if (i == 2) {
                    return Float.valueOf(ByteFloatUtils.bytesToFloat(bArr));
                } else {
                    if (i == 1) {
                        return Integer.valueOf(ByteIntUtils.bytesToInt(bArr));
                    }
                    if (i == 3) {
                        return Long.valueOf(ByteLongUtils.bytesToLong(bArr));
                    }
                }
            }
        }
        return null;
    }

    private int getObjectType(Object obj) {
        return obj instanceof String ? 5 : obj instanceof Boolean ? 4 : obj instanceof Float ? 2 : obj instanceof Integer ? 1 : obj instanceof Long ? 3 : 0;
    }

    private Pair<byte[], Integer> getOneString(byte[] bArr, int i) {
        Object obj = new byte[4];
        System.arraycopy(bArr, i, obj, 0, 4);
        i += 4;
        if (bArr[i] == FINISH_MARK || bArr[i] == getMaskByte(obj)) {
            i++;
            int bytesToInt = ByteIntUtils.bytesToInt(obj);
            if (bytesToInt >= 0) {
                int i2 = i + bytesToInt;
                if (i2 < bArr.length && bytesToInt <= Integer.MAX_VALUE) {
                    Object obj2 = null;
                    if (bytesToInt != 0) {
                        obj2 = new byte[bytesToInt];
                        System.arraycopy(bArr, i, obj2, 0, bytesToInt);
                        if (bArr[i2] == FINISH_MARK || bArr[i2] == getMaskByte(obj2)) {
                            i = i2;
                        } else {
                            throw new Exception("Stored bytes' finish mark missing");
                        }
                    }
                    return new Pair(obj2, Integer.valueOf(i + 1));
                }
            }
            throw new Exception("length string is invalid");
        }
        throw new Exception("length string's finish mark missing");
    }

    private int increaseModifyID() {
        int i = (this.mModifyID + 1) % Integer.MAX_VALUE;
        this.mModifyID = i;
        return i;
    }

    private boolean initBuffer() {
        boolean z = true;
        if (this.mMappedByteBuffer != null) {
            return true;
        }
        try {
            if (!this.mFile.exists()) {
                this.mFile.getParentFile().mkdirs();
                this.mFile.createNewFile();
                z = new File(this.mBackupFilePath).exists();
            } else if (this.mFile.length() == 0) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    onSharedPreferenceErrorListener.onError(this.mFile.getAbsolutePath(), 4, this.mFile.length());
                }
                z = false;
            }
            this.mFileChannel = new RandomAccessFile(this.mFile, "rw").getChannel();
            allocBuffer(10);
            if (!z) {
                initFileHeader();
            }
            return z;
        } catch (Throwable e) {
            e.printStackTrace();
            OnSharedPreferenceErrorListener onSharedPreferenceErrorListener2 = this.mErrorListener;
            if (onSharedPreferenceErrorListener2 == null) {
                return false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.mFile.getAbsolutePath());
            stringBuilder.append(" ");
            stringBuilder.append(e.getCause());
            onSharedPreferenceErrorListener2.onError(stringBuilder.toString(), 10, -1);
            return false;
        }
    }

    private void initFileHeader() {
        if (this.mMappedByteBuffer != null) {
            Object obj = new byte[10];
            Object intToBytes = ByteIntUtils.intToBytes(0);
            System.arraycopy(intToBytes, 0, obj, 0, 4);
            obj[4] = getMaskByte(intToBytes);
            intToBytes = ByteIntUtils.intToBytes(0);
            System.arraycopy(intToBytes, 0, obj, 5, 4);
            obj[9] = getMaskByte(intToBytes);
            this.mMappedByteBuffer.position(0);
            this.mMappedByteBuffer.put(obj);
        }
    }

    private void load(boolean z) {
        byte[] bArr = null;
        FileLock lockFile = z ? null : lockFile(true);
        if (lockFile != null || z) {
            z = false;
            try {
                reallocBuffer();
                Buffer buffer = this.mMappedByteBuffer;
                if (buffer == null || buffer.capacity() == 0) {
                    try {
                        z = parseBytesIntoMap(null, true);
                    } catch (Throwable e) {
                        e.printStackTrace();
                    }
                    if (!z || this.mModifyID < 0) {
                        loadFromBakFile();
                    }
                    if (lockFile != null) {
                        try {
                            lockFile.release();
                        } catch (Throwable e2) {
                            e2.printStackTrace();
                        }
                    }
                    return;
                }
                long contentLength = (long) getContentLength();
                if (contentLength <= 10) {
                    try {
                        z = parseBytesIntoMap(null, true);
                    } catch (Throwable e3) {
                        e3.printStackTrace();
                    }
                    if (!z || this.mModifyID < 0) {
                        loadFromBakFile();
                    }
                    if (lockFile != null) {
                        try {
                            lockFile.release();
                        } catch (Throwable e22) {
                            e22.printStackTrace();
                        }
                    }
                    return;
                }
                int modifyID = getModifyID();
                this.mModifyID = modifyID;
                if (modifyID > 0) {
                    synchronized (this.mSyncObj) {
                        this.mMappedByteBuffer.position(10);
                        bArr = new byte[(((int) contentLength) - 10)];
                        safeBufferGet(this.mMappedByteBuffer, bArr);
                    }
                }
                try {
                    z = parseBytesIntoMap(bArr, true);
                } catch (Throwable e4) {
                    e4.printStackTrace();
                }
                if (!z || (bArr == null && this.mModifyID < 0)) {
                    loadFromBakFile();
                }
                if (lockFile != null) {
                    try {
                        lockFile.release();
                    } catch (Throwable e222) {
                        e222.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                try {
                    z = parseBytesIntoMap(null, true);
                } catch (Throwable e42) {
                    e42.printStackTrace();
                }
                if (!z || (null == null && this.mModifyID < 0)) {
                    loadFromBakFile();
                }
                if (lockFile != null) {
                    try {
                        lockFile.release();
                    } catch (Throwable e2222) {
                        e2222.printStackTrace();
                    }
                }
            }
        } else {
            if (!z) {
                loadFromBakFile();
            }
        }
    }

    /* DevToolsApp WARNING: Removed duplicated region for block: B:44:0x0096  */
    private boolean loadFromBakFile() {
        /*
        r14 = this;
        r0 = "#";
        r1 = 12;
        r2 = 0;
        r3 = 0;
        r4 = 1;
        r5 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x0081 }
        r6 = r14.mBackupFilePath;	 Catch:{ all -> 0x0081 }
        r7 = "r";
        r5.<init>(r6, r7);	 Catch:{ all -> 0x0081 }
        r6 = 4;
        r7 = new byte[r6];	 Catch:{ all -> 0x007c }
        r5.read(r7, r3, r6);	 Catch:{ all -> 0x007c }
        r6 = com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.ByteIntUtils.bytesToInt(r7);	 Catch:{ all -> 0x007c }
        r7 = 10;
        if (r6 > r7) goto L_0x002a;
    L_0x001e:
        r14.safeClose(r5);
        r14.parseBytesIntoMap(r2, r3);	 Catch:{ Exception -> 0x0025 }
        goto L_0x0029;
    L_0x0025:
        r0 = move-exception;
        r0.printStackTrace();
    L_0x0029:
        return r3;
    L_0x002a:
        r8 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r6 <= r8) goto L_0x0032;
    L_0x002f:
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x0032:
        r8 = (long) r6;
        r10 = r5.length();	 Catch:{ all -> 0x007c }
        r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r12 <= 0) goto L_0x0040;
    L_0x003b:
        r8 = r5.length();	 Catch:{ all -> 0x007c }
        r6 = (int) r8;	 Catch:{ all -> 0x007c }
    L_0x0040:
        r6 = r6 - r7;
        r2 = new byte[r6];	 Catch:{ all -> 0x007c }
        r7 = 10;
        r5.seek(r7);	 Catch:{ all -> 0x007c }
        r5.read(r2);	 Catch:{ all -> 0x007c }
        r14.safeClose(r5);
        r4 = r14.parseBytesIntoMap(r2, r3);	 Catch:{ Exception -> 0x0053 }
        goto L_0x0057;
    L_0x0053:
        r2 = move-exception;
        r2.printStackTrace();
    L_0x0057:
        r2 = r14.mErrorListener;
        if (r2 == 0) goto L_0x00ba;
    L_0x005b:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = r14.mBackupFilePath;
        r3.append(r5);
        r3.append(r0);
        r5 = "";
        r3.append(r5);
        r3.append(r0);
        r3.append(r4);
        r0 = r3.toString();
        r5 = (long) r6;
    L_0x0078:
        r2.onError(r0, r1, r5);
        goto L_0x00ba;
    L_0x007c:
        r6 = move-exception;
        r13 = r5;
        r5 = r2;
        r2 = r13;
        goto L_0x0083;
    L_0x0081:
        r6 = move-exception;
        r5 = r2;
    L_0x0083:
        r6.printStackTrace();	 Catch:{ all -> 0x00bb }
        r14.safeClose(r2);
        r4 = r14.parseBytesIntoMap(r5, r3);	 Catch:{ Exception -> 0x008e }
        goto L_0x0092;
    L_0x008e:
        r2 = move-exception;
        r2.printStackTrace();
    L_0x0092:
        r2 = r14.mErrorListener;
        if (r2 == 0) goto L_0x00ba;
    L_0x0096:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = r14.mBackupFilePath;
        r7.append(r8);
        r7.append(r0);
        r6 = r6.getCause();
        r7.append(r6);
        r7.append(r0);
        r7.append(r4);
        r0 = r7.toString();
        if (r5 != 0) goto L_0x00b7;
    L_0x00b6:
        goto L_0x00b8;
    L_0x00b7:
        r3 = r5.length;
    L_0x00b8:
        r5 = (long) r3;
        goto L_0x0078;
    L_0x00ba:
        return r4;
    L_0x00bb:
        r7 = move-exception;
        r14.safeClose(r2);
        r4 = r14.parseBytesIntoMap(r5, r3);	 Catch:{ Exception -> 0x00c4 }
        goto L_0x00c8;
    L_0x00c4:
        r2 = move-exception;
        r2.printStackTrace();
    L_0x00c8:
        r2 = r14.mErrorListener;
        if (r2 == 0) goto L_0x00f2;
    L_0x00cc:
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = r14.mBackupFilePath;
        r8.append(r9);
        r8.append(r0);
        r6 = r6.getCause();
        r8.append(r6);
        r8.append(r0);
        r8.append(r4);
        r0 = r8.toString();
        if (r5 != 0) goto L_0x00ed;
    L_0x00ec:
        goto L_0x00ee;
    L_0x00ed:
        r3 = r5.length;
    L_0x00ee:
        r3 = (long) r3;
        r2.onError(r0, r1, r3);
    L_0x00f2:
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.loadFromBakFile():boolean");
    }

    private void loadFromDiskLocked() {
        if (!this.mLoaded) {
            load(false);
            this.mLoaded = true;
            notifyAll();
        }
    }

    private FileLock lockFile(boolean z) {
        FileChannel fileChannel = this.mFileChannel;
        FileLock fileLock = null;
        if (fileChannel == null) {
            return null;
        }
        if (z) {
            long uptimeMillis = SystemClock.uptimeMillis();
            while (fileLock == null) {
                try {
                    fileLock = this.mFileChannel.tryLock();
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                if (fileLock == null) {
                    try {
                        Thread.sleep(100);
                    } catch (Throwable e2) {
                        e2.printStackTrace();
                    }
                }
                if (SystemClock.uptimeMillis() - uptimeMillis > MAX_LOCK_FILE_TIME) {
                    break;
                }
            }
        }
        try {
            fileLock = fileChannel.tryLock();
        } catch (Throwable e22) {
            e22.printStackTrace();
        }
        return fileLock;
    }

    private boolean merge(Editor editor, Map map, boolean z) {
        if (editor == null) {
            return false;
        }
        EditorImpl editorImpl = (EditorImpl) editor;
        boolean doClear = editorImpl.doClear();
        if (doClear) {
            map.clear();
            this.mEditorList.clear();
        }
        HashMap all = editorImpl.getAll();
        if (all.size() == 0) {
            return doClear;
        } else {
            synchronized (editor) {
                for (Entry entry : all.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        map.remove(str);
                    } else {
                        if (map.containsKey(str)) {
                            map.remove(str);
                        }
                        map.put(str, value);
                    }
                    if (!z) {
                        notifyDataChanged(str);
                    }
                }
            }
            return true;
        }
    }

    private void mergeWhenReload() {
        synchronized (this.mMap) {
            if (this.mEditorList.size() > 0) {
                Iterator it = this.mEditorList.iterator();
                while (it.hasNext()) {
                    merge((Editor) it.next(), this.mMap, true);
                }
            }
        }
    }

    private void notifyDataChanged(String str) {
        if (this.mListeners.size() > 0) {
            for (int i = 0; i < this.mListeners.size(); i++) {
                OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (OnSharedPreferenceChangeListener) this.mListeners.get(i);
                if (onSharedPreferenceChangeListener != null) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
                }
            }
        }
    }

    private byte[] obtainTotalBytes() {
        Pair dataBytes = getDataBytes();
        int length = (((byte[][]) dataBytes.second).length * 1) + (((Integer) dataBytes.first).intValue() + 10);
        if (length > Integer.MAX_VALUE) {
            length = Integer.MAX_VALUE;
        }
        Object obj = new byte[length];
        Object intToBytes = ByteIntUtils.intToBytes(length);
        System.arraycopy(intToBytes, 0, obj, 0, intToBytes.length);
        int length2 = intToBytes.length + 0;
        obj[length2] = getMaskByte(intToBytes);
        length2++;
        intToBytes = ByteIntUtils.intToBytes(increaseModifyID());
        System.arraycopy(intToBytes, 0, obj, length2, intToBytes.length);
        length2 += intToBytes.length;
        obj[length2] = getMaskByte(intToBytes);
        length2++;
        for (Object obj2 : (byte[][]) dataBytes.second) {
            if (obj2 != null) {
                if ((obj2.length + length2) + 1 <= Integer.MAX_VALUE) {
                    System.arraycopy(obj2, 0, obj, length2, obj2.length);
                    length2 += obj2.length;
                    obj[length2] = getMaskByte(obj2);
                    length2++;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Write too much data in ");
                    File file = this.mFile;
                    String str = null;
                    stringBuilder.append(file != null ? file.getAbsolutePath() : null);
                    Log.e(TAG, stringBuilder.toString());
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        file = this.mFile;
                        if (file != null) {
                            str = file.getAbsolutePath();
                        }
                        onSharedPreferenceErrorListener.onError(str, 7, -1);
                    }
                    return obj;
                }
            }
        }
        return obj;
    }

    /* DevToolsApp WARNING: Missing block: B:65:0x00f5, code:
            return r4;
     */
    /* DevToolsApp WARNING: Missing block: B:67:0x00f7, code:
            return true;
     */
    private boolean parseBytesIntoMap(byte[] r13, boolean r14) {
        /*
        r12 = this;
        r0 = r12.mMap;
        monitor-enter(r0);
        r1 = 0;
        if (r14 == 0) goto L_0x0011;
    L_0x0006:
        r2 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x000e }
        r3 = r12.mMap;	 Catch:{ all -> 0x000e }
        r2.<init>(r3);	 Catch:{ all -> 0x000e }
        goto L_0x0012;
    L_0x000e:
        r13 = move-exception;
        goto L_0x00f8;
    L_0x0011:
        r2 = r1;
    L_0x0012:
        if (r14 == 0) goto L_0x001d;
    L_0x0014:
        r3 = r12.mModifyID;	 Catch:{ all -> 0x000e }
        if (r3 <= 0) goto L_0x001d;
    L_0x0018:
        r3 = r12.mMap;	 Catch:{ all -> 0x000e }
        r3.clear();	 Catch:{ all -> 0x000e }
    L_0x001d:
        r3 = 1;
        if (r13 == 0) goto L_0x00f6;
    L_0x0020:
        r4 = r13.length;	 Catch:{ all -> 0x000e }
        if (r4 != 0) goto L_0x0025;
    L_0x0023:
        goto L_0x00f6;
    L_0x0025:
        r4 = 0;
        r5 = 0;
        r6 = 1;
    L_0x0028:
        r7 = r13.length;	 Catch:{ all -> 0x000e }
        if (r5 >= r7) goto L_0x00ea;
    L_0x002b:
        r5 = r12.getOneString(r13, r5);	 Catch:{ Exception -> 0x00bb }
        r7 = r5.second;	 Catch:{ Exception -> 0x00bb }
        r7 = (java.lang.Integer) r7;	 Catch:{ Exception -> 0x00bb }
        r7 = r7.intValue();	 Catch:{ Exception -> 0x00bb }
        r7 = r12.getOneString(r13, r7);	 Catch:{ Exception -> 0x00bb }
        r8 = r7.second;	 Catch:{ Exception -> 0x00bb }
        r8 = (java.lang.Integer) r8;	 Catch:{ Exception -> 0x00bb }
        r8 = r8.intValue();	 Catch:{ Exception -> 0x00bb }
        r9 = r13[r8];	 Catch:{ Exception -> 0x00bb }
        r8 = r8 + 1;
        r10 = r13[r8];	 Catch:{ Exception -> 0x00bb }
        r8 = r8 + 1;
        r11 = 18;
        if (r10 == r11) goto L_0x0070;
    L_0x004f:
        r11 = new byte[r3];	 Catch:{ Exception -> 0x00bb }
        r11[r4] = r9;	 Catch:{ Exception -> 0x00bb }
        r11 = r12.getMaskByte(r11);	 Catch:{ Exception -> 0x00bb }
        if (r10 == r11) goto L_0x0070;
    L_0x0059:
        r3 = r12.mErrorListener;	 Catch:{ Exception -> 0x00bb }
        if (r3 == 0) goto L_0x00eb;
    L_0x005d:
        r5 = r12.mFile;	 Catch:{ Exception -> 0x00bb }
        if (r5 == 0) goto L_0x0066;
    L_0x0061:
        r5 = r5.getAbsolutePath();	 Catch:{ Exception -> 0x00bb }
        goto L_0x0067;
    L_0x0066:
        r5 = r1;
    L_0x0067:
        r6 = 8;
        r7 = r13.length;	 Catch:{ Exception -> 0x00bb }
        r7 = (long) r7;	 Catch:{ Exception -> 0x00bb }
        r3.onError(r5, r6, r7);	 Catch:{ Exception -> 0x00bb }
        goto L_0x00eb;
    L_0x0070:
        r10 = r12.checkTypeValid(r9);	 Catch:{ Exception -> 0x00bb }
        if (r10 != 0) goto L_0x008e;
    L_0x0076:
        r5 = r12.mErrorListener;	 Catch:{ Exception -> 0x00bb }
        if (r5 == 0) goto L_0x008b;
    L_0x007a:
        r6 = r12.mFile;	 Catch:{ Exception -> 0x00bb }
        if (r6 == 0) goto L_0x0083;
    L_0x007e:
        r6 = r6.getAbsolutePath();	 Catch:{ Exception -> 0x00bb }
        goto L_0x0084;
    L_0x0083:
        r6 = r1;
    L_0x0084:
        r7 = 9;
        r9 = r13.length;	 Catch:{ Exception -> 0x00bb }
        r9 = (long) r9;	 Catch:{ Exception -> 0x00bb }
        r5.onError(r6, r7, r9);	 Catch:{ Exception -> 0x00bb }
    L_0x008b:
        r5 = r8;
        r6 = 0;
        goto L_0x0028;
    L_0x008e:
        r7 = r7.first;	 Catch:{ Exception -> 0x00bb }
        r7 = (byte[]) r7;	 Catch:{ Exception -> 0x00bb }
        r7 = r12.getObjectByType(r7, r9);	 Catch:{ Exception -> 0x00bb }
        r5 = r5.first;	 Catch:{ Exception -> 0x00bb }
        if (r5 == 0) goto L_0x00b8;
    L_0x009a:
        r9 = r5;
        r9 = (byte[]) r9;	 Catch:{ Exception -> 0x00bb }
        r9 = r9.length;	 Catch:{ Exception -> 0x00bb }
        if (r9 <= 0) goto L_0x00b8;
    L_0x00a0:
        if (r7 == 0) goto L_0x00b8;
    L_0x00a2:
        r9 = new java.lang.String;	 Catch:{ Exception -> 0x00bb }
        r5 = (byte[]) r5;	 Catch:{ Exception -> 0x00bb }
        r9.<init>(r5);	 Catch:{ Exception -> 0x00bb }
        if (r14 != 0) goto L_0x00b3;
    L_0x00ab:
        r5 = r12.mMap;	 Catch:{ Exception -> 0x00bb }
        r5 = r5.containsKey(r9);	 Catch:{ Exception -> 0x00bb }
        if (r5 != 0) goto L_0x00b8;
    L_0x00b3:
        r5 = r12.mMap;	 Catch:{ Exception -> 0x00bb }
        r5.put(r9, r7);	 Catch:{ Exception -> 0x00bb }
    L_0x00b8:
        r5 = r8;
        goto L_0x0028;
    L_0x00bb:
        r3 = move-exception;
        r3.printStackTrace();	 Catch:{ all -> 0x000e }
        r5 = r12.mErrorListener;	 Catch:{ all -> 0x000e }
        if (r5 == 0) goto L_0x00eb;
    L_0x00c3:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x000e }
        r6.<init>();	 Catch:{ all -> 0x000e }
        r7 = r12.mFile;	 Catch:{ all -> 0x000e }
        if (r7 == 0) goto L_0x00d0;
    L_0x00cc:
        r1 = r7.getAbsolutePath();	 Catch:{ all -> 0x000e }
    L_0x00d0:
        r6.append(r1);	 Catch:{ all -> 0x000e }
        r1 = "#";
        r6.append(r1);	 Catch:{ all -> 0x000e }
        r1 = r3.getCause();	 Catch:{ all -> 0x000e }
        r6.append(r1);	 Catch:{ all -> 0x000e }
        r1 = r6.toString();	 Catch:{ all -> 0x000e }
        r3 = 3;
        r13 = r13.length;	 Catch:{ all -> 0x000e }
        r6 = (long) r13;	 Catch:{ all -> 0x000e }
        r5.onError(r1, r3, r6);	 Catch:{ all -> 0x000e }
        goto L_0x00eb;
    L_0x00ea:
        r4 = r6;
    L_0x00eb:
        if (r4 != 0) goto L_0x00f4;
    L_0x00ed:
        if (r14 == 0) goto L_0x00f4;
    L_0x00ef:
        r13 = r12.mMap;	 Catch:{ all -> 0x000e }
        r13.putAll(r2);	 Catch:{ all -> 0x000e }
    L_0x00f4:
        monitor-exit(r0);	 Catch:{ all -> 0x000e }
        return r4;
    L_0x00f6:
        monitor-exit(r0);	 Catch:{ all -> 0x000e }
        return r3;
    L_0x00f8:
        monitor-exit(r0);	 Catch:{ all -> 0x000e }
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.parseBytesIntoMap(byte[], boolean):boolean");
    }

    private void reallocBuffer() {
        if (this.mMappedByteBuffer != null) {
            synchronized (this.mSyncObj) {
                try {
                    int contentLength = getContentLength();
                    if (contentLength > this.mMappedByteBuffer.capacity()) {
                        allocBuffer(contentLength + 1024);
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private boolean safeBufferGet(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        if (mappedByteBuffer == null || bArr == null || bArr.length == 0) {
            return false;
        }
        Arrays.fill(bArr, (byte) 0);
        if (mappedByteBuffer.position() + bArr.length > mappedByteBuffer.capacity()) {
            return false;
        }
        mappedByteBuffer.get(bArr);
        return true;
    }

    private void safeBufferPut(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        if (mappedByteBuffer != null && bArr != null && bArr.length != 0) {
            ByteBuffer mappedByteBuffer2;
            if (mappedByteBuffer2.position() + bArr.length >= mappedByteBuffer2.capacity()) {
                mappedByteBuffer2 = allocBuffer((mappedByteBuffer2.position() + bArr.length) + 1024);
            }
            mappedByteBuffer2.put(bArr);
        }
    }

    private void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    /* DevToolsApp WARNING: Missing block: B:16:0x0025, code:
            if (r7 == false) goto L_0x002b;
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x0027, code:
            saveInner(r6);
     */
    /* DevToolsApp WARNING: Missing block: B:18:0x002a, code:
            return;
     */
    /* DevToolsApp WARNING: Missing block: B:19:0x002b, code:
            if (r8 == false) goto L_0x0030;
     */
    /* DevToolsApp WARNING: Missing block: B:20:0x002d, code:
            r7 = 1000;
     */
    /* DevToolsApp WARNING: Missing block: B:21:0x0030, code:
            r7 = 0;
     */
    /* DevToolsApp WARNING: Missing block: B:22:0x0032, code:
            r4.mSaveRunnable.setArg(java.lang.Boolean.valueOf(r6));
            r5 = android.os.Message.obtain(r4.mHandler, r4.mSaveRunnable);
            r5.what = mSaveMessageID;
            r4.mHandler.sendMessageDelayed(r5, r7);
     */
    /* DevToolsApp WARNING: Missing block: B:23:0x004c, code:
            return;
     */
    private void save(android.content.SharedPreferences.Editor r5, boolean r6, boolean r7, boolean r8) {
        /*
        r4 = this;
        if (r5 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r4.mMap;
        monitor-enter(r0);
        r1 = 0;
        r4.mCurTryTime = r1;	 Catch:{ all -> 0x004d }
        r2 = 1;
        r3 = r4.mMap;	 Catch:{ all -> 0x004d }
        r3 = r4.merge(r5, r3, r1);	 Catch:{ all -> 0x004d }
        if (r3 != 0) goto L_0x001c;
    L_0x0012:
        r2 = r4.mEditorList;	 Catch:{ all -> 0x004d }
        r2 = r2.size();	 Catch:{ all -> 0x004d }
        if (r2 != 0) goto L_0x001d;
    L_0x001a:
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        return;
    L_0x001c:
        r1 = 1;
    L_0x001d:
        if (r1 == 0) goto L_0x0024;
    L_0x001f:
        r1 = r4.mEditorList;	 Catch:{ all -> 0x004d }
        r1.add(r5);	 Catch:{ all -> 0x004d }
    L_0x0024:
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        if (r7 == 0) goto L_0x002b;
    L_0x0027:
        r4.saveInner(r6);
        return;
    L_0x002b:
        if (r8 == 0) goto L_0x0030;
    L_0x002d:
        r7 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        goto L_0x0032;
    L_0x0030:
        r7 = 0;
    L_0x0032:
        r5 = r4.mSaveRunnable;
        r6 = java.lang.Boolean.valueOf(r6);
        r5.setArg(r6);
        r5 = r4.mHandler;
        r6 = r4.mSaveRunnable;
        r5 = android.os.Message.obtain(r5, r6);
        r6 = 21310; // 0x533e float:2.9862E-41 double:1.05285E-319;
        r5.what = r6;
        r6 = r4.mHandler;
        r6.sendMessageDelayed(r5, r7);
        return;
    L_0x004d:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.save(android.content.SharedPreferences$Editor, boolean, boolean, boolean):void");
    }

    /* DevToolsApp WARNING: Missing block: B:18:?, code:
            r2.release();
     */
    /* DevToolsApp WARNING: Missing block: B:19:0x002a, code:
            r8 = move-exception;
     */
    /* DevToolsApp WARNING: Missing block: B:21:?, code:
            r8.printStackTrace();
     */
    /* DevToolsApp WARNING: Missing block: B:28:?, code:
            saveToMappedBuffer(obtainTotalBytes(), r8);
            backup();
     */
    /* DevToolsApp WARNING: Missing block: B:30:?, code:
            r2.release();
     */
    /* DevToolsApp WARNING: Missing block: B:31:0x0041, code:
            r8 = move-exception;
     */
    /* DevToolsApp WARNING: Missing block: B:33:?, code:
            r8.printStackTrace();
     */
    private void saveInner(final boolean r8) {
        /*
        r7 = this;
        r0 = r7.mSyncSaveObj;
        monitor-enter(r0);
        r1 = 0;
        r2 = r7.lockFile(r1);	 Catch:{ all -> 0x008a }
        if (r2 == 0) goto L_0x0073;
    L_0x000a:
        r3 = 1;
        r7.mIsSaving = r3;	 Catch:{ all -> 0x004b }
        r3 = r7.tryReloadWhenSave();	 Catch:{ all -> 0x004b }
        if (r3 == 0) goto L_0x001a;
    L_0x0013:
        r7.mergeWhenReload();	 Catch:{ all -> 0x004b }
        r3 = 0;
        r7.notifyDataChanged(r3);	 Catch:{ all -> 0x004b }
    L_0x001a:
        r3 = r7.mMap;	 Catch:{ all -> 0x004b }
        monitor-enter(r3);	 Catch:{ all -> 0x004b }
        r4 = r7.mEditorList;	 Catch:{ all -> 0x0048 }
        r4 = r4.size();	 Catch:{ all -> 0x0048 }
        if (r4 > 0) goto L_0x0032;
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x0048 }
        r2.release();	 Catch:{ IOException -> 0x002a }
        goto L_0x002e;
    L_0x002a:
        r8 = move-exception;
        r8.printStackTrace();	 Catch:{ all -> 0x008a }
    L_0x002e:
        r7.mIsSaving = r1;	 Catch:{ all -> 0x008a }
        monitor-exit(r0);	 Catch:{ all -> 0x008a }
        return;
    L_0x0032:
        monitor-exit(r3);	 Catch:{ all -> 0x0048 }
        r3 = r7.obtainTotalBytes();	 Catch:{ all -> 0x004b }
        r7.saveToMappedBuffer(r3, r8);	 Catch:{ all -> 0x004b }
        r7.backup();	 Catch:{ all -> 0x004b }
        r2.release();	 Catch:{ IOException -> 0x0041 }
        goto L_0x0045;
    L_0x0041:
        r8 = move-exception;
        r8.printStackTrace();	 Catch:{ all -> 0x008a }
    L_0x0045:
        r7.mIsSaving = r1;	 Catch:{ all -> 0x008a }
        goto L_0x0088;
    L_0x0048:
        r8 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0048 }
        throw r8;	 Catch:{ all -> 0x004b }
    L_0x004b:
        r8 = move-exception;
        r8.printStackTrace();	 Catch:{ all -> 0x0067 }
        r3 = r7.mErrorListener;	 Catch:{ all -> 0x0067 }
        if (r3 == 0) goto L_0x005e;
    L_0x0053:
        r8 = r8.getMessage();	 Catch:{ all -> 0x0067 }
        r4 = 11;
        r5 = -1;
        r3.onError(r8, r4, r5);	 Catch:{ all -> 0x0067 }
    L_0x005e:
        r2.release();	 Catch:{ IOException -> 0x0062 }
        goto L_0x0045;
    L_0x0062:
        r8 = move-exception;
        r8.printStackTrace();	 Catch:{ all -> 0x008a }
        goto L_0x0045;
    L_0x0067:
        r8 = move-exception;
        r2.release();	 Catch:{ IOException -> 0x006c }
        goto L_0x0070;
    L_0x006c:
        r2 = move-exception;
        r2.printStackTrace();	 Catch:{ all -> 0x008a }
    L_0x0070:
        r7.mIsSaving = r1;	 Catch:{ all -> 0x008a }
        throw r8;	 Catch:{ all -> 0x008a }
    L_0x0073:
        r1 = r7.mCurTryTime;	 Catch:{ all -> 0x008a }
        r2 = r1 + 1;
        r7.mCurTryTime = r2;	 Catch:{ all -> 0x008a }
        r2 = 6;
        if (r1 >= r2) goto L_0x0088;
    L_0x007c:
        r1 = r7.mHandler;	 Catch:{ all -> 0x008a }
        r2 = new com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl$3;	 Catch:{ all -> 0x008a }
        r2.<init>(r8);	 Catch:{ all -> 0x008a }
        r3 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r1.postDelayed(r2, r3);	 Catch:{ all -> 0x008a }
    L_0x0088:
        monitor-exit(r0);	 Catch:{ all -> 0x008a }
        return;
    L_0x008a:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x008a }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.saveInner(boolean):void");
    }

    private void saveToMappedBuffer(byte[] bArr, boolean z) {
        synchronized (this.mSyncObj) {
            this.mMappedByteBuffer.position(0);
            safeBufferPut(this.mMappedByteBuffer, bArr);
            if (z) {
                this.mMappedByteBuffer.force();
            }
        }
    }

    private void startLoadFromDisk(boolean z) {
        synchronized (this) {
            this.mLoaded = false;
        }
        Runnable anonymousClass5 = new Runnable() {
            public void run() {
                synchronized (SharedPreferencesNewImpl.this) {
                    SharedPreferencesNewImpl.this.loadFromDiskLocked();
                }
            }
        };
        if (z) {
            anonymousClass5.run();
        } else {
            sCachedThreadPool.execute(anonymousClass5);
        }
    }

    private void tryReload() {
        if (SystemClock.uptimeMillis() - this.mTryReloadStartTime > TRY_RELOAD_INTERVAL) {
            this.mTryReloadStartTime = SystemClock.uptimeMillis();
            this.mHandler.removeCallbacks(this.mTryReloadRunnable);
            this.mHandler.post(this.mTryReloadRunnable);
        }
    }

    private boolean tryReloadWhenSave() {
        int modifyID = getModifyID();
        if (modifyID <= 0 || modifyID == this.mModifyID) {
            return false;
        }
        load(true);
        return true;
    }

    public final boolean checkTypeValid(byte b) {
        return b == (byte) 4 || b == (byte) 2 || b == (byte) 1 || b == (byte) 3 || b == (byte) 5;
    }

    public final boolean contains(String str) {
        boolean containsKey;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            containsKey = this.mMap.containsKey(str);
        }
        return containsKey;
    }

    public final Editor edit() {
        awaitLoadedLocked();
        return new EditorImpl();
    }

    public final Map<String, ?> getAll() {
        Map hashMap;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            hashMap = new HashMap(this.mMap);
        }
        return hashMap;
    }

    public final boolean getBoolean(String str, boolean z) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                Boolean bool = (Boolean) this.mMap.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                }
            } catch (ClassCastException e) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    File file = this.mFile;
                    stringBuilder.append(file != null ? file.getAbsolutePath() : null);
                    stringBuilder.append("#");
                    stringBuilder.append(str);
                    stringBuilder.append(e);
                    str = stringBuilder.toString();
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(str, 13, file2 != null ? file2.length() : 0);
                }
                return z;
            }
        }
        return z;
    }

    public final float getFloat(String str, float f) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                Float f2 = (Float) this.mMap.get(str);
                if (f2 != null) {
                    f = f2.floatValue();
                }
            } catch (ClassCastException e) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    File file = this.mFile;
                    stringBuilder.append(file != null ? file.getAbsolutePath() : null);
                    stringBuilder.append("#");
                    stringBuilder.append(str);
                    stringBuilder.append(e);
                    str = stringBuilder.toString();
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(str, 13, file2 != null ? file2.length() : 0);
                }
                return f;
            }
        }
        return f;
    }

    public final int getInt(String str, int i) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                Integer num = (Integer) this.mMap.get(str);
                if (num != null) {
                    i = num.intValue();
                }
            } catch (ClassCastException e) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    File file = this.mFile;
                    stringBuilder.append(file != null ? file.getAbsolutePath() : null);
                    stringBuilder.append("#");
                    stringBuilder.append(str);
                    stringBuilder.append(e);
                    str = stringBuilder.toString();
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(str, 13, file2 != null ? file2.length() : 0);
                }
                return i;
            }
        }
        return i;
    }

    public final long getLong(String str, long j) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                Long l = (Long) this.mMap.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            } catch (ClassCastException e) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    File file = this.mFile;
                    stringBuilder.append(file != null ? file.getAbsolutePath() : null);
                    stringBuilder.append("#");
                    stringBuilder.append(str);
                    stringBuilder.append(e);
                    str = stringBuilder.toString();
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(str, 13, file2 != null ? file2.length() : 0);
                }
                return j;
            }
        }
        return j;
    }

    /* DevToolsApp WARNING: Missing block: B:25:0x005b, code:
            return -1;
     */
    public final int getModifyID() {
        /*
        r7 = this;
        r0 = r7.mMappedByteBuffer;
        r1 = -1;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r7.mSyncObj;
        monitor-enter(r0);
        r2 = r7.mMappedByteBuffer;	 Catch:{ all -> 0x005e }
        r3 = 5;
        r2.position(r3);	 Catch:{ all -> 0x005e }
        r2 = 4;
        r2 = new byte[r2];	 Catch:{ all -> 0x005e }
        r3 = r7.mMappedByteBuffer;	 Catch:{ all -> 0x005e }
        r7.safeBufferGet(r3, r2);	 Catch:{ all -> 0x005e }
        r3 = com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.ByteIntUtils.bytesToInt(r2);	 Catch:{ all -> 0x005e }
        r4 = r7.mMappedByteBuffer;	 Catch:{ all -> 0x005e }
        r5 = 9;
        r4.position(r5);	 Catch:{ all -> 0x005e }
        r4 = r7.mMappedByteBuffer;	 Catch:{ all -> 0x005e }
        r4 = r4.get();	 Catch:{ all -> 0x005e }
        r5 = 18;
        if (r4 == r5) goto L_0x0032;
    L_0x002c:
        r2 = r7.getMaskByte(r2);	 Catch:{ all -> 0x005e }
        if (r4 != r2) goto L_0x0034;
    L_0x0032:
        if (r3 >= 0) goto L_0x005c;
    L_0x0034:
        r2 = r7.mModifyErrorCnt;	 Catch:{ all -> 0x005e }
        r2 = r2 + 1;
        r7.mModifyErrorCnt = r2;	 Catch:{ all -> 0x005e }
        r3 = 3;
        if (r2 >= r3) goto L_0x005a;
    L_0x003d:
        r2 = r7.mErrorListener;	 Catch:{ all -> 0x005e }
        if (r2 == 0) goto L_0x005a;
    L_0x0041:
        r3 = r7.mFile;	 Catch:{ all -> 0x005e }
        if (r3 == 0) goto L_0x004a;
    L_0x0045:
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x005e }
        goto L_0x004b;
    L_0x004a:
        r3 = 0;
    L_0x004b:
        r4 = 2;
        r5 = r7.mFile;	 Catch:{ all -> 0x005e }
        if (r5 == 0) goto L_0x0055;
    L_0x0050:
        r5 = r5.length();	 Catch:{ all -> 0x005e }
        goto L_0x0057;
    L_0x0055:
        r5 = 0;
    L_0x0057:
        r2.onError(r3, r4, r5);	 Catch:{ all -> 0x005e }
    L_0x005a:
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return r1;
    L_0x005c:
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return r3;
    L_0x005e:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.getModifyID():int");
    }

    public final String getString(String str, String str2) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                String str3 = (String) this.mMap.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } catch (ClassCastException e) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    File file = this.mFile;
                    stringBuilder.append(file != null ? file.getAbsolutePath() : null);
                    stringBuilder.append("#");
                    stringBuilder.append(str);
                    stringBuilder.append(e);
                    str = stringBuilder.toString();
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(str, 13, file2 != null ? file2.length() : 0);
                }
                return str2;
            }
        }
        return str2;
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        throw new RuntimeException("putStringSet is not supported!");
    }

    public final void onDestroy() {
        if (this.mIsSaving || this.mHandler.hasMessages(mSaveMessageID)) {
            saveInner(false);
        }
    }

    public final void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener != null) {
            synchronized (this.mListeners) {
                this.mListeners.add(onSharedPreferenceChangeListener);
                if (this.mFileMonitor == null) {
                    try {
                        File file = new File(this.mBackupFilePath);
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                    } catch (Throwable e) {
                        e.printStackTrace();
                    }
                    this.mFileMonitor = new FileMonitor(this.mBackupFilePath, 2);
                }
            }
            synchronized (mFileMonitorSyncObj) {
                this.mFileMonitor.startWatching();
            }
        }
    }

    public final void setSharedPreferenceErrorListener(OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this.mErrorListener = onSharedPreferenceErrorListener;
    }

    public final void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener != null) {
            synchronized (this.mListeners) {
                this.mListeners.remove(onSharedPreferenceChangeListener);
                if (this.mFileMonitor != null && this.mListeners.size() <= 0) {
                    this.mFileMonitor.stopWatching();
                }
            }
        }
    }
}
