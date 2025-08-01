package com.junge.algorithmAidePro.Config;

import com.junge.algorithmAidePro.jungeRPC.AlgorithmClient;

public class XpConfig {
    public static final String GLOBAL_CONFIG_NAME;
    private static final String TAG;
    private static AlgorithmClient algorithmClient;
    private static AlgorithmClient globalAlgorithmClient;
    /* renamed from: ۫۫ۚ */
    private static final short[] f78 = new short[]{(short) 6041, (short) 7062, (short) 7066, (short) 7064, (short) 7131, (short) 7071, (short) 7040, (short) 7067, (short) 7058, (short) 7056, (short) 7131, (short) 7060, (short) 7065, (short) 7058, (short) 7066, (short) 7047, (short) 7068, (short) 7041, (short) 7069, (short) 7064, (short) 7092, (short) 7068, (short) 7057, (short) 7056, (short) 7077, (short) 7047, (short) 7066, (short) 8059, (short) -6527, (short) -6481, (short) -6489, (short) 8003, (short) -7066, (short) -7059, (short) -7058, (short) -7069, (short) -7072, (short) -7059, (short) -7070, (short) -7058, (short) -7060, (short) -7121, (short) -7061, (short) -7052, (short) -7057, (short) -7066, (short) -7068, (short) -7121, (short) -7072, (short) -7059, (short) -7066, (short) -7058, (short) -7053, (short) -7064, (short) -7051, (short) -7063, (short) -7060, (short) -7104, (short) -7064, (short) -7067, (short) -7068, (short) -7087, (short) -7053, (short) -7058, (short) -7070, (short) -7058, (short) -7057, (short) -7065, (short) -7064, (short) -7066, (short) -7070, (short) -7058, (short) -7057, (short) -7065, (short) -7064, (short) -7066, (short) -7121, (short) -7061, (short) -7054, (short) -7058, (short) -7057, (short) -7070, (short) -7058, (short) -7057, (short) -7051, (short) -7068, (short) -7057, (short) -7051, (short) -7109, (short) -7122, (short) -7122, (short) -7072, (short) -7059, (short) -7066, (short) -7058, (short) -7053, (short) -7064, (short) -7051, (short) -7063, (short) -7060, (short) -7104, (short) -7064, (short) -7067, (short) -7068, (short) -7087, (short) -7053, (short) -7058, (short) -7122, (short) 5539, (short) -6999, (short) -7033, (short) -7025, (short) 2788, (short) 16160, (short) 16171, (short) 16168, (short) 16165, (short) 16166, (short) 16171, (short) 3526, (short) 9817, (short) 9810, (short) 9809, (short) 9820, (short) 9823, (short) 9810, (short) 384, (short) -22869, (short) -22907, (short) -22899, (short) 6008, (short) 12617, (short) 12664, (short) 12664, (short) 12635, (short) 12671, (short) 12641, (short) 12668, (short) 12651, (short) 12640, (short) 12651, (short) 12647, (short) 12646, (short) 12668, (short) 12653, (short) 12646, (short) 12668, (short) 12594, (short) 12583, (short) 12583, (short) 12649, (short) 12644, (short) 12655, (short) 12647, (short) 12666, (short) 12641, (short) 12668, (short) 12640, (short) 12645, (short) 12617, (short) 12641, (short) 12652, (short) 12653, (short) 12583, (short) 12651, (short) 12647, (short) 12645, (short) 12582, (short) 12642, (short) 12669, (short) 12646, (short) 12655, (short) 12653, (short) 12582, (short) 12649, (short) 12644, (short) 12655, (short) 12647, (short) 12666, (short) 12641, (short) 12668, (short) 12640, (short) 12645, (short) 12617, (short) 12641, (short) 12652, (short) 12653, (short) 12632, (short) 12666, (short) 12647, (short) 12651, (short) 12647, (short) 12646, (short) 12654, (short) 12641, (short) 12655, (short) 12667, (short) 12671, (short) 12641, (short) 12668, (short) 12651, (short) 12640, (short) 12622, (short) 12641, (short) 12644, (short) 12653, (short) 12665, (short) 12669, (short) 12653, (short) 12666, (short) 12657, (short) 4167, (short) 14637, (short) 14595, (short) 14603, (short) 5875, (short) -25318, (short) -25322, (short) -25321, (short) -25331, (short) -25316, (short) -25321, (short) -25331, (short) -25277, (short) -25258, (short) -25258, (short) -25320, (short) -25323, (short) -25314, (short) -25322, (short) -25333, (short) -25328, (short) -25331, (short) -25327, (short) -25324, (short) -25288, (short) -25328, (short) -25315, (short) -25316, (short) -25258, (short) -25323, (short) -25322, (short) -25314, (short) -25296, (short) -25321, (short) -25328, (short) -25331, (short) 8679, (short) 19626, (short) 19617, (short) 19618, (short) 19631, (short) 19628, (short) 19617, (short) 19605, (short) 19645, (short) 19598, (short) 19618, (short) 19619, (short) 19627, (short) 19620, (short) 19626};

