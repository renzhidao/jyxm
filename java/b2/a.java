package b2;

import q1.g.j;

public final class a {

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    /* DevToolsApp WARNING: Missing block: B:10:0x0021, code:
            throw new q1.g.j("File is too short");
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x0022, code:
            r2.reset();
     */
    public static int a(java.io.InputStream r2) {
        /*
        r0 = r2.markSupported();
        if (r0 == 0) goto L_0x0026;
    L_0x0006:
        r0 = 44;
        r2.mark(r0);
        r0 = new byte[r0];
        i.a.b(r2, r0);	 Catch:{ EOFException -> 0x001a }
        r2.reset();
        r2 = b(r0);
        return r2;
    L_0x0018:
        r0 = move-exception;
        goto L_0x0022;
    L_0x001a:
        r0 = new q1.g$j;	 Catch:{ all -> 0x0018 }
        r1 = "File is too short";
        r0.<init>(r1);	 Catch:{ all -> 0x0018 }
        throw r0;	 Catch:{ all -> 0x0018 }
    L_0x0022:
        r2.reset();
        throw r0;
    L_0x0026:
        r2 = new java.lang.IllegalArgumentException;
        r0 = "InputStream must support mark";
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a.a(java.io.InputStream):int");
    }

    public static int b(byte[] bArr) {
        int O = l0.b.O(bArr);
        if (O == -1) {
            StringBuilder stringBuilder = new StringBuilder("Not a valid dex magic value:");
            for (int i = 0; i < 8; i++) {
                stringBuilder.append(String.format(" %02x", new Object[]{Byte.valueOf(bArr[i])}));
            }
            throw new j(stringBuilder.toString());
        }
        if ((l0.b.X(O) != -1 ? 1 : null) != null) {
            int i2 = (bArr[43] << 24) | ((((bArr[41] & 255) << 8) | (bArr[40] & 255)) | ((bArr[42] & 255) << 16));
            if (i2 == 2018915346) {
                throw new b("Big endian dex files are not supported");
            } else if (i2 == 305419896) {
                return O;
            } else {
                throw new a(String.format("Invalid endian tag: 0x%x", new Object[]{Integer.valueOf(i2)}));
            }
        }
        throw new b(String.format("Dex version %03d is not supported", new Object[]{Integer.valueOf(O)}));
    }
}
