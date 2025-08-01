package com.efs.sdk.base.core.util.a;

import androidx.annotation.NonNull;
import com.efs.sdk.base.core.util.concurrent.b;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d {
    public b a;
    private List<b<HttpResponse>> b;

    public d(@NonNull String str) {
        b bVar = new b();
        this.a = bVar;
        bVar.a = str;
    }

    public final c a() {
        com.efs.sdk.base.core.util.concurrent.d cVar = new c(this.a);
        List list = this.b;
        if (list != null && list.size() > 0) {
            cVar.a(this.b);
        }
        list = HttpEnv.getInstance().getHttpListenerList();
        if (list != null && list.size() > 0) {
            cVar.a(list);
        }
        return cVar;
    }

    public final d a(@NonNull AbsHttpListener absHttpListener) {
        if (this.b == null) {
            this.b = new ArrayList(5);
        }
        this.b.add(absHttpListener);
        return this;
    }

    public final d a(String str, String str2) {
        b bVar = this.a;
        if (bVar.f == null) {
            bVar.f = new HashMap(5);
        }
        this.a.f.put(str, str2);
        return this;
    }

    public final d a(@NonNull Map<String, String> map) {
        this.a.b = map;
        return this;
    }
}
