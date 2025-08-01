package com.efs.sdk.launch;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;

public class LaunchManager {
    public static final String APP_ATTACH_BASE_CONTEXT = "app_attachBaseContext";
    public static final String APP_CONSTRUCT = "app_<init>";
    public static final String APP_ON_CREATE = "app_onCreate";
    public static final String PAGE_ON_CREATE = "page_onCreate";
    public static final String PAGE_ON_RESUME = "page_onResume";
    public static final String PAGE_ON_RE_START = "page_onReStart";
    public static final String PAGE_ON_START = "page_onStart";
    public static final String PAGE_ON_STOP = "page_onStop";
    public static final String PAGE_ON_WINDOW = "page_on_window";
    private static LaunchConfigManager a = null;
    private static Context b = null;
    private static EfsReporter c = null;
    private static boolean d = false;
    public static boolean isDebug = true;

    public static LaunchConfigManager getLaunchConfigManager() {
        return a;
    }

    public static EfsReporter getReporter() {
        return c;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        String str = "LaunchManager";
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    Log.e(str, "init launch manager error! parameter is null!");
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        final Context applicationContext = context.getApplicationContext();
        if (!c.e(applicationContext)) {
            if (isDebug) {
                Log.e(str, "Non main process !");
            }
        } else if (isInit()) {
            if (isDebug) {
                Log.e(str, "invalid init ！");
            }
        } else {
            b = context.getApplicationContext();
            c = efsReporter;
            a = new LaunchConfigManager(context, efsReporter);
            d = true;
            a.a(new Runnable() {
                public final void run() {
                    try {
                        b.a(applicationContext, null);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    public static boolean isInit() {
        return d;
    }

    public static void onTraceApp(Application application, String str, boolean z) {
        String str2 = "LaunchManager";
        if (application != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (str.equals(APP_ATTACH_BASE_CONTEXT) || Looper.getMainLooper() == Looper.myLooper()) {
                        b.a(str, z);
                        return;
                    }
                    if (isDebug) {
                        Log.e(str2, "Non main thread ！");
                    }
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e(str2, "--->>> onTrace parameter is Illegal !");
        }
    }

    public static void onTraceBegin(Context context, String str, long j) {
        String str2 = "LaunchManager";
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    context.getApplicationContext();
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        if (isDebug) {
                            Log.e(str2, "Non main thread ！");
                        }
                        return;
                    } else if (str.length() > 10) {
                        if (isDebug) {
                            Log.e(str2, "--->>> method name over length !");
                        }
                        return;
                    } else {
                        b.a(str, j);
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e(str2, "--->>> onTraceBegin parameter is Illegal !");
        }
    }

    public static void onTraceEnd(Context context, String str, long j) {
        String str2 = "LaunchManager";
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    context.getApplicationContext();
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        if (isDebug) {
                            Log.e(str2, "Non main thread ！");
                        }
                        return;
                    } else if (str.length() > 10) {
                        if (isDebug) {
                            Log.e(str2, "--->>> method name over length !");
                        }
                        return;
                    } else {
                        b.b(str, j);
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e(str2, "--->>> onTraceBegin parameter is Illegal !");
        }
    }

    public static void onTracePage(Activity activity, String str, boolean z) {
        String str2 = "LaunchManager";
        if (activity != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    activity.getApplicationContext();
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        if (isDebug) {
                            Log.e(str2, "Non main thread ！");
                        }
                        return;
                    }
                    b.a(activity, str, z);
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e(str2, "--->>> onTrace parameter is Illegal !");
        }
    }

    public static void sendLaunchCache(Context context, String str) {
        if (!(context == null || str == null)) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    b.a(context, str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
