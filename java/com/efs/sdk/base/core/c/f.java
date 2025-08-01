package com.efs.sdk.base.core.c;

import android.content.Context;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

public final class f {
    public static FileLock b;
    public volatile int a;

    public static class a {
        private static final f a = new f();
    }

    private f() {
        this.a = 0;
        a(ControllerCenter.getGlobalEnvStruct().mAppContext);
    }

    public /* synthetic */ f(byte b) {
        this();
    }

    private synchronized void a(final Context context) {
        Log.w("efs.send_log", "tryFileLock start! ");
        this.a = 1;
        new Thread(new Runnable() {
            public final void run() {
                String str = "efs.send_log";
                try {
                    File a = com.efs.sdk.base.core.util.a.a(context);
                    if (!a.exists()) {
                        a.mkdirs();
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a.getPath());
                    stringBuilder.append(File.separator);
                    stringBuilder.append("sendlock");
                    File file = new File(stringBuilder.toString());
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileLock lock;
                    do {
                        lock = new FileOutputStream(file).getChannel().lock();
                        f.b = lock;
                    } while (!lock.isValid());
                    StringBuilder stringBuilder2 = new StringBuilder("tryFileLock sendlock sucess! processname: ");
                    stringBuilder2.append(ProcessUtil.getCurrentProcessName());
                    Log.w(str, stringBuilder2.toString());
                    f.this.a = 2;
                } catch (Throwable e) {
                    StringBuilder stringBuilder3 = new StringBuilder("tryFileLock fail! ");
                    stringBuilder3.append(e.getMessage());
                    Log.w(str, stringBuilder3.toString());
                    f.this.a = 0;
                }
            }
        }).start();
    }

    public final boolean a() {
        if (this.a == 2) {
            return true;
        }
        if (this.a == 0) {
            a(ControllerCenter.getGlobalEnvStruct().mAppContext);
        }
        return false;
    }
}
