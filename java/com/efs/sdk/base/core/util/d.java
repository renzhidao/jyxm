package com.efs.sdk.base.core.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

public class d {
    private static volatile String a = "";

    public static String a(Context context) {
        if (TextUtils.isEmpty(a)) {
            synchronized (d.class) {
                if (TextUtils.isEmpty(a)) {
                    CharSequence b = b(context);
                    a = b;
                    if (TextUtils.isEmpty(b)) {
                        a = c(context);
                    }
                }
            }
        }
        return a;
    }

    private static String b(Context context) {
        try {
            File file = new File(a.a(context), "efsid");
            return file.exists() ? b.a(file) : null;
        } catch (Throwable e) {
            Log.e("efs.base", "get uuid error", e);
            return null;
        }
    }

    /* DevToolsApp WARNING: Missing block: B:17:0x0017, code:
            continue;
     */
    private static java.lang.String c(android.content.Context r5) {
        /*
        r0 = "efsid";
        r1 = "";
        r2 = 0;
    L_0x0005:
        r3 = 3;
        if (r2 >= r3) goto L_0x001a;
    L_0x0008:
        r3 = java.util.UUID.randomUUID();	 Catch:{ all -> 0x0017 }
        r1 = r3.toString();	 Catch:{ all -> 0x0017 }
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0017 }
        if (r3 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x001a;
    L_0x0017:
        r2 = r2 + 1;
        goto L_0x0005;
    L_0x001a:
        r5 = com.efs.sdk.base.core.util.a.a(r5);	 Catch:{ Exception -> 0x0051 }
        r2 = new java.io.File;	 Catch:{ Exception -> 0x0051 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0051 }
        r3.<init>(r0);	 Catch:{ Exception -> 0x0051 }
        r4 = android.os.Process.myPid();	 Catch:{ Exception -> 0x0051 }
        r3.append(r4);	 Catch:{ Exception -> 0x0051 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x0051 }
        r2.<init>(r5, r3);	 Catch:{ Exception -> 0x0051 }
        r3 = r2.exists();	 Catch:{ Exception -> 0x0051 }
        if (r3 == 0) goto L_0x003c;
    L_0x0039:
        r2.delete();	 Catch:{ Exception -> 0x0051 }
    L_0x003c:
        r2.createNewFile();	 Catch:{ Exception -> 0x0051 }
        com.efs.sdk.base.core.util.b.a(r2, r1);	 Catch:{ Exception -> 0x0051 }
        r3 = new java.io.File;	 Catch:{ Exception -> 0x0051 }
        r3.<init>(r5, r0);	 Catch:{ Exception -> 0x0051 }
        r5 = r2.renameTo(r3);	 Catch:{ Exception -> 0x0051 }
        if (r5 == 0) goto L_0x006a;
    L_0x004d:
        r2.delete();	 Catch:{ Exception -> 0x0051 }
        goto L_0x006a;
    L_0x0051:
        r5 = move-exception;
        r0 = new java.lang.StringBuilder;
        r2 = "save uuid '";
        r0.<init>(r2);
        r0.append(r1);
        r2 = "' error";
        r0.append(r2);
        r0 = r0.toString();
        r2 = "efs.base";
        com.efs.sdk.base.core.util.Log.e(r2, r0, r5);
    L_0x006a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.core.util.d.c(android.content.Context):java.lang.String");
    }
}
