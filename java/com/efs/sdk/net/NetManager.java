package com.efs.sdk.net;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import java.util.Map;
import l0.b;
import q0.f;
import q0.p.c;
import q0.v;
import q0.w;
import q0.w.a;
import q0.y;
import u0.e;

public class NetManager {
    private static final String TAG = "OkHttpManager";
    private static NetConfigManager mNetConfigManager;
    private static EfsReporter mReporter;

    public static void get(String str, f fVar) {
        a aVar = new a();
        c cVar = OkHttpListener.get();
        b.x(cVar, "eventListenerFactory");
        aVar.e = cVar;
        aVar.d.add(new OkHttpInterceptor());
        w wVar = new w(aVar);
        y.a aVar2 = new y.a();
        aVar2.e(str);
        new e(wVar, aVar2.a(), false).e(fVar);
    }

    public static NetConfigManager getNetConfigManager() {
        return mNetConfigManager;
    }

    public static EfsReporter getReporter() {
        return mReporter;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            Log.e(TAG, "init net manager error! parameter is null!");
            return;
        }
        mReporter = efsReporter;
        mNetConfigManager = new NetConfigManager(context, efsReporter);
    }

    public static void post(String str, Map<String, Object> map, f fVar) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : map.keySet()) {
            stringBuilder.append(str2);
            stringBuilder.append("=");
            stringBuilder.append(map.get(str2));
            stringBuilder.append("&");
        }
        a aVar = new a();
        c cVar = OkHttpListener.get();
        b.x(cVar, "eventListenerFactory");
        aVar.e = cVar;
        aVar.d.add(new OkHttpInterceptor());
        w wVar = new w(aVar);
        c1.c y = c1.c.y(v.c.b("application/x-www-form-urlencoded"), stringBuilder.toString());
        y.a aVar2 = new y.a();
        aVar2.e(str);
        aVar2.d("POST", y);
        new e(wVar, aVar2.a(), false).e(fVar);
    }
}
