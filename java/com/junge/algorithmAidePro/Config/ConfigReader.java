package com.junge.algorithmAidePro.Config;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import androidx.annotation.Nullable;
import com.junge.algorithmAidePro.jungeRPC.AlgorithmClient;
import java.io.File;
import java.util.Map;
import java.util.Set;
import s.ۢۜۘ;

public class ConfigReader implements SharedPreferences {
    /* renamed from: ۟ۦۜ */
    private static final short[] f77 = new short[]{(short) 9561, (short) 7410, (short) 7377, (short) 7385, (short) 7367, (short) 7367, (short) 7367, (short) 7367, (short) 7315, (short) 7411, (short) 7411, (short) 7315, (short) 7386, (short) 7386, (short) 7393, (short) 7414, (short) 7414, (short) 7393, (short) 7379, (short) 7379, (short) 7393, (short) 7373, (short) 7373, (short) 7312, (short) 7378, (short) 7377, (short) 7385, (short) 288, (short) 9159, (short) 9163, (short) 9162, (short) 9154, (short) 9165, (short) 9155, (short) 9098, (short) 9166, (short) 9175, (short) 9163, (short) 9162, (short) 9159, (short) 9163, (short) 9161, (short) 9098, (short) 9166, (short) 9169, (short) 9162, (short) 9155, (short) 9153, (short) 9098, (short) 9157, (short) 9160, (short) 9155, (short) 9163, (short) 9174, (short) 9165, (short) 9168, (short) 9164, (short) 9161, (short) 9189, (short) 9165, (short) 9152, (short) 9153, (short) 9204, (short) 9174, (short) 9163, (short) 522, (short) 23868, (short) 23856, (short) 23857, (short) 23865, (short) 23862, (short) 23864, (short) 23921, (short) 23861, (short) 23852, (short) 23856, (short) 23857, (short) 3157, (short) -24607, (short) -24602, (short) -24602, (short) -24606, (short) -24635, (short) -24608, (short) -24582, (short) -24579, (short) 3720, (short) -28525, (short) -28524, (short) -28524, (short) -28528, (short) -28489, (short) -28526, (short) -28536, (short) -28529, (short) 6961, (short) -24604, (short) -24586, (short) -24607, (short) -24590, (short) -24649, (short) -24590, (short) -24603, (short) -24603, (short) -24584, (short) -24603, (short) -24645, (short) -24620, (short) -24584, (short) -24583, (short) -24591, (short) -24578, (short) -24592, (short) -24635, (short) -24590, (short) -24586, (short) -24589, (short) -24590, (short) -24603, (short) -24649, (short) -24578, (short) -24604, (short) -24649, (short) -24603, (short) -24590, (short) -24586, (short) -24589, (short) -24649, (short) -24584, (short) -24583, (short) -24581, (short) -24594, (short) -24588, (short) -24584, (short) -24583, (short) -24591, (short) -24578, (short) -24592, (short) -24647, (short) -24579, (short) -24604, (short) -24584, (short) -24583};
    public AlgorithmClient algorithmClient;
    public Map<String, Object> configData;
    public File configFile;
    public ConfigListener configListener;
    public android.content.SharedPreferences.Editor editor;
    public String packageName;
    public boolean readOnly;
    public String strConfigData;

    public static class Editor implements android.content.SharedPreferences.Editor {
        public ConfigReader configReader;

        public Editor(ConfigReader configReader) {
            this.configReader = configReader;
        }

        public void apply() {
            this.configReader.save();
        }

        public android.content.SharedPreferences.Editor clear() {
            this.configReader.configData.clear();
            return this;
        }

        public boolean commit() {
            apply();
            return true;
        }

