package com.junge.algorithmAidePro.DbController;

import android.content.Context;
import com.junge.algorithmAidePro.db.DatabaseContext;

public class DbController {
    private static final String TAG;
    /* renamed from: ۡۚۘ */
    private static final short[] f79 = new short[]{(short) 2507, (short) -29707, (short) -29741, (short) -29710, (short) -29730, (short) -29729, (short) -29755, (short) -29757, (short) -29730, (short) -29731, (short) -29731, (short) -29740, (short) -29757, (short) 8301, (short) -19695, (short) -19694, (short) -19686, (short) -19660, (short) -19693, (short) -19692, (short) -19703, (short) 3290, (short) 22331, (short) 22334, (short) 22315, (short) 22334, (short) 22333, (short) 22334, (short) 22316, (short) 22330, (short) 22385, (short) 22325, (short) 22316, (short) 22320, (short) 22321, (short) 3242, (short) 25096, (short) 25101, (short) 25112, (short) 25101, (short) 25102, (short) 25101, (short) 25119, (short) 25097, (short) 25154, (short) 25094, (short) 25119, (short) 25091, (short) 25090, (short) 7675, (short) -11724, (short) -11727, (short) -11740, (short) -11727, (short) -11726, (short) -11727, (short) -11741, (short) -11723, (short) -11650, (short) -11718, (short) -11741, (short) -11713, (short) -11714};
    public Context context;
    public DatabaseContext dbContext;

