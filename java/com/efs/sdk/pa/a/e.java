package com.efs.sdk.pa.a;

import android.os.SystemClock;
import android.util.Printer;
import java.util.Iterator;
import java.util.Vector;

final class e implements Printer {
    public Vector<d> a = new Vector();
    private boolean b = false;
    private String c = null;
    private long d = -1;
    private long e = -1;
    private long f;

    public final void println(String str) {
        Iterator it;
        if (str.startsWith(">")) {
            this.d = SystemClock.elapsedRealtime();
            this.e = SystemClock.currentThreadTimeMillis();
            this.c = str;
            this.b = true;
            it = this.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        if (this.b && str.startsWith("<")) {
            this.b = false;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
            if (elapsedRealtime > this.f) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.e;
                it = this.a.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(this.c, elapsedRealtime, currentThreadTimeMillis);
                }
            }
        }
    }
}
