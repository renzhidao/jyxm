package com.junge.algorithmAidePro.Thread;

public class NotifConfigChangeThread extends Thread {
    /* renamed from: ۜۙۖ */
    private static final short[] f115 = new short[]{(short) 7913, (short) -25159, (short) -25115, (short) -25102, (short) -25099, (short) -25097, (short) -25116, (short) -25102, (short) -25159, (short) -25129, (short) -25096, (short) -25102, (short) -25116, (short) -25095, (short) -25089, (short) -25102, (short) -25159, (short) -25093, (short) -25101, (short) -25102, (short) -25089, (short) -25097, (short) -25159, (short) -25159, (short) -25119, (short) -25097, (short) -25118, (short) -25099, (short) -25090, (short) -25159, (short) -25131, (short) -25095, (short) -25096, (short) -25104, (short) -25089, (short) -25103, (short) -25148, (short) -25101, (short) -25099, (short) -25101, (short) -25089, (short) -25120, (short) -25101, (short) -25116, (short) -12729, (short) 3479, (short) -15383, (short) -1733};
    public String packageName;

    public NotifConfigChangeThread(String str) {
        this.packageName = str;
    }

    /* DevToolsApp WARNING: Missing block: B:13:0x004b, code:
            r14 = r19;
            r17 = r0;
            r18 = r1;
            r16 = r5;
     */
    /* DevToolsApp WARNING: Missing block: B:16:0x0061, code:
            if (s.ۚۡۢ.f7 == false) goto L_0x007c;
     */
    /* DevToolsApp WARNING: Missing block: B:21:0x0070, code:
            if (s.ۙۜۦ.m520() == 0) goto L_0x0072;
     */
    /* DevToolsApp WARNING: Missing block: B:22:0x0072, code:
            r14 = r19;
            r17 = r0;
            r18 = r1;
            r16 = r5;
     */
    /* DevToolsApp WARNING: Missing block: B:23:0x007c, code:
            r13 = "۬ۛۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:24:0x007e, code:
            r13 = s.ۢ۫ۗ.m350(r13);
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x008d, code:
            r13 = "ۜۨۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:38:?, code:
            s.ۚۤۙ.m290(r1[r4]);
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x00ae, code:
            r13 = "ۦۢۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x00ec, code:
            r5 = "۟۬ۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:65:0x0105, code:
            r5 = "ۡ۟ۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:66:0x0107, code:
            r13 = s.ۢ۫ۗ.m350(r5);
     */
    /* DevToolsApp WARNING: Missing block: B:69:0x0112, code:
            r5 = "ۧۗۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:70:0x0114, code:
            r13 = s.ۜۘۡ.m282(r5);
     */
    /* DevToolsApp WARNING: Missing block: B:71:0x0118, code:
            r5 = r16;
     */
    /* DevToolsApp WARNING: Missing block: B:90:0x018d, code:
            r0 = "ۡ۬ۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:100:0x01d9, code:
            r0 = "ۥۧۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:108:0x021d, code:
            r0 = "۟ۛ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:116:0x0253, code:
            r0 = "۟ۚۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:124:0x0278, code:
            r13 = s.ۢ۫ۗ.m350(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:125:0x027c, code:
            r5 = r16;
     */
    /* DevToolsApp WARNING: Missing block: B:128:0x028f, code:
            r0 = "ۜۦۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:129:0x0291, code:
            r13 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:131:0x029c, code:
            r0 = r17;
     */
    public void run() {
        /*
        r19 = this;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = "۫ۨۢ";
    L_0x000f:
        r13 = s.ۜۘۡ.m282(r13);
    L_0x0013:
        switch(r13) {
            case 1737895: goto L_0x00a9;
            case 1737923: goto L_0x00bb;
            case 1738122: goto L_0x006c;
            case 1740186: goto L_0x017f;
            case 1740974: goto L_0x01e7;
            case 1741337: goto L_0x00f7;
            case 1742908: goto L_0x0230;
            case 1743037: goto L_0x0245;
            case 1743216: goto L_0x01a7;
            case 1744030: goto L_0x0096;
            case 1744092: goto L_0x0091;
            case 1744095: goto L_0x020e;
            case 1746539: goto L_0x0064;
            case 1746575: goto L_0x0042;
            case 1747097: goto L_0x00e3;
            case 1748602: goto L_0x00fd;
            case 1748791: goto L_0x0033;
            case 1749020: goto L_0x011c;
            case 1749733: goto L_0x0191;
            case 1752171: goto L_0x00d9;
            case 1752604: goto L_0x0026;
            case 1752697: goto L_0x005f;
            case 1753199: goto L_0x00ef;
            case 1753439: goto L_0x01c9;
            case 1753479: goto L_0x009d;
            case 1753512: goto L_0x00a4;
            case 1754135: goto L_0x010c;
            case 1754629: goto L_0x00fe;
            case 1754749: goto L_0x0259;
            case 1755705: goto L_0x0269;
            case 1758028: goto L_0x010d;
            case 1758244: goto L_0x00e9;
            case 1758262: goto L_0x0172;
            case 1758501: goto L_0x027f;
            case 1759047: goto L_0x0083;
            default: goto L_0x0016;
        };
    L_0x0016:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = s.ۚۤۙ.m296();
        if (r0 == 0) goto L_0x0242;
    L_0x0024:
        goto L_0x0253;
    L_0x0026:
        s.ۤۤۖ.m506();
        r13 = s.ۨۧۜ.m755();
        if (r13 < 0) goto L_0x0030;
    L_0x002f:
        goto L_0x007c;
    L_0x0030:
        r13 = "ۡۥۛ";
        goto L_0x000f;
    L_0x0033:
        r13 = s.ۖۙۜ.f48;
        if (r13 != 0) goto L_0x0038;
    L_0x0037:
        goto L_0x007c;
    L_0x0038:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        goto L_0x021d;
    L_0x0042:
        s.ۗ۬ۦ.m407();
        r13 = s.ۤۤۖ.m506();
        if (r13 == 0) goto L_0x0055;
    L_0x004b:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        goto L_0x0253;
    L_0x0055:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        goto L_0x01d9;
    L_0x005f:
        r13 = s.ۚۡۢ.f7;
        if (r13 != 0) goto L_0x004b;
    L_0x0063:
        goto L_0x007c;
    L_0x0064:
        r13 = s.۠ۡۧ.f26;
        if (r13 == 0) goto L_0x0069;
    L_0x0068:
        goto L_0x008d;
    L_0x0069:
        r13 = "ۖۢۖ";
        goto L_0x007e;
    L_0x006c:
        r13 = s.ۙۜۦ.m520();
        if (r13 != 0) goto L_0x007c;
    L_0x0072:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        goto L_0x028f;
    L_0x007c:
        r13 = "۬ۛۖ";
    L_0x007e:
        r13 = s.ۢ۫ۗ.m350(r13);
        goto L_0x0013;
    L_0x0083:
        s.ۤۗۛ.m370();
        r13 = s.۫ۢ۠.m237();
        if (r13 < 0) goto L_0x008d;
    L_0x008c:
        goto L_0x0072;
    L_0x008d:
        r13 = "ۜۨۨ";
        goto L_0x000f;
    L_0x0091:
        r13 = s.ۢۜۘ.f15;
        if (r13 == 0) goto L_0x0072;
    L_0x0095:
        goto L_0x0099;
    L_0x0096:
        s.ۡۢۡ.m58();
    L_0x0099:
        r13 = "ۦۡۢ";
        goto L_0x000f;
    L_0x009d:
        s.ۗۤ۫.m195();
        s.ۨۧۚ.m718();
        return;
    L_0x00a4:
        r4 = r4 + 1;
        r16 = r5;
        goto L_0x00ec;
    L_0x00a9:
        r13 = r1[r4];	 Catch:{ Exception -> 0x00b2 }
        s.ۚۤۙ.m290(r13);	 Catch:{ Exception -> 0x00ae }
    L_0x00ae:
        r13 = "ۦۢۤ";
        goto L_0x000f;
    L_0x00b2:
        r0 = move-exception;
        r14 = r19;
        r18 = r1;
        r16 = r5;
        goto L_0x0168;
    L_0x00bb:
        r13 = f115;	 Catch:{ Exception -> 0x00d4 }
        r14 = 30;
        r15 = 14;
        r13 = s.ۗ۬ۦ.m414(r13, r14, r15, r12);	 Catch:{ Exception -> 0x00d4 }
        r14 = f115;	 Catch:{ Exception -> 0x00d4 }
        r15 = 44;
        r16 = r5;
        r5 = 4;
        r5 = s.ۡۥۗ.m567(r14, r15, r5, r12);	 Catch:{ Exception -> 0x0163 }
        s.ۢ۟ۚ.m175(r13, r5);	 Catch:{ Exception -> 0x0163 }
        goto L_0x0112;
    L_0x00d4:
        r0 = move-exception;
        r16 = r5;
        goto L_0x0164;
    L_0x00d9:
        r16 = r5;
        if (r4 >= r3) goto L_0x00e0;
    L_0x00dd:
        r5 = "ۖۚ۫";
        goto L_0x0107;
    L_0x00e0:
        r5 = "ۖۛۨ";
        goto L_0x0114;
    L_0x00e3:
        r16 = r5;
        r3 = r1.length;	 Catch:{ Exception -> 0x0163 }
        r5 = "ۥۖۜ";
        goto L_0x0107;
    L_0x00e9:
        r16 = r5;
        r4 = 0;
    L_0x00ec:
        r5 = "۟۬ۦ";
        goto L_0x0114;
    L_0x00ef:
        r16 = r5;
        if (r2 != 0) goto L_0x00f4;
    L_0x00f3:
        goto L_0x0105;
    L_0x00f4:
        r5 = "۫۠ۙ";
        goto L_0x0114;
    L_0x00f7:
        r16 = r5;
        r2 = r1.length;	 Catch:{ Exception -> 0x0163 }
        r5 = "ۦۘۡ";
        goto L_0x0114;
    L_0x00fd:
        return;
    L_0x00fe:
        r16 = r5;
        if (r1 == 0) goto L_0x0105;
    L_0x0102:
        r5 = "ۙ۬۬";
        goto L_0x0114;
    L_0x0105:
        r5 = "ۡ۟ۘ";
    L_0x0107:
        r13 = s.ۢ۫ۗ.m350(r5);
        goto L_0x0118;
    L_0x010c:
        return;
    L_0x010d:
        r16 = r5;
        s.ۗ۬۟.m271(r0);
    L_0x0112:
        r5 = "ۧۗۧ";
    L_0x0114:
        r13 = s.ۜۘۡ.m282(r5);
    L_0x0118:
        r5 = r16;
        goto L_0x0013;
    L_0x011c:
        r16 = r5;
        r5 = new java.io.File;	 Catch:{ Exception -> 0x0163 }
        r13 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0163 }
        r13.<init>();	 Catch:{ Exception -> 0x0163 }
        r14 = f115;	 Catch:{ Exception -> 0x0163 }
        r15 = 1;
        r17 = r0;
        r0 = 22;
        r0 = s.۠ۜۗ.m221(r14, r15, r0, r12);	 Catch:{ Exception -> 0x0163 }
        s.ۢ۫ۜ.m637(r13, r0);	 Catch:{ Exception -> 0x0163 }
        r14 = r19;
        r0 = r14.packageName;	 Catch:{ Exception -> 0x0161 }
        s.ۢ۫ۜ.m637(r13, r0);	 Catch:{ Exception -> 0x0161 }
        r0 = f115;	 Catch:{ Exception -> 0x0161 }
        r15 = 23;
        r18 = r1;
        r1 = 7;
        r0 = s.ۨۗۥ.m531(r0, r15, r1, r12);	 Catch:{ Exception -> 0x015f }
        s.ۗۜۛ.m701(r13, r0);	 Catch:{ Exception -> 0x015f }
        r0 = s.ۦۡۤ.m398(r13);	 Catch:{ Exception -> 0x015f }
        r5.<init>(r0);	 Catch:{ Exception -> 0x015f }
        r1 = s.ۚ۟ۢ.m91(r5);	 Catch:{ Exception -> 0x015f }
        r0 = "ۧۧۥ";
        r13 = s.ۜۘۡ.m282(r0);
        r5 = r16;
        r0 = r17;
        goto L_0x0013;
    L_0x015f:
        r0 = move-exception;
        goto L_0x0168;
    L_0x0161:
        r0 = move-exception;
        goto L_0x0166;
    L_0x0163:
        r0 = move-exception;
    L_0x0164:
        r14 = r19;
    L_0x0166:
        r18 = r1;
    L_0x0168:
        r1 = "۫ۙۚ";
        r13 = s.ۢ۫ۗ.m350(r1);
        r5 = r16;
        goto L_0x029e;
    L_0x0172:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = 661; // 0x295 float:9.26E-43 double:3.266E-321;
        r12 = 661; // 0x295 float:9.26E-43 double:3.266E-321;
        goto L_0x018d;
    L_0x017f:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = 40342; // 0x9d96 float:5.6531E-41 double:1.99316E-319;
        r12 = 40342; // 0x9d96 float:5.6531E-41 double:1.99316E-319;
    L_0x018d:
        r0 = "ۡ۬ۧ";
        goto L_0x0278;
    L_0x0191:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = r10 + r11;
        r0 = r9 - r0;
        if (r0 <= 0) goto L_0x01a3;
    L_0x019f:
        r0 = "۫۠۫";
        goto L_0x0278;
    L_0x01a3:
        r0 = "ۘۦۨ";
        goto L_0x0278;
    L_0x01a7:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = 71961289; // 0x44a0ac9 float:2.3749938E-36 double:3.55536007E-316;
        r1 = s.۟ۥۙ.f52;
        if (r1 == 0) goto L_0x01b8;
    L_0x01b6:
        goto L_0x028f;
    L_0x01b8:
        r1 = "ۢۤۧ";
        r13 = s.ۢ۫ۗ.m350(r1);
        r5 = r16;
        r0 = r17;
        r1 = r18;
        r11 = 71961289; // 0x44a0ac9 float:2.3749938E-36 double:3.55536007E-316;
        goto L_0x0013;
    L_0x01c9:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = r7 * r8;
        r1 = r7 * r7;
        r5 = s.ۡۥۗ.f47;
        if (r5 == 0) goto L_0x01dd;
    L_0x01d9:
        r0 = "ۥۧۛ";
        goto L_0x0278;
    L_0x01dd:
        r5 = "ۛ۫۠";
        r13 = s.ۜۘۡ.m282(r5);
        r9 = r0;
        r10 = r1;
        goto L_0x027c;
    L_0x01e7:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = r16[r6];
        r1 = 16966; // 0x4246 float:2.3774E-41 double:8.3823E-320;
        r5 = s.ۨۧۚ.m718();
        if (r5 > 0) goto L_0x01fd;
    L_0x01f9:
        r0 = "ۥۤۛ";
        goto L_0x0278;
    L_0x01fd:
        r5 = "ۦ۠ۙ";
        r13 = s.ۢ۫ۗ.m350(r5);
        r7 = r0;
        r5 = r16;
        r0 = r17;
        r1 = r18;
        r8 = 16966; // 0x4246 float:2.3774E-41 double:8.3823E-320;
        goto L_0x0013;
    L_0x020e:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = 0;
        r1 = s.۟ۧۢ.m774();
        if (r1 == 0) goto L_0x0221;
    L_0x021d:
        r0 = "۟ۛ۫";
        goto L_0x0291;
    L_0x0221:
        r1 = "ۙۡۖ";
        r13 = s.ۜۘۡ.m282(r1);
        r5 = r16;
        r0 = r17;
        r1 = r18;
        r6 = 0;
        goto L_0x0013;
    L_0x0230:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = s.ۡۗۗ.m159();
        if (r0 == 0) goto L_0x023f;
    L_0x023e:
        goto L_0x0253;
    L_0x023f:
        r0 = "ۜۨ۫";
        goto L_0x0278;
    L_0x0242:
        r0 = "ۛۡۢ";
        goto L_0x0278;
    L_0x0245:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = s.ۜۘۡ.m280();
        if (r0 == 0) goto L_0x0256;
    L_0x0253:
        r0 = "۟ۚۦ";
        goto L_0x0291;
    L_0x0256:
        r0 = "ۘ۫۬";
        goto L_0x0278;
    L_0x0259:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = s.ۢ۟ۚ.f10;
        if (r0 == 0) goto L_0x0266;
    L_0x0265:
        goto L_0x028f;
    L_0x0266:
        r0 = "ۛۥۧ";
        goto L_0x0278;
    L_0x0269:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r0 = s.۬ۗ۫.f6;
        if (r0 < 0) goto L_0x0276;
    L_0x0275:
        goto L_0x028f;
    L_0x0276:
        r0 = "ۧ۫ۡ";
    L_0x0278:
        r13 = s.ۢ۫ۗ.m350(r0);
    L_0x027c:
        r5 = r16;
        goto L_0x029c;
    L_0x027f:
        r14 = r19;
        r17 = r0;
        r18 = r1;
        r16 = r5;
        r5 = f115;
        r0 = s.ۗۢۢ.m454();
        if (r0 < 0) goto L_0x0296;
    L_0x028f:
        r0 = "ۜۦۨ";
    L_0x0291:
        r13 = s.ۜۘۡ.m282(r0);
        goto L_0x027c;
    L_0x0296:
        r0 = "ۨ۫ۜ";
        r13 = s.ۢ۫ۗ.m350(r0);
    L_0x029c:
        r0 = r17;
    L_0x029e:
        r1 = r18;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Thread.NotifConfigChangeThread.run():void");
    }
}
