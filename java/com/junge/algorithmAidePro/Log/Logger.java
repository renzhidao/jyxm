package com.junge.algorithmAidePro.Log;

import java.io.File;
import java.text.SimpleDateFormat;

public class Logger {
    private static final SimpleDateFormat DATE_FORMAT;
    private static final String LOGCAT;
    private static final String TAG;
    /* renamed from: ۘۦ۫ */
    private static final short[] f106 = new short[]{(short) 8485, (short) 13104, (short) 13107, (short) 13115, (short) 13119, (short) 13117, (short) 13096, (short) 13072, (short) 13107, (short) 13115, (short) 13115, (short) 13113, (short) 13102, (short) 13093, (short) 13093, (short) 13093, (short) 13093, (short) 13169, (short) 13073, (short) 13073, (short) 13169, (short) 13112, (short) 13112, (short) 13180, (short) 13076, (short) 13076, (short) 13158, (short) 13105, (short) 13105, (short) 13158, (short) 13103, (short) 13103, (short) 5715, (short) -23549, (short) -23552, (short) -23544, (short) -23540, (short) -23538, (short) -23525, (short) 7877, (short) 19957, (short) 19958, (short) 19966, (short) 19962, (short) 19960, (short) 19949, (short) 4553, (short) -5156, (short) -5207, (short) -5207, (short) -5207, (short) 26114, (short) -17795, (short) -5196, (short) -5193, (short) -5193, (short) -23123, (short) -20272, (short) -28511, (short) -5158, (short) -5209, (short) -5173, (short) -5144, (short) -5152, (short) -5152, (short) -5150, (short) -5131, (short) -5235};
    public File logFile;

