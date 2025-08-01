package com.efs.sdk.base.core.config.a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.c.f;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.a;
import com.efs.sdk.base.core.util.b;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import java.io.File;
import java.util.Map.Entry;

public final class e implements OnSharedPreferenceChangeListener {
    public volatile SharedPreferences a;

    public static boolean a() {
        GlobalEnvStruct globalEnvStruct = ControllerCenter.getGlobalEnvStruct();
        File b = a.b(globalEnvStruct.mAppContext, globalEnvStruct.getAppid());
        if (!b.exists()) {
            return false;
        }
        b.b(b);
        return true;
    }

    public static void b() {
        File a = a.a(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (a.exists()) {
            a.delete();
        }
    }

    private void d() {
        if (this.a == null) {
            synchronized (com.efs.sdk.base.core.c.b.class) {
                if (this.a == null) {
                    String appid = ControllerCenter.getGlobalEnvStruct().getAppid();
                    StringBuilder stringBuilder = new StringBuilder("config_");
                    stringBuilder.append(appid.toLowerCase());
                    this.a = SharedPreferencesUtils.getSharedPreferences(ControllerCenter.getGlobalEnvStruct().mAppContext, com.efs.sdk.base.core.util.b.b.a(stringBuilder.toString().getBytes()));
                    this.a.registerOnSharedPreferenceChangeListener(this);
                }
            }
        }
    }

    public final boolean a(@NonNull b bVar) {
        c();
        if (this.a == null) {
            return false;
        }
        Editor edit = this.a.edit();
        edit.clear();
        edit.putInt("cver", bVar.a);
        edit.putLong("last_refresh_time", System.currentTimeMillis());
        for (Entry entry : bVar.f.entrySet()) {
            edit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        edit.apply();
        return true;
    }

    public final void c() {
        try {
            d();
        } catch (Throwable th) {
            Log.e("efs.config", "init sharedpreferences error", th);
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!f.a.a.a()) {
            c.a().b();
        }
    }
}
