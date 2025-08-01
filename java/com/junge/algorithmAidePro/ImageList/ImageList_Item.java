package com.junge.algorithmAidePro.ImageList;

import android.graphics.drawable.Drawable;

public class ImageList_Item {
    private int color;
    private Object data;
    private Drawable icon;
    private int icontype;
    private int imageId;
    private boolean isMove;
    private ItemType itemType;
    private String name;
    private String vice;

    public enum ItemType {
        ;
        
        /* renamed from: ۢ۫ۧ */
        private static final short[] f105 = null;

        /* DevToolsApp WARNING: Missing block: B:40:0x00d4, code:
            r5 = "ۜۤۨ";
     */
        /* DevToolsApp WARNING: Missing block: B:43:0x00e2, code:
            r5 = "ۨۤۚ";
     */
        /* DevToolsApp WARNING: Missing block: B:47:0x00f4, code:
            r5 = "ۢۤ۠";
     */
        /* DevToolsApp WARNING: Missing block: B:48:0x00f6, code:
            r5 = s.ۢ۫ۗ.m350(r5);
     */
        static {
            /*
            r0 = 10;
            r0 = new short[r0];
            r0 = {6395, -6330, -6317, -6322, -6316, -6319, -6328, -6315, -6332, -6324};
            f105 = r0;
            r0 = 0;
            r1 = 0;
            r2 = 0;
            r3 = 0;
            r4 = 0;
            r5 = "ۡۘ۟";
        L_0x0010:
            r5 = s.ۜۘۡ.m282(r5);
        L_0x0014:
            switch(r5) {
                case 1739088: goto L_0x00fc;
                case 1740829: goto L_0x00f1;
                case 1742835: goto L_0x00c1;
                case 1743968: goto L_0x00b6;
                case 1747809: goto L_0x00b3;
                case 1748392: goto L_0x009c;
                case 1749726: goto L_0x0076;
                case 1751530: goto L_0x0060;
                case 1753416: goto L_0x005a;
                case 1755486: goto L_0x004c;
                case 1758293: goto L_0x0041;
                case 1759244: goto L_0x002d;
                case 1759454: goto L_0x001c;
                default: goto L_0x0017;
            };
        L_0x0017:
            s.۬۟ۜ.m366();
            goto L_0x0105;
        L_0x001c:
            r5 = s.۟ۥۙ.m650();
            if (r5 > 0) goto L_0x0024;
        L_0x0022:
            goto L_0x00d4;
        L_0x0024:
            r1 = "۬ۡۡ";
            r5 = s.ۜۘۡ.m282(r1);
            r1 = 18452; // 0x4814 float:2.5857E-41 double:9.1165E-320;
            goto L_0x0014;
        L_0x002d:
            r5 = r0 + r1;
            r5 = r5 * r5;
            r6 = s.ۗۜ۟.f33;
            if (r6 > 0) goto L_0x0037;
        L_0x0035:
            goto L_0x0105;
        L_0x0037:
            r2 = "ۤ۠ۦ";
            r2 = s.ۜۘۡ.m282(r2);
            r10 = r5;
            r5 = r2;
            r2 = r10;
            goto L_0x0014;
        L_0x0041:
            r5 = r3 + r3;
            r5 = r5 - r2;
            if (r5 >= 0) goto L_0x0049;
        L_0x0046:
            r5 = "۠ۤۥ";
            goto L_0x0010;
        L_0x0049:
            r5 = "ۙۜ۠";
            goto L_0x0010;
        L_0x004c:
            s.ۗ۠ۚ.m442();
            r5 = s.ۢۜۘ.m255();
            if (r5 <= 0) goto L_0x0057;
        L_0x0055:
            goto L_0x0105;
        L_0x0057:
            r5 = "ۤۗ۬";
            goto L_0x0010;
        L_0x005a:
            r5 = s.ۚ۟ۢ.f5;
            if (r5 != 0) goto L_0x00e2;
        L_0x005e:
            goto L_0x0105;
        L_0x0060:
            r5 = r0 * r0;
            r6 = 340476304; // 0x144b4190 float:1.0261811E-26 double:1.68217645E-315;
            r5 = r5 + r6;
            r6 = s.ۦۡۤ.f25;
            if (r6 == 0) goto L_0x006c;
        L_0x006a:
            goto L_0x00e2;
        L_0x006c:
            r3 = "۫ۡ۫";
            r3 = s.ۜۘۡ.m282(r3);
            r10 = r5;
            r5 = r3;
            r3 = r10;
            goto L_0x0014;
        L_0x0076:
            r5 = new com.junge.algorithmAidePro.ImageList.ImageList_Item$ItemType;
            r6 = f105;
            r7 = 1;
            r8 = s.ۙۖۥ.f58;
            if (r8 == 0) goto L_0x0081;
        L_0x007f:
            goto L_0x00e2;
        L_0x0081:
            r8 = 5;
            r6 = s.۠ۜۗ.m221(r6, r7, r8, r4);
            r7 = s.ۜۖۚ.f0;
            if (r7 < 0) goto L_0x008c;
        L_0x008a:
            goto L_0x0105;
        L_0x008c:
            r7 = 0;
            r5.<init>(r6, r7);
            GROUP = r5;
            r5 = s.۟ۧۢ.f60;
            if (r5 > 0) goto L_0x0098;
        L_0x0096:
            goto L_0x0105;
        L_0x0098:
            r5 = "ۛ۟ۗ";
            goto L_0x0010;
        L_0x009c:
            r5 = f105;
            r6 = 0;
            r5 = r5[r6];
            r6 = s.ۥۥۚ.m614();
            if (r6 > 0) goto L_0x00a8;
        L_0x00a7:
            goto L_0x00d4;
        L_0x00a8:
            r0 = "۬ۨۚ";
            r0 = s.ۜۘۡ.m282(r0);
            r10 = r5;
            r5 = r0;
            r0 = r10;
            goto L_0x0014;
        L_0x00b3:
            r4 = 12356; // 0x3044 float:1.7314E-41 double:6.1047E-320;
            goto L_0x00f4;
        L_0x00b6:
            r5 = s.ۢۜۘ.m255();
            if (r5 > 0) goto L_0x00bd;
        L_0x00bc:
            goto L_0x00e2;
        L_0x00bd:
            r5 = "ۦ۟ۡ";
            goto L_0x0010;
        L_0x00c1:
            r5 = new com.junge.algorithmAidePro.ImageList.ImageList_Item$ItemType;
            r6 = s.ۖۙۜ.m589();
            if (r6 > 0) goto L_0x00ca;
        L_0x00c9:
            goto L_0x00d4;
        L_0x00ca:
            r6 = f105;
            r7 = 6;
            r8 = 4;
            r9 = s.ۨۗۥ.m536();
            if (r9 == 0) goto L_0x00d7;
        L_0x00d4:
            r5 = "ۜۤۨ";
            goto L_0x00f6;
        L_0x00d7:
            r6 = s.ۗ۠ۚ.m443(r6, r7, r8, r4);
            r7 = 1;
            r8 = s.ۖۙۜ.m589();
            if (r8 > 0) goto L_0x00e5;
        L_0x00e2:
            r5 = "ۨۤۚ";
            goto L_0x00f6;
        L_0x00e5:
            r5.<init>(r6, r7);
            ITEM = r5;
            r0 = $values();
            $VALUES = r0;
            return;
        L_0x00f1:
            r4 = 59137; // 0xe701 float:8.2869E-41 double:2.92176E-319;
        L_0x00f4:
            r5 = "ۢۤ۠";
        L_0x00f6:
            r5 = s.ۢ۫ۗ.m350(r5);
            goto L_0x0014;
        L_0x00fc:
            s.۟ۧۢ.m774();
            r0 = new java.lang.RuntimeException;
            r0.<init>();
            throw r0;
        L_0x0105:
            r5 = "ۗۢۛ";
            goto L_0x0010;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.ImageList.ImageList_Item.ItemType.<clinit>():void");
        }
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0017, code:
            if (s.۟ۥۙ.m650() <= 0) goto L_0x0096;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x0020, code:
            if (s.ۗۗۡ.f4 != false) goto L_0x0096;
     */
    /* DevToolsApp WARNING: Missing block: B:27:0x0068, code:
            r1 = "ۦ۬ۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x0088, code:
            r1 = "ۧۨۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x00a3, code:
            r1 = "ۥۥۥ";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x00b6, code:
            r1 = s.ۜۘۡ.m282(r1);
     */
    public ImageList_Item(android.graphics.drawable.Drawable r4, java.lang.String r5, java.lang.String r6, java.lang.Object r7) {
        /*
        r3 = this;
        r0 = 0;
        r3.<init>();
        r1 = "۠ۚۧ";
    L_0x0006:
        r1 = s.ۢ۫ۗ.m350(r1);
    L_0x000a:
        switch(r1) {
            case 1738065: goto L_0x0090;
            case 1741876: goto L_0x003f;
            case 1741946: goto L_0x0062;
            case 1742659: goto L_0x0032;
            case 1743847: goto L_0x002d;
            case 1746544: goto L_0x0056;
            case 1747458: goto L_0x0049;
            case 1747501: goto L_0x00a9;
            case 1751331: goto L_0x006e;
            case 1751652: goto L_0x009d;
            case 1752365: goto L_0x0082;
            case 1752645: goto L_0x0013;
            case 1753820: goto L_0x0024;
            case 1754647: goto L_0x001b;
            case 1758618: goto L_0x003b;
            default: goto L_0x000d;
        };
    L_0x000d:
        r1 = s.ۜۘۡ.f17;
        if (r1 > 0) goto L_0x007f;
    L_0x0011:
        goto L_0x0096;
    L_0x0013:
        r1 = s.۟ۥۙ.m650();
        if (r1 > 0) goto L_0x0088;
    L_0x0019:
        goto L_0x0096;
    L_0x001b:
        s.۟ۥۙ.m650();
        r1 = s.ۗۗۡ.f4;
        if (r1 == 0) goto L_0x0068;
    L_0x0022:
        goto L_0x0096;
    L_0x0024:
        s.ۛۨۦ.m559();
        r1 = s.ۜۖۚ.f0;
        if (r1 < 0) goto L_0x00b1;
    L_0x002b:
        goto L_0x0096;
    L_0x002d:
        s.ۡۘۗ.m32();
        goto L_0x0096;
    L_0x0032:
        s.۠ۜۗ.m214();
        r4 = new java.lang.RuntimeException;
        r4.<init>();
        throw r4;
    L_0x003b:
        r4 = 1;
        r3.icontype = r4;
        return;
    L_0x003f:
        r3.vice = r6;
        r1 = s.ۜۘۡ.f17;
        if (r1 > 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0088;
    L_0x0046:
        r1 = "۫۬ۛ";
        goto L_0x0006;
    L_0x0049:
        r3.icon = r4;
        r3.data = r7;
        r1 = s.ۡۢۡ.f3;
        if (r1 < 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0096;
    L_0x0052:
        r1 = "ۚ۟ۙ";
        goto L_0x00b6;
    L_0x0056:
        r3.color = r0;
        r3.name = r5;
        r1 = s.۟ۧۢ.f60;
        if (r1 > 0) goto L_0x005f;
    L_0x005e:
        goto L_0x00a3;
    L_0x005f:
        r1 = "۠ۙۛ";
        goto L_0x0006;
    L_0x0062:
        r3.isMove = r0;
        r1 = s.ۢ۟ۚ.f10;
        if (r1 == 0) goto L_0x006b;
    L_0x0068:
        r1 = "ۦ۬ۢ";
        goto L_0x0006;
    L_0x006b:
        r1 = "۟ۚ۫";
        goto L_0x0006;
    L_0x006e:
        r1 = 0;
        r2 = s.ۖۜ۟.m492();
        if (r2 == 0) goto L_0x0076;
    L_0x0075:
        goto L_0x00b1;
    L_0x0076:
        r0 = "ۚۡۡ";
        r0 = s.ۜۘۡ.m282(r0);
        r1 = r0;
        r0 = 0;
        goto L_0x000a;
    L_0x007f:
        r1 = "ۤۚۙ";
        goto L_0x0006;
    L_0x0082:
        r1 = s.ۢ۟ۚ.m168();
        if (r1 > 0) goto L_0x008c;
    L_0x0088:
        r1 = "ۧۨۘ";
        goto L_0x0006;
    L_0x008c:
        r1 = "ۦۜۙ";
        goto L_0x0006;
    L_0x0090:
        r1 = s.ۜۘۡ.m280();
        if (r1 == 0) goto L_0x009a;
    L_0x0096:
        r1 = "ۛۙۡ";
        goto L_0x0006;
    L_0x009a:
        r1 = "ۥۜۤ";
        goto L_0x00b6;
    L_0x009d:
        r1 = s.ۗ۠ۚ.m442();
        if (r1 > 0) goto L_0x00a6;
    L_0x00a3:
        r1 = "ۥۥۥ";
        goto L_0x00b6;
    L_0x00a6:
        r1 = "ۖ۠ۛ";
        goto L_0x00b6;
    L_0x00a9:
        r1 = com.junge.algorithmAidePro.ImageList.ImageList_Item.ItemType.ITEM;
        r3.itemType = r1;
        r1 = s.ۜۖۚ.f0;
        if (r1 < 0) goto L_0x00b4;
    L_0x00b1:
        r1 = "ۜ۠۫";
        goto L_0x00b6;
    L_0x00b4:
        r1 = "ۤۤۤ";
    L_0x00b6:
        r1 = s.ۜۘۡ.m282(r1);
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.ImageList.ImageList_Item.<init>(android.graphics.drawable.Drawable, java.lang.String, java.lang.String, java.lang.Object):void");
    }

    public int getColor() {
        return this.color;
    }

    public Object getData() {
        return this.data;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getIconType() {
        return this.icontype;
    }

    public int getImageId() {
        return this.imageId;
    }

    public ItemType getItemType() {
        return this.itemType;
    }

    public String getName() {
        return this.name;
    }

    public String getVice() {
        return this.vice;
    }

    public boolean isMove() {
        return this.isMove;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0017, code:
            if (s.ۜۘۡ.m280() == false) goto L_0x0054;
     */
    /* DevToolsApp WARNING: Missing block: B:8:0x001c, code:
            if (s.ۢۜۘ.f15 == 0) goto L_0x006a;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x0023, code:
            if (s.ۗۜۛ.m698() > 0) goto L_0x0054;
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x006a, code:
            r0 = "ۥ۬ۢ";
     */
    /* DevToolsApp WARNING: Missing block: B:36:0x0074, code:
            r0 = "ۦۘۧ";
     */
    /* DevToolsApp WARNING: Missing block: B:48:0x0095, code:
            r0 = "ۡۛ۬";
     */
    public void setIcon(android.graphics.drawable.Drawable r2) {
        /*
        r1 = this;
        r0 = "۠۫ۛ";
    L_0x0002:
        r0 = s.ۢ۫ۗ.m350(r0);
    L_0x0006:
        switch(r0) {
            case 1738438: goto L_0x004e;
            case 1739880: goto L_0x003a;
            case 1740356: goto L_0x0070;
            case 1740757: goto L_0x005a;
            case 1741072: goto L_0x0082;
            case 1746471: goto L_0x007a;
            case 1746756: goto L_0x0044;
            case 1746905: goto L_0x0064;
            case 1748016: goto L_0x0091;
            case 1748498: goto L_0x001f;
            case 1748854: goto L_0x002e;
            case 1752726: goto L_0x0010;
            case 1752859: goto L_0x0026;
            case 1753205: goto L_0x001a;
            case 1758227: goto L_0x002a;
            default: goto L_0x0009;
        };
    L_0x0009:
        s.ۛ۫ۧ.m593();
        s.ۗۢۢ.m454();
        return;
    L_0x0010:
        s.ۨۗۥ.m536();
        r0 = s.ۜۘۡ.m280();
        if (r0 != 0) goto L_0x0074;
    L_0x0019:
        goto L_0x0054;
    L_0x001a:
        r0 = s.ۢۜۘ.f15;
        if (r0 != 0) goto L_0x0095;
    L_0x001e:
        goto L_0x006a;
    L_0x001f:
        r0 = s.ۗۜۛ.m698();
        if (r0 <= 0) goto L_0x006a;
    L_0x0025:
        goto L_0x0054;
    L_0x0026:
        s.۫ۢ۠.m237();
        goto L_0x0054;
    L_0x002a:
        r2 = 1;
        r1.icontype = r2;
        return;
    L_0x002e:
        r1.icon = r2;
        r0 = s.ۗۜۛ.m698();
        if (r0 > 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0086;
    L_0x0037:
        r0 = "۫۟ۧ";
        goto L_0x0002;
    L_0x003a:
        r0 = s.ۘۡۜ.m682();
        if (r0 < 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0086;
    L_0x0041:
        r0 = "ۡۧۜ";
        goto L_0x0002;
    L_0x0044:
        r0 = s.ۦۡۤ.m396();
        if (r0 == 0) goto L_0x004b;
    L_0x004a:
        goto L_0x0054;
    L_0x004b:
        r0 = "ۘۜ۬";
        goto L_0x0002;
    L_0x004e:
        r0 = s.ۗ۠ۚ.m442();
        if (r0 > 0) goto L_0x0057;
    L_0x0054:
        r0 = "۬ۤۘ";
        goto L_0x0002;
    L_0x0057:
        r0 = "۟ۡۦ";
        goto L_0x008b;
    L_0x005a:
        r0 = s.ۛۨۦ.m559();
        if (r0 == 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0086;
    L_0x0061:
        r0 = "ۖ۬ۜ";
        goto L_0x008b;
    L_0x0064:
        r0 = s.ۚۡۢ.m112();
        if (r0 < 0) goto L_0x006d;
    L_0x006a:
        r0 = "ۥ۬ۢ";
        goto L_0x0002;
    L_0x006d:
        r0 = "ۙۚۖ";
        goto L_0x0002;
    L_0x0070:
        r0 = s.ۗۜ۟.f33;
        if (r0 > 0) goto L_0x0077;
    L_0x0074:
        r0 = "ۦۘۧ";
        goto L_0x0002;
    L_0x0077:
        r0 = "۟ۦ۠";
        goto L_0x008b;
    L_0x007a:
        r0 = s.ۥۘۧ.f53;
        if (r0 == 0) goto L_0x007f;
    L_0x007e:
        goto L_0x0095;
    L_0x007f:
        r0 = "ۘ۬ۘ";
        goto L_0x008b;
    L_0x0082:
        r0 = s.ۚۡۢ.f7;
        if (r0 != 0) goto L_0x0089;
    L_0x0086:
        r0 = "ۥۨۙ";
        goto L_0x008b;
    L_0x0089:
        r0 = "۟ۘ۠";
    L_0x008b:
        r0 = s.ۜۘۡ.m282(r0);
        goto L_0x0006;
    L_0x0091:
        r0 = s.۟ۥۙ.f52;
        if (r0 == 0) goto L_0x0099;
    L_0x0095:
        r0 = "ۡۛ۬";
        goto L_0x0002;
    L_0x0099:
        r0 = "ۙۤۛ";
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.ImageList.ImageList_Item.setIcon(android.graphics.drawable.Drawable):void");
    }

    /* DevToolsApp WARNING: Missing block: B:6:0x0016, code:
            if (s.۬ۗ۫.m98() == 0) goto L_0x0091;
     */
    /* DevToolsApp WARNING: Missing block: B:19:0x004a, code:
            r1 = "ۖ۠ۗ";
     */
    /* DevToolsApp WARNING: Missing block: B:32:0x006e, code:
            r1 = "ۧۧۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x0091, code:
            r1 = "ۖۡۨ";
     */
    /* DevToolsApp WARNING: Missing block: B:45:0x0097, code:
            r1 = s.ۢ۫ۗ.m350(r1);
     */
    public void setImageId(int r4) {
        /*
        r3 = this;
        r0 = 0;
        r1 = "ۘۦۡ";
    L_0x0003:
        r1 = s.ۜۘۡ.m282(r1);
    L_0x0007:
        switch(r1) {
            case 1738061: goto L_0x0021;
            case 1738109: goto L_0x0029;
            case 1740137: goto L_0x007e;
            case 1740179: goto L_0x009d;
            case 1741887: goto L_0x0062;
            case 1742046: goto L_0x0034;
            case 1746607: goto L_0x006a;
            case 1747382: goto L_0x008b;
            case 1747470: goto L_0x0039;
            case 1752644: goto L_0x0074;
            case 1754620: goto L_0x0030;
            case 1755499: goto L_0x001a;
            case 1758091: goto L_0x0058;
            case 1758100: goto L_0x0050;
            case 1759398: goto L_0x000f;
            default: goto L_0x000a;
        };
    L_0x000a:
        r1 = s.۬ۗ۫.f6;
        if (r1 < 0) goto L_0x004d;
    L_0x000e:
        goto L_0x004a;
    L_0x000f:
        s.ۡۢۡ.m58();
        r1 = s.۬ۗ۫.m98();
        if (r1 != 0) goto L_0x00a3;
    L_0x0018:
        goto L_0x0091;
    L_0x001a:
        r1 = s.۫ۢ۠.m237();
        if (r1 >= 0) goto L_0x004a;
    L_0x0020:
        goto L_0x006e;
    L_0x0021:
        s.ۡۘۗ.m32();
        r1 = s.ۧۧۡ.f11;
        if (r1 != 0) goto L_0x0091;
    L_0x0028:
        goto L_0x006e;
    L_0x0029:
        s.ۨۧۜ.m755();
        s.ۤۗۛ.m370();
        goto L_0x006e;
    L_0x0030:
        s.ۙۜۦ.m520();
        return;
    L_0x0034:
        r3.icontype = r0;
        r3.imageId = r4;
        return;
    L_0x0039:
        r1 = 0;
        r2 = s.ۘۡۜ.m682();
        if (r2 < 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0084;
    L_0x0041:
        r0 = "ۚۤۨ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r1 = r0;
        r0 = 0;
        goto L_0x0007;
    L_0x004a:
        r1 = "ۖ۠ۗ";
        goto L_0x0003;
    L_0x004d:
        r1 = "۠ۙۧ";
        goto L_0x0003;
    L_0x0050:
        r1 = s.ۜۘۡ.f17;
        if (r1 > 0) goto L_0x0055;
    L_0x0054:
        goto L_0x006e;
    L_0x0055:
        r1 = "۠۬۫";
        goto L_0x0097;
    L_0x0058:
        r1 = s.ۛۨۦ.m559();
        if (r1 == 0) goto L_0x005f;
    L_0x005e:
        goto L_0x006e;
    L_0x005f:
        r1 = "۫ۛۤ";
        goto L_0x0003;
    L_0x0062:
        r1 = s.ۙۖۥ.f58;
        if (r1 == 0) goto L_0x0067;
    L_0x0066:
        goto L_0x00a3;
    L_0x0067:
        r1 = "۫ۛۛ";
        goto L_0x0003;
    L_0x006a:
        r1 = s.۫ۢ۠.f14;
        if (r1 > 0) goto L_0x0071;
    L_0x006e:
        r1 = "ۧۧۜ";
        goto L_0x0097;
    L_0x0071:
        r1 = "ۚ۟ۤ";
        goto L_0x0003;
    L_0x0074:
        r1 = s.ۡۗۗ.m159();
        if (r1 == 0) goto L_0x007b;
    L_0x007a:
        goto L_0x00a3;
    L_0x007b:
        r1 = "۟ۜ۬";
        goto L_0x0097;
    L_0x007e:
        r1 = s.۬ۗ۫.m98();
        if (r1 == 0) goto L_0x0088;
    L_0x0084:
        r1 = "۬ۦ۠";
        goto L_0x0003;
    L_0x0088:
        r1 = "ۥۥۤ";
        goto L_0x0097;
    L_0x008b:
        r1 = s.ۤۗۛ.m370();
        if (r1 < 0) goto L_0x0095;
    L_0x0091:
        r1 = "ۖۡۨ";
        goto L_0x0003;
    L_0x0095:
        r1 = "ۘۥۖ";
    L_0x0097:
        r1 = s.ۢ۫ۗ.m350(r1);
        goto L_0x0007;
    L_0x009d:
        r1 = s.ۗ۬ۦ.m407();
        if (r1 != 0) goto L_0x00a7;
    L_0x00a3:
        r1 = "ۨۤۧ";
        goto L_0x0003;
    L_0x00a7:
        r1 = "۠ۖ۬";
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.ImageList.ImageList_Item.setImageId(int):void");
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public void setMove(boolean z) {
        this.isMove = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setVice(String str) {
        this.vice = str;
    }

    /* DevToolsApp WARNING: Missing block: B:9:0x002b, code:
            r2 = "ۡ۫ۜ";
     */
    /* DevToolsApp WARNING: Missing block: B:31:0x0090, code:
            r2 = "۟ۤ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x00d0, code:
            r2 = s.ۜۘۡ.m282(r2);
     */
    public ImageList_Item(int r6, java.lang.String r7) {
        /*
        r5 = this;
        r0 = 0;
        r1 = 0;
        r5.<init>();
        r2 = "ۧ۬ۦ";
    L_0x0007:
        r2 = s.ۢ۫ۗ.m350(r2);
    L_0x000b:
        switch(r2) {
            case 1737818: goto L_0x00ac;
            case 1739279: goto L_0x0072;
            case 1739838: goto L_0x008a;
            case 1740980: goto L_0x007f;
            case 1742759: goto L_0x0049;
            case 1743097: goto L_0x005e;
            case 1746568: goto L_0x00b7;
            case 1746842: goto L_0x0022;
            case 1747370: goto L_0x0050;
            case 1748771: goto L_0x0038;
            case 1748978: goto L_0x002f;
            case 1749303: goto L_0x00c1;
            case 1752642: goto L_0x001a;
            case 1753171: goto L_0x003d;
            case 1754537: goto L_0x009f;
            default: goto L_0x000e;
        };
    L_0x000e:
        r2 = com.junge.algorithmAidePro.ImageList.ImageList_Item.ItemType.ITEM;
        r5.itemType = r2;
        r2 = s.ۨۘۢ.m318();
        if (r2 == 0) goto L_0x00ce;
    L_0x0018:
        goto L_0x00cb;
    L_0x001a:
        s.ۦۢۜ.m16();
        r2 = s.ۥۥۚ.f50;
        if (r2 != 0) goto L_0x0090;
    L_0x0021:
        goto L_0x002b;
    L_0x0022:
        s.۫ۢ۠.m237();
        r2 = s.ۗ۬ۦ.f27;
        if (r2 == 0) goto L_0x002b;
    L_0x0029:
        goto L_0x00a5;
    L_0x002b:
        r2 = "ۡ۫ۜ";
        goto L_0x00d0;
    L_0x002f:
        s.ۙۖۥ.m748();
        r2 = s.۬۟ۜ.f23;
        if (r2 == 0) goto L_0x00a5;
    L_0x0036:
        goto L_0x00bb;
    L_0x0038:
        s.ۡۘۗ.m32();
        goto L_0x00bb;
    L_0x003d:
        s.ۗ۬ۦ.m407();
        s.ۡۥۗ.m568();
        r6 = new java.lang.RuntimeException;
        r6.<init>();
        throw r6;
    L_0x0049:
        r5.color = r1;
        r5.name = r7;
        r5.imageId = r6;
        return;
    L_0x0050:
        r5.isMove = r1;
        r2 = s.ۙۜۦ.m520();
        if (r2 == 0) goto L_0x005a;
    L_0x0058:
        goto L_0x00cb;
    L_0x005a:
        r2 = "ۛۜۨ";
        goto L_0x00d0;
    L_0x005e:
        r2 = 0;
        r5.icontype = r2;
        r3 = s.ۙۖۥ.m748();
        if (r3 > 0) goto L_0x0069;
    L_0x0067:
        goto L_0x00cb;
    L_0x0069:
        r1 = "۠ۖ۠";
        r1 = s.ۜۘۡ.m282(r1);
        r2 = r1;
        r1 = 0;
        goto L_0x000b;
    L_0x0072:
        r2 = 0;
        r5.icon = r2;
        r2 = s.ۗۢۢ.m454();
        if (r2 < 0) goto L_0x007c;
    L_0x007b:
        goto L_0x00cb;
    L_0x007c:
        r2 = "ۛۧۥ";
        goto L_0x00d0;
    L_0x007f:
        r5.vice = r0;
        r2 = s.۠ۡ۟.f8;
        if (r2 > 0) goto L_0x0086;
    L_0x0085:
        goto L_0x00bb;
    L_0x0086:
        r2 = "ۗۨ۠";
        goto L_0x0007;
    L_0x008a:
        r2 = "";
        r3 = s.ۙۖۥ.f58;
        if (r3 == 0) goto L_0x0094;
    L_0x0090:
        r2 = "۟ۤ۟";
        goto L_0x0007;
    L_0x0094:
        r0 = "ۙۡۜ";
        r0 = s.ۢ۫ۗ.m350(r0);
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x000b;
    L_0x009f:
        r2 = s.ۡۗۗ.m159();
        if (r2 == 0) goto L_0x00a9;
    L_0x00a5:
        r2 = "ۡۤۦ";
        goto L_0x0007;
    L_0x00a9:
        r2 = "ۘۛۡ";
        goto L_0x00d0;
    L_0x00ac:
        r2 = s.ۢ۟ۚ.m168();
        if (r2 > 0) goto L_0x00b3;
    L_0x00b2:
        goto L_0x00cb;
    L_0x00b3:
        r2 = "ۧۤۦ";
        goto L_0x0007;
    L_0x00b7:
        r2 = s.ۗ۬ۦ.f27;
        if (r2 == 0) goto L_0x00be;
    L_0x00bb:
        r2 = "ۦۗۤ";
        goto L_0x00d0;
    L_0x00be:
        r2 = "ۖۘۜ";
        goto L_0x00d0;
    L_0x00c1:
        r2 = s.ۢ۫ۗ.m342();
        if (r2 != 0) goto L_0x00c8;
    L_0x00c7:
        goto L_0x00cb;
    L_0x00c8:
        r2 = "۟ۛۤ";
        goto L_0x00d0;
    L_0x00cb:
        r2 = "ۥۥۢ";
        goto L_0x00d0;
    L_0x00ce:
        r2 = "ۢۖ۫";
    L_0x00d0:
        r2 = s.ۜۘۡ.m282(r2);
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.ImageList.ImageList_Item.<init>(int, java.lang.String):void");
    }

    /* DevToolsApp WARNING: Missing block: B:10:0x0028, code:
            if (s.ۛ۫ۧ.m593() <= 0) goto L_0x0078;
     */
    /* DevToolsApp WARNING: Missing block: B:18:0x0047, code:
            r2 = "ۧۨۘ";
     */
    /* DevToolsApp WARNING: Missing block: B:29:0x0078, code:
            r2 = "ۨ۬ۡ";
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x008f, code:
            r2 = s.ۢ۫ۗ.m350(r2);
     */
    /* DevToolsApp WARNING: Missing block: B:44:0x00ab, code:
            r2 = "ۢ۫۬";
     */
    public ImageList_Item(int r6, java.lang.String r7, java.lang.String r8, java.lang.Object r9) {
        /*
        r5 = this;
        r0 = 0;
        r1 = 0;
        r5.<init>();
        r2 = "ۗۥۛ";
    L_0x0007:
        r2 = s.ۜۘۡ.m282(r2);
    L_0x000b:
        switch(r2) {
            case 1738995: goto L_0x0038;
            case 1739181: goto L_0x00b2;
            case 1741015: goto L_0x0017;
            case 1744200: goto L_0x005b;
            case 1748435: goto L_0x0070;
            case 1749844: goto L_0x0088;
            case 1749955: goto L_0x0024;
            case 1752186: goto L_0x009e;
            case 1754647: goto L_0x002b;
            case 1755193: goto L_0x00a7;
            case 1755741: goto L_0x002f;
            case 1757967: goto L_0x004d;
            case 1758221: goto L_0x003f;
            case 1758307: goto L_0x001c;
            case 1758321: goto L_0x0095;
            default: goto L_0x000e;
        };
    L_0x000e:
        r2 = 0;
        r3 = s.۟ۧۢ.m774();
        if (r3 == 0) goto L_0x007e;
    L_0x0015:
        goto L_0x00ab;
    L_0x0017:
        r2 = s.ۨۗۥ.f42;
        if (r2 > 0) goto L_0x00bc;
    L_0x001b:
        goto L_0x0047;
    L_0x001c:
        s.۠ۜۗ.m214();
        r2 = s.ۦۢۜ.f1;
        if (r2 <= 0) goto L_0x00ab;
    L_0x0023:
        goto L_0x0047;
    L_0x0024:
        r2 = s.ۛ۫ۧ.m593();
        if (r2 > 0) goto L_0x0047;
    L_0x002a:
        goto L_0x0078;
    L_0x002b:
        s.ۥۘۧ.m662();
        goto L_0x0078;
    L_0x002f:
        s.ۙۖۥ.m748();
        r6 = new java.lang.RuntimeException;
        r6.<init>();
        throw r6;
    L_0x0038:
        r5.data = r9;
        r5.vice = r8;
        r5.icontype = r1;
        return;
    L_0x003f:
        r5.imageId = r6;
        r2 = s.ۚ۟ۢ.m85();
        if (r2 == 0) goto L_0x004a;
    L_0x0047:
        r2 = "ۧۨۘ";
        goto L_0x0007;
    L_0x004a:
        r2 = "ۗ۟ۛ";
        goto L_0x008f;
    L_0x004d:
        r5.color = r1;
        r5.name = r7;
        r2 = s.۠ۜۗ.m214();
        if (r2 > 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0078;
    L_0x0058:
        r2 = "۫۟ۡ";
        goto L_0x008f;
    L_0x005b:
        r2 = 0;
        r5.isMove = r2;
        r3 = s.ۛۨۦ.m559();
        if (r3 == 0) goto L_0x0067;
    L_0x0064:
        r2 = "ۙۢ۠";
        goto L_0x0007;
    L_0x0067:
        r1 = "۫ۗۛ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r2 = r1;
        r1 = 0;
        goto L_0x000b;
    L_0x0070:
        r5.icon = r0;
        r2 = s.ۜۖۚ.m7();
        if (r2 < 0) goto L_0x007b;
    L_0x0078:
        r2 = "ۨ۬ۡ";
        goto L_0x0007;
    L_0x007b:
        r2 = "ۜ۬ۘ";
        goto L_0x008f;
    L_0x007e:
        r0 = "ۡۙ۫";
        r0 = s.ۢ۫ۗ.m350(r0);
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x000b;
    L_0x0088:
        r2 = s.ۦۢۜ.f1;
        if (r2 > 0) goto L_0x008d;
    L_0x008c:
        goto L_0x00bc;
    L_0x008d:
        r2 = "ۜۤۗ";
    L_0x008f:
        r2 = s.ۢ۫ۗ.m350(r2);
        goto L_0x000b;
    L_0x0095:
        r2 = s.ۢ۫ۗ.f21;
        if (r2 == 0) goto L_0x009a;
    L_0x0099:
        goto L_0x00ab;
    L_0x009a:
        r2 = "ۢۨۚ";
        goto L_0x0007;
    L_0x009e:
        r2 = s.ۚ۟ۢ.f5;
        if (r2 != 0) goto L_0x00a3;
    L_0x00a2:
        goto L_0x00bc;
    L_0x00a3:
        r2 = "۫ۢۨ";
        goto L_0x0007;
    L_0x00a7:
        r2 = s.ۚۡۢ.f7;
        if (r2 != 0) goto L_0x00ae;
    L_0x00ab:
        r2 = "ۢ۫۬";
        goto L_0x008f;
    L_0x00ae:
        r2 = "ۥۖ۫";
        goto L_0x0007;
    L_0x00b2:
        r2 = com.junge.algorithmAidePro.ImageList.ImageList_Item.ItemType.ITEM;
        r5.itemType = r2;
        r2 = s.ۤۗۛ.m370();
        if (r2 < 0) goto L_0x00bf;
    L_0x00bc:
        r2 = "۫ۢۚ";
        goto L_0x008f;
    L_0x00bf:
        r2 = "ۨۚ۫";
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.ImageList.ImageList_Item.<init>(int, java.lang.String, java.lang.String, java.lang.Object):void");
    }

    /* DevToolsApp WARNING: Missing block: B:8:0x0020, code:
            if (s.۠ۜۗ.f13 != false) goto L_0x00a5;
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x002b, code:
            if (s.ۢ۫ۜ.m625() < 0) goto L_0x00a5;
     */
    /* DevToolsApp WARNING: Missing block: B:35:0x0098, code:
            r2 = "ۥۜ۟";
     */
    /* DevToolsApp WARNING: Missing block: B:39:0x00a5, code:
            r2 = "۟ۚۛ";
     */
    /* DevToolsApp WARNING: Missing block: B:43:0x00b2, code:
            r2 = "ۢۤۖ";
     */
    /* DevToolsApp WARNING: Missing block: B:49:0x00c7, code:
            r2 = s.ۜۘۡ.m282(r2);
     */
    public ImageList_Item(java.lang.String r6, java.lang.String r7, java.lang.Object r8) {
        /*
        r5 = this;
        r0 = 0;
        r1 = 0;
        r5.<init>();
        r2 = "ۢۧۘ";
    L_0x0007:
        r2 = s.ۢ۫ۗ.m350(r2);
    L_0x000b:
        switch(r2) {
            case 1739724: goto L_0x0092;
            case 1739869: goto L_0x0053;
            case 1740830: goto L_0x002f;
            case 1743631: goto L_0x0040;
            case 1746528: goto L_0x0037;
            case 1747858: goto L_0x0087;
            case 1747924: goto L_0x00ac;
            case 1749666: goto L_0x0016;
            case 1749716: goto L_0x001e;
            case 1749811: goto L_0x00b9;
            case 1751550: goto L_0x009f;
            case 1752360: goto L_0x0024;
            case 1752559: goto L_0x0075;
            case 1754155: goto L_0x0046;
            case 1755514: goto L_0x005f;
            default: goto L_0x000e;
        };
    L_0x000e:
        r5.icon = r0;
        r2 = s.ۦۡۤ.f25;
        if (r2 == 0) goto L_0x0072;
    L_0x0014:
        goto L_0x00b2;
    L_0x0016:
        r2 = s.ۨۘۢ.m318();
        if (r2 != 0) goto L_0x00b2;
    L_0x001c:
        goto L_0x00a5;
    L_0x001e:
        r2 = s.۠ۜۗ.f13;
        if (r2 == 0) goto L_0x0098;
    L_0x0022:
        goto L_0x00a5;
    L_0x0024:
        s.ۨۘۢ.m318();
        r2 = s.ۢ۫ۜ.m625();
        if (r2 >= 0) goto L_0x00c1;
    L_0x002d:
        goto L_0x00a5;
    L_0x002f:
        s.۟ۧۢ.m774();
        s.۟ۥۙ.m650();
        goto L_0x00a5;
    L_0x0037:
        s.ۨۗۥ.m536();
        r6 = new java.lang.RuntimeException;
        r6.<init>();
        throw r6;
    L_0x0040:
        r5.vice = r7;
        r6 = 2;
        r5.icontype = r6;
        return;
    L_0x0046:
        r5.data = r8;
        r2 = s.ۢ۫ۜ.m625();
        if (r2 < 0) goto L_0x0050;
    L_0x004e:
        goto L_0x00b2;
    L_0x0050:
        r2 = "ۜۙ۬";
        goto L_0x0007;
    L_0x0053:
        r5.color = r1;
        r5.name = r6;
        r2 = s.ۗۢۢ.f29;
        if (r2 < 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0098;
    L_0x005c:
        r2 = "ۧۘۜ";
        goto L_0x0007;
    L_0x005f:
        r2 = 0;
        r5.isMove = r2;
        r3 = s.ۚۡۢ.f7;
        if (r3 != 0) goto L_0x0069;
    L_0x0066:
        r2 = "ۢۢۢ";
        goto L_0x0007;
    L_0x0069:
        r1 = "ۘۜۡ";
        r1 = s.ۢ۫ۗ.m350(r1);
        r2 = r1;
        r1 = 0;
        goto L_0x000b;
    L_0x0072:
        r2 = "ۨۥۗ";
        goto L_0x00c7;
    L_0x0075:
        r2 = 0;
        r3 = s.ۗۜۛ.m698();
        if (r3 > 0) goto L_0x007d;
    L_0x007c:
        goto L_0x00a5;
    L_0x007d:
        r0 = "ۗۧۡ";
        r0 = s.ۜۘۡ.m282(r0);
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x000b;
    L_0x0087:
        r2 = s.ۢ۟ۚ.m168();
        if (r2 > 0) goto L_0x008e;
    L_0x008d:
        goto L_0x00b2;
    L_0x008e:
        r2 = "ۥۢ۬";
        goto L_0x0007;
    L_0x0092:
        r2 = s.ۨۧۚ.m718();
        if (r2 > 0) goto L_0x009c;
    L_0x0098:
        r2 = "ۥۜ۟";
        goto L_0x0007;
    L_0x009c:
        r2 = "۠ۦۘ";
        goto L_0x00c7;
    L_0x009f:
        r2 = s.۟ۧۢ.m774();
        if (r2 == 0) goto L_0x00a9;
    L_0x00a5:
        r2 = "۟ۚۛ";
        goto L_0x0007;
    L_0x00a9:
        r2 = "ۘۗ۫";
        goto L_0x00c7;
    L_0x00ac:
        r2 = s.۟ۧۢ.m774();
        if (r2 == 0) goto L_0x00b5;
    L_0x00b2:
        r2 = "ۢۤۖ";
        goto L_0x00c7;
    L_0x00b5:
        r2 = "ۤۡۛ";
        goto L_0x0007;
    L_0x00b9:
        r2 = com.junge.algorithmAidePro.ImageList.ImageList_Item.ItemType.ITEM;
        r5.itemType = r2;
        r2 = s.ۜۘۡ.f17;
        if (r2 > 0) goto L_0x00c5;
    L_0x00c1:
        r2 = "ۙۜۡ";
        goto L_0x0007;
    L_0x00c5:
        r2 = "۠ۨۜ";
    L_0x00c7:
        r2 = s.ۜۘۡ.m282(r2);
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.junge.algorithmAidePro.ImageList.ImageList_Item.<init>(java.lang.String, java.lang.String, java.lang.Object):void");
    }
}
