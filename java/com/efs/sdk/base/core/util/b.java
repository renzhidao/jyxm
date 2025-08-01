package com.efs.sdk.base.core.util;

import com.efs.sdk.base.core.a.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class b {
    private static final Random a = new Random();

    public static String a(com.efs.sdk.base.core.d.b bVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bVar.a.a);
        String str = "_";
        stringBuilder.append(str);
        stringBuilder.append(bVar.a.d);
        stringBuilder.append(str);
        stringBuilder.append(bVar.a.e);
        stringBuilder.append(str);
        stringBuilder.append(bVar.a.b);
        stringBuilder.append(str);
        stringBuilder.append(ProcessUtil.myPid());
        stringBuilder.append(str);
        stringBuilder.append(a.nextInt(10000));
        stringBuilder.append(str);
        a.a();
        stringBuilder.append(a.b());
        return stringBuilder.toString();
    }

    public static String a(File file) {
        return e(file);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.e("efs.util.file", "safe close error", th);
            }
        }
    }

    public static void a(File file, File file2) {
        Closeable fileOutputStream;
        Throwable e;
        Throwable th;
        byte[] bArr = new byte[524288];
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file2.isDirectory()) {
            file2 = new File(file2, file.getName());
        }
        Closeable closeable = null;
        try {
            Closeable fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (Exception e2) {
                        e = e2;
                        closeable = fileInputStream;
                        try {
                            Log.e("efs.util.file", "error when copy", e);
                            a(closeable);
                            a(fileOutputStream);
                            b(file);
                        } catch (Throwable th2) {
                            th = th2;
                            a(closeable);
                            a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        closeable = fileInputStream;
                        a(closeable);
                        a(fileOutputStream);
                        throw th;
                    }
                }
                a(fileInputStream);
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
                closeable = fileInputStream;
                Log.e("efs.util.file", "error when copy", e);
                a(closeable);
                a(fileOutputStream);
                b(file);
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                closeable = fileInputStream;
                a(closeable);
                a(fileOutputStream);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
            Log.e("efs.util.file", "error when copy", e);
            a(closeable);
            a(fileOutputStream);
            b(file);
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            a(closeable);
            a(fileOutputStream);
            throw th;
        }
        a(fileOutputStream);
        b(file);
    }

    public static boolean a(File file, String str) {
        return a(file, str.getBytes());
    }

    public static boolean a(File file, byte[] bArr) {
        Throwable th;
        StringBuilder stringBuilder;
        Closeable closeable = null;
        try {
            Closeable fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                a(fileOutputStream);
                return true;
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStream;
                try {
                    stringBuilder = new StringBuilder("write file error, filename is ");
                    stringBuilder.append(file.getName());
                    Log.e("efs.util.file", stringBuilder.toString(), th);
                    return false;
                } finally {
                    a(closeable);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            stringBuilder = new StringBuilder("write file error, filename is ");
            stringBuilder.append(file.getName());
            Log.e("efs.util.file", stringBuilder.toString(), th);
            return false;
        }
    }

    public static byte[] a(String str) {
        Throwable e;
        byte[] bArr = new byte[0];
        Closeable closeable = null;
        try {
            Closeable fileInputStream = new FileInputStream(str);
            try {
                bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                a(fileInputStream);
            } catch (Exception e2) {
                e = e2;
                closeable = fileInputStream;
                try {
                    Log.e("efs.util.file", "read data error", e);
                    a(closeable);
                    return bArr;
                } catch (Throwable th) {
                    e = th;
                    a(closeable);
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                closeable = fileInputStream;
                a(closeable);
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            Log.e("efs.util.file", "read data error", e);
            a(closeable);
            return bArr;
        }
        return bArr;
    }

    public static com.efs.sdk.base.core.d.b b(String str) {
        String[] split = str.split("_");
        if (split.length != 7) {
            Log.w("efs.util.file", "File name error, name is ".concat(str));
            return null;
        }
        str = split[0];
        String str2 = split[1];
        int byteValue = Byte.valueOf(split[2]).byteValue();
        com.efs.sdk.base.core.d.b bVar = new com.efs.sdk.base.core.d.b(str, Byte.valueOf(split[3]).byteValue());
        bVar.a(str2);
        bVar.a(byteValue);
        return bVar;
    }

    public static void b(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File b : listFiles) {
                        b(b);
                    }
                }
            }
            file.delete();
        }
    }

    public static long c(File file) {
        long j = 0;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0;
            }
            for (File c : listFiles) {
                j += c(c);
            }
        } else {
            j = 0 + file.length();
        }
        return j;
    }

    public static List<File> d(File file) {
        if (file.isFile()) {
            return Collections.emptyList();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList();
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(d(file2));
            }
        }
        return arrayList;
    }

    private static String e(File file) {
        Throwable th;
        String str = "";
        if (!file.exists()) {
            return str;
        }
        Closeable closeable = null;
        try {
            Closeable fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[1024];
                StringBuilder stringBuilder = new StringBuilder();
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    stringBuilder.append(new String(bArr, 0, read));
                }
                str = stringBuilder.toString();
                a(fileInputStream);
            } catch (Throwable th2) {
                th = th2;
                closeable = fileInputStream;
                try {
                    Log.e("efs.util.file", "read file error", th);
                    return str;
                } finally {
                    a(closeable);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            Log.e("efs.util.file", "read file error", th);
            return str;
        }
        return str;
    }
}
