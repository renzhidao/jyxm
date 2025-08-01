package com.efs.sdk.h5pagesdk;

import android.util.Log;
import android.webkit.JavascriptInterface;

public class UApmJSBridge {
    @JavascriptInterface
    public String getLaunchOptionsSync() {
        String str = "";
        try {
            String str2 = "getLaunchOptionsSync";
            if (H5Manager.getH5ConfigMananger() != null) {
                String generateLaunchOptions = H5Manager.getH5ConfigMananger().generateLaunchOptions();
                if (H5Manager.isDebug) {
                    Log.d(str2, generateLaunchOptions);
                }
                return generateLaunchOptions;
            } else if (H5Manager.isDebug) {
                Log.d(str2, "H5Manager.getH5ConfigMananger() is null.");
            }
        } catch (Throwable unused) {
            return str;
        }
    }

    @JavascriptInterface
    public void sendData(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (H5Manager.isDebug) {
                        Log.d("sendData", str);
                    }
                    if (H5Manager.getH5ConfigMananger() != null) {
                        H5Manager.getH5ConfigMananger().sendData(str);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
