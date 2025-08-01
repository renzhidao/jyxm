package com.efs.sdk.base.core.c;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.core.b.a.b;
import com.efs.sdk.base.core.b.f;
import com.efs.sdk.base.core.b.h;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.e;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public final class d extends Handler {
    public int a;
    public c b;
    private c c;
    private List<String> d;
    private AtomicInteger e;
    private f f;

    public static class a {
        private static final d a = new d();
    }

    private d() {
        super(com.efs.sdk.base.core.util.concurrent.a.a.getLooper());
        this.a = 5;
        this.d = new ArrayList();
        this.e = new AtomicInteger(0);
        this.b = new a();
        this.c = new e();
        this.f = new h();
    }

    public /* synthetic */ d(byte b) {
        this();
    }

    public static d a() {
        return a.a;
    }

    public final void a(Object obj, int i) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = obj;
        obtain.arg1 = i;
        sendMessage(obtain);
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (com.efs.sdk.base.core.c.f.a.a.a()) {
            int i = message.what;
            String str = "efs.send_log";
            if (i == 0) {
                String a = com.efs.sdk.base.core.config.b.a.a.a();
                if (NetworkUtil.NETWORK_CLASS_DENIED.equalsIgnoreCase(a) || NetworkUtil.NETWORK_CLASS_DISCONNECTED.equalsIgnoreCase(a)) {
                    Log.i(str, "log cann't be send because net status is ".concat(String.valueOf(a)));
                    sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendIntervalMills());
                } else {
                    List emptyList = Collections.emptyList();
                    try {
                        File file;
                        com.efs.sdk.base.core.b.a a2 = b.a;
                        int i2 = this.a;
                        f fVar = this.f;
                        a2.a();
                        a2.a();
                        File f = com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
                        List list;
                        if (f.exists()) {
                            int size;
                            List d = com.efs.sdk.base.core.util.b.d(f);
                            if (a2.b) {
                                com.efs.sdk.base.core.f.f a3 = com.efs.sdk.base.core.f.f.a.a;
                                size = d.size();
                                if (a3.b != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                                    ILogProtocol bVar = new com.efs.sdk.base.core.f.b("efs_core", "log_lag", a3.a.c);
                                    bVar.put("cnt", Integer.valueOf(size));
                                    a3.b.send(bVar);
                                }
                                a2.b = false;
                            }
                            Collections.sort(d, a2.d);
                            ArrayList arrayList = new ArrayList(i2);
                            for (size = d.size() - 1; size >= 0 && arrayList.size() < i2; size--) {
                                file = (File) d.get(size);
                                if (file.exists() && (fVar == null || !fVar.a(file))) {
                                    arrayList.add(file);
                                }
                            }
                            list = arrayList;
                        } else {
                            list = Collections.emptyList();
                        }
                        ArrayList arrayList2 = new ArrayList(i2);
                        for (File file2 : list) {
                            com.efs.sdk.base.core.d.b a4 = a2.a(file2);
                            if (a4 == null) {
                                StringBuilder stringBuilder = new StringBuilder("file upload error, name is ");
                                stringBuilder.append(file2.getName());
                                Log.w("efs.cache", stringBuilder.toString());
                            } else {
                                arrayList2.add(a4);
                            }
                        }
                        emptyList = arrayList2;
                    } catch (Throwable unused) {
                        for (com.efs.sdk.base.core.d.b bVar2 : emptyList) {
                            String str2 = "wa";
                            if (str2.equals(bVar2.a.a) || b.a().a(bVar2.a.a, bVar2.a())) {
                                c cVar = this.b;
                                if (str2.equals(bVar2.a.a)) {
                                    cVar = this.c;
                                }
                                str2 = UUID.randomUUID().toString();
                                this.d.add(str2);
                                if (WorkThreadUtil.submit(new e(bVar2, cVar, str2)) == null) {
                                    a(str2, -1);
                                }
                            }
                        }
                        if (this.d.size() <= 0) {
                            sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendIntervalMills());
                        }
                    }
                }
            } else if (i == 1) {
                Object obj = message.obj;
                if (obj != null) {
                    this.d.remove(obj.toString());
                }
                int incrementAndGet = message.arg1 != 0 ? this.e.incrementAndGet() : 0;
                if (this.d.isEmpty()) {
                    if (incrementAndGet < 5) {
                        sendEmptyMessage(0);
                        return;
                    }
                    this.e.set(0);
                    sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendDelayMills());
                    Log.i(str, "request error cnt gt 5, next request delay 10s");
                }
            }
        }
    }
}
