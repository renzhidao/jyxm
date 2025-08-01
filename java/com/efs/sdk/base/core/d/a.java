package com.efs.sdk.base.core.d;

import com.efs.sdk.base.Constants;

public final class a {
    public String a;
    public byte b = (byte) 2;
    public int c = 0;
    public String d = Constants.CP_NONE;
    public int e = 1;
    public long f = 0;
    public int g = 1;

    public a(String str, byte b) {
        this.a = str;
        if (b <= (byte) 0 || (byte) 3 < b) {
            throw new IllegalArgumentException("log protocol flag invalid : ".concat(String.valueOf(b)));
        } else {
            this.b = b;
        }
    }
}
