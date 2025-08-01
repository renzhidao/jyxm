package com.efs.sdk.base.core.e;

import com.efs.sdk.base.core.d.b;

public final class d {
    public a a;

    /* renamed from: com.efs.sdk.base.core.e.d$1 */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ b a;

        public AnonymousClass1(b bVar) {
            this.a = bVar;
        }

        public final void run() {
            d.this.a.a(this.a);
        }
    }

    public static class a {
        private static final d a = new d();
    }

    private d() {
        this.a = new c();
    }

    public /* synthetic */ d(byte b) {
        this();
    }
}
