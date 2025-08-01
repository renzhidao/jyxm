package com.junge.algorithmAidePro.SaveData;

import java.io.ByteArrayOutputStream;
import s.ۡۘۗ;
import s.ۡۢۡ;
import s.ۦۢۜ;
import s.ۨۘۢ;

public class LogOutputStream {
    private static final byte[] tooLongBytes;
    /* renamed from: ۜۦۡ */
    private static final short[] f113 = new short[]{(short) 9346, (short) -26479, (short) -26479, (short) -26479, (short) -26443, (short) -561, (short) -1071, (short) 6008, (short) 3520, (short) -26477, (short) -7384, (short) -2966, (short) -13802, (short) -1292, (short) -10630, (short) -10398, (short) -15385, (short) 2135, (short) -13639, (short) -561, (short) -1071, (short) -26479};
    private int available;
    private byte[] bytes;
    private int compressSize;
    private int maxSize;
    public ByteArrayOutputStream out;
    private int size;

    /* DevToolsApp WARNING: Missing block: B:6:0x002a, code:
            if (s.۟ۥۙ.m650() <= 0) goto L_0x0108;
     */
    /* DevToolsApp WARNING: Missing block: B:40:0x00cf, code:
            r11 = "ۧۡۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:42:0x00d6, code:
            if (s.۟ۥۙ.m650() > 0) goto L_0x00f6;
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x00d9, code:
            r11 = "ۗۚۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:50:0x00f6, code:
            r11 = "ۢۜۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x0108, code:
            r11 = "ۢۚۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x010d, code:
            r11 = s.ۢ۫ۗ.m350(r11);
     */
    static {
        /*
        r0 = 22;
        r0 = new short[r0];
        r0 = {9346, -26479, -26479, -26479, -26443, -561, -1071, 6008, 3520, -26477, -7384, -2966, -13802, -1292, -10630, -10398, -15385, 2135, -13639, -561, -1071, -26479};
        f113 = r0;
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
        r11 = "۠ۖۘ";
    L_0x0016:
        r11 = s.ۜۘۡ.m282(r11);
    L_0x001a:
        switch(r11) {
            case 1738418: goto L_0x00fd;
            case 1738835: goto L_0x00f2;
            case 1739221: goto L_0x00dc;
            case 1741151: goto L_0x00d2;
            case 1743832: goto L_0x00cc;
            case 1747362: goto L_0x00b9;
            case 1748400: goto L_0x00b0;
            case 1749285: goto L_0x00a2;
            case 1749410: goto L_0x0099;
            case 1749469: goto L_0x0094;
            case 1749819: goto L_0x0088;
            case 1751244: goto L_0x0085;
            case 1754431: goto L_0x0070;
            case 1755081: goto L_0x005b;
            case 1755240: goto L_0x004f;
            case 1755400: goto L_0x0040;
            case 1755522: goto L_0x002e;
            case 1758503: goto L_0x0023;
            default: goto L_0x001d;
        };
    L_0x001d:
        r11 = s.ۥۥۚ.f50;
        if (r11 == 0) goto L_0x010b;
    L_0x0021:
        goto L_0x0108;
    L_0x0023:
        s.ۧۧۡ.m183();
        r11 = s.۟ۥۙ.m650();
        if (r11 > 0) goto L_0x00f6;
    L_0x002c:
        goto L_0x0108;
    L_0x002e:
        r11 = r3[r4];
        r12 = s.ۤۗۛ.f24;
        if (r12 == 0) goto L_0x0036;
    L_0x0034:
        goto L_0x00e4;
    L_0x0036:
        r5 = "ۗۦۤ";
        r5 = s.ۢ۫ۗ.m350(r5);
        r14 = r11;
        r11 = r5;
        r5 = r14;
        goto L_0x001a;
    L_0x0040:
        r11 = s.ۖۙۜ.f48;
        if (r11 != 0) goto L_0x0046;
    L_0x0044:
        goto L_0x00d9;
    L_0x0046:
        r2 = "ۖ۫ۧ";
        r11 = s.ۢ۫ۗ.m350(r2);
        r2 = 21;
        goto L_0x001a;
    L_0x004f:
        r11 = s.ۨۧۚ.m718();
        if (r11 > 0) goto L_0x0057;
    L_0x0055:
        goto L_0x00e4;
    L_0x0057:
        r11 = "ۨۥ۟";
        goto L_0x010d;
    L_0x005b:
        r11 = r6 * r6;
        r12 = s.ۢ۫ۗ.f21;
        if (r12 == 0) goto L_0x0063;
    L_0x0061:
        goto L_0x00f6;
    L_0x0063:
        r7 = "ۢۧ۠";
        r7 = s.ۜۘۡ.m282(r7);
        r8 = 47360; // 0xb900 float:6.6365E-41 double:2.3399E-319;
        r14 = r11;
        r11 = r7;
        r7 = r14;
        goto L_0x001a;
    L_0x0070:
        r11 = java.nio.charset.StandardCharsets.UTF_8;
        r12 = f113;
        r13 = s.ۡۗۗ.f9;
        if (r13 != 0) goto L_0x007a;
    L_0x0078:
        goto L_0x00f9;
    L_0x007a:
        r1 = "ۢۖۙ";
        r1 = s.ۜۘۡ.m282(r1);
        r10 = r12;
        r14 = r11;
        r11 = r1;
        r1 = r14;
        goto L_0x001a;
    L_0x0085:
        r9 = 14090; // 0x370a float:1.9744E-41 double:6.9614E-320;
        goto L_0x00cf;
    L_0x0088:
        r11 = r5 * r8;
        r11 = r11 - r7;
        if (r11 <= 0) goto L_0x0091;
    L_0x008d:
        r11 = "ۤۗ۟";
        goto L_0x010d;
    L_0x0091:
        r11 = "ۜ۠ۜ";
        goto L_0x0016;
    L_0x0094:
        s.ۢ۫ۜ.m625();
        goto L_0x0108;
    L_0x0099:
        s.۟ۥۙ.m650();
        r0 = new java.lang.RuntimeException;
        r0.<init>();
        throw r0;
    L_0x00a2:
        r11 = s.ۗۜۛ.f55;
        if (r11 == 0) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00d9;
    L_0x00a7:
        r0 = "ۨۡۡ";
        r11 = s.ۢ۫ۗ.m350(r0);
        r0 = 1;
        goto L_0x001a;
    L_0x00b0:
        r11 = s.ۛ۫ۧ.f49;
        if (r11 != 0) goto L_0x00b5;
    L_0x00b4:
        goto L_0x00f6;
    L_0x00b5:
        r11 = "۫ۙۙ";
        goto L_0x0016;
    L_0x00b9:
        r11 = f113;
        r12 = s.ۗۗۡ.f4;
        if (r12 != 0) goto L_0x00c0;
    L_0x00bf:
        goto L_0x00f9;
    L_0x00c0:
        r3 = "ۡۘۧ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r4 = 0;
        r14 = r11;
        r11 = r3;
        r3 = r14;
        goto L_0x001a;
    L_0x00cc:
        r9 = 39103; // 0x98bf float:5.4795E-41 double:1.93194E-319;
    L_0x00cf:
        r11 = "ۧۡۙ";
        goto L_0x010d;
    L_0x00d2:
        r11 = s.۟ۥۙ.m650();
        if (r11 <= 0) goto L_0x00d9;
    L_0x00d8:
        goto L_0x00f6;
    L_0x00d9:
        r11 = "ۗۚۖ";
        goto L_0x010d;
    L_0x00dc:
        r11 = r5 + 11840;
        r12 = s.۟ۧۢ.m774();
        if (r12 == 0) goto L_0x00e7;
    L_0x00e4:
        r11 = "ۙۦ۬";
        goto L_0x010d;
    L_0x00e7:
        r6 = "ۨۗۘ";
        r6 = s.ۜۘۡ.m282(r6);
        r14 = r11;
        r11 = r6;
        r6 = r14;
        goto L_0x001a;
    L_0x00f2:
        r11 = s.ۡۘۗ.f2;
        if (r11 != 0) goto L_0x00f9;
    L_0x00f6:
        r11 = "ۢۜۗ";
        goto L_0x010d;
    L_0x00f9:
        r11 = "۫ۨۤ";
        goto L_0x0016;
    L_0x00fd:
        r0 = s.ۦۢۜ.m28(r10, r0, r2, r9);
        r0 = s.ۥۥۚ.m612(r0, r1);
        tooLongBytes = r0;
        return;
    L_0x0108:
        r11 = "ۢۚۚ";
        goto L_0x010d;
    L_0x010b:
        r11 = "ۨۜۜ";
    L_0x010d:
        r11 = s.ۢ۫ۗ.m350(r11);
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.SaveData.LogOutputStream.<clinit>():void");
    }

    /* DevToolsApp WARNING: Missing block: B:41:0x00a8, code:
            r2 = "۟ۤ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:42:0x00aa, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    public LogOutputStream() {
        /*
        r5 = this;
        r0 = 0;
        r1 = 0;
        r5.<init>();
        r2 = "ۧۥۤ";
    L_0x0007:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x000b:
        switch(r2) {
            case 1739157: goto L_0x0057;
            case 1740674: goto L_0x00a4;
            case 1741605: goto L_0x002c;
            case 1742031: goto L_0x0062;
            case 1742865: goto L_0x0014;
            case 1746842: goto L_0x0034;
            case 1747371: goto L_0x006e;
            case 1747405: goto L_0x0096;
            case 1751400: goto L_0x008d;
            case 1753197: goto L_0x0021;
            case 1754566: goto L_0x00b4;
            case 1755333: goto L_0x0081;
            case 1758010: goto L_0x0040;
            default: goto L_0x000e;
        };
    L_0x000e:
        r2 = s.ۤۗۛ.f24;
        if (r2 == 0) goto L_0x0085;
    L_0x0012:
        goto L_0x00a8;
    L_0x0014:
        s.ۖۜ۟.m492();
        r2 = s.ۙۜۦ.f36;
        if (r2 > 0) goto L_0x001d;
    L_0x001b:
        goto L_0x0085;
    L_0x001d:
        r2 = "ۦۘ۟";
        goto L_0x00aa;
    L_0x0021:
        s.ۨۘۢ.m318();
        r2 = s.ۤۤۖ.m506();
        if (r2 == 0) goto L_0x009c;
    L_0x002a:
        goto L_0x00a8;
    L_0x002c:
        s.ۥۘۧ.m662();
        s.ۢۜۘ.m255();
        goto L_0x00a8;
    L_0x0034:
        s.ۗ۠ۚ.m442();
        s.ۗۢۢ.m454();
        r0 = new java.lang.RuntimeException;
        r0.<init>();
        throw r0;
    L_0x0040:
        r5.available = r0;
        r2 = new java.io.ByteArrayOutputStream;
        r3 = s.ۗ۠ۚ.f28;
        if (r3 == 0) goto L_0x004a;
    L_0x0048:
        goto L_0x00a8;
    L_0x004a:
        r3 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r4 = s.ۢ۫ۗ.f21;
        if (r4 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0085;
    L_0x0051:
        r2.<init>(r3);
        r5.out = r2;
        return;
    L_0x0057:
        r2 = 0;
        r5.size = r2;
        r2 = s.ۗۤ۫.f12;
        if (r2 == 0) goto L_0x005f;
    L_0x005e:
        goto L_0x00be;
    L_0x005f:
        r2 = "۫ۘۧ";
        goto L_0x0007;
    L_0x0062:
        r5.compressSize = r1;
        r2 = s.ۚ۟ۢ.m85();
        if (r2 == 0) goto L_0x006b;
    L_0x006a:
        goto L_0x0085;
    L_0x006b:
        r2 = "ۗۤۢ";
        goto L_0x0007;
    L_0x006e:
        r2 = 5120; // 0x1400 float:7.175E-42 double:2.5296E-320;
        r3 = s.ۛۨۦ.m559();
        if (r3 == 0) goto L_0x0077;
    L_0x0076:
        goto L_0x0085;
    L_0x0077:
        r1 = "ۚۤۙ";
        r1 = s.ۜۘۡ.m282(r1);
        r2 = r1;
        r1 = 5120; // 0x1400 float:7.175E-42 double:2.5296E-320;
        goto L_0x000b;
    L_0x0081:
        r2 = s.۫۫ۗ.f65;
        if (r2 == 0) goto L_0x0089;
    L_0x0085:
        r2 = "ۚۖۡ";
        goto L_0x0007;
    L_0x0089:
        r2 = "۠ۖۡ";
        goto L_0x0007;
    L_0x008d:
        r2 = s.ۨۘۢ.f19;
        if (r2 == 0) goto L_0x0092;
    L_0x0091:
        goto L_0x00be;
    L_0x0092:
        r2 = "ۨ۟ۜ";
        goto L_0x0007;
    L_0x0096:
        r2 = s.ۥۘۧ.m662();
        if (r2 > 0) goto L_0x00a0;
    L_0x009c:
        r2 = "۬ۢ۫";
        goto L_0x0007;
    L_0x00a0:
        r2 = "ۤۜ۠";
        goto L_0x0007;
    L_0x00a4:
        r2 = s.۠ۜۗ.f13;
        if (r2 == 0) goto L_0x00b0;
    L_0x00a8:
        r2 = "۟ۤ۟";
    L_0x00aa:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x000b;
    L_0x00b0:
        r2 = "۠ۗۤ";
        goto L_0x0007;
    L_0x00b4:
        r2 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r5.maxSize = r2;
        r3 = s.۠ۡۧ.m431();
        if (r3 != 0) goto L_0x00c2;
    L_0x00be:
        r2 = "ۛ۠ۖ";
        goto L_0x0007;
    L_0x00c2:
        r0 = "ۙۗ۠";
        r0 = s.ۢ۫ۗ.m350(r0);
        r2 = r0;
        r0 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.SaveData.LogOutputStream.<init>():void");
    }

    /* DevToolsApp WARNING: Missing block: B:7:0x001b, code:
            if (s.ۢ۟ۚ.m168() > 0) goto L_0x007b;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x001f, code:
            r2 = "ۜۤۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:16:0x0038, code:
            r2 = "ۜۥۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x0093, code:
            r2 = s.ۜۘۡ.m282(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x00ab, code:
            r2 = "ۘۗۙ";
     */
    public boolean isCompress() {
        /*
        r5 = this;
        r0 = 0;
        r1 = 0;
        r2 = "۠ۚۗ";
    L_0x0004:
        r2 = s.ۢ۫ۗ.m350(r2);
    L_0x0008:
        switch(r2) {
            case 1737799: goto L_0x0077;
            case 1739706: goto L_0x000d;
            case 1740022: goto L_0x0099;
            case 1740664: goto L_0x0031;
            case 1741145: goto L_0x0081;
            case 1743238: goto L_0x003c;
            case 1743961: goto L_0x0023;
            case 1743986: goto L_0x0036;
            case 1746606: goto L_0x0037;
            case 1747485: goto L_0x00a5;
            case 1749762: goto L_0x0063;
            case 1749933: goto L_0x0059;
            case 1753820: goto L_0x0046;
            case 1755141: goto L_0x002a;
            case 1755405: goto L_0x006b;
            case 1755620: goto L_0x008c;
            case 1759173: goto L_0x0051;
            case 1759460: goto L_0x0014;
            default: goto L_0x000b;
        };
    L_0x000b:
        r1 = 0;
        goto L_0x0038;
    L_0x000d:
        r2 = s.ۜۖۚ.m7();
        if (r2 >= 0) goto L_0x0071;
    L_0x0013:
        goto L_0x001f;
    L_0x0014:
        s.ۗۤ۫.m195();
        r2 = s.ۢ۟ۚ.m168();
        if (r2 <= 0) goto L_0x001f;
    L_0x001d:
        goto L_0x007b;
    L_0x001f:
        r2 = "ۜۤۡ";
        goto L_0x0093;
    L_0x0023:
        r2 = s.ۚ۟ۢ.m85();
        if (r2 != 0) goto L_0x009d;
    L_0x0029:
        goto L_0x007b;
    L_0x002a:
        s.ۥۘۧ.m662();
        s.ۗۗۡ.m78();
        goto L_0x007b;
    L_0x0031:
        s.۬ۨۨ.m730();
        r0 = 0;
        return r0;
    L_0x0036:
        return r1;
    L_0x0037:
        r1 = 1;
    L_0x0038:
        r2 = "ۜۥۛ";
        goto L_0x0093;
    L_0x003c:
        r2 = r5.compressSize;
        if (r0 < r2) goto L_0x0043;
    L_0x0040:
        r2 = "۟ۜ۫";
        goto L_0x0093;
    L_0x0043:
        r2 = "ۧۨۛ";
        goto L_0x0093;
    L_0x0046:
        r2 = s.ۙۜۦ.m520();
        if (r2 == 0) goto L_0x004e;
    L_0x004c:
        goto L_0x00ab;
    L_0x004e:
        r2 = "ۛ۬ۗ";
        goto L_0x0093;
    L_0x0051:
        r2 = s.ۦۡۤ.f25;
        if (r2 == 0) goto L_0x0056;
    L_0x0055:
        goto L_0x007b;
    L_0x0056:
        r2 = "ۦ۬ۢ";
        goto L_0x0004;
    L_0x0059:
        r2 = s.ۗۢۢ.m454();
        if (r2 < 0) goto L_0x0060;
    L_0x005f:
        goto L_0x009d;
    L_0x0060:
        r2 = "۬۟ۘ";
        goto L_0x0093;
    L_0x0063:
        r2 = s.ۗ۠ۚ.f28;
        if (r2 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0071;
    L_0x0068:
        r2 = "ۢ۫ۖ";
        goto L_0x0004;
    L_0x006b:
        r2 = s.ۖۜ۟.m492();
        if (r2 == 0) goto L_0x0074;
    L_0x0071:
        r2 = "۬ۨ۠";
        goto L_0x0004;
    L_0x0074:
        r2 = "ۢۥۥ";
        goto L_0x0093;
    L_0x0077:
        r2 = s.ۖۙۜ.f48;
        if (r2 != 0) goto L_0x007e;
    L_0x007b:
        r2 = "ۙۗۖ";
        goto L_0x0093;
    L_0x007e:
        r2 = "ۨۡۦ";
        goto L_0x0093;
    L_0x0081:
        r2 = s.ۗۗۡ.m78();
        if (r2 == 0) goto L_0x0088;
    L_0x0087:
        goto L_0x009d;
    L_0x0088:
        r2 = "ۖۗۨ";
        goto L_0x0004;
    L_0x008c:
        r2 = s.ۢ۟ۚ.f10;
        if (r2 == 0) goto L_0x0091;
    L_0x0090:
        goto L_0x00ab;
    L_0x0091:
        r2 = "ۙۦۦ";
    L_0x0093:
        r2 = s.ۜۘۡ.m282(r2);
        goto L_0x0008;
    L_0x0099:
        r2 = s.ۗ۠ۚ.f28;
        if (r2 == 0) goto L_0x00a1;
    L_0x009d:
        r2 = "ۨۙۖ";
        goto L_0x0004;
    L_0x00a1:
        r2 = "ۨۨۤ";
        goto L_0x0004;
    L_0x00a5:
        r2 = r5.size;
        r3 = s.ۗۢۢ.f29;
        if (r3 < 0) goto L_0x00ae;
    L_0x00ab:
        r2 = "ۘۗۙ";
        goto L_0x0093;
    L_0x00ae:
        r0 = "ۘۡ۟";
        r0 = s.ۢ۫ۗ.m350(r0);
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.SaveData.LogOutputStream.isCompress():boolean");
    }

    /* DevToolsApp WARNING: Missing block: B:8:0x0020, code:
            if (s.۠ۜۗ.m214() <= 0) goto L_0x009b;
     */
    /* DevToolsApp WARNING: Missing block: B:15:0x0035, code:
            r2 = "ۙۗ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:34:0x006e, code:
            r2 = "ۧۗۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x008e, code:
            r2 = "ۥۗۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:51:0x00a0, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x00ac, code:
            r2 = "ۥۚۙ";
     */
    public boolean isTooLong() {
        /*
        r5 = this;
        r0 = 0;
        r1 = 0;
        r2 = "ۜ۟ۦ";
    L_0x0004:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x0008:
        switch(r2) {
            case 1739221: goto L_0x0088;
            case 1739844: goto L_0x0029;
            case 1740673: goto L_0x0031;
            case 1740686: goto L_0x0080;
            case 1742030: goto L_0x0095;
            case 1743811: goto L_0x00a6;
            case 1743967: goto L_0x0060;
            case 1744078: goto L_0x0056;
            case 1746927: goto L_0x0039;
            case 1747749: goto L_0x0016;
            case 1751578: goto L_0x004e;
            case 1751588: goto L_0x0068;
            case 1752292: goto L_0x0024;
            case 1753229: goto L_0x0032;
            case 1754129: goto L_0x0034;
            case 1754134: goto L_0x001c;
            case 1755360: goto L_0x0074;
            case 1758439: goto L_0x0044;
            default: goto L_0x000b;
        };
    L_0x000b:
        s.ۗۜۛ.m698();
        r2 = s.ۜۖۚ.m7();
        if (r2 >= 0) goto L_0x006e;
    L_0x0014:
        goto L_0x00ac;
    L_0x0016:
        r2 = s.ۚۡۢ.f7;
        if (r2 == 0) goto L_0x008e;
    L_0x001a:
        goto L_0x00ac;
    L_0x001c:
        r2 = s.۠ۜۗ.m214();
        if (r2 > 0) goto L_0x00ac;
    L_0x0022:
        goto L_0x009b;
    L_0x0024:
        s.۠ۜۗ.m214();
        goto L_0x009b;
    L_0x0029:
        s.ۜۖۚ.m7();
        s.ۚۤۙ.m296();
        r0 = 0;
        return r0;
    L_0x0031:
        return r1;
    L_0x0032:
        r1 = 1;
        goto L_0x0035;
    L_0x0034:
        r1 = 0;
    L_0x0035:
        r2 = "ۙۗ۟";
        goto L_0x00a0;
    L_0x0039:
        r2 = r5.maxSize;
        if (r0 < r2) goto L_0x0040;
    L_0x003d:
        r2 = "ۦۙ۠";
        goto L_0x0004;
    L_0x0040:
        r2 = "ۧۗۡ";
        goto L_0x00a0;
    L_0x0044:
        r2 = s.۫ۢ۠.m237();
        if (r2 < 0) goto L_0x004b;
    L_0x004a:
        goto L_0x007a;
    L_0x004b:
        r2 = "۟ۧۗ";
        goto L_0x0004;
    L_0x004e:
        r2 = s.۫۫ۗ.f65;
        if (r2 == 0) goto L_0x0053;
    L_0x0052:
        goto L_0x007a;
    L_0x0053:
        r2 = "۫ۦۢ";
        goto L_0x0004;
    L_0x0056:
        r2 = s.ۤۤۖ.m506();
        if (r2 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x009b;
    L_0x005d:
        r2 = "ۤۢۘ";
        goto L_0x00a0;
    L_0x0060:
        r2 = s.ۗۢۢ.f29;
        if (r2 < 0) goto L_0x0065;
    L_0x0064:
        goto L_0x006e;
    L_0x0065:
        r2 = "ۜۨۚ";
        goto L_0x00a0;
    L_0x0068:
        r2 = s.ۤۤۖ.m506();
        if (r2 == 0) goto L_0x0071;
    L_0x006e:
        r2 = "ۧۗۦ";
        goto L_0x0004;
    L_0x0071:
        r2 = "ۜۤۧ";
        goto L_0x0004;
    L_0x0074:
        r2 = s.۠ۡۧ.m431();
        if (r2 != 0) goto L_0x007d;
    L_0x007a:
        r2 = "۠ۢۧ";
        goto L_0x0004;
    L_0x007d:
        r2 = "ۤۢۢ";
        goto L_0x00a0;
    L_0x0080:
        r2 = s.ۖۜ۟.f34;
        if (r2 < 0) goto L_0x0085;
    L_0x0084:
        goto L_0x009b;
    L_0x0085:
        r2 = "ۨ۠ۘ";
        goto L_0x00a0;
    L_0x0088:
        r2 = s.ۨۗۥ.m536();
        if (r2 == 0) goto L_0x0092;
    L_0x008e:
        r2 = "ۥۗۢ";
        goto L_0x0004;
    L_0x0092:
        r2 = "ۙۗ۬";
        goto L_0x00a0;
    L_0x0095:
        r2 = s.ۨۧۚ.m718();
        if (r2 > 0) goto L_0x009e;
    L_0x009b:
        r2 = "ۘۛۧ";
        goto L_0x00a0;
    L_0x009e:
        r2 = "ۗۦۤ";
    L_0x00a0:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x0008;
    L_0x00a6:
        r2 = r5.size;
        r3 = s.ۚۤۙ.f18;
        if (r3 > 0) goto L_0x00af;
    L_0x00ac:
        r2 = "ۥۚۙ";
        goto L_0x00a0;
    L_0x00af:
        r0 = "ۚۤۘ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.SaveData.LogOutputStream.isTooLong():boolean");
    }

    public void setCompressSize(int i) {
        this.compressSize = i;
    }

    public void setMaxSize(int i) {
        this.maxSize = i;
        this.available = i;
    }

    public synchronized byte[] toByteArray() {
        ByteArrayOutputStream byteArrayOutputStream = this.out;
        if (byteArrayOutputStream == null) {
            return this.bytes;
        }
        this.bytes = ۨۘۢ.m311(byteArrayOutputStream);
        if (ۡۢۡ.m53(this)) {
            this.bytes = ۡۘۗ.m43(ۦۢۜ.m30(this.out));
            this.out = null;
        }
        return this.bytes;
    }

    /* DevToolsApp WARNING: Missing block: B:12:0x003d, code:
            return;
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x003f, code:
            return;
     */
    public synchronized void write(@androidx.annotation.NonNull byte[] r3, int r4, int r5) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.size;	 Catch:{ all -> 0x0040 }
        r1 = r2.maxSize;	 Catch:{ all -> 0x0040 }
        if (r0 >= r1) goto L_0x003e;
    L_0x0007:
        r0 = r2.available;	 Catch:{ all -> 0x0040 }
        if (r0 > 0) goto L_0x000c;
    L_0x000b:
        goto L_0x003e;
    L_0x000c:
        if (r5 <= r0) goto L_0x000f;
    L_0x000e:
        r5 = r0;
    L_0x000f:
        r0 = r2.out;	 Catch:{ all -> 0x0040 }
        s.ۧۧۡ.m181(r0, r3, r4, r5);	 Catch:{ all -> 0x0040 }
        r3 = r2.out;	 Catch:{ all -> 0x0040 }
        r3 = r3.size();	 Catch:{ all -> 0x0040 }
        r2.size = r3;	 Catch:{ all -> 0x0040 }
        r4 = r2.maxSize;	 Catch:{ all -> 0x0040 }
        r5 = r4 - r3;
        r2.available = r5;	 Catch:{ all -> 0x0040 }
        if (r3 < r4) goto L_0x003c;
    L_0x0024:
        r3 = r2.out;	 Catch:{ all -> 0x0040 }
        r4 = tooLongBytes;	 Catch:{ all -> 0x0040 }
        r5 = 0;
        r0 = r4.length;	 Catch:{ all -> 0x0040 }
        s.ۧۧۡ.m181(r3, r4, r5, r0);	 Catch:{ all -> 0x0040 }
        r3 = r2.out;	 Catch:{ all -> 0x0040 }
        r3 = s.ۦۢۜ.m30(r3);	 Catch:{ all -> 0x0040 }
        r3 = s.ۡۢۡ.m52(r3);	 Catch:{ all -> 0x0040 }
        r2.bytes = r3;	 Catch:{ all -> 0x0040 }
        r3 = 0;
        r2.out = r3;	 Catch:{ all -> 0x0040 }
    L_0x003c:
        monitor-exit(r2);
        return;
    L_0x003e:
        monitor-exit(r2);
        return;
    L_0x0040:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.SaveData.LogOutputStream.write(byte[], int, int):void");
    }
}
