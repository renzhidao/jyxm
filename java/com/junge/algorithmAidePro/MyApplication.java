package com.junge.algorithmAidePro;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.junge.algorithmAidePro.Config.ConfigReader;
import com.junge.algorithmAidePro.DbController.DbController;
import com.junge.algorithmAidePro.bean.AppData;
import com.junge.algorithmAidePro.db.DaoSession;
import s.۬۟ۜ;

public class MyApplication extends Application {
    public static final String DB_NAME;
    private static final String TAG;
    private static AppData appData = new AppData();
    public static boolean isAlgorithmAide = true;
    private static MyApplication myApplication;
    public static String umengKey;
    public static String xposedTypeImpl;
    /* renamed from: ۜ۬ۤ */
    private static final short[] f83 = new short[]{(short) 5585, (short) -10006, (short) -10009, (short) -10004, (short) -10012, (short) -9991, (short) -10014, (short) -9985, (short) -10013, (short) -10010, (short) -10038, (short) -10014, (short) -10001, (short) -10002, (short) -10021, (short) -9991, (short) -10012, (short) -10075, (short) -10001, (short) -10007, (short) -10042, (short) -9998, (short) -10038, (short) -9989, (short) -9989, (short) -10009, (short) -10014, (short) -10008, (short) -10006, (short) -9985, (short) -10014, (short) -10012, (short) -10011, (short) -10051, (short) -10050, (short) -10002, (short) -10050, (short) -10056, (short) -10008, (short) -10049, (short) -10007, (short) -10006, (short) -10052, (short) -10055, (short) -10053, (short) -10061, (short) -10006, (short) -10050, (short) -10006, (short) -10003, (short) -10054, (short) -10007, (short) -10049, (short) -10056, (short) -10050, (short) -10055, (short) -10052, (short) 8334, (short) 11323, (short) 11285, (short) 11288, (short) 11290, (short) 11282, (short) 11323, (short) 11286, (short) 11265, (short) 11311, (short) 11265, (short) 11273, (short) 25462, (short) 21451, (short) 19283, (short) 23452, (short) 17471, (short) 19407, (short) 2182, (short) 32463, (short) 32451, (short) 32450, (short) 32472, (short) 32457, (short) 32450, (short) 32472, (short) 32406, (short) 32387, (short) 32387, (short) 32463, (short) 32451, (short) 32449, (short) 32386, (short) 32461, (short) 32450, (short) 32456, (short) 32478, (short) 32451, (short) 32453, (short) 32456, (short) 32386, (short) 32457, (short) 32468, (short) 32472, (short) 32457, (short) 32478, (short) 32450, (short) 32461, (short) 32448, (short) 32479, (short) 32472, (short) 32451, (short) 32478, (short) 32461, (short) 32459, (short) 32457, (short) 32386, (short) 32456, (short) 32451, (short) 32463, (short) 32473, (short) 32449, (short) 32457, (short) 32450, (short) 32472, (short) 32479, (short) 32387, (short) 32472, (short) 32478, (short) 32457, (short) 32457, (short) 32387, (short) 32476, (short) 32478, (short) 32453, (short) 32449, (short) 32461, (short) 32478, (short) 32469, (short) 32393, (short) 32415, (short) 32493, (short) 32493, (short) 32450, (short) 32456, (short) 32478, (short) 32451, (short) 32453, (short) 32456, (short) 32393, (short) 32414, (short) 32490, (short) 32456, (short) 32461, (short) 32472, (short) 32461, (short) 8954, (short) 9545, (short) 9548, (short) 9561, (short) 9548, (short) 5845, (short) 25770, (short) 25766, (short) 25764, (short) 25831, (short) 25763, (short) 25788, (short) 25767, (short) 25774, (short) 25772, (short) 25831, (short) 25768, (short) 25765, (short) 25774, (short) 25766, (short) 25787, (short) 25760, (short) 25789, (short) 25761, (short) 25764, (short) 25736, (short) 25760, (short) 25773, (short) 25772, (short) 25753, (short) 25787, (short) 25766, (short) 5755, (short) -19119, (short) -19107, (short) -19105, (short) -19172, (short) -19112, (short) -19129, (short) -19108, (short) -19115, (short) -19113, (short) -19172, (short) -19117, (short) -19106, (short) -19115, (short) -19107, (short) -19136, (short) -19109, (short) -19130, (short) -19110, (short) -19105, (short) -19085, (short) -19109, (short) -19114, (short) -19113, (short) -19102, (short) -19136, (short) -19107, (short) -19117, (short) -19119, (short) -19119, (short) -19113, (short) -19134, (short) -19130, (short) -19135, (short) -19130, (short) -19117, (short) -19136, (short) -19130, (short) -19076, (short) -19129, (short) -19105, (short) -11752, (short) -9486, (short) -10231, (short) 2753, (short) -31493, (short) -31513, (short) -31513, (short) -31517, (short) -31575, (short) -31556, (short) -31556, (short) -31495, (short) -31514, (short) -31491, (short) -31500, (short) -31498, (short) -31579, (short) -31579, (short) -31579, (short) -31555, (short) -31504, (short) -31491, (short) -31556, (short) -31502, (short) -31489, (short) -31500, (short) -31492, (short) -31519, (short) -31494, (short) -31513, (short) -31493, (short) -31490, (short) -31534, (short) -31494, (short) -31497, (short) -31498, (short) -31549, (short) -31519, (short) -31492, (short) -31556, (short) -31502, (short) -31517, (short) -31517, (short) -31549, (short) -31519, (short) -31492, (short) -31555, (short) -31517, (short) -31493, (short) -31517, (short) -31532, (short) -31530, (short) -31545, (short) -31522, (short) -31510, (short) -31534, (short) -31517, (short) -31517, (short) -31489, (short) -31494, (short) -31504, (short) -31502, (short) -31513, (short) -31494, (short) -31492, (short) -31491};
    public ConfigReader algorithmAideConfig;
    public DaoSession daoSession;
    public DbController dbController;

    public class ExceptionHandler extends Handler {
        /* renamed from: ۧۛۖ */
        private static final short[] f85 = new short[]{(short) 6114, (short) 4628, (short) 4625, (short) 4612, (short) 4625, (short) 26747, (short) 19711, (short) 17290, (short) 25024, (short) 19826, (short) 19528, (short) 26747, (short) 19711, (short) 17290, (short) 25024, (short) 19826, (short) 19528, (short) -4740, (short) -26233, (short) 20086, (short) 23675, (short) 16487, (short) -30871, (short) -26209, (short) 29088, (short) 24043, (short) 27817, (short) 23852, (short) -28043, (short) 4730, (short) 27166, (short) 18922};

        /* DevToolsApp WARNING: Missing block: B:4:0x0021, code:
            r21 = r1;
            r20 = r3;
            r19 = r8;
            r18 = r11;
     */
        /* DevToolsApp WARNING: Missing block: B:7:0x003c, code:
            if (s.ۨۘۢ.m318() != 0) goto L_0x003e;
     */
        /* DevToolsApp WARNING: Missing block: B:8:0x003e, code:
            r19 = r8;
            r18 = r11;
     */
        /* DevToolsApp WARNING: Missing block: B:22:0x009a, code:
            r8 = "۬ۡ۟";
     */
        /* DevToolsApp WARNING: Missing block: B:28:0x00c9, code:
            r8 = s.ۢ۫ۗ.m350(r8);
            r11 = r18;
     */
        /* DevToolsApp WARNING: Missing block: B:39:0x0137, code:
            r11 = r18;
            r8 = r19;
            r18 = s.ۢ۫ۗ.m350("۬ۨۙ");
     */
        /* DevToolsApp WARNING: Missing block: B:43:0x016b, code:
            r1 = "ۛ۬ۤ";
     */
        /* DevToolsApp WARNING: Missing block: B:45:0x017c, code:
            r3 = r20;
     */
        /* DevToolsApp WARNING: Missing block: B:48:0x0196, code:
            r1 = "ۖۧۥ";
     */
        /* DevToolsApp WARNING: Missing block: B:52:0x01ab, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
        /* DevToolsApp WARNING: Missing block: B:53:0x01af, code:
            r11 = r18;
            r8 = r19;
            r3 = r20;
            r18 = r1;
            r1 = r21;
     */
        /* DevToolsApp WARNING: Missing block: B:60:0x01ef, code:
            r1 = "ۢۖۧ";
     */
        /* DevToolsApp WARNING: Missing block: B:61:0x01f1, code:
            r1 = s.ۢ۫ۗ.m350(r1);
     */
        /* DevToolsApp WARNING: Missing block: B:65:0x0216, code:
            r1 = "ۛۦۧ";
     */
        /* DevToolsApp WARNING: Missing block: B:67:0x0227, code:
            r18 = r8;
     */
        /* DevToolsApp WARNING: Missing block: B:68:0x0229, code:
            r8 = r19;
     */
        public void handleMessage(android.os.Message r24) {
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
            r16 = 0;
            r17 = 0;
            r18 = "ۖ۬ۦ";
            r18 = s.ۜۘۡ.m282(r18);
        L_0x001a:
            switch(r18) {
                case 1738292: goto L_0x0151;
                case 1738448: goto L_0x0205;
                case 1739035: goto L_0x0120;
                case 1739404: goto L_0x006b;
                case 1740066: goto L_0x01df;
                case 1741174: goto L_0x01be;
                case 1743068: goto L_0x0035;
                case 1746936: goto L_0x0180;
                case 1748524: goto L_0x00f8;
                case 1749299: goto L_0x0043;
                case 1749967: goto L_0x018c;
                case 1752645: goto L_0x0086;
                case 1752859: goto L_0x005e;
                case 1755561: goto L_0x00d1;
                case 1758024: goto L_0x00ad;
                case 1758060: goto L_0x0199;
                case 1759242: goto L_0x0057;
                case 1759453: goto L_0x0050;
                default: goto L_0x001d;
            };
        L_0x001d:
            r18 = s.ۦۢۜ.f1;
            if (r18 <= 0) goto L_0x002b;
        L_0x0021:
            r21 = r1;
            r20 = r3;
            r19 = r8;
            r18 = r11;
            goto L_0x01ef;
        L_0x002b:
            r21 = r1;
            r20 = r3;
            r19 = r8;
            r18 = r11;
            goto L_0x0216;
        L_0x0035:
            s.ۗ۠ۚ.m442();
            r18 = s.ۨۘۢ.m318();
            if (r18 == 0) goto L_0x0021;
        L_0x003e:
            r19 = r8;
            r18 = r11;
            goto L_0x009a;
        L_0x0043:
            r18 = s.۟ۥۙ.f52;
            if (r18 != 0) goto L_0x0048;
        L_0x0047:
            goto L_0x003e;
        L_0x0048:
            r20 = r3;
            r19 = r8;
            r18 = r11;
            goto L_0x0137;
        L_0x0050:
            s.۬ۗ۫.m98();
            s.ۡۥۗ.m568();
            goto L_0x003e;
        L_0x0057:
            s.ۛۨۦ.m559();
            s.ۨۧۜ.m755();
            return;
        L_0x005e:
            r0 = 0;
            r0 = s.ۚ۟ۢ.m95(r11, r0);
            r0 = s.ۡۢۡ.m48(r0);
            s.ۡۥۗ.m566(r0);
            return;
        L_0x006b:
            r18 = r11;
            r11 = 2;
            r11 = s.ۖۜ۟.m485(r8, r9, r11, r0);
            r19 = r8;
            r8 = 0;
            r11 = s.۠ۜۗ.m219(r10, r11, r8);
            r8 = s.ۙۖۥ.f58;
            if (r8 == 0) goto L_0x007e;
        L_0x007d:
            goto L_0x009a;
        L_0x007e:
            r8 = "ۥ۬ۢ";
            r18 = s.ۢ۫ۗ.m350(r8);
            goto L_0x0229;
        L_0x0086:
            r19 = r8;
            r18 = r11;
            r8 = s.ۥۘۧ.m668(r7);
            r8 = s.ۨۗۥ.m534(r6, r8);
            r11 = f85;
            r20 = 30;
            r21 = s.ۚۡۢ.f7;
            if (r21 != 0) goto L_0x009d;
        L_0x009a:
            r8 = "۬ۡ۟";
            goto L_0x00c9;
        L_0x009d:
            r9 = "ۗ۬ۡ";
            r9 = s.ۜۘۡ.m282(r9);
            r10 = r8;
            r8 = r11;
            r11 = r18;
            r18 = r9;
            r9 = 30;
            goto L_0x001a;
        L_0x00ad:
            r19 = r8;
            r18 = r11;
            r8 = 11;
            r11 = 19;
            r8 = s.ۖۜ۟.m485(r5, r8, r11, r0);
            s.ۗۜۛ.m701(r7, r8);
            s.ۢ۫ۜ.m637(r7, r3);
            r8 = s.ۤۤۖ.f35;
            if (r8 == 0) goto L_0x00c7;
        L_0x00c3:
            r20 = r3;
            goto L_0x0137;
        L_0x00c7:
            r8 = "ۥۥۥ";
        L_0x00c9:
            r8 = s.ۢ۫ۗ.m350(r8);
            r11 = r18;
            goto L_0x0227;
        L_0x00d1:
            r19 = r8;
            r18 = r11;
            r8 = new java.lang.StringBuilder;
            r8.<init>();
            r11 = f85;
            r20 = s.۠ۡ۟.f8;
            if (r20 > 0) goto L_0x00e6;
        L_0x00e0:
            r21 = r1;
            r20 = r3;
            goto L_0x016b;
        L_0x00e6:
            r5 = "۫ۙۖ";
            r5 = s.ۢ۫ۗ.m350(r5);
            r7 = r8;
            r8 = r19;
            r22 = r18;
            r18 = r5;
            r5 = r11;
            r11 = r22;
            goto L_0x001a;
        L_0x00f8:
            r19 = r8;
            r18 = r11;
            r8 = f85;
            r11 = 5;
            r20 = r3;
            r3 = 6;
            r3 = s.ۢ۫ۜ.m626(r8, r11, r3, r0);
            r3 = s.ۚۤۙ.m298(r4, r3);
            r8 = s.ۗۤ۫.f12;
            if (r8 == 0) goto L_0x0112;
        L_0x010e:
            r21 = r1;
            goto L_0x0216;
        L_0x0112:
            r6 = "ۨۦۧ";
            r6 = s.ۢ۫ۗ.m350(r6);
            r11 = r18;
            r8 = r19;
            r18 = r6;
            r6 = r3;
            goto L_0x017c;
        L_0x0120:
            r20 = r3;
            r19 = r8;
            r18 = r11;
            r3 = s.ۗ۬ۦ.m402(r1, r2);
            r8 = new androidx.appcompat.app.AlertDialog$Builder;
            r11 = com.junge.algorithmAidePro.Activity.BaseActivity.getTopActivity();
            r8.<init>(r11);
            r11 = s.۬ۨۨ.f57;
            if (r11 == 0) goto L_0x0144;
        L_0x0137:
            r3 = "۬ۨۙ";
            r3 = s.ۢ۫ۗ.m350(r3);
            r11 = r18;
            r8 = r19;
            r18 = r3;
            goto L_0x017c;
        L_0x0144:
            r4 = "ۡۜۧ";
            r4 = s.ۜۘۡ.m282(r4);
            r11 = r18;
            r18 = r4;
            r4 = r8;
            goto L_0x0229;
        L_0x0151:
            r20 = r3;
            r19 = r8;
            r18 = r11;
            r3 = s.ۦۢۜ.m25(r24);
            r8 = f85;
            r11 = 1;
            r21 = r1;
            r1 = 4;
            r1 = s.۟ۧۢ.m777(r8, r11, r1, r0);
            r8 = s.ۡۗۗ.m159();
            if (r8 == 0) goto L_0x016e;
        L_0x016b:
            r1 = "ۛ۬ۤ";
            goto L_0x01ab;
        L_0x016e:
            r2 = "ۗ۠ۤ";
            r2 = s.ۢ۫ۗ.m350(r2);
            r11 = r18;
            r8 = r19;
            r18 = r2;
            r2 = r1;
            r1 = r3;
        L_0x017c:
            r3 = r20;
            goto L_0x001a;
        L_0x0180:
            r21 = r1;
            r20 = r3;
            r19 = r8;
            r18 = r11;
            r0 = 63834; // 0xf95a float:8.945E-41 double:3.1538E-319;
            goto L_0x0196;
        L_0x018c:
            r21 = r1;
            r20 = r3;
            r19 = r8;
            r18 = r11;
            r0 = 4720; // 0x1270 float:6.614E-42 double:2.332E-320;
        L_0x0196:
            r1 = "ۖۧۥ";
            goto L_0x01ab;
        L_0x0199:
            r21 = r1;
            r20 = r3;
            r19 = r8;
            r18 = r11;
            r1 = r14 + r17;
            r1 = r1 * r1;
            r1 = r16 - r1;
            if (r1 > 0) goto L_0x01bb;
        L_0x01a9:
            r1 = "ۢ۬ۙ";
        L_0x01ab:
            r1 = s.ۜۘۡ.m282(r1);
        L_0x01af:
            r11 = r18;
            r8 = r19;
            r3 = r20;
            r18 = r1;
            r1 = r21;
            goto L_0x001a;
        L_0x01bb:
            r1 = "۟ۧ۠";
            goto L_0x01ab;
        L_0x01be:
            r21 = r1;
            r20 = r3;
            r19 = r8;
            r18 = r11;
            r1 = r15 + 1;
            r3 = 1;
            r8 = s.ۦۢۜ.f1;
            if (r8 > 0) goto L_0x01ce;
        L_0x01cd:
            goto L_0x01ef;
        L_0x01ce:
            r8 = "۫ۚۛ";
            r8 = s.ۢ۫ۗ.m350(r8);
            r16 = r1;
            r11 = r18;
            r3 = r20;
            r1 = r21;
            r17 = 1;
            goto L_0x0227;
        L_0x01df:
            r21 = r1;
            r20 = r3;
            r19 = r8;
            r18 = r11;
            r1 = r12[r13];
            r3 = r1 * 2;
            r8 = s.ۢ۟ۚ.f10;
            if (r8 == 0) goto L_0x01f6;
        L_0x01ef:
            r1 = "ۢۖۧ";
        L_0x01f1:
            r1 = s.ۢ۫ۗ.m350(r1);
            goto L_0x01af;
        L_0x01f6:
            r8 = "ۙۧۤ";
            r8 = s.ۜۘۡ.m282(r8);
            r14 = r1;
            r15 = r3;
            r11 = r18;
            r3 = r20;
            r1 = r21;
            goto L_0x0227;
        L_0x0205:
            r21 = r1;
            r20 = r3;
            r19 = r8;
            r18 = r11;
            r1 = f85;
            r3 = 0;
            r8 = s.ۚ۟ۢ.m85();
            if (r8 == 0) goto L_0x0219;
        L_0x0216:
            r1 = "ۛۦۧ";
            goto L_0x01f1;
        L_0x0219:
            r8 = "ۘۢ۬";
            r8 = s.ۢ۫ۗ.m350(r8);
            r12 = r1;
            r11 = r18;
            r3 = r20;
            r1 = r21;
            r13 = 0;
        L_0x0227:
            r18 = r8;
        L_0x0229:
            r8 = r19;
            goto L_0x001a;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.ExceptionHandler.handleMessage(android.os.Message):void");
        }
    }

