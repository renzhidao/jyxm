package com.efs.sdk.base.core.controller;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.EfsReporter.Builder;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.config.b;
import com.efs.sdk.base.core.controller.a.a;
import com.efs.sdk.base.core.e.d;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;

public class ControllerCenter implements Callback {
    private static GlobalEnvStruct h;
    private int a = 0;
    private final int b = 0;
    private final int c = 1;
    private final int d = 2;
    private final int e = 3;
    private volatile boolean f = false;
    private a g;
    private Handler i;

    public ControllerCenter(Builder builder) {
        h = builder.getGlobalEnvStruct();
        Handler handler = new Handler(com.efs.sdk.base.core.util.concurrent.a.a.getLooper(), this);
        this.i = handler;
        handler.sendEmptyMessage(0);
    }

    private void a() {
        if (this.g == null) {
            this.g = new a();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            h.mAppContext.registerReceiver(this.g, intentFilter);
        } catch (Throwable th) {
            Log.w("efs.base", "register network change receiver error", th);
            int i = this.a + 1;
            this.a = i;
            if (i < 3) {
                this.i.sendEmptyMessageDelayed(3, 6000);
            }
        }
    }

    public static /* synthetic */ void a(ILogProtocol iLogProtocol) {
        for (ValueCallback valueCallback : getGlobalEnvStruct().getCallback(9)) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("log_type", iLogProtocol.getLogType());
            hashMap.put("log_data", iLogProtocol.generateString());
            hashMap.put("link_key", iLogProtocol.getLinkKey());
            hashMap.put("link_id", iLogProtocol.getLinkId());
            Message obtain = Message.obtain(null, 9, hashMap);
            Message obtain2 = Message.obtain();
            valueCallback.onReceiveValue(new Pair(obtain, obtain2));
            obtain.recycle();
            obtain2.recycle();
        }
    }

    private void b(final ILogProtocol iLogProtocol) {
        if (iLogProtocol != null) {
            WorkThreadUtil.submit(new Runnable() {
                public final void run() {
                    try {
                        iLogProtocol.insertGlobal(b.a.a.a);
                        if (!"wa".equalsIgnoreCase(iLogProtocol.getLogType())) {
                            ControllerCenter.a(iLogProtocol);
                        }
                        if (ControllerCenter.getGlobalEnvStruct().isEnableSendLog()) {
                            WorkThreadUtil.submit(new com.efs.sdk.base.core.e.d.AnonymousClass1(com.efs.sdk.base.core.d.b.a(iLogProtocol)));
                        }
                    } catch (Throwable th) {
                        Log.e("efs.base", "log send error", th);
                    }
                }
            });
        }
    }

    @NonNull
    public static GlobalEnvStruct getGlobalEnvStruct() {
        return h;
    }

    /* DevToolsApp WARNING: Removed duplicated region for block: B:33:0x01a9 A:{Catch:{ all -> 0x01c4 }} */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:40:0x01ea  */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:39:0x01e3  */
    public boolean handleMessage(@androidx.annotation.NonNull android.os.Message r8) {
        /*
        r7 = this;
        r0 = "2G/3G";
        r1 = r8.what;
        r2 = 1;
        if (r1 == 0) goto L_0x0022;
    L_0x0007:
        if (r1 == r2) goto L_0x0013;
    L_0x0009:
        r8 = 3;
        if (r1 == r8) goto L_0x000e;
    L_0x000c:
        goto L_0x0230;
    L_0x000e:
        r7.a();
        goto L_0x0230;
    L_0x0013:
        r8 = r8.obj;
        if (r8 == 0) goto L_0x0230;
    L_0x0017:
        r0 = r8 instanceof com.efs.sdk.base.protocol.ILogProtocol;
        if (r0 == 0) goto L_0x0230;
    L_0x001b:
        r8 = (com.efs.sdk.base.protocol.ILogProtocol) r8;
        r7.b(r8);
        goto L_0x0230;
    L_0x0022:
        r8 = com.efs.sdk.base.core.config.b.a.a;
        r1 = new com.efs.sdk.base.core.config.a;
        r1.<init>();
        r8.a = r1;
        r3 = getGlobalEnvStruct();
        r3 = r3.getAppid();
        r4 = "appid";
        r1.a(r4, r3);
        r1 = com.efs.sdk.base.core.util.ProcessUtil.myPid();
        r3 = r8.a;
        r4 = java.lang.Integer.valueOf(r1);
        r5 = "pid";
        r3.a(r5, r4);
        r3 = r8.a;
        r1 = com.efs.sdk.base.core.util.ProcessUtil.getProcessName(r1);
        r4 = "ps";
        r3.a(r4, r1);
        r1 = r8.b;
        r1 = com.efs.sdk.base.core.util.d.a(r1);
        r3 = r8.a;
        r4 = "wid";
        r3.a(r4, r1);
        r3 = getGlobalEnvStruct();
        r3 = r3.getUid();
        r3 = android.text.TextUtils.isEmpty(r3);
        r4 = "uid";
        if (r3 == 0) goto L_0x0077;
    L_0x0071:
        r3 = r8.a;
        r3.a(r4, r1);
        goto L_0x0084;
    L_0x0077:
        r1 = r8.a;
        r3 = getGlobalEnvStruct();
        r3 = r3.getUid();
        r1.a(r4, r3);
    L_0x0084:
        r1 = r8.a;
        com.efs.sdk.base.core.a.a.a();
        r3 = com.efs.sdk.base.core.a.a.b();
        r5 = android.os.Process.getElapsedCpuTime();
        r3 = r3 - r5;
        r3 = java.lang.Long.valueOf(r3);
        r4 = "stime";
        r1.a(r4, r3);
        r1 = r8.a;
        r3 = r8.b;
        r3 = com.efs.sdk.base.core.util.PackageUtil.getPackageName(r3);
        r4 = "pkg";
        r1.a(r4, r3);
        r1 = r8.a;
        r3 = r8.b;
        r3 = com.efs.sdk.base.core.util.PackageUtil.getAppVersionName(r3);
        r4 = "ver";
        r1.a(r4, r3);
        r1 = r8.a;
        r3 = r8.b;
        r3 = com.efs.sdk.base.core.util.PackageUtil.getAppVersionCode(r3);
        r4 = "vcode";
        r1.a(r4, r3);
        r1 = r8.a;
        r3 = "sdk_ver";
        r4 = "1.3.10.umeng";
        r1.a(r3, r4);
        r1 = r8.a;
        r3 = android.os.Build.BRAND;
        r3 = r3.toLowerCase();
        r4 = "brand";
        r1.a(r4, r3);
        r1 = r8.a;
        r3 = android.os.Build.MODEL;
        if (r3 != 0) goto L_0x00e1;
    L_0x00de:
        r3 = "unknown";
        goto L_0x00f5;
    L_0x00e1:
        r3 = android.os.Build.MODEL;
        r4 = " ";
        r5 = "-";
        r3 = r3.replace(r4, r5);
        r4 = "_";
        r3 = r3.replace(r4, r5);
        r3 = r3.toLowerCase();
    L_0x00f5:
        r4 = "model";
        r1.a(r4, r3);
        r1 = r8.a;
        r3 = android.os.Build.MODEL;
        r4 = "build_model";
        r1.a(r4, r3);
        r1 = r8.b;
        r1 = r1.getResources();
        r1 = r1.getDisplayMetrics();
        r3 = r8.a;
        r4 = r1.widthPixels;
        r4 = java.lang.Integer.valueOf(r4);
        r5 = "dsp_w";
        r3.a(r5, r4);
        r3 = r8.a;
        r1 = r1.heightPixels;
        r1 = java.lang.Integer.valueOf(r1);
        r4 = "dsp_h";
        r3.a(r4, r1);
        r1 = r8.a;
        r3 = "fr";
        r4 = "android";
        r1.a(r3, r4);
        r1 = r8.a;
        r3 = android.os.Build.VERSION.RELEASE;
        r4 = "rom";
        r1.a(r4, r3);
        r1 = r8.a;
        r3 = android.os.Build.VERSION.SDK_INT;
        r3 = java.lang.Integer.valueOf(r3);
        r4 = "sdk";
        r1.a(r4, r3);
        r1 = r8.a;
        r3 = java.util.Locale.getDefault();
        r3 = r3.getLanguage();
        r4 = "lang";
        r1.a(r4, r3);
        r1 = r8.a;
        r3 = java.util.TimeZone.getDefault();
        r3 = r3.getID();
        r4 = "tzone";
        r1.a(r4, r3);
        r1 = r8.a;
        r3 = r8.b;
        r3 = com.efs.sdk.base.core.util.NetworkUtil.getNetworkType(r3);
        r4 = "net";
        r1.a(r4, r3);
        r1 = 0;
        r3 = r8.b;	 Catch:{ all -> 0x01c4 }
        r3 = com.efs.sdk.base.core.util.NetworkUtil.getNetworkAccessMode(r3);	 Catch:{ all -> 0x01c4 }
        r4 = "Wi-Fi";
        r5 = r3[r1];	 Catch:{ all -> 0x01c4 }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x01c4 }
        r5 = "um_access";
        if (r4 == 0) goto L_0x018c;
    L_0x0184:
        r0 = r8.a;	 Catch:{ all -> 0x01c4 }
        r4 = "wifi";
    L_0x0188:
        r0.a(r5, r4);	 Catch:{ all -> 0x01c4 }
        goto L_0x019f;
    L_0x018c:
        r4 = r3[r1];	 Catch:{ all -> 0x01c4 }
        r4 = r0.equals(r4);	 Catch:{ all -> 0x01c4 }
        if (r4 == 0) goto L_0x019a;
    L_0x0194:
        r4 = r8.a;	 Catch:{ all -> 0x01c4 }
        r4.a(r5, r0);	 Catch:{ all -> 0x01c4 }
        goto L_0x019f;
    L_0x019a:
        r0 = r8.a;	 Catch:{ all -> 0x01c4 }
        r4 = "unknow";
        goto L_0x0188;
    L_0x019f:
        r0 = "";
        r4 = r3[r2];	 Catch:{ all -> 0x01c4 }
        r0 = r0.equals(r4);	 Catch:{ all -> 0x01c4 }
        if (r0 != 0) goto L_0x01b2;
    L_0x01a9:
        r0 = r8.a;	 Catch:{ all -> 0x01c4 }
        r4 = "um_access_subtype";
        r3 = r3[r2];	 Catch:{ all -> 0x01c4 }
        r0.a(r4, r3);	 Catch:{ all -> 0x01c4 }
    L_0x01b2:
        r0 = r8.a;	 Catch:{ all -> 0x01c4 }
        r3 = "um_network_type";
        r8 = r8.b;	 Catch:{ all -> 0x01c4 }
        r8 = com.efs.sdk.base.core.util.NetworkUtil.getNetworkTypeUmeng(r8);	 Catch:{ all -> 0x01c4 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x01c4 }
        r0.a(r3, r8);	 Catch:{ all -> 0x01c4 }
        goto L_0x01c8;
    L_0x01c4:
        r8 = move-exception;
        r8.printStackTrace();
    L_0x01c8:
        com.efs.sdk.base.core.c.f.a.a;
        r8 = com.efs.sdk.base.core.config.a.c.a();
        r8.b();
        r7.a();
        r8 = com.efs.sdk.base.core.f.f.a.a;
        r0 = h;
        r0 = r0.isIntl();
        r3 = r8.a;
        if (r0 == 0) goto L_0x01ea;
    L_0x01e3:
        r0 = "https://errnewlogos.umeng.com/api/crashsdk/logcollect";
        r3.a = r0;
        r0 = "4ea4e41a3993";
        goto L_0x01f0;
    L_0x01ea:
        r0 = "https://errnewlog.umeng.com/api/crashsdk/logcollect";
        r3.a = r0;
        r0 = "28ef1713347d";
    L_0x01f0:
        r3.b = r0;
        r8.b = r7;
        r0 = r8.c;
        r0.a = r7;
        r8 = r8.d;
        r8.a = r7;
        r7.f = r2;
        r8 = com.efs.sdk.base.core.c.d.a();
        r0 = h;
        r3 = r0.getLogSendDelayMills();
        r8.sendEmptyMessageDelayed(r1, r3);
        r8 = com.efs.sdk.base.core.f.f.a.a;
        r0 = r8.b;
        if (r0 == 0) goto L_0x0230;
    L_0x0213:
        r0 = getGlobalEnvStruct();
        r0 = r0.isEnableWaStat();
        if (r0 != 0) goto L_0x021e;
    L_0x021d:
        goto L_0x0230;
    L_0x021e:
        r0 = new com.efs.sdk.base.core.f.b;
        r1 = r8.a;
        r1 = r1.c;
        r3 = "efs_core";
        r4 = "pvuv";
        r0.<init>(r3, r4, r1);
        r8 = r8.b;
        r8.send(r0);
    L_0x0230:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.core.controller.ControllerCenter.handleMessage(android.os.Message):boolean");
    }

    public void send(ILogProtocol iLogProtocol) {
        if (this.f) {
            b(iLogProtocol);
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = iLogProtocol;
        this.i.sendMessage(obtain);
    }

    @Nullable
    public HttpResponse sendSyncImmediately(String str, int i, String str2, boolean z, File file) {
        com.efs.sdk.base.core.d.b bVar = new com.efs.sdk.base.core.d.b(str, (byte) 2);
        bVar.b(1);
        bVar.d = file;
        bVar.a(str2);
        bVar.a(i);
        bVar.b.b = z;
        bVar.c();
        d.a.a.a.a(bVar);
        return bVar.b.c;
    }
}
