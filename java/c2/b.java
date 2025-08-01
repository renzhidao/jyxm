package c2;

public final class b {
    public static final ThreadLocal<char[]> a = new a();

    public class a extends ThreadLocal<char[]> {
        public final Object initialValue() {
            return new char[256];
        }
    }

    public static String a(int i, int i2) {
        StringBuilder l = androidx.activity.a.l("bad utf-8 byte ");
        char[] cArr = new char[2];
        for (int i3 = 0; i3 < 2; i3++) {
            cArr[1 - i3] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        l.append(new String(cArr));
        l.append(" at offset ");
        char[] cArr2 = new char[8];
        for (int i4 = 0; i4 < 8; i4++) {
            cArr2[7 - i4] = Character.forDigit(i2 & 15, 16);
            i2 >>= 4;
        }
        l.append(new String(cArr2));
        throw new IllegalArgumentException(l.toString());
    }
}