    /* DevToolsApp WARNING: Missing block: B:22:0x0089, code:
            if (s.ۡۥۗ.f47 == false) goto L_0x008b;
     */
    /* DevToolsApp WARNING: Missing block: B:23:0x008b, code:
            r14 = "ۨۗ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:42:0x00f6, code:
            r14 = "ۨ۠ۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:50:0x011c, code:
            r14 = "ۦۖۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:53:0x012e, code:
            r14 = "۬ۚۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x0135, code:
            r14 = "ۢ۟ۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x0137, code:
            r14 = s.ۜۘۡ.m282(r14);
     */
    static {
        /*
        r0 = 262; // 0x106 float:3.67E-43 double:1.294E-321;
        r0 = new short[r0];
        r0 = {6041, 7062, 7066, 7064, 7131, 7071, 7040, 7067, 7058, 7056, 7131, 7060, 7065, 7058, 7066, 7047, 7068, 7041, 7069, 7064, 7092, 7068, 7057, 7056, 7077, 7047, 7066, 8059, -6527, -6481, -6489, 8003, -7066, -7059, -7058, -7069, -7072, -7059, -7070, -7058, -7060, -7121, -7061, -7052, -7057, -7066, -7068, -7121, -7072, -7059, -7066, -7058, -7053, -7064, -7051, -7063, -7060, -7104, -7064, -7067, -7068, -7087, -7053, -7058, -7070, -7058, -7057, -7065, -7064, -7066, -7070, -7058, -7057, -7065, -7064, -7066, -7121, -7061, -7054, -7058, -7057, -7070, -7058, -7057, -7051, -7068, -7057, -7051, -7109, -7122, -7122, -7072, -7059, -7066, -7058, -7053, -7064, -7051, -7063, -7060, -7104, -7064, -7067, -7068, -7087, -7053, -7058, -7122, 5539, -6999, -7033, -7025, 2788, 16160, 16171, 16168, 16165, 16166, 16171, 3526, 9817, 9810, 9809, 9820, 9823, 9810, 384, -22869, -22907, -22899, 6008, 12617, 12664, 12664, 12635, 12671, 12641, 12668, 12651, 12640, 12651, 12647, 12646, 12668, 12653, 12646, 12668, 12594, 12583, 12583, 12649, 12644, 12655, 12647, 12666, 12641, 12668, 12640, 12645, 12617, 12641, 12652, 12653, 12583, 12651, 12647, 12645, 12582, 12642, 12669, 12646, 12655, 12653, 12582, 12649, 12644, 12655, 12647, 12666, 12641, 12668, 12640, 12645, 12617, 12641, 12652, 12653, 12632, 12666, 12647, 12651, 12647, 12646, 12654, 12641, 12655, 12667, 12671, 12641, 12668, 12651, 12640, 12622, 12641, 12644, 12653, 12665, 12669, 12653, 12666, 12657, 4167, 14637, 14595, 14603, 5875, -25318, -25322, -25321, -25331, -25316, -25321, -25331, -25277, -25258, -25258, -25320, -25323, -25314, -25322, -25333, -25328, -25331, -25327, -25324, -25288, -25328, -25315, -25316, -25258, -25323, -25322, -25314, -25296, -25321, -25328, -25331, 8679, 19626, 19617, 19618, 19631, 19628, 19617, 19605, 19645, 19598, 19618, 19619, 19627, 19620, 19626};
        f78 = r0;
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
        r14 = "ۨۡ۟";
    L_0x0019:
        r14 = s.ۢ۫ۗ.m350(r14);
    L_0x001d:
        switch(r14) {
            case 1738069: goto L_0x012c;
            case 1738140: goto L_0x0114;
            case 1738795: goto L_0x0108;
            case 1741882: goto L_0x00f0;
            case 1743209: goto L_0x00df;
            case 1743520: goto L_0x00c5;
            case 1747377: goto L_0x00b6;
            case 1747405: goto L_0x009f;
            case 1747517: goto L_0x0098;
            case 1747642: goto L_0x008f;
            case 1749561: goto L_0x0084;
            case 1752231: goto L_0x0074;
            case 1753141: goto L_0x0069;
            case 1753234: goto L_0x0060;
            case 1754573: goto L_0x005b;
            case 1755100: goto L_0x0056;
            case 1755398: goto L_0x003e;
            case 1759020: goto L_0x0028;
            default: goto L_0x0020;
        };
    L_0x0020:
        r14 = s.ۗۜۛ.m698();
        if (r14 > 0) goto L_0x0135;
    L_0x0026:
        goto L_0x0131;
    L_0x0028:
        r14 = f78;
        r15 = s.ۙۖۥ.f58;
        if (r15 == 0) goto L_0x0030;
    L_0x002e:
        goto L_0x0135;
    L_0x0030:
        r8 = "ۥۘۚ";
        r8 = s.ۜۘۡ.m282(r8);
        r9 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;
        r16 = r14;
        r14 = r8;
        r8 = r16;
        goto L_0x001d;
    L_0x003e:
        r14 = f78;
        r15 = s.۠ۡ۟.m140();
        if (r15 > 0) goto L_0x0048;
    L_0x0046:
        goto L_0x0131;
    L_0x0048:
        r0 = "ۦۙۥ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r1 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;
        r16 = r14;
        r14 = r0;
        r0 = r16;
        goto L_0x001d;
    L_0x0056:
        s.ۨۗۥ.m536();
        goto L_0x0131;
    L_0x005b:
        r7 = 53391; // 0xd08f float:7.4817E-41 double:2.63787E-319;
        goto L_0x012e;
    L_0x0060:
        r14 = s.ۗ۠ۚ.f28;
        if (r14 == 0) goto L_0x0066;
    L_0x0064:
        goto L_0x011c;
    L_0x0066:
        r14 = "ۖۢۨ";
        goto L_0x0019;
    L_0x0069:
        s.ۧۧۡ.m183();
        r14 = s.ۨۘۢ.m318();
        if (r14 != 0) goto L_0x008b;
    L_0x0072:
        goto L_0x0131;
    L_0x0074:
        r14 = s.ۦۢۜ.m16();
        if (r14 == 0) goto L_0x007c;
    L_0x007a:
        goto L_0x0131;
    L_0x007c:
        r10 = "۠ۖۧ";
        r14 = s.ۢ۫ۗ.m350(r10);
        r10 = 6;
        goto L_0x001d;
    L_0x0084:
        s.ۤۤۖ.m506();
        r14 = s.ۡۥۗ.f47;
        if (r14 != 0) goto L_0x011c;
    L_0x008b:
        r14 = "ۨۗ۫";
        goto L_0x0137;
    L_0x008f:
        s.ۛ۫ۧ.m593();
        r0 = new java.lang.RuntimeException;
        r0.<init>();
        throw r0;
    L_0x0098:
        r0 = s.ۦۡۤ.m394(r11, r12, r13, r7);
        TAG = r0;
        return;
    L_0x009f:
        r14 = r3 + r4;
        r15 = s.۟ۥۙ.f52;
        if (r15 == 0) goto L_0x00a7;
    L_0x00a5:
        goto L_0x0131;
    L_0x00a7:
        r5 = "ۗۘ۬";
        r5 = s.ۜۘۡ.m282(r5);
        r6 = 21358; // 0x536e float:2.9929E-41 double:1.05523E-319;
        r16 = r14;
        r14 = r5;
        r5 = r16;
        goto L_0x001d;
    L_0x00b6:
        r14 = s.ۦۡۤ.m394(r8, r9, r10, r7);
        GLOBAL_CONFIG_NAME = r14;
        r14 = s.ۙۜۦ.f36;
        if (r14 > 0) goto L_0x00c1;
    L_0x00c0:
        goto L_0x00f6;
    L_0x00c1:
        r14 = "ۚ۟۟";
        goto L_0x0137;
    L_0x00c5:
        r14 = r2 * r2;
        r15 = s.ۗ۬۟.m257();
        if (r15 > 0) goto L_0x00cf;
    L_0x00cd:
        goto L_0x0131;
    L_0x00cf:
        r3 = "۠ۗۤ";
        r3 = s.ۜۘۡ.m282(r3);
        r4 = 114041041; // 0x6cc20d1 float:7.678449E-35 double:5.63437606E-316;
        r16 = r14;
        r14 = r3;
        r3 = r16;
        goto L_0x001d;
    L_0x00df:
        r14 = s.ۡۢۡ.m58();
        if (r14 == 0) goto L_0x00e6;
    L_0x00e5:
        goto L_0x0131;
    L_0x00e6:
        r13 = "۠ۛۘ";
        r14 = s.ۢ۫ۗ.m350(r13);
        r13 = 8;
        goto L_0x001d;
    L_0x00f0:
        r14 = f78;
        r15 = s.ۙۖۥ.f58;
        if (r15 == 0) goto L_0x00f9;
    L_0x00f6:
        r14 = "ۨ۠ۢ";
        goto L_0x0137;
    L_0x00f9:
        r11 = "ۛ۫ۙ";
        r11 = s.ۢ۫ۗ.m350(r11);
        r12 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r16 = r14;
        r14 = r11;
        r11 = r16;
        goto L_0x001d;
    L_0x0108:
        r14 = r2 * r6;
        r14 = r14 - r5;
        if (r14 <= 0) goto L_0x0111;
    L_0x010d:
        r14 = "ۧۥ۫";
        goto L_0x0019;
    L_0x0111:
        r14 = "ۖ۠۟";
        goto L_0x0137;
    L_0x0114:
        r14 = r0[r1];
        r15 = s.ۤۤۖ.m506();
        if (r15 == 0) goto L_0x011f;
    L_0x011c:
        r14 = "ۦۖۥ";
        goto L_0x0137;
    L_0x011f:
        r2 = "ۜۖۚ";
        r2 = s.ۜۘۡ.m282(r2);
        r16 = r14;
        r14 = r2;
        r2 = r16;
        goto L_0x001d;
    L_0x012c:
        r7 = 19661; // 0x4ccd float:2.7551E-41 double:9.714E-320;
    L_0x012e:
        r14 = "۬ۚۚ";
        goto L_0x0137;
    L_0x0131:
        r14 = "۠۟ۙ";
        goto L_0x0019;
    L_0x0135:
        r14 = "ۢ۟ۖ";
    L_0x0137:
        r14 = s.ۜۘۡ.m282(r14);
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.XpConfig.<clinit>():void");
    }

    /* DevToolsApp WARNING: Missing block: B:29:0x00a0, code:
            r13 = "ۗۙۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:33:0x00ac, code:
            r13 = s.ۜۘۡ.m282(r13);
     */
    /* DevToolsApp WARNING: Missing block: B:53:0x012d, code:
            r13 = "ۨ۬ۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x0135, code:
            r13 = "۬ۛۢ";
     */
    public static java.lang.String getAlgorithmSourceDir() {
        /*
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
        r13 = "۫ۛۥ";
    L_0x000f:
        r13 = s.ۢ۫ۗ.m350(r13);
    L_0x0013:
        switch(r13) {
            case 1738806: goto L_0x0081;
            case 1739150: goto L_0x0040;
            case 1739708: goto L_0x00cb;
            case 1739735: goto L_0x002c;
            case 1740108: goto L_0x00b5;
            case 1741298: goto L_0x0110;
            case 1741315: goto L_0x00fc;
            case 1742721: goto L_0x00e6;
            case 1744090: goto L_0x009e;
            case 1746835: goto L_0x009a;
            case 1748679: goto L_0x0057;
            case 1748789: goto L_0x00a4;
            case 1749732: goto L_0x003a;
            case 1751226: goto L_0x004d;
            case 1752651: goto L_0x006d;
            case 1754091: goto L_0x0129;
            case 1755747: goto L_0x001f;
            case 1759059: goto L_0x0048;
            default: goto L_0x0016;
        };
    L_0x0016:
        r13 = f78;
        r14 = 0;
        r15 = s.ۖۜ۟.f34;
        if (r15 < 0) goto L_0x0139;
    L_0x001d:
        goto L_0x0135;
    L_0x001f:
        s.۬۟ۜ.m366();
        r13 = s.ۛۨۦ.f46;
        if (r13 == 0) goto L_0x0028;
    L_0x0026:
        goto L_0x0135;
    L_0x0028:
        r13 = "ۘۘۗ";
        goto L_0x00ac;
    L_0x002c:
        s.ۚ۟ۢ.m85();
        r13 = s.ۨۧۜ.m755();
        if (r13 >= 0) goto L_0x0037;
    L_0x0035:
        goto L_0x0135;
    L_0x0037:
        r13 = "ۢۤۦ";
        goto L_0x000f;
    L_0x003a:
        r13 = s.۠ۡۧ.f26;
        if (r13 != 0) goto L_0x0118;
    L_0x003e:
        goto L_0x0135;
    L_0x0040:
        s.ۡۥۗ.m568();
        s.ۗۗۡ.m78();
        goto L_0x0135;
    L_0x0048:
        s.۫ۢ۠.m237();
        r0 = 0;
        return r0;
    L_0x004d:
        initClient(r0);
        r0 = algorithmClient;
        r0 = r0.getAlgorithmSourceDir();
        return r0;
    L_0x0057:
        r13 = s.ۖۙۜ.m585(r10, r11, r12, r9);
        r14 = s.ۙۜۦ.f36;
        if (r14 > 0) goto L_0x0061;
    L_0x005f:
        goto L_0x0135;
    L_0x0061:
        r0 = "ۤۖ۬";
        r0 = s.ۜۘۡ.m282(r0);
        r16 = r13;
        r13 = r0;
        r0 = r16;
        goto L_0x0013;
    L_0x006d:
        r13 = 26;
        r14 = s.ۢ۫ۗ.m342();
        if (r14 != 0) goto L_0x0077;
    L_0x0075:
        goto L_0x012d;
    L_0x0077:
        r12 = "ۡۡۧ";
        r12 = s.ۢ۫ۗ.m350(r12);
        r13 = r12;
        r12 = 26;
        goto L_0x0013;
    L_0x0081:
        r13 = f78;
        r14 = 1;
        r15 = s.۟ۧۢ.m774();
        if (r15 == 0) goto L_0x008c;
    L_0x008a:
        goto L_0x0135;
    L_0x008c:
        r10 = "ۥۥ۫";
        r10 = s.ۢ۫ۗ.m350(r10);
        r11 = 1;
        r16 = r13;
        r13 = r10;
        r10 = r16;
        goto L_0x0013;
    L_0x009a:
        r9 = 62676; // 0xf4d4 float:8.7828E-41 double:3.0966E-319;
        goto L_0x00a0;
    L_0x009e:
        r9 = 7157; // 0x1bf5 float:1.0029E-41 double:3.536E-320;
    L_0x00a0:
        r13 = "ۗۙۘ";
        goto L_0x000f;
    L_0x00a4:
        r13 = r8 * r8;
        r13 = r6 - r13;
        if (r13 < 0) goto L_0x00b2;
    L_0x00aa:
        r13 = "ۜۨۦ";
    L_0x00ac:
        r13 = s.ۜۘۡ.m282(r13);
        goto L_0x0013;
    L_0x00b2:
        r13 = "۟ۤۘ";
        goto L_0x00ac;
    L_0x00b5:
        r13 = r3 + r7;
        r14 = s.۫۫ۗ.m790();
        if (r14 != 0) goto L_0x00be;
    L_0x00bd:
        goto L_0x0118;
    L_0x00be:
        r8 = "ۡۥۙ";
        r8 = s.ۢ۫ۗ.m350(r8);
        r16 = r13;
        r13 = r8;
        r8 = r16;
        goto L_0x0013;
    L_0x00cb:
        r13 = r5 + r5;
        r14 = 6740; // 0x1a54 float:9.445E-42 double:3.33E-320;
        r15 = s.۟ۧۢ.m774();
        if (r15 == 0) goto L_0x00d7;
    L_0x00d5:
        goto L_0x0135;
    L_0x00d7:
        r6 = "ۘۤۘ";
        r6 = s.ۢ۫ۗ.m350(r6);
        r7 = 6740; // 0x1a54 float:9.445E-42 double:3.33E-320;
        r16 = r13;
        r13 = r6;
        r6 = r16;
        goto L_0x0013;
    L_0x00e6:
        r13 = 45427600; // 0x2b52b90 float:2.6620563E-37 double:2.24442165E-316;
        r13 = r13 + r4;
        r14 = s.۟ۧۢ.f60;
        if (r14 > 0) goto L_0x00ef;
    L_0x00ee:
        goto L_0x012d;
    L_0x00ef:
        r5 = "ۘۗۛ";
        r5 = s.ۢ۫ۗ.m350(r5);
        r16 = r13;
        r13 = r5;
        r5 = r16;
        goto L_0x0013;
    L_0x00fc:
        r13 = r3 * r3;
        r14 = s.ۚۡۢ.f7;
        if (r14 != 0) goto L_0x0103;
    L_0x0102:
        goto L_0x0135;
    L_0x0103:
        r4 = "ۛۛۡ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r16 = r13;
        r13 = r4;
        r4 = r16;
        goto L_0x0013;
    L_0x0110:
        r13 = r1[r2];
        r14 = s.ۘۡۜ.m682();
        if (r14 < 0) goto L_0x011c;
    L_0x0118:
        r13 = "ۗۤۛ";
        goto L_0x000f;
    L_0x011c:
        r3 = "ۙ۬ۖ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r16 = r13;
        r13 = r3;
        r3 = r16;
        goto L_0x0013;
    L_0x0129:
        r13 = s.۠ۡ۟.f8;
        if (r13 > 0) goto L_0x0131;
    L_0x012d:
        r13 = "ۨ۬ۧ";
        goto L_0x00ac;
    L_0x0131:
        r13 = "ۙ۫ۤ";
        goto L_0x000f;
    L_0x0135:
        r13 = "۬ۛۢ";
        goto L_0x00ac;
    L_0x0139:
        r1 = "ۧۖۚ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r2 = 0;
        r16 = r13;
        r13 = r1;
        r1 = r16;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.XpConfig.getAlgorithmSourceDir():java.lang.String");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0023, code:
            if (s.ۗۜۛ.m698() > 0) goto L_0x0081;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0035, code:
            if (s.۬ۨۨ.m730() == 0) goto L_0x0125;
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x0096, code:
            r10 = "ۡۢۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:42:0x00d7, code:
            r10 = "ۡۚۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x0100, code:
            r10 = "ۦۨۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x010e, code:
            r10 = s.ۜۘۡ.m282(r10);
     */
    /* DevToolsApp WARNING: Missing block: B:57:0x0118, code:
            r10 = "۟ۗۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:61:0x0125, code:
            r10 = "ۥۥۙ";
     */
    public static com.junge.algorithmAidePro.Config.ConfigReader getConfig(android.content.Context r14) {
        /*
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
        r10 = "ۗ۟ۙ";
    L_0x000c:
        r10 = s.ۢ۫ۗ.m350(r10);
    L_0x0010:
        switch(r10) {
            case 1738993: goto L_0x011f;
            case 1739104: goto L_0x00a7;
            case 1740023: goto L_0x0031;
            case 1740106: goto L_0x0053;
            case 1740244: goto L_0x00e6;
            case 1740727: goto L_0x0093;
            case 1742279: goto L_0x00fa;
            case 1743025: goto L_0x008f;
            case 1743562: goto L_0x009a;
            case 1746431: goto L_0x0039;
            case 1747097: goto L_0x0114;
            case 1748447: goto L_0x001c;
            case 1748611: goto L_0x00b9;
            case 1748697: goto L_0x0077;
            case 1748975: goto L_0x0065;
            case 1752633: goto L_0x003e;
            case 1753407: goto L_0x0107;
            case 1753699: goto L_0x0026;
            case 1754377: goto L_0x0046;
            case 1758252: goto L_0x00cd;
            default: goto L_0x0013;
        };
    L_0x0013:
        r0 = s.ۙۜۦ.m522(r14);
        r14 = getConfig(r14, r0);
        return r14;
    L_0x001c:
        s.ۨۘۢ.m318();
        r10 = s.ۗۜۛ.m698();
        if (r10 <= 0) goto L_0x0100;
    L_0x0025:
        goto L_0x0081;
    L_0x0026:
        s.ۜۘۡ.m280();
        r10 = s.۬۟ۜ.m366();
        if (r10 != 0) goto L_0x0081;
    L_0x002f:
        goto L_0x0125;
    L_0x0031:
        r10 = s.۬ۨۨ.m730();
        if (r10 != 0) goto L_0x0118;
    L_0x0037:
        goto L_0x0125;
    L_0x0039:
        s.ۦۡۤ.m396();
        goto L_0x0125;
    L_0x003e:
        s.ۜۘۡ.m280();
        s.ۗۜ۟.m469();
        r14 = 0;
        return r14;
    L_0x0046:
        r0 = com.junge.algorithmAidePro.Utils.VxpTools.getVxpContext();
        r14 = s.ۙۜۦ.m522(r14);
        r14 = getConfig(r0, r14);
        return r14;
    L_0x0053:
        r10 = 3;
        r10 = s.۠ۜۗ.m221(r2, r3, r10, r1);
        r10 = s.ۡۘۗ.m39(r0, r10);
        if (r10 == 0) goto L_0x0061;
    L_0x005e:
        r10 = "ۧ۟ۡ";
        goto L_0x000c;
    L_0x0061:
        r10 = "۫ۘۙ";
        goto L_0x010e;
    L_0x0065:
        r10 = 28;
        r11 = s.ۢ۫ۜ.f51;
        if (r11 < 0) goto L_0x006d;
    L_0x006b:
        goto L_0x0125;
    L_0x006d:
        r3 = "ۘۤۖ";
        r3 = s.ۜۘۡ.m282(r3);
        r10 = r3;
        r3 = 28;
        goto L_0x0010;
    L_0x0077:
        r10 = s.ۢ۫ۜ.m624();
        r11 = f78;
        r12 = s.ۡۗۗ.f9;
        if (r12 != 0) goto L_0x0084;
    L_0x0081:
        r10 = "ۘۡ۠";
        goto L_0x000c;
    L_0x0084:
        r0 = "ۡ۫ۙ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r2 = r11;
        r13 = r10;
        r10 = r0;
        r0 = r13;
        goto L_0x0010;
    L_0x008f:
        r1 = 60225; // 0xeb41 float:8.4393E-41 double:2.9755E-319;
        goto L_0x0096;
    L_0x0093:
        r1 = 59095; // 0xe6d7 float:8.281E-41 double:2.9197E-319;
    L_0x0096:
        r10 = "ۡۢۚ";
        goto L_0x010e;
    L_0x009a:
        r10 = r6 * r9;
        r10 = r10 - r8;
        if (r10 <= 0) goto L_0x00a3;
    L_0x009f:
        r10 = "ۛۥۛ";
        goto L_0x000c;
    L_0x00a3:
        r10 = "ۙۙۗ";
        goto L_0x010e;
    L_0x00a7:
        r10 = 21432; // 0x53b8 float:3.0033E-41 double:1.0589E-319;
        r11 = s.ۢۜۘ.f15;
        if (r11 == 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00d7;
    L_0x00ae:
        r9 = "ۜۗۥ";
        r9 = s.ۜۘۡ.m282(r9);
        r10 = r9;
        r9 = 21432; // 0x53b8 float:3.0033E-41 double:1.0589E-319;
        goto L_0x0010;
    L_0x00b9:
        r10 = 114832656; // 0x6d83510 float:8.132814E-35 double:5.67348704E-316;
        r10 = r10 + r7;
        r11 = s.ۦۡۤ.f25;
        if (r11 == 0) goto L_0x00c2;
    L_0x00c1:
        goto L_0x0118;
    L_0x00c2:
        r8 = "ۗۢ۫";
        r8 = s.ۢ۫ۗ.m350(r8);
        r13 = r10;
        r10 = r8;
        r8 = r13;
        goto L_0x0010;
    L_0x00cd:
        r10 = r4[r5];
        r11 = r10 * r10;
        r12 = s.ۚۤۙ.m296();
        if (r12 == 0) goto L_0x00da;
    L_0x00d7:
        r10 = "ۡۚۘ";
        goto L_0x010e;
    L_0x00da:
        r6 = "ۡ۟ۡ";
        r6 = s.ۜۘۡ.m282(r6);
        r7 = r11;
        r13 = r10;
        r10 = r6;
        r6 = r13;
        goto L_0x0010;
    L_0x00e6:
        r10 = 27;
        r11 = s.ۦۢۜ.m16();
        if (r11 == 0) goto L_0x00ef;
    L_0x00ee:
        goto L_0x0125;
    L_0x00ef:
        r5 = "۫۠ۡ";
        r5 = s.ۢ۫ۗ.m350(r5);
        r10 = r5;
        r5 = 27;
        goto L_0x0010;
    L_0x00fa:
        r10 = s.ۗۜۛ.m698();
        if (r10 > 0) goto L_0x0104;
    L_0x0100:
        r10 = "ۦۨۥ";
        goto L_0x000c;
    L_0x0104:
        r10 = "ۘۨۤ";
        goto L_0x010e;
    L_0x0107:
        r10 = s.۠ۡۧ.f26;
        if (r10 == 0) goto L_0x010c;
    L_0x010b:
        goto L_0x0118;
    L_0x010c:
        r10 = "ۚ۬ۙ";
    L_0x010e:
        r10 = s.ۜۘۡ.m282(r10);
        goto L_0x0010;
    L_0x0114:
        r10 = s.ۗۜۛ.f55;
        if (r10 == 0) goto L_0x011b;
    L_0x0118:
        r10 = "۟ۗۗ";
        goto L_0x010e;
    L_0x011b:
        r10 = "ۦ۟ۘ";
        goto L_0x000c;
    L_0x011f:
        r10 = f78;
        r11 = s.ۛ۫ۧ.f49;
        if (r11 != 0) goto L_0x0128;
    L_0x0125:
        r10 = "ۥۥۙ";
        goto L_0x010e;
    L_0x0128:
        r4 = "۟۬ۦ";
        r4 = s.ۜۘۡ.m282(r4);
        r13 = r10;
        r10 = r4;
        r4 = r13;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.XpConfig.getConfig(android.content.Context):com.junge.algorithmAidePro.Config.ConfigReader");
    }

    /* DevToolsApp WARNING: Missing block: B:7:0x0029, code:
            if (s.ۗۗۡ.m78() == false) goto L_0x010e;
     */
    /* DevToolsApp WARNING: Missing block: B:28:0x0092, code:
            r11 = "ۤۜۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x00f2, code:
            r11 = "ۜۛۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x010e, code:
            r11 = "ۘۦ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x0119, code:
            r11 = "ۧۤۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:58:0x011f, code:
            r11 = s.ۜۘۡ.m282(r11);
     */
    /* DevToolsApp WARNING: Missing block: B:61:0x012d, code:
            r11 = "ۢ۬ۗ";
     */
    public static boolean isSwitch(android.content.Context r15) {
        /*
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
        r11 = "ۗۛۚ";
    L_0x000d:
        r11 = s.ۢ۫ۗ.m350(r11);
    L_0x0011:
        switch(r11) {
            case 1738093: goto L_0x0019;
            case 1738132: goto L_0x00a4;
            case 1738870: goto L_0x0125;
            case 1739873: goto L_0x0115;
            case 1740189: goto L_0x0036;
            case 1741951: goto L_0x0051;
            case 1741980: goto L_0x003b;
            case 1742681: goto L_0x0048;
            case 1742710: goto L_0x00b7;
            case 1742899: goto L_0x00ec;
            case 1743215: goto L_0x008f;
            case 1743680: goto L_0x0108;
            case 1743688: goto L_0x002d;
            case 1743711: goto L_0x0063;
            case 1751407: goto L_0x0075;
            case 1752609: goto L_0x0096;
            case 1753240: goto L_0x0100;
            case 1754533: goto L_0x0022;
            case 1755112: goto L_0x00cf;
            case 1758066: goto L_0x008c;
            default: goto L_0x0014;
        };
    L_0x0014:
        s.ۗۢۢ.m454();
        goto L_0x010e;
    L_0x0019:
        s.ۤۗۛ.m370();
        r11 = s.۬ۨۨ.f57;
        if (r11 == 0) goto L_0x0119;
    L_0x0020:
        goto L_0x00f2;
    L_0x0022:
        s.۬ۨۨ.m730();
        r11 = s.ۗۗۡ.m78();
        if (r11 != 0) goto L_0x00f2;
    L_0x002b:
        goto L_0x010e;
    L_0x002d:
        s.ۧۧۡ.m183();
        r11 = s.۬۟ۜ.f23;
        if (r11 == 0) goto L_0x012d;
    L_0x0034:
        goto L_0x010e;
    L_0x0036:
        s.ۨۘۢ.m318();
        r15 = 0;
        return r15;
    L_0x003b:
        r0 = com.junge.algorithmAidePro.Utils.VxpTools.getVxpContext();
        r15 = s.ۗۢۢ.m449(r15);
        r15 = isSwitch(r0, r15);
        return r15;
    L_0x0048:
        r0 = s.ۙۜۦ.m522(r15);
        r15 = isSwitch(r15, r0);
        return r15;
    L_0x0051:
        r11 = 3;
        r11 = s.ۦۢۜ.m28(r2, r3, r11, r1);
        r11 = s.ۡۘۗ.m39(r0, r11);
        if (r11 == 0) goto L_0x0060;
    L_0x005c:
        r11 = "ۚۢۤ";
        goto L_0x011f;
    L_0x0060:
        r11 = "ۛۚۘ";
        goto L_0x000d;
    L_0x0063:
        r11 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r12 = s.ۜۘۡ.f17;
        if (r12 > 0) goto L_0x006b;
    L_0x0069:
        goto L_0x010e;
    L_0x006b:
        r3 = "ۚۡۦ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r11 = r3;
        r3 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        goto L_0x0011;
    L_0x0075:
        r11 = s.ۗۜۛ.m689();
        r12 = f78;
        r13 = s.ۨۧۚ.f56;
        if (r13 != 0) goto L_0x0081;
    L_0x007f:
        goto L_0x00da;
    L_0x0081:
        r0 = "ۜۜ۟";
        r0 = s.ۜۘۡ.m282(r0);
        r2 = r12;
        r14 = r11;
        r11 = r0;
        r0 = r14;
        goto L_0x0011;
    L_0x008c:
        r1 = 9316; // 0x2464 float:1.3054E-41 double:4.6027E-320;
        goto L_0x0092;
    L_0x008f:
        r1 = 42749; // 0xa6fd float:5.9904E-41 double:2.1121E-319;
    L_0x0092:
        r11 = "ۤۜۧ";
        goto L_0x000d;
    L_0x0096:
        r11 = r10 * r10;
        r11 = r8 - r11;
        if (r11 > 0) goto L_0x00a0;
    L_0x009c:
        r11 = "ۛ۫۟";
        goto L_0x011f;
    L_0x00a0:
        r11 = "۫ۚۡ";
        goto L_0x011f;
    L_0x00a4:
        r11 = r6 + r9;
        r12 = s.ۜۖۚ.f0;
        if (r12 < 0) goto L_0x00ac;
    L_0x00aa:
        goto L_0x012d;
    L_0x00ac:
        r10 = "ۥۤ۠";
        r10 = s.ۜۘۡ.m282(r10);
        r14 = r11;
        r11 = r10;
        r10 = r14;
        goto L_0x0011;
    L_0x00b7:
        r11 = r6 * r7;
        r12 = 15629; // 0x3d0d float:2.1901E-41 double:7.7218E-320;
        r13 = s.ۜۘۡ.m280();
        if (r13 == 0) goto L_0x00c2;
    L_0x00c1:
        goto L_0x010e;
    L_0x00c2:
        r8 = "ۖۢ۠";
        r8 = s.ۜۘۡ.m282(r8);
        r9 = 15629; // 0x3d0d float:2.1901E-41 double:7.7218E-320;
        r14 = r11;
        r11 = r8;
        r8 = r14;
        goto L_0x0011;
    L_0x00cf:
        r11 = r4[r5];
        r12 = 62516; // 0xf434 float:8.7604E-41 double:3.0887E-319;
        r13 = s.۠ۜۗ.m214();
        if (r13 > 0) goto L_0x00de;
    L_0x00da:
        r11 = "ۖۡۘ";
        goto L_0x000d;
    L_0x00de:
        r6 = "ۛۛۖ";
        r6 = s.ۜۘۡ.m282(r6);
        r7 = 62516; // 0xf434 float:8.7604E-41 double:3.0887E-319;
        r14 = r11;
        r11 = r6;
        r6 = r14;
        goto L_0x0011;
    L_0x00ec:
        r11 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r12 = s.ۢ۫ۗ.f21;
        if (r12 == 0) goto L_0x00f5;
    L_0x00f2:
        r11 = "ۜۛۧ";
        goto L_0x011f;
    L_0x00f5:
        r5 = "ۨۘۘ";
        r5 = s.ۢ۫ۗ.m350(r5);
        r11 = r5;
        r5 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        goto L_0x0011;
    L_0x0100:
        r11 = s.ۚۡۢ.f7;
        if (r11 != 0) goto L_0x0105;
    L_0x0104:
        goto L_0x012d;
    L_0x0105:
        r11 = "ۛۡۙ";
        goto L_0x011f;
    L_0x0108:
        r11 = s.۟ۥۙ.m650();
        if (r11 > 0) goto L_0x0111;
    L_0x010e:
        r11 = "ۘۦ۫";
        goto L_0x011f;
    L_0x0111:
        r11 = "ۦۙ۫";
        goto L_0x000d;
    L_0x0115:
        r11 = s.ۡۥۗ.f47;
        if (r11 == 0) goto L_0x011d;
    L_0x0119:
        r11 = "ۧۤۢ";
        goto L_0x000d;
    L_0x011d:
        r11 = "ۜۛ۟";
    L_0x011f:
        r11 = s.ۜۘۡ.m282(r11);
        goto L_0x0011;
    L_0x0125:
        r11 = f78;
        r12 = s.ۖۙۜ.m589();
        if (r12 > 0) goto L_0x0131;
    L_0x012d:
        r11 = "ۢ۬ۗ";
        goto L_0x000d;
    L_0x0131:
        r4 = "ۘۜۥ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r14 = r11;
        r11 = r4;
        r4 = r14;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.XpConfig.isSwitch(android.content.Context):boolean");
    }

    /* DevToolsApp WARNING: Missing block: B:14:0x0041, code:
            if (s.ۤۤۖ.m506() == 0) goto L_0x010b;
     */
    /* DevToolsApp WARNING: Missing block: B:28:0x0088, code:
            r9 = "ۜۨ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:40:0x00bb, code:
            r9 = "ۨۗۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x010b, code:
            r9 = "ۙۙۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:69:0x0151, code:
            r9 = "۟ۛۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:73:0x015f, code:
            r9 = "ۤۜۙ";
     */
    public static void logInit(android.content.Context r14, java.lang.String r15) {
        /*
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = "ۚ۬ۥ";
    L_0x000b:
        r9 = s.ۜۘۡ.m282(r9);
    L_0x000f:
        switch(r9) {
            case 1738205: goto L_0x00b4;
            case 1738882: goto L_0x013f;
            case 1739068: goto L_0x00bf;
            case 1740109: goto L_0x011b;
            case 1740153: goto L_0x0056;
            case 1740730: goto L_0x0052;
            case 1742291: goto L_0x0159;
            case 1744083: goto L_0x004d;
            case 1746446: goto L_0x0045;
            case 1746556: goto L_0x003a;
            case 1746906: goto L_0x014b;
            case 1747103: goto L_0x0034;
            case 1749324: goto L_0x0075;
            case 1751393: goto L_0x001c;
            case 1751714: goto L_0x0055;
            case 1752648: goto L_0x0102;
            case 1752868: goto L_0x006e;
            case 1753126: goto L_0x00e2;
            case 1754778: goto L_0x0096;
            case 1755082: goto L_0x00aa;
            case 1755503: goto L_0x007d;
            case 1755618: goto L_0x00b8;
            case 1755713: goto L_0x0097;
            case 1758314: goto L_0x0027;
            case 1759403: goto L_0x00d2;
            case 1759453: goto L_0x012d;
            default: goto L_0x0012;
        };
    L_0x0012:
        r9 = r3 * r4;
        r10 = s.۟ۤۗ.m332();
        if (r10 > 0) goto L_0x00f7;
    L_0x001a:
        goto L_0x015f;
    L_0x001c:
        r9 = s.ۛۨۦ.m559();
        if (r9 == 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0030;
    L_0x0023:
        r9 = "۫ۢۡ";
        goto L_0x00cc;
    L_0x0027:
        s.ۧۧۡ.m183();
        r9 = s.ۙۜۦ.f36;
        if (r9 <= 0) goto L_0x0030;
    L_0x002e:
        goto L_0x0143;
    L_0x0030:
        r9 = "۟۬۬";
        goto L_0x00cc;
    L_0x0034:
        r9 = s.۠ۡ۟.f8;
        if (r9 <= 0) goto L_0x0151;
    L_0x0038:
        goto L_0x010b;
    L_0x003a:
        s.ۗ۠ۚ.m442();
        r9 = s.ۤۤۖ.m506();
        if (r9 != 0) goto L_0x0143;
    L_0x0043:
        goto L_0x010b;
    L_0x0045:
        r9 = s.ۦۡۤ.m396();
        if (r9 == 0) goto L_0x0088;
    L_0x004b:
        goto L_0x010b;
    L_0x004d:
        s.ۚ۟ۢ.m85();
        goto L_0x010b;
    L_0x0052:
        s.ۖۜ۟.m492();
    L_0x0055:
        return;
    L_0x0056:
        r9 = s.۫ۢ۠.m227(r14);	 Catch:{ Exception -> 0x006b }
        r10 = f78;	 Catch:{ Exception -> 0x006b }
        r11 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r12 = 31;
        r10 = s.ۨۧۚ.m705(r10, r11, r12, r8);	 Catch:{ Exception -> 0x006b }
        r10 = s.ۖۙۜ.m588(r10);	 Catch:{ Exception -> 0x006b }
        r9.insert(r10, r0);	 Catch:{ Exception -> 0x006b }
    L_0x006b:
        r9 = "ۤۦۤ";
        goto L_0x00cc;
    L_0x006e:
        r14 = algorithmClient;
        r15 = 1;
        r14.setlogInit(r15);
        return;
    L_0x0075:
        r9 = java.lang.Boolean.TRUE;
        r0.put(r15, r9);
        r9 = "ۘۥۦ";
        goto L_0x000b;
    L_0x007d:
        r9 = new android.content.ContentValues;
        r9.<init>();
        r10 = s.ۡۘۗ.m32();
        if (r10 == 0) goto L_0x008b;
    L_0x0088:
        r9 = "ۜۨ۟";
        goto L_0x00cc;
    L_0x008b:
        r0 = "ۢۗۡ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r13 = r9;
        r9 = r0;
        r0 = r13;
        goto L_0x000f;
    L_0x0096:
        return;
    L_0x0097:
        initClient(r15);
        r9 = algorithmClient;
        r9 = s.۫۫ۗ.m795(r9);
        if (r9 == 0) goto L_0x00a6;
    L_0x00a2:
        r9 = "ۥ۬۫";
        goto L_0x000b;
    L_0x00a6:
        r9 = "ۨۤ۫";
        goto L_0x000b;
    L_0x00aa:
        if (r14 != 0) goto L_0x00b0;
    L_0x00ac:
        r9 = "ۧ۬۟";
        goto L_0x000b;
    L_0x00b0:
        r9 = "ۨ۫ۤ";
        goto L_0x000b;
    L_0x00b4:
        r8 = 49036; // 0xbf8c float:6.8714E-41 double:2.4227E-319;
        goto L_0x00bb;
    L_0x00b8:
        r8 = 40313; // 0x9d79 float:5.649E-41 double:1.99173E-319;
    L_0x00bb:
        r9 = "ۨۗۙ";
        goto L_0x000b;
    L_0x00bf:
        r9 = r3 + r7;
        r9 = r9 * r9;
        r9 = r9 - r6;
        if (r9 >= 0) goto L_0x00ca;
    L_0x00c6:
        r9 = "ۖۤ۫";
        goto L_0x000b;
    L_0x00ca:
        r9 = "ۨۨۢ";
    L_0x00cc:
        r9 = s.ۢ۫ۗ.m350(r9);
        goto L_0x000f;
    L_0x00d2:
        r9 = 1;
        r10 = s.ۗ۬۟.f16;
        if (r10 == 0) goto L_0x00d8;
    L_0x00d7:
        goto L_0x010b;
    L_0x00d8:
        r7 = "ۗۡۦ";
        r7 = s.ۢ۫ۗ.m350(r7);
        r9 = r7;
        r7 = 1;
        goto L_0x000f;
    L_0x00e2:
        r9 = r5 + 1;
        r10 = s.ۨۧۜ.m755();
        if (r10 < 0) goto L_0x00ec;
    L_0x00ea:
        goto L_0x0143;
    L_0x00ec:
        r6 = "۬ۦۥ";
        r6 = s.ۜۘۡ.m282(r6);
        r13 = r9;
        r9 = r6;
        r6 = r13;
        goto L_0x000f;
    L_0x00f7:
        r5 = "ۦۖۖ";
        r5 = s.ۜۘۡ.m282(r5);
        r13 = r9;
        r9 = r5;
        r5 = r13;
        goto L_0x000f;
    L_0x0102:
        r9 = r1[r2];
        r10 = 2;
        r11 = s.۠ۡ۟.m140();
        if (r11 > 0) goto L_0x010f;
    L_0x010b:
        r9 = "ۙۙۚ";
        goto L_0x000b;
    L_0x010f:
        r3 = "ۘ۬ۜ";
        r3 = s.ۜۘۡ.m282(r3);
        r4 = 2;
        r13 = r9;
        r9 = r3;
        r3 = r13;
        goto L_0x000f;
    L_0x011b:
        r9 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r10 = s.ۙۖۥ.f58;
        if (r10 == 0) goto L_0x0122;
    L_0x0121:
        goto L_0x0151;
    L_0x0122:
        r2 = "ۥۥۨ";
        r2 = s.ۜۘۡ.m282(r2);
        r9 = r2;
        r2 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        goto L_0x000f;
    L_0x012d:
        r9 = f78;
        r10 = s.ۗۤ۫.f12;
        if (r10 == 0) goto L_0x0134;
    L_0x0133:
        goto L_0x0143;
    L_0x0134:
        r1 = "ۘۤۙ";
        r1 = s.ۜۘۡ.m282(r1);
        r13 = r9;
        r9 = r1;
        r1 = r13;
        goto L_0x000f;
    L_0x013f:
        r9 = s.ۚ۟ۢ.f5;
        if (r9 != 0) goto L_0x0147;
    L_0x0143:
        r9 = "۟ۗۦ";
        goto L_0x000b;
    L_0x0147:
        r9 = "۬ۨۙ";
        goto L_0x000b;
    L_0x014b:
        r9 = s.۟ۥۙ.m650();
        if (r9 > 0) goto L_0x0155;
    L_0x0151:
        r9 = "۟ۛۘ";
        goto L_0x00cc;
    L_0x0155:
        r9 = "ۗۛۦ";
        goto L_0x000b;
    L_0x0159:
        r9 = s.ۦۡۤ.m396();
        if (r9 == 0) goto L_0x0163;
    L_0x015f:
        r9 = "ۤۜۙ";
        goto L_0x00cc;
    L_0x0163:
        r9 = "۟ۦۡ";
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.XpConfig.logInit(android.content.Context, java.lang.String):void");
    }

    /* DevToolsApp WARNING: Missing block: B:8:0x0028, code:
            if (s.ۗۢۢ.f29 < 0) goto L_0x0105;
     */
    /* DevToolsApp WARNING: Missing block: B:16:0x0044, code:
            r11 = "ۛۗۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:23:0x0061, code:
            r11 = "ۥۨۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:30:0x008f, code:
            r11 = "ۘ۬ۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x0105, code:
            r11 = "۟ۜۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:58:0x0110, code:
            r11 = "ۡۢۗ";
     */
    public static com.junge.algorithmAidePro.Config.ConfigReader getConfig(java.lang.String r15) {
        /*
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
        r11 = "۬ۜ۠";
    L_0x000d:
        r11 = s.ۜۘۡ.m282(r11);
    L_0x0011:
        switch(r11) {
            case 1740035: goto L_0x00e0;
            case 1740354: goto L_0x006f;
            case 1740639: goto L_0x0059;
            case 1741209: goto L_0x00a0;
            case 1741782: goto L_0x00ff;
            case 1741889: goto L_0x00b3;
            case 1742589: goto L_0x0039;
            case 1743857: goto L_0x0043;
            case 1746587: goto L_0x0034;
            case 1746690: goto L_0x0047;
            case 1748420: goto L_0x003e;
            case 1748694: goto L_0x002c;
            case 1752465: goto L_0x010c;
            case 1752520: goto L_0x008c;
            case 1753634: goto L_0x0088;
            case 1754243: goto L_0x00f2;
            case 1754595: goto L_0x001a;
            case 1755214: goto L_0x0023;
            case 1755430: goto L_0x00c9;
            case 1759088: goto L_0x0117;
            case 1759459: goto L_0x0093;
            default: goto L_0x0014;
        };
    L_0x0014:
        r11 = s.ۨۗۥ.f42;
        if (r11 <= 0) goto L_0x011d;
    L_0x0018:
        goto L_0x0105;
    L_0x001a:
        s.ۚۤۙ.m296();
        r11 = s.ۗۜۛ.f55;
        if (r11 == 0) goto L_0x0061;
    L_0x0021:
        goto L_0x011d;
    L_0x0023:
        s.ۨۗۥ.m536();
        r11 = s.ۗۢۢ.f29;
        if (r11 >= 0) goto L_0x0110;
    L_0x002a:
        goto L_0x0105;
    L_0x002c:
        s.ۛۨۦ.m559();
        s.ۗۜۛ.m698();
        goto L_0x0105;
    L_0x0034:
        s.ۢ۟ۚ.m168();
        r15 = 0;
        return r15;
    L_0x0039:
        r15 = getConfig(r3, r15);
        return r15;
    L_0x003e:
        r3 = com.junge.algorithmAidePro.Utils.VxpTools.getVxpContext();
        goto L_0x0044;
    L_0x0043:
        r3 = 0;
    L_0x0044:
        r11 = "ۛۗۙ";
        goto L_0x000d;
    L_0x0047:
        r11 = 3;
        r11 = s.ۦۡۤ.m394(r2, r4, r11, r1);
        r11 = s.ۡۘۗ.m39(r0, r11);
        if (r11 == 0) goto L_0x0056;
    L_0x0052:
        r11 = "ۡۙۜ";
        goto L_0x00f9;
    L_0x0056:
        r11 = "ۜۡۖ";
        goto L_0x000d;
    L_0x0059:
        r11 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r12 = s.ۚۡۢ.m112();
        if (r12 < 0) goto L_0x0065;
    L_0x0061:
        r11 = "ۥۨۡ";
        goto L_0x00f9;
    L_0x0065:
        r4 = "۟۟ۢ";
        r4 = s.ۜۘۡ.m282(r4);
        r11 = r4;
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        goto L_0x0011;
    L_0x006f:
        r11 = s.ۗۜۛ.m689();
        r12 = f78;
        r13 = s.ۡۗۗ.m159();
        if (r13 == 0) goto L_0x007d;
    L_0x007b:
        goto L_0x0105;
    L_0x007d:
        r0 = "ۙۖۜ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r2 = r12;
        r14 = r11;
        r11 = r0;
        r0 = r14;
        goto L_0x0011;
    L_0x0088:
        r1 = 40498; // 0x9e32 float:5.675E-41 double:2.00087E-319;
        goto L_0x008f;
    L_0x008c:
        r1 = 58623; // 0xe4ff float:8.2148E-41 double:2.89636E-319;
    L_0x008f:
        r11 = "ۘ۬ۖ";
        goto L_0x000d;
    L_0x0093:
        r11 = r7 * r10;
        r11 = r11 - r9;
        if (r11 > 0) goto L_0x009c;
    L_0x0098:
        r11 = "ۥۡۤ";
        goto L_0x00f9;
    L_0x009c:
        r11 = "ۦۦۢ";
        goto L_0x000d;
    L_0x00a0:
        r11 = 5374; // 0x14fe float:7.53E-42 double:2.655E-320;
        r12 = s.ۡۢۡ.f3;
        if (r12 < 0) goto L_0x00a8;
    L_0x00a6:
        goto L_0x011d;
    L_0x00a8:
        r10 = "۬ۨ۟";
        r10 = s.ۜۘۡ.m282(r10);
        r11 = r10;
        r10 = 5374; // 0x14fe float:7.53E-42 double:2.655E-320;
        goto L_0x0011;
    L_0x00b3:
        r11 = 7219969; // 0x6e2b01 float:1.0117331E-38 double:3.5671386E-317;
        r11 = r11 + r8;
        r12 = s.ۗۢۢ.m454();
        if (r12 < 0) goto L_0x00be;
    L_0x00bd:
        goto L_0x0110;
    L_0x00be:
        r9 = "ۙۨۨ";
        r9 = s.ۜۘۡ.m282(r9);
        r14 = r11;
        r11 = r9;
        r9 = r14;
        goto L_0x0011;
    L_0x00c9:
        r11 = r5[r6];
        r12 = r11 * r11;
        r13 = s.۟ۤۗ.f20;
        if (r13 > 0) goto L_0x00d4;
    L_0x00d1:
        r11 = "ۧۦۢ";
        goto L_0x00f9;
    L_0x00d4:
        r7 = "ۚ۟ۦ";
        r7 = s.ۜۘۡ.m282(r7);
        r8 = r12;
        r14 = r11;
        r11 = r7;
        r7 = r14;
        goto L_0x0011;
    L_0x00e0:
        r11 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r12 = s.۫۫ۗ.f65;
        if (r12 == 0) goto L_0x00e7;
    L_0x00e6:
        goto L_0x011d;
    L_0x00e7:
        r6 = "ۨۢ۠";
        r6 = s.ۜۘۡ.m282(r6);
        r11 = r6;
        r6 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        goto L_0x0011;
    L_0x00f2:
        r11 = s.ۢ۟ۚ.f10;
        if (r11 == 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x011d;
    L_0x00f7:
        r11 = "ۘۡ۬";
    L_0x00f9:
        r11 = s.ۢ۫ۗ.m350(r11);
        goto L_0x0011;
    L_0x00ff:
        r11 = s.ۢ۫ۗ.m342();
        if (r11 != 0) goto L_0x0108;
    L_0x0105:
        r11 = "۟ۜۘ";
        goto L_0x00f9;
    L_0x0108:
        r11 = "ۧۛۗ";
        goto L_0x000d;
    L_0x010c:
        r11 = s.ۜۖۚ.f0;
        if (r11 < 0) goto L_0x0113;
    L_0x0110:
        r11 = "ۡۢۗ";
        goto L_0x00f9;
    L_0x0113:
        r11 = "ۚۜۘ";
        goto L_0x000d;
    L_0x0117:
        r11 = f78;
        r12 = s.ۖۜ۟.f34;
        if (r12 < 0) goto L_0x0121;
    L_0x011d:
        r11 = "ۨۛۡ";
        goto L_0x000d;
    L_0x0121:
        r5 = "ۥ۟۫";
        r5 = s.ۜۘۡ.m282(r5);
        r14 = r11;
        r11 = r5;
        r5 = r14;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.XpConfig.getConfig(java.lang.String):com.junge.algorithmAidePro.Config.ConfigReader");
    }

    /* DevToolsApp WARNING: Missing block: B:8:0x002c, code:
            if (s.ۗۢۢ.m454() < 0) goto L_0x00bd;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0035, code:
            if (s.ۡۘۗ.f2 != false) goto L_0x00bd;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x0039, code:
            r8 = "ۦۛ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:19:0x005e, code:
            r8 = "ۘۡۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:28:0x0084, code:
            r8 = "ۧۢۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x008e, code:
            r8 = "ۛۛۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x0098, code:
            r8 = "ۘۡۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x00a2, code:
            r8 = s.ۜۘۡ.m282(r8);
     */
    /* DevToolsApp WARNING: Missing block: B:44:0x00bd, code:
            r8 = "ۜ۫ۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:61:0x0118, code:
            r8 = "۫ۦۢ";
     */
    public static void initClient(java.lang.String r14) {
        /*
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = "ۛۤۤ";
    L_0x000a:
        r8 = s.ۢ۫ۗ.m350(r8);
    L_0x000e:
        switch(r8) {
            case 1739239: goto L_0x00b6;
            case 1740014: goto L_0x0087;
            case 1740029: goto L_0x0030;
            case 1740928: goto L_0x0092;
            case 1740947: goto L_0x0075;
            case 1741171: goto L_0x0025;
            case 1742133: goto L_0x00f0;
            case 1742721: goto L_0x007d;
            case 1743003: goto L_0x0112;
            case 1744167: goto L_0x0045;
            case 1748494: goto L_0x0104;
            case 1748862: goto L_0x0096;
            case 1749324: goto L_0x009b;
            case 1753290: goto L_0x003d;
            case 1753485: goto L_0x004c;
            case 1753657: goto L_0x00de;
            case 1754461: goto L_0x0074;
            case 1754616: goto L_0x00cc;
            case 1758439: goto L_0x001b;
            default: goto L_0x0011;
        };
    L_0x0011:
        r8 = r2 * r5;
        r9 = s.۫۫ۗ.m790();
        if (r9 != 0) goto L_0x00ab;
    L_0x0019:
        goto L_0x00bd;
    L_0x001b:
        s.ۢۜۘ.m255();
        r8 = s.۟ۧۢ.m774();
        if (r8 != 0) goto L_0x010a;
    L_0x0024:
        goto L_0x0039;
    L_0x0025:
        s.۫ۢ۠.m237();
        r8 = s.ۗۢۢ.m454();
        if (r8 >= 0) goto L_0x005e;
    L_0x002e:
        goto L_0x00bd;
    L_0x0030:
        s.ۗ۬ۦ.m407();
        r8 = s.ۡۘۗ.f2;
        if (r8 == 0) goto L_0x0039;
    L_0x0037:
        goto L_0x00bd;
    L_0x0039:
        r8 = "ۦۛ۟";
        goto L_0x00a2;
    L_0x003d:
        s.ۨۘۢ.m318();
        s.ۗ۠ۚ.m442();
        goto L_0x00bd;
    L_0x0045:
        s.۬۟ۜ.m366();
        s.۬۟ۜ.m366();
        return;
    L_0x004c:
        r8 = new com.junge.algorithmAidePro.jungeRPC.AlgorithmClient;
        r9 = f78;
        r10 = s.ۗۗۡ.f4;
        if (r10 != 0) goto L_0x0056;
    L_0x0054:
        goto L_0x010a;
    L_0x0056:
        r10 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r11 = s.ۗۗۡ.m78();
        if (r11 == 0) goto L_0x0061;
    L_0x005e:
        r8 = "ۘۡۦ";
        goto L_0x00a2;
    L_0x0061:
        r11 = 6;
        r12 = s.ۖۙۜ.m589();
        if (r12 > 0) goto L_0x006a;
    L_0x0068:
        goto L_0x010a;
    L_0x006a:
        r9 = s.ۖۜ۟.m485(r9, r10, r11, r7);
        r8.<init>(r9);
        globalAlgorithmClient = r8;
        goto L_0x0084;
    L_0x0074:
        return;
    L_0x0075:
        r8 = new com.junge.algorithmAidePro.jungeRPC.AlgorithmClient;
        r8.<init>(r14);
        algorithmClient = r8;
        goto L_0x008e;
    L_0x007d:
        r8 = globalAlgorithmClient;
        if (r8 != 0) goto L_0x0084;
    L_0x0081:
        r8 = "ۦۡۨ";
        goto L_0x000a;
    L_0x0084:
        r8 = "ۧۢۘ";
        goto L_0x00a2;
    L_0x0087:
        r8 = algorithmClient;
        if (r8 != 0) goto L_0x008e;
    L_0x008b:
        r8 = "ۙ۠ۚ";
        goto L_0x00a2;
    L_0x008e:
        r8 = "ۛۛۡ";
        goto L_0x000a;
    L_0x0092:
        r7 = 49709; // 0xc22d float:6.9657E-41 double:2.45595E-319;
        goto L_0x0098;
    L_0x0096:
        r7 = 9790; // 0x263e float:1.3719E-41 double:4.837E-320;
    L_0x0098:
        r8 = "ۘۡۗ";
        goto L_0x00a2;
    L_0x009b:
        r8 = r6 + 1;
        r8 = r8 - r4;
        if (r8 > 0) goto L_0x00a8;
    L_0x00a0:
        r8 = "ۡۧۤ";
    L_0x00a2:
        r8 = s.ۜۘۡ.m282(r8);
        goto L_0x000e;
    L_0x00a8:
        r8 = "ۙ۟ۦ";
        goto L_0x00a2;
    L_0x00ab:
        r6 = "ۢۗۡ";
        r6 = s.ۢ۫ۗ.m350(r6);
        r13 = r8;
        r8 = r6;
        r6 = r13;
        goto L_0x000e;
    L_0x00b6:
        r8 = r3 * r3;
        r9 = 2;
        r10 = s.ۗۢۢ.f29;
        if (r10 < 0) goto L_0x00c0;
    L_0x00bd:
        r8 = "ۜ۫ۖ";
        goto L_0x00a2;
    L_0x00c0:
        r4 = "ۗۧ۟";
        r4 = s.ۢ۫ۗ.m350(r4);
        r5 = 2;
        r13 = r8;
        r8 = r4;
        r4 = r13;
        goto L_0x000e;
    L_0x00cc:
        r8 = r2 + 1;
        r9 = s.ۨۧۜ.f59;
        if (r9 == 0) goto L_0x00d3;
    L_0x00d2:
        goto L_0x0118;
    L_0x00d3:
        r3 = "ۗۧۗ";
        r3 = s.ۜۘۡ.m282(r3);
        r13 = r8;
        r8 = r3;
        r3 = r13;
        goto L_0x000e;
    L_0x00de:
        r8 = r0[r1];
        r9 = s.ۤۗۛ.f24;
        if (r9 == 0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x0118;
    L_0x00e5:
        r2 = "ۧۧۘ";
        r2 = s.ۜۘۡ.m282(r2);
        r13 = r8;
        r8 = r2;
        r2 = r13;
        goto L_0x000e;
    L_0x00f0:
        r8 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r9 = s.ۦۡۤ.m396();
        if (r9 == 0) goto L_0x00f9;
    L_0x00f8:
        goto L_0x010a;
    L_0x00f9:
        r1 = "ۦۧۚ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r8 = r1;
        r1 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        goto L_0x000e;
    L_0x0104:
        r8 = s.ۡۢۡ.m58();
        if (r8 == 0) goto L_0x010e;
    L_0x010a:
        r8 = "ۙۧۡ";
        goto L_0x000a;
    L_0x010e:
        r8 = "ۚۧۢ";
        goto L_0x000a;
    L_0x0112:
        r8 = f78;
        r9 = s.ۡۘۗ.f2;
        if (r9 == 0) goto L_0x011b;
    L_0x0118:
        r8 = "۫ۦۢ";
        goto L_0x00a2;
    L_0x011b:
        r0 = "ۡۛۨ";
        r0 = s.ۜۘۡ.m282(r0);
        r13 = r8;
        r8 = r0;
        r0 = r13;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.XpConfig.initClient(java.lang.String):void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0023, code:
            if (s.ۢۜۘ.f15 == 0) goto L_0x00d1;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0037, code:
            if (s.۬ۨۨ.m730() == 0) goto L_0x0138;
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x008b, code:
            r11 = "ۢۗۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:31:0x00a0, code:
            r11 = "۠ۛۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:41:0x00d1, code:
            r11 = "ۨۜۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00fc, code:
            r11 = "ۦ۟ۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x0125, code:
            r11 = s.ۢ۫ۗ.m350(r11);
     */
    /* DevToolsApp WARNING: Missing block: B:59:0x0131, code:
            r11 = "ۢۦۗ";
     */
    public static void logInit(android.content.Context r15) {
        /*
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
        r11 = "ۦۗ۬";
    L_0x000d:
        r11 = s.ۜۘۡ.m282(r11);
    L_0x0011:
        switch(r11) {
            case 1738051: goto L_0x009b;
            case 1740759: goto L_0x00b2;
            case 1741285: goto L_0x009e;
            case 1741699: goto L_0x005b;
            case 1742696: goto L_0x0053;
            case 1742876: goto L_0x00a4;
            case 1743125: goto L_0x00c7;
            case 1743526: goto L_0x00f4;
            case 1746599: goto L_0x010a;
            case 1746603: goto L_0x011c;
            case 1747515: goto L_0x007f;
            case 1747889: goto L_0x012b;
            case 1749328: goto L_0x0030;
            case 1749779: goto L_0x0027;
            case 1753405: goto L_0x001e;
            case 1755083: goto L_0x006c;
            case 1755234: goto L_0x003b;
            case 1757984: goto L_0x00e0;
            case 1758090: goto L_0x0040;
            case 1759337: goto L_0x0047;
            default: goto L_0x0014;
        };
    L_0x0014:
        r11 = f78;
        r12 = s.ۜۖۚ.m7();
        if (r12 < 0) goto L_0x013b;
    L_0x001c:
        goto L_0x0138;
    L_0x001e:
        s.ۦۢۜ.m16();
        r11 = s.ۢۜۘ.f15;
        if (r11 != 0) goto L_0x0131;
    L_0x0025:
        goto L_0x00d1;
    L_0x0027:
        s.ۢ۫ۗ.m342();
        r11 = s.ۚ۟ۢ.f5;
        if (r11 == 0) goto L_0x008b;
    L_0x002e:
        goto L_0x00d1;
    L_0x0030:
        s.ۗۗۡ.m78();
        r11 = s.۬ۨۨ.m730();
        if (r11 != 0) goto L_0x00d1;
    L_0x0039:
        goto L_0x0138;
    L_0x003b:
        s.ۨۧۜ.m755();
        goto L_0x0138;
    L_0x0040:
        s.ۢ۟ۚ.m168();
        s.ۡۗۗ.m159();
        return;
    L_0x0047:
        r0 = com.junge.algorithmAidePro.Utils.VxpTools.getVxpContext();
        r15 = s.ۙۜۦ.m522(r15);
        logInit(r0, r15);
        return;
    L_0x0053:
        r0 = s.ۙۜۦ.m522(r15);
        logInit(r15, r0);
        return;
    L_0x005b:
        r11 = 3;
        r11 = s.ۡۥۗ.m567(r2, r3, r11, r1);
        r11 = s.ۡۘۗ.m39(r0, r11);
        if (r11 == 0) goto L_0x0069;
    L_0x0066:
        r11 = "۬ۤۡ";
        goto L_0x000d;
    L_0x0069:
        r11 = "ۛۚۧ";
        goto L_0x000d;
    L_0x006c:
        r11 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r12 = s.۫ۢ۠.m237();
        if (r12 < 0) goto L_0x0075;
    L_0x0074:
        goto L_0x00d1;
    L_0x0075:
        r3 = "ۚۙۢ";
        r3 = s.ۜۘۡ.m282(r3);
        r11 = r3;
        r3 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        goto L_0x0011;
    L_0x007f:
        r11 = s.ۢ۫ۜ.m624();
        r12 = f78;
        r13 = s.ۚ۟ۢ.m85();
        if (r13 == 0) goto L_0x008f;
    L_0x008b:
        r11 = "ۢۗۥ";
        goto L_0x000d;
    L_0x008f:
        r0 = "ۨۗۚ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r2 = r12;
        r14 = r11;
        r11 = r0;
        r0 = r14;
        goto L_0x0011;
    L_0x009b:
        r1 = 13496; // 0x34b8 float:1.8912E-41 double:6.668E-320;
        goto L_0x00a0;
    L_0x009e:
        r1 = 14715; // 0x397b float:2.062E-41 double:7.27E-320;
    L_0x00a0:
        r11 = "۠ۛۖ";
        goto L_0x000d;
    L_0x00a4:
        r11 = r9 + r10;
        r11 = r11 + r11;
        r11 = r11 - r8;
        if (r11 >= 0) goto L_0x00ae;
    L_0x00aa:
        r11 = "ۖ۟۬";
        goto L_0x0125;
    L_0x00ae:
        r11 = "ۙ۫ۗ";
        goto L_0x000d;
    L_0x00b2:
        r11 = 58232161; // 0x3788d61 float:7.3042945E-37 double:2.877051E-316;
        r12 = s.ۚۤۙ.f18;
        if (r12 > 0) goto L_0x00bb;
    L_0x00b9:
        goto L_0x0138;
    L_0x00bb:
        r10 = "ۛ۠ۡ";
        r10 = s.ۜۘۡ.m282(r10);
        r11 = r10;
        r10 = 58232161; // 0x3788d61 float:7.3042945E-37 double:2.877051E-316;
        goto L_0x0011;
    L_0x00c7:
        r11 = r7 * r7;
        r12 = r6 * r6;
        r13 = s.ۨۧۚ.m718();
        if (r13 > 0) goto L_0x00d4;
    L_0x00d1:
        r11 = "ۨۜۖ";
        goto L_0x0125;
    L_0x00d4:
        r8 = "ۙۚۘ";
        r8 = s.ۜۘۡ.m282(r8);
        r9 = r12;
        r14 = r11;
        r11 = r8;
        r8 = r14;
        goto L_0x0011;
    L_0x00e0:
        r11 = r6 + 7631;
        r12 = s.ۢ۟ۚ.m168();
        if (r12 > 0) goto L_0x00e9;
    L_0x00e8:
        goto L_0x00fc;
    L_0x00e9:
        r7 = "ۛۨۢ";
        r7 = s.ۢ۫ۗ.m350(r7);
        r14 = r11;
        r11 = r7;
        r7 = r14;
        goto L_0x0011;
    L_0x00f4:
        r11 = r4[r5];
        r12 = s.ۨۧۜ.m755();
        if (r12 < 0) goto L_0x00ff;
    L_0x00fc:
        r11 = "ۦ۟ۖ";
        goto L_0x0125;
    L_0x00ff:
        r6 = "۫ۗ۬";
        r6 = s.ۜۘۡ.m282(r6);
        r14 = r11;
        r11 = r6;
        r6 = r14;
        goto L_0x0011;
    L_0x010a:
        r11 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r12 = s.ۗۜۛ.f55;
        if (r12 == 0) goto L_0x0111;
    L_0x0110:
        goto L_0x0131;
    L_0x0111:
        r5 = "ۜۖ۠";
        r5 = s.ۢ۫ۗ.m350(r5);
        r11 = r5;
        r5 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        goto L_0x0011;
    L_0x011c:
        r11 = s.ۤۗۛ.m370();
        if (r11 < 0) goto L_0x0123;
    L_0x0122:
        goto L_0x0138;
    L_0x0123:
        r11 = "۟ۜۤ";
    L_0x0125:
        r11 = s.ۢ۫ۗ.m350(r11);
        goto L_0x0011;
    L_0x012b:
        r11 = s.۫ۢ۠.m237();
        if (r11 < 0) goto L_0x0134;
    L_0x0131:
        r11 = "ۢۦۗ";
        goto L_0x0125;
    L_0x0134:
        r11 = "۟ۜۨ";
        goto L_0x000d;
    L_0x0138:
        r11 = "۫ۛۚ";
        goto L_0x0125;
    L_0x013b:
        r4 = "۠ۧۘ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r14 = r11;
        r11 = r4;
        r4 = r14;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.XpConfig.logInit(android.content.Context):void");
    }

    /* DevToolsApp WARNING: Missing block: B:7:0x0030, code:
            r20 = r4;
            r21 = r6;
            r22 = r7;
            r27 = r10;
            r28 = r11;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x004a, code:
            r20 = r4;
            r21 = r6;
            r22 = r7;
            r27 = r10;
            r28 = r11;
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x008d, code:
            r20 = s.ۢ۫ۗ.m350(r20);
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x0098, code:
            r20 = "۟۟ۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x00f9, code:
            r4 = s.ۢ۫ۗ.m350(r4);
     */
    /* DevToolsApp WARNING: Missing block: B:72:0x0158, code:
            r4 = s.ۜۘۡ.m282(r4);
     */
    /* DevToolsApp WARNING: Missing block: B:85:0x01af, code:
            r9 = r4;
            r4 = r20;
            r20 = r29;
     */
    /* DevToolsApp WARNING: Missing block: B:86:0x01b5, code:
            r22 = r7;
     */
    /* DevToolsApp WARNING: Missing block: B:95:0x01e8, code:
            r4 = s.ۢ۫ۗ.m350("ۡۦۚ");
            r6 = r21;
     */
    /* DevToolsApp WARNING: Missing block: B:98:0x0201, code:
            r4 = "ۨۤ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:103:0x021f, code:
            r4 = "ۘ۟ۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:108:0x0244, code:
            r4 = "ۥۤۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:109:0x0246, code:
            r4 = s.ۢ۫ۗ.m350(r4);
     */
    /* DevToolsApp WARNING: Missing block: B:123:0x02da, code:
            r4 = "ۤۤ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:124:0x02dc, code:
            r4 = s.ۜۘۡ.m282(r4);
     */
    /* DevToolsApp WARNING: Missing block: B:128:0x02f3, code:
            r4 = s.ۢ۫ۗ.m350(r4);
     */
    /* DevToolsApp WARNING: Missing block: B:129:0x02f7, code:
            r6 = r21;
     */
    /* DevToolsApp WARNING: Missing block: B:130:0x02f9, code:
            r7 = r22;
     */
    /* DevToolsApp WARNING: Missing block: B:131:0x02fb, code:
            r10 = r27;
     */
    /* DevToolsApp WARNING: Missing block: B:132:0x02fd, code:
            r11 = r28;
     */
    /* DevToolsApp WARNING: Missing block: B:133:0x02ff, code:
            r29 = r20;
            r20 = r4;
            r4 = r29;
     */
    /* DevToolsApp WARNING: Missing block: B:140:0x033f, code:
            r4 = "۟ۜۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:142:0x034c, code:
            r16 = r4;
            r17 = r6;
            r4 = r20;
            r6 = r21;
            r10 = r27;
            r11 = r28;
            r20 = r7;
            r7 = r22;
     */
    /* DevToolsApp WARNING: Missing block: B:145:0x036a, code:
            r4 = "ۛۧۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:149:0x038f, code:
            r4 = "۫ۤ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:151:0x03a2, code:
            r20 = r6;
            r6 = r21;
     */
    public static com.junge.algorithmAidePro.Config.ConfigReader getConfig(android.content.Context r30, java.lang.String r31) {
        /*
        r0 = r31;
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
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r20 = "ۘۧۘ";
    L_0x001b:
        r20 = s.ۜۘۡ.m282(r20);
    L_0x001f:
        switch(r20) {
            case 1737827: goto L_0x00db;
            case 1737891: goto L_0x035a;
            case 1738298: goto L_0x030a;
            case 1739672: goto L_0x00a8;
            case 1739965: goto L_0x017a;
            case 1740060: goto L_0x010a;
            case 1740201: goto L_0x037f;
            case 1740990: goto L_0x00da;
            case 1741331: goto L_0x00b5;
            case 1741612: goto L_0x015e;
            case 1742046: goto L_0x0061;
            case 1742137: goto L_0x014a;
            case 1742852: goto L_0x024c;
            case 1743086: goto L_0x00ea;
            case 1743099: goto L_0x0073;
            case 1743953: goto L_0x0092;
            case 1746587: goto L_0x00a3;
            case 1746600: goto L_0x002a;
            case 1746678: goto L_0x009b;
            case 1748361: goto L_0x032b;
            case 1748642: goto L_0x00ef;
            case 1748704: goto L_0x018c;
            case 1748821: goto L_0x0046;
            case 1749821: goto L_0x02e1;
            case 1749939: goto L_0x02cd;
            case 1751486: goto L_0x0109;
            case 1751659: goto L_0x0295;
            case 1752599: goto L_0x01b9;
            case 1753210: goto L_0x026b;
            case 1753825: goto L_0x00cf;
            case 1755186: goto L_0x0223;
            case 1755492: goto L_0x006c;
            case 1755522: goto L_0x0059;
            case 1755559: goto L_0x00e5;
            case 1755581: goto L_0x02bf;
            case 1758219: goto L_0x0231;
            case 1758374: goto L_0x0086;
            default: goto L_0x0022;
        };
    L_0x0022:
        r20 = s.ۦۢۜ.m16();
        if (r20 == 0) goto L_0x004a;
    L_0x0028:
        goto L_0x0098;
    L_0x002a:
        r20 = s.۠ۡۧ.m431();
        if (r20 == 0) goto L_0x003c;
    L_0x0030:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        goto L_0x036a;
    L_0x003c:
        r20 = r4;
        r21 = r6;
        r27 = r10;
        r28 = r11;
        goto L_0x01e8;
    L_0x0046:
        r20 = s.ۨۘۢ.f19;
        if (r20 == 0) goto L_0x0056;
    L_0x004a:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        goto L_0x0201;
    L_0x0056:
        r20 = "ۨۥ۟";
        goto L_0x008d;
    L_0x0059:
        r20 = s.ۗۢۢ.f29;
        if (r20 < 0) goto L_0x005e;
    L_0x005d:
        goto L_0x0030;
    L_0x005e:
        r20 = "ۚۤۨ";
        goto L_0x008d;
    L_0x0061:
        s.ۢ۟ۚ.m168();
        r20 = s.ۢ۫ۗ.f21;
        if (r20 != 0) goto L_0x0069;
    L_0x0068:
        goto L_0x008b;
    L_0x0069:
        r20 = "ۙۥۛ";
        goto L_0x008d;
    L_0x006c:
        r20 = s.ۡۥۗ.m568();
        if (r20 == 0) goto L_0x0030;
    L_0x0072:
        goto L_0x0098;
    L_0x0073:
        r20 = s.ۧۧۡ.m183();
        if (r20 > 0) goto L_0x007a;
    L_0x0079:
        goto L_0x008b;
    L_0x007a:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        goto L_0x038f;
    L_0x0086:
        r20 = s.ۗۗۡ.f4;
        if (r20 != 0) goto L_0x008b;
    L_0x008a:
        goto L_0x0098;
    L_0x008b:
        r20 = "ۜۤۙ";
    L_0x008d:
        r20 = s.ۢ۫ۗ.m350(r20);
        goto L_0x001f;
    L_0x0092:
        s.ۜۖۚ.m7();
        s.ۢ۫ۜ.m625();
    L_0x0098:
        r20 = "۟۟ۖ";
        goto L_0x001b;
    L_0x009b:
        s.ۛ۫ۧ.m593();
        s.۠ۡۧ.m431();
        r0 = 0;
        return r0;
    L_0x00a3:
        r0 = com.junge.algorithmAidePro.Config.ConfigReader.getInstanceByReadOnly(r13);
        return r0;
    L_0x00a8:
        r20 = s.ۡۘۗ.m39(r13, r6);
        if (r20 != 0) goto L_0x00b2;
    L_0x00ae:
        r20 = "۟ۜۘ";
        goto L_0x001b;
    L_0x00b2:
        r20 = r4;
        goto L_0x00e2;
    L_0x00b5:
        r12.moveToFirst();
        r20 = r4;
        r4 = 0;
        r4 = s.ۢ۫ۜ.m636(r12, r4);
        s.۠ۡ۟.m134(r12);
        if (r4 == 0) goto L_0x00e2;
    L_0x00c4:
        r13 = "ۘۖۖ";
        r13 = s.ۢ۫ۗ.m350(r13);
        r29 = r13;
        r13 = r4;
        goto L_0x01af;
    L_0x00cf:
        r20 = r4;
        r4 = r12.getCount();
        if (r4 <= 0) goto L_0x00e2;
    L_0x00d7:
        r4 = "ۙ۬ۦ";
        goto L_0x00f9;
    L_0x00da:
        return r10;
    L_0x00db:
        r20 = r4;
        if (r12 == 0) goto L_0x00e2;
    L_0x00df:
        r4 = "ۦ۬ۧ";
        goto L_0x00f9;
    L_0x00e2:
        r4 = "ۙۡۦ";
        goto L_0x00f9;
    L_0x00e5:
        r0 = com.junge.algorithmAidePro.Config.ConfigReader.getInstanceByReadOnly(r11);
        return r0;
    L_0x00ea:
        r0 = com.junge.algorithmAidePro.Config.ConfigReader.getInstanceByReadOnly(r9);
        return r0;
    L_0x00ef:
        r20 = r4;
        r4 = s.ۡۘۗ.m39(r11, r6);
        if (r4 != 0) goto L_0x00ff;
    L_0x00f7:
        r4 = "ۨۦۥ";
    L_0x00f9:
        r4 = s.ۢ۫ۗ.m350(r4);
        goto L_0x02ff;
    L_0x00ff:
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        goto L_0x021f;
    L_0x0109:
        return r10;
    L_0x010a:
        r20 = r4;
        r21 = s.۬۟ۜ.m355(r30);	 Catch:{ Exception -> 0x0141 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0141 }
        r4.<init>();	 Catch:{ Exception -> 0x0141 }
        r12 = f78;	 Catch:{ Exception -> 0x0141 }
        r27 = r10;
        r10 = 81;
        r28 = r11;
        r11 = 27;
        r10 = s.ۡۥۗ.m567(r12, r10, r11, r1);	 Catch:{ Exception -> 0x0145 }
        s.ۢ۫ۜ.m637(r4, r10);	 Catch:{ Exception -> 0x0145 }
        s.ۗۜۛ.m701(r4, r0);	 Catch:{ Exception -> 0x0145 }
        r4 = s.ۦۡۤ.m398(r4);	 Catch:{ Exception -> 0x0145 }
        r22 = s.۬ۗ۫.m105(r4);	 Catch:{ Exception -> 0x0145 }
        r23 = new java.lang.String[]{r8};	 Catch:{ Exception -> 0x0145 }
        r24 = 0;
        r25 = 0;
        r26 = 0;
        r4 = r21.query(r22, r23, r24, r25, r26);	 Catch:{ Exception -> 0x0145 }
        r12 = r4;
        goto L_0x0147;
    L_0x0141:
        r27 = r10;
        r28 = r11;
    L_0x0145:
        r12 = r27;
    L_0x0147:
        r4 = "ۖۘۥ";
        goto L_0x0158;
    L_0x014a:
        r20 = r4;
        r27 = r10;
        r28 = r11;
        r4 = s.ۡۘۗ.m39(r9, r6);
        if (r4 != 0) goto L_0x01b5;
    L_0x0156:
        r4 = "ۛۧۚ";
    L_0x0158:
        r4 = s.ۜۘۡ.m282(r4);
        goto L_0x02fb;
    L_0x015e:
        r20 = r4;
        r27 = r10;
        r28 = r11;
        r11 = r7.getString(r0, r6);
        if (r11 == 0) goto L_0x0174;
    L_0x016a:
        r4 = "ۡ۠ۡ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r10 = r27;
        goto L_0x02ff;
    L_0x0174:
        r21 = r6;
        r22 = r7;
        goto L_0x021f;
    L_0x017a:
        r20 = r4;
        r28 = r11;
        r10 = 0;
        if (r30 != 0) goto L_0x0184;
    L_0x0181:
        r4 = "ۤ۟ۙ";
        goto L_0x0186;
    L_0x0184:
        r4 = "ۘۢۦ";
    L_0x0186:
        r4 = s.ۜۘۡ.m282(r4);
        goto L_0x02fd;
    L_0x018c:
        r20 = r4;
        r27 = r10;
        r28 = r11;
        r4 = f78;
        r10 = 70;
        r11 = 11;
        r4 = s.ۦۡۤ.m394(r4, r10, r11, r1);
        r4 = r5.getConfig(r4);
        if (r4 == 0) goto L_0x01b5;
    L_0x01a2:
        r9 = "ۚۧۦ";
        r9 = s.ۜۘۡ.m282(r9);
        r10 = r27;
        r11 = r28;
        r29 = r9;
        r9 = r4;
    L_0x01af:
        r4 = r20;
        r20 = r29;
        goto L_0x001f;
    L_0x01b5:
        r22 = r7;
        goto L_0x0244;
    L_0x01b9:
        r20 = r4;
        r27 = r10;
        r28 = r11;
        r4 = new de.robv.android.xposed.XSharedPreferences;
        r10 = f78;
        r21 = s.۟ۤۗ.m332();
        if (r21 > 0) goto L_0x01ce;
    L_0x01c9:
        r21 = r6;
        r22 = r7;
        goto L_0x0201;
    L_0x01ce:
        r11 = 26;
        r22 = s.ۦۡۤ.f25;
        if (r22 == 0) goto L_0x01da;
    L_0x01d4:
        r21 = r6;
        r22 = r7;
        goto L_0x033f;
    L_0x01da:
        r21 = r6;
        r6 = 38;
        r6 = s.۬ۨۨ.m722(r10, r6, r11, r1);
        r10 = f78;
        r11 = s.ۡۘۗ.f2;
        if (r11 == 0) goto L_0x01f2;
    L_0x01e8:
        r4 = "ۡۦۚ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r6 = r21;
        goto L_0x02fb;
    L_0x01f2:
        r11 = 64;
        r22 = r7;
        r7 = 6;
        r7 = s.ۨۗۥ.m531(r10, r11, r7, r1);
        r10 = s.ۙۖۥ.m748();
        if (r10 > 0) goto L_0x0205;
    L_0x0201:
        r4 = "ۨۤ۠";
        goto L_0x02f3;
    L_0x0205:
        r4.<init>(r6, r7);
        r6 = r4.contains(r0);
        if (r6 == 0) goto L_0x021e;
    L_0x020e:
        r6 = "ۚۖۨ";
        r6 = s.ۢ۫ۗ.m350(r6);
        r8 = r7;
        r10 = r27;
        r11 = r28;
        r7 = r4;
        r4 = r20;
        goto L_0x03a2;
    L_0x021e:
        r8 = r7;
    L_0x021f:
        r4 = "ۘ۟ۤ";
        goto L_0x02f3;
    L_0x0223:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        r4 = globalAlgorithmClient;
        r5 = r4;
        goto L_0x0267;
    L_0x0231:
        r20 = r4;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        r4 = s.۫۫ۗ.m795(r5);
        r6 = "";
        if (r4 == 0) goto L_0x0244;
    L_0x0241:
        r4 = "ۡۢۡ";
        goto L_0x0246;
    L_0x0244:
        r4 = "ۥۤۖ";
    L_0x0246:
        r4 = s.ۢ۫ۗ.m350(r4);
        goto L_0x02f9;
    L_0x024c:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        r4 = 6;
        r4 = s.ۨۘۢ.m314(r2, r3, r4, r1);
        r4 = s.ۡۢۡ.m60(r0, r4);
        if (r4 == 0) goto L_0x0265;
    L_0x0261:
        r4 = "ۨۚۤ";
        goto L_0x02dc;
    L_0x0265:
        r5 = r20;
    L_0x0267:
        r4 = "۫۟۟";
        goto L_0x02dc;
    L_0x026b:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        r4 = 32;
        r6 = s.۬۟ۜ.m366();
        if (r6 == 0) goto L_0x027f;
    L_0x027d:
        goto L_0x038f;
    L_0x027f:
        r3 = "ۛ۟ۨ";
        r3 = s.ۜۘۡ.m282(r3);
        r4 = r20;
        r6 = r21;
        r7 = r22;
        r10 = r27;
        r11 = r28;
        r20 = r3;
        r3 = 32;
        goto L_0x001f;
    L_0x0295:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        initClient(r31);
        r4 = algorithmClient;
        r6 = f78;
        r7 = s.ۢۜۘ.m255();
        if (r7 > 0) goto L_0x02ae;
    L_0x02ac:
        goto L_0x036a;
    L_0x02ae:
        r2 = "ۦۘ۬";
        r20 = s.ۢ۫ۗ.m350(r2);
        r2 = r6;
        r6 = r21;
        r7 = r22;
        r10 = r27;
        r11 = r28;
        goto L_0x001f;
    L_0x02bf:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        r1 = 49796; // 0xc284 float:6.9779E-41 double:2.46025E-319;
        goto L_0x02da;
    L_0x02cd:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        r1 = 58369; // 0xe401 float:8.1792E-41 double:2.8838E-319;
    L_0x02da:
        r4 = "ۤۤ۫";
    L_0x02dc:
        r4 = s.ۜۘۡ.m282(r4);
        goto L_0x02f7;
    L_0x02e1:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        r4 = r19 + 1;
        r4 = r18 - r4;
        if (r4 < 0) goto L_0x0307;
    L_0x02f1:
        r4 = "ۢ۫ۜ";
    L_0x02f3:
        r4 = s.ۢ۫ۗ.m350(r4);
    L_0x02f7:
        r6 = r21;
    L_0x02f9:
        r7 = r22;
    L_0x02fb:
        r10 = r27;
    L_0x02fd:
        r11 = r28;
    L_0x02ff:
        r29 = r20;
        r20 = r4;
        r4 = r29;
        goto L_0x001f;
    L_0x0307:
        r4 = "ۨۧۜ";
        goto L_0x02f3;
    L_0x030a:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        r4 = r17 * r17;
        r6 = r16 * 2;
        r7 = s.ۚ۟ۢ.m85();
        if (r7 == 0) goto L_0x0320;
    L_0x031e:
        goto L_0x038f;
    L_0x0320:
        r7 = "ۢۧۢ";
        r7 = s.ۢ۫ۗ.m350(r7);
        r18 = r4;
        r19 = r6;
        goto L_0x034c;
    L_0x032b:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        r4 = r14[r15];
        r6 = r4 + 1;
        r7 = s.ۛۨۦ.m559();
        if (r7 == 0) goto L_0x0342;
    L_0x033f:
        r4 = "۟ۜۥ";
        goto L_0x02dc;
    L_0x0342:
        r7 = "ۖۧ۫";
        r7 = s.ۢ۫ۗ.m350(r7);
        r16 = r4;
        r17 = r6;
    L_0x034c:
        r4 = r20;
        r6 = r21;
        r10 = r27;
        r11 = r28;
        r20 = r7;
        r7 = r22;
        goto L_0x001f;
    L_0x035a:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        r4 = 31;
        r6 = s.ۢ۫ۜ.f51;
        if (r6 < 0) goto L_0x036e;
    L_0x036a:
        r4 = "ۛۧۧ";
        goto L_0x02dc;
    L_0x036e:
        r6 = "ۡۗ۟";
        r6 = s.ۜۘۡ.m282(r6);
        r4 = r20;
        r7 = r22;
        r10 = r27;
        r11 = r28;
        r15 = 31;
        goto L_0x03a2;
    L_0x037f:
        r20 = r4;
        r21 = r6;
        r22 = r7;
        r27 = r10;
        r28 = r11;
        r4 = f78;
        r6 = s.ۢ۫ۜ.f51;
        if (r6 < 0) goto L_0x0393;
    L_0x038f:
        r4 = "۫ۤ۟";
        goto L_0x02dc;
    L_0x0393:
        r6 = "ۖۚۧ";
        r6 = s.ۜۘۡ.m282(r6);
        r14 = r4;
        r4 = r20;
        r7 = r22;
        r10 = r27;
        r11 = r28;
    L_0x03a2:
        r20 = r6;
        r6 = r21;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.XpConfig.getConfig(android.content.Context, java.lang.String):com.junge.algorithmAidePro.Config.ConfigReader");
    }

    /* DevToolsApp WARNING: Missing block: B:23:0x0075, code:
            r11 = "ۚ۠ۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x00c9, code:
            r11 = "ۚۧۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00f6, code:
            r11 = s.ۢ۫ۗ.m350(r11);
     */
    /* DevToolsApp WARNING: Missing block: B:51:0x0100, code:
            r11 = "۬ۚ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x010d, code:
            r11 = "۟ۥۤ";
     */
    public static com.junge.algorithmAidePro.Config.ConfigReader getGlobalConfig(android.content.Context r15) {
        /*
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
        r11 = "ۤۗۢ";
    L_0x000d:
        r11 = s.ۜۘۡ.m282(r11);
    L_0x0011:
        switch(r11) {
            case 1739005: goto L_0x00d7;
            case 1741916: goto L_0x0057;
            case 1742135: goto L_0x002e;
            case 1743527: goto L_0x00eb;
            case 1746878: goto L_0x0034;
            case 1747644: goto L_0x0039;
            case 1748857: goto L_0x006f;
            case 1748894: goto L_0x0079;
            case 1749283: goto L_0x0098;
            case 1751247: goto L_0x0107;
            case 1751365: goto L_0x0047;
            case 1751876: goto L_0x0073;
            case 1752353: goto L_0x00c1;
            case 1752735: goto L_0x0085;
            case 1755204: goto L_0x00af;
            case 1758490: goto L_0x00fc;
            case 1758507: goto L_0x0023;
            case 1759274: goto L_0x003e;
            default: goto L_0x0014;
        };
    L_0x0014:
        s.۠ۡۧ.m431();
        r11 = s.ۦۡۤ.m396();
        if (r11 == 0) goto L_0x001f;
    L_0x001d:
        goto L_0x00f1;
    L_0x001f:
        r11 = "۫ۨۨ";
        goto L_0x00f6;
    L_0x0023:
        s.ۢ۟ۚ.m168();
        r11 = s.ۤۤۖ.m506();
        if (r11 != 0) goto L_0x00c9;
    L_0x002c:
        goto L_0x010d;
    L_0x002e:
        r11 = s.ۘۡۜ.f54;
        if (r11 == 0) goto L_0x010d;
    L_0x0032:
        goto L_0x00f1;
    L_0x0034:
        s.۟ۤۗ.m332();
        goto L_0x00f1;
    L_0x0039:
        s.ۗ۬ۦ.m407();
        r15 = 0;
        return r15;
    L_0x003e:
        r0 = s.ۖۙۜ.m585(r1, r2, r3, r0);
        r15 = getConfig(r15, r0);
        return r15;
    L_0x0047:
        r11 = 6;
        r12 = s.ۗۜۛ.f55;
        if (r12 == 0) goto L_0x004e;
    L_0x004c:
        goto L_0x00c9;
    L_0x004e:
        r3 = "۬ۢ۠";
        r3 = s.ۜۘۡ.m282(r3);
        r11 = r3;
        r3 = 6;
        goto L_0x0011;
    L_0x0057:
        r11 = f78;
        r12 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r13 = s.۫۫ۗ.m790();
        if (r13 != 0) goto L_0x0063;
    L_0x0061:
        goto L_0x010d;
    L_0x0063:
        r1 = "ۤۛۜ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r2 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r14 = r11;
        r11 = r1;
        r1 = r14;
        goto L_0x0011;
    L_0x006f:
        r0 = 54470; // 0xd4c6 float:7.6329E-41 double:2.6912E-319;
        goto L_0x0075;
    L_0x0073:
        r0 = 16199; // 0x3f47 float:2.27E-41 double:8.0034E-320;
    L_0x0075:
        r11 = "ۚ۠ۢ";
        goto L_0x00f6;
    L_0x0079:
        r11 = r10 + 1;
        r11 = r8 - r11;
        if (r11 >= 0) goto L_0x0082;
    L_0x007f:
        r11 = "ۡۧ۟";
        goto L_0x000d;
    L_0x0082:
        r11 = "ۤ۫۫";
        goto L_0x000d;
    L_0x0085:
        r11 = r6 * r9;
        r12 = s.ۡۢۡ.f3;
        if (r12 < 0) goto L_0x008d;
    L_0x008b:
        goto L_0x010d;
    L_0x008d:
        r10 = "ۡۨۥ";
        r10 = s.ۜۘۡ.m282(r10);
        r14 = r11;
        r11 = r10;
        r10 = r14;
        goto L_0x0011;
    L_0x0098:
        r11 = r7 * r7;
        r12 = 2;
        r13 = s.۟ۥۙ.m650();
        if (r13 > 0) goto L_0x00a3;
    L_0x00a1:
        goto L_0x0100;
    L_0x00a3:
        r8 = "ۥۨۢ";
        r8 = s.ۢ۫ۗ.m350(r8);
        r9 = 2;
        r14 = r11;
        r11 = r8;
        r8 = r14;
        goto L_0x0011;
    L_0x00af:
        r11 = r6 + 1;
        r12 = s.ۡۢۡ.f3;
        if (r12 < 0) goto L_0x00b6;
    L_0x00b5:
        goto L_0x0100;
    L_0x00b6:
        r7 = "ۢۖۗ";
        r7 = s.ۜۘۡ.m282(r7);
        r14 = r11;
        r11 = r7;
        r7 = r14;
        goto L_0x0011;
    L_0x00c1:
        r11 = r4[r5];
        r12 = s.ۗۜ۟.m469();
        if (r12 > 0) goto L_0x00cc;
    L_0x00c9:
        r11 = "ۚۧۤ";
        goto L_0x00f6;
    L_0x00cc:
        r6 = "ۨۛۗ";
        r6 = s.ۜۘۡ.m282(r6);
        r14 = r11;
        r11 = r6;
        r6 = r14;
        goto L_0x0011;
    L_0x00d7:
        r11 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r12 = s.ۙۖۥ.m748();
        if (r12 > 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x0100;
    L_0x00e0:
        r5 = "ۥۜۘ";
        r5 = s.ۜۘۡ.m282(r5);
        r11 = r5;
        r5 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        goto L_0x0011;
    L_0x00eb:
        r11 = s.ۗ۠ۚ.m442();
        if (r11 > 0) goto L_0x00f4;
    L_0x00f1:
        r11 = "۠۟ۛ";
        goto L_0x00f6;
    L_0x00f4:
        r11 = "ۗ۟ۥ";
    L_0x00f6:
        r11 = s.ۢ۫ۗ.m350(r11);
        goto L_0x0011;
    L_0x00fc:
        r11 = s.ۗ۬ۦ.f27;
        if (r11 == 0) goto L_0x0103;
    L_0x0100:
        r11 = "۬ۚ۟";
        goto L_0x00f6;
    L_0x0103:
        r11 = "ۜۖۡ";
        goto L_0x000d;
    L_0x0107:
        r11 = f78;
        r12 = s.۫۫ۗ.f65;
        if (r12 == 0) goto L_0x0111;
    L_0x010d:
        r11 = "۟ۥۤ";
        goto L_0x000d;
    L_0x0111:
        r4 = "۫ۨۗ";
        r4 = s.ۜۘۡ.m282(r4);
        r14 = r11;
        r11 = r4;
        r4 = r14;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.XpConfig.getGlobalConfig(android.content.Context):com.junge.algorithmAidePro.Config.ConfigReader");
    }

    /* DevToolsApp WARNING: Missing block: B:7:0x0047, code:
            r19 = r6;
            r20 = r7;
            r21 = r8;
            r18 = r12;
            r22 = r13;
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x0060, code:
            if (s.ۢ۫ۗ.f21 == false) goto L_0x00bd;
     */
    /* DevToolsApp WARNING: Missing block: B:19:0x007f, code:
            r19 = r6;
            r20 = r7;
            r21 = r8;
            r18 = r12;
            r22 = r13;
     */
    /* DevToolsApp WARNING: Missing block: B:22:0x0092, code:
            if (s.ۡۗۗ.m159() != 0) goto L_0x0094;
     */
    /* DevToolsApp WARNING: Missing block: B:23:0x0094, code:
            r19 = r6;
            r20 = r7;
            r21 = r8;
            r18 = r12;
            r22 = r13;
     */
    /* DevToolsApp WARNING: Missing block: B:24:0x00a0, code:
            r18 = "ۧ۟ۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:25:0x00a2, code:
            r18 = s.ۢ۫ۗ.m350(r18);
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x00af, code:
            if (s.ۗۜۛ.m698() <= 0) goto L_0x00bd;
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x00b4, code:
            if (s.ۥۥۚ.f50 == 0) goto L_0x00bd;
     */
    /* DevToolsApp WARNING: Missing block: B:31:0x00bd, code:
            r18 = s.ۜۘۡ.m282("ۤۗۡ");
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x00eb, code:
            r12 = r29;
     */
    /* DevToolsApp WARNING: Missing block: B:40:0x00ef, code:
            r19 = r6;
            r20 = r7;
            r21 = r8;
            r22 = r13;
     */
    /* DevToolsApp WARNING: Missing block: B:58:0x016a, code:
            r6 = "۠۫ۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:61:0x0182, code:
            r6 = "ۙۜۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:64:0x018e, code:
            r6 = "ۙۧ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:83:0x022f, code:
            r6 = "ۖ۟ۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:100:0x02df, code:
            r6 = "ۗۙ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:104:0x02f4, code:
            r6 = s.ۜۘۡ.m282(r6);
     */
    /* DevToolsApp WARNING: Missing block: B:114:0x0346, code:
            r6 = "ۘ۠ۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:118:0x036a, code:
            r6 = "۬ۘۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:122:0x038e, code:
            r6 = "ۘ۫ۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:124:0x039e, code:
            r8 = r21;
            r13 = r22;
     */
    /* DevToolsApp WARNING: Missing block: B:125:0x03a2, code:
            r18 = r7;
            r7 = r20;
     */
    public static boolean isSwitch(android.content.Context r30, java.lang.String r31) {
        /*
        r0 = r30;
        r1 = r31;
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
        r17 = 0;
        r18 = "ۦۗۛ";
        r18 = s.ۜۘۡ.m282(r18);
        r10 = 0;
        r17 = 0;
        r29 = r16;
        r16 = r9;
        r9 = r29;
    L_0x0025:
        switch(r18) {
            case 1737824: goto L_0x035a;
            case 1738031: goto L_0x01ad;
            case 1738139: goto L_0x02d1;
            case 1738813: goto L_0x028f;
            case 1738857: goto L_0x005e;
            case 1738901: goto L_0x016e;
            case 1738915: goto L_0x00cd;
            case 1739740: goto L_0x0255;
            case 1739998: goto L_0x00b2;
            case 1740334: goto L_0x003e;
            case 1740820: goto L_0x0076;
            case 1741169: goto L_0x0063;
            case 1741316: goto L_0x0156;
            case 1741982: goto L_0x01c1;
            case 1742142: goto L_0x0237;
            case 1746472: goto L_0x0238;
            case 1746606: goto L_0x00ff;
            case 1746979: goto L_0x0056;
            case 1748014: goto L_0x00f9;
            case 1748761: goto L_0x030d;
            case 1749317: goto L_0x01cd;
            case 1749752: goto L_0x00fa;
            case 1751238: goto L_0x01cf;
            case 1751246: goto L_0x00c5;
            case 1753140: goto L_0x0334;
            case 1753162: goto L_0x037e;
            case 1754368: goto L_0x00a8;
            case 1755523: goto L_0x00d2;
            case 1755733: goto L_0x008e;
            case 1758245: goto L_0x02e2;
            case 1758398: goto L_0x02c0;
            case 1758495: goto L_0x01e5;
            case 1758969: goto L_0x00b7;
            case 1759554: goto L_0x0132;
            default: goto L_0x0028;
        };
    L_0x0028:
        r18 = r12;
        r12 = "";
        r12 = s.ۡۢۡ.m60(r8, r12);
        if (r12 != 0) goto L_0x00ef;
    L_0x0032:
        r12 = "ۗۜۨ";
        r12 = s.ۜۘۡ.m282(r12);
        r29 = r18;
        r18 = r12;
        goto L_0x00eb;
    L_0x003e:
        s.ۢ۫ۜ.m625();
        r18 = s.ۗ۠ۚ.m442();
        if (r18 > 0) goto L_0x0053;
    L_0x0047:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        goto L_0x018e;
    L_0x0053:
        r18 = "۟ۨ۬";
        goto L_0x00a2;
    L_0x0056:
        r18 = s.ۢ۫ۜ.f51;
        if (r18 >= 0) goto L_0x005b;
    L_0x005a:
        goto L_0x00a0;
    L_0x005b:
        r18 = "ۗۚ۬";
        goto L_0x00a2;
    L_0x005e:
        r18 = s.ۢ۫ۗ.f21;
        if (r18 != 0) goto L_0x0047;
    L_0x0062:
        goto L_0x00bd;
    L_0x0063:
        r18 = s.ۡۘۗ.m32();
        if (r18 == 0) goto L_0x006a;
    L_0x0069:
        goto L_0x00bd;
    L_0x006a:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        goto L_0x0182;
    L_0x0076:
        s.۬ۨۨ.m730();
        r18 = s.ۙۜۦ.m520();
        if (r18 == 0) goto L_0x008b;
    L_0x007f:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        goto L_0x0346;
    L_0x008b:
        r18 = "ۨ۬ۙ";
        goto L_0x00a2;
    L_0x008e:
        r18 = s.ۡۗۗ.m159();
        if (r18 == 0) goto L_0x00a0;
    L_0x0094:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        goto L_0x036a;
    L_0x00a0:
        r18 = "ۧ۟ۘ";
    L_0x00a2:
        r18 = s.ۢ۫ۗ.m350(r18);
        goto L_0x0025;
    L_0x00a8:
        s.ۢ۫ۗ.m342();
        r18 = s.ۗۜۛ.m698();
        if (r18 > 0) goto L_0x007f;
    L_0x00b1:
        goto L_0x00bd;
    L_0x00b2:
        r18 = s.ۥۥۚ.f50;
        if (r18 != 0) goto L_0x0094;
    L_0x00b6:
        goto L_0x00bd;
    L_0x00b7:
        s.۬ۨۨ.m730();
        s.۠ۡ۟.m140();
    L_0x00bd:
        r18 = "ۤۗۡ";
        r18 = s.ۜۘۡ.m282(r18);
        goto L_0x0025;
    L_0x00c5:
        s.ۗۜۛ.m698();
        s.۟ۧۢ.m774();
        r0 = 0;
        return r0;
    L_0x00cd:
        r0 = s.ۨۘۢ.m315(r8);
        return r0;
    L_0x00d2:
        r18 = r12;
        r5.moveToFirst();
        r12 = s.ۢ۫ۜ.m636(r5, r4);
        s.ۛۨۦ.m550(r5);
        if (r12 == 0) goto L_0x00ef;
    L_0x00e0:
        r8 = "ۚۜۧ";
        r8 = s.ۢ۫ۗ.m350(r8);
        r29 = r18;
        r18 = r8;
        r8 = r12;
    L_0x00eb:
        r12 = r29;
        goto L_0x0025;
    L_0x00ef:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r22 = r13;
        goto L_0x016a;
    L_0x00f9:
        return r4;
    L_0x00fa:
        r0 = r6.getBoolean(r1, r4);
        return r0;
    L_0x00ff:
        r18 = r12;
        r12 = s.ۨۧۜ.m767(r0, r7);
        r19 = r6;
        r6 = new java.io.File;
        r20 = s.ۥۥۚ.m614();
        if (r20 > 0) goto L_0x0117;
    L_0x010f:
        r20 = r7;
        r21 = r8;
    L_0x0113:
        r22 = r13;
        goto L_0x038e;
    L_0x0117:
        r20 = r7;
        r7 = f78;
        r21 = r8;
        r8 = 10;
        r23 = s.ۥۥۚ.f50;
        if (r23 == 0) goto L_0x0124;
    L_0x0123:
        goto L_0x0113;
    L_0x0124:
        r13 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r0 = s.۬ۗ۫.m97(r7, r13, r8, r15);
        r6.<init>(r12, r0);
        r0 = s.ۛ۫ۧ.m594(r6);
        return r0;
    L_0x0132:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r6 = f78;
        r7 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r8 = 6;
        r7 = s.ۘۡۜ.m674(r6, r7, r8, r15);
        r6 = s.ۡۗۗ.m159();
        if (r6 == 0) goto L_0x014c;
    L_0x014b:
        goto L_0x018e;
    L_0x014c:
        r6 = "۟ۜ۫";
        r6 = s.ۜۘۡ.m282(r6);
        r12 = r18;
        goto L_0x02fc;
    L_0x0156:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r6 = r5.getCount();
        if (r6 <= 0) goto L_0x016a;
    L_0x0166:
        r6 = "ۨۥ۠";
        goto L_0x02f4;
    L_0x016a:
        r6 = "۠۫ۙ";
        goto L_0x0308;
    L_0x016e:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r6 = new de.robv.android.xposed.XSharedPreferences;
        r7 = f78;
        r8 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r12 = s.ۨۘۢ.f19;
        if (r12 == 0) goto L_0x0186;
    L_0x0182:
        r6 = "ۙۜۗ";
        goto L_0x0308;
    L_0x0186:
        r12 = 26;
        r13 = s.ۡۗۗ.m159();
        if (r13 == 0) goto L_0x0192;
    L_0x018e:
        r6 = "ۙۧ۟";
        goto L_0x0308;
    L_0x0192:
        r7 = s.ۨۧۜ.m764(r7, r8, r12, r15);
        r6.<init>(r7, r3);
        r7 = r6.contains(r1);
        if (r7 == 0) goto L_0x01a9;
    L_0x019f:
        r7 = "ۢۥۛ";
        r7 = s.ۢ۫ۗ.m350(r7);
        r12 = r18;
        goto L_0x039e;
    L_0x01a9:
        r6 = "۬۫ۡ";
        goto L_0x02f4;
    L_0x01ad:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        if (r5 == 0) goto L_0x01bd;
    L_0x01b9:
        r6 = "ۙ۬ۗ";
        goto L_0x0308;
    L_0x01bd:
        r6 = "ۗۜۚ";
        goto L_0x0308;
    L_0x01c1:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r5 = 0;
        goto L_0x022f;
    L_0x01cd:
        r0 = 1;
        return r0;
    L_0x01cf:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r6 = algorithmClient;
        r6 = r6.isSwitch();
        if (r6 == 0) goto L_0x0251;
    L_0x01e1:
        r6 = "ۢۗۚ";
        goto L_0x0308;
    L_0x01e5:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r23 = s.۫ۢ۠.m227(r30);	 Catch:{ Exception -> 0x0233 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0233 }
        r6.<init>();	 Catch:{ Exception -> 0x0233 }
        r7 = f78;	 Catch:{ Exception -> 0x0233 }
        r8 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r12 = 24;
        r7 = s.ۖۜ۟.m485(r7, r8, r12, r15);	 Catch:{ Exception -> 0x0233 }
        s.ۗۜۛ.m701(r6, r7);	 Catch:{ Exception -> 0x0233 }
        s.ۢ۫ۜ.m637(r6, r1);	 Catch:{ Exception -> 0x0233 }
        r6 = s.ۥۘۧ.m668(r6);	 Catch:{ Exception -> 0x0233 }
        r24 = s.۬ۗ۫.m105(r6);	 Catch:{ Exception -> 0x0233 }
        r25 = new java.lang.String[]{r3};	 Catch:{ Exception -> 0x0233 }
        r26 = 0;
        r27 = 0;
        r28 = 0;
        r6 = r23.query(r24, r25, r26, r27, r28);	 Catch:{ Exception -> 0x0233 }
        r7 = f78;	 Catch:{ Exception -> 0x0233 }
        r8 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r12 = 5;
        r7 = s.ۡۢۡ.m55(r7, r8, r12, r15);	 Catch:{ Exception -> 0x0233 }
        r8 = s.ۦۡۤ.m398(r6);	 Catch:{ Exception -> 0x0233 }
        s.ۨۗۥ.m530(r7, r8);	 Catch:{ Exception -> 0x0233 }
        r5 = r6;
    L_0x022f:
        r6 = "ۖ۟ۘ";
        goto L_0x0308;
    L_0x0233:
        r6 = "ۚۢۦ";
        goto L_0x0308;
    L_0x0237:
        return r4;
    L_0x0238:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        initClient(r31);
        r6 = algorithmClient;
        r6 = s.ۥۥۚ.m619(r6);
        if (r6 == 0) goto L_0x0251;
    L_0x024d:
        r6 = "ۤۗۙ";
        goto L_0x02f4;
    L_0x0251:
        r6 = "۫ۨۜ";
        goto L_0x02f4;
    L_0x0255:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r4 = s.ۗ۬ۦ.m414(r9, r10, r2, r15);
        r6 = 0;
        if (r0 != 0) goto L_0x0279;
    L_0x0266:
        r4 = "ۚۧ۫";
        r4 = s.ۢ۫ۗ.m350(r4);
        r12 = r18;
        r6 = r19;
        r7 = r20;
        r8 = r21;
        r13 = r22;
        r18 = r4;
        goto L_0x028c;
    L_0x0279:
        r3 = "۟ۘۡ";
        r3 = s.ۜۘۡ.m282(r3);
        r12 = r18;
        r6 = r19;
        r7 = r20;
        r8 = r21;
        r13 = r22;
        r18 = r3;
        r3 = r4;
    L_0x028c:
        r4 = 0;
        goto L_0x0025;
    L_0x028f:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r6 = f78;
        r7 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r8 = 9;
        r12 = s.ۛۨۦ.m559();
        if (r12 == 0) goto L_0x02a7;
    L_0x02a5:
        goto L_0x036a;
    L_0x02a7:
        r2 = "ۘۘۜ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r9 = r6;
        r12 = r18;
        r6 = r19;
        r7 = r20;
        r8 = r21;
        r13 = r22;
        r10 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r18 = r2;
        r2 = 9;
        goto L_0x0025;
    L_0x02c0:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r6 = 40478; // 0x9e1e float:5.6722E-41 double:1.9999E-319;
        r15 = 40478; // 0x9e1e float:5.6722E-41 double:1.9999E-319;
        goto L_0x02df;
    L_0x02d1:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r6 = 12552; // 0x3108 float:1.7589E-41 double:6.2015E-320;
        r15 = 12552; // 0x3108 float:1.7589E-41 double:6.2015E-320;
    L_0x02df:
        r6 = "ۗۙ۟";
        goto L_0x02f4;
    L_0x02e2:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r6 = r11 * r14;
        r13 = r22 - r6;
        if (r13 < 0) goto L_0x0306;
    L_0x02f2:
        r6 = "ۖۢۧ";
    L_0x02f4:
        r6 = s.ۜۘۡ.m282(r6);
    L_0x02f8:
        r12 = r18;
        r7 = r20;
    L_0x02fc:
        r8 = r21;
        r13 = r22;
        r18 = r6;
        r6 = r19;
        goto L_0x0025;
    L_0x0306:
        r6 = "۫ۥۘ";
    L_0x0308:
        r6 = s.ۢ۫ۗ.m350(r6);
        goto L_0x02f8;
    L_0x030d:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r12 = r11 + r18;
        r13 = r12 * r12;
        r6 = 45080; // 0xb018 float:6.317E-41 double:2.22725E-319;
        r7 = s.۫۫ۗ.f65;
        if (r7 == 0) goto L_0x0323;
    L_0x0322:
        goto L_0x0346;
    L_0x0323:
        r7 = "۫۠ۚ";
        r7 = s.ۜۘۡ.m282(r7);
        r12 = r18;
        r6 = r19;
        r8 = r21;
        r14 = 45080; // 0xb018 float:6.317E-41 double:2.22725E-319;
        goto L_0x03a2;
    L_0x0334:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r6 = r16[r17];
        r12 = 11270; // 0x2c06 float:1.5793E-41 double:5.568E-320;
        r7 = s.ۢ۫ۗ.f21;
        if (r7 == 0) goto L_0x0349;
    L_0x0346:
        r6 = "ۘ۠ۦ";
        goto L_0x0308;
    L_0x0349:
        r7 = "ۡۤۜ";
        r18 = s.ۜۘۡ.m282(r7);
        r11 = r6;
        r6 = r19;
        r7 = r20;
        r8 = r21;
        r13 = r22;
        goto L_0x0025;
    L_0x035a:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r6 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r7 = s.ۗۜ۟.f33;
        if (r7 > 0) goto L_0x036d;
    L_0x036a:
        r6 = "۬ۘۥ";
        goto L_0x0308;
    L_0x036d:
        r7 = "ۦۖۤ";
        r7 = s.ۜۘۡ.m282(r7);
        r12 = r18;
        r6 = r19;
        r8 = r21;
        r13 = r22;
        r17 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        goto L_0x03a2;
    L_0x037e:
        r19 = r6;
        r20 = r7;
        r21 = r8;
        r18 = r12;
        r22 = r13;
        r6 = f78;
        r7 = s.۟ۧۢ.f60;
        if (r7 > 0) goto L_0x0392;
    L_0x038e:
        r6 = "ۘ۫ۡ";
        goto L_0x02f4;
    L_0x0392:
        r7 = "ۖۘۢ";
        r7 = s.ۢ۫ۗ.m350(r7);
        r16 = r6;
        r12 = r18;
        r6 = r19;
    L_0x039e:
        r8 = r21;
        r13 = r22;
    L_0x03a2:
        r18 = r7;
        r7 = r20;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.XpConfig.isSwitch(android.content.Context, java.lang.String):boolean");
    }
}
