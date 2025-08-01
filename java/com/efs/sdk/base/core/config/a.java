package com.efs.sdk.base.core.config;

import android.text.TextUtils;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {
    private Map<String, Object> a = new ConcurrentHashMap();

    public final List<AbsSection> a(String str) {
        String str2 = UMCrash.KEY_HEADER_NETWORK_TYPE;
        String str3 = UMCrash.KEY_HEADER_ACCESS_SUBTYPE;
        String str4 = UMCrash.KEY_HEADER_ACCESS;
        List arrayList = new ArrayList();
        KVSection kVSection = new KVSection("global_head");
        String str5 = "appid";
        KVSection put = kVSection.put("type", str).put(str5, this.a.get(str5));
        str5 = "wid";
        put = put.put(str5, this.a.get(str5));
        str5 = "pid";
        put = put.put(str5, this.a.get(str5));
        str5 = "pkg";
        put = put.put(str5, this.a.get(str5));
        str5 = "ver";
        put = put.put(str5, this.a.get(str5));
        str5 = "vcode";
        put = put.put(str5, this.a.get(str5));
        str5 = "ps";
        put = put.put(str5, this.a.get(str5));
        str5 = "stime";
        put = put.put(str5, this.a.get(str5));
        com.efs.sdk.base.core.a.a.a();
        put = put.put("ctime", Long.valueOf(com.efs.sdk.base.core.a.a.b() / 1000));
        com.efs.sdk.base.core.a.a.a();
        put = put.put("w_tm", Long.valueOf(com.efs.sdk.base.core.a.a.b() / 1000));
        str5 = "sdk_ver";
        put.put(str5, this.a.get(str5));
        str = "uid";
        CharSequence valueOf = String.valueOf(b(str, ""));
        if (!TextUtils.isEmpty(valueOf)) {
            kVSection.put(str, valueOf);
        }
        arrayList.add(kVSection);
        put = new KVSection("device_info");
        String str6 = "lang";
        str5 = "brand";
        kVSection = put.put(str6, this.a.get(str6)).put(str5, this.a.get(str5));
        str5 = "model";
        kVSection = kVSection.put(str5, this.a.get(str5));
        str5 = "build_model";
        kVSection = kVSection.put(str5, this.a.get(str5));
        str5 = "rom";
        kVSection = kVSection.put(str5, this.a.get(str5));
        str5 = "sdk";
        kVSection = kVSection.put(str5, this.a.get(str5));
        str5 = "dsp_h";
        kVSection = kVSection.put(str5, this.a.get(str5));
        str5 = "dsp_w";
        kVSection.put(str5, this.a.get(str5)).put("tzone", this.a.get("tzone")).put("net", this.a.get("net")).put("fr", this.a.get("fr"));
        try {
            if (this.a.containsKey(str4)) {
                put.put(str4, this.a.get(str4));
            }
            if (this.a.containsKey(str3)) {
                put.put(str3, this.a.get(str3));
            }
            if (this.a.containsKey(str2)) {
                put.put(str2, this.a.get(str2));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        arrayList.add(put);
        return arrayList;
    }

    public final Map<String, Object> a() {
        Map hashMap = new HashMap(this.a);
        com.efs.sdk.base.core.a.a.a();
        hashMap.put("ctime", Long.valueOf(com.efs.sdk.base.core.a.a.b() / 1000));
        com.efs.sdk.base.core.a.a.a();
        hashMap.put("w_tm", Long.valueOf(com.efs.sdk.base.core.a.a.b() / 1000));
        return hashMap;
    }

    public final void a(String str, Object obj) {
        if (obj != null) {
            this.a.put(str, obj);
        }
    }

    public final Object b(String str, Object obj) {
        Object obj2 = this.a.get(str);
        return (obj2 != null || this.a.containsKey(str)) ? obj2 : obj;
    }
}
