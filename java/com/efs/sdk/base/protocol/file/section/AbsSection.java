package com.efs.sdk.base.protocol.file.section;

public abstract class AbsSection {
    public static final String SEP_LINE_BREAK = "linebreak";
    public static final String SEP_ORIGIN_LINE_BREAK = "\n";
    public String name;
    public String sep;
    public String type;
    public String version = "1.0";

    public AbsSection(String str) {
        String str2 = "";
        this.name = str2;
        this.sep = str2;
        this.type = str;
    }

    public abstract String changeToStr();

    public String getDeclarationLine() {
        StringBuilder stringBuilder = new StringBuilder("section:");
        stringBuilder.append(this.name);
        String str = ",";
        stringBuilder.append(str);
        stringBuilder.append(this.type);
        stringBuilder.append(str);
        stringBuilder.append(this.version);
        stringBuilder.append(str);
        stringBuilder.append(this.sep);
        return stringBuilder.toString();
    }

    public void setSep(String str) {
        if (str.equals("\n")) {
            this.sep = SEP_LINE_BREAK;
        } else {
            this.sep = str;
        }
    }
}
