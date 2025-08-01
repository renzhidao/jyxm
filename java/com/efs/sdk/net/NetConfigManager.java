package com.efs.sdk.net;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;

public class NetConfigManager {
    private final String a;
    private final int b = 0;
    private EfsReporter c;
    private int d = 0;
    private int e;
    private boolean f = false;
    private Context g;

    /* DevToolsApp WARNING: Removed duplicated region for block: B:71:? A:{SYNTHETIC, RETURN} */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:67:0x012f  */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:67:0x012f  */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:71:? A:{SYNTHETIC, RETURN} */
    public NetConfigManager(android.content.Context r20, com.efs.sdk.base.EfsReporter r21) {
        /*
        r19 = this;
        r0 = r19;
        r19.<init>();
        r1 = "NetConfigManager";
        r0.a = r1;
        r2 = 0;
        r0.b = r2;
        r0.d = r2;
        r0.f = r2;
        r3 = r20.getApplicationContext();
        r0.g = r3;
        r4 = r21;
        r0.c = r4;
        r4 = "net_launch";
        r3 = r3.getSharedPreferences(r4, r2);
        r5 = "apm_netperf_sampling_rate_last";
        if (r3 == 0) goto L_0x002a;
    L_0x0024:
        r3 = r3.getInt(r5, r2);
        r0.e = r3;
    L_0x002a:
        r3 = r0.g;
        r3 = r3.getSharedPreferences(r4, r2);
        r6 = "apm_netperf_sampling_rate";
        r7 = -1;
        if (r3 == 0) goto L_0x003a;
    L_0x0035:
        r3 = r3.getInt(r6, r7);
        goto L_0x003b;
    L_0x003a:
        r3 = -1;
    L_0x003b:
        r8 = r0.c;
        r6 = new java.lang.String[]{r6};
        r9 = new com.efs.sdk.net.NetConfigManager$1;
        r9.<init>();
        r8.getAllSdkConfig(r6, r9);
        if (r3 == r7) goto L_0x004d;
    L_0x004b:
        r0.d = r3;
    L_0x004d:
        r3 = r0.g;
        r3 = r3.getSharedPreferences(r4, r2);
        r6 = "03f870871950c148387b251894ed3e88";
        r7 = 0;
        if (r3 == 0) goto L_0x005e;
    L_0x0059:
        r9 = r3.getLong(r6, r7);
        goto L_0x005f;
    L_0x005e:
        r9 = r7;
    L_0x005f:
        r11 = "8f2f54c08600aa25915617fa1371441b";
        if (r3 == 0) goto L_0x0068;
    L_0x0063:
        r12 = r3.getBoolean(r11, r2);
        goto L_0x0069;
    L_0x0068:
        r12 = 0;
    L_0x0069:
        r13 = r0.d;
        r14 = 1;
        if (r13 != 0) goto L_0x0093;
    L_0x006e:
        if (r12 == 0) goto L_0x007e;
    L_0x0070:
        if (r3 == 0) goto L_0x007e;
    L_0x0072:
        r1 = r3.edit();
        if (r1 == 0) goto L_0x007e;
    L_0x0078:
        r1.putBoolean(r11, r2);
        r1.commit();
    L_0x007e:
        r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r1 == 0) goto L_0x0090;
    L_0x0082:
        if (r3 == 0) goto L_0x0090;
    L_0x0084:
        r1 = r3.edit();
        if (r1 == 0) goto L_0x0090;
    L_0x008a:
        r1.putLong(r6, r7);
        r1.commit();
    L_0x0090:
        r14 = 0;
        goto L_0x0125;
    L_0x0093:
        r3 = r0.e;
        if (r13 == r3) goto L_0x0099;
    L_0x0097:
        r3 = 1;
        goto L_0x009a;
    L_0x0099:
        r3 = 0;
    L_0x009a:
        r7 = java.lang.Long.valueOf(r9);
        r8 = r0.d;
        r9 = java.lang.System.currentTimeMillis();
        r9 = java.lang.Long.valueOf(r9);
        r15 = r9.longValue();
        r17 = r7.longValue();
        r15 = r15 - r17;
        r7 = java.lang.Long.valueOf(r15);
        r15 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        if (r12 == 0) goto L_0x00cb;
    L_0x00bb:
        r12 = r7.longValue();
        r10 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1));
        if (r10 >= 0) goto L_0x00cb;
    L_0x00c3:
        if (r3 != 0) goto L_0x00cb;
    L_0x00c5:
        r3 = " check in allready";
        com.efs.sdk.base.core.util.Log.d(r1, r3);
        goto L_0x0125;
    L_0x00cb:
        r12 = r7.longValue();
        r7 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1));
        if (r7 >= 0) goto L_0x00dc;
    L_0x00d3:
        if (r3 == 0) goto L_0x00d6;
    L_0x00d5:
        goto L_0x00dc;
    L_0x00d6:
        r3 = "un repeat check in 24 hour!";
        com.efs.sdk.base.core.util.Log.d(r1, r3);
        goto L_0x0090;
    L_0x00dc:
        if (r8 == 0) goto L_0x00f0;
    L_0x00de:
        r3 = 100;
        if (r8 != r3) goto L_0x00e4;
    L_0x00e2:
        r3 = 1;
        goto L_0x00f1;
    L_0x00e4:
        r7 = new java.util.Random;
        r7.<init>();
        r3 = r7.nextInt(r3);
        if (r3 > r8) goto L_0x00f0;
    L_0x00ef:
        goto L_0x00e2;
    L_0x00f0:
        r3 = 0;
    L_0x00f1:
        if (r3 == 0) goto L_0x00f9;
    L_0x00f3:
        r3 = "random check in";
        com.efs.sdk.base.core.util.Log.d(r1, r3);
        goto L_0x00ff;
    L_0x00f9:
        r3 = "random not check in!";
        com.efs.sdk.base.core.util.Log.d(r1, r3);
        r14 = 0;
    L_0x00ff:
        r1 = r0.g;
        r1 = r1.getSharedPreferences(r4, r2);
        if (r1 == 0) goto L_0x0113;
    L_0x0107:
        r3 = r1.edit();
        if (r3 == 0) goto L_0x0113;
    L_0x010d:
        r3.putBoolean(r11, r14);
        r3.commit();
    L_0x0113:
        if (r1 == 0) goto L_0x0125;
    L_0x0115:
        r1 = r1.edit();
        if (r1 == 0) goto L_0x0125;
    L_0x011b:
        r7 = r9.longValue();
        r1.putLong(r6, r7);
        r1.commit();
    L_0x0125:
        r0.f = r14;
        r1 = r0.g;
        r1 = r1.getSharedPreferences(r4, r2);
        if (r1 == 0) goto L_0x013d;
    L_0x012f:
        r1 = r1.edit();
        if (r1 == 0) goto L_0x013d;
    L_0x0135:
        r2 = r0.d;
        r1.putInt(r5, r2);
        r1.commit();
    L_0x013d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.net.NetConfigManager.<init>(android.content.Context, com.efs.sdk.base.EfsReporter):void");
    }

    public boolean enableTracer() {
        return this.f;
    }
}
