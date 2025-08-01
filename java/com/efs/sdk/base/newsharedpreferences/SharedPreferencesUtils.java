package com.efs.sdk.base.newsharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.lang.reflect.AccessibleObject;
import java.util.HashMap;

public class SharedPreferencesUtils {
    private static final HashMap<String, SharedPreferencesWrapper> sSpCache = new HashMap();

    public static class SharedPreferencesWrapper {
        private volatile SharedPreferences mSharedPreferences;

        private SharedPreferencesWrapper() {
        }
    }

    private static SharedPreferences getNewSharedPreferences(Context context, String str, boolean z) {
        return getNewSharedPreferences(context, str, z, false);
    }

    private static SharedPreferences getNewSharedPreferences(Context context, String str, boolean z, boolean z2) {
        SharedPreferencesWrapper sharedPreferencesWrapper;
        HashMap hashMap = sSpCache;
        synchronized (hashMap) {
            sharedPreferencesWrapper = (SharedPreferencesWrapper) hashMap.get(str);
            if (sharedPreferencesWrapper == null) {
                sharedPreferencesWrapper = new SharedPreferencesWrapper();
                hashMap.put(str, sharedPreferencesWrapper);
            }
        }
        if (sharedPreferencesWrapper.mSharedPreferences == null) {
            synchronized (sharedPreferencesWrapper) {
                if (sharedPreferencesWrapper.mSharedPreferences == null) {
                    if (!z2) {
                        handleReplace(context, str, z);
                    }
                    if (sharedPreferencesWrapper.mSharedPreferences == null) {
                        sharedPreferencesWrapper.mSharedPreferences = new SharedPreferencesNewImpl(getNewSharedPrefsFile(context, str), z);
                    }
                }
            }
        }
        return sharedPreferencesWrapper.mSharedPreferences;
    }

    public static File getNewSharedPrefsFile(Context context, String str) {
        String str2 = context.getApplicationInfo().dataDir;
        StringBuilder stringBuilder = new StringBuilder("shared_prefs");
        stringBuilder.append(File.separatorChar);
        stringBuilder.append(str);
        stringBuilder.append(".sp");
        return new File(str2, stringBuilder.toString());
    }

    public static SharedPreferences getSharedPreferences(Context context, String str) {
        return getSharedPreferences(context, str, false);
    }

    public static SharedPreferences getSharedPreferences(Context context, String str, boolean z) {
        return getNewSharedPreferences(context, str, z);
    }

