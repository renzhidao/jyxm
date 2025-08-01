package b0;

import androidx.core.app.NotificationCompat.MessagingStyle.Message;
import com.efs.sdk.base.Constants;
import com.umeng.analytics.pro.cb;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;
import java.security.KeyStore;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.TrustManagerFactory;

public abstract class a {
    private static final Pattern CONTENT_DISPOSITION_ATTRIBUTE_PATTERN = Pattern.compile(CONTENT_DISPOSITION_ATTRIBUTE_REGEX);
    private static final String CONTENT_DISPOSITION_ATTRIBUTE_REGEX = "[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]";
    private static final Pattern CONTENT_DISPOSITION_PATTERN = Pattern.compile(CONTENT_DISPOSITION_REGEX, 2);
    private static final String CONTENT_DISPOSITION_REGEX = "([ |\t]*Content-Disposition[ |\t]*:)(.*)";
    private static final Pattern CONTENT_TYPE_PATTERN = Pattern.compile(CONTENT_TYPE_REGEX, 2);
    private static final String CONTENT_TYPE_REGEX = "([ |\t]*content-type[ |\t]*:)(.*)";
    private static final Logger LOG = Logger.getLogger(a.class.getName());
    public static final String MIME_HTML = "text/html";
    public static final String MIME_PLAINTEXT = "text/plain";
    public static Map<String, String> MIME_TYPES = null;
    private static final String QUERY_STRING_PARAMETER = "NanoHttpd.QUERY_STRING";
    public static final int SOCKET_READ_TIMEOUT = 5000;
    public a asyncRunner;
    private final String hostname;
    private final int myPort;
    private volatile ServerSocket myServerSocket;
    private Thread myThread;
    private r serverSocketFactory;
    private u tempFileManagerFactory;

    public interface a {
    }

    public class b implements Runnable {
        public final InputStream a;
        public final Socket b;

        public b(InputStream inputStream, Socket socket) {
            this.a = inputStream;
            this.b = socket;
        }

        public final void run() {
            Object obj = null;
            try {
                obj = this.b.getOutputStream();
                Objects.requireNonNull((j) a.this.tempFileManagerFactory);
                k kVar = new k(new i(), this.a, obj, this.b.getInetAddress());
                while (!this.b.isClosed()) {
                    kVar.d();
                }
            } catch (Throwable e) {
                if (!(((e instanceof SocketException) && "NanoHttpd Shutdown".equals(e.getMessage())) || (e instanceof SocketTimeoutException))) {
                    a.LOG.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", e);
                }
            } catch (Throwable th) {
                a.safeClose(null);
                a.safeClose(this.a);
                a.safeClose(this.b);
                ((f) a.this.asyncRunner).a(this);
            }
            a.safeClose(obj);
            a.safeClose(this.a);
            a.safeClose(this.b);
            ((f) a.this.asyncRunner).a(this);
        }
    }

    public static class c {
        public static final Pattern e = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
        public static final Pattern f = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
        public static final Pattern g = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public c(String str) {
            this.a = str;
            String str2 = "";
            if (str != null) {
                this.b = a(str, e, str2, 1);
                str2 = a(str, f, null, 2);
            } else {
                this.b = str2;
                str2 = "UTF-8";
            }
            this.c = str2;
            if ("multipart/form-data".equalsIgnoreCase(this.b)) {
                this.d = a(str, g, null, 2);
            } else {
                this.d = null;
            }
        }

        public final String a(String str, Pattern pattern, String str2, int i) {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(i) : str2;
        }

        public final String b() {
            String str = this.c;
            return str == null ? "US-ASCII" : str;
        }

        public final c c() {
            return this.c == null ? new c(androidx.activity.a.k(new StringBuilder(), this.a, "; charset=UTF-8")) : this;
        }
    }

    public static class d {
    }

    public class e implements Iterable<String> {
        public final HashMap<String, String> a = new HashMap();
        public final ArrayList<d> b = new ArrayList();

        public e(Map<String, String> map) {
            String str = (String) map.get("cookie");
            if (str != null) {
                for (String trim : str.split(";")) {
                    String[] split = trim.trim().split("=");
                    if (split.length == 2) {
                        this.a.put(split[0], split[1]);
                    }
                }
            }
        }

        public final Iterator<String> iterator() {
            return this.a.keySet().iterator();
        }

