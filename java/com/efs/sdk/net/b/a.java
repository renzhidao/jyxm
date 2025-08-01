package com.efs.sdk.net.b;

import java.util.Map;

public final class a {
    public static long a(Map<String, Long> map, String str, String str2) {
        if (!map.containsKey(str) || !map.containsKey(str2)) {
            return 0;
        }
        return ((Long) map.get(str2)).longValue() - ((Long) map.get(str)).longValue();
    }
}
