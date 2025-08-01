package com.efs.sdk.base.core.config.a;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

public final class c implements Callback {
    public static final Random a = new Random();
    public IConfigRefreshAction b;
    public boolean c;
    public b d;
    public Map<IConfigCallback, String[]> e;
    private Handler f;
    private e g;
    private long h;

    public static class a {
        private static final c a = new c();
    }

    private c() {
        this.c = true;
        this.e = new HashMap();
        this.f = new Handler(com.efs.sdk.base.core.util.concurrent.a.a.getLooper(), this);
        this.g = new e();
        this.d = b.a();
        this.h = ControllerCenter.getGlobalEnvStruct().configRefreshDelayMills;
    }

    public /* synthetic */ c(byte b) {
        this();
    }

    public static c a() {
        return a.a;
    }

    private boolean a(b bVar) {
        if (this.d.a >= bVar.a) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder("current config version (");
        stringBuilder.append(this.d.a);
        stringBuilder.append(") is older than another (");
        stringBuilder.append(bVar.a);
        stringBuilder.append(")");
        Log.i("efs.config", stringBuilder.toString());
        return false;
    }

    private void e() {
        String str;
        String str2 = "efs.config";
        if (!com.efs.sdk.base.core.c.f.a.a.a()) {
            str = "has no permission to refresh config from remote";
        } else if (this.c) {
            str = g().refresh();
            Log.i(str2, "from server. efs config is ".concat(String.valueOf(str)));
            if (!TextUtils.isEmpty(str)) {
                a(str);
                return;
            }
            return;
        } else {
            str = "disable refresh config from remote";
        }
        Log.i(str2, str);
    }

    private void f() {
        boolean a;
        try {
            a = this.g.a(this.d);
        } catch (Throwable unused) {
            a = false;
        }
        if (!a) {
            this.f.sendEmptyMessageDelayed(3, 3000);
        }
    }

    @NonNull
    private IConfigRefreshAction g() {
        IConfigRefreshAction iConfigRefreshAction = this.b;
        return iConfigRefreshAction == null ? a.a() : iConfigRefreshAction;
    }

