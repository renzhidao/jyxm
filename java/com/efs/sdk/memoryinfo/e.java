package com.efs.sdk.memoryinfo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class e {
    public final List<EfsJSONLog> B = new ArrayList();
    public volatile boolean C;
    private final EfsReporter a;

    public e(final Context context, EfsReporter efsReporter) {
        this.a = efsReporter;
        CharSequence uMId = UMUtils.getUMId(context);
        this.C = TextUtils.isEmpty(uMId) ^ true;
        if (this.C) {
            Map hashMap = new HashMap(1);
            hashMap.put(UMCrash.KEY_HEADER_UMID, uMId);
            efsReporter.addPublicParams(hashMap);
            return;
        }
        ImprintHandler.getImprintService(context).registImprintCallback(am.g, new UMImprintChangeCallback() {
            public final void onImprintValueChanged(String str, String str2) {
                try {
                    if (am.g.equals(str)) {
                        Map hashMap = new HashMap(1);
                        hashMap.put(UMCrash.KEY_HEADER_UMID, str2);
                        e.this.a.addPublicParams(hashMap);
                        synchronized (e.class) {
                            e.this.C = true;
                        }
                        for (EfsJSONLog a : e.this.B) {
                            e.this.a(a);
                        }
                        StringBuilder stringBuilder = new StringBuilder("send cache:");
                        stringBuilder.append(e.this.B.size());
                        str = stringBuilder.toString();
                        if (a.DEBUG) {
                            Log.d("MemoryCollect", str);
                        }
                        e.this.B.clear();
                        ImprintHandler.getImprintService(context).unregistImprintCallback(am.g, this);
                    }
                } catch (Throwable th) {
                    f.a("umid ", th);
                }
            }
        });
    }

    public final void a(EfsJSONLog efsJSONLog) {
        try {
            this.a.send(efsJSONLog);
        } catch (Throwable th) {
            f.a("send", th);
        }
    }
}
