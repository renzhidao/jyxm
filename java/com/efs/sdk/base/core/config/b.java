package com.efs.sdk.base.core.config;

import android.content.Context;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.NetworkUtil;

public final class b {
    public a a;
    public Context b;

    public static class a {
        private static final b a = new b();
    }

    private b() {
        this.b = ControllerCenter.getGlobalEnvStruct().mAppContext;
    }

    public /* synthetic */ b(byte b) {
        this();
    }

    public final String a() {
        return this.a.b("net", NetworkUtil.NETWORK_CLASS_DISCONNECTED).toString();
    }
}