        public final void j(n nVar) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull((d) it.next());
                nVar.e.put("Set-Cookie", String.format("%s=%s; expires=%s", new Object[]{null, null, null}));
            }
        }
    }

    public interface l {
    }

    public enum m {
        PUT,
        POST,
        HEAD;

        public static m a(String str) {
            if (str == null) {
                return null;
            }
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static class n implements Closeable {
        public c a;
        public String b;
        public InputStream c;
        public long d;
        public final Map<String, String> e = new a();
        public final Map<String, String> f = new HashMap();
        public m g;
        public boolean h;
        public boolean i;
        public boolean j;

        public class a extends HashMap<String, String> {
            public final Object put(Object obj, Object obj2) {
                String str = (String) obj;
                String str2 = (String) obj2;
                n.this.f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            }
        }

        public static class b extends FilterOutputStream {
            public b(OutputStream outputStream) {
                super(outputStream);
            }

            public final void c() {
                this.out.write("0\r\n\r\n".getBytes());
            }

            public final void write(int i) {
                write(new byte[]{(byte) i}, 0, 1);
            }

            public final void write(byte[] bArr) {
                write(bArr, 0, bArr.length);
            }

            public final void write(byte[] bArr, int i, int i2) {
                if (i2 != 0) {
                    this.out.write(String.format("%x\r\n", new Object[]{Integer.valueOf(i2)}).getBytes());
                    this.out.write(bArr, i, i2);
                    this.out.write("\r\n".getBytes());
                }
            }
        }

        public interface c {
        }

        public enum d implements c {
            c(200, r3),
            BAD_REQUEST(400, "Bad Request"),
            NOT_FOUND(404, "Not Found"),
            EXPECTATION_FAILED(417, "Expectation Failed"),
            INTERNAL_ERROR(500, "Internal Server Error");
            
            public final int a;
            public final String b;

            public d(int i, String str) {
                this.a = i;
                this.b = str;
            }
        }

        public n(c cVar, String str, InputStream inputStream, long j) {
            this.a = cVar;
            this.b = str;
            boolean z = false;
            if (inputStream == null) {
                this.c = new ByteArrayInputStream(new byte[0]);
                this.d = 0;
            } else {
                this.c = inputStream;
                this.d = j;
            }
            if (this.d < 0) {
                z = true;
            }
            this.h = z;
            this.j = true;
        }

        public final void C(PrintWriter printWriter, String str, String str2) {
            printWriter.append(str).append(": ").append(str2).append("\r\n");
        }

        public final void D(OutputStream outputStream) {
            DateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            try {
                if (this.a != null) {
                    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream, new c(this.b).b())), false);
                    PrintWriter append = printWriter.append("HTTP/1.1 ");
                    d dVar = (d) this.a;
                    Objects.requireNonNull(dVar);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("");
                    stringBuilder.append(dVar.a);
                    stringBuilder.append(" ");
                    stringBuilder.append(dVar.b);
                    append.append(stringBuilder.toString()).append(" \r\n");
                    String str = this.b;
                    if (str != null) {
                        C(printWriter, "Content-Type", str);
                    }
                    if (c("date") == null) {
                        C(printWriter, "Date", simpleDateFormat.format(new Date()));
                    }
                    for (Entry entry : this.e.entrySet()) {
                        C(printWriter, (String) entry.getKey(), (String) entry.getValue());
                    }
                    if (c("connection") == null) {
                        C(printWriter, "Connection", this.j ? "keep-alive" : "close");
                    }
                    if (c("content-length") != null) {
                        this.i = false;
                    }
                    if (this.i) {
                        C(printWriter, "Content-Encoding", Constants.CP_GZIP);
                        this.h = true;
                    }
                    long j = this.c != null ? this.d : 0;
                    m mVar = this.g;
                    m mVar2 = m.HEAD;
                    if (mVar != mVar2 && this.h) {
                        C(printWriter, "Transfer-Encoding", "chunked");
                    } else if (!this.i) {
                        j = G(printWriter, j);
                    }
                    printWriter.append("\r\n");
                    printWriter.flush();
                    if (this.g == mVar2 || !this.h) {
                        F(outputStream, j);
                    } else {
                        OutputStream bVar = new b(outputStream);
                        F(bVar, -1);
                        bVar.c();
                    }
                    outputStream.flush();
                    a.safeClose(this.c);
                    return;
                }
                throw new Error("sendResponse(): Status can't be null.");
            } catch (Throwable e) {
                a.LOG.log(Level.SEVERE, "Could not send response to the client", e);
            }
        }

        public final void E(OutputStream outputStream, long j) {
            byte[] bArr = new byte[((int) 16384)];
            Object obj = j == -1 ? 1 : null;
            while (true) {
                if (j > 0 || obj != null) {
                    int read = this.c.read(bArr, 0, (int) (obj != null ? 16384 : Math.min(j, 16384)));
                    if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        if (obj == null) {
                            j -= (long) read;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
        }

        public final void F(OutputStream outputStream, long j) {
            if (this.i) {
                OutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                E(gZIPOutputStream, -1);
                gZIPOutputStream.finish();
                return;
            }
            E(outputStream, j);
        }

        public final long G(PrintWriter printWriter, long j) {
            String c = c("content-length");
            if (c != null) {
                try {
                    j = Long.parseLong(c);
                } catch (NumberFormatException unused) {
                    Logger access$200 = a.LOG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("content-length was no number ");
                    stringBuilder.append(c);
                    access$200.severe(stringBuilder.toString());
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Content-Length: ");
            stringBuilder2.append(j);
            stringBuilder2.append("\r\n");
            printWriter.print(stringBuilder2.toString());
            return j;
        }

        public final void H(boolean z) {
            this.i = z;
        }

        public final void I(boolean z) {
            this.j = z;
        }

        public final void J(m mVar) {
            this.g = mVar;
        }

        public final String c(String str) {
            return (String) this.f.get(str.toLowerCase());
        }

        public final void close() {
            InputStream inputStream = this.c;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        public final boolean d() {
            return "close".equals(c("connection"));
        }
    }

    public static final class o extends Exception {
        public final d a;

        public o(d dVar, String str) {
            super(str);
            this.a = dVar;
        }

        public o(String str, Exception exception) {
            d dVar = d.INTERNAL_ERROR;
            super(str, exception);
            this.a = dVar;
        }

        public final d a() {
            return this.a;
        }
    }

    public class q implements Runnable {
        public final int a;
        public IOException b;
        public boolean c = false;

        public q(int i) {
            this.a = i;
        }

        public final void run() {
            try {
                a.this.myServerSocket.bind(a.this.hostname != null ? new InetSocketAddress(a.this.hostname, a.this.myPort) : new InetSocketAddress(a.this.myPort));
                this.c = true;
                do {
                    try {
                        Socket accept = a.this.myServerSocket.accept();
                        int i = this.a;
                        if (i > 0) {
                            accept.setSoTimeout(i);
                        }
                        InputStream inputStream = accept.getInputStream();
                        a aVar = a.this;
                        ((f) aVar.asyncRunner).b(aVar.createClientHandler(accept, inputStream));
                    } catch (Throwable e) {
                        a.LOG.log(Level.FINE, "Communication with the client broken", e);
                    }
                } while (!a.this.myServerSocket.isClosed());
            } catch (IOException e2) {
                this.b = e2;
            }
        }
    }

    public interface r {
        ServerSocket a();
    }

    public interface s {
        void a();
    }

    public interface t {
    }

    public interface u {
    }

    public static class f implements a {
        public long a;
        public final List<b> b = Collections.synchronizedList(new ArrayList());

        public final void a(b bVar) {
            this.b.remove(bVar);
        }

        public final void b(b bVar) {
            this.a++;
            Thread thread = new Thread(bVar);
            thread.setDaemon(true);
            StringBuilder l = androidx.activity.a.l("NanoHttpd Request Processor (#");
            l.append(this.a);
            l.append(")");
            thread.setName(l.toString());
            this.b.add(bVar);
            thread.start();
        }
    }

    public static class g implements r {
        public final ServerSocket a() {
            return new ServerSocket();
        }
    }

    public static class h implements s {
        public final File a;
        public final FileOutputStream b;

        public h(File file) {
            file = File.createTempFile("NanoHTTPD-", "", file);
            this.a = file;
            this.b = new FileOutputStream(file);
        }

        public final void a() {
            a.safeClose(this.b);
            if (!this.a.delete()) {
                StringBuilder l = androidx.activity.a.l("could not delete temporary file: ");
                l.append(this.a.getAbsolutePath());
                throw new Exception(l.toString());
            }
        }

        public final String b() {
            return this.a.getAbsolutePath();
        }
    }

    public static class i implements t {
        public final File a;
        public final List<s> b;

        public i() {
            File file = new File(System.getProperty("java.io.tmpdir"));
            this.a = file;
            if (!file.exists()) {
                file.mkdirs();
            }
            this.b = new ArrayList();
        }

        public final void a() {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                try {
                    ((s) it.next()).a();
                } catch (Throwable e) {
                    a.LOG.log(Level.WARNING, "could not delete file ", e);
                }
            }
            this.b.clear();
        }
    }

    public class j implements u {
    }

    public class k implements l {
        public final t a;
        public final OutputStream b;
        public final BufferedInputStream c;
        public int d;
        public int e;
        public String f;
        public m g;
        public Map<String, List<String>> h;
        public Map<String, String> i;
        public e j;
        public String k;
        public String l;
        public String m;

        public k(t tVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.a = tVar;
            this.c = new BufferedInputStream(inputStream, 8192);
            this.b = outputStream;
            String str = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            this.l = str;
            if (!(inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress())) {
                Objects.requireNonNull(inetAddress.getHostName());
            }
            this.i = new HashMap();
        }

        public final void a(BufferedReader bufferedReader, Map<String, String> map, Map<String, List<String>> map2, Map<String, String> map3) {
            d dVar = d.BAD_REQUEST;
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                    if (stringTokenizer.hasMoreTokens()) {
                        map.put("method", stringTokenizer.nextToken());
                        if (stringTokenizer.hasMoreTokens()) {
                            Object decodePercent;
                            String nextToken = stringTokenizer.nextToken();
                            int indexOf = nextToken.indexOf(63);
                            if (indexOf >= 0) {
                                c(nextToken.substring(indexOf + 1), map2);
                                decodePercent = a.decodePercent(nextToken.substring(0, indexOf));
                            } else {
                                decodePercent = a.decodePercent(nextToken);
                            }
                            if (stringTokenizer.hasMoreTokens()) {
                                this.m = stringTokenizer.nextToken();
                            } else {
                                this.m = "HTTP/1.1";
                                a.LOG.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                            }
                            while (true) {
                                nextToken = bufferedReader.readLine();
                                if (nextToken == null || nextToken.trim().isEmpty()) {
                                    map.put(Message.KEY_DATA_URI, decodePercent);
                                } else {
                                    indexOf = nextToken.indexOf(58);
                                    if (indexOf >= 0) {
                                        map3.put(nextToken.substring(0, indexOf).trim().toLowerCase(Locale.US), nextToken.substring(indexOf + 1).trim());
                                    }
                                }
                            }
                            map.put(Message.KEY_DATA_URI, decodePercent);
                            return;
                        }
                        throw new o(dVar, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                    }
                    throw new o(dVar, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
            } catch (Exception e) {
                StringBuilder l = androidx.activity.a.l("SERVER INTERNAL ERROR: IOException: ");
                l.append(e.getMessage());
                throw new o(l.toString(), e);
            }
        }

        public final void b(c cVar, ByteBuffer byteBuffer, Map<String, List<String>> map, Map<String, String> map2) {
            c cVar2 = cVar;
            ByteBuffer byteBuffer2 = byteBuffer;
            Map<String, List<String>> map3 = map;
            Map<String, String> map4 = map2;
            d dVar = d.BAD_REQUEST;
            d dVar2 = d.INTERNAL_ERROR;
            try {
                int[] f = f(byteBuffer2, cVar2.d.getBytes());
                if (f.length >= 2) {
                    int i = 1024;
                    byte[] bArr = new byte[1024];
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < f.length - 1) {
                        byteBuffer2.position(f[i3]);
                        int remaining = byteBuffer.remaining() < i ? byteBuffer.remaining() : 1024;
                        byteBuffer2.get(bArr, i2, remaining);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i2, remaining), Charset.forName(cVar.b())), remaining);
                        String readLine = bufferedReader.readLine();
                        if (readLine == null || !readLine.contains(cVar2.d)) {
                            throw new o(dVar, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                        }
                        d dVar3;
                        CharSequence readLine2 = bufferedReader.readLine();
                        i2 = null;
                        String str = null;
                        int i4 = 0;
                        int i5 = 2;
                        Object obj = str;
                        while (readLine2 != null && readLine2.trim().length() > 0) {
                            Matcher matcher = a.CONTENT_DISPOSITION_PATTERN.matcher(readLine2);
                            if (matcher.matches()) {
                                String str2;
                                dVar3 = dVar;
                                matcher = a.CONTENT_DISPOSITION_ATTRIBUTE_PATTERN.matcher(matcher.group(2));
                                while (matcher.find()) {
                                    Matcher matcher2;
                                    str2 = obj;
                                    String group = matcher.group(1);
                                    if ("name".equalsIgnoreCase(group)) {
                                        i2 = matcher.group(2);
                                    } else if ("filename".equalsIgnoreCase(group)) {
                                        obj = matcher.group(2);
                                        if (obj.isEmpty()) {
                                            matcher2 = matcher;
                                        } else if (i4 > 0) {
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append(i2);
                                            i2 = i4 + 1;
                                            matcher2 = matcher;
                                            stringBuilder.append(String.valueOf(i4));
                                            i4 = i2;
                                            i2 = stringBuilder.toString();
                                        } else {
                                            matcher2 = matcher;
                                            i4++;
                                        }
                                        matcher = matcher2;
                                    }
                                    matcher2 = matcher;
                                    obj = str2;
                                    matcher = matcher2;
                                }
                                str2 = obj;
                            } else {
                                dVar3 = dVar;
                            }
                            matcher = a.CONTENT_TYPE_PATTERN.matcher(readLine2);
                            if (matcher.matches()) {
                                str = matcher.group(2).trim();
                            }
                            readLine2 = bufferedReader.readLine();
                            i5++;
                            cVar2 = cVar;
                            dVar = dVar3;
                        }
                        dVar3 = dVar;
                        int i6 = 0;
                        while (true) {
                            i = i5 - 1;
                            if (i5 <= 0) {
                                break;
                            }
                            while (true) {
                                byte b = bArr[i6];
                                i6++;
                                if (b == (byte) 10) {
                                    break;
                                }
                            }
                            i5 = i;
                        }
                        if (i6 < remaining - 4) {
                            int i7 = f[i3] + i6;
                            i3++;
                            i6 = f[i3] - 4;
                            byteBuffer2.position(i7);
                            List list = (List) map3.get(i2);
                            if (list == null) {
                                list = new ArrayList();
                                map3.put(i2, list);
                            }
                            i6 -= i7;
                            if (str == null) {
                                byte[] bArr2 = new byte[i6];
                                byteBuffer2.get(bArr2);
                                list.add(new String(bArr2, cVar.b()));
                            } else {
                                String i8 = i(byteBuffer2, i7, i6);
                                if (map4.containsKey(i2)) {
                                    StringBuilder stringBuilder2;
                                    i7 = 2;
                                    while (true) {
                                        stringBuilder2 = new StringBuilder();
                                        stringBuilder2.append(i2);
                                        stringBuilder2.append(i7);
                                        if (!map4.containsKey(stringBuilder2.toString())) {
                                            break;
                                        }
                                        i7++;
                                    }
                                    stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append(i2);
                                    stringBuilder2.append(i7);
                                    map4.put(stringBuilder2.toString(), i8);
                                } else {
                                    map4.put(i2, i8);
                                }
                                list.add(obj);
                            }
                            cVar2 = cVar;
                            int i9 = i4;
                            dVar = dVar3;
                            i = 1024;
                        } else {
                            throw new o(dVar2, "Multipart header size exceeds MAX_HEADER_SIZE.");
                        }
                    }
                    return;
                }
                throw new o(dVar, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
            } catch (o e) {
                throw e;
            } catch (Exception e2) {
                throw new o(dVar2, e2.toString());
            }
        }

        public final void c(String str, Map<String, List<String>> map) {
            String str2 = "";
            if (str == null) {
                this.k = str2;
                return;
            }
            this.k = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                Object trim;
                Object decodePercent;
                str = stringTokenizer.nextToken();
                int indexOf = str.indexOf(61);
                if (indexOf >= 0) {
                    trim = a.decodePercent(str.substring(0, indexOf)).trim();
                    decodePercent = a.decodePercent(str.substring(indexOf + 1));
                } else {
                    trim = a.decodePercent(str).trim();
                    decodePercent = str2;
                }
                List list = (List) map.get(trim);
                if (list == null) {
                    list = new ArrayList();
                    map.put(trim, list);
                }
                list.add(decodePercent);
            }
        }

        /* DevToolsApp WARNING: Removed duplicated region for block: B:19:0x0064 A:{Splitter: B:1:0x000b, Catch:{ SSLException -> 0x0177, IOException -> 0x0167, o -> 0x0064, all -> 0x0061, SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }, ExcHandler: b0.a.o (r0_27 'e' java.lang.Throwable)} */
        /* DevToolsApp WARNING: Missing block: B:19:0x0064, code:
            r0 = move-exception;
     */
        /* DevToolsApp WARNING: Missing block: B:59:?, code:
            b0.a.newFixedLengthResponse(r0.a(), r2, r0.getMessage()).D(r11.b);
     */
        public final void d() {
            /*
            r11 = this;
            r0 = "method";
            r1 = "NanoHttpd Shutdown";
            r2 = "text/plain";
            r3 = b0.a.n.d.INTERNAL_ERROR;
            r4 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
            r5 = 0;
            r6 = new byte[r4];	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r7 = 0;
            r11.d = r7;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r11.e = r7;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = r11.c;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8.mark(r4);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = r11.c;	 Catch:{ SSLException -> 0x0177, IOException -> 0x0167, o -> 0x0064 }
            r4 = r8.read(r6, r7, r4);	 Catch:{ SSLException -> 0x0177, IOException -> 0x0167, o -> 0x0064 }
            r8 = -1;
            if (r4 == r8) goto L_0x0157;
        L_0x0020:
            if (r4 <= 0) goto L_0x003b;
        L_0x0022:
            r8 = r11.e;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = r8 + r4;
            r11.e = r8;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = r11.e(r6, r8);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r11.d = r4;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            if (r4 <= 0) goto L_0x0030;
        L_0x002f:
            goto L_0x003b;
        L_0x0030:
            r4 = r11.c;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = r11.e;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r9 = 8192 - r8;
            r4 = r4.read(r6, r8, r9);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            goto L_0x0020;
        L_0x003b:
            r4 = r11.d;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = r11.e;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            if (r4 >= r8) goto L_0x004e;
        L_0x0041:
            r4 = r11.c;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4.reset();	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = r11.c;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = r11.d;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = (long) r8;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4.skip(r8);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
        L_0x004e:
            r4 = new java.util.HashMap;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4.<init>();	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r11.h = r4;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = r11.i;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            if (r4 != 0) goto L_0x006a;
        L_0x0059:
            r4 = new java.util.HashMap;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4.<init>();	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r11.i = r4;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            goto L_0x006d;
        L_0x0061:
            r0 = move-exception;
            goto L_0x01de;
        L_0x0064:
            r0 = move-exception;
            goto L_0x0179;
        L_0x0067:
            r0 = move-exception;
            goto L_0x018d;
        L_0x006a:
            r4.clear();	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
        L_0x006d:
            r4 = new java.io.BufferedReader;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = new java.io.InputStreamReader;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r9 = new java.io.ByteArrayInputStream;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r10 = r11.e;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r9.<init>(r6, r7, r10);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8.<init>(r9);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4.<init>(r8);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r6 = new java.util.HashMap;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r6.<init>();	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = r11.h;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r9 = r11.i;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r11.a(r4, r6, r8, r9);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = r11.l;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            if (r4 == 0) goto L_0x009e;
        L_0x008e:
            r8 = r11.i;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r9 = "remote-addr";
            r8.put(r9, r4);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = r11.i;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = "http-client-ip";
            r9 = r11.l;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4.put(r8, r9);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
        L_0x009e:
            r4 = r6.get(r0);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = (java.lang.String) r4;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = b0.a.m.a(r4);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r11.g = r4;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            if (r4 == 0) goto L_0x0133;
        L_0x00ac:
            r0 = "uri";
            r0 = r6.get(r0);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = (java.lang.String) r0;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r11.f = r0;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = new b0.a$e;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = r11.i;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0.<init>(r4);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r11.j = r0;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = r11.i;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = "connection";
            r0 = r0.get(r4);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = (java.lang.String) r0;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = "HTTP/1.1";
            r6 = r11.m;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = r4.equals(r6);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r6 = 1;
            if (r4 == 0) goto L_0x00e0;
        L_0x00d4:
            if (r0 == 0) goto L_0x00de;
        L_0x00d6:
            r4 = "(?i).*close.*";
            r0 = r0.matches(r4);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            if (r0 != 0) goto L_0x00e0;
        L_0x00de:
            r0 = 1;
            goto L_0x00e1;
        L_0x00e0:
            r0 = 0;
        L_0x00e1:
            r4 = b0.a.this;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r5 = r4.serve(r11);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            if (r5 == 0) goto L_0x012b;
        L_0x00e9:
            r4 = r11.i;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = "accept-encoding";
            r4 = r4.get(r8);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = (java.lang.String) r4;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = r11.j;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8.j(r5);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = r11.g;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r5.J(r8);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = b0.a.this;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = r8.useGzipWhenAccepted(r5);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            if (r8 == 0) goto L_0x0110;
        L_0x0105:
            if (r4 == 0) goto L_0x0110;
        L_0x0107:
            r8 = "gzip";
            r4 = r4.contains(r8);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            if (r4 == 0) goto L_0x0110;
        L_0x010f:
            r7 = 1;
        L_0x0110:
            r5.H(r7);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r5.I(r0);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = r11.b;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r5.D(r4);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            if (r0 == 0) goto L_0x0125;
        L_0x011d:
            r0 = r5.d();	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            if (r0 != 0) goto L_0x0125;
        L_0x0123:
            goto L_0x01cf;
        L_0x0125:
            r0 = new java.net.SocketException;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0.<init>(r1);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            throw r0;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
        L_0x012b:
            r0 = new b0.a$o;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r1 = "SERVER INTERNAL ERROR: Serve() returned a null response.";
            r0.<init>(r3, r1);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            throw r0;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
        L_0x0133:
            r1 = new b0.a$o;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r4 = b0.a.n.d.BAD_REQUEST;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r7 = new java.lang.StringBuilder;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r7.<init>();	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r8 = "BAD REQUEST: Syntax error. HTTP verb ";
            r7.append(r8);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = r6.get(r0);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = (java.lang.String) r0;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r7.append(r0);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = " unhandled.";
            r7.append(r0);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = r7.toString();	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r1.<init>(r4, r0);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            throw r1;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
        L_0x0157:
            r0 = r11.c;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            b0.a.safeClose(r0);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = r11.b;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            b0.a.safeClose(r0);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = new java.net.SocketException;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0.<init>(r1);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            throw r0;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
        L_0x0167:
            r0 = r11.c;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            b0.a.safeClose(r0);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = r11.b;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            b0.a.safeClose(r0);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0 = new java.net.SocketException;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            r0.<init>(r1);	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
            throw r0;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
        L_0x0177:
            r0 = move-exception;
            throw r0;	 Catch:{ SocketException -> 0x01dc, SocketTimeoutException -> 0x01da, SSLException -> 0x01ac, IOException -> 0x0067, o -> 0x0064 }
        L_0x0179:
            r1 = r0.a();	 Catch:{ all -> 0x0061 }
            r0 = r0.getMessage();	 Catch:{ all -> 0x0061 }
            r0 = b0.a.newFixedLengthResponse(r1, r2, r0);	 Catch:{ all -> 0x0061 }
            r1 = r11.b;	 Catch:{ all -> 0x0061 }
            r0.D(r1);	 Catch:{ all -> 0x0061 }
        L_0x018a:
            r0 = r11.b;	 Catch:{ all -> 0x0061 }
            goto L_0x01cc;
        L_0x018d:
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0061 }
            r1.<init>();	 Catch:{ all -> 0x0061 }
            r4 = "SERVER INTERNAL ERROR: IOException: ";
            r1.append(r4);	 Catch:{ all -> 0x0061 }
            r0 = r0.getMessage();	 Catch:{ all -> 0x0061 }
            r1.append(r0);	 Catch:{ all -> 0x0061 }
            r0 = r1.toString();	 Catch:{ all -> 0x0061 }
            r0 = b0.a.newFixedLengthResponse(r3, r2, r0);	 Catch:{ all -> 0x0061 }
            r1 = r11.b;	 Catch:{ all -> 0x0061 }
            r0.D(r1);	 Catch:{ all -> 0x0061 }
            goto L_0x018a;
        L_0x01ac:
            r0 = move-exception;
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0061 }
            r1.<init>();	 Catch:{ all -> 0x0061 }
            r4 = "SSL PROTOCOL FAILURE: ";
            r1.append(r4);	 Catch:{ all -> 0x0061 }
            r0 = r0.getMessage();	 Catch:{ all -> 0x0061 }
            r1.append(r0);	 Catch:{ all -> 0x0061 }
            r0 = r1.toString();	 Catch:{ all -> 0x0061 }
            r0 = b0.a.newFixedLengthResponse(r3, r2, r0);	 Catch:{ all -> 0x0061 }
            r1 = r11.b;	 Catch:{ all -> 0x0061 }
            r0.D(r1);	 Catch:{ all -> 0x0061 }
            goto L_0x018a;
        L_0x01cc:
            b0.a.safeClose(r0);	 Catch:{ all -> 0x0061 }
        L_0x01cf:
            b0.a.safeClose(r5);
            r0 = r11.a;
            r0 = (b0.a.i) r0;
            r0.a();
            return;
        L_0x01da:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x0061 }
        L_0x01dc:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x0061 }
        L_0x01de:
            b0.a.safeClose(r5);
            r1 = r11.a;
            r1 = (b0.a.i) r1;
            r1.a();
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.a.k.d():void");
        }

        public final int e(byte[] bArr, int i) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i3 >= i) {
                    return 0;
                }
                if (bArr[i2] == cb.k && bArr[i3] == (byte) 10) {
                    int i4 = i2 + 3;
                    if (i4 < i && bArr[i2 + 2] == cb.k && bArr[i4] == (byte) 10) {
                        return i2 + 4;
                    }
                }
                if (bArr[i2] == (byte) 10 && bArr[i3] == (byte) 10) {
                    return i2 + 2;
                }
                i2 = i3;
            }
        }

        public final int[] f(ByteBuffer byteBuffer, byte[] bArr) {
            int[] iArr = new int[0];
            if (byteBuffer.remaining() < bArr.length) {
                return iArr;
            }
            int length = bArr.length + 4096;
            Object obj = new byte[length];
            int remaining = byteBuffer.remaining() < length ? byteBuffer.remaining() : length;
            byteBuffer.get(obj, 0, remaining);
            remaining -= bArr.length;
            int i = 0;
            do {
                int i2 = 0;
                while (i2 < remaining) {
                    int i3 = 0;
                    while (i3 < bArr.length && obj[i2 + i3] == bArr[i3]) {
                        if (i3 == bArr.length - 1) {
                            Object obj2 = new int[(iArr.length + 1)];
                            System.arraycopy(iArr, 0, obj2, 0, iArr.length);
                            obj2[iArr.length] = i + i2;
                            iArr = obj2;
                        }
                        i3++;
                    }
                    i2++;
                }
                i += remaining;
                System.arraycopy(obj, length - bArr.length, obj, 0, bArr.length);
                remaining = length - bArr.length;
                if (byteBuffer.remaining() < remaining) {
                    remaining = byteBuffer.remaining();
                }
                byteBuffer.get(obj, bArr.length, remaining);
            } while (remaining > 0);
            return iArr;
        }

        public final RandomAccessFile g() {
            try {
                i iVar = (i) this.a;
                h hVar = new h(iVar.a);
                iVar.b.add(hVar);
                return new RandomAccessFile(hVar.b(), "rw");
            } catch (Throwable e) {
                throw new Error(e);
            }
        }

        public final void h(Map<String, String> map) {
            Throwable th;
            Map<String, String> map2 = map;
            Object obj = null;
            try {
                long parseLong;
                RandomAccessFile randomAccessFile;
                ByteArrayOutputStream byteArrayOutputStream;
                DataOutput dataOutput;
                String str = "content-length";
                if (this.i.containsKey(str)) {
                    parseLong = Long.parseLong((String) this.i.get(str));
                } else {
                    int i = this.d;
                    int i2 = this.e;
                    parseLong = i < i2 ? (long) (i2 - i) : 0;
                }
                if (parseLong < 1024) {
                    OutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream2);
                    randomAccessFile = null;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    dataOutput = dataOutputStream;
                } else {
                    randomAccessFile = g();
                    dataOutput = randomAccessFile;
                }
                try {
                    Buffer wrap;
                    Object obj2;
                    byte[] bArr = new byte[512];
                    while (this.e >= 0 && parseLong > 0) {
                        int read = this.c.read(bArr, 0, (int) Math.min(parseLong, 512));
                        this.e = read;
                        parseLong -= (long) read;
                        if (read > 0) {
                            dataOutput.write(bArr, 0, read);
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                    } else {
                        wrap = randomAccessFile.getChannel().map(MapMode.READ_ONLY, 0, randomAccessFile.length());
                        randomAccessFile.seek(0);
                    }
                    if (m.POST.equals(this.g)) {
                        c cVar = new c((String) this.i.get("content-type"));
                        if (!"multipart/form-data".equalsIgnoreCase(cVar.b)) {
                            byte[] bArr2 = new byte[wrap.remaining()];
                            wrap.get(bArr2);
                            obj = new String(bArr2, cVar.b()).trim();
                            if ("application/x-www-form-urlencoded".equalsIgnoreCase(cVar.b)) {
                                c(obj, this.h);
                            } else if (obj.length() != 0) {
                                obj2 = "postData";
                            }
                        } else if (cVar.d != null) {
                            b(cVar, wrap, this.h, map2);
                        } else {
                            throw new o(d.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                        }
                        a.safeClose(randomAccessFile);
                    }
                    if (m.PUT.equals(this.g)) {
                        obj2 = "content";
                        obj = i(wrap, 0, wrap.limit());
                    }
                    a.safeClose(randomAccessFile);
                    map2.put(obj2, obj);
                    a.safeClose(randomAccessFile);
                } catch (Throwable th2) {
                    th = th2;
                    obj = randomAccessFile;
                    a.safeClose(obj);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                a.safeClose(obj);
                throw th;
            }
        }

        public final String i(ByteBuffer byteBuffer, int i, int i2) {
            Throwable e;
            if (i2 <= 0) {
                return "";
            }
            Object obj = null;
            try {
                i iVar = (i) this.a;
                h hVar = new h(iVar.a);
                iVar.b.add(hVar);
                byteBuffer = byteBuffer.duplicate();
                Object fileOutputStream = new FileOutputStream(hVar.b());
                try {
                    FileChannel channel = fileOutputStream.getChannel();
                    byteBuffer.position(i).limit(i + i2);
                    channel.write(byteBuffer.slice());
                    String b = hVar.b();
                    a.safeClose(fileOutputStream);
                    return b;
                } catch (Exception e2) {
                    e = e2;
                    obj = fileOutputStream;
                    try {
                        throw new Error(e);
                    } catch (Throwable th) {
                        e = th;
                        fileOutputStream = obj;
                        a.safeClose(fileOutputStream);
                        throw e;
                    }
                } catch (Throwable th2) {
                    e = th2;
                    a.safeClose(fileOutputStream);
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
                throw new Error(e);
            }
        }
    }

    public static class p implements r {
        public SSLServerSocketFactory a;
        public String[] b;

        public p(SSLServerSocketFactory sSLServerSocketFactory, String[] strArr) {
            this.a = sSLServerSocketFactory;
            this.b = strArr;
        }

        public final ServerSocket a() {
            SSLServerSocket sSLServerSocket = (SSLServerSocket) this.a.createServerSocket();
            String[] strArr = this.b;
            if (strArr != null) {
                sSLServerSocket.setEnabledProtocols(strArr);
            } else {
                sSLServerSocket.setEnabledProtocols(sSLServerSocket.getSupportedProtocols());
            }
            sSLServerSocket.setUseClientMode(false);
            sSLServerSocket.setWantClientAuth(false);
            sSLServerSocket.setNeedClientAuth(false);
            return sSLServerSocket;
        }
    }

    public a(int i) {
        this(null, i);
    }

    public a(String str, int i) {
        this.serverSocketFactory = new g();
        this.hostname = str;
        this.myPort = i;
        setTempFileManagerFactory(new j());
        setAsyncRunner(new f());
    }

    public static Map<String, List<String>> decodeParameters(String str) {
        Map hashMap = new HashMap();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                str = stringTokenizer.nextToken();
                int indexOf = str.indexOf(61);
                String trim = (indexOf >= 0 ? decodePercent(str.substring(0, indexOf)) : decodePercent(str)).trim();
                if (!hashMap.containsKey(trim)) {
                    hashMap.put(trim, new ArrayList());
                }
                Object decodePercent = indexOf >= 0 ? decodePercent(str.substring(indexOf + 1)) : null;
                if (decodePercent != null) {
                    ((List) hashMap.get(trim)).add(decodePercent);
                }
            }
        }
        return hashMap;
    }

    public static Map<String, List<String>> decodeParameters(Map<String, String> map) {
        return decodeParameters((String) map.get(QUERY_STRING_PARAMETER));
    }

    public static String decodePercent(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (Throwable e) {
            LOG.log(Level.WARNING, "Encoding not supported, ignored", e);
            return null;
        }
    }

    public static String getMimeTypeForFile(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        str = lastIndexOf >= 0 ? (String) mimeTypes().get(str.substring(lastIndexOf + 1).toLowerCase()) : null;
        return str == null ? "application/octet-stream" : str;
    }

    private static void loadMimeTypes(Map<String, String> map, String str) {
        Object obj;
        try {
            Enumeration resources = a.class.getClassLoader().getResources(str);
            while (resources.hasMoreElements()) {
                URL url = (URL) resources.nextElement();
                Map properties = new Properties();
                obj = null;
                try {
                    obj = url.openStream();
                    properties.load(obj);
                } catch (Throwable e) {
                    Logger logger = LOG;
                    Level level = Level.SEVERE;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("could not load mimetypes from ");
                    stringBuilder.append(url);
                    logger.log(level, stringBuilder.toString(), e);
                }
                safeClose(obj);
                map.putAll(properties);
            }
        } catch (IOException unused) {
            Logger logger2 = LOG;
            Level level2 = Level.INFO;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("no mime types available at ");
            stringBuilder2.append(str);
            logger2.log(level2, stringBuilder2.toString());
        } catch (Throwable th) {
            safeClose(obj);
        }
    }

    public static SSLServerSocketFactory makeSSLSocketFactory(String str, char[] cArr) {
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            InputStream resourceAsStream = a.class.getResourceAsStream(str);
            if (resourceAsStream != null) {
                instance.load(resourceAsStream, cArr);
                KeyManagerFactory instance2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                instance2.init(instance, cArr);
                return makeSSLSocketFactory(instance, instance2);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to load keystore from classpath: ");
            stringBuilder.append(str);
            throw new IOException(stringBuilder.toString());
        } catch (Throwable e) {
            throw new IOException(e.getMessage());
        }
    }

    public static SSLServerSocketFactory makeSSLSocketFactory(KeyStore keyStore, KeyManagerFactory keyManagerFactory) {
        try {
            return makeSSLSocketFactory(keyStore, keyManagerFactory.getKeyManagers());
        } catch (Throwable e) {
            throw new IOException(e.getMessage());
        }
    }

    public static SSLServerSocketFactory makeSSLSocketFactory(KeyStore keyStore, KeyManager[] keyManagerArr) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(keyStore);
            SSLContext instance2 = SSLContext.getInstance("TLS");
            instance2.init(keyManagerArr, instance.getTrustManagers(), null);
            return instance2.getServerSocketFactory();
        } catch (Throwable e) {
            throw new IOException(e.getMessage());
        }
    }

    public static Map<String, String> mimeTypes() {
        if (MIME_TYPES == null) {
            Map hashMap = new HashMap();
            MIME_TYPES = hashMap;
            loadMimeTypes(hashMap, "META-INF/nanohttpd/default-mimetypes.properties");
            loadMimeTypes(MIME_TYPES, "META-INF/nanohttpd/mimetypes.properties");
            if (MIME_TYPES.isEmpty()) {
                LOG.log(Level.WARNING, "no mime types found in the classpath! please provide mimetypes.properties");
            }
        }
        return MIME_TYPES;
    }

    public static n newChunkedResponse(c cVar, String str, InputStream inputStream) {
        return new n(cVar, str, inputStream, -1);
    }

    public static n newFixedLengthResponse(c cVar, String str, InputStream inputStream, long j) {
        return new n(cVar, str, inputStream, j);
    }

    public static n newFixedLengthResponse(c cVar, String str, String str2) {
        c cVar2 = new c(str);
        if (str2 == null) {
            return newFixedLengthResponse(cVar, str, new ByteArrayInputStream(new byte[0]), 0);
        }
        byte[] bytes;
        try {
            if (!Charset.forName(cVar2.b()).newEncoder().canEncode(str2)) {
                cVar2 = cVar2.c();
            }
            bytes = str2.getBytes(cVar2.b());
        } catch (Throwable e) {
            LOG.log(Level.SEVERE, "encoding problem, responding nothing", e);
            bytes = new byte[0];
        }
        return newFixedLengthResponse(cVar, cVar2.a, new ByteArrayInputStream(bytes), (long) bytes.length);
    }

    public static n newFixedLengthResponse(String str) {
        return newFixedLengthResponse(d.c, MIME_HTML, str);
    }

    private static final void safeClose(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else if (obj instanceof ServerSocket) {
                    ((ServerSocket) obj).close();
                } else {
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (Throwable e) {
                LOG.log(Level.SEVERE, "Could not close", e);
            }
        }
    }

    public synchronized void closeAllConnections() {
        stop();
    }

    public b createClientHandler(Socket socket, InputStream inputStream) {
        return new b(inputStream, socket);
    }

    public q createServerRunnable(int i) {
        return new q(i);
    }

    public String getHostname() {
        return this.hostname;
    }

    public final int getListeningPort() {
        return this.myServerSocket == null ? -1 : this.myServerSocket.getLocalPort();
    }

    public r getServerSocketFactory() {
        return this.serverSocketFactory;
    }

    public u getTempFileManagerFactory() {
        return this.tempFileManagerFactory;
    }

    public final boolean isAlive() {
        return wasStarted() && !this.myServerSocket.isClosed() && this.myThread.isAlive();
    }

    public void makeSecure(SSLServerSocketFactory sSLServerSocketFactory, String[] strArr) {
        this.serverSocketFactory = new p(sSLServerSocketFactory, strArr);
    }

    public n serve(l lVar) {
        String str = MIME_PLAINTEXT;
        Map hashMap = new HashMap();
        k kVar = (k) lVar;
        m mVar = kVar.g;
        if (m.PUT.equals(mVar) || m.POST.equals(mVar)) {
            try {
                ((k) lVar).h(hashMap);
            } catch (Throwable e) {
                c cVar = d.INTERNAL_ERROR;
                StringBuilder l = androidx.activity.a.l("SERVER INTERNAL ERROR: IOException: ");
                l.append(e.getMessage());
                return newFixedLengthResponse(cVar, str, l.toString());
            } catch (Throwable e2) {
                return newFixedLengthResponse(e2.a, str, e2.getMessage());
            }
        }
        Map hashMap2 = new HashMap();
        for (String str2 : kVar.h.keySet()) {
            hashMap2.put(str2, ((List) kVar.h.get(str2)).get(0));
        }
        hashMap2.put(QUERY_STRING_PARAMETER, kVar.k);
        return serve(kVar.f, mVar, kVar.i, hashMap2, hashMap);
    }

    @Deprecated
    public n serve(String str, m mVar, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        return newFixedLengthResponse(d.NOT_FOUND, MIME_PLAINTEXT, "Not Found");
    }

    public void setAsyncRunner(a aVar) {
        this.asyncRunner = aVar;
    }

    public void setServerSocketFactory(r rVar) {
        this.serverSocketFactory = rVar;
    }

    public void setTempFileManagerFactory(u uVar) {
        this.tempFileManagerFactory = uVar;
    }

    public void start() {
        start(SOCKET_READ_TIMEOUT);
    }

    public void start(int i) {
        start(i, true);
    }

    /* DevToolsApp WARNING: Can't wrap try/catch for R(6:5|6|7|8|17|1) */
    /* DevToolsApp WARNING: Missing block: B:2:0x002c, code:
            if (r3.c == false) goto L_0x002e;
     */
    /* DevToolsApp WARNING: Missing block: B:7:?, code:
            java.lang.Thread.sleep(10);
     */
    /* DevToolsApp WARNING: Missing block: B:10:0x003a, code:
            if (r3.b == null) goto L_0x003c;
     */
    /* DevToolsApp WARNING: Missing block: B:11:0x003c, code:
            return;
     */
    public void start(int r3, boolean r4) {
        /*
        r2 = this;
        r0 = r2.getServerSocketFactory();
        r0 = r0.a();
        r2.myServerSocket = r0;
        r0 = r2.myServerSocket;
        r1 = 1;
        r0.setReuseAddress(r1);
        r3 = r2.createServerRunnable(r3);
        r0 = new java.lang.Thread;
        r0.<init>(r3);
        r2.myThread = r0;
        r0.setDaemon(r4);
        r4 = r2.myThread;
        r0 = "NanoHttpd Main Listener";
        r4.setName(r0);
        r4 = r2.myThread;
        r4.start();
    L_0x002a:
        r4 = r3.c;
        if (r4 != 0) goto L_0x0038;
    L_0x002e:
        r4 = r3.b;
        if (r4 != 0) goto L_0x0038;
    L_0x0032:
        r0 = 10;
        java.lang.Thread.sleep(r0);	 Catch:{ all -> 0x002a }
        goto L_0x002a;
    L_0x0038:
        r3 = r3.b;
        if (r3 != 0) goto L_0x003d;
    L_0x003c:
        return;
    L_0x003d:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.a.start(int, boolean):void");
    }

    public void stop() {
        try {
            safeClose(this.myServerSocket);
            f fVar = (f) this.asyncRunner;
            Objects.requireNonNull(fVar);
            Iterator it = new ArrayList(fVar.b).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                safeClose(bVar.a);
                safeClose(bVar.b);
            }
            Thread thread = this.myThread;
            if (thread != null) {
                thread.join();
            }
        } catch (Throwable e) {
            LOG.log(Level.SEVERE, "Could not stop all connections", e);
        }
    }

    public boolean useGzipWhenAccepted(n nVar) {
        String str = nVar.b;
        return str != null && (str.toLowerCase().contains("text/") || nVar.b.toLowerCase().contains("/json"));
    }

    public final boolean wasStarted() {
        return (this.myServerSocket == null || this.myThread == null) ? false : true;
    }
}
