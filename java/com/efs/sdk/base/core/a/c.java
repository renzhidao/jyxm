package com.efs.sdk.base.core.a;

import android.text.TextUtils;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.EfsConstant;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.PackageUtil;
import com.efs.sdk.base.core.util.b.a;
import com.efs.sdk.base.core.util.b.b;
import com.umeng.analytics.pro.am;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

public final class c {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public byte g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public long m = 0;

    public static c a() {
        c cVar = new c();
        cVar.a = ControllerCenter.getGlobalEnvStruct().getAppid();
        cVar.b = ControllerCenter.getGlobalEnvStruct().getSecret();
        cVar.l = ControllerCenter.getGlobalEnvStruct().getUid();
        cVar.j = BuildConfig.VERSION_NAME;
        cVar.c = PackageUtil.getAppVersionName(ControllerCenter.getGlobalEnvStruct().mAppContext);
        cVar.i = String.valueOf(com.efs.sdk.base.core.config.a.c.a().d.a);
        cVar.k = EfsConstant.UM_SDK_VERSION;
        return cVar;
    }

    public final String b() {
        a.a();
        String valueOf = String.valueOf(a.b() / 1000);
        String a = b.a(a.a(androidx.activity.a.k(new StringBuilder(), this.l, valueOf), this.b));
        TreeMap treeMap = new TreeMap();
        treeMap.put("app", this.a);
        treeMap.put("sd", a);
        if (!TextUtils.isEmpty(this.d)) {
            treeMap.put("cp", this.d);
        }
        if (this.g != (byte) 0) {
            treeMap.put("de", String.valueOf(this.e));
            treeMap.put("type", this.h);
            Object obj = this.f;
            if (TextUtils.isEmpty(obj)) {
                a.a();
                long b = a.b();
                obj = String.format(Locale.SIMPLIFIED_CHINESE, "%d%04d", new Object[]{Long.valueOf(b), Integer.valueOf(new Random(b).nextInt(10000))});
            }
            treeMap.put("seq", obj);
        }
        treeMap.put("cver", this.i);
        treeMap.put(am.x, "android");
        treeMap.put("sver", this.i);
        treeMap.put("tm", valueOf);
        treeMap.put("ver", this.c);
        treeMap.put("um_sdk_ver", this.k);
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (Entry entry : treeMap.entrySet()) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append((String) entry.getKey());
            stringBuilder3.append("=");
            stringBuilder3.append((String) entry.getValue());
            String stringBuilder4 = stringBuilder3.toString();
            stringBuilder2.append(stringBuilder4);
            stringBuilder.append(stringBuilder4);
            stringBuilder.append("&");
        }
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(stringBuilder2.toString());
        stringBuilder5.append(this.b);
        a = b.a(stringBuilder5.toString());
        stringBuilder.append("sign=");
        stringBuilder.append(a);
        Log.d("efs.config", stringBuilder.toString());
        return b.b(stringBuilder.toString());
    }
}
