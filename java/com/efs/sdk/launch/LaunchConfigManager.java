package com.efs.sdk.launch;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;

public class LaunchConfigManager {
    private final String a;
    private final int b = 0;
    private EfsReporter c;
    private int d = 100;
    private int e;
    private boolean f = false;
    private Context g;

    /* DevToolsApp WARNING: Removed duplicated region for block: B:79:? A:{SYNTHETIC, RETURN} */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:75:0x013f  */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:75:0x013f  */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:79:? A:{SYNTHETIC, RETURN} */
    public LaunchConfigManager(android.content.Context r21, com.efs.sdk.base.EfsReporter r22) {
        /*
        r20 = this;
        r0 = r20;
        r20.<init>();
        r1 = "LaunchConfigManager";
        r0.a = r1;
        r2 = 0;
        r0.b = r2;
        r3 = 100;
        r0.d = r3;
        r0.f = r2;
        r4 = r21.getApplicationContext();
        r0.g = r4;
        r5 = r22;
        r0.c = r5;
        r5 = "efs_launch";
        r4 = r4.getSharedPreferences(r5, r2);
        r6 = "apm_startperf_sampling_rate_last";
        if (r4 == 0) goto L_0x002c;
    L_0x0026:
        r4 = r4.getInt(r6, r2);
        r0.e = r4;
    L_0x002c:
        r4 = r0.g;
        r4 = r4.getSharedPreferences(r5, r2);
        r7 = "apm_startperf_sampling_rate";
        r8 = -1;
        if (r4 == 0) goto L_0x003c;
    L_0x0037:
        r4 = r4.getInt(r7, r8);
        goto L_0x003d;
    L_0x003c:
        r4 = -1;
    L_0x003d:
        r9 = r0.c;
        r7 = new java.lang.String[]{r7};
        r10 = new com.efs.sdk.launch.LaunchConfigManager$1;
        r10.<init>();
        r9.getAllSdkConfig(r7, r10);
        if (r4 == r8) goto L_0x004f;
    L_0x004d:
        r0.d = r4;
    L_0x004f:
        r4 = r0.g;
        r4 = r4.getSharedPreferences(r5, r2);
        r7 = "03f870871950c148387b251894ed3e88";
        r8 = 0;
        if (r4 == 0) goto L_0x0060;
    L_0x005b:
        r10 = r4.getLong(r7, r8);
        goto L_0x0061;
    L_0x0060:
        r10 = r8;
    L_0x0061:
        r12 = "8f2f54c08600aa25915617fa1371441b";
        if (r4 == 0) goto L_0x006a;
    L_0x0065:
        r13 = r4.getBoolean(r12, r2);
        goto L_0x006b;
    L_0x006a:
        r13 = 0;
    L_0x006b:
        r14 = r0.d;
        r15 = 1;
        if (r14 != 0) goto L_0x0095;
    L_0x0070:
        if (r13 == 0) goto L_0x0080;
    L_0x0072:
        if (r4 == 0) goto L_0x0080;
    L_0x0074:
        r1 = r4.edit();
        if (r1 == 0) goto L_0x0080;
    L_0x007a:
        r1.putBoolean(r12, r2);
        r1.commit();
    L_0x0080:
        r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r1 == 0) goto L_0x0092;
    L_0x0084:
        if (r4 == 0) goto L_0x0092;
    L_0x0086:
        r1 = r4.edit();
        if (r1 == 0) goto L_0x0092;
    L_0x008c:
        r1.putLong(r7, r8);
        r1.commit();
    L_0x0092:
        r15 = 0;
        goto L_0x0135;
    L_0x0095:
        r4 = r0.e;
        if (r14 == r4) goto L_0x009b;
    L_0x0099:
        r4 = 1;
        goto L_0x009c;
    L_0x009b:
        r4 = 0;
    L_0x009c:
        r8 = java.lang.Long.valueOf(r10);
        r9 = r0.d;
        r10 = java.lang.System.currentTimeMillis();
        r10 = java.lang.Long.valueOf(r10);
        r16 = r10.longValue();
        r18 = r8.longValue();
        r16 = r16 - r18;
        r8 = java.lang.Long.valueOf(r16);
        r16 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        if (r13 == 0) goto L_0x00d1;
    L_0x00bd:
        r13 = r8.longValue();
        r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1));
        if (r11 >= 0) goto L_0x00d1;
    L_0x00c5:
        if (r4 != 0) goto L_0x00d1;
    L_0x00c7:
        r3 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r3 == 0) goto L_0x0135;
    L_0x00cb:
        r3 = " check in allready";
        android.util.Log.d(r1, r3);
        goto L_0x0135;
    L_0x00d1:
        r13 = r8.longValue();
        r8 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1));
        if (r8 >= 0) goto L_0x00e6;
    L_0x00d9:
        if (r4 == 0) goto L_0x00dc;
    L_0x00db:
        goto L_0x00e6;
    L_0x00dc:
        r3 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r3 == 0) goto L_0x0092;
    L_0x00e0:
        r3 = "un repeat check in 24 hour!";
        android.util.Log.d(r1, r3);
        goto L_0x0092;
    L_0x00e6:
        if (r9 == 0) goto L_0x00f8;
    L_0x00e8:
        if (r9 != r3) goto L_0x00ec;
    L_0x00ea:
        r3 = 1;
        goto L_0x00f9;
    L_0x00ec:
        r4 = new java.util.Random;
        r4.<init>();
        r3 = r4.nextInt(r3);
        if (r3 > r9) goto L_0x00f8;
    L_0x00f7:
        goto L_0x00ea;
    L_0x00f8:
        r3 = 0;
    L_0x00f9:
        if (r3 == 0) goto L_0x0105;
    L_0x00fb:
        r3 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r3 == 0) goto L_0x010f;
    L_0x00ff:
        r3 = "random check in";
        android.util.Log.d(r1, r3);
        goto L_0x010f;
    L_0x0105:
        r3 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r3 == 0) goto L_0x010e;
    L_0x0109:
        r3 = "random not check in!";
        android.util.Log.d(r1, r3);
    L_0x010e:
        r15 = 0;
    L_0x010f:
        r1 = r0.g;
        r1 = r1.getSharedPreferences(r5, r2);
        if (r1 == 0) goto L_0x0123;
    L_0x0117:
        r3 = r1.edit();
        if (r3 == 0) goto L_0x0123;
    L_0x011d:
        r3.putBoolean(r12, r15);
        r3.commit();
    L_0x0123:
        if (r1 == 0) goto L_0x0135;
    L_0x0125:
        r1 = r1.edit();
        if (r1 == 0) goto L_0x0135;
    L_0x012b:
        r3 = r10.longValue();
        r1.putLong(r7, r3);
        r1.commit();
    L_0x0135:
        r0.f = r15;
        r1 = r0.g;
        r1 = r1.getSharedPreferences(r5, r2);
        if (r1 == 0) goto L_0x014d;
    L_0x013f:
        r1 = r1.edit();
        if (r1 == 0) goto L_0x014d;
    L_0x0145:
        r2 = r0.d;
        r1.putInt(r6, r2);
        r1.commit();
    L_0x014d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.launch.LaunchConfigManager.<init>(android.content.Context, com.efs.sdk.base.EfsReporter):void");
    }

    public boolean enableTracer() {
        return this.f;
    }
}
