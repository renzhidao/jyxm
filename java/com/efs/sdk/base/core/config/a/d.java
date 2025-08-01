package com.efs.sdk.base.core.config.a;

import androidx.annotation.NonNull;
import com.efs.sdk.base.core.util.Log;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINA);

    private static void a(Map<String, String> map, JSONArray jSONArray) {
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                if (jSONObject != null && jSONObject.length() >= 2) {
                    Object optString = jSONObject.optString("opt");
                    Object opt = jSONObject.opt("set");
                    if (!(optString == null || opt == null)) {
                        String optString2 = jSONObject.optString("lt", null);
                        String optString3 = jSONObject.optString("net", null);
                        String str = "_";
                        if (optString2 != null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(optString);
                            stringBuilder.append(str);
                            stringBuilder.append(optString2);
                            optString = stringBuilder.toString();
                        }
                        if (optString3 != null) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(optString);
                            stringBuilder2.append(str);
                            stringBuilder2.append(optString3);
                            optString = stringBuilder2.toString();
                        }
                        map.put(optString, String.valueOf(opt));
                    }
                }
                i++;
            } catch (Throwable th) {
                Log.e("efs.config", "updateConfigCond error", th);
                return;
            }
        }
    }

    public static boolean a(@NonNull String str, @NonNull b bVar) {
        try {
            Map hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("config");
            int i = jSONObject.getInt("cver");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("common");
                if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                    Iterator keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String str2 = (String) keys.next();
                        hashMap.put(str2, optJSONObject2.optString(str2, ""));
                    }
                }
                JSONArray optJSONArray = optJSONObject.optJSONArray("app_configs");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = (JSONObject) optJSONArray.get(i2);
                        if (jSONObject2 != null && jSONObject2.length() == 2) {
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray("conditions");
                            JSONArray optJSONArray3 = jSONObject2.optJSONArray("actions");
                            if (!(optJSONArray2 == null || optJSONArray3 == null || optJSONArray3.length() <= 0)) {
                                a(hashMap, optJSONArray3);
                            }
                        }
                    }
                }
            }
            bVar.a(hashMap);
            bVar.a = i;
            return true;
        } catch (Throwable th) {
            Log.e("efs.config", "parseConfig error, data is ".concat(String.valueOf(str)), th);
            return false;
        }
    }
}
