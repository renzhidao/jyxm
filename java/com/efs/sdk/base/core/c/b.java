package com.efs.sdk.base.core.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.config.a.c;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends Handler {
    private static final Map<String, Long> a = new HashMap<String, Long>() {
        {
            put("flow_5min", Long.valueOf(300000));
            put("flow_hour", Long.valueOf(3600000));
            put("flow_day", Long.valueOf(86400000));
        }
    };
    private static final Map<String, Long> b = new HashMap<String, Long>() {
        {
            Long valueOf = Long.valueOf(1048576);
            put("flow_5min", valueOf);
            put("flow_hour", valueOf);
            put("flow_day", Long.valueOf(2097152));
        }
    };
    private Map<String, AtomicInteger> c;
    private volatile SharedPreferences d;
    private volatile Editor e;
    private Context f;
    private String g;

    public static class a {
        private static final b a = new b();
    }

    private b() {
        super(com.efs.sdk.base.core.util.concurrent.a.a.getLooper());
        this.c = new ConcurrentHashMap(5);
        this.f = ControllerCenter.getGlobalEnvStruct().mAppContext;
        this.g = ControllerCenter.getGlobalEnvStruct().getAppid();
        b();
        File c = com.efs.sdk.base.core.util.a.c(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (c.exists()) {
            com.efs.sdk.base.core.util.b.b(c);
        }
    }

    public /* synthetic */ b(byte b) {
        this();
    }

    private static long a(Map<String, String> map, @NonNull String str, @NonNull String str2) {
        long longValue = ((Long) b.get(str)).longValue();
        if (map == null || !map.containsKey(str2) || TextUtils.isEmpty((CharSequence) map.get(str2))) {
            return longValue;
        }
        try {
            longValue = Long.parseLong((String) map.get(str2));
            return longValue;
        } catch (Throwable th) {
            Log.w("efs.flow", "get max flow error", th);
            return longValue;
        }
    }

    public static b a() {
        return a.a;
    }

    private static List<String> a(String str, String str2, String str3) {
        StringBuilder stringBuilder;
        List arrayList = new ArrayList();
        arrayList.add(str);
        String str4 = "_";
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str4);
            stringBuilder.append(str2);
            arrayList.add(stringBuilder.toString());
        }
        if (!(TextUtils.isEmpty(str3) || "unknown".equalsIgnoreCase(str3))) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str4);
            stringBuilder.append(str3);
            arrayList.add(stringBuilder.toString());
        }
        if (!(TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3))) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str4);
            stringBuilder.append(str2);
            stringBuilder.append(str4);
            stringBuilder.append(str3);
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }

    private void a(String str) {
        if (!this.c.containsKey(str) || this.c.get(str) == null || ((AtomicInteger) this.c.get(str)).get() <= 10) {
            com.efs.sdk.base.core.f.f.a.a.a(c.a().d.a, str);
            if (str.equals("flow_day")) {
                com.efs.sdk.base.core.f.f.a.a.a(c.a().d.a);
            }
            if (!this.c.containsKey(str)) {
                this.c.put(str, new AtomicInteger());
            }
            ((AtomicInteger) this.c.get(str)).incrementAndGet();
        }
    }

    private boolean a(@NonNull String str, long j, @NonNull String str2, @NonNull String str3, long j2) {
        String str4 = str;
        long j3 = j2;
        b();
        boolean z = false;
        String str5 = "efs.flow";
        if (this.d == null) {
            Log.w(str5, "sharedpreferences is null, cann't get last flow stat");
            return false;
        }
        List<String> a = a(str4, str2, str3);
        Map c = c.a().c();
        for (String str6 : a) {
            if (Math.abs(System.currentTimeMillis() - this.d.getLong("curr_time_".concat(String.valueOf(str)), System.currentTimeMillis())) > j) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = str4;
                obtain.arg1 = Long.valueOf(j).intValue();
                sendMessage(obtain);
            }
            long a2 = a(c, str4, str6);
            long j4 = this.d.getLong(str6, 0);
            if (j4 + j3 > a2) {
                StringBuilder stringBuilder = new StringBuilder("flow limit, key: ");
                stringBuilder.append(str6);
                stringBuilder.append(", max: ");
                stringBuilder.append(a2);
                stringBuilder.append(", now: ");
                stringBuilder.append(j4);
                stringBuilder.append(", size: ");
                stringBuilder.append(j3);
                Log.i(str5, stringBuilder.toString());
                a(str6);
                break;
            }
        }
        z = true;
        return z;
    }

    private void b() {
        try {
            c();
        } catch (Throwable th) {
            Log.e("efs.flow", "init sharedpreferences error", th);
        }
    }

    private void c() {
        if (this.d == null) {
            synchronized (b.class) {
                if (this.d == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.g.toLowerCase());
                    stringBuilder.append("_flow");
                    this.d = SharedPreferencesUtils.getSharedPreferences(this.f, stringBuilder.toString());
                }
            }
        }
        if (this.e == null) {
            synchronized (b.class) {
                if (this.e == null) {
                    this.e = this.d.edit();
                }
            }
        }
    }

    public final boolean a(@NonNull String str, long j) {
        String a = com.efs.sdk.base.core.config.b.a.a.a();
        boolean z = true;
        for (Entry entry : a.entrySet()) {
            z = a((String) entry.getKey(), ((Long) entry.getValue()).longValue(), str, a, j);
            if (!z) {
                break;
            }
        }
        return z;
    }

    public void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        int i = message.what;
        String str = "curr_time_";
        String str2 = "efs.flow";
        String valueOf;
        String a;
        if (i == 0) {
            b();
            if (this.d == null) {
                Log.w(str2, "sharedpreferences is null, cann't get last flow stat");
            } else if (this.e == null) {
                Log.w(str2, "sharedpreferences editor is null, cann't refresh flow stat");
            } else {
                valueOf = String.valueOf(message.obj);
                long j = (long) message.arg1;
                a = com.efs.sdk.base.core.config.b.a.a.a();
                for (String str3 : a.keySet()) {
                    String concat = str.concat(String.valueOf(str3));
                    if (!this.d.contains(concat)) {
                        this.e.putLong(concat, System.currentTimeMillis());
                    }
                    for (String concat2 : a(str3, valueOf, a)) {
                        this.e.putLong(concat2, this.d.getLong(concat2, 0) + j);
                    }
                }
                this.e.apply();
            }
        } else if (i != 1) {
            StringBuilder stringBuilder = new StringBuilder("flow stat listener not support action '");
            stringBuilder.append(message.what);
            stringBuilder.append("'");
            Log.w(str2, stringBuilder.toString());
        } else {
            valueOf = String.valueOf(message.obj);
            long j2 = (long) message.arg1;
            b();
            if (this.d == null) {
                Log.w(str2, "sharedpreferences is null, cann't get last refresh timestamp");
            } else if (this.e == null) {
                Log.w(str2, "sharedpreferences editor is null, cann't refresh timestamp");
            } else {
                a = str.concat(valueOf);
                if (Math.abs(System.currentTimeMillis() - this.d.getLong(a, System.currentTimeMillis())) >= j2) {
                    for (String str22 : this.d.getAll().keySet()) {
                        if (str22.startsWith(valueOf)) {
                            this.e.putLong(str22, 0);
                        }
                    }
                    this.e.putLong(a, System.currentTimeMillis());
                    this.e.apply();
                    this.c.clear();
                }
            }
        }
    }
}
