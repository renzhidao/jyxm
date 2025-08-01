package com.efs.sdk.base.core.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

public class NetworkUtil {
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String NETWORK_CLASS_2G = "2g";
    public static final String NETWORK_CLASS_3G = "3g";
    public static final String NETWORK_CLASS_4G = "4g";
    public static final String NETWORK_CLASS_5G = "5g";
    public static final String NETWORK_CLASS_DENIED = "denied";
    public static final String NETWORK_CLASS_DISCONNECTED = "disconnected";
    public static final String NETWORK_CLASS_UNKNOWN = "unknown";
    public static final String NETWORK_TYPE_WIFI = "wifi";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";

    /* DevToolsApp WARNING: Missing block: B:7:0x002b, code:
            if (((java.lang.Integer) java.lang.Class.forName("android.content.Context").getMethod("checkSelfPermission", new java.lang.Class[]{java.lang.String.class}).invoke(r6, new java.lang.Object[]{r7})).intValue() == 0) goto L_0x003c;
     */
    /* DevToolsApp WARNING: Missing block: B:9:0x003a, code:
            if (r6.getPackageManager().checkPermission(r7, r6.getPackageName()) == 0) goto L_0x003c;
     */
    public static boolean checkPermission(android.content.Context r6, java.lang.String r7) {
        /*
        r0 = 0;
        if (r6 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 23;
        r3 = 1;
        if (r1 < r2) goto L_0x002e;
    L_0x000b:
        r1 = "android.content.Context";
        r1 = java.lang.Class.forName(r1);	 Catch:{ all -> 0x003d }
        r2 = "checkSelfPermission";
        r4 = new java.lang.Class[r3];	 Catch:{ all -> 0x003d }
        r5 = java.lang.String.class;
        r4[r0] = r5;	 Catch:{ all -> 0x003d }
        r1 = r1.getMethod(r2, r4);	 Catch:{ all -> 0x003d }
        r2 = new java.lang.Object[r3];	 Catch:{ all -> 0x003d }
        r2[r0] = r7;	 Catch:{ all -> 0x003d }
        r6 = r1.invoke(r6, r2);	 Catch:{ all -> 0x003d }
        r6 = (java.lang.Integer) r6;	 Catch:{ all -> 0x003d }
        r6 = r6.intValue();	 Catch:{ all -> 0x003d }
        if (r6 != 0) goto L_0x003d;
    L_0x002d:
        goto L_0x003c;
    L_0x002e:
        r1 = r6.getPackageManager();
        r6 = r6.getPackageName();
        r6 = r1.checkPermission(r7, r6);
        if (r6 != 0) goto L_0x003d;
    L_0x003c:
        r0 = 1;
    L_0x003d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.core.util.NetworkUtil.checkPermission(android.content.Context, java.lang.String):boolean");
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        String str = "efs.base";
        NetworkInfo networkInfo = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                Log.w(str, "get CONNECTIVITY_SERVICE is null");
                return null;
            }
            networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null || !networkInfo.isConnected()) {
                NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
                if (allNetworkInfo != null) {
                    int i = 0;
                    while (i < allNetworkInfo.length) {
                        if (allNetworkInfo[i] != null && allNetworkInfo[i].isConnected()) {
                            networkInfo = allNetworkInfo[i];
                            break;
                        }
                        i++;
                    }
                }
            }
            return networkInfo;
        } catch (Throwable th) {
            Log.e(str, "get network info error", th);
        }
    }

    public static String[] getNetworkAccessMode(Context context) {
        String str = "";
        String[] strArr = new String[]{str, str};
        if (context == null) {
            return strArr;
        }
        try {
            if (checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    strArr[0] = str;
                    return strArr;
                }
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (networkInfo == null || networkInfo.getState() != State.CONNECTED) {
                    NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                    if (networkInfo2 != null && networkInfo2.getState() == State.CONNECTED) {
                        strArr[0] = "2G/3G";
                        strArr[1] = networkInfo2.getSubtypeName();
                    }
                } else {
                    strArr[0] = "Wi-Fi";
                    return strArr;
                }
            }
            strArr[0] = str;
            return strArr;
        } catch (Throwable unused) {
            return strArr;
        }
    }

    public static String getNetworkType(Context context) {
        if (isRejectAccessNetworkState(context)) {
            return NETWORK_CLASS_DENIED;
        }
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null) {
            return NETWORK_CLASS_DISCONNECTED;
        }
        if (activeNetworkInfo.getType() == 1) {
            return NETWORK_TYPE_WIFI;
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype == 20) {
            return NETWORK_CLASS_5G;
        }
        String str = NETWORK_CLASS_3G;
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return NETWORK_CLASS_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return str;
            case 13:
                return NETWORK_CLASS_4G;
            default:
                String subtypeName = activeNetworkInfo.getSubtypeName();
                return TextUtils.isEmpty(subtypeName) ? "unknown" : (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? str : subtypeName;
        }
    }

    public static int getNetworkTypeUmeng(Context context) {
        try {
            return checkPermission(context, "android.permission.READ_PHONE_STATE") ? ((TelephonyManager) context.getSystemService("phone")).getNetworkType() : 0;
        } catch (Exception unused) {
            return -100;
        }
    }

    public static boolean hasAccessNetworkState(Context context) {
        try {
            if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                return true;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isConnected(Context context) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == State.CONNECTED;
    }

    public static boolean isRejectAccessNetworkState(Context context) {
        return !hasAccessNetworkState(context);
    }

    public static boolean isWifi(Context context) {
        if (isRejectAccessNetworkState(context)) {
            return false;
        }
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }
}
