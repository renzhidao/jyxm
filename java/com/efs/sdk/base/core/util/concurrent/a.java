package com.efs.sdk.base.core.util.concurrent;

import android.os.HandlerThread;

public final class a {
    public static HandlerThread a;

    static {
        Thread handlerThread = new HandlerThread("efs-base", 10);
        a = handlerThread;
        handlerThread.start();
    }
}
