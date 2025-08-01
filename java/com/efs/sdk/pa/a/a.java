package com.efs.sdk.pa.a;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.efs.sdk.pa.PAANRListener;
import java.util.Map.Entry;
import java.util.Set;

public final class a {
    public volatile boolean a;
    public final Handler b;
    public final Thread c;
    public long d;
    public long e;
    public boolean f;
    public Handler g;
    public PAANRListener h;
    public long i;
    public long j;
    public final long k;
    public boolean l;
    public final Runnable m;
    public final Runnable n;
    private HandlerThread o;
    private Application p;

    public a(Application application, long j) {
        this(application, j, true);
    }

    public a(Application application, long j, boolean z) {
        this.a = true;
        this.e = 4;
        this.f = true;
        this.i = 0;
        this.m = new Runnable() {
            /* DevToolsApp WARNING: Missing block: B:21:0x006c, code:
            if (com.efs.sdk.pa.a.a.a(r1) != false) goto L_0x006e;
     */
            public final void run() {
                /*
                r6 = this;
                r0 = com.efs.sdk.pa.a.a.this;
                r0 = r0.f;
                if (r0 == 0) goto L_0x0007;
            L_0x0006:
                return;
            L_0x0007:
                r0 = android.os.SystemClock.uptimeMillis();
                r2 = com.efs.sdk.pa.a.a.this;
                r3 = r2.j;
                r0 = r0 - r3;
                r3 = r2.k;
                r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
                if (r5 <= 0) goto L_0x0021;
            L_0x0016:
                r2 = r2.h;
                if (r2 == 0) goto L_0x0021;
            L_0x001a:
                r0 = java.lang.Long.valueOf(r0);
                r2.unexcept(r0);
            L_0x0021:
                r0 = com.efs.sdk.pa.a.a.this;
                r0 = r0.a;
                if (r0 == 0) goto L_0x003a;
            L_0x0027:
                r0 = com.efs.sdk.pa.a.a.this;
                r1 = 0;
                r0.i = r1;
                r1 = 0;
                r0.a = r1;
                r0 = com.efs.sdk.pa.a.a.this;
                r1 = r0.b;
                r0 = r0.n;
                r1.postAtFrontOfQueue(r0);
                goto L_0x0081;
            L_0x003a:
                r0 = com.efs.sdk.pa.a.a.this;
                r1 = r0.i;
                r3 = 1;
                r1 = r1 + r3;
                r0.i = r1;
                r0 = r0.a;
                if (r0 != 0) goto L_0x0081;
            L_0x0047:
                r0 = com.efs.sdk.pa.a.a.this;
                r1 = r0.i;
                r3 = r0.e;
                r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
                if (r5 < 0) goto L_0x0081;
            L_0x0051:
                r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
                if (r5 != 0) goto L_0x0081;
            L_0x0055:
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r2 = r0.l;
                if (r2 == 0) goto L_0x0068;
            L_0x005e:
                r2 = r0.c;
                r2 = com.efs.sdk.pa.a.a.a(r2);
                r1.append(r2);
                goto L_0x006e;
            L_0x0068:
                r2 = com.efs.sdk.pa.a.a.a(r1);
                if (r2 == 0) goto L_0x0081;
            L_0x006e:
                r2 = r0.h;
                if (r2 == 0) goto L_0x0081;
            L_0x0072:
                r2 = r1.length();
                if (r2 <= 0) goto L_0x0081;
            L_0x0078:
                r0 = r0.h;
                r1 = r1.toString();
                r0.anrStack(r1);
            L_0x0081:
                r0 = com.efs.sdk.pa.a.a.this;
                r1 = android.os.SystemClock.uptimeMillis();
                r0.j = r1;
                r0 = com.efs.sdk.pa.a.a.this;
                r1 = r0.g;
                r2 = r0.m;
                r3 = r0.d;
                r1.postDelayed(r2, r3);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.pa.a.a.1.run():void");
            }
        };
        this.n = new Runnable() {
            public final void run() {
                a.this.a = true;
            }
        };
        this.k = j;
        this.p = application;
        this.l = z;
        long j2 = ((long) (((float) j) * 0.8f)) / this.e;
        this.d = j2;
        if (j2 < 100) {
            this.d = 100;
            this.e = j / 100;
        }
        StringBuilder stringBuilder = new StringBuilder("anrTrace, final mAnrBeatTime:");
        stringBuilder.append(this.d);
        stringBuilder.append(", mAnrBeatRate:");
        stringBuilder.append(this.d);
        Log.i("Matrix.AnrTracer", stringBuilder.toString());
        this.c = Looper.getMainLooper().getThread();
        this.b = new Handler(Looper.getMainLooper());
        Thread handlerThread = new HandlerThread("ANR HANDLER THREAD");
        this.o = handlerThread;
        handlerThread.start();
        this.g = new Handler(this.o.getLooper());
    }

    public static String a(Thread thread) {
        StringBuilder stringBuilder = new StringBuilder();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        stringBuilder.append(thread.getName());
        String str = " ";
        stringBuilder.append(str);
        stringBuilder.append(thread.getPriority());
        stringBuilder.append(str);
        stringBuilder.append(thread.getState());
        String str2 = "\n";
        stringBuilder.append(str2);
        for (StackTraceElement stackTraceElement : stackTrace) {
            String stackTraceElement2 = stackTraceElement.toString();
            stringBuilder.append("  at  ");
            stringBuilder.append(stackTraceElement2);
            stringBuilder.append(10);
        }
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public static boolean a(StringBuilder stringBuilder) {
        Set<Entry> entrySet = Thread.getAllStackTraces().entrySet();
        if (entrySet.size() == 0) {
            return false;
        }
        Object obj = null;
        for (Entry entry : entrySet) {
            Thread thread = (Thread) entry.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            String str = "  at  ";
            String str2 = "\n";
            String str3 = " ";
            String stackTraceElement;
            if (thread.getId() == Looper.getMainLooper().getThread().getId()) {
                CharSequence stringBuilder2 = new StringBuilder();
                stringBuilder2.append(thread.getName());
                stringBuilder2.append(str3);
                stringBuilder2.append(thread.getPriority());
                stringBuilder2.append(str3);
                stringBuilder2.append(thread.getState());
                stringBuilder2.append(str2);
                for (StackTraceElement stackTraceElement2 : stackTraceElementArr) {
                    stackTraceElement = stackTraceElement2.toString();
                    stringBuilder2.append(str);
                    stringBuilder2.append(stackTraceElement);
                    stringBuilder2.append(10);
                }
                stringBuilder2.append(str2);
                stringBuilder.insert(0, stringBuilder2);
                obj = 1;
            } else {
                stringBuilder.append(thread.getName());
                stringBuilder.append(str3);
                stringBuilder.append(thread.getPriority());
                stringBuilder.append(str3);
                stringBuilder.append(thread.getState());
                stringBuilder.append(str2);
                for (StackTraceElement stackTraceElement22 : stackTraceElementArr) {
                    stackTraceElement = stackTraceElement22.toString();
                    stringBuilder.append(str);
                    stringBuilder.append(stackTraceElement);
                    stringBuilder.append(10);
                }
                stringBuilder.append(str2);
            }
        }
        if (obj == null) {
            stringBuilder.insert(0, a(Looper.getMainLooper().getThread()));
        }
        return true;
    }
}
