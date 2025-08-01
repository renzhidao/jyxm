package com.efs.sdk.net.a.a;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class a extends FilterOutputStream {
    private long a;

    public a(OutputStream outputStream) {
        super(outputStream);
    }

    public final void write(int i) {
        this.out.write(i);
        this.a++;
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.a += (long) i2;
    }
}
