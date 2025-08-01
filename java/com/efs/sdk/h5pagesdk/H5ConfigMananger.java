package com.efs.sdk.h5pagesdk;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.protocol.ILogProtocol;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import java.util.Map;
import org.json.JSONObject;

public class H5ConfigMananger {
    private final String TAG = "H5ConfigMananger";
    private final int a = 0;
    private EfsReporter b;
    private int c = 0;
    private boolean d = false;
    private Context mContext;

    public H5ConfigMananger(Context context, EfsReporter efsReporter) {
        this.mContext = context;
        this.b = efsReporter;
        efsReporter.getAllSdkConfig(new String[]{"apm_native_h5perf_sampling_rate"}, new IConfigCallback() {
            public final void onChange(Map<String, Object> map) {
                try {
                    Object obj = map.get("apm_native_h5perf_sampling_rate");
                    if (obj != null) {
                        H5ConfigMananger.this.c = Integer.parseInt(obj.toString());
                        H5ConfigMananger h5ConfigMananger = H5ConfigMananger.this;
                        h5ConfigMananger.d = H5ConfigMananger.a(h5ConfigMananger.c);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public String generateLaunchOptions() {
        if (this.d || IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sample", this.c);
                jSONObject.put("sampleResult", this.d ? "Y" : "N");
                Context context = this.mContext;
                if (context != null) {
                    jSONObject.put("appName", context.getApplicationInfo().packageName);
                }
                jSONObject.put("bridgeVersion", 1);
            } catch (Throwable e) {
                e.printStackTrace();
            }
            return jSONObject.toString();
        }
        if (H5Manager.isDebug) {
            Log.e("H5ConfigMananger", "采样未命中，并且不处于集成测试模式");
        }
        return "";
    }

    public boolean isH5TracerEnable() {
        return this.d;
    }

    public void sendData(final String str) {
        if (this.d || IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            a.execute(new Runnable() {
                public final void run() {
                    if (H5ConfigMananger.this.b != null) {
                        ILogProtocol efsJSONLog = new EfsJSONLog("nativeh5perf");
                        efsJSONLog.put("wk_native_h5log", str);
                        H5ConfigMananger.this.b.send(efsJSONLog);
                    }
                }
            });
        }
    }
}
