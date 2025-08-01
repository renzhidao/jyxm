package com.efs.sdk.net.a.a;

import androidx.core.app.NotificationCompat.MessagingStyle.Message;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.net.a.a.f.a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public final class b {
    public Map<String, Long> a = new HashMap();

    public static long a(a aVar) {
        Throwable e;
        try {
            byte[] d = aVar.d();
            if (d != null) {
                return (long) d.length;
            }
        } catch (IOException e2) {
            e = e2;
            e.printStackTrace();
            return 0;
        } catch (OutOfMemoryError e3) {
            e = e3;
            e.printStackTrace();
            return 0;
        }
        return 0;
    }

    private static ByteArrayOutputStream a(InputStream inputStream, com.efs.sdk.net.a.b bVar, String str) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
                Log.e("NetTrace-Interceptor", "parse and save body, e is ".concat(String.valueOf(e)));
            }
        }
        byteArrayOutputStream.flush();
        inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        BufferedReader bufferedReader = Constants.CP_GZIP.equals(str) ? new BufferedReader(new InputStreamReader(new GZIPInputStream(inputStream))) : new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(readLine);
            stringBuilder2.append(10);
            stringBuilder.append(stringBuilder2.toString());
        }
        bVar.i = (long) stringBuilder.toString().getBytes().length;
        return byteArrayOutputStream;
    }

    public static InputStream a(String str, String str2, String str3, InputStream inputStream) {
        String str4 = "NetTrace-Interceptor";
        Log.i(str4, "save interpret response stream");
        com.efs.sdk.net.a.b a = com.efs.sdk.net.a.a.a().a(str);
        a.h = str2;
        if (str2 != null) {
            Object obj = (str2.contains(Message.KEY_TEXT) || str2.contains("json")) ? 1 : null;
            if (obj != null) {
                ByteArrayOutputStream a2 = a(inputStream, a, str3);
                InputStream byteArrayInputStream = new ByteArrayInputStream(a2.toByteArray());
                try {
                    a2.close();
                } catch (IOException e) {
                    Log.e(str4, "save interpret response stream, e is ".concat(String.valueOf(e)));
                }
                return byteArrayInputStream;
            }
        }
        a.i = 0;
        return inputStream;
    }
}
