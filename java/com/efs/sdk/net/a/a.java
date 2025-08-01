package com.efs.sdk.net.a;

import java.util.HashMap;

public final class a {
    private static a c;
    private HashMap<String, b> a;
    private HashMap<String, c> b;

    private a() {
        b();
    }

    public static a a() {
        if (c == null) {
            c = new a();
        }
        return c;
    }

    private void b() {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.clear();
    }

    public final b a(String str) {
        if (this.a == null) {
            b();
        }
        b bVar = (b) this.a.get(str);
        if (bVar != null) {
            return bVar;
        }
        bVar = new b();
        bVar.a = str;
        bVar.b = System.currentTimeMillis();
        this.a.put(str, bVar);
        return bVar;
    }

    public final void b(String str) {
        HashMap hashMap = this.a;
        if (hashMap != null && hashMap.containsKey(str)) {
            this.a.remove(str);
        }
    }

    public final c c(String str) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        if (this.b.containsKey(str)) {
            return (c) this.b.get(str);
        }
        c cVar = new c();
        cVar.A = str;
        cVar.C = System.currentTimeMillis();
        this.b.put(str, cVar);
        return cVar;
    }

    public final void d(String str) {
        HashMap hashMap = this.b;
        if (hashMap != null && hashMap.containsKey(str)) {
            this.b.remove(str);
        }
    }
}
