package com.efs.sdk.base.core.util.concurrent;

import androidx.annotation.NonNull;
import com.efs.sdk.base.core.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d<T> implements Runnable {
    private List<b<T>> a = new ArrayList(5);
    private c<T> b;

    public d(@NonNull c<T> cVar) {
        this.b = cVar;
    }

    public final T a() {
        T t = null;
        Iterator it;
        try {
            it = this.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            t = this.b.a();
            for (b a : this.a) {
                a.a(this.b, t);
            }
            for (b a2 : this.a) {
                a2.result(t);
            }
        } catch (Throwable th) {
            Log.w("efs.util.concurrent", th);
            it = this.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        return t;
    }

    public final void a(@NonNull List<b<T>> list) {
        this.a.addAll(list);
    }

    public void run() {
        a();
    }
}
