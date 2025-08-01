package c2;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Objects;

public class a extends RuntimeException {
    public StringBuffer a;

    public a(Throwable th, String str, Object... objArr) {
        str = str != null ? String.format(str, objArr) : th != null ? th.getMessage() : null;
        super(str, th);
        if (th instanceof a) {
            String stringBuffer = ((a) th).a.toString();
            StringBuffer stringBuffer2 = new StringBuffer(stringBuffer.length() + 200);
            this.a = stringBuffer2;
            stringBuffer2.append(stringBuffer);
            return;
        }
        this.a = new StringBuffer(200);
    }

    public static a a(Throwable th, String str, Object... objArr) {
        a aVar = th instanceof a ? (a) th : new a(th, null, new Object[0]);
        str = String.format(str, objArr);
        Objects.requireNonNull(str, "str == null");
        aVar.a.append(str);
        if (!str.endsWith("\n")) {
            aVar.a.append(10);
        }
        return aVar;
    }

    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.a);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.a);
    }
}
