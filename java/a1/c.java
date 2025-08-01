package a1;

import f0.m;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import l0.b;
import q0.w;
import t0.d;
import x0.e;

public final class c {
    public static final c a = null;
    public static final CopyOnWriteArraySet<Logger> b = new CopyOnWriteArraySet();
    public static final Map<String, String> c;

    static {
        Map map;
        Map linkedHashMap = new LinkedHashMap();
        Package packageR = w.class.getPackage();
        Object name = packageR == null ? null : packageR.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(w.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = m.a;
        } else if (size != 1) {
            map = new LinkedHashMap(linkedHashMap);
        } else {
            Entry entry = (Entry) linkedHashMap.entrySet().iterator().next();
            map = Collections.singletonMap(entry.getKey(), entry.getValue());
            b.w(map, "with(entries.iterator().…ingletonMap(key, value) }");
        }
        c = map;
    }
}
