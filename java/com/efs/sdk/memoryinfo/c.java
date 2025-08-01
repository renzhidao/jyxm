package com.efs.sdk.memoryinfo;

final class c {
    public final String activity;
    public final String bg;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final float r;
    public final long s;
    public final long t;

    /* DevToolsApp ERROR: DevToolsAppRE in pass: o00Ooo
        g.d.a.b.DevToolsAppRE: Exception block dominator not found, method:com.efs.sdk.memoryinfo.c.<init>(android.content.Context):void, dom blocks: []
        	at OooOO0O.OooO0O0.OooO0o.OooO0oO.o000O0Oo.o00Ooo.OooO0o(SourceFile:112)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o0000o(SourceFile:3)
        	at OooOO0O.OooO0O0.OooO0o.OooO0oO.o00000O.accept(SourceFile:1)
        	at OooO0oo.OooO00o.OooO00o.OooO0OO.OooOoOO.Oooo0.OooO00o(SourceFile:2)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o0000o0o(SourceFile:5)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o00oO0O(SourceFile:11)
        	at OooOO0O.OooO0O0.OooO00o.accept(SourceFile:1)
        	at OooO0oo.OooO00o.OooO00o.OooO0OO.OooOoOO.Oooo0.OooO00o(SourceFile:2)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o00oO0O(SourceFile:17)
        	at OooOO0O.OooO00o.OooO00o.run(SourceFile:8)
        */
    public c(android.content.Context r10) {
        /*
        r9 = this;
        r9.<init>();
        r0 = 0;
        r1 = "activity";	 Catch:{ all -> 0x0025 }
        r10 = r10.getSystemService(r1);	 Catch:{ all -> 0x0025 }
        r10 = (android.app.ActivityManager) r10;	 Catch:{ all -> 0x0025 }
        if (r10 == 0) goto L_0x0026;	 Catch:{ all -> 0x0025 }
    L_0x000e:
        r1 = android.os.Process.myPid();	 Catch:{ all -> 0x0025 }
        r2 = 1;	 Catch:{ all -> 0x0025 }
        r2 = new int[r2];	 Catch:{ all -> 0x0025 }
        r3 = 0;	 Catch:{ all -> 0x0025 }
        r2[r3] = r1;	 Catch:{ all -> 0x0025 }
        r10 = r10.getProcessMemoryInfo(r2);	 Catch:{ all -> 0x0025 }
        if (r10 == 0) goto L_0x0026;	 Catch:{ all -> 0x0025 }
    L_0x001e:
        r1 = r10.length;	 Catch:{ all -> 0x0025 }
        if (r1 <= 0) goto L_0x0026;	 Catch:{ all -> 0x0025 }
    L_0x0021:
        r10 = r10[r3];	 Catch:{ all -> 0x0025 }
        r0 = r10;
        goto L_0x0026;
    L_0x0026:
        if (r0 != 0) goto L_0x0030;
    L_0x0028:
        r0 = new android.os.Debug$MemoryInfo;
        r0.<init>();
        android.os.Debug.getMemoryInfo(r0);
    L_0x0030:
        r10 = com.efs.sdk.memoryinfo.UMMemoryMonitor.get();
        r10 = r10.isForeground();
        if (r10 == 0) goto L_0x003d;
    L_0x003a:
        r10 = "fg";
        goto L_0x003f;
    L_0x003d:
        r10 = "bg";
    L_0x003f:
        r9.bg = r10;
        r10 = r0.getTotalPss();
        r1 = (long) r10;
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r1 = r1 * r3;
        r9.n = r1;
        r10 = r0.dalvikPss;
        r1 = (long) r10;
        r1 = r1 * r3;
        r9.o = r1;
        r10 = r0.nativePss;
        r1 = (long) r10;
        r1 = r1 * r3;
        r9.p = r1;
        r0 = com.efs.sdk.memoryinfo.f.a(r0);
        r0 = r0 * r3;
        r9.s = r0;
        r10 = java.lang.Runtime.getRuntime();
        r0 = r10.totalMemory();
        r10 = java.lang.Runtime.getRuntime();
        r5 = r10.freeMemory();
        r0 = r0 - r5;
        r9.q = r0;
        r10 = java.lang.Runtime.getRuntime();
        r5 = r10.maxMemory();
        r7 = 0;
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r2 == 0) goto L_0x008d;
    L_0x0085:
        r0 = (float) r0;
        r0 = r0 * r10;
        r10 = (float) r5;
        r0 = r0 / r10;
        r9.r = r0;
        goto L_0x008f;
    L_0x008d:
        r9.r = r10;
    L_0x008f:
        r0 = com.efs.sdk.memoryinfo.f.a();
        r0 = r0 * r3;
        r9.t = r0;
        r10 = com.efs.sdk.memoryinfo.UMMemoryMonitor.get();
        r10 = r10.getCurrentActivity();
        r9.activity = r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.memoryinfo.c.<init>(android.content.Context):void");
    }
}
