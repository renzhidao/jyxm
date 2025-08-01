package com.junge.algorithmAidePro.Thread;

import com.junge.algorithmAidePro.bean.ReqableStack;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class SendReqableStackThread implements Runnable {
    public static final int UDP_PORT = 27039;
    private static SendReqableStackThread instance;
    /* renamed from: ۫ۡۘ */
    private static final short[] f116 = new short[]{(short) 6323, (short) 23811, (short) 23808, (short) 23813, (short) 23836, (short) 23810, (short) 23836, (short) 23810, (short) 23836, (short) 23811};
    public ReentrantLock lock;
    private final LinkedBlockingQueue<ReqableStack> tasks;

    /* DevToolsApp WARNING: Missing block: B:8:0x001a, code:
            if (s.ۨۘۢ.f19 == 0) goto L_0x0025;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x001f, code:
            if (s.۫۫ۗ.f65 != 0) goto L_0x0025;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x0025, code:
            r1 = "۟ۨۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x0056, code:
            r1 = "ۨۛۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:36:0x0068, code:
            r1 = "۫ۗ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x0088, code:
            r1 = "ۘۜۘ";
     */
    public void send(com.junge.algorithmAidePro.bean.ReqableStack r3) {
        /*
        r2 = this;
        r0 = 0;
        r1 = "ۤۙ۬";
    L_0x0003:
        r1 = s.ۜۘۡ.m282(r1);
    L_0x0007:
        switch(r1) {
            case 1738320: goto L_0x005c;
            case 1739860: goto L_0x0022;
            case 1744078: goto L_0x0040;
            case 1746776: goto L_0x0052;
            case 1746975: goto L_0x0029;
            case 1747059: goto L_0x0031;
            case 1747840: goto L_0x0048;
            case 1748528: goto L_0x002c;
            case 1748896: goto L_0x0076;
            case 1749287: goto L_0x0064;
            case 1751319: goto L_0x008f;
            case 1751504: goto L_0x0082;
            case 1753147: goto L_0x006e;
            case 1753608: goto L_0x0010;
            case 1755220: goto L_0x0018;
            case 1757971: goto L_0x001d;
            case 1758506: goto L_0x002d;
            default: goto L_0x000a;
        };
    L_0x000a:
        r1 = s.ۙۜۦ.f36;
        if (r1 > 0) goto L_0x003d;
    L_0x000e:
        goto L_0x0095;
    L_0x0010:
        s.ۥۥۚ.m614();
        r1 = s.ۥۥۚ.f50;
        if (r1 == 0) goto L_0x0056;
    L_0x0017:
        goto L_0x0025;
    L_0x0018:
        r1 = s.ۨۘۢ.f19;
        if (r1 != 0) goto L_0x0068;
    L_0x001c:
        goto L_0x0025;
    L_0x001d:
        r1 = s.۫۫ۗ.f65;
        if (r1 == 0) goto L_0x0088;
    L_0x0021:
        goto L_0x0025;
    L_0x0022:
        s.ۙۜۦ.m520();
    L_0x0025:
        r1 = "۟ۨۨ";
        goto L_0x007d;
    L_0x0029:
        s.ۚ۟ۢ.m85();
    L_0x002c:
        return;
    L_0x002d:
        s.ۜۖۚ.m4(r0);
        goto L_0x0036;
    L_0x0031:
        r1 = r2.tasks;	 Catch:{ Exception -> 0x0039 }
        r1.put(r3);	 Catch:{ Exception -> 0x0039 }
    L_0x0036:
        r1 = "ۡۜ۫";
        goto L_0x007d;
    L_0x0039:
        r0 = move-exception;
        r1 = "۫ۨۧ";
        goto L_0x007d;
    L_0x003d:
        r1 = "۟۫۟";
        goto L_0x007d;
    L_0x0040:
        r1 = s.ۙۖۥ.f58;
        if (r1 == 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0095;
    L_0x0045:
        r1 = "۠۫ۘ";
        goto L_0x0003;
    L_0x0048:
        r1 = s.ۚۡۢ.m112();
        if (r1 < 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0095;
    L_0x004f:
        r1 = "ۜۨۚ";
        goto L_0x0003;
    L_0x0052:
        r1 = s.۫ۢ۠.f14;
        if (r1 > 0) goto L_0x0059;
    L_0x0056:
        r1 = "ۨۛۧ";
        goto L_0x0003;
    L_0x0059:
        r1 = "۠ۥۥ";
        goto L_0x007d;
    L_0x005c:
        r1 = s.۬ۨۨ.f57;
        if (r1 == 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0088;
    L_0x0061:
        r1 = "۟ۢۛ";
        goto L_0x0003;
    L_0x0064:
        r1 = s.ۤۗۛ.f24;
        if (r1 == 0) goto L_0x006b;
    L_0x0068:
        r1 = "۫ۗ۟";
        goto L_0x007d;
    L_0x006b:
        r1 = "ۖۨۢ";
        goto L_0x007d;
    L_0x006e:
        r1 = s.۬ۗ۫.f6;
        if (r1 < 0) goto L_0x0073;
    L_0x0072:
        goto L_0x0095;
    L_0x0073:
        r1 = "ۢۖۛ";
        goto L_0x0003;
    L_0x0076:
        r1 = s.ۧۧۡ.f11;
        if (r1 != 0) goto L_0x007b;
    L_0x007a:
        goto L_0x0095;
    L_0x007b:
        r1 = "ۦۖ۫";
    L_0x007d:
        r1 = s.ۢ۫ۗ.m350(r1);
        goto L_0x0007;
    L_0x0082:
        r1 = s.ۗۤ۫.m195();
        if (r1 < 0) goto L_0x008b;
    L_0x0088:
        r1 = "ۘۜۘ";
        goto L_0x007d;
    L_0x008b:
        r1 = "ۡۨۧ";
        goto L_0x0003;
    L_0x008f:
        r1 = s.ۡۘۗ.m32();
        if (r1 == 0) goto L_0x0099;
    L_0x0095:
        r1 = "ۦۥۧ";
        goto L_0x0003;
    L_0x0099:
        r1 = "ۤ۟۫";
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Thread.SendReqableStackThread.send(com.junge.algorithmAidePro.bean.ReqableStack):void");
    }

    /* DevToolsApp WARNING: Missing block: B:12:0x0030, code:
            if (s.ۨۧۚ.m718() <= 0) goto L_0x00e5;
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x0034, code:
            r1 = "ۘۚۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:15:0x003b, code:
            if (s.ۗ۠ۚ.m442() > 0) goto L_0x004f;
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x0042, code:
            if (s.ۗ۠ۚ.m442() <= 0) goto L_0x0107;
     */
    /* DevToolsApp WARNING: Missing block: B:19:0x004b, code:
            if (s.ۨۘۢ.f19 == 0) goto L_0x00e5;
     */
    /* DevToolsApp WARNING: Missing block: B:20:0x004f, code:
            r1 = "ۖۥۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:28:0x0091, code:
            r1 = "ۢۛۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:37:0x00ad, code:
            r1 = "ۨۨ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:41:0x00b9, code:
            r1 = "ۛۛۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x00c4, code:
            r1 = "ۦۢۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:61:0x00f8, code:
            r1 = "۬ۖۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:66:0x0107, code:
            r1 = "۫ۡ۬";
     */
    public void send(java.net.Socket r5, java.lang.String r6, java.lang.String r7, int r8) {
        /*
        r4 = this;
        r0 = 0;
        r1 = "ۤۘۘ";
    L_0x0003:
        r1 = s.ۜۘۡ.m282(r1);
    L_0x0007:
        switch(r1) {
            case 1737824: goto L_0x005d;
            case 1738219: goto L_0x0052;
            case 1738220: goto L_0x0066;
            case 1738282: goto L_0x002c;
            case 1739808: goto L_0x0037;
            case 1740184: goto L_0x0012;
            case 1741878: goto L_0x00df;
            case 1742712: goto L_0x0025;
            case 1747525: goto L_0x00ec;
            case 1748373: goto L_0x00c0;
            case 1748405: goto L_0x009a;
            case 1749005: goto L_0x00b5;
            case 1749455: goto L_0x0065;
            case 1751268: goto L_0x0103;
            case 1751315: goto L_0x00ca;
            case 1752493: goto L_0x00d5;
            case 1753194: goto L_0x00a7;
            case 1753512: goto L_0x001c;
            case 1755627: goto L_0x003e;
            case 1758294: goto L_0x0062;
            case 1758894: goto L_0x0046;
            case 1759028: goto L_0x006a;
            default: goto L_0x000a;
        };
    L_0x000a:
        r1 = s.۟ۤۗ.m332();
        if (r1 > 0) goto L_0x00fb;
    L_0x0010:
        goto L_0x00f8;
    L_0x0012:
        s.ۗ۬۟.m257();
        r1 = s.ۛ۫ۧ.m593();
        if (r1 > 0) goto L_0x00c4;
    L_0x001b:
        goto L_0x004f;
    L_0x001c:
        s.ۥۥۚ.m614();
        r1 = s.ۗۜۛ.f55;
        if (r1 == 0) goto L_0x00b9;
    L_0x0023:
        goto L_0x00f2;
    L_0x0025:
        r1 = s.ۤۗۛ.m370();
        if (r1 >= 0) goto L_0x00f2;
    L_0x002b:
        goto L_0x0034;
    L_0x002c:
        r1 = s.ۨۧۚ.m718();
        if (r1 > 0) goto L_0x0034;
    L_0x0032:
        goto L_0x00e5;
    L_0x0034:
        r1 = "ۘۚۢ";
        goto L_0x0003;
    L_0x0037:
        r1 = s.ۗ۠ۚ.m442();
        if (r1 <= 0) goto L_0x00ad;
    L_0x003d:
        goto L_0x004f;
    L_0x003e:
        r1 = s.ۗ۠ۚ.m442();
        if (r1 > 0) goto L_0x00f8;
    L_0x0044:
        goto L_0x0107;
    L_0x0046:
        s.ۗ۬ۦ.m407();
        r1 = s.ۨۘۢ.f19;
        if (r1 != 0) goto L_0x004f;
    L_0x004d:
        goto L_0x00e5;
    L_0x004f:
        r1 = "ۖۥۚ";
        goto L_0x0003;
    L_0x0052:
        s.۫۫ۗ.m790();
        r1 = s.ۨۗۥ.m536();
        if (r1 != 0) goto L_0x00e5;
    L_0x005b:
        goto L_0x0107;
    L_0x005d:
        s.ۡۥۗ.m568();
        goto L_0x0107;
    L_0x0062:
        s.ۙۖۥ.m748();
    L_0x0065:
        return;
    L_0x0066:
        s.ۜۖۚ.m4(r0);
        goto L_0x0091;
    L_0x006a:
        r1 = r5.getRemoteSocketAddress();	 Catch:{ Exception -> 0x0095 }
        r1 = (java.net.InetSocketAddress) r1;	 Catch:{ Exception -> 0x0095 }
        r2 = r5.getLocalPort();	 Catch:{ Exception -> 0x0095 }
        r1 = r1.getPort();	 Catch:{ Exception -> 0x0095 }
        r3 = new com.junge.algorithmAidePro.bean.ReqableStack;	 Catch:{ Exception -> 0x0095 }
        r3.<init>();	 Catch:{ Exception -> 0x0095 }
        r3.setStack(r7);	 Catch:{ Exception -> 0x0095 }
        r3.setLocalPort(r2);	 Catch:{ Exception -> 0x0095 }
        r3.setRemotePort(r1);	 Catch:{ Exception -> 0x0095 }
        r3.setPackageName(r6);	 Catch:{ Exception -> 0x0095 }
        r3.setLevel(r8);	 Catch:{ Exception -> 0x0095 }
        r1 = r4.tasks;	 Catch:{ Exception -> 0x0095 }
        r1.put(r3);	 Catch:{ Exception -> 0x0095 }
    L_0x0091:
        r1 = "ۢۛۨ";
        goto L_0x00fd;
    L_0x0095:
        r0 = move-exception;
        r1 = "ۖۥۛ";
        goto L_0x00fd;
    L_0x009a:
        r1 = s.ۢ۫ۜ.m625();
        if (r1 < 0) goto L_0x00a3;
    L_0x00a0:
        r1 = "ۘۦۦ";
        goto L_0x00fd;
    L_0x00a3:
        r1 = "۬ۚۢ";
        goto L_0x0003;
    L_0x00a7:
        r1 = s.۫۫ۗ.m790();
        if (r1 != 0) goto L_0x00b1;
    L_0x00ad:
        r1 = "ۨۨ۫";
        goto L_0x0003;
    L_0x00b1:
        r1 = "ۡۘ۬";
        goto L_0x0003;
    L_0x00b5:
        r1 = s.ۢ۫ۗ.f21;
        if (r1 == 0) goto L_0x00bd;
    L_0x00b9:
        r1 = "ۛۛۘ";
        goto L_0x0003;
    L_0x00bd:
        r1 = "ۦۘۜ";
        goto L_0x00fd;
    L_0x00c0:
        r1 = s.۬ۗ۫.f6;
        if (r1 < 0) goto L_0x00c7;
    L_0x00c4:
        r1 = "ۦۢۤ";
        goto L_0x00fd;
    L_0x00c7:
        r1 = "ۡ۬ۘ";
        goto L_0x00fd;
    L_0x00ca:
        r1 = s.ۚۡۢ.m112();
        if (r1 < 0) goto L_0x00d1;
    L_0x00d0:
        goto L_0x00e5;
    L_0x00d1:
        r1 = "ۡۗ۫";
        goto L_0x0003;
    L_0x00d5:
        r1 = s.ۦۡۤ.m396();
        if (r1 == 0) goto L_0x00dc;
    L_0x00db:
        goto L_0x00f2;
    L_0x00dc:
        r1 = "ۤۙۨ";
        goto L_0x00fd;
    L_0x00df:
        r1 = s.ۗۤ۫.m195();
        if (r1 < 0) goto L_0x00e9;
    L_0x00e5:
        r1 = "ۖۘۢ";
        goto L_0x0003;
    L_0x00e9:
        r1 = "ۥ۠ۨ";
        goto L_0x00fd;
    L_0x00ec:
        r1 = s.۠ۡۧ.m431();
        if (r1 != 0) goto L_0x00f5;
    L_0x00f2:
        r1 = "ۖۧۛ";
        goto L_0x00fd;
    L_0x00f5:
        r1 = "ۚ۟ۛ";
        goto L_0x00fd;
    L_0x00f8:
        r1 = "۬ۖۘ";
        goto L_0x00fd;
    L_0x00fb:
        r1 = "۠ۛ۠";
    L_0x00fd:
        r1 = s.ۢ۫ۗ.m350(r1);
        goto L_0x0007;
    L_0x0103:
        r1 = s.۠ۡۧ.f26;
        if (r1 == 0) goto L_0x010a;
    L_0x0107:
        r1 = "۫ۡ۬";
        goto L_0x00fd;
    L_0x010a:
        r1 = "۬ۛۤ";
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Thread.SendReqableStackThread.send(java.net.Socket, java.lang.String, java.lang.String, int):void");
    }

    /* DevToolsApp WARNING: Missing block: B:10:0x002b, code:
            if (s.ۚ۟ۢ.m85() != 0) goto L_0x0071;
     */
    /* DevToolsApp WARNING: Missing block: B:22:0x0057, code:
            r1 = "۬ۗۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:34:0x007d, code:
            r1 = "ۚۙۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:41:0x0092, code:
            r1 = "۫ۚۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x00ba, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
    public static com.junge.algorithmAidePro.Thread.SendReqableStackThread getInstance() {
        /*
        r0 = 0;
        r1 = "ۚ۬ۦ";
    L_0x0003:
        r1 = s.ۢ۫ۗ.m350(r1);
    L_0x0007:
        switch(r1) {
            case 1739717: goto L_0x0077;
            case 1739752: goto L_0x0024;
            case 1741702: goto L_0x0012;
            case 1742261: goto L_0x0037;
            case 1742292: goto L_0x00b4;
            case 1743253: goto L_0x0083;
            case 1743615: goto L_0x008e;
            case 1744018: goto L_0x0032;
            case 1748394: goto L_0x0099;
            case 1751579: goto L_0x005e;
            case 1752671: goto L_0x006b;
            case 1755747: goto L_0x00b1;
            case 1757933: goto L_0x0053;
            case 1758070: goto L_0x001c;
            case 1758941: goto L_0x002e;
            case 1759422: goto L_0x0048;
            default: goto L_0x000a;
        };
    L_0x000a:
        r1 = s.ۗۜۛ.m698();
        if (r1 > 0) goto L_0x0068;
    L_0x0010:
        goto L_0x0071;
    L_0x0012:
        s.ۡۢۡ.m58();
        r1 = s.ۗۜ۟.m469();
        if (r1 > 0) goto L_0x0092;
    L_0x001b:
        goto L_0x0071;
    L_0x001c:
        s.ۡۢۡ.m58();
        r1 = s.۠ۜۗ.f13;
        if (r1 != 0) goto L_0x00a2;
    L_0x0023:
        goto L_0x0057;
    L_0x0024:
        s.ۥۘۧ.m662();
        r1 = s.ۚ۟ۢ.m85();
        if (r1 == 0) goto L_0x0057;
    L_0x002d:
        goto L_0x0071;
    L_0x002e:
        s.ۗ۬۟.m257();
        goto L_0x0071;
    L_0x0032:
        s.۠ۜۗ.m214();
        r0 = 0;
        return r0;
    L_0x0037:
        r1 = new java.lang.Thread;
        r2 = s.ۗۜ۟.f33;
        if (r2 > 0) goto L_0x003e;
    L_0x003d:
        goto L_0x007d;
    L_0x003e:
        r2 = instance;
        r1.<init>(r2);
        s.ۗۤ۫.m207(r1);
        goto L_0x00c0;
    L_0x0048:
        instance = r0;
        r1 = s.ۜۖۚ.f0;
        if (r1 < 0) goto L_0x004f;
    L_0x004e:
        goto L_0x007d;
    L_0x004f:
        r1 = "ۚ۫ۦ";
        goto L_0x00ba;
    L_0x0053:
        r1 = s.ۗ۠ۚ.f28;
        if (r1 == 0) goto L_0x005b;
    L_0x0057:
        r1 = "۬ۗۨ";
        goto L_0x00ba;
    L_0x005b:
        r1 = "۬ۧۙ";
        goto L_0x0003;
    L_0x005e:
        r1 = s.ۡۗۗ.m159();
        if (r1 == 0) goto L_0x0065;
    L_0x0064:
        goto L_0x0071;
    L_0x0065:
        r1 = "۫ۖۘ";
        goto L_0x0003;
    L_0x0068:
        r1 = "ۤۢۙ";
        goto L_0x0003;
    L_0x006b:
        r1 = s.ۘۡۜ.m682();
        if (r1 < 0) goto L_0x0074;
    L_0x0071:
        r1 = "ۜۦۜ";
        goto L_0x00ba;
    L_0x0074:
        r1 = "ۖۖۜ";
        goto L_0x00ba;
    L_0x0077:
        r1 = s.ۖۙۜ.m589();
        if (r1 > 0) goto L_0x0080;
    L_0x007d:
        r1 = "ۚۙۥ";
        goto L_0x00ba;
    L_0x0080:
        r1 = "ۥۦ۠";
        goto L_0x0003;
    L_0x0083:
        r1 = s.ۧۧۡ.m183();
        if (r1 > 0) goto L_0x008a;
    L_0x0089:
        goto L_0x00a2;
    L_0x008a:
        r1 = "ۘۗۤ";
        goto L_0x0003;
    L_0x008e:
        r1 = s.ۡۢۡ.f3;
        if (r1 < 0) goto L_0x0096;
    L_0x0092:
        r1 = "۫ۚۥ";
        goto L_0x0003;
    L_0x0096:
        r1 = "ۛ۬ۦ";
        goto L_0x00ba;
    L_0x0099:
        r1 = new com.junge.algorithmAidePro.Thread.SendReqableStackThread;
        r1.<init>();
        r2 = s.ۛۨۦ.f46;
        if (r2 == 0) goto L_0x00a6;
    L_0x00a2:
        r1 = "ۘۘۨ";
        goto L_0x0003;
    L_0x00a6:
        r0 = "ۜۙۜ";
        r0 = s.ۜۘۡ.m282(r0);
        r3 = r1;
        r1 = r0;
        r0 = r3;
        goto L_0x0007;
    L_0x00b1:
        r0 = instance;
        return r0;
    L_0x00b4:
        r1 = instance;
        if (r1 != 0) goto L_0x00c0;
    L_0x00b8:
        r1 = "ۡۘۡ";
    L_0x00ba:
        r1 = s.ۜۘۡ.m282(r1);
        goto L_0x0007;
    L_0x00c0:
        r1 = "ۨ۬ۧ";
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Thread.SendReqableStackThread.getInstance():com.junge.algorithmAidePro.Thread.SendReqableStackThread");
    }

    /* DevToolsApp WARNING: Missing block: B:5:0x0029, code:
            if (s.۠ۡۧ.f26 == 0) goto L_0x003d;
     */
    /* DevToolsApp WARNING: Missing block: B:7:0x0033, code:
            if (s.ۡۗۗ.m159() != 0) goto L_0x0077;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x003a, code:
            if (s.ۨۘۢ.m318() == 0) goto L_0x0068;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x003d, code:
            r0 = "۟ۥۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x0047, code:
            if (s.۫ۢ۠.m237() < 0) goto L_0x0068;
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x0059, code:
            if (s.ۡۗۗ.m159() != 0) goto L_0x0181;
     */
    /* DevToolsApp WARNING: Missing block: B:19:0x0064, code:
            if (s.ۢ۫ۜ.m625() < 0) goto L_0x0181;
     */
    /* DevToolsApp WARNING: Missing block: B:20:0x0068, code:
            r0 = "ۙ۠ۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:21:0x006a, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:23:0x0071, code:
            if (s.ۚ۟ۢ.f5 == false) goto L_0x0077;
     */
    /* DevToolsApp WARNING: Missing block: B:25:0x0077, code:
            r0 = "ۚۡۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:26:0x0079, code:
            r0 = s.ۢ۫ۗ.m350(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x00a9, code:
            r0 = "ۡۥ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x00cb, code:
            r0 = "۫ۤۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00de, code:
            r0 = "ۤۤۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x00f9, code:
            r0 = "۠۟ۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:59:0x0112, code:
            r0 = "ۘۚۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:75:0x0165, code:
            r0 = "ۖ۫۟";
     */
    /* DevToolsApp WARNING: Missing block: B:84:0x0181, code:
            r0 = "ۧۨۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:86:0x0186, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:89:0x0191, code:
            r0 = "ۤۡ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:91:0x019b, code:
            r0 = r1;
     */
    public void run() {
        /*
        r17 = this;
        r1 = r17;
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
        r13 = "۬۠ۚ";
        r13 = s.ۢ۫ۗ.m350(r13);
        r5 = r4;
        r12 = r11;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r4 = r3;
        r3 = r2;
        r2 = r0;
        r0 = r13;
        r13 = 0;
    L_0x0021:
        switch(r0) {
            case 1737767: goto L_0x0108;
            case 1738410: goto L_0x004a;
            case 1739810: goto L_0x0036;
            case 1740958: goto L_0x0027;
            case 1740961: goto L_0x006f;
            case 1741953: goto L_0x007e;
            case 1742694: goto L_0x0089;
            case 1742720: goto L_0x00b3;
            case 1743103: goto L_0x0138;
            case 1743613: goto L_0x00f0;
            case 1746399: goto L_0x0126;
            case 1746876: goto L_0x0040;
            case 1747436: goto L_0x00da;
            case 1747642: goto L_0x005d;
            case 1749428: goto L_0x0159;
            case 1751407: goto L_0x0052;
            case 1751566: goto L_0x002c;
            case 1751577: goto L_0x00d5;
            case 1751641: goto L_0x00b7;
            case 1752366: goto L_0x0149;
            case 1754127: goto L_0x016b;
            case 1754211: goto L_0x017b;
            case 1754651: goto L_0x0074;
            case 1755742: goto L_0x0161;
            case 1757941: goto L_0x00e2;
            case 1758368: goto L_0x008d;
            case 1759206: goto L_0x018b;
            default: goto L_0x0024;
        };
    L_0x0024:
        r0 = r1.lock;	 Catch:{ Exception -> 0x00cf }
        goto L_0x0085;
    L_0x0027:
        r0 = s.۠ۡۧ.f26;
        if (r0 != 0) goto L_0x0191;
    L_0x002b:
        goto L_0x003d;
    L_0x002c:
        s.۬ۨۨ.m730();
        r0 = s.ۡۗۗ.m159();
        if (r0 == 0) goto L_0x0112;
    L_0x0035:
        goto L_0x0077;
    L_0x0036:
        r0 = s.ۨۘۢ.m318();
        if (r0 != 0) goto L_0x003d;
    L_0x003c:
        goto L_0x0068;
    L_0x003d:
        r0 = "۟ۥۢ";
        goto L_0x0079;
    L_0x0040:
        s.۟ۧۢ.m774();
        r0 = s.۫ۢ۠.m237();
        if (r0 >= 0) goto L_0x0165;
    L_0x0049:
        goto L_0x0068;
    L_0x004a:
        r0 = s.ۨۗۥ.f42;
        if (r0 > 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0068;
    L_0x004f:
        r0 = "ۤۜۧ";
        goto L_0x006a;
    L_0x0052:
        s.ۡۘۗ.m32();
        r0 = s.ۡۗۗ.m159();
        if (r0 == 0) goto L_0x00f9;
    L_0x005b:
        goto L_0x0181;
    L_0x005d:
        s.ۡۘۗ.m32();
        r0 = s.ۢ۫ۜ.m625();
        if (r0 >= 0) goto L_0x0068;
    L_0x0066:
        goto L_0x0181;
    L_0x0068:
        r0 = "ۙ۠ۨ";
    L_0x006a:
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x0021;
    L_0x006f:
        r0 = s.ۚ۟ۢ.f5;
        if (r0 != 0) goto L_0x0181;
    L_0x0073:
        goto L_0x0077;
    L_0x0074:
        s.ۖۙۜ.m589();
    L_0x0077:
        r0 = "ۚۡۨ";
    L_0x0079:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x0021;
    L_0x007e:
        s.ۗۜ۟.m469();
        s.ۗۜۛ.m698();
        return;
    L_0x0085:
        s.ۛ۫ۧ.m604(r0);	 Catch:{ Exception -> 0x00cf }
        goto L_0x00cb;
    L_0x0089:
        s.ۜۖۚ.m4(r12);	 Catch:{ Exception -> 0x00cf }
        goto L_0x00a9;
    L_0x008d:
        r0 = r1.lock;	 Catch:{ Exception -> 0x00cf }
        r0.lock();	 Catch:{ Exception -> 0x00cf }
        r0 = r1.tasks;	 Catch:{ Exception -> 0x00cf }
        r0 = r0.take();	 Catch:{ Exception -> 0x00cf }
        r0 = (com.junge.algorithmAidePro.bean.ReqableStack) r0;	 Catch:{ Exception -> 0x00cf }
        r0 = r0.toBytes();	 Catch:{ Exception -> 0x00ad }
        r14 = new java.net.DatagramPacket;	 Catch:{ Exception -> 0x00ad }
        r15 = r0.length;	 Catch:{ Exception -> 0x00ad }
        r1 = 27039; // 0x699f float:3.789E-41 double:1.3359E-319;
        r14.<init>(r0, r15, r2, r1);	 Catch:{ Exception -> 0x00ad }
        r4.send(r14);	 Catch:{ Exception -> 0x00ad }
    L_0x00a9:
        r0 = "ۡۥ۟";
        goto L_0x0176;
    L_0x00ad:
        r0 = move-exception;
        r12 = r0;
        r0 = "ۛۚۥ";
        goto L_0x0176;
    L_0x00b3:
        s.ۗ۬۟.m271(r3);
        return;
    L_0x00b7:
        r0 = f116;	 Catch:{ Exception -> 0x00cf }
        r1 = 1;
        r14 = 9;
        r0 = s.۬ۗ۫.m97(r0, r1, r14, r13);	 Catch:{ Exception -> 0x00cf }
        r0 = java.net.InetAddress.getByName(r0);	 Catch:{ Exception -> 0x00cf }
        r1 = new java.net.DatagramSocket;	 Catch:{ Exception -> 0x00cf }
        r1.<init>();	 Catch:{ Exception -> 0x00cf }
        r2 = r0;
        r4 = r1;
    L_0x00cb:
        r0 = "۫ۤۙ";
        goto L_0x0186;
    L_0x00cf:
        r0 = move-exception;
        r3 = r0;
        r0 = "ۛۛ۠";
        goto L_0x0176;
    L_0x00d5:
        r0 = 17055; // 0x429f float:2.3899E-41 double:8.4263E-320;
        r13 = 17055; // 0x429f float:2.3899E-41 double:8.4263E-320;
        goto L_0x00de;
    L_0x00da:
        r0 = 23858; // 0x5d32 float:3.3432E-41 double:1.17874E-319;
        r13 = 23858; // 0x5d32 float:3.3432E-41 double:1.17874E-319;
    L_0x00de:
        r0 = "ۤۤۙ";
        goto L_0x0186;
    L_0x00e2:
        r0 = r10 + r11;
        r0 = r0 + r0;
        r0 = r0 - r9;
        if (r0 >= 0) goto L_0x00ec;
    L_0x00e8:
        r0 = "ۤۢۗ";
        goto L_0x0186;
    L_0x00ec:
        r0 = "۠ۘۤ";
        goto L_0x0176;
    L_0x00f0:
        r0 = 71774784; // 0x4473240 float:2.3415411E-36 double:3.5461455E-316;
        r1 = s.ۜۖۚ.m7();
        if (r1 < 0) goto L_0x00fd;
    L_0x00f9:
        r0 = "۠۟ۙ";
        goto L_0x0176;
    L_0x00fd:
        r1 = "۫ۖ۠";
        r1 = s.ۢ۫ۗ.m350(r1);
        r11 = 71774784; // 0x4473240 float:2.3415411E-36 double:3.5461455E-316;
        goto L_0x019b;
    L_0x0108:
        r0 = r8 * r8;
        r1 = r7 * r7;
        r14 = s.ۙۖۥ.m748();
        if (r14 > 0) goto L_0x0116;
    L_0x0112:
        r0 = "ۘۚۤ";
        goto L_0x0186;
    L_0x0116:
        r9 = "ۜۙۚ";
        r9 = s.ۢ۫ۗ.m350(r9);
        r10 = r1;
        r1 = r17;
        r16 = r9;
        r9 = r0;
        r0 = r16;
        goto L_0x0021;
    L_0x0126:
        r0 = r7 + 8472;
        r1 = s.۠ۜۗ.m214();
        if (r1 > 0) goto L_0x012f;
    L_0x012e:
        goto L_0x0171;
    L_0x012f:
        r1 = "ۖۖۧ";
        r1 = s.ۜۘۡ.m282(r1);
        r8 = r0;
        goto L_0x019b;
    L_0x0138:
        r0 = r5[r6];
        r1 = s.ۨۧۜ.m755();
        if (r1 < 0) goto L_0x0141;
    L_0x0140:
        goto L_0x0181;
    L_0x0141:
        r1 = "۟ۖۖ";
        r1 = s.ۜۘۡ.m282(r1);
        r7 = r0;
        goto L_0x019b;
    L_0x0149:
        r0 = 0;
        r1 = s.ۗۢۢ.m454();
        if (r1 < 0) goto L_0x0151;
    L_0x0150:
        goto L_0x0171;
    L_0x0151:
        r1 = "ۛۧ۫";
        r1 = s.ۜۘۡ.m282(r1);
        r6 = 0;
        goto L_0x019b;
    L_0x0159:
        r0 = s.ۦۡۤ.f25;
        if (r0 == 0) goto L_0x015e;
    L_0x015d:
        goto L_0x0171;
    L_0x015e:
        r0 = "ۥۜۥ";
        goto L_0x0176;
    L_0x0161:
        r0 = s.۬ۨۨ.f57;
        if (r0 == 0) goto L_0x0168;
    L_0x0165:
        r0 = "ۖ۫۟";
        goto L_0x0176;
    L_0x0168:
        r0 = "ۢۚ۬";
        goto L_0x0186;
    L_0x016b:
        r0 = s.ۢ۟ۚ.m168();
        if (r0 > 0) goto L_0x0174;
    L_0x0171:
        r0 = "ۙ۠ۥ";
        goto L_0x0176;
    L_0x0174:
        r0 = "ۨ۬ۢ";
    L_0x0176:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x019c;
    L_0x017b:
        r0 = s.ۧۧۡ.m183();
        if (r0 > 0) goto L_0x0184;
    L_0x0181:
        r0 = "ۧۨۜ";
        goto L_0x0176;
    L_0x0184:
        r0 = "ۧۗ۟";
    L_0x0186:
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x019c;
    L_0x018b:
        r0 = f116;
        r1 = s.ۨۧۚ.f56;
        if (r1 != 0) goto L_0x0194;
    L_0x0191:
        r0 = "ۤۡ۫";
        goto L_0x0176;
    L_0x0194:
        r1 = "ۧۚۖ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r5 = r0;
    L_0x019b:
        r0 = r1;
    L_0x019c:
        r1 = r17;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Thread.SendReqableStackThread.run():void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x001b, code:
            if (s.۫ۢ۠.m237() < 0) goto L_0x0025;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x0025, code:
            r1 = "ۛ۠ۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:18:0x004b, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
    /* DevToolsApp WARNING: Missing block: B:34:0x0084, code:
            r1 = "ۥۚ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:37:0x008d, code:
            r1 = "ۦۨۗ";
     */
    public SendReqableStackThread() {
        /*
        r5 = this;
        r0 = 0;
        r5.<init>();
        r1 = "ۦۤ۬";
    L_0x0006:
        r1 = s.ۢ۫ۗ.m350(r1);
    L_0x000a:
        switch(r1) {
            case 1737795: goto L_0x0017;
            case 1740115: goto L_0x0038;
            case 1752298: goto L_0x0028;
            case 1752512: goto L_0x0040;
            case 1753582: goto L_0x0050;
            case 1753685: goto L_0x001e;
            case 1754153: goto L_0x002c;
            default: goto L_0x000d;
        };
    L_0x000d:
        s.ۢ۫ۗ.m342();
        r1 = s.۬ۗ۫.m98();
        if (r1 == 0) goto L_0x0084;
    L_0x0016:
        goto L_0x0061;
    L_0x0017:
        r1 = s.۫ۢ۠.m237();
        if (r1 >= 0) goto L_0x008d;
    L_0x001d:
        goto L_0x0025;
    L_0x001e:
        r1 = s.۬۟ۜ.m366();
        if (r1 != 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0061;
    L_0x0025:
        r1 = "ۛ۠ۚ";
        goto L_0x004b;
    L_0x0028:
        s.ۧۧۡ.m183();
        goto L_0x0061;
    L_0x002c:
        s.ۘۡۜ.m682();
        s.ۚ۟ۢ.m85();
        r0 = new java.lang.RuntimeException;
        r0.<init>();
        throw r0;
    L_0x0038:
        r0 = new java.util.concurrent.locks.ReentrantLock;
        r0.<init>();
        r5.lock = r0;
        return;
    L_0x0040:
        r5.tasks = r0;
        r1 = s.ۚۡۢ.m112();
        if (r1 < 0) goto L_0x0049;
    L_0x0048:
        goto L_0x0097;
    L_0x0049:
        r1 = "ۘۤ۟";
    L_0x004b:
        r1 = s.ۜۘۡ.m282(r1);
        goto L_0x000a;
    L_0x0050:
        r1 = new java.util.concurrent.LinkedBlockingQueue;
        r2 = 100;
        r3 = s.ۨۘۢ.m318();
        if (r3 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x0084;
    L_0x005b:
        r3 = s.ۗ۬ۦ.m407();
        if (r3 != 0) goto L_0x0064;
    L_0x0061:
        r1 = "ۧۘۚ";
        goto L_0x0006;
    L_0x0064:
        r3 = s.ۤۗۛ.m370();
        if (r3 < 0) goto L_0x006b;
    L_0x006a:
        goto L_0x008d;
    L_0x006b:
        r3 = s.ۗ۠ۚ.m442();
        if (r3 > 0) goto L_0x0072;
    L_0x0071:
        goto L_0x0084;
    L_0x0072:
        r3 = s.۟ۥۙ.m650();
        if (r3 > 0) goto L_0x0079;
    L_0x0078:
        goto L_0x008d;
    L_0x0079:
        r3 = s.ۘۡۜ.f54;
        if (r3 == 0) goto L_0x007e;
    L_0x007d:
        goto L_0x0097;
    L_0x007e:
        r3 = s.ۡۥۗ.m568();
        if (r3 == 0) goto L_0x0087;
    L_0x0084:
        r1 = "ۥۚ۟";
        goto L_0x004b;
    L_0x0087:
        r3 = s.ۡۗۗ.m159();
        if (r3 == 0) goto L_0x0090;
    L_0x008d:
        r1 = "ۦۨۗ";
        goto L_0x004b;
    L_0x0090:
        r1.<init>(r2);
        r2 = s.ۚ۟ۢ.f5;
        if (r2 != 0) goto L_0x009a;
    L_0x0097:
        r1 = "ۖۗۤ";
        goto L_0x004b;
    L_0x009a:
        r0 = "ۥۡۜ";
        r0 = s.ۜۘۡ.m282(r0);
        r4 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Thread.SendReqableStackThread.<init>():void");
    }
}
