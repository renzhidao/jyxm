package a1;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import l0.b;
import p0.m;
import p0.n;

public final class d extends Handler {
    public static final d a = new d();

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord logRecord) {
        b.x(logRecord, "record");
        c cVar = c.a;
        String loggerName = logRecord.getLoggerName();
        b.w(loggerName, "record.loggerName");
        int i = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        Object message = logRecord.getMessage();
        b.w(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.c.get(loggerName);
        if (str == null) {
            str = n.T0(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(message);
                stringBuilder.append(10);
                stringBuilder.append(Log.getStackTraceString(thrown));
                message = stringBuilder.toString();
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int min;
                int J0 = m.J0(message, 10, i2, false, 4);
                if (J0 == -1) {
                    J0 = length;
                }
                while (true) {
                    min = Math.min(J0, i2 + 4000);
                    String substring = message.substring(i2, min);
                    b.w(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= J0) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }
}
