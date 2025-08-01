package com.efs.sdk.base.core.util.b;

import android.util.Base64;
import com.efs.sdk.base.core.util.Log;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Locale;

public final class b {
    public static String a(String str) {
        String str2 = "";
        if (str == null || str.length() <= 0) {
            return str2;
        }
        try {
            BigInteger bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes()));
            str2 = String.format(Locale.CHINA, "%032x", new Object[]{bigInteger});
            return str2;
        } catch (Throwable e) {
            Log.e("efs.base", "md5 error", e);
            return str2;
        }
    }

    public static String a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11));
    }

    public static String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable e) {
            Log.e("efs.base", "urlEncode error", e);
            return "";
        }
    }

    public static String b(byte[] bArr) {
        try {
            return new String(Base64.decode(bArr, 11));
        } catch (Throwable th) {
            Log.e("efs.base", "decode error", th);
            return "";
        }
    }
}
