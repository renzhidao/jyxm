package com.efs.sdk.pa;

public final class b {
    public String a;
    public String b;
    public String c;
    public long d;
    public long e;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MsgID=");
        stringBuilder.append(this.a);
        stringBuilder.append(",Target=");
        stringBuilder.append(this.b);
        stringBuilder.append(",Callback=");
        stringBuilder.append(this.c);
        stringBuilder.append(",ConsumeRealTime=");
        stringBuilder.append(this.d);
        stringBuilder.append(",ConsumeCPUTime=");
        stringBuilder.append(this.e);
        return stringBuilder.toString();
    }
}
