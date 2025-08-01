package com.junge.algorithmAidePro.Socket;

import java.net.Socket;
import javax.net.SocketFactory;
import s.ۜۘۡ;

public class MySocketFactory extends SocketFactory {
    /* renamed from: ۛۢۥ */
    private static final short[] f114 = new short[]{(short) 3293, (short) 8417, (short) 8418, (short) 8423, (short) 8446, (short) 8416, (short) 8446, (short) 8416, (short) 8446, (short) 8417, (short) 345, (short) 15481, (short) 15482, (short) 15487, (short) 15462, (short) 15480, (short) 15462, (short) 15480, (short) 15462, (short) 15481};
    public String stack;

    public MySocketFactory(String str) {
        this.stack = str;
    }

    /* DevToolsApp WARNING: Missing block: B:7:0x0026, code:
            r13 = r18;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0032, code:
            if (s.ۘۡۜ.m682() < 0) goto L_0x0034;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x0034, code:
            r13 = r18;
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x003c, code:
            r13 = r18;
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x008e, code:
            r12 = "۫ۦۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:42:0x00c3, code:
            r12 = "ۙۛۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x00f9, code:
            r12 = "ۧۜ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x0129, code:
            r12 = "ۤۚ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:62:0x0148, code:
            r12 = s.ۢ۫ۗ.m350(r12);
     */
    /* DevToolsApp WARNING: Missing block: B:65:0x0156, code:
            r12 = "۬ۖۜ";
     */
    private boolean isLocalAddress(java.lang.String r18) {
        /*
        r17 = this;
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
        r12 = "ۨۨۘ";
    L_0x000e:
        r12 = s.ۜۘۡ.m282(r12);
    L_0x0012:
        switch(r12) {
            case 1737905: goto L_0x00b9;
            case 1738846: goto L_0x010b;
            case 1739676: goto L_0x013a;
            case 1740709: goto L_0x002e;
            case 1740792: goto L_0x0038;
            case 1740913: goto L_0x008a;
            case 1741625: goto L_0x004e;
            case 1741719: goto L_0x004c;
            case 1742838: goto L_0x011f;
            case 1746690: goto L_0x00d5;
            case 1747685: goto L_0x0050;
            case 1751349: goto L_0x0020;
            case 1753605: goto L_0x0092;
            case 1754149: goto L_0x00ed;
            case 1754295: goto L_0x0044;
            case 1755066: goto L_0x00a3;
            case 1755329: goto L_0x0062;
            case 1755338: goto L_0x0085;
            case 1755608: goto L_0x014e;
            case 1758898: goto L_0x0040;
            default: goto L_0x0015;
        };
    L_0x0015:
        r13 = r18;
        r12 = f114;
        r14 = 1;
        r15 = s.ۦۢۜ.f1;
        if (r15 > 0) goto L_0x0078;
    L_0x001e:
        goto L_0x0142;
    L_0x0020:
        r12 = s.۬ۨۨ.m730();
        if (r12 != 0) goto L_0x002a;
    L_0x0026:
        r13 = r18;
        goto L_0x00c3;
    L_0x002a:
        r13 = r18;
        goto L_0x0142;
    L_0x002e:
        r12 = s.ۘۡۜ.m682();
        if (r12 >= 0) goto L_0x0026;
    L_0x0034:
        r13 = r18;
        goto L_0x0156;
    L_0x0038:
        r12 = s.ۡۘۗ.f2;
        if (r12 == 0) goto L_0x0034;
    L_0x003c:
        r13 = r18;
        goto L_0x00f9;
    L_0x0040:
        s.ۥۘۧ.m662();
        goto L_0x003c;
    L_0x0044:
        s.ۗۜۛ.m698();
        s.۠ۡۧ.m431();
        r0 = 0;
        return r0;
    L_0x004c:
        r0 = 1;
        return r0;
    L_0x004e:
        r0 = 0;
        return r0;
    L_0x0050:
        r12 = s.ۦۡۤ.m394(r9, r10, r11, r8);
        r13 = r18;
        r12 = s.ۡۘۗ.m39(r13, r12);
        if (r12 == 0) goto L_0x005f;
    L_0x005c:
        r12 = "ۚۚۗ";
        goto L_0x000e;
    L_0x005f:
        r12 = "ۚۗۖ";
        goto L_0x000e;
    L_0x0062:
        r13 = r18;
        r12 = 9;
        r14 = s.۫۫ۗ.m790();
        if (r14 != 0) goto L_0x006e;
    L_0x006c:
        goto L_0x0142;
    L_0x006e:
        r11 = "۠۠ۥ";
        r11 = s.ۢ۫ۗ.m350(r11);
        r12 = r11;
        r11 = 9;
        goto L_0x0012;
    L_0x0078:
        r9 = "ۨ۟ۘ";
        r9 = s.ۜۘۡ.m282(r9);
        r10 = 1;
        r16 = r12;
        r12 = r9;
        r9 = r16;
        goto L_0x0012;
    L_0x0085:
        r13 = r18;
        r8 = 22650; // 0x587a float:3.174E-41 double:1.11906E-319;
        goto L_0x008e;
    L_0x008a:
        r13 = r18;
        r8 = 8400; // 0x20d0 float:1.1771E-41 double:4.15E-320;
    L_0x008e:
        r12 = "۫ۦۙ";
        goto L_0x0148;
    L_0x0092:
        r13 = r18;
        r12 = r6 + r7;
        r12 = r12 + r12;
        r12 = r5 - r12;
        if (r12 <= 0) goto L_0x009f;
    L_0x009b:
        r12 = "ۨ۟ۡ";
        goto L_0x000e;
    L_0x009f:
        r12 = "ۙ۟ۗ";
        goto L_0x0148;
    L_0x00a3:
        r13 = r18;
        r12 = 393149584; // 0x176efc90 float:7.7220726E-25 double:1.94241703E-315;
        r14 = s.ۨۧۚ.f56;
        if (r14 != 0) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00c3;
    L_0x00ad:
        r7 = "ۦۥۤ";
        r7 = s.ۢ۫ۗ.m350(r7);
        r12 = r7;
        r7 = 393149584; // 0x176efc90 float:7.7220726E-25 double:1.94241703E-315;
        goto L_0x0012;
    L_0x00b9:
        r13 = r18;
        r12 = r4 * r4;
        r14 = r2 * r2;
        r15 = s.ۨۧۚ.f56;
        if (r15 != 0) goto L_0x00c7;
    L_0x00c3:
        r12 = "ۙۛۚ";
        goto L_0x000e;
    L_0x00c7:
        r5 = "ۨۖۨ";
        r5 = s.ۜۘۡ.m282(r5);
        r6 = r14;
        r16 = r12;
        r12 = r5;
        r5 = r16;
        goto L_0x0012;
    L_0x00d5:
        r13 = r18;
        r12 = r2 + r3;
        r14 = s.ۢ۫ۜ.m625();
        if (r14 < 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x0129;
    L_0x00e0:
        r4 = "ۖۛۖ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r16 = r12;
        r12 = r4;
        r4 = r16;
        goto L_0x0012;
    L_0x00ed:
        r13 = r18;
        r12 = r0[r1];
        r14 = 19828; // 0x4d74 float:2.7785E-41 double:9.7963E-320;
        r15 = s.ۚۡۢ.m112();
        if (r15 < 0) goto L_0x00fc;
    L_0x00f9:
        r12 = "ۧۜ۬";
        goto L_0x0148;
    L_0x00fc:
        r2 = "۟۟ۢ";
        r2 = s.ۜۘۡ.m282(r2);
        r3 = 19828; // 0x4d74 float:2.7785E-41 double:9.7963E-320;
        r16 = r12;
        r12 = r2;
        r2 = r16;
        goto L_0x0012;
    L_0x010b:
        r13 = r18;
        r12 = 0;
        r14 = s.ۢ۫ۗ.m342();
        if (r14 != 0) goto L_0x0115;
    L_0x0114:
        goto L_0x0142;
    L_0x0115:
        r1 = "ۧۘۖ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r12 = r1;
        r1 = 0;
        goto L_0x0012;
    L_0x011f:
        r13 = r18;
        r12 = f114;
        r14 = s.۫۫ۗ.m790();
        if (r14 != 0) goto L_0x012d;
    L_0x0129:
        r12 = "ۤۚ۫";
        goto L_0x000e;
    L_0x012d:
        r0 = "ۗۚۡ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r16 = r12;
        r12 = r0;
        r0 = r16;
        goto L_0x0012;
    L_0x013a:
        r13 = r18;
        r12 = s.ۢ۫ۜ.m625();
        if (r12 < 0) goto L_0x0146;
    L_0x0142:
        r12 = "ۙۘۤ";
        goto L_0x000e;
    L_0x0146:
        r12 = "ۛ۟ۚ";
    L_0x0148:
        r12 = s.ۢ۫ۗ.m350(r12);
        goto L_0x0012;
    L_0x014e:
        r13 = r18;
        r12 = s.۬ۨۨ.m730();
        if (r12 == 0) goto L_0x015a;
    L_0x0156:
        r12 = "۬ۖۜ";
        goto L_0x000e;
    L_0x015a:
        r12 = "ۘۖۚ";
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Socket.MySocketFactory.isLocalAddress(java.lang.String):boolean");
    }

    public Socket createSocket() {
        Socket socketProxy = new SocketProxy();
        ۜۘۡ.m279(socketProxy, this);
        return socketProxy;
    }

    public String getStack() {
        return this.stack;
    }

    public void setStack(String str) {
        this.stack = str;
    }

    /* DevToolsApp WARNING: Missing block: B:29:0x0069, code:
            r0 = "۫ۘۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x00a7, code:
            r0 = "ۦۖۙ";
     */
    public java.net.Socket createSocket(java.lang.String r2, int r3) {
        /*
        r1 = this;
        r0 = "۫ۤۛ";
    L_0x0002:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x0006:
        switch(r0) {
            case 1738288: goto L_0x0012;
            case 1739812: goto L_0x0063;
            case 1739973: goto L_0x0077;
            case 1740789: goto L_0x0046;
            case 1740978: goto L_0x0021;
            case 1741144: goto L_0x0053;
            case 1743254: goto L_0x00a3;
            case 1747549: goto L_0x005b;
            case 1749645: goto L_0x0099;
            case 1749818: goto L_0x0040;
            case 1751380: goto L_0x006f;
            case 1753129: goto L_0x002a;
            case 1753252: goto L_0x0034;
            case 1753322: goto L_0x0081;
            case 1754556: goto L_0x008c;
            case 1757998: goto L_0x0038;
            case 1758370: goto L_0x00ad;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = new com.junge.algorithmAidePro.Socket.SocketProxy;
        r0.<init>(r2, r3);
        s.ۢ۫ۗ.m338(r0, r1);
        return r0;
    L_0x0012:
        s.ۢ۟ۚ.m168();
        r0 = s.ۤۗۛ.m370();
        if (r0 < 0) goto L_0x001d;
    L_0x001b:
        goto L_0x00b1;
    L_0x001d:
        r0 = "ۙۡۚ";
        goto L_0x00b7;
    L_0x0021:
        s.ۚ۟ۢ.m85();
        r0 = s.ۦۡۤ.f25;
        if (r0 == 0) goto L_0x00a7;
    L_0x0028:
        goto L_0x00b1;
    L_0x002a:
        s.۠ۡ۟.m140();
        r0 = s.ۗ۬ۦ.m407();
        if (r0 != 0) goto L_0x00b1;
    L_0x0033:
        goto L_0x0069;
    L_0x0034:
        s.ۥۘۧ.m662();
        goto L_0x0069;
    L_0x0038:
        s.ۨۘۢ.m318();
        s.۠ۡ۟.m140();
        r2 = 0;
        return r2;
    L_0x0040:
        r0 = new java.net.Socket;
        r0.<init>(r2, r3);
        return r0;
    L_0x0046:
        r0 = r1.isLocalAddress(r2);
        if (r0 == 0) goto L_0x004f;
    L_0x004c:
        r0 = "ۢۧ۟";
        goto L_0x0002;
    L_0x004f:
        r0 = "ۤۛۤ";
        goto L_0x00b7;
    L_0x0053:
        r0 = s.۠ۡ۟.f8;
        if (r0 > 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0092;
    L_0x0058:
        r0 = "ۙۛۗ";
        goto L_0x0002;
    L_0x005b:
        r0 = s.ۗ۬ۦ.f27;
        if (r0 == 0) goto L_0x0060;
    L_0x005f:
        goto L_0x00b1;
    L_0x0060:
        r0 = "ۙۦۥ";
        goto L_0x00b7;
    L_0x0063:
        r0 = s.ۢۜۘ.m255();
        if (r0 > 0) goto L_0x006c;
    L_0x0069:
        r0 = "۫ۘۛ";
        goto L_0x00b7;
    L_0x006c:
        r0 = "۠ۜۙ";
        goto L_0x0002;
    L_0x006f:
        r0 = s.ۙۜۦ.f36;
        if (r0 > 0) goto L_0x0074;
    L_0x0073:
        goto L_0x00b1;
    L_0x0074:
        r0 = "ۘۚۦ";
        goto L_0x0002;
    L_0x0077:
        r0 = s.ۗۜۛ.m698();
        if (r0 > 0) goto L_0x007e;
    L_0x007d:
        goto L_0x00b1;
    L_0x007e:
        r0 = "ۤۛ۫";
        goto L_0x0002;
    L_0x0081:
        r0 = s.ۗۢۢ.m454();
        if (r0 < 0) goto L_0x0088;
    L_0x0087:
        goto L_0x0092;
    L_0x0088:
        r0 = "ۘ۟۬";
        goto L_0x0002;
    L_0x008c:
        r0 = s.ۖۜ۟.m492();
        if (r0 == 0) goto L_0x0096;
    L_0x0092:
        r0 = "ۖۧۡ";
        goto L_0x0002;
    L_0x0096:
        r0 = "ۦۜ۠";
        goto L_0x00b7;
    L_0x0099:
        r0 = s.ۗۢۢ.m454();
        if (r0 < 0) goto L_0x00a0;
    L_0x009f:
        goto L_0x00b1;
    L_0x00a0:
        r0 = "ۧۥۚ";
        goto L_0x00b7;
    L_0x00a3:
        r0 = s.ۢ۫ۜ.f51;
        if (r0 < 0) goto L_0x00aa;
    L_0x00a7:
        r0 = "ۦۖۙ";
        goto L_0x00b7;
    L_0x00aa:
        r0 = "ۢۡ۬";
        goto L_0x00b7;
    L_0x00ad:
        r0 = s.ۙۜۦ.f36;
        if (r0 > 0) goto L_0x00b5;
    L_0x00b1:
        r0 = "ۦۚۘ";
        goto L_0x0002;
    L_0x00b5:
        r0 = "ۛ۬ۧ";
    L_0x00b7:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Socket.MySocketFactory.createSocket(java.lang.String, int):java.net.Socket");
    }

    /* DevToolsApp WARNING: Missing block: B:4:0x0010, code:
            if (s.ۗۜ۟.m469() > 0) goto L_0x0089;
     */
    /* DevToolsApp WARNING: Missing block: B:6:0x001b, code:
            if (s.ۚ۟ۢ.m85() != 0) goto L_0x0089;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0026, code:
            if (s.۫۫ۗ.m790() != false) goto L_0x00bc;
     */
    /* DevToolsApp WARNING: Missing block: B:34:0x007e, code:
            r0 = "۟ۤ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x00ac, code:
            r0 = "ۨۦۜ";
     */
    public java.net.Socket createSocket(java.lang.String r2, int r3, java.net.InetAddress r4, int r5) {
        /*
        r1 = this;
        r0 = "۠ۦ۫";
    L_0x0002:
        r0 = s.ۢ۫ۗ.m350(r0);
    L_0x0006:
        switch(r0) {
            case 1739286: goto L_0x0014;
            case 1739409: goto L_0x0078;
            case 1739751: goto L_0x0085;
            case 1740210: goto L_0x00a6;
            case 1740788: goto L_0x0070;
            case 1746743: goto L_0x0066;
            case 1746855: goto L_0x001f;
            case 1747871: goto L_0x002a;
            case 1747877: goto L_0x00b8;
            case 1748702: goto L_0x0052;
            case 1752630: goto L_0x0099;
            case 1754295: goto L_0x002f;
            case 1754378: goto L_0x005c;
            case 1755380: goto L_0x0091;
            case 1757979: goto L_0x003d;
            case 1758096: goto L_0x0037;
            case 1758903: goto L_0x0046;
            default: goto L_0x0009;
        };
    L_0x0009:
        s.ۨۧۚ.m718();
        r0 = s.ۗۜ۟.m469();
        if (r0 <= 0) goto L_0x009f;
    L_0x0012:
        goto L_0x0089;
    L_0x0014:
        s.۟ۥۙ.m650();
        r0 = s.ۚ۟ۢ.m85();
        if (r0 == 0) goto L_0x007e;
    L_0x001d:
        goto L_0x0089;
    L_0x001f:
        s.ۚۤۙ.m296();
        r0 = s.۫۫ۗ.m790();
        if (r0 == 0) goto L_0x0089;
    L_0x0028:
        goto L_0x00bc;
    L_0x002a:
        s.ۚ۟ۢ.m85();
        goto L_0x00bc;
    L_0x002f:
        s.ۤۗۛ.m370();
        s.۠ۡ۟.m140();
        r2 = 0;
        return r2;
    L_0x0037:
        r4 = new java.net.Socket;
        r4.<init>(r2, r3);
        return r4;
    L_0x003d:
        r0 = new com.junge.algorithmAidePro.Socket.SocketProxy;
        r0.<init>(r2, r3, r4, r5);
        s.ۜۘۡ.m279(r0, r1);
        return r0;
    L_0x0046:
        r0 = r1.isLocalAddress(r2);
        if (r0 == 0) goto L_0x004f;
    L_0x004c:
        r0 = "۫ۛ۠";
        goto L_0x0002;
    L_0x004f:
        r0 = "۫ۗۧ";
        goto L_0x0002;
    L_0x0052:
        r0 = s.ۗۜ۟.m469();
        if (r0 > 0) goto L_0x0059;
    L_0x0058:
        goto L_0x00ac;
    L_0x0059:
        r0 = "۬ۖۡ";
        goto L_0x0002;
    L_0x005c:
        r0 = s.ۨۧۚ.m718();
        if (r0 > 0) goto L_0x0063;
    L_0x0062:
        goto L_0x00bc;
    L_0x0063:
        r0 = "ۡۢ۟";
        goto L_0x00b2;
    L_0x0066:
        r0 = s.ۡۢۡ.m58();
        if (r0 == 0) goto L_0x006d;
    L_0x006c:
        goto L_0x0089;
    L_0x006d:
        r0 = "ۧ۟ۢ";
        goto L_0x00b2;
    L_0x0070:
        r0 = s.ۖۜ۟.f34;
        if (r0 < 0) goto L_0x0075;
    L_0x0074:
        goto L_0x009f;
    L_0x0075:
        r0 = "۟ۡۙ";
        goto L_0x0002;
    L_0x0078:
        r0 = s.ۡۥۗ.m568();
        if (r0 == 0) goto L_0x0081;
    L_0x007e:
        r0 = "۟ۤ۬";
        goto L_0x0002;
    L_0x0081:
        r0 = "ۙۛۖ";
        goto L_0x0002;
    L_0x0085:
        r0 = s.ۨۧۚ.f56;
        if (r0 != 0) goto L_0x008d;
    L_0x0089:
        r0 = "۠ۦۥ";
        goto L_0x0002;
    L_0x008d:
        r0 = "ۗ۬ۦ";
        goto L_0x0002;
    L_0x0091:
        r0 = s.۟ۤۗ.f20;
        if (r0 > 0) goto L_0x0096;
    L_0x0095:
        goto L_0x009f;
    L_0x0096:
        r0 = "ۘۘۧ";
        goto L_0x00b2;
    L_0x0099:
        r0 = s.ۢ۟ۚ.m168();
        if (r0 > 0) goto L_0x00a3;
    L_0x009f:
        r0 = "ۗۨۧ";
        goto L_0x0002;
    L_0x00a3:
        r0 = "ۨ۠۬";
        goto L_0x00b2;
    L_0x00a6:
        r0 = s.۬۟ۜ.m366();
        if (r0 == 0) goto L_0x00b0;
    L_0x00ac:
        r0 = "ۨۦۜ";
        goto L_0x0002;
    L_0x00b0:
        r0 = "ۥۥۖ";
    L_0x00b2:
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x0006;
    L_0x00b8:
        r0 = s.ۖۙۜ.f48;
        if (r0 != 0) goto L_0x00c0;
    L_0x00bc:
        r0 = "ۧۜ۬";
        goto L_0x0002;
    L_0x00c0:
        r0 = "ۘۧۡ";
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Socket.MySocketFactory.createSocket(java.lang.String, int, java.net.InetAddress, int):java.net.Socket");
    }

    /* DevToolsApp WARNING: Missing block: B:9:0x0026, code:
            if (s.ۦۢۜ.m16() == false) goto L_0x00a0;
     */
    /* DevToolsApp WARNING: Missing block: B:38:0x008a, code:
            r0 = "ۛ۬۫";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x00c0, code:
            r0 = "ۤۛ۟";
     */
    public java.net.Socket createSocket(java.net.InetAddress r2, int r3, java.net.InetAddress r4, int r5) {
        /*
        r1 = this;
        r0 = "۠ۖۨ";
    L_0x0002:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x0006:
        switch(r0) {
            case 1738194: goto L_0x00ac;
            case 1742246: goto L_0x006e;
            case 1743258: goto L_0x002a;
            case 1747378: goto L_0x00ba;
            case 1747825: goto L_0x0066;
            case 1749629: goto L_0x0078;
            case 1751303: goto L_0x001f;
            case 1751368: goto L_0x0033;
            case 1751566: goto L_0x0049;
            case 1751771: goto L_0x0043;
            case 1753453: goto L_0x005e;
            case 1754553: goto L_0x0052;
            case 1755163: goto L_0x0092;
            case 1758623: goto L_0x003b;
            case 1759048: goto L_0x009a;
            case 1759239: goto L_0x0080;
            case 1759255: goto L_0x0011;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = s.ۡۢۡ.m58();
        if (r0 == 0) goto L_0x008e;
    L_0x000f:
        goto L_0x008a;
    L_0x0011:
        s.ۗ۠ۚ.m442();
        r0 = s.ۡۘۗ.m32();
        if (r0 == 0) goto L_0x001c;
    L_0x001a:
        goto L_0x008a;
    L_0x001c:
        r0 = "ۤۙۜ";
        goto L_0x0002;
    L_0x001f:
        s.ۡۥۗ.m568();
        r0 = s.ۦۢۜ.m16();
        if (r0 != 0) goto L_0x008a;
    L_0x0028:
        goto L_0x00a0;
    L_0x002a:
        s.ۖۙۜ.m589();
        r0 = s.ۨۧۚ.f56;
        if (r0 != 0) goto L_0x00c0;
    L_0x0031:
        goto L_0x00a0;
    L_0x0033:
        s.ۦۢۜ.m16();
        s.ۖۙۜ.m589();
        goto L_0x00a0;
    L_0x003b:
        s.۬ۗ۫.m98();
        s.ۨۧۚ.m718();
        r2 = 0;
        return r2;
    L_0x0043:
        r4 = new java.net.Socket;
        r4.<init>(r2, r3);
        return r4;
    L_0x0049:
        r0 = new com.junge.algorithmAidePro.Socket.SocketProxy;
        r0.<init>(r2, r3, r4, r5);
        s.ۜۘۡ.m279(r0, r1);
        return r0;
    L_0x0052:
        r0 = r1.isLocalAddress(r2);
        if (r0 == 0) goto L_0x005b;
    L_0x0058:
        r0 = "ۤۨ۟";
        goto L_0x0002;
    L_0x005b:
        r0 = "ۤۡ۫";
        goto L_0x0002;
    L_0x005e:
        r0 = s.ۨۘۢ.f19;
        if (r0 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x00b2;
    L_0x0063:
        r0 = "ۧۥۗ";
        goto L_0x00a6;
    L_0x0066:
        r0 = s.ۤۤۖ.f35;
        if (r0 == 0) goto L_0x006b;
    L_0x006a:
        goto L_0x00a0;
    L_0x006b:
        r0 = "ۦ۠ۧ";
        goto L_0x0002;
    L_0x006e:
        r0 = s.ۘۡۜ.m682();
        if (r0 < 0) goto L_0x0075;
    L_0x0074:
        goto L_0x008a;
    L_0x0075:
        r0 = "۠ۥۖ";
        goto L_0x00a6;
    L_0x0078:
        r0 = s.ۗۜ۟.f33;
        if (r0 > 0) goto L_0x007d;
    L_0x007c:
        goto L_0x00b2;
    L_0x007d:
        r0 = "ۚ۫ۗ";
        goto L_0x0002;
    L_0x0080:
        r0 = s.ۡۗۗ.m159();
        if (r0 == 0) goto L_0x0087;
    L_0x0086:
        goto L_0x00b2;
    L_0x0087:
        r0 = "ۢۡۜ";
        goto L_0x00a6;
    L_0x008a:
        r0 = "ۛ۬۫";
        goto L_0x0002;
    L_0x008e:
        r0 = "۬ۡۜ";
        goto L_0x0002;
    L_0x0092:
        r0 = s.ۙۖۥ.f58;
        if (r0 == 0) goto L_0x0097;
    L_0x0096:
        goto L_0x00b2;
    L_0x0097:
        r0 = "۠ۜۙ";
        goto L_0x00a6;
    L_0x009a:
        r0 = s.ۚ۟ۢ.m85();
        if (r0 == 0) goto L_0x00a4;
    L_0x00a0:
        r0 = "۫۬۠";
        goto L_0x0002;
    L_0x00a4:
        r0 = "ۨۙ۬";
    L_0x00a6:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x0006;
    L_0x00ac:
        r0 = s.ۗۜۛ.m698();
        if (r0 > 0) goto L_0x00b6;
    L_0x00b2:
        r0 = "۬ۡ۬";
        goto L_0x0002;
    L_0x00b6:
        r0 = "۬ۛۗ";
        goto L_0x0002;
    L_0x00ba:
        r0 = s.ۖۙۜ.m589();
        if (r0 > 0) goto L_0x00c3;
    L_0x00c0:
        r0 = "ۤۛ۟";
        goto L_0x00a6;
    L_0x00c3:
        r0 = "ۖۤ۠";
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Socket.MySocketFactory.createSocket(java.net.InetAddress, int, java.net.InetAddress, int):java.net.Socket");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x002b, code:
            if (s.ۗ۬۟.m257() > 0) goto L_0x011e;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0033, code:
            if (s.ۚ۟ۢ.m85() != 0) goto L_0x016e;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x003c, code:
            if (s.ۜۘۡ.f17 <= 0) goto L_0x016e;
     */
    /* DevToolsApp WARNING: Missing block: B:22:0x006c, code:
            r15 = "ۚۘ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:40:0x00c5, code:
            r15 = "ۦۘ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:57:0x011e, code:
            r15 = "ۡۚۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:64:0x0149, code:
            r15 = "ۨۙۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:73:0x016e, code:
            r15 = "ۧۧۨ";
     */
    private boolean isLocalAddress(java.net.InetAddress r20) {
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
        r13 = 0;
        r14 = 0;
        r15 = "ۙۥۡ";
    L_0x0011:
        r15 = s.ۜۘۡ.m282(r15);
    L_0x0015:
        switch(r15) {
            case 1738442: goto L_0x0143;
            case 1738915: goto L_0x00d9;
            case 1741109: goto L_0x016a;
            case 1741678: goto L_0x0054;
            case 1741720: goto L_0x0100;
            case 1742886: goto L_0x00c3;
            case 1743212: goto L_0x00c0;
            case 1746495: goto L_0x0116;
            case 1746886: goto L_0x0040;
            case 1748459: goto L_0x0037;
            case 1748994: goto L_0x0090;
            case 1749627: goto L_0x0159;
            case 1751253: goto L_0x0070;
            case 1751278: goto L_0x0098;
            case 1751674: goto L_0x0097;
            case 1752249: goto L_0x0056;
            case 1752323: goto L_0x00c9;
            case 1752602: goto L_0x0097;
            case 1752869: goto L_0x0049;
            case 1753210: goto L_0x00b5;
            case 1753439: goto L_0x004a;
            case 1753654: goto L_0x00ea;
            case 1754632: goto L_0x0045;
            case 1755158: goto L_0x002f;
            case 1759022: goto L_0x0024;
            case 1759207: goto L_0x012f;
            default: goto L_0x0018;
        };
    L_0x0018:
        r15 = f114;
        r16 = 11;
        r17 = s.۠ۡ۟.m140();
        if (r17 > 0) goto L_0x0082;
    L_0x0022:
        goto L_0x011e;
    L_0x0024:
        s.ۘۡۜ.m682();
        r15 = s.ۗ۬۟.m257();
        if (r15 <= 0) goto L_0x0149;
    L_0x002d:
        goto L_0x011e;
    L_0x002f:
        r15 = s.ۚ۟ۢ.m85();
        if (r15 == 0) goto L_0x011e;
    L_0x0035:
        goto L_0x016e;
    L_0x0037:
        s.ۨۘۢ.m318();
        r15 = s.ۜۘۡ.f17;
        if (r15 > 0) goto L_0x015f;
    L_0x003e:
        goto L_0x016e;
    L_0x0040:
        s.ۚۡۢ.m112();
        goto L_0x016e;
    L_0x0045:
        s.۬ۗ۫.m98();
        r0 = 0;
    L_0x0049:
        return r0;
    L_0x004a:
        r15 = s.ۡۘۗ.m39(r2, r3);
        if (r15 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x006c;
    L_0x0051:
        r15 = "ۥ۬۬";
        goto L_0x0011;
    L_0x0054:
        r0 = 1;
        return r0;
    L_0x0056:
        r15 = s.ۨۗۥ.m531(r12, r13, r14, r11);
        r16 = s.ۡۘۗ.m39(r1, r15);
        if (r16 != 0) goto L_0x006c;
    L_0x0060:
        r3 = "ۦ۠ۙ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r18 = r15;
        r15 = r3;
        r3 = r18;
        goto L_0x0015;
    L_0x006c:
        r15 = "ۚۘ۬";
        goto L_0x0164;
    L_0x0070:
        r15 = 9;
        r16 = s.ۜۖۚ.f0;
        if (r16 < 0) goto L_0x0078;
    L_0x0076:
        goto L_0x011e;
    L_0x0078:
        r14 = "ۥۘ۬";
        r14 = s.ۜۘۡ.m282(r14);
        r15 = r14;
        r14 = 9;
        goto L_0x0015;
    L_0x0082:
        r12 = "ۤۗۨ";
        r12 = s.ۜۘۡ.m282(r12);
        r13 = 11;
        r18 = r15;
        r15 = r12;
        r12 = r18;
        goto L_0x0015;
    L_0x0090:
        if (r2 != 0) goto L_0x0093;
    L_0x0092:
        goto L_0x00b1;
    L_0x0093:
        r15 = "ۗۙۦ";
        goto L_0x0011;
    L_0x0097:
        return r0;
    L_0x0098:
        r15 = r20.getHostAddress();
        r16 = r20.getHostName();
        if (r15 == 0) goto L_0x00b1;
    L_0x00a2:
        r1 = "ۡ۫۬";
        r1 = s.ۜۘۡ.m282(r1);
        r2 = r16;
        r18 = r15;
        r15 = r1;
        r1 = r18;
        goto L_0x0015;
    L_0x00b1:
        r15 = "ۤۥۛ";
        goto L_0x0011;
    L_0x00b5:
        r0 = 0;
        if (r20 != 0) goto L_0x00bc;
    L_0x00b8:
        r15 = "ۥۤۙ";
        goto L_0x0011;
    L_0x00bc:
        r15 = "ۤۘۢ";
        goto L_0x0011;
    L_0x00c0:
        r11 = 28390; // 0x6ee6 float:3.9783E-41 double:1.40265E-319;
        goto L_0x00c5;
    L_0x00c3:
        r11 = 15432; // 0x3c48 float:2.1625E-41 double:7.6244E-320;
    L_0x00c5:
        r15 = "ۦۘ۬";
        goto L_0x0011;
    L_0x00c9:
        r15 = r6 + r10;
        r15 = r15 * r15;
        r15 = r9 - r15;
        if (r15 > 0) goto L_0x00d5;
    L_0x00d1:
        r15 = "ۛ۠۫";
        goto L_0x0164;
    L_0x00d5:
        r15 = "ۛ۫ۜ";
        goto L_0x0011;
    L_0x00d9:
        r15 = 1;
        r16 = s.ۡۥۗ.f47;
        if (r16 == 0) goto L_0x00e0;
    L_0x00de:
        goto L_0x016e;
    L_0x00e0:
        r10 = "ۥۛۙ";
        r10 = s.ۜۘۡ.m282(r10);
        r15 = r10;
        r10 = 1;
        goto L_0x0015;
    L_0x00ea:
        r15 = r8 + 1;
        r16 = s.ۥۥۚ.m614();
        if (r16 > 0) goto L_0x00f3;
    L_0x00f2:
        goto L_0x0149;
    L_0x00f3:
        r9 = "ۗۜۨ";
        r9 = s.ۢ۫ۗ.m350(r9);
        r18 = r15;
        r15 = r9;
        r9 = r18;
        goto L_0x0015;
    L_0x0100:
        r15 = r6 * r7;
        r16 = s.ۛۨۦ.f46;
        if (r16 == 0) goto L_0x0109;
    L_0x0106:
        r15 = "۬ۚۜ";
        goto L_0x0164;
    L_0x0109:
        r8 = "ۦۧۗ";
        r8 = s.ۜۘۡ.m282(r8);
        r18 = r15;
        r15 = r8;
        r8 = r18;
        goto L_0x0015;
    L_0x0116:
        r15 = r4[r5];
        r16 = 2;
        r17 = s.ۨۗۥ.f42;
        if (r17 > 0) goto L_0x0121;
    L_0x011e:
        r15 = "ۡۚۤ";
        goto L_0x0164;
    L_0x0121:
        r6 = "ۚۚۘ";
        r6 = s.ۜۘۡ.m282(r6);
        r7 = 2;
        r18 = r15;
        r15 = r6;
        r6 = r18;
        goto L_0x0015;
    L_0x012f:
        r15 = 10;
        r16 = s.ۢۜۘ.m255();
        if (r16 > 0) goto L_0x0138;
    L_0x0137:
        goto L_0x015f;
    L_0x0138:
        r5 = "۟ۙۙ";
        r5 = s.ۜۘۡ.m282(r5);
        r15 = r5;
        r5 = 10;
        goto L_0x0015;
    L_0x0143:
        r15 = f114;
        r16 = s.ۗ۬ۦ.f27;
        if (r16 == 0) goto L_0x014c;
    L_0x0149:
        r15 = "ۨۙۧ";
        goto L_0x0164;
    L_0x014c:
        r4 = "۬۠ۛ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r18 = r15;
        r15 = r4;
        r4 = r18;
        goto L_0x0015;
    L_0x0159:
        r15 = s.ۢۜۘ.m255();
        if (r15 > 0) goto L_0x0162;
    L_0x015f:
        r15 = "۟ۥ۬";
        goto L_0x0164;
    L_0x0162:
        r15 = "ۖ۬۠";
    L_0x0164:
        r15 = s.ۢ۫ۗ.m350(r15);
        goto L_0x0015;
    L_0x016a:
        r15 = s.ۘۡۜ.f54;
        if (r15 == 0) goto L_0x0171;
    L_0x016e:
        r15 = "ۧۧۨ";
        goto L_0x0164;
    L_0x0171:
        r15 = "ۢۡۚ";
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Socket.MySocketFactory.isLocalAddress(java.net.InetAddress):boolean");
    }

    /* DevToolsApp WARNING: Missing block: B:4:0x000d, code:
            if (s.ۡۥۗ.m568() == 0) goto L_0x001e;
     */
    /* DevToolsApp WARNING: Missing block: B:6:0x0012, code:
            if (s.ۢ۫ۜ.f51 < 0) goto L_0x009c;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x001e, code:
            r0 = "ۤۨ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:38:0x007c, code:
            r0 = "ۘۜۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x00ab, code:
            r0 = "۠۫ۛ";
     */
    public java.net.Socket createSocket(java.net.InetAddress r2, int r3) {
        /*
        r1 = this;
        r0 = "۟ۗۤ";
    L_0x0002:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x0006:
        switch(r0) {
            case 1738038: goto L_0x0098;
            case 1738434: goto L_0x0026;
            case 1739221: goto L_0x002b;
            case 1740355: goto L_0x0031;
            case 1741672: goto L_0x006e;
            case 1742070: goto L_0x0052;
            case 1746444: goto L_0x00a7;
            case 1746916: goto L_0x0078;
            case 1748016: goto L_0x0016;
            case 1749006: goto L_0x003a;
            case 1751784: goto L_0x0021;
            case 1752301: goto L_0x008a;
            case 1753606: goto L_0x0010;
            case 1754521: goto L_0x005c;
            case 1755484: goto L_0x004a;
            case 1758617: goto L_0x0066;
            case 1759402: goto L_0x0082;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = s.ۡۥۗ.m568();
        if (r0 != 0) goto L_0x0090;
    L_0x000f:
        goto L_0x001e;
    L_0x0010:
        r0 = s.ۢ۫ۜ.f51;
        if (r0 >= 0) goto L_0x00ab;
    L_0x0014:
        goto L_0x009c;
    L_0x0016:
        r0 = s.ۤۤۖ.m506();
        if (r0 != 0) goto L_0x001e;
    L_0x001c:
        goto L_0x009c;
    L_0x001e:
        r0 = "ۤۨ۬";
        goto L_0x0002;
    L_0x0021:
        s.ۢ۟ۚ.m168();
        goto L_0x009c;
    L_0x0026:
        s.ۙۜۦ.m520();
        r2 = 0;
        return r2;
    L_0x002b:
        r0 = new java.net.Socket;
        r0.<init>(r2, r3);
        return r0;
    L_0x0031:
        r0 = new com.junge.algorithmAidePro.Socket.SocketProxy;
        r0.<init>(r2, r3);
        s.ۜۘۡ.m279(r0, r1);
        return r0;
    L_0x003a:
        r0 = r2.getHostAddress();
        r0 = r1.isLocalAddress(r0);
        if (r0 == 0) goto L_0x0047;
    L_0x0044:
        r0 = "ۗۦۤ";
        goto L_0x0002;
    L_0x0047:
        r0 = "ۘ۬ۗ";
        goto L_0x0002;
    L_0x004a:
        r0 = s.۟ۥۙ.f52;
        if (r0 == 0) goto L_0x004f;
    L_0x004e:
        goto L_0x007c;
    L_0x004f:
        r0 = "ۡ۬ۙ";
        goto L_0x0002;
    L_0x0052:
        r0 = s.ۚۡۢ.m112();
        if (r0 < 0) goto L_0x0059;
    L_0x0058:
        goto L_0x009c;
    L_0x0059:
        r0 = "ۨۤۘ";
        goto L_0x0002;
    L_0x005c:
        r0 = s.ۢ۫ۜ.m625();
        if (r0 < 0) goto L_0x0063;
    L_0x0062:
        goto L_0x00ab;
    L_0x0063:
        r0 = "ۚۥۡ";
        goto L_0x0002;
    L_0x0066:
        r0 = s.۟ۧۢ.f60;
        if (r0 > 0) goto L_0x006b;
    L_0x006a:
        goto L_0x007c;
    L_0x006b:
        r0 = "ۧۤۖ";
        goto L_0x00a1;
    L_0x006e:
        r0 = s.ۨۧۚ.m718();
        if (r0 > 0) goto L_0x0075;
    L_0x0074:
        goto L_0x0090;
    L_0x0075:
        r0 = "۫۬ۚ";
        goto L_0x00a1;
    L_0x0078:
        r0 = s.ۡۢۡ.f3;
        if (r0 < 0) goto L_0x007f;
    L_0x007c:
        r0 = "ۘۜۡ";
        goto L_0x00a1;
    L_0x007f:
        r0 = "ۚۘۦ";
        goto L_0x0002;
    L_0x0082:
        r0 = s.ۜۘۡ.f17;
        if (r0 > 0) goto L_0x0087;
    L_0x0086:
        goto L_0x0090;
    L_0x0087:
        r0 = "۟ۦ۫";
        goto L_0x00a1;
    L_0x008a:
        r0 = s.ۥۥۚ.m614();
        if (r0 > 0) goto L_0x0094;
    L_0x0090:
        r0 = "ۦۥۥ";
        goto L_0x0002;
    L_0x0094:
        r0 = "۬ۦۤ";
        goto L_0x0002;
    L_0x0098:
        r0 = s.ۗ۠ۚ.f28;
        if (r0 == 0) goto L_0x009f;
    L_0x009c:
        r0 = "ۖ۬ۘ";
        goto L_0x00a1;
    L_0x009f:
        r0 = "ۥۚۢ";
    L_0x00a1:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x0006;
    L_0x00a7:
        r0 = s.ۤۤۖ.f35;
        if (r0 == 0) goto L_0x00ae;
    L_0x00ab:
        r0 = "۠۫ۛ";
        goto L_0x00a1;
    L_0x00ae:
        r0 = "ۖ۟۟";
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Socket.MySocketFactory.createSocket(java.net.InetAddress, int):java.net.Socket");
    }
}
