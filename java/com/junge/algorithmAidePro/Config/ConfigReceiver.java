package com.junge.algorithmAidePro.Config;

import android.content.Context;
import java.io.File;

public class ConfigReceiver extends Thread {
    public static final String ACTION;
    /* renamed from: ۢ۠ۡ */
    private static final short[] f72 = new short[]{(short) 7250, (short) -3801, (short) -3790, (short) -3730, (short) -3719, (short) -3714, (short) -3716, (short) -3729, (short) -3719, (short) -3790, (short) -3748, (short) -3725, (short) -3719, (short) -3729, (short) -3726, (short) -3724, (short) -3719, (short) -3790, (short) -3728, (short) -3720, (short) -3719, (short) -3724, (short) -3716, (short) -3790, (short) -3790, (short) -3734, (short) -3716, (short) -3735, (short) -3714, (short) -3723, (short) -3790, (short) -3774, (short) 397, (short) 18599, (short) 1295, (short) -15209, (short) -15205, (short) -15207, (short) -15142, (short) -15202, (short) -15231, (short) -15206, (short) -15213, (short) -15215, (short) -15142, (short) -15211, (short) -15208, (short) -15213, (short) -15205, (short) -15226, (short) -15203, (short) -15232, (short) -15204, (short) -15207, (short) -15179, (short) -15203, (short) -15216, (short) -15215, (short) -15196, (short) -15226, (short) -15205, (short) -15142, (short) -15177, (short) -15205, (short) -15206, (short) -15214, (short) -15203, (short) -15213, (short) -15179, (short) -15209, (short) -15232, (short) -15203, (short) -15205, (short) -15206, (short) 9487, (short) -6053, (short) -6025, (short) -6026, (short) -6018, (short) -6031, (short) -6017, (short) -6070, (short) -6019, (short) -6021, (short) -6019, (short) -6031, (short) -6034, (short) -6019, (short) -6038, (short) -6021, (short) -6025, (short) -6026, (short) -6018, (short) -6031, (short) -6017, (short) -6053, (short) -6032, (short) -6023, (short) -6026, (short) -6017, (short) -6019};
    public ConfigListener configListener;
    public Context context;
    public File file;
    public String fileName;
    public String packageName;
    public File path;
    public String processName;