    /* DevToolsApp ERROR: DevToolsAppRE in pass: o00Ooo
        g.d.a.b.DevToolsAppRE: Exception block dominator not found, method:com.efs.sdk.base.core.config.a.c.h():boolean, dom blocks: []
        	at OooOO0O.OooO0O0.OooO0o.OooO0oO.o000O0Oo.o00Ooo.OooO0o(SourceFile:112)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o0000o(SourceFile:3)
        	at OooOO0O.OooO0O0.OooO0o.OooO0oO.o00000O.accept(SourceFile:1)
        	at OooO0oo.OooO00o.OooO00o.OooO0OO.OooOoOO.Oooo0.OooO00o(SourceFile:2)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o0000o0o(SourceFile:5)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o00oO0O(SourceFile:11)
        	at OooOO0O.OooO0O0.OooO00o.accept(SourceFile:1)
        	at OooO0oo.OooO00o.OooO00o.OooO0OO.OooOoOO.Oooo0.OooO00o(SourceFile:2)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o00oO0O(SourceFile:17)
        	at OooOO0O.OooO00o.OooO00o.run(SourceFile:8)
        */
    private boolean h() {
        /*
        r6 = this;
        com.efs.sdk.base.core.config.a.e.b();
        r0 = 0;
        r2 = r6.g;	 Catch:{ all -> 0x0018 }
        r2.c();	 Catch:{ all -> 0x0018 }
        r3 = r2.a;	 Catch:{ all -> 0x0018 }
        if (r3 != 0) goto L_0x000f;	 Catch:{ all -> 0x0018 }
    L_0x000e:
        goto L_0x0019;	 Catch:{ all -> 0x0018 }
    L_0x000f:
        r2 = r2.a;	 Catch:{ all -> 0x0018 }
        r3 = "last_refresh_time";	 Catch:{ all -> 0x0018 }
        r0 = r2.getLong(r3, r0);	 Catch:{ all -> 0x0018 }
        goto L_0x0019;
    L_0x0019:
        r2 = java.lang.System.currentTimeMillis();
        r2 = r2 - r0;
        r0 = r6.d;
        r0 = r0.d;
        r4 = 60;
        r0 = r0 * r4;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 * r4;
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 < 0) goto L_0x0030;
    L_0x002e:
        r0 = 1;
        return r0;
    L_0x0030:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.core.config.a.c.h():boolean");
    }

    private void i() {
        try {
            for (ValueCallback valueCallback : ControllerCenter.getGlobalEnvStruct().getCallback(1)) {
                Message obtain = Message.obtain(null, 1, new JSONObject(this.d.f).toString());
                Message obtain2 = Message.obtain();
                valueCallback.onReceiveValue(new Pair(obtain, obtain2));
                obtain.recycle();
                obtain2.recycle();
            }
            for (IEfsReporterObserver onConfigChange : ControllerCenter.getGlobalEnvStruct().getEfsReporterObservers()) {
                onConfigChange.onConfigChange();
            }
        } catch (Throwable th) {
            Log.e("efs.config", th);
        }
    }

    public final String a(boolean z) {
        StringBuilder stringBuilder;
        if (z) {
            stringBuilder = new StringBuilder("https://");
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.d.b);
        }
        stringBuilder.append(this.d.c);
        return stringBuilder.toString();
    }

    public final void a(int i) {
        if (i <= this.d.a) {
            StringBuilder stringBuilder = new StringBuilder("current config version is ");
            stringBuilder.append(i);
            stringBuilder.append(", no need to refresh");
            Log.i("efs.config", stringBuilder.toString());
            return;
        }
        Message obtain = Message.obtain();
        obtain.arg1 = i;
        obtain.what = 1;
        this.f.sendMessage(obtain);
    }

    public final void a(String str) {
        b a = b.a();
        if (!d.a(str, a)) {
            this.f.sendEmptyMessageDelayed(1, 3000);
        } else if (!a(a)) {
            this.d = a;
            f();
            i();
            d();
        }
    }

    public final void b() {
        this.f.sendEmptyMessage(0);
        this.f.sendEmptyMessageDelayed(2, this.h);
    }

    public final Map<String, String> c() {
        return new HashMap(this.d.f);
    }

    public final void d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : c.this.e.keySet()) {
                        String[] strArr = (String[]) c.this.e.get(iConfigCallback);
                        Map hashMap = new HashMap();
                        if (!(strArr == null || strArr.length == 0)) {
                            for (String str : strArr) {
                                if (c.this.d.f.containsKey(str)) {
                                    hashMap.put(str, c.this.c().get(str));
                                    StringBuilder stringBuilder = new StringBuilder("--->>> configCallback key is ");
                                    stringBuilder.append(str);
                                    stringBuilder.append(" ## value is ");
                                    stringBuilder.append((String) c.this.c().get(str));
                                    Log.i("efs.config", stringBuilder.toString());
                                }
                            }
                        }
                        iConfigCallback.onChange(hashMap);
                    }
                    c.this.e.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    public final boolean handleMessage(@NonNull Message message) {
        String stringBuilder;
        int i = message.what;
        String str = "efs.config";
        if (i != 0) {
            if (i == 1) {
                int i2 = message.arg1;
                if (i2 <= this.d.a) {
                    StringBuilder stringBuilder2 = new StringBuilder("current config version is ");
                    stringBuilder2.append(i2);
                    String str2 = ", no need to refresh";
                    stringBuilder2.append(str2);
                    Log.i(str, stringBuilder2.toString());
                    stringBuilder2 = new StringBuilder("current config version(");
                    stringBuilder2.append(this.d.a);
                    stringBuilder2.append(") is ");
                    stringBuilder2.append(i2);
                    stringBuilder2.append(str2);
                    stringBuilder = stringBuilder2.toString();
                } else {
                    e();
                }
            } else if (i == 2) {
                try {
                    if (com.efs.sdk.base.core.c.f.a.a.a()) {
                        if (h()) {
                            e();
                        } else {
                            Log.i(str, "No update is required, less than 8h since the last update");
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else if (i == 3) {
                f();
            }
            return true;
        }
        boolean a = e.a();
        Log.i(str, "delete old config is ".concat(String.valueOf(a)));
        if (a) {
            this.f.sendEmptyMessage(1);
            return true;
        }
        b bVar;
        e eVar = this.g;
        eVar.c();
        if (eVar.a == null) {
            bVar = null;
        } else {
            b a2 = b.a();
            a2.a = eVar.a.getInt("cver", -1);
            Set<String> keySet = eVar.a.getAll().keySet();
            Map hashMap = new HashMap();
            for (String str3 : keySet) {
                CharSequence string = eVar.a.getString(str3, "");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str3, string);
                }
            }
            a2.a(hashMap);
            bVar = a2;
        }
        if (bVar == null) {
            stringBuilder = "first load local config false.";
        } else if (a(bVar)) {
            stringBuilder = "current config to same.";
        } else {
            this.d = bVar;
            if (-1 != bVar.a) {
                i();
                d();
                stringBuilder = "load config from storage and notify observer";
            } else {
                stringBuilder = "load config from storage";
            }
        }
        Log.i(str, stringBuilder);
        return true;
    }
}
