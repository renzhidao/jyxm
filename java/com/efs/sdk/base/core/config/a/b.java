package com.efs.sdk.base.core.config.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.controller.ControllerCenter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class b {
    public int a = -1;
    public String b = "https://";
    public String c = "errnewlog.umeng.com";
    public long d = 480;
    public Map<String, Double> e = new HashMap();
    public Map<String, String> f = new HashMap();
    private Boolean g = null;

    private b() {
    }

    public static b a() {
        b bVar = new b();
        bVar.c = ControllerCenter.getGlobalEnvStruct().isIntl() ? "errnewlogos.umeng.com" : "errnewlog.umeng.com";
        return bVar;
    }

    public final void a(@NonNull Map<String, String> map) {
        String str = "updateInteval";
        String str2 = "gate_way";
        if (map.containsKey(str2)) {
            str2 = (String) map.get(str2);
            if (!TextUtils.isEmpty(str2)) {
                this.c = str2;
            }
        }
        str2 = "gate_way_https";
        if (map.containsKey(str2)) {
            str2 = (String) map.get(str2);
            if (!TextUtils.isEmpty(str2)) {
                this.b = Boolean.parseBoolean(str2) ? "https://" : "http://";
            }
        }
        try {
            if (map.containsKey(str)) {
                str = (String) map.get(str);
                if (!TextUtils.isEmpty(str)) {
                    this.d = Long.parseLong(str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Map hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            CharSequence charSequence = "data_sampling_rate_";
            CharSequence charSequence2 = "file_sampling_rate_";
            if (str3.startsWith(charSequence) || str3.startsWith(charSequence2)) {
                CharSequence charSequence3 = "";
                str3 = str3.replace(charSequence, charSequence3).replace(charSequence2, charSequence3);
                double d = 100.0d;
                try {
                    d = Double.parseDouble((String) entry.getValue());
                } catch (Throwable unused) {
                    hashMap.put(str3, Double.valueOf(d));
                }
            }
        }
        this.e = hashMap;
        this.f = map;
    }
}