    /* DevToolsApp WARNING: Missing block: B:38:0x00dc, code:
            return;
     */
    private static synchronized void handleReplace(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
        r0 = com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils.class;
        monitor-enter(r0);
        if (r7 != 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r0);
        return;
    L_0x0007:
        r1 = "sp_replace_flag";
        r2 = 1;
        r1 = getNewSharedPreferences(r7, r1, r9, r2);	 Catch:{ all -> 0x00dd }
        r3 = r1.contains(r8);	 Catch:{ all -> 0x00dd }
        if (r3 != 0) goto L_0x00db;
    L_0x0014:
        r9 = getNewSharedPreferences(r7, r8, r9, r2);	 Catch:{ all -> 0x00dd }
        r3 = r9.edit();	 Catch:{ all -> 0x00dd }
        r4 = r9;
        r4 = (com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl) r4;	 Catch:{ all -> 0x00dd }
        r4 = r4.getModifyID();	 Catch:{ all -> 0x00dd }
        if (r4 > r2) goto L_0x00d0;
    L_0x0025:
        r4 = 0;
        r7 = r7.getSharedPreferences(r8, r4);	 Catch:{ all -> 0x00dd }
        r7 = r7.getAll();	 Catch:{ all -> 0x00dd }
        r4 = "caisq";
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00dd }
        r6 = "replace ";
        r5.<init>(r6);	 Catch:{ all -> 0x00dd }
        r5.append(r8);	 Catch:{ all -> 0x00dd }
        r6 = "   ";
        r5.append(r6);	 Catch:{ all -> 0x00dd }
        r6 = r7.size();	 Catch:{ all -> 0x00dd }
        r5.append(r6);	 Catch:{ all -> 0x00dd }
        r6 = "   ";
        r5.append(r6);	 Catch:{ all -> 0x00dd }
        r9 = r9.hashCode();	 Catch:{ all -> 0x00dd }
        r5.append(r9);	 Catch:{ all -> 0x00dd }
        r9 = r5.toString();	 Catch:{ all -> 0x00dd }
        android.util.Log.e(r4, r9);	 Catch:{ all -> 0x00dd }
        r9 = r7.size();	 Catch:{ all -> 0x00dd }
        if (r9 <= 0) goto L_0x00d0;
    L_0x005f:
        r7 = r7.entrySet();	 Catch:{ all -> 0x00dd }
        r7 = r7.iterator();	 Catch:{ all -> 0x00dd }
    L_0x0067:
        r9 = r7.hasNext();	 Catch:{ all -> 0x00dd }
        if (r9 == 0) goto L_0x00cd;
    L_0x006d:
        r9 = r7.next();	 Catch:{ all -> 0x00dd }
        r9 = (java.util.Map.Entry) r9;	 Catch:{ all -> 0x00dd }
        r4 = r9.getKey();	 Catch:{ all -> 0x00dd }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x00dd }
        r9 = r9.getValue();	 Catch:{ all -> 0x00dd }
        if (r4 == 0) goto L_0x0067;
    L_0x007f:
        r5 = r4.trim();	 Catch:{ all -> 0x00dd }
        r5 = r5.length();	 Catch:{ all -> 0x00dd }
        if (r5 <= 0) goto L_0x0067;
    L_0x0089:
        if (r9 == 0) goto L_0x0067;
    L_0x008b:
        r5 = r9 instanceof java.lang.String;	 Catch:{ all -> 0x00dd }
        if (r5 == 0) goto L_0x0095;
    L_0x008f:
        r9 = (java.lang.String) r9;	 Catch:{ all -> 0x00dd }
        r3.putString(r4, r9);	 Catch:{ all -> 0x00dd }
        goto L_0x0067;
    L_0x0095:
        r5 = r9 instanceof java.lang.Long;	 Catch:{ all -> 0x00dd }
        if (r5 == 0) goto L_0x00a3;
    L_0x0099:
        r9 = (java.lang.Long) r9;	 Catch:{ all -> 0x00dd }
        r5 = r9.longValue();	 Catch:{ all -> 0x00dd }
        r3.putLong(r4, r5);	 Catch:{ all -> 0x00dd }
        goto L_0x0067;
    L_0x00a3:
        r5 = r9 instanceof java.lang.Integer;	 Catch:{ all -> 0x00dd }
        if (r5 == 0) goto L_0x00b1;
    L_0x00a7:
        r9 = (java.lang.Integer) r9;	 Catch:{ all -> 0x00dd }
        r9 = r9.intValue();	 Catch:{ all -> 0x00dd }
        r3.putInt(r4, r9);	 Catch:{ all -> 0x00dd }
        goto L_0x0067;
    L_0x00b1:
        r5 = r9 instanceof java.lang.Float;	 Catch:{ all -> 0x00dd }
        if (r5 == 0) goto L_0x00bf;
    L_0x00b5:
        r9 = (java.lang.Float) r9;	 Catch:{ all -> 0x00dd }
        r9 = r9.floatValue();	 Catch:{ all -> 0x00dd }
        r3.putFloat(r4, r9);	 Catch:{ all -> 0x00dd }
        goto L_0x0067;
    L_0x00bf:
        r5 = r9 instanceof java.lang.Boolean;	 Catch:{ all -> 0x00dd }
        if (r5 == 0) goto L_0x0067;
    L_0x00c3:
        r9 = (java.lang.Boolean) r9;	 Catch:{ all -> 0x00dd }
        r9 = r9.booleanValue();	 Catch:{ all -> 0x00dd }
        r3.putBoolean(r4, r9);	 Catch:{ all -> 0x00dd }
        goto L_0x0067;
    L_0x00cd:
        r3.apply();	 Catch:{ all -> 0x00dd }
    L_0x00d0:
        r7 = r1.edit();	 Catch:{ all -> 0x00dd }
        r7 = r7.putBoolean(r8, r2);	 Catch:{ all -> 0x00dd }
        r7.apply();	 Catch:{ all -> 0x00dd }
    L_0x00db:
        monitor-exit(r0);
        return;
    L_0x00dd:
        r7 = move-exception;
        monitor-exit(r0);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils.handleReplace(android.content.Context, java.lang.String, boolean):void");
    }

    private static Object invokeObjectMethod(Object obj, String str, Class[] clsArr, Object[] objArr) {
        try {
            AccessibleObject method = obj.getClass().getMethod(str, clsArr);
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void onDestroy() {
        HashMap hashMap = sSpCache;
        synchronized (hashMap) {
            if (hashMap.size() > 0) {
                for (SharedPreferencesWrapper access$100 : hashMap.values()) {
                    SharedPreferences access$1002 = access$100.mSharedPreferences;
                    if (access$1002 != null) {
                        ((SharedPreferencesNewImpl) access$1002).onDestroy();
                    }
                }
            }
        }
    }
}
