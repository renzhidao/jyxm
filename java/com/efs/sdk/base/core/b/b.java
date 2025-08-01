package com.efs.sdk.base.core.b;

import androidx.annotation.Nullable;
import com.efs.sdk.base.core.util.Log;
import java.util.concurrent.ConcurrentHashMap;

public final class b {
    private ConcurrentHashMap<Byte, e> a = new ConcurrentHashMap();

    @Nullable
    public final e a(byte b) {
        if (!this.a.containsKey(Byte.valueOf(b))) {
            ConcurrentHashMap concurrentHashMap;
            Object valueOf;
            Object gVar;
            if (b == (byte) 1) {
                concurrentHashMap = this.a;
                valueOf = Byte.valueOf(b);
                gVar = new g();
            } else if (b != (byte) 2) {
                Log.w("efs.cache", "Cache module not support protocol ".concat(String.valueOf(b)));
            } else {
                concurrentHashMap = this.a;
                valueOf = Byte.valueOf(b);
                gVar = new d();
            }
            concurrentHashMap.putIfAbsent(valueOf, gVar);
        }
        return (e) this.a.get(Byte.valueOf(b));
    }
}
