package com.efs.sdk.base.core.util;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class ProcessUtil {
    private static String a = null;
    private static List<Integer> b = null;
    private static long c = -1;

    public static String getCurrentProcessName() {
        Object obj = a;
        if (!TextUtils.isEmpty(obj)) {
            return obj;
        }
        String processName = getProcessName(Process.myPid());
        a = processName;
        return processName;
    }

    /* DevToolsApp WARNING: Removed duplicated region for block: B:19:0x0050 A:{SYNTHETIC, Splitter: B:19:0x0050} */
    public static java.lang.String getProcessName(int r6) {
        /*
        r0 = 0;
        r1 = new java.io.BufferedReader;	 Catch:{ all -> 0x0046 }
        r2 = new java.io.InputStreamReader;	 Catch:{ all -> 0x0046 }
        r3 = new java.io.FileInputStream;	 Catch:{ all -> 0x0046 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0046 }
        r5 = "/proc/";
        r4.<init>(r5);	 Catch:{ all -> 0x0046 }
        r4.append(r6);	 Catch:{ all -> 0x0046 }
        r6 = "/cmdline";
        r4.append(r6);	 Catch:{ all -> 0x0046 }
        r6 = r4.toString();	 Catch:{ all -> 0x0046 }
        r3.<init>(r6);	 Catch:{ all -> 0x0046 }
        r2.<init>(r3);	 Catch:{ all -> 0x0046 }
        r1.<init>(r2);	 Catch:{ all -> 0x0046 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0043 }
        r6.<init>();	 Catch:{ all -> 0x0043 }
    L_0x0028:
        r0 = r1.read();	 Catch:{ all -> 0x0043 }
        if (r0 <= 0) goto L_0x0033;
    L_0x002e:
        r0 = (char) r0;	 Catch:{ all -> 0x0043 }
        r6.append(r0);	 Catch:{ all -> 0x0043 }
        goto L_0x0028;
    L_0x0033:
        r6.trimToSize();	 Catch:{ all -> 0x0043 }
        r6 = r6.toString();	 Catch:{ all -> 0x0043 }
        r1.close();	 Catch:{ all -> 0x003e }
        goto L_0x005a;
    L_0x003e:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x005a;
    L_0x0043:
        r6 = move-exception;
        r0 = r1;
        goto L_0x0047;
    L_0x0046:
        r6 = move-exception;
    L_0x0047:
        r1 = "efs.base";
        r2 = "get process name error";
        com.efs.sdk.base.core.util.Log.e(r1, r2, r6);	 Catch:{ all -> 0x005b }
        if (r0 == 0) goto L_0x0058;
    L_0x0050:
        r0.close();	 Catch:{ all -> 0x0054 }
        goto L_0x0058;
    L_0x0054:
        r6 = move-exception;
        r6.printStackTrace();
    L_0x0058:
        r6 = "";
    L_0x005a:
        return r6;
    L_0x005b:
        r6 = move-exception;
        if (r0 == 0) goto L_0x0066;
    L_0x005e:
        r0.close();	 Catch:{ all -> 0x0062 }
        goto L_0x0066;
    L_0x0062:
        r0 = move-exception;
        r0.printStackTrace();
    L_0x0066:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.core.util.ProcessUtil.getProcessName(int):java.lang.String");
    }

    public static boolean isProcessExist(Context context, String str) {
        try {
            int parseInt = Integer.parseInt(str);
            List list = b;
            Object obj = null;
            if (list != null && !list.isEmpty() && c > 0 && System.currentTimeMillis() - c <= 600000) {
                obj = 1;
            }
            if (obj == null) {
                list = b;
                if (list != null) {
                    list.clear();
                } else {
                    b = new ArrayList();
                }
                if (!TextUtils.isEmpty(getProcessName(Process.myPid()))) {
                    b.add(Integer.valueOf(Process.myPid()));
                }
                if (!TextUtils.isEmpty(getProcessName(parseInt))) {
                    b.add(Integer.valueOf(parseInt));
                }
                c = System.currentTimeMillis();
            }
            return b.contains(Integer.valueOf(parseInt));
        } catch (Throwable th) {
            Log.e("efs.base", "Process exist judge error", th);
            return true;
        }
    }

    public static int myPid() {
        return Process.myPid();
    }
}
