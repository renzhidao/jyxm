package com.efs.sdk.base.core.b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.core.b.a.b;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import java.io.File;

public final class c extends Handler implements Runnable {
    public boolean a;

    public static class a {
        private static final c a = new c();
    }

    private c() {
        super(com.efs.sdk.base.core.util.concurrent.a.a.getLooper());
        this.a = true;
        sendEmptyMessageDelayed(2, 60000);
    }

    public /* synthetic */ c(byte b) {
        this();
    }

    public static c a() {
        return a.a;
    }

    public final void handleMessage(Message message) {
        if (message.what != 2) {
            StringBuilder stringBuilder = new StringBuilder("disk listener not support command: ");
            stringBuilder.append(message.what);
            Log.w("efs.cache", stringBuilder.toString());
            return;
        }
        WorkThreadUtil.submit(this);
    }

    public final void run() {
        b.a;
        File f = com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (f.exists()) {
            for (File file : com.efs.sdk.base.core.util.b.d(f)) {
                if (a.a(file.getName())) {
                    a.c(file);
                }
            }
        }
        com.efs.sdk.base.core.config.a.c a = com.efs.sdk.base.core.config.a.c.a();
        String str = "disk_bytes";
        String str2 = "4194304";
        CharSequence charSequence = a.d.f.containsKey(str) ? (String) a.d.f.get(str) : str2;
        if (!TextUtils.isEmpty(charSequence)) {
            str2 = charSequence;
        }
        long parseLong = Long.parseLong(str2);
        long c = com.efs.sdk.base.core.util.b.c(com.efs.sdk.base.core.util.a.d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid())) + com.efs.sdk.base.core.util.b.c(com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()));
        boolean z = c < parseLong;
        this.a = z;
        if (!z) {
            StringBuilder stringBuilder = new StringBuilder("Cache Limited! curr ");
            stringBuilder.append(c);
            stringBuilder.append("byte, max ");
            stringBuilder.append(parseLong);
            stringBuilder.append(" byte.");
            Log.w("efs.cache", stringBuilder.toString());
        }
        sendEmptyMessageDelayed(2, 600000);
    }
}
