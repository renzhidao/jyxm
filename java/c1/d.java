package c1;

import androidx.emoji2.text.flatbuffer.a;
import f0.l;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import l0.b;

public final class d implements HostnameVerifier {
    public static final d a = new d();

    public final String a(String str) {
        if (!c(str)) {
            return str;
        }
        Locale locale = Locale.US;
        b.w(locale, "US");
        str = str.toLowerCase(locale);
        b.w(str, "this as java.lang.String).toLowerCase(locale)");
        return str;
    }

    public final List<String> b(X509Certificate x509Certificate, int i) {
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return l.a;
            }
            List<String> arrayList = new ArrayList();
            for (List list : subjectAlternativeNames) {
                if (list != null) {
                    if (list.size() >= 2) {
                        if (b.j(list.get(0), Integer.valueOf(i))) {
                            Object obj = list.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return l.a;
        }
    }

    public final boolean c(String str) {
        int length = str.length();
        int length2 = str.length();
        if ((length2 >= 0 ? 1 : null) != null) {
            if ((length2 <= str.length() ? 1 : null) != null) {
                long j = 0;
                int i = 0;
                while (i < length2) {
                    char charAt = str.charAt(i);
                    if (charAt < 128) {
                        j++;
                    } else {
                        int i2;
                        if (charAt < 2048) {
                            i2 = 2;
                        } else if (charAt < 55296 || charAt > 57343) {
                            i2 = 3;
                        } else {
                            int i3 = i + 1;
                            char charAt2 = i3 < length2 ? str.charAt(i3) : 0;
                            if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                                j++;
                                i = i3;
                            } else {
                                j += (long) 4;
                                i += 2;
                            }
                        }
                        j += (long) i2;
                    }
                    i++;
                }
                return length == ((int) j);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("endIndex > string.length: ");
                stringBuilder.append(length2);
                stringBuilder.append(" > ");
                stringBuilder.append(str.length());
                throw new IllegalArgumentException(stringBuilder.toString().toString());
            }
        }
        throw new IllegalArgumentException(a.a("endIndex < beginIndex: ", length2, " < ", 0).toString());
    }

    /* DevToolsApp WARNING: Removed duplicated region for block: B:63:0x0114 A:{SYNTHETIC} */
    public final boolean d(java.lang.String r10, java.security.cert.X509Certificate r11) {
        /*
        r9 = this;
        r0 = "host";
        l0.b.x(r10, r0);
        r0 = "certificate";
        l0.b.x(r11, r0);
        r0 = r0.b.a(r10);
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x003f;
    L_0x0012:
        r10 = l0.b.q0(r10);
        r0 = 7;
        r11 = r9.b(r11, r0);
        r0 = r11.isEmpty();
        if (r0 == 0) goto L_0x0023;
    L_0x0021:
        goto L_0x0113;
    L_0x0023:
        r11 = r11.iterator();
    L_0x0027:
        r0 = r11.hasNext();
        if (r0 == 0) goto L_0x0113;
    L_0x002d:
        r0 = r11.next();
        r0 = (java.lang.String) r0;
        r0 = l0.b.q0(r0);
        r0 = l0.b.j(r10, r0);
        if (r0 == 0) goto L_0x0027;
    L_0x003d:
        goto L_0x0114;
    L_0x003f:
        r10 = r9.a(r10);
        r0 = 2;
        r11 = r9.b(r11, r0);
        r0 = r11.isEmpty();
        if (r0 == 0) goto L_0x0050;
    L_0x004e:
        goto L_0x0113;
    L_0x0050:
        r11 = r11.iterator();
    L_0x0054:
        r0 = r11.hasNext();
        if (r0 == 0) goto L_0x0113;
    L_0x005a:
        r0 = r11.next();
        r0 = (java.lang.String) r0;
        r3 = a;
        r4 = r10.length();
        if (r4 != 0) goto L_0x006a;
    L_0x0068:
        r4 = 1;
        goto L_0x006b;
    L_0x006a:
        r4 = 0;
    L_0x006b:
        if (r4 != 0) goto L_0x010f;
    L_0x006d:
        r4 = ".";
        r5 = p0.i.D0(r10, r4, r2);
        if (r5 != 0) goto L_0x010f;
    L_0x0075:
        r5 = "..";
        r6 = r10.endsWith(r5);
        if (r6 == 0) goto L_0x007f;
    L_0x007d:
        goto L_0x010f;
    L_0x007f:
        if (r0 == 0) goto L_0x008a;
    L_0x0081:
        r6 = r0.length();
        if (r6 != 0) goto L_0x0088;
    L_0x0087:
        goto L_0x008a;
    L_0x0088:
        r6 = 0;
        goto L_0x008b;
    L_0x008a:
        r6 = 1;
    L_0x008b:
        if (r6 != 0) goto L_0x010f;
    L_0x008d:
        r6 = p0.i.D0(r0, r4, r2);
        if (r6 != 0) goto L_0x010f;
    L_0x0093:
        r5 = r0.endsWith(r5);
        if (r5 == 0) goto L_0x009b;
    L_0x0099:
        goto L_0x010f;
    L_0x009b:
        r5 = r10.endsWith(r4);
        if (r5 != 0) goto L_0x00a6;
    L_0x00a1:
        r5 = l0.b.k0(r10, r4);
        goto L_0x00a7;
    L_0x00a6:
        r5 = r10;
    L_0x00a7:
        r6 = r0.endsWith(r4);
        if (r6 != 0) goto L_0x00b1;
    L_0x00ad:
        r0 = l0.b.k0(r0, r4);
    L_0x00b1:
        r0 = r3.a(r0);
        r3 = "*";
        r3 = p0.m.F0(r0, r3);
        if (r3 != 0) goto L_0x00c2;
    L_0x00bd:
        r0 = l0.b.j(r5, r0);
        goto L_0x0110;
    L_0x00c2:
        r3 = "*.";
        r4 = p0.i.D0(r0, r3, r2);
        if (r4 == 0) goto L_0x010f;
    L_0x00ca:
        r4 = 42;
        r6 = 4;
        r4 = p0.m.J0(r0, r4, r1, r2, r6);
        r7 = -1;
        if (r4 == r7) goto L_0x00d5;
    L_0x00d4:
        goto L_0x010f;
    L_0x00d5:
        r4 = r5.length();
        r8 = r0.length();
        if (r4 >= r8) goto L_0x00e0;
    L_0x00df:
        goto L_0x010f;
    L_0x00e0:
        r3 = l0.b.j(r3, r0);
        if (r3 == 0) goto L_0x00e7;
    L_0x00e6:
        goto L_0x010f;
    L_0x00e7:
        r0 = r0.substring(r1);
        r3 = "this as java.lang.String).substring(startIndex)";
        l0.b.w(r0, r3);
        r3 = r5.endsWith(r0);
        if (r3 != 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x010f;
    L_0x00f7:
        r3 = r5.length();
        r0 = r0.length();
        r3 = r3 - r0;
        if (r3 <= 0) goto L_0x010d;
    L_0x0102:
        r0 = 46;
        r3 = r3 + -1;
        r0 = p0.m.M0(r5, r0, r3, r6);
        if (r0 == r7) goto L_0x010d;
    L_0x010c:
        goto L_0x010f;
    L_0x010d:
        r0 = 1;
        goto L_0x0110;
    L_0x010f:
        r0 = 0;
    L_0x0110:
        if (r0 == 0) goto L_0x0054;
    L_0x0112:
        goto L_0x0114;
    L_0x0113:
        r1 = 0;
    L_0x0114:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.d.d(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        b.x(str, "host");
        b.x(sSLSession, com.umeng.analytics.pro.d.aw);
        boolean z = false;
        if (c(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                if (certificate != null) {
                    z = d(str, (X509Certificate) certificate);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return z;
            }
        }
    }
}