    public static MyApplication getInstance() {
        return myApplication;
    }

    /* DevToolsApp WARNING: Missing block: B:4:0x0012, code:
            if (s.۫۫ۗ.m790() != false) goto L_0x0071;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0024, code:
            if (s.ۗۗۡ.m78() != false) goto L_0x0071;
     */
    /* DevToolsApp WARNING: Missing block: B:16:0x0044, code:
            r2 = "ۦۖ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:24:0x005b, code:
            r2 = "۟ۙۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:38:0x0087, code:
            r2 = "۠ۡۡ";
     */
    public static android.database.sqlite.SQLiteDatabase getSQLiteDatabase(android.content.Context r4, java.lang.String r5) {
        /*
        r0 = 0;
        r1 = 0;
        r2 = "ۛۦۖ";
    L_0x0004:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x0008:
        switch(r2) {
            case 1737857: goto L_0x0015;
            case 1740729: goto L_0x006b;
            case 1740917: goto L_0x0031;
            case 1741019: goto L_0x009f;
            case 1742291: goto L_0x008e;
            case 1743051: goto L_0x00ad;
            case 1747103: goto L_0x002b;
            case 1747370: goto L_0x0081;
            case 1747712: goto L_0x0027;
            case 1751337: goto L_0x0061;
            case 1753136: goto L_0x0030;
            case 1754366: goto L_0x001d;
            case 1754755: goto L_0x0036;
            case 1755172: goto L_0x0077;
            case 1755589: goto L_0x0096;
            case 1758101: goto L_0x004c;
            case 1758368: goto L_0x0057;
            default: goto L_0x000b;
        };
    L_0x000b:
        s.۟ۤۗ.m332();
        r2 = s.۫۫ۗ.m790();
        if (r2 == 0) goto L_0x00b1;
    L_0x0014:
        goto L_0x0071;
    L_0x0015:
        r2 = s.ۜۖۚ.m7();
        if (r2 < 0) goto L_0x005b;
    L_0x001b:
        goto L_0x00b1;
    L_0x001d:
        s.ۗۜۛ.m698();
        r2 = s.ۗۗۡ.m78();
        if (r2 == 0) goto L_0x0087;
    L_0x0026:
        goto L_0x0071;
    L_0x0027:
        s.ۨۘۢ.m318();
        goto L_0x0071;
    L_0x002b:
        s.۬۟ۜ.m366();
        r4 = 0;
        return r4;
    L_0x0030:
        return r1;
    L_0x0031:
        s.ۗ۬۟.m271(r0);
        r1 = 0;
        goto L_0x0044;
    L_0x0036:
        r2 = new com.junge.algorithmAidePro.db.DatabaseContext;	 Catch:{ Exception -> 0x0048 }
        r2.<init>(r4);	 Catch:{ Exception -> 0x0048 }
        r3 = new com.junge.algorithmAidePro.db.DaoMaster$DevOpenHelper;	 Catch:{ Exception -> 0x0048 }
        r3.<init>(r2, r5);	 Catch:{ Exception -> 0x0048 }
        r1 = r3.getWritableDatabase();	 Catch:{ Exception -> 0x0048 }
    L_0x0044:
        r2 = "ۦۖ۠";
        goto L_0x00b7;
    L_0x0048:
        r0 = move-exception;
        r2 = "ۙ۟ۛ";
        goto L_0x0004;
    L_0x004c:
        r2 = s.ۚۡۢ.m112();
        if (r2 < 0) goto L_0x0053;
    L_0x0052:
        goto L_0x00a5;
    L_0x0053:
        r2 = "ۧ۫ۧ";
        goto L_0x00b7;
    L_0x0057:
        r2 = s.ۜۖۚ.f0;
        if (r2 < 0) goto L_0x005e;
    L_0x005b:
        r2 = "۟ۙۘ";
        goto L_0x00b7;
    L_0x005e:
        r2 = "۫ۛۥ";
        goto L_0x00b7;
    L_0x0061:
        r2 = s.ۨۗۥ.m536();
        if (r2 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0071;
    L_0x0068:
        r2 = "۫ۤۙ";
        goto L_0x00b7;
    L_0x006b:
        r2 = s.۠ۡ۟.m140();
        if (r2 > 0) goto L_0x0074;
    L_0x0071:
        r2 = "۟۬۬";
        goto L_0x0004;
    L_0x0074:
        r2 = "ۤۚ۟";
        goto L_0x0004;
    L_0x0077:
        r2 = s.۟ۧۢ.m774();
        if (r2 == 0) goto L_0x007e;
    L_0x007d:
        goto L_0x00b1;
    L_0x007e:
        r2 = "ۙۙۙ";
        goto L_0x00b7;
    L_0x0081:
        r2 = s.ۙۜۦ.m520();
        if (r2 == 0) goto L_0x008b;
    L_0x0087:
        r2 = "۠ۡۡ";
        goto L_0x0004;
    L_0x008b:
        r2 = "ۨۚۖ";
        goto L_0x00b7;
    L_0x008e:
        r2 = s.ۦۡۤ.f25;
        if (r2 == 0) goto L_0x0093;
    L_0x0092:
        goto L_0x00b1;
    L_0x0093:
        r2 = "۠ۖ۠";
        goto L_0x00b7;
    L_0x0096:
        r2 = s.ۚۤۙ.f18;
        if (r2 > 0) goto L_0x009b;
    L_0x009a:
        goto L_0x00a5;
    L_0x009b:
        r2 = "ۚ۬ۥ";
        goto L_0x0004;
    L_0x009f:
        r2 = s.۬ۗ۫.m98();
        if (r2 == 0) goto L_0x00a9;
    L_0x00a5:
        r2 = "ۖۙۤ";
        goto L_0x0004;
    L_0x00a9:
        r2 = "ۨۧۤ";
        goto L_0x0004;
    L_0x00ad:
        r2 = s.۠ۡۧ.f26;
        if (r2 == 0) goto L_0x00b5;
    L_0x00b1:
        r2 = "ۧ۟ۖ";
        goto L_0x0004;
    L_0x00b5:
        r2 = "ۙۢۤ";
    L_0x00b7:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.getSQLiteDatabase(android.content.Context, java.lang.String):android.database.sqlite.SQLiteDatabase");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0015, code:
            if (s.ۖۙۜ.f48 == false) goto L_0x008d;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x002b, code:
            if (s.ۦۡۤ.m396() == 0) goto L_0x008d;
     */
    /* DevToolsApp WARNING: Missing block: B:28:0x0060, code:
            r2 = "ۘۗۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:36:0x0075, code:
            r2 = s.ۜۘۡ.m282(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x008d, code:
            r2 = "ۨۗۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x0099, code:
            r2 = "ۡۤۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:51:0x00a9, code:
            r2 = "ۢۗۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x00b8, code:
            r2 = "۠ۗ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:58:0x00c6, code:
            r2 = "ۙۨۙ";
     */
    public static boolean isAndroid11() {
        /*
        r0 = 0;
        r1 = 0;
        r2 = "ۗۘۥ";
    L_0x0004:
        r2 = s.ۢ۫ۗ.m350(r2);
    L_0x0008:
        switch(r2) {
            case 1738788: goto L_0x00bc;
            case 1738897: goto L_0x005c;
            case 1739703: goto L_0x0019;
            case 1740958: goto L_0x003e;
            case 1741194: goto L_0x00b7;
            case 1741605: goto L_0x007a;
            case 1741981: goto L_0x0095;
            case 1746711: goto L_0x0042;
            case 1747412: goto L_0x0041;
            case 1747648: goto L_0x0066;
            case 1748431: goto L_0x0049;
            case 1748679: goto L_0x0013;
            case 1748756: goto L_0x002f;
            case 1749331: goto L_0x0024;
            case 1753250: goto L_0x006e;
            case 1755094: goto L_0x0036;
            case 1755327: goto L_0x00a1;
            case 1755606: goto L_0x0051;
            case 1757965: goto L_0x0087;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = s.ۜۖۚ.m7();
        if (r2 < 0) goto L_0x0059;
    L_0x0011:
        goto L_0x008d;
    L_0x0013:
        r2 = s.ۖۙۜ.f48;
        if (r2 != 0) goto L_0x0060;
    L_0x0017:
        goto L_0x008d;
    L_0x0019:
        s.ۚۤۙ.m296();
        r2 = s.۠ۡۧ.m431();
        if (r2 != 0) goto L_0x00a9;
    L_0x0022:
        goto L_0x0099;
    L_0x0024:
        s.ۢ۫ۗ.m342();
        r2 = s.ۦۡۤ.m396();
        if (r2 != 0) goto L_0x0099;
    L_0x002d:
        goto L_0x008d;
    L_0x002f:
        s.ۛ۫ۧ.m593();
        s.ۛۨۦ.m559();
        goto L_0x008d;
    L_0x0036:
        s.ۛۨۦ.m559();
        s.ۦۡۤ.m396();
        r0 = 0;
        return r0;
    L_0x003e:
        r1 = 1;
        goto L_0x00b8;
    L_0x0041:
        return r1;
    L_0x0042:
        r2 = 30;
        if (r0 < r2) goto L_0x00c6;
    L_0x0046:
        r2 = "ۙ۠ۥ";
        goto L_0x0004;
    L_0x0049:
        r2 = s.ۢۜۘ.f15;
        if (r2 == 0) goto L_0x004e;
    L_0x004d:
        goto L_0x0080;
    L_0x004e:
        r2 = "۟۠ۘ";
        goto L_0x0004;
    L_0x0051:
        r2 = s.ۙۜۦ.f36;
        if (r2 > 0) goto L_0x0056;
    L_0x0055:
        goto L_0x008d;
    L_0x0056:
        r2 = "ۡۙۧ";
        goto L_0x0004;
    L_0x0059:
        r2 = "ۨۨۖ";
        goto L_0x0075;
    L_0x005c:
        r2 = s.ۡۗۗ.f9;
        if (r2 != 0) goto L_0x0063;
    L_0x0060:
        r2 = "ۘۗۖ";
        goto L_0x0004;
    L_0x0063:
        r2 = "ۘۤۜ";
        goto L_0x0075;
    L_0x0066:
        r2 = s.ۥۘۧ.f53;
        if (r2 == 0) goto L_0x006b;
    L_0x006a:
        goto L_0x0080;
    L_0x006b:
        r2 = "ۗۜۖ";
        goto L_0x0075;
    L_0x006e:
        r2 = s.ۢ۟ۚ.f10;
        if (r2 == 0) goto L_0x0073;
    L_0x0072:
        goto L_0x008d;
    L_0x0073:
        r2 = "۠۟۟";
    L_0x0075:
        r2 = s.ۜۘۡ.m282(r2);
        goto L_0x0008;
    L_0x007a:
        r2 = s.ۗۤ۫.m195();
        if (r2 < 0) goto L_0x0083;
    L_0x0080:
        r2 = "ۡۡۧ";
        goto L_0x0075;
    L_0x0083:
        r2 = "ۦۚۖ";
        goto L_0x0004;
    L_0x0087:
        r2 = s.ۜۖۚ.m7();
        if (r2 < 0) goto L_0x0091;
    L_0x008d:
        r2 = "ۨۗۥ";
        goto L_0x0004;
    L_0x0091:
        r2 = "ۚۖۡ";
        goto L_0x0004;
    L_0x0095:
        r2 = s.۫۫ۗ.f65;
        if (r2 == 0) goto L_0x009d;
    L_0x0099:
        r2 = "ۡۤۗ";
        goto L_0x0004;
    L_0x009d:
        r2 = "۫ۗۙ";
        goto L_0x0004;
    L_0x00a1:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = s.۠ۡۧ.m431();
        if (r3 != 0) goto L_0x00ac;
    L_0x00a9:
        r2 = "ۢۗۨ";
        goto L_0x0075;
    L_0x00ac:
        r0 = "ۚۢۥ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0008;
    L_0x00b7:
        r1 = 0;
    L_0x00b8:
        r2 = "۠ۗ۫";
        goto L_0x0004;
    L_0x00bc:
        r2 = isFrame();
        if (r2 != 0) goto L_0x00c6;
    L_0x00c2:
        r2 = "ۨ۟ۖ";
        goto L_0x0004;
    L_0x00c6:
        r2 = "ۙۨۙ";
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.isAndroid11():boolean");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0060, code:
            r25 = r0;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0066, code:
            r26 = r1;
            r1 = r23;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x0078, code:
            r26 = r1;
            r1 = r23;
     */
    /* DevToolsApp WARNING: Missing block: B:15:0x0082, code:
            r25 = r0;
     */
    /* DevToolsApp WARNING: Missing block: B:18:0x0092, code:
            if (s.ۗ۬۟.m257() <= 0) goto L_0x009c;
     */
    /* DevToolsApp WARNING: Missing block: B:20:0x0099, code:
            if (s.۟ۧۢ.m774() != false) goto L_0x0082;
     */
    /* DevToolsApp WARNING: Missing block: B:21:0x009c, code:
            r25 = "۟ۛۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x00d6, code:
            r25 = "ۖ۠ۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:36:0x00d8, code:
            r25 = s.ۢ۫ۗ.m350(r25);
     */
    /* DevToolsApp WARNING: Missing block: B:60:0x0170, code:
            r0 = "ۥ۬ۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:69:0x01a8, code:
            r0 = "ۢ۠۫";
     */
    /* DevToolsApp WARNING: Missing block: B:75:0x01e5, code:
            if (s.ۡۢۡ.m60(r1, "") != false) goto L_0x0211;
     */
    /* DevToolsApp WARNING: Missing block: B:77:0x01f4, code:
            r0 = "۫ۙۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:81:0x0211, code:
            r0 = "۠۟ۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:82:0x0213, code:
            r0 = s.ۢ۫ۗ.m350(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:85:0x022f, code:
            r0 = "ۥ۫ۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:90:0x0243, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:91:0x0247, code:
            r23 = r1;
            r1 = r26;
     */
    /* DevToolsApp WARNING: Missing block: B:92:0x024b, code:
            r29 = r25;
            r25 = r0;
            r0 = r29;
     */
    /* DevToolsApp WARNING: Missing block: B:93:0x0253, code:
            r0 = "ۧ۠۟";
     */
    /* DevToolsApp WARNING: Missing block: B:97:0x0278, code:
            r0 = "ۗۦۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:101:0x029b, code:
            r0 = "ۤۥۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:105:0x02bc, code:
            r0 = "۟ۧۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:107:0x02d0, code:
            r0 = r25;
            r25 = r29;
     */
    public static boolean isFrame() {
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
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r21 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 0;
        r25 = "۟ۗ۟";
        r25 = s.ۜۘۡ.m282(r25);
        r23 = r0;
        r24 = r1;
        r16 = r7;
        r10 = r18;
        r12 = r20;
        r13 = r22;
        r0 = 0;
        r1 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r11 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r21 = 0;
        r22 = 0;
    L_0x0046:
        switch(r25) {
            case 1738065: goto L_0x00bc;
            case 1738281: goto L_0x00be;
            case 1738804: goto L_0x01a0;
            case 1739213: goto L_0x005c;
            case 1740215: goto L_0x00f7;
            case 1740799: goto L_0x00de;
            case 1740803: goto L_0x01d9;
            case 1742099: goto L_0x0225;
            case 1742712: goto L_0x0149;
            case 1746439: goto L_0x02ae;
            case 1746559: goto L_0x00bd;
            case 1746572: goto L_0x009f;
            case 1746931: goto L_0x008e;
            case 1746969: goto L_0x0114;
            case 1747641: goto L_0x01e8;
            case 1747710: goto L_0x0182;
            case 1747753: goto L_0x014a;
            case 1749329: goto L_0x0232;
            case 1749582: goto L_0x028d;
            case 1749613: goto L_0x00a6;
            case 1749970: goto L_0x0218;
            case 1751670: goto L_0x007e;
            case 1752552: goto L_0x00ae;
            case 1752735: goto L_0x00af;
            case 1752822: goto L_0x01f7;
            case 1752847: goto L_0x0095;
            case 1754406: goto L_0x006c;
            case 1755051: goto L_0x0269;
            case 1755434: goto L_0x012c;
            case 1755701: goto L_0x0162;
            case 1758040: goto L_0x01b9;
            case 1759455: goto L_0x0113;
            default: goto L_0x0049;
        };
    L_0x0049:
        r25 = r0;
        r26 = r1;
        r1 = r23;
        r0 = r18 + r19;
        r23 = 37148; // 0x911c float:5.2055E-41 double:1.83536E-319;
        r27 = s.ۢ۫ۗ.m342();
        if (r27 != 0) goto L_0x0256;
    L_0x005a:
        goto L_0x0253;
    L_0x005c:
        r25 = s.ۡۘۗ.f2;
        if (r25 != 0) goto L_0x0064;
    L_0x0060:
        r25 = r0;
        goto L_0x0170;
    L_0x0064:
        r25 = r0;
    L_0x0066:
        r26 = r1;
        r1 = r23;
        goto L_0x0253;
    L_0x006c:
        s.ۗۜ۟.m469();
        r25 = s.ۙۜۦ.m520();
        if (r25 != 0) goto L_0x0076;
    L_0x0075:
        goto L_0x0060;
    L_0x0076:
        r25 = r0;
    L_0x0078:
        r26 = r1;
        r1 = r23;
        goto L_0x029b;
    L_0x007e:
        r25 = s.ۨۗۥ.f42;
        if (r25 > 0) goto L_0x0086;
    L_0x0082:
        r25 = r0;
        goto L_0x01a8;
    L_0x0086:
        r25 = r0;
        r26 = r1;
        r1 = r23;
        goto L_0x02bc;
    L_0x008e:
        r25 = s.ۗ۬۟.m257();
        if (r25 > 0) goto L_0x0060;
    L_0x0094:
        goto L_0x009c;
    L_0x0095:
        r25 = s.۟ۧۢ.m774();
        if (r25 == 0) goto L_0x009c;
    L_0x009b:
        goto L_0x0082;
    L_0x009c:
        r25 = "۟ۛۨ";
        goto L_0x00d8;
    L_0x009f:
        s.۠ۡۧ.m431();
        s.۠ۡۧ.m431();
        goto L_0x0082;
    L_0x00a6:
        s.ۗۜۛ.m698();
        s.۟ۧۢ.m774();
        r0 = 0;
        return r0;
    L_0x00ae:
        return r2;
    L_0x00af:
        r25 = com.junge.algorithmAidePro.Utils.Tools.isModuleActive();
        if (r25 == 0) goto L_0x00d6;
    L_0x00b5:
        r25 = "ۥۢۥ";
        r25 = s.ۜۘۡ.m282(r25);
        goto L_0x0046;
    L_0x00bc:
        return r6;
    L_0x00bd:
        return r2;
    L_0x00be:
        r6 = s.ۚۡۢ.m115(r13, r0, r1, r14);
        r6 = s.ۡۘۗ.m39(r5, r6);
        r25 = 0;
        if (r6 == 0) goto L_0x00d5;
    L_0x00ca:
        r6 = "ۥۨۢ";
        r6 = s.ۢ۫ۗ.m350(r6);
        r25 = r6;
        r6 = 0;
        goto L_0x0046;
    L_0x00d5:
        r6 = 0;
    L_0x00d6:
        r25 = "ۖ۠ۛ";
    L_0x00d8:
        r25 = s.ۢ۫ۗ.m350(r25);
        goto L_0x0046;
    L_0x00de:
        r25 = 4;
        r26 = s.ۗۢۢ.f29;
        if (r26 < 0) goto L_0x00ec;
    L_0x00e4:
        r25 = r0;
        r26 = r1;
        r1 = r23;
        goto L_0x0278;
    L_0x00ec:
        r1 = "ۖۧۚ";
        r1 = s.ۜۘۡ.m282(r1);
        r25 = r1;
        r1 = 4;
        goto L_0x0046;
    L_0x00f7:
        r25 = xposedTypeImpl;
        r26 = f83;
        r27 = 71;
        r28 = s.ۨۗۥ.f42;
        if (r28 > 0) goto L_0x0103;
    L_0x0101:
        goto L_0x0060;
    L_0x0103:
        r0 = "ۙۛۡ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r5 = r25;
        r13 = r26;
        r25 = r0;
        r0 = 71;
        goto L_0x0046;
    L_0x0113:
        return r2;
    L_0x0114:
        r25 = r0;
        r0 = 2;
        r0 = s.۠ۡ۟.m139(r12, r9, r0, r14);
        r0 = s.ۡۘۗ.m39(r4, r0);
        if (r0 == 0) goto L_0x0124;
    L_0x0121:
        r0 = "۟ۛۛ";
        goto L_0x015c;
    L_0x0124:
        r0 = "ۘۧۦ";
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x024b;
    L_0x012c:
        r25 = r0;
        r0 = xposedTypeImpl;
        r26 = f83;
        r27 = 69;
        r28 = s.ۥۥۚ.f50;
        if (r28 == 0) goto L_0x013a;
    L_0x0138:
        goto L_0x0078;
    L_0x013a:
        r4 = "۟ۨۢ";
        r4 = s.ۜۘۡ.m282(r4);
        r12 = r26;
        r9 = 69;
        r29 = r4;
        r4 = r0;
        goto L_0x02d0;
    L_0x0149:
        return r2;
    L_0x014a:
        r25 = r0;
        r0 = 3;
        r0 = s.ۥۥۚ.m621(r10, r11, r0, r14);
        r0 = s.ۡۘۗ.m39(r3, r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0157:
        r0 = "۬ۨۛ";
        goto L_0x015c;
    L_0x015a:
        r0 = "ۨۢۤ";
    L_0x015c:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x024b;
    L_0x0162:
        r25 = r0;
        r0 = xposedTypeImpl;
        r26 = f83;
        r27 = 66;
        r28 = s.ۚ۟ۢ.m85();
        if (r28 == 0) goto L_0x0173;
    L_0x0170:
        r0 = "ۥ۬ۖ";
        goto L_0x015c;
    L_0x0173:
        r3 = "۠ۢ۫";
        r3 = s.ۜۘۡ.m282(r3);
        r10 = r26;
        r11 = 66;
        r29 = r3;
        r3 = r0;
        goto L_0x02d0;
    L_0x0182:
        r25 = r0;
        r0 = s.۠ۜۗ.m221(r15, r7, r8, r14);
        r2 = r24;
        r0 = s.ۡۢۡ.m60(r2, r0);
        r24 = 1;
        if (r0 == 0) goto L_0x0195;
    L_0x0192:
        r0 = "ۛۛۘ";
        goto L_0x0197;
    L_0x0195:
        r0 = "ۨ۫ۘ";
    L_0x0197:
        r0 = s.ۢ۫ۗ.m350(r0);
        r24 = r2;
        r2 = 1;
        goto L_0x024b;
    L_0x01a0:
        r25 = r0;
        r0 = 8;
        r26 = s.ۢ۫ۗ.f21;
        if (r26 == 0) goto L_0x01ab;
    L_0x01a8:
        r0 = "ۢ۠۫";
        goto L_0x015c;
    L_0x01ab:
        r8 = "۠ۡ۟";
        r8 = s.ۢ۫ۗ.m350(r8);
        r0 = r25;
        r25 = r8;
        r8 = 8;
        goto L_0x0046;
    L_0x01b9:
        r25 = r0;
        r0 = xposedTypeImpl;
        r26 = f83;
        r27 = 58;
        r28 = s.ۨۧۚ.f56;
        if (r28 != 0) goto L_0x01c7;
    L_0x01c5:
        goto L_0x0066;
    L_0x01c7:
        r7 = "ۗۙۖ";
        r7 = s.ۜۘۡ.m282(r7);
        r24 = r0;
        r0 = r25;
        r15 = r26;
        r25 = r7;
        r7 = 58;
        goto L_0x0046;
    L_0x01d9:
        r25 = r0;
        r0 = "";
        r26 = r1;
        r1 = r23;
        r0 = s.ۡۢۡ.m60(r1, r0);
        if (r0 == 0) goto L_0x01f4;
    L_0x01e7:
        goto L_0x0211;
    L_0x01e8:
        r25 = r0;
        r26 = r1;
        r1 = r23;
        r0 = s.ۗۜۛ.m689();
        xposedTypeImpl = r0;
    L_0x01f4:
        r0 = "۫ۙۦ";
        goto L_0x0243;
    L_0x01f7:
        r25 = r0;
        r26 = r1;
        r1 = r23;
        r0 = xposedTypeImpl;
        if (r0 == 0) goto L_0x0211;
    L_0x0201:
        r1 = "ۙۛۥ";
        r1 = s.ۜۘۡ.m282(r1);
        r23 = r0;
        r0 = r25;
        r25 = r1;
        r1 = r26;
        goto L_0x0046;
    L_0x0211:
        r0 = "۠۟ۘ";
    L_0x0213:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x0247;
    L_0x0218:
        r25 = r0;
        r26 = r1;
        r1 = r23;
        r0 = 58017; // 0xe2a1 float:8.1299E-41 double:2.8664E-319;
        r14 = 58017; // 0xe2a1 float:8.1299E-41 double:2.8664E-319;
        goto L_0x022f;
    L_0x0225:
        r25 = r0;
        r26 = r1;
        r1 = r23;
        r0 = 11385; // 0x2c79 float:1.5954E-41 double:5.625E-320;
        r14 = 11385; // 0x2c79 float:1.5954E-41 double:5.625E-320;
    L_0x022f:
        r0 = "ۥ۫ۜ";
        goto L_0x0243;
    L_0x0232:
        r25 = r0;
        r26 = r1;
        r1 = r23;
        r0 = r21 * r22;
        r0 = r0 - r20;
        if (r0 <= 0) goto L_0x0241;
    L_0x023e:
        r0 = "ۢ۬ۜ";
        goto L_0x0243;
    L_0x0241:
        r0 = "ۚۦ۟";
    L_0x0243:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x0247:
        r23 = r1;
        r1 = r26;
    L_0x024b:
        r29 = r25;
        r25 = r0;
        r0 = r29;
        goto L_0x0046;
    L_0x0253:
        r0 = "ۧ۠۟";
        goto L_0x0213;
    L_0x0256:
        r20 = "ۢۗۦ";
        r20 = s.ۜۘۡ.m282(r20);
        r23 = r1;
        r1 = r26;
        r22 = 37148; // 0x911c float:5.2055E-41 double:1.83536E-319;
        r29 = r20;
        r20 = r0;
        goto L_0x02d0;
    L_0x0269:
        r25 = r0;
        r26 = r1;
        r1 = r23;
        r0 = r21 * r21;
        r23 = 344993476; // 0x14902ec4 float:1.455873E-26 double:1.704494245E-315;
        r27 = s.۠ۡ۟.f8;
        if (r27 > 0) goto L_0x027b;
    L_0x0278:
        r0 = "ۗۦۜ";
        goto L_0x0213;
    L_0x027b:
        r18 = "ۤۡ۠";
        r18 = s.ۜۘۡ.m282(r18);
        r23 = r1;
        r1 = r26;
        r19 = 344993476; // 0x14902ec4 float:1.455873E-26 double:1.704494245E-315;
        r29 = r18;
        r18 = r0;
        goto L_0x02d0;
    L_0x028d:
        r25 = r0;
        r26 = r1;
        r1 = r23;
        r0 = r16[r17];
        r23 = s.ۖۙۜ.m589();
        if (r23 > 0) goto L_0x029f;
    L_0x029b:
        r0 = "ۤۥۗ";
        goto L_0x0213;
    L_0x029f:
        r21 = "ۨۖۙ";
        r21 = s.ۜۘۡ.m282(r21);
        r23 = r1;
        r1 = r26;
        r29 = r21;
        r21 = r0;
        goto L_0x02d0;
    L_0x02ae:
        r25 = r0;
        r26 = r1;
        r1 = r23;
        r0 = f83;
        r23 = 57;
        r27 = s.ۦۡۤ.f25;
        if (r27 == 0) goto L_0x02c0;
    L_0x02bc:
        r0 = "۟ۧۛ";
        goto L_0x0213;
    L_0x02c0:
        r16 = "ۢ۟۫";
        r16 = s.ۜۘۡ.m282(r16);
        r23 = r1;
        r1 = r26;
        r17 = 57;
        r29 = r16;
        r16 = r0;
    L_0x02d0:
        r0 = r25;
        r25 = r29;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.isFrame():boolean");
    }

    public static boolean isGrant(Context context) {
        return isGrant(۬۟ۜ.m355(context).getPersistedUriPermissions());
    }

    /* DevToolsApp WARNING: Missing block: B:17:0x003a, code:
            r3 = "ۢۤ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:31:0x006a, code:
            r3 = "ۚ۬ۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x0095, code:
            r3 = "ۙۧۧ";
     */
    public static boolean isSystemApp() {
        /*
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = "۟ۢۜ";
    L_0x0005:
        r3 = s.ۢ۫ۗ.m350(r3);
    L_0x0009:
        switch(r3) {
            case 1739242: goto L_0x0084;
            case 1739832: goto L_0x007a;
            case 1741169: goto L_0x005c;
            case 1741177: goto L_0x001c;
            case 1742131: goto L_0x0032;
            case 1742288: goto L_0x0029;
            case 1743038: goto L_0x0013;
            case 1743563: goto L_0x00a1;
            case 1746478: goto L_0x0034;
            case 1746746: goto L_0x0066;
            case 1746777: goto L_0x00aa;
            case 1746967: goto L_0x0070;
            case 1749737: goto L_0x0031;
            case 1751391: goto L_0x0041;
            case 1752337: goto L_0x008f;
            case 1758007: goto L_0x0024;
            case 1758468: goto L_0x0054;
            default: goto L_0x000c;
        };
    L_0x000c:
        s.ۗۜۛ.m698();
        s.۫۫ۗ.m790();
        goto L_0x006a;
    L_0x0013:
        s.۠ۡ۟.m140();
        r3 = s.ۚۤۙ.f18;
        if (r3 <= 0) goto L_0x0095;
    L_0x001a:
        goto L_0x00b6;
    L_0x001c:
        s.۬ۨۨ.m730();
        r3 = s.ۗ۬ۦ.f27;
        if (r3 != 0) goto L_0x00b6;
    L_0x0023:
        goto L_0x006a;
    L_0x0024:
        r3 = s.ۗۜۛ.f55;
        if (r3 != 0) goto L_0x0088;
    L_0x0028:
        goto L_0x006a;
    L_0x0029:
        s.۫۫ۗ.m790();
        s.۬ۗ۫.m98();
        r0 = 0;
        return r0;
    L_0x0031:
        return r2;
    L_0x0032:
        r2 = 0;
        goto L_0x003a;
    L_0x0034:
        r3 = 1;
        r4 = r1 & 1;
        if (r4 <= 0) goto L_0x003e;
    L_0x0039:
        r2 = 1;
    L_0x003a:
        r3 = "ۢۤ۫";
        goto L_0x009b;
    L_0x003e:
        r3 = "ۚۧ۠";
        goto L_0x0005;
    L_0x0041:
        r3 = r0.flags;
        r4 = s.ۖۜ۟.f34;
        if (r4 < 0) goto L_0x004a;
    L_0x0047:
        r3 = "ۛۥۨ";
        goto L_0x009b;
    L_0x004a:
        r1 = "۟ۘۧ";
        r1 = s.ۜۘۡ.m282(r1);
        r5 = r3;
        r3 = r1;
        r1 = r5;
        goto L_0x0009;
    L_0x0054:
        r3 = s.ۦۡۤ.f25;
        if (r3 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x006a;
    L_0x0059:
        r3 = "ۤۜۗ";
        goto L_0x0005;
    L_0x005c:
        r3 = s.ۨۗۥ.m536();
        if (r3 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x00b6;
    L_0x0063:
        r3 = "۫ۧ۠";
        goto L_0x009b;
    L_0x0066:
        r3 = s.ۡۘۗ.f2;
        if (r3 == 0) goto L_0x006d;
    L_0x006a:
        r3 = "ۚ۬ۢ";
        goto L_0x0005;
    L_0x006d:
        r3 = "ۙۧ۟";
        goto L_0x009b;
    L_0x0070:
        r3 = s.۠ۜۗ.m214();
        if (r3 > 0) goto L_0x0077;
    L_0x0076:
        goto L_0x00b6;
    L_0x0077:
        r3 = "۟ۡۜ";
        goto L_0x009b;
    L_0x007a:
        r3 = s.۬ۨۨ.m730();
        if (r3 == 0) goto L_0x0081;
    L_0x0080:
        goto L_0x0088;
    L_0x0081:
        r3 = "۟ۨ۠";
        goto L_0x009b;
    L_0x0084:
        r3 = s.۫ۢ۠.f14;
        if (r3 > 0) goto L_0x008b;
    L_0x0088:
        r3 = "ۡۥۘ";
        goto L_0x009b;
    L_0x008b:
        r3 = "ۘۛۛ";
        goto L_0x0005;
    L_0x008f:
        r3 = s.۟ۧۢ.m774();
        if (r3 == 0) goto L_0x0099;
    L_0x0095:
        r3 = "ۙۧۧ";
        goto L_0x0005;
    L_0x0099:
        r3 = "ۗۧۚ";
    L_0x009b:
        r3 = s.ۜۘۡ.m282(r3);
        goto L_0x0009;
    L_0x00a1:
        r3 = s.ۨۧۚ.f56;
        if (r3 != 0) goto L_0x00a6;
    L_0x00a5:
        goto L_0x00b6;
    L_0x00a6:
        r3 = "ۥۛۧ";
        goto L_0x0005;
    L_0x00aa:
        r3 = myApplication;
        r3 = r3.getApplicationInfo();
        r4 = s.ۤۗۛ.m370();
        if (r4 < 0) goto L_0x00b9;
    L_0x00b6:
        r3 = "۫ۘۤ";
        goto L_0x009b;
    L_0x00b9:
        r0 = "ۜۗۦ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r5 = r3;
        r3 = r0;
        r0 = r5;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.isSystemApp():boolean");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x001f, code:
            r11 = r15;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x0029, code:
            if (s.ۗ۬۟.m257() > 0) goto L_0x002b;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x002b, code:
            r11 = r15;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x0032, code:
            if (s.ۛۨۦ.m559() == false) goto L_0x0034;
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x0034, code:
            r11 = r15;
     */
    /* DevToolsApp WARNING: Missing block: B:30:0x00a7, code:
            r12 = "ۙۙۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:40:0x00dd, code:
            r12 = "۫ۤۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:44:0x00f5, code:
            r12 = "ۛۢۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x010a, code:
            r12 = "ۛۢ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x011e, code:
            r12 = "ۛۚۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x0123, code:
            r12 = s.ۜۘۡ.m282(r12);
     */
    /* DevToolsApp WARNING: Missing block: B:57:0x012f, code:
            r12 = "ۗۘ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:59:0x0134, code:
            r12 = s.ۢ۫ۗ.m350(r12);
     */
    /* DevToolsApp WARNING: Missing block: B:60:0x0138, code:
            r11 = r12;
     */
    public static /* synthetic */ void lambda$onCreate$0(com.junge.algorithmAidePro.MyApplication.ExceptionHandler r15, java.lang.Thread r16, java.lang.Throwable r17) {
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
        r11 = "ۢۧۙ";
        r11 = s.ۜۘۡ.m282(r11);
    L_0x0011:
        switch(r11) {
            case 1738123: goto L_0x00d1;
            case 1740741: goto L_0x007b;
            case 1740975: goto L_0x0062;
            case 1742684: goto L_0x002e;
            case 1742927: goto L_0x001b;
            case 1742928: goto L_0x0103;
            case 1742937: goto L_0x0037;
            case 1743583: goto L_0x0049;
            case 1743612: goto L_0x00ab;
            case 1747072: goto L_0x00bb;
            case 1749812: goto L_0x0128;
            case 1752682: goto L_0x00a4;
            case 1754464: goto L_0x009f;
            case 1757984: goto L_0x0117;
            case 1758077: goto L_0x003e;
            case 1758376: goto L_0x0025;
            case 1759048: goto L_0x00ea;
            default: goto L_0x0014;
        };
    L_0x0014:
        s.ۨۗۥ.m536();
        s.ۦۡۤ.m396();
        return;
    L_0x001b:
        r11 = s.ۛۨۦ.f46;
        if (r11 != 0) goto L_0x0022;
    L_0x001f:
        r11 = r15;
        goto L_0x011e;
    L_0x0022:
        r11 = r15;
        goto L_0x00dd;
    L_0x0025:
        r11 = s.ۗ۬۟.m257();
        if (r11 <= 0) goto L_0x001f;
    L_0x002b:
        r11 = r15;
        goto L_0x010a;
    L_0x002e:
        r11 = s.ۛۨۦ.m559();
        if (r11 != 0) goto L_0x002b;
    L_0x0034:
        r11 = r15;
        goto L_0x012f;
    L_0x0037:
        s.۬ۗ۫.m98();
        s.ۚ۟ۢ.m85();
        goto L_0x0034;
    L_0x003e:
        s.ۦۢۜ.m29(r1, r3, r2);
        s.ۚ۟ۢ.m83(r0, r1);
        r11 = r15;
        r15.sendMessage(r0);
        return;
    L_0x0049:
        r11 = r15;
        r12 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r13 = 4;
        r12 = s.۟ۤۗ.m330(r10, r12, r13, r9);
        r13 = s.ۦۢۜ.m16();
        if (r13 == 0) goto L_0x0059;
    L_0x0057:
        goto L_0x012f;
    L_0x0059:
        r3 = "۫ۚ۬";
        r3 = s.ۢ۫ۗ.m350(r3);
        r11 = r3;
        r3 = r12;
        goto L_0x0011;
    L_0x0062:
        r11 = r15;
        r12 = s.ۥۘۧ.m669(r17);
        r13 = f83;
        r14 = s.۫۫ۗ.m790();
        if (r14 != 0) goto L_0x0071;
    L_0x006f:
        goto L_0x00f5;
    L_0x0071:
        r2 = "ۜۘۛ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r11 = r2;
        r2 = r12;
        r10 = r13;
        goto L_0x0011;
    L_0x007b:
        r11 = r15;
        s.ۗ۬۟.m271(r17);
        r12 = r15.obtainMessage();
        r13 = new android.os.Bundle;
        r14 = s.۠ۡ۟.f8;
        if (r14 > 0) goto L_0x008b;
    L_0x0089:
        goto L_0x00f5;
    L_0x008b:
        r13.<init>();
        r14 = s.ۚۤۙ.f18;
        if (r14 > 0) goto L_0x0094;
    L_0x0092:
        goto L_0x00f5;
    L_0x0094:
        r0 = "ۙۡۗ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r11 = r0;
        r0 = r12;
        r1 = r13;
        goto L_0x0011;
    L_0x009f:
        r11 = r15;
        r9 = 38772; // 0x9774 float:5.4331E-41 double:1.9156E-319;
        goto L_0x00a7;
    L_0x00a4:
        r11 = r15;
        r9 = 9517; // 0x252d float:1.3336E-41 double:4.702E-320;
    L_0x00a7:
        r12 = "ۙۙۥ";
        goto L_0x0123;
    L_0x00ab:
        r11 = r15;
        r12 = r5 + r8;
        r12 = r12 * r12;
        r12 = r12 - r7;
        if (r12 <= 0) goto L_0x00b7;
    L_0x00b3:
        r12 = "ۧۢۛ";
        goto L_0x0134;
    L_0x00b7:
        r12 = "ۥۦ۫";
        goto L_0x0134;
    L_0x00bb:
        r11 = r15;
        r12 = 5391; // 0x150f float:7.554E-42 double:2.6635E-320;
        r13 = s.ۛ۫ۧ.m593();
        if (r13 > 0) goto L_0x00c6;
    L_0x00c4:
        goto L_0x012f;
    L_0x00c6:
        r8 = "ۜۙۙ";
        r8 = s.ۢ۫ۗ.m350(r8);
        r11 = r8;
        r8 = 5391; // 0x150f float:7.554E-42 double:2.6635E-320;
        goto L_0x0011;
    L_0x00d1:
        r11 = r15;
        r12 = 29062881; // 0x1bb76e1 float:6.8863534E-38 double:1.4358971E-316;
        r12 = r12 + r6;
        r12 = r12 + r12;
        r13 = s.۟ۥۙ.m650();
        if (r13 > 0) goto L_0x00e0;
    L_0x00dd:
        r12 = "۫ۤۡ";
        goto L_0x0123;
    L_0x00e0:
        r7 = "۟۫۬";
        r7 = s.ۜۘۡ.m282(r7);
        r11 = r7;
        r7 = r12;
        goto L_0x0011;
    L_0x00ea:
        r11 = r15;
        r12 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r12 = r4[r12];
        r13 = r12 * r12;
        r14 = s.۫۫ۗ.f65;
        if (r14 == 0) goto L_0x00f8;
    L_0x00f5:
        r12 = "ۛۢۖ";
        goto L_0x0134;
    L_0x00f8:
        r5 = "ۖۢۗ";
        r5 = s.ۢ۫ۗ.m350(r5);
        r11 = r5;
        r5 = r12;
        r6 = r13;
        goto L_0x0011;
    L_0x0103:
        r11 = r15;
        r12 = f83;
        r13 = s.ۗۜۛ.f55;
        if (r13 == 0) goto L_0x010d;
    L_0x010a:
        r12 = "ۛۢ۠";
        goto L_0x0123;
    L_0x010d:
        r4 = "۬ۛۗ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r11 = r4;
        r4 = r12;
        goto L_0x0011;
    L_0x0117:
        r11 = r15;
        r12 = s.ۗۢۢ.m454();
        if (r12 < 0) goto L_0x0121;
    L_0x011e:
        r12 = "ۛۚۛ";
        goto L_0x0134;
    L_0x0121:
        r12 = "ۛۢۗ";
    L_0x0123:
        r12 = s.ۜۘۡ.m282(r12);
        goto L_0x0138;
    L_0x0128:
        r11 = r15;
        r12 = s.۫ۢ۠.m237();
        if (r12 < 0) goto L_0x0132;
    L_0x012f:
        r12 = "ۗۘ۫";
        goto L_0x0134;
    L_0x0132:
        r12 = "۫ۗ۬";
    L_0x0134:
        r12 = s.ۢ۫ۗ.m350(r12);
    L_0x0138:
        r11 = r12;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.lambda$onCreate$0(com.junge.algorithmAidePro.MyApplication$ExceptionHandler, java.lang.Thread, java.lang.Throwable):void");
    }

    public static void setMyApplication(MyApplication myApplication) {
        myApplication = myApplication;
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0010, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0023, code:
            if (s.ۙۜۦ.m520() == 0) goto L_0x009f;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x0027, code:
            r1 = "ۥۢۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x0031, code:
            if (s.ۘۡۜ.m682() >= 0) goto L_0x00b0;
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x0075, code:
            r1 = "ۘ۠ۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:46:0x009f, code:
            r1 = "ۗۧۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:50:0x00b0, code:
            r1 = "۫ۦ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x00c2, code:
            r1 = "ۦ۬ۡ";
     */
    public com.junge.algorithmAidePro.bean.AppData getAppData() {
        /*
        r4 = this;
        r0 = 0;
        r1 = "ۦۗۗ";
    L_0x0003:
        r1 = s.ۢ۫ۗ.m350(r1);
    L_0x0007:
        switch(r1) {
            case 1737923: goto L_0x0071;
            case 1739223: goto L_0x0067;
            case 1739240: goto L_0x0035;
            case 1739365: goto L_0x0045;
            case 1740000: goto L_0x001c;
            case 1742102: goto L_0x005d;
            case 1746777: goto L_0x0015;
            case 1746943: goto L_0x0085;
            case 1748497: goto L_0x00a7;
            case 1752537: goto L_0x002a;
            case 1753322: goto L_0x008e;
            case 1753819: goto L_0x00bf;
            case 1754108: goto L_0x0099;
            case 1754471: goto L_0x0053;
            case 1755128: goto L_0x007b;
            case 1758436: goto L_0x003d;
            case 1758934: goto L_0x0049;
            default: goto L_0x000a;
        };
    L_0x000a:
        r1 = appData;
        if (r1 != 0) goto L_0x00c2;
    L_0x000e:
        r1 = "ۡۛ۫";
    L_0x0010:
        r1 = s.ۜۘۡ.m282(r1);
        goto L_0x0007;
    L_0x0015:
        r1 = s.ۡۗۗ.m159();
        if (r1 == 0) goto L_0x0075;
    L_0x001b:
        goto L_0x0027;
    L_0x001c:
        s.ۢ۫ۗ.m342();
        r1 = s.ۙۜۦ.m520();
        if (r1 != 0) goto L_0x0027;
    L_0x0025:
        goto L_0x009f;
    L_0x0027:
        r1 = "ۥۢۖ";
        goto L_0x0010;
    L_0x002a:
        s.ۗۢۢ.m454();
        r1 = s.ۘۡۜ.m682();
        if (r1 < 0) goto L_0x009f;
    L_0x0033:
        goto L_0x00b0;
    L_0x0035:
        s.ۤۗۛ.m370();
        s.ۗۤ۫.m195();
        goto L_0x00b0;
    L_0x003d:
        s.ۜۖۚ.m7();
        s.ۦۢۜ.m16();
        r0 = 0;
        return r0;
    L_0x0045:
        appData = r0;
        goto L_0x00c2;
    L_0x0049:
        r1 = s.ۡۢۡ.m58();
        if (r1 == 0) goto L_0x0050;
    L_0x004f:
        goto L_0x007f;
    L_0x0050:
        r1 = "ۗ۫ۙ";
        goto L_0x0010;
    L_0x0053:
        r1 = s.ۡۗۗ.m159();
        if (r1 == 0) goto L_0x005a;
    L_0x0059:
        goto L_0x00b0;
    L_0x005a:
        r1 = "۬ۗۡ";
        goto L_0x0010;
    L_0x005d:
        r1 = s.ۘۡۜ.m682();
        if (r1 < 0) goto L_0x0064;
    L_0x0063:
        goto L_0x007f;
    L_0x0064:
        r1 = "ۧۢۢ";
        goto L_0x0003;
    L_0x0067:
        r1 = s.ۢۜۘ.m255();
        if (r1 > 0) goto L_0x006e;
    L_0x006d:
        goto L_0x009f;
    L_0x006e:
        r1 = "ۚۦۢ";
        goto L_0x0003;
    L_0x0071:
        r1 = s.ۗ۠ۚ.f28;
        if (r1 == 0) goto L_0x0078;
    L_0x0075:
        r1 = "ۘ۠ۨ";
        goto L_0x0003;
    L_0x0078:
        r1 = "ۗۦۦ";
        goto L_0x0010;
    L_0x007b:
        r1 = s.۟ۥۙ.f52;
        if (r1 == 0) goto L_0x0082;
    L_0x007f:
        r1 = "۟ۢۜ";
        goto L_0x0003;
    L_0x0082:
        r1 = "ۖۛۨ";
        goto L_0x0010;
    L_0x0085:
        r1 = s.ۚۤۙ.f18;
        if (r1 > 0) goto L_0x008a;
    L_0x0089:
        goto L_0x009f;
    L_0x008a:
        r1 = "ۨۘۨ";
        goto L_0x0003;
    L_0x008e:
        r1 = s.ۘۡۜ.m682();
        if (r1 < 0) goto L_0x0095;
    L_0x0094:
        goto L_0x009f;
    L_0x0095:
        r1 = "۟ۧۧ";
        goto L_0x0010;
    L_0x0099:
        r1 = s.ۗۜۛ.m698();
        if (r1 > 0) goto L_0x00a3;
    L_0x009f:
        r1 = "ۗۧۘ";
        goto L_0x0010;
    L_0x00a3:
        r1 = "ۦۜ۠";
        goto L_0x0010;
    L_0x00a7:
        r1 = new com.junge.algorithmAidePro.bean.AppData;
        r1.<init>();
        r2 = s.۫ۢ۠.f14;
        if (r2 > 0) goto L_0x00b4;
    L_0x00b0:
        r1 = "۫ۦ۟";
        goto L_0x0010;
    L_0x00b4:
        r0 = "ۧۖ۫";
        r0 = s.ۜۘۡ.m282(r0);
        r3 = r1;
        r1 = r0;
        r0 = r3;
        goto L_0x0007;
    L_0x00bf:
        r0 = appData;
        return r0;
    L_0x00c2:
        r1 = "ۦ۬ۡ";
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.getAppData():com.junge.algorithmAidePro.bean.AppData");
    }

    public DbController getDbController() {
        return this.dbController;
    }

    /* DevToolsApp WARNING: Missing block: B:7:0x0022, code:
            if (s.ۢ۫ۜ.m625() < 0) goto L_0x012b;
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x003c, code:
            r12 = "ۨۘ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:37:0x00b7, code:
            r12 = "۠ۙۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:40:0x00c0, code:
            r12 = "۟ۖۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:44:0x00cb, code:
            r12 = s.ۜۘۡ.m282(r12);
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00dc, code:
            r12 = "۟ۗۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x0106, code:
            r12 = "۠۬ۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:62:0x012b, code:
            r12 = "ۦۚ۟";
     */
    public static boolean isGrant(java.util.List<android.content.UriPermission> r16) {
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
        r12 = "ۡۢۜ";
    L_0x000e:
        r12 = s.ۢ۫ۗ.m350(r12);
    L_0x0012:
        switch(r12) {
            case 1737876: goto L_0x006a;
            case 1737939: goto L_0x00ea;
            case 1739756: goto L_0x0115;
            case 1740178: goto L_0x007e;
            case 1740821: goto L_0x0132;
            case 1741625: goto L_0x0127;
            case 1741646: goto L_0x0056;
            case 1743034: goto L_0x0097;
            case 1743842: goto L_0x0047;
            case 1743860: goto L_0x00be;
            case 1746413: goto L_0x00b3;
            case 1746430: goto L_0x0026;
            case 1746751: goto L_0x00ae;
            case 1747904: goto L_0x00fe;
            case 1748056: goto L_0x001e;
            case 1748699: goto L_0x013d;
            case 1749354: goto L_0x0045;
            case 1751394: goto L_0x00c3;
            case 1751673: goto L_0x00ba;
            case 1753259: goto L_0x002f;
            case 1754784: goto L_0x0039;
            case 1755132: goto L_0x0040;
            case 1759390: goto L_0x00d4;
            default: goto L_0x0015;
        };
    L_0x0015:
        r12 = s.ۨۧۚ.m712(r0);
        if (r12 == 0) goto L_0x00b0;
    L_0x001b:
        r12 = "ۛۥۤ";
        goto L_0x000e;
    L_0x001e:
        r12 = s.ۢ۫ۜ.m625();
        if (r12 >= 0) goto L_0x00dc;
    L_0x0024:
        goto L_0x012b;
    L_0x0026:
        s.ۘۡۜ.m682();
        r12 = s.ۚ۟ۢ.f5;
        if (r12 != 0) goto L_0x012b;
    L_0x002d:
        goto L_0x0145;
    L_0x002f:
        s.ۦۡۤ.m396();
        r12 = s.ۖۜ۟.m492();
        if (r12 != 0) goto L_0x0145;
    L_0x0038:
        goto L_0x003c;
    L_0x0039:
        s.ۛ۫ۧ.m593();
    L_0x003c:
        r12 = "ۨۘ۬";
        goto L_0x00cb;
    L_0x0040:
        s.ۚ۟ۢ.m85();
        r0 = 0;
        return r0;
    L_0x0045:
        r0 = 1;
        return r0;
    L_0x0047:
        r12 = 77;
        r12 = s.۫۫ۗ.m797(r10, r11, r12, r9);
        r12 = s.ۡۢۡ.m60(r2, r12);
        if (r12 == 0) goto L_0x00b7;
    L_0x0053:
        r12 = "ۢۘ۠";
        goto L_0x000e;
    L_0x0056:
        r12 = 76;
        r13 = s.ۗ۠ۚ.m442();
        if (r13 > 0) goto L_0x0060;
    L_0x005e:
        goto L_0x012b;
    L_0x0060:
        r11 = "ۜ۠ۦ";
        r11 = s.ۜۘۡ.m282(r11);
        r12 = r11;
        r11 = 76;
        goto L_0x0012;
    L_0x006a:
        r12 = f83;
        r13 = s.۠ۜۗ.m214();
        if (r13 > 0) goto L_0x0074;
    L_0x0072:
        goto L_0x0106;
    L_0x0074:
        r10 = "ۚۗ۫";
        r10 = s.ۢ۫ۗ.m350(r10);
        r15 = r12;
        r12 = r10;
        r10 = r15;
        goto L_0x0012;
    L_0x007e:
        r12 = r1.getUri();
        r12 = s.ۥۘۧ.m668(r12);
        r13 = s.ۢ۟ۚ.f10;
        if (r13 == 0) goto L_0x008c;
    L_0x008a:
        goto L_0x012b;
    L_0x008c:
        r2 = "ۖۚۘ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r15 = r12;
        r12 = r2;
        r2 = r15;
        goto L_0x0012;
    L_0x0097:
        r12 = s.ۗۜۛ.m699(r0);
        r12 = (android.content.UriPermission) r12;
        r13 = r12.isReadPermission();
        if (r13 == 0) goto L_0x00b7;
    L_0x00a3:
        r1 = "ۘۦ۠";
        r1 = s.ۢ۫ۗ.m350(r1);
        r15 = r12;
        r12 = r1;
        r1 = r15;
        goto L_0x0012;
    L_0x00ae:
        r0 = 0;
        return r0;
    L_0x00b0:
        r12 = "۟ۡۡ";
        goto L_0x00cb;
    L_0x00b3:
        r0 = s.۟ۧۢ.m783(r16);
    L_0x00b7:
        r12 = "۠ۙۦ";
        goto L_0x00cb;
    L_0x00ba:
        r9 = 47527; // 0xb9a7 float:6.66E-41 double:2.34815E-319;
        goto L_0x00c0;
    L_0x00be:
        r9 = 32428; // 0x7eac float:4.5441E-41 double:1.60216E-319;
    L_0x00c0:
        r12 = "۟ۖۤ";
        goto L_0x00cb;
    L_0x00c3:
        r12 = r5 * r8;
        r12 = r7 - r12;
        if (r12 < 0) goto L_0x00d1;
    L_0x00c9:
        r12 = "ۜۡۙ";
    L_0x00cb:
        r12 = s.ۜۘۡ.m282(r12);
        goto L_0x0012;
    L_0x00d1:
        r12 = "ۤۥۚ";
        goto L_0x00cb;
    L_0x00d4:
        r12 = 13944; // 0x3678 float:1.954E-41 double:6.8893E-320;
        r13 = s.ۨۗۥ.m536();
        if (r13 == 0) goto L_0x00df;
    L_0x00dc:
        r12 = "۟ۗۖ";
        goto L_0x00cb;
    L_0x00df:
        r8 = "ۤۜۚ";
        r8 = s.ۢ۫ۗ.m350(r8);
        r12 = r8;
        r8 = 13944; // 0x3678 float:1.954E-41 double:6.8893E-320;
        goto L_0x0012;
    L_0x00ea:
        r12 = 48608784; // 0x2e5b610 float:3.3753025E-37 double:2.40159303E-316;
        r12 = r12 + r6;
        r13 = s.ۡۘۗ.f2;
        if (r13 == 0) goto L_0x00f3;
    L_0x00f2:
        goto L_0x012b;
    L_0x00f3:
        r7 = "۬ۦۘ";
        r7 = s.ۜۘۡ.m282(r7);
        r15 = r12;
        r12 = r7;
        r7 = r15;
        goto L_0x0012;
    L_0x00fe:
        r12 = r3[r4];
        r13 = r12 * r12;
        r14 = s.ۢۜۘ.f15;
        if (r14 == 0) goto L_0x0109;
    L_0x0106:
        r12 = "۠۬ۤ";
        goto L_0x00cb;
    L_0x0109:
        r5 = "ۖۜۙ";
        r5 = s.ۜۘۡ.m282(r5);
        r6 = r13;
        r15 = r12;
        r12 = r5;
        r5 = r15;
        goto L_0x0012;
    L_0x0115:
        r12 = 75;
        r13 = s.ۤۗۛ.f24;
        if (r13 == 0) goto L_0x011c;
    L_0x011b:
        goto L_0x012b;
    L_0x011c:
        r4 = "۠ۧۧ";
        r4 = s.ۜۘۡ.m282(r4);
        r12 = r4;
        r4 = 75;
        goto L_0x0012;
    L_0x0127:
        r12 = s.ۧۧۡ.f11;
        if (r12 != 0) goto L_0x012e;
    L_0x012b:
        r12 = "ۦۚ۟";
        goto L_0x00cb;
    L_0x012e:
        r12 = "ۘۘ۬";
        goto L_0x000e;
    L_0x0132:
        r12 = s.۬ۨۨ.m730();
        if (r12 == 0) goto L_0x0139;
    L_0x0138:
        goto L_0x0145;
    L_0x0139:
        r12 = "ۚۗۖ";
        goto L_0x000e;
    L_0x013d:
        r12 = f83;
        r13 = s.ۦۢۜ.m16();
        if (r13 == 0) goto L_0x0149;
    L_0x0145:
        r12 = "ۧ۬ۥ";
        goto L_0x000e;
    L_0x0149:
        r3 = "ۙۜۘ";
        r3 = s.ۜۘۡ.m282(r3);
        r15 = r12;
        r12 = r3;
        r3 = r15;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.isGrant(java.util.List):boolean");
    }

    /* DevToolsApp WARNING: Missing block: B:23:0x0086, code:
            r13 = "۟ۧۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:28:0x0098, code:
            r13 = "ۜۧۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x010e, code:
            r13 = "ۡۤۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x0128, code:
            r13 = "۬ۤۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:53:0x012a, code:
            r13 = s.ۜۘۡ.m282(r13);
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x0134, code:
            r13 = "ۦۙۜ";
     */
    static {
        /*
        r0 = 292; // 0x124 float:4.09E-43 double:1.443E-321;
        r0 = new short[r0];
        r0 = {5585, -10006, -10009, -10004, -10012, -9991, -10014, -9985, -10013, -10010, -10038, -10014, -10001, -10002, -10021, -9991, -10012, -10075, -10001, -10007, -10042, -9998, -10038, -9989, -9989, -10009, -10014, -10008, -10006, -9985, -10014, -10012, -10011, -10051, -10050, -10002, -10050, -10056, -10008, -10049, -10007, -10006, -10052, -10055, -10053, -10061, -10006, -10050, -10006, -10003, -10054, -10007, -10049, -10056, -10050, -10055, -10052, 8334, 11323, 11285, 11288, 11290, 11282, 11323, 11286, 11265, 11311, 11265, 11273, 25462, 21451, 19283, 23452, 17471, 19407, 2182, 32463, 32451, 32450, 32472, 32457, 32450, 32472, 32406, 32387, 32387, 32463, 32451, 32449, 32386, 32461, 32450, 32456, 32478, 32451, 32453, 32456, 32386, 32457, 32468, 32472, 32457, 32478, 32450, 32461, 32448, 32479, 32472, 32451, 32478, 32461, 32459, 32457, 32386, 32456, 32451, 32463, 32473, 32449, 32457, 32450, 32472, 32479, 32387, 32472, 32478, 32457, 32457, 32387, 32476, 32478, 32453, 32449, 32461, 32478, 32469, 32393, 32415, 32493, 32493, 32450, 32456, 32478, 32451, 32453, 32456, 32393, 32414, 32490, 32456, 32461, 32472, 32461, 8954, 9545, 9548, 9561, 9548, 5845, 25770, 25766, 25764, 25831, 25763, 25788, 25767, 25774, 25772, 25831, 25768, 25765, 25774, 25766, 25787, 25760, 25789, 25761, 25764, 25736, 25760, 25773, 25772, 25753, 25787, 25766, 5755, -19119, -19107, -19105, -19172, -19112, -19129, -19108, -19115, -19113, -19172, -19117, -19106, -19115, -19107, -19136, -19109, -19130, -19110, -19105, -19085, -19109, -19114, -19113, -19102, -19136, -19107, -19117, -19119, -19119, -19113, -19134, -19130, -19135, -19130, -19117, -19136, -19130, -19076, -19129, -19105, -11752, -9486, -10231, 2753, -31493, -31513, -31513, -31517, -31575, -31556, -31556, -31495, -31514, -31491, -31500, -31498, -31579, -31579, -31579, -31555, -31504, -31491, -31556, -31502, -31489, -31500, -31492, -31519, -31494, -31513, -31493, -31490, -31534, -31494, -31497, -31498, -31549, -31519, -31492, -31556, -31502, -31517, -31517, -31549, -31519, -31492, -31555, -31517, -31493, -31517, -31532, -31530, -31545, -31522, -31510, -31534, -31517, -31517, -31489, -31494, -31504, -31502, -31513, -31494, -31492, -31491};
        f83 = r0;
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
        r13 = "۬ۖۙ";
    L_0x0018:
        r13 = s.ۢ۫ۗ.m350(r13);
    L_0x001c:
        switch(r13) {
            case 1738411: goto L_0x0120;
            case 1739194: goto L_0x0108;
            case 1739802: goto L_0x00f8;
            case 1740797: goto L_0x00e1;
            case 1742157: goto L_0x00da;
            case 1742631: goto L_0x00c2;
            case 1743242: goto L_0x00b2;
            case 1744057: goto L_0x00aa;
            case 1746940: goto L_0x0092;
            case 1748767: goto L_0x0089;
            case 1752167: goto L_0x0083;
            case 1752245: goto L_0x0076;
            case 1752506: goto L_0x0072;
            case 1753225: goto L_0x0069;
            case 1755739: goto L_0x0053;
            case 1758073: goto L_0x004c;
            case 1758895: goto L_0x0036;
            case 1759330: goto L_0x002b;
            default: goto L_0x001f;
        };
    L_0x001f:
        DB_NAME = r0;
        r13 = f83;
        r14 = s.ۙۖۥ.m748();
        if (r14 > 0) goto L_0x0138;
    L_0x0029:
        goto L_0x0134;
    L_0x002b:
        s.ۗ۬ۦ.m407();
        r13 = s.ۦۢۜ.m16();
        if (r13 != 0) goto L_0x0101;
    L_0x0034:
        goto L_0x010e;
    L_0x0036:
        r13 = f83;
        r14 = 0;
        r13 = r13[r14];
        r14 = s.ۥۥۚ.m614();
        if (r14 > 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0098;
    L_0x0042:
        r2 = "ۙۛ۟";
        r2 = s.ۢ۫ۗ.m350(r2);
        r15 = r13;
        r13 = r2;
        r2 = r15;
        goto L_0x001c;
    L_0x004c:
        r0 = s.۠ۡ۟.m139(r10, r11, r12, r5);
        umengKey = r0;
        return;
    L_0x0053:
        r13 = s.ۦۢۜ.m28(r6, r7, r8, r5);
        r14 = s.۠ۡ۟.m140();
        if (r14 > 0) goto L_0x005f;
    L_0x005d:
        goto L_0x0128;
    L_0x005f:
        r0 = "ۛۢ۟";
        r0 = s.ۜۘۡ.m282(r0);
        r15 = r13;
        r13 = r0;
        r0 = r15;
        goto L_0x001c;
    L_0x0069:
        s.ۖۙۜ.m589();
        r0 = new java.lang.RuntimeException;
        r0.<init>();
        throw r0;
    L_0x0072:
        r5 = 55435; // 0xd88b float:7.7681E-41 double:2.73885E-319;
        goto L_0x0086;
    L_0x0076:
        r13 = r3 + r4;
        r14 = r2 * 13680;
        r13 = r13 - r14;
        if (r13 < 0) goto L_0x0080;
    L_0x007d:
        r13 = "ۥۡۖ";
        goto L_0x0018;
    L_0x0080:
        r13 = "ۥۖۘ";
        goto L_0x0018;
    L_0x0083:
        r5 = 40170; // 0x9cea float:5.629E-41 double:1.98466E-319;
    L_0x0086:
        r13 = "۟ۧۤ";
        goto L_0x0018;
    L_0x0089:
        s.ۢ۫ۜ.m625();
        r13 = s.ۨۘۢ.f19;
        if (r13 == 0) goto L_0x0098;
    L_0x0090:
        goto L_0x0134;
    L_0x0092:
        r13 = f83;
        r14 = s.ۛۨۦ.f46;
        if (r14 == 0) goto L_0x009c;
    L_0x0098:
        r13 = "ۜۧۤ";
        goto L_0x012a;
    L_0x009c:
        r6 = "ۨ۬۟";
        r6 = s.ۜۘۡ.m282(r6);
        r7 = 1;
        r8 = 19;
        r15 = r13;
        r13 = r6;
        r6 = r15;
        goto L_0x001c;
    L_0x00aa:
        s.ۥۘۧ.m662();
        s.۬۟ۜ.m366();
        goto L_0x0134;
    L_0x00b2:
        r13 = new com.junge.algorithmAidePro.bean.AppData;
        r13.<init>();
        appData = r13;
        r13 = s.ۡۘۗ.f2;
        if (r13 == 0) goto L_0x00be;
    L_0x00bd:
        goto L_0x010e;
    L_0x00be:
        r13 = "ۘۚۜ";
        goto L_0x0018;
    L_0x00c2:
        r13 = 20;
        r14 = 13;
        r13 = s.ۡۥۗ.m567(r9, r13, r14, r5);
        r14 = s.ۚ۟ۢ.f5;
        if (r14 != 0) goto L_0x00cf;
    L_0x00ce:
        goto L_0x0128;
    L_0x00cf:
        r1 = "ۖ۫۠";
        r1 = s.ۜۘۡ.m282(r1);
        r15 = r13;
        r13 = r1;
        r1 = r15;
        goto L_0x001c;
    L_0x00da:
        r13 = s.ۨۗۥ.m536();
        if (r13 != 0) goto L_0x010e;
    L_0x00e0:
        goto L_0x0134;
    L_0x00e1:
        r13 = r2 * r2;
        r14 = s.ۧۧۡ.m183();
        if (r14 > 0) goto L_0x00ea;
    L_0x00e9:
        goto L_0x0101;
    L_0x00ea:
        r3 = "ۥۘۨ";
        r3 = s.ۜۘۡ.m282(r3);
        r4 = 46785600; // 0x2c9e440 float:2.9665305E-37 double:2.31151577E-316;
        r15 = r13;
        r13 = r3;
        r3 = r15;
        goto L_0x001c;
    L_0x00f8:
        r13 = 1;
        isAlgorithmAide = r13;
        r13 = s.ۛۨۦ.m559();
        if (r13 == 0) goto L_0x0105;
    L_0x0101:
        r13 = "ۚۨۛ";
        goto L_0x0018;
    L_0x0105:
        r13 = "ۗۥۨ";
        goto L_0x012a;
    L_0x0108:
        r13 = f83;
        r14 = s.۟ۥۙ.f52;
        if (r14 == 0) goto L_0x0111;
    L_0x010e:
        r13 = "ۡۤۢ";
        goto L_0x012a;
    L_0x0111:
        r10 = "۫ۚۨ";
        r10 = s.ۢ۫ۗ.m350(r10);
        r11 = 33;
        r12 = 24;
        r15 = r13;
        r13 = r10;
        r10 = r15;
        goto L_0x001c;
    L_0x0120:
        TAG = r1;
        r13 = s.۬۟ۜ.m366();
        if (r13 == 0) goto L_0x0130;
    L_0x0128:
        r13 = "۬ۤۚ";
    L_0x012a:
        r13 = s.ۜۘۡ.m282(r13);
        goto L_0x001c;
    L_0x0130:
        r13 = "ۛ۬ۛ";
        goto L_0x0018;
    L_0x0134:
        r13 = "ۦۙۜ";
        goto L_0x0018;
    L_0x0138:
        r9 = "ۛۘۤ";
        r9 = s.ۜۘۡ.m282(r9);
        r15 = r13;
        r13 = r9;
        r9 = r15;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.<clinit>():void");
    }

    /* DevToolsApp WARNING: Missing block: B:4:0x0046, code:
            r7 = r19;
            r15 = r22;
     */
    /* DevToolsApp WARNING: Missing block: B:7:0x0055, code:
            r21 = r1;
            r22 = r15;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x006a, code:
            if (s.۠ۜۗ.m214() > 0) goto L_0x006c;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x006c, code:
            r21 = r1;
            r23 = r7;
            r1 = r18;
            r7 = r19;
     */
    /* DevToolsApp WARNING: Missing block: B:26:0x00d3, code:
            r1 = "ۖۖۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x00e3, code:
            r1 = "ۧۢۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:36:0x0121, code:
            r1 = "ۛ۟ۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:41:0x0136, code:
            r1 = s.ۜۘۡ.m282(r1);
            r15 = r22;
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x0156, code:
            r1 = s.ۢ۫ۗ.m350(r1);
     */
    /* DevToolsApp WARNING: Missing block: B:46:0x015b, code:
            r1 = "ۖۢۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x015d, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x0161, code:
            r15 = r22;
     */
    /* DevToolsApp WARNING: Missing block: B:62:0x0202, code:
            r18 = s.ۢ۫ۗ.m350("ۥۖ۬");
     */
    /* DevToolsApp WARNING: Missing block: B:64:0x0219, code:
            r7 = r23;
     */
    /* DevToolsApp WARNING: Missing block: B:67:0x0233, code:
            r1 = "۠۟ۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:69:0x023c, code:
            r19 = r7;
            r7 = r23;
            r25 = r18;
            r18 = r1;
     */
    /* DevToolsApp WARNING: Missing block: B:72:0x025d, code:
            r1 = "ۤۚۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:73:0x025f, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
    /* DevToolsApp WARNING: Missing block: B:78:0x027c, code:
            r1 = s.ۢ۫ۗ.m350(r1);
     */
    /* DevToolsApp WARNING: Missing block: B:79:0x0280, code:
            r19 = r7;
     */
    /* DevToolsApp WARNING: Missing block: B:80:0x0282, code:
            r7 = r23;
     */
    /* DevToolsApp WARNING: Missing block: B:81:0x0284, code:
            r25 = r21;
            r21 = r1;
            r1 = r25;
     */
    /* DevToolsApp WARNING: Missing block: B:84:0x02a0, code:
            r1 = "ۛۧ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:86:0x02b3, code:
            r1 = r21;
            r21 = r25;
     */
    public void onCreate() {
        /*
        r26 = this;
        r0 = r26;
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
        r20 = 0;
        r21 = "ۜۦۚ";
        r21 = s.ۜۘۡ.m282(r21);
        r19 = r14;
        r9 = r16;
        r11 = 0;
        r14 = 0;
        r16 = 0;
        r17 = 0;
        r25 = r18;
        r18 = r2;
        r2 = r25;
    L_0x0031:
        switch(r21) {
            case 1737767: goto L_0x0076;
            case 1738138: goto L_0x0124;
            case 1738745: goto L_0x0090;
            case 1738818: goto L_0x0251;
            case 1740244: goto L_0x0109;
            case 1742040: goto L_0x01f0;
            case 1742850: goto L_0x00bc;
            case 1743091: goto L_0x0063;
            case 1744016: goto L_0x028c;
            case 1746725: goto L_0x0177;
            case 1747657: goto L_0x004c;
            case 1747750: goto L_0x0264;
            case 1749564: goto L_0x013e;
            case 1751340: goto L_0x021d;
            case 1751670: goto L_0x00f1;
            case 1752187: goto L_0x0089;
            case 1752601: goto L_0x0246;
            case 1753225: goto L_0x01c6;
            case 1753286: goto L_0x01a1;
            case 1754471: goto L_0x0085;
            case 1755207: goto L_0x0099;
            case 1755560: goto L_0x00ff;
            default: goto L_0x0034;
        };
    L_0x0034:
        r21 = r1;
        r23 = r7;
        r22 = r15;
        r1 = r0.algorithmAideConfig;
        r7 = f83;
        r15 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r24 = s.ۚ۟ۢ.m85();
        if (r24 == 0) goto L_0x0165;
    L_0x0046:
        r7 = r19;
        r15 = r22;
        goto L_0x02a0;
    L_0x004c:
        s.ۢ۫ۗ.m342();
        r21 = s.ۜۘۡ.m280();
        if (r21 != 0) goto L_0x005b;
    L_0x0055:
        r21 = r1;
        r22 = r15;
        goto L_0x00d3;
    L_0x005b:
        r21 = r1;
        r23 = r7;
        r7 = r19;
        goto L_0x02a0;
    L_0x0063:
        s.ۨۧۜ.m755();
        r21 = s.۠ۜۗ.m214();
        if (r21 <= 0) goto L_0x0055;
    L_0x006c:
        r21 = r1;
        r23 = r7;
        r1 = r18;
        r7 = r19;
        goto L_0x0202;
    L_0x0076:
        s.ۙۖۥ.m748();
        r21 = s.۬۟ۜ.m366();
        if (r21 == 0) goto L_0x0080;
    L_0x007f:
        goto L_0x006c;
    L_0x0080:
        r21 = r1;
        r22 = r15;
        goto L_0x00e3;
    L_0x0085:
        s.۬ۗ۫.m98();
        goto L_0x006c;
    L_0x0089:
        s.ۦۢۜ.m16();
        s.ۡۘۗ.m32();
        return;
    L_0x0090:
        r2 = new com.junge.algorithmAidePro.MyApplication$1;
        r2.<init>();
        r1.post(r2);
        return;
    L_0x0099:
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r20);
        r21 = r1;
        r1 = new android.os.Handler;
        r22 = r15;
        r15 = android.os.Looper.getMainLooper();
        r1.<init>(r15);
        r15 = s.ۚۡۢ.m112();
        if (r15 < 0) goto L_0x00b2;
    L_0x00af:
        r23 = r7;
        goto L_0x0046;
    L_0x00b2:
        r15 = "ۗۗۙ";
        r21 = s.ۜۘۡ.m282(r15);
        r15 = r22;
        goto L_0x0031;
    L_0x00bc:
        r21 = r1;
        r22 = r15;
        r1 = r0.algorithmAideConfig;
        r15 = r8 + r12;
        r15 = s.ۨۘۢ.m304(r15);
        s.ۚۤۙ.m299(r1, r7, r15);
        r1 = new com.junge.algorithmAidePro.MyApplication$ExceptionHandler;
        r15 = s.ۥۥۚ.m614();
        if (r15 > 0) goto L_0x00d7;
    L_0x00d3:
        r1 = "ۖۖۧ";
        goto L_0x015d;
    L_0x00d7:
        r1.<init>();
        r15 = new com.junge.algorithmAidePro.a;
        r15.<init>(r1);
        r1 = s.۠ۜۗ.f13;
        if (r1 == 0) goto L_0x00e7;
    L_0x00e3:
        r1 = "ۧۢۢ";
        goto L_0x0156;
    L_0x00e7:
        r1 = "ۨۛۚ";
        r1 = s.ۜۘۡ.m282(r1);
        r20 = r15;
        goto L_0x0161;
    L_0x00f1:
        r21 = r1;
        r22 = r15;
        r1 = umengKey;
        r15 = "";
        com.umeng.commonsdk.UMConfigure.init(r0, r1, r10, r12, r15);
        r23 = r7;
        goto L_0x0134;
    L_0x00ff:
        r21 = r1;
        r22 = r15;
        com.umeng.commonsdk.UMConfigure.setLogEnabled(r12);
        r23 = r7;
        goto L_0x0121;
    L_0x0109:
        r21 = r1;
        r22 = r15;
        r1 = f83;
        r15 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r23 = r7;
        r7 = 3;
        r1 = s.۬ۗ۫.m97(r1, r15, r7, r13);
        r1 = s.ۡۘۗ.m39(r10, r1);
        if (r1 != 0) goto L_0x0121;
    L_0x011e:
        r7 = r23;
        goto L_0x015b;
    L_0x0121:
        r1 = "ۛ۟ۦ";
        goto L_0x0136;
    L_0x0124:
        r21 = r1;
        r23 = r7;
        r22 = r15;
        r1 = umengKey;
        com.umeng.commonsdk.UMConfigure.preInit(r0, r1, r10);
        if (r5 == 0) goto L_0x0134;
    L_0x0131:
        r1 = "ۤۥۗ";
        goto L_0x0136;
    L_0x0134:
        r1 = "ۨۦۦ";
    L_0x0136:
        r1 = s.ۜۘۡ.m282(r1);
        r15 = r22;
        goto L_0x0282;
    L_0x013e:
        r21 = r1;
        r22 = r15;
        r1 = 8;
        r7 = s.ۖۙۜ.m585(r2, r14, r1, r13);
        r8 = r6.getInt(r7, r4);
        r10 = s.ۡۘۗ.m47();
        r12 = 1;
        r1 = 5;
        if (r8 >= r1) goto L_0x015b;
    L_0x0154:
        r1 = "ۘۨۤ";
    L_0x0156:
        r1 = s.ۢ۫ۗ.m350(r1);
        goto L_0x0161;
    L_0x015b:
        r1 = "ۖۢۦ";
    L_0x015d:
        r1 = s.ۜۘۡ.m282(r1);
    L_0x0161:
        r15 = r22;
        goto L_0x0284;
    L_0x0165:
        r2 = "ۢ۟ۙ";
        r2 = s.ۜۘۡ.m282(r2);
        r6 = r1;
        r1 = r21;
        r15 = r22;
        r14 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r21 = r2;
        r2 = r7;
        goto L_0x0219;
    L_0x0177:
        r21 = r1;
        r23 = r7;
        r22 = r15;
        r1 = 6;
        r1 = s.ۙۜۦ.m519(r9, r11, r1, r13);
        r7 = 0;
        r1 = s.۟ۥۙ.m642(r3, r1, r7);
        r15 = s.ۗۜ۟.m469();
        if (r15 > 0) goto L_0x018f;
    L_0x018d:
        goto L_0x0046;
    L_0x018f:
        r4 = "ۗۚۘ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r5 = r1;
        r1 = r21;
        r15 = r22;
        r7 = r23;
        r21 = r4;
        r4 = 0;
        goto L_0x0031;
    L_0x01a1:
        r21 = r1;
        r23 = r7;
        r22 = r15;
        r1 = f83;
        r7 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r15 = s.ۗۜ۟.f33;
        if (r15 > 0) goto L_0x01b5;
    L_0x01af:
        r7 = r19;
        r15 = r22;
        goto L_0x0233;
    L_0x01b5:
        r9 = "۟۠ۦ";
        r9 = s.ۢ۫ۗ.m350(r9);
        r15 = r22;
        r7 = r23;
        r11 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r25 = r9;
        r9 = r1;
        goto L_0x02b3;
    L_0x01c6:
        r21 = r1;
        r23 = r7;
        r22 = r15;
        r1 = 26;
        r7 = r19;
        r1 = s.۫۫ۗ.m797(r7, r15, r1, r13);
        r1 = s.ۚۡۢ.m125(r1);
        r0.algorithmAideConfig = r1;
        r19 = s.ۥۘۧ.m662();
        if (r19 > 0) goto L_0x01e1;
    L_0x01e0:
        goto L_0x0233;
    L_0x01e1:
        r3 = "ۦۛۛ";
        r3 = s.ۜۘۡ.m282(r3);
        r19 = r7;
        r7 = r23;
        r25 = r3;
        r3 = r1;
        goto L_0x02b3;
    L_0x01f0:
        r21 = r1;
        r23 = r7;
        r1 = r18;
        r7 = r19;
        r0.dbController = r1;
        r18 = f83;
        r19 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r22 = s.ۨۧۜ.f59;
        if (r22 == 0) goto L_0x0209;
    L_0x0202:
        r18 = "ۥۖ۬";
        r18 = s.ۢ۫ۗ.m350(r18);
        goto L_0x023c;
    L_0x0209:
        r7 = "ۦۙۜ";
        r7 = s.ۜۘۡ.m282(r7);
        r19 = r18;
        r15 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r18 = r1;
        r1 = r21;
        r21 = r7;
    L_0x0219:
        r7 = r23;
        goto L_0x0031;
    L_0x021d:
        r21 = r1;
        r23 = r7;
        r1 = r18;
        r7 = r19;
        super.onCreate();
        myApplication = r0;
        r1 = new com.junge.algorithmAidePro.DbController.DbController;
        r1.<init>(r0);
        r19 = s.ۥۘۧ.f53;
        if (r19 == 0) goto L_0x0236;
    L_0x0233:
        r1 = "۠۟ۨ";
        goto L_0x027c;
    L_0x0236:
        r18 = "ۚۤۢ";
        r18 = s.ۜۘۡ.m282(r18);
    L_0x023c:
        r19 = r7;
        r7 = r23;
        r25 = r18;
        r18 = r1;
        goto L_0x02b3;
    L_0x0246:
        r21 = r1;
        r23 = r7;
        r7 = r19;
        r1 = 30467; // 0x7703 float:4.2693E-41 double:1.50527E-319;
        r13 = 30467; // 0x7703 float:4.2693E-41 double:1.50527E-319;
        goto L_0x025d;
    L_0x0251:
        r21 = r1;
        r23 = r7;
        r7 = r19;
        r1 = 46386; // 0xb532 float:6.5E-41 double:2.29177E-319;
        r13 = 46386; // 0xb532 float:6.5E-41 double:2.29177E-319;
    L_0x025d:
        r1 = "ۤۚۢ";
    L_0x025f:
        r1 = s.ۜۘۡ.m282(r1);
        goto L_0x0280;
    L_0x0264:
        r21 = r1;
        r23 = r7;
        r7 = r19;
        r1 = r16 * r17;
        r19 = r16 * r16;
        r22 = 171924544; // 0xa3f5c40 float:9.213666E-33 double:8.4942011E-316;
        r19 = r19 + r22;
        r19 = r19 - r1;
        if (r19 >= 0) goto L_0x027a;
    L_0x0277:
        r1 = "ۥۤۘ";
        goto L_0x027c;
    L_0x027a:
        r1 = "ۗۙۤ";
    L_0x027c:
        r1 = s.ۢ۫ۗ.m350(r1);
    L_0x0280:
        r19 = r7;
    L_0x0282:
        r7 = r23;
    L_0x0284:
        r25 = r21;
        r21 = r1;
        r1 = r25;
        goto L_0x0031;
    L_0x028c:
        r21 = r1;
        r23 = r7;
        r7 = r19;
        r1 = f83;
        r19 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r1 = r1[r19];
        r19 = 26224; // 0x6670 float:3.6748E-41 double:1.29564E-319;
        r22 = s.۠ۡ۟.m140();
        if (r22 > 0) goto L_0x02a3;
    L_0x02a0:
        r1 = "ۛۧ۟";
        goto L_0x025f;
    L_0x02a3:
        r16 = "۠ۢۨ";
        r16 = s.ۜۘۡ.m282(r16);
        r19 = r7;
        r7 = r23;
        r17 = 26224; // 0x6670 float:3.6748E-41 double:1.29564E-319;
        r25 = r16;
        r16 = r1;
    L_0x02b3:
        r1 = r21;
        r21 = r25;
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.onCreate():void");
    }

    /* DevToolsApp WARNING: Missing block: B:7:0x0050, code:
            r21 = r0;
            r24 = r1;
            r22 = r8;
            r23 = r14;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x0066, code:
            r21 = r0;
            r22 = r8;
            r23 = r14;
            r8 = r18;
     */
    /* DevToolsApp WARNING: Missing block: B:15:0x0081, code:
            r21 = r0;
            r24 = r1;
            r22 = r8;
            r23 = r14;
     */
    /* DevToolsApp WARNING: Missing block: B:18:0x0093, code:
            if (s.ۗ۠ۚ.f28 != 0) goto L_0x00ac;
     */
    /* DevToolsApp WARNING: Missing block: B:20:0x009d, code:
            if (s.ۨۗۥ.m536() != 0) goto L_0x0050;
     */
    /* DevToolsApp WARNING: Missing block: B:22:0x00a4, code:
            if (s.۟ۧۢ.m774() == false) goto L_0x00ac;
     */
    /* DevToolsApp WARNING: Missing block: B:24:0x00a9, code:
            if (s.ۗۜۛ.f55 == 0) goto L_0x00b2;
     */
    /* DevToolsApp WARNING: Missing block: B:25:0x00ac, code:
            r21 = "ۖۙۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x00b2, code:
            r21 = "ۥۦۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:28:0x00b4, code:
            r21 = s.ۢ۫ۗ.m350(r21);
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x00ef, code:
            r0 = "ۙۖۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:40:0x00f1, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:41:0x00f5, code:
            r8 = r22;
     */
    /* DevToolsApp WARNING: Missing block: B:50:0x0122, code:
            r14 = r23;
            r1 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x0156, code:
            r1 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:58:0x0161, code:
            r0 = r21;
            r8 = r22;
            r14 = r23;
            r21 = r1;
     */
    /* DevToolsApp WARNING: Missing block: B:62:0x0186, code:
            r0 = s.ۢ۫ۗ.m350("ۗۛۢ");
     */
    /* DevToolsApp WARNING: Missing block: B:70:0x01dc, code:
            r0 = "ۖۚۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:77:0x022b, code:
            r0 = "۟ۜۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:81:0x0256, code:
            r0 = "ۘۤۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:85:0x0267, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:87:0x026e, code:
            r0 = s.ۢ۫ۗ.m350(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:88:0x0272, code:
            r8 = r22;
            r14 = r23;
     */
    /* DevToolsApp WARNING: Missing block: B:89:0x0276, code:
            r26 = r21;
            r21 = r0;
            r0 = r26;
     */
    /* DevToolsApp WARNING: Missing block: B:92:0x028e, code:
            r0 = "۠ۖۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:96:0x02b3, code:
            r0 = s.ۢ۫ۗ.m350("ۘۦ۫");
     */
    /* DevToolsApp WARNING: Missing block: B:98:0x02cb, code:
            r21 = r8;
            r8 = r22;
     */
    /* DevToolsApp WARNING: Missing block: B:101:0x02e1, code:
            r0 = "ۗۥۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:102:0x02e3, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:103:0x02e7, code:
            r18 = r8;
     */
    /* DevToolsApp WARNING: Missing block: B:105:0x02fc, code:
            r16 = r0;
            r0 = r21;
            r21 = r26;
     */
    public void requestAppData() {
        /*
        r29 = this;
        r0 = 0;
        r1 = 0;
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
        r21 = "۬ۖ۬";
        r21 = s.ۢ۫ۗ.m350(r21);
        r12 = r19;
        r10 = 0;
        r11 = 0;
        r13 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r26 = r1;
        r1 = r0;
        r0 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r2 = r26;
        r28 = r16;
        r16 = r9;
        r9 = r28;
    L_0x003e:
        switch(r21) {
            case 1737751: goto L_0x0145;
            case 1737844: goto L_0x00af;
            case 1737878: goto L_0x0096;
            case 1738411: goto L_0x0128;
            case 1738870: goto L_0x027e;
            case 1738878: goto L_0x00a7;
            case 1739031: goto L_0x016d;
            case 1739180: goto L_0x00a0;
            case 1740050: goto L_0x019f;
            case 1740121: goto L_0x0216;
            case 1740189: goto L_0x007a;
            case 1740645: goto L_0x00bf;
            case 1743662: goto L_0x0259;
            case 1743708: goto L_0x01c9;
            case 1746590: goto L_0x0062;
            case 1746749: goto L_0x023f;
            case 1746785: goto L_0x00c0;
            case 1746901: goto L_0x02a0;
            case 1746947: goto L_0x01f2;
            case 1747375: goto L_0x0049;
            case 1747862: goto L_0x024a;
            case 1751712: goto L_0x0110;
            case 1752641: goto L_0x008e;
            case 1752676: goto L_0x00b9;
            case 1758914: goto L_0x02cf;
            default: goto L_0x0041;
        };
    L_0x0041:
        r21 = r0;
        r0 = r8.f();	 Catch:{ Exception -> 0x00fe }
        goto L_0x00cc;
    L_0x0049:
        s.ۧۧۡ.m183();
        r21 = s.ۨۗۥ.f42;
        if (r21 <= 0) goto L_0x005a;
    L_0x0050:
        r21 = r0;
        r24 = r1;
        r22 = r8;
        r23 = r14;
        goto L_0x0186;
    L_0x005a:
        r21 = r0;
        r22 = r8;
        r23 = r14;
        goto L_0x022b;
    L_0x0062:
        r21 = s.ۡۥۗ.f47;
        if (r21 == 0) goto L_0x0070;
    L_0x0066:
        r21 = r0;
        r22 = r8;
        r23 = r14;
        r8 = r18;
        goto L_0x02e1;
    L_0x0070:
        r21 = r0;
        r22 = r8;
        r23 = r14;
        r8 = r18;
        goto L_0x02b3;
    L_0x007a:
        s.ۖۜ۟.m492();
        r21 = s.ۘۡۜ.f54;
        if (r21 == 0) goto L_0x008b;
    L_0x0081:
        r21 = r0;
        r24 = r1;
        r22 = r8;
        r23 = r14;
        goto L_0x01dc;
    L_0x008b:
        r21 = "ۥۥۡ";
        goto L_0x00b4;
    L_0x008e:
        s.ۖۜ۟.m492();
        r21 = s.ۗ۠ۚ.f28;
        if (r21 == 0) goto L_0x0081;
    L_0x0095:
        goto L_0x00ac;
    L_0x0096:
        s.ۢ۫ۗ.m342();
        r21 = s.ۨۗۥ.m536();
        if (r21 == 0) goto L_0x0066;
    L_0x009f:
        goto L_0x0050;
    L_0x00a0:
        r21 = s.۟ۧۢ.m774();
        if (r21 != 0) goto L_0x0050;
    L_0x00a6:
        goto L_0x00ac;
    L_0x00a7:
        r21 = s.ۗۜۛ.f55;
        if (r21 != 0) goto L_0x00ac;
    L_0x00ab:
        goto L_0x00b2;
    L_0x00ac:
        r21 = "ۖۙۗ";
        goto L_0x00b4;
    L_0x00af:
        s.ۡۗۗ.m159();
    L_0x00b2:
        r21 = "ۥۦۥ";
    L_0x00b4:
        r21 = s.ۢ۫ۗ.m350(r21);
        goto L_0x003e;
    L_0x00b9:
        s.ۗۢۢ.m454();
        s.ۖۜ۟.m492();
    L_0x00bf:
        return;
    L_0x00c0:
        s.ۜۖۚ.m4(r0);
        r21 = r0;
        r24 = r1;
        r22 = r8;
        r23 = r14;
        goto L_0x00ef;
    L_0x00cc:
        r0 = r0.g;	 Catch:{ Exception -> 0x00fe }
        r0 = r0.string();	 Catch:{ Exception -> 0x00fe }
        r22 = r8;
        r8 = f83;	 Catch:{ Exception -> 0x00fa }
        r23 = r14;
        r14 = 279; // 0x117 float:3.91E-43 double:1.38E-321;
        r24 = r1;
        r1 = 13;
        r1 = s.ۥۥۚ.m621(r8, r14, r1, r15);	 Catch:{ Exception -> 0x00f8 }
        s.ۖۜ۟.m487(r1, r0);	 Catch:{ Exception -> 0x00f8 }
        r1 = com.junge.algorithmAidePro.bean.AppData.class;
        r0 = s.ۛۨۦ.m554(r0, r1);	 Catch:{ Exception -> 0x00f8 }
        r0 = (com.junge.algorithmAidePro.bean.AppData) r0;	 Catch:{ Exception -> 0x00f8 }
        appData = r0;	 Catch:{ Exception -> 0x00f8 }
    L_0x00ef:
        r0 = "ۙۖۢ";
    L_0x00f1:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x00f5:
        r8 = r22;
        goto L_0x0122;
    L_0x00f8:
        r0 = move-exception;
        goto L_0x0105;
    L_0x00fa:
        r0 = move-exception;
        r24 = r1;
        goto L_0x0103;
    L_0x00fe:
        r0 = move-exception;
        r24 = r1;
        r22 = r8;
    L_0x0103:
        r23 = r14;
    L_0x0105:
        r1 = "۟ۢۤ";
        r21 = s.ۢ۫ۗ.m350(r1);
        r8 = r22;
        r14 = r23;
        goto L_0x0169;
    L_0x0110:
        r21 = r0;
        r24 = r1;
        r23 = r14;
        r8 = new u0.e;
        r0 = 0;
        r8.<init>(r4, r7, r0);
        r0 = "ۛۚۛ";
        r0 = s.ۢ۫ۗ.m350(r0);
    L_0x0122:
        r14 = r23;
        r1 = r24;
        goto L_0x0276;
    L_0x0128:
        r21 = r0;
        r24 = r1;
        r22 = r8;
        r23 = r14;
        r0 = 0;
        r5.d(r6, r0);
        r0 = s.ۡۥۗ.m564(r5);
        r1 = s.۫۫ۗ.f65;
        if (r1 == 0) goto L_0x013d;
    L_0x013c:
        goto L_0x0156;
    L_0x013d:
        r1 = "ۤۦۢ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r7 = r0;
        goto L_0x0161;
    L_0x0145:
        r21 = r0;
        r24 = r1;
        r22 = r8;
        r23 = r14;
        r0 = 3;
        r0 = s.ۤۤۖ.m503(r12, r13, r0, r15);
        r1 = s.۬۟ۜ.f23;
        if (r1 != 0) goto L_0x015a;
    L_0x0156:
        r1 = r24;
        goto L_0x022b;
    L_0x015a:
        r1 = "ۖ۫۠";
        r1 = s.ۢ۫ۗ.m350(r1);
        r6 = r0;
    L_0x0161:
        r0 = r21;
        r8 = r22;
        r14 = r23;
        r21 = r1;
    L_0x0169:
        r1 = r24;
        goto L_0x003e;
    L_0x016d:
        r21 = r0;
        r24 = r1;
        r22 = r8;
        r23 = r14;
        r0 = s.۠ۜۗ.m221(r9, r10, r11, r15);
        s.ۛ۫ۧ.m606(r5, r0);
        r0 = f83;
        r1 = 276; // 0x114 float:3.87E-43 double:1.364E-321;
        r8 = s.ۖۙۜ.m589();
        if (r8 > 0) goto L_0x018e;
    L_0x0186:
        r0 = "ۗۛۢ";
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x00f5;
    L_0x018e:
        r8 = "ۖۖۗ";
        r8 = s.ۢ۫ۗ.m350(r8);
        r12 = r0;
        r0 = r21;
        r14 = r23;
        r1 = r24;
        r13 = 276; // 0x114 float:3.87E-43 double:1.364E-321;
        goto L_0x02c9;
    L_0x019f:
        r21 = r0;
        r24 = r1;
        r22 = r8;
        r23 = r14;
        r0 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r1 = 46;
        r8 = s.ۙۜۦ.m520();
        if (r8 == 0) goto L_0x01b7;
    L_0x01b1:
        r8 = r18;
        r1 = r24;
        goto L_0x028e;
    L_0x01b7:
        r8 = "ۗ۠۠";
        r8 = s.ۢ۫ۗ.m350(r8);
        r0 = r21;
        r14 = r23;
        r1 = r24;
        r10 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r11 = 46;
        goto L_0x02c9;
    L_0x01c9:
        r21 = r0;
        r24 = r1;
        r22 = r8;
        r23 = r14;
        r0 = new q0.y$a;
        r0.<init>();
        r1 = f83;
        r8 = s.۟ۥۙ.f52;
        if (r8 == 0) goto L_0x01e0;
    L_0x01dc:
        r0 = "ۖۚۚ";
        goto L_0x00f1;
    L_0x01e0:
        r5 = "ۘۢۜ";
        r5 = s.ۢ۫ۗ.m350(r5);
        r9 = r1;
        r8 = r22;
        r14 = r23;
        r1 = r24;
        r26 = r5;
        r5 = r0;
        goto L_0x02fc;
    L_0x01f2:
        r21 = r0;
        r22 = r8;
        r23 = r14;
        r1.a(r2);
        r0 = new q0.w;
        r0.<init>(r1);
        r8 = s.ۚۡۢ.m112();
        if (r8 < 0) goto L_0x0207;
    L_0x0206:
        goto L_0x022b;
    L_0x0207:
        r4 = "ۜۜۜ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r8 = r22;
        r14 = r23;
        r26 = r4;
        r4 = r0;
        goto L_0x02fc;
    L_0x0216:
        r21 = r0;
        r22 = r8;
        r23 = r14;
        r0 = new q0.w$a;
        r0.<init>();
        r8 = java.util.concurrent.TimeUnit.SECONDS;
        r24 = 3;
        r8 = s.ۡۗۗ.m159();
        if (r8 == 0) goto L_0x022e;
    L_0x022b:
        r0 = "۟ۜۛ";
        goto L_0x0267;
    L_0x022e:
        r1 = "۟ۧ۫";
        r1 = s.ۜۘۡ.m282(r1);
        r8 = r22;
        r14 = r23;
        r2 = r24;
        r26 = r1;
        r1 = r0;
        goto L_0x02fc;
    L_0x023f:
        r21 = r0;
        r22 = r8;
        r23 = r14;
        r0 = 5393; // 0x1511 float:7.557E-42 double:2.6645E-320;
        r15 = 5393; // 0x1511 float:7.557E-42 double:2.6645E-320;
        goto L_0x0256;
    L_0x024a:
        r21 = r0;
        r22 = r8;
        r23 = r14;
        r0 = 33939; // 0x8493 float:4.7559E-41 double:1.6768E-319;
        r15 = 33939; // 0x8493 float:4.7559E-41 double:1.6768E-319;
    L_0x0256:
        r0 = "ۘۤۥ";
        goto L_0x026e;
    L_0x0259:
        r21 = r0;
        r22 = r8;
        r23 = r14;
        r14 = r23 * r23;
        r0 = r20 - r14;
        if (r0 <= 0) goto L_0x026c;
    L_0x0265:
        r0 = "۟ۡ۟";
    L_0x0267:
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x0272;
    L_0x026c:
        r0 = "۠ۦۜ";
    L_0x026e:
        r0 = s.ۢ۫ۗ.m350(r0);
    L_0x0272:
        r8 = r22;
        r14 = r23;
    L_0x0276:
        r26 = r21;
        r21 = r0;
        r0 = r26;
        goto L_0x003e;
    L_0x027e:
        r21 = r0;
        r22 = r8;
        r23 = r14;
        r0 = r18 * r19;
        r8 = r18;
        r14 = r8 + 14921;
        r18 = s.ۨۧۚ.f56;
        if (r18 != 0) goto L_0x0291;
    L_0x028e:
        r0 = "۠ۖۥ";
        goto L_0x02e3;
    L_0x0291:
        r18 = "ۜۚ۬";
        r18 = s.ۢ۫ۗ.m350(r18);
        r20 = r0;
        r0 = r21;
        r21 = r18;
        r18 = r8;
        goto L_0x02cb;
    L_0x02a0:
        r21 = r0;
        r22 = r8;
        r23 = r14;
        r8 = r18;
        r0 = r16[r17];
        r14 = 59684; // 0xe924 float:8.3635E-41 double:2.9488E-319;
        r18 = s.ۙۜۦ.m520();
        if (r18 == 0) goto L_0x02ba;
    L_0x02b3:
        r0 = "ۘۦ۫";
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x02e7;
    L_0x02ba:
        r8 = "ۗۛۚ";
        r8 = s.ۜۘۡ.m282(r8);
        r18 = r0;
        r0 = r21;
        r14 = r23;
        r19 = 59684; // 0xe924 float:8.3635E-41 double:2.9488E-319;
    L_0x02c9:
        r21 = r8;
    L_0x02cb:
        r8 = r22;
        goto L_0x003e;
    L_0x02cf:
        r21 = r0;
        r22 = r8;
        r23 = r14;
        r8 = r18;
        r0 = f83;
        r14 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r18 = s.ۢ۟ۚ.m168();
        if (r18 > 0) goto L_0x02ea;
    L_0x02e1:
        r0 = "ۗۥۚ";
    L_0x02e3:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x02e7:
        r18 = r8;
        goto L_0x0272;
    L_0x02ea:
        r16 = "۟ۦۜ";
        r16 = s.ۢ۫ۗ.m350(r16);
        r18 = r8;
        r8 = r22;
        r14 = r23;
        r17 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r26 = r16;
        r16 = r0;
    L_0x02fc:
        r0 = r21;
        r21 = r26;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.requestAppData():void");
    }

    /* DevToolsApp WARNING: Missing block: B:10:0x002b, code:
            if (s.۫۫ۗ.m790() == false) goto L_0x0099;
     */
    /* DevToolsApp WARNING: Missing block: B:26:0x0077, code:
            r2 = "۟۫ۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:33:0x008a, code:
            r2 = "ۖ۬۟";
     */
    /* DevToolsApp WARNING: Missing block: B:38:0x0099, code:
            r2 = "ۖۜۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00be, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    public static void startRootService() {
        /*
        r0 = 0;
        r1 = 0;
        r2 = "ۛۖۚ";
    L_0x0004:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x0008:
        switch(r2) {
            case 1737942: goto L_0x0037;
            case 1738441: goto L_0x0027;
            case 1739743: goto L_0x003a;
            case 1739960: goto L_0x0073;
            case 1741207: goto L_0x0058;
            case 1742559: goto L_0x00c4;
            case 1743094: goto L_0x00a1;
            case 1746558: goto L_0x001c;
            case 1747055: goto L_0x002f;
            case 1749318: goto L_0x00ad;
            case 1754256: goto L_0x0013;
            case 1754647: goto L_0x0086;
            case 1758126: goto L_0x003b;
            case 1758306: goto L_0x0095;
            case 1758449: goto L_0x007d;
            case 1759276: goto L_0x0041;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = s.ۖۙۜ.m589();
        if (r2 > 0) goto L_0x0091;
    L_0x0011:
        goto L_0x00b8;
    L_0x0013:
        s.ۚۤۙ.m296();
        r2 = s.ۙۖۥ.f58;
        if (r2 != 0) goto L_0x00a5;
    L_0x001a:
        goto L_0x008a;
    L_0x001c:
        s.۟ۤۗ.m332();
        r2 = s.ۧۧۡ.m183();
        if (r2 <= 0) goto L_0x008a;
    L_0x0025:
        goto L_0x0099;
    L_0x0027:
        r2 = s.۫۫ۗ.m790();
        if (r2 != 0) goto L_0x0077;
    L_0x002d:
        goto L_0x0099;
    L_0x002f:
        s.۠ۜۗ.m214();
        s.ۚۡۢ.m112();
        goto L_0x0099;
    L_0x0037:
        s.ۡۘۗ.m32();
    L_0x003a:
        return;
    L_0x003b:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        s.ۢۜۘ.m253(r0, r1, r2);
        return;
    L_0x0041:
        r2 = new com.junge.algorithmAidePro.MyApplication$2;
        r2.<init>();
        r3 = s.ۘۡۜ.m682();
        if (r3 < 0) goto L_0x004e;
    L_0x004c:
        goto L_0x00b8;
    L_0x004e:
        r1 = "۫ۜ۟";
        r1 = s.ۢ۫ۗ.m350(r1);
        r4 = r2;
        r2 = r1;
        r1 = r4;
        goto L_0x0008;
    L_0x0058:
        r2 = new android.os.Handler;
        r3 = s.ۗۜۛ.f55;
        if (r3 == 0) goto L_0x005f;
    L_0x005e:
        goto L_0x0077;
    L_0x005f:
        r2.<init>();
        r3 = s.ۥۥۚ.m614();
        if (r3 > 0) goto L_0x0069;
    L_0x0068:
        goto L_0x00b8;
    L_0x0069:
        r0 = "۬ۢۢ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0008;
    L_0x0073:
        r2 = s.ۧۧۡ.f11;
        if (r2 != 0) goto L_0x007a;
    L_0x0077:
        r2 = "۟۫ۛ";
        goto L_0x0004;
    L_0x007a:
        r2 = "ۙۨۦ";
        goto L_0x00be;
    L_0x007d:
        r2 = s.۟ۥۙ.f52;
        if (r2 == 0) goto L_0x0082;
    L_0x0081:
        goto L_0x00a5;
    L_0x0082:
        r2 = "ۘ۟۟";
        goto L_0x0004;
    L_0x0086:
        r2 = s.ۢ۟ۚ.f10;
        if (r2 == 0) goto L_0x008d;
    L_0x008a:
        r2 = "ۖ۬۟";
        goto L_0x00be;
    L_0x008d:
        r2 = "۫ۦ۬";
        goto L_0x0004;
    L_0x0091:
        r2 = "ۧۨۘ";
        goto L_0x0004;
    L_0x0095:
        r2 = s.ۗ۬۟.f16;
        if (r2 == 0) goto L_0x009d;
    L_0x0099:
        r2 = "ۖۜۜ";
        goto L_0x0004;
    L_0x009d:
        r2 = "ۜ۟ۢ";
        goto L_0x0004;
    L_0x00a1:
        r2 = s.۬۟ۜ.f23;
        if (r2 != 0) goto L_0x00a9;
    L_0x00a5:
        r2 = "۟ۛۚ";
        goto L_0x0004;
    L_0x00a9:
        r2 = "۫ۢۙ";
        goto L_0x0004;
    L_0x00ad:
        r2 = s.۟ۤۗ.m335();
        com.junge.algorithmAidePro.ipc.RootConnection.startService(r2);
        r2 = s.ۥۥۚ.f50;
        if (r2 == 0) goto L_0x00bc;
    L_0x00b8:
        r2 = "ۧۛۤ";
        goto L_0x0004;
    L_0x00bc:
        r2 = "ۛۧۢ";
    L_0x00be:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x0008;
    L_0x00c4:
        r2 = s.ۨۧۚ.m707();
        if (r2 == 0) goto L_0x00cd;
    L_0x00ca:
        r2 = "ۘۘ۟";
        goto L_0x00be;
    L_0x00cd:
        r2 = "ۢۗۛ";
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.startRootService():void");
    }

    /* DevToolsApp WARNING: Missing block: B:11:0x0030, code:
            if (s.ۤۤۖ.f35 == 0) goto L_0x00dc;
     */
    /* DevToolsApp WARNING: Missing block: B:24:0x007b, code:
            r10 = "۟۫ۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x0083, code:
            r10 = "ۖۙۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:40:0x00c6, code:
            r10 = "ۛۧۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:44:0x00dc, code:
            r10 = "ۡ۫ۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00ef, code:
            r10 = "ۚۦۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:57:0x0109, code:
            r10 = s.ۢ۫ۗ.m350(r10);
     */
    /* DevToolsApp WARNING: Missing block: B:60:0x0117, code:
            r10 = "ۧ۫ۛ";
     */
    public com.junge.algorithmAidePro.Config.ConfigReader getConfig() {
        /*
        r14 = this;
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
        r10 = "ۙۢۜ";
    L_0x000c:
        r10 = s.ۜۘۡ.m282(r10);
    L_0x0010:
        switch(r10) {
            case 1739160: goto L_0x00f6;
            case 1739838: goto L_0x00d6;
            case 1741011: goto L_0x010f;
            case 1741146: goto L_0x0081;
            case 1742101: goto L_0x002e;
            case 1742691: goto L_0x004c;
            case 1743026: goto L_0x0095;
            case 1743100: goto L_0x001a;
            case 1743520: goto L_0x0060;
            case 1747054: goto L_0x0078;
            case 1747903: goto L_0x007e;
            case 1748418: goto L_0x0041;
            case 1748665: goto L_0x00be;
            case 1748984: goto L_0x003c;
            case 1751715: goto L_0x0087;
            case 1753602: goto L_0x00fe;
            case 1754470: goto L_0x00eb;
            case 1754743: goto L_0x0034;
            case 1757934: goto L_0x00a9;
            case 1758406: goto L_0x0023;
            default: goto L_0x0013;
        };
    L_0x0013:
        r10 = r14.algorithmAideConfig;
        if (r10 != 0) goto L_0x007b;
    L_0x0017:
        r10 = "ۜۖۚ";
        goto L_0x000c;
    L_0x001a:
        s.ۥۘۧ.m662();
        r10 = s.ۖۜ۟.f34;
        if (r10 >= 0) goto L_0x0104;
    L_0x0021:
        goto L_0x0117;
    L_0x0023:
        s.ۢ۫ۜ.m625();
        r10 = s.ۖۜ۟.m492();
        if (r10 == 0) goto L_0x00ef;
    L_0x002c:
        goto L_0x00dc;
    L_0x002e:
        r10 = s.ۤۤۖ.f35;
        if (r10 != 0) goto L_0x0117;
    L_0x0032:
        goto L_0x00dc;
    L_0x0034:
        s.۫ۢ۠.m237();
        s.ۗۤ۫.m195();
        goto L_0x00dc;
    L_0x003c:
        s.۟ۥۙ.m650();
        r0 = 0;
        return r0;
    L_0x0041:
        r10 = s.ۤۤۖ.m503(r1, r2, r3, r0);
        r10 = s.ۡۗۗ.m146(r10);
        r14.algorithmAideConfig = r10;
        goto L_0x007b;
    L_0x004c:
        r10 = 26;
        r11 = s.ۨۗۥ.m536();
        if (r11 == 0) goto L_0x0056;
    L_0x0054:
        goto L_0x00dc;
    L_0x0056:
        r3 = "ۡۙۚ";
        r3 = s.ۢ۫ۗ.m350(r3);
        r10 = r3;
        r3 = 26;
        goto L_0x0010;
    L_0x0060:
        r10 = f83;
        r11 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r12 = s.ۗ۬۟.m257();
        if (r12 > 0) goto L_0x006c;
    L_0x006a:
        goto L_0x00ef;
    L_0x006c:
        r1 = "ۛۚۢ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r2 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r13 = r10;
        r10 = r1;
        r1 = r13;
        goto L_0x0010;
    L_0x0078:
        r0 = r14.algorithmAideConfig;
        return r0;
    L_0x007b:
        r10 = "۟۫ۚ";
        goto L_0x000c;
    L_0x007e:
        r0 = 2631; // 0xa47 float:3.687E-42 double:1.3E-320;
        goto L_0x0083;
    L_0x0081:
        r0 = 25801; // 0x64c9 float:3.6155E-41 double:1.27474E-319;
    L_0x0083:
        r10 = "ۖۙۨ";
        goto L_0x0109;
    L_0x0087:
        r10 = r6 * r9;
        r10 = r8 - r10;
        if (r10 >= 0) goto L_0x0091;
    L_0x008d:
        r10 = "۠ۧۦ";
        goto L_0x0109;
    L_0x0091:
        r10 = "ۙۦۧ";
        goto L_0x0109;
    L_0x0095:
        r10 = 14544; // 0x38d0 float:2.038E-41 double:7.1857E-320;
        r11 = s.ۙۖۥ.m748();
        if (r11 > 0) goto L_0x009e;
    L_0x009d:
        goto L_0x00c6;
    L_0x009e:
        r9 = "ۤۦۥ";
        r9 = s.ۜۘۡ.m282(r9);
        r10 = r9;
        r9 = 14544; // 0x38d0 float:2.038E-41 double:7.1857E-320;
        goto L_0x0010;
    L_0x00a9:
        r10 = 52881984; // 0x326ea40 float:4.905192E-37 double:2.61271716E-316;
        r10 = r10 + r7;
        r11 = s.ۧۧۡ.f11;
        if (r11 != 0) goto L_0x00b3;
    L_0x00b1:
        goto L_0x0117;
    L_0x00b3:
        r8 = "ۛۥۜ";
        r8 = s.ۢ۫ۗ.m350(r8);
        r13 = r10;
        r10 = r8;
        r8 = r13;
        goto L_0x0010;
    L_0x00be:
        r10 = r4[r5];
        r11 = r10 * r10;
        r12 = s.ۦۡۤ.f25;
        if (r12 == 0) goto L_0x00ca;
    L_0x00c6:
        r10 = "ۛۧۨ";
        goto L_0x000c;
    L_0x00ca:
        r6 = "۫ۖۙ";
        r6 = s.ۜۘۡ.m282(r6);
        r7 = r11;
        r13 = r10;
        r10 = r6;
        r6 = r13;
        goto L_0x0010;
    L_0x00d6:
        r10 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r11 = s.ۚ۟ۢ.f5;
        if (r11 != 0) goto L_0x00e0;
    L_0x00dc:
        r10 = "ۡ۫ۢ";
        goto L_0x000c;
    L_0x00e0:
        r5 = "ۡۡۙ";
        r5 = s.ۢ۫ۗ.m350(r5);
        r10 = r5;
        r5 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        goto L_0x0010;
    L_0x00eb:
        r10 = s.۟ۤۗ.f20;
        if (r10 > 0) goto L_0x00f2;
    L_0x00ef:
        r10 = "ۚۦۡ";
        goto L_0x0109;
    L_0x00f2:
        r10 = "ۘۛۡ";
        goto L_0x000c;
    L_0x00f6:
        r10 = s.۫ۢ۠.f14;
        if (r10 > 0) goto L_0x00fb;
    L_0x00fa:
        goto L_0x0104;
    L_0x00fb:
        r10 = "ۧۢۡ";
        goto L_0x0109;
    L_0x00fe:
        r10 = s.ۗۢۢ.m454();
        if (r10 < 0) goto L_0x0107;
    L_0x0104:
        r10 = "۫ۥ۠";
        goto L_0x0109;
    L_0x0107:
        r10 = "ۗۤۥ";
    L_0x0109:
        r10 = s.ۢ۫ۗ.m350(r10);
        goto L_0x0010;
    L_0x010f:
        r10 = f83;
        r11 = s.ۡۥۗ.m568();
        if (r11 == 0) goto L_0x011b;
    L_0x0117:
        r10 = "ۧ۫ۛ";
        goto L_0x000c;
    L_0x011b:
        r4 = "ۦۥۡ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r13 = r10;
        r10 = r4;
        r4 = r13;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.getConfig():com.junge.algorithmAidePro.Config.ConfigReader");
    }

    /* DevToolsApp WARNING: Missing block: B:11:0x002c, code:
            if (s.ۙۜۦ.m520() == 0) goto L_0x0102;
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x009d, code:
            r3 = "ۦۗۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x00af, code:
            r3 = "ۦ۬۠";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x00c0, code:
            r3 = "ۢ۟ۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:60:0x00eb, code:
            r3 = s.ۢ۫ۗ.m350(r3);
     */
    public com.junge.algorithmAidePro.db.DaoSession getDbSession(java.lang.String r7) {
        /*
        r6 = this;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = "ۜ۠ۛ";
    L_0x0005:
        r3 = s.ۜۘۡ.m282(r3);
    L_0x0009:
        switch(r3) {
            case 1737939: goto L_0x0047;
            case 1738247: goto L_0x0055;
            case 1739769: goto L_0x004e;
            case 1740117: goto L_0x0028;
            case 1740673: goto L_0x00fc;
            case 1741207: goto L_0x00b2;
            case 1743069: goto L_0x0082;
            case 1743645: goto L_0x003d;
            case 1743831: goto L_0x0109;
            case 1746911: goto L_0x0035;
            case 1747066: goto L_0x00d0;
            case 1747500: goto L_0x00a0;
            case 1749443: goto L_0x00e4;
            case 1749561: goto L_0x00c7;
            case 1749576: goto L_0x0014;
            case 1749934: goto L_0x00da;
            case 1752227: goto L_0x001d;
            case 1752373: goto L_0x00f1;
            case 1753163: goto L_0x0080;
            case 1753601: goto L_0x00ba;
            case 1753663: goto L_0x0030;
            case 1753818: goto L_0x008c;
            case 1758123: goto L_0x006a;
            default: goto L_0x000c;
        };
    L_0x000c:
        r3 = r1.isOpen();
        if (r3 != 0) goto L_0x007d;
    L_0x0012:
        goto L_0x009d;
    L_0x0014:
        s.ۦۡۤ.m396();
        r3 = s.۫۫ۗ.f65;
        if (r3 != 0) goto L_0x010d;
    L_0x001b:
        goto L_0x00d4;
    L_0x001d:
        r3 = s.۬ۨۨ.m730();
        if (r3 == 0) goto L_0x0025;
    L_0x0023:
        goto L_0x0102;
    L_0x0025:
        r3 = "ۘۤۡ";
        goto L_0x0005;
    L_0x0028:
        r3 = s.ۙۜۦ.m520();
        if (r3 != 0) goto L_0x00d4;
    L_0x002e:
        goto L_0x0102;
    L_0x0030:
        s.ۗۜۛ.m698();
        goto L_0x0102;
    L_0x0035:
        s.ۦۢۜ.m16();
        s.۫۫ۗ.m790();
        r7 = 0;
        return r7;
    L_0x003d:
        r3 = r6.daoSession;
        r3 = r3.getDatabase();
        r3.close();
        goto L_0x007a;
    L_0x0047:
        r3 = r6.daoSession;
        r3.clear();
        goto L_0x00af;
    L_0x004e:
        r7 = r2.newSession();
        r6.daoSession = r7;
        return r7;
    L_0x0055:
        r3 = new com.junge.algorithmAidePro.db.DaoMaster;
        r3.<init>(r1);
        r4 = s.ۚۤۙ.f18;
        if (r4 > 0) goto L_0x0060;
    L_0x005e:
        goto L_0x00c0;
    L_0x0060:
        r2 = "ۘۙۚ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r5 = r3;
        r3 = r2;
        r2 = r5;
        goto L_0x0009;
    L_0x006a:
        r3 = r6.daoSession;
        r3 = r3.getDatabase();
        r3 = r3.isOpen();
        if (r3 == 0) goto L_0x007a;
    L_0x0076:
        r3 = "ۜۚۛ";
        goto L_0x00eb;
    L_0x007a:
        r3 = "ۖۜۙ";
        goto L_0x0005;
    L_0x007d:
        r3 = "ۖۦۗ";
        goto L_0x0005;
    L_0x0080:
        r7 = 0;
        return r7;
    L_0x0082:
        r3 = r0.getDatabase();
        if (r3 == 0) goto L_0x00af;
    L_0x0088:
        r3 = "۫ۜۜ";
        goto L_0x0005;
    L_0x008c:
        r3 = getSQLiteDatabase(r6, r7);
        if (r3 == 0) goto L_0x009d;
    L_0x0092:
        r1 = "ۦۗ۬";
        r1 = s.ۜۘۡ.m282(r1);
        r5 = r3;
        r3 = r1;
        r1 = r5;
        goto L_0x0009;
    L_0x009d:
        r3 = "ۦۗۜ";
        goto L_0x00eb;
    L_0x00a0:
        r3 = r6.daoSession;
        if (r3 == 0) goto L_0x00af;
    L_0x00a4:
        r0 = "ۛۦۨ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r5 = r3;
        r3 = r0;
        r0 = r5;
        goto L_0x0009;
    L_0x00af:
        r3 = "ۦ۬۠";
        goto L_0x00eb;
    L_0x00b2:
        r3 = s.۠ۡ۟.f8;
        if (r3 > 0) goto L_0x00b7;
    L_0x00b6:
        goto L_0x0102;
    L_0x00b7:
        r3 = "۠ۚۦ";
        goto L_0x00eb;
    L_0x00ba:
        r3 = s.ۗۢۢ.m454();
        if (r3 < 0) goto L_0x00c4;
    L_0x00c0:
        r3 = "ۢ۟ۥ";
        goto L_0x0005;
    L_0x00c4:
        r3 = "ۙۨۦ";
        goto L_0x00eb;
    L_0x00c7:
        r3 = s.ۙۜۦ.f36;
        if (r3 > 0) goto L_0x00cc;
    L_0x00cb:
        goto L_0x0102;
    L_0x00cc:
        r3 = "ۦۥ۠";
        goto L_0x0005;
    L_0x00d0:
        r3 = s.ۡۘۗ.f2;
        if (r3 == 0) goto L_0x00d7;
    L_0x00d4:
        r3 = "ۦۧ۠";
        goto L_0x00eb;
    L_0x00d7:
        r3 = "ۢ۟ۖ";
        goto L_0x00eb;
    L_0x00da:
        r3 = s.۟ۧۢ.m774();
        if (r3 == 0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x010d;
    L_0x00e1:
        r3 = "۟۫ۦ";
        goto L_0x00eb;
    L_0x00e4:
        r3 = s.ۗ۬۟.f16;
        if (r3 == 0) goto L_0x00e9;
    L_0x00e8:
        goto L_0x0102;
    L_0x00e9:
        r3 = "ۢ۫ۗ";
    L_0x00eb:
        r3 = s.ۢ۫ۗ.m350(r3);
        goto L_0x0009;
    L_0x00f1:
        r3 = s.ۢۜۘ.m255();
        if (r3 > 0) goto L_0x00f8;
    L_0x00f7:
        goto L_0x010d;
    L_0x00f8:
        r3 = "ۢۛۜ";
        goto L_0x0005;
    L_0x00fc:
        r3 = s.ۥۘۧ.m662();
        if (r3 > 0) goto L_0x0105;
    L_0x0102:
        r3 = "۟ۦۦ";
        goto L_0x00eb;
    L_0x0105:
        r3 = "ۥۜ۬";
        goto L_0x0005;
    L_0x0109:
        r3 = s.۟ۥۙ.f52;
        if (r3 == 0) goto L_0x0111;
    L_0x010d:
        r3 = "ۥۘۖ";
        goto L_0x0005;
    L_0x0111:
        r3 = "ۙۗ۟";
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.MyApplication.getDbSession(java.lang.String):com.junge.algorithmAidePro.db.DaoSession");
    }
}
