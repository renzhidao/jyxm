package com.efs.sdk.launch;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.ILogProtocol;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class b {
    private static long a;
    private static long b;
    private static long c;
    private static long d;
    private static long e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static long i;
    private static long j;
    private static int k;
    private static List<EfsJSONLog> l = new ArrayList();
    private static Map<String, Long[]> m = new HashMap();

    public static void a(Activity activity, String str, boolean z) {
        String str2 = str;
        String str3 = "LaunchTrace";
        if (TextUtils.equals(str2, LaunchManager.PAGE_ON_CREATE)) {
            if (z) {
                if (LaunchManager.isDebug) {
                    Log.i(str3, "onCreate");
                }
                d = System.currentTimeMillis();
            }
        } else if (TextUtils.equals(str2, LaunchManager.PAGE_ON_RE_START)) {
            if (z && k == 0) {
                if (LaunchManager.isDebug) {
                    Log.i(str3, "onRestart");
                }
                e = System.currentTimeMillis();
                g = true;
            }
        } else if (TextUtils.equals(str2, LaunchManager.PAGE_ON_START)) {
            if (z) {
                if (LaunchManager.isDebug) {
                    Log.i(str3, "onStart");
                }
                k++;
                h = true;
            }
        } else if (TextUtils.equals(str2, LaunchManager.PAGE_ON_RESUME)) {
            if (!z) {
                if (LaunchManager.isDebug) {
                    Log.i(str3, "onResume");
                }
                if (f) {
                    f = false;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - c;
                    if (LaunchManager.isDebug) {
                        Log.i(str3, "loadTime is ".concat(String.valueOf(j)));
                    }
                    long j2 = currentTimeMillis - a;
                    if (LaunchManager.isDebug) {
                        Log.i(str3, "======>>>>>> coldTime is ".concat(String.valueOf(j2)));
                    }
                    int d = c.d(activity.getApplicationContext()) ^ 1;
                    if (LaunchManager.isDebug) {
                        Log.i(str3, "type is ".concat(String.valueOf(d)));
                    }
                    a(activity.getApplicationContext(), d, activity.getClass().getName(), j2, a, b, i, c, j, currentTimeMillis, j, 0, 0, m);
                } else if (k == 1) {
                    long currentTimeMillis2;
                    Context applicationContext;
                    String name;
                    int i;
                    long j3;
                    long j4;
                    long j5;
                    long j6;
                    long j7;
                    long j8;
                    long j9;
                    long j10;
                    long j11;
                    if (g) {
                        g = false;
                        currentTimeMillis2 = System.currentTimeMillis() - e;
                        if (LaunchManager.isDebug) {
                            Log.i(str3, "======>>>>>> hotTime is ".concat(String.valueOf(currentTimeMillis2)));
                        }
                        applicationContext = activity.getApplicationContext();
                        name = activity.getClass().getName();
                        i = 2;
                        j3 = 0;
                        j4 = 0;
                        j5 = 0;
                        j6 = 0;
                        j7 = 0;
                        j8 = 0;
                        j9 = 0;
                        j10 = 0;
                        j11 = 0;
                    } else if (h) {
                        j11 = System.currentTimeMillis() - d;
                        if (LaunchManager.isDebug) {
                            Log.i(str3, "======>>>>>> warmTime is ".concat(String.valueOf(j11)));
                        }
                        applicationContext = activity.getApplicationContext();
                        name = activity.getClass().getName();
                        i = 3;
                        j3 = 0;
                        j4 = 0;
                        j5 = 0;
                        j6 = 0;
                        j7 = 0;
                        j8 = 0;
                        j9 = 0;
                        j10 = 0;
                        currentTimeMillis2 = 0;
                    }
                    a(applicationContext, i, name, j3, j4, j5, j6, j7, j8, j9, j10, currentTimeMillis2, j11, m);
                }
                h = false;
            }
        } else if (TextUtils.equals(str2, LaunchManager.PAGE_ON_STOP) && z) {
            if (LaunchManager.isDebug) {
                Log.i(str3, "onStop");
            }
            k--;
        }
    }

    /* DevToolsApp ERROR: DevToolsAppRE in pass: o00Ooo
        g.d.a.b.DevToolsAppRE: Exception block dominator not found, method:com.efs.sdk.launch.b.a(android.content.Context, int, java.lang.String, long, long, long, long, long, long, long, long, long, long, java.util.Map):void, dom blocks: []
        	at OooOO0O.OooO0O0.OooO0o.OooO0oO.o000O0Oo.o00Ooo.OooO0o(SourceFile:112)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o0000o(SourceFile:3)
        	at OooOO0O.OooO0O0.OooO0o.OooO0oO.o00000O.accept(SourceFile:1)
        	at OooO0oo.OooO00o.OooO00o.OooO0OO.OooOoOO.Oooo0.OooO00o(SourceFile:2)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o0000o0o(SourceFile:5)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o00oO0O(SourceFile:11)
        	at OooOO0O.OooO0O0.OooO00o.accept(SourceFile:1)
        	at OooO0oo.OooO00o.OooO00o.OooO0OO.OooOoOO.Oooo0.OooO00o(SourceFile:2)
        	at OooO.OooO0O0.OooO0OO.OooO0oo.o00000OO.o00oO0O(SourceFile:17)
        	at OooOO0O.OooO00o.OooO00o.run(SourceFile:8)
        */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:139:0x0369  */
    private static void a(android.content.Context r24, int r25, java.lang.String r26, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, long r45, java.util.Map<java.lang.String, java.lang.Long[]> r47) {
        /*
        r0 = r25;
        r1 = r26;
        r2 = r31;
        r4 = r35;
        r6 = com.efs.sdk.launch.LaunchManager.isInit();
        r7 = "cache launch size over!";
        r9 = "startperf";
        r11 = "userExtra";
        r12 = "wl_page";
        r13 = "wd_pagetm";
        r14 = "wd_page";
        r15 = "wl_build";
        r10 = "wd_buildtm";
        r8 = "wd_build";
        r4 = "wl_init";
        r5 = "wd_inittm";
        r2 = "wd_init";
        r3 = "0.0.4.umeng";
        r17 = r7;
        r7 = "l_version";
        r18 = r11;
        r11 = "w_url";
        r19 = r12;
        r12 = "w_type";
        r20 = r13;
        r13 = "wl_avgv";
        r21 = r14;
        r14 = "LaunchTrace";
        if (r6 == 0) goto L_0x0191;
    L_0x003c:
        r6 = com.efs.sdk.launch.LaunchManager.getLaunchConfigManager();
        if (r6 == 0) goto L_0x0048;
    L_0x0042:
        r6 = r6.enableTracer();
        if (r6 != 0) goto L_0x004e;
    L_0x0048:
        r6 = com.efs.sdk.base.integrationtesting.IntegrationTestingUtil.isIntegrationTestingInPeriod();
        if (r6 == 0) goto L_0x0187;
    L_0x004e:
        r6 = new com.efs.sdk.base.protocol.record.EfsJSONLog;
        r6.<init>(r9);
        r9 = java.lang.Integer.valueOf(r25);
        r6.put(r12, r9);
        r6.put(r11, r1);
        r6.put(r7, r3);
        if (r0 == 0) goto L_0x007a;
    L_0x0062:
        r1 = 1;
        if (r0 != r1) goto L_0x0066;
    L_0x0065:
        goto L_0x007a;
    L_0x0066:
        r1 = 2;
        if (r0 != r1) goto L_0x0072;
    L_0x0069:
        r0 = java.lang.Long.valueOf(r43);
    L_0x006d:
        r6.put(r13, r0);
        goto L_0x0113;
    L_0x0072:
        r1 = 3;
        if (r0 != r1) goto L_0x0113;
    L_0x0075:
        r0 = java.lang.Long.valueOf(r45);
        goto L_0x006d;
    L_0x007a:
        r0 = java.lang.Long.valueOf(r27);
        r6.put(r13, r0);
        r0 = java.lang.Long.valueOf(r29);
        r6.put(r2, r0);
        r0 = java.lang.Long.valueOf(r31);
        r6.put(r5, r0);
        r0 = java.lang.Long.valueOf(r33);
        r6.put(r4, r0);
        r0 = java.lang.Long.valueOf(r31);
        r6.put(r8, r0);
        r0 = java.lang.Long.valueOf(r35);
        r6.put(r10, r0);
        r0 = java.lang.Long.valueOf(r37);
        r6.put(r15, r0);
        r0 = java.lang.Long.valueOf(r35);
        r1 = r21;
        r6.put(r1, r0);
        r0 = java.lang.Long.valueOf(r39);
        r1 = r20;
        r6.put(r1, r0);
        r0 = java.lang.Long.valueOf(r41);
        r1 = r19;
        r6.put(r1, r0);
        if (r47 == 0) goto L_0x0113;
    L_0x00c8:
        r0 = r47.isEmpty();
        if (r0 != 0) goto L_0x0113;
    L_0x00ce:
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = r47.entrySet();
        r1 = r1.iterator();
    L_0x00db:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x010e;
    L_0x00e1:
        r2 = r1.next();
        r2 = (java.util.Map.Entry) r2;
        r3 = r2.getKey();
        r3 = (java.lang.String) r3;
        r2 = r2.getValue();
        r2 = (java.lang.Long[]) r2;
        if (r3 == 0) goto L_0x00db;
    L_0x00f5:
        if (r2 == 0) goto L_0x00db;
    L_0x00f7:
        r4 = new org.json.JSONArray;	 Catch:{ all -> 0x010c }
        r4.<init>();	 Catch:{ all -> 0x010c }
        r5 = 0;	 Catch:{ all -> 0x010c }
        r7 = r2[r5];	 Catch:{ all -> 0x010c }
        r4.put(r7);	 Catch:{ all -> 0x010c }
        r5 = 1;	 Catch:{ all -> 0x010c }
        r2 = r2[r5];	 Catch:{ all -> 0x010c }
        r4.put(r2);	 Catch:{ all -> 0x010c }
        r0.put(r3, r4);	 Catch:{ all -> 0x010c }
        goto L_0x00db;
        goto L_0x00db;
    L_0x010e:
        r2 = r18;
        r6.put(r2, r0);
    L_0x0113:
        r0 = com.efs.sdk.launch.c.a(r24);
        r1 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r1 == 0) goto L_0x0128;
    L_0x011b:
        r1 = java.lang.String.valueOf(r0);
        r2 = "umid is ";
        r1 = r2.concat(r1);
        android.util.Log.i(r14, r1);
    L_0x0128:
        if (r0 == 0) goto L_0x0153;
    L_0x012a:
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0153;
    L_0x0130:
        r0 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r0 == 0) goto L_0x0149;
    L_0x0134:
        r0 = new java.lang.StringBuilder;
        r1 = "send current launch report --->>> ";
        r0.<init>(r1);
        r1 = r6.generateString();
        r0.append(r1);
        r0 = r0.toString();
        android.util.Log.i(r14, r0);
    L_0x0149:
        r0 = com.efs.sdk.launch.LaunchManager.getReporter();
        if (r0 == 0) goto L_0x0152;
    L_0x014f:
        r0.send(r6);
    L_0x0152:
        return;
    L_0x0153:
        r0 = l;
        if (r0 == 0) goto L_0x017d;
    L_0x0157:
        r0 = r0.size();
        r1 = 3;
        if (r0 >= r1) goto L_0x017d;
    L_0x015e:
        r0 = l;
        r0.add(r6);
        r0 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r0 == 0) goto L_0x0186;
    L_0x0167:
        r0 = new java.lang.StringBuilder;
        r1 = "cache launch report --->>> ";
        r0.<init>(r1);
        r1 = r6.generateString();
    L_0x0172:
        r0.append(r1);
        r0 = r0.toString();
        android.util.Log.i(r14, r0);
        return;
    L_0x017d:
        r0 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r0 == 0) goto L_0x0186;
    L_0x0181:
        r6 = r17;
        android.util.Log.i(r14, r6);
    L_0x0186:
        return;
    L_0x0187:
        r0 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r0 == 0) goto L_0x0190;
    L_0x018b:
        r0 = "launch --->>> config no init or enable is false";
        android.util.Log.i(r14, r0);
    L_0x0190:
        return;
    L_0x0191:
        r6 = r20;
        r20 = r19;
        r19 = r18;
        r18 = r9;
        r9 = r21;
        if (r0 != 0) goto L_0x025b;
    L_0x019d:
        r16 = com.efs.sdk.launch.LaunchManager.isDebug;
        r21 = r6;
        if (r16 == 0) goto L_0x01a8;
    L_0x01a3:
        r6 = "no init, local cache cold launch, type is 0 !";
        android.util.Log.i(r14, r6);
    L_0x01a8:
        r6 = new org.json.JSONObject;
        r6.<init>();
        r6.put(r12, r0);	 Catch:{ all -> 0x0256 }
        r6.put(r11, r1);	 Catch:{ all -> 0x0256 }
        r6.put(r7, r3);	 Catch:{ all -> 0x0256 }
        r0 = r27;	 Catch:{ all -> 0x0256 }
        r6.put(r13, r0);	 Catch:{ all -> 0x0256 }
        r0 = r29;	 Catch:{ all -> 0x0256 }
        r6.put(r2, r0);	 Catch:{ all -> 0x0256 }
        r0 = r31;	 Catch:{ all -> 0x0256 }
        r6.put(r5, r0);	 Catch:{ all -> 0x0256 }
        r2 = r33;	 Catch:{ all -> 0x0256 }
        r6.put(r4, r2);	 Catch:{ all -> 0x0256 }
        r6.put(r8, r0);	 Catch:{ all -> 0x0256 }
        r0 = r35;	 Catch:{ all -> 0x0256 }
        r6.put(r10, r0);	 Catch:{ all -> 0x0256 }
        r2 = r37;	 Catch:{ all -> 0x0256 }
        r6.put(r15, r2);	 Catch:{ all -> 0x0256 }
        r6.put(r9, r0);	 Catch:{ all -> 0x0256 }
        r0 = r39;	 Catch:{ all -> 0x0256 }
        r2 = r21;	 Catch:{ all -> 0x0256 }
        r6.put(r2, r0);	 Catch:{ all -> 0x0256 }
        r0 = r41;	 Catch:{ all -> 0x0256 }
        r4 = r20;	 Catch:{ all -> 0x0256 }
        r6.put(r4, r0);	 Catch:{ all -> 0x0256 }
        if (r47 == 0) goto L_0x0233;	 Catch:{ all -> 0x0256 }
    L_0x01ea:
        r0 = r47.isEmpty();	 Catch:{ all -> 0x0256 }
        if (r0 != 0) goto L_0x0233;	 Catch:{ all -> 0x0256 }
    L_0x01f0:
        r0 = new org.json.JSONObject;	 Catch:{ all -> 0x0256 }
        r0.<init>();	 Catch:{ all -> 0x0256 }
        r1 = r47.entrySet();	 Catch:{ all -> 0x0256 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0256 }
    L_0x01fd:
        r2 = r1.hasNext();	 Catch:{ all -> 0x0256 }
        if (r2 == 0) goto L_0x022e;	 Catch:{ all -> 0x0256 }
    L_0x0203:
        r2 = r1.next();	 Catch:{ all -> 0x0256 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0256 }
        r3 = r2.getKey();	 Catch:{ all -> 0x0256 }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x0256 }
        r2 = r2.getValue();	 Catch:{ all -> 0x0256 }
        r2 = (java.lang.Long[]) r2;	 Catch:{ all -> 0x0256 }
        if (r3 == 0) goto L_0x01fd;
    L_0x0217:
        if (r2 == 0) goto L_0x01fd;
    L_0x0219:
        r4 = new org.json.JSONArray;	 Catch:{ all -> 0x01fd }
        r4.<init>();	 Catch:{ all -> 0x01fd }
        r5 = 0;	 Catch:{ all -> 0x01fd }
        r7 = r2[r5];	 Catch:{ all -> 0x01fd }
        r4.put(r7);	 Catch:{ all -> 0x01fd }
        r5 = 1;	 Catch:{ all -> 0x01fd }
        r2 = r2[r5];	 Catch:{ all -> 0x01fd }
        r4.put(r2);	 Catch:{ all -> 0x01fd }
        r0.put(r3, r4);	 Catch:{ all -> 0x01fd }
        goto L_0x01fd;
    L_0x022e:
        r1 = r19;
        r6.put(r1, r0);	 Catch:{ all -> 0x0256 }
    L_0x0233:
        r0 = r6.toString();	 Catch:{ all -> 0x0256 }
        r1 = r24;	 Catch:{ all -> 0x0256 }
        com.efs.sdk.launch.c.a(r1, r0);	 Catch:{ all -> 0x0256 }
        r0 = com.efs.sdk.launch.LaunchManager.isDebug;	 Catch:{ all -> 0x0256 }
        if (r0 == 0) goto L_0x0255;	 Catch:{ all -> 0x0256 }
    L_0x0240:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0256 }
        r1 = "no init, cache first launch, content is ";	 Catch:{ all -> 0x0256 }
        r0.<init>(r1);	 Catch:{ all -> 0x0256 }
        r1 = r6.toString();	 Catch:{ all -> 0x0256 }
        r0.append(r1);	 Catch:{ all -> 0x0256 }
        r0 = r0.toString();	 Catch:{ all -> 0x0256 }
        android.util.Log.i(r14, r0);	 Catch:{ all -> 0x0256 }
    L_0x0255:
        return;
    L_0x0256:
        r0 = move-exception;
        r0.printStackTrace();
        return;
    L_0x025b:
        r23 = r4;
        r4 = r2;
        r2 = r6;
        r6 = r23;
        r21 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r21 == 0) goto L_0x0277;
    L_0x0265:
        r21 = r2;
        r2 = java.lang.String.valueOf(r25);
        r22 = r9;
        r9 = "no init, cache launch, type is ";
        r2 = r9.concat(r2);
        android.util.Log.i(r14, r2);
        goto L_0x027b;
    L_0x0277:
        r21 = r2;
        r22 = r9;
    L_0x027b:
        r2 = new com.efs.sdk.base.protocol.record.EfsJSONLog;
        r9 = r18;
        r2.<init>(r9);
        r9 = java.lang.Integer.valueOf(r25);
        r2.put(r12, r9);
        r2.put(r11, r1);
        r2.put(r7, r3);
        r1 = 1;
        if (r0 != r1) goto L_0x0330;
    L_0x0292:
        r0 = java.lang.Long.valueOf(r27);
        r2.put(r13, r0);
        r0 = java.lang.Long.valueOf(r29);
        r2.put(r4, r0);
        r0 = java.lang.Long.valueOf(r31);
        r2.put(r5, r0);
        r0 = java.lang.Long.valueOf(r33);
        r2.put(r6, r0);
        r0 = java.lang.Long.valueOf(r31);
        r2.put(r8, r0);
        r0 = java.lang.Long.valueOf(r35);
        r2.put(r10, r0);
        r0 = java.lang.Long.valueOf(r37);
        r2.put(r15, r0);
        r0 = java.lang.Long.valueOf(r35);
        r1 = r22;
        r2.put(r1, r0);
        r0 = java.lang.Long.valueOf(r39);
        r1 = r21;
        r2.put(r1, r0);
        r0 = java.lang.Long.valueOf(r41);
        r1 = r20;
        r2.put(r1, r0);
        if (r47 == 0) goto L_0x032e;
    L_0x02e0:
        r0 = r47.isEmpty();
        if (r0 != 0) goto L_0x032e;
    L_0x02e6:
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = r47.entrySet();
        r1 = r1.iterator();
    L_0x02f3:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0329;
    L_0x02f9:
        r3 = r1.next();
        r3 = (java.util.Map.Entry) r3;
        r4 = r3.getKey();
        r4 = (java.lang.String) r4;
        r3 = r3.getValue();
        r3 = (java.lang.Long[]) r3;
        if (r4 == 0) goto L_0x0326;
    L_0x030d:
        if (r3 == 0) goto L_0x0326;
    L_0x030f:
        r5 = new org.json.JSONArray;	 Catch:{ all -> 0x0326 }
        r5.<init>();	 Catch:{ all -> 0x0326 }
        r6 = 0;
        r7 = r3[r6];	 Catch:{ all -> 0x0327 }
        r5.put(r7);	 Catch:{ all -> 0x0327 }
        r7 = 1;
        r3 = r3[r7];	 Catch:{ all -> 0x0324 }
        r5.put(r3);	 Catch:{ all -> 0x0324 }
        r0.put(r4, r5);	 Catch:{ all -> 0x0324 }
        goto L_0x02f3;
        goto L_0x02f3;
    L_0x0326:
        r6 = 0;
    L_0x0327:
        r7 = 1;
        goto L_0x02f3;
    L_0x0329:
        r3 = r19;
        r2.put(r3, r0);
    L_0x032e:
        r1 = 3;
        goto L_0x0345;
    L_0x0330:
        r1 = 2;
        if (r0 != r1) goto L_0x033b;
    L_0x0333:
        r0 = java.lang.Long.valueOf(r43);
        r2.put(r13, r0);
        goto L_0x032e;
    L_0x033b:
        r1 = 3;
        if (r0 != r1) goto L_0x0345;
    L_0x033e:
        r0 = java.lang.Long.valueOf(r45);
        r2.put(r13, r0);
    L_0x0345:
        r0 = l;
        if (r0 == 0) goto L_0x0365;
    L_0x0349:
        r0 = r0.size();
        if (r0 >= r1) goto L_0x0365;
    L_0x034f:
        r0 = l;
        r0.add(r2);
        r0 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r0 == 0) goto L_0x036e;
    L_0x0358:
        r0 = new java.lang.StringBuilder;
        r1 = "cache launch report --->>> ";
        r0.<init>(r1);
        r1 = r2.generateString();
        goto L_0x0172;
    L_0x0365:
        r0 = com.efs.sdk.launch.LaunchManager.isDebug;
        if (r0 == 0) goto L_0x036e;
    L_0x0369:
        r0 = r17;
        android.util.Log.i(r14, r0);
    L_0x036e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.launch.b.a(android.content.Context, int, java.lang.String, long, long, long, long, long, long, long, long, long, long, java.util.Map):void");
    }

    public static void a(Context context, String str) {
        CharSequence str2;
        String str3 = "LaunchTrace";
        if (LaunchManager.isDebug) {
            Log.i(str3, "begin sendLaunchCache");
        }
        if (str2 == null || TextUtils.isEmpty(str2)) {
            str2 = c.a(context);
        }
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            Map hashMap = new HashMap(1);
            String str4 = UMCrash.KEY_HEADER_UMID;
            hashMap.put(str4, str2);
            if (LaunchManager.getReporter() != null) {
                LaunchManager.getReporter().addPublicParams(hashMap);
            }
            Object b = c.b(context);
            if (!(b == null || TextUtils.isEmpty(b))) {
                try {
                    JSONObject jSONObject = new JSONObject(b);
                    jSONObject.put(str4, str2);
                    if (a(jSONObject)) {
                        c.c(context);
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
            List list = l;
            if (list != null && list.size() > 0) {
                for (EfsJSONLog efsJSONLog : l) {
                    if (efsJSONLog != null) {
                        if (LaunchManager.isDebug) {
                            StringBuilder stringBuilder = new StringBuilder("send cache launch report --->>> ");
                            stringBuilder.append(efsJSONLog.generateString());
                            Log.i(str3, stringBuilder.toString());
                        }
                        EfsReporter reporter = LaunchManager.getReporter();
                        if (reporter != null) {
                            reporter.send(efsJSONLog);
                        }
                    }
                }
                l.clear();
                l = null;
            }
        }
    }

    public static void a(String str, long j) {
        Map map = m;
        if (map == null || map.containsKey(str) || m.size() >= 10) {
            if (LaunchManager.isDebug) {
                Log.e("LaunchTrace", "--->>> method name already exists or over quantity !");
            }
            return;
        }
        Object obj = new Long[2];
        obj[0] = Long.valueOf(j);
        m.put(str, obj);
    }

    public static void a(String str, boolean z) {
        if (!TextUtils.equals(str, LaunchManager.APP_CONSTRUCT)) {
            String str2 = "LaunchTrace";
            long currentTimeMillis;
            StringBuilder stringBuilder;
            if (TextUtils.equals(str, LaunchManager.APP_ATTACH_BASE_CONTEXT)) {
                if (z) {
                    a = System.currentTimeMillis();
                    f = true;
                    return;
                }
                currentTimeMillis = System.currentTimeMillis();
                b = currentTimeMillis;
                i = currentTimeMillis - a;
                if (LaunchManager.isDebug) {
                    stringBuilder = new StringBuilder("initTime is ");
                    stringBuilder.append(i);
                    Log.i(str2, stringBuilder.toString());
                }
            } else if (TextUtils.equals(str, LaunchManager.APP_ON_CREATE) && !z) {
                currentTimeMillis = System.currentTimeMillis();
                c = currentTimeMillis;
                j = currentTimeMillis - b;
                if (LaunchManager.isDebug) {
                    stringBuilder = new StringBuilder("buildTime is ");
                    stringBuilder.append(j);
                    Log.i(str2, stringBuilder.toString());
                }
            }
        }
    }

    private static boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str = "wl_page";
        String str2 = "wd_pagetm";
        String str3 = "wd_page";
        String str4 = "wl_build";
        String str5 = "wd_buildtm";
        String str6 = "wd_build";
        String str7 = "wl_init";
        String str8 = "wd_inittm";
        String str9 = "wd_init";
        String str10 = "wl_avgv";
        String str11 = "l_version";
        String str12 = "w_url";
        String str13 = "w_type";
        try {
            ILogProtocol efsJSONLog = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
            efsJSONLog.put(str13, jSONObject2.opt(str13));
            efsJSONLog.put(str12, jSONObject2.opt(str12));
            efsJSONLog.put(str11, jSONObject2.opt(str11));
            efsJSONLog.put(str10, jSONObject2.opt(str10));
            efsJSONLog.put(str9, jSONObject2.opt(str9));
            efsJSONLog.put(str8, jSONObject2.opt(str8));
            efsJSONLog.put(str7, jSONObject2.opt(str7));
            efsJSONLog.put(str6, jSONObject2.opt(str6));
            efsJSONLog.put(str5, jSONObject2.opt(str5));
            efsJSONLog.put(str4, jSONObject2.opt(str4));
            efsJSONLog.put(str3, jSONObject2.opt(str3));
            efsJSONLog.put(str2, jSONObject2.opt(str2));
            efsJSONLog.put(str, jSONObject2.opt(str));
            String str14 = "userExtra";
            efsJSONLog.put(str14, jSONObject2.opt(str14));
            if (LaunchManager.isDebug) {
                StringBuilder stringBuilder = new StringBuilder("send cache cold launch report --->>> ");
                stringBuilder.append(efsJSONLog.generateString());
                Log.i("LaunchTrace", stringBuilder.toString());
            }
            EfsReporter reporter = LaunchManager.getReporter();
            if (reporter != null) {
                reporter.send(efsJSONLog);
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static void b(String str, long j) {
        Map map = m;
        if (map == null || !map.containsKey(str)) {
            if (LaunchManager.isDebug) {
                Log.e("LaunchTrace", "--->>> method name non-existent or over quantity !");
            }
            return;
        }
        Long[] lArr = (Long[]) m.get(str);
        lArr[1] = Long.valueOf(j);
        m.put(str, lArr);
    }
}
