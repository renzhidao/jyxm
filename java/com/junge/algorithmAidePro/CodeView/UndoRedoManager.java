package com.junge.algorithmAidePro.CodeView;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.activity.a;
import java.util.LinkedList;
import s.ۢ۫ۗ;

public class UndoRedoManager {
    private final EditHistory editHistory;
    private boolean isUndoOrRedo;
    private final TextChangeWatcher textChangeWatcher;
    private final TextView textView;

    public enum ActionType {
        ;
        
        /* renamed from: ۫ۦۚ */
        private static final short[] f73 = null;

        /* DevToolsApp WARNING: Missing block: B:11:0x003a, code:
            r3 = "۠۠ۢ";
     */
        /* DevToolsApp WARNING: Missing block: B:27:0x0098, code:
            r3 = "۟ۤۗ";
     */
        /* DevToolsApp WARNING: Missing block: B:32:0x00b8, code:
            r3 = "ۜۘۧ";
     */
        /* DevToolsApp WARNING: Missing block: B:41:0x00f2, code:
            if (s.ۘۡۜ.m682() < 0) goto L_0x0105;
     */
        /* DevToolsApp WARNING: Missing block: B:45:0x0102, code:
            r3 = "ۤۢ۠";
     */
        /* DevToolsApp WARNING: Missing block: B:46:0x0105, code:
            r3 = "ۢۨ۫";
     */
        /* DevToolsApp WARNING: Missing block: B:48:0x010b, code:
            r3 = s.ۢ۫ۗ.m350(r3);
     */
        static {
            /*
            r0 = 25;
            r0 = new short[r0];
            r0 = {2324, 18288, 18295, 18282, 18300, 18283, 18285, 18301, 18300, 18293, 18300, 18285, 18300, 18281, 18296, 18282, 18285, 18300, 18295, 18294, 18285, 18278, 18301, 18300, 18303};
            f73 = r0;
            r0 = 0;
            r1 = 0;
            r2 = 0;
            r3 = "۬ۢۜ";
        L_0x000e:
            r3 = s.ۜۘۡ.m282(r3);
        L_0x0012:
            switch(r3) {
                case 1743595: goto L_0x00f9;
                case 1746834: goto L_0x00eb;
                case 1746958: goto L_0x00d7;
                case 1747682: goto L_0x0054;
                case 1748839: goto L_0x004e;
                case 1749861: goto L_0x0049;
                case 1751586: goto L_0x003d;
                case 1752243: goto L_0x0038;
                case 1755407: goto L_0x0035;
                case 1759270: goto L_0x0020;
                default: goto L_0x0015;
            };
        L_0x0015:
            r3 = r1 * r1;
            r4 = r0 * 5664;
            r3 = r3 - r4;
            if (r3 < 0) goto L_0x0109;
        L_0x001c:
            r3 = "ۥۘۦ";
            goto L_0x010b;
        L_0x0020:
            r3 = f73;
            r4 = 0;
            r3 = r3[r4];
            r4 = s.۠ۜۗ.f13;
            if (r4 == 0) goto L_0x002b;
        L_0x0029:
            goto L_0x0098;
        L_0x002b:
            r0 = "۟ۨۗ";
            r0 = s.ۜۘۡ.m282(r0);
            r7 = r3;
            r3 = r0;
            r0 = r7;
            goto L_0x0012;
        L_0x0035:
            r2 = 30751; // 0x781f float:4.3091E-41 double:1.5193E-319;
            goto L_0x003a;
        L_0x0038:
            r2 = 18233; // 0x4739 float:2.555E-41 double:9.0083E-320;
        L_0x003a:
            r3 = "۠۠ۢ";
            goto L_0x000e;
        L_0x003d:
            s.ۙۖۥ.m748();
            s.ۜۘۡ.m280();
            r0 = new java.lang.RuntimeException;
            r0.<init>();
            throw r0;
        L_0x0049:
            s.ۚۡۢ.m112();
            goto L_0x0102;
        L_0x004e:
            r3 = s.ۚ۟ۢ.f5;
            if (r3 != 0) goto L_0x00b8;
        L_0x0052:
            goto L_0x0102;
        L_0x0054:
            r3 = new com.junge.algorithmAidePro.CodeView.UndoRedoManager$ActionType;
            r4 = f73;
            r5 = 1;
            r6 = s.ۙۜۦ.m520();
            if (r6 == 0) goto L_0x0060;
        L_0x005f:
            goto L_0x0098;
        L_0x0060:
            r6 = 6;
            r4 = s.ۡۢۡ.m55(r4, r5, r6, r2);
            r5 = s.ۨۘۢ.m318();
            if (r5 == 0) goto L_0x006d;
        L_0x006b:
            goto L_0x00f5;
        L_0x006d:
            r5 = 0;
            r3.<init>(r4, r5);
            INSERT = r3;
            r3 = new com.junge.algorithmAidePro.CodeView.UndoRedoManager$ActionType;
            r4 = s.۠ۡ۟.m140();
            if (r4 > 0) goto L_0x007c;
        L_0x007b:
            goto L_0x0098;
        L_0x007c:
            r4 = f73;
            r5 = 7;
            r6 = 6;
            r4 = s.ۡۗۗ.m157(r4, r5, r6, r2);
            r5 = 1;
            r6 = s.ۗۜ۟.f33;
            if (r6 > 0) goto L_0x008b;
        L_0x0089:
            goto L_0x0102;
        L_0x008b:
            r3.<init>(r4, r5);
            DELETE = r3;
            r3 = new com.junge.algorithmAidePro.CodeView.UndoRedoManager$ActionType;
            r4 = s.۟ۤۗ.m332();
            if (r4 > 0) goto L_0x009c;
        L_0x0098:
            r3 = "۟ۤۗ";
            goto L_0x010b;
        L_0x009c:
            r4 = f73;
            r5 = 13;
            r6 = 5;
            r4 = s.۠ۡۧ.m430(r4, r5, r6, r2);
            r5 = 2;
            r6 = s.ۨۗۥ.f42;
            if (r6 > 0) goto L_0x00ab;
        L_0x00aa:
            goto L_0x00b8;
        L_0x00ab:
            r3.<init>(r4, r5);
            PASTE = r3;
            r3 = new com.junge.algorithmAidePro.CodeView.UndoRedoManager$ActionType;
            r4 = f73;
            r5 = s.ۨۧۚ.f56;
            if (r5 != 0) goto L_0x00bc;
        L_0x00b8:
            r3 = "ۜۘۧ";
            goto L_0x000e;
        L_0x00bc:
            r5 = 18;
            r6 = 7;
            r4 = s.ۥۘۧ.m665(r4, r5, r6, r2);
            r5 = 3;
            r6 = s.ۛۨۦ.m559();
            if (r6 == 0) goto L_0x00cb;
        L_0x00ca:
            goto L_0x00f5;
        L_0x00cb:
            r3.<init>(r4, r5);
            NOT_DEF = r3;
            r0 = $values();
            $VALUES = r0;
            return;
        L_0x00d7:
            r3 = r0 + 1416;
            r4 = s.ۢۜۘ.m255();
            if (r4 > 0) goto L_0x00e0;
        L_0x00df:
            goto L_0x00f5;
        L_0x00e0:
            r1 = "۫ۢۥ";
            r1 = s.ۢ۫ۗ.m350(r1);
            r7 = r3;
            r3 = r1;
            r1 = r7;
            goto L_0x0012;
        L_0x00eb:
            s.ۛ۫ۧ.m593();
            r3 = s.ۘۡۜ.m682();
            if (r3 >= 0) goto L_0x00f5;
        L_0x00f4:
            goto L_0x0105;
        L_0x00f5:
            r3 = "ۡۦ۬";
            goto L_0x000e;
        L_0x00f9:
            s.۠ۜۗ.m214();
            r3 = s.ۛۨۦ.m559();
            if (r3 != 0) goto L_0x0105;
        L_0x0102:
            r3 = "ۤۢ۠";
            goto L_0x010b;
        L_0x0105:
            r3 = "ۢۨ۫";
            goto L_0x000e;
        L_0x0109:
            r3 = "ۨۡۨ";
        L_0x010b:
            r3 = s.ۢ۫ۗ.m350(r3);
            goto L_0x0012;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.ActionType.<clinit>():void");
        }
    }

    public static final class EditHistory {
        private final LinkedList<EditNode> historyList;
        private int maxHistorySize;
        private int position;

        public /* synthetic */ EditHistory(a aVar) {
            this();
        }

        /* DevToolsApp WARNING: Missing block: B:6:0x0019, code:
            if (s.ۜۖۚ.m7() >= 0) goto L_0x00d0;
     */
        /* DevToolsApp WARNING: Missing block: B:8:0x0024, code:
            if (s.۫۫ۗ.m790() == false) goto L_0x00e5;
     */
        /* DevToolsApp WARNING: Missing block: B:10:0x002c, code:
            if (s.ۢ۟ۚ.m168() > 0) goto L_0x00e5;
     */
        /* DevToolsApp WARNING: Missing block: B:20:0x0056, code:
            r3 = "ۖ۬ۡ";
     */
        /* DevToolsApp WARNING: Missing block: B:29:0x008a, code:
            r3 = "ۜ۟ۜ";
     */
        /* DevToolsApp WARNING: Missing block: B:37:0x009e, code:
            r3 = "ۘۗۘ";
     */
        /* DevToolsApp WARNING: Missing block: B:44:0x00b2, code:
            r3 = "۟۬ۛ";
     */
        /* DevToolsApp WARNING: Missing block: B:46:0x00b7, code:
            r3 = s.ۜۘۡ.m282(r3);
     */
        /* DevToolsApp WARNING: Missing block: B:55:0x00d5, code:
            r3 = s.ۢ۫ۗ.m350(r3);
     */
        /* DevToolsApp WARNING: Missing block: B:58:0x00e5, code:
            r3 = "ۧ۠ۖ";
     */
        /* DevToolsApp WARNING: Missing block: B:60:0x00f0, code:
            r4 = r3;
            r3 = r8;
     */
        private void add(com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditNode r10) {
            /*
            r9 = this;
            r0 = 0;
            r1 = 0;
            r2 = 0;
        L_0x0003:
            r3 = "ۢۨۧ";
            r3 = s.ۜۘۡ.m282(r3);
            r4 = 0;
            r5 = 0;
            r6 = 0;
        L_0x000c:
            switch(r3) {
                case 1738443: goto L_0x0043;
                case 1739705: goto L_0x0028;
                case 1742688: goto L_0x005a;
                case 1743649: goto L_0x00bd;
                case 1743801: goto L_0x001d;
                case 1744028: goto L_0x0044;
                case 1746452: goto L_0x007f;
                case 1746730: goto L_0x0030;
                case 1746974: goto L_0x009a;
                case 1747086: goto L_0x0015;
                case 1747400: goto L_0x0090;
                case 1747469: goto L_0x003f;
                case 1749750: goto L_0x006b;
                case 1749857: goto L_0x00db;
                case 1751394: goto L_0x00ae;
                case 1751872: goto L_0x004a;
                case 1754192: goto L_0x00a4;
                case 1754397: goto L_0x0038;
                case 1758624: goto L_0x00ca;
                default: goto L_0x000f;
            };
        L_0x000f:
            r3 = s.۠ۡۧ.f26;
            if (r3 == 0) goto L_0x00c7;
        L_0x0013:
            goto L_0x00d0;
        L_0x0015:
            r3 = s.ۜۖۚ.m7();
            if (r3 < 0) goto L_0x008a;
        L_0x001b:
            goto L_0x00d0;
        L_0x001d:
            s.ۘۡۜ.m682();
            r3 = s.۫۫ۗ.m790();
            if (r3 != 0) goto L_0x009e;
        L_0x0026:
            goto L_0x00e5;
        L_0x0028:
            r3 = s.ۢ۟ۚ.m168();
            if (r3 <= 0) goto L_0x00d0;
        L_0x002e:
            goto L_0x00e5;
        L_0x0030:
            s.ۗۤ۫.m195();
            s.ۧۧۡ.m183();
            goto L_0x00e5;
        L_0x0038:
            s.۠ۡۧ.m431();
            s.۬ۨۨ.m730();
            return;
        L_0x003f:
            r9.trimHistory();
            goto L_0x0056;
        L_0x0043:
            return;
        L_0x0044:
            r3 = r9.historyList;
            r3.removeLast();
            goto L_0x0003;
        L_0x004a:
            r3 = r5 + r6;
            r9.position = r3;
            r3 = r9.maxHistorySize;
            if (r3 < 0) goto L_0x0056;
        L_0x0052:
            r3 = "۠ۙۦ";
            goto L_0x00b7;
        L_0x0056:
            r3 = "ۖ۬ۡ";
            goto L_0x00b7;
        L_0x005a:
            r3 = 1;
            r7 = s.ۙۜۦ.m520();
            if (r7 == 0) goto L_0x0062;
        L_0x0061:
            goto L_0x00b2;
        L_0x0062:
            r6 = "ۤ۫ۧ";
            r6 = s.ۜۘۡ.m282(r6);
            r3 = r6;
            r6 = 1;
            goto L_0x000c;
        L_0x006b:
            r3 = r9.position;
            r7 = s.ۗۢۢ.m454();
            if (r7 < 0) goto L_0x0075;
        L_0x0073:
            goto L_0x00e5;
        L_0x0075:
            r5 = "ۛۚ۟";
            r5 = s.ۜۘۡ.m282(r5);
            r8 = r5;
            r5 = r3;
            goto L_0x00f0;
        L_0x007f:
            r3 = r9.historyList;
            r3.add(r10);
            r3 = s.ۧۧۡ.m183();
            if (r3 > 0) goto L_0x008d;
        L_0x008a:
            r3 = "ۜ۟ۜ";
            goto L_0x00d5;
        L_0x008d:
            r3 = "ۢۥۙ";
            goto L_0x00d5;
        L_0x0090:
            r3 = r9.position;
            if (r4 <= r3) goto L_0x0097;
        L_0x0094:
            r3 = "ۜۦۦ";
            goto L_0x00d5;
        L_0x0097:
            r3 = "۟ۗ۬";
            goto L_0x00b7;
        L_0x009a:
            r3 = s.ۗ۬ۦ.f27;
            if (r3 == 0) goto L_0x00a1;
        L_0x009e:
            r3 = "ۘۗۘ";
            goto L_0x00b7;
        L_0x00a1:
            r3 = "۠ۗ۟";
            goto L_0x00d5;
        L_0x00a4:
            r3 = s.ۨۧۚ.m718();
            if (r3 > 0) goto L_0x00ab;
        L_0x00aa:
            goto L_0x00d0;
        L_0x00ab:
            r3 = "۟ۨۧ";
            goto L_0x00b7;
        L_0x00ae:
            r3 = s.ۗ۠ۚ.f28;
            if (r3 == 0) goto L_0x00b5;
        L_0x00b2:
            r3 = "۟۬ۛ";
            goto L_0x00d5;
        L_0x00b5:
            r3 = "ۧۙۢ";
        L_0x00b7:
            r3 = s.ۜۘۡ.m282(r3);
            goto L_0x000c;
        L_0x00bd:
            r3 = s.ۢ۫ۗ.m342();
            if (r3 != 0) goto L_0x00c4;
        L_0x00c3:
            goto L_0x00d0;
        L_0x00c4:
            r3 = "ۤۜۚ";
            goto L_0x00d5;
        L_0x00c7:
            r3 = "ۜۚ۟";
            goto L_0x00d5;
        L_0x00ca:
            r3 = s.ۢ۟ۚ.m168();
            if (r3 > 0) goto L_0x00d3;
        L_0x00d0:
            r3 = "۟۠۫";
            goto L_0x00b7;
        L_0x00d3:
            r3 = "ۧۛۖ";
        L_0x00d5:
            r3 = s.ۢ۫ۗ.m350(r3);
            goto L_0x000c;
        L_0x00db:
            r3 = r9.historyList;
            r3 = r3.size();
            r7 = s.۫۫ۗ.f65;
            if (r7 == 0) goto L_0x00e8;
        L_0x00e5:
            r3 = "ۧ۠ۖ";
            goto L_0x00b7;
        L_0x00e8:
            r4 = "۫۬ۡ";
            r4 = s.ۜۘۡ.m282(r4);
            r8 = r4;
            r4 = r3;
        L_0x00f0:
            r3 = r8;
            goto L_0x000c;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditHistory.add(com.junge.algorithmAidePro.CodeView.UndoRedoManager$EditNode):void");
        }

        /* DevToolsApp WARNING: Missing block: B:11:0x0027, code:
            if (s.۬ۗ۫.f6 < 0) goto L_0x00a5;
     */
        /* DevToolsApp WARNING: Missing block: B:44:0x008a, code:
            r0 = "ۗۦ۫";
     */
        /* DevToolsApp WARNING: Missing block: B:48:0x0098, code:
            r0 = "ۤ۫ۥ";
     */
        /* DevToolsApp WARNING: Missing block: B:52:0x00a5, code:
            r0 = "ۗۥ۠";
     */
        private void setMaxHistorySize(int r2) {
            /*
            r1 = this;
            r0 = "ۤۥۛ";
        L_0x0002:
            r0 = s.ۢ۫ۗ.m350(r0);
        L_0x0006:
            switch(r0) {
                case 1739002: goto L_0x003b;
                case 1739186: goto L_0x0030;
                case 1739228: goto L_0x001a;
                case 1740345: goto L_0x0011;
                case 1742073: goto L_0x0052;
                case 1743036: goto L_0x003c;
                case 1746472: goto L_0x007b;
                case 1746504: goto L_0x0046;
                case 1746876: goto L_0x0092;
                case 1746968: goto L_0x0073;
                case 1748446: goto L_0x006b;
                case 1749596: goto L_0x0084;
                case 1751674: goto L_0x009f;
                case 1751870: goto L_0x002b;
                case 1752850: goto L_0x005f;
                case 1755111: goto L_0x0037;
                case 1758417: goto L_0x0025;
                default: goto L_0x0009;
            };
        L_0x0009:
            r0 = s.ۗ۬ۦ.m407();
            if (r0 != 0) goto L_0x005c;
        L_0x000f:
            goto L_0x00a5;
        L_0x0011:
            s.ۤۤۖ.m506();
            r0 = s.ۗ۠ۚ.f28;
            if (r0 != 0) goto L_0x008a;
        L_0x0018:
            goto L_0x00a5;
        L_0x001a:
            r0 = s.۟ۧۢ.m774();
            if (r0 == 0) goto L_0x0022;
        L_0x0020:
            goto L_0x00a5;
        L_0x0022:
            r0 = "۫ۥ۫";
            goto L_0x0002;
        L_0x0025:
            r0 = s.۬ۗ۫.f6;
            if (r0 >= 0) goto L_0x0098;
        L_0x0029:
            goto L_0x00a5;
        L_0x002b:
            s.ۗ۠ۚ.m442();
            goto L_0x00a5;
        L_0x0030:
            s.ۨۧۜ.m755();
            s.ۙۖۥ.m748();
            return;
        L_0x0037:
            r1.trimHistory();
            goto L_0x0043;
        L_0x003b:
            return;
        L_0x003c:
            r1.maxHistorySize = r2;
            if (r2 < 0) goto L_0x0043;
        L_0x0040:
            r0 = "ۨۘۗ";
            goto L_0x004d;
        L_0x0043:
            r0 = "ۗ۟ۢ";
            goto L_0x0002;
        L_0x0046:
            r0 = s.ۖۜ۟.f34;
            if (r0 < 0) goto L_0x004b;
        L_0x004a:
            goto L_0x0065;
        L_0x004b:
            r0 = "ۛۥۦ";
        L_0x004d:
            r0 = s.ۜۘۡ.m282(r0);
            goto L_0x0006;
        L_0x0052:
            r0 = s.ۥۥۚ.m614();
            if (r0 > 0) goto L_0x0059;
        L_0x0058:
            goto L_0x0065;
        L_0x0059:
            r0 = "۟ۙۢ";
            goto L_0x0002;
        L_0x005c:
            r0 = "ۚۥۤ";
            goto L_0x0002;
        L_0x005f:
            r0 = s.ۧۧۡ.m183();
            if (r0 > 0) goto L_0x0068;
        L_0x0065:
            r0 = "ۘ۫۬";
            goto L_0x0002;
        L_0x0068:
            r0 = "ۗۘۢ";
            goto L_0x0002;
        L_0x006b:
            r0 = s.ۥۥۚ.f50;
            if (r0 == 0) goto L_0x0070;
        L_0x006f:
            goto L_0x0098;
        L_0x0070:
            r0 = "ۥ۬ۙ";
            goto L_0x0002;
        L_0x0073:
            r0 = s.ۧۧۡ.f11;
            if (r0 != 0) goto L_0x0078;
        L_0x0077:
            goto L_0x008a;
        L_0x0078:
            r0 = "ۡۚۗ";
            goto L_0x0002;
        L_0x007b:
            r0 = s.ۡۢۡ.f3;
            if (r0 < 0) goto L_0x0080;
        L_0x007f:
            goto L_0x008a;
        L_0x0080:
            r0 = "۟ۨۡ";
            goto L_0x0002;
        L_0x0084:
            r0 = s.ۗۢۢ.m454();
            if (r0 < 0) goto L_0x008e;
        L_0x008a:
            r0 = "ۗۦ۫";
            goto L_0x0002;
        L_0x008e:
            r0 = "۟ۘۡ";
            goto L_0x0002;
        L_0x0092:
            r0 = s.ۡۢۡ.m58();
            if (r0 == 0) goto L_0x009b;
        L_0x0098:
            r0 = "ۤ۫ۥ";
            goto L_0x004d;
        L_0x009b:
            r0 = "ۢ۠ۚ";
            goto L_0x0002;
        L_0x009f:
            r0 = s.ۤۤۖ.m506();
            if (r0 == 0) goto L_0x00a8;
        L_0x00a5:
            r0 = "ۗۥ۠";
            goto L_0x004d;
        L_0x00a8:
            r0 = "۟ۥۢ";
            goto L_0x0002;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditHistory.setMaxHistorySize(int):void");
        }

        /* DevToolsApp WARNING: Missing block: B:5:0x0012, code:
            if (s.ۢ۟ۚ.m168() <= 0) goto L_0x002f;
     */
        /* DevToolsApp WARNING: Missing block: B:7:0x001c, code:
            if (s.ۖۜ۟.m492() != false) goto L_0x005e;
     */
        /* DevToolsApp WARNING: Missing block: B:9:0x0026, code:
            if (s.ۢ۫ۜ.m625() >= 0) goto L_0x002f;
     */
        /* DevToolsApp WARNING: Missing block: B:11:0x002f, code:
            r2 = "ۛۜۜ";
     */
        /* DevToolsApp WARNING: Missing block: B:21:0x005e, code:
            r2 = "ۖۜ۬";
     */
        /* DevToolsApp WARNING: Missing block: B:26:0x006c, code:
            r2 = "ۚۤ۬";
     */
        /* DevToolsApp WARNING: Missing block: B:40:0x0090, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
        /* DevToolsApp WARNING: Missing block: B:53:0x00b6, code:
            r2 = "ۡ۫ۖ";
     */
        /* DevToolsApp WARNING: Missing block: B:55:0x00bb, code:
            r2 = s.ۜۘۡ.m282(r2);
     */
        /* DevToolsApp WARNING: Missing block: B:58:0x00cb, code:
            r2 = "۬ۢۜ";
     */
        /* DevToolsApp WARNING: Missing block: B:60:0x00d6, code:
            r3 = r2;
            r2 = r6;
     */
        private void trimHistory() {
            /*
            r7 = this;
            r0 = 0;
            r1 = 0;
        L_0x0002:
            r2 = "ۡ۟ۢ";
            r2 = s.ۜۘۡ.m282(r2);
            r3 = 0;
            r4 = 0;
        L_0x000a:
            switch(r2) {
                case 1737958: goto L_0x0029;
                case 1738205: goto L_0x003a;
                case 1740053: goto L_0x0055;
                case 1740831: goto L_0x0081;
                case 1741302: goto L_0x00a8;
                case 1741701: goto L_0x00b0;
                case 1741730: goto L_0x003e;
                case 1742742: goto L_0x000e;
                case 1742747: goto L_0x0033;
                case 1743254: goto L_0x0079;
                case 1743866: goto L_0x0096;
                case 1748494: goto L_0x006f;
                case 1748612: goto L_0x00c1;
                case 1748972: goto L_0x001f;
                case 1751702: goto L_0x009e;
                case 1753516: goto L_0x0043;
                case 1753701: goto L_0x0065;
                case 1759270: goto L_0x0015;
                case 1759375: goto L_0x0089;
                default: goto L_0x000d;
            };
        L_0x000d:
            return;
        L_0x000e:
            r2 = s.ۢ۟ۚ.m168();
            if (r2 > 0) goto L_0x00cb;
        L_0x0014:
            goto L_0x002f;
        L_0x0015:
            s.۬ۨۨ.m730();
            r2 = s.ۖۜ۟.m492();
            if (r2 == 0) goto L_0x00b6;
        L_0x001e:
            goto L_0x005e;
        L_0x001f:
            s.ۡۘۗ.m32();
            r2 = s.ۢ۫ۜ.m625();
            if (r2 < 0) goto L_0x005e;
        L_0x0028:
            goto L_0x002f;
        L_0x0029:
            s.ۢۜۘ.m255();
            s.ۥۘۧ.m662();
        L_0x002f:
            r2 = "ۛۜۜ";
            goto L_0x0090;
        L_0x0033:
            s.ۤۗۛ.m370();
            s.ۜۘۡ.m280();
            return;
        L_0x003a:
            r2 = 0;
            r7.position = r2;
            goto L_0x006c;
        L_0x003e:
            r4 = r4 + -1;
            r7.position = r4;
            goto L_0x0002;
        L_0x0043:
            r2 = r7.position;
            r5 = s.۟ۤۗ.f20;
            if (r5 > 0) goto L_0x004b;
        L_0x0049:
            goto L_0x00a2;
        L_0x004b:
            r4 = "ۚۚۢ";
            r4 = s.ۜۘۡ.m282(r4);
            r6 = r4;
            r4 = r2;
            goto L_0x00d6;
        L_0x0055:
            r2 = r7.historyList;
            r2.removeFirst();
            r2 = s.ۜۖۚ.f0;
            if (r2 < 0) goto L_0x0061;
        L_0x005e:
            r2 = "ۖۜ۬";
            goto L_0x0090;
        L_0x0061:
            r2 = "ۦۢۨ";
            goto L_0x00bb;
        L_0x0065:
            r2 = r7.position;
            if (r2 >= 0) goto L_0x006c;
        L_0x0069:
            r2 = "ۖۤ۫";
            goto L_0x00bb;
        L_0x006c:
            r2 = "ۚۤ۬";
            goto L_0x0090;
        L_0x006f:
            r2 = r7.maxHistorySize;
            if (r3 <= r2) goto L_0x0076;
        L_0x0073:
            r2 = "ۘۢ۟";
            goto L_0x0090;
        L_0x0076:
            r2 = "ۦۨۧ";
            goto L_0x0090;
        L_0x0079:
            r2 = s.ۤۗۛ.f24;
            if (r2 == 0) goto L_0x007e;
        L_0x007d:
            goto L_0x00a2;
        L_0x007e:
            r2 = "ۡۛۨ";
            goto L_0x0090;
        L_0x0081:
            r2 = s.ۨۧۜ.f59;
            if (r2 == 0) goto L_0x0086;
        L_0x0085:
            goto L_0x00b6;
        L_0x0086:
            r2 = "ۛ۬ۧ";
            goto L_0x0090;
        L_0x0089:
            r2 = s.ۗۗۡ.f4;
            if (r2 != 0) goto L_0x008e;
        L_0x008d:
            goto L_0x00cb;
        L_0x008e:
            r2 = "ۙۜۢ";
        L_0x0090:
            r2 = s.ۢ۫ۗ.m350(r2);
            goto L_0x000a;
        L_0x0096:
            r2 = s.۫ۢ۠.f14;
            if (r2 > 0) goto L_0x009b;
        L_0x009a:
            goto L_0x00b6;
        L_0x009b:
            r2 = "۬ۥۨ";
            goto L_0x00bb;
        L_0x009e:
            r2 = s.۠ۜۗ.f13;
            if (r2 == 0) goto L_0x00a5;
        L_0x00a2:
            r2 = "ۛۜۗ";
            goto L_0x0090;
        L_0x00a5:
            r2 = "ۜۡ۟";
            goto L_0x00bb;
        L_0x00a8:
            r2 = s.ۡۘۗ.f2;
            if (r2 == 0) goto L_0x00ad;
        L_0x00ac:
            goto L_0x00cb;
        L_0x00ad:
            r2 = "ۤۦۘ";
            goto L_0x00bb;
        L_0x00b0:
            r2 = s.۟ۤۗ.m332();
            if (r2 > 0) goto L_0x00b9;
        L_0x00b6:
            r2 = "ۡ۫ۖ";
            goto L_0x00bb;
        L_0x00b9:
            r2 = "ۙ۫ۨ";
        L_0x00bb:
            r2 = s.ۜۘۡ.m282(r2);
            goto L_0x000a;
        L_0x00c1:
            r2 = r7.historyList;
            r2 = r2.size();
            r5 = s.۬ۨۨ.f57;
            if (r5 == 0) goto L_0x00ce;
        L_0x00cb:
            r2 = "۬ۢۜ";
            goto L_0x0090;
        L_0x00ce:
            r3 = "ۚۙۤ";
            r3 = s.ۢ۫ۗ.m350(r3);
            r6 = r3;
            r3 = r2;
        L_0x00d6:
            r2 = r6;
            goto L_0x000a;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditHistory.trimHistory():void");
        }

        /* DevToolsApp WARNING: Missing block: B:4:0x0012, code:
            if (s.ۡۥۗ.f47 == false) goto L_0x00a1;
     */
        /* DevToolsApp WARNING: Missing block: B:6:0x001d, code:
            if (s.ۗۗۡ.m78() != false) goto L_0x0028;
     */
        /* DevToolsApp WARNING: Missing block: B:8:0x0024, code:
            if (s.ۖۜ۟.m492() != false) goto L_0x00a1;
     */
        /* DevToolsApp WARNING: Missing block: B:9:0x0028, code:
            r4 = "ۗۥۦ";
     */
        /* DevToolsApp WARNING: Missing block: B:35:0x0081, code:
            r4 = "ۨۜۧ";
     */
        /* DevToolsApp WARNING: Missing block: B:50:0x00b2, code:
            r4 = "ۗۦۚ";
     */
        private com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditNode getCurrent() {
            /*
            r8 = this;
            r0 = 0;
            r1 = 0;
            r2 = 0;
            r3 = 0;
            r4 = "ۖۧۨ";
        L_0x0006:
            r4 = s.ۜۘۡ.m282(r4);
        L_0x000a:
            switch(r4) {
                case 1738206: goto L_0x007d;
                case 1738295: goto L_0x00c2;
                case 1739211: goto L_0x0020;
                case 1739779: goto L_0x00a9;
                case 1741980: goto L_0x003e;
                case 1742091: goto L_0x0065;
                case 1742286: goto L_0x0051;
                case 1742992: goto L_0x006f;
                case 1746510: goto L_0x005b;
                case 1746684: goto L_0x0088;
                case 1747086: goto L_0x0091;
                case 1748848: goto L_0x002b;
                case 1749303: goto L_0x0037;
                case 1752475: goto L_0x009d;
                case 1753250: goto L_0x0030;
                case 1755251: goto L_0x0016;
                case 1758506: goto L_0x0035;
                default: goto L_0x000d;
            };
        L_0x000d:
            s.ۗۢۢ.m454();
            r4 = s.ۡۥۗ.f47;
            if (r4 != 0) goto L_0x0095;
        L_0x0014:
            goto L_0x00a1;
        L_0x0016:
            s.ۦۢۜ.m16();
            r4 = s.ۗۗۡ.m78();
            if (r4 == 0) goto L_0x00b2;
        L_0x001f:
            goto L_0x0028;
        L_0x0020:
            r4 = s.ۖۜ۟.m492();
            if (r4 == 0) goto L_0x0028;
        L_0x0026:
            goto L_0x00a1;
        L_0x0028:
            r4 = "ۗۥۦ";
            goto L_0x0006;
        L_0x002b:
            s.۬ۨۨ.m730();
            goto L_0x00a1;
        L_0x0030:
            s.ۚۡۢ.m112();
            r0 = 0;
            return r0;
        L_0x0035:
            r0 = 0;
            return r0;
        L_0x0037:
            r0 = r1.get(r3);
            r0 = (com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditNode) r0;
            return r0;
        L_0x003e:
            r4 = r0 + r2;
            r5 = s.ۘۡۜ.m682();
            if (r5 < 0) goto L_0x0047;
        L_0x0046:
            goto L_0x0081;
        L_0x0047:
            r3 = "ۢۖ۫";
            r3 = s.ۜۘۡ.m282(r3);
            r7 = r4;
            r4 = r3;
            r3 = r7;
            goto L_0x000a;
        L_0x0051:
            r4 = s.۫ۢ۠.m237();
            if (r4 < 0) goto L_0x0058;
        L_0x0057:
            goto L_0x0081;
        L_0x0058:
            r4 = "ۚۢۤ";
            goto L_0x0078;
        L_0x005b:
            r4 = s.ۚ۟ۢ.m85();
            if (r4 == 0) goto L_0x0062;
        L_0x0061:
            goto L_0x0095;
        L_0x0062:
            r4 = "ۚ۬۠";
            goto L_0x0078;
        L_0x0065:
            r4 = s.ۦۢۜ.m16();
            if (r4 == 0) goto L_0x006c;
        L_0x006b:
            goto L_0x0095;
        L_0x006c:
            r4 = "۟ۙۨ";
            goto L_0x0006;
        L_0x006f:
            r4 = s.۠ۡ۟.m140();
            if (r4 > 0) goto L_0x0076;
        L_0x0075:
            goto L_0x00b2;
        L_0x0076:
            r4 = "ۚۦۗ";
        L_0x0078:
            r4 = s.ۢ۫ۗ.m350(r4);
            goto L_0x000a;
        L_0x007d:
            r4 = s.ۗۢۢ.f29;
            if (r4 < 0) goto L_0x0084;
        L_0x0081:
            r4 = "ۨۜۧ";
            goto L_0x0078;
        L_0x0084:
            r4 = "ۛۤۙ";
            goto L_0x0006;
        L_0x0088:
            r4 = s.ۗ۬ۦ.f27;
            if (r4 == 0) goto L_0x008d;
        L_0x008c:
            goto L_0x00a1;
        L_0x008d:
            r4 = "ۖۤ۬";
            goto L_0x0006;
        L_0x0091:
            r4 = s.ۨۗۥ.f42;
            if (r4 > 0) goto L_0x0099;
        L_0x0095:
            r4 = "ۡۧۖ";
            goto L_0x0006;
        L_0x0099:
            r4 = "۟۟ۜ";
            goto L_0x0006;
        L_0x009d:
            r4 = s.ۗۢۢ.f29;
            if (r4 < 0) goto L_0x00a5;
        L_0x00a1:
            r4 = "ۦۚۖ";
            goto L_0x0006;
        L_0x00a5:
            r4 = "۟۬ۛ";
            goto L_0x0006;
        L_0x00a9:
            r4 = r8.historyList;
            r5 = -1;
            r6 = s.۟ۧۢ.m774();
            if (r6 == 0) goto L_0x00b6;
        L_0x00b2:
            r4 = "ۗۦۚ";
            goto L_0x0006;
        L_0x00b6:
            r1 = "ۥ۠ۖ";
            r1 = s.ۜۘۡ.m282(r1);
            r2 = -1;
            r7 = r4;
            r4 = r1;
            r1 = r7;
            goto L_0x000a;
        L_0x00c2:
            r4 = r8.position;
            if (r4 != 0) goto L_0x00c9;
        L_0x00c6:
            r4 = "۫ۨۧ";
            goto L_0x0078;
        L_0x00c9:
            r0 = "ۘۙۤ";
            r0 = s.ۢ۫ۗ.m350(r0);
            r7 = r4;
            r4 = r0;
            r0 = r7;
            goto L_0x000a;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditHistory.getCurrent():com.junge.algorithmAidePro.CodeView.UndoRedoManager$EditNode");
        }

        /* DevToolsApp WARNING: Missing block: B:6:0x001a, code:
            if (s.۬ۨۨ.m730() == 0) goto L_0x0028;
     */
        /* DevToolsApp WARNING: Missing block: B:9:0x0028, code:
            r1 = "ۛۖۛ";
     */
        /* DevToolsApp WARNING: Missing block: B:31:0x0082, code:
            r1 = "ۤۙۦ";
     */
        /* DevToolsApp WARNING: Missing block: B:38:0x0096, code:
            r1 = "ۥ۫ۤ";
     */
        /* DevToolsApp WARNING: Missing block: B:49:0x00bc, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
        private EditHistory() {
            /*
            r3 = this;
            r0 = 0;
            r3.<init>();
            r1 = "ۜۜۨ";
        L_0x0006:
            r1 = s.ۢ۫ۗ.m350(r1);
        L_0x000a:
            switch(r1) {
                case 1737823: goto L_0x0088;
                case 1738773: goto L_0x009c;
                case 1740199: goto L_0x0050;
                case 1740732: goto L_0x0074;
                case 1742560: goto L_0x002c;
                case 1743720: goto L_0x00ad;
                case 1749386: goto L_0x005b;
                case 1751313: goto L_0x001d;
                case 1752559: goto L_0x007e;
                case 1752830: goto L_0x0037;
                case 1753313: goto L_0x0092;
                case 1755244: goto L_0x006c;
                case 1755255: goto L_0x0048;
                case 1758933: goto L_0x003c;
                case 1759056: goto L_0x0013;
                default: goto L_0x000d;
            };
        L_0x000d:
            r1 = s.ۗۤ۫.f12;
            if (r1 == 0) goto L_0x00a9;
        L_0x0011:
            goto L_0x00a5;
        L_0x0013:
            s.۟ۤۗ.m332();
            r1 = s.۬ۨۨ.m730();
            if (r1 != 0) goto L_0x0082;
        L_0x001c:
            goto L_0x0028;
        L_0x001d:
            s.۟ۤۗ.m332();
            r1 = s.ۗ۠ۚ.m442();
            if (r1 > 0) goto L_0x0028;
        L_0x0026:
            goto L_0x00a5;
        L_0x0028:
            r1 = "ۛۖۛ";
            goto L_0x00bc;
        L_0x002c:
            s.ۢ۫ۗ.m342();
            r1 = s.ۖۜ۟.m492();
            if (r1 == 0) goto L_0x0096;
        L_0x0035:
            goto L_0x00a5;
        L_0x0037:
            s.ۙۜۦ.m520();
            goto L_0x00a5;
        L_0x003c:
            s.ۚۡۢ.m112();
            s.ۙۜۦ.m520();
            r0 = new java.lang.RuntimeException;
            r0.<init>();
            throw r0;
        L_0x0048:
            r0 = new java.util.LinkedList;
            r0.<init>();
            r3.historyList = r0;
            return;
        L_0x0050:
            r3.maxHistorySize = r0;
            r1 = s.۠ۡ۟.f8;
            if (r1 > 0) goto L_0x0058;
        L_0x0056:
            goto L_0x00b6;
        L_0x0058:
            r1 = "ۨۜ۫";
            goto L_0x0006;
        L_0x005b:
            r1 = -1;
            r2 = s.ۥۥۚ.m614();
            if (r2 > 0) goto L_0x0063;
        L_0x0062:
            goto L_0x00b6;
        L_0x0063:
            r0 = "ۘۧۖ";
            r0 = s.ۜۘۡ.m282(r0);
            r1 = r0;
            r0 = -1;
            goto L_0x000a;
        L_0x006c:
            r1 = s.ۡۥۗ.f47;
            if (r1 == 0) goto L_0x0071;
        L_0x0070:
            goto L_0x00b6;
        L_0x0071:
            r1 = "ۢۙۡ";
            goto L_0x00bc;
        L_0x0074:
            r1 = s.ۨۧۚ.m718();
            if (r1 > 0) goto L_0x007b;
        L_0x007a:
            goto L_0x00b6;
        L_0x007b:
            r1 = "ۨۜ۠";
            goto L_0x0006;
        L_0x007e:
            r1 = s.۟ۤۗ.f20;
            if (r1 > 0) goto L_0x0085;
        L_0x0082:
            r1 = "ۤۙۦ";
            goto L_0x00bc;
        L_0x0085:
            r1 = "ۙۙۜ";
            goto L_0x00bc;
        L_0x0088:
            r1 = s.ۦۡۤ.m396();
            if (r1 == 0) goto L_0x008f;
        L_0x008e:
            goto L_0x00a5;
        L_0x008f:
            r1 = "ۥۢ۬";
            goto L_0x00bc;
        L_0x0092:
            r1 = s.ۛ۫ۧ.f49;
            if (r1 != 0) goto L_0x0099;
        L_0x0096:
            r1 = "ۥ۫ۤ";
            goto L_0x00bc;
        L_0x0099:
            r1 = "ۖۘۡ";
            goto L_0x00bc;
        L_0x009c:
            r1 = s.ۗۗۡ.f4;
            if (r1 != 0) goto L_0x00a1;
        L_0x00a0:
            goto L_0x00a5;
        L_0x00a1:
            r1 = "ۦۜۗ";
            goto L_0x0006;
        L_0x00a5:
            r1 = "۬ۗ۠";
            goto L_0x0006;
        L_0x00a9:
            r1 = "ۗۘۖ";
            goto L_0x0006;
        L_0x00ad:
            r1 = 0;
            r3.position = r1;
            r1 = s.ۢ۫ۗ.m342();
            if (r1 != 0) goto L_0x00ba;
        L_0x00b6:
            r1 = "۬ۛ۟";
            goto L_0x0006;
        L_0x00ba:
            r1 = "ۖۚۡ";
        L_0x00bc:
            r1 = s.ۜۘۡ.m282(r1);
            goto L_0x000a;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditHistory.<init>():void");
        }

        /* DevToolsApp WARNING: Missing block: B:6:0x0017, code:
            if (s.ۚ۟ۢ.m85() == 0) goto L_0x008c;
     */
        /* DevToolsApp WARNING: Missing block: B:35:0x0070, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
        /* DevToolsApp WARNING: Missing block: B:36:0x0075, code:
            r1 = "ۙۘۗ";
     */
        /* DevToolsApp WARNING: Missing block: B:44:0x008c, code:
            r1 = "ۜۧۘ";
     */
        private void clear() {
            /*
            r3 = this;
            r0 = 0;
            r1 = "۟ۤۡ";
        L_0x0003:
            r1 = s.ۢ۫ۗ.m350(r1);
        L_0x0007:
            switch(r1) {
                case 1737922: goto L_0x0051;
                case 1738287: goto L_0x0069;
                case 1739093: goto L_0x0086;
                case 1740696: goto L_0x001b;
                case 1742125: goto L_0x0059;
                case 1744045: goto L_0x002a;
                case 1746715: goto L_0x003b;
                case 1746844: goto L_0x0093;
                case 1749716: goto L_0x0047;
                case 1751253: goto L_0x0035;
                case 1752528: goto L_0x002e;
                case 1754583: goto L_0x0010;
                case 1755363: goto L_0x0023;
                case 1758098: goto L_0x007b;
                case 1758629: goto L_0x0061;
                default: goto L_0x000a;
            };
        L_0x000a:
            r1 = s.۬ۗ۫.f6;
            if (r1 < 0) goto L_0x0078;
        L_0x000e:
            goto L_0x0075;
        L_0x0010:
            s.ۖۜ۟.m492();
            r1 = s.ۚ۟ۢ.m85();
            if (r1 != 0) goto L_0x0075;
        L_0x0019:
            goto L_0x008c;
        L_0x001b:
            r1 = s.ۚ۟ۢ.m85();
            if (r1 != 0) goto L_0x0098;
        L_0x0021:
            goto L_0x008c;
        L_0x0023:
            r1 = s.ۥۘۧ.m662();
            if (r1 <= 0) goto L_0x008c;
        L_0x0029:
            goto L_0x007f;
        L_0x002a:
            s.ۗۜۛ.m698();
            goto L_0x007f;
        L_0x002e:
            s.ۗۤ۫.m195();
            s.ۛۨۦ.m559();
            return;
        L_0x0035:
            r0 = r3.historyList;
            r0.clear();
            return;
        L_0x003b:
            r3.position = r0;
            r1 = s.ۚۡۢ.f7;
            if (r1 != 0) goto L_0x0044;
        L_0x0041:
            r1 = "ۧۦۖ";
            goto L_0x0070;
        L_0x0044:
            r1 = "ۤۗۨ";
            goto L_0x0070;
        L_0x0047:
            r1 = s.ۙۖۥ.m748();
            if (r1 > 0) goto L_0x004e;
        L_0x004d:
            goto L_0x0075;
        L_0x004e:
            r1 = "۟۠ۜ";
            goto L_0x0070;
        L_0x0051:
            r1 = s.۬۟ۜ.f23;
            if (r1 != 0) goto L_0x0056;
        L_0x0055:
            goto L_0x007f;
        L_0x0056:
            r1 = "ۢۤۖ";
            goto L_0x0003;
        L_0x0059:
            r1 = s.ۢ۫ۗ.f21;
            if (r1 == 0) goto L_0x005e;
        L_0x005d:
            goto L_0x0075;
        L_0x005e:
            r1 = "ۖۛۧ";
            goto L_0x0070;
        L_0x0061:
            r1 = s.۟ۤۗ.f20;
            if (r1 > 0) goto L_0x0066;
        L_0x0065:
            goto L_0x007f;
        L_0x0066:
            r1 = "ۚۧۚ";
            goto L_0x0003;
        L_0x0069:
            r1 = s.۟ۥۙ.f52;
            if (r1 == 0) goto L_0x006e;
        L_0x006d:
            goto L_0x0098;
        L_0x006e:
            r1 = "۫۬ۦ";
        L_0x0070:
            r1 = s.ۜۘۡ.m282(r1);
            goto L_0x0007;
        L_0x0075:
            r1 = "ۙۘۗ";
            goto L_0x0070;
        L_0x0078:
            r1 = "ۖۧ۠";
            goto L_0x0003;
        L_0x007b:
            r1 = s.۫ۢ۠.f14;
            if (r1 > 0) goto L_0x0082;
        L_0x007f:
            r1 = "ۥۡ۬";
            goto L_0x0003;
        L_0x0082:
            r1 = "ۥ۠ۜ";
            goto L_0x0003;
        L_0x0086:
            r1 = s.ۥۥۚ.m614();
            if (r1 > 0) goto L_0x008f;
        L_0x008c:
            r1 = "ۜۧۘ";
            goto L_0x0070;
        L_0x008f:
            r1 = "۫ۛۢ";
            goto L_0x0003;
        L_0x0093:
            r1 = 0;
            r2 = s.ۗۜ۟.f33;
            if (r2 > 0) goto L_0x009c;
        L_0x0098:
            r1 = "ۨ۠ۛ";
            goto L_0x0003;
        L_0x009c:
            r0 = "ۗۢ۠";
            r0 = s.ۢ۫ۗ.m350(r0);
            r1 = r0;
            r0 = 0;
            goto L_0x0007;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditHistory.clear():void");
        }

        /* DevToolsApp WARNING: Missing block: B:8:0x0025, code:
            if (s.ۜۖۚ.f0 >= 0) goto L_0x00d8;
     */
        /* DevToolsApp WARNING: Missing block: B:10:0x0030, code:
            if (s.۠ۜۗ.m214() > 0) goto L_0x00b6;
     */
        /* DevToolsApp WARNING: Missing block: B:24:0x0071, code:
            r7 = "۠۟۠";
     */
        /* DevToolsApp WARNING: Missing block: B:28:0x0088, code:
            r7 = "۬ۡۘ";
     */
        /* DevToolsApp WARNING: Missing block: B:47:0x00ce, code:
            r7 = s.ۜۘۡ.m282(r7);
     */
        /* DevToolsApp WARNING: Missing block: B:54:0x00e8, code:
            r7 = "ۧ۟ۙ";
     */
        private com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditNode getNext() {
            /*
            r11 = this;
            r0 = 0;
            r1 = 0;
            r2 = 0;
            r3 = 0;
            r4 = 0;
            r5 = 0;
            r6 = 0;
            r7 = "ۜۛۡ";
        L_0x0009:
            r7 = s.ۢ۫ۗ.m350(r7);
        L_0x000d:
            switch(r7) {
                case 1738324: goto L_0x0044;
                case 1741200: goto L_0x0069;
                case 1743682: goto L_0x00e0;
                case 1747649: goto L_0x0029;
                case 1747812: goto L_0x0098;
                case 1748395: goto L_0x0034;
                case 1748448: goto L_0x00b0;
                case 1748823: goto L_0x00d4;
                case 1749862: goto L_0x0046;
                case 1751252: goto L_0x0055;
                case 1751369: goto L_0x00c7;
                case 1754161: goto L_0x00a7;
                case 1754247: goto L_0x007e;
                case 1754369: goto L_0x0020;
                case 1755251: goto L_0x00bd;
                case 1758263: goto L_0x003c;
                case 1759235: goto L_0x0019;
                default: goto L_0x0010;
            };
        L_0x0010:
            r7 = r11.position;
            r8 = 1;
            r9 = s.ۡۗۗ.f9;
            if (r9 != 0) goto L_0x004a;
        L_0x0017:
            goto L_0x00e8;
        L_0x0019:
            r7 = s.ۤۗۛ.m370();
            if (r7 < 0) goto L_0x00e8;
        L_0x001f:
            goto L_0x0071;
        L_0x0020:
            s.ۢ۫ۗ.m342();
            r7 = s.ۜۖۚ.f0;
            if (r7 < 0) goto L_0x0071;
        L_0x0027:
            goto L_0x00d8;
        L_0x0029:
            s.ۗۜ۟.m469();
            r7 = s.۠ۜۗ.m214();
            if (r7 <= 0) goto L_0x00d8;
        L_0x0032:
            goto L_0x00b6;
        L_0x0034:
            s.ۥۥۚ.m614();
            s.ۨۗۥ.m536();
            goto L_0x00b6;
        L_0x003c:
            s.۟ۥۙ.m650();
            s.ۖۙۜ.m589();
            r0 = 0;
            return r0;
        L_0x0044:
            r0 = 0;
            return r0;
        L_0x0046:
            r5 = r5 + r6;
            r11.position = r5;
            return r4;
        L_0x004a:
            r5 = "ۢۨ۬";
            r5 = s.ۜۘۡ.m282(r5);
            r6 = 1;
            r10 = r7;
            r7 = r5;
            r5 = r10;
            goto L_0x000d;
        L_0x0055:
            r7 = r3;
            r7 = (com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditNode) r7;
            r8 = s.ۥۘۧ.m662();
            if (r8 > 0) goto L_0x005f;
        L_0x005e:
            goto L_0x0088;
        L_0x005f:
            r4 = "۠ۙۛ";
            r4 = s.ۢ۫ۗ.m350(r4);
            r10 = r7;
            r7 = r4;
            r4 = r10;
            goto L_0x000d;
        L_0x0069:
            r7 = r1.get(r2);
            r8 = s.۠ۡۧ.f26;
            if (r8 == 0) goto L_0x0074;
        L_0x0071:
            r7 = "۠۟۠";
            goto L_0x0009;
        L_0x0074:
            r3 = "ۤۗۧ";
            r3 = s.ۜۘۡ.m282(r3);
            r10 = r7;
            r7 = r3;
            r3 = r10;
            goto L_0x000d;
        L_0x007e:
            r7 = r11.historyList;
            r8 = r11.position;
            r9 = s.ۧۧۡ.m183();
            if (r9 > 0) goto L_0x008c;
        L_0x0088:
            r7 = "۬ۡۘ";
            goto L_0x0009;
        L_0x008c:
            r1 = "ۙۨ۟";
            r1 = s.ۜۘۡ.m282(r1);
            r2 = r8;
            r10 = r7;
            r7 = r1;
            r1 = r10;
            goto L_0x000d;
        L_0x0098:
            r7 = r11.historyList;
            r7 = r7.size();
            if (r0 < r7) goto L_0x00a4;
        L_0x00a0:
            r7 = "ۖۨۦ";
            goto L_0x0009;
        L_0x00a4:
            r7 = "ۧۛۛ";
            goto L_0x00ce;
        L_0x00a7:
            r7 = s.ۗۢۢ.f29;
            if (r7 < 0) goto L_0x00ac;
        L_0x00ab:
            goto L_0x00d8;
        L_0x00ac:
            r7 = "۠ۤۨ";
            goto L_0x0009;
        L_0x00b0:
            r7 = s.ۗ۬۟.m257();
            if (r7 > 0) goto L_0x00ba;
        L_0x00b6:
            r7 = "۫۠۬";
            goto L_0x0009;
        L_0x00ba:
            r7 = "ۧۘۢ";
            goto L_0x00ce;
        L_0x00bd:
            r7 = s.ۙۖۥ.m748();
            if (r7 > 0) goto L_0x00c4;
        L_0x00c3:
            goto L_0x00d8;
        L_0x00c4:
            r7 = "ۡۚۙ";
            goto L_0x00ce;
        L_0x00c7:
            r7 = s.ۘۡۜ.f54;
            if (r7 == 0) goto L_0x00cc;
        L_0x00cb:
            goto L_0x00d8;
        L_0x00cc:
            r7 = "ۨۜۧ";
        L_0x00ce:
            r7 = s.ۜۘۡ.m282(r7);
            goto L_0x000d;
        L_0x00d4:
            r7 = s.ۛۨۦ.f46;
            if (r7 == 0) goto L_0x00dc;
        L_0x00d8:
            r7 = "ۡۘۢ";
            goto L_0x0009;
        L_0x00dc:
            r7 = "ۤۛ۠";
            goto L_0x0009;
        L_0x00e0:
            r7 = r11.position;
            r8 = s.ۖۜ۟.m492();
            if (r8 == 0) goto L_0x00eb;
        L_0x00e8:
            r7 = "ۧ۟ۙ";
            goto L_0x00ce;
        L_0x00eb:
            r0 = "ۡۦۜ";
            r0 = s.ۜۘۡ.m282(r0);
            r10 = r7;
            r7 = r0;
            r0 = r10;
            goto L_0x000d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditHistory.getNext():com.junge.algorithmAidePro.CodeView.UndoRedoManager$EditNode");
        }

        /* DevToolsApp WARNING: Missing block: B:8:0x0021, code:
            if (s.ۤۗۛ.f24 != 0) goto L_0x00ad;
     */
        /* DevToolsApp WARNING: Missing block: B:26:0x0060, code:
            r2 = "ۤۧۗ";
     */
        /* DevToolsApp WARNING: Missing block: B:39:0x0088, code:
            r2 = "ۖۛۛ";
     */
        /* DevToolsApp WARNING: Missing block: B:41:0x0090, code:
            r2 = "۠۫ۤ";
     */
        /* DevToolsApp WARNING: Missing block: B:45:0x009b, code:
            r2 = "۟۬۟";
     */
        /* DevToolsApp WARNING: Missing block: B:47:0x00a1, code:
            r2 = s.ۜۘۡ.m282(r2);
     */
        /* DevToolsApp WARNING: Missing block: B:50:0x00ad, code:
            r2 = "۠ۧۥ";
     */
        private com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditNode getPrevious() {
            /*
            r5 = this;
            r0 = 0;
            r1 = 0;
            r2 = "ۘ۟ۖ";
        L_0x0004:
            r2 = s.ۢ۫ۗ.m350(r2);
        L_0x0008:
            switch(r2) {
                case 1737910: goto L_0x0011;
                case 1739755: goto L_0x003d;
                case 1739951: goto L_0x00bc;
                case 1740735: goto L_0x0078;
                case 1743900: goto L_0x0048;
                case 1743952: goto L_0x003f;
                case 1747090: goto L_0x001c;
                case 1747902: goto L_0x0035;
                case 1748025: goto L_0x0030;
                case 1748342: goto L_0x0082;
                case 1749318: goto L_0x00a7;
                case 1751287: goto L_0x0066;
                case 1751515: goto L_0x0052;
                case 1751671: goto L_0x005a;
                case 1751732: goto L_0x0025;
                case 1752322: goto L_0x0097;
                case 1755748: goto L_0x006e;
                default: goto L_0x000b;
            };
        L_0x000b:
            r2 = s.۫ۢ۠.f14;
            if (r2 > 0) goto L_0x0093;
        L_0x000f:
            goto L_0x0090;
        L_0x0011:
            s.ۗۜ۟.m469();
            r2 = s.ۨۗۥ.m536();
            if (r2 == 0) goto L_0x009b;
        L_0x001a:
            goto L_0x0090;
        L_0x001c:
            s.ۨۘۢ.m318();
            r2 = s.ۤۗۛ.f24;
            if (r2 == 0) goto L_0x0060;
        L_0x0023:
            goto L_0x00ad;
        L_0x0025:
            s.۫۫ۗ.m790();
            r2 = s.ۗۗۡ.m78();
            if (r2 != 0) goto L_0x0090;
        L_0x002e:
            goto L_0x00ad;
        L_0x0030:
            s.ۡۢۡ.m58();
            goto L_0x00ad;
        L_0x0035:
            s.ۧۧۡ.m183();
            s.۠ۡ۟.m140();
            r0 = 0;
            return r0;
        L_0x003d:
            r0 = 0;
            return r0;
        L_0x003f:
            r0 = r5.historyList;
            r0 = r0.get(r1);
            r0 = (com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditNode) r0;
            return r0;
        L_0x0048:
            r5.position = r1;
            r2 = s.۠ۡ۟.f8;
            if (r2 > 0) goto L_0x004f;
        L_0x004e:
            goto L_0x0088;
        L_0x004f:
            r2 = "ۜۤۘ";
            goto L_0x00a1;
        L_0x0052:
            r2 = s.ۨۘۢ.f19;
            if (r2 == 0) goto L_0x0057;
        L_0x0056:
            goto L_0x009b;
        L_0x0057:
            r2 = "ۜۢۢ";
            goto L_0x00a1;
        L_0x005a:
            r2 = s.ۙۜۦ.m520();
            if (r2 == 0) goto L_0x0063;
        L_0x0060:
            r2 = "ۤۧۗ";
            goto L_0x0004;
        L_0x0063:
            r2 = "ۤ۠ۗ";
            goto L_0x00a1;
        L_0x0066:
            r2 = s.ۥۘۧ.f53;
            if (r2 == 0) goto L_0x006b;
        L_0x006a:
            goto L_0x0088;
        L_0x006b:
            r2 = "ۤۥۘ";
            goto L_0x0004;
        L_0x006e:
            r2 = s.ۙۖۥ.m748();
            if (r2 > 0) goto L_0x0075;
        L_0x0074:
            goto L_0x00ad;
        L_0x0075:
            r2 = "ۤۘ۫";
            goto L_0x00a1;
        L_0x0078:
            r2 = s.ۛۨۦ.m559();
            if (r2 == 0) goto L_0x007f;
        L_0x007e:
            goto L_0x00ad;
        L_0x007f:
            r2 = "ۨ۬ۨ";
            goto L_0x00a1;
        L_0x0082:
            r2 = s.۬۟ۜ.m366();
            if (r2 == 0) goto L_0x008c;
        L_0x0088:
            r2 = "ۖۛۛ";
            goto L_0x0004;
        L_0x008c:
            r2 = "ۙۙ۟";
            goto L_0x0004;
        L_0x0090:
            r2 = "۠۫ۤ";
            goto L_0x00a1;
        L_0x0093:
            r2 = "ۡۖ۫";
            goto L_0x0004;
        L_0x0097:
            r2 = s.ۗ۠ۚ.f28;
            if (r2 == 0) goto L_0x009f;
        L_0x009b:
            r2 = "۟۬۟";
            goto L_0x0004;
        L_0x009f:
            r2 = "ۥ۬ۦ";
        L_0x00a1:
            r2 = s.ۜۘۡ.m282(r2);
            goto L_0x0008;
        L_0x00a7:
            r2 = r0 + -1;
            r3 = s.ۨۧۜ.f59;
            if (r3 == 0) goto L_0x00b1;
        L_0x00ad:
            r2 = "۠ۧۥ";
            goto L_0x0004;
        L_0x00b1:
            r1 = "ۥۛۘ";
            r1 = s.ۢ۫ۗ.m350(r1);
            r4 = r2;
            r2 = r1;
            r1 = r4;
            goto L_0x0008;
        L_0x00bc:
            r2 = r5.position;
            if (r2 != 0) goto L_0x00c4;
        L_0x00c0:
            r2 = "ۘۘ۫";
            goto L_0x0004;
        L_0x00c4:
            r0 = "ۢۗۛ";
            r0 = s.ۢ۫ۗ.m350(r0);
            r4 = r2;
            r2 = r0;
            r0 = r4;
            goto L_0x0008;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditHistory.getPrevious():com.junge.algorithmAidePro.CodeView.UndoRedoManager$EditNode");
        }
    }

    public static final class EditNode {
        private CharSequence after;
        private CharSequence before;
        private int start;

        /* DevToolsApp WARNING: Missing block: B:6:0x0019, code:
            if (s.۬ۗ۫.m98() == 0) goto L_0x0044;
     */
        /* DevToolsApp WARNING: Missing block: B:8:0x0023, code:
            if (s.ۖۜ۟.m492() == false) goto L_0x002e;
     */
        /* DevToolsApp WARNING: Missing block: B:12:0x002e, code:
            r0 = "ۜ۟ۤ";
     */
        /* DevToolsApp WARNING: Missing block: B:20:0x0044, code:
            r0 = "ۚ۬ۘ";
     */
        /* DevToolsApp WARNING: Missing block: B:33:0x006c, code:
            r0 = "ۥۡۗ";
     */
        /* DevToolsApp WARNING: Missing block: B:48:0x00a0, code:
            r0 = "ۧۦ۟";
     */
        public EditNode(int r2, java.lang.CharSequence r3, java.lang.CharSequence r4) {
            /*
            r1 = this;
            r1.<init>();
            r0 = "۠۬۠";
        L_0x0005:
            r0 = s.ۢ۫ۗ.m350(r0);
        L_0x0009:
            switch(r0) {
                case 1739104: goto L_0x0086;
                case 1740328: goto L_0x003a;
                case 1741879: goto L_0x0040;
                case 1741905: goto L_0x0054;
                case 1742278: goto L_0x0026;
                case 1743661: goto L_0x001c;
                case 1743809: goto L_0x0031;
                case 1748052: goto L_0x0096;
                case 1749608: goto L_0x0066;
                case 1751359: goto L_0x0072;
                case 1752507: goto L_0x002b;
                case 1754198: goto L_0x004a;
                case 1754464: goto L_0x005c;
                case 1754592: goto L_0x0012;
                case 1758934: goto L_0x007c;
                default: goto L_0x000c;
            };
        L_0x000c:
            r0 = s.ۡۘۗ.f2;
            if (r0 == 0) goto L_0x003d;
        L_0x0010:
            goto L_0x00a0;
        L_0x0012:
            s.۟ۥۙ.m650();
            r0 = s.۬ۗ۫.m98();
            if (r0 != 0) goto L_0x008a;
        L_0x001b:
            goto L_0x0044;
        L_0x001c:
            s.ۨۧۜ.m755();
            r0 = s.ۖۜ۟.m492();
            if (r0 != 0) goto L_0x0044;
        L_0x0025:
            goto L_0x002e;
        L_0x0026:
            r0 = s.ۚۤۙ.f18;
            if (r0 <= 0) goto L_0x006c;
        L_0x002a:
            goto L_0x002e;
        L_0x002b:
            s.۬ۗ۫.m98();
        L_0x002e:
            r0 = "ۜ۟ۤ";
            goto L_0x0005;
        L_0x0031:
            s.ۢۜۘ.m255();
            r2 = new java.lang.RuntimeException;
            r2.<init>();
            throw r2;
        L_0x003a:
            r1.after = r4;
            return;
        L_0x003d:
            r0 = "ۘ۫ۛ";
            goto L_0x0005;
        L_0x0040:
            r0 = s.ۗۢۢ.f29;
            if (r0 < 0) goto L_0x0047;
        L_0x0044:
            r0 = "ۚ۬ۘ";
            goto L_0x0005;
        L_0x0047:
            r0 = "ۜۙۚ";
            goto L_0x0005;
        L_0x004a:
            r0 = s.۬ۨۨ.m730();
            if (r0 == 0) goto L_0x0051;
        L_0x0050:
            goto L_0x00a0;
        L_0x0051:
            r0 = "ۚ۟ۜ";
            goto L_0x0005;
        L_0x0054:
            r0 = s.ۗ۬۟.f16;
            if (r0 == 0) goto L_0x0059;
        L_0x0058:
            goto L_0x006c;
        L_0x0059:
            r0 = "ۧۙۨ";
            goto L_0x0005;
        L_0x005c:
            r0 = s.ۗۜ۟.m469();
            if (r0 > 0) goto L_0x0063;
        L_0x0062:
            goto L_0x00a0;
        L_0x0063:
            r0 = "ۚ۠ۗ";
            goto L_0x0090;
        L_0x0066:
            r0 = s.ۖۙۜ.m589();
            if (r0 > 0) goto L_0x006f;
        L_0x006c:
            r0 = "ۥۡۗ";
            goto L_0x0090;
        L_0x006f:
            r0 = "ۧۢۛ";
            goto L_0x0090;
        L_0x0072:
            r0 = s.ۨۧۚ.m718();
            if (r0 > 0) goto L_0x0079;
        L_0x0078:
            goto L_0x008a;
        L_0x0079:
            r0 = "ۢ۠ۦ";
            goto L_0x0090;
        L_0x007c:
            r0 = s.ۦۡۤ.m396();
            if (r0 == 0) goto L_0x0083;
        L_0x0082:
            goto L_0x00a0;
        L_0x0083:
            r0 = "ۤۛۖ";
            goto L_0x0090;
        L_0x0086:
            r0 = s.۬ۗ۫.f6;
            if (r0 < 0) goto L_0x008e;
        L_0x008a:
            r0 = "ۜۚ۫";
            goto L_0x0005;
        L_0x008e:
            r0 = "۬ۗۡ";
        L_0x0090:
            r0 = s.ۜۘۡ.m282(r0);
            goto L_0x0009;
        L_0x0096:
            r1.start = r2;
            r1.before = r3;
            r0 = s.ۗ۬۟.m257();
            if (r0 > 0) goto L_0x00a3;
        L_0x00a0:
            r0 = "ۧۦ۟";
            goto L_0x0090;
        L_0x00a3:
            r0 = "ۗۢ۫";
            goto L_0x0005;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.EditNode.<init>(int, java.lang.CharSequence, java.lang.CharSequence):void");
        }
    }

    public final class TextChangeWatcher implements TextWatcher {
        private CharSequence afterChange;
        private CharSequence beforeChange;
        private ActionType lastActionType;
        public final /* synthetic */ UndoRedoManager this$0;

        public /* synthetic */ TextChangeWatcher(UndoRedoManager undoRedoManager, a aVar) {
            this(undoRedoManager);
        }

        public void afterTextChanged(Editable editable) {
        }

        /* DevToolsApp WARNING: Missing block: B:6:0x0013, code:
            if (s.ۗ۠ۚ.m442() <= 0) goto L_0x00a8;
     */
        /* DevToolsApp WARNING: Missing block: B:28:0x0062, code:
            r4 = "ۗۗۧ";
     */
        /* DevToolsApp WARNING: Missing block: B:42:0x008b, code:
            r4 = "ۙۥۦ";
     */
        /* DevToolsApp WARNING: Missing block: B:49:0x00a2, code:
            r4 = "ۦ۫ۧ";
     */
        /* DevToolsApp WARNING: Missing block: B:51:0x00a8, code:
            r4 = "ۤۥ۠";
     */
        public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            /*
            r0 = this;
            r4 = "۬ۨۘ";
        L_0x0002:
            r4 = s.ۢ۫ۗ.m350(r4);
        L_0x0006:
            switch(r4) {
                case 1738759: goto L_0x0017;
                case 1739735: goto L_0x005c;
                case 1741114: goto L_0x0031;
                case 1742043: goto L_0x000f;
                case 1743082: goto L_0x0092;
                case 1743532: goto L_0x0087;
                case 1747934: goto L_0x0054;
                case 1749789: goto L_0x0070;
                case 1751679: goto L_0x0022;
                case 1752290: goto L_0x0034;
                case 1753794: goto L_0x002d;
                case 1754103: goto L_0x007a;
                case 1755115: goto L_0x003d;
                case 1758064: goto L_0x004b;
                case 1758272: goto L_0x0035;
                case 1758956: goto L_0x0068;
                case 1759018: goto L_0x009c;
                default: goto L_0x0009;
            };
        L_0x0009:
            r4 = s.۫ۢ۠.f14;
            if (r4 > 0) goto L_0x00ac;
        L_0x000d:
            goto L_0x00a8;
        L_0x000f:
            r4 = s.ۗ۠ۚ.m442();
            if (r4 > 0) goto L_0x0062;
        L_0x0015:
            goto L_0x00a8;
        L_0x0017:
            s.ۥۘۧ.m662();
            r4 = s.ۗۗۡ.m78();
            if (r4 != 0) goto L_0x00a8;
        L_0x0020:
            goto L_0x00a2;
        L_0x0022:
            s.ۧۧۡ.m183();
            r4 = s.ۗۜ۟.m469();
            if (r4 > 0) goto L_0x00a2;
        L_0x002b:
            goto L_0x008b;
        L_0x002d:
            s.ۚ۟ۢ.m85();
            goto L_0x008b;
        L_0x0031:
            s.ۤۗۛ.m370();
        L_0x0034:
            return;
        L_0x0035:
            r3 = r3 + r2;
            r1 = s.ۚۡۢ.m127(r1, r2, r3);
            r0.beforeChange = r1;
            return;
        L_0x003d:
            r4 = r0.this$0;
            r4 = r4.isUndoOrRedo;
            if (r4 == 0) goto L_0x0048;
        L_0x0045:
            r4 = "ۥۚۗ";
            goto L_0x0002;
        L_0x0048:
            r4 = "۫ۡۖ";
            goto L_0x0002;
        L_0x004b:
            r4 = s.۟ۤۗ.f20;
            if (r4 > 0) goto L_0x0050;
        L_0x004f:
            goto L_0x0080;
        L_0x0050:
            r4 = "ۨۘۛ";
            goto L_0x00ae;
        L_0x0054:
            r4 = s.ۥۥۚ.f50;
            if (r4 == 0) goto L_0x0059;
        L_0x0058:
            goto L_0x0080;
        L_0x0059:
            r4 = "۫ۚ۟";
            goto L_0x0002;
        L_0x005c:
            r4 = s.ۧۧۡ.m183();
            if (r4 > 0) goto L_0x0065;
        L_0x0062:
            r4 = "ۗۗۧ";
            goto L_0x0002;
        L_0x0065:
            r4 = "۠ۨۦ";
            goto L_0x00ae;
        L_0x0068:
            r4 = s.۠ۜۗ.f13;
            if (r4 == 0) goto L_0x006d;
        L_0x006c:
            goto L_0x0080;
        L_0x006d:
            r4 = "ۘۘۗ";
            goto L_0x0002;
        L_0x0070:
            r4 = s.ۜۖۚ.m7();
            if (r4 < 0) goto L_0x0077;
        L_0x0076:
            goto L_0x00a8;
        L_0x0077:
            r4 = "۬ۘۘ";
            goto L_0x0002;
        L_0x007a:
            r4 = s.ۢ۟ۚ.m168();
            if (r4 > 0) goto L_0x0084;
        L_0x0080:
            r4 = "ۚۤۥ";
            goto L_0x0002;
        L_0x0084:
            r4 = "ۢۦۡ";
            goto L_0x00ae;
        L_0x0087:
            r4 = s.ۢ۫ۜ.f51;
            if (r4 < 0) goto L_0x008f;
        L_0x008b:
            r4 = "ۙۥۦ";
            goto L_0x0002;
        L_0x008f:
            r4 = "ۧۖۦ";
            goto L_0x00ae;
        L_0x0092:
            r4 = s.ۦۡۤ.m396();
            if (r4 == 0) goto L_0x0099;
        L_0x0098:
            goto L_0x00a8;
        L_0x0099:
            r4 = "ۜۖۦ";
            goto L_0x00ae;
        L_0x009c:
            r4 = s.ۡۢۡ.m58();
            if (r4 == 0) goto L_0x00a5;
        L_0x00a2:
            r4 = "ۦ۫ۧ";
            goto L_0x00ae;
        L_0x00a5:
            r4 = "ۛۧۖ";
            goto L_0x00ae;
        L_0x00a8:
            r4 = "ۤۥ۠";
            goto L_0x0002;
        L_0x00ac:
            r4 = "۬ۚۘ";
        L_0x00ae:
            r4 = s.ۜۘۡ.m282(r4);
            goto L_0x0006;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.TextChangeWatcher.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
        }

        /* DevToolsApp WARNING: Missing block: B:7:0x001f, code:
            if (s.۠ۡۧ.f26 == 0) goto L_0x00af;
     */
        /* DevToolsApp WARNING: Missing block: B:9:0x002a, code:
            if (s.ۤۤۖ.m506() != 0) goto L_0x00af;
     */
        /* DevToolsApp WARNING: Missing block: B:36:0x007f, code:
            r3 = "ۡ۫ۖ";
     */
        /* DevToolsApp WARNING: Missing block: B:43:0x0095, code:
            r3 = "ۖۚۖ";
     */
        /* DevToolsApp WARNING: Missing block: B:47:0x00a2, code:
            r3 = "ۛۤۛ";
     */
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            /*
            r0 = this;
            r3 = "ۧ۫ۘ";
        L_0x0002:
            r3 = s.ۢ۫ۗ.m350(r3);
        L_0x0006:
            switch(r3) {
                case 1737874: goto L_0x001a;
                case 1738096: goto L_0x0055;
                case 1739149: goto L_0x0085;
                case 1739190: goto L_0x0032;
                case 1740046: goto L_0x008f;
                case 1742994: goto L_0x0023;
                case 1744058: goto L_0x005f;
                case 1747434: goto L_0x0067;
                case 1747462: goto L_0x002e;
                case 1747548: goto L_0x007b;
                case 1747909: goto L_0x0071;
                case 1749319: goto L_0x0031;
                case 1749323: goto L_0x0011;
                case 1751313: goto L_0x004d;
                case 1751404: goto L_0x003d;
                case 1753457: goto L_0x009c;
                case 1754740: goto L_0x00a9;
                default: goto L_0x0009;
            };
        L_0x0009:
            s.ۗۗۡ.m78();
            s.۟ۤۗ.m332();
            goto L_0x00af;
        L_0x0011:
            s.ۨۧۜ.m755();
            r3 = s.ۚۡۢ.f7;
            if (r3 != 0) goto L_0x0095;
        L_0x0018:
            goto L_0x00a2;
        L_0x001a:
            s.ۚۡۢ.m112();
            r3 = s.۠ۡۧ.f26;
            if (r3 != 0) goto L_0x00a2;
        L_0x0021:
            goto L_0x00af;
        L_0x0023:
            s.ۗ۬۟.m257();
            r3 = s.ۤۤۖ.m506();
            if (r3 == 0) goto L_0x007f;
        L_0x002c:
            goto L_0x00af;
        L_0x002e:
            s.ۗ۬۟.m257();
        L_0x0031:
            return;
        L_0x0032:
            r4 = r4 + r2;
            r1 = s.ۡۗۗ.m156(r1, r2, r4);
            r0.afterChange = r1;
            r0.makeBatch(r2);
            return;
        L_0x003d:
            r3 = r0.this$0;
            r3 = r3.isUndoOrRedo;
            if (r3 == 0) goto L_0x0049;
        L_0x0045:
            r3 = "ۢۗۜ";
            goto L_0x00b4;
        L_0x0049:
            r3 = "ۗۥۤ";
            goto L_0x00b4;
        L_0x004d:
            r3 = s.ۛ۫ۧ.f49;
            if (r3 != 0) goto L_0x0052;
        L_0x0051:
            goto L_0x0075;
        L_0x0052:
            r3 = "ۤۜۤ";
            goto L_0x0002;
        L_0x0055:
            r3 = s.ۛ۫ۧ.m593();
            if (r3 > 0) goto L_0x005c;
        L_0x005b:
            goto L_0x00af;
        L_0x005c:
            r3 = "ۤۙۦ";
            goto L_0x00b4;
        L_0x005f:
            r3 = s.ۥۥۚ.f50;
            if (r3 == 0) goto L_0x0064;
        L_0x0063:
            goto L_0x00af;
        L_0x0064:
            r3 = "ۖۡۛ";
            goto L_0x0002;
        L_0x0067:
            r3 = s.ۡۢۡ.m58();
            if (r3 == 0) goto L_0x006e;
        L_0x006d:
            goto L_0x00af;
        L_0x006e:
            r3 = "ۜۧۥ";
            goto L_0x00b4;
        L_0x0071:
            r3 = s.۟ۤۗ.f20;
            if (r3 > 0) goto L_0x0078;
        L_0x0075:
            r3 = "ۢۗ۠";
            goto L_0x0002;
        L_0x0078:
            r3 = "۠ۘۢ";
            goto L_0x00b4;
        L_0x007b:
            r3 = s.ۜۘۡ.f17;
            if (r3 > 0) goto L_0x0082;
        L_0x007f:
            r3 = "ۡ۫ۖ";
            goto L_0x00b4;
        L_0x0082:
            r3 = "۠ۧ۬";
            goto L_0x00b4;
        L_0x0085:
            r3 = s.ۢۜۘ.m255();
            if (r3 > 0) goto L_0x008c;
        L_0x008b:
            goto L_0x0095;
        L_0x008c:
            r3 = "۠ۜۘ";
            goto L_0x00b4;
        L_0x008f:
            r3 = s.۠ۡ۟.m140();
            if (r3 > 0) goto L_0x0099;
        L_0x0095:
            r3 = "ۖۚۖ";
            goto L_0x0002;
        L_0x0099:
            r3 = "ۗۤۚ";
            goto L_0x00b4;
        L_0x009c:
            r3 = s.ۗ۬۟.m257();
            if (r3 > 0) goto L_0x00a5;
        L_0x00a2:
            r3 = "ۛۤۛ";
            goto L_0x00b4;
        L_0x00a5:
            r3 = "ۘۢۘ";
            goto L_0x0002;
        L_0x00a9:
            r3 = s.۠ۡ۟.m140();
            if (r3 > 0) goto L_0x00b2;
        L_0x00af:
            r3 = "۠ۙ۟";
            goto L_0x00b4;
        L_0x00b2:
            r3 = "ۦ۠۫";
        L_0x00b4:
            r3 = s.ۜۘۡ.m282(r3);
            goto L_0x0006;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.TextChangeWatcher.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }

        /* DevToolsApp WARNING: Missing block: B:6:0x001a, code:
            if (s.۟ۧۢ.f60 <= 0) goto L_0x0030;
     */
        /* DevToolsApp WARNING: Missing block: B:8:0x0022, code:
            if (s.۟ۧۢ.f60 <= 0) goto L_0x0030;
     */
        /* DevToolsApp WARNING: Missing block: B:12:0x0030, code:
            r4 = "ۢۚۘ";
     */
        /* DevToolsApp WARNING: Missing block: B:35:0x0073, code:
            r4 = "ۡۢۗ";
     */
        /* DevToolsApp WARNING: Missing block: B:41:0x0082, code:
            r4 = s.ۜۘۡ.m282(r4);
     */
        /* DevToolsApp WARNING: Missing block: B:48:0x0098, code:
            r4 = "ۨۡۖ";
     */
        private TextChangeWatcher(com.junge.algorithmAidePro.CodeView.UndoRedoManager r4) {
            /*
            r3 = this;
            r0 = 0;
            r3.this$0 = r4;
            r3.<init>();
            r4 = "ۡۨۘ";
        L_0x0008:
            r4 = s.ۢ۫ۗ.m350(r4);
        L_0x000c:
            switch(r4) {
                case 1739395: goto L_0x005b;
                case 1741135: goto L_0x0087;
                case 1743681: goto L_0x0053;
                case 1743816: goto L_0x0033;
                case 1746590: goto L_0x006d;
                case 1748388: goto L_0x003f;
                case 1748694: goto L_0x001d;
                case 1748881: goto L_0x0092;
                case 1749345: goto L_0x0065;
                case 1749855: goto L_0x002d;
                case 1753299: goto L_0x0079;
                case 1755389: goto L_0x0018;
                case 1757971: goto L_0x0049;
                case 1758986: goto L_0x0036;
                case 1759391: goto L_0x0025;
                default: goto L_0x000f;
            };
        L_0x000f:
            s.ۡۘۗ.m32();
            r4 = new java.lang.RuntimeException;
            r4.<init>();
            throw r4;
        L_0x0018:
            r4 = s.۟ۧۢ.f60;
            if (r4 > 0) goto L_0x0073;
        L_0x001c:
            goto L_0x0030;
        L_0x001d:
            s.ۤۤۖ.m506();
            r4 = s.۟ۧۢ.f60;
            if (r4 > 0) goto L_0x007d;
        L_0x0024:
            goto L_0x0030;
        L_0x0025:
            s.۟ۥۙ.m650();
            r4 = s.۟ۤۗ.f20;
            if (r4 > 0) goto L_0x008b;
        L_0x002c:
            goto L_0x0030;
        L_0x002d:
            s.ۨۘۢ.m318();
        L_0x0030:
            r4 = "ۢۚۘ";
            goto L_0x0008;
        L_0x0033:
            r3.lastActionType = r0;
            return;
        L_0x0036:
            r4 = s.۫۫ۗ.f65;
            if (r4 == 0) goto L_0x003c;
        L_0x003a:
            goto L_0x0098;
        L_0x003c:
            r4 = "ۜ۟۫";
            goto L_0x0008;
        L_0x003f:
            r4 = s.۫ۢ۠.m237();
            if (r4 < 0) goto L_0x0046;
        L_0x0045:
            goto L_0x008b;
        L_0x0046:
            r4 = "۬ۙۗ";
            goto L_0x0082;
        L_0x0049:
            r4 = s.ۨۧۜ.m755();
            if (r4 < 0) goto L_0x0050;
        L_0x004f:
            goto L_0x008b;
        L_0x0050:
            r4 = "ۡۘۛ";
            goto L_0x0008;
        L_0x0053:
            r4 = s.ۗۜ۟.f33;
            if (r4 > 0) goto L_0x0058;
        L_0x0057:
            goto L_0x008b;
        L_0x0058:
            r4 = "۫ۗ۟";
            goto L_0x0082;
        L_0x005b:
            r4 = s.ۘۡۜ.m682();
            if (r4 < 0) goto L_0x0062;
        L_0x0061:
            goto L_0x007d;
        L_0x0062:
            r4 = "ۜۛ۠";
            goto L_0x0008;
        L_0x0065:
            r4 = s.ۖۙۜ.f48;
            if (r4 != 0) goto L_0x006a;
        L_0x0069:
            goto L_0x008b;
        L_0x006a:
            r4 = "ۗ۬ۘ";
            goto L_0x0008;
        L_0x006d:
            r4 = s.ۖۙۜ.m589();
            if (r4 > 0) goto L_0x0076;
        L_0x0073:
            r4 = "ۡۢۗ";
            goto L_0x0008;
        L_0x0076:
            r4 = "ۢۘۗ";
            goto L_0x0082;
        L_0x0079:
            r4 = s.ۨۘۢ.f19;
            if (r4 == 0) goto L_0x0080;
        L_0x007d:
            r4 = "۬ۦۙ";
            goto L_0x0008;
        L_0x0080:
            r4 = "۟ۜۛ";
        L_0x0082:
            r4 = s.ۜۘۡ.m282(r4);
            goto L_0x000c;
        L_0x0087:
            r4 = s.۫ۢ۠.f14;
            if (r4 > 0) goto L_0x008e;
        L_0x008b:
            r4 = "ۢۨۥ";
            goto L_0x0082;
        L_0x008e:
            r4 = "ۦۛۨ";
            goto L_0x0008;
        L_0x0092:
            r4 = com.junge.algorithmAidePro.CodeView.UndoRedoManager.ActionType.NOT_DEF;
            r1 = s.ۙۜۦ.f36;
            if (r1 > 0) goto L_0x009c;
        L_0x0098:
            r4 = "ۨۡۖ";
            goto L_0x0008;
        L_0x009c:
            r0 = "ۙۦۜ";
            r0 = s.ۜۘۡ.m282(r0);
            r2 = r0;
            r0 = r4;
            r4 = r2;
            goto L_0x000c;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.TextChangeWatcher.<init>(com.junge.algorithmAidePro.CodeView.UndoRedoManager):void");
        }

        /* DevToolsApp WARNING: Missing block: B:10:0x0023, code:
            if (s.ۛۨۦ.f46 == false) goto L_0x0099;
     */
        /* DevToolsApp WARNING: Missing block: B:27:0x005b, code:
            r1 = "ۗۥۗ";
     */
        /* DevToolsApp WARNING: Missing block: B:31:0x0068, code:
            r1 = "۬ۖ۟";
     */
        /* DevToolsApp WARNING: Missing block: B:54:0x00af, code:
            r1 = "ۧۥۛ";
     */
        /* DevToolsApp WARNING: Missing block: B:63:0x00c7, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
        private com.junge.algorithmAidePro.CodeView.UndoRedoManager.ActionType getActionType() {
            /*
            r4 = this;
            r0 = 0;
            r1 = "ۜۙ۫";
        L_0x0003:
            r1 = s.ۢ۫ۗ.m350(r1);
        L_0x0007:
            switch(r1) {
                case 1738032: goto L_0x008a;
                case 1738402: goto L_0x002f;
                case 1738432: goto L_0x005f;
                case 1738852: goto L_0x006b;
                case 1739177: goto L_0x0041;
                case 1740989: goto L_0x00b5;
                case 1741088: goto L_0x0093;
                case 1742039: goto L_0x000f;
                case 1743243: goto L_0x0044;
                case 1743630: goto L_0x00cd;
                case 1746845: goto L_0x00a1;
                case 1748042: goto L_0x0027;
                case 1751344: goto L_0x0015;
                case 1752293: goto L_0x0032;
                case 1752537: goto L_0x0035;
                case 1752869: goto L_0x007f;
                case 1753313: goto L_0x0075;
                case 1754185: goto L_0x00ab;
                case 1754557: goto L_0x001e;
                case 1755720: goto L_0x00c0;
                case 1758901: goto L_0x004f;
                default: goto L_0x000a;
            };
        L_0x000a:
            s.ۥۥۚ.m614();
            r0 = 0;
            return r0;
        L_0x000f:
            r1 = s.۟ۧۢ.f60;
            if (r1 <= 0) goto L_0x00d3;
        L_0x0013:
            goto L_0x00b9;
        L_0x0015:
            s.۠ۜۗ.m214();
            r1 = s.۟ۤۗ.f20;
            if (r1 <= 0) goto L_0x00af;
        L_0x001c:
            goto L_0x0099;
        L_0x001e:
            s.ۡۘۗ.m32();
            r1 = s.ۛۨۦ.f46;
            if (r1 != 0) goto L_0x00b9;
        L_0x0025:
            goto L_0x0099;
        L_0x0027:
            s.۟ۥۙ.m650();
            s.ۚ۟ۢ.m85();
            goto L_0x0099;
        L_0x002f:
            r0 = com.junge.algorithmAidePro.CodeView.UndoRedoManager.ActionType.INSERT;
            return r0;
        L_0x0032:
            r0 = com.junge.algorithmAidePro.CodeView.UndoRedoManager.ActionType.DELETE;
            return r0;
        L_0x0035:
            r1 = r4.afterChange;
            r1 = s.ۖۙۜ.m580(r1);
            if (r1 != 0) goto L_0x005b;
        L_0x003d:
            r1 = "ۖ۫ۗ";
            goto L_0x00c7;
        L_0x0041:
            r0 = com.junge.algorithmAidePro.CodeView.UndoRedoManager.ActionType.PASTE;
            return r0;
        L_0x0044:
            r1 = r4.afterChange;
            r1 = s.۬ۗ۫.m101(r1);
            if (r1 == 0) goto L_0x0068;
        L_0x004c:
            r1 = "ۥۚۚ";
            goto L_0x0003;
        L_0x004f:
            r1 = r4.beforeChange;
            r1 = s.۬ۗ۫.m101(r1);
            if (r1 == 0) goto L_0x005b;
        L_0x0057:
            r1 = "ۥۢۖ";
            goto L_0x00c7;
        L_0x005b:
            r1 = "ۗۥۗ";
            goto L_0x00c7;
        L_0x005f:
            r1 = s.ۖۙۜ.m580(r0);
            if (r1 != 0) goto L_0x0068;
        L_0x0065:
            r1 = "ۛ۬ۜ";
            goto L_0x0003;
        L_0x0068:
            r1 = "۬ۖ۟";
            goto L_0x0003;
        L_0x006b:
            r1 = s.ۛ۫ۧ.f49;
            if (r1 != 0) goto L_0x0072;
        L_0x006f:
            r1 = "ۚۤۡ";
            goto L_0x0003;
        L_0x0072:
            r1 = "ۖ۬ۖ";
            goto L_0x00c7;
        L_0x0075:
            r1 = s.ۦۡۤ.m396();
            if (r1 == 0) goto L_0x007c;
        L_0x007b:
            goto L_0x00b9;
        L_0x007c:
            r1 = "ۗۚۧ";
            goto L_0x0003;
        L_0x007f:
            r1 = s.ۖۜ۟.m492();
            if (r1 == 0) goto L_0x0086;
        L_0x0085:
            goto L_0x00d3;
        L_0x0086:
            r1 = "ۦۜۗ";
            goto L_0x0003;
        L_0x008a:
            r1 = s.ۙۜۦ.f36;
            if (r1 > 0) goto L_0x008f;
        L_0x008e:
            goto L_0x00d3;
        L_0x008f:
            r1 = "ۥ۬۬";
            goto L_0x0003;
        L_0x0093:
            r1 = s.ۗ۬۟.m257();
            if (r1 > 0) goto L_0x009d;
        L_0x0099:
            r1 = "ۖ۫ۥ";
            goto L_0x0003;
        L_0x009d:
            r1 = "ۖ۟ۙ";
            goto L_0x0003;
        L_0x00a1:
            r1 = s.ۦۢۜ.m16();
            if (r1 == 0) goto L_0x00a8;
        L_0x00a7:
            goto L_0x00d3;
        L_0x00a8:
            r1 = "ۙۤ۫";
            goto L_0x00c7;
        L_0x00ab:
            r1 = s.ۚ۟ۢ.f5;
            if (r1 != 0) goto L_0x00b2;
        L_0x00af:
            r1 = "ۧۥۛ";
            goto L_0x00c7;
        L_0x00b2:
            r1 = "۟ۤۢ";
            goto L_0x00c7;
        L_0x00b5:
            r1 = s.ۖۙۜ.f48;
            if (r1 != 0) goto L_0x00bd;
        L_0x00b9:
            r1 = "۠۬ۖ";
            goto L_0x0003;
        L_0x00bd:
            r1 = "ۧۙۛ";
            goto L_0x00c7;
        L_0x00c0:
            r1 = s.۫ۢ۠.f14;
            if (r1 > 0) goto L_0x00c5;
        L_0x00c4:
            goto L_0x00d3;
        L_0x00c5:
            r1 = "ۙۡۥ";
        L_0x00c7:
            r1 = s.ۜۘۡ.m282(r1);
            goto L_0x0007;
        L_0x00cd:
            r1 = r4.beforeChange;
            r2 = s.۫۫ۗ.f65;
            if (r2 == 0) goto L_0x00d6;
        L_0x00d3:
            r1 = "ۤۚۦ";
            goto L_0x00c7;
        L_0x00d6:
            r0 = "ۨ۫۫";
            r0 = s.ۢ۫ۗ.m350(r0);
            r3 = r1;
            r1 = r0;
            r0 = r3;
            goto L_0x0007;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.TextChangeWatcher.getActionType():com.junge.algorithmAidePro.CodeView.UndoRedoManager$ActionType");
        }

        /* DevToolsApp WARNING: Missing block: B:12:0x003c, code:
            if (s.ۚ۟ۢ.m85() == 0) goto L_0x015b;
     */
        /* DevToolsApp WARNING: Missing block: B:48:0x010f, code:
            r13 = "ۙۡۢ";
     */
        /* DevToolsApp WARNING: Missing block: B:53:0x0139, code:
            r13 = "ۛۧۘ";
     */
        /* DevToolsApp WARNING: Missing block: B:59:0x015b, code:
            r13 = "ۢ۫۫";
     */
        /* DevToolsApp WARNING: Missing block: B:63:0x0172, code:
            r13 = "۫ۘ۠";
     */
        /* DevToolsApp WARNING: Missing block: B:65:0x0177, code:
            r13 = s.ۜۘۡ.m282(r13);
     */
        private void makeBatch(int r18) {
            /*
            r17 = this;
            r0 = r17;
            r1 = r18;
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
            r13 = "ۦۙۤ";
        L_0x0011:
            r13 = s.ۢ۫ۗ.m350(r13);
        L_0x0015:
            switch(r13) {
                case 1737771: goto L_0x005b;
                case 1739738: goto L_0x00dc;
                case 1740986: goto L_0x0040;
                case 1741671: goto L_0x0087;
                case 1742713: goto L_0x00e6;
                case 1743084: goto L_0x0105;
                case 1743587: goto L_0x004c;
                case 1746833: goto L_0x006b;
                case 1749449: goto L_0x0092;
                case 1749594: goto L_0x013d;
                case 1749764: goto L_0x00a7;
                case 1749954: goto L_0x0045;
                case 1751216: goto L_0x00c2;
                case 1753161: goto L_0x0020;
                case 1753221: goto L_0x00e3;
                case 1753233: goto L_0x016c;
                case 1753633: goto L_0x0120;
                case 1754595: goto L_0x0038;
                case 1758003: goto L_0x0029;
                case 1758449: goto L_0x0151;
                default: goto L_0x0018;
            };
        L_0x0018:
            r13 = com.junge.algorithmAidePro.CodeView.UndoRedoManager.ActionType.PASTE;
            if (r13 == r2) goto L_0x0139;
        L_0x001c:
            r13 = "ۘۘۚ";
            goto L_0x0177;
        L_0x0020:
            s.ۛۨۦ.m559();
            r13 = s.ۦۡۤ.f25;
            if (r13 == 0) goto L_0x0172;
        L_0x0027:
            goto L_0x010f;
        L_0x0029:
            s.ۢ۫ۜ.m625();
            r13 = s.ۗ۬۟.m257();
            if (r13 <= 0) goto L_0x0034;
        L_0x0032:
            goto L_0x010f;
        L_0x0034:
            r13 = "ۧۦۢ";
            goto L_0x0177;
        L_0x0038:
            r13 = s.ۚ۟ۢ.m85();
            if (r13 != 0) goto L_0x010f;
        L_0x003e:
            goto L_0x015b;
        L_0x0040:
            s.۟ۥۙ.m650();
            goto L_0x015b;
        L_0x0045:
            s.ۗ۬۟.m257();
            s.ۢ۟ۚ.m168();
            return;
        L_0x004c:
            r13 = s.ۗۤ۫.m205(r4);
            r11[r6] = r13;
            r13 = android.text.TextUtils.concat(r11);
            r4.before = r13;
            goto L_0x0101;
        L_0x005b:
            r11[r7] = r12;
            r13 = s.۫۫ۗ.m790();
            if (r13 != 0) goto L_0x0067;
        L_0x0063:
            r13 = "ۦۗۚ";
            goto L_0x0177;
        L_0x0067:
            r13 = "ۜۘ۟";
            goto L_0x0177;
        L_0x006b:
            r4.start = r1;
            r13 = new java.lang.CharSequence[r8];
            r14 = r0.beforeChange;
            r15 = s.ۛۨۦ.m559();
            if (r15 == 0) goto L_0x007a;
        L_0x0078:
            goto L_0x0172;
        L_0x007a:
            r11 = "ۖۖ۫";
            r11 = s.ۢ۫ۗ.m350(r11);
            r12 = r14;
            r16 = r13;
            r13 = r11;
            r11 = r16;
            goto L_0x0015;
        L_0x0087:
            r9[r6] = r10;
            r13 = android.text.TextUtils.concat(r9);
            r4.after = r13;
            goto L_0x0101;
        L_0x0092:
            r13 = r0.afterChange;
            r14 = s.ۚۡۢ.f7;
            if (r14 != 0) goto L_0x009a;
        L_0x0098:
            goto L_0x010f;
        L_0x009a:
            r10 = "ۚۘۥ";
            r10 = s.ۢ۫ۗ.m350(r10);
            r16 = r13;
            r13 = r10;
            r10 = r16;
            goto L_0x0015;
        L_0x00a7:
            r13 = new java.lang.CharSequence[r8];
            r14 = s.۠ۡ۟.m143(r4);
            r13[r7] = r14;
            r14 = s.ۨۧۚ.f56;
            if (r14 != 0) goto L_0x00b5;
        L_0x00b3:
            goto L_0x0172;
        L_0x00b5:
            r9 = "ۢۛۢ";
            r9 = s.ۢ۫ۗ.m350(r9);
            r16 = r13;
            r13 = r9;
            r9 = r16;
            goto L_0x0015;
        L_0x00c2:
            r6 = com.junge.algorithmAidePro.CodeView.UndoRedoManager.ActionType.DELETE;
            r7 = 1;
            r8 = 0;
            r13 = 2;
            if (r2 != r6) goto L_0x00d0;
        L_0x00c9:
            r6 = "۟ۤۖ";
            r6 = s.ۜۘۡ.m282(r6);
            goto L_0x00d6;
        L_0x00d0:
            r6 = "ۢۥۧ";
            r6 = s.ۢ۫ۗ.m350(r6);
        L_0x00d6:
            r13 = r6;
            r6 = 1;
            r7 = 0;
            r8 = 2;
            goto L_0x0015;
        L_0x00dc:
            if (r4 != 0) goto L_0x00df;
        L_0x00de:
            goto L_0x0139;
        L_0x00df:
            r13 = "ۤۖۢ";
            goto L_0x0177;
        L_0x00e3:
            r0.lastActionType = r2;
            return;
        L_0x00e6:
            r13 = new com.junge.algorithmAidePro.CodeView.UndoRedoManager$EditNode;
            r14 = s.ۨۘۢ.m318();
            if (r14 == 0) goto L_0x00ef;
        L_0x00ee:
            goto L_0x010f;
        L_0x00ef:
            r14 = r0.beforeChange;
            r15 = s.ۨۧۚ.m718();
            if (r15 > 0) goto L_0x00f9;
        L_0x00f7:
            goto L_0x0172;
        L_0x00f9:
            r15 = r0.afterChange;
            r13.<init>(r1, r14, r15);
            r5.add(r13);
        L_0x0101:
            r13 = "ۦۙۘ";
            goto L_0x0011;
        L_0x0105:
            r13 = r0.this$0;
            r13 = r13.editHistory;
            r14 = s.ۗۗۡ.f4;
            if (r14 != 0) goto L_0x0113;
        L_0x010f:
            r13 = "ۙۡۢ";
            goto L_0x0011;
        L_0x0113:
            r5 = "ۛۛۙ";
            r5 = s.ۜۘۡ.m282(r5);
            r16 = r13;
            r13 = r5;
            r5 = r16;
            goto L_0x0015;
        L_0x0120:
            r13 = r3.editHistory;
            r13 = r13.getCurrent();
            r14 = r0.lastActionType;
            if (r14 != r2) goto L_0x0139;
        L_0x012c:
            r4 = "ۗۢۦ";
            r4 = s.ۢ۫ۗ.m350(r4);
            r16 = r13;
            r13 = r4;
            r4 = r16;
            goto L_0x0015;
        L_0x0139:
            r13 = "ۛۧۘ";
            goto L_0x0011;
        L_0x013d:
            r13 = r0.this$0;
            r14 = s.ۛ۫ۧ.f49;
            if (r14 != 0) goto L_0x0144;
        L_0x0143:
            goto L_0x015b;
        L_0x0144:
            r3 = "ۦۦۡ";
            r3 = s.ۜۘۡ.m282(r3);
            r16 = r13;
            r13 = r3;
            r3 = r16;
            goto L_0x0015;
        L_0x0151:
            r13 = r17.getActionType();
            r14 = s.ۢ۫ۗ.m342();
            if (r14 != 0) goto L_0x015f;
        L_0x015b:
            r13 = "ۢ۫۫";
            goto L_0x0011;
        L_0x015f:
            r2 = "ۢ۠ۘ";
            r2 = s.ۜۘۡ.m282(r2);
            r16 = r13;
            r13 = r2;
            r2 = r16;
            goto L_0x0015;
        L_0x016c:
            r13 = s.ۡۘۗ.m32();
            if (r13 == 0) goto L_0x0175;
        L_0x0172:
            r13 = "۫ۘ۠";
            goto L_0x0177;
        L_0x0175:
            r13 = "۫ۦ۬";
        L_0x0177:
            r13 = s.ۜۘۡ.m282(r13);
            goto L_0x0015;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.TextChangeWatcher.makeBatch(int):void");
        }
    }

    /* DevToolsApp WARNING: Missing block: B:9:0x0022, code:
            if (s.۟ۥۙ.m650() > 0) goto L_0x00a3;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0026, code:
            r1 = "ۨ۠ۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:33:0x008c, code:
            r1 = "۬ۧۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x00bc, code:
            r1 = s.ۢ۫ۗ.m350(r1);
     */
    public UndoRedoManager(android.widget.TextView r5) {
        /*
        r4 = this;
        r0 = 0;
        r4.<init>();
        r1 = "ۤۚ۠";
    L_0x0006:
        r1 = s.ۜۘۡ.m282(r1);
    L_0x000a:
        switch(r1) {
            case 1740664: goto L_0x0054;
            case 1740772: goto L_0x0086;
            case 1743029: goto L_0x007e;
            case 1743239: goto L_0x001b;
            case 1748714: goto L_0x009f;
            case 1748833: goto L_0x0044;
            case 1751338: goto L_0x00ad;
            case 1751591: goto L_0x003b;
            case 1751703: goto L_0x0094;
            case 1755112: goto L_0x0033;
            case 1755147: goto L_0x0072;
            case 1755372: goto L_0x002a;
            case 1759425: goto L_0x0013;
            default: goto L_0x000d;
        };
    L_0x000d:
        r1 = s.۠ۡ۟.f8;
        if (r1 > 0) goto L_0x00aa;
    L_0x0011:
        goto L_0x00b6;
    L_0x0013:
        r1 = s.ۢۜۘ.f15;
        if (r1 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0026;
    L_0x0018:
        r1 = "ۛ۬ۘ";
        goto L_0x0006;
    L_0x001b:
        s.ۗ۠ۚ.m442();
        r1 = s.۟ۥۙ.m650();
        if (r1 <= 0) goto L_0x0026;
    L_0x0024:
        goto L_0x00a3;
    L_0x0026:
        r1 = "ۨ۠ۤ";
        goto L_0x00bc;
    L_0x002a:
        s.ۚۤۙ.m296();
        r1 = s.ۦۢۜ.f1;
        if (r1 <= 0) goto L_0x00b6;
    L_0x0031:
        goto L_0x00a3;
    L_0x0033:
        s.ۙۜۦ.m520();
        s.۠ۡ۟.m140();
        goto L_0x00a3;
    L_0x003b:
        s.ۗ۬ۦ.m407();
        r5 = new java.lang.RuntimeException;
        r5.<init>();
        throw r5;
    L_0x0044:
        r1 = new com.junge.algorithmAidePro.CodeView.UndoRedoManager$TextChangeWatcher;
        r2 = s.ۗ۬۟.m257();
        if (r2 > 0) goto L_0x004e;
    L_0x004c:
        goto L_0x00b6;
    L_0x004e:
        r1.<init>(r4, r0);
        r4.textChangeWatcher = r1;
        return;
    L_0x0054:
        r1 = new com.junge.algorithmAidePro.CodeView.UndoRedoManager$EditHistory;
        r2 = 0;
        r3 = s.ۗۜۛ.m698();
        if (r3 > 0) goto L_0x005e;
    L_0x005d:
        goto L_0x008c;
    L_0x005e:
        r1.<init>(r2);
        r4.editHistory = r1;
        r1 = s.ۢ۫ۗ.m342();
        if (r1 != 0) goto L_0x006a;
    L_0x0069:
        goto L_0x008c;
    L_0x006a:
        r0 = "ۡۦۦ";
        r1 = s.ۜۘۡ.m282(r0);
        r0 = r2;
        goto L_0x000a;
    L_0x0072:
        r4.textView = r5;
        r1 = s.ۢۜۘ.m255();
        if (r1 > 0) goto L_0x007b;
    L_0x007a:
        goto L_0x00b6;
    L_0x007b:
        r1 = "ۙۗۖ";
        goto L_0x0006;
    L_0x007e:
        r1 = s.ۨۧۜ.f59;
        if (r1 == 0) goto L_0x0083;
    L_0x0082:
        goto L_0x00a3;
    L_0x0083:
        r1 = "ۨۙۜ";
        goto L_0x00bc;
    L_0x0086:
        r1 = s.ۖۜ۟.m492();
        if (r1 == 0) goto L_0x0090;
    L_0x008c:
        r1 = "۬ۧۜ";
        goto L_0x0006;
    L_0x0090:
        r1 = "ۛۥ۟";
        goto L_0x0006;
    L_0x0094:
        r1 = s.۫ۢ۠.m237();
        if (r1 < 0) goto L_0x009b;
    L_0x009a:
        goto L_0x00a3;
    L_0x009b:
        r1 = "ۙۚۥ";
        goto L_0x0006;
    L_0x009f:
        r1 = s.ۨۗۥ.f42;
        if (r1 > 0) goto L_0x00a6;
    L_0x00a3:
        r1 = "ۤۢۥ";
        goto L_0x00bc;
    L_0x00a6:
        r1 = "ۤۦۙ";
        goto L_0x0006;
    L_0x00aa:
        r1 = "ۡۢ۫";
        goto L_0x00bc;
    L_0x00ad:
        r1 = 0;
        r4.isUndoOrRedo = r1;
        r1 = s.ۢۜۘ.m255();
        if (r1 > 0) goto L_0x00ba;
    L_0x00b6:
        r1 = "ۨۘۘ";
        goto L_0x0006;
    L_0x00ba:
        r1 = "ۥۚۗ";
    L_0x00bc:
        r1 = s.ۢ۫ۗ.m350(r1);
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.<init>(android.widget.TextView):void");
    }

    public void clearHistory() {
        this.editHistory.clear();
    }

    public void connect() {
        ۢ۫ۗ.m349(this.textView, this.textChangeWatcher);
    }

    public void disconnect() {
        this.textView.removeTextChangedListener(this.textChangeWatcher);
    }

    public void setMaxHistorySize(int i) {
        this.editHistory.setMaxHistorySize(i);
    }

    /* DevToolsApp WARNING: Missing block: B:4:0x0028, code:
            r17 = r6;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0036, code:
            r17 = r6;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x0043, code:
            if (s.۠ۡۧ.f26 == 0) goto L_0x0028;
     */
    /* DevToolsApp WARNING: Missing block: B:25:0x007e, code:
            r17 = s.ۢ۫ۗ.m350("ۨۨ۟");
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x009e, code:
            r6 = "ۛۨۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x00f5, code:
            r6 = "ۢۖۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x011f, code:
            r6 = "ۤۢۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x013e, code:
            r6 = "ۡۥۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:57:0x0140, code:
            r6 = s.ۜۘۡ.m282(r6);
     */
    /* DevToolsApp WARNING: Missing block: B:66:0x016b, code:
            r6 = "ۥۧۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:74:0x019d, code:
            r6 = s.ۢ۫ۗ.m350(r6);
     */
    /* DevToolsApp WARNING: Missing block: B:75:0x01a1, code:
            r20 = r17;
            r17 = r6;
     */
    /* DevToolsApp WARNING: Missing block: B:77:0x01b1, code:
            r6 = r20;
     */
    /* DevToolsApp WARNING: Missing block: B:82:0x01ca, code:
            r6 = r17;
            r17 = r20;
     */
    public void undo() {
        /*
        r21 = this;
        r0 = r21;
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
        r17 = "۫ۧۚ";
        r17 = s.ۜۘۡ.m282(r17);
        r16 = r1;
        r1 = 0;
    L_0x001c:
        switch(r17) {
            case 1738230: goto L_0x00e9;
            case 1738804: goto L_0x00d6;
            case 1739159: goto L_0x0075;
            case 1739982: goto L_0x005f;
            case 1741009: goto L_0x004a;
            case 1741922: goto L_0x013a;
            case 1743115: goto L_0x0089;
            case 1746467: goto L_0x012e;
            case 1746679: goto L_0x00ba;
            case 1746905: goto L_0x0055;
            case 1748027: goto L_0x017a;
            case 1748791: goto L_0x0113;
            case 1749285: goto L_0x003e;
            case 1749474: goto L_0x0095;
            case 1749750: goto L_0x015f;
            case 1751580: goto L_0x0030;
            case 1752696: goto L_0x0046;
            case 1753653: goto L_0x00a2;
            case 1754657: goto L_0x0145;
            case 1754663: goto L_0x0104;
            case 1754773: goto L_0x0193;
            case 1755349: goto L_0x0146;
            case 1755615: goto L_0x0051;
            case 1755702: goto L_0x0064;
            case 1758462: goto L_0x01b5;
            default: goto L_0x001f;
        };
    L_0x001f:
        s.ۗ۬۟.m257();
        r17 = s.ۡۥۗ.m568();
        if (r17 == 0) goto L_0x002c;
    L_0x0028:
        r17 = r6;
        goto L_0x01bd;
    L_0x002c:
        r17 = r6;
        goto L_0x011f;
    L_0x0030:
        r17 = s.ۖۜ۟.m492();
        if (r17 == 0) goto L_0x003a;
    L_0x0036:
        r17 = r6;
        goto L_0x016b;
    L_0x003a:
        r17 = r6;
        goto L_0x00f5;
    L_0x003e:
        s.ۖۜ۟.m492();
        r17 = s.۠ۡۧ.f26;
        if (r17 != 0) goto L_0x0036;
    L_0x0045:
        goto L_0x0028;
    L_0x0046:
        s.ۜۘۡ.m280();
        goto L_0x0028;
    L_0x004a:
        s.ۡۘۗ.m32();
        s.ۚۡۢ.m112();
        return;
    L_0x0051:
        android.text.Selection.setSelection(r3, r6);
        return;
    L_0x0055:
        r6 = s.ۢۜۘ.m248(r2);
        r6 = s.ۤۤۖ.m499(r6);
        r6 = r6 + r4;
        goto L_0x007e;
    L_0x005f:
        r1 = r1 + 1;
        r17 = r6;
        goto L_0x009e;
    L_0x0064:
        r17 = r6;
        r6 = r14[r1];
        r3.removeSpan(r6);
        r6 = s.ۚۡۢ.f7;
        if (r6 != 0) goto L_0x0071;
    L_0x006f:
        goto L_0x011f;
    L_0x0071:
        r6 = "ۘ۠ۖ";
        goto L_0x0140;
    L_0x0075:
        r17 = r6;
        r6 = s.ۗۤ۫.m205(r2);
        if (r6 != 0) goto L_0x0085;
    L_0x007d:
        r6 = r4;
    L_0x007e:
        r17 = "ۨۨ۟";
        r17 = s.ۢ۫ۗ.m350(r17);
        goto L_0x001c;
    L_0x0085:
        r6 = "۟ۦ۠";
        goto L_0x0140;
    L_0x0089:
        r17 = r6;
        if (r1 >= r15) goto L_0x0091;
    L_0x008d:
        r6 = "ۨ۫ۙ";
        goto L_0x0140;
    L_0x0091:
        r6 = "ۗۤۤ";
        goto L_0x019d;
    L_0x0095:
        r17 = r6;
        r1 = r13;
        r1 = (android.text.style.UnderlineSpan[]) r1;
        r6 = r1.length;
        r14 = r1;
        r1 = r5;
        r15 = r6;
    L_0x009e:
        r6 = "ۛۨۘ";
        goto L_0x019d;
    L_0x00a2:
        r17 = r6;
        r6 = r3.getSpans(r5, r11, r12);
        r18 = s.ۙۜۦ.m520();
        if (r18 == 0) goto L_0x00af;
    L_0x00ae:
        goto L_0x00f5;
    L_0x00af:
        r13 = "ۢۜۜ";
        r13 = s.ۢ۫ۗ.m350(r13);
        r20 = r13;
        r13 = r6;
        goto L_0x01ca;
    L_0x00ba:
        r17 = r6;
        r6 = s.ۨۗۥ.m540(r3);
        r18 = android.text.style.UnderlineSpan.class;
        r19 = s.ۘۡۜ.m682();
        if (r19 < 0) goto L_0x00c9;
    L_0x00c8:
        goto L_0x011f;
    L_0x00c9:
        r11 = "ۦۧۖ";
        r11 = s.ۜۘۡ.m282(r11);
        r12 = r18;
        r20 = r11;
        r11 = r6;
        goto L_0x01ca;
    L_0x00d6:
        r17 = r6;
        r3.replace(r4, r8, r10);
        r0.isUndoOrRedo = r5;
        r6 = s.ۚۡۢ.m112();
        if (r6 < 0) goto L_0x00e6;
    L_0x00e3:
        r6 = "۟ۤ۠";
        goto L_0x0140;
    L_0x00e6:
        r6 = "۟۟ۗ";
        goto L_0x0140;
    L_0x00e9:
        r17 = r6;
        r6 = s.ۢۜۘ.m248(r2);
        r18 = s.ۢ۫ۜ.m625();
        if (r18 < 0) goto L_0x00f9;
    L_0x00f5:
        r6 = "ۢۖۙ";
        goto L_0x019d;
    L_0x00f9:
        r10 = "ۗۙۖ";
        r10 = s.ۢ۫ۗ.m350(r10);
        r20 = r10;
        r10 = r6;
        goto L_0x01ca;
    L_0x0104:
        r17 = r6;
        r0.isUndoOrRedo = r9;
        r6 = s.ۙۜۦ.m520();
        if (r6 == 0) goto L_0x0110;
    L_0x010e:
        goto L_0x01bd;
    L_0x0110:
        r6 = "ۖۥۥ";
        goto L_0x0140;
    L_0x0113:
        r17 = r6;
        r6 = r7 + r4;
        r18 = 1;
        r19 = s.ۥۘۧ.m662();
        if (r19 > 0) goto L_0x0122;
    L_0x011f:
        r6 = "ۤۢۚ";
        goto L_0x0140;
    L_0x0122:
        r8 = "ۧۨۨ";
        r8 = s.ۢ۫ۗ.m350(r8);
        r9 = 1;
        r20 = r8;
        r8 = r6;
        goto L_0x01ca;
    L_0x012e:
        r17 = r6;
        r6 = s.۠ۡ۟.m143(r2);
        r6 = s.ۤۤۖ.m499(r6);
        r7 = r6;
        goto L_0x013e;
    L_0x013a:
        r17 = r6;
        r6 = 0;
        r7 = 0;
    L_0x013e:
        r6 = "ۡۥۛ";
    L_0x0140:
        r6 = s.ۜۘۡ.m282(r6);
        goto L_0x01a1;
    L_0x0145:
        return;
    L_0x0146:
        r17 = r6;
        r5 = s.۠ۡ۟.m143(r2);
        r6 = 0;
        if (r5 == 0) goto L_0x0152;
    L_0x014f:
        r5 = "۟ۘۜ";
        goto L_0x0154;
    L_0x0152:
        r5 = "ۚ۠ۨ";
    L_0x0154:
        r5 = s.ۜۘۡ.m282(r5);
        r6 = r17;
        r17 = r5;
        r5 = 0;
        goto L_0x001c;
    L_0x015f:
        r17 = r6;
        r6 = r2.start;
        r18 = s.ۗ۬۟.m257();
        if (r18 > 0) goto L_0x016e;
    L_0x016b:
        r6 = "ۥۧۚ";
        goto L_0x019d;
    L_0x016e:
        r4 = "ۨ۟۬";
        r4 = s.ۜۘۡ.m282(r4);
        r20 = r17;
        r17 = r4;
        r4 = r6;
        goto L_0x01b1;
    L_0x017a:
        r17 = r6;
        r6 = r0.textView;
        r6 = r6.getEditableText();
        r18 = s.ۢ۫ۗ.f21;
        if (r18 == 0) goto L_0x0187;
    L_0x0186:
        goto L_0x01bd;
    L_0x0187:
        r3 = "ۢۥۙ";
        r3 = s.ۜۘۡ.m282(r3);
        r20 = r17;
        r17 = r3;
        r3 = r6;
        goto L_0x01b1;
    L_0x0193:
        r17 = r6;
        r6 = r16.getPrevious();
        if (r6 != 0) goto L_0x01a6;
    L_0x019b:
        r6 = "ۧۨۢ";
    L_0x019d:
        r6 = s.ۢ۫ۗ.m350(r6);
    L_0x01a1:
        r20 = r17;
        r17 = r6;
        goto L_0x01b1;
    L_0x01a6:
        r2 = "۠۫ۦ";
        r2 = s.ۜۘۡ.m282(r2);
        r20 = r17;
        r17 = r2;
        r2 = r6;
    L_0x01b1:
        r6 = r20;
        goto L_0x001c;
    L_0x01b5:
        r17 = r6;
        r6 = r0.editHistory;
        r18 = s.ۢ۫ۗ.f21;
        if (r18 == 0) goto L_0x01c0;
    L_0x01bd:
        r6 = "ۙۢۚ";
        goto L_0x0140;
    L_0x01c0:
        r16 = "ۧ۬ۚ";
        r16 = s.ۜۘۡ.m282(r16);
        r20 = r16;
        r16 = r6;
    L_0x01ca:
        r6 = r17;
        r17 = r20;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.undo():void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x001b, code:
            if (s.۠ۡۧ.m431() == false) goto L_0x00a8;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0024, code:
            if (s.ۨۘۢ.f19 == 0) goto L_0x0097;
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x003f, code:
            r3 = "۠۟ۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:33:0x007b, code:
            r3 = "ۖ۟۠";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x0097, code:
            r3 = "ۦۢۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x009c, code:
            r3 = s.ۢ۫ۗ.m350(r3);
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00a8, code:
            r3 = "ۗۘۡ";
     */
    public boolean canRedo() {
        /*
        r6 = this;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = "۫ۧۧ";
    L_0x0005:
        r3 = s.ۜۘۡ.m282(r3);
    L_0x0009:
        switch(r3) {
            case 1738039: goto L_0x001f;
            case 1738044: goto L_0x0014;
            case 1738784: goto L_0x0028;
            case 1739182: goto L_0x006f;
            case 1741770: goto L_0x0036;
            case 1746710: goto L_0x0081;
            case 1747654: goto L_0x003b;
            case 1748333: goto L_0x0054;
            case 1748860: goto L_0x0067;
            case 1749459: goto L_0x00a2;
            case 1751235: goto L_0x0042;
            case 1751368: goto L_0x003e;
            case 1753159: goto L_0x003c;
            case 1753500: goto L_0x0031;
            case 1753665: goto L_0x0077;
            case 1758319: goto L_0x008a;
            case 1758386: goto L_0x0093;
            case 1758475: goto L_0x00b7;
            default: goto L_0x000c;
        };
    L_0x000c:
        r3 = s.ۛ۫ۧ.m593();
        if (r3 > 0) goto L_0x00b3;
    L_0x0012:
        goto L_0x00af;
    L_0x0014:
        s.ۚۤۙ.m296();
        r3 = s.۠ۡۧ.m431();
        if (r3 != 0) goto L_0x007b;
    L_0x001d:
        goto L_0x00a8;
    L_0x001f:
        s.ۚۡۢ.m112();
        r3 = s.ۨۘۢ.f19;
        if (r3 != 0) goto L_0x00a8;
    L_0x0026:
        goto L_0x0097;
    L_0x0028:
        s.ۨۧۜ.m755();
        r3 = s.ۚ۟ۢ.f5;
        if (r3 != 0) goto L_0x0097;
    L_0x002f:
        goto L_0x00bf;
    L_0x0031:
        s.ۗ۬۟.m257();
        goto L_0x00bf;
    L_0x0036:
        s.ۗ۬۟.m257();
        r0 = 0;
        return r0;
    L_0x003b:
        return r2;
    L_0x003c:
        r2 = 1;
        goto L_0x003f;
    L_0x003e:
        r2 = 0;
    L_0x003f:
        r3 = "۠۟ۥ";
        goto L_0x0005;
    L_0x0042:
        r3 = r6.editHistory;
        r3 = r3.historyList;
        r3 = r3.size();
        if (r1 >= r3) goto L_0x0051;
    L_0x004e:
        r3 = "ۦۗۘ";
        goto L_0x0005;
    L_0x0051:
        r3 = "ۤۛ۟";
        goto L_0x009c;
    L_0x0054:
        r3 = r0.position;
        r4 = s.ۢ۟ۚ.f10;
        if (r4 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x00af;
    L_0x005d:
        r1 = "ۤۗۖ";
        r1 = s.ۜۘۡ.m282(r1);
        r5 = r3;
        r3 = r1;
        r1 = r5;
        goto L_0x0009;
    L_0x0067:
        r3 = s.ۧۧۡ.f11;
        if (r3 != 0) goto L_0x006c;
    L_0x006b:
        goto L_0x007b;
    L_0x006c:
        r3 = "ۡۖۢ";
        goto L_0x0005;
    L_0x006f:
        r3 = s.ۛۨۦ.f46;
        if (r3 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x00bf;
    L_0x0074:
        r3 = "ۡۧۢ";
        goto L_0x009c;
    L_0x0077:
        r3 = s.۟ۤۗ.f20;
        if (r3 > 0) goto L_0x007e;
    L_0x007b:
        r3 = "ۖ۟۠";
        goto L_0x009c;
    L_0x007e:
        r3 = "ۗۥۜ";
        goto L_0x0005;
    L_0x0081:
        r3 = s.ۗۗۡ.f4;
        if (r3 != 0) goto L_0x0086;
    L_0x0085:
        goto L_0x00af;
    L_0x0086:
        r3 = "ۦۧۢ";
        goto L_0x0005;
    L_0x008a:
        r3 = s.ۜۘۡ.f17;
        if (r3 > 0) goto L_0x008f;
    L_0x008e:
        goto L_0x00bf;
    L_0x008f:
        r3 = "۟۠ۗ";
        goto L_0x0005;
    L_0x0093:
        r3 = s.۠ۡ۟.f8;
        if (r3 > 0) goto L_0x009a;
    L_0x0097:
        r3 = "ۦۢۘ";
        goto L_0x009c;
    L_0x009a:
        r3 = "۫ۢۦ";
    L_0x009c:
        r3 = s.ۢ۫ۗ.m350(r3);
        goto L_0x0009;
    L_0x00a2:
        r3 = s.ۤۗۛ.m370();
        if (r3 < 0) goto L_0x00ab;
    L_0x00a8:
        r3 = "ۗۘۡ";
        goto L_0x009c;
    L_0x00ab:
        r3 = "۫ۤ۫";
        goto L_0x0005;
    L_0x00af:
        r3 = "ۖ۟ۥ";
        goto L_0x0005;
    L_0x00b3:
        r3 = "ۢۛ۬";
        goto L_0x0005;
    L_0x00b7:
        r3 = r6.editHistory;
        r4 = s.ۢ۫ۜ.m625();
        if (r4 < 0) goto L_0x00c3;
    L_0x00bf:
        r3 = "ۚۛ۫";
        goto L_0x0005;
    L_0x00c3:
        r0 = "۬ۗۖ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r5 = r3;
        r3 = r0;
        r0 = r5;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.canRedo():boolean");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0030, code:
            r17 = r6;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x003a, code:
            if (s.ۢۜۘ.f15 != 0) goto L_0x003c;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x003c, code:
            r17 = r6;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x0042, code:
            if (s.۟ۧۢ.f60 <= 0) goto L_0x0044;
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x0044, code:
            r17 = r6;
     */
    /* DevToolsApp WARNING: Missing block: B:25:0x006f, code:
            r17 = s.ۢ۫ۗ.m350("ۚ۠ۙ");
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x008e, code:
            r6 = "ۤۨ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x009d, code:
            r6 = "ۧۥۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x00d6, code:
            r6 = s.ۜۘۡ.m282(r6);
     */
    /* DevToolsApp WARNING: Missing block: B:46:0x00e6, code:
            r6 = "۫ۤۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x012d, code:
            r6 = "ۥۛ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:65:0x015a, code:
            r6 = "ۨۛۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:74:0x0190, code:
            r6 = s.ۢ۫ۗ.m350(r6);
     */
    /* DevToolsApp WARNING: Missing block: B:75:0x0194, code:
            r20 = r17;
            r17 = r6;
     */
    /* DevToolsApp WARNING: Missing block: B:77:0x01a4, code:
            r6 = r20;
     */
    /* DevToolsApp WARNING: Missing block: B:82:0x01bf, code:
            r6 = r17;
            r17 = r20;
     */
    public void redo() {
        /*
        r21 = this;
        r0 = r21;
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
        r17 = "ۖۦ۫";
        r17 = s.ۢ۫ۗ.m350(r17);
        r16 = r1;
        r1 = 0;
    L_0x001c:
        switch(r17) {
            case 1738267: goto L_0x01a8;
            case 1739104: goto L_0x0066;
            case 1739775: goto L_0x014e;
            case 1741907: goto L_0x004f;
            case 1742887: goto L_0x00c7;
            case 1743960: goto L_0x0091;
            case 1744091: goto L_0x0129;
            case 1747096: goto L_0x0085;
            case 1747563: goto L_0x00dc;
            case 1748022: goto L_0x0186;
            case 1748047: goto L_0x00f5;
            case 1751771: goto L_0x007a;
            case 1752342: goto L_0x0103;
            case 1753199: goto L_0x016a;
            case 1753296: goto L_0x005d;
            case 1753334: goto L_0x011d;
            case 1753631: goto L_0x0131;
            case 1754418: goto L_0x002c;
            case 1754445: goto L_0x0047;
            case 1754471: goto L_0x00ac;
            case 1754566: goto L_0x004b;
            case 1755057: goto L_0x0130;
            case 1755190: goto L_0x0053;
            case 1755205: goto L_0x0040;
            case 1758377: goto L_0x0038;
            default: goto L_0x001f;
        };
    L_0x001f:
        r17 = r6;
        r6 = r14[r1];
        r3.removeSpan(r6);
        r6 = s.ۚۤۙ.f18;
        if (r6 > 0) goto L_0x0062;
    L_0x002a:
        goto L_0x00e6;
    L_0x002c:
        r17 = s.ۢ۟ۚ.f10;
        if (r17 != 0) goto L_0x0034;
    L_0x0030:
        r17 = r6;
        goto L_0x015a;
    L_0x0034:
        r17 = r6;
        goto L_0x00e6;
    L_0x0038:
        r17 = s.ۢۜۘ.f15;
        if (r17 == 0) goto L_0x0030;
    L_0x003c:
        r17 = r6;
        goto L_0x01b2;
    L_0x0040:
        r17 = s.۟ۧۢ.f60;
        if (r17 > 0) goto L_0x003c;
    L_0x0044:
        r17 = r6;
        goto L_0x009d;
    L_0x0047:
        s.ۗۗۡ.m78();
        goto L_0x0044;
    L_0x004b:
        s.ۗۢۢ.m454();
        return;
    L_0x004f:
        android.text.Selection.setSelection(r3, r6);
        return;
    L_0x0053:
        r6 = s.ۛۨۦ.m553(r2);
        r6 = s.ۤۤۖ.m499(r6);
        r6 = r6 + r4;
        goto L_0x006f;
    L_0x005d:
        r1 = r1 + 1;
        r17 = r6;
        goto L_0x008e;
    L_0x0062:
        r6 = "ۦۛۥ";
        goto L_0x0190;
    L_0x0066:
        r17 = r6;
        r6 = s.۠ۡ۟.m143(r2);
        if (r6 != 0) goto L_0x0076;
    L_0x006e:
        r6 = r4;
    L_0x006f:
        r17 = "ۚ۠ۙ";
        r17 = s.ۢ۫ۗ.m350(r17);
        goto L_0x001c;
    L_0x0076:
        r6 = "ۨۚۨ";
        goto L_0x0190;
    L_0x007a:
        r17 = r6;
        if (r1 >= r15) goto L_0x0082;
    L_0x007e:
        r6 = "ۦۨۥ";
        goto L_0x0190;
    L_0x0082:
        r6 = "ۗۢ۫";
        goto L_0x00d6;
    L_0x0085:
        r17 = r6;
        r1 = r13;
        r1 = (android.text.style.UnderlineSpan[]) r1;
        r6 = r1.length;
        r14 = r1;
        r1 = r5;
        r15 = r6;
    L_0x008e:
        r6 = "ۤۨ۟";
        goto L_0x00d6;
    L_0x0091:
        r17 = r6;
        r6 = r3.getSpans(r5, r11, r12);
        r18 = s.ۗ۬ۦ.m407();
        if (r18 != 0) goto L_0x00a1;
    L_0x009d:
        r6 = "ۧۥۤ";
        goto L_0x0190;
    L_0x00a1:
        r13 = "۟۬ۥ";
        r13 = s.ۢ۫ۗ.m350(r13);
        r20 = r13;
        r13 = r6;
        goto L_0x01bf;
    L_0x00ac:
        r17 = r6;
        r6 = s.ۨۗۥ.m540(r3);
        r18 = android.text.style.UnderlineSpan.class;
        r19 = s.ۗۗۡ.f4;
        if (r19 != 0) goto L_0x00ba;
    L_0x00b8:
        goto L_0x0176;
    L_0x00ba:
        r11 = "ۜۤ۠";
        r11 = s.ۢ۫ۗ.m350(r11);
        r12 = r18;
        r20 = r11;
        r11 = r6;
        goto L_0x01bf;
    L_0x00c7:
        r17 = r6;
        r3.replace(r4, r8, r10);
        r0.isUndoOrRedo = r5;
        r6 = s.ۢۜۘ.f15;
        if (r6 == 0) goto L_0x00d4;
    L_0x00d2:
        goto L_0x0176;
    L_0x00d4:
        r6 = "ۧۢۢ";
    L_0x00d6:
        r6 = s.ۜۘۡ.m282(r6);
        goto L_0x0194;
    L_0x00dc:
        r17 = r6;
        r6 = s.۠ۡ۟.m143(r2);
        r18 = s.۫۫ۗ.f65;
        if (r18 == 0) goto L_0x00ea;
    L_0x00e6:
        r6 = "۫ۤۢ";
        goto L_0x0190;
    L_0x00ea:
        r10 = "ۛ۠۬";
        r10 = s.ۜۘۡ.m282(r10);
        r20 = r10;
        r10 = r6;
        goto L_0x01bf;
    L_0x00f5:
        r17 = r6;
        r0.isUndoOrRedo = r9;
        r6 = s.ۧۧۡ.f11;
        if (r6 != 0) goto L_0x00ff;
    L_0x00fd:
        goto L_0x01b2;
    L_0x00ff:
        r6 = "۠ۜۧ";
        goto L_0x0190;
    L_0x0103:
        r17 = r6;
        r6 = r7 + r4;
        r18 = 1;
        r19 = s.۠ۡۧ.m431();
        if (r19 != 0) goto L_0x0111;
    L_0x010f:
        goto L_0x01b2;
    L_0x0111:
        r8 = "۠۬ۛ";
        r8 = s.ۢ۫ۗ.m350(r8);
        r9 = 1;
        r20 = r8;
        r8 = r6;
        goto L_0x01bf;
    L_0x011d:
        r17 = r6;
        r6 = s.ۢۜۘ.m248(r2);
        r6 = s.ۨۗۥ.m540(r6);
        r7 = r6;
        goto L_0x012d;
    L_0x0129:
        r17 = r6;
        r6 = 0;
        r7 = 0;
    L_0x012d:
        r6 = "ۥۛ۬";
        goto L_0x0190;
    L_0x0130:
        return;
    L_0x0131:
        r17 = r6;
        r5 = s.ۢۜۘ.m248(r2);
        r6 = 0;
        if (r5 == 0) goto L_0x0141;
    L_0x013a:
        r5 = "ۦۜ۬";
        r5 = s.ۜۘۡ.m282(r5);
        goto L_0x0147;
    L_0x0141:
        r5 = "ۜۨۧ";
        r5 = s.ۢ۫ۗ.m350(r5);
    L_0x0147:
        r6 = r17;
        r17 = r5;
        r5 = 0;
        goto L_0x001c;
    L_0x014e:
        r17 = r6;
        r6 = r2.start;
        r18 = s.۫ۢ۠.m237();
        if (r18 < 0) goto L_0x015e;
    L_0x015a:
        r6 = "ۨۛۘ";
        goto L_0x00d6;
    L_0x015e:
        r4 = "ۦۦ۟";
        r4 = s.ۜۘۡ.m282(r4);
        r20 = r17;
        r17 = r4;
        r4 = r6;
        goto L_0x01a4;
    L_0x016a:
        r17 = r6;
        r6 = r0.textView;
        r6 = r6.getEditableText();
        r18 = s.ۗۢۢ.f29;
        if (r18 < 0) goto L_0x017a;
    L_0x0176:
        r6 = "ۧ۠۫";
        goto L_0x00d6;
    L_0x017a:
        r3 = "ۘۙ۠";
        r3 = s.ۜۘۡ.m282(r3);
        r20 = r17;
        r17 = r3;
        r3 = r6;
        goto L_0x01a4;
    L_0x0186:
        r17 = r6;
        r6 = r16.getNext();
        if (r6 != 0) goto L_0x0199;
    L_0x018e:
        r6 = "ۨۖ۟";
    L_0x0190:
        r6 = s.ۢ۫ۗ.m350(r6);
    L_0x0194:
        r20 = r17;
        r17 = r6;
        goto L_0x01a4;
    L_0x0199:
        r2 = "ۦۘۡ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r20 = r17;
        r17 = r2;
        r2 = r6;
    L_0x01a4:
        r6 = r20;
        goto L_0x001c;
    L_0x01a8:
        r17 = r6;
        r6 = r0.editHistory;
        r18 = s.ۨۘۢ.m318();
        if (r18 == 0) goto L_0x01b5;
    L_0x01b2:
        r6 = "ۧۡۧ";
        goto L_0x0190;
    L_0x01b5:
        r16 = "۠۫ۡ";
        r16 = s.ۢ۫ۗ.m350(r16);
        r20 = r16;
        r16 = r6;
    L_0x01bf:
        r6 = r17;
        r17 = r20;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.redo():void");
    }

    /* DevToolsApp WARNING: Missing block: B:4:0x000d, code:
            if (s.ۤۤۖ.f35 != 0) goto L_0x0098;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x001d, code:
            if (s.۬ۨۨ.f57 != false) goto L_0x0070;
     */
    /* DevToolsApp WARNING: Missing block: B:15:0x0031, code:
            r2 = "ۤ۫۫";
     */
    /* DevToolsApp WARNING: Missing block: B:25:0x004c, code:
            r2 = "ۦ۬ۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:33:0x0065, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x0084, code:
            r2 = "ۜۙۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:50:0x0098, code:
            r2 = "ۛۡۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x00a5, code:
            r2 = "ۜۤۚ";
     */
    public boolean canUndo() {
        /*
        r5 = this;
        r0 = 0;
        r1 = 0;
        r2 = "ۙۙ۟";
    L_0x0004:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x0008:
        switch(r2) {
            case 1737885: goto L_0x002e;
            case 1740153: goto L_0x0034;
            case 1740735: goto L_0x009f;
            case 1741081: goto L_0x0040;
            case 1742070: goto L_0x0076;
            case 1742763: goto L_0x005c;
            case 1742912: goto L_0x0025;
            case 1743809: goto L_0x0030;
            case 1743954: goto L_0x001b;
            case 1747674: goto L_0x0048;
            case 1749592: goto L_0x0020;
            case 1751876: goto L_0x002d;
            case 1752201: goto L_0x0052;
            case 1753410: goto L_0x0080;
            case 1753814: goto L_0x0011;
            case 1754660: goto L_0x006a;
            case 1759092: goto L_0x008b;
            case 1759397: goto L_0x0094;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = s.ۤۤۖ.f35;
        if (r2 == 0) goto L_0x0070;
    L_0x000f:
        goto L_0x0098;
    L_0x0011:
        s.ۙۜۦ.m520();
        r2 = s.ۨۗۥ.m536();
        if (r2 == 0) goto L_0x00a5;
    L_0x001a:
        goto L_0x0070;
    L_0x001b:
        r2 = s.۬ۨۨ.f57;
        if (r2 == 0) goto L_0x0084;
    L_0x001f:
        goto L_0x0070;
    L_0x0020:
        s.۟ۤۗ.m332();
        goto L_0x0098;
    L_0x0025:
        s.ۛۨۦ.m559();
        s.ۗۤ۫.m195();
        r0 = 0;
        return r0;
    L_0x002d:
        return r1;
    L_0x002e:
        r1 = 1;
        goto L_0x0031;
    L_0x0030:
        r1 = 0;
    L_0x0031:
        r2 = "ۤ۫۫";
        goto L_0x0004;
    L_0x0034:
        r2 = r0.position;
        if (r2 <= 0) goto L_0x003d;
    L_0x003a:
        r2 = "ۖۚۡ";
        goto L_0x0065;
    L_0x003d:
        r2 = "ۜ۟ۤ";
        goto L_0x0004;
    L_0x0040:
        r2 = s.ۖۜ۟.f34;
        if (r2 < 0) goto L_0x0045;
    L_0x0044:
        goto L_0x004c;
    L_0x0045:
        r2 = "ۘۥۦ";
        goto L_0x0065;
    L_0x0048:
        r2 = s.ۡۢۡ.f3;
        if (r2 < 0) goto L_0x004f;
    L_0x004c:
        r2 = "ۦ۬ۜ";
        goto L_0x0004;
    L_0x004f:
        r2 = "ۙۤۤ";
        goto L_0x0004;
    L_0x0052:
        r2 = s.ۗۢۢ.m454();
        if (r2 < 0) goto L_0x0059;
    L_0x0058:
        goto L_0x0070;
    L_0x0059:
        r2 = "۠۠ۚ";
        goto L_0x0065;
    L_0x005c:
        r2 = s.ۗ۬ۦ.m407();
        if (r2 != 0) goto L_0x0063;
    L_0x0062:
        goto L_0x00a5;
    L_0x0063:
        r2 = "ۥۗۛ";
    L_0x0065:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x0008;
    L_0x006a:
        r2 = s.ۥۘۧ.m662();
        if (r2 > 0) goto L_0x0073;
    L_0x0070:
        r2 = "ۢ۠ۖ";
        goto L_0x0065;
    L_0x0073:
        r2 = "ۛۜ۬";
        goto L_0x0004;
    L_0x0076:
        r2 = s.ۢ۫ۗ.m342();
        if (r2 != 0) goto L_0x007d;
    L_0x007c:
        goto L_0x0098;
    L_0x007d:
        r2 = "ۧۨۥ";
        goto L_0x0004;
    L_0x0080:
        r2 = s.ۖۜ۟.f34;
        if (r2 < 0) goto L_0x0087;
    L_0x0084:
        r2 = "ۜۙۗ";
        goto L_0x0065;
    L_0x0087:
        r2 = "ۚۥۡ";
        goto L_0x0004;
    L_0x008b:
        r2 = s.ۗۜ۟.f33;
        if (r2 > 0) goto L_0x0090;
    L_0x008f:
        goto L_0x0098;
    L_0x0090:
        r2 = "ۦ۟ۛ";
        goto L_0x0004;
    L_0x0094:
        r2 = s.ۗۤ۫.f12;
        if (r2 == 0) goto L_0x009b;
    L_0x0098:
        r2 = "ۛۡۦ";
        goto L_0x0065;
    L_0x009b:
        r2 = "۬ۜۤ";
        goto L_0x0004;
    L_0x009f:
        r2 = r5.editHistory;
        r3 = s.ۜۘۡ.f17;
        if (r3 > 0) goto L_0x00a9;
    L_0x00a5:
        r2 = "ۜۤۚ";
        goto L_0x0004;
    L_0x00a9:
        r0 = "۬ۦ۟";
        r0 = s.ۢ۫ۗ.m350(r0);
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.CodeView.UndoRedoManager.canUndo():boolean");
    }
}