        /* DevToolsApp WARNING: Missing block: B:4:0x000b, code:
            if (s.۟ۤۗ.f20 <= 0) goto L_0x008a;
     */
        /* DevToolsApp WARNING: Missing block: B:32:0x006b, code:
            r0 = "ۧۚۙ";
     */
        /* DevToolsApp WARNING: Missing block: B:43:0x008a, code:
            r0 = "۠۟ۢ";
     */
        public android.content.SharedPreferences.Editor putFloat(java.lang.String r2, float r3) {
            /*
            r1 = this;
            r0 = "ۡۥۡ";
        L_0x0002:
            r0 = s.ۢ۫ۗ.m350(r0);
        L_0x0006:
            switch(r0) {
                case 1737817: goto L_0x001d;
                case 1738806: goto L_0x005f;
                case 1742651: goto L_0x0071;
                case 1742991: goto L_0x0049;
                case 1743127: goto L_0x0053;
                case 1743551: goto L_0x0084;
                case 1746482: goto L_0x0079;
                case 1747651: goto L_0x0025;
                case 1747655: goto L_0x002d;
                case 1748425: goto L_0x0015;
                case 1748797: goto L_0x0091;
                case 1748803: goto L_0x000f;
                case 1751780: goto L_0x0041;
                case 1754460: goto L_0x0067;
                case 1754618: goto L_0x0037;
                default: goto L_0x0009;
            };
        L_0x0009:
            r0 = s.۟ۤۗ.f20;
            if (r0 > 0) goto L_0x0059;
        L_0x000d:
            goto L_0x008a;
        L_0x000f:
            r0 = s.۟ۧۢ.f60;
            if (r0 <= 0) goto L_0x007d;
        L_0x0013:
            goto L_0x008a;
        L_0x0015:
            s.ۤۤۖ.m506();
            r0 = s.ۖۙۜ.f48;
            if (r0 != 0) goto L_0x006b;
        L_0x001c:
            goto L_0x0059;
        L_0x001d:
            s.ۗ۬ۦ.m407();
            s.ۨۧۚ.m718();
            goto L_0x008a;
        L_0x0025:
            s.ۨۗۥ.m536();
            s.ۡۘۗ.m32();
            r2 = 0;
            return r2;
        L_0x002d:
            r0 = r1.configReader;
            r3 = java.lang.Float.valueOf(r3);
            s.ۙۜۦ.m516(r0, r2, r3);
            return r1;
        L_0x0037:
            r0 = s.ۧۧۡ.f11;
            if (r0 != 0) goto L_0x003d;
        L_0x003b:
            goto L_0x0095;
        L_0x003d:
            r0 = "۠۟ۦ";
            goto L_0x009b;
        L_0x0041:
            r0 = s.ۨۧۚ.f56;
            if (r0 != 0) goto L_0x0046;
        L_0x0045:
            goto L_0x008a;
        L_0x0046:
            r0 = "ۧۧۚ";
            goto L_0x009b;
        L_0x0049:
            r0 = s.ۗ۬۟.m257();
            if (r0 > 0) goto L_0x0050;
        L_0x004f:
            goto L_0x0059;
        L_0x0050:
            r0 = "ۤۨۨ";
            goto L_0x0002;
        L_0x0053:
            r0 = s.ۨۗۥ.m536();
            if (r0 == 0) goto L_0x005c;
        L_0x0059:
            r0 = "ۖۘۛ";
            goto L_0x009b;
        L_0x005c:
            r0 = "ۛۤۘ";
            goto L_0x009b;
        L_0x005f:
            r0 = s.ۦۡۤ.f25;
            if (r0 == 0) goto L_0x0064;
        L_0x0063:
            goto L_0x006b;
        L_0x0064:
            r0 = "ۛۨۤ";
            goto L_0x009b;
        L_0x0067:
            r0 = s.ۨۧۜ.f59;
            if (r0 == 0) goto L_0x006e;
        L_0x006b:
            r0 = "ۧۚۙ";
            goto L_0x0002;
        L_0x006e:
            r0 = "ۗۙۘ";
            goto L_0x0002;
        L_0x0071:
            r0 = s.ۨۧۚ.f56;
            if (r0 != 0) goto L_0x0076;
        L_0x0075:
            goto L_0x008a;
        L_0x0076:
            r0 = "ۧۢۗ";
            goto L_0x0002;
        L_0x0079:
            r0 = s.ۛ۫ۧ.f49;
            if (r0 != 0) goto L_0x0080;
        L_0x007d:
            r0 = "ۡۙۡ";
            goto L_0x0002;
        L_0x0080:
            r0 = "ۛۙۙ";
            goto L_0x0002;
        L_0x0084:
            r0 = s.ۦۢۜ.m16();
            if (r0 == 0) goto L_0x008d;
        L_0x008a:
            r0 = "۠۟ۢ";
            goto L_0x009b;
        L_0x008d:
            r0 = "۟ۘ۫";
            goto L_0x0002;
        L_0x0091:
            r0 = s.ۗ۬۟.f16;
            if (r0 == 0) goto L_0x0099;
        L_0x0095:
            r0 = "ۡۥۧ";
            goto L_0x0002;
        L_0x0099:
            r0 = "ۜۗۚ";
        L_0x009b:
            r0 = s.ۜۘۡ.m282(r0);
            goto L_0x0006;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.Editor.putFloat(java.lang.String, float):android.content.SharedPreferences$Editor");
        }

        /* DevToolsApp WARNING: Missing block: B:6:0x0013, code:
            if (s.ۚ۟ۢ.f5 != false) goto L_0x0089;
     */
        /* DevToolsApp WARNING: Missing block: B:8:0x001b, code:
            if (s.ۢ۟ۚ.m168() <= 0) goto L_0x0094;
     */
        /* DevToolsApp WARNING: Missing block: B:32:0x0069, code:
            r0 = "ۢۡ۠";
     */
        /* DevToolsApp WARNING: Missing block: B:43:0x0089, code:
            r0 = "ۜۖۦ";
     */
        public android.content.SharedPreferences.Editor putString(java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3) {
            /*
            r1 = this;
            r0 = "ۗۚۚ";
        L_0x0002:
            r0 = s.ۜۘۡ.m282(r0);
        L_0x0006:
            switch(r0) {
                case 1737861: goto L_0x003f;
                case 1738043: goto L_0x002c;
                case 1738278: goto L_0x0032;
                case 1738839: goto L_0x0090;
                case 1738872: goto L_0x0083;
                case 1740824: goto L_0x0063;
                case 1741205: goto L_0x0059;
                case 1741895: goto L_0x004f;
                case 1743532: goto L_0x0017;
                case 1749633: goto L_0x001f;
                case 1754090: goto L_0x006f;
                case 1754774: goto L_0x0047;
                case 1755404: goto L_0x0024;
                case 1755550: goto L_0x000e;
                case 1758966: goto L_0x0077;
                default: goto L_0x0009;
            };
        L_0x0009:
            r0 = s.۠ۡۧ.f26;
            if (r0 != 0) goto L_0x0089;
        L_0x000d:
            goto L_0x0069;
        L_0x000e:
            s.ۙۜۦ.m520();
            r0 = s.ۚ۟ۢ.f5;
            if (r0 == 0) goto L_0x007d;
        L_0x0015:
            goto L_0x0089;
        L_0x0017:
            r0 = s.ۢ۟ۚ.m168();
            if (r0 > 0) goto L_0x0069;
        L_0x001d:
            goto L_0x0094;
        L_0x001f:
            s.ۗۜ۟.m469();
            goto L_0x0094;
        L_0x0024:
            s.ۡۢۡ.m58();
            s.ۡۢۡ.m58();
            r2 = 0;
            return r2;
        L_0x002c:
            r0 = r1.configReader;
            s.ۗۢۢ.m451(r0, r2, r3);
            return r1;
        L_0x0032:
            r0 = s.ۢ۫ۜ.m625();
            if (r0 < 0) goto L_0x003c;
        L_0x0038:
            r0 = "ۨۦۜ";
            goto L_0x0099;
        L_0x003c:
            r0 = "ۖ۟ۤ";
            goto L_0x0002;
        L_0x003f:
            r0 = s.ۤۤۖ.f35;
            if (r0 == 0) goto L_0x0044;
        L_0x0043:
            goto L_0x007d;
        L_0x0044:
            r0 = "ۖۧۗ";
            goto L_0x0002;
        L_0x0047:
            r0 = s.ۢ۫ۜ.f51;
            if (r0 < 0) goto L_0x004c;
        L_0x004b:
            goto L_0x007d;
        L_0x004c:
            r0 = "ۖۙۨ";
            goto L_0x0099;
        L_0x004f:
            r0 = s.ۥۘۧ.m662();
            if (r0 > 0) goto L_0x0056;
        L_0x0055:
            goto L_0x007d;
        L_0x0056:
            r0 = "ۧ۬ۛ";
            goto L_0x0099;
        L_0x0059:
            r0 = s.ۙۖۥ.m748();
            if (r0 > 0) goto L_0x0060;
        L_0x005f:
            goto L_0x0094;
        L_0x0060:
            r0 = "ۚ۟۬";
            goto L_0x0099;
        L_0x0063:
            r0 = s.ۡۗۗ.m159();
            if (r0 == 0) goto L_0x006c;
        L_0x0069:
            r0 = "ۢۡ۠";
            goto L_0x0099;
        L_0x006c:
            r0 = "ۙۨۤ";
            goto L_0x0099;
        L_0x006f:
            r0 = s.ۚ۟ۢ.f5;
            if (r0 != 0) goto L_0x0074;
        L_0x0073:
            goto L_0x0094;
        L_0x0074:
            r0 = "ۙۜۛ";
            goto L_0x0002;
        L_0x0077:
            r0 = s.ۚ۟ۢ.m85();
            if (r0 == 0) goto L_0x0080;
        L_0x007d:
            r0 = "ۦۗ۬";
            goto L_0x0002;
        L_0x0080:
            r0 = "ۧۖۙ";
            goto L_0x0099;
        L_0x0083:
            r0 = s.ۦۡۤ.m396();
            if (r0 == 0) goto L_0x008d;
        L_0x0089:
            r0 = "ۜۖۦ";
            goto L_0x0002;
        L_0x008d:
            r0 = "۬ۘۢ";
            goto L_0x0099;
        L_0x0090:
            r0 = s.ۡۥۗ.f47;
            if (r0 == 0) goto L_0x0097;
        L_0x0094:
            r0 = "ۨۡۥ";
            goto L_0x0099;
        L_0x0097:
            r0 = "ۗۛۜ";
        L_0x0099:
            r0 = s.ۢ۫ۗ.m350(r0);
            goto L_0x0006;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.Editor.putString(java.lang.String, java.lang.String):android.content.SharedPreferences$Editor");
        }

        /* DevToolsApp WARNING: Missing block: B:9:0x001d, code:
            if (s.ۚ۟ۢ.m85() != 0) goto L_0x007c;
     */
        /* DevToolsApp WARNING: Missing block: B:21:0x004f, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
        /* DevToolsApp WARNING: Missing block: B:27:0x0060, code:
            r1 = "ۜ۠ۖ";
     */
        public android.content.SharedPreferences.Editor remove(java.lang.String r5) {
            /*
            r4 = this;
            r0 = 0;
            r1 = "۠ۢۧ";
        L_0x0003:
            r1 = s.ۢ۫ۗ.m350(r1);
        L_0x0007:
            switch(r1) {
                case 1740024: goto L_0x008b;
                case 1741329: goto L_0x0046;
                case 1741704: goto L_0x002f;
                case 1742288: goto L_0x0054;
                case 1743826: goto L_0x0021;
                case 1744012: goto L_0x0082;
                case 1747439: goto L_0x0019;
                case 1747749: goto L_0x0099;
                case 1747862: goto L_0x0010;
                case 1749472: goto L_0x002b;
                case 1751277: goto L_0x0066;
                case 1753782: goto L_0x0070;
                case 1753792: goto L_0x005c;
                case 1754753: goto L_0x0034;
                case 1758211: goto L_0x0078;
                default: goto L_0x000a;
            };
        L_0x000a:
            r0 = r0.configData;
            r0.remove(r5);
            return r4;
        L_0x0010:
            r1 = s.ۗۢۢ.f29;
            if (r1 < 0) goto L_0x0016;
        L_0x0014:
            goto L_0x007c;
        L_0x0016:
            r1 = "۠ۘۧ";
            goto L_0x004f;
        L_0x0019:
            r1 = s.ۚ۟ۢ.m85();
            if (r1 == 0) goto L_0x0060;
        L_0x001f:
            goto L_0x007c;
        L_0x0021:
            s.۠ۜۗ.m214();
            r1 = s.۟ۥۙ.m650();
            if (r1 <= 0) goto L_0x0091;
        L_0x002a:
            goto L_0x007c;
        L_0x002b:
            s.ۡۢۡ.m58();
            goto L_0x007c;
        L_0x002f:
            s.ۗ۠ۚ.m442();
            r5 = 0;
            return r5;
        L_0x0034:
            r1 = r4.configReader;
            r2 = s.ۦۢۜ.f1;
            if (r2 > 0) goto L_0x003c;
        L_0x003a:
            goto L_0x009d;
        L_0x003c:
            r0 = "۫ۜۨ";
            r0 = s.ۢ۫ۗ.m350(r0);
            r3 = r1;
            r1 = r0;
            r0 = r3;
            goto L_0x0007;
        L_0x0046:
            r1 = s.۟ۤۗ.m332();
            if (r1 > 0) goto L_0x004d;
        L_0x004c:
            goto L_0x007c;
        L_0x004d:
            r1 = "ۧ۫ۥ";
        L_0x004f:
            r1 = s.ۜۘۡ.m282(r1);
            goto L_0x0007;
        L_0x0054:
            r1 = s.ۥۥۚ.f50;
            if (r1 == 0) goto L_0x0059;
        L_0x0058:
            goto L_0x0091;
        L_0x0059:
            r1 = "ۙ۬ۤ";
            goto L_0x0003;
        L_0x005c:
            r1 = s.ۚۡۢ.f7;
            if (r1 != 0) goto L_0x0063;
        L_0x0060:
            r1 = "ۜ۠ۖ";
            goto L_0x004f;
        L_0x0063:
            r1 = "ۚ۬ۢ";
            goto L_0x0003;
        L_0x0066:
            r1 = s.ۗۜۛ.m698();
            if (r1 > 0) goto L_0x006d;
        L_0x006c:
            goto L_0x0091;
        L_0x006d:
            r1 = "ۦ۫ۥ";
            goto L_0x0003;
        L_0x0070:
            r1 = s.ۤۤۖ.f35;
            if (r1 == 0) goto L_0x0075;
        L_0x0074:
            goto L_0x007c;
        L_0x0075:
            r1 = "ۤۘۡ";
            goto L_0x0003;
        L_0x0078:
            r1 = s.ۤۤۖ.f35;
            if (r1 == 0) goto L_0x007f;
        L_0x007c:
            r1 = "ۚۙۧ";
            goto L_0x004f;
        L_0x007f:
            r1 = "ۦ۫ۛ";
            goto L_0x0003;
        L_0x0082:
            r1 = s.ۚۡۢ.f7;
            if (r1 != 0) goto L_0x0087;
        L_0x0086:
            goto L_0x009d;
        L_0x0087:
            r1 = "۫۟ۗ";
            goto L_0x0003;
        L_0x008b:
            r1 = s.ۗ۬۟.m257();
            if (r1 > 0) goto L_0x0095;
        L_0x0091:
            r1 = "ۢۜۚ";
            goto L_0x0003;
        L_0x0095:
            r1 = "ۜۦۖ";
            goto L_0x0003;
        L_0x0099:
            r1 = s.ۢ۫ۗ.f21;
            if (r1 == 0) goto L_0x00a1;
        L_0x009d:
            r1 = "۠ۦۜ";
            goto L_0x0003;
        L_0x00a1:
            r1 = "ۘۡۡ";
            goto L_0x0003;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.Editor.remove(java.lang.String):android.content.SharedPreferences$Editor");
        }

        /* DevToolsApp WARNING: Missing block: B:5:0x0018, code:
            if (s.ۥۘۧ.m662() <= 0) goto L_0x0098;
     */
        /* DevToolsApp WARNING: Missing block: B:7:0x0020, code:
            if (s.ۗۜ۟.m469() > 0) goto L_0x008b;
     */
        /* DevToolsApp WARNING: Missing block: B:25:0x0058, code:
            r0 = "ۥۢۤ";
     */
        /* DevToolsApp WARNING: Missing block: B:32:0x006a, code:
            r0 = "ۢۘۗ";
     */
        /* DevToolsApp WARNING: Missing block: B:39:0x007e, code:
            r0 = "ۙۘۨ";
     */
        /* DevToolsApp WARNING: Missing block: B:43:0x008b, code:
            r0 = "ۜۘۗ";
     */
        public android.content.SharedPreferences.Editor putInt(java.lang.String r2, int r3) {
            /*
            r1 = this;
            r0 = "ۡۥ۠";
        L_0x0002:
            r0 = s.ۢ۫ۗ.m350(r0);
        L_0x0006:
            switch(r0) {
                case 1739037: goto L_0x005e;
                case 1739408: goto L_0x003a;
                case 1739674: goto L_0x0066;
                case 1739829: goto L_0x0042;
                case 1740357: goto L_0x0070;
                case 1740713: goto L_0x002b;
                case 1743649: goto L_0x0078;
                case 1743686: goto L_0x0024;
                case 1743703: goto L_0x004c;
                case 1747653: goto L_0x0030;
                case 1748796: goto L_0x0092;
                case 1749345: goto L_0x001c;
                case 1752551: goto L_0x0011;
                case 1755152: goto L_0x0085;
                case 1755496: goto L_0x0054;
                default: goto L_0x0009;
            };
        L_0x0009:
            s.ۢۜۘ.m255();
            s.ۗۜ۟.m469();
            goto L_0x007e;
        L_0x0011:
            s.ۜۘۡ.m280();
            r0 = s.ۥۘۧ.m662();
            if (r0 > 0) goto L_0x006a;
        L_0x001a:
            goto L_0x0098;
        L_0x001c:
            r0 = s.ۗۜ۟.m469();
            if (r0 <= 0) goto L_0x0098;
        L_0x0022:
            goto L_0x008b;
        L_0x0024:
            r0 = s.ۛۨۦ.m559();
            if (r0 == 0) goto L_0x008b;
        L_0x002a:
            goto L_0x007e;
        L_0x002b:
            s.۬ۗ۫.m98();
            r2 = 0;
            return r2;
        L_0x0030:
            r0 = r1.configReader;
            r3 = s.ۦۢۜ.m21(r3);
            s.ۙۜۦ.m516(r0, r2, r3);
            return r1;
        L_0x003a:
            r0 = s.ۡۘۗ.f2;
            if (r0 == 0) goto L_0x003f;
        L_0x003e:
            goto L_0x0058;
        L_0x003f:
            r0 = "۠۟ۤ";
            goto L_0x0002;
        L_0x0042:
            r0 = s.ۖۜ۟.m492();
            if (r0 == 0) goto L_0x0049;
        L_0x0048:
            goto L_0x007e;
        L_0x0049:
            r0 = "ۗ۬ۥ";
            goto L_0x0002;
        L_0x004c:
            r0 = s.ۜۖۚ.f0;
            if (r0 < 0) goto L_0x0051;
        L_0x0050:
            goto L_0x006a;
        L_0x0051:
            r0 = "ۘۛۘ";
            goto L_0x0002;
        L_0x0054:
            r0 = s.ۡۗۗ.f9;
            if (r0 != 0) goto L_0x005b;
        L_0x0058:
            r0 = "ۥۢۤ";
            goto L_0x009e;
        L_0x005b:
            r0 = "ۜۜۗ";
            goto L_0x0002;
        L_0x005e:
            r0 = s.ۖۜ۟.f34;
            if (r0 < 0) goto L_0x0063;
        L_0x0062:
            goto L_0x0098;
        L_0x0063:
            r0 = "ۨۤۤ";
            goto L_0x009e;
        L_0x0066:
            r0 = s.ۗۗۡ.f4;
            if (r0 != 0) goto L_0x006d;
        L_0x006a:
            r0 = "ۢۘۗ";
            goto L_0x0002;
        L_0x006d:
            r0 = "ۗ۠ۦ";
            goto L_0x0002;
        L_0x0070:
            r0 = s.ۢ۟ۚ.f10;
            if (r0 == 0) goto L_0x0075;
        L_0x0074:
            goto L_0x0098;
        L_0x0075:
            r0 = "ۘۖۘ";
            goto L_0x0002;
        L_0x0078:
            r0 = s.ۖۙۜ.m589();
            if (r0 > 0) goto L_0x0081;
        L_0x007e:
            r0 = "ۙۘۨ";
            goto L_0x009e;
        L_0x0081:
            r0 = "ۘ۬ۙ";
            goto L_0x0002;
        L_0x0085:
            r0 = s.ۘۡۜ.m682();
            if (r0 < 0) goto L_0x008f;
        L_0x008b:
            r0 = "ۜۘۗ";
            goto L_0x0002;
        L_0x008f:
            r0 = "ۜۚ۟";
            goto L_0x009e;
        L_0x0092:
            r0 = s.ۜۘۡ.m280();
            if (r0 == 0) goto L_0x009c;
        L_0x0098:
            r0 = "ۜۛۥ";
            goto L_0x0002;
        L_0x009c:
            r0 = "ۨۙۡ";
        L_0x009e:
            r0 = s.ۜۘۡ.m282(r0);
            goto L_0x0006;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.Editor.putInt(java.lang.String, int):android.content.SharedPreferences$Editor");
        }

        /* DevToolsApp WARNING: Missing block: B:10:0x0024, code:
            if (s.ۙۜۦ.f36 <= 0) goto L_0x0054;
     */
        /* DevToolsApp WARNING: Missing block: B:24:0x0054, code:
            r0 = "ۙۡۨ";
     */
        /* DevToolsApp WARNING: Missing block: B:37:0x007a, code:
            r0 = "ۤۧۙ";
     */
        /* DevToolsApp WARNING: Missing block: B:41:0x0086, code:
            r0 = "ۜۛۦ";
     */
        /* DevToolsApp WARNING: Missing block: B:47:0x009a, code:
            r0 = "ۤۤ۟";
     */
        public android.content.SharedPreferences.Editor putLong(java.lang.String r2, long r3) {
            /*
            r1 = this;
            r0 = "ۧۦ۟";
        L_0x0002:
            r0 = s.ۜۘۡ.m282(r0);
        L_0x0006:
            switch(r0) {
                case 1737816: goto L_0x005a;
                case 1739213: goto L_0x0019;
                case 1739218: goto L_0x0062;
                case 1740992: goto L_0x002e;
                case 1743687: goto L_0x0011;
                case 1744022: goto L_0x0048;
                case 1746848: goto L_0x0080;
                case 1751368: goto L_0x008e;
                case 1751647: goto L_0x0027;
                case 1751734: goto L_0x0022;
                case 1752605: goto L_0x0040;
                case 1754196: goto L_0x006c;
                case 1754419: goto L_0x0076;
                case 1755523: goto L_0x0036;
                case 1759560: goto L_0x0050;
                default: goto L_0x0009;
            };
        L_0x0009:
            r0 = s.ۨۧۚ.m718();
            if (r0 > 0) goto L_0x009e;
        L_0x000f:
            goto L_0x009a;
        L_0x0011:
            s.۠ۡ۟.m140();
            r0 = s.ۗۗۡ.f4;
            if (r0 != 0) goto L_0x0094;
        L_0x0018:
            goto L_0x0054;
        L_0x0019:
            s.ۥۘۧ.m662();
            r0 = s.ۛ۫ۧ.f49;
            if (r0 == 0) goto L_0x007a;
        L_0x0020:
            goto L_0x009a;
        L_0x0022:
            r0 = s.ۙۜۦ.f36;
            if (r0 > 0) goto L_0x009a;
        L_0x0026:
            goto L_0x0054;
        L_0x0027:
            s.۠ۡۧ.m431();
            s.ۘۡۜ.m682();
            goto L_0x0054;
        L_0x002e:
            s.ۙۜۦ.m520();
            s.ۗۢۢ.m454();
            r2 = 0;
            return r2;
        L_0x0036:
            r0 = r1.configReader;
            r3 = s.ۖۜ۟.m494(r3);
            s.ۗۢۢ.m451(r0, r2, r3);
            return r1;
        L_0x0040:
            r0 = s.ۗۤ۫.f12;
            if (r0 == 0) goto L_0x0045;
        L_0x0044:
            goto L_0x0086;
        L_0x0045:
            r0 = "ۨۥ۠";
            goto L_0x0002;
        L_0x0048:
            r0 = s.ۥۥۚ.f50;
            if (r0 == 0) goto L_0x004d;
        L_0x004c:
            goto L_0x009a;
        L_0x004d:
            r0 = "ۥۤۜ";
            goto L_0x0002;
        L_0x0050:
            r0 = s.ۗۤ۫.f12;
            if (r0 == 0) goto L_0x0057;
        L_0x0054:
            r0 = "ۙۡۨ";
            goto L_0x0002;
        L_0x0057:
            r0 = "ۜۦ۠";
            goto L_0x00a0;
        L_0x005a:
            r0 = s.ۖۜ۟.f34;
            if (r0 < 0) goto L_0x005f;
        L_0x005e:
            goto L_0x0094;
        L_0x005f:
            r0 = "۬۫ۧ";
            goto L_0x00a0;
        L_0x0062:
            r0 = s.ۗۗۡ.m78();
            if (r0 == 0) goto L_0x0069;
        L_0x0068:
            goto L_0x0086;
        L_0x0069:
            r0 = "ۖۘۚ";
            goto L_0x00a0;
        L_0x006c:
            r0 = s.ۥۥۚ.m614();
            if (r0 > 0) goto L_0x0073;
        L_0x0072:
            goto L_0x009a;
        L_0x0073:
            r0 = "ۗۦۡ";
            goto L_0x0002;
        L_0x0076:
            r0 = s.ۧۧۡ.f11;
            if (r0 != 0) goto L_0x007d;
        L_0x007a:
            r0 = "ۤۧۙ";
            goto L_0x00a0;
        L_0x007d:
            r0 = "ۧۙۦ";
            goto L_0x0002;
        L_0x0080:
            r0 = s.ۗۢۢ.m454();
            if (r0 < 0) goto L_0x008a;
        L_0x0086:
            r0 = "ۜۛۦ";
            goto L_0x0002;
        L_0x008a:
            r0 = "ۧ۠۬";
            goto L_0x0002;
        L_0x008e:
            r0 = s.ۨۧۚ.m718();
            if (r0 > 0) goto L_0x0097;
        L_0x0094:
            r0 = "ۗۦۜ";
            goto L_0x00a0;
        L_0x0097:
            r0 = "۟ۤۥ";
            goto L_0x00a0;
        L_0x009a:
            r0 = "ۤۤ۟";
            goto L_0x0002;
        L_0x009e:
            r0 = "ۤۛ۟";
        L_0x00a0:
            r0 = s.ۢ۫ۗ.m350(r0);
            goto L_0x0006;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.Editor.putLong(java.lang.String, long):android.content.SharedPreferences$Editor");
        }

        /* DevToolsApp WARNING: Missing block: B:9:0x0025, code:
            if (s.۟ۤۗ.m332() > 0) goto L_0x0032;
     */
        /* DevToolsApp WARNING: Missing block: B:36:0x007c, code:
            r0 = "۠ۙۛ";
     */
        public android.content.SharedPreferences.Editor putBoolean(java.lang.String r2, boolean r3) {
            /*
            r1 = this;
            r0 = "ۨۚۗ";
        L_0x0002:
            r0 = s.ۜۘۡ.m282(r0);
        L_0x0006:
            switch(r0) {
                case 1738215: goto L_0x0066;
                case 1738325: goto L_0x0076;
                case 1743844: goto L_0x004e;
                case 1746570: goto L_0x008f;
                case 1751858: goto L_0x0043;
                case 1751859: goto L_0x006e;
                case 1751872: goto L_0x0082;
                case 1752476: goto L_0x0011;
                case 1753662: goto L_0x001e;
                case 1754244: goto L_0x0035;
                case 1754274: goto L_0x005e;
                case 1755053: goto L_0x0039;
                case 1755173: goto L_0x009d;
                case 1758210: goto L_0x0056;
                case 1759242: goto L_0x0028;
                default: goto L_0x0009;
            };
        L_0x0009:
            s.ۗۢۢ.m454();
            s.ۡۥۗ.m568();
            r2 = 0;
            return r2;
        L_0x0011:
            s.ۢ۫ۗ.m342();
            r0 = s.ۚۡۢ.m112();
            if (r0 >= 0) goto L_0x001b;
        L_0x001a:
            goto L_0x0032;
        L_0x001b:
            r0 = "ۦۧ۟";
            goto L_0x0002;
        L_0x001e:
            s.ۡۘۗ.m32();
            r0 = s.۟ۤۗ.m332();
            if (r0 <= 0) goto L_0x0095;
        L_0x0027:
            goto L_0x0032;
        L_0x0028:
            s.ۙۜۦ.m520();
            r0 = s.۬۟ۜ.m366();
            if (r0 == 0) goto L_0x0032;
        L_0x0031:
            goto L_0x007c;
        L_0x0032:
            r0 = "ۧۛۘ";
            goto L_0x0002;
        L_0x0035:
            s.ۗۜ۟.m469();
            goto L_0x007c;
        L_0x0039:
            r0 = r1.configReader;
            r3 = s.ۨۧۜ.m753(r3);
            s.ۗۢۢ.m451(r0, r2, r3);
            return r1;
        L_0x0043:
            r0 = s.ۢ۫ۗ.m342();
            if (r0 != 0) goto L_0x004b;
        L_0x0049:
            goto L_0x00a1;
        L_0x004b:
            r0 = "ۨۖۛ";
            goto L_0x0089;
        L_0x004e:
            r0 = s.ۙۖۥ.f58;
            if (r0 == 0) goto L_0x0053;
        L_0x0052:
            goto L_0x00a1;
        L_0x0053:
            r0 = "ۤ۫ۙ";
            goto L_0x0002;
        L_0x0056:
            r0 = s.ۗ۬۟.f16;
            if (r0 == 0) goto L_0x005b;
        L_0x005a:
            goto L_0x0095;
        L_0x005b:
            r0 = "ۜ۠ۨ";
            goto L_0x0089;
        L_0x005e:
            r0 = s.ۨۘۢ.f19;
            if (r0 == 0) goto L_0x0063;
        L_0x0062:
            goto L_0x00a1;
        L_0x0063:
            r0 = "۫۟ۖ";
            goto L_0x0089;
        L_0x0066:
            r0 = s.ۗ۬۟.f16;
            if (r0 == 0) goto L_0x006b;
        L_0x006a:
            goto L_0x007c;
        L_0x006b:
            r0 = "ۧۜۗ";
            goto L_0x0002;
        L_0x006e:
            r0 = s.ۡۢۡ.f3;
            if (r0 < 0) goto L_0x0073;
        L_0x0072:
            goto L_0x00a1;
        L_0x0073:
            r0 = "ۖۥۖ";
            goto L_0x0089;
        L_0x0076:
            r0 = s.۫۫ۗ.m790();
            if (r0 != 0) goto L_0x007f;
        L_0x007c:
            r0 = "۠ۙۛ";
            goto L_0x0089;
        L_0x007f:
            r0 = "ۤ۫ۚ";
            goto L_0x0002;
        L_0x0082:
            r0 = s.۟ۧۢ.f60;
            if (r0 > 0) goto L_0x0087;
        L_0x0086:
            goto L_0x0095;
        L_0x0087:
            r0 = "ۖۨۧ";
        L_0x0089:
            r0 = s.ۢ۫ۗ.m350(r0);
            goto L_0x0006;
        L_0x008f:
            r0 = s.ۗۜۛ.m698();
            if (r0 > 0) goto L_0x0099;
        L_0x0095:
            r0 = "۬ۡ۟";
            goto L_0x0002;
        L_0x0099:
            r0 = "ۤ۫ۧ";
            goto L_0x0002;
        L_0x009d:
            r0 = s.ۗ۬۟.f16;
            if (r0 == 0) goto L_0x00a4;
        L_0x00a1:
            r0 = "ۥ۠ۗ";
            goto L_0x0089;
        L_0x00a4:
            r0 = "۟ۛۦ";
            goto L_0x0002;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.Editor.putBoolean(java.lang.String, boolean):android.content.SharedPreferences$Editor");
        }

        /* DevToolsApp WARNING: Missing block: B:4:0x000d, code:
            if (s.ۡۢۡ.m58() != false) goto L_0x0090;
     */
        /* DevToolsApp WARNING: Missing block: B:20:0x003e, code:
            r0 = "ۙۜۙ";
     */
        public android.content.SharedPreferences.Editor putStringSet(java.lang.String r2, @androidx.annotation.Nullable java.util.Set<java.lang.String> r3) {
            /*
            r1 = this;
            r0 = "۟۬ۗ";
        L_0x0002:
            r0 = s.ۜۘۡ.m282(r0);
        L_0x0006:
            switch(r0) {
                case 1738866: goto L_0x0044;
                case 1740822: goto L_0x001c;
                case 1743082: goto L_0x0068;
                case 1743643: goto L_0x0025;
                case 1744204: goto L_0x0030;
                case 1747082: goto L_0x008c;
                case 1748033: goto L_0x002a;
                case 1748449: goto L_0x004c;
                case 1752692: goto L_0x007c;
                case 1754201: goto L_0x0011;
                case 1754522: goto L_0x0072;
                case 1755530: goto L_0x005e;
                case 1755735: goto L_0x0056;
                case 1755745: goto L_0x0021;
                case 1759342: goto L_0x003a;
                default: goto L_0x0009;
            };
        L_0x0009:
            r0 = s.ۡۢۡ.m58();
            if (r0 == 0) goto L_0x003e;
        L_0x000f:
            goto L_0x0090;
        L_0x0011:
            r0 = s.ۤۗۛ.m370();
            if (r0 < 0) goto L_0x0019;
        L_0x0017:
            goto L_0x0090;
        L_0x0019:
            r0 = "ۡ۠۠";
            goto L_0x0002;
        L_0x001c:
            r0 = s.ۗۤ۫.f12;
            if (r0 != 0) goto L_0x0090;
        L_0x0020:
            goto L_0x0076;
        L_0x0021:
            s.ۦۢۜ.m16();
            goto L_0x0076;
        L_0x0025:
            s.ۧۧۡ.m183();
            r2 = 0;
            return r2;
        L_0x002a:
            r0 = r1.configReader;
            s.ۙۜۦ.m516(r0, r2, r3);
            return r1;
        L_0x0030:
            r0 = s.ۗۜ۟.m469();
            if (r0 > 0) goto L_0x0037;
        L_0x0036:
            goto L_0x0080;
        L_0x0037:
            r0 = "۠۫۬";
            goto L_0x0002;
        L_0x003a:
            r0 = s.ۢ۟ۚ.f10;
            if (r0 == 0) goto L_0x0041;
        L_0x003e:
            r0 = "ۙۜۙ";
            goto L_0x0002;
        L_0x0041:
            r0 = "ۜ۬ۜ";
            goto L_0x0086;
        L_0x0044:
            r0 = s.ۢۜۘ.f15;
            if (r0 == 0) goto L_0x0049;
        L_0x0048:
            goto L_0x0076;
        L_0x0049:
            r0 = "۬ۤۦ";
            goto L_0x0002;
        L_0x004c:
            r0 = s.ۖۙۜ.m589();
            if (r0 > 0) goto L_0x0053;
        L_0x0052:
            goto L_0x0090;
        L_0x0053:
            r0 = "ۗۛۖ";
            goto L_0x0086;
        L_0x0056:
            r0 = s.ۗۤ۫.f12;
            if (r0 == 0) goto L_0x005b;
        L_0x005a:
            goto L_0x0090;
        L_0x005b:
            r0 = "ۡۚۚ";
            goto L_0x0086;
        L_0x005e:
            r0 = s.۟ۥۙ.m650();
            if (r0 > 0) goto L_0x0065;
        L_0x0064:
            goto L_0x0080;
        L_0x0065:
            r0 = "ۨ۬ۛ";
            goto L_0x0002;
        L_0x0068:
            r0 = s.ۛۨۦ.m559();
            if (r0 == 0) goto L_0x006f;
        L_0x006e:
            goto L_0x0080;
        L_0x006f:
            r0 = "ۨۥۧ";
            goto L_0x0086;
        L_0x0072:
            r0 = s.۟ۤۗ.f20;
            if (r0 > 0) goto L_0x0079;
        L_0x0076:
            r0 = "ۜۚۙ";
            goto L_0x0086;
        L_0x0079:
            r0 = "ۛۧۖ";
            goto L_0x0086;
        L_0x007c:
            r0 = s.ۗۢۢ.f29;
            if (r0 < 0) goto L_0x0084;
        L_0x0080:
            r0 = "ۧۙ۫";
            goto L_0x0002;
        L_0x0084:
            r0 = "ۧۤۗ";
        L_0x0086:
            r0 = s.ۢ۫ۗ.m350(r0);
            goto L_0x0006;
        L_0x008c:
            r0 = s.ۚۡۢ.f7;
            if (r0 != 0) goto L_0x0094;
        L_0x0090:
            r0 = "ۨ۬ۥ";
            goto L_0x0002;
        L_0x0094:
            r0 = "ۥۧۖ";
            goto L_0x0002;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.Editor.putStringSet(java.lang.String, java.util.Set):android.content.SharedPreferences$Editor");
        }

        /* DevToolsApp WARNING: Missing block: B:5:0x0011, code:
            if (s.۬۟ۜ.f23 == false) goto L_0x0099;
     */
        /* DevToolsApp WARNING: Missing block: B:9:0x0022, code:
            if (s.ۨۗۥ.m536() == 0) goto L_0x0082;
     */
        /* DevToolsApp WARNING: Missing block: B:35:0x0076, code:
            r1 = "ۖۢۢ";
     */
        /* DevToolsApp WARNING: Missing block: B:39:0x0082, code:
            r1 = "ۨۘ۟";
     */
        /* DevToolsApp WARNING: Missing block: B:43:0x008d, code:
            r1 = "ۗۛۗ";
     */
        /* DevToolsApp WARNING: Missing block: B:47:0x0099, code:
            r1 = "۟ۥۖ";
     */
        /* DevToolsApp WARNING: Missing block: B:49:0x009f, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
        public android.content.SharedPreferences.Editor putAll(java.util.Map<java.lang.String, ?> r5) {
            /*
            r4 = this;
            r0 = 0;
            r1 = "ۛۙۧ";
        L_0x0003:
            r1 = s.ۢ۫ۗ.m350(r1);
        L_0x0007:
            switch(r1) {
                case 1737895: goto L_0x0072;
                case 1738134: goto L_0x001e;
                case 1738867: goto L_0x0015;
                case 1740681: goto L_0x0089;
                case 1740954: goto L_0x002b;
                case 1742665: goto L_0x0095;
                case 1743565: goto L_0x0068;
                case 1747733: goto L_0x0056;
                case 1747873: goto L_0x0060;
                case 1748461: goto L_0x000f;
                case 1755119: goto L_0x0026;
                case 1755369: goto L_0x007c;
                case 1755716: goto L_0x0042;
                case 1758046: goto L_0x004a;
                case 1759472: goto L_0x0031;
                default: goto L_0x000a;
            };
        L_0x000a:
            s.۬ۨۨ.m730();
            goto L_0x0082;
        L_0x000f:
            r1 = s.۬۟ۜ.f23;
            if (r1 != 0) goto L_0x008d;
        L_0x0013:
            goto L_0x0099;
        L_0x0015:
            s.ۚۤۙ.m296();
            r1 = s.ۡۥۗ.f47;
            if (r1 != 0) goto L_0x0076;
        L_0x001c:
            goto L_0x0082;
        L_0x001e:
            r1 = s.ۨۗۥ.m536();
            if (r1 != 0) goto L_0x0099;
        L_0x0024:
            goto L_0x0082;
        L_0x0026:
            s.ۢ۫ۗ.m342();
            r5 = 0;
            return r5;
        L_0x002b:
            r0 = r0.configData;
            r0.putAll(r5);
            return r4;
        L_0x0031:
            r1 = r4.configReader;
            r2 = s.ۤۤۖ.f35;
            if (r2 == 0) goto L_0x0038;
        L_0x0037:
            goto L_0x0050;
        L_0x0038:
            r0 = "ۙ۠ۡ";
            r0 = s.ۢ۫ۗ.m350(r0);
            r3 = r1;
            r1 = r0;
            r0 = r3;
            goto L_0x0007;
        L_0x0042:
            r1 = s.ۗۤ۫.f12;
            if (r1 == 0) goto L_0x0047;
        L_0x0046:
            goto L_0x0082;
        L_0x0047:
            r1 = "۬ۨ۬";
            goto L_0x0003;
        L_0x004a:
            r1 = s.ۨۘۢ.m318();
            if (r1 == 0) goto L_0x0053;
        L_0x0050:
            r1 = "ۡۚۦ";
            goto L_0x0003;
        L_0x0053:
            r1 = "ۨ۫ۧ";
            goto L_0x009f;
        L_0x0056:
            r1 = s.ۛۨۦ.m559();
            if (r1 == 0) goto L_0x005d;
        L_0x005c:
            goto L_0x0082;
        L_0x005d:
            r1 = "۫ۙ۬";
            goto L_0x009f;
        L_0x0060:
            r1 = s.۠ۜۗ.f13;
            if (r1 == 0) goto L_0x0065;
        L_0x0064:
            goto L_0x0099;
        L_0x0065:
            r1 = "۠ۢۗ";
            goto L_0x009f;
        L_0x0068:
            r1 = s.ۨۧۚ.m718();
            if (r1 > 0) goto L_0x006f;
        L_0x006e:
            goto L_0x0099;
        L_0x006f:
            r1 = "۠ۦۧ";
            goto L_0x009f;
        L_0x0072:
            r1 = s.ۡۘۗ.f2;
            if (r1 == 0) goto L_0x0079;
        L_0x0076:
            r1 = "ۖۢۢ";
            goto L_0x009f;
        L_0x0079:
            r1 = "ۜۗۨ";
            goto L_0x0003;
        L_0x007c:
            r1 = s.ۤۤۖ.m506();
            if (r1 == 0) goto L_0x0086;
        L_0x0082:
            r1 = "ۨۘ۟";
            goto L_0x0003;
        L_0x0086:
            r1 = "ۖۚ۫";
            goto L_0x009f;
        L_0x0089:
            r1 = s.ۦۡۤ.f25;
            if (r1 == 0) goto L_0x0091;
        L_0x008d:
            r1 = "ۗۛۗ";
            goto L_0x0003;
        L_0x0091:
            r1 = "ۨ۠ۡ";
            goto L_0x0003;
        L_0x0095:
            r1 = s.ۗ۬ۦ.f27;
            if (r1 == 0) goto L_0x009d;
        L_0x0099:
            r1 = "۟ۥۖ";
            goto L_0x0003;
        L_0x009d:
            r1 = "ۙۗۧ";
        L_0x009f:
            r1 = s.ۜۘۡ.m282(r1);
            goto L_0x0007;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.Editor.putAll(java.util.Map):android.content.SharedPreferences$Editor");
        }
    }

    public static ConfigReader getInstanceByReadOnly(String str) {
        return new ConfigReader(str);
    }

    /* DevToolsApp WARNING: Missing block: B:9:0x001a, code:
            if (s.ۘۡۜ.f54 == false) goto L_0x009d;
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x0086, code:
            r2 = "ۤۡۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x0092, code:
            r2 = "ۘ۟ۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:55:0x00aa, code:
            r2 = "ۜۤۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:57:0x00af, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    private java.lang.Object readConfig(java.lang.String r5, java.lang.Object r6) {
        /*
        r4 = this;
        r0 = 0;
        r1 = 0;
        r2 = "۫ۘۖ";
    L_0x0004:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x0008:
        switch(r2) {
            case 1737890: goto L_0x004a;
            case 1738103: goto L_0x0052;
            case 1739968: goto L_0x0012;
            case 1742291: goto L_0x006e;
            case 1742619: goto L_0x001e;
            case 1743955: goto L_0x0018;
            case 1744058: goto L_0x0099;
            case 1744173: goto L_0x0039;
            case 1747809: goto L_0x0064;
            case 1747842: goto L_0x002e;
            case 1748666: goto L_0x008e;
            case 1751214: goto L_0x002f;
            case 1751546: goto L_0x000c;
            case 1754401: goto L_0x0078;
            case 1754588: goto L_0x0026;
            case 1754743: goto L_0x005c;
            case 1757993: goto L_0x00a4;
            case 1758107: goto L_0x0082;
            default: goto L_0x000b;
        };
    L_0x000b:
        return r6;
    L_0x000c:
        r2 = s.۠ۜۗ.f13;
        if (r2 != 0) goto L_0x0092;
    L_0x0010:
        goto L_0x009d;
    L_0x0012:
        r2 = s.ۗۜۛ.f55;
        if (r2 != 0) goto L_0x00aa;
    L_0x0016:
        goto L_0x009d;
    L_0x0018:
        r2 = s.ۘۡۜ.f54;
        if (r2 != 0) goto L_0x0068;
    L_0x001c:
        goto L_0x009d;
    L_0x001e:
        s.ۗ۬ۦ.m407();
        s.ۢ۫ۜ.m625();
        goto L_0x009d;
    L_0x0026:
        s.ۨۘۢ.m318();
        s.۫ۢ۠.m237();
        r5 = 0;
        return r5;
    L_0x002e:
        return r1;
    L_0x002f:
        r1 = s.ۨۘۢ.m309(r0, r5);
        if (r1 != 0) goto L_0x0036;
    L_0x0035:
        r1 = r6;
    L_0x0036:
        r2 = "۠ۥۧ";
        goto L_0x0004;
    L_0x0039:
        r2 = r4.configData;
        if (r2 != 0) goto L_0x0040;
    L_0x003d:
        r2 = "ۡۥۙ";
        goto L_0x0004;
    L_0x0040:
        r0 = "ۤۖ۠";
        r0 = s.ۜۘۡ.m282(r0);
        r3 = r2;
        r2 = r0;
        r0 = r3;
        goto L_0x0008;
    L_0x004a:
        r2 = s.ۛۨۦ.f46;
        if (r2 == 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0086;
    L_0x004f:
        r2 = "ۜ۫ۜ";
        goto L_0x0004;
    L_0x0052:
        r2 = s.۫ۢ۠.m237();
        if (r2 < 0) goto L_0x0059;
    L_0x0058:
        goto L_0x0092;
    L_0x0059:
        r2 = "ۖۚۦ";
        goto L_0x0004;
    L_0x005c:
        r2 = s.۫ۢ۠.f14;
        if (r2 > 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0068;
    L_0x0061:
        r2 = "ۖۡۢ";
        goto L_0x00af;
    L_0x0064:
        r2 = s.ۗ۬ۦ.f27;
        if (r2 == 0) goto L_0x006b;
    L_0x0068:
        r2 = "ۛۘۘ";
        goto L_0x0004;
    L_0x006b:
        r2 = "ۧ۫ۛ";
        goto L_0x0004;
    L_0x006e:
        r2 = s.ۢۜۘ.m255();
        if (r2 > 0) goto L_0x0075;
    L_0x0074:
        goto L_0x009d;
    L_0x0075:
        r2 = "۠ۤۥ";
        goto L_0x0004;
    L_0x0078:
        r2 = s.ۚ۟ۢ.m85();
        if (r2 == 0) goto L_0x007f;
    L_0x007e:
        goto L_0x00aa;
    L_0x007f:
        r2 = "ۚ۬ۥ";
        goto L_0x00af;
    L_0x0082:
        r2 = s.۬ۨۨ.f57;
        if (r2 == 0) goto L_0x008a;
    L_0x0086:
        r2 = "ۤۡۗ";
        goto L_0x0004;
    L_0x008a:
        r2 = "ۧ۠ۚ";
        goto L_0x0004;
    L_0x008e:
        r2 = s.ۢ۫ۜ.f51;
        if (r2 < 0) goto L_0x0095;
    L_0x0092:
        r2 = "ۘ۟ۧ";
        goto L_0x00af;
    L_0x0095:
        r2 = "۫ۛ۫";
        goto L_0x0004;
    L_0x0099:
        r2 = s.ۢ۟ۚ.f10;
        if (r2 == 0) goto L_0x00a1;
    L_0x009d:
        r2 = "ۧۦۛ";
        goto L_0x0004;
    L_0x00a1:
        r2 = "ۡۡۚ";
        goto L_0x00af;
    L_0x00a4:
        r2 = s.ۢۜۘ.m255();
        if (r2 > 0) goto L_0x00ad;
    L_0x00aa:
        r2 = "ۜۤۛ";
        goto L_0x00af;
    L_0x00ad:
        r2 = "ۜۧۥ";
    L_0x00af:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.readConfig(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public boolean contains(String str) {
        return ۢۜۘ.m244(this.configData, str);
    }

    public Editor edit() {
        return new Editor(this);
    }

    public Map<String, ?> getAll() {
        return this.configData;
    }

    /* DevToolsApp WARNING: Missing block: B:38:0x0090, code:
            r1 = "ۜۗۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00b4, code:
            r1 = "ۚۛۗ";
     */
    public boolean getBoolean(java.lang.String r3, boolean r4) {
        /*
        r2 = this;
        r0 = 0;
        r1 = "ۦ۬ۘ";
    L_0x0003:
        r1 = s.ۜۘۡ.m282(r1);
    L_0x0007:
        switch(r1) {
            case 1738850: goto L_0x0098;
            case 1740217: goto L_0x0018;
            case 1740232: goto L_0x008c;
            case 1741750: goto L_0x0039;
            case 1741976: goto L_0x00ae;
            case 1743548: goto L_0x0023;
            case 1746882: goto L_0x0031;
            case 1748698: goto L_0x0069;
            case 1749784: goto L_0x0056;
            case 1751311: goto L_0x0073;
            case 1751485: goto L_0x0042;
            case 1753663: goto L_0x00a3;
            case 1753810: goto L_0x00bb;
            case 1755057: goto L_0x007d;
            case 1755091: goto L_0x005f;
            case 1755555: goto L_0x000b;
            case 1759394: goto L_0x0041;
            default: goto L_0x000a;
        };
    L_0x000a:
        return r4;
    L_0x000b:
        s.ۥۘۧ.m662();
        r1 = s.ۙۖۥ.f58;
        if (r1 != 0) goto L_0x0014;
    L_0x0012:
        goto L_0x00b4;
    L_0x0014:
        r1 = "ۘۧۨ";
        goto L_0x0086;
    L_0x0018:
        s.ۤۗۛ.m370();
        r1 = s.۟ۧۢ.m774();
        if (r1 != 0) goto L_0x0090;
    L_0x0021:
        goto L_0x00b4;
    L_0x0023:
        s.ۛ۫ۧ.m593();
        r1 = s.ۨۧۚ.m718();
        if (r1 <= 0) goto L_0x002e;
    L_0x002c:
        goto L_0x00b4;
    L_0x002e:
        r1 = "۟ۥۨ";
        goto L_0x0003;
    L_0x0031:
        s.ۗۜۛ.m698();
        s.ۥۥۚ.m614();
        goto L_0x00b4;
    L_0x0039:
        s.ۖۜ۟.m492();
        s.ۙۜۦ.m520();
        r3 = 0;
        return r3;
    L_0x0041:
        return r0;
    L_0x0042:
        r1 = s.ۨۧۜ.m753(r4);	 Catch:{ Exception -> 0x0053 }
        r1 = r2.readConfig(r3, r1);	 Catch:{ Exception -> 0x0053 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ Exception -> 0x0053 }
        r0 = s.ۛ۫ۧ.m596(r1);	 Catch:{ Exception -> 0x0053 }
        r1 = "۬ۦۜ";
        goto L_0x0003;
    L_0x0053:
        r1 = "ۨۢ۬";
        goto L_0x0086;
    L_0x0056:
        r1 = s.ۨۧۚ.f56;
        if (r1 != 0) goto L_0x005c;
    L_0x005a:
        goto L_0x00bf;
    L_0x005c:
        r1 = "ۤ۟ۘ";
        goto L_0x0086;
    L_0x005f:
        r1 = s.ۡۢۡ.m58();
        if (r1 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x00b4;
    L_0x0066:
        r1 = "ۢۦۜ";
        goto L_0x0003;
    L_0x0069:
        r1 = s.ۚ۟ۢ.m85();
        if (r1 == 0) goto L_0x0070;
    L_0x006f:
        goto L_0x0090;
    L_0x0070:
        r1 = "ۨۗۢ";
        goto L_0x0003;
    L_0x0073:
        r1 = s.ۦۢۜ.m16();
        if (r1 == 0) goto L_0x007a;
    L_0x0079:
        goto L_0x00bf;
    L_0x007a:
        r1 = "ۡۢۛ";
        goto L_0x0086;
    L_0x007d:
        r1 = s.ۡۢۡ.m58();
        if (r1 == 0) goto L_0x0084;
    L_0x0083:
        goto L_0x00bf;
    L_0x0084:
        r1 = "ۤۙۤ";
    L_0x0086:
        r1 = s.ۢ۫ۗ.m350(r1);
        goto L_0x0007;
    L_0x008c:
        r1 = s.ۙۜۦ.f36;
        if (r1 > 0) goto L_0x0094;
    L_0x0090:
        r1 = "ۜۗۗ";
        goto L_0x0003;
    L_0x0094:
        r1 = "ۨۖ۟";
        goto L_0x0003;
    L_0x0098:
        r1 = s.۬ۨۨ.m730();
        if (r1 == 0) goto L_0x009f;
    L_0x009e:
        goto L_0x00bf;
    L_0x009f:
        r1 = "ۘۨۘ";
        goto L_0x0003;
    L_0x00a3:
        r1 = s.ۡۘۗ.m32();
        if (r1 == 0) goto L_0x00aa;
    L_0x00a9:
        goto L_0x00bf;
    L_0x00aa:
        r1 = "ۗۚۥ";
        goto L_0x0003;
    L_0x00ae:
        r1 = s.۟ۧۢ.m774();
        if (r1 == 0) goto L_0x00b7;
    L_0x00b4:
        r1 = "ۚۛۗ";
        goto L_0x0086;
    L_0x00b7:
        r1 = "ۦۧ۠";
        goto L_0x0003;
    L_0x00bb:
        r1 = s.ۨۗۥ.f42;
        if (r1 > 0) goto L_0x00c2;
    L_0x00bf:
        r1 = "ۨۦۡ";
        goto L_0x0086;
    L_0x00c2:
        r1 = "ۚۢ۠";
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.getBoolean(java.lang.String, boolean):boolean");
    }

    /* DevToolsApp WARNING: Missing block: B:9:0x0027, code:
            if (s.۫ۢ۠.m237() < 0) goto L_0x0087;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x0030, code:
            if (s.ۗۗۡ.f4 != false) goto L_0x0087;
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x007d, code:
            r1 = "ۧۥ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x009e, code:
            r1 = "۫ۜۤ";
     */
    public float getFloat(java.lang.String r3, float r4) {
        /*
        r2 = this;
        r0 = 0;
        r1 = "ۢۙۜ";
    L_0x0003:
        r1 = s.ۜۘۡ.m282(r1);
    L_0x0007:
        switch(r1) {
            case 1739404: goto L_0x0091;
            case 1739767: goto L_0x003d;
            case 1740681: goto L_0x006d;
            case 1741140: goto L_0x005b;
            case 1743888: goto L_0x003e;
            case 1746498: goto L_0x009a;
            case 1746526: goto L_0x0012;
            case 1746699: goto L_0x003c;
            case 1747705: goto L_0x0077;
            case 1747835: goto L_0x0053;
            case 1749323: goto L_0x0083;
            case 1749381: goto L_0x00a4;
            case 1749818: goto L_0x0063;
            case 1751865: goto L_0x0020;
            case 1754561: goto L_0x002b;
            case 1755112: goto L_0x0037;
            case 1758131: goto L_0x0033;
            default: goto L_0x000a;
        };
    L_0x000a:
        r1 = s.ۚۡۢ.m112();
        if (r1 < 0) goto L_0x008e;
    L_0x0010:
        goto L_0x009e;
    L_0x0012:
        s.ۢۜۘ.m255();
        r1 = s.ۗۢۢ.m454();
        if (r1 < 0) goto L_0x001d;
    L_0x001b:
        goto L_0x0087;
    L_0x001d:
        r1 = "ۤ۫۠";
        goto L_0x0003;
    L_0x0020:
        s.۟ۥۙ.m650();
        r1 = s.۫ۢ۠.m237();
        if (r1 >= 0) goto L_0x007d;
    L_0x0029:
        goto L_0x0087;
    L_0x002b:
        s.ۗ۠ۚ.m442();
        r1 = s.ۗۗۡ.f4;
        if (r1 == 0) goto L_0x009e;
    L_0x0032:
        goto L_0x0087;
    L_0x0033:
        s.ۗۜۛ.m698();
        goto L_0x0087;
    L_0x0037:
        s.ۗۗۡ.m78();
        r3 = 0;
        return r3;
    L_0x003c:
        return r0;
    L_0x003d:
        return r4;
    L_0x003e:
        r1 = java.lang.Float.valueOf(r4);	 Catch:{ Exception -> 0x004f }
        r1 = r2.readConfig(r3, r1);	 Catch:{ Exception -> 0x004f }
        r1 = (java.lang.Float) r1;	 Catch:{ Exception -> 0x004f }
        r0 = r1.floatValue();	 Catch:{ Exception -> 0x004f }
        r1 = "۟۟۫";
        goto L_0x0003;
    L_0x004f:
        r1 = "ۘۙۘ";
        goto L_0x00ae;
    L_0x0053:
        r1 = s.۫۫ۗ.f65;
        if (r1 == 0) goto L_0x0058;
    L_0x0057:
        goto L_0x00a8;
    L_0x0058:
        r1 = "ۜۢۖ";
        goto L_0x0003;
    L_0x005b:
        r1 = s.ۜۘۡ.f17;
        if (r1 > 0) goto L_0x0060;
    L_0x005f:
        goto L_0x00a8;
    L_0x0060:
        r1 = "۠ۥ۠";
        goto L_0x0003;
    L_0x0063:
        r1 = s.ۥۘۧ.m662();
        if (r1 > 0) goto L_0x006a;
    L_0x0069:
        goto L_0x0087;
    L_0x006a:
        r1 = "ۙۦۡ";
        goto L_0x00ae;
    L_0x006d:
        r1 = s.۬۟ۜ.m366();
        if (r1 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x0087;
    L_0x0074:
        r1 = "ۢۧ۟";
        goto L_0x00ae;
    L_0x0077:
        r1 = s.۬ۗ۫.m98();
        if (r1 == 0) goto L_0x0080;
    L_0x007d:
        r1 = "ۧۥ۟";
        goto L_0x00ae;
    L_0x0080:
        r1 = "ۙۗۧ";
        goto L_0x00ae;
    L_0x0083:
        r1 = s.ۡۘۗ.f2;
        if (r1 == 0) goto L_0x008a;
    L_0x0087:
        r1 = "ۨۘۘ";
        goto L_0x00ae;
    L_0x008a:
        r1 = "۠ۡۚ";
        goto L_0x0003;
    L_0x008e:
        r1 = "ۢۗ۠";
        goto L_0x00ae;
    L_0x0091:
        r1 = s.۬ۨۨ.f57;
        if (r1 == 0) goto L_0x0096;
    L_0x0095:
        goto L_0x009e;
    L_0x0096:
        r1 = "ۡۗۡ";
        goto L_0x0003;
    L_0x009a:
        r1 = s.۬۟ۜ.f23;
        if (r1 != 0) goto L_0x00a1;
    L_0x009e:
        r1 = "۫ۜۤ";
        goto L_0x00ae;
    L_0x00a1:
        r1 = "ۗ۬ۡ";
        goto L_0x00ae;
    L_0x00a4:
        r1 = s.ۜۘۡ.f17;
        if (r1 > 0) goto L_0x00ac;
    L_0x00a8:
        r1 = "۟ۚۙ";
        goto L_0x0003;
    L_0x00ac:
        r1 = "۟ۙۜ";
    L_0x00ae:
        r1 = s.ۢ۫ۗ.m350(r1);
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.getFloat(java.lang.String, float):float");
    }

    /* DevToolsApp WARNING: Missing block: B:4:0x0011, code:
            if (s.۬ۗ۫.m98() != 0) goto L_0x00a0;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0022, code:
            if (s.ۘۡۜ.m682() < 0) goto L_0x00a0;
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x0074, code:
            r1 = "ۘ۬ۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x0096, code:
            r1 = "ۦۤ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x00a0, code:
            r1 = "ۥۗۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:51:0x00ac, code:
            r1 = "ۙۖۗ";
     */
    public int getInt(java.lang.String r3, int r4) {
        /*
        r2 = this;
        r0 = 0;
        r1 = "ۨۜۘ";
    L_0x0003:
        r1 = s.ۢ۫ۗ.m350(r1);
    L_0x0007:
        switch(r1) {
            case 1738435: goto L_0x0026;
            case 1740357: goto L_0x001b;
            case 1740634: goto L_0x0015;
            case 1741600: goto L_0x004c;
            case 1742126: goto L_0x0036;
            case 1742906: goto L_0x009c;
            case 1744026: goto L_0x005e;
            case 1746602: goto L_0x0090;
            case 1747457: goto L_0x0038;
            case 1747467: goto L_0x0056;
            case 1751643: goto L_0x0070;
            case 1752196: goto L_0x002e;
            case 1753136: goto L_0x0068;
            case 1754132: goto L_0x007a;
            case 1754196: goto L_0x0086;
            case 1755236: goto L_0x00a8;
            case 1758213: goto L_0x0037;
            default: goto L_0x000a;
        };
    L_0x000a:
        s.ۗۜ۟.m469();
        r1 = s.۬ۗ۫.m98();
        if (r1 == 0) goto L_0x00ac;
    L_0x0013:
        goto L_0x00a0;
    L_0x0015:
        r1 = s.ۜۖۚ.f0;
        if (r1 >= 0) goto L_0x0074;
    L_0x0019:
        goto L_0x00a0;
    L_0x001b:
        s.ۨۗۥ.m536();
        r1 = s.ۘۡۜ.m682();
        if (r1 >= 0) goto L_0x0080;
    L_0x0024:
        goto L_0x00a0;
    L_0x0026:
        s.ۖۙۜ.m589();
        s.ۚۤۙ.m296();
        goto L_0x00a0;
    L_0x002e:
        s.۠ۡۧ.m431();
        s.ۗ۠ۚ.m442();
        r3 = 0;
        return r3;
    L_0x0036:
        return r0;
    L_0x0037:
        return r4;
    L_0x0038:
        r1 = s.ۦۢۜ.m21(r4);	 Catch:{ Exception -> 0x0049 }
        r1 = r2.readConfig(r3, r1);	 Catch:{ Exception -> 0x0049 }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x0049 }
        r0 = s.ۗۢۢ.m452(r1);	 Catch:{ Exception -> 0x0049 }
        r1 = "ۚۧۛ";
        goto L_0x0003;
    L_0x0049:
        r1 = "۫۟ۙ";
        goto L_0x0003;
    L_0x004c:
        r1 = s.۟ۧۢ.m774();
        if (r1 == 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0096;
    L_0x0053:
        r1 = "۠ۙۚ";
        goto L_0x0003;
    L_0x0056:
        r1 = s.ۨۘۢ.f19;
        if (r1 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x0080;
    L_0x005b:
        r1 = "ۚۖۜ";
        goto L_0x00b2;
    L_0x005e:
        r1 = s.ۢ۟ۚ.m168();
        if (r1 > 0) goto L_0x0065;
    L_0x0064:
        goto L_0x00a0;
    L_0x0065:
        r1 = "۠ۙۤ";
        goto L_0x0003;
    L_0x0068:
        r1 = s.ۢ۫ۜ.f51;
        if (r1 < 0) goto L_0x006d;
    L_0x006c:
        goto L_0x0080;
    L_0x006d:
        r1 = "ۜۦۤ";
        goto L_0x00b2;
    L_0x0070:
        r1 = s.ۙۜۦ.f36;
        if (r1 > 0) goto L_0x0077;
    L_0x0074:
        r1 = "ۘ۬ۙ";
        goto L_0x00b2;
    L_0x0077:
        r1 = "ۦۖ۠";
        goto L_0x00b2;
    L_0x007a:
        r1 = s.ۢ۫ۗ.m342();
        if (r1 != 0) goto L_0x0083;
    L_0x0080:
        r1 = "ۖ۬ۙ";
        goto L_0x0003;
    L_0x0083:
        r1 = "ۤۤۛ";
        goto L_0x00b2;
    L_0x0086:
        r1 = s.ۚۡۢ.m112();
        if (r1 < 0) goto L_0x008d;
    L_0x008c:
        goto L_0x00ac;
    L_0x008d:
        r1 = "ۧۗۤ";
        goto L_0x00b2;
    L_0x0090:
        r1 = s.ۡۘۗ.m32();
        if (r1 == 0) goto L_0x0099;
    L_0x0096:
        r1 = "ۦۤ۠";
        goto L_0x00b2;
    L_0x0099:
        r1 = "ۧۙۦ";
        goto L_0x00b2;
    L_0x009c:
        r1 = s.۠ۡ۟.f8;
        if (r1 > 0) goto L_0x00a4;
    L_0x00a0:
        r1 = "ۥۗۖ";
        goto L_0x0003;
    L_0x00a4:
        r1 = "۟ۜۧ";
        goto L_0x0003;
    L_0x00a8:
        r1 = s.ۚ۟ۢ.f5;
        if (r1 != 0) goto L_0x00b0;
    L_0x00ac:
        r1 = "ۙۖۗ";
        goto L_0x0003;
    L_0x00b0:
        r1 = "ۛۡ۠";
    L_0x00b2:
        r1 = s.ۜۘۡ.m282(r1);
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.getInt(java.lang.String, int):int");
    }

    /* DevToolsApp WARNING: Missing block: B:10:0x0026, code:
            if (s.۟ۧۢ.f60 > 0) goto L_0x00ac;
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x0065, code:
            r2 = "۬ۜۥ";
     */
    public long getLong(java.lang.String r4, long r5) {
        /*
        r3 = this;
        r0 = 0;
        r2 = "۬ۗۥ";
    L_0x0004:
        r2 = s.ۢ۫ۗ.m350(r2);
    L_0x0008:
        switch(r2) {
            case 1737879: goto L_0x0094;
            case 1737950: goto L_0x003a;
            case 1740344: goto L_0x004e;
            case 1740695: goto L_0x0013;
            case 1741722: goto L_0x0059;
            case 1741913: goto L_0x0039;
            case 1742166: goto L_0x006b;
            case 1742591: goto L_0x0061;
            case 1747655: goto L_0x007d;
            case 1748023: goto L_0x001c;
            case 1748680: goto L_0x0075;
            case 1749415: goto L_0x002a;
            case 1749596: goto L_0x002f;
            case 1753560: goto L_0x0087;
            case 1754570: goto L_0x0038;
            case 1755189: goto L_0x009f;
            case 1759093: goto L_0x0024;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = s.ۨۧۚ.m718();
        if (r2 > 0) goto L_0x00b0;
    L_0x0011:
        goto L_0x00ac;
    L_0x0013:
        s.ۘۡۜ.m682();
        r2 = s.ۘۡۜ.f54;
        if (r2 != 0) goto L_0x00a5;
    L_0x001a:
        goto L_0x008d;
    L_0x001c:
        r2 = s.۠ۡۧ.m431();
        if (r2 == 0) goto L_0x0065;
    L_0x0022:
        goto L_0x008d;
    L_0x0024:
        r2 = s.۟ۧۢ.f60;
        if (r2 <= 0) goto L_0x008d;
    L_0x0028:
        goto L_0x00ac;
    L_0x002a:
        s.ۡۘۗ.m32();
        goto L_0x00ac;
    L_0x002f:
        s.ۙۜۦ.m520();
        s.ۙۜۦ.m520();
        r4 = 0;
        return r4;
    L_0x0038:
        return r0;
    L_0x0039:
        return r5;
    L_0x003a:
        r2 = s.ۖۜ۟.m494(r5);	 Catch:{ Exception -> 0x004b }
        r2 = r3.readConfig(r4, r2);	 Catch:{ Exception -> 0x004b }
        r2 = (java.lang.Long) r2;	 Catch:{ Exception -> 0x004b }
        r0 = s.ۡۗۗ.m147(r2);	 Catch:{ Exception -> 0x004b }
        r2 = "ۧۥۨ";
        goto L_0x0004;
    L_0x004b:
        r2 = "ۚ۠۟";
        goto L_0x0004;
    L_0x004e:
        r2 = s.ۧۧۡ.f11;
        if (r2 != 0) goto L_0x0056;
    L_0x0052:
        r2 = "ۙۘۖ";
        goto L_0x00b2;
    L_0x0056:
        r2 = "ۖۜۤ";
        goto L_0x0004;
    L_0x0059:
        r2 = s.ۦۢۜ.f1;
        if (r2 > 0) goto L_0x005e;
    L_0x005d:
        goto L_0x008d;
    L_0x005e:
        r2 = "ۘ۫۫";
        goto L_0x00b2;
    L_0x0061:
        r2 = s.ۜۘۡ.f17;
        if (r2 > 0) goto L_0x0068;
    L_0x0065:
        r2 = "۬ۜۥ";
        goto L_0x00b2;
    L_0x0068:
        r2 = "ۚۚۚ";
        goto L_0x0004;
    L_0x006b:
        r2 = s.ۢۜۘ.m255();
        if (r2 > 0) goto L_0x0072;
    L_0x0071:
        goto L_0x00ac;
    L_0x0072:
        r2 = "ۛۗۛ";
        goto L_0x00b2;
    L_0x0075:
        r2 = s.ۙۜۦ.f36;
        if (r2 > 0) goto L_0x007a;
    L_0x0079:
        goto L_0x008d;
    L_0x007a:
        r2 = "ۚۨۤ";
        goto L_0x0004;
    L_0x007d:
        r2 = s.ۚۡۢ.m112();
        if (r2 < 0) goto L_0x0084;
    L_0x0083:
        goto L_0x00a5;
    L_0x0084:
        r2 = "ۡۡۨ";
        goto L_0x00b2;
    L_0x0087:
        r2 = s.ۨۧۜ.m755();
        if (r2 < 0) goto L_0x0091;
    L_0x008d:
        r2 = "ۢۚ۟";
        goto L_0x0004;
    L_0x0091:
        r2 = "۠۟ۦ";
        goto L_0x00b2;
    L_0x0094:
        r2 = s.ۨۗۥ.m536();
        if (r2 == 0) goto L_0x009b;
    L_0x009a:
        goto L_0x00a5;
    L_0x009b:
        r2 = "ۦۤۖ";
        goto L_0x0004;
    L_0x009f:
        r2 = s.۟ۤۗ.m332();
        if (r2 > 0) goto L_0x00a8;
    L_0x00a5:
        r2 = "۠۫ۢ";
        goto L_0x00b2;
    L_0x00a8:
        r2 = "ۖۚۛ";
        goto L_0x0004;
    L_0x00ac:
        r2 = "ۢ۠ۚ";
        goto L_0x0004;
    L_0x00b0:
        r2 = "ۨۚۧ";
    L_0x00b2:
        r2 = s.ۜۘۡ.m282(r2);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.getLong(java.lang.String, long):long");
    }

    public String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public Set<String> getStringSet(String str, @Nullable Set<String> set) {
        return null;
    }

    /* DevToolsApp WARNING: Missing block: B:4:0x0010, code:
            if (s.ۗۜ۟.m469() <= 0) goto L_0x009f;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0024, code:
            if (s.ۛ۫ۧ.m593() <= 0) goto L_0x007a;
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x0066, code:
            r0 = "ۧۖۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:36:0x007a, code:
            r0 = "ۛۘۨ";
     */
    public void putConfig(java.lang.String r2, java.lang.Object r3) {
        /*
        r1 = this;
        r0 = "ۚۙۗ";
    L_0x0002:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x0006:
        switch(r0) {
            case 1739031: goto L_0x004c;
            case 1739085: goto L_0x0056;
            case 1739798: goto L_0x0080;
            case 1741129: goto L_0x008b;
            case 1741688: goto L_0x009b;
            case 1742635: goto L_0x0027;
            case 1743897: goto L_0x0036;
            case 1746879: goto L_0x0074;
            case 1749323: goto L_0x0014;
            case 1752614: goto L_0x0030;
            case 1753665: goto L_0x006c;
            case 1754098: goto L_0x002c;
            case 1754101: goto L_0x001d;
            case 1755529: goto L_0x0042;
            case 1758282: goto L_0x0060;
            default: goto L_0x0009;
        };
    L_0x0009:
        s.۠ۡۧ.m431();
        r0 = s.ۗۜ۟.m469();
        if (r0 > 0) goto L_0x007a;
    L_0x0012:
        goto L_0x009f;
    L_0x0014:
        s.ۜۖۚ.m7();
        r0 = s.ۡۘۗ.f2;
        if (r0 == 0) goto L_0x0066;
    L_0x001b:
        goto L_0x009f;
    L_0x001d:
        s.ۡۘۗ.m32();
        r0 = s.ۛ۫ۧ.m593();
        if (r0 > 0) goto L_0x008f;
    L_0x0026:
        goto L_0x007a;
    L_0x0027:
        s.ۧۧۡ.m183();
        goto L_0x009f;
    L_0x002c:
        s.ۙۖۥ.m748();
        return;
    L_0x0030:
        r0 = r1.configData;
        s.۟ۥۙ.m640(r0, r2, r3);
        return;
    L_0x0036:
        r0 = s.۬ۨۨ.m730();
        if (r0 == 0) goto L_0x003f;
    L_0x003c:
        r0 = "ۢۗ۠";
        goto L_0x0095;
    L_0x003f:
        r0 = "ۥۤۥ";
        goto L_0x0002;
    L_0x0042:
        r0 = s.ۚۡۢ.m112();
        if (r0 < 0) goto L_0x0049;
    L_0x0048:
        goto L_0x009f;
    L_0x0049:
        r0 = "ۜۢ۟";
        goto L_0x0095;
    L_0x004c:
        r0 = s.۬۟ۜ.m366();
        if (r0 == 0) goto L_0x0053;
    L_0x0052:
        goto L_0x007a;
    L_0x0053:
        r0 = "ۨۥۦ";
        goto L_0x0002;
    L_0x0056:
        r0 = s.ۗۤ۫.m195();
        if (r0 < 0) goto L_0x005d;
    L_0x005c:
        goto L_0x009f;
    L_0x005d:
        r0 = "ۗ۠۠";
        goto L_0x0095;
    L_0x0060:
        r0 = s.ۜۘۡ.m280();
        if (r0 == 0) goto L_0x0069;
    L_0x0066:
        r0 = "ۧۖۤ";
        goto L_0x0095;
    L_0x0069:
        r0 = "ۗۢۘ";
        goto L_0x0095;
    L_0x006c:
        r0 = s.ۢۜۘ.f15;
        if (r0 == 0) goto L_0x0071;
    L_0x0070:
        goto L_0x008f;
    L_0x0071:
        r0 = "۫ۡ۠";
        goto L_0x0002;
    L_0x0074:
        r0 = s.ۙۜۦ.m520();
        if (r0 == 0) goto L_0x007d;
    L_0x007a:
        r0 = "ۛۘۨ";
        goto L_0x0002;
    L_0x007d:
        r0 = "ۦۧۢ";
        goto L_0x0002;
    L_0x0080:
        r0 = s.ۗ۠ۚ.m442();
        if (r0 > 0) goto L_0x0087;
    L_0x0086:
        goto L_0x008f;
    L_0x0087:
        r0 = "۟ۥۥ";
        goto L_0x0002;
    L_0x008b:
        r0 = s.۟ۥۙ.f52;
        if (r0 == 0) goto L_0x0093;
    L_0x008f:
        r0 = "ۙۖۗ";
        goto L_0x0002;
    L_0x0093:
        r0 = "ۘۚۘ";
    L_0x0095:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x0006;
    L_0x009b:
        r0 = s.ۙۖۥ.f58;
        if (r0 == 0) goto L_0x00a3;
    L_0x009f:
        r0 = "ۧۖۡ";
        goto L_0x0002;
    L_0x00a3:
        r0 = "ۙۦۖ";
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.putConfig(java.lang.String, java.lang.Object):void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x002d, code:
            r16 = r9;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0039, code:
            r16 = r9;
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x004c, code:
            if (s.۠ۡ۟.m140() > 0) goto L_0x0056;
     */
    /* DevToolsApp WARNING: Missing block: B:16:0x0053, code:
            if (s.ۡۘۗ.m32() == false) goto L_0x0039;
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x0056, code:
            r16 = s.ۢ۫ۗ.m350("ۧ۬ۡ");
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x008a, code:
            r9 = "ۗۘ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:40:0x00c9, code:
            r9 = "ۨ۫ۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x00e4, code:
            r9 = "۫ۗۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:59:0x0131, code:
            r9 = "۫۫ۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:69:0x0169, code:
            r9 = "ۥۧۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:76:0x0199, code:
            r9 = "۟ۥ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:78:0x01a5, code:
            r11 = r9;
            r9 = r16;
            r16 = r19;
     */
    /* DevToolsApp WARNING: Missing block: B:81:0x01b5, code:
            r9 = "ۚۙۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:89:0x01dc, code:
            r9 = "ۖ۟ۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:91:0x01e1, code:
            r9 = s.ۢ۫ۗ.m350(r9);
     */
    /* DevToolsApp WARNING: Missing block: B:96:0x01f5, code:
            r9 = "ۚۧۧ";
     */
    public void reLoad() {
        /*
        r20 = this;
        r1 = r20;
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
        r16 = "۟ۖۧ";
        r16 = s.ۢ۫ۗ.m350(r16);
        r2 = r0;
        r4 = r3;
        r6 = r5;
        r0 = r8;
        r3 = 0;
        r5 = 0;
        r8 = r7;
        r7 = 0;
    L_0x001f:
        switch(r16) {
            case 1738035: goto L_0x004f;
            case 1738038: goto L_0x0127;
            case 1738406: goto L_0x010f;
            case 1738794: goto L_0x0070;
            case 1739008: goto L_0x015e;
            case 1739376: goto L_0x0146;
            case 1740637: goto L_0x009c;
            case 1741698: goto L_0x0061;
            case 1742138: goto L_0x0029;
            case 1742561: goto L_0x00ff;
            case 1742943: goto L_0x0135;
            case 1743115: goto L_0x01c6;
            case 1746416: goto L_0x01ed;
            case 1746886: goto L_0x0035;
            case 1747363: goto L_0x0177;
            case 1747753: goto L_0x0080;
            case 1748399: goto L_0x009b;
            case 1748601: goto L_0x012d;
            case 1749284: goto L_0x00a7;
            case 1749345: goto L_0x01d6;
            case 1751652: goto L_0x00e8;
            case 1752640: goto L_0x00dc;
            case 1752696: goto L_0x0045;
            case 1753130: goto L_0x00bf;
            case 1754754: goto L_0x007a;
            case 1754780: goto L_0x005d;
            case 1755064: goto L_0x0191;
            case 1755221: goto L_0x0065;
            case 1757976: goto L_0x0093;
            case 1758597: goto L_0x0110;
            case 1759565: goto L_0x01ab;
            default: goto L_0x0022;
        };
    L_0x0022:
        r16 = s.ۛۨۦ.m559();
        if (r16 != 0) goto L_0x0041;
    L_0x0028:
        goto L_0x002d;
    L_0x0029:
        r16 = s.ۡۘۗ.f2;
        if (r16 != 0) goto L_0x0031;
    L_0x002d:
        r16 = r9;
        goto L_0x01dc;
    L_0x0031:
        r16 = r9;
        goto L_0x0199;
    L_0x0035:
        r16 = s.۬ۗ۫.f6;
        if (r16 >= 0) goto L_0x003d;
    L_0x0039:
        r16 = r9;
        goto L_0x01b5;
    L_0x003d:
        r16 = r9;
        goto L_0x00c9;
    L_0x0041:
        r16 = r9;
        goto L_0x0169;
    L_0x0045:
        s.ۗۜۛ.m698();
        r16 = s.۠ۡ۟.m140();
        if (r16 <= 0) goto L_0x002d;
    L_0x004e:
        goto L_0x0056;
    L_0x004f:
        r16 = s.ۡۘۗ.m32();
        if (r16 != 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0039;
    L_0x0056:
        r16 = "ۧ۬ۡ";
        r16 = s.ۢ۫ۗ.m350(r16);
        goto L_0x001f;
    L_0x005d:
        s.ۘۡۜ.m682();
        goto L_0x0039;
    L_0x0061:
        s.ۗۜ۟.m469();
        return;
    L_0x0065:
        r16 = r9;
        r9 = new java.util.HashMap;
        r9.<init>();
        r1.configData = r9;
        goto L_0x0123;
    L_0x0070:
        r16 = r9;
        r9 = r1.configData;
        if (r9 != 0) goto L_0x0123;
    L_0x0076:
        r9 = "ۨۛۨ";
        goto L_0x01d1;
    L_0x007a:
        r16 = r9;
        s.ۜۖۚ.m4(r0);
        goto L_0x008a;
    L_0x0080:
        r16 = r9;
        r9 = r1.strConfigData;	 Catch:{ Exception -> 0x008e }
        r9 = s.ۗۜۛ.m693(r9);	 Catch:{ Exception -> 0x008e }
        r1.configData = r9;	 Catch:{ Exception -> 0x008e }
    L_0x008a:
        r9 = "ۗۘ۫";
        goto L_0x01e1;
    L_0x008e:
        r0 = move-exception;
        r9 = "ۧ۫ۦ";
        goto L_0x01d1;
    L_0x0093:
        r16 = r9;
        r1.strConfigData = r8;
        r9 = "۠ۢ۫";
        goto L_0x01d1;
    L_0x009b:
        return;
    L_0x009c:
        r16 = r9;
        r8 = s.ۙۖۥ.m747(r4, r5, r7, r3);
        r8 = r6.getConfig(r8);
        goto L_0x00e4;
    L_0x00a7:
        r16 = r9;
        r9 = 11;
        r17 = s.۠ۡۧ.f26;
        if (r17 == 0) goto L_0x00b1;
    L_0x00af:
        goto L_0x01dc;
    L_0x00b1:
        r7 = "ۙۖۚ";
        r7 = s.ۜۘۡ.m282(r7);
        r9 = r16;
        r16 = r7;
        r7 = 11;
        goto L_0x001f;
    L_0x00bf:
        r16 = r9;
        r9 = f77;
        r17 = 66;
        r18 = s.ۙۖۥ.f58;
        if (r18 == 0) goto L_0x00cd;
    L_0x00c9:
        r9 = "ۨ۫ۢ";
        goto L_0x01d1;
    L_0x00cd:
        r4 = "ۢۖۘ";
        r4 = s.ۜۘۡ.m282(r4);
        r5 = 66;
        r19 = r16;
        r16 = r4;
        r4 = r9;
        goto L_0x01e9;
    L_0x00dc:
        r16 = r9;
        r8 = r1.configFile;
        r8 = s.ۘۡۜ.m685(r8);
    L_0x00e4:
        r9 = "۫ۗۤ";
        goto L_0x01e1;
    L_0x00e8:
        r16 = r9;
        r9 = r1.algorithmClient;
        if (r9 != 0) goto L_0x00f2;
    L_0x00ee:
        r9 = "ۡۘۦ";
        goto L_0x01e1;
    L_0x00f2:
        r6 = "ۦۖۚ";
        r6 = s.ۜۘۡ.m282(r6);
        r19 = r16;
        r16 = r6;
        r6 = r9;
        goto L_0x01e9;
    L_0x00ff:
        r16 = r9;
        r9 = s.۠ۜۗ.m218(r2);
        if (r9 == 0) goto L_0x010b;
    L_0x0107:
        r9 = "ۥۥ۠";
        goto L_0x01e1;
    L_0x010b:
        r9 = "ۤۤۤ";
        goto L_0x01e1;
    L_0x010f:
        return;
    L_0x0110:
        r16 = r9;
        r9 = r1.configFile;
        if (r9 == 0) goto L_0x0123;
    L_0x0116:
        r2 = "ۛۖۜ";
        r2 = s.ۜۘۡ.m282(r2);
        r19 = r16;
        r16 = r2;
        r2 = r9;
        goto L_0x01e9;
    L_0x0123:
        r9 = "ۖ۫ۛ";
        goto L_0x01d1;
    L_0x0127:
        r16 = r9;
        r3 = 42704; // 0xa6d0 float:5.9841E-41 double:2.10986E-319;
        goto L_0x0131;
    L_0x012d:
        r16 = r9;
        r3 = 23903; // 0x5d5f float:3.3495E-41 double:1.18097E-319;
    L_0x0131:
        r9 = "۫۫ۥ";
        goto L_0x01d1;
    L_0x0135:
        r16 = r9;
        r9 = r11 + r15;
        r9 = r9 * r9;
        r9 = r9 - r14;
        if (r9 > 0) goto L_0x0142;
    L_0x013e:
        r9 = "ۡ۟ۗ";
        goto L_0x01e1;
    L_0x0142:
        r9 = "ۖ۟۟";
        goto L_0x01d1;
    L_0x0146:
        r16 = r9;
        r9 = 6827; // 0x1aab float:9.567E-42 double:3.373E-320;
        r17 = s.ۡۘۗ.f2;
        if (r17 == 0) goto L_0x0150;
    L_0x014e:
        goto L_0x01dc;
    L_0x0150:
        r15 = "ۛۢۦ";
        r15 = s.ۢ۫ۗ.m350(r15);
        r9 = r16;
        r16 = r15;
        r15 = 6827; // 0x1aab float:9.567E-42 double:3.373E-320;
        goto L_0x001f;
    L_0x015e:
        r16 = r9;
        r9 = r12 + r13;
        r9 = r9 + r9;
        r17 = s.۫۫ۗ.m790();
        if (r17 != 0) goto L_0x016d;
    L_0x0169:
        r9 = "ۥۧۚ";
        goto L_0x01e1;
    L_0x016d:
        r14 = "ۗ۫ۤ";
        r14 = s.ۜۘۡ.m282(r14);
        r19 = r14;
        r14 = r9;
        goto L_0x01a5;
    L_0x0177:
        r16 = r9;
        r9 = r11 * r11;
        r17 = 46607929; // 0x2c72e39 float:2.9266952E-37 double:2.30273765E-316;
        r18 = s.ۘۡۜ.f54;
        if (r18 == 0) goto L_0x0184;
    L_0x0182:
        goto L_0x01f5;
    L_0x0184:
        r12 = "ۗ۟ۨ";
        r12 = s.ۜۘۡ.m282(r12);
        r13 = 46607929; // 0x2c72e39 float:2.9266952E-37 double:2.30273765E-316;
        r19 = r12;
        r12 = r9;
        goto L_0x01a5;
    L_0x0191:
        r16 = r9;
        r9 = r16[r10];
        r17 = s.ۡۗۗ.f9;
        if (r17 != 0) goto L_0x019c;
    L_0x0199:
        r9 = "۟ۥ۬";
        goto L_0x01e1;
    L_0x019c:
        r11 = "۠ۖۙ";
        r11 = s.ۜۘۡ.m282(r11);
        r19 = r11;
        r11 = r9;
    L_0x01a5:
        r9 = r16;
        r16 = r19;
        goto L_0x001f;
    L_0x01ab:
        r16 = r9;
        r9 = 65;
        r17 = s.ۚ۟ۢ.m85();
        if (r17 == 0) goto L_0x01b8;
    L_0x01b5:
        r9 = "ۚۙۡ";
        goto L_0x01e1;
    L_0x01b8:
        r10 = "ۨۖۦ";
        r10 = s.ۢ۫ۗ.m350(r10);
        r9 = r16;
        r16 = r10;
        r10 = 65;
        goto L_0x001f;
    L_0x01c6:
        r16 = r9;
        r9 = s.۬ۨۨ.m730();
        if (r9 == 0) goto L_0x01cf;
    L_0x01ce:
        goto L_0x01f5;
    L_0x01cf:
        r9 = "۬۫۬";
    L_0x01d1:
        r9 = s.ۜۘۡ.m282(r9);
        goto L_0x01e5;
    L_0x01d6:
        r16 = r9;
        r9 = s.ۘۡۜ.f54;
        if (r9 == 0) goto L_0x01df;
    L_0x01dc:
        r9 = "ۖ۟ۜ";
        goto L_0x01e1;
    L_0x01df:
        r9 = "ۛۨۘ";
    L_0x01e1:
        r9 = s.ۢ۫ۗ.m350(r9);
    L_0x01e5:
        r19 = r16;
        r16 = r9;
    L_0x01e9:
        r9 = r19;
        goto L_0x001f;
    L_0x01ed:
        r16 = r9;
        r9 = f77;
        r17 = s.ۡۘۗ.f2;
        if (r17 == 0) goto L_0x01f8;
    L_0x01f5:
        r9 = "ۚۧۧ";
        goto L_0x01e1;
    L_0x01f8:
        r16 = "ۢۘۗ";
        r16 = s.ۜۘۡ.m282(r16);
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.reLoad():void");
    }

    /* DevToolsApp WARNING: Missing block: B:9:0x003d, code:
            if (s.ۦۢۜ.f1 <= 0) goto L_0x003f;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x003f, code:
            r15 = r20;
            r16 = r0;
     */
    /* DevToolsApp WARNING: Missing block: B:28:0x0083, code:
            r15 = "ۨۨۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:33:0x00a2, code:
            r15 = s.ۜۘۡ.m282(r15);
     */
    /* DevToolsApp WARNING: Missing block: B:41:0x00e7, code:
            r0 = "۠۟ۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x00f6, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:61:0x0171, code:
            r0 = "۠ۦۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:65:0x0181, code:
            r0 = "ۚۛۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:67:0x0187, code:
            r0 = s.ۢ۫ۗ.m350(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:68:0x018b, code:
            r15 = r0;
     */
    /* DevToolsApp WARNING: Missing block: B:71:0x0199, code:
            r0 = "ۜۤۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:73:0x01a4, code:
            r0 = r16;
     */
    public java.util.ArrayList<com.junge.algorithmAidePro.bean.HookData> readHookList() {
        /*
        r20 = this;
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
        r15 = "ۚۨۚ";
    L_0x0011:
        r15 = s.ۢ۫ۗ.m350(r15);
    L_0x0015:
        switch(r15) {
            case 1737796: goto L_0x00b5;
            case 1737937: goto L_0x011c;
            case 1738405: goto L_0x00eb;
            case 1738753: goto L_0x0094;
            case 1740147: goto L_0x0177;
            case 1740665: goto L_0x0135;
            case 1741767: goto L_0x0028;
            case 1742139: goto L_0x014d;
            case 1742156: goto L_0x018d;
            case 1742753: goto L_0x0068;
            case 1743800: goto L_0x005b;
            case 1743951: goto L_0x004d;
            case 1747856: goto L_0x0038;
            case 1748374: goto L_0x0056;
            case 1748792: goto L_0x00ff;
            case 1748881: goto L_0x00dd;
            case 1749287: goto L_0x0061;
            case 1749319: goto L_0x0077;
            case 1751767: goto L_0x00d4;
            case 1755070: goto L_0x0062;
            case 1755609: goto L_0x0045;
            case 1759234: goto L_0x0167;
            default: goto L_0x0018;
        };
    L_0x0018:
        r15 = r20;
        r16 = r0;
        r0 = r15.configData;
        r17 = f77;
        r18 = s.۠ۡ۟.m140();
        if (r18 > 0) goto L_0x00c9;
    L_0x0026:
        goto L_0x0171;
    L_0x0028:
        s.۬ۨۨ.m730();
        r15 = s.ۢۜۘ.m255();
        if (r15 <= 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0083;
    L_0x0032:
        r15 = r20;
        r16 = r0;
        goto L_0x0171;
    L_0x0038:
        s.۬ۗ۫.m98();
        r15 = s.ۦۢۜ.f1;
        if (r15 > 0) goto L_0x0083;
    L_0x003f:
        r15 = r20;
        r16 = r0;
        goto L_0x0199;
    L_0x0045:
        s.ۡۘۗ.m32();
        r15 = s.ۥۥۚ.f50;
        if (r15 == 0) goto L_0x003f;
    L_0x004c:
        goto L_0x0053;
    L_0x004d:
        s.ۗۢۢ.m454();
        s.ۗ۬۟.m257();
    L_0x0053:
        r15 = "ۡۗ۬";
        goto L_0x0011;
    L_0x0056:
        s.ۤۗۛ.m370();
        r0 = 0;
        return r0;
    L_0x005b:
        r4 = new java.util.ArrayList;
        r4.<init>();
        goto L_0x0074;
    L_0x0061:
        return r4;
    L_0x0062:
        r0 = new java.util.ArrayList;
        r0.<init>();
        return r0;
    L_0x0068:
        r15 = com.alibaba.fastjson.JSON.parseArray(r2, r3);
        r15 = (java.util.ArrayList) r15;
        if (r15 != 0) goto L_0x0073;
    L_0x0070:
        r15 = "ۜ۟ۛ";
        goto L_0x0011;
    L_0x0073:
        r4 = r15;
    L_0x0074:
        r15 = "ۢۖۛ";
        goto L_0x0011;
    L_0x0077:
        r15 = s.۬ۗ۫.m100(r1);
        r16 = com.junge.algorithmAidePro.bean.HookData.class;
        r17 = s.۬۟ۜ.m366();
        if (r17 == 0) goto L_0x0086;
    L_0x0083:
        r15 = "ۨۨۙ";
        goto L_0x00a2;
    L_0x0086:
        r2 = "ۛۜۢ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r3 = r16;
        r19 = r15;
        r15 = r2;
        r2 = r19;
        goto L_0x0015;
    L_0x0094:
        r15 = 8;
        r15 = s.ۗ۠ۚ.m443(r13, r14, r15, r12);
        r15 = s.ۦۢۜ.m26(r0, r15);
        if (r15 != 0) goto L_0x00a8;
    L_0x00a0:
        r15 = "ۨۖ۬";
    L_0x00a2:
        r15 = s.ۜۘۡ.m282(r15);
        goto L_0x0015;
    L_0x00a8:
        r1 = "ۢۗۜ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r19 = r15;
        r15 = r1;
        r1 = r19;
        goto L_0x0015;
    L_0x00b5:
        r15 = 78;
        r16 = s.ۨۘۢ.m318();
        if (r16 == 0) goto L_0x00be;
    L_0x00bd:
        goto L_0x003f;
    L_0x00be:
        r14 = "ۗۗۡ";
        r14 = s.ۢ۫ۗ.m350(r14);
        r15 = r14;
        r14 = 78;
        goto L_0x0015;
    L_0x00c9:
        r13 = "ۖۗۥ";
        r13 = s.ۜۘۡ.m282(r13);
        r15 = r13;
        r13 = r17;
        goto L_0x0015;
    L_0x00d4:
        r15 = r20;
        r16 = r0;
        r0 = 1578; // 0x62a float:2.211E-42 double:7.796E-321;
        r12 = 1578; // 0x62a float:2.211E-42 double:7.796E-321;
        goto L_0x00e7;
    L_0x00dd:
        r15 = r20;
        r16 = r0;
        r0 = 40841; // 0x9f89 float:5.723E-41 double:2.0178E-319;
        r12 = 40841; // 0x9f89 float:5.723E-41 double:2.0178E-319;
    L_0x00e7:
        r0 = "۠۟ۚ";
        goto L_0x0187;
    L_0x00eb:
        r15 = r20;
        r16 = r0;
        r0 = r10 + r11;
        r0 = r0 - r9;
        if (r0 < 0) goto L_0x00fc;
    L_0x00f4:
        r0 = "ۡۨۘ";
    L_0x00f6:
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x018b;
    L_0x00fc:
        r0 = "ۤۨۛ";
        goto L_0x00f6;
    L_0x00ff:
        r15 = r20;
        r16 = r0;
        r0 = 229068225; // 0xda74dc1 float:1.0310888E-30 double:1.131747405E-315;
        r17 = s.ۙۜۦ.m520();
        if (r17 == 0) goto L_0x010e;
    L_0x010c:
        goto L_0x0181;
    L_0x010e:
        r11 = "ۖ۫ۚ";
        r11 = s.ۢ۫ۗ.m350(r11);
        r15 = r11;
        r0 = r16;
        r11 = 229068225; // 0xda74dc1 float:1.0310888E-30 double:1.131747405E-315;
        goto L_0x0015;
    L_0x011c:
        r15 = r20;
        r16 = r0;
        r0 = r7 * r8;
        r17 = r7 * r7;
        r18 = s.ۛ۫ۧ.f49;
        if (r18 != 0) goto L_0x0129;
    L_0x0128:
        goto L_0x0181;
    L_0x0129:
        r9 = "ۡۥۜ";
        r9 = s.ۢ۫ۗ.m350(r9);
        r15 = r9;
        r10 = r17;
        r9 = r0;
        goto L_0x01a4;
    L_0x0135:
        r15 = r20;
        r16 = r0;
        r0 = r5[r6];
        r17 = 30270; // 0x763e float:4.2417E-41 double:1.49554E-319;
        r18 = s.ۥۥۚ.f50;
        if (r18 == 0) goto L_0x0142;
    L_0x0141:
        goto L_0x0181;
    L_0x0142:
        r7 = "ۖۜۗ";
        r7 = s.ۜۘۡ.m282(r7);
        r15 = r7;
        r8 = 30270; // 0x763e float:4.2417E-41 double:1.49554E-319;
        r7 = r0;
        goto L_0x01a4;
    L_0x014d:
        r15 = r20;
        r16 = r0;
        r0 = 77;
        r17 = s.ۙۖۥ.m748();
        if (r17 > 0) goto L_0x015a;
    L_0x0159:
        goto L_0x0171;
    L_0x015a:
        r6 = "ۙۗۗ";
        r6 = s.ۜۘۡ.m282(r6);
        r15 = r6;
        r0 = r16;
        r6 = 77;
        goto L_0x0015;
    L_0x0167:
        r15 = r20;
        r16 = r0;
        r0 = s.۫۫ۗ.m790();
        if (r0 != 0) goto L_0x0174;
    L_0x0171:
        r0 = "۠ۦۖ";
        goto L_0x0187;
    L_0x0174:
        r0 = "ۚۧۨ";
        goto L_0x0187;
    L_0x0177:
        r15 = r20;
        r16 = r0;
        r0 = s.ۨۧۜ.m755();
        if (r0 < 0) goto L_0x0185;
    L_0x0181:
        r0 = "ۚۛۨ";
        goto L_0x00f6;
    L_0x0185:
        r0 = "۬ۡۗ";
    L_0x0187:
        r0 = s.ۢ۫ۗ.m350(r0);
    L_0x018b:
        r15 = r0;
        goto L_0x01a4;
    L_0x018d:
        r15 = r20;
        r16 = r0;
        r0 = f77;
        r17 = s.ۤۗۛ.m370();
        if (r17 < 0) goto L_0x019c;
    L_0x0199:
        r0 = "ۜۤۗ";
        goto L_0x0187;
    L_0x019c:
        r5 = "ۘۥ۠";
        r5 = s.ۜۘۡ.m282(r5);
        r15 = r5;
        r5 = r0;
    L_0x01a4:
        r0 = r16;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.readHookList():java.util.ArrayList<com.junge.algorithmAidePro.bean.HookData>");
    }

    public void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public void setConfigListener(ConfigListener configListener) {
        this.configListener = configListener;
    }

    /* DevToolsApp WARNING: Missing block: B:8:0x001b, code:
            if (s.ۨۧۜ.f59 != 0) goto L_0x0081;
     */
    /* DevToolsApp WARNING: Missing block: B:31:0x006d, code:
            r1 = "۬ۦۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:42:0x008c, code:
            r1 = "ۙۢ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x0096, code:
            r1 = s.ۢ۫ۗ.m350(r1);
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x00a2, code:
            r1 = "۫ۡۘ";
     */
    @androidx.annotation.NonNull
    public java.lang.String toString() {
        /*
        r3 = this;
        r0 = 0;
        r1 = "۬ۜۥ";
    L_0x0003:
        r1 = s.ۜۘۡ.m282(r1);
    L_0x0007:
        switch(r1) {
            case 1738258: goto L_0x009c;
            case 1738441: goto L_0x0038;
            case 1739682: goto L_0x0029;
            case 1741026: goto L_0x001f;
            case 1741625: goto L_0x005f;
            case 1742850: goto L_0x004c;
            case 1748447: goto L_0x0010;
            case 1752260: goto L_0x0055;
            case 1752458: goto L_0x0069;
            case 1753440: goto L_0x003b;
            case 1754760: goto L_0x0088;
            case 1758274: goto L_0x0016;
            case 1758368: goto L_0x007d;
            case 1758904: goto L_0x0073;
            case 1759093: goto L_0x00a9;
            case 1759392: goto L_0x0030;
            case 1759544: goto L_0x0037;
            default: goto L_0x000a;
        };
    L_0x000a:
        r1 = s.ۛۨۦ.f46;
        if (r1 == 0) goto L_0x0094;
    L_0x000e:
        goto L_0x00a2;
    L_0x0010:
        r1 = s.ۙۖۥ.f58;
        if (r1 != 0) goto L_0x00a2;
    L_0x0014:
        goto L_0x0081;
    L_0x0016:
        s.ۨۧۚ.m718();
        r1 = s.ۨۧۜ.f59;
        if (r1 == 0) goto L_0x008c;
    L_0x001d:
        goto L_0x0081;
    L_0x001f:
        s.ۙۖۥ.m748();
        r1 = s.ۖۜ۟.m492();
        if (r1 == 0) goto L_0x0081;
    L_0x0028:
        goto L_0x006d;
    L_0x0029:
        s.۬ۨۨ.m730();
        s.ۢ۫ۜ.m625();
        goto L_0x006d;
    L_0x0030:
        s.ۦۡۤ.m396();
        s.ۗۜۛ.m698();
        r0 = 0;
    L_0x0037:
        return r0;
    L_0x0038:
        r0 = "";
        return r0;
    L_0x003b:
        r1 = r3.strConfigData;
        if (r1 == 0) goto L_0x0049;
    L_0x003f:
        r0 = "۬۫ۗ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r2 = r1;
        r1 = r0;
        r0 = r2;
        goto L_0x0007;
    L_0x0049:
        r1 = "ۖ۬۟";
        goto L_0x0003;
    L_0x004c:
        r1 = s.ۢ۫ۜ.f51;
        if (r1 < 0) goto L_0x0052;
    L_0x0050:
        goto L_0x00af;
    L_0x0052:
        r1 = "ۦ۠ۚ";
        goto L_0x0096;
    L_0x0055:
        r1 = s.۠ۜۗ.m214();
        if (r1 > 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0081;
    L_0x005c:
        r1 = "ۛ۟ۦ";
        goto L_0x0003;
    L_0x005f:
        r1 = s.ۗ۬۟.m257();
        if (r1 > 0) goto L_0x0066;
    L_0x0065:
        goto L_0x006d;
    L_0x0066:
        r1 = "ۥۙۘ";
        goto L_0x0003;
    L_0x0069:
        r1 = s.۬ۗ۫.f6;
        if (r1 < 0) goto L_0x0070;
    L_0x006d:
        r1 = "۬ۦۚ";
        goto L_0x0096;
    L_0x0070:
        r1 = "ۚۗۖ";
        goto L_0x0003;
    L_0x0073:
        r1 = s.ۗ۬ۦ.m407();
        if (r1 != 0) goto L_0x007a;
    L_0x0079:
        goto L_0x008c;
    L_0x007a:
        r1 = "ۥ۟ۤ";
        goto L_0x0003;
    L_0x007d:
        r1 = s.ۘۡۜ.f54;
        if (r1 == 0) goto L_0x0085;
    L_0x0081:
        r1 = "ۘۖ۠";
        goto L_0x0003;
    L_0x0085:
        r1 = "۬ۖۢ";
        goto L_0x0096;
    L_0x0088:
        r1 = s.ۥۥۚ.f50;
        if (r1 == 0) goto L_0x0090;
    L_0x008c:
        r1 = "ۙۢ۫";
        goto L_0x0003;
    L_0x0090:
        r1 = "۫ۤۙ";
        goto L_0x0003;
    L_0x0094:
        r1 = "ۧ۫۬";
    L_0x0096:
        r1 = s.ۢ۫ۗ.m350(r1);
        goto L_0x0007;
    L_0x009c:
        r1 = s.ۦۢۜ.m16();
        if (r1 == 0) goto L_0x00a5;
    L_0x00a2:
        r1 = "۫ۡۘ";
        goto L_0x0096;
    L_0x00a5:
        r1 = "ۛۘۤ";
        goto L_0x0003;
    L_0x00a9:
        r1 = s.۟ۤۗ.m332();
        if (r1 > 0) goto L_0x00b2;
    L_0x00af:
        r1 = "ۡۚۘ";
        goto L_0x0096;
    L_0x00b2:
        r1 = "ۖۦۢ";
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.toString():java.lang.String");
    }

    public void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    /* DevToolsApp WARNING: Missing block: B:5:0x0016, code:
            if (s.ۥۥۚ.f50 != 0) goto L_0x0096;
     */
    /* DevToolsApp WARNING: Missing block: B:18:0x004b, code:
            r4 = "۫ۢ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:21:0x0058, code:
            r4 = "ۗۢۙ";
     */
    /* DevToolsApp WARNING: Missing block: B:37:0x0096, code:
            r4 = "ۖۙۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:41:0x00a4, code:
            r4 = "۟ۘۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x00d0, code:
            r4 = s.ۢ۫ۗ.m350(r4);
     */
    private ConfigReader(java.lang.String r8) {
        /*
        r7 = this;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r7.<init>();
        r4 = "ۛۜ۠";
    L_0x0009:
        r4 = s.ۜۘۡ.m282(r4);
    L_0x000d:
        switch(r4) {
            case 1737756: goto L_0x003a;
            case 1737845: goto L_0x0029;
            case 1737948: goto L_0x00bd;
            case 1738126: goto L_0x004e;
            case 1739086: goto L_0x0043;
            case 1740710: goto L_0x0023;
            case 1740978: goto L_0x0014;
            case 1741611: goto L_0x0073;
            case 1741730: goto L_0x0066;
            case 1742685: goto L_0x005f;
            case 1742694: goto L_0x001a;
            case 1742751: goto L_0x00d6;
            case 1746402: goto L_0x0087;
            case 1746465: goto L_0x002e;
            case 1747530: goto L_0x00b3;
            case 1747812: goto L_0x00c9;
            case 1748849: goto L_0x0092;
            case 1754553: goto L_0x00ab;
            case 1755576: goto L_0x009e;
            case 1758325: goto L_0x0042;
            default: goto L_0x0010;
        };
    L_0x0010:
        s.ۜۖۚ.m4(r3);
        goto L_0x0058;
    L_0x0014:
        r4 = s.ۥۥۚ.f50;
        if (r4 == 0) goto L_0x00e1;
    L_0x0018:
        goto L_0x0096;
    L_0x001a:
        s.ۛۨۦ.m559();
        r4 = s.ۛ۫ۧ.f49;
        if (r4 == 0) goto L_0x00c3;
    L_0x0021:
        goto L_0x0096;
    L_0x0023:
        r4 = s.ۤۤۖ.f35;
        if (r4 == 0) goto L_0x0096;
    L_0x0027:
        goto L_0x00a4;
    L_0x0029:
        s.ۨۗۥ.m536();
        goto L_0x00a4;
    L_0x002e:
        s.۠ۡ۟.m140();
        s.۫۫ۗ.m790();
        r8 = new java.lang.RuntimeException;
        r8.<init>();
        throw r8;
    L_0x003a:
        r4 = new java.util.HashMap;
        r4.<init>();
        r7.configData = r4;
        goto L_0x004b;
    L_0x0042:
        return;
    L_0x0043:
        r4 = r7.configData;
        if (r4 != 0) goto L_0x004b;
    L_0x0047:
        r4 = "ۖۖۜ";
        goto L_0x00d0;
    L_0x004b:
        r4 = "۫ۢ۬";
        goto L_0x0009;
    L_0x004e:
        r7.readOnly = r2;	 Catch:{ Exception -> 0x005b }
        r7.strConfigData = r8;	 Catch:{ Exception -> 0x005b }
        r4 = s.ۗۜۛ.m693(r8);	 Catch:{ Exception -> 0x005b }
        r7.configData = r4;	 Catch:{ Exception -> 0x005b }
    L_0x0058:
        r4 = "ۗۢۙ";
        goto L_0x0009;
    L_0x005b:
        r3 = move-exception;
        r4 = "ۚۦ۠";
        goto L_0x0009;
    L_0x005f:
        r7.algorithmClient = r1;
        r2 = 1;
        r4 = "ۖۢۚ";
        goto L_0x00d0;
    L_0x0066:
        r4 = "";
        r7.packageName = r4;
        r4 = s.ۗۜ۟.f33;
        if (r4 > 0) goto L_0x006f;
    L_0x006e:
        goto L_0x007a;
    L_0x006f:
        r4 = "ۛۚۜ";
        goto L_0x00d0;
    L_0x0073:
        r4 = 0;
        r7.editor = r4;
        r5 = s.ۗ۬ۦ.f27;
        if (r5 == 0) goto L_0x007d;
    L_0x007a:
        r4 = "ۙۡۚ";
        goto L_0x0009;
    L_0x007d:
        r1 = "ۚۚۢ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r6 = r4;
        r4 = r1;
        r1 = r6;
        goto L_0x000d;
    L_0x0087:
        r7.configData = r0;
        r4 = s.ۢۜۘ.f15;
        if (r4 == 0) goto L_0x008e;
    L_0x008d:
        goto L_0x00e1;
    L_0x008e:
        r4 = "ۚۖۧ";
        goto L_0x0009;
    L_0x0092:
        r4 = s.۬۟ۜ.f23;
        if (r4 != 0) goto L_0x009a;
    L_0x0096:
        r4 = "ۖۙۘ";
        goto L_0x0009;
    L_0x009a:
        r4 = "۟ۖۙ";
        goto L_0x0009;
    L_0x009e:
        r4 = s.ۗۗۡ.m78();
        if (r4 == 0) goto L_0x00a7;
    L_0x00a4:
        r4 = "۟ۘۚ";
        goto L_0x00d0;
    L_0x00a7:
        r4 = "ۡۧۗ";
        goto L_0x0009;
    L_0x00ab:
        r4 = s.ۡۥۗ.f47;
        if (r4 == 0) goto L_0x00b0;
    L_0x00af:
        goto L_0x00c3;
    L_0x00b0:
        r4 = "ۨۧۗ";
        goto L_0x00d0;
    L_0x00b3:
        r4 = s.ۢ۫ۗ.m342();
        if (r4 != 0) goto L_0x00ba;
    L_0x00b9:
        goto L_0x00e1;
    L_0x00ba:
        r4 = "ۧۥۗ";
        goto L_0x00d0;
    L_0x00bd:
        r4 = s.ۗۜۛ.m698();
        if (r4 > 0) goto L_0x00c6;
    L_0x00c3:
        r4 = "ۙۘۥ";
        goto L_0x00d0;
    L_0x00c6:
        r4 = "۠ۛۥ";
        goto L_0x00d0;
    L_0x00c9:
        r4 = s.۬ۨۨ.f57;
        if (r4 == 0) goto L_0x00ce;
    L_0x00cd:
        goto L_0x00e1;
    L_0x00ce:
        r4 = "ۖۜۢ";
    L_0x00d0:
        r4 = s.ۢ۫ۗ.m350(r4);
        goto L_0x000d;
    L_0x00d6:
        r4 = new java.util.HashMap;
        r4.<init>();
        r5 = s.۬ۗ۫.m98();
        if (r5 == 0) goto L_0x00e5;
    L_0x00e1:
        r4 = "ۛۚۥ";
        goto L_0x0009;
    L_0x00e5:
        r0 = "۠ۤۨ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r6 = r4;
        r4 = r0;
        r0 = r6;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.<init>(java.lang.String):void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x002d, code:
            r13 = r17;
            r12 = r18;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x003e, code:
            if (s.ۥۘۧ.f53 == false) goto L_0x0040;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0040, code:
            r13 = r17;
            r12 = r18;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x004d, code:
            if (s.ۢۜۘ.m255() <= 0) goto L_0x004f;
     */
    /* DevToolsApp WARNING: Missing block: B:13:0x004f, code:
            r13 = r17;
            r12 = r18;
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x00c6, code:
            r14 = "ۨ۠ۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x010c, code:
            r14 = "ۦۡۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x0128, code:
            r14 = "ۦ۫ۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:51:0x0142, code:
            r14 = "۠ۡۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x0144, code:
            r14 = s.ۜۘۡ.m282(r14);
     */
    /* DevToolsApp WARNING: Missing block: B:56:0x015e, code:
            r14 = "ۦۢ۬";
     */
    /* DevToolsApp WARNING: Missing block: B:62:0x0178, code:
            r14 = s.ۢ۫ۗ.m350(r14);
     */
    /* DevToolsApp WARNING: Missing block: B:63:0x017c, code:
            r12 = r14;
     */
    public void savaHookList(java.util.List<com.junge.algorithmAidePro.bean.HookData> r18) {
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
        r12 = "ۥ۠۠";
        r12 = s.ۢ۫ۗ.m350(r12);
    L_0x0012:
        switch(r12) {
            case 1737756: goto L_0x00ca;
            case 1739223: goto L_0x00f4;
            case 1739689: goto L_0x0063;
            case 1740666: goto L_0x0154;
            case 1742567: goto L_0x0070;
            case 1742837: goto L_0x0086;
            case 1743060: goto L_0x00b8;
            case 1743242: goto L_0x011c;
            case 1744021: goto L_0x0136;
            case 1746415: goto L_0x00bf;
            case 1747713: goto L_0x0046;
            case 1748490: goto L_0x005c;
            case 1752485: goto L_0x016b;
            case 1753479: goto L_0x0024;
            case 1753520: goto L_0x0039;
            case 1753793: goto L_0x0055;
            case 1755359: goto L_0x009f;
            case 1758033: goto L_0x00de;
            default: goto L_0x0015;
        };
    L_0x0015:
        r13 = r17;
        r12 = r18;
        r14 = 219158416; // 0xd101790 float:4.440179E-31 double:1.082786443E-315;
        r15 = s.ۨۗۥ.m536();
        if (r15 == 0) goto L_0x0110;
    L_0x0022:
        goto L_0x010c;
    L_0x0024:
        s.۟ۤۗ.m332();
        r12 = s.ۤۤۖ.m506();
        if (r12 != 0) goto L_0x0033;
    L_0x002d:
        r13 = r17;
        r12 = r18;
        goto L_0x0142;
    L_0x0033:
        r13 = r17;
        r12 = r18;
        goto L_0x015e;
    L_0x0039:
        s.۬۟ۜ.m366();
        r12 = s.ۥۘۧ.f53;
        if (r12 != 0) goto L_0x002d;
    L_0x0040:
        r13 = r17;
        r12 = r18;
        goto L_0x0128;
    L_0x0046:
        s.ۡۘۗ.m32();
        r12 = s.ۢۜۘ.m255();
        if (r12 > 0) goto L_0x0040;
    L_0x004f:
        r13 = r17;
        r12 = r18;
        goto L_0x0173;
    L_0x0055:
        s.ۜۘۡ.m280();
        s.ۨۧۜ.m755();
        goto L_0x004f;
    L_0x005c:
        s.۟ۤۗ.m332();
        s.ۢ۫ۜ.m625();
        return;
    L_0x0063:
        r1 = s.ۗ۬ۦ.m414(r9, r10, r11, r8);
        r12 = r18;
        s.ۖۜ۟.m488(r0, r1, r12);
        r17.save();
        return;
    L_0x0070:
        r12 = r18;
        r13 = 8;
        r14 = s.ۢ۟ۚ.f10;
        if (r14 == 0) goto L_0x007c;
    L_0x0078:
        r13 = r17;
        goto L_0x015e;
    L_0x007c:
        r11 = "ۘۖۧ";
        r11 = s.ۜۘۡ.m282(r11);
        r12 = r11;
        r11 = 8;
        goto L_0x0012;
    L_0x0086:
        r12 = r18;
        r13 = 87;
        r14 = s.ۢ۟ۚ.m168();
        if (r14 > 0) goto L_0x0094;
    L_0x0090:
        r13 = r17;
        goto L_0x0128;
    L_0x0094:
        r10 = "ۛۖۢ";
        r10 = s.ۜۘۡ.m282(r10);
        r12 = r10;
        r10 = 87;
        goto L_0x0012;
    L_0x009f:
        r13 = r17;
        r12 = r18;
        r14 = r13.configData;
        r15 = f77;
        r16 = s.ۜۖۚ.f0;
        if (r16 < 0) goto L_0x00ad;
    L_0x00ab:
        goto L_0x0173;
    L_0x00ad:
        r0 = "ۛ۟ۙ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r12 = r0;
        r0 = r14;
        r9 = r15;
        goto L_0x0012;
    L_0x00b8:
        r13 = r17;
        r12 = r18;
        r8 = 30727; // 0x7807 float:4.3058E-41 double:1.5181E-319;
        goto L_0x00c6;
    L_0x00bf:
        r13 = r17;
        r12 = r18;
        r8 = 37115; // 0x90fb float:5.2009E-41 double:1.8337E-319;
    L_0x00c6:
        r14 = "ۨ۠ۗ";
        goto L_0x0178;
    L_0x00ca:
        r13 = r17;
        r12 = r18;
        r14 = r3 + r7;
        r14 = r14 * r14;
        r14 = r6 - r14;
        if (r14 >= 0) goto L_0x00da;
    L_0x00d6:
        r14 = "ۛۦ۟";
        goto L_0x0178;
    L_0x00da:
        r14 = "۟ۖۦ";
        goto L_0x0178;
    L_0x00de:
        r13 = r17;
        r12 = r18;
        r14 = 14804; // 0x39d4 float:2.0745E-41 double:7.314E-320;
        r15 = s.ۢ۟ۚ.f10;
        if (r15 == 0) goto L_0x00e9;
    L_0x00e8:
        goto L_0x010c;
    L_0x00e9:
        r7 = "ۖۖۜ";
        r7 = s.ۢ۫ۗ.m350(r7);
        r12 = r7;
        r7 = 14804; // 0x39d4 float:2.0745E-41 double:7.314E-320;
        goto L_0x0012;
    L_0x00f4:
        r13 = r17;
        r12 = r18;
        r14 = r4 + r5;
        r14 = r14 + r14;
        r15 = s.۫۫ۗ.m790();
        if (r15 != 0) goto L_0x0102;
    L_0x0101:
        goto L_0x0142;
    L_0x0102:
        r6 = "۫ۙ۟";
        r6 = s.ۢ۫ۗ.m350(r6);
        r12 = r6;
        r6 = r14;
        goto L_0x0012;
    L_0x010c:
        r14 = "ۦۡۢ";
        goto L_0x0178;
    L_0x0110:
        r5 = "ۗۦۦ";
        r5 = s.ۜۘۡ.m282(r5);
        r12 = r5;
        r5 = 219158416; // 0xd101790 float:4.440179E-31 double:1.082786443E-315;
        goto L_0x0012;
    L_0x011c:
        r13 = r17;
        r12 = r18;
        r14 = r1[r2];
        r15 = r14 * r14;
        r16 = s.ۜۘۡ.f17;
        if (r16 > 0) goto L_0x012b;
    L_0x0128:
        r14 = "ۦ۫ۦ";
        goto L_0x0178;
    L_0x012b:
        r3 = "ۜۡۘ";
        r3 = s.ۜۘۡ.m282(r3);
        r12 = r3;
        r3 = r14;
        r4 = r15;
        goto L_0x0012;
    L_0x0136:
        r13 = r17;
        r12 = r18;
        r14 = 86;
        r15 = s.ۗۗۡ.m78();
        if (r15 == 0) goto L_0x0149;
    L_0x0142:
        r14 = "۠ۡۢ";
    L_0x0144:
        r14 = s.ۜۘۡ.m282(r14);
        goto L_0x017c;
    L_0x0149:
        r2 = "ۛ۬ۛ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r12 = r2;
        r2 = 86;
        goto L_0x0012;
    L_0x0154:
        r13 = r17;
        r12 = r18;
        r14 = f77;
        r15 = s.ۡۗۗ.f9;
        if (r15 != 0) goto L_0x0161;
    L_0x015e:
        r14 = "ۦۢ۬";
        goto L_0x0144;
    L_0x0161:
        r1 = "ۜۦ۟";
        r1 = s.ۜۘۡ.m282(r1);
        r12 = r1;
        r1 = r14;
        goto L_0x0012;
    L_0x016b:
        r13 = r17;
        r12 = r18;
        r14 = s.ۚۡۢ.f7;
        if (r14 != 0) goto L_0x0176;
    L_0x0173:
        r14 = "ۡۛۤ";
        goto L_0x0178;
    L_0x0176:
        r14 = "ۙۗۘ";
    L_0x0178:
        r14 = s.ۢ۫ۗ.m350(r14);
    L_0x017c:
        r12 = r14;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.savaHookList(java.util.List):void");
    }

    /* DevToolsApp WARNING: Missing block: B:11:0x0057, code:
            r24 = r0;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x005b, code:
            r24 = "۫ۦۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x0060, code:
            if (s.ۨۧۜ.f59 == 0) goto L_0x0062;
     */
    /* DevToolsApp WARNING: Missing block: B:15:0x0062, code:
            r24 = r0;
     */
    /* DevToolsApp WARNING: Missing block: B:22:0x0077, code:
            r24 = s.ۢ۫ۗ.m350(r24);
     */
    /* DevToolsApp WARNING: Missing block: B:30:0x00b3, code:
            r0 = "ۛۜۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x0145, code:
            r0 = "ۡۜ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:54:0x0168, code:
            r28 = r5;
            r5 = r0;
            r0 = r24;
            r24 = r17;
            r17 = r28;
     */
    /* DevToolsApp WARNING: Missing block: B:57:0x017a, code:
            r0 = "ۦۚۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:61:0x019a, code:
            r0 = "ۖۥ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:65:0x01bb, code:
            r0 = "ۚ۫ۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:69:0x01c8, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:82:0x021a, code:
            r0 = "ۡ۟۫";
     */
    /* DevToolsApp WARNING: Missing block: B:84:0x0229, code:
            r0 = r24;
            r24 = r28;
     */
    public static java.io.File createLogFile(java.lang.String r29) {
        /*
        r1 = r29;
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
        r24 = "۟ۤۨ";
        r24 = s.ۢ۫ۗ.m350(r24);
        r5 = r4;
        r9 = r8;
        r2 = r16;
        r6 = 0;
        r10 = 0;
        r4 = r3;
        r8 = r7;
        r16 = r15;
        r3 = 0;
        r7 = 0;
        r15 = r14;
        r14 = r13;
        r12 = r11;
        r11 = 0;
        r28 = r17;
        r17 = r0;
    L_0x003b:
        r0 = r28;
    L_0x003d:
        switch(r24) {
            case 1738236: goto L_0x006d;
            case 1738282: goto L_0x0149;
            case 1739682: goto L_0x0134;
            case 1742250: goto L_0x018a;
            case 1742741: goto L_0x0084;
            case 1742932: goto L_0x00a5;
            case 1743798: goto L_0x00ed;
            case 1746851: goto L_0x0210;
            case 1748457: goto L_0x01b5;
            case 1748516: goto L_0x010b;
            case 1748621: goto L_0x0066;
            case 1748652: goto L_0x00b7;
            case 1749304: goto L_0x01ae;
            case 1749427: goto L_0x01f6;
            case 1749474: goto L_0x0072;
            case 1749819: goto L_0x0173;
            case 1751257: goto L_0x00ce;
            case 1751556: goto L_0x0071;
            case 1752303: goto L_0x0050;
            case 1753251: goto L_0x0045;
            case 1755050: goto L_0x01be;
            case 1757968: goto L_0x01d9;
            case 1758441: goto L_0x0097;
            case 1758443: goto L_0x005e;
            case 1759081: goto L_0x013d;
            default: goto L_0x0040;
        };
    L_0x0040:
        s.ۗ۬۟.m271(r0);
    L_0x0043:
        r0 = 0;
        return r0;
    L_0x0045:
        r24 = s.ۖۜ۟.m492();
        if (r24 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x005b;
    L_0x004c:
        r24 = r0;
        goto L_0x0200;
    L_0x0050:
        s.ۚ۟ۢ.m85();
        r24 = s.ۡۗۗ.f9;
        if (r24 != 0) goto L_0x005b;
    L_0x0057:
        r24 = r0;
        goto L_0x021a;
    L_0x005b:
        r24 = "۫ۦۦ";
        goto L_0x0077;
    L_0x005e:
        r24 = s.ۨۧۜ.f59;
        if (r24 != 0) goto L_0x0057;
    L_0x0062:
        r24 = r0;
        goto L_0x019a;
    L_0x0066:
        s.۠ۡۧ.m431();
        s.۟ۧۢ.m774();
        goto L_0x0062;
    L_0x006d:
        s.ۢ۫ۜ.m625();
        goto L_0x0043;
    L_0x0071:
        return r16;
    L_0x0072:
        s.ۢ۫ۗ.m343(r16);	 Catch:{ Exception -> 0x007c }
        r24 = "ۤۡۡ";
    L_0x0077:
        r24 = s.ۢ۫ۗ.m350(r24);
        goto L_0x003d;
    L_0x007c:
        r0 = move-exception;
        r24 = "ۨ۬ۙ";
        r24 = s.ۜۘۡ.m282(r24);
        goto L_0x003d;
    L_0x0084:
        r24 = r0;
        r0 = new java.io.File;
        r0.<init>(r5, r2);
        r16 = "ۢۜۜ";
        r16 = s.ۢ۫ۗ.m350(r16);
        r28 = r16;
        r16 = r0;
        goto L_0x0229;
    L_0x0097:
        r24 = r0;
        r0 = "";
        r0 = s.ۡۢۡ.m60(r1, r0);
        if (r0 == 0) goto L_0x00a3;
    L_0x00a1:
        goto L_0x0145;
    L_0x00a3:
        r2 = r1;
        goto L_0x00b3;
    L_0x00a5:
        r24 = r0;
        r0 = 23;
        r2 = 4;
        r0 = s.ۛۨۦ.m544(r14, r0, r2, r3);
        r0 = s.ۗۗۡ.m77(r9, r15, r0);
        r2 = r0;
    L_0x00b3:
        r0 = "ۛۜۖ";
        goto L_0x01d4;
    L_0x00b7:
        r24 = r0;
        r0 = f77;
        r25 = s.ۗ۬۟.m257();
        if (r25 > 0) goto L_0x00c3;
    L_0x00c1:
        goto L_0x017a;
    L_0x00c3:
        r14 = "ۛۢۛ";
        r14 = s.ۜۘۡ.m282(r14);
        r28 = r14;
        r14 = r0;
        goto L_0x0229;
    L_0x00ce:
        r24 = r0;
        r0 = s.ۢ۟ۚ.m167(r8, r10, r11, r3);
        r0 = new java.lang.String[]{r0};
        r0 = com.junge.algorithmAidePro.Utils.Tools.timeStampToDate(r12, r0);
        r25 = s.ۨۗۥ.f42;
        if (r25 > 0) goto L_0x00e2;
    L_0x00e0:
        goto L_0x021a;
    L_0x00e2:
        r15 = "ۡ۠۫";
        r15 = s.ۢ۫ۗ.m350(r15);
        r28 = r15;
        r15 = r0;
        goto L_0x0229;
    L_0x00ed:
        r24 = r0;
        r0 = f77;
        r25 = 4;
        r26 = 19;
        r27 = s.ۢ۫ۜ.m625();
        if (r27 < 0) goto L_0x00fd;
    L_0x00fb:
        goto L_0x017a;
    L_0x00fd:
        r8 = "ۤۗ۬";
        r8 = s.ۜۘۡ.m282(r8);
        r10 = 4;
        r11 = 19;
        r28 = r8;
        r8 = r0;
        goto L_0x0229;
    L_0x010b:
        r24 = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r25 = new java.util.Date;
        r26 = s.ۡۗۗ.f9;
        if (r26 != 0) goto L_0x011a;
    L_0x0118:
        goto L_0x017a;
    L_0x011a:
        r25.<init>();
        r25 = r25.getTime();
        r27 = s.ۨۧۜ.f59;
        if (r27 == 0) goto L_0x0127;
    L_0x0125:
        goto L_0x021a;
    L_0x0127:
        r9 = "ۜ۟ۙ";
        r9 = s.ۜۘۡ.m282(r9);
        r12 = r25;
        r28 = r9;
        r9 = r0;
        goto L_0x0229;
    L_0x0134:
        r24 = r0;
        s.ۗۗۡ.m68(r5);
        r0 = r5;
        r5 = r17;
        goto L_0x0162;
    L_0x013d:
        r24 = r0;
        if (r1 == 0) goto L_0x0145;
    L_0x0141:
        r0 = "۫ۦۤ";
        goto L_0x01c8;
    L_0x0145:
        r0 = "ۡۜ۟";
        goto L_0x01d4;
    L_0x0149:
        r24 = r0;
        r0 = s.۠ۜۗ.m221(r4, r6, r7, r3);
        r5 = r17;
        r0 = r5.getExternalFilesDir(r0);
        r17 = s.۠ۜۗ.m218(r0);
        if (r17 != 0) goto L_0x0162;
    L_0x015b:
        r17 = "ۘۖ۠";
        r17 = s.ۜۘۡ.m282(r17);
        goto L_0x0168;
    L_0x0162:
        r17 = "۬ۜۙ";
        r17 = s.ۢ۫ۗ.m350(r17);
    L_0x0168:
        r28 = r5;
        r5 = r0;
        r0 = r24;
        r24 = r17;
        r17 = r28;
        goto L_0x003d;
    L_0x0173:
        r24 = r0;
        r0 = 3;
        r25 = s.۬ۗ۫.f6;
        if (r25 < 0) goto L_0x017d;
    L_0x017a:
        r0 = "ۦۚۗ";
        goto L_0x01d4;
    L_0x017d:
        r7 = "ۖۧۛ";
        r7 = s.ۢ۫ۗ.m350(r7);
        r0 = r24;
        r24 = r7;
        r7 = 3;
        goto L_0x003d;
    L_0x018a:
        r24 = r0;
        r0 = s.۟ۤۗ.m335();
        r25 = f77;
        r26 = 1;
        r27 = s.ۡۥۗ.m568();
        if (r27 == 0) goto L_0x019d;
    L_0x019a:
        r0 = "ۖۥ۫";
        goto L_0x01c8;
    L_0x019d:
        r4 = "ۢۧ۠";
        r4 = s.ۜۘۡ.m282(r4);
        r17 = r0;
        r0 = r24;
        r6 = 1;
        r24 = r4;
        r4 = r25;
        goto L_0x003d;
    L_0x01ae:
        r24 = r0;
        r0 = 14564; // 0x38e4 float:2.0409E-41 double:7.1956E-320;
        r3 = 14564; // 0x38e4 float:2.0409E-41 double:7.1956E-320;
        goto L_0x01bb;
    L_0x01b5:
        r24 = r0;
        r0 = 7358; // 0x1cbe float:1.0311E-41 double:3.6353E-320;
        r3 = 7358; // 0x1cbe float:1.0311E-41 double:3.6353E-320;
    L_0x01bb:
        r0 = "ۚ۫ۛ";
        goto L_0x01c8;
    L_0x01be:
        r24 = r0;
        r0 = r20 * r23;
        r0 = r0 - r22;
        if (r0 > 0) goto L_0x01d2;
    L_0x01c6:
        r0 = "ۡۚۢ";
    L_0x01c8:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x01cc:
        r28 = r24;
        r24 = r0;
        goto L_0x003b;
    L_0x01d2:
        r0 = "ۢۖ۬";
    L_0x01d4:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x01cc;
    L_0x01d9:
        r24 = r0;
        r0 = 24631369; // 0x177d849 float:4.5521912E-38 double:1.2169513E-316;
        r0 = r21 + r0;
        r25 = 9926; // 0x26c6 float:1.3909E-41 double:4.904E-320;
        r26 = s.ۡۗۗ.m159();
        if (r26 == 0) goto L_0x01e9;
    L_0x01e8:
        goto L_0x021a;
    L_0x01e9:
        r22 = "ۨۖۘ";
        r22 = s.ۜۘۡ.m282(r22);
        r23 = 9926; // 0x26c6 float:1.3909E-41 double:4.904E-320;
        r28 = r22;
        r22 = r0;
        goto L_0x0229;
    L_0x01f6:
        r24 = r0;
        r0 = r18[r19];
        r25 = r0 * r0;
        r26 = s.ۤۤۖ.f35;
        if (r26 == 0) goto L_0x0203;
    L_0x0200:
        r0 = "ۥۚۤ";
        goto L_0x01d4;
    L_0x0203:
        r20 = "۫ۗۜ";
        r20 = s.ۜۘۡ.m282(r20);
        r21 = r25;
        r28 = r20;
        r20 = r0;
        goto L_0x0229;
    L_0x0210:
        r24 = r0;
        r0 = f77;
        r25 = 0;
        r26 = s.۟ۥۙ.f52;
        if (r26 == 0) goto L_0x021d;
    L_0x021a:
        r0 = "ۡ۟۫";
        goto L_0x01d4;
    L_0x021d:
        r18 = "ۢۚ۫";
        r18 = s.ۢ۫ۗ.m350(r18);
        r19 = 0;
        r28 = r18;
        r18 = r0;
    L_0x0229:
        r0 = r24;
        r24 = r28;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.createLogFile(java.lang.String):java.io.File");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0038, code:
            r20 = r5;
            r21 = r8;
            r22 = r9;
            r19 = r12;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x004e, code:
            if (s.ۡۢۡ.f3 >= 0) goto L_0x0050;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0050, code:
            r20 = r5;
            r21 = r8;
            r22 = r9;
            r19 = r12;
     */
    /* DevToolsApp WARNING: Missing block: B:23:0x008c, code:
            r12 = "ۛۘۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:24:0x008e, code:
            r24 = r19;
            r19 = s.ۜۘۡ.m282(r12);
            r12 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:42:0x011a, code:
            r8 = "ۧۗ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x011c, code:
            r8 = s.ۢ۫ۗ.m350(r8);
            r12 = r19;
     */
    /* DevToolsApp WARNING: Missing block: B:52:0x0187, code:
            r5 = "۫ۨۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:53:0x0189, code:
            r5 = s.ۢ۫ۗ.m350(r5);
     */
    /* DevToolsApp WARNING: Missing block: B:58:0x01a3, code:
            r5 = s.ۜۘۡ.m282(r5);
     */
    /* DevToolsApp WARNING: Missing block: B:59:0x01a7, code:
            r12 = r19;
            r8 = r21;
     */
    /* DevToolsApp WARNING: Missing block: B:60:0x01ab, code:
            r9 = r22;
            r19 = r5;
            r5 = r20;
     */
    /* DevToolsApp WARNING: Missing block: B:66:0x01e9, code:
            r5 = "ۛۤۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:68:0x01fc, code:
            r19 = r9;
            r9 = r22;
     */
    /* DevToolsApp WARNING: Missing block: B:71:0x0212, code:
            r5 = "۫ۙ۠";
     */
    /* DevToolsApp WARNING: Missing block: B:73:0x0220, code:
            r9 = r22;
            r19 = r8;
     */
    /* DevToolsApp WARNING: Missing block: B:74:0x0224, code:
            r8 = r21;
     */
    /* DevToolsApp WARNING: Missing block: B:77:0x0238, code:
            r5 = "ۦ۟ۤ";
     */
    public static com.junge.algorithmAidePro.Config.ConfigReader getInstanceByAlgorithmAidePro(java.lang.String r25) {
        /*
        r0 = r25;
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
        r19 = "ۦۢۤ";
    L_0x0019:
        r19 = s.ۜۘۡ.m282(r19);
    L_0x001d:
        switch(r19) {
            case 1738794: goto L_0x01d8;
            case 1739683: goto L_0x017d;
            case 1740957: goto L_0x0070;
            case 1741144: goto L_0x0068;
            case 1742251: goto L_0x007b;
            case 1742617: goto L_0x006d;
            case 1743000: goto L_0x005a;
            case 1744096: goto L_0x01b3;
            case 1749815: goto L_0x0031;
            case 1752745: goto L_0x0172;
            case 1753419: goto L_0x005f;
            case 1753512: goto L_0x0228;
            case 1754139: goto L_0x00c3;
            case 1754366: goto L_0x0202;
            case 1754429: goto L_0x0099;
            case 1754434: goto L_0x0124;
            case 1754461: goto L_0x0103;
            case 1755153: goto L_0x018e;
            case 1758034: goto L_0x004c;
            case 1758505: goto L_0x0146;
            default: goto L_0x0020;
        };
    L_0x0020:
        r19 = r12;
        r12 = s.۬ۨۨ.m720();
        r12 = s.۠ۡۧ.m418(r12, r5);
        r12 = s.ۧۧۡ.m180(r12);
        r11.editor = r12;
        goto L_0x008c;
    L_0x0031:
        s.ۡۥۗ.m568();
        r19 = s.ۨۧۜ.f59;
        if (r19 != 0) goto L_0x0042;
    L_0x0038:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        goto L_0x01e9;
    L_0x0042:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        goto L_0x0212;
    L_0x004c:
        r19 = s.ۡۢۡ.f3;
        if (r19 < 0) goto L_0x0038;
    L_0x0050:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        goto L_0x0238;
    L_0x005a:
        r19 = s.ۦۢۜ.f1;
        if (r19 <= 0) goto L_0x0050;
    L_0x005e:
        goto L_0x0065;
    L_0x005f:
        s.ۗۗۡ.m78();
        s.ۗۤ۫.m195();
    L_0x0065:
        r19 = "ۙۦۥ";
        goto L_0x0019;
    L_0x0068:
        s.ۗۤ۫.m195();
        r0 = 0;
        return r0;
    L_0x006d:
        r11.packageName = r0;
        return r11;
    L_0x0070:
        r19 = r12;
        s.ۗۗۡ.m68(r7);
        r21 = r8;
        r22 = r9;
        goto L_0x011a;
    L_0x007b:
        r19 = r12;
        r12 = 26;
        r12 = s.۟ۥۙ.m653(r9, r10, r12, r1);
        r12 = s.ۡۢۡ.m60(r0, r12);
        if (r12 != 0) goto L_0x008c;
    L_0x0089:
        r12 = "ۛۥۦ";
        goto L_0x008e;
    L_0x008c:
        r12 = "ۛۘۖ";
    L_0x008e:
        r12 = s.ۜۘۡ.m282(r12);
        r24 = r19;
        r19 = r12;
        r12 = r24;
        goto L_0x001d;
    L_0x0099:
        r19 = r12;
        r12 = new com.junge.algorithmAidePro.Config.ConfigReader;
        r12.<init>(r0, r8);
        r20 = f77;
        r21 = 39;
        r22 = s.ۗ۬ۦ.m407();
        if (r22 != 0) goto L_0x00b2;
    L_0x00aa:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        goto L_0x0212;
    L_0x00b2:
        r9 = "ۚ۫ۜ";
        r9 = s.ۜۘۡ.m282(r9);
        r11 = r12;
        r12 = r19;
        r10 = 39;
        r19 = r9;
        r9 = r20;
        goto L_0x001d;
    L_0x00c3:
        r19 = r12;
        r12 = new java.io.File;
        r20 = r5;
        r5 = f77;
        r21 = r8;
        r22 = s.۬۟ۜ.m366();
        if (r22 == 0) goto L_0x00d6;
    L_0x00d3:
        r22 = r9;
        goto L_0x00f4;
    L_0x00d6:
        r8 = 5;
        r23 = s.ۧۧۡ.m183();
        if (r23 > 0) goto L_0x00e1;
    L_0x00dd:
        r22 = r9;
        goto L_0x0238;
    L_0x00e1:
        r22 = r9;
        r9 = 34;
        r5 = s.ۛۨۦ.m544(r5, r9, r8, r1);
        r5 = s.ۨۘۢ.m307(r0, r5);
        r12.<init>(r7, r5);
        r5 = s.۟ۥۙ.f52;
        if (r5 == 0) goto L_0x00f8;
    L_0x00f4:
        r5 = "ۢۧۜ";
        goto L_0x0189;
    L_0x00f8:
        r5 = "ۧۡۗ";
        r5 = s.ۜۘۡ.m282(r5);
        r8 = r12;
        r12 = r19;
        goto L_0x01ab;
    L_0x0103:
        r21 = r8;
        r22 = r9;
        r19 = r12;
        r5 = s.ۥۘۧ.m665(r2, r4, r6, r1);
        r7 = r3.getExternalFilesDir(r5);
        r8 = s.۠ۜۗ.m218(r7);
        if (r8 != 0) goto L_0x011a;
    L_0x0117:
        r8 = "ۙ۠ۤ";
        goto L_0x011c;
    L_0x011a:
        r8 = "ۧۗ۫";
    L_0x011c:
        r8 = s.ۢ۫ۗ.m350(r8);
        r12 = r19;
        goto L_0x0220;
    L_0x0124:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        r5 = 6;
        r8 = s.ۦۡۤ.f25;
        if (r8 == 0) goto L_0x0133;
    L_0x0131:
        goto L_0x0212;
    L_0x0133:
        r6 = "ۧۢۘ";
        r6 = s.ۜۘۡ.m282(r6);
        r12 = r19;
        r5 = r20;
        r8 = r21;
        r9 = r22;
        r19 = r6;
        r6 = 6;
        goto L_0x001d;
    L_0x0146:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        r5 = s.۬ۨۨ.m720();
        r8 = f77;
        r9 = 28;
        r12 = s.ۗ۠ۚ.m442();
        if (r12 > 0) goto L_0x015e;
    L_0x015c:
        goto L_0x01e9;
    L_0x015e:
        r2 = "ۧۡۜ";
        r2 = s.ۜۘۡ.m282(r2);
        r3 = r5;
        r12 = r19;
        r5 = r20;
        r9 = r22;
        r4 = 28;
        r19 = r2;
        r2 = r8;
        goto L_0x0224;
    L_0x0172:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        r1 = 19523; // 0x4c43 float:2.7358E-41 double:9.6456E-320;
        goto L_0x0187;
    L_0x017d:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        r1 = 9124; // 0x23a4 float:1.2785E-41 double:4.508E-320;
    L_0x0187:
        r5 = "۫ۨۦ";
    L_0x0189:
        r5 = s.ۢ۫ۗ.m350(r5);
        goto L_0x01a7;
    L_0x018e:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        r5 = r14 + r18;
        r5 = r5 * r5;
        r5 = r17 - r5;
        if (r5 >= 0) goto L_0x01a1;
    L_0x019e:
        r5 = "ۥۨ۬";
        goto L_0x01a3;
    L_0x01a1:
        r5 = "ۘۖۡ";
    L_0x01a3:
        r5 = s.ۜۘۡ.m282(r5);
    L_0x01a7:
        r12 = r19;
        r8 = r21;
    L_0x01ab:
        r9 = r22;
        r19 = r5;
        r5 = r20;
        goto L_0x001d;
    L_0x01b3:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        r5 = r15 + r16;
        r5 = r5 + r5;
        r8 = 13591; // 0x3517 float:1.9045E-41 double:6.715E-320;
        r9 = s.۟ۧۢ.m774();
        if (r9 == 0) goto L_0x01c7;
    L_0x01c6:
        goto L_0x01e9;
    L_0x01c7:
        r9 = "ۨۙۢ";
        r9 = s.ۢ۫ۗ.m350(r9);
        r17 = r5;
        r12 = r19;
        r5 = r20;
        r8 = r21;
        r18 = 13591; // 0x3517 float:1.9045E-41 double:6.715E-320;
        goto L_0x01fc;
    L_0x01d8:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        r5 = r14 * r14;
        r8 = 184715281; // 0xb028811 float:2.5139454E-32 double:9.12614746E-316;
        r9 = s.ۛۨۦ.f46;
        if (r9 == 0) goto L_0x01ec;
    L_0x01e9:
        r5 = "ۛۤۡ";
        goto L_0x01a3;
    L_0x01ec:
        r9 = "ۜۨ۬";
        r9 = s.ۜۘۡ.m282(r9);
        r15 = r5;
        r12 = r19;
        r5 = r20;
        r8 = r21;
        r16 = 184715281; // 0xb028811 float:2.5139454E-32 double:9.12614746E-316;
    L_0x01fc:
        r19 = r9;
        r9 = r22;
        goto L_0x001d;
    L_0x0202:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        r5 = r19[r13];
        r8 = s.ۛ۫ۧ.m593();
        if (r8 > 0) goto L_0x0215;
    L_0x0212:
        r5 = "۫ۙ۠";
        goto L_0x01a3;
    L_0x0215:
        r8 = "ۗۘ۫";
        r8 = s.ۜۘۡ.m282(r8);
        r14 = r5;
        r12 = r19;
        r5 = r20;
    L_0x0220:
        r9 = r22;
        r19 = r8;
    L_0x0224:
        r8 = r21;
        goto L_0x001d;
    L_0x0228:
        r20 = r5;
        r21 = r8;
        r22 = r9;
        r19 = r12;
        r12 = f77;
        r5 = 27;
        r8 = s.ۜۖۚ.f0;
        if (r8 < 0) goto L_0x023c;
    L_0x0238:
        r5 = "ۦ۟ۤ";
        goto L_0x0189;
    L_0x023c:
        r8 = "ۧ۟ۖ";
        r19 = s.ۜۘۡ.m282(r8);
        r5 = r20;
        r8 = r21;
        r9 = r22;
        r13 = 27;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.getInstanceByAlgorithmAidePro(java.lang.String):com.junge.algorithmAidePro.Config.ConfigReader");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x001c, code:
            if (s.ۡۘۗ.f2 != false) goto L_0x00ad;
     */
    /* DevToolsApp WARNING: Missing block: B:12:0x0030, code:
            r4 = "۬ۛۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x0077, code:
            r4 = "ۡۛۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:44:0x00bf, code:
            r4 = s.ۜۘۡ.m282(r4);
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x00d0, code:
            r4 = "۠ۢۛ";
     */
    private ConfigReader(java.lang.String r8, java.io.File r9) {
        /*
        r7 = this;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r7.<init>();
        r4 = "ۥۛۦ";
    L_0x0009:
        r4 = s.ۢ۫ۗ.m350(r4);
    L_0x000d:
        switch(r4) {
            case 1739397: goto L_0x00b5;
            case 1740065: goto L_0x0020;
            case 1740740: goto L_0x0072;
            case 1742949: goto L_0x0028;
            case 1747737: goto L_0x002d;
            case 1748482: goto L_0x0017;
            case 1751520: goto L_0x009d;
            case 1752263: goto L_0x0083;
            case 1752336: goto L_0x00c5;
            case 1753290: goto L_0x0048;
            case 1758120: goto L_0x00a7;
            case 1758368: goto L_0x0064;
            case 1759048: goto L_0x0034;
            case 1759466: goto L_0x0040;
            default: goto L_0x0010;
        };
    L_0x0010:
        r4 = 0;
        r5 = s.ۚۤۙ.f18;
        if (r5 > 0) goto L_0x0092;
    L_0x0015:
        goto L_0x00ad;
    L_0x0017:
        s.ۡۗۗ.m159();
        r4 = s.ۡۘۗ.f2;
        if (r4 == 0) goto L_0x00b9;
    L_0x001e:
        goto L_0x00ad;
    L_0x0020:
        s.ۢ۟ۚ.m168();
        r4 = s.ۗۤ۫.f12;
        if (r4 == 0) goto L_0x00ad;
    L_0x0027:
        goto L_0x0030;
    L_0x0028:
        r4 = s.۠ۡۧ.f26;
        if (r4 == 0) goto L_0x00d0;
    L_0x002c:
        goto L_0x0030;
    L_0x002d:
        s.۟ۤۗ.m332();
    L_0x0030:
        r4 = "۬ۛۗ";
        goto L_0x00bf;
    L_0x0034:
        s.ۢۜۘ.m255();
        s.ۚۡۢ.m112();
        r8 = new java.lang.RuntimeException;
        r8.<init>();
        throw r8;
    L_0x0040:
        r7.algorithmClient = r3;
        r7.configFile = r9;
        r7.reLoad();
        return;
    L_0x0048:
        r4 = new com.junge.algorithmAidePro.jungeRPC.AlgorithmClient;
        r5 = s.ۗ۠ۚ.m442();
        if (r5 > 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0077;
    L_0x0051:
        r4.<init>(r8);
        r5 = s.ۙۜۦ.f36;
        if (r5 > 0) goto L_0x005a;
    L_0x0058:
        goto L_0x00b9;
    L_0x005a:
        r3 = "۬ۨۦ";
        r3 = s.ۜۘۡ.m282(r3);
        r6 = r4;
        r4 = r3;
        r3 = r6;
        goto L_0x000d;
    L_0x0064:
        r7.readOnly = r2;
        r7.packageName = r8;
        r4 = s.ۨۗۥ.m536();
        if (r4 == 0) goto L_0x006f;
    L_0x006e:
        goto L_0x00ad;
    L_0x006f:
        r4 = "ۦۛ۟";
        goto L_0x00bf;
    L_0x0072:
        r4 = 0;
        r5 = s.ۛ۫ۧ.f49;
        if (r5 != 0) goto L_0x007a;
    L_0x0077:
        r4 = "ۡۛۜ";
        goto L_0x0009;
    L_0x007a:
        r2 = "۫ۤۙ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r4 = r2;
        r2 = 0;
        goto L_0x000d;
    L_0x0083:
        r7.editor = r1;
        r7.algorithmClient = r1;
        r4 = s.ۦۡۤ.m396();
        if (r4 == 0) goto L_0x008e;
    L_0x008d:
        goto L_0x00b9;
    L_0x008e:
        r4 = "ۙۙۤ";
        goto L_0x0009;
    L_0x0092:
        r1 = "ۥۙۛ";
        r1 = s.ۜۘۡ.m282(r1);
        r6 = r4;
        r4 = r1;
        r1 = r6;
        goto L_0x000d;
    L_0x009d:
        r7.configData = r0;
        r4 = s.۟ۧۢ.f60;
        if (r4 > 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x00b9;
    L_0x00a4:
        r4 = "ۥ۫ۨ";
        goto L_0x00bf;
    L_0x00a7:
        r4 = s.۠ۡۧ.m431();
        if (r4 != 0) goto L_0x00b1;
    L_0x00ad:
        r4 = "ۛۢ۬";
        goto L_0x0009;
    L_0x00b1:
        r4 = "ۤ۠ۜ";
        goto L_0x0009;
    L_0x00b5:
        r4 = s.ۡۘۗ.f2;
        if (r4 == 0) goto L_0x00bd;
    L_0x00b9:
        r4 = "ۘۢ۫";
        goto L_0x0009;
    L_0x00bd:
        r4 = "۫ۜۙ";
    L_0x00bf:
        r4 = s.ۜۘۡ.m282(r4);
        goto L_0x000d;
    L_0x00c5:
        r4 = new java.util.HashMap;
        r4.<init>();
        r5 = s.ۘۡۜ.m682();
        if (r5 < 0) goto L_0x00d4;
    L_0x00d0:
        r4 = "۠ۢۛ";
        goto L_0x0009;
    L_0x00d4:
        r0 = "ۗ۬ۚ";
        r0 = s.ۜۘۡ.m282(r0);
        r6 = r4;
        r4 = r0;
        r0 = r6;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.<init>(java.lang.String, java.io.File):void");
    }

    /* DevToolsApp WARNING: Missing block: B:8:0x001b, code:
            if (s.۠ۜۗ.m214() > 0) goto L_0x0088;
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x0094, code:
            r0 = "۟ۘۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x00a0, code:
            r0 = "ۡ۟ۨ";
     */
    @androidx.annotation.Nullable
    public java.lang.String getString(java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3) {
        /*
        r1 = this;
        r0 = "ۢ۟ۥ";
    L_0x0002:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x0006:
        switch(r0) {
            case 1738105: goto L_0x002f;
            case 1740990: goto L_0x005c;
            case 1742077: goto L_0x0068;
            case 1744044: goto L_0x0052;
            case 1746470: goto L_0x007c;
            case 1746475: goto L_0x000f;
            case 1747878: goto L_0x004a;
            case 1747905: goto L_0x001f;
            case 1748332: goto L_0x0072;
            case 1748618: goto L_0x0028;
            case 1748804: goto L_0x0090;
            case 1749576: goto L_0x009c;
            case 1751312: goto L_0x0017;
            case 1751778: goto L_0x0037;
            case 1758220: goto L_0x0040;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = s.ۨۧۜ.f59;
        if (r0 == 0) goto L_0x008c;
    L_0x000d:
        goto L_0x0088;
    L_0x000f:
        r0 = s.ۜۖۚ.m7();
        if (r0 >= 0) goto L_0x0062;
    L_0x0015:
        goto L_0x0088;
    L_0x0017:
        r0 = s.۠ۜۗ.m214();
        if (r0 <= 0) goto L_0x0080;
    L_0x001d:
        goto L_0x0088;
    L_0x001f:
        s.۠ۡ۟.m140();
        r0 = s.ۗۜ۟.f33;
        if (r0 > 0) goto L_0x00a0;
    L_0x0026:
        goto L_0x0088;
    L_0x0028:
        s.ۢ۫ۜ.m625();
        s.ۨۗۥ.m536();
        goto L_0x0088;
    L_0x002f:
        s.ۢ۫ۗ.m342();
        s.ۢ۫ۜ.m625();
        r2 = 0;
        return r2;
    L_0x0037:
        r2 = r1.readConfig(r2, r3);
        r2 = s.ۦۡۤ.m398(r2);
        return r2;
    L_0x0040:
        r0 = s.ۢ۫ۗ.m342();
        if (r0 != 0) goto L_0x0047;
    L_0x0046:
        goto L_0x0094;
    L_0x0047:
        r0 = "ۤۨۦ";
        goto L_0x0002;
    L_0x004a:
        r0 = s.ۢ۫ۗ.f21;
        if (r0 == 0) goto L_0x004f;
    L_0x004e:
        goto L_0x00a0;
    L_0x004f:
        r0 = "۫۟۠";
        goto L_0x0002;
    L_0x0052:
        r0 = s.ۢۜۘ.m255();
        if (r0 > 0) goto L_0x0059;
    L_0x0058:
        goto L_0x0088;
    L_0x0059:
        r0 = "۠ۦ۬";
        goto L_0x0002;
    L_0x005c:
        r0 = s.۬ۨۨ.m730();
        if (r0 == 0) goto L_0x0065;
    L_0x0062:
        r0 = "ۤۙۥ";
        goto L_0x00a5;
    L_0x0065:
        r0 = "ۜۧۗ";
        goto L_0x00a5;
    L_0x0068:
        r0 = s.۟ۥۙ.m650();
        if (r0 > 0) goto L_0x006f;
    L_0x006e:
        goto L_0x0094;
    L_0x006f:
        r0 = "ۙۡۦ";
        goto L_0x00a5;
    L_0x0072:
        r0 = s.۬ۨۨ.m730();
        if (r0 == 0) goto L_0x0079;
    L_0x0078:
        goto L_0x0080;
    L_0x0079:
        r0 = "ۚۥۨ";
        goto L_0x00a5;
    L_0x007c:
        r0 = s.۫۫ۗ.f65;
        if (r0 == 0) goto L_0x0084;
    L_0x0080:
        r0 = "۠ۧۨ";
        goto L_0x0002;
    L_0x0084:
        r0 = "ۡۖۡ";
        goto L_0x0002;
    L_0x0088:
        r0 = "ۖۡۤ";
        goto L_0x0002;
    L_0x008c:
        r0 = "۟ۘ۟";
        goto L_0x0002;
    L_0x0090:
        r0 = s.ۙۖۥ.f58;
        if (r0 == 0) goto L_0x0098;
    L_0x0094:
        r0 = "۟ۘۤ";
        goto L_0x0002;
    L_0x0098:
        r0 = "ۘۙۜ";
        goto L_0x0002;
    L_0x009c:
        r0 = s.ۡۥۗ.f47;
        if (r0 == 0) goto L_0x00a3;
    L_0x00a0:
        r0 = "ۡ۟ۨ";
        goto L_0x00a5;
    L_0x00a3:
        r0 = "ۡۥۨ";
    L_0x00a5:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.getString(java.lang.String, java.lang.String):java.lang.String");
    }

    /* DevToolsApp WARNING: Missing block: B:4:0x003f, code:
            r19 = r0;
            r20 = r2;
            r21 = r3;
     */
    /* DevToolsApp WARNING: Missing block: B:14:0x006d, code:
            r19 = r0;
            r20 = r2;
            r21 = r3;
     */
    /* DevToolsApp WARNING: Missing block: B:17:0x007d, code:
            if (s.ۨۗۥ.m536() == 0) goto L_0x006d;
     */
    /* DevToolsApp WARNING: Missing block: B:18:0x0080, code:
            r19 = "۫۠ۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:19:0x0082, code:
            r19 = s.ۜۘۡ.m282(r19);
     */
    /* DevToolsApp WARNING: Missing block: B:22:0x008d, code:
            r19 = r0;
     */
    /* DevToolsApp WARNING: Missing block: B:25:0x009c, code:
            if (s.ۤۗۛ.m370() >= 0) goto L_0x008d;
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x00a3, code:
            if (s.ۡۢۡ.m58() != false) goto L_0x008d;
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x00cf, code:
            r0 = "ۨ۟۫";
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x00f1, code:
            r0 = "۫۟ۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:46:0x0127, code:
            r20 = r2;
            r21 = r3;
     */
    /* DevToolsApp WARNING: Missing block: B:59:0x016c, code:
            r0 = "ۚ۬ۤ";
     */
    /* DevToolsApp WARNING: Missing block: B:63:0x0186, code:
            r11 = r0;
            r0 = r19;
            r19 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:64:0x018c, code:
            r0 = "ۜۡۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:68:0x01a1, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:69:0x01a7, code:
            r0 = "ۦ۬۠";
     */
    /* DevToolsApp WARNING: Missing block: B:74:0x01b7, code:
            r0 = s.ۢ۫ۗ.m350(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:80:0x01d8, code:
            r0 = "ۛۡۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:86:0x01fe, code:
            r0 = "ۛ۠۟";
     */
    /* DevToolsApp WARNING: Missing block: B:91:0x0210, code:
            r0 = s.ۢ۫ۗ.m350(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:94:0x022c, code:
            r0 = "ۘ۟ۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:99:0x0242, code:
            r0 = s.ۜۘۡ.m282(r0);
     */
    /* DevToolsApp WARNING: Missing block: B:100:0x0246, code:
            r2 = r20;
            r3 = r21;
     */
    /* DevToolsApp WARNING: Missing block: B:113:0x02b7, code:
            r0 = "ۛ۫ۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:117:0x02d0, code:
            r0 = "ۤۗ۫";
     */
    /* DevToolsApp WARNING: Missing block: B:119:0x02e0, code:
            r24 = r19;
            r19 = r0;
            r0 = r24;
     */
    /* DevToolsApp WARNING: Missing block: B:122:0x02f6, code:
            r0 = "ۗۛۦ";
     */
    /* DevToolsApp WARNING: Missing block: B:124:0x0302, code:
            r0 = r19;
            r3 = r21;
     */
    /* DevToolsApp WARNING: Missing block: B:125:0x0306, code:
            r19 = r2;
            r2 = r20;
     */
    public void save() {
        /*
        r25 = this;
        r1 = r25;
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
        r17 = 0;
        r18 = 0;
        r19 = "۠ۢ۫";
        r19 = s.ۜۘۡ.m282(r19);
        r3 = r2;
        r11 = r10;
        r15 = r14;
        r4 = r16;
        r6 = r17;
        r2 = 0;
        r5 = 0;
        r7 = 0;
        r8 = 0;
        r17 = 0;
        r16 = r0;
        r10 = r9;
        r14 = r13;
        r0 = r18;
        r9 = 0;
        r18 = 0;
        r13 = r12;
        r12 = 0;
    L_0x0035:
        switch(r19) {
            case 1738721: goto L_0x0220;
            case 1738747: goto L_0x0281;
            case 1738882: goto L_0x009f;
            case 1739957: goto L_0x0201;
            case 1740035: goto L_0x0215;
            case 1740757: goto L_0x02c2;
            case 1741022: goto L_0x012d;
            case 1742290: goto L_0x0119;
            case 1742589: goto L_0x0106;
            case 1742874: goto L_0x01bd;
            case 1742877: goto L_0x010d;
            case 1742902: goto L_0x00a6;
            case 1742918: goto L_0x02a9;
            case 1743114: goto L_0x0052;
            case 1743207: goto L_0x0098;
            case 1743218: goto L_0x00e1;
            case 1743827: goto L_0x01aa;
            case 1743873: goto L_0x0133;
            case 1746537: goto L_0x0145;
            case 1746961: goto L_0x00b4;
            case 1747753: goto L_0x02e8;
            case 1751256: goto L_0x0064;
            case 1751715: goto L_0x016f;
            case 1753818: goto L_0x0155;
            case 1754155: goto L_0x01be;
            case 1754189: goto L_0x0047;
            case 1754740: goto L_0x01e9;
            case 1755348: goto L_0x00ad;
            case 1755362: goto L_0x00bb;
            case 1758226: goto L_0x0079;
            case 1758252: goto L_0x0087;
            case 1758306: goto L_0x024c;
            case 1758476: goto L_0x00c7;
            case 1759037: goto L_0x022f;
            case 1759175: goto L_0x018f;
            case 1759405: goto L_0x0268;
            default: goto L_0x0038;
        };
    L_0x0038:
        s.ۗ۬۟.m257();
        r19 = s.۬ۨۨ.f57;
        if (r19 != 0) goto L_0x004f;
    L_0x003f:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        goto L_0x01d8;
    L_0x0047:
        r19 = s.ۙۜۦ.f36;
        if (r19 <= 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0080;
    L_0x004c:
        r19 = "ۜۙ۫";
        goto L_0x0082;
    L_0x004f:
        r19 = "ۛۨۗ";
        goto L_0x0082;
    L_0x0052:
        s.ۡۗۗ.m159();
        r19 = s.ۢ۫ۗ.m342();
        if (r19 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x003f;
    L_0x005c:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        goto L_0x02d0;
    L_0x0064:
        s.ۤۤۖ.m506();
        r19 = s.ۢ۟ۚ.m168();
        if (r19 > 0) goto L_0x0075;
    L_0x006d:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        goto L_0x02f6;
    L_0x0075:
        r19 = r0;
        goto L_0x00f1;
    L_0x0079:
        r19 = s.ۨۗۥ.m536();
        if (r19 != 0) goto L_0x0080;
    L_0x007f:
        goto L_0x006d;
    L_0x0080:
        r19 = "۫۠ۡ";
    L_0x0082:
        r19 = s.ۜۘۡ.m282(r19);
        goto L_0x0035;
    L_0x0087:
        r19 = s.ۚۡۢ.m112();
        if (r19 >= 0) goto L_0x0090;
    L_0x008d:
        r19 = r0;
        goto L_0x00cf;
    L_0x0090:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        goto L_0x02b7;
    L_0x0098:
        r19 = s.ۤۗۛ.m370();
        if (r19 < 0) goto L_0x006d;
    L_0x009e:
        goto L_0x008d;
    L_0x009f:
        r19 = s.ۡۢۡ.m58();
        if (r19 == 0) goto L_0x003f;
    L_0x00a5:
        goto L_0x008d;
    L_0x00a6:
        s.ۚ۟ۢ.m85();
        s.ۜۖۚ.m7();
        goto L_0x008d;
    L_0x00ad:
        s.ۘۡۜ.m682();
        s.۟ۧۢ.m774();
        return;
    L_0x00b4:
        s.ۜۖۚ.m4(r0);
        r19 = r0;
        goto L_0x01b5;
    L_0x00bb:
        r19 = r0;
        r0 = 11;
        r0 = s.ۢۜۘ.m241(r14, r2, r0, r12);
        r4.setConfig(r0, r6);
        goto L_0x0127;
    L_0x00c7:
        r19 = r0;
        r0 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r20 = s.ۗۜ۟.f33;
        if (r20 > 0) goto L_0x00d3;
    L_0x00cf:
        r0 = "ۨ۟۫";
        goto L_0x01b7;
    L_0x00d3:
        r2 = "ۨ۠ۚ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r0 = r19;
        r19 = r2;
        r2 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        goto L_0x0035;
    L_0x00e1:
        r19 = r0;
        r0 = r1.algorithmClient;
        r20 = r0;
        r0 = r1.strConfigData;
        r21 = f77;
        r22 = s.ۗۗۡ.m78();
        if (r22 == 0) goto L_0x00f5;
    L_0x00f1:
        r0 = "۫۟ۦ";
        goto L_0x01b7;
    L_0x00f5:
        r4 = "۫ۧۨ";
        r4 = s.ۢ۫ۗ.m350(r4);
        r6 = r0;
        r0 = r19;
        r14 = r21;
        r19 = r4;
        r4 = r20;
        goto L_0x0035;
    L_0x0106:
        r19 = r0;
        r15.configChange(r1);
        goto L_0x01a7;
    L_0x010d:
        r19 = r0;
        r0 = r1.packageName;
        r0 = r13.putString(r0, r10);
        r0.apply();
        goto L_0x016c;
    L_0x0119:
        r19 = r0;
        r0 = r1.algorithmClient;
        r0 = s.۫۫ۗ.m795(r0);
        if (r0 == 0) goto L_0x0127;
    L_0x0123:
        r0 = "ۛ۫ۢ";
        goto L_0x01a1;
    L_0x0127:
        r20 = r2;
        r21 = r3;
        goto L_0x01fe;
    L_0x012d:
        r19 = r0;
        s.ۚ۟ۢ.m84(r11);
        goto L_0x018c;
    L_0x0133:
        r19 = r0;
        r0 = r1.configFile;	 Catch:{ IOException -> 0x013c }
        s.ۜۘۡ.m275(r0);	 Catch:{ IOException -> 0x013c }
        goto L_0x01b5;
    L_0x013c:
        r0 = move-exception;
        r19 = "۟ۨۚ";
        r19 = s.ۢ۫ۗ.m350(r19);
        goto L_0x0035;
    L_0x0145:
        r19 = r0;
        r0 = r1.configListener;
        if (r0 == 0) goto L_0x01a7;
    L_0x014b:
        r15 = "ۛۗۙ";
        r15 = s.ۢ۫ۗ.m350(r15);
        r24 = r15;
        r15 = r0;
        goto L_0x0186;
    L_0x0155:
        r19 = r0;
        r1.strConfigData = r10;
        r0 = r1.configFile;
        com.junge.algorithmAidePro.Utils.Tools.writeFileString(r0, r10);
        r0 = r1.editor;
        if (r0 == 0) goto L_0x016c;
    L_0x0162:
        r13 = "ۛ۠ۢ";
        r13 = s.ۜۘۡ.m282(r13);
        r24 = r13;
        r13 = r0;
        goto L_0x0186;
    L_0x016c:
        r0 = "ۚ۬ۤ";
        goto L_0x01b7;
    L_0x016f:
        r19 = r0;
        r0 = r1.configFile;
        r0 = s.ۤۤۖ.m508(r0);
        r20 = s.۠ۜۗ.m218(r0);
        if (r20 != 0) goto L_0x018c;
    L_0x017d:
        r11 = "ۙۢۧ";
        r11 = s.ۜۘۡ.m282(r11);
        r24 = r11;
        r11 = r0;
    L_0x0186:
        r0 = r19;
        r19 = r24;
        goto L_0x0035;
    L_0x018c:
        r0 = "ۜۡۦ";
        goto L_0x01a1;
    L_0x018f:
        r19 = r0;
        r0 = r1.configData;
        r10 = s.ۖۙۜ.m578(r0);
        r0 = r1.strConfigData;
        r0 = s.ۡۘۗ.m39(r10, r0);
        if (r0 != 0) goto L_0x01a7;
    L_0x019f:
        r0 = "۟ۚۤ";
    L_0x01a1:
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x02e0;
    L_0x01a7:
        r0 = "ۦ۬۠";
        goto L_0x01b7;
    L_0x01aa:
        r19 = r0;
        r0 = s.۠ۜۗ.m218(r3);
        if (r0 != 0) goto L_0x01b5;
    L_0x01b2:
        r0 = "ۤۦۥ";
        goto L_0x01b7;
    L_0x01b5:
        r0 = "۬۟ۚ";
    L_0x01b7:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x02e0;
    L_0x01bd:
        return;
    L_0x01be:
        r19 = r0;
        r0 = new java.lang.Throwable;
        r20 = r2;
        r2 = f77;
        r21 = r3;
        r22 = s.ۗۜ۟.m469();
        if (r22 > 0) goto L_0x01d0;
    L_0x01ce:
        goto L_0x02d0;
    L_0x01d0:
        r3 = 36;
        r23 = s.ۡۘۗ.m32();
        if (r23 == 0) goto L_0x01dc;
    L_0x01d8:
        r0 = "ۛۡۜ";
        goto L_0x0242;
    L_0x01dc:
        r4 = 96;
        r2 = s.۠ۡۧ.m430(r2, r4, r3, r12);
        r0.<init>(r2);
        s.ۗ۬۟.m271(r0);
        return;
    L_0x01e9:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        r2 = r1.configFile;
        if (r2 == 0) goto L_0x01fe;
    L_0x01f3:
        r0 = "ۜ۠ۗ";
        r0 = s.ۜۘۡ.m282(r0);
        r3 = r2;
        r2 = r20;
        goto L_0x02e0;
    L_0x01fe:
        r0 = "ۛ۠۟";
        goto L_0x0210;
    L_0x0201:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        r0 = r1.readOnly;
        if (r0 == 0) goto L_0x020e;
    L_0x020b:
        r0 = "ۧۘۜ";
        goto L_0x0210;
    L_0x020e:
        r0 = "ۧ۫ۘ";
    L_0x0210:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x0246;
    L_0x0215:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        r0 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
        r12 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
        goto L_0x022c;
    L_0x0220:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        r0 = 40855; // 0x9f97 float:5.725E-41 double:2.0185E-319;
        r12 = 40855; // 0x9f97 float:5.725E-41 double:2.0185E-319;
    L_0x022c:
        r0 = "ۘ۟ۜ";
        goto L_0x0242;
    L_0x022f:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        r0 = r5 + r9;
        r0 = r0 * r0;
        r0 = r8 - r0;
        if (r0 >= 0) goto L_0x0240;
    L_0x023d:
        r0 = "ۘۡ۬";
        goto L_0x0242;
    L_0x0240:
        r0 = "ۗۖ۠";
    L_0x0242:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x0246:
        r2 = r20;
        r3 = r21;
        goto L_0x02e0;
    L_0x024c:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        r0 = 19685; // 0x4ce5 float:2.7585E-41 double:9.7257E-320;
        r2 = s.ۙۖۥ.f58;
        if (r2 == 0) goto L_0x025a;
    L_0x0258:
        goto L_0x02d0;
    L_0x025a:
        r2 = "۬ۚ۫";
        r2 = s.ۜۘۡ.m282(r2);
        r0 = r19;
        r3 = r21;
        r9 = 19685; // 0x4ce5 float:2.7585E-41 double:9.7257E-320;
        goto L_0x0306;
    L_0x0268:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        r0 = r18 + r7;
        r0 = r0 + r0;
        r2 = s.۠ۡۧ.m431();
        if (r2 != 0) goto L_0x0278;
    L_0x0277:
        goto L_0x02d0;
    L_0x0278:
        r2 = "۫ۢۙ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r8 = r0;
        goto L_0x0302;
    L_0x0281:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        r0 = r5 * r5;
        r2 = 387499225; // 0x1718c4d9 float:4.9362306E-25 double:1.91450055E-315;
        r3 = s.ۛۨۦ.f46;
        if (r3 == 0) goto L_0x0294;
    L_0x0290:
        r0 = "ۧۙ۟";
        goto L_0x0210;
    L_0x0294:
        r3 = "۬ۦۧ";
        r3 = s.ۜۘۡ.m282(r3);
        r18 = r0;
        r0 = r19;
        r2 = r20;
        r7 = 387499225; // 0x1718c4d9 float:4.9362306E-25 double:1.91450055E-315;
        r19 = r3;
        r3 = r21;
        goto L_0x0035;
    L_0x02a9:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        r0 = r16[r17];
        r2 = s.ۗ۠ۚ.m442();
        if (r2 > 0) goto L_0x02ba;
    L_0x02b7:
        r0 = "ۛ۫ۗ";
        goto L_0x0242;
    L_0x02ba:
        r2 = "ۗۗۛ";
        r2 = s.ۢ۫ۗ.m350(r2);
        r5 = r0;
        goto L_0x0302;
    L_0x02c2:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        r3 = 95;
        r0 = s.ۤۤۖ.m506();
        if (r0 == 0) goto L_0x02d4;
    L_0x02d0:
        r0 = "ۤۗ۫";
        goto L_0x0210;
    L_0x02d4:
        r0 = "ۛۡ۬";
        r0 = s.ۢ۫ۗ.m350(r0);
        r2 = r20;
        r3 = r21;
        r17 = 95;
    L_0x02e0:
        r24 = r19;
        r19 = r0;
        r0 = r24;
        goto L_0x0035;
    L_0x02e8:
        r19 = r0;
        r20 = r2;
        r21 = r3;
        r0 = f77;
        r2 = s.ۖۙۜ.m589();
        if (r2 > 0) goto L_0x02fa;
    L_0x02f6:
        r0 = "ۗۛۦ";
        goto L_0x0210;
    L_0x02fa:
        r2 = "ۙۚۖ";
        r2 = s.ۜۘۡ.m282(r2);
        r16 = r0;
    L_0x0302:
        r0 = r19;
        r3 = r21;
    L_0x0306:
        r19 = r2;
        r2 = r20;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.save():void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0013, code:
            if (s.ۗۜۛ.f55 != 0) goto L_0x009b;
     */
    /* DevToolsApp WARNING: Missing block: B:42:0x008c, code:
            r0 = "۫ۤۚ";
     */
    /* DevToolsApp WARNING: Missing block: B:47:0x009b, code:
            r0 = "ۚ۬ۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:51:0x00a6, code:
            r0 = "ۜۥۙ";
     */
    public void saveConfig(java.lang.String r2, java.lang.Object r3) {
        /*
        r1 = this;
        r0 = "۫۫ۜ";
    L_0x0002:
        r0 = s.ۜۘۡ.m282(r0);
    L_0x0006:
        switch(r0) {
            case 1737879: goto L_0x004d;
            case 1738790: goto L_0x0069;
            case 1739755: goto L_0x0088;
            case 1740916: goto L_0x0044;
            case 1741207: goto L_0x0073;
            case 1742294: goto L_0x0034;
            case 1743984: goto L_0x000e;
            case 1747487: goto L_0x0026;
            case 1747930: goto L_0x007f;
            case 1748046: goto L_0x0057;
            case 1749380: goto L_0x0037;
            case 1749645: goto L_0x005f;
            case 1751278: goto L_0x0097;
            case 1751642: goto L_0x0038;
            case 1754258: goto L_0x002f;
            case 1758369: goto L_0x0017;
            case 1758588: goto L_0x00a2;
            default: goto L_0x0009;
        };
    L_0x0009:
        if (r2 != 0) goto L_0x0041;
    L_0x000b:
        r0 = "ۢۙۛ";
        goto L_0x0002;
    L_0x000e:
        s.ۗ۠ۚ.m442();
        r0 = s.ۗۜۛ.f55;
        if (r0 == 0) goto L_0x008c;
    L_0x0015:
        goto L_0x009b;
    L_0x0017:
        s.ۘۡۜ.m682();
        r0 = s.ۚۡۢ.m112();
        if (r0 < 0) goto L_0x0022;
    L_0x0020:
        goto L_0x009b;
    L_0x0022:
        r0 = "۠ۚۙ";
        goto L_0x0091;
    L_0x0026:
        s.ۡۥۗ.m568();
        r0 = s.ۗ۬۟.f16;
        if (r0 == 0) goto L_0x0079;
    L_0x002d:
        goto L_0x009b;
    L_0x002f:
        s.۠ۡۧ.m431();
        goto L_0x009b;
    L_0x0034:
        s.ۡۥۗ.m568();
    L_0x0037:
        return;
    L_0x0038:
        r0 = r1.configData;
        s.۟ۥۙ.m640(r0, r2, r3);
        r1.save();
        return;
    L_0x0041:
        r0 = "ۤۤۚ";
        goto L_0x0091;
    L_0x0044:
        r0 = s.ۨۧۜ.f59;
        if (r0 == 0) goto L_0x004a;
    L_0x0048:
        goto L_0x00a6;
    L_0x004a:
        r0 = "ۨۦۡ";
        goto L_0x0002;
    L_0x004d:
        r0 = s.۫۫ۗ.m790();
        if (r0 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x008c;
    L_0x0054:
        r0 = "ۙ۟ۚ";
        goto L_0x0091;
    L_0x0057:
        r0 = s.ۥۥۚ.f50;
        if (r0 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x009b;
    L_0x005c:
        r0 = "ۖۚۛ";
        goto L_0x0002;
    L_0x005f:
        r0 = s.۬ۨۨ.m730();
        if (r0 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x008c;
    L_0x0066:
        r0 = "۠۬ۚ";
        goto L_0x0091;
    L_0x0069:
        r0 = s.ۢ۟ۚ.m168();
        if (r0 > 0) goto L_0x0070;
    L_0x006f:
        goto L_0x00a6;
    L_0x0070:
        r0 = "ۢۡ۬";
        goto L_0x0002;
    L_0x0073:
        r0 = s.ۡۘۗ.m32();
        if (r0 == 0) goto L_0x007c;
    L_0x0079:
        r0 = "ۧۛۦ";
        goto L_0x0002;
    L_0x007c:
        r0 = "ۗۘۧ";
        goto L_0x0091;
    L_0x007f:
        r0 = s.ۡۥۗ.f47;
        if (r0 == 0) goto L_0x0084;
    L_0x0083:
        goto L_0x00a6;
    L_0x0084:
        r0 = "ۙۨۦ";
        goto L_0x0002;
    L_0x0088:
        r0 = s.ۙۜۦ.f36;
        if (r0 > 0) goto L_0x008f;
    L_0x008c:
        r0 = "۫ۤۚ";
        goto L_0x0091;
    L_0x008f:
        r0 = "۠ۨۢ";
    L_0x0091:
        r0 = s.ۢ۫ۗ.m350(r0);
        goto L_0x0006;
    L_0x0097:
        r0 = s.۟ۧۢ.f60;
        if (r0 > 0) goto L_0x009e;
    L_0x009b:
        r0 = "ۚ۬ۨ";
        goto L_0x0091;
    L_0x009e:
        r0 = "ۘۘ۫";
        goto L_0x0002;
    L_0x00a2:
        r0 = s.ۢۜۘ.f15;
        if (r0 == 0) goto L_0x00a9;
    L_0x00a6:
        r0 = "ۜۥۙ";
        goto L_0x0091;
    L_0x00a9:
        r0 = "ۤۘۢ";
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.Config.ConfigReader.saveConfig(java.lang.String, java.lang.Object):void");
    }
}
