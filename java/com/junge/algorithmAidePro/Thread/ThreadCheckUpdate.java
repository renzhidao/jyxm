package com.junge.algorithmAidePro.Thread;

import android.os.Handler;

public class ThreadCheckUpdate extends Thread {
    public Handler mHandler;

    public ThreadCheckUpdate(Handler handler) {
        this.mHandler = handler;
    }

    /* DevToolsApp WARNING: Missing block: B:16:0x0041, code:
            r2 = "ۚۡ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:26:0x006c, code:
            r2 = "ۚۖۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:40:0x0095, code:
            r2 = "۫ۡۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x00a3, code:
            r2 = s.ۜۘۡ.m282(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00b3, code:
            r2 = "۠ۥۜ";
     */
    public void run() {
        /*
        r5 = this;
        r0 = 0;
        r1 = 0;
        r2 = "ۜۜۙ";
    L_0x0004:
        r2 = s.ۢ۫ۗ.m350(r2);
    L_0x0008:
        switch(r2) {
            case 1741151: goto L_0x005b;
            case 1741301: goto L_0x0048;
            case 1741609: goto L_0x0019;
            case 1741944: goto L_0x008f;
            case 1741946: goto L_0x0032;
            case 1742852: goto L_0x009c;
            case 1743705: goto L_0x00a9;
            case 1746957: goto L_0x007c;
            case 1747394: goto L_0x0066;
            case 1747831: goto L_0x0023;
            case 1748994: goto L_0x0013;
            case 1753814: goto L_0x0038;
            case 1755188: goto L_0x0072;
            case 1758283: goto L_0x002e;
            case 1759239: goto L_0x0084;
            default: goto L_0x000b;
        };
    L_0x000b:
        s.ۢ۟ۚ.m168();
        s.ۨۘۢ.m318();
        goto L_0x0095;
    L_0x0013:
        r2 = s.ۨۗۥ.f42;
        if (r2 <= 0) goto L_0x006c;
    L_0x0017:
        goto L_0x00b3;
    L_0x0019:
        s.ۨۘۢ.m318();
        r2 = s.ۗ۬ۦ.m407();
        if (r2 == 0) goto L_0x00b3;
    L_0x0022:
        goto L_0x0041;
    L_0x0023:
        s.ۗۤ۫.m195();
        r2 = s.ۗ۬ۦ.m407();
        if (r2 == 0) goto L_0x0041;
    L_0x002c:
        goto L_0x0095;
    L_0x002e:
        s.۬ۗ۫.m98();
        return;
    L_0x0032:
        r0 = r5.mHandler;
        s.ۗ۬ۦ.m417(r0, r1);
        return;
    L_0x0038:
        r2 = 0;
        r1.what = r2;
        r2 = s.ۦۢۜ.m16();
        if (r2 == 0) goto L_0x0045;
    L_0x0041:
        r2 = "ۚۡ۠";
        goto L_0x00a3;
    L_0x0045:
        r2 = "ۚۡۡ";
        goto L_0x0004;
    L_0x0048:
        r2 = s.ۦۡۤ.m393();
        r3 = s.ۗ۬ۦ.f27;
        if (r3 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0088;
    L_0x0051:
        r1 = "ۦ۬ۜ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r4 = r2;
        r2 = r1;
        r1 = r4;
        goto L_0x0008;
    L_0x005b:
        r0.requestAppData();
        r2 = s.ۢ۟ۚ.f10;
        if (r2 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0088;
    L_0x0063:
        r2 = "ۙ۫ۧ";
        goto L_0x00a3;
    L_0x0066:
        r2 = s.ۧۧۡ.m183();
        if (r2 > 0) goto L_0x006f;
    L_0x006c:
        r2 = "ۚۖۥ";
        goto L_0x00a3;
    L_0x006f:
        r2 = "ۙۦ۬";
        goto L_0x0004;
    L_0x0072:
        r2 = s.ۥۘۧ.m662();
        if (r2 > 0) goto L_0x0079;
    L_0x0078:
        goto L_0x0088;
    L_0x0079:
        r2 = "۠ۗۙ";
        goto L_0x00a3;
    L_0x007c:
        r2 = s.ۗ۬ۦ.f27;
        if (r2 == 0) goto L_0x0081;
    L_0x0080:
        goto L_0x00b3;
    L_0x0081:
        r2 = "ۨۚۦ";
        goto L_0x00a3;
    L_0x0084:
        r2 = s.ۥۥۚ.f50;
        if (r2 == 0) goto L_0x008b;
    L_0x0088:
        r2 = "ۡ۫۬";
        goto L_0x00a3;
    L_0x008b:
        r2 = "۟ۨۖ";
        goto L_0x0004;
    L_0x008f:
        r2 = s.ۗۜ۟.m469();
        if (r2 > 0) goto L_0x0099;
    L_0x0095:
        r2 = "۫ۡۡ";
        goto L_0x0004;
    L_0x0099:
        r2 = "۬ۡۜ";
        goto L_0x00a3;
    L_0x009c:
        r2 = s.ۗ۬ۦ.f27;
        if (r2 == 0) goto L_0x00a1;
    L_0x00a0:
        goto L_0x00b3;
    L_0x00a1:
        r2 = "ۚۡ۟";
    L_0x00a3:
        r2 = s.ۜۘۡ.m282(r2);
        goto L_0x0008;
    L_0x00a9:
        r2 = s.۟ۤۗ.m335();
        r3 = s.ۖۙۜ.m589();
        if (r3 > 0) goto L_0x00b7;
    L_0x00b3:
        r2 = "۠ۥۜ";
        goto L_0x0004;
    L_0x00b7:
        r0 = "ۛ۟ۨ";
        r0 = s.ۜۘۡ.m282(r0);
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Thread.ThreadCheckUpdate.run():void");
    }
}
