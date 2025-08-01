package com.efs.sdk.net.a;

import java.io.Serializable;

public final class b implements Serializable {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    public long f;
    public int g;
    public String h;
    public long i;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OkHttpInterceptorModle{mRequestId='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", mUrl='");
        stringBuilder.append(this.d);
        stringBuilder.append('\'');
        stringBuilder.append(", mMethod='");
        stringBuilder.append(this.e);
        stringBuilder.append('\'');
        stringBuilder.append(", mStatus=");
        stringBuilder.append(this.g);
        stringBuilder.append(", mContentType='");
        stringBuilder.append(this.h);
        stringBuilder.append('\'');
        stringBuilder.append(", mCreateTime=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mCURL='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
