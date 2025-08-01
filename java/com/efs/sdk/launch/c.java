package com.efs.sdk.launch;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.ProcessUtil;

public final class c {
    private static String a = "";

    /* DevToolsApp WARNING: Removed duplicated region for block: B:17:0x002d A:{RETURN, Splitter: B:12:0x001e, ExcHandler: java.lang.IllegalAccessException (unused java.lang.IllegalAccessException), PHI: r0 } */
    /* DevToolsApp WARNING: Missing block: B:17:0x002d, code:
            return r0;
     */
    public static java.lang.String a(android.content.Context r7) {
        /*
        r0 = 0;
        if (r7 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = com.umeng.commonsdk.UMConfigure.class;
        r2 = com.umeng.commonsdk.UMConfigure.umDebugLog;	 Catch:{ ClassNotFoundException -> 0x0009 }
        goto L_0x000a;
    L_0x0009:
        r1 = r0;
    L_0x000a:
        if (r1 == 0) goto L_0x002d;
    L_0x000c:
        r2 = 0;
        r3 = 1;
        r4 = "getUMIDString";
        r5 = new java.lang.Class[r3];	 Catch:{ NoSuchMethodException -> 0x001b }
        r6 = android.content.Context.class;
        r5[r2] = r6;	 Catch:{ NoSuchMethodException -> 0x001b }
        r1 = r1.getMethod(r4, r5);	 Catch:{ NoSuchMethodException -> 0x001b }
        goto L_0x001c;
    L_0x001b:
        r1 = r0;
    L_0x001c:
        if (r1 == 0) goto L_0x002d;
    L_0x001e:
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalAccessException -> 0x002d, IllegalAccessException -> 0x002d }
        r3[r2] = r7;	 Catch:{ IllegalAccessException -> 0x002d, IllegalAccessException -> 0x002d }
        r7 = r1.invoke(r0, r3);	 Catch:{ IllegalAccessException -> 0x002d, IllegalAccessException -> 0x002d }
        if (r7 == 0) goto L_0x002d;
    L_0x0028:
        r7 = r7.toString();	 Catch:{ IllegalAccessException -> 0x002d, IllegalAccessException -> 0x002d }
        r0 = r7;
    L_0x002d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.launch.c.a(android.content.Context):java.lang.String");
    }

    public static void a(Context context, String str) {
        if (context != null && str != null && !TextUtils.isEmpty(str)) {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("efs_launch", 0);
            if (sharedPreferences != null) {
                Editor edit = sharedPreferences.edit();
                if (edit != null) {
                    edit.putString("first_launch_cache", str);
                    edit.commit();
                }
            }
        }
    }

    public static String b(Context context) {
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("efs_launch", 0);
        return sharedPreferences != null ? sharedPreferences.getString("first_launch_cache", null) : null;
    }

    public static void c(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("efs_launch", 0);
            if (sharedPreferences != null) {
                Editor edit = sharedPreferences.edit();
                if (edit != null) {
                    edit.putString("first_launch_cache", null);
                    edit.commit();
                }
            }
        }
    }

    /* DevToolsApp WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:7:0x0019 A:{RETURN} */
    public static boolean d(android.content.Context r4) {
        /*
        r0 = "is_install";
        r1 = "efs_launch";
        r2 = 0;
        if (r4 == 0) goto L_0x0016;
    L_0x0007:
        r3 = r4.getApplicationContext();
        r3 = r3.getSharedPreferences(r1, r2);
        if (r3 == 0) goto L_0x0016;
    L_0x0011:
        r3 = r3.getBoolean(r0, r2);
        goto L_0x0017;
    L_0x0016:
        r3 = 0;
    L_0x0017:
        if (r3 == 0) goto L_0x001a;
    L_0x0019:
        return r2;
    L_0x001a:
        r3 = 1;
        if (r4 == 0) goto L_0x0033;
    L_0x001d:
        r4 = r4.getApplicationContext();
        r4 = r4.getSharedPreferences(r1, r2);
        if (r4 == 0) goto L_0x0033;
    L_0x0027:
        r4 = r4.edit();
        if (r4 == 0) goto L_0x0033;
    L_0x002d:
        r4.putBoolean(r0, r3);
        r4.commit();
    L_0x0033:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.launch.c.d(android.content.Context):boolean");
    }

    public static boolean e(Context context) {
        try {
            Object currentProcessName = ProcessUtil.getCurrentProcessName();
            CharSequence packageName = context.getApplicationContext().getPackageName();
            return (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) ? false : true;
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }
}