    /* DevToolsApp WARNING: Missing block: B:6:0x002d, code:
            if (s.ۙۜۦ.f36 <= 0) goto L_0x00a8;
     */
    /* DevToolsApp WARNING: Missing block: B:23:0x0083, code:
            if (s.ۗۜۛ.f55 == 0) goto L_0x00a8;
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x0095, code:
            r12 = "۬ۤ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00f1, code:
            r12 = s.ۜۘۡ.m282(r12);
     */
    /* DevToolsApp WARNING: Missing block: B:50:0x00f9, code:
            r12 = "ۦۛۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x0117, code:
            r12 = "ۢۦۗ";
     */
    static {
        /*
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r0 = new short[r0];
        r0 = {7250, -3801, -3790, -3730, -3719, -3714, -3716, -3729, -3719, -3790, -3748, -3725, -3719, -3729, -3726, -3724, -3719, -3790, -3728, -3720, -3719, -3724, -3716, -3790, -3790, -3734, -3716, -3735, -3714, -3723, -3790, -3774, 397, 18599, 1295, -15209, -15205, -15207, -15142, -15202, -15231, -15206, -15213, -15215, -15142, -15211, -15208, -15213, -15205, -15226, -15203, -15232, -15204, -15207, -15179, -15203, -15216, -15215, -15196, -15226, -15205, -15142, -15177, -15205, -15206, -15214, -15203, -15213, -15179, -15209, -15232, -15203, -15205, -15206, 9487, -6053, -6025, -6026, -6018, -6031, -6017, -6070, -6019, -6021, -6019, -6031, -6034, -6019, -6038, -6021, -6025, -6026, -6018, -6031, -6017, -6053, -6032, -6023, -6026, -6017, -6019};
        f72 = r0;
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
        r12 = "ۡۛۥ";
    L_0x0017:
        r12 = s.ۢ۫ۗ.m350(r12);
    L_0x001b:
        switch(r12) {
            case 1740806: goto L_0x00fd;
            case 1741660: goto L_0x00f7;
            case 1742941: goto L_0x00e8;
            case 1743693: goto L_0x00d4;
            case 1744080: goto L_0x00cf;
            case 1746544: goto L_0x00cb;
            case 1746586: goto L_0x00b7;
            case 1746931: goto L_0x00b0;
            case 1748665: goto L_0x00a4;
            case 1749286: goto L_0x008d;
            case 1749779: goto L_0x0086;
            case 1751487: goto L_0x007e;
            case 1751673: goto L_0x006f;
            case 1753286: goto L_0x0058;
            case 1753303: goto L_0x004c;
            case 1753594: goto L_0x0040;
            case 1755425: goto L_0x0031;
            case 1759335: goto L_0x0028;
            default: goto L_0x001e;
        };
    L_0x001e:
        r12 = f72;
        r13 = s.ۢۜۘ.m255();
        if (r13 > 0) goto L_0x011b;
    L_0x0026:
        goto L_0x0117;
    L_0x0028:
        s.ۨۗۥ.m536();
        r12 = s.ۙۜۦ.f36;
        if (r12 > 0) goto L_0x0117;
    L_0x002f:
        goto L_0x00a8;
    L_0x0031:
        r12 = s.۟ۥۙ.f52;
        if (r12 == 0) goto L_0x0037;
    L_0x0035:
        goto L_0x00ec;
    L_0x0037:
        r2 = "۟ۧۛ";
        r12 = s.ۜۘۡ.m282(r2);
        r2 = 39;
        goto L_0x001b;
    L_0x0040:
        r12 = r9 + r9;
        r12 = r6 - r12;
        if (r12 > 0) goto L_0x0049;
    L_0x0046:
        r12 = "۟ۚ۫";
        goto L_0x0017;
    L_0x0049:
        r12 = "ۚۘۚ";
        goto L_0x0017;
    L_0x004c:
        s.ۢۜۘ.m255();
        s.ۖۜ۟.m492();
        r0 = new java.lang.RuntimeException;
        r0.<init>();
        throw r0;
    L_0x0058:
        r12 = f72;
        r13 = s.ۖۜ۟.m492();
        if (r13 == 0) goto L_0x0062;
    L_0x0060:
        goto L_0x00ec;
    L_0x0062:
        r0 = "ۨۢۛ";
        r0 = s.ۜۘۡ.m282(r0);
        r11 = 35;
        r11 = r12;
        r12 = r0;
        r0 = 35;
        goto L_0x001b;
    L_0x006f:
        r12 = s.۬ۗ۫.f6;
        if (r12 < 0) goto L_0x0075;
    L_0x0073:
        goto L_0x0117;
    L_0x0075:
        r5 = "ۜۛ۬";
        r12 = s.ۢ۫ۗ.m350(r5);
        r5 = 3422; // 0xd5e float:4.795E-42 double:1.6907E-320;
        goto L_0x001b;
    L_0x007e:
        s.۟ۧۢ.m774();
        r12 = s.ۗۜۛ.f55;
        if (r12 != 0) goto L_0x0095;
    L_0x0085:
        goto L_0x00a8;
    L_0x0086:
        s.ۘۡۜ.m682();
        s.۟ۤۗ.m332();
        goto L_0x00a8;
    L_0x008d:
        r12 = r1[r3];
        r13 = s.ۛۨۦ.m559();
        if (r13 == 0) goto L_0x0099;
    L_0x0095:
        r12 = "۬ۤ۟";
        goto L_0x0017;
    L_0x0099:
        r4 = "ۤۥۚ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r14 = r12;
        r12 = r4;
        r4 = r14;
        goto L_0x001b;
    L_0x00a4:
        r12 = s.ۖۜ۟.f34;
        if (r12 < 0) goto L_0x00ac;
    L_0x00a8:
        r12 = "ۦۛ۬";
        goto L_0x0017;
    L_0x00ac:
        r12 = "ۢۖۚ";
        goto L_0x0017;
    L_0x00b0:
        r0 = s.ۗۤ۫.m206(r11, r0, r2, r10);
        ACTION = r0;
        return;
    L_0x00b7:
        r12 = r7 + r8;
        r13 = s.ۗۜۛ.m698();
        if (r13 > 0) goto L_0x00c0;
    L_0x00bf:
        goto L_0x0105;
    L_0x00c0:
        r9 = "ۦۥۙ";
        r9 = s.ۜۘۡ.m282(r9);
        r14 = r12;
        r12 = r9;
        r9 = r14;
        goto L_0x001b;
    L_0x00cb:
        r10 = 50420; // 0xc4f4 float:7.0653E-41 double:2.4911E-319;
        goto L_0x00f9;
    L_0x00cf:
        r12 = s.ۥۘۧ.f53;
        if (r12 != 0) goto L_0x00ec;
    L_0x00d3:
        goto L_0x0117;
    L_0x00d4:
        r12 = r4 + r5;
        r12 = r12 * r12;
        r13 = s.۬۟ۜ.f23;
        if (r13 != 0) goto L_0x00dd;
    L_0x00dc:
        goto L_0x0105;
    L_0x00dd:
        r6 = "ۙۛۨ";
        r6 = s.ۢ۫ۗ.m350(r6);
        r14 = r12;
        r12 = r6;
        r6 = r14;
        goto L_0x001b;
    L_0x00e8:
        r12 = s.ۡۢۡ.f3;
        if (r12 < 0) goto L_0x00ef;
    L_0x00ec:
        r12 = "ۤ۟ۚ";
        goto L_0x00f1;
    L_0x00ef:
        r12 = "ۡۡۙ";
    L_0x00f1:
        r12 = s.ۜۘۡ.m282(r12);
        goto L_0x001b;
    L_0x00f7:
        r10 = 17040; // 0x4290 float:2.3878E-41 double:8.419E-320;
    L_0x00f9:
        r12 = "ۦۛۛ";
        goto L_0x0017;
    L_0x00fd:
        r12 = r4 * r4;
        r13 = s.ۨۧۚ.m718();
        if (r13 > 0) goto L_0x0109;
    L_0x0105:
        r12 = "ۜۨۜ";
        goto L_0x0017;
    L_0x0109:
        r7 = "۟ۜۗ";
        r7 = s.ۜۘۡ.m282(r7);
        r8 = 11710084; // 0xb2ae84 float:1.6409323E-38 double:5.78555E-317;
        r14 = r12;
        r12 = r7;
        r7 = r14;
        goto L_0x001b;
    L_0x0117:
        r12 = "ۢۦۗ";
        goto L_0x0017;
    L_0x011b:
        r1 = "ۛۢۤ";
        r1 = s.ۜۘۡ.m282(r1);
        r3 = 34;
        r14 = r12;
        r12 = r1;
        r1 = r14;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReceiver.<clinit>():void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0034, code:
            r16 = r0;
            r17 = r8;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x004f, code:
            if (s.ۥۥۚ.f50 != 0) goto L_0x0051;
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x0051, code:
            r16 = r0;
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x0053, code:
            r17 = r8;
     */
    /* DevToolsApp WARNING: Missing block: B:36:0x00c0, code:
            r0 = "۬۬ۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x0128, code:
            r0 = "ۛۘۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:51:0x012d, code:
            r15 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x0143, code:
            r0 = "ۧۢ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:58:0x0160, code:
            r0 = "ۦ۟ۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:62:0x016e, code:
            r15 = s.ۢ۫ۗ.m350(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:63:0x0172, code:
            r0 = r16;
            r8 = r17;
     */
    /* DevToolsApp WARNING: Missing block: B:67:0x018c, code:
            r0 = "ۥۧ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:71:0x01b0, code:
            r0 = "ۜۤ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:75:0x01d1, code:
            r0 = "ۦۦۘ";
     */
    private void createFile() {
        /*
        r19 = this;
        r1 = r19;
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
        r15 = "ۥۘۥ";
        r15 = s.ۢ۫ۗ.m350(r15);
        r3 = r2;
        r5 = r4;
        r4 = 0;
        r2 = r0;
        r0 = r7;
        r7 = r6;
        r6 = 0;
    L_0x001d:
        switch(r15) {
            case 1737782: goto L_0x017b;
            case 1739039: goto L_0x0158;
            case 1739219: goto L_0x007e;
            case 1740789: goto L_0x0109;
            case 1741131: goto L_0x0065;
            case 1741611: goto L_0x007f;
            case 1741697: goto L_0x00d9;
            case 1742620: goto L_0x002d;
            case 1743972: goto L_0x0040;
            case 1747812: goto L_0x0163;
            case 1749733: goto L_0x00f1;
            case 1749981: goto L_0x01a1;
            case 1751686: goto L_0x00c4;
            case 1752242: goto L_0x01c3;
            case 1752702: goto L_0x004d;
            case 1752832: goto L_0x0074;
            case 1753410: goto L_0x0132;
            case 1753624: goto L_0x005e;
            case 1754480: goto L_0x0057;
            case 1754601: goto L_0x014f;
            case 1758308: goto L_0x00a0;
            case 1759576: goto L_0x0089;
            default: goto L_0x0020;
        };
    L_0x0020:
        r16 = r0;
        r17 = r8;
        s.ۗۜۛ.m701(r2, r3);
        r0 = s.۠ۜۗ.f13;
        if (r0 == 0) goto L_0x012b;
    L_0x002b:
        goto L_0x0128;
    L_0x002d:
        s.۬۟ۜ.m366();
        r15 = s.ۦۢۜ.f1;
        if (r15 > 0) goto L_0x003a;
    L_0x0034:
        r16 = r0;
        r17 = r8;
        goto L_0x0143;
    L_0x003a:
        r16 = r0;
        r17 = r8;
        goto L_0x01b0;
    L_0x0040:
        r15 = s.ۡۗۗ.m159();
        if (r15 != 0) goto L_0x0047;
    L_0x0046:
        goto L_0x0034;
    L_0x0047:
        r16 = r0;
        r17 = r8;
        goto L_0x018c;
    L_0x004d:
        r15 = s.ۥۥۚ.f50;
        if (r15 == 0) goto L_0x0034;
    L_0x0051:
        r16 = r0;
    L_0x0053:
        r17 = r8;
        goto L_0x01d1;
    L_0x0057:
        s.ۗۤ۫.m195();
        s.ۢ۫ۗ.m342();
        goto L_0x0051;
    L_0x005e:
        s.ۨۧۜ.m755();
        s.ۚ۟ۢ.m85();
        return;
    L_0x0065:
        s.ۗ۬۟.m271(r0);
        r0 = new java.lang.RuntimeException;
        r2 = r1.file;
        r2 = s.ۘۡۜ.m675(r2);
        r0.<init>(r2);
        throw r0;
    L_0x0074:
        r15 = r1.file;	 Catch:{ IOException -> 0x007a }
        s.ۜۘۡ.m275(r15);	 Catch:{ IOException -> 0x007a }
        goto L_0x0098;
    L_0x007a:
        r0 = move-exception;
        r15 = "ۙۦۘ";
        goto L_0x009a;
    L_0x007e:
        return;
    L_0x007f:
        r15 = r1.path;
        s.ۚ۟ۢ.m84(r15);
        r16 = r0;
        r17 = r8;
        goto L_0x00c0;
    L_0x0089:
        r15 = r1.file;
        r15 = s.۠ۜۗ.m218(r15);
        if (r15 != 0) goto L_0x0098;
    L_0x0091:
        r15 = "ۥ۫ۦ";
        r15 = s.ۜۘۡ.m282(r15);
        goto L_0x001d;
    L_0x0098:
        r15 = "ۗۦۢ";
    L_0x009a:
        r15 = s.ۢ۫ۗ.m350(r15);
        goto L_0x001d;
    L_0x00a0:
        r15 = new java.io.File;
        r16 = r0;
        r0 = r1.path;
        r17 = s.ۤۤۖ.f35;
        if (r17 == 0) goto L_0x00ab;
    L_0x00aa:
        goto L_0x0053;
    L_0x00ab:
        r17 = r8;
        r8 = r1.fileName;
        r15.<init>(r0, r8);
        r1.file = r15;
        r0 = r1.path;
        r0 = s.۠ۜۗ.m218(r0);
        if (r0 != 0) goto L_0x00c0;
    L_0x00bc:
        r0 = "ۚۖۧ";
        goto L_0x012d;
    L_0x00c0:
        r0 = "۬۬ۘ";
        goto L_0x012d;
    L_0x00c4:
        r16 = r0;
        r17 = r8;
        s.ۗۤ۫.m197(r2, r7);
        r0 = s.ۦۡۤ.m398(r2);
        r1.fileName = r0;
        r0 = s.ۨۘۢ.f19;
        if (r0 == 0) goto L_0x00d6;
    L_0x00d5:
        goto L_0x0128;
    L_0x00d6:
        r0 = "۫ۢۛ";
        goto L_0x012d;
    L_0x00d9:
        r16 = r0;
        r17 = r8;
        r0 = java.util.UUID.randomUUID();
        r8 = s.۠ۡۧ.m431();
        if (r8 != 0) goto L_0x00e8;
    L_0x00e7:
        goto L_0x0128;
    L_0x00e8:
        r7 = "ۤۥۧ";
        r15 = s.ۜۘۡ.m282(r7);
        r7 = r0;
        goto L_0x0172;
    L_0x00f1:
        r16 = r0;
        r17 = r8;
        r0 = 1;
        r0 = s.۠ۡ۟.m139(r5, r6, r0, r4);
        s.ۢ۫ۜ.m637(r2, r0);
        r0 = s.۠ۡۧ.m431();
        if (r0 != 0) goto L_0x0105;
    L_0x0103:
        goto L_0x01d1;
    L_0x0105:
        r0 = "ۚۙ۠";
        goto L_0x016e;
    L_0x0109:
        r16 = r0;
        r17 = r8;
        r0 = f72;
        r8 = 33;
        r15 = s.ۥۘۧ.m662();
        if (r15 > 0) goto L_0x0119;
    L_0x0117:
        goto L_0x018c;
    L_0x0119:
        r5 = "ۢۤۧ";
        r15 = s.ۜۘۡ.m282(r5);
        r5 = r0;
        r0 = r16;
        r8 = r17;
        r6 = 33;
        goto L_0x001d;
    L_0x0128:
        r0 = "ۛۘۙ";
        goto L_0x012d;
    L_0x012b:
        r0 = "ۙۛۗ";
    L_0x012d:
        r15 = s.ۜۘۡ.m282(r0);
        goto L_0x0172;
    L_0x0132:
        r16 = r0;
        r17 = r8;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r8 = r1.processName;
        r15 = s.۠ۜۗ.m214();
        if (r15 > 0) goto L_0x0146;
    L_0x0143:
        r0 = "ۧۢ۫";
        goto L_0x016e;
    L_0x0146:
        r2 = "۟ۗ۟";
        r15 = s.ۜۘۡ.m282(r2);
        r2 = r0;
        r3 = r8;
        goto L_0x0172;
    L_0x014f:
        r16 = r0;
        r17 = r8;
        r0 = 18866; // 0x49b2 float:2.6437E-41 double:9.321E-320;
        r4 = 18866; // 0x49b2 float:2.6437E-41 double:9.321E-320;
        goto L_0x0160;
    L_0x0158:
        r16 = r0;
        r17 = r8;
        r0 = 18680; // 0x48f8 float:2.6176E-41 double:9.229E-320;
        r4 = 18680; // 0x48f8 float:2.6176E-41 double:9.229E-320;
    L_0x0160:
        r0 = "ۦ۟ۛ";
        goto L_0x016e;
    L_0x0163:
        r16 = r0;
        r17 = r8;
        r0 = r13 + r14;
        r0 = r0 - r12;
        if (r0 < 0) goto L_0x0178;
    L_0x016c:
        r0 = "ۗ۠ۨ";
    L_0x016e:
        r15 = s.ۢ۫ۗ.m350(r0);
    L_0x0172:
        r0 = r16;
        r8 = r17;
        goto L_0x001d;
    L_0x0178:
        r0 = "ۧۦۨ";
        goto L_0x016e;
    L_0x017b:
        r16 = r0;
        r17 = r8;
        r0 = r10 * r11;
        r8 = r10 * r10;
        r15 = 312688489; // 0x12a33f69 float:1.0302378E-27 double:1.544886403E-315;
        r18 = s.ۗ۠ۚ.m442();
        if (r18 > 0) goto L_0x018f;
    L_0x018c:
        r0 = "ۥۧ۠";
        goto L_0x016e;
    L_0x018f:
        r12 = "۠ۤۨ";
        r12 = s.ۜۘۡ.m282(r12);
        r13 = r8;
        r15 = r12;
        r8 = r17;
        r14 = 312688489; // 0x12a33f69 float:1.0302378E-27 double:1.544886403E-315;
        r12 = r0;
        r0 = r16;
        goto L_0x001d;
    L_0x01a1:
        r16 = r0;
        r17 = r8;
        r0 = r17[r9];
        r8 = 35366; // 0x8a26 float:4.9558E-41 double:1.7473E-319;
        r15 = s.۬ۗ۫.m98();
        if (r15 == 0) goto L_0x01b3;
    L_0x01b0:
        r0 = "ۜۤ۬";
        goto L_0x016e;
    L_0x01b3:
        r10 = "ۖۗۗ";
        r15 = s.ۜۘۡ.m282(r10);
        r10 = r0;
        r0 = r16;
        r8 = r17;
        r11 = 35366; // 0x8a26 float:4.9558E-41 double:1.7473E-319;
        goto L_0x001d;
    L_0x01c3:
        r16 = r0;
        r17 = r8;
        r8 = f72;
        r0 = 32;
        r15 = s.ۗۗۡ.m78();
        if (r15 == 0) goto L_0x01d5;
    L_0x01d1:
        r0 = "ۦۦۘ";
        goto L_0x012d;
    L_0x01d5:
        r9 = "ۢ۬ۧ";
        r15 = s.ۜۘۡ.m282(r9);
        r0 = r16;
        r9 = 32;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReceiver.createFile():void");
    }

    /* DevToolsApp WARNING: Missing block: B:7:0x002e, code:
            r16 = r2;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x003f, code:
            r16 = r2;
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x004b, code:
            if (s.۫۫ۗ.m790() == false) goto L_0x003f;
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x005b, code:
            return;
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x00c6, code:
            r2 = "ۙۧۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:44:0x0104, code:
            r2 = "ۥۙۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x0111, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:50:0x0118, code:
            r2 = s.ۜۘۡ.m282(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:51:0x011c, code:
            r19 = r16;
            r16 = r2;
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x0120, code:
            r2 = r19;
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x012f, code:
            r2 = "ۖۤۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:59:0x014b, code:
            r2 = "ۚۢۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:63:0x0166, code:
            r2 = "ۦۨۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:72:0x01a3, code:
            r2 = r16;
            r16 = r19;
     */
    public void onEvent() {
        /*
        r20 = this;
        r0 = r20;
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
        r16 = "ۘۧۗ";
    L_0x0013:
        r16 = s.ۜۘۡ.m282(r16);
    L_0x0017:
        switch(r16) {
            case 1738136: goto L_0x008a;
            case 1738200: goto L_0x0047;
            case 1739285: goto L_0x015a;
            case 1739395: goto L_0x00f3;
            case 1739750: goto L_0x0175;
            case 1739801: goto L_0x00a3;
            case 1740200: goto L_0x018c;
            case 1740943: goto L_0x0036;
            case 1741176: goto L_0x004e;
            case 1741909: goto L_0x0073;
            case 1741972: goto L_0x0028;
            case 1743249: goto L_0x0062;
            case 1746409: goto L_0x00fc;
            case 1746904: goto L_0x0061;
            case 1747675: goto L_0x005b;
            case 1751253: goto L_0x0124;
            case 1751402: goto L_0x0107;
            case 1752270: goto L_0x00e4;
            case 1752477: goto L_0x00be;
            case 1753685: goto L_0x0055;
            case 1759033: goto L_0x005c;
            case 1759174: goto L_0x0141;
            default: goto L_0x001a;
        };
    L_0x001a:
        r16 = r2;
        r2 = f72;
        r17 = 75;
        r18 = s.ۘۡۜ.m682();
        if (r18 < 0) goto L_0x00d7;
    L_0x0026:
        goto L_0x0166;
    L_0x0028:
        r16 = s.ۡۗۗ.m159();
        if (r16 != 0) goto L_0x0032;
    L_0x002e:
        r16 = r2;
        goto L_0x00c6;
    L_0x0032:
        r16 = r2;
        goto L_0x0196;
    L_0x0036:
        s.ۗۢۢ.m454();
        r16 = s.ۛ۫ۧ.m593();
        if (r16 <= 0) goto L_0x0043;
    L_0x003f:
        r16 = r2;
        goto L_0x0166;
    L_0x0043:
        r16 = r2;
        goto L_0x012f;
    L_0x0047:
        r16 = s.۫۫ۗ.m790();
        if (r16 != 0) goto L_0x002e;
    L_0x004d:
        goto L_0x003f;
    L_0x004e:
        s.ۡۥۗ.m568();
        s.ۢۜۘ.m255();
        goto L_0x003f;
    L_0x0055:
        s.ۗ۠ۚ.m442();
        s.ۖۙۜ.m589();
    L_0x005b:
        return;
    L_0x005c:
        r1 = r0.configListener;
        r1.configChange(r2);
    L_0x0061:
        return;
    L_0x0062:
        r16 = r2;
        r2 = r0.context;
        r2 = com.junge.algorithmAidePro.Config.XpConfig.getConfig(r2);
        if (r2 != 0) goto L_0x0070;
    L_0x006c:
        r2 = "۠۠ۛ";
        goto L_0x0111;
    L_0x0070:
        r16 = "۬ۚۧ";
        goto L_0x0013;
    L_0x0073:
        r16 = r2;
        r2 = 12;
        r2 = s.ۡۗۗ.m157(r14, r15, r2, r10);
        s.ۢ۟ۚ.m175(r1, r2);
        r2 = s.ۗ۬۟.m257();
        if (r2 > 0) goto L_0x0086;
    L_0x0084:
        goto L_0x0196;
    L_0x0086:
        r2 = "ۛ۬ۢ";
        goto L_0x0118;
    L_0x008a:
        r16 = r2;
        r2 = f72;
        r17 = 89;
        r18 = s.ۖۙۜ.f48;
        if (r18 != 0) goto L_0x0096;
    L_0x0094:
        goto L_0x014b;
    L_0x0096:
        r14 = "ۚ۠ۛ";
        r14 = s.ۜۘۡ.m282(r14);
        r15 = 89;
        r19 = r14;
        r14 = r2;
        goto L_0x01a3;
    L_0x00a3:
        r16 = r2;
        r2 = s.۬ۨۨ.m722(r11, r12, r13, r10);
        r17 = s.ۘۡۜ.m682();
        if (r17 < 0) goto L_0x00b1;
    L_0x00af:
        goto L_0x0166;
    L_0x00b1:
        r1 = "ۖۢۤ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r19 = r16;
        r16 = r1;
        r1 = r2;
        goto L_0x0120;
    L_0x00be:
        r16 = r2;
        r2 = 14;
        r17 = s.ۥۘۧ.f53;
        if (r17 == 0) goto L_0x00c9;
    L_0x00c6:
        r2 = "ۙۧۦ";
        goto L_0x0118;
    L_0x00c9:
        r13 = "ۘۚۛ";
        r13 = s.ۢ۫ۗ.m350(r13);
        r2 = r16;
        r16 = r13;
        r13 = 14;
        goto L_0x0017;
    L_0x00d7:
        r11 = "ۥ۠ۘ";
        r11 = s.ۢ۫ۗ.m350(r11);
        r12 = 75;
        r19 = r11;
        r11 = r2;
        goto L_0x01a3;
    L_0x00e4:
        r16 = r2;
        r20.createFile();
        r2 = r0.configListener;
        if (r2 != 0) goto L_0x00f0;
    L_0x00ed:
        r2 = "۟ۦ۟";
        goto L_0x0118;
    L_0x00f0:
        r2 = "ۗۘۦ";
        goto L_0x0111;
    L_0x00f3:
        r16 = r2;
        r2 = 44336; // 0xad30 float:6.2128E-41 double:2.1905E-319;
        r10 = 44336; // 0xad30 float:6.2128E-41 double:2.1905E-319;
        goto L_0x0104;
    L_0x00fc:
        r16 = r2;
        r2 = 59416; // 0xe818 float:8.326E-41 double:2.93554E-319;
        r10 = 59416; // 0xe818 float:8.326E-41 double:2.93554E-319;
    L_0x0104:
        r2 = "ۥۙۢ";
        goto L_0x0118;
    L_0x0107:
        r16 = r2;
        r2 = r8 + r9;
        r2 = r7 - r2;
        if (r2 <= 0) goto L_0x0116;
    L_0x010f:
        r2 = "ۗ۬ۘ";
    L_0x0111:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x011c;
    L_0x0116:
        r2 = "۟ۖ۠";
    L_0x0118:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x011c:
        r19 = r16;
        r16 = r2;
    L_0x0120:
        r2 = r19;
        goto L_0x0017;
    L_0x0124:
        r16 = r2;
        r2 = 235162225; // 0xe044a71 float:1.6306098E-30 double:1.161855766E-315;
        r17 = s.۬ۨۨ.m730();
        if (r17 == 0) goto L_0x0132;
    L_0x012f:
        r2 = "ۖۤۦ";
        goto L_0x0111;
    L_0x0132:
        r9 = "ۤۜۢ";
        r9 = s.ۜۘۡ.m282(r9);
        r2 = r16;
        r16 = r9;
        r9 = 235162225; // 0xe044a71 float:1.6306098E-30 double:1.161855766E-315;
        goto L_0x0017;
    L_0x0141:
        r16 = r2;
        r2 = r5 * r6;
        r17 = r5 * r5;
        r18 = s.ۗۤ۫.f12;
        if (r18 == 0) goto L_0x014e;
    L_0x014b:
        r2 = "ۚۢۜ";
        goto L_0x0118;
    L_0x014e:
        r7 = "ۤۗۨ";
        r7 = s.ۜۘۡ.m282(r7);
        r8 = r17;
        r19 = r7;
        r7 = r2;
        goto L_0x01a3;
    L_0x015a:
        r16 = r2;
        r2 = r3[r4];
        r17 = 30670; // 0x77ce float:4.2978E-41 double:1.5153E-319;
        r18 = s.ۤۤۖ.m506();
        if (r18 == 0) goto L_0x0169;
    L_0x0166:
        r2 = "ۦۨۗ";
        goto L_0x0111;
    L_0x0169:
        r5 = "۬۟ۙ";
        r5 = s.ۜۘۡ.m282(r5);
        r6 = 30670; // 0x77ce float:4.2978E-41 double:1.5153E-319;
        r19 = r5;
        r5 = r2;
        goto L_0x01a3;
    L_0x0175:
        r16 = r2;
        r2 = 74;
        r17 = s.ۧۧۡ.f11;
        if (r17 != 0) goto L_0x017e;
    L_0x017d:
        goto L_0x0196;
    L_0x017e:
        r4 = "ۗۨۦ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r2 = r16;
        r16 = r4;
        r4 = 74;
        goto L_0x0017;
    L_0x018c:
        r16 = r2;
        r2 = f72;
        r17 = s.ۨۧۜ.m755();
        if (r17 < 0) goto L_0x019a;
    L_0x0196:
        r2 = "ۙ۠ۖ";
        goto L_0x0118;
    L_0x019a:
        r3 = "ۘۘۦ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r19 = r3;
        r3 = r2;
    L_0x01a3:
        r2 = r16;
        r16 = r19;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReceiver.onEvent():void");
    }

    /* DevToolsApp WARNING: Can't wrap try/catch for R(2:23|24) */
    /* DevToolsApp WARNING: Missing block: B:1:0x0004, code:
            r4 = s.ۜۘۡ.m282("ۜۦۘ");
            r5 = null;
            r7 = 0;
            r6 = false;
     */
    /* DevToolsApp WARNING: Missing block: B:2:0x000d, code:
            switch(r4) {
                case 1737760: goto L_0x0045;
                case 1738081: goto L_0x00b8;
                case 1739868: goto L_0x0098;
                case 1740151: goto L_0x00f6;
                case 1740805: goto L_0x0069;
                case 1742063: goto L_0x0036;
                case 1742914: goto L_0x0104;
                case 1743221: goto L_0x00ac;
                case 1743625: goto L_0x0027;
                case 1744014: goto L_0x010c;
                case 1744092: goto L_0x005b;
                case 1746409: goto L_0x006d;
                case 1746464: goto L_0x0050;
                case 1746471: goto L_0x00ea;
                case 1746714: goto L_0x00ce;
                case 1747935: goto L_0x00c4;
                case 1748401: goto L_0x0019;
                case 1748494: goto L_0x0078;
                case 1748525: goto L_0x0060;
                case 1749315: goto L_0x00a3;
                case 1749458: goto L_0x0081;
                case 1753219: goto L_0x0020;
                case 1753507: goto L_0x0064;
                case 1754102: goto L_0x008c;
                case 1758005: goto L_0x00e2;
                default: goto L_0x0010;
            };
     */
    /* DevToolsApp WARNING: Missing block: B:3:0x0010, code:
            s.ۨۧۚ.m718();
     */
    /* DevToolsApp WARNING: Missing block: B:4:0x0015, code:
            if (s.ۨۘۢ.f19 == 0) goto L_0x00d6;
     */
    /* DevToolsApp WARNING: Missing block: B:6:0x001d, code:
            if (s.ۡۥۗ.m568() == 0) goto L_0x004c;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0024, code:
            if (s.ۘۡۜ.m682() < 0) goto L_0x0032;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x0027, code:
            s.۟ۥۙ.m650();
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x002e, code:
            if (s.۫۫ۗ.m790() != false) goto L_0x00c8;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x0032, code:
            r4 = "ۚۥۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x0036, code:
            s.ۚۤۙ.m296();
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x003d, code:
            if (s.۟ۤۗ.m332() <= 0) goto L_0x0041;
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x0041, code:
            r4 = "ۖۖ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:15:0x0045, code:
            s.ۤۗۛ.m370();
     */
    /* DevToolsApp WARNING: Missing block: B:16:0x004a, code:
            if (s.۠ۜۗ.f13 == false) goto L_0x004c;
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x004c, code:
            r4 = "۟ۘۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:18:0x0050, code:
            s.ۗ۠ۚ.m442();
     */
    /* DevToolsApp WARNING: Missing block: B:19:0x0057, code:
            if (s.۫۫ۗ.m790() != false) goto L_0x00c8;
     */
    /* DevToolsApp WARNING: Missing block: B:20:0x005b, code:
            s.ۢ۫ۜ.m625();
     */
    /* DevToolsApp WARNING: Missing block: B:21:0x0060, code:
            s.ۨۧۚ.m718();
     */
    /* DevToolsApp WARNING: Missing block: B:22:0x0063, code:
            return;
     */
    /* DevToolsApp WARNING: Missing block: B:24:?, code:
            onEvent();
     */
    /* DevToolsApp WARNING: Missing block: B:25:0x0069, code:
            s.ۥۥۚ.m609(r7);
     */
    /* DevToolsApp WARNING: Missing block: B:28:0x0071, code:
            if (s.۟ۥۙ.m650() > 0) goto L_0x0074;
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x0074, code:
            r4 = "ۙۛۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:31:0x007a, code:
            if (s.ۛ۫ۧ.f49 != false) goto L_0x007d;
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x007d, code:
            r4 = "۟ۖ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:34:0x0085, code:
            if (s.ۘۡۜ.m682() < 0) goto L_0x0088;
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x0088, code:
            r4 = "ۡۛۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:37:0x008e, code:
            if (s.ۖۙۜ.f48 != false) goto L_0x0094;
     */
    /* DevToolsApp WARNING: Missing block: B:38:0x0090, code:
            r4 = "ۜۙۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x0094, code:
            r4 = "ۢۛ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:41:0x009a, code:
            if (s.ۙۖۥ.f58 == 0) goto L_0x00a0;
     */
    /* DevToolsApp WARNING: Missing block: B:42:0x009c, code:
            r4 = "ۦۙۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x00a0, code:
            r4 = "ۧۖۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x00a5, code:
            if (s.۫ۢ۠.f14 > 0) goto L_0x00a8;
     */
    /* DevToolsApp WARNING: Missing block: B:46:0x00a8, code:
            r4 = "ۘۜ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00b0, code:
            if (s.ۗ۠ۚ.m442() > 0) goto L_0x00b5;
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x00b2, code:
            r4 = "ۡۘۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:50:0x00b5, code:
            r4 = "ۢۗۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x00bc, code:
            if (s.ۛ۫ۧ.m593() > 0) goto L_0x00c1;
     */
    /* DevToolsApp WARNING: Missing block: B:53:0x00be, code:
            r4 = "ۡ۠ۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x00c1, code:
            r4 = "ۛ۫ۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x00c6, code:
            if (s.ۥۥۚ.f50 == 0) goto L_0x00cb;
     */
    /* DevToolsApp WARNING: Missing block: B:57:0x00c8, code:
            r4 = "ۡۜۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:58:0x00cb, code:
            r4 = "ۖ۠۫";
     */
    /* DevToolsApp WARNING: Missing block: B:60:0x00d4, code:
            if (s.ۨۘۢ.m318() == 0) goto L_0x00d9;
     */
    /* DevToolsApp WARNING: Missing block: B:61:0x00d6, code:
            r4 = "ۜۨۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:62:0x00d9, code:
            r4 = s.ۜۘۡ.m282("۠ۨۧ");
            r7 = 500;
     */
    /* DevToolsApp WARNING: Missing block: B:63:0x00e2, code:
            if (r6 == false) goto L_0x00e4;
     */
    /* DevToolsApp WARNING: Missing block: B:64:0x00e4, code:
            r4 = "ۦۢ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:65:0x00e7, code:
            r4 = "۟۠ۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:67:?, code:
            r11.file = new java.io.File(r11.path, r11.fileName);
     */
    /* DevToolsApp WARNING: Missing block: B:68:0x00f6, code:
            r6 = s.۠ۜۗ.m218(r11.file);
     */
    /* DevToolsApp WARNING: Missing block: B:69:0x00fc, code:
            r4 = "۫ۘۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:70:0x00fe, code:
            r4 = s.ۜۘۡ.m282(r4);
     */
    /* DevToolsApp WARNING: Missing block: B:71:0x0104, code:
            if (r5 == null) goto L_0x0106;
     */
    /* DevToolsApp WARNING: Missing block: B:72:0x0106, code:
            r4 = "۟ۘ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:73:0x0109, code:
            r4 = "ۘۥۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:75:?, code:
            r5 = r11.file;
     */
    /* DevToolsApp WARNING: Missing block: B:76:0x010e, code:
            r4 = "ۛۡۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:77:0x0110, code:
            r4 = s.ۢ۫ۗ.m350(r4);
     */
    public void run() {
        /*
        r11 = this;
        r0 = 0;
        r1 = 0;
        r2 = 0;
    L_0x0004:
        r4 = "ۜۦۘ";
        r4 = s.ۜۘۡ.m282(r4);
        r5 = r0;
        r7 = r2;
        r6 = 0;
    L_0x000d:
        switch(r4) {
            case 1737760: goto L_0x0045;
            case 1738081: goto L_0x00b8;
            case 1739868: goto L_0x0098;
            case 1740151: goto L_0x00f6;
            case 1740805: goto L_0x0069;
            case 1742063: goto L_0x0036;
            case 1742914: goto L_0x0104;
            case 1743221: goto L_0x00ac;
            case 1743625: goto L_0x0027;
            case 1744014: goto L_0x010c;
            case 1744092: goto L_0x005b;
            case 1746409: goto L_0x006d;
            case 1746464: goto L_0x0050;
            case 1746471: goto L_0x00ea;
            case 1746714: goto L_0x00ce;
            case 1747935: goto L_0x00c4;
            case 1748401: goto L_0x0019;
            case 1748494: goto L_0x0078;
            case 1748525: goto L_0x0060;
            case 1749315: goto L_0x00a3;
            case 1749458: goto L_0x0081;
            case 1753219: goto L_0x0020;
            case 1753507: goto L_0x0064;
            case 1754102: goto L_0x008c;
            case 1758005: goto L_0x00e2;
            default: goto L_0x0010;
        };
    L_0x0010:
        s.ۨۧۚ.m718();
        r4 = s.ۨۘۢ.f19;
        if (r4 != 0) goto L_0x004c;
    L_0x0017:
        goto L_0x00d6;
    L_0x0019:
        r4 = s.ۡۥۗ.m568();
        if (r4 != 0) goto L_0x009c;
    L_0x001f:
        goto L_0x004c;
    L_0x0020:
        r4 = s.ۘۡۜ.m682();
        if (r4 >= 0) goto L_0x0090;
    L_0x0026:
        goto L_0x0032;
    L_0x0027:
        s.۟ۥۙ.m650();
        r4 = s.۫۫ۗ.m790();
        if (r4 == 0) goto L_0x0032;
    L_0x0030:
        goto L_0x00c8;
    L_0x0032:
        r4 = "ۚۥۚ";
        goto L_0x0110;
    L_0x0036:
        s.ۚۤۙ.m296();
        r4 = s.۟ۤۗ.m332();
        if (r4 <= 0) goto L_0x0041;
    L_0x003f:
        goto L_0x00c8;
    L_0x0041:
        r4 = "ۖۖ۠";
        goto L_0x0110;
    L_0x0045:
        s.ۤۗۛ.m370();
        r4 = s.۠ۜۗ.f13;
        if (r4 != 0) goto L_0x00be;
    L_0x004c:
        r4 = "۟ۘۙ";
        goto L_0x0110;
    L_0x0050:
        s.ۗ۠ۚ.m442();
        r4 = s.۫۫ۗ.m790();
        if (r4 == 0) goto L_0x00d6;
    L_0x0059:
        goto L_0x00c8;
    L_0x005b:
        s.ۢ۫ۜ.m625();
        goto L_0x00c8;
    L_0x0060:
        s.ۨۧۚ.m718();
        return;
    L_0x0064:
        r11.onEvent();	 Catch:{ Exception -> 0x0004 }
        goto L_0x00e7;
    L_0x0069:
        s.ۥۥۚ.m609(r7);	 Catch:{ Exception -> 0x0004 }
        goto L_0x0004;
    L_0x006d:
        r4 = s.۟ۥۙ.m650();
        if (r4 > 0) goto L_0x0074;
    L_0x0073:
        goto L_0x00b2;
    L_0x0074:
        r4 = "ۙۛۧ";
        goto L_0x0110;
    L_0x0078:
        r4 = s.ۛ۫ۧ.f49;
        if (r4 != 0) goto L_0x007d;
    L_0x007c:
        goto L_0x00d6;
    L_0x007d:
        r4 = "۟ۖ۠";
        goto L_0x0110;
    L_0x0081:
        r4 = s.ۘۡۜ.m682();
        if (r4 < 0) goto L_0x0088;
    L_0x0087:
        goto L_0x0090;
    L_0x0088:
        r4 = "ۡۛۨ";
        goto L_0x0110;
    L_0x008c:
        r4 = s.ۖۙۜ.f48;
        if (r4 != 0) goto L_0x0094;
    L_0x0090:
        r4 = "ۜۙۦ";
        goto L_0x00fe;
    L_0x0094:
        r4 = "ۢۛ۫";
        goto L_0x00fe;
    L_0x0098:
        r4 = s.ۙۖۥ.f58;
        if (r4 == 0) goto L_0x00a0;
    L_0x009c:
        r4 = "ۦۙۖ";
        goto L_0x0110;
    L_0x00a0:
        r4 = "ۧۖۥ";
        goto L_0x00fe;
    L_0x00a3:
        r4 = s.۫ۢ۠.f14;
        if (r4 > 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00c8;
    L_0x00a8:
        r4 = "ۘۜ۠";
        goto L_0x0110;
    L_0x00ac:
        r4 = s.ۗ۠ۚ.m442();
        if (r4 > 0) goto L_0x00b5;
    L_0x00b2:
        r4 = "ۡۘۨ";
        goto L_0x0110;
    L_0x00b5:
        r4 = "ۢۗۘ";
        goto L_0x0110;
    L_0x00b8:
        r4 = s.ۛ۫ۧ.m593();
        if (r4 > 0) goto L_0x00c1;
    L_0x00be:
        r4 = "ۡ۠ۘ";
        goto L_0x0110;
    L_0x00c1:
        r4 = "ۛ۫ۥ";
        goto L_0x00fe;
    L_0x00c4:
        r4 = s.ۥۥۚ.f50;
        if (r4 == 0) goto L_0x00cb;
    L_0x00c8:
        r4 = "ۡۜۨ";
        goto L_0x0110;
    L_0x00cb:
        r4 = "ۖ۠۫";
        goto L_0x0110;
    L_0x00ce:
        r9 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r4 = s.ۨۘۢ.m318();
        if (r4 == 0) goto L_0x00d9;
    L_0x00d6:
        r4 = "ۜۨۨ";
        goto L_0x0110;
    L_0x00d9:
        r4 = "۠ۨۧ";
        r4 = s.ۜۘۡ.m282(r4);
        r7 = r9;
        goto L_0x000d;
    L_0x00e2:
        if (r6 != 0) goto L_0x00e7;
    L_0x00e4:
        r4 = "ۦۢ۟";
        goto L_0x00fe;
    L_0x00e7:
        r4 = "۟۠ۛ";
        goto L_0x00fe;
    L_0x00ea:
        r4 = new java.io.File;	 Catch:{ Exception -> 0x0004 }
        r9 = r11.path;	 Catch:{ Exception -> 0x0004 }
        r10 = r11.fileName;	 Catch:{ Exception -> 0x0004 }
        r4.<init>(r9, r10);	 Catch:{ Exception -> 0x0004 }
        r11.file = r4;	 Catch:{ Exception -> 0x0004 }
        goto L_0x0109;
    L_0x00f6:
        r4 = r11.file;	 Catch:{ Exception -> 0x0004 }
        r6 = s.۠ۜۗ.m218(r4);	 Catch:{ Exception -> 0x0004 }
        r4 = "۫ۘۢ";
    L_0x00fe:
        r4 = s.ۜۘۡ.m282(r4);
        goto L_0x000d;
    L_0x0104:
        if (r5 != 0) goto L_0x0109;
    L_0x0106:
        r4 = "۟ۘ۠";
        goto L_0x0110;
    L_0x0109:
        r4 = "ۘۥۤ";
        goto L_0x0110;
    L_0x010c:
        r5 = r11.file;	 Catch:{ Exception -> 0x0004 }
        r4 = "ۛۡۨ";
    L_0x0110:
        r4 = s.ۢ۫ۗ.m350(r4);
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReceiver.run():void");
    }

    /* DevToolsApp WARNING: Missing block: B:10:0x004e, code:
            r13 = r23;
            r16 = r5;
            r17 = r6;
            r18 = r9;
            r19 = r10;
     */
    /* DevToolsApp WARNING: Missing block: B:16:0x007c, code:
            if (s.ۚۡۢ.f7 == false) goto L_0x007e;
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x007e, code:
            r13 = r23;
            r16 = r5;
            r17 = r6;
            r18 = r9;
            r19 = r10;
     */
    /* DevToolsApp WARNING: Missing block: B:30:0x00f1, code:
            r17 = r6;
     */
    /* DevToolsApp WARNING: Missing block: B:33:0x0100, code:
            r18 = r9;
     */
    /* DevToolsApp WARNING: Missing block: B:36:0x0115, code:
            r19 = r10;
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x0127, code:
            r5 = "۠ۨ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:46:0x0159, code:
            r5 = "۠ۡۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x015b, code:
            r5 = s.ۢ۫ۗ.m350(r5);
     */
    /* DevToolsApp WARNING: Missing block: B:50:0x0177, code:
            r5 = "۫ۘۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x01a2, code:
            r5 = "ۛۙۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x01a7, code:
            r5 = s.ۜۘۡ.m282(r5);
     */
    /* DevToolsApp WARNING: Missing block: B:57:0x01ab, code:
            r13 = r5;
     */
    /* DevToolsApp WARNING: Missing block: B:60:0x01be, code:
            r5 = "ۡۡ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:62:0x01ca, code:
            r5 = "ۘ۟ۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:64:0x01d5, code:
            r5 = r16;
     */
    /* DevToolsApp WARNING: Missing block: B:65:0x01d7, code:
            r6 = r17;
            r9 = r18;
            r10 = r19;
     */
    public ConfigReceiver(com.junge.algorithmAidePro.hook.JungeLoadPackageParam r22, com.junge.algorithmAidePro.Config.ConfigListener r23) {
        /*
        r21 = this;
        r0 = r21;
        r1 = r22;
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
        r12 = f72;
        r13 = 0;
        r12 = r12[r13];
        r13 = r12 * 2;
        r13 = r13 + 1;
        r12 = r12 + 1;
        r12 = r12 * r12;
        r12 = r12 - r13;
        if (r12 < 0) goto L_0x0022;
    L_0x001e:
        r12 = 61725; // 0xf11d float:8.6495E-41 double:3.0496E-319;
        goto L_0x0025;
    L_0x0022:
        r12 = 49277; // 0xc07d float:6.9052E-41 double:2.4346E-319;
    L_0x0025:
        r21.<init>();
        r13 = "ۘۙۗ";
        r13 = s.ۢ۫ۗ.m350(r13);
    L_0x002e:
        switch(r13) {
            case 1739963: goto L_0x0077;
            case 1740120: goto L_0x00d4;
            case 1740834: goto L_0x00b0;
            case 1742665: goto L_0x008a;
            case 1747706: goto L_0x00e0;
            case 1747939: goto L_0x0066;
            case 1748332: goto L_0x013b;
            case 1748684: goto L_0x008e;
            case 1749749: goto L_0x0160;
            case 1752310: goto L_0x009a;
            case 1753561: goto L_0x018e;
            case 1758009: goto L_0x0047;
            case 1758025: goto L_0x01ad;
            default: goto L_0x0031;
        };
    L_0x0031:
        r13 = r23;
        r16 = r5;
        r17 = r6;
        r18 = r9;
        r19 = r10;
        r5 = "";
        r0.processName = r5;
        r0.packageName = r5;
        r6 = s.ۥۘۧ.f53;
        if (r6 == 0) goto L_0x01cd;
    L_0x0045:
        goto L_0x01ca;
    L_0x0047:
        s.۬۟ۜ.m366();
        r13 = s.ۡۥۗ.f47;
        if (r13 != 0) goto L_0x005a;
    L_0x004e:
        r13 = r23;
        r16 = r5;
        r17 = r6;
        r18 = r9;
        r19 = r10;
        goto L_0x01a2;
    L_0x005a:
        r13 = r23;
        r16 = r5;
        r17 = r6;
        r18 = r9;
        r19 = r10;
        goto L_0x0127;
    L_0x0066:
        r13 = s.۬۟ۜ.f23;
        if (r13 != 0) goto L_0x006b;
    L_0x006a:
        goto L_0x004e;
    L_0x006b:
        r13 = r23;
        r16 = r5;
        r17 = r6;
        r18 = r9;
        r19 = r10;
        goto L_0x01ca;
    L_0x0077:
        s.ۦۡۤ.m396();
        r13 = s.ۚۡۢ.f7;
        if (r13 != 0) goto L_0x004e;
    L_0x007e:
        r13 = r23;
        r16 = r5;
        r17 = r6;
        r18 = r9;
        r19 = r10;
        goto L_0x01be;
    L_0x008a:
        s.ۗ۠ۚ.m442();
        goto L_0x007e;
    L_0x008e:
        s.ۢ۟ۚ.m168();
        s.ۢ۫ۜ.m625();
        r1 = new java.lang.RuntimeException;
        r1.<init>();
        throw r1;
    L_0x009a:
        r13 = s.ۡۥۗ.m567(r9, r10, r11, r12);
        r13 = s.ۛۨۦ.m545(r6, r5, r13);
        r0.processName = r13;
        r13 = r23;
        r16 = r5;
        r17 = r6;
        r18 = r9;
        r19 = r10;
        goto L_0x0159;
    L_0x00b0:
        r13 = r0.processName;
        r14 = f72;
        r15 = 31;
        r16 = 1;
        r17 = s.ۗ۬۟.m257();
        if (r17 > 0) goto L_0x00c3;
    L_0x00be:
        r13 = r23;
        r16 = r5;
        goto L_0x00f1;
    L_0x00c3:
        r6 = "ۥۚ۫";
        r6 = s.ۢ۫ۗ.m350(r6);
        r9 = r14;
        r10 = 31;
        r11 = 1;
        r20 = r13;
        r13 = r6;
        r6 = r20;
        goto L_0x002e;
    L_0x00d4:
        r2 = r0.processName;
        r0.fileName = r2;
        r1 = r1.context;
        r0.context = r1;
        r21.createFile();
        return;
    L_0x00e0:
        r13 = r23;
        r0.configListener = r13;
        r14 = new java.io.File;
        r15 = f72;
        r16 = r5;
        r5 = 2;
        r17 = s.ۖۜ۟.m492();
        if (r17 == 0) goto L_0x00f4;
    L_0x00f1:
        r17 = r6;
        goto L_0x0100;
    L_0x00f4:
        r17 = r6;
        r6 = 22;
        r5 = s.ۘۡۜ.m674(r15, r5, r6, r12);
        r6 = s.ۛ۫ۧ.f49;
        if (r6 != 0) goto L_0x0103;
    L_0x0100:
        r18 = r9;
        goto L_0x0115;
    L_0x0103:
        r5 = s.ۦۡۤ.m389(r5);
        r6 = r0.packageName;
        r15 = f72;
        r18 = r9;
        r9 = 24;
        r19 = s.۟ۤۗ.m332();
        if (r19 > 0) goto L_0x0118;
    L_0x0115:
        r19 = r10;
        goto L_0x0177;
    L_0x0118:
        r19 = r10;
        r10 = 7;
        r9 = s.ۢ۫ۜ.m626(r15, r9, r10, r12);
        r5 = s.ۚ۟ۢ.m88(r5, r6, r9);
        r6 = s.ۗ۠ۚ.f28;
        if (r6 == 0) goto L_0x012b;
    L_0x0127:
        r5 = "۠ۨ۫";
        goto L_0x01a7;
    L_0x012b:
        r14.<init>(r5);
        r0.path = r14;
        r5 = s.ۡۥۗ.m568();
        if (r5 == 0) goto L_0x0138;
    L_0x0136:
        goto L_0x01ca;
    L_0x0138:
        r5 = "ۘۤۤ";
        goto L_0x015b;
    L_0x013b:
        r13 = r23;
        r16 = r5;
        r17 = r6;
        r18 = r9;
        r19 = r10;
        r5 = 1;
        r5 = s.ۤۗۛ.m376(r7, r8, r5, r12);
        r6 = s.ۡۥۗ.m561(r4, r5);
        if (r6 == 0) goto L_0x0159;
    L_0x0150:
        r6 = "ۙۜۥ";
        r6 = s.ۜۘۡ.m282(r6);
        r13 = r6;
        goto L_0x01d7;
    L_0x0159:
        r5 = "۠ۡۛ";
    L_0x015b:
        r5 = s.ۢ۫ۗ.m350(r5);
        goto L_0x01ab;
    L_0x0160:
        r13 = r23;
        r16 = r5;
        r17 = r6;
        r18 = r9;
        r19 = r10;
        r5 = r1.processName;
        r0.processName = r5;
        r6 = f72;
        r9 = 1;
        r10 = s.ۘۡۜ.m682();
        if (r10 < 0) goto L_0x017a;
    L_0x0177:
        r5 = "۫ۘۦ";
        goto L_0x01a7;
    L_0x017a:
        r4 = "ۡۖۡ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r13 = r4;
        r4 = r5;
        r7 = r6;
        r5 = r16;
        r6 = r17;
        r9 = r18;
        r10 = r19;
        r8 = 1;
        goto L_0x002e;
    L_0x018e:
        r13 = r23;
        r16 = r5;
        r17 = r6;
        r18 = r9;
        r19 = r10;
        r0.configListener = r3;
        r5 = r1.packageName;
        r0.packageName = r5;
        r5 = s.ۙۖۥ.f58;
        if (r5 == 0) goto L_0x01a5;
    L_0x01a2:
        r5 = "ۛۙۧ";
        goto L_0x015b;
    L_0x01a5:
        r5 = "ۢۥۘ";
    L_0x01a7:
        r5 = s.ۜۘۡ.m282(r5);
    L_0x01ab:
        r13 = r5;
        goto L_0x01d5;
    L_0x01ad:
        r13 = r23;
        r16 = r5;
        r17 = r6;
        r18 = r9;
        r19 = r10;
        r0.fileName = r2;
        r5 = 0;
        r6 = s.ۖۙۜ.f48;
        if (r6 != 0) goto L_0x01c1;
    L_0x01be:
        r5 = "ۡۡ۬";
        goto L_0x01a7;
    L_0x01c1:
        r3 = "ۦۤۗ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r13 = r3;
        r3 = r5;
        goto L_0x01d5;
    L_0x01ca:
        r5 = "ۘ۟ۢ";
        goto L_0x015b;
    L_0x01cd:
        r2 = "۫ۙۗ";
        r2 = s.ۜۘۡ.m282(r2);
        r13 = r2;
        r2 = r5;
    L_0x01d5:
        r5 = r16;
    L_0x01d7:
        r6 = r17;
        r9 = r18;
        r10 = r19;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReceiver.<init>(com.junge.algorithmAidePro.hook.JungeLoadPackageParam, com.junge.algorithmAidePro.Config.ConfigListener):void");
    }
}
