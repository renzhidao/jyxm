package com.efs.sdk.base;

import android.app.Application;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.b.a.b;
import com.efs.sdk.base.core.b.e;
import com.efs.sdk.base.core.c.d;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.config.a.c;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.a;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EfsReporter {
    private static ControllerCenter sControllerCenter;

    public static class Builder {
        private static Map<String, EfsReporter> sInstanceMap = new ConcurrentHashMap();
        private static boolean sUseAppContext = true;
        private final String TAG;
        private GlobalEnvStruct mGlobalEnvStruct;

        public interface IPublicParams {
            Map<String, String> getRecordHeaders();
        }

        public Builder(@NonNull Application application, @NonNull String str, @NonNull String str2) {
            this(application.getApplicationContext(), str, str2);
        }

        public Builder(@NonNull Context context, @NonNull String str, @NonNull String str2) {
            this.TAG = "efs.reporter.builder";
            context = checkContext(context);
            if (TextUtils.isEmpty(str)) {
                throw new RuntimeException("EfsReporter init, appid is empty");
            } else if (TextUtils.isEmpty(str2)) {
                throw new RuntimeException("EfsReporter init, secret is empty");
            } else {
                GlobalEnvStruct globalEnvStruct = new GlobalEnvStruct();
                this.mGlobalEnvStruct = globalEnvStruct;
                globalEnvStruct.mAppContext = context;
                globalEnvStruct.setAppid(str);
                this.mGlobalEnvStruct.setSecret(str2);
            }
        }

        private static Context checkContext(Context context) {
            if (context != null) {
                if (sUseAppContext && !(context instanceof Application)) {
                    context = context.getApplicationContext();
                    if (context == null || !(context instanceof Application)) {
                        String str = "Can not get Application context from given context!";
                        Log.e(str);
                        throw new IllegalArgumentException(str);
                    }
                }
                return context;
            }
            Log.e("context can not be null!");
            throw null;
        }

        private void checkParam(String str) {
            GlobalEnvStruct access$100 = ((EfsReporter) sInstanceMap.get(str)).getGlobalEnvStruct();
            if (!access$100.mAppContext.equals(getGlobalEnvStruct().mAppContext)) {
                throw new RuntimeException("efs-core: duplicate init, but application context is different");
            } else if (!TextUtils.isEmpty(access$100.getSecret()) && !access$100.getSecret().equals(getGlobalEnvStruct().getSecret())) {
                throw new RuntimeException("efs-core: duplicate init, but secret is different");
            } else if (access$100.isIntl() == getGlobalEnvStruct().isIntl()) {
                if (!(TextUtils.isEmpty(getGlobalEnvStruct().getUid()) || getGlobalEnvStruct().getUid().equals(access$100.getUid()))) {
                    Log.w("efs.reporter.builder", "efs-core: duplicate init, but  uid is different");
                }
                if (getGlobalEnvStruct().getPublicParamMap() != null && getGlobalEnvStruct().getPublicParamMap().size() > 0) {
                    access$100.addPublicParams(getGlobalEnvStruct().getPublicParamMap());
                }
            } else {
                throw new RuntimeException("efs-core: duplicate init, but intl setting is different");
            }
        }

        public Builder addEfsReporterObserver(IEfsReporterObserver iEfsReporterObserver) {
            this.mGlobalEnvStruct.addConfigObserver(iEfsReporterObserver);
            return this;
        }

        public EfsReporter build() {
            String appid = getGlobalEnvStruct().getAppid();
            if (!sInstanceMap.containsKey(appid)) {
                synchronized (EfsReporter.class) {
                    if (!sInstanceMap.containsKey(appid)) {
                        EfsReporter efsReporter = new EfsReporter(this);
                        sInstanceMap.put(appid, efsReporter);
                        return efsReporter;
                    }
                }
            }
            Log.w("efs.reporter.builder", "efs-core: duplicate init");
            checkParam(appid);
            return (EfsReporter) sInstanceMap.get(appid);
        }

        public Builder configRefreshAction(@NonNull IConfigRefreshAction iConfigRefreshAction) {
            c.a().b = iConfigRefreshAction;
            return this;
        }

        public Builder configRefreshDelayMills(long j) {
            this.mGlobalEnvStruct.configRefreshDelayMills = j;
            return this;
        }

        public Builder debug(boolean z) {
            this.mGlobalEnvStruct.setDebug(z);
            return this;
        }

        public Builder efsDirRootName(String str) {
            a.a(str);
            return this;
        }

        public Builder enableSendLog(boolean z) {
            this.mGlobalEnvStruct.setEnableSendLog(z);
            return this;
        }

        public Builder enableWaStat(boolean z) {
            this.mGlobalEnvStruct.setEnableWaStat(z);
            return this;
        }

        public GlobalEnvStruct getGlobalEnvStruct() {
            return this.mGlobalEnvStruct;
        }

        public Builder intl(boolean z) {
            this.mGlobalEnvStruct.setIsIntl(z);
            return this;
        }

        public Builder logEncryptAction(ILogEncryptAction iLogEncryptAction) {
            this.mGlobalEnvStruct.setLogEncryptAction(iLogEncryptAction);
            return this;
        }

        public Builder maxConcurrentUploadCnt(int i) {
            d.a().a = i;
            return this;
        }

        public Builder printLogDetail(boolean z) {
            this.mGlobalEnvStruct.setPrintLogDetail(z);
            return this;
        }

        public Builder publicParams(@NonNull IPublicParams iPublicParams) {
            if (iPublicParams.getRecordHeaders() != null && iPublicParams.getRecordHeaders().size() > 0) {
                this.mGlobalEnvStruct.addPublicParams(iPublicParams.getRecordHeaders());
            }
            return this;
        }

        public Builder publicParams(@NonNull Map<String, String> map) {
            if (map.size() > 0) {
                this.mGlobalEnvStruct.addPublicParams(map);
            }
            return this;
        }

        public Builder uid(String str) {
            this.mGlobalEnvStruct.setUid(str);
            return this;
        }
    }

    private EfsReporter(Builder builder) {
        sControllerCenter = new ControllerCenter(builder);
    }

    @NonNull
    private GlobalEnvStruct getGlobalEnvStruct() {
        return ControllerCenter.getGlobalEnvStruct();
    }

    public void addPublicParams(@NonNull Map<String, String> map) {
        if (map.size() > 0) {
            getGlobalEnvStruct().addPublicParams(map);
        }
    }

    public void flushRecordLogImmediately(String str) {
        e a = b.a.c.a((byte) 1);
        if (a != null) {
            a.a(str);
        }
    }

    public Map<String, String> getAllConfig() {
        return c.a().c();
    }

    public Map<String, Object> getAllSdkConfig() {
        return new HashMap(c.a().d.f);
    }

    public void getAllSdkConfig(String[] strArr, IConfigCallback iConfigCallback) {
        c a = c.a();
        a.e.put(iConfigCallback, strArr);
        if (!a.d.f.isEmpty()) {
            a.d();
        }
    }

    public void refreshConfig(String str) {
        c.a().a(str);
    }

    public void registerCallback(int i, ValueCallback<Pair<Message, Message>> valueCallback) {
        getGlobalEnvStruct().registerCallback(i, valueCallback);
    }

    public void send(ILogProtocol iLogProtocol) {
        sControllerCenter.send(iLogProtocol);
    }

    public HttpResponse sendSyncImediatelly(String str, int i, String str2, File file) {
        return sendSyncImediatelly(str, i, str2, true, file);
    }

    public HttpResponse sendSyncImediatelly(String str, int i, String str2, boolean z, File file) {
        return sControllerCenter.sendSyncImmediately(str, i, str2, z, file);
    }

    public void setEnableRefreshConfigFromRemote(boolean z) {
        c.a().c = z;
    }
}
