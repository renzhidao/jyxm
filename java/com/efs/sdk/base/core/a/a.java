package com.efs.sdk.base.core.a;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.a.d;
import com.efs.sdk.base.http.HttpResponse;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a {
    private static volatile long b = -1;
    public boolean a;

    public static class a {
        private static final a a = new a();
    }

    private a() {
        this.a = true;
    }

    public /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return a.a;
    }

    public static String a(@NonNull String str, @NonNull c cVar) {
        byte b = cVar.g;
        String str2 = b != (byte) 1 ? b != (byte) 2 ? b != (byte) 3 ? "/api/v1/raw/upload" : "/api/v1/mix/upload" : "/perf_upload" : "/apm_logs";
        return androidx.activity.a.h(str, str2);
    }

    public static void a(@Nullable HttpResponse httpResponse) {
        String str = "cver";
        if (httpResponse != null && httpResponse.succ && !TextUtils.isEmpty(httpResponse.data)) {
            try {
                JSONObject jSONObject = new JSONObject(httpResponse.data);
                String optString = jSONObject.optString("code", "-1");
                httpResponse.setBizCode(optString);
                if (!"0".equals(optString)) {
                    httpResponse.succ = false;
                }
                if (jSONObject.has(str)) {
                    ((Map) httpResponse.extra).put(str, jSONObject.getString(str));
                }
                long j = jSONObject.getLong("stm") * 1000;
                if (Math.abs(j - b()) > 1500000) {
                    b = j - SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                Log.e("efs.px.api", "checkPxReturn error", th);
            }
        }
    }

    public static long b() {
        return b == -1 ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + b;
    }

    @NonNull
    public final HttpResponse a(String str, c cVar, File file, boolean z) {
        String b = cVar.b();
        str = a(str, cVar);
        if (this.a) {
            Log.i("efs.px.api", "Upload file, url is ".concat(String.valueOf(str)));
        }
        Map hashMap = new HashMap(1);
        hashMap.put("wpk-header", b);
        d a = new d(str).a(hashMap);
        a.a.d = file;
        a = a.a("type", cVar.h);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cVar.m);
        String stringBuilder2 = stringBuilder.toString();
        return a.a("size", stringBuilder2).a("flow_limit", Boolean.toString(z)).a(d.a()).a().b();
    }
}
