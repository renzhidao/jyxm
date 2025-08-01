package com.efs.sdk.memoryinfo;

import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import android.util.Log;

final class f {
    /* DevToolsApp ERROR: DevToolsAppRE in pass: o00Ooo
        g.d.a.b.DevToolsAppRE: Exception block dominator not found, method:com.efs.sdk.memoryinfo.f.a():long, dom blocks: []
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
    public static long a() {
        /*
        r0 = -1;
        r2 = new java.io.BufferedReader;	 Catch:{ all -> 0x009f }
        r3 = new java.io.FileReader;	 Catch:{ all -> 0x009f }
        r4 = new java.io.File;	 Catch:{ all -> 0x009f }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009f }
        r6 = "/proc/";	 Catch:{ all -> 0x009f }
        r5.<init>(r6);	 Catch:{ all -> 0x009f }
        r6 = android.os.Process.myPid();	 Catch:{ all -> 0x009f }
        r5.append(r6);	 Catch:{ all -> 0x009f }
        r6 = "/status";	 Catch:{ all -> 0x009f }
        r5.append(r6);	 Catch:{ all -> 0x009f }
        r5 = r5.toString();	 Catch:{ all -> 0x009f }
        r4.<init>(r5);	 Catch:{ all -> 0x009f }
        r3.<init>(r4);	 Catch:{ all -> 0x009f }
        r2.<init>(r3);	 Catch:{ all -> 0x009f }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009d }
        r3.<init>();	 Catch:{ all -> 0x009d }
    L_0x002d:
        r4 = r2.readLine();	 Catch:{ all -> 0x009d }
        if (r4 == 0) goto L_0x003c;	 Catch:{ all -> 0x009d }
    L_0x0033:
        r3.append(r4);	 Catch:{ all -> 0x009d }
        r4 = 10;	 Catch:{ all -> 0x009d }
        r3.append(r4);	 Catch:{ all -> 0x009d }
        goto L_0x002d;	 Catch:{ all -> 0x009d }
    L_0x003c:
        r3 = r3.toString();	 Catch:{ all -> 0x009d }
        r3 = r3.trim();	 Catch:{ all -> 0x009d }
        r4 = "\n";	 Catch:{ all -> 0x009d }
        r3 = r3.split(r4);	 Catch:{ all -> 0x009d }
        r4 = r3.length;	 Catch:{ all -> 0x009d }
        r5 = r3.length;	 Catch:{ all -> 0x009d }
        r6 = 0;
    L_0x004d:
        r7 = "\\d+";
        if (r6 >= r5) goto L_0x0075;
    L_0x0051:
        r8 = r3[r6];	 Catch:{ all -> 0x009d }
        r9 = "VmSize";	 Catch:{ all -> 0x009d }
        r9 = r8.startsWith(r9);	 Catch:{ all -> 0x009d }
        if (r9 == 0) goto L_0x0072;	 Catch:{ all -> 0x009d }
    L_0x005b:
        r9 = java.util.regex.Pattern.compile(r7);	 Catch:{ all -> 0x009d }
        r8 = r9.matcher(r8);	 Catch:{ all -> 0x009d }
        r9 = r8.find();	 Catch:{ all -> 0x009d }
        if (r9 == 0) goto L_0x0072;	 Catch:{ all -> 0x009d }
    L_0x0069:
        r5 = r8.group();	 Catch:{ all -> 0x009d }
        r5 = java.lang.Long.parseLong(r5);	 Catch:{ all -> 0x009d }
        goto L_0x0076;
    L_0x0072:
        r6 = r6 + 1;
        goto L_0x004d;
    L_0x0075:
        r5 = r0;
    L_0x0076:
        r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r8 != 0) goto L_0x0099;
    L_0x007a:
        r0 = 12;
        if (r4 <= r0) goto L_0x0099;
    L_0x007e:
        r1 = java.util.regex.Pattern.compile(r7);	 Catch:{ all -> 0x0097 }
        r0 = r3[r0];	 Catch:{ all -> 0x0097 }
        r0 = r1.matcher(r0);	 Catch:{ all -> 0x0097 }
        r1 = r0.find();	 Catch:{ all -> 0x0097 }
        if (r1 == 0) goto L_0x0099;	 Catch:{ all -> 0x0097 }
    L_0x008e:
        r0 = r0.group();	 Catch:{ all -> 0x0097 }
        r5 = java.lang.Long.parseLong(r0);	 Catch:{ all -> 0x0097 }
        goto L_0x0099;
    L_0x0097:
        r0 = r5;
        goto L_0x00a0;
    L_0x0099:
        r2.close();	 Catch:{ all -> 0x00a6 }
        goto L_0x00a6;
        goto L_0x00a0;
    L_0x009f:
        r2 = 0;
    L_0x00a0:
        if (r2 == 0) goto L_0x00a5;
    L_0x00a2:
        r2.close();	 Catch:{ all -> 0x00a5 }
    L_0x00a5:
        r5 = r0;
    L_0x00a6:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.memoryinfo.f.a():long");
    }

    public static long a(MemoryInfo memoryInfo) {
        if (VERSION.SDK_INT >= 23) {
            Object memoryStat = memoryInfo.getMemoryStat("summary.graphics");
            try {
                if (!TextUtils.isEmpty(memoryStat)) {
                    return Long.parseLong(memoryStat);
                }
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public static void a(String str, Throwable th) {
        if (a.DEBUG) {
            Log.e("MemoryCollect", str, th);
        }
    }
}
