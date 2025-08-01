package com.efs.sdk.net.a.a;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.zip.GZIPInputStream;

public final class e extends FilterOutputStream {
    private static final ExecutorService b = Executors.newCachedThreadPool();
    private final Future<Void> a;

    public static class a implements Callable<Void> {
        private final InputStream a;
        private final OutputStream b;

        public a(InputStream inputStream, OutputStream outputStream) {
            this.a = inputStream;
            this.b = outputStream;
        }

        private Void a() {
            InputStream gZIPInputStream = new GZIPInputStream(this.a);
            try {
                i.a(gZIPInputStream, this.b, new byte[1024]);
                return null;
            } finally {
                gZIPInputStream.close();
                this.b.close();
            }
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    private e(OutputStream outputStream, Future<Void> future) {
        super(outputStream);
        this.a = future;
    }

    public static e a(OutputStream outputStream) {
        InputStream pipedInputStream = new PipedInputStream();
        return new e(new PipedOutputStream(pipedInputStream), b.submit(new a(pipedInputStream, outputStream)));
    }

    private static <T> T a(Future<T> future) {
        Future future2;
        while (true) {
            try {
            } catch (InterruptedException unused) {
                future2 = future2.get();
                return future2;
            } catch (Throwable th) {
                Throwable th2 = th2.getCause();
                d.a(th2, IOException.class);
                d.a(th2, Error.class);
                d.a(th2, RuntimeException.class);
                throw new RuntimeException(th2);
            }
        }
        return future2;
    }

    public final void close() {
        try {
            super.close();
            try {
                a(this.a);
            } catch (IOException e) {
                throw e;
            }
        } catch (Throwable th) {
            try {
                a(this.a);
            } catch (IOException unused) {
                throw th;
            }
        }
    }
}
