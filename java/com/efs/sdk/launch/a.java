package com.efs.sdk.launch;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    private static final String a = "com.efs.sdk.launch.a";
    private static volatile ScheduledThreadPoolExecutor b;
    private static ThreadFactory c = new ThreadFactory() {
        private AtomicInteger a = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            StringBuilder stringBuilder = new StringBuilder("LaunchThreadPoolExecutor");
            stringBuilder.append(this.a.addAndGet(1));
            thread.setName(stringBuilder.toString());
            return thread;
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new ScheduledThreadPoolExecutor(4, c);
                }
            }
        }
        return b;
    }

    public static void a(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
