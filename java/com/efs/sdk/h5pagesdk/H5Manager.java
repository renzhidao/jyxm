package com.efs.sdk.h5pagesdk;

import android.content.Context;
import android.view.View;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;

public class H5Manager {
    public static final String TAG = "H5Manager";
    private static EfsReporter g = null;
    private static H5ConfigMananger h = null;
    public static boolean isDebug = true;

    public static H5ConfigMananger getH5ConfigMananger() {
        return h;
    }

    public static EfsReporter getReporter() {
        return g;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            Log.e(TAG, "init H5 manager error! parameter is null!");
            return;
        }
        g = efsReporter;
        h = new H5ConfigMananger(context, efsReporter);
    }

    public static void setWebView(View view) {
        String str = TAG;
        if (view != null) {
            H5ConfigMananger h5ConfigMananger = h;
            if (h5ConfigMananger != null) {
                if (h5ConfigMananger.isH5TracerEnable() || IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                    UApmJSBridge uApmJSBridge = new UApmJSBridge();
                    String str2 = "UAPM_JSBridge";
                    Class cls;
                    try {
                        cls = view.getClass();
                        Object invoke = cls.getMethod("getSettings", new Class[0]).invoke(view, new Object[0]);
                        if (invoke != null) {
                            invoke.getClass().getMethod("setJavaScriptEnabled", new Class[]{Boolean.TYPE}).invoke(invoke, new Object[]{Boolean.TRUE});
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                if (isDebug) {
                    StringBuilder stringBuilder = new StringBuilder("未注入JavascriptInterface：H5命中状态=");
                    stringBuilder.append(h.isH5TracerEnable());
                    stringBuilder.append("; 集成测试状态=");
                    stringBuilder.append(IntegrationTestingUtil.isIntegrationTestingInPeriod());
                    Log.d(str, stringBuilder.toString());
                    return;
                }
            }
        }
        if (isDebug) {
            Log.e(str, "webView为null，或H5功能未初始化完成");
        }
    }
}
