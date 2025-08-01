package com.efs.sdk.h5pagesdk;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    private static final String TAG = "com.efs.sdk.h5pagesdk.a";
    private static volatile ScheduledThreadPoolExecutor i;
    private static ThreadFactory j = new ThreadFactory() {
        private AtomicInteger k = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            StringBuilder stringBuilder = new StringBuilder("H5ThreadPoolExecutor");
            stringBuilder.append(this.k.addAndGet(1));
            thread.setName(stringBuilder.toString());
            return thread;
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (i == null) {
            synchronized (a.class) {
                if (i == null) {
                    i = new ScheduledThreadPoolExecutor(4, j);
                }
            }
        }
        return i;
    }

    public static void execute(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