    /* DevToolsApp WARNING: Missing block: B:6:0x002a, code:
            r21 = r7;
            r20 = r9;
            r17 = r11;
            r18 = r12;
            r19 = r14;
            r12 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x0042, code:
            if (s.۫۫ۗ.m790() == false) goto L_0x005c;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x004c, code:
            if (s.ۥۥۚ.m614() > 0) goto L_0x004e;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x004e, code:
            r21 = r7;
            r20 = r9;
            r17 = r11;
            r18 = r12;
            r19 = r14;
            r12 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x005c, code:
            r17 = "ۜۧ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x005e, code:
            r17 = s.ۢ۫ۗ.m350(r17);
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x006c, code:
            r21 = r7;
            r20 = r9;
            r17 = r11;
            r18 = r12;
            r19 = r14;
            r12 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:20:0x0082, code:
            if (s.ۚ۟ۢ.f5 == false) goto L_0x0084;
     */
    /* DevToolsApp WARNING: Missing block: B:21:0x0084, code:
            r21 = r7;
            r20 = r9;
            r17 = r11;
            r18 = r12;
            r19 = r14;
            r12 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:26:0x00a7, code:
            if (s.۬ۨۨ.f57 == false) goto L_0x00b5;
     */
    /* DevToolsApp WARNING: Missing block: B:28:0x00af, code:
            if (s.ۥۥۚ.f50 == 0) goto L_0x00b5;
     */
    /* DevToolsApp WARNING: Missing block: B:30:0x00b5, code:
            r17 = "ۗۗ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:31:0x00b7, code:
            r17 = s.ۜۘۡ.m282(r17);
     */
    /* DevToolsApp WARNING: Missing block: B:76:0x01c4, code:
            r11 = r17;
            r12 = r18;
            r14 = r19;
     */
    /* DevToolsApp WARNING: Missing block: B:78:0x01cd, code:
            r7 = "ۙ۬ۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:81:0x01e1, code:
            r7 = "ۙۡۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:90:0x0237, code:
            r7 = "ۨ۬۠";
     */
    /* DevToolsApp WARNING: Missing block: B:100:0x0291, code:
            r7 = "۫ۢۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:109:0x02f0, code:
            r7 = r21;
     */
    /* DevToolsApp WARNING: Missing block: B:112:0x0307, code:
            r7 = "ۥۧۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:114:0x0319, code:
            r17 = r9;
            r9 = r20;
     */
    /* DevToolsApp WARNING: Missing block: B:120:0x0355, code:
            r7 = "ۜۗۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:132:0x039d, code:
            r7 = "ۥۦ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:134:0x03a2, code:
            r7 = s.ۢ۫ۗ.m350(r7);
     */
    public void writeLog(java.lang.String r24) {
        /*
        r23 = this;
        r1 = r23;
        r0 = 0;
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
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = "۟ۨۧ";
        r17 = s.ۢ۫ۗ.m350(r17);
        r0 = r3;
        r2 = 0;
        r3 = 0;
    L_0x001c:
        switch(r17) {
            case 1737906: goto L_0x003b;
            case 1739101: goto L_0x00bd;
            case 1740045: goto L_0x01ae;
            case 1740727: goto L_0x02d0;
            case 1740992: goto L_0x01d1;
            case 1741293: goto L_0x0135;
            case 1741333: goto L_0x016b;
            case 1742068: goto L_0x01d2;
            case 1742249: goto L_0x00aa;
            case 1742710: goto L_0x0255;
            case 1742855: goto L_0x0228;
            case 1742992: goto L_0x0120;
            case 1743562: goto L_0x00a5;
            case 1744064: goto L_0x0063;
            case 1746513: goto L_0x0343;
            case 1746974: goto L_0x038b;
            case 1747393: goto L_0x02f3;
            case 1747670: goto L_0x0373;
            case 1748399: goto L_0x00f1;
            case 1748859: goto L_0x02ac;
            case 1749973: goto L_0x007d;
            case 1751639: goto L_0x027c;
            case 1752614: goto L_0x023b;
            case 1752670: goto L_0x0092;
            case 1752683: goto L_0x0218;
            case 1752708: goto L_0x0045;
            case 1752725: goto L_0x00be;
            case 1753624: goto L_0x035b;
            case 1755740: goto L_0x01e5;
            case 1758304: goto L_0x00b2;
            case 1759281: goto L_0x0023;
            case 1759574: goto L_0x031f;
            default: goto L_0x001f;
        };
    L_0x001f:
        s.ۖۜ۟.m492();
        return;
    L_0x0023:
        s.۫ۢ۠.m237();
        r17 = s.ۢ۫ۗ.f21;
        if (r17 != 0) goto L_0x0038;
    L_0x002a:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        goto L_0x0307;
    L_0x0038:
        r17 = "ۖۛۗ";
        goto L_0x005e;
    L_0x003b:
        s.ۥۥۚ.m614();
        r17 = s.۫۫ۗ.m790();
        if (r17 != 0) goto L_0x002a;
    L_0x0044:
        goto L_0x005c;
    L_0x0045:
        s.ۗۜۛ.m698();
        r17 = s.ۥۥۚ.m614();
        if (r17 <= 0) goto L_0x005c;
    L_0x004e:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        goto L_0x039d;
    L_0x005c:
        r17 = "ۜۧ۫";
    L_0x005e:
        r17 = s.ۢ۫ۗ.m350(r17);
        goto L_0x001c;
    L_0x0063:
        s.۟ۥۙ.m650();
        r17 = s.۫ۢ۠.m237();
        if (r17 < 0) goto L_0x007a;
    L_0x006c:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        goto L_0x0385;
    L_0x007a:
        r17 = "ۢ۬۟";
        goto L_0x00b7;
    L_0x007d:
        s.ۥۘۧ.m662();
        r17 = s.ۚ۟ۢ.f5;
        if (r17 != 0) goto L_0x004e;
    L_0x0084:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        goto L_0x0291;
    L_0x0092:
        r17 = s.ۨۘۢ.f19;
        if (r17 == 0) goto L_0x0097;
    L_0x0096:
        goto L_0x0084;
    L_0x0097:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        goto L_0x0355;
    L_0x00a5:
        r17 = s.۬ۨۨ.f57;
        if (r17 != 0) goto L_0x006c;
    L_0x00a9:
        goto L_0x00b5;
    L_0x00aa:
        s.۬۟ۜ.m366();
        r17 = s.ۥۥۚ.f50;
        if (r17 != 0) goto L_0x0084;
    L_0x00b1:
        goto L_0x00b5;
    L_0x00b2:
        s.ۗۤ۫.m195();
    L_0x00b5:
        r17 = "ۗۗ۟";
    L_0x00b7:
        r17 = s.ۜۘۡ.m282(r17);
        goto L_0x001c;
    L_0x00bd:
        return;
    L_0x00be:
        r17 = r11;
        r11 = f106;	 Catch:{ IOException -> 0x00e4 }
        r18 = r12;
        r12 = 61;
        r19 = r14;
        r14 = 6;
        r11 = s.ۤۗۛ.m376(r11, r12, r14, r4);	 Catch:{ IOException -> 0x00e2 }
        s.ۢ۟ۚ.m175(r11, r9);	 Catch:{ IOException -> 0x00e2 }
        r11 = "ۗۢۨ";
        r11 = s.ۜۘۡ.m282(r11);
        r12 = r18;
        r14 = r19;
        r22 = r17;
        r17 = r11;
        r11 = r22;
        goto L_0x001c;
    L_0x00e2:
        r0 = move-exception;
        goto L_0x00e9;
    L_0x00e4:
        r0 = move-exception;
        r18 = r12;
        r19 = r14;
    L_0x00e9:
        r12 = r24;
        r21 = r7;
        r20 = r9;
        goto L_0x0214;
    L_0x00f1:
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r11 = new java.io.FileWriter;	 Catch:{ IOException -> 0x011c }
        r12 = r1.logFile;	 Catch:{ IOException -> 0x011c }
        r14 = 1;
        r11.<init>(r12, r14);	 Catch:{ IOException -> 0x011c }
        r11.append(r9);	 Catch:{ IOException -> 0x011c }
        r12 = f106;	 Catch:{ IOException -> 0x011c }
        r14 = 67;
        r20 = r9;
        r9 = 1;
        r9 = s.ۗ۬ۦ.m414(r12, r14, r9, r4);	 Catch:{ IOException -> 0x0164 }
        r11.append(r9);	 Catch:{ IOException -> 0x0164 }
        r11.flush();	 Catch:{ IOException -> 0x0164 }
        r11.close();	 Catch:{ IOException -> 0x0164 }
        r12 = r24;
        r21 = r7;
        goto L_0x01e1;
    L_0x011c:
        r0 = move-exception;
        r20 = r9;
        goto L_0x0165;
    L_0x0120:
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        if (r10 != 0) goto L_0x012d;
    L_0x012a:
        r9 = "ۥۨۘ";
        goto L_0x012f;
    L_0x012d:
        r9 = "ۡۘۦ";
    L_0x012f:
        r9 = s.ۜۘۡ.m282(r9);
        goto L_0x01c4;
    L_0x0135:
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r9 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0164 }
        r9.<init>();	 Catch:{ IOException -> 0x0164 }
        r11 = 0;
        r12 = r24;
        r11 = s.ۗۜۛ.m691(r12, r11, r7);	 Catch:{ IOException -> 0x0162 }
        s.ۢ۫ۜ.m637(r9, r11);	 Catch:{ IOException -> 0x0162 }
        r11 = f106;	 Catch:{ IOException -> 0x0162 }
        r14 = 48;
        r21 = r7;
        r7 = 11;
        r7 = s.۬ۗ۫.m97(r11, r14, r7, r4);	 Catch:{ IOException -> 0x0213 }
        s.ۢ۫ۜ.m637(r9, r7);	 Catch:{ IOException -> 0x0213 }
        r7 = s.ۥۘۧ.m668(r9);	 Catch:{ IOException -> 0x0213 }
        r8 = r7;
        goto L_0x01cd;
    L_0x0162:
        r0 = move-exception;
        goto L_0x0167;
    L_0x0164:
        r0 = move-exception;
    L_0x0165:
        r12 = r24;
    L_0x0167:
        r21 = r7;
        goto L_0x0214;
    L_0x016b:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0213 }
        r7.<init>();	 Catch:{ IOException -> 0x0213 }
        r9 = f106;	 Catch:{ IOException -> 0x0213 }
        r11 = 47;
        r14 = 1;
        r9 = s.ۢ۟ۚ.m167(r9, r11, r14, r4);	 Catch:{ IOException -> 0x0213 }
        s.ۢ۫ۜ.m637(r7, r9);	 Catch:{ IOException -> 0x0213 }
        s.ۢ۫ۜ.m637(r7, r5);	 Catch:{ IOException -> 0x0213 }
        r9 = f106;	 Catch:{ IOException -> 0x0213 }
        r11 = 59;
        r14 = 2;
        r9 = s.ۢۜۘ.m241(r9, r11, r14, r4);	 Catch:{ IOException -> 0x0213 }
        s.ۢ۫ۜ.m637(r7, r9);	 Catch:{ IOException -> 0x0213 }
        s.ۢ۫ۜ.m637(r7, r8);	 Catch:{ IOException -> 0x0213 }
        r9 = s.ۦۡۤ.m398(r7);	 Catch:{ IOException -> 0x0213 }
        r10 = r1.logFile;	 Catch:{ IOException -> 0x0213 }
        r7 = "ۛۤۙ";
        r7 = s.ۜۘۡ.m282(r7);
        r11 = r17;
        r12 = r18;
        r14 = r19;
        goto L_0x03ae;
    L_0x01ae:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r6 <= r7) goto L_0x01cc;
    L_0x01be:
        r9 = "ۙ۫۟";
        r9 = s.ۢ۫ۗ.m350(r9);
    L_0x01c4:
        r11 = r17;
        r12 = r18;
        r14 = r19;
        goto L_0x0319;
    L_0x01cc:
        r8 = r12;
    L_0x01cd:
        r7 = "ۙ۬ۨ";
        goto L_0x03a2;
    L_0x01d1:
        return;
    L_0x01d2:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        s.ۜۖۚ.m4(r0);
    L_0x01e1:
        r7 = "ۙۡۨ";
        goto L_0x03a2;
    L_0x01e5:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = DATE_FORMAT;	 Catch:{ IOException -> 0x0213 }
        r9 = new java.util.Date;	 Catch:{ IOException -> 0x0213 }
        r9.<init>();	 Catch:{ IOException -> 0x0213 }
        r7 = r7.format(r9);	 Catch:{ IOException -> 0x0213 }
        r6 = s.ۡۢۡ.m62(r24);	 Catch:{ IOException -> 0x0213 }
        r5 = "ۘۢۗ";
        r5 = s.ۜۘۡ.m282(r5);
        r11 = r17;
        r12 = r18;
        r14 = r19;
        r9 = r20;
        r17 = r5;
        r5 = r7;
        goto L_0x03b0;
    L_0x0213:
        r0 = move-exception;
    L_0x0214:
        r7 = "ۚۥ۟";
        goto L_0x036e;
    L_0x0218:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r4 = 43548; // 0xaa1c float:6.1024E-41 double:2.15156E-319;
        goto L_0x0237;
    L_0x0228:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r4 = 60295; // 0xeb87 float:8.4491E-41 double:2.97897E-319;
    L_0x0237:
        r7 = "ۨ۬۠";
        goto L_0x03a2;
    L_0x023b:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = r3 + 1;
        r7 = r7 - r16;
        if (r7 <= 0) goto L_0x0251;
    L_0x024d:
        r7 = "ۥۦ۬";
        goto L_0x036e;
    L_0x0251:
        r7 = "ۛ۟۫";
        goto L_0x03a2;
    L_0x0255:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = r13 * r2;
        r9 = s.ۗۢۢ.f29;
        if (r9 < 0) goto L_0x0269;
    L_0x0267:
        goto L_0x0307;
    L_0x0269:
        r3 = "ۥۤۥ";
        r3 = s.ۜۘۡ.m282(r3);
        r11 = r17;
        r12 = r18;
        r14 = r19;
        r9 = r20;
        r17 = r3;
        r3 = r7;
        goto L_0x03b0;
    L_0x027c:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = r15 * r15;
        r9 = 2;
        r11 = s.ۚۡۢ.m112();
        if (r11 < 0) goto L_0x0295;
    L_0x0291:
        r7 = "۫ۢۗ";
        goto L_0x036e;
    L_0x0295:
        r2 = "ۛۛۖ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r16 = r7;
        r11 = r17;
        r12 = r18;
        r14 = r19;
        r9 = r20;
        r7 = r21;
        r17 = r2;
        r2 = 2;
        goto L_0x001c;
    L_0x02ac:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = r13 + r19;
        r9 = s.ۗۜۛ.f55;
        if (r9 == 0) goto L_0x02c2;
    L_0x02be:
        r7 = "۬ۢۧ";
        goto L_0x03a2;
    L_0x02c2:
        r9 = "ۤۤۗ";
        r9 = s.ۜۘۡ.m282(r9);
        r15 = r7;
        r11 = r17;
        r12 = r18;
        r14 = r19;
        goto L_0x02f0;
    L_0x02d0:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = r17[r18];
        r14 = 1;
        r9 = s.۬ۗ۫.f6;
        if (r9 < 0) goto L_0x02e5;
    L_0x02e3:
        goto L_0x0355;
    L_0x02e5:
        r9 = "ۡۧۡ";
        r9 = s.ۢ۫ۗ.m350(r9);
        r13 = r7;
        r11 = r17;
        r12 = r18;
    L_0x02f0:
        r7 = r21;
        goto L_0x0319;
    L_0x02f3:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = 46;
        r9 = s.۬۟ۜ.m366();
        if (r9 == 0) goto L_0x030b;
    L_0x0307:
        r7 = "ۥۧۦ";
        goto L_0x03a2;
    L_0x030b:
        r9 = "ۙۙۗ";
        r9 = s.ۢ۫ۗ.m350(r9);
        r11 = r17;
        r14 = r19;
        r7 = r21;
        r12 = 46;
    L_0x0319:
        r17 = r9;
        r9 = r20;
        goto L_0x001c;
    L_0x031f:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r11 = f106;
        r7 = s.ۗ۬ۦ.m407();
        if (r7 != 0) goto L_0x0335;
    L_0x0333:
        goto L_0x039d;
    L_0x0335:
        r7 = "۠ۗۘ";
        r17 = s.ۜۘۡ.m282(r7);
        r12 = r18;
        r14 = r19;
        r9 = r20;
        goto L_0x03b0;
    L_0x0343:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = s.۟ۥۙ.m650();
        if (r7 > 0) goto L_0x0358;
    L_0x0355:
        r7 = "ۜۗۥ";
        goto L_0x036e;
    L_0x0358:
        r7 = "۬۬ۖ";
        goto L_0x03a2;
    L_0x035b:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = s.ۜۖۚ.f0;
        if (r7 < 0) goto L_0x036c;
    L_0x036b:
        goto L_0x0385;
    L_0x036c:
        r7 = "۟ۙ۫";
    L_0x036e:
        r7 = s.ۜۘۡ.m282(r7);
        goto L_0x03a6;
    L_0x0373:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = s.۟ۥۙ.m650();
        if (r7 > 0) goto L_0x0388;
    L_0x0385:
        r7 = "ۚ۫ۚ";
        goto L_0x03a2;
    L_0x0388:
        r7 = "ۦۦۘ";
        goto L_0x03a2;
    L_0x038b:
        r21 = r7;
        r20 = r9;
        r17 = r11;
        r18 = r12;
        r19 = r14;
        r12 = r24;
        r7 = s.ۗ۬۟.m257();
        if (r7 > 0) goto L_0x03a0;
    L_0x039d:
        r7 = "ۥۦ۟";
        goto L_0x036e;
    L_0x03a0:
        r7 = "۠۠ۖ";
    L_0x03a2:
        r7 = s.ۢ۫ۗ.m350(r7);
    L_0x03a6:
        r11 = r17;
        r12 = r18;
        r14 = r19;
        r9 = r20;
    L_0x03ae:
        r17 = r7;
    L_0x03b0:
        r7 = r21;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Log.Logger.writeLog(java.lang.String):void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0013, code:
            if (s.ۛ۫ۧ.f49 != false) goto L_0x004c;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x0027, code:
            r0 = "ۗ۟ۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:22:0x004c, code:
            r0 = "ۡۦۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x0096, code:
            r0 = "ۜۘ۟";
     */
    public void writeLog(java.lang.String r2, java.lang.Object... r3) {
        /*
        r1 = this;
        r0 = "۬ۦۦ";
    L_0x0002:
        r0 = s.ۢ۫ۗ.m350(r0);
    L_0x0006:
        switch(r0) {
            case 1738992: goto L_0x002b;
            case 1741693: goto L_0x0011;
            case 1743587: goto L_0x0016;
            case 1746467: goto L_0x0052;
            case 1748420: goto L_0x006c;
            case 1748820: goto L_0x002f;
            case 1748829: goto L_0x0074;
            case 1753141: goto L_0x003e;
            case 1754570: goto L_0x0080;
            case 1754593: goto L_0x0036;
            case 1758070: goto L_0x005a;
            case 1758396: goto L_0x0062;
            case 1758445: goto L_0x001d;
            case 1758592: goto L_0x0048;
            case 1759404: goto L_0x0090;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = s.ۢۜۘ.m255();
        if (r0 > 0) goto L_0x008c;
    L_0x000f:
        goto L_0x0096;
    L_0x0011:
        r0 = s.ۛ۫ۧ.f49;
        if (r0 == 0) goto L_0x0096;
    L_0x0015:
        goto L_0x004c;
    L_0x0016:
        r0 = s.ۡۢۡ.m58();
        if (r0 != 0) goto L_0x0084;
    L_0x001c:
        goto L_0x0027;
    L_0x001d:
        s.۬ۗ۫.m98();
        r0 = s.ۨۧۜ.m755();
        if (r0 < 0) goto L_0x0027;
    L_0x0026:
        goto L_0x004c;
    L_0x0027:
        r0 = "ۗ۟ۘ";
        goto L_0x009c;
    L_0x002b:
        s.ۤۗۛ.m370();
        goto L_0x004c;
    L_0x002f:
        s.۠ۡۧ.m431();
        s.ۛ۫ۧ.m593();
        return;
    L_0x0036:
        r2 = s.ۦۡۤ.m397(r2, r3);
        r1.writeLog(r2);
        return;
    L_0x003e:
        r0 = s.ۘۡۜ.m682();
        if (r0 < 0) goto L_0x0045;
    L_0x0044:
        goto L_0x007a;
    L_0x0045:
        r0 = "ۧۦ۠";
        goto L_0x0002;
    L_0x0048:
        r0 = s.۠ۜۗ.f13;
        if (r0 == 0) goto L_0x004f;
    L_0x004c:
        r0 = "ۡۦۙ";
        goto L_0x0002;
    L_0x004f:
        r0 = "ۦۖۥ";
        goto L_0x009c;
    L_0x0052:
        r0 = s.ۢ۫ۜ.f51;
        if (r0 < 0) goto L_0x0057;
    L_0x0056:
        goto L_0x007a;
    L_0x0057:
        r0 = "۫۫۠";
        goto L_0x0002;
    L_0x005a:
        r0 = s.ۗۢۢ.f29;
        if (r0 < 0) goto L_0x005f;
    L_0x005e:
        goto L_0x007a;
    L_0x005f:
        r0 = "۟ۘۜ";
        goto L_0x0002;
    L_0x0062:
        r0 = s.ۛۨۦ.m559();
        if (r0 == 0) goto L_0x0069;
    L_0x0068:
        goto L_0x0084;
    L_0x0069:
        r0 = "۫ۚۥ";
        goto L_0x0002;
    L_0x006c:
        r0 = s.ۖۙۜ.f48;
        if (r0 != 0) goto L_0x0071;
    L_0x0070:
        goto L_0x007a;
    L_0x0071:
        r0 = "۫ۥۖ";
        goto L_0x0002;
    L_0x0074:
        r0 = s.ۛۨۦ.m559();
        if (r0 == 0) goto L_0x007d;
    L_0x007a:
        r0 = "ۚۙۜ";
        goto L_0x0002;
    L_0x007d:
        r0 = "ۡۙۜ";
        goto L_0x009c;
    L_0x0080:
        r0 = s.ۡۥۗ.f47;
        if (r0 == 0) goto L_0x0088;
    L_0x0084:
        r0 = "۫ۦۨ";
        goto L_0x0002;
    L_0x0088:
        r0 = "ۡۦۢ";
        goto L_0x0002;
    L_0x008c:
        r0 = "ۧۥۨ";
        goto L_0x0002;
    L_0x0090:
        r0 = s.ۖۙۜ.m589();
        if (r0 > 0) goto L_0x009a;
    L_0x0096:
        r0 = "ۜۘ۟";
        goto L_0x0002;
    L_0x009a:
        r0 = "ۚۘۘ";
    L_0x009c:
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Log.Logger.writeLog(java.lang.String, java.lang.Object[]):void");
    }

    /* DevToolsApp WARNING: Missing block: B:15:0x004b, code:
            r0 = "ۡ۟ۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x0054, code:
            r0 = "ۨ۠ۡ";
     */
    public Logger() {
        /*
        r4 = this;
        r0 = f106;
        r1 = 32;
        r0 = r0[r1];
        r1 = 48632; // 0xbdf8 float:6.8148E-41 double:2.40274E-319;
        r1 = r1 * r0;
        r0 = r0 + 12158;
        r0 = r0 * r0;
        r1 = r1 - r0;
        if (r1 > 0) goto L_0x0016;
    L_0x0012:
        r0 = 42095; // 0xa46f float:5.8988E-41 double:2.07977E-319;
        goto L_0x0019;
    L_0x0016:
        r0 = 57891; // 0xe223 float:8.1123E-41 double:2.8602E-319;
    L_0x0019:
        r1 = f106;
        r2 = 33;
        r3 = 6;
        r0 = s.۬ۨۨ.m722(r1, r2, r3, r0);
        r4.<init>(r0);
        r0 = "ۨۧۛ";
    L_0x0027:
        r0 = s.ۢ۫ۗ.m350(r0);
    L_0x002b:
        switch(r0) {
            case 1737884: goto L_0x003b;
            case 1748617: goto L_0x004e;
            case 1752831: goto L_0x0060;
            case 1755369: goto L_0x0057;
            case 1755580: goto L_0x0061;
            case 1758038: goto L_0x0046;
            default: goto L_0x002e;
        };
    L_0x002e:
        s.ۗۗۡ.m78();
        r0 = s.ۖۜ۟.m492();
        if (r0 == 0) goto L_0x0038;
    L_0x0037:
        goto L_0x004b;
    L_0x0038:
        r0 = "ۖۚ۠";
        goto L_0x0027;
    L_0x003b:
        s.ۡۘۗ.m32();
        r0 = s.ۘۡۜ.f54;
        if (r0 != 0) goto L_0x0043;
    L_0x0042:
        goto L_0x004b;
    L_0x0043:
        r0 = "۫ۙۤ";
        goto L_0x0027;
    L_0x0046:
        r0 = s.ۢ۫ۜ.f51;
        if (r0 >= 0) goto L_0x004b;
    L_0x004a:
        goto L_0x0054;
    L_0x004b:
        r0 = "ۡ۟ۧ";
        goto L_0x006c;
    L_0x004e:
        s.ۗ۠ۚ.m442();
        s.ۡۘۗ.m32();
    L_0x0054:
        r0 = "ۨ۠ۡ";
        goto L_0x0027;
    L_0x0057:
        s.ۗ۬۟.m257();
        r0 = new java.lang.RuntimeException;
        r0.<init>();
        throw r0;
    L_0x0060:
        return;
    L_0x0061:
        r0 = s.۟ۤۗ.m332();
        if (r0 > 0) goto L_0x006a;
    L_0x0067:
        r0 = "ۨ۠ۛ";
        goto L_0x0027;
    L_0x006a:
        r0 = "ۥ۫ۥ";
    L_0x006c:
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Log.Logger.<init>():void");
    }

    /* DevToolsApp WARNING: Missing block: B:24:0x006d, code:
            r4 = "۟۠ۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:37:0x0099, code:
            r4 = "۬۫ۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:46:0x00b0, code:
            r4 = s.ۢ۫ۗ.m350(r4);
     */
    public Logger(java.lang.String r9) {
        /*
        r8 = this;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = f106;
        r4 = 39;
        r3 = r3[r4];
        r4 = 39746; // 0x9b42 float:5.5696E-41 double:1.9637E-319;
        r4 = r4 * r3;
        r3 = r3 * r3;
        r5 = 394936129; // 0x178a3f41 float:8.934009E-25 double:1.951243736E-315;
        r3 = r3 + r5;
        r3 = r3 - r4;
        if (r3 >= 0) goto L_0x001b;
    L_0x0017:
        r3 = 54120; // 0xd368 float:7.5838E-41 double:2.6739E-319;
        goto L_0x001d;
    L_0x001b:
        r3 = 19865; // 0x4d99 float:2.7837E-41 double:9.8146E-320;
    L_0x001d:
        r8.<init>();
        r4 = "ۨۥۨ";
    L_0x0022:
        r4 = s.ۜۘۡ.m282(r4);
    L_0x0026:
        switch(r4) {
            case 1737926: goto L_0x00a7;
            case 1737958: goto L_0x0079;
            case 1740168: goto L_0x005b;
            case 1741104: goto L_0x004b;
            case 1746448: goto L_0x00b6;
            case 1746709: goto L_0x005f;
            case 1746839: goto L_0x0060;
            case 1747649: goto L_0x0043;
            case 1748358: goto L_0x0093;
            case 1748476: goto L_0x008b;
            case 1752342: goto L_0x003c;
            case 1754098: goto L_0x00c1;
            case 1755531: goto L_0x00cd;
            case 1758098: goto L_0x0031;
            case 1758128: goto L_0x009f;
            case 1759093: goto L_0x0081;
            case 1759546: goto L_0x004f;
            default: goto L_0x0029;
        };
    L_0x0029:
        r4 = 6;
        r5 = s.ۙۖۥ.f58;
        if (r5 == 0) goto L_0x0070;
    L_0x002e:
        r4 = "۫ۛۢ";
        goto L_0x0022;
    L_0x0031:
        s.ۛ۫ۧ.m593();
        r4 = s.ۡۥۗ.m568();
        if (r4 != 0) goto L_0x00c5;
    L_0x003a:
        goto L_0x00d5;
    L_0x003c:
        r4 = s.ۚۡۢ.m112();
        if (r4 < 0) goto L_0x00ab;
    L_0x0042:
        goto L_0x0099;
    L_0x0043:
        s.ۗۗۡ.m78();
        r4 = s.ۗ۬۟.f16;
        if (r4 == 0) goto L_0x00d5;
    L_0x004a:
        goto L_0x0099;
    L_0x004b:
        s.ۛ۫ۧ.m593();
        goto L_0x0099;
    L_0x004f:
        s.۟ۥۙ.m650();
        s.ۙۜۦ.m520();
        r9 = new java.lang.RuntimeException;
        r9.<init>();
        throw r9;
    L_0x005b:
        r4 = 0;
        r8.logFile = r4;
        goto L_0x006d;
    L_0x005f:
        return;
    L_0x0060:
        r4 = s.ۖۜ۟.m485(r0, r1, r2, r3);
        r4 = s.ۡۢۡ.m60(r9, r4);
        if (r4 == 0) goto L_0x006d;
    L_0x006a:
        r4 = "ۘۦۖ";
        goto L_0x0022;
    L_0x006d:
        r4 = "۟۠ۖ";
        goto L_0x0022;
    L_0x0070:
        r2 = "۟ۤۜ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r4 = r2;
        r2 = 6;
        goto L_0x0026;
    L_0x0079:
        r4 = s.ۜۖۚ.f0;
        if (r4 < 0) goto L_0x007e;
    L_0x007d:
        goto L_0x00d5;
    L_0x007e:
        r4 = "۫ۗ۠";
        goto L_0x0022;
    L_0x0081:
        r4 = s.ۡۗۗ.m159();
        if (r4 == 0) goto L_0x0088;
    L_0x0087:
        goto L_0x00ab;
    L_0x0088:
        r4 = "ۖۜ۬";
        goto L_0x00b0;
    L_0x008b:
        r4 = s.ۥۥۚ.f50;
        if (r4 == 0) goto L_0x0090;
    L_0x008f:
        goto L_0x00d5;
    L_0x0090:
        r4 = "۬ۜۥ";
        goto L_0x00b0;
    L_0x0093:
        r4 = s.ۡۘۗ.m32();
        if (r4 == 0) goto L_0x009c;
    L_0x0099:
        r4 = "۬۫ۙ";
        goto L_0x0022;
    L_0x009c:
        r4 = "ۡۛۖ";
        goto L_0x00b0;
    L_0x009f:
        r4 = s.۫ۢ۠.f14;
        if (r4 > 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x00c5;
    L_0x00a4:
        r4 = "ۡۗۜ";
        goto L_0x00b0;
    L_0x00a7:
        r4 = s.ۤۤۖ.f35;
        if (r4 == 0) goto L_0x00ae;
    L_0x00ab:
        r4 = "۠۟۠";
        goto L_0x00b0;
    L_0x00ae:
        r4 = "۫ۜۡ";
    L_0x00b0:
        r4 = s.ۢ۫ۗ.m350(r4);
        goto L_0x0026;
    L_0x00b6:
        r4 = s.ۜۘۡ.m280();
        if (r4 == 0) goto L_0x00bd;
    L_0x00bc:
        goto L_0x00c5;
    L_0x00bd:
        r4 = "ۖۛ۫";
        goto L_0x0022;
    L_0x00c1:
        r4 = s.ۘۡۜ.f54;
        if (r4 == 0) goto L_0x00c9;
    L_0x00c5:
        r4 = "ۥۛ۬";
        goto L_0x0022;
    L_0x00c9:
        r4 = "۟ۗۨ";
        goto L_0x0022;
    L_0x00cd:
        r4 = f106;
        r5 = 40;
        r6 = s.ۚ۟ۢ.f5;
        if (r6 != 0) goto L_0x00d8;
    L_0x00d5:
        r4 = "ۙۥۜ";
        goto L_0x00b0;
    L_0x00d8:
        r0 = "ۧۖۡ";
        r0 = s.ۜۘۡ.m282(r0);
        r1 = 40;
        r7 = r4;
        r4 = r0;
        r0 = r7;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Log.Logger.<init>(java.lang.String):void");
    }

    /* DevToolsApp WARNING: Missing block: B:9:0x0055, code:
            if (s.ۙۜۦ.f36 > 0) goto L_0x0083;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0058, code:
            r16 = r0;
            r17 = r8;
     */
    /* DevToolsApp WARNING: Missing block: B:16:0x0083, code:
            r16 = r0;
            r17 = r8;
     */
    /* DevToolsApp WARNING: Missing block: B:19:0x0093, code:
            r16 = r0;
            r17 = r8;
     */
    /* DevToolsApp WARNING: Missing block: B:30:0x00df, code:
            r0 = r19;
     */
    /* DevToolsApp WARNING: Missing block: B:34:0x00fc, code:
            r0 = r16;
     */
    /* DevToolsApp WARNING: Missing block: B:36:0x0106, code:
            if (s.۬ۗ۫.f6 < 0) goto L_0x017b;
     */
    /* DevToolsApp WARNING: Missing block: B:37:0x010a, code:
            r0 = "ۘۙۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x0126, code:
            if (s.ۗۤ۫.m195() >= 0) goto L_0x017b;
     */
    /* DevToolsApp WARNING: Missing block: B:44:0x0129, code:
            r0 = "ۥۦ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x0138, code:
            r0 = "ۛۚۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x0157, code:
            r0 = "ۤۥ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x0166, code:
            r14 = "ۘۗۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x0168, code:
            r0 = s.ۢ۫ۗ.m350(r14);
     */
    /* DevToolsApp WARNING: Missing block: B:58:0x0175, code:
            r0 = r16;
     */
    /* DevToolsApp WARNING: Missing block: B:59:0x0177, code:
            r8 = r17;
     */
    /* DevToolsApp WARNING: Missing block: B:60:0x017b, code:
            r0 = "ۢ۠ۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:61:0x017d, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:63:0x018d, code:
            r14 = r0;
     */
    static {
        /*
        r0 = 68;
        r0 = new short[r0];
        r0 = {8485, 13104, 13107, 13115, 13119, 13117, 13096, 13072, 13107, 13115, 13115, 13113, 13102, 13093, 13093, 13093, 13093, 13169, 13073, 13073, 13169, 13112, 13112, 13180, 13076, 13076, 13158, 13105, 13105, 13158, 13103, 13103, 5715, -23549, -23552, -23544, -23540, -23538, -23525, 7877, 19957, 19958, 19966, 19962, 19960, 19949, 4553, -5156, -5207, -5207, -5207, 26114, -17795, -5196, -5193, -5193, -23123, -20272, -28511, -5158, -5209, -5173, -5144, -5152, -5152, -5150, -5131, -5235};
        f106 = r0;
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
        r13 = 0;
        r14 = "ۖ۟۬";
        r14 = s.ۜۘۡ.m282(r14);
    L_0x001d:
        switch(r14) {
            case 1738051: goto L_0x015a;
            case 1739064: goto L_0x014f;
            case 1739718: goto L_0x0146;
            case 1739751: goto L_0x012c;
            case 1739765: goto L_0x011e;
            case 1741735: goto L_0x010e;
            case 1742697: goto L_0x0100;
            case 1742931: goto L_0x00e3;
            case 1743065: goto L_0x00ca;
            case 1746529: goto L_0x00a1;
            case 1747711: goto L_0x0089;
            case 1749595: goto L_0x007d;
            case 1751690: goto L_0x005e;
            case 1752671: goto L_0x0050;
            case 1753513: goto L_0x0036;
            case 1754605: goto L_0x002e;
            default: goto L_0x0020;
        };
    L_0x0020:
        r16 = r0;
        r17 = r8;
        r0 = r1[r2];
        r8 = s.ۨۧۚ.m718();
        if (r8 > 0) goto L_0x0182;
    L_0x002c:
        goto L_0x017b;
    L_0x002e:
        r7 = 14765; // 0x39ad float:2.069E-41 double:7.295E-320;
        r16 = r0;
        r17 = r8;
        goto L_0x0157;
    L_0x0036:
        r14 = s.۬ۨۨ.m722(r11, r12, r13, r7);
        r15 = s.ۜۘۡ.m280();
        if (r15 == 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0093;
    L_0x0041:
        r0 = "۟ۚۜ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r17 = r8;
        r19 = r14;
        r14 = r0;
        r0 = r19;
        goto L_0x0177;
    L_0x0050:
        s.ۗۜۛ.m698();
        r14 = s.ۙۜۦ.f36;
        if (r14 <= 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0083;
    L_0x0058:
        r16 = r0;
        r17 = r8;
        goto L_0x017b;
    L_0x005e:
        r14 = f106;
        r15 = s.ۙۜۦ.m520();
        if (r15 == 0) goto L_0x006c;
    L_0x0066:
        r16 = r0;
        r17 = r8;
        goto L_0x010a;
    L_0x006c:
        r8 = "۠ۡ۠";
        r8 = s.ۜۘۡ.m282(r8);
        r9 = 1;
        r10 = 6;
        r16 = r0;
        r19 = r14;
        r14 = r8;
        r8 = r19;
        goto L_0x00fc;
    L_0x007d:
        s.ۚ۟ۢ.m85();
        s.ۗۜ۟.m469();
    L_0x0083:
        r16 = r0;
        r17 = r8;
        goto L_0x0166;
    L_0x0089:
        r14 = s.۟ۤۗ.m330(r8, r9, r10, r7);
        LOGCAT = r14;
        r14 = s.ۗ۬۟.f16;
        if (r14 == 0) goto L_0x0099;
    L_0x0093:
        r16 = r0;
        r17 = r8;
        goto L_0x0138;
    L_0x0099:
        r14 = "ۛۢۚ";
        r16 = r0;
        r17 = r8;
        goto L_0x0168;
    L_0x00a1:
        TAG = r0;
        r14 = new java.text.SimpleDateFormat;
        r15 = java.util.Locale.getDefault();
        r16 = s.ۗ۠ۚ.f28;
        if (r16 == 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x0058;
    L_0x00ae:
        r16 = r0;
        r0 = f106;
        r17 = r8;
        r8 = 13;
        r18 = s.۬ۗ۫.m98();
        if (r18 == 0) goto L_0x00be;
    L_0x00bc:
        goto L_0x0129;
    L_0x00be:
        r1 = 19;
        r0 = s.ۡۗۗ.m157(r0, r8, r1, r7);
        r14.<init>(r0, r15);
        DATE_FORMAT = r14;
        return;
    L_0x00ca:
        r16 = r0;
        r17 = r8;
        r0 = r3 * 14760;
        r8 = s.ۛۨۦ.f46;
        if (r8 == 0) goto L_0x00d6;
    L_0x00d4:
        goto L_0x017b;
    L_0x00d6:
        r4 = "ۘۘۧ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r19 = r4;
        r4 = r0;
    L_0x00df:
        r0 = r19;
        goto L_0x018d;
    L_0x00e3:
        r16 = r0;
        r17 = r8;
        r0 = f106;
        r8 = s.ۜۖۚ.f0;
        if (r8 < 0) goto L_0x00ee;
    L_0x00ed:
        goto L_0x0138;
    L_0x00ee:
        r8 = "ۦۢۥ";
        r8 = s.ۢ۫ۗ.m350(r8);
        r11 = 7;
        r12 = 6;
        r11 = r0;
        r14 = r8;
        r8 = r17;
        r12 = 7;
        r13 = 6;
    L_0x00fc:
        r0 = r16;
        goto L_0x001d;
    L_0x0100:
        r16 = r0;
        r17 = r8;
        r0 = s.۬ۗ۫.f6;
        if (r0 >= 0) goto L_0x010a;
    L_0x0108:
        goto L_0x017b;
    L_0x010a:
        r0 = "ۘۙۖ";
        goto L_0x017d;
    L_0x010e:
        r16 = r0;
        r17 = r8;
        r0 = r5 + r6;
        r0 = r4 - r0;
        if (r0 <= 0) goto L_0x011b;
    L_0x0118:
        r14 = "ۧۦ۬";
        goto L_0x0168;
    L_0x011b:
        r14 = "ۗۡۢ";
        goto L_0x0168;
    L_0x011e:
        r16 = r0;
        r17 = r8;
        r0 = s.ۗۤ۫.m195();
        if (r0 < 0) goto L_0x0129;
    L_0x0128:
        goto L_0x017b;
    L_0x0129:
        r0 = "ۥۦ۠";
        goto L_0x017d;
    L_0x012c:
        r16 = r0;
        r17 = r8;
        r0 = r3 * r3;
        r8 = s.ۨۗۥ.m536();
        if (r8 == 0) goto L_0x013b;
    L_0x0138:
        r0 = "ۛۚۨ";
        goto L_0x017d;
    L_0x013b:
        r5 = "ۚۚۧ";
        r14 = s.ۢ۫ۗ.m350(r5);
        r6 = 54464400; // 0x33f0f90 float:5.614772E-37 double:2.6908989E-316;
        r5 = r0;
        goto L_0x0175;
    L_0x0146:
        s.ۜۖۚ.m7();
        r0 = new java.lang.RuntimeException;
        r0.<init>();
        throw r0;
    L_0x014f:
        r16 = r0;
        r17 = r8;
        r0 = 13148; // 0x335c float:1.8424E-41 double:6.496E-320;
        r7 = 13148; // 0x335c float:1.8424E-41 double:6.496E-320;
    L_0x0157:
        r0 = "ۤۥ۫";
        goto L_0x017d;
    L_0x015a:
        r16 = r0;
        r17 = r8;
        r0 = f106;
        r8 = s.ۗۜ۟.m469();
        if (r8 > 0) goto L_0x016d;
    L_0x0166:
        r14 = "ۘۗۥ";
    L_0x0168:
        r0 = s.ۢ۫ۗ.m350(r14);
        goto L_0x018d;
    L_0x016d:
        r1 = "ۗ۫ۘ";
        r14 = s.ۢ۫ۗ.m350(r1);
        r2 = 0;
        r1 = r0;
    L_0x0175:
        r0 = r16;
    L_0x0177:
        r8 = r17;
        goto L_0x001d;
    L_0x017b:
        r0 = "ۢ۠ۙ";
    L_0x017d:
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x018d;
    L_0x0182:
        r3 = "ۛۦۤ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r19 = r3;
        r3 = r0;
        goto L_0x00df;
    L_0x018d:
        r14 = r0;
        goto L_0x0175;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Log.Logger.<clinit>():void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x001c, code:
            if (s.ۚ۟ۢ.f5 != false) goto L_0x00bf;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0022, code:
            if (s.ۖۜ۟.f34 < 0) goto L_0x00bf;
     */
    /* DevToolsApp WARNING: Missing block: B:23:0x0060, code:
            r2 = "۠ۧۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x006e, code:
            r2 = "ۖۧۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x00b2, code:
            r2 = "ۙ۠ۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:59:0x00d0, code:
            r2 = s.ۜۘۡ.m282(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:62:0x00e0, code:
            r2 = "ۨ۠ۥ";
     */
    public Logger(java.io.File r6) {
        /*
        r5 = this;
        r0 = 0;
        r1 = 0;
        r2 = s.ۘۡۜ.m675(r6);
        r5.<init>(r2);
        r2 = "۫ۧۦ";
    L_0x000b:
        r2 = s.ۢ۫ۗ.m350(r2);
    L_0x000f:
        switch(r2) {
            case 1738289: goto L_0x0055;
            case 1739089: goto L_0x00b9;
            case 1740140: goto L_0x00a2;
            case 1740655: goto L_0x0090;
            case 1740960: goto L_0x002e;
            case 1740974: goto L_0x0026;
            case 1743891: goto L_0x001a;
            case 1746936: goto L_0x0099;
            case 1747470: goto L_0x007d;
            case 1747903: goto L_0x004a;
            case 1748621: goto L_0x004b;
            case 1748776: goto L_0x0064;
            case 1748972: goto L_0x00c5;
            case 1752507: goto L_0x0071;
            case 1752671: goto L_0x0040;
            case 1755373: goto L_0x0020;
            case 1755609: goto L_0x0087;
            case 1758474: goto L_0x00d6;
            case 1759360: goto L_0x003a;
            case 1759543: goto L_0x00ac;
            default: goto L_0x0012;
        };
    L_0x0012:
        r2 = s.ۦۢۜ.m16();
        if (r2 != 0) goto L_0x00bf;
    L_0x0018:
        goto L_0x00b2;
    L_0x001a:
        r2 = s.ۚ۟ۢ.f5;
        if (r2 == 0) goto L_0x00e0;
    L_0x001e:
        goto L_0x00bf;
    L_0x0020:
        r2 = s.ۖۜ۟.f34;
        if (r2 >= 0) goto L_0x00cb;
    L_0x0024:
        goto L_0x00bf;
    L_0x0026:
        s.ۢۜۘ.m255();
        s.۬ۗ۫.m98();
        goto L_0x00b2;
    L_0x002e:
        s.ۗۜ۟.m469();
        s.ۧۧۡ.m183();
        r6 = new java.lang.RuntimeException;
        r6.<init>();
        throw r6;
    L_0x003a:
        r6 = new java.lang.RuntimeException;
        r6.<init>(r1);
        throw r6;
    L_0x0040:
        r2 = r5.logFile;	 Catch:{ IOException -> 0x0046 }
        s.ۢ۫ۗ.m343(r2);	 Catch:{ IOException -> 0x0046 }
        goto L_0x0060;
    L_0x0046:
        r1 = move-exception;
        r2 = "۬ۥۙ";
        goto L_0x000b;
    L_0x004a:
        return;
    L_0x004b:
        r2 = r5.logFile;
        r2 = s.ۤۤۖ.m508(r2);
        s.ۗۗۡ.m68(r2);
        goto L_0x006e;
    L_0x0055:
        r2 = r5.logFile;
        r2 = s.ۛ۫ۧ.m594(r2);
        if (r2 != 0) goto L_0x0060;
    L_0x005d:
        r2 = "ۥۦ۠";
        goto L_0x000b;
    L_0x0060:
        r2 = "۠ۧۦ";
        goto L_0x00d0;
    L_0x0064:
        r2 = s.۠ۜۗ.m218(r0);
        if (r2 == 0) goto L_0x006e;
    L_0x006a:
        r2 = "ۡ۟۫";
        goto L_0x00d0;
    L_0x006e:
        r2 = "ۖۧۢ";
        goto L_0x000b;
    L_0x0071:
        r2 = s.ۨۧۜ.m755();
        if (r2 < 0) goto L_0x007a;
    L_0x0077:
        r2 = "ۜۢۙ";
        goto L_0x000b;
    L_0x007a:
        r2 = "ۡۤ۫";
        goto L_0x00d0;
    L_0x007d:
        r2 = s.ۦۡۤ.m396();
        if (r2 == 0) goto L_0x0084;
    L_0x0083:
        goto L_0x00cb;
    L_0x0084:
        r2 = "ۥۡۗ";
        goto L_0x00d0;
    L_0x0087:
        r2 = s.ۗۜۛ.f55;
        if (r2 == 0) goto L_0x008c;
    L_0x008b:
        goto L_0x00cb;
    L_0x008c:
        r2 = "۠ۙۧ";
        goto L_0x000b;
    L_0x0090:
        r2 = s.ۗۜۛ.f55;
        if (r2 == 0) goto L_0x0095;
    L_0x0094:
        goto L_0x00bf;
    L_0x0095:
        r2 = "ۨۨۙ";
        goto L_0x000b;
    L_0x0099:
        r2 = s.ۡۥۗ.f47;
        if (r2 == 0) goto L_0x009e;
    L_0x009d:
        goto L_0x00bf;
    L_0x009e:
        r2 = "ۙۖ۬";
        goto L_0x000b;
    L_0x00a2:
        r2 = s.ۗۜۛ.m698();
        if (r2 > 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00bf;
    L_0x00a9:
        r2 = "۟ۧ۠";
        goto L_0x00d0;
    L_0x00ac:
        r2 = s.ۗۤ۫.m195();
        if (r2 < 0) goto L_0x00b6;
    L_0x00b2:
        r2 = "ۙ۠ۧ";
        goto L_0x000b;
    L_0x00b6:
        r2 = "ۘۥۙ";
        goto L_0x00d0;
    L_0x00b9:
        r2 = s.ۗۗۡ.m78();
        if (r2 == 0) goto L_0x00c2;
    L_0x00bf:
        r2 = "ۙۡۖ";
        goto L_0x00d0;
    L_0x00c2:
        r2 = "۬۫ۖ";
        goto L_0x00d0;
    L_0x00c5:
        r2 = s.ۢ۫ۜ.m625();
        if (r2 < 0) goto L_0x00ce;
    L_0x00cb:
        r2 = "۟ۨۦ";
        goto L_0x00d0;
    L_0x00ce:
        r2 = "ۗۢۜ";
    L_0x00d0:
        r2 = s.ۜۘۡ.m282(r2);
        goto L_0x000f;
    L_0x00d6:
        r5.logFile = r6;
        r2 = s.ۤۤۖ.m508(r6);
        r3 = s.۫۫ۗ.f65;
        if (r3 == 0) goto L_0x00e3;
    L_0x00e0:
        r2 = "ۨ۠ۥ";
        goto L_0x00d0;
    L_0x00e3:
        r0 = "ۡ۫ۖ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Log.Logger.<init>(java.io.File):void");
    }
}
