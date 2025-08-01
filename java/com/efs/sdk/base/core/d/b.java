package com.efs.sdk.base.core.d;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;

public final class b {
    public a a;
    public c b = new c();
    public byte[] c;
    public File d;

    public b(String str, byte b) {
        this.a = new a(str, b);
    }

    public static b a(ILogProtocol iLogProtocol) {
        Throwable e;
        String str = "efs.base";
        b bVar = null;
        try {
            b bVar2 = new b(iLogProtocol.getLogType(), iLogProtocol.getLogProtocol());
            try {
                int bodyType = iLogProtocol.getBodyType();
                if (bodyType == 0) {
                    bVar2.b(0);
                    bVar2.a(iLogProtocol.generate());
                    return bVar2;
                } else if (bodyType != 1) {
                    StringBuilder stringBuilder = new StringBuilder("Can not support body type: ");
                    stringBuilder.append(iLogProtocol.getBodyType());
                    Log.w(str, stringBuilder.toString());
                    return bVar2;
                } else {
                    bVar2.b(1);
                    bVar2.d = new File(iLogProtocol.getFilePath());
                    return bVar2;
                }
            } catch (Exception e2) {
                e = e2;
                bVar = bVar2;
                Log.e(str, "log send error", e);
                return bVar;
            }
        } catch (Exception e3) {
            e = e3;
            Log.e(str, "log send error", e);
            return bVar;
        }
    }

    private void d() {
        a aVar = this.a;
        int i = aVar.c;
        if (i == 0) {
            byte[] bArr = this.c;
            if (bArr != null) {
                aVar.f = (long) bArr.length;
                return;
            }
        }
        if (i == 1 && this.d.exists()) {
            this.a.f = this.d.length();
        }
    }

    public final long a() {
        d();
        return this.a.f;
    }

    public final void a(int i) {
        this.a.e = i;
        d();
    }

    public final void a(String str) {
        this.a.d = str;
    }

    public final void a(byte[] bArr) {
        this.c = bArr;
        d();
    }

    public final void b(int i) {
        this.a.c = i;
    }

    public final boolean b() {
        return !Constants.CP_NONE.equals(this.a.d);
    }

    public final void c() {
        this.b.a = true;
    }
}