    /* DevToolsApp WARNING: Missing block: B:30:0x009c, code:
            if (s.ۚۡۢ.f7 == false) goto L_0x00e3;
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x00c2, code:
            r10 = "ۖۙۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x00e1, code:
            if (s.ۙۖۥ.m748() <= 0) goto L_0x00e3;
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00e3, code:
            r10 = "ۢۤۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x00e6, code:
            r10 = "ۙۘ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x00f1, code:
            r10 = "ۖۜۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:53:0x00f3, code:
            r10 = s.ۢ۫ۗ.m350(r10);
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x0105, code:
            r10 = "ۧ۫ۘ";
     */
    static {
        /*
        r0 = 63;
        r0 = new short[r0];
        r0 = {2507, -29707, -29741, -29710, -29730, -29729, -29755, -29757, -29730, -29731, -29731, -29740, -29757, 8301, -19695, -19694, -19686, -19660, -19693, -19692, -19703, 3290, 22331, 22334, 22315, 22334, 22333, 22334, 22316, 22330, 22385, 22325, 22316, 22320, 22321, 3242, 25096, 25101, 25112, 25101, 25102, 25101, 25119, 25097, 25154, 25094, 25119, 25091, 25090, 7675, -11724, -11727, -11740, -11727, -11726, -11727, -11741, -11723, -11650, -11718, -11741, -11713, -11714};
        f79 = r0;
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
        r10 = "۬ۢۖ";
    L_0x0015:
        r10 = s.ۜۘۡ.m282(r10);
    L_0x0019:
        switch(r10) {
            case 1737858: goto L_0x00e9;
            case 1737953: goto L_0x00dd;
            case 1739703: goto L_0x00d4;
            case 1740704: goto L_0x00cd;
            case 1741005: goto L_0x00c6;
            case 1741612: goto L_0x00c0;
            case 1742607: goto L_0x00b5;
            case 1742657: goto L_0x009f;
            case 1743254: goto L_0x0097;
            case 1747413: goto L_0x008b;
            case 1747865: goto L_0x007c;
            case 1749728: goto L_0x0073;
            case 1752868: goto L_0x0067;
            case 1753812: goto L_0x0063;
            case 1754740: goto L_0x0058;
            case 1757933: goto L_0x004f;
            case 1758284: goto L_0x003b;
            case 1759264: goto L_0x0026;
            default: goto L_0x001c;
        };
    L_0x001c:
        r10 = r2 + 5181;
        r11 = s.۟ۤۗ.m332();
        if (r11 > 0) goto L_0x0109;
    L_0x0024:
        goto L_0x0105;
    L_0x0026:
        r10 = f79;
        r11 = s.ۢ۟ۚ.m168();
        if (r11 > 0) goto L_0x0030;
    L_0x002e:
        goto L_0x00b9;
    L_0x0030:
        r0 = "۫ۖۘ";
        r0 = s.ۜۘۡ.m282(r0);
        r1 = 0;
        r12 = r10;
        r10 = r0;
        r0 = r12;
        goto L_0x0019;
    L_0x003b:
        r10 = r0[r1];
        r11 = s.ۨۧۜ.m755();
        if (r11 < 0) goto L_0x0045;
    L_0x0043:
        goto L_0x00e6;
    L_0x0045:
        r2 = "ۙۖۤ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r12 = r10;
        r10 = r2;
        r2 = r12;
        goto L_0x0019;
    L_0x004f:
        r10 = s.۠ۜۗ.f13;
        if (r10 == 0) goto L_0x0055;
    L_0x0053:
        goto L_0x00f1;
    L_0x0055:
        r10 = "ۛۗ۫";
        goto L_0x0015;
    L_0x0058:
        s.۬۟ۜ.m366();
        r10 = s.۫ۢ۠.m237();
        if (r10 < 0) goto L_0x00b9;
    L_0x0061:
        goto L_0x00f1;
    L_0x0063:
        r6 = 35761; // 0x8bb1 float:5.0112E-41 double:1.76683E-319;
        goto L_0x00c2;
    L_0x0067:
        r10 = s.۫ۢ۠.m237();
        if (r10 < 0) goto L_0x006f;
    L_0x006d:
        goto L_0x0105;
    L_0x006f:
        r10 = "ۘۗۖ";
        goto L_0x00f3;
    L_0x0073:
        s.۫ۢ۠.m237();
        r0 = new java.lang.RuntimeException;
        r0.<init>();
        throw r0;
    L_0x007c:
        r10 = s.ۨۧۜ.f59;
        if (r10 == 0) goto L_0x0082;
    L_0x0080:
        goto L_0x00e6;
    L_0x0082:
        r9 = "ۙۢۖ";
        r10 = s.ۜۘۡ.m282(r9);
        r9 = 12;
        goto L_0x0019;
    L_0x008b:
        r10 = r2 * r5;
        r10 = r10 - r4;
        if (r10 > 0) goto L_0x0093;
    L_0x0090:
        r10 = "ۦ۬ۚ";
        goto L_0x0015;
    L_0x0093:
        r10 = "ۚۖۨ";
        goto L_0x0015;
    L_0x0097:
        s.۟ۧۢ.m774();
        r10 = s.ۚۡۢ.f7;
        if (r10 != 0) goto L_0x00f1;
    L_0x009e:
        goto L_0x00e3;
    L_0x009f:
        r10 = r3 * r3;
        r11 = s.ۛ۫ۧ.m593();
        if (r11 > 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00e6;
    L_0x00a8:
        r4 = "۠ۗ۬";
        r4 = s.ۢ۫ۗ.m350(r4);
        r5 = 20724; // 0x50f4 float:2.904E-41 double:1.0239E-319;
        r12 = r10;
        r10 = r4;
        r4 = r12;
        goto L_0x0019;
    L_0x00b5:
        r10 = s.ۡۗۗ.f9;
        if (r10 != 0) goto L_0x00bd;
    L_0x00b9:
        r10 = "ۛ۬ۧ";
        goto L_0x0015;
    L_0x00bd:
        r10 = "ۥ۬۫";
        goto L_0x00f3;
    L_0x00c0:
        r6 = 4272; // 0x10b0 float:5.986E-42 double:2.1106E-320;
    L_0x00c2:
        r10 = "ۖۙۥ";
        goto L_0x0015;
    L_0x00c6:
        r0 = s.ۖۙۜ.m585(r7, r8, r9, r6);
        TAG = r0;
        return;
    L_0x00cd:
        s.۠ۡ۟.m140();
        s.ۡۗۗ.m159();
        goto L_0x00e3;
    L_0x00d4:
        r10 = s.ۦۢۜ.f1;
        if (r10 > 0) goto L_0x00d9;
    L_0x00d8:
        goto L_0x00f1;
    L_0x00d9:
        r10 = "۫ۡۢ";
        goto L_0x0015;
    L_0x00dd:
        r10 = s.ۙۖۥ.m748();
        if (r10 > 0) goto L_0x00e6;
    L_0x00e3:
        r10 = "ۢۤۢ";
        goto L_0x00f3;
    L_0x00e6:
        r10 = "ۙۘ۟";
        goto L_0x00f3;
    L_0x00e9:
        r10 = f79;
        r11 = s.۠ۡ۟.m140();
        if (r11 > 0) goto L_0x00f9;
    L_0x00f1:
        r10 = "ۖۜۧ";
    L_0x00f3:
        r10 = s.ۢ۫ۗ.m350(r10);
        goto L_0x0019;
    L_0x00f9:
        r7 = "۠ۦ۟";
        r7 = s.ۜۘۡ.m282(r7);
        r8 = 1;
        r12 = r10;
        r10 = r7;
        r7 = r12;
        goto L_0x0019;
    L_0x0105:
        r10 = "ۧ۫ۘ";
        goto L_0x0015;
    L_0x0109:
        r3 = "ۛۙ۟";
        r3 = s.ۢ۫ۗ.m350(r3);
        r12 = r10;
        r10 = r3;
        r3 = r12;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.DbController.DbController.<clinit>():void");
    }

    /* DevToolsApp WARNING: Missing block: B:11:0x002c, code:
            if (s.ۛ۫ۧ.f49 == false) goto L_0x00a8;
     */
    /* DevToolsApp WARNING: Missing block: B:41:0x009b, code:
            r2 = "۟۫۫";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x00b4, code:
            r2 = "ۧ۫ۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:51:0x00ba, code:
            r2 = "۠۬ۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:53:0x00c0, code:
            r2 = s.ۜۘۡ.m282(r2);
     */
    public void addDel(java.lang.String r7, com.junge.algorithmAidePro.bean.SimpleLogData r8) {
        /*
        r6 = this;
        r0 = 0;
        r1 = 0;
        r2 = "ۛۚۖ";
    L_0x0004:
        r2 = s.ۢ۫ۗ.m350(r2);
    L_0x0008:
        switch(r2) {
            case 1738773: goto L_0x003c;
            case 1740208: goto L_0x0095;
            case 1740790: goto L_0x003b;
            case 1741109: goto L_0x001f;
            case 1742094: goto L_0x00a2;
            case 1742639: goto L_0x0083;
            case 1746495: goto L_0x006b;
            case 1747071: goto L_0x0011;
            case 1748046: goto L_0x0030;
            case 1752267: goto L_0x0035;
            case 1752662: goto L_0x00b0;
            case 1754754: goto L_0x0027;
            case 1755187: goto L_0x0073;
            case 1755522: goto L_0x007b;
            case 1757943: goto L_0x0043;
            case 1758429: goto L_0x005f;
            case 1758622: goto L_0x008c;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = s.ۦۡۤ.f25;
        if (r2 == 0) goto L_0x00be;
    L_0x000f:
        goto L_0x00ba;
    L_0x0011:
        s.ۦۡۤ.m396();
        r2 = s.ۗ۬ۦ.m407();
        if (r2 != 0) goto L_0x001c;
    L_0x001a:
        goto L_0x00b4;
    L_0x001c:
        r2 = "ۙۥۡ";
        goto L_0x0004;
    L_0x001f:
        r2 = s.ۨۗۥ.m536();
        if (r2 != 0) goto L_0x00b4;
    L_0x0025:
        goto L_0x00ba;
    L_0x0027:
        s.ۖۜ۟.m492();
        r2 = s.ۛ۫ۧ.f49;
        if (r2 != 0) goto L_0x00ba;
    L_0x002e:
        goto L_0x00a8;
    L_0x0030:
        s.۫۫ۗ.m790();
        goto L_0x00a8;
    L_0x0035:
        s.ۤۤۖ.m506();
        s.ۛ۫ۧ.m593();
    L_0x003b:
        return;
    L_0x003c:
        r0.addDelete(r1);
        r6.saveDbRecords(r7, r0);
        return;
    L_0x0043:
        r2 = r6.getDbRecordItem(r7);
        r3 = r8.getId();
        r3 = r3.intValue();
        r4 = s.ۚۤۙ.f18;
        if (r4 > 0) goto L_0x0054;
    L_0x0053:
        goto L_0x009b;
    L_0x0054:
        r0 = "ۗۘۖ";
        r0 = s.ۜۘۡ.m282(r0);
        r1 = r3;
        r5 = r2;
        r2 = r0;
        r0 = r5;
        goto L_0x0008;
    L_0x005f:
        r2 = r6.isNotRootDb(r7);
        if (r2 == 0) goto L_0x0068;
    L_0x0065:
        r2 = "ۙۛۘ";
        goto L_0x0004;
    L_0x0068:
        r2 = "۫ۖۢ";
        goto L_0x0004;
    L_0x006b:
        r2 = s.ۗ۬ۦ.f27;
        if (r2 == 0) goto L_0x0070;
    L_0x006f:
        goto L_0x00b4;
    L_0x0070:
        r2 = "۫ۦۘ";
        goto L_0x0004;
    L_0x0073:
        r2 = s.ۤۗۛ.f24;
        if (r2 == 0) goto L_0x0078;
    L_0x0077:
        goto L_0x00a8;
    L_0x0078:
        r2 = "۟ۙۙ";
        goto L_0x00c0;
    L_0x007b:
        r2 = s.ۡۗۗ.f9;
        if (r2 != 0) goto L_0x0080;
    L_0x007f:
        goto L_0x00a8;
    L_0x0080:
        r2 = "ۨۚۥ";
        goto L_0x0004;
    L_0x0083:
        r2 = s.ۗۢۢ.f29;
        if (r2 < 0) goto L_0x0088;
    L_0x0087:
        goto L_0x00ba;
    L_0x0088:
        r2 = "ۨۥ۟";
        goto L_0x0004;
    L_0x008c:
        r2 = s.۬ۨۨ.f57;
        if (r2 == 0) goto L_0x0091;
    L_0x0090:
        goto L_0x00a8;
    L_0x0091:
        r2 = "ۛۘ۬";
        goto L_0x0004;
    L_0x0095:
        r2 = s.ۡۢۡ.m58();
        if (r2 == 0) goto L_0x009f;
    L_0x009b:
        r2 = "۟۫۫";
        goto L_0x0004;
    L_0x009f:
        r2 = "۫۬۟";
        goto L_0x00c0;
    L_0x00a2:
        r2 = s.ۨۧۜ.m755();
        if (r2 < 0) goto L_0x00ac;
    L_0x00a8:
        r2 = "ۥۙ۟";
        goto L_0x0004;
    L_0x00ac:
        r2 = "ۘۧ۟";
        goto L_0x0004;
    L_0x00b0:
        r2 = s.ۛ۫ۧ.f49;
        if (r2 != 0) goto L_0x00b7;
    L_0x00b4:
        r2 = "ۧ۫ۦ";
        goto L_0x00c0;
    L_0x00b7:
        r2 = "ۚۦۚ";
        goto L_0x00c0;
    L_0x00ba:
        r2 = "۠۬ۚ";
        goto L_0x0004;
    L_0x00be:
        r2 = "ۥۦۗ";
    L_0x00c0:
        r2 = s.ۜۘۡ.m282(r2);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.DbController.DbController.addDel(java.lang.String, com.junge.algorithmAidePro.bean.SimpleLogData):void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0018, code:
            if (s.۫۫ۗ.f65 != 0) goto L_0x0087;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0027, code:
            if (s.ۦۡۤ.f25 != 0) goto L_0x002d;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x002d, code:
            r2 = "ۙۢ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:36:0x0087, code:
            r2 = "ۘۤۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:46:0x00a4, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    public void addRead(java.lang.String r7, com.junge.algorithmAidePro.bean.SimpleLogData r8) {
        /*
        r6 = this;
        r0 = 0;
        r1 = 0;
        r2 = "ۘۚۢ";
    L_0x0004:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x0008:
        switch(r2) {
            case 1738260: goto L_0x006e;
            case 1739808: goto L_0x00b3;
            case 1740118: goto L_0x0022;
            case 1741026: goto L_0x0030;
            case 1744024: goto L_0x008e;
            case 1746431: goto L_0x0013;
            case 1746478: goto L_0x0037;
            case 1746576: goto L_0x0083;
            case 1747830: goto L_0x005a;
            case 1748699: goto L_0x002a;
            case 1749763: goto L_0x00aa;
            case 1751643: goto L_0x0066;
            case 1754584: goto L_0x0078;
            case 1755329: goto L_0x009b;
            case 1758619: goto L_0x003e;
            case 1758945: goto L_0x001c;
            case 1758969: goto L_0x0036;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = s.۫ۢ۠.m237();
        if (r2 < 0) goto L_0x0080;
    L_0x0011:
        goto L_0x0094;
    L_0x0013:
        s.ۙۖۥ.m748();
        r2 = s.۫۫ۗ.f65;
        if (r2 == 0) goto L_0x0094;
    L_0x001a:
        goto L_0x0087;
    L_0x001c:
        r2 = s.ۡۗۗ.f9;
        if (r2 != 0) goto L_0x0087;
    L_0x0020:
        goto L_0x00b7;
    L_0x0022:
        s.ۗۜۛ.m698();
        r2 = s.ۦۡۤ.f25;
        if (r2 == 0) goto L_0x00b7;
    L_0x0029:
        goto L_0x002d;
    L_0x002a:
        s.ۢ۫ۗ.m342();
    L_0x002d:
        r2 = "ۙۢ۫";
        goto L_0x0004;
    L_0x0030:
        s.۬۟ۜ.m366();
        s.ۤۗۛ.m370();
    L_0x0036:
        return;
    L_0x0037:
        r0.addRead(r1);
        r6.saveDbRecords(r7, r0);
        return;
    L_0x003e:
        r2 = r6.getDbRecordItem(r7);
        r3 = r8.getId();
        r3 = r3.intValue();
        r4 = s.۬۟ۜ.f23;
        if (r4 != 0) goto L_0x004f;
    L_0x004e:
        goto L_0x009f;
    L_0x004f:
        r0 = "۟ۘۧ";
        r0 = s.ۜۘۡ.m282(r0);
        r1 = r3;
        r5 = r2;
        r2 = r0;
        r0 = r5;
        goto L_0x0008;
    L_0x005a:
        r2 = r6.isNotRootDb(r7);
        if (r2 == 0) goto L_0x0063;
    L_0x0060:
        r2 = "۬ۘۥ";
        goto L_0x0004;
    L_0x0063:
        r2 = "۫۬ۜ";
        goto L_0x0004;
    L_0x0066:
        r2 = s.۬ۨۨ.f57;
        if (r2 == 0) goto L_0x006b;
    L_0x006a:
        goto L_0x00b7;
    L_0x006b:
        r2 = "۠ۥۛ";
        goto L_0x0004;
    L_0x006e:
        r2 = s.ۤۤۖ.m506();
        if (r2 == 0) goto L_0x0075;
    L_0x0074:
        goto L_0x0094;
    L_0x0075:
        r2 = "ۤۤۛ";
        goto L_0x00a4;
    L_0x0078:
        r2 = s.ۤۗۛ.f24;
        if (r2 == 0) goto L_0x007d;
    L_0x007c:
        goto L_0x0087;
    L_0x007d:
        r2 = "ۖۦۤ";
        goto L_0x0004;
    L_0x0080:
        r2 = "ۧۦۗ";
        goto L_0x0004;
    L_0x0083:
        r2 = s.ۗ۬۟.f16;
        if (r2 == 0) goto L_0x008a;
    L_0x0087:
        r2 = "ۘۤۢ";
        goto L_0x00a4;
    L_0x008a:
        r2 = "ۙ۟ۛ";
        goto L_0x0004;
    L_0x008e:
        r2 = s.۬۟ۜ.m366();
        if (r2 == 0) goto L_0x0097;
    L_0x0094:
        r2 = "۬ۗ۬";
        goto L_0x00a4;
    L_0x0097:
        r2 = "۟ۛ۬";
        goto L_0x0004;
    L_0x009b:
        r2 = s.۫۫ۗ.f65;
        if (r2 == 0) goto L_0x00a2;
    L_0x009f:
        r2 = "۟ۗۗ";
        goto L_0x00a4;
    L_0x00a2:
        r2 = "ۜۦۢ";
    L_0x00a4:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x0008;
    L_0x00aa:
        r2 = s.۬۟ۜ.f23;
        if (r2 != 0) goto L_0x00af;
    L_0x00ae:
        goto L_0x00b7;
    L_0x00af:
        r2 = "ۨ۟ۘ";
        goto L_0x0004;
    L_0x00b3:
        r2 = s.۠ۜۗ.f13;
        if (r2 == 0) goto L_0x00bb;
    L_0x00b7:
        r2 = "ۡۢۜ";
        goto L_0x0004;
    L_0x00bb:
        r2 = "ۢۥۦ";
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.DbController.DbController.addRead(java.lang.String, com.junge.algorithmAidePro.bean.SimpleLogData):void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0033, code:
            r16 = r0;
            r17 = r3;
            r18 = r4;
            r4 = r22;
            r3 = r23;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x0052, code:
            if (s.ۗۗۡ.m78() != false) goto L_0x006e;
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x006e, code:
            r15 = s.ۜۘۡ.m282("ۘۨۖ");
     */
    /* DevToolsApp WARNING: Missing block: B:20:0x0080, code:
            r16 = r0;
            r17 = r3;
            r18 = r4;
            r3 = r23;
     */
    /* DevToolsApp WARNING: Missing block: B:34:0x00e3, code:
            r0 = "ۙ۟ۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:38:0x0101, code:
            r0 = "ۥۘ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x0171, code:
            r0 = "ۙۢۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x0189, code:
            r15 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x01a7, code:
            r0 = "ۛ۫۠";
     */
    /* DevToolsApp WARNING: Missing block: B:60:0x01cb, code:
            r0 = "ۨۨۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:65:0x01ff, code:
            r0 = r16;
     */
    /* DevToolsApp WARNING: Missing block: B:71:0x0234, code:
            r0 = "ۙۤۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:73:0x0244, code:
            r0 = "ۦۛۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:75:0x024a, code:
            r15 = s.ۢ۫ۗ.m350(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:76:0x024e, code:
            r0 = r16;
            r3 = r17;
            r4 = r18;
     */
    public void clearDbRecords(java.lang.String r23) {
        /*
        r22 = this;
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
        r15 = "ۜۦۗ";
        r15 = s.ۜۘۡ.m282(r15);
        r21 = r1;
        r1 = r0;
        r0 = r3;
        r3 = r2;
        r2 = r21;
    L_0x001c:
        switch(r15) {
            case 1738852: goto L_0x00e7;
            case 1739027: goto L_0x0152;
            case 1740230: goto L_0x0075;
            case 1740917: goto L_0x0091;
            case 1741021: goto L_0x0129;
            case 1741067: goto L_0x0055;
            case 1743216: goto L_0x004b;
            case 1746565: goto L_0x01ba;
            case 1749423: goto L_0x0203;
            case 1751876: goto L_0x007d;
            case 1752236: goto L_0x009f;
            case 1753255: goto L_0x0192;
            case 1753286: goto L_0x006b;
            case 1753512: goto L_0x0092;
            case 1753702: goto L_0x0175;
            case 1755069: goto L_0x0224;
            case 1755339: goto L_0x0163;
            case 1755623: goto L_0x002f;
            case 1757978: goto L_0x0079;
            case 1758441: goto L_0x01df;
            case 1758925: goto L_0x0105;
            default: goto L_0x001f;
        };
    L_0x001f:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        r0 = s.ۖۜ۟.f34;
        if (r0 < 0) goto L_0x0248;
    L_0x002d:
        goto L_0x0244;
    L_0x002f:
        r15 = s.ۢ۫ۗ.f21;
        if (r15 != 0) goto L_0x003f;
    L_0x0033:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        goto L_0x0234;
    L_0x003f:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        goto L_0x01a7;
    L_0x004b:
        s.۠ۡۧ.m431();
        r15 = s.ۗۗۡ.m78();
        if (r15 == 0) goto L_0x0033;
    L_0x0054:
        goto L_0x006e;
    L_0x0055:
        s.ۗ۬ۦ.m407();
        r15 = s.۬ۗ۫.m98();
        if (r15 == 0) goto L_0x005f;
    L_0x005e:
        goto L_0x006e;
    L_0x005f:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        goto L_0x0244;
    L_0x006b:
        s.ۗۜۛ.m698();
    L_0x006e:
        r15 = "ۘۨۖ";
        r15 = s.ۜۘۡ.m282(r15);
        goto L_0x001c;
    L_0x0075:
        s.ۗۜۛ.m698();
        return;
    L_0x0079:
        s.ۜۖۚ.m4(r0);
        goto L_0x0080;
    L_0x007d:
        s.ۗ۠ۚ.m433(r3);	 Catch:{ Exception -> 0x0089 }
    L_0x0080:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r3 = r23;
        goto L_0x00e3;
    L_0x0089:
        r0 = move-exception;
        r15 = "۫ۗۦ";
        r15 = s.ۢ۫ۗ.m350(r15);
        goto L_0x001c;
    L_0x0091:
        return;
    L_0x0092:
        s.ۚ۟ۢ.m84(r2);
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r3 = r23;
        goto L_0x0101;
    L_0x009f:
        r15 = new java.io.File;
        r16 = r0;
        r0 = f79;
        r17 = r3;
        r18 = s.۠ۡ۟.f8;
        if (r18 > 0) goto L_0x00b3;
    L_0x00ab:
        r3 = r23;
        r18 = r4;
        r4 = r22;
        goto L_0x0234;
    L_0x00b3:
        r3 = 5;
        r19 = s.۟ۥۙ.f52;
        if (r19 == 0) goto L_0x00c0;
    L_0x00b8:
        r3 = r23;
        r18 = r4;
        r4 = r22;
        goto L_0x01cb;
    L_0x00c0:
        r18 = r4;
        r4 = 30;
        r0 = s.ۛ۫ۧ.m595(r0, r4, r3, r11);
        r3 = r23;
        r0 = s.ۨۘۢ.m307(r3, r0);
        r15.<init>(r2, r0);
        r0 = s.۠ۜۗ.m218(r15);
        if (r0 == 0) goto L_0x00e3;
    L_0x00d7:
        r0 = "ۤ۫۫";
        r0 = s.ۢ۫ۗ.m350(r0);
        r3 = r15;
        r4 = r18;
        r15 = r0;
        goto L_0x01ff;
    L_0x00e3:
        r0 = "ۙ۟ۛ";
        goto L_0x024a;
    L_0x00e7:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r3 = r23;
        r0 = s.ۗۜۛ.m695(r12, r13, r14, r11);
        r2 = s.ۨۧۜ.m767(r1, r0);
        r0 = s.۠ۜۗ.m218(r2);
        if (r0 != 0) goto L_0x0101;
    L_0x00fd:
        r0 = "ۦۢۤ";
        goto L_0x024a;
    L_0x0101:
        r0 = "ۥۘ۟";
        goto L_0x0189;
    L_0x0105:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r3 = r23;
        r0 = 8;
        r4 = s.۟ۧۢ.m774();
        if (r4 == 0) goto L_0x0119;
    L_0x0115:
        r4 = r22;
        goto L_0x01a7;
    L_0x0119:
        r4 = "ۗۚۧ";
        r15 = s.ۢ۫ۗ.m350(r4);
        r0 = r16;
        r3 = r17;
        r4 = r18;
        r14 = 8;
        goto L_0x001c;
    L_0x0129:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        r0 = r4.context;
        r15 = f79;
        r19 = 22;
        r20 = s.ۙۖۥ.m748();
        if (r20 > 0) goto L_0x0141;
    L_0x013f:
        goto L_0x01cb;
    L_0x0141:
        r1 = "۬ۗۘ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r12 = r15;
        r3 = r17;
        r4 = r18;
        r13 = 22;
        r15 = r1;
        r1 = r0;
        goto L_0x01ff;
    L_0x0152:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        r0 = 48834; // 0xbec2 float:6.8431E-41 double:2.4127E-319;
        r11 = 48834; // 0xbec2 float:6.8431E-41 double:2.4127E-319;
        goto L_0x0171;
    L_0x0163:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        r0 = 22367; // 0x575f float:3.1343E-41 double:1.1051E-319;
        r11 = 22367; // 0x575f float:3.1343E-41 double:1.1051E-319;
    L_0x0171:
        r0 = "ۙۢۦ";
        goto L_0x024a;
    L_0x0175:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        r0 = r6 + r10;
        r0 = r0 * r0;
        r0 = r9 - r0;
        if (r0 < 0) goto L_0x018f;
    L_0x0187:
        r0 = "ۨ۟ۢ";
    L_0x0189:
        r15 = s.ۜۘۡ.m282(r0);
        goto L_0x024e;
    L_0x018f:
        r0 = "ۗ۠ۜ";
        goto L_0x0189;
    L_0x0192:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        r0 = r7 + r8;
        r0 = r0 + r0;
        r15 = 16647; // 0x4107 float:2.3327E-41 double:8.2247E-320;
        r19 = s.ۙۖۥ.m748();
        if (r19 > 0) goto L_0x01ab;
    L_0x01a7:
        r0 = "ۛ۫۠";
        goto L_0x024a;
    L_0x01ab:
        r9 = "ۦۨۨ";
        r9 = s.ۜۘۡ.m282(r9);
        r15 = r9;
        r3 = r17;
        r4 = r18;
        r10 = 16647; // 0x4107 float:2.3327E-41 double:8.2247E-320;
        r9 = r0;
        goto L_0x01ff;
    L_0x01ba:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        r0 = 277122609; // 0x10848e31 float:5.22839E-29 double:1.36916761E-315;
        r15 = s.۠ۡۧ.f26;
        if (r15 == 0) goto L_0x01ce;
    L_0x01cb:
        r0 = "ۨۨۧ";
        goto L_0x0189;
    L_0x01ce:
        r8 = "ۦۚۛ";
        r15 = s.ۜۘۡ.m282(r8);
        r0 = r16;
        r3 = r17;
        r4 = r18;
        r8 = 277122609; // 0x10848e31 float:5.22839E-29 double:1.36916761E-315;
        goto L_0x001c;
    L_0x01df:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        r0 = r18[r5];
        r15 = r0 * r0;
        r19 = s.ۚ۟ۢ.f5;
        if (r19 != 0) goto L_0x01f2;
    L_0x01f1:
        goto L_0x0244;
    L_0x01f2:
        r6 = "۟ۛۡ";
        r6 = s.ۢ۫ۗ.m350(r6);
        r7 = r15;
        r3 = r17;
        r4 = r18;
        r15 = r6;
        r6 = r0;
    L_0x01ff:
        r0 = r16;
        goto L_0x001c;
    L_0x0203:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        r0 = 21;
        r15 = s.۠ۡۧ.f26;
        if (r15 == 0) goto L_0x0214;
    L_0x0213:
        goto L_0x0244;
    L_0x0214:
        r5 = "۫ۦۤ";
        r15 = s.ۜۘۡ.m282(r5);
        r0 = r16;
        r3 = r17;
        r4 = r18;
        r5 = 21;
        goto L_0x001c;
    L_0x0224:
        r16 = r0;
        r17 = r3;
        r18 = r4;
        r4 = r22;
        r3 = r23;
        r0 = f79;
        r15 = s.ۙۜۦ.f36;
        if (r15 > 0) goto L_0x0237;
    L_0x0234:
        r0 = "ۙۤۖ";
        goto L_0x024a;
    L_0x0237:
        r15 = "ۢۚۧ";
        r15 = s.ۜۘۡ.m282(r15);
        r4 = r0;
        r0 = r16;
        r3 = r17;
        goto L_0x001c;
    L_0x0244:
        r0 = "ۦۛۛ";
        goto L_0x0189;
    L_0x0248:
        r0 = "ۨۖ۫";
    L_0x024a:
        r15 = s.ۢ۫ۗ.m350(r0);
    L_0x024e:
        r0 = r16;
        r3 = r17;
        r4 = r18;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.DbController.DbController.clearDbRecords(java.lang.String):void");
    }

    /* DevToolsApp WARNING: Missing block: B:26:0x0064, code:
            r0 = "ۤۤۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x006b, code:
            r0 = "ۖۚۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:34:0x0077, code:
            r0 = "۟ۗۥ";
     */
    public DbController(android.content.Context r3) {
        /*
        r2 = this;
        r2.<init>();
        r0 = "ۜۦ۠";
    L_0x0005:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x0009:
        switch(r0) {
            case 1737891: goto L_0x0014;
            case 1743243: goto L_0x002d;
            case 1744022: goto L_0x003d;
            case 1746445: goto L_0x001e;
            case 1751655: goto L_0x0034;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = s.ۢ۫ۜ.m625();
        if (r0 < 0) goto L_0x006b;
    L_0x0012:
        goto L_0x0077;
    L_0x0014:
        s.۠ۡ۟.m140();
        r0 = s.۬۟ۜ.m366();
        if (r0 == 0) goto L_0x0077;
    L_0x001d:
        goto L_0x0064;
    L_0x001e:
        s.ۤۤۖ.m506();
        r0 = s.ۢ۫ۗ.f21;
        if (r0 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0064;
    L_0x0026:
        r0 = "ۛ۬ۜ";
    L_0x0028:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x0009;
    L_0x002d:
        s.۠ۡ۟.m140();
        s.۠ۡ۟.m140();
        goto L_0x0064;
    L_0x0034:
        s.ۧۧۡ.m183();
        r3 = new java.lang.RuntimeException;
        r3.<init>();
        throw r3;
    L_0x003d:
        r2.context = r3;
        r0 = new com.junge.algorithmAidePro.db.DatabaseContext;
        r1 = s.ۚۤۙ.f18;
        if (r1 > 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0064;
    L_0x0046:
        r1 = s.ۤۤۖ.f35;
        if (r1 == 0) goto L_0x004b;
    L_0x004a:
        goto L_0x007e;
    L_0x004b:
        r1 = s.۫۫ۗ.m790();
        if (r1 != 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0064;
    L_0x0052:
        r1 = s.۟ۤۗ.m332();
        if (r1 > 0) goto L_0x0059;
    L_0x0058:
        goto L_0x0077;
    L_0x0059:
        r1 = s.ۦۡۤ.f25;
        if (r1 == 0) goto L_0x005e;
    L_0x005d:
        goto L_0x0064;
    L_0x005e:
        r1 = s.ۦۡۤ.m396();
        if (r1 == 0) goto L_0x0067;
    L_0x0064:
        r0 = "ۤۤۧ";
        goto L_0x0005;
    L_0x0067:
        r1 = s.ۖۙۜ.f48;
        if (r1 != 0) goto L_0x006e;
    L_0x006b:
        r0 = "ۖۚۧ";
        goto L_0x0005;
    L_0x006e:
        r1 = s.ۚۡۢ.f7;
        if (r1 != 0) goto L_0x0073;
    L_0x0072:
        goto L_0x007e;
    L_0x0073:
        r1 = s.ۚۡۢ.f7;
        if (r1 != 0) goto L_0x007a;
    L_0x0077:
        r0 = "۟ۗۥ";
        goto L_0x0028;
    L_0x007a:
        r1 = s.ۜۖۚ.f0;
        if (r1 < 0) goto L_0x0081;
    L_0x007e:
        r0 = "ۘۗ۟";
        goto L_0x0005;
    L_0x0081:
        r0.<init>(r3);
        r2.dbContext = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.DbController.DbController.<init>(android.content.Context):void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0016, code:
            if (s.ۗۗۡ.m78() != false) goto L_0x0099;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x001f, code:
            if (s.ۢۜۘ.f15 == 0) goto L_0x0069;
     */
    /* DevToolsApp WARNING: Missing block: B:22:0x004a, code:
            r3 = "ۨۦۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x0069, code:
            r3 = "۫ۨ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x0099, code:
            r3 = "ۥۨۧ";
     */
    public void deleteDir(java.io.File r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = "ۖ۟ۦ";
    L_0x0005:
        r3 = s.ۢ۫ۗ.m350(r3);
    L_0x0009:
        switch(r3) {
            case 1738045: goto L_0x00aa;
            case 1738144: goto L_0x0049;
            case 1739280: goto L_0x0048;
            case 1740108: goto L_0x0082;
            case 1740633: goto L_0x0033;
            case 1740665: goto L_0x008a;
            case 1741792: goto L_0x007a;
            case 1742135: goto L_0x009f;
            case 1743830: goto L_0x001a;
            case 1747489: goto L_0x002f;
            case 1748708: goto L_0x0093;
            case 1749377: goto L_0x0063;
            case 1749489: goto L_0x004d;
            case 1751592: goto L_0x0012;
            case 1751749: goto L_0x003e;
            case 1752740: goto L_0x0022;
            case 1754655: goto L_0x0036;
            case 1755560: goto L_0x0043;
            case 1757941: goto L_0x006f;
            case 1758511: goto L_0x002a;
            case 1759205: goto L_0x0057;
            default: goto L_0x000c;
        };
    L_0x000c:
        r3 = s.ۘۡۜ.f54;
        if (r3 == 0) goto L_0x0077;
    L_0x0010:
        goto L_0x00ae;
    L_0x0012:
        r3 = s.ۗۗۡ.m78();
        if (r3 == 0) goto L_0x00a3;
    L_0x0018:
        goto L_0x0099;
    L_0x001a:
        s.۬۟ۜ.m366();
        r3 = s.ۢۜۘ.f15;
        if (r3 != 0) goto L_0x0099;
    L_0x0021:
        goto L_0x0069;
    L_0x0022:
        r3 = s.ۜۖۚ.m7();
        if (r3 < 0) goto L_0x0069;
    L_0x0028:
        goto L_0x00ae;
    L_0x002a:
        s.ۚ۟ۢ.m85();
        goto L_0x00ae;
    L_0x002f:
        s.ۜۖۚ.m7();
        return;
    L_0x0033:
        r2 = r2 + 1;
        goto L_0x004a;
    L_0x0036:
        r3 = r0[r2];	 Catch:{ Exception -> 0x0054 }
        s.ۗ۠ۚ.m433(r3);	 Catch:{ Exception -> 0x0054 }
        r3 = "ۙۖۖ";
        goto L_0x0005;
    L_0x003e:
        if (r2 >= r1) goto L_0x0054;
    L_0x0040:
        r3 = "ۧۨ۠";
        goto L_0x0005;
    L_0x0043:
        r1 = r0.length;	 Catch:{ Exception -> 0x0054 }
        r3 = "ۤۧۨ";
        goto L_0x00b4;
    L_0x0048:
        return;
    L_0x0049:
        r2 = 0;
    L_0x004a:
        r3 = "ۨۦۦ";
        goto L_0x0005;
    L_0x004d:
        r0 = s.ۗۗۡ.m74(r5);	 Catch:{ Exception -> 0x0054 }
        r3 = "ۖۢ۬";
        goto L_0x0005;
    L_0x0054:
        r3 = "ۗۨۡ";
        goto L_0x0005;
    L_0x0057:
        r3 = s.۟ۧۢ.m774();
        if (r3 == 0) goto L_0x0060;
    L_0x005d:
        r3 = "ۤۢۦ";
        goto L_0x00b4;
    L_0x0060:
        r3 = "ۢۜ۫";
        goto L_0x0005;
    L_0x0063:
        r3 = s.ۢ۫ۜ.m625();
        if (r3 < 0) goto L_0x006c;
    L_0x0069:
        r3 = "۫ۨ۬";
        goto L_0x00b4;
    L_0x006c:
        r3 = "۬۠ۙ";
        goto L_0x0005;
    L_0x006f:
        r3 = s.ۢۜۘ.f15;
        if (r3 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x00a3;
    L_0x0074:
        r3 = "ۢۙۘ";
        goto L_0x00b4;
    L_0x0077:
        r3 = "۫ۖ۠";
        goto L_0x00b4;
    L_0x007a:
        r3 = s.ۤۗۛ.f24;
        if (r3 == 0) goto L_0x007f;
    L_0x007e:
        goto L_0x00a3;
    L_0x007f:
        r3 = "ۤ۫ۤ";
        goto L_0x00b4;
    L_0x0082:
        r3 = s.ۢۜۘ.f15;
        if (r3 == 0) goto L_0x0087;
    L_0x0086:
        goto L_0x00a3;
    L_0x0087:
        r3 = "ۚۜۢ";
        goto L_0x00b4;
    L_0x008a:
        r3 = s.ۦۢۜ.f1;
        if (r3 > 0) goto L_0x008f;
    L_0x008e:
        goto L_0x00ae;
    L_0x008f:
        r3 = "ۘۤۘ";
        goto L_0x0005;
    L_0x0093:
        r3 = s.ۛۨۦ.m559();
        if (r3 == 0) goto L_0x009c;
    L_0x0099:
        r3 = "ۥۨۧ";
        goto L_0x00b4;
    L_0x009c:
        r3 = "ۙۗۗ";
        goto L_0x00b4;
    L_0x009f:
        r3 = s.ۗ۠ۚ.f28;
        if (r3 == 0) goto L_0x00a6;
    L_0x00a3:
        r3 = "ۜ۠ۚ";
        goto L_0x00b4;
    L_0x00a6:
        r3 = "ۡۢۥ";
        goto L_0x0005;
    L_0x00aa:
        r3 = s.۠ۡۧ.f26;
        if (r3 == 0) goto L_0x00b2;
    L_0x00ae:
        r3 = "۠ۚۛ";
        goto L_0x0005;
    L_0x00b2:
        r3 = "ۚۧۤ";
    L_0x00b4:
        r3 = s.ۜۘۡ.m282(r3);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.DbController.DbController.deleteDir(java.io.File):void");
    }

    /* DevToolsApp WARNING: Missing block: B:4:0x002a, code:
            if (s.ۡۗۗ.m159() == 0) goto L_0x002c;
     */
    /* DevToolsApp WARNING: Missing block: B:5:0x002c, code:
            r12 = r19;
            r13 = r20;
     */
    /* DevToolsApp WARNING: Missing block: B:6:0x0032, code:
            r12 = r19;
            r13 = r20;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x003f, code:
            r12 = r19;
            r13 = r20;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x004b, code:
            if (s.ۗ۬۟.f16 == false) goto L_0x0056;
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x0050, code:
            if (s.ۦۡۤ.f25 == 0) goto L_0x0056;
     */
    /* DevToolsApp WARNING: Missing block: B:16:0x0056, code:
            r12 = "ۡۢۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:23:0x006c, code:
            r13 = r20;
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x008b, code:
            r12 = "ۙۤۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:42:0x00d5, code:
            r12 = "ۢۢۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00e6, code:
            r12 = s.ۢ۫ۗ.m350(r12);
     */
    /* DevToolsApp WARNING: Missing block: B:63:0x0148, code:
            r14 = "ۥۧۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:73:0x0187, code:
            r14 = "ۧۜۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:80:0x01b3, code:
            r14 = "ۨۢۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:85:0x01c4, code:
            r14 = s.ۜۘۡ.m282(r14);
     */
    /* DevToolsApp WARNING: Missing block: B:88:0x01d3, code:
            r14 = "ۧۡۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:94:0x01e8, code:
            r14 = s.ۢ۫ۗ.m350(r14);
     */
    /* DevToolsApp WARNING: Missing block: B:95:0x01ec, code:
            r12 = r14;
     */
    public void saveDbRecords(java.lang.String r20, com.junge.algorithmAidePro.bean.DbRecordItem r21) {
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
        r12 = "ۨ۠ۧ";
        r12 = s.ۜۘۡ.m282(r12);
        r2 = r1;
        r0 = r7;
        r1 = 0;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = 0;
    L_0x001a:
        switch(r12) {
            case 1738733: goto L_0x01b9;
            case 1738744: goto L_0x0061;
            case 1739223: goto L_0x00ed;
            case 1739799: goto L_0x0053;
            case 1740122: goto L_0x0049;
            case 1741071: goto L_0x0069;
            case 1741115: goto L_0x01a9;
            case 1742576: goto L_0x0194;
            case 1742933: goto L_0x00ec;
            case 1742990: goto L_0x014c;
            case 1746451: goto L_0x0160;
            case 1747887: goto L_0x009d;
            case 1748707: goto L_0x005a;
            case 1749668: goto L_0x008f;
            case 1749954: goto L_0x0110;
            case 1751272: goto L_0x017b;
            case 1752694: goto L_0x012f;
            case 1753158: goto L_0x0141;
            case 1753302: goto L_0x0075;
            case 1754290: goto L_0x0026;
            case 1754444: goto L_0x0038;
            case 1755127: goto L_0x0065;
            case 1755375: goto L_0x01d9;
            case 1755436: goto L_0x004e;
            case 1758386: goto L_0x00d9;
            case 1758615: goto L_0x01c9;
            case 1759224: goto L_0x00d8;
            case 1759338: goto L_0x0097;
            default: goto L_0x001d;
        };
    L_0x001d:
        r12 = r19;
        r13 = r20;
        r1 = 64833; // 0xfd41 float:9.085E-41 double:3.2032E-319;
        goto L_0x0148;
    L_0x0026:
        r12 = s.ۡۗۗ.m159();
        if (r12 != 0) goto L_0x0032;
    L_0x002c:
        r12 = r19;
        r13 = r20;
        goto L_0x01b3;
    L_0x0032:
        r12 = r19;
        r13 = r20;
        goto L_0x01d3;
    L_0x0038:
        s.ۘۡۜ.m682();
        r12 = s.۫۫ۗ.f65;
        if (r12 == 0) goto L_0x0045;
    L_0x003f:
        r12 = r19;
        r13 = r20;
        goto L_0x01e3;
    L_0x0045:
        r12 = "ۘۤۦ";
        goto L_0x00fd;
    L_0x0049:
        r12 = s.ۗ۬۟.f16;
        if (r12 != 0) goto L_0x002c;
    L_0x004d:
        goto L_0x0056;
    L_0x004e:
        r12 = s.ۦۡۤ.f25;
        if (r12 != 0) goto L_0x003f;
    L_0x0052:
        goto L_0x0056;
    L_0x0053:
        s.۟ۤۗ.m332();
    L_0x0056:
        r12 = "ۡۢۤ";
        goto L_0x00e6;
    L_0x005a:
        s.ۚۤۙ.m296();
        s.ۖۙۜ.m589();
        return;
    L_0x0061:
        s.ۜۖۚ.m4(r0);
        goto L_0x006c;
    L_0x0065:
        s.ۚ۟ۢ.m84(r7);
        goto L_0x008b;
    L_0x0069:
        s.ۜۘۡ.m275(r6);	 Catch:{ IOException -> 0x0070 }
    L_0x006c:
        r13 = r20;
        goto L_0x00d5;
    L_0x0070:
        r0 = move-exception;
        r12 = "ۗۗۘ";
        goto L_0x00fd;
    L_0x0075:
        r12 = s.ۤۤۖ.m508(r6);
        r13 = s.ۛ۫ۧ.m594(r12);
        if (r13 != 0) goto L_0x008b;
    L_0x007f:
        r7 = "ۨۘۧ";
        r7 = s.ۢ۫ۗ.m350(r7);
        r18 = r12;
        r12 = r7;
        r7 = r18;
        goto L_0x001a;
    L_0x008b:
        r12 = "ۙۤۚ";
        goto L_0x00fd;
    L_0x008f:
        r0 = s.ۖۙۜ.m578(r21);
        com.junge.algorithmAidePro.Utils.Tools.writeFileString(r6, r0);
        return;
    L_0x0097:
        s.ۗۗۡ.m68(r5);
        r13 = r20;
        goto L_0x00e4;
    L_0x009d:
        r12 = new java.io.File;
        r13 = f79;
        r14 = 58;
        r15 = s.ۙۖۥ.f58;
        if (r15 == 0) goto L_0x00ad;
    L_0x00a7:
        r12 = r19;
        r13 = r20;
        goto L_0x0187;
    L_0x00ad:
        r15 = 5;
        r16 = s.ۚۤۙ.f18;
        if (r16 > 0) goto L_0x00b4;
    L_0x00b2:
        goto L_0x0032;
    L_0x00b4:
        r6 = s.۟ۧۢ.m777(r13, r14, r15, r1);
        r13 = r20;
        r6 = s.ۦۢۜ.m17(r13, r6);
        r12.<init>(r5, r6);
        r6 = s.۠ۜۗ.m218(r12);
        if (r6 != 0) goto L_0x00d4;
    L_0x00c7:
        r6 = "ۦۛ۫";
        r6 = s.ۢ۫ۗ.m350(r6);
        r18 = r12;
        r12 = r6;
        r6 = r18;
        goto L_0x001a;
    L_0x00d4:
        r6 = r12;
    L_0x00d5:
        r12 = "ۢۢۤ";
        goto L_0x00e6;
    L_0x00d8:
        return;
    L_0x00d9:
        r13 = r20;
        r12 = s.ۛ۫ۧ.m594(r5);
        if (r12 != 0) goto L_0x00e4;
    L_0x00e1:
        r12 = "۬ۤۢ";
        goto L_0x00e6;
    L_0x00e4:
        r12 = "۠ۧۖ";
    L_0x00e6:
        r12 = s.ۢ۫ۗ.m350(r12);
        goto L_0x001a;
    L_0x00ec:
        return;
    L_0x00ed:
        r13 = r20;
        r12 = 8;
        r12 = s.۠ۡ۟.m139(r2, r3, r12, r1);
        r12 = s.ۨۧۜ.m767(r4, r12);
        if (r12 != 0) goto L_0x0103;
    L_0x00fb:
        r12 = "۬۠۬";
    L_0x00fd:
        r12 = s.ۜۘۡ.m282(r12);
        goto L_0x001a;
    L_0x0103:
        r5 = "۫ۤ۫";
        r5 = s.ۜۘۡ.m282(r5);
        r18 = r12;
        r12 = r5;
        r5 = r18;
        goto L_0x001a;
    L_0x0110:
        r12 = r19;
        r13 = r20;
        r14 = r12.context;
        r15 = f79;
        r16 = 50;
        r17 = s.ۗ۠ۚ.m442();
        if (r17 > 0) goto L_0x0122;
    L_0x0120:
        goto L_0x01d3;
    L_0x0122:
        r2 = "ۗۦۦ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r12 = r2;
        r4 = r14;
        r2 = r15;
        r3 = 50;
        goto L_0x001a;
    L_0x012f:
        r12 = r19;
        r13 = r20;
        r14 = r19.isNotRootDb(r20);
        if (r14 == 0) goto L_0x013d;
    L_0x0139:
        r14 = "ۛۢۜ";
        goto L_0x01c4;
    L_0x013d:
        r14 = "ۢ۫۫";
        goto L_0x01e8;
    L_0x0141:
        r12 = r19;
        r13 = r20;
        r1 = 53840; // 0xd250 float:7.5446E-41 double:2.66005E-319;
    L_0x0148:
        r14 = "ۥۧۘ";
        goto L_0x01c4;
    L_0x014c:
        r12 = r19;
        r13 = r20;
        r14 = 48024900; // 0x2dccd44 float:3.2443911E-37 double:2.3727453E-316;
        r14 = r14 + r11;
        r14 = r10 - r14;
        if (r14 > 0) goto L_0x015c;
    L_0x0158:
        r14 = "ۦۗۗ";
        goto L_0x01c4;
    L_0x015c:
        r14 = "ۚۖۨ";
        goto L_0x01e8;
    L_0x0160:
        r12 = r19;
        r13 = r20;
        r14 = r9 * 13860;
        r15 = r9 * r9;
        r16 = s.۬۟ۜ.m366();
        if (r16 == 0) goto L_0x0170;
    L_0x016e:
        goto L_0x01e3;
    L_0x0170:
        r10 = "ۛۤۗ";
        r10 = s.ۜۘۡ.m282(r10);
        r12 = r10;
        r10 = r14;
        r11 = r15;
        goto L_0x001a;
    L_0x017b:
        r12 = r19;
        r13 = r20;
        r14 = 49;
        r14 = r8[r14];
        r15 = s.۟ۧۢ.f60;
        if (r15 > 0) goto L_0x018a;
    L_0x0187:
        r14 = "ۧۜۧ";
        goto L_0x01c4;
    L_0x018a:
        r9 = "۟ۗ۫";
        r9 = s.ۜۘۡ.m282(r9);
        r12 = r9;
        r9 = r14;
        goto L_0x001a;
    L_0x0194:
        r12 = r19;
        r13 = r20;
        r14 = f79;
        r15 = s.۫ۢ۠.f14;
        if (r15 > 0) goto L_0x019f;
    L_0x019e:
        goto L_0x01e3;
    L_0x019f:
        r8 = "ۤۘۜ";
        r8 = s.ۜۘۡ.m282(r8);
        r12 = r8;
        r8 = r14;
        goto L_0x001a;
    L_0x01a9:
        r12 = r19;
        r13 = r20;
        r14 = s.ۦۡۤ.m396();
        if (r14 == 0) goto L_0x01b6;
    L_0x01b3:
        r14 = "ۨۢۦ";
        goto L_0x01e8;
    L_0x01b6:
        r14 = "ۛۖ۫";
        goto L_0x01e8;
    L_0x01b9:
        r12 = r19;
        r13 = r20;
        r14 = s.ۗۗۡ.f4;
        if (r14 != 0) goto L_0x01c2;
    L_0x01c1:
        goto L_0x01e3;
    L_0x01c2:
        r14 = "ۙۥۧ";
    L_0x01c4:
        r14 = s.ۜۘۡ.m282(r14);
        goto L_0x01ec;
    L_0x01c9:
        r12 = r19;
        r13 = r20;
        r14 = s.۟ۥۙ.m650();
        if (r14 > 0) goto L_0x01d6;
    L_0x01d3:
        r14 = "ۧۡۦ";
        goto L_0x01e8;
    L_0x01d6:
        r14 = "ۗۖ۬";
        goto L_0x01e8;
    L_0x01d9:
        r12 = r19;
        r13 = r20;
        r14 = s.ۗۤ۫.m195();
        if (r14 < 0) goto L_0x01e6;
    L_0x01e3:
        r14 = "ۘۚۙ";
        goto L_0x01c4;
    L_0x01e6:
        r14 = "۫۬ۘ";
    L_0x01e8:
        r14 = s.ۢ۫ۗ.m350(r14);
    L_0x01ec:
        r12 = r14;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.DbController.DbController.saveDbRecords(java.lang.String, com.junge.algorithmAidePro.bean.DbRecordItem):void");
    }

    /* DevToolsApp WARNING: Missing block: B:5:0x0034, code:
            r22 = r8;
            r23 = r9;
            r24 = r10;
            r25 = r11;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x0049, code:
            r22 = r8;
            r23 = r9;
            r24 = r10;
            r25 = r11;
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x0060, code:
            r22 = r8;
            r23 = r9;
            r24 = r10;
            r25 = r11;
     */
    /* DevToolsApp WARNING: Missing block: B:16:0x0078, code:
            if (s.ۚ۟ۢ.m85() != 0) goto L_0x007a;
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x007a, code:
            r22 = r8;
            r23 = r9;
            r24 = r10;
            r25 = r11;
     */
    /* DevToolsApp WARNING: Missing block: B:19:0x008b, code:
            if (s.ۗۜۛ.m698() > 0) goto L_0x008d;
     */
    /* DevToolsApp WARNING: Missing block: B:20:0x008d, code:
            r22 = r8;
            r23 = r9;
            r24 = r10;
            r25 = r11;
     */
    /* DevToolsApp WARNING: Missing block: B:25:0x00a6, code:
            if (s.۬۟ۜ.m366() == false) goto L_0x007a;
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x00b0, code:
            if (s.ۗۜ۟.m469() > 0) goto L_0x008d;
     */
    /* DevToolsApp WARNING: Missing block: B:41:0x00db, code:
            r22 = r8;
            r23 = r9;
            r24 = r10;
            r25 = r11;
     */
    /* DevToolsApp WARNING: Missing block: B:44:0x00e9, code:
            r22 = s.ۢ۫ۗ.m350(r22);
     */
    /* DevToolsApp WARNING: Missing block: B:51:0x0116, code:
            r22 = "۬ۥۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:61:0x0139, code:
            r22 = s.ۜۘۡ.m282(r22);
     */
    /* DevToolsApp WARNING: Missing block: B:88:0x01c6, code:
            r8 = "ۨۢ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:91:0x01d6, code:
            r8 = "۟ۛۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:100:0x0219, code:
            r8 = "ۤۥۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:115:0x02a2, code:
            r22 = r10;
            r10 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:118:0x02b6, code:
            r8 = "۫ۨۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:122:0x02d7, code:
            r8 = "ۢۦۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:124:0x02e8, code:
            r22 = r9;
            r9 = r23;
     */
    /* DevToolsApp WARNING: Missing block: B:127:0x02fc, code:
            r8 = "۟ۘۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:129:0x0301, code:
            r8 = s.ۢ۫ۗ.m350(r8);
     */
    /* DevToolsApp WARNING: Missing block: B:139:0x0334, code:
            r8 = "۟ۡۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:143:0x0346, code:
            r8 = "۟ۗۥ";
     */
    public void clearDbLog(java.lang.String r28) {
        /*
        r27 = this;
        r1 = r27;
        r2 = r28;
        r0 = 0;
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
        r20 = 0;
        r21 = 0;
        r22 = "ۙ۠ۡ";
        r22 = s.ۢ۫ۗ.m350(r22);
        r3 = r0;
        r0 = r4;
        r4 = 0;
    L_0x0027:
        switch(r22) {
            case 1738122: goto L_0x0203;
            case 1738263: goto L_0x011a;
            case 1740204: goto L_0x027c;
            case 1740247: goto L_0x0074;
            case 1740954: goto L_0x033a;
            case 1740988: goto L_0x013f;
            case 1741689: goto L_0x021d;
            case 1741926: goto L_0x0233;
            case 1742169: goto L_0x00d6;
            case 1742907: goto L_0x00ef;
            case 1743096: goto L_0x00cf;
            case 1743551: goto L_0x00be;
            case 1744212: goto L_0x00c2;
            case 1746416: goto L_0x0257;
            case 1746445: goto L_0x00a9;
            case 1746461: goto L_0x00b3;
            case 1746565: goto L_0x01ca;
            case 1746758: goto L_0x00b7;
            case 1746896: goto L_0x02ee;
            case 1746929: goto L_0x0316;
            case 1747378: goto L_0x0132;
            case 1748612: goto L_0x0328;
            case 1748789: goto L_0x00a2;
            case 1749573: goto L_0x020e;
            case 1749789: goto L_0x0084;
            case 1749854: goto L_0x0057;
            case 1751288: goto L_0x02a8;
            case 1751364: goto L_0x01b7;
            case 1751687: goto L_0x01da;
            case 1751748: goto L_0x01cb;
            case 1752272: goto L_0x0199;
            case 1752512: goto L_0x002b;
            case 1752520: goto L_0x02c9;
            case 1753406: goto L_0x0306;
            case 1754171: goto L_0x0187;
            case 1754183: goto L_0x00c8;
            case 1754444: goto L_0x00c7;
            case 1754589: goto L_0x0042;
            case 1755441: goto L_0x01a5;
            case 1758507: goto L_0x0097;
            case 1759359: goto L_0x00fa;
            case 1759399: goto L_0x00e5;
            case 1759402: goto L_0x0111;
            case 1759560: goto L_0x0119;
            default: goto L_0x002a;
        };
    L_0x002a:
        return;
    L_0x002b:
        s.ۛ۫ۧ.m593();
        r22 = s.ۖۜ۟.m492();
        if (r22 == 0) goto L_0x003e;
    L_0x0034:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        goto L_0x0346;
    L_0x003e:
        r22 = "ۧۦۜ";
        goto L_0x0139;
    L_0x0042:
        s.۠ۜۗ.m214();
        r22 = s.ۡۘۗ.f2;
        if (r22 == 0) goto L_0x0053;
    L_0x0049:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        goto L_0x02b6;
    L_0x0053:
        r22 = "ۢۨۤ";
        goto L_0x00e9;
    L_0x0057:
        s.۫ۢ۠.m237();
        r22 = s.۟ۥۙ.m650();
        if (r22 > 0) goto L_0x006a;
    L_0x0060:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        goto L_0x02d7;
    L_0x006a:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        goto L_0x0322;
    L_0x0074:
        r22 = s.ۚ۟ۢ.m85();
        if (r22 == 0) goto L_0x0060;
    L_0x007a:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        goto L_0x02fc;
    L_0x0084:
        s.ۙۖۥ.m748();
        r22 = s.ۗۜۛ.m698();
        if (r22 <= 0) goto L_0x0049;
    L_0x008d:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        goto L_0x0334;
    L_0x0097:
        s.ۗ۠ۚ.m442();
        r22 = s.ۥۥۚ.f50;
        if (r22 != 0) goto L_0x009f;
    L_0x009e:
        goto L_0x008d;
    L_0x009f:
        r22 = "ۡۥۙ";
        goto L_0x00e9;
    L_0x00a2:
        r22 = s.۬۟ۜ.m366();
        if (r22 != 0) goto L_0x0034;
    L_0x00a8:
        goto L_0x007a;
    L_0x00a9:
        s.۟ۥۙ.m650();
        r22 = s.ۗۜ۟.m469();
        if (r22 <= 0) goto L_0x007a;
    L_0x00b2:
        goto L_0x008d;
    L_0x00b3:
        s.ۡۢۡ.m58();
        goto L_0x008d;
    L_0x00b7:
        s.ۢۜۘ.m255();
        s.ۢ۫ۗ.m342();
        return;
    L_0x00be:
        r1.deleteDir(r8);	 Catch:{ Exception -> 0x012e }
        goto L_0x00db;
    L_0x00c2:
        if (r14 == 0) goto L_0x00db;
    L_0x00c4:
        r22 = "ۜۗۚ";
        goto L_0x00e9;
    L_0x00c7:
        return;
    L_0x00c8:
        r14 = s.ۘۡۜ.m683();	 Catch:{ Exception -> 0x012e }
        r22 = "ۜ۬ۤ";
        goto L_0x00e9;
    L_0x00cf:
        r1.deleteDir(r8);	 Catch:{ Exception -> 0x012e }
        r22 = "ۧۡۦ";
        goto L_0x0139;
    L_0x00d6:
        if (r11 != r13) goto L_0x00db;
    L_0x00d8:
        r22 = "ۧۙۙ";
        goto L_0x00e9;
    L_0x00db:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        goto L_0x01d6;
    L_0x00e5:
        if (r12 == 0) goto L_0x0116;
    L_0x00e7:
        r22 = "ۛۧۤ";
    L_0x00e9:
        r22 = s.ۢ۫ۗ.m350(r22);
        goto L_0x0027;
    L_0x00ef:
        r22 = r7.getPath();	 Catch:{ Exception -> 0x012e }
        r12 = s.ۛ۫ۧ.m594(r22);	 Catch:{ Exception -> 0x012e }
        r22 = "۬ۦۡ";
        goto L_0x0139;
    L_0x00fa:
        r27.clearDbRecords(r28);	 Catch:{ Exception -> 0x012e }
        r22 = r7.getType();	 Catch:{ Exception -> 0x012e }
        r13 = com.junge.algorithmAidePro.bean.DataBaseInfo.TYPE.Remote;	 Catch:{ Exception -> 0x012e }
        r11 = "ۚۨۧ";
        r11 = s.ۢ۫ۗ.m350(r11);
        r26 = r22;
        r22 = r11;
        r11 = r26;
        goto L_0x0027;
    L_0x0111:
        if (r9 != r10) goto L_0x0116;
    L_0x0113:
        r22 = "ۛۡۡ";
        goto L_0x0139;
    L_0x0116:
        r22 = "۬ۥۘ";
        goto L_0x0139;
    L_0x0119:
        return;
    L_0x011a:
        r22 = r7.getType();	 Catch:{ Exception -> 0x012e }
        r10 = com.junge.algorithmAidePro.bean.DataBaseInfo.TYPE.NORMAL;	 Catch:{ Exception -> 0x012e }
        r9 = "۬ۦۤ";
        r9 = s.ۜۘۡ.m282(r9);
        r26 = r22;
        r22 = r9;
        r9 = r26;
        goto L_0x0027;
    L_0x012e:
        r0 = move-exception;
        r22 = r8;
        goto L_0x017f;
    L_0x0132:
        if (r8 != 0) goto L_0x0137;
    L_0x0134:
        r22 = "۬۫ۧ";
        goto L_0x0139;
    L_0x0137:
        r22 = "ۖۦۧ";
    L_0x0139:
        r22 = s.ۜۘۡ.m282(r22);
        goto L_0x0027;
    L_0x013f:
        r22 = r8;
        r8 = r1.context;	 Catch:{ Exception -> 0x017e }
        r23 = r9;
        r9 = f79;	 Catch:{ Exception -> 0x017c }
        r24 = r10;
        r10 = 14;
        r25 = r11;
        r11 = 7;
        r9 = s.ۨۗۥ.m531(r9, r10, r11, r4);	 Catch:{ Exception -> 0x01fe }
        r8 = s.ۨۧۜ.m754(r8, r9);	 Catch:{ Exception -> 0x01fe }
        r8 = s.ۤۗۛ.m373(r8);	 Catch:{ Exception -> 0x01fe }
        r8 = r8.putBoolean(r2, r6);	 Catch:{ Exception -> 0x01fe }
        r8.apply();	 Catch:{ Exception -> 0x01fe }
        r8 = TAG;	 Catch:{ Exception -> 0x01fe }
        r9 = s.ۦۡۤ.m398(r7);	 Catch:{ Exception -> 0x01fe }
        s.ۢ۟ۚ.m175(r8, r9);	 Catch:{ Exception -> 0x01fe }
        r8 = r7.getPath();	 Catch:{ Exception -> 0x01fe }
        r9 = "۠ۖۨ";
        r22 = s.ۜۘۡ.m282(r9);
        r9 = r23;
        r10 = r24;
        r11 = r25;
        goto L_0x0027;
    L_0x017c:
        r0 = move-exception;
        goto L_0x0181;
    L_0x017e:
        r0 = move-exception;
    L_0x017f:
        r23 = r9;
    L_0x0181:
        r24 = r10;
        r25 = r11;
        goto L_0x01ff;
    L_0x0187:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        if (r7 != 0) goto L_0x0195;
    L_0x0191:
        r8 = "ۗۚۤ";
        goto L_0x0301;
    L_0x0195:
        r8 = "ۙۡۤ";
        goto L_0x034b;
    L_0x0199:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r3.setlogInit(r6);	 Catch:{ Exception -> 0x01fe }
        goto L_0x01c6;
    L_0x01a5:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = r1.dbContext;	 Catch:{ Exception -> 0x01fe }
        r7 = r8.getDataBaseInfo(r2);	 Catch:{ Exception -> 0x01fe }
        r8 = "ۧۘ۬";
        goto L_0x034b;
    L_0x01b7:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r6 = 0;
        if (r5 == 0) goto L_0x01c6;
    L_0x01c2:
        r8 = "ۥۙۤ";
        goto L_0x034b;
    L_0x01c6:
        r8 = "ۨۢ۫";
        goto L_0x0301;
    L_0x01ca:
        return;
    L_0x01cb:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        s.ۗ۬۟.m271(r0);
    L_0x01d6:
        r8 = "۟ۛۡ";
        goto L_0x0301;
    L_0x01da:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = new com.junge.algorithmAidePro.jungeRPC.AlgorithmClient;	 Catch:{ Exception -> 0x01fe }
        r8.<init>(r2);	 Catch:{ Exception -> 0x01fe }
        r5 = s.ۥۥۚ.m619(r8);	 Catch:{ Exception -> 0x01fe }
        r3 = "ۤۛۛ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r9 = r23;
        r10 = r24;
        r11 = r25;
        r26 = r22;
        r22 = r3;
        r3 = r8;
        goto L_0x0359;
    L_0x01fe:
        r0 = move-exception;
    L_0x01ff:
        r8 = "ۤۧۧ";
        goto L_0x034b;
    L_0x0203:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r4 = 23721; // 0x5ca9 float:3.324E-41 double:1.17197E-319;
        goto L_0x0219;
    L_0x020e:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r4 = 45949; // 0xb37d float:6.4388E-41 double:2.2702E-319;
    L_0x0219:
        r8 = "ۤۥۨ";
        goto L_0x034b;
    L_0x021d:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = r20 + r21;
        r8 = r8 - r19;
        if (r8 >= 0) goto L_0x022f;
    L_0x022b:
        r8 = "ۖۢۖ";
        goto L_0x0301;
    L_0x022f:
        r8 = "ۢ۟ۢ";
        goto L_0x034b;
    L_0x0233:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = 6230016; // 0x5f1000 float:8.730112E-39 double:3.078037E-317;
        r9 = s.ۤۗۛ.m370();
        if (r9 < 0) goto L_0x0246;
    L_0x0244:
        goto L_0x0346;
    L_0x0246:
        r9 = "ۚۙۘ";
        r9 = s.ۢ۫ۗ.m350(r9);
        r8 = r22;
        r10 = r24;
        r11 = r25;
        r21 = 6230016; // 0x5f1000 float:8.730112E-39 double:3.078037E-317;
        goto L_0x02e8;
    L_0x0257:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = r17 * r18;
        r9 = r17 * r17;
        r10 = s.ۤۤۖ.m506();
        if (r10 == 0) goto L_0x026b;
    L_0x0269:
        goto L_0x0334;
    L_0x026b:
        r10 = "ۚ۠۬";
        r10 = s.ۜۘۡ.m282(r10);
        r19 = r8;
        r20 = r9;
        r8 = r22;
        r9 = r23;
        r11 = r25;
        goto L_0x02a2;
    L_0x027c:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = r15[r16];
        r9 = 4992; // 0x1380 float:6.995E-42 double:2.4664E-320;
        r10 = s.ۧۧۡ.m183();
        if (r10 > 0) goto L_0x0292;
    L_0x028e:
        r8 = "ۥۡۜ";
        goto L_0x034b;
    L_0x0292:
        r10 = "۟ۖۧ";
        r10 = s.ۜۘۡ.m282(r10);
        r17 = r8;
        r8 = r22;
        r9 = r23;
        r11 = r25;
        r18 = 4992; // 0x1380 float:6.995E-42 double:2.4664E-320;
    L_0x02a2:
        r22 = r10;
        r10 = r24;
        goto L_0x0027;
    L_0x02a8:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = 13;
        r9 = s.ۛۨۦ.f46;
        if (r9 == 0) goto L_0x02ba;
    L_0x02b6:
        r8 = "۫ۨۨ";
        goto L_0x034b;
    L_0x02ba:
        r9 = "ۘۧۛ";
        r9 = s.ۜۘۡ.m282(r9);
        r8 = r22;
        r10 = r24;
        r11 = r25;
        r16 = 13;
        goto L_0x02e8;
    L_0x02c9:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = f79;
        r9 = s.ۗۗۡ.f4;
        if (r9 != 0) goto L_0x02db;
    L_0x02d7:
        r8 = "ۢۦۡ";
        goto L_0x034b;
    L_0x02db:
        r9 = "ۤۘ۬";
        r9 = s.ۜۘۡ.m282(r9);
        r15 = r8;
        r8 = r22;
        r10 = r24;
        r11 = r25;
    L_0x02e8:
        r22 = r9;
        r9 = r23;
        goto L_0x0027;
    L_0x02ee:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = s.ۡۥۗ.m568();
        if (r8 == 0) goto L_0x02ff;
    L_0x02fc:
        r8 = "۟ۘۖ";
        goto L_0x0301;
    L_0x02ff:
        r8 = "ۥۡۤ";
    L_0x0301:
        r8 = s.ۢ۫ۗ.m350(r8);
        goto L_0x034f;
    L_0x0306:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = s.ۢۜۘ.f15;
        if (r8 == 0) goto L_0x0313;
    L_0x0312:
        goto L_0x0334;
    L_0x0313:
        r8 = "۟ۦۗ";
        goto L_0x034b;
    L_0x0316:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = s.ۚۤۙ.f18;
        if (r8 > 0) goto L_0x0325;
    L_0x0322:
        r8 = "ۘۨۧ";
        goto L_0x034b;
    L_0x0325:
        r8 = "ۦ۟ۗ";
        goto L_0x034b;
    L_0x0328:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = s.ۜۘۡ.f17;
        if (r8 > 0) goto L_0x0337;
    L_0x0334:
        r8 = "۟ۡۨ";
        goto L_0x034b;
    L_0x0337:
        r8 = "۟ۧۙ";
        goto L_0x034b;
    L_0x033a:
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r8 = s.ۖۙۜ.f48;
        if (r8 != 0) goto L_0x0349;
    L_0x0346:
        r8 = "۟ۗۥ";
        goto L_0x0301;
    L_0x0349:
        r8 = "ۡ۟ۢ";
    L_0x034b:
        r8 = s.ۜۘۡ.m282(r8);
    L_0x034f:
        r9 = r23;
        r10 = r24;
        r11 = r25;
        r26 = r22;
        r22 = r8;
    L_0x0359:
        r8 = r26;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.DbController.DbController.clearDbLog(java.lang.String):void");
    }

    /* DevToolsApp WARNING: Missing block: B:5:0x002f, code:
            r16 = r0;
            r17 = r7;
            r18 = r8;
            r19 = r9;
            r7 = r23;
            r8 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x0074, code:
            if (s.ۚۤۙ.f18 > 0) goto L_0x0076;
     */
    /* DevToolsApp WARNING: Missing block: B:15:0x0076, code:
            r16 = r0;
            r17 = r7;
            r18 = r8;
            r19 = r9;
            r7 = r23;
            r8 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x012a, code:
            r0 = "ۘۛۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x0190, code:
            r0 = "۠ۦۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:60:0x01e2, code:
            r0 = "ۡۚۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:64:0x01f9, code:
            r0 = s.ۢ۫ۗ.m350(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:68:0x0216, code:
            r0 = "ۦۡۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:72:0x023f, code:
            r0 = "ۧۤۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:83:0x02b1, code:
            r0 = "ۖۧۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:85:0x02bc, code:
            r0 = r16;
            r7 = r17;
            r8 = r18;
     */
    /* DevToolsApp WARNING: Missing block: B:86:0x02c2, code:
            r16 = r9;
     */
    /* DevToolsApp WARNING: Missing block: B:87:0x02c4, code:
            r9 = r19;
     */
    /* DevToolsApp WARNING: Missing block: B:90:0x02da, code:
            r0 = "۠ۤ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:92:0x02e0, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:93:0x02e4, code:
            r7 = r17;
            r8 = r18;
            r9 = r19;
     */
    /* DevToolsApp WARNING: Missing block: B:94:0x02ea, code:
            r22 = r16;
            r16 = r0;
            r0 = r22;
     */
    public com.junge.algorithmAidePro.bean.DbRecordItem getDbRecordItem(java.lang.String r24) {
        /*
        r23 = this;
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
        r15 = 0;
        r16 = "ۡۧۘ";
        r16 = s.ۜۘۡ.m282(r16);
        r3 = r2;
        r0 = r8;
        r4 = 0;
        r2 = r1;
        r8 = r7;
        r1 = 0;
        r7 = r6;
        r6 = r5;
        r5 = 0;
    L_0x001f:
        switch(r16) {
            case 1738185: goto L_0x012e;
            case 1738279: goto L_0x0026;
            case 1738789: goto L_0x00dd;
            case 1739827: goto L_0x00c8;
            case 1740359: goto L_0x009c;
            case 1741026: goto L_0x024c;
            case 1742060: goto L_0x0203;
            case 1742560: goto L_0x008c;
            case 1743051: goto L_0x00ba;
            case 1744027: goto L_0x0279;
            case 1746507: goto L_0x01c1;
            case 1747458: goto L_0x008d;
            case 1747816: goto L_0x0072;
            case 1747858: goto L_0x0084;
            case 1748451: goto L_0x01a8;
            case 1748850: goto L_0x02c8;
            case 1749974: goto L_0x0130;
            case 1751704: goto L_0x0150;
            case 1752336: goto L_0x017a;
            case 1753291: goto L_0x01e5;
            case 1754522: goto L_0x004b;
            case 1755336: goto L_0x029d;
            case 1755575: goto L_0x022b;
            case 1758429: goto L_0x01d2;
            case 1759057: goto L_0x00ce;
            case 1759176: goto L_0x005a;
            default: goto L_0x0022;
        };
    L_0x0022:
        s.ۛ۫ۧ.m593();
        goto L_0x0076;
    L_0x0026:
        s.۫۫ۗ.m790();
        r16 = s.۠ۡ۟.m140();
        if (r16 > 0) goto L_0x003d;
    L_0x002f:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        goto L_0x0216;
    L_0x003d:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        goto L_0x023f;
    L_0x004b:
        s.۬ۗ۫.m98();
        r16 = s.۫ۢ۠.f14;
        if (r16 <= 0) goto L_0x0053;
    L_0x0052:
        goto L_0x002f;
    L_0x0053:
        r16 = "۬۟ۛ";
        r16 = s.ۜۘۡ.m282(r16);
        goto L_0x001f;
    L_0x005a:
        s.ۗۢۢ.m454();
        r16 = s.ۙۖۥ.m748();
        if (r16 > 0) goto L_0x0064;
    L_0x0063:
        goto L_0x002f;
    L_0x0064:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        goto L_0x02da;
    L_0x0072:
        r16 = s.ۚۤۙ.f18;
        if (r16 <= 0) goto L_0x002f;
    L_0x0076:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        goto L_0x0190;
    L_0x0084:
        s.ۨۗۥ.m536();
        s.ۘۡۜ.m682();
        r0 = 0;
        return r0;
    L_0x008c:
        return r9;
    L_0x008d:
        s.ۜۖۚ.m4(r0);
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r8 = r24;
        goto L_0x012a;
    L_0x009c:
        r16 = r0;
        r0 = com.junge.algorithmAidePro.bean.DbRecordItem.class;
        r0 = s.۠ۡ۟.m133(r8, r0);	 Catch:{ Exception -> 0x00b1 }
        r0 = (com.junge.algorithmAidePro.bean.DbRecordItem) r0;	 Catch:{ Exception -> 0x00b1 }
        r9 = "ۛۖۛ";
        r9 = s.ۢ۫ۗ.m350(r9);
        r22 = r9;
        r9 = r0;
        goto L_0x0273;
    L_0x00b1:
        r0 = move-exception;
        r16 = "۠ۙۛ";
        r16 = s.ۢ۫ۗ.m350(r16);
        goto L_0x001f;
    L_0x00ba:
        r16 = r0;
        r8 = s.ۘۡۜ.m685(r7);
        r0 = "ۘ۬ۛ";
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x02ea;
    L_0x00c8:
        r0 = new com.junge.algorithmAidePro.bean.DbRecordItem;
        r0.<init>();
        return r0;
    L_0x00ce:
        r16 = r0;
        s.ۗۗۡ.m68(r6);
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r8 = r24;
        goto L_0x014c;
    L_0x00dd:
        r16 = r0;
        r0 = new java.io.File;
        r17 = r7;
        r7 = f79;
        r18 = r8;
        r19 = s.ۗۜ۟.m469();
        if (r19 > 0) goto L_0x00f5;
    L_0x00ed:
        r7 = r23;
        r8 = r24;
        r19 = r9;
        goto L_0x02da;
    L_0x00f5:
        r8 = 5;
        r20 = s.۬ۨۨ.m730();
        if (r20 == 0) goto L_0x0104;
    L_0x00fc:
        r7 = r23;
        r8 = r24;
        r19 = r9;
        goto L_0x0216;
    L_0x0104:
        r19 = r9;
        r9 = 44;
        r7 = s.ۗ۬ۦ.m414(r7, r9, r8, r1);
        r8 = r24;
        r7 = s.ۦۢۜ.m17(r8, r7);
        r0.<init>(r6, r7);
        r7 = s.۠ۜۗ.m218(r0);
        if (r7 == 0) goto L_0x012a;
    L_0x011b:
        r7 = "ۛۦۖ";
        r7 = s.ۜۘۡ.m282(r7);
        r8 = r18;
        r9 = r19;
        r22 = r7;
        r7 = r0;
        goto L_0x0273;
    L_0x012a:
        r0 = "ۘۛۖ";
        goto L_0x01f9;
    L_0x012e:
        r0 = 0;
        return r0;
    L_0x0130:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r8 = r24;
        r0 = s.ۗۜ۟.m471(r2, r4, r5, r1);
        r6 = s.ۨۧۜ.m767(r3, r0);
        r0 = s.ۛ۫ۧ.m594(r6);
        if (r0 != 0) goto L_0x014c;
    L_0x0148:
        r0 = "۬ۛ۠";
        goto L_0x02e0;
    L_0x014c:
        r0 = "ۗۘۦ";
        goto L_0x02e0;
    L_0x0150:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r8 = r24;
        r0 = 8;
        r7 = s.ۚۡۢ.m112();
        if (r7 < 0) goto L_0x0166;
    L_0x0162:
        r7 = r23;
        goto L_0x02b1;
    L_0x0166:
        r5 = "ۢ۬۠";
        r5 = s.ۢ۫ۗ.m350(r5);
        r0 = r16;
        r7 = r17;
        r8 = r18;
        r9 = r19;
        r16 = r5;
        r5 = 8;
        goto L_0x001f;
    L_0x017a:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        r0 = r7.context;
        r9 = f79;
        r20 = 36;
        r21 = s.ۚۤۙ.f18;
        if (r21 > 0) goto L_0x0194;
    L_0x0190:
        r0 = "۠ۦۘ";
        goto L_0x02e0;
    L_0x0194:
        r2 = "ۤۦۚ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r3 = r0;
        r0 = r16;
        r7 = r17;
        r8 = r18;
        r4 = 36;
        r16 = r2;
        r2 = r9;
        goto L_0x02c4;
    L_0x01a8:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        r0 = r23.isNotRootDb(r24);
        if (r0 == 0) goto L_0x01bd;
    L_0x01ba:
        r0 = "ۖۤۗ";
        goto L_0x01f9;
    L_0x01bd:
        r0 = "ۥۛۦ";
        goto L_0x02e0;
    L_0x01c1:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        r0 = 31042; // 0x7942 float:4.3499E-41 double:1.5337E-319;
        r1 = 31042; // 0x7942 float:4.3499E-41 double:1.5337E-319;
        goto L_0x01e2;
    L_0x01d2:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        r0 = 25196; // 0x626c float:3.5307E-41 double:1.24485E-319;
        r1 = 25196; // 0x626c float:3.5307E-41 double:1.24485E-319;
    L_0x01e2:
        r0 = "ۡۚۜ";
        goto L_0x01f9;
    L_0x01e5:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        r0 = r12 * r15;
        r0 = r14 - r0;
        if (r0 < 0) goto L_0x01ff;
    L_0x01f7:
        r0 = "۫ۦۘ";
    L_0x01f9:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x02e4;
    L_0x01ff:
        r0 = "۟ۙۥ";
        goto L_0x02e0;
    L_0x0203:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        r0 = 33190; // 0x81a6 float:4.6509E-41 double:1.6398E-319;
        r9 = s.ۧۧۡ.f11;
        if (r9 != 0) goto L_0x021a;
    L_0x0216:
        r0 = "ۦۡۙ";
        goto L_0x02e0;
    L_0x021a:
        r9 = "ۦۛ۠";
        r9 = s.ۢ۫ۗ.m350(r9);
        r0 = r16;
        r7 = r17;
        r8 = r18;
        r15 = 33190; // 0x81a6 float:4.6509E-41 double:1.6398E-319;
        goto L_0x02c2;
    L_0x022b:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        r0 = 275394025; // 0x106a2de9 float:4.618373E-29 double:1.36062727E-315;
        r0 = r0 + r13;
        r9 = s.ۢ۫ۗ.f21;
        if (r9 == 0) goto L_0x0243;
    L_0x023f:
        r0 = "ۧۤۗ";
        goto L_0x02e0;
    L_0x0243:
        r9 = "ۚۥۗ";
        r9 = s.ۜۘۡ.m282(r9);
        r14 = r0;
        goto L_0x02bc;
    L_0x024c:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        r0 = r10[r11];
        r9 = r0 * r0;
        r20 = s.ۤۗۛ.m370();
        if (r20 < 0) goto L_0x0263;
    L_0x0262:
        goto L_0x02b1;
    L_0x0263:
        r12 = "ۨۧۖ";
        r12 = s.ۢ۫ۗ.m350(r12);
        r13 = r9;
        r7 = r17;
        r8 = r18;
        r9 = r19;
        r22 = r12;
        r12 = r0;
    L_0x0273:
        r0 = r16;
        r16 = r22;
        goto L_0x001f;
    L_0x0279:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        r0 = 35;
        r9 = s.ۨۘۢ.m318();
        if (r9 == 0) goto L_0x028e;
    L_0x028d:
        goto L_0x02da;
    L_0x028e:
        r9 = "ۙۢ۫";
        r9 = s.ۢ۫ۗ.m350(r9);
        r0 = r16;
        r7 = r17;
        r8 = r18;
        r11 = 35;
        goto L_0x02c2;
    L_0x029d:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        r0 = f79;
        r9 = s.۬ۗ۫.m98();
        if (r9 == 0) goto L_0x02b5;
    L_0x02b1:
        r0 = "ۖۧۘ";
        goto L_0x01f9;
    L_0x02b5:
        r9 = "ۜۦۥ";
        r9 = s.ۜۘۡ.m282(r9);
        r10 = r0;
    L_0x02bc:
        r0 = r16;
        r7 = r17;
        r8 = r18;
    L_0x02c2:
        r16 = r9;
    L_0x02c4:
        r9 = r19;
        goto L_0x001f;
    L_0x02c8:
        r16 = r0;
        r17 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r23;
        r8 = r24;
        r0 = s.ۜۖۚ.m7();
        if (r0 < 0) goto L_0x02de;
    L_0x02da:
        r0 = "۠ۤ۬";
        goto L_0x01f9;
    L_0x02de:
        r0 = "ۨ۟۟";
    L_0x02e0:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x02e4:
        r7 = r17;
        r8 = r18;
        r9 = r19;
    L_0x02ea:
        r22 = r16;
        r16 = r0;
        r0 = r22;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.DbController.DbController.getDbRecordItem(java.lang.String):com.junge.algorithmAidePro.bean.DbRecordItem");
    }

    /* DevToolsApp WARNING: Missing block: B:8:0x0013, code:
            if (s.ۗۗۡ.f4 != false) goto L_0x00a0;
     */
    /* DevToolsApp WARNING: Missing block: B:25:0x004b, code:
            r0 = "ۨۘۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x0087, code:
            r0 = "ۡۡۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:53:0x00a0, code:
            r0 = "ۜۗ۬";
     */
    public boolean isNotRootDb(java.lang.String r2) {
        /*
        r1 = this;
        r0 = "۬ۨۦ";
    L_0x0002:
        r0 = s.ۢ۫ۗ.m350(r0);
    L_0x0006:
        switch(r0) {
            case 1739863: goto L_0x0011;
            case 1740138: goto L_0x0079;
            case 1740805: goto L_0x005b;
            case 1741172: goto L_0x0051;
            case 1743569: goto L_0x0021;
            case 1746451: goto L_0x0065;
            case 1746452: goto L_0x003e;
            case 1746744: goto L_0x0083;
            case 1747363: goto L_0x002f;
            case 1748680: goto L_0x000b;
            case 1751578: goto L_0x006f;
            case 1752642: goto L_0x0017;
            case 1752692: goto L_0x002d;
            case 1755128: goto L_0x0025;
            case 1759081: goto L_0x0047;
            case 1759099: goto L_0x008f;
            case 1759466: goto L_0x009c;
            default: goto L_0x0009;
        };
    L_0x0009:
        r2 = 0;
        return r2;
    L_0x000b:
        r0 = s.ۢۜۘ.f15;
        if (r0 == 0) goto L_0x0095;
    L_0x000f:
        goto L_0x00a0;
    L_0x0011:
        r0 = s.ۗۗۡ.f4;
        if (r0 == 0) goto L_0x0073;
    L_0x0015:
        goto L_0x00a0;
    L_0x0017:
        s.ۥۘۧ.m662();
        r0 = s.۟ۤۗ.m332();
        if (r0 > 0) goto L_0x00a0;
    L_0x0020:
        goto L_0x004b;
    L_0x0021:
        s.۬ۗ۫.m98();
        goto L_0x004b;
    L_0x0025:
        s.ۚۡۢ.m112();
        s.ۗۜ۟.m469();
        r2 = 0;
        return r2;
    L_0x002d:
        r2 = 1;
        return r2;
    L_0x002f:
        r0 = r1.dbContext;
        r0 = r0.getDataBaseInfoFromNoRoot(r2);
        if (r0 == 0) goto L_0x003b;
    L_0x0037:
        r0 = "ۥۧۖ";
        goto L_0x00a5;
    L_0x003b:
        r0 = "ۧۡۨ";
        goto L_0x0002;
    L_0x003e:
        r0 = s.۬ۗ۫.f6;
        if (r0 < 0) goto L_0x0043;
    L_0x0042:
        goto L_0x0087;
    L_0x0043:
        r0 = "۠ۖۙ";
        goto L_0x00a5;
    L_0x0047:
        r0 = s.ۗۢۢ.f29;
        if (r0 < 0) goto L_0x004e;
    L_0x004b:
        r0 = "ۨۘۨ";
        goto L_0x0002;
    L_0x004e:
        r0 = "۟ۗ۬";
        goto L_0x00a5;
    L_0x0051:
        r0 = s.ۤۤۖ.m506();
        if (r0 == 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0095;
    L_0x0058:
        r0 = "۬ۜۙ";
        goto L_0x00a5;
    L_0x005b:
        r0 = s.ۗ۠ۚ.m442();
        if (r0 > 0) goto L_0x0062;
    L_0x0061:
        goto L_0x0073;
    L_0x0062:
        r0 = "ۙۧۢ";
        goto L_0x00a5;
    L_0x0065:
        r0 = s.ۨۧۚ.m718();
        if (r0 > 0) goto L_0x006c;
    L_0x006b:
        goto L_0x0073;
    L_0x006c:
        r0 = "ۙۛۧ";
        goto L_0x0002;
    L_0x006f:
        r0 = s.ۗۢۢ.f29;
        if (r0 < 0) goto L_0x0076;
    L_0x0073:
        r0 = "ۥۥۢ";
        goto L_0x00a5;
    L_0x0076:
        r0 = "۟ۗ۫";
        goto L_0x0002;
    L_0x0079:
        r0 = s.ۨۧۜ.m755();
        if (r0 < 0) goto L_0x0080;
    L_0x007f:
        goto L_0x0095;
    L_0x0080:
        r0 = "ۤۢۘ";
        goto L_0x00a5;
    L_0x0083:
        r0 = s.ۚۤۙ.f18;
        if (r0 > 0) goto L_0x008b;
    L_0x0087:
        r0 = "ۡۡۨ";
        goto L_0x0002;
    L_0x008b:
        r0 = "ۘۥۗ";
        goto L_0x0002;
    L_0x008f:
        r0 = s.۠ۜۗ.m214();
        if (r0 > 0) goto L_0x0099;
    L_0x0095:
        r0 = "ۘۜۛ";
        goto L_0x0002;
    L_0x0099:
        r0 = "۟ۡۚ";
        goto L_0x00a5;
    L_0x009c:
        r0 = s.ۗۤ۫.f12;
        if (r0 == 0) goto L_0x00a3;
    L_0x00a0:
        r0 = "ۜۗ۬";
        goto L_0x00a5;
    L_0x00a3:
        r0 = "۬ۜ۫";
    L_0x00a5:
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.DbController.DbController.isNotRootDb(java.lang.String):boolean");
    }
}
