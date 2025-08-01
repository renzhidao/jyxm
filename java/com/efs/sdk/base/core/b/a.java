package com.efs.sdk.base.core.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.util.Comparator;
import java.util.List;

public final class a {
    public boolean a;
    public boolean b;
    public b c;
    public a d;

    public static class a implements Comparator<File> {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            int i = ((((File) obj).lastModified() - ((File) obj2).lastModified()) > 0 ? 1 : ((((File) obj).lastModified() - ((File) obj2).lastModified()) == 0 ? 0 : -1));
            return i > 0 ? 1 : i == 0 ? 0 : -1;
        }
    }

    public static class b {
        private static final a a = new a();
    }

    private a() {
        this.a = false;
        this.b = true;
        this.c = new b();
        this.d = new a();
    }

    public /* synthetic */ a(byte b) {
        this();
    }

    public static boolean a(String str) {
        try {
            long parseLong = Long.parseLong(str.substring(str.lastIndexOf("_") + 1));
            com.efs.sdk.base.core.a.a.a();
            return Math.abs(com.efs.sdk.base.core.a.a.b() - parseLong) >= 604800000;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void b(@NonNull File file) {
        if (!file.getName().startsWith("wa_")) {
            com.efs.sdk.base.core.f.f.a.a.c.e();
        }
        com.efs.sdk.base.core.util.b.b(file);
    }

    public static void c(File file) {
        StringBuilder stringBuilder = new StringBuilder("file is expire: ");
        stringBuilder.append(file.getName());
        stringBuilder.append(", now is ");
        com.efs.sdk.base.core.a.a.a();
        stringBuilder.append(com.efs.sdk.base.core.a.a.b());
        Log.i("efs.cache", stringBuilder.toString());
        if (!file.getName().startsWith("wa_")) {
            com.efs.sdk.base.core.f.f.a.a.c.d();
        }
        com.efs.sdk.base.core.util.b.b(file);
    }

    @Nullable
    public final com.efs.sdk.base.core.d.b a(File file) {
        try {
            if (!file.exists()) {
                return null;
            }
            if (a(file.getName())) {
                c(file);
                return null;
            }
            com.efs.sdk.base.core.d.b b = com.efs.sdk.base.core.util.b.b(file.getName());
            if (b == null) {
                b(file);
                return null;
            }
            e a = this.c.a(b.a.b);
            if (a == null) {
                b(file);
                return null;
            } else if (a.a(file, b)) {
                return b;
            } else {
                b(file);
                return null;
            }
        } catch (Throwable th) {
            Log.w("efs.cache", th);
            b(file);
            return null;
        }
    }

    public final void a() {
        File d = com.efs.sdk.base.core.util.a.d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (d.exists() && d.isDirectory()) {
            String[] list = d.list();
            if (list != null && list.length > 0) {
                for (String str : list) {
                    if (!ProcessUtil.isProcessExist(ControllerCenter.getGlobalEnvStruct().mAppContext, str)) {
                        File file = new File(d, str);
                        List<File> d2 = com.efs.sdk.base.core.util.b.d(file);
                        if (!d2.isEmpty()) {
                            for (File file2 : d2) {
                                if (a(file2.getName())) {
                                    c(file2);
                                } else {
                                    com.efs.sdk.base.core.d.b b = com.efs.sdk.base.core.util.b.b(file2.getName());
                                    if (b != null) {
                                        e a = this.c.a(b.a.b);
                                        if (a != null) {
                                            a.a(file2);
                                        }
                                    }
                                    b(file2);
                                }
                            }
                        }
                        com.efs.sdk.base.core.util.b.b(file);
                    }
                }
            }
        }
    }
}
