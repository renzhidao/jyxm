package com.junge.algorithmAidePro.Socket;

import java.net.Socket;

public class SocketProxy extends Socket {
    public MySocketFactory mySocketFactory;

    public SocketProxy() {
        this.mySocketFactory = null;
    }

    /* DevToolsApp WARNING: Missing block: B:10:0x0025, code:
            if (s.ۗ۬ۦ.f27 == 0) goto L_0x0032;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x0028, code:
            r2 = "ۤۨ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x0032, code:
            r2 = "ۜ۟ۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:36:0x0077, code:
            r2 = "۬ۜۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x008f, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    public SocketProxy(java.lang.String r2, int r3, java.net.InetAddress r4, int r5) {
        /*
        r1 = this;
        r0 = 0;
        r1.<init>(r2, r3, r4, r5);
        r2 = "ۤ۟ۚ";
    L_0x0006:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x000a:
        switch(r2) {
            case 1737798: goto L_0x001b;
            case 1739250: goto L_0x0042;
            case 1743626: goto L_0x0054;
            case 1743812: goto L_0x0036;
            case 1743983: goto L_0x007d;
            case 1747799: goto L_0x003f;
            case 1748797: goto L_0x004a;
            case 1751350: goto L_0x0069;
            case 1751487: goto L_0x0095;
            case 1751772: goto L_0x002c;
            case 1752861: goto L_0x0013;
            case 1753623: goto L_0x005f;
            case 1754163: goto L_0x0071;
            case 1758957: goto L_0x0085;
            case 1759084: goto L_0x0023;
            default: goto L_0x000d;
        };
    L_0x000d:
        r2 = s.ۨۗۥ.f42;
        if (r2 > 0) goto L_0x005c;
    L_0x0011:
        goto L_0x0077;
    L_0x0013:
        s.۠ۡ۟.m140();
        r2 = s.۟ۤۗ.f20;
        if (r2 <= 0) goto L_0x009a;
    L_0x001a:
        goto L_0x0028;
    L_0x001b:
        s.ۡۗۗ.m159();
        r2 = s.ۖۙۜ.f48;
        if (r2 == 0) goto L_0x0077;
    L_0x0022:
        goto L_0x0028;
    L_0x0023:
        r2 = s.ۗ۬ۦ.f27;
        if (r2 != 0) goto L_0x0028;
    L_0x0027:
        goto L_0x0032;
    L_0x0028:
        r2 = "ۤۨ۠";
        goto L_0x008f;
    L_0x002c:
        s.۠ۡۧ.m431();
        s.ۘۡۜ.m682();
    L_0x0032:
        r2 = "ۜ۟ۧ";
        goto L_0x008f;
    L_0x0036:
        s.ۘۡۜ.m682();
        r2 = new java.lang.RuntimeException;
        r2.<init>();
        throw r2;
    L_0x003f:
        r1.mySocketFactory = r0;
        return;
    L_0x0042:
        r2 = s.ۘۡۜ.f54;
        if (r2 == 0) goto L_0x0047;
    L_0x0046:
        goto L_0x0089;
    L_0x0047:
        r2 = "۠ۤۛ";
        goto L_0x0006;
    L_0x004a:
        r2 = s.ۙۖۥ.m748();
        if (r2 > 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0077;
    L_0x0051:
        r2 = "ۗۧۢ";
        goto L_0x0006;
    L_0x0054:
        r2 = s.ۡۥۗ.f47;
        if (r2 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x0089;
    L_0x0059:
        r2 = "ۡۥۡ";
        goto L_0x0006;
    L_0x005c:
        r2 = "ۜۙۧ";
        goto L_0x008f;
    L_0x005f:
        r2 = s.ۚۤۙ.m296();
        if (r2 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x009a;
    L_0x0066:
        r2 = "ۛ۫ۥ";
        goto L_0x0006;
    L_0x0069:
        r2 = s.ۗ۠ۚ.f28;
        if (r2 == 0) goto L_0x006e;
    L_0x006d:
        goto L_0x0089;
    L_0x006e:
        r2 = "ۦۦۗ";
        goto L_0x008f;
    L_0x0071:
        r2 = s.ۗۤ۫.m195();
        if (r2 < 0) goto L_0x007a;
    L_0x0077:
        r2 = "۬ۜۜ";
        goto L_0x0006;
    L_0x007a:
        r2 = "ۤۚ۬";
        goto L_0x0006;
    L_0x007d:
        r2 = s.ۧۧۡ.f11;
        if (r2 != 0) goto L_0x0082;
    L_0x0081:
        goto L_0x009a;
    L_0x0082:
        r2 = "ۧۘۤ";
        goto L_0x0006;
    L_0x0085:
        r2 = s.ۜۖۚ.f0;
        if (r2 < 0) goto L_0x008d;
    L_0x0089:
        r2 = "ۥ۬ۤ";
        goto L_0x0006;
    L_0x008d:
        r2 = "ۜۥۘ";
    L_0x008f:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x000a;
    L_0x0095:
        r2 = 0;
        r3 = s.ۤۤۖ.f35;
        if (r3 == 0) goto L_0x009e;
    L_0x009a:
        r2 = "ۖۗۧ";
        goto L_0x0006;
    L_0x009e:
        r3 = "۬ۘۙ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r0 = r2;
        r2 = r3;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Socket.SocketProxy.<init>(java.lang.String, int, java.net.InetAddress, int):void");
    }

    public MySocketFactory getMySocketFactory() {
        return this.mySocketFactory;
    }

    public void setMySocketFactory(MySocketFactory mySocketFactory) {
        this.mySocketFactory = mySocketFactory;
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x001a, code:
            if (s.ۡۢۡ.f3 < 0) goto L_0x002f;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0024, code:
            if (s.۟ۤۗ.m332() <= 0) goto L_0x002f;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0029, code:
            if (s.ۚۤۙ.f18 <= 0) goto L_0x002f;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x002f, code:
            r2 = "ۦۨۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x0078, code:
            r2 = "ۤ۠ۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x008c, code:
            r2 = "۫۠ۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x0092, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x009f, code:
            r2 = "ۙۧۧ";
     */
    public SocketProxy(java.net.InetAddress r2, int r3) {
        /*
        r1 = this;
        r0 = 0;
        r1.<init>(r2, r3);
        r2 = "۫۠ۨ";
    L_0x0006:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x000a:
        switch(r2) {
            case 1737937: goto L_0x007e;
            case 1738847: goto L_0x006a;
            case 1740372: goto L_0x0088;
            case 1741177: goto L_0x001d;
            case 1743220: goto L_0x0015;
            case 1743221: goto L_0x003e;
            case 1746880: goto L_0x0056;
            case 1748832: goto L_0x0074;
            case 1751531: goto L_0x0027;
            case 1752484: goto L_0x0060;
            case 1753695: goto L_0x0032;
            case 1755066: goto L_0x0041;
            case 1755193: goto L_0x0049;
            case 1758244: goto L_0x002c;
            case 1758259: goto L_0x0098;
            default: goto L_0x000d;
        };
    L_0x000d:
        r2 = s.ۨۧۜ.m755();
        if (r2 < 0) goto L_0x0053;
    L_0x0013:
        goto L_0x009f;
    L_0x0015:
        s.ۗۢۢ.m454();
        r2 = s.ۡۢۡ.f3;
        if (r2 >= 0) goto L_0x009f;
    L_0x001c:
        goto L_0x002f;
    L_0x001d:
        s.ۗۜ۟.m469();
        r2 = s.۟ۤۗ.m332();
        if (r2 > 0) goto L_0x0078;
    L_0x0026:
        goto L_0x002f;
    L_0x0027:
        r2 = s.ۚۤۙ.f18;
        if (r2 > 0) goto L_0x008c;
    L_0x002b:
        goto L_0x002f;
    L_0x002c:
        s.۫۫ۗ.m790();
    L_0x002f:
        r2 = "ۦۨۡ";
        goto L_0x0006;
    L_0x0032:
        s.۟ۤۗ.m332();
        s.ۡۗۗ.m159();
        r2 = new java.lang.RuntimeException;
        r2.<init>();
        throw r2;
    L_0x003e:
        r1.mySocketFactory = r0;
        return;
    L_0x0041:
        r2 = s.ۚۡۢ.f7;
        if (r2 != 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0082;
    L_0x0046:
        r2 = "ۛ۫ۥ";
        goto L_0x0092;
    L_0x0049:
        r2 = s.۬۟ۜ.m366();
        if (r2 == 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0082;
    L_0x0050:
        r2 = "ۨۖۨ";
        goto L_0x0006;
    L_0x0053:
        r2 = "ۨۚ۫";
        goto L_0x0006;
    L_0x0056:
        r2 = s.ۚۡۢ.m112();
        if (r2 < 0) goto L_0x005d;
    L_0x005c:
        goto L_0x008c;
    L_0x005d:
        r2 = "۟ۙۘ";
        goto L_0x0092;
    L_0x0060:
        r2 = s.ۦۡۤ.m396();
        if (r2 == 0) goto L_0x0067;
    L_0x0066:
        goto L_0x0078;
    L_0x0067:
        r2 = "۟ۥۦ";
        goto L_0x0006;
    L_0x006a:
        r2 = s.۠ۡ۟.m140();
        if (r2 > 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0082;
    L_0x0071:
        r2 = "ۥ۠۟";
        goto L_0x0006;
    L_0x0074:
        r2 = s.ۙۜۦ.f36;
        if (r2 > 0) goto L_0x007b;
    L_0x0078:
        r2 = "ۤ۠ۧ";
        goto L_0x0006;
    L_0x007b:
        r2 = "ۗۚۢ";
        goto L_0x0006;
    L_0x007e:
        r2 = s.ۙۜۦ.f36;
        if (r2 > 0) goto L_0x0085;
    L_0x0082:
        r2 = "ۛ۫ۤ";
        goto L_0x0092;
    L_0x0085:
        r2 = "ۡۦۥ";
        goto L_0x0092;
    L_0x0088:
        r2 = s.۬ۨۨ.f57;
        if (r2 == 0) goto L_0x0090;
    L_0x008c:
        r2 = "۫۠ۙ";
        goto L_0x0006;
    L_0x0090:
        r2 = "ۖۜۗ";
    L_0x0092:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x000a;
    L_0x0098:
        r2 = 0;
        r3 = s.۟ۧۢ.m774();
        if (r3 == 0) goto L_0x00a3;
    L_0x009f:
        r2 = "ۙۧۧ";
        goto L_0x0006;
    L_0x00a3:
        r3 = "ۘ۬ۨ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r0 = r2;
        r2 = r3;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Socket.SocketProxy.<init>(java.net.InetAddress, int):void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0017, code:
            if (s.ۗۜ۟.f33 > 0) goto L_0x005c;
     */
    /* DevToolsApp WARNING: Missing block: B:25:0x005c, code:
            r2 = "ۛۡۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x0072, code:
            r2 = "ۦ۠ۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:34:0x0078, code:
            r2 = "ۤۚۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:42:0x0092, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00aa, code:
            r2 = "ۜۘۥ";
     */
    public SocketProxy(java.net.InetAddress r2, int r3, java.net.InetAddress r4, int r5) {
        /*
        r1 = this;
        r0 = 0;
        r1.<init>(r2, r3, r4, r5);
        r2 = "ۖۙۥ";
    L_0x0006:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x000a:
        switch(r2) {
            case 1737858: goto L_0x00a3;
            case 1738107: goto L_0x007e;
            case 1738417: goto L_0x004c;
            case 1741084: goto L_0x0015;
            case 1742567: goto L_0x0042;
            case 1742896: goto L_0x0033;
            case 1743593: goto L_0x001a;
            case 1743609: goto L_0x006c;
            case 1749635: goto L_0x0098;
            case 1749666: goto L_0x003f;
            case 1751222: goto L_0x0056;
            case 1751339: goto L_0x002c;
            case 1752735: goto L_0x0089;
            case 1753441: goto L_0x0024;
            case 1758968: goto L_0x0062;
            default: goto L_0x000d;
        };
    L_0x000d:
        r2 = s.ۚۤۙ.m296();
        if (r2 == 0) goto L_0x007b;
    L_0x0013:
        goto L_0x0078;
    L_0x0015:
        r2 = s.ۗۜ۟.f33;
        if (r2 <= 0) goto L_0x00aa;
    L_0x0019:
        goto L_0x005c;
    L_0x001a:
        s.ۚۤۙ.m296();
        r2 = s.ۘۡۜ.m682();
        if (r2 >= 0) goto L_0x0072;
    L_0x0023:
        goto L_0x0078;
    L_0x0024:
        s.۟ۧۢ.m774();
        r2 = s.ۨۧۜ.f59;
        if (r2 != 0) goto L_0x0078;
    L_0x002b:
        goto L_0x005c;
    L_0x002c:
        s.ۘۡۜ.m682();
        s.ۛ۫ۧ.m593();
        goto L_0x005c;
    L_0x0033:
        s.۟ۤۗ.m332();
        s.۠ۡ۟.m140();
        r2 = new java.lang.RuntimeException;
        r2.<init>();
        throw r2;
    L_0x003f:
        r1.mySocketFactory = r0;
        return;
    L_0x0042:
        r2 = s.ۛ۫ۧ.f49;
        if (r2 != 0) goto L_0x0049;
    L_0x0046:
        r2 = "ۙۤۧ";
        goto L_0x0092;
    L_0x0049:
        r2 = "ۢۢۢ";
        goto L_0x0092;
    L_0x004c:
        r2 = s.ۡۗۗ.m159();
        if (r2 == 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0078;
    L_0x0053:
        r2 = "ۛۖۢ";
        goto L_0x0092;
    L_0x0056:
        r2 = s.۬۟ۜ.m366();
        if (r2 == 0) goto L_0x005f;
    L_0x005c:
        r2 = "ۛۡۖ";
        goto L_0x0092;
    L_0x005f:
        r2 = "ۖ۫ۦ";
        goto L_0x0006;
    L_0x0062:
        r2 = s.ۜۘۡ.m280();
        if (r2 == 0) goto L_0x0069;
    L_0x0068:
        goto L_0x0072;
    L_0x0069:
        r2 = "ۤۖۨ";
        goto L_0x0092;
    L_0x006c:
        r2 = s.ۗ۬۟.m257();
        if (r2 > 0) goto L_0x0075;
    L_0x0072:
        r2 = "ۦ۠ۛ";
        goto L_0x0092;
    L_0x0075:
        r2 = "۬ۘۤ";
        goto L_0x0006;
    L_0x0078:
        r2 = "ۤۚۡ";
        goto L_0x0006;
    L_0x007b:
        r2 = "ۜۙۖ";
        goto L_0x0006;
    L_0x007e:
        r2 = s.۟ۤۗ.m332();
        if (r2 > 0) goto L_0x0085;
    L_0x0084:
        goto L_0x00aa;
    L_0x0085:
        r2 = "ۙۦۛ";
        goto L_0x0006;
    L_0x0089:
        r2 = s.ۗ۬ۦ.m407();
        if (r2 != 0) goto L_0x0090;
    L_0x008f:
        goto L_0x00aa;
    L_0x0090:
        r2 = "ۖۡۦ";
    L_0x0092:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x000a;
    L_0x0098:
        r2 = s.ۜۖۚ.m7();
        if (r2 < 0) goto L_0x009f;
    L_0x009e:
        goto L_0x00aa;
    L_0x009f:
        r2 = "ۥۨۢ";
        goto L_0x0006;
    L_0x00a3:
        r2 = 0;
        r3 = s.ۢۜۘ.m255();
        if (r3 > 0) goto L_0x00ad;
    L_0x00aa:
        r2 = "ۜۘۥ";
        goto L_0x0092;
    L_0x00ad:
        r3 = "ۢۡۢ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r0 = r2;
        r2 = r3;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Socket.SocketProxy.<init>(java.net.InetAddress, int, java.net.InetAddress, int):void");
    }

    /* DevToolsApp WARNING: Missing block: B:9:0x0026, code:
            if (s.ۦۡۤ.m396() != 0) goto L_0x0066;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x002d, code:
            if (s.ۛۨۦ.m559() == false) goto L_0x0066;
     */
    /* DevToolsApp WARNING: Missing block: B:38:0x0082, code:
            r2 = "ۚ۬۠";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x0098, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00a5, code:
            r2 = "ۙۖۨ";
     */
    public SocketProxy(java.lang.String r2, int r3) {
        /*
        r1 = this;
        r0 = 0;
        r1.<init>(r2, r3);
        r2 = "ۗ۫ۧ";
    L_0x0006:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x000a:
        switch(r2) {
            case 1737919: goto L_0x0088;
            case 1738097: goto L_0x007e;
            case 1739379: goto L_0x009e;
            case 1739967: goto L_0x0076;
            case 1740329: goto L_0x0040;
            case 1740651: goto L_0x0013;
            case 1741658: goto L_0x001f;
            case 1742286: goto L_0x0029;
            case 1742662: goto L_0x0037;
            case 1742933: goto L_0x0043;
            case 1747703: goto L_0x0030;
            case 1748432: goto L_0x0060;
            case 1753627: goto L_0x004e;
            case 1754153: goto L_0x0058;
            case 1755215: goto L_0x006c;
            default: goto L_0x000d;
        };
    L_0x000d:
        r2 = s.ۜۖۚ.f0;
        if (r2 < 0) goto L_0x0096;
    L_0x0011:
        goto L_0x00a5;
    L_0x0013:
        r2 = s.ۡۢۡ.m58();
        if (r2 != 0) goto L_0x001b;
    L_0x0019:
        goto L_0x008e;
    L_0x001b:
        r2 = "ۚۘۘ";
        goto L_0x0098;
    L_0x001f:
        s.ۗۤ۫.m195();
        r2 = s.ۦۡۤ.m396();
        if (r2 == 0) goto L_0x0082;
    L_0x0028:
        goto L_0x0066;
    L_0x0029:
        r2 = s.ۛۨۦ.m559();
        if (r2 != 0) goto L_0x008e;
    L_0x002f:
        goto L_0x0066;
    L_0x0030:
        s.ۜۖۚ.m7();
        s.ۡۥۗ.m568();
        goto L_0x0066;
    L_0x0037:
        s.ۡۢۡ.m58();
        r2 = new java.lang.RuntimeException;
        r2.<init>();
        throw r2;
    L_0x0040:
        r1.mySocketFactory = r0;
        return;
    L_0x0043:
        r2 = s.ۜۘۡ.m280();
        if (r2 == 0) goto L_0x004b;
    L_0x0049:
        goto L_0x00a5;
    L_0x004b:
        r2 = "ۘ۫ۜ";
        goto L_0x0098;
    L_0x004e:
        r2 = s.ۢ۫ۜ.m625();
        if (r2 < 0) goto L_0x0055;
    L_0x0054:
        goto L_0x008e;
    L_0x0055:
        r2 = "ۛۢۜ";
        goto L_0x0098;
    L_0x0058:
        r2 = s.ۡۘۗ.f2;
        if (r2 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x0066;
    L_0x005d:
        r2 = "ۦۦۛ";
        goto L_0x0006;
    L_0x0060:
        r2 = s.ۚۤۙ.m296();
        if (r2 == 0) goto L_0x0069;
    L_0x0066:
        r2 = "ۛۙۤ";
        goto L_0x0006;
    L_0x0069:
        r2 = "ۧۘۚ";
        goto L_0x0098;
    L_0x006c:
        r2 = s.ۗۜ۟.m469();
        if (r2 > 0) goto L_0x0073;
    L_0x0072:
        goto L_0x0082;
    L_0x0073:
        r2 = "ۡۙۨ";
        goto L_0x0006;
    L_0x0076:
        r2 = s.ۜۘۡ.f17;
        if (r2 > 0) goto L_0x007b;
    L_0x007a:
        goto L_0x008e;
    L_0x007b:
        r2 = "ۨۛۢ";
        goto L_0x0006;
    L_0x007e:
        r2 = s.ۙۖۥ.f58;
        if (r2 == 0) goto L_0x0085;
    L_0x0082:
        r2 = "ۚ۬۠";
        goto L_0x0006;
    L_0x0085:
        r2 = "ۘ۟ۦ";
        goto L_0x0098;
    L_0x0088:
        r2 = s.ۗۜ۟.m469();
        if (r2 > 0) goto L_0x0092;
    L_0x008e:
        r2 = "۠ۡۘ";
        goto L_0x0006;
    L_0x0092:
        r2 = "ۖۡۜ";
        goto L_0x0006;
    L_0x0096:
        r2 = "ۖۛۤ";
    L_0x0098:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x000a;
    L_0x009e:
        r2 = 0;
        r3 = s.ۡۢۡ.m58();
        if (r3 == 0) goto L_0x00a8;
    L_0x00a5:
        r2 = "ۙۖۨ";
        goto L_0x0098;
    L_0x00a8:
        r3 = "ۚۗۨ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r0 = r2;
        r2 = r3;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Socket.SocketProxy.<init>(java.lang.String, int):void");
    }

    /* DevToolsApp WARNING: Missing block: B:8:0x0021, code:
            if (s.۠ۡ۟.m140() <= 0) goto L_0x0089;
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x0089, code:
            r1 = "۫ۧۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x0095, code:
            r1 = "ۧۖۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x00a3, code:
            r1 = "ۨ۬ۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x00a9, code:
            r1 = s.ۢ۫ۗ.m350(r1);
     */
    private static java.net.InetAddress[] nonNullAddress(java.net.InetAddress r3) {
        /*
        r0 = 0;
        r1 = "ۜ۫ۢ";
    L_0x0003:
        r1 = s.ۜۘۡ.m282(r1);
    L_0x0007:
        switch(r1) {
            case 1738200: goto L_0x0055;
            case 1739841: goto L_0x0079;
            case 1740169: goto L_0x0030;
            case 1743007: goto L_0x008f;
            case 1743118: goto L_0x0025;
            case 1743238: goto L_0x006f;
            case 1744012: goto L_0x0065;
            case 1744179: goto L_0x009c;
            case 1747060: goto L_0x003c;
            case 1747532: goto L_0x005d;
            case 1753138: goto L_0x0042;
            case 1754087: goto L_0x001a;
            case 1755731: goto L_0x0012;
            case 1758103: goto L_0x0083;
            case 1758459: goto L_0x0037;
            default: goto L_0x000a;
        };
    L_0x000a:
        r1 = s.ۙۖۥ.m748();
        if (r1 > 0) goto L_0x0052;
    L_0x0010:
        goto L_0x0089;
    L_0x0012:
        r1 = s.ۤۗۛ.m370();
        if (r1 >= 0) goto L_0x0095;
    L_0x0018:
        goto L_0x0089;
    L_0x001a:
        s.ۗۜ۟.m469();
        r1 = s.۠ۡ۟.m140();
        if (r1 > 0) goto L_0x0073;
    L_0x0023:
        goto L_0x0089;
    L_0x0025:
        s.ۗۜ۟.m469();
        r1 = s.۬ۗ۫.m98();
        if (r1 != 0) goto L_0x007d;
    L_0x002e:
        goto L_0x0089;
    L_0x0030:
        s.ۢ۟ۚ.m168();
        s.ۗۜۛ.m698();
        goto L_0x0089;
    L_0x0037:
        s.ۨۧۚ.m718();
        r3 = 0;
        return r3;
    L_0x003c:
        r0 = new java.net.InetAddress[r0];
        r1 = 0;
        r0[r1] = r3;
        return r0;
    L_0x0042:
        r1 = 1;
        r2 = s.ۥۘۧ.f53;
        if (r2 == 0) goto L_0x0049;
    L_0x0047:
        goto L_0x00a3;
    L_0x0049:
        r0 = "۟۫۠";
        r0 = s.ۜۘۡ.m282(r0);
        r1 = r0;
        r0 = 1;
        goto L_0x0007;
    L_0x0052:
        r1 = "ۦۖۢ";
        goto L_0x0003;
    L_0x0055:
        r1 = s.۟ۤۗ.f20;
        if (r1 > 0) goto L_0x005a;
    L_0x0059:
        goto L_0x0073;
    L_0x005a:
        r1 = "۟ۧۘ";
        goto L_0x00a9;
    L_0x005d:
        r1 = s.ۚ۟ۢ.f5;
        if (r1 != 0) goto L_0x0062;
    L_0x0061:
        goto L_0x007d;
    L_0x0062:
        r1 = "ۖۤۦ";
        goto L_0x0003;
    L_0x0065:
        r1 = s.۬ۗ۫.m98();
        if (r1 == 0) goto L_0x006c;
    L_0x006b:
        goto L_0x0089;
    L_0x006c:
        r1 = "۠ۛۧ";
        goto L_0x0003;
    L_0x006f:
        r1 = s.ۗ۬۟.f16;
        if (r1 == 0) goto L_0x0076;
    L_0x0073:
        r1 = "ۛۨۛ";
        goto L_0x00a9;
    L_0x0076:
        r1 = "ۜۦۖ";
        goto L_0x0003;
    L_0x0079:
        r1 = s.ۡۥۗ.f47;
        if (r1 == 0) goto L_0x0080;
    L_0x007d:
        r1 = "ۘۦۗ";
        goto L_0x0003;
    L_0x0080:
        r1 = "ۛ۬ۗ";
        goto L_0x00a9;
    L_0x0083:
        r1 = s.ۨۧۚ.m718();
        if (r1 > 0) goto L_0x008c;
    L_0x0089:
        r1 = "۫ۧۗ";
        goto L_0x00a9;
    L_0x008c:
        r1 = "ۘۛۤ";
        goto L_0x00a9;
    L_0x008f:
        r1 = s.۟ۥۙ.m650();
        if (r1 > 0) goto L_0x0099;
    L_0x0095:
        r1 = "ۧۖۖ";
        goto L_0x0003;
    L_0x0099:
        r1 = "۫ۛۧ";
        goto L_0x00a9;
    L_0x009c:
        s.ۢ۟ۚ.m162(r3);
        r1 = s.ۗ۬۟.f16;
        if (r1 == 0) goto L_0x00a7;
    L_0x00a3:
        r1 = "ۨ۬ۗ";
        goto L_0x0003;
    L_0x00a7:
        r1 = "ۛۤۨ";
    L_0x00a9:
        r1 = s.ۢ۫ۗ.m350(r1);
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Socket.SocketProxy.nonNullAddress(java.net.InetAddress):java.net.InetAddress[]");
    }
}
