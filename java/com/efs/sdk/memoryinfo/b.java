package com.efs.sdk.memoryinfo;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;

final class b {
    public final EfsReporter a;
    public boolean b = false;
    public final Context mContext;

    /* renamed from: com.efs.sdk.memoryinfo.b$2 */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ Handler f;
        public final /* synthetic */ long i;
        public final /* synthetic */ int j;
        public final /* synthetic */ e k;
        public final /* synthetic */ String l;
        public final /* synthetic */ int m;

        public AnonymousClass2(long j, int i, Handler handler, e eVar, String str, int i2) {
            this.i = j;
            this.j = i;
            this.f = handler;
            this.k = eVar;
            this.l = str;
            this.m = i2;
        }

        public final void run() {
            if (SystemClock.elapsedRealtime() - this.i > ((long) (this.j * 1000))) {
                this.f.sendEmptyMessage(1);
                return;
            }
            try {
                b.a(b.this, this.k, this.l);
            } catch (Throwable th) {
                f.a("collect ", th);
            }
            this.f.postDelayed(this, (long) (this.m * 1000));
        }
    }

    public b(Context context, EfsReporter efsReporter) {
        this.mContext = context.getApplicationContext();
        this.a = efsReporter;
    }

    public static /* synthetic */ void a(b bVar, e eVar, String str) {
        c cVar = new c(bVar.mContext);
        EfsJSONLog efsJSONLog = new EfsJSONLog("memperf");
        efsJSONLog.put("w_pgid", str);
        efsJSONLog.put("crver", "0.0.2.umeng");
        efsJSONLog.put("k_st", cVar.bg);
        efsJSONLog.put("w_url", cVar.activity);
        efsJSONLog.put("wl_tpss", Long.valueOf(cVar.n));
        efsJSONLog.put("wl_jpss", Long.valueOf(cVar.o));
        efsJSONLog.put("wl_npss", Long.valueOf(cVar.p));
        efsJSONLog.put("wl_heap", Long.valueOf(cVar.q));
        efsJSONLog.put("wf_heap_used_rate", Float.valueOf(cVar.r));
        efsJSONLog.put("wl_graphics", Long.valueOf(cVar.s));
        efsJSONLog.put("wl_vmsize", Long.valueOf(cVar.t));
        synchronized (e.class) {
            if (eVar.C) {
                eVar.a(efsJSONLog);
            } else {
                eVar.B.add(efsJSONLog);
            }
        }
    }
}
