package w2;

import M1.N;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class c extends FilterInputStream {
    private final v2.c afterRead;
    private volatile boolean closed;
    private final v2.a exceptionHandler;

    public c(InputStream inputStream) {
        super(inputStream);
        this.exceptionHandler = new N(17);
        this.afterRead = v2.c.f4632i;
    }

    public void afterRead(int i3) {
        this.afterRead.getClass();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((FilterInputStream) this).in == null || isClosed()) {
            return 0;
        }
        try {
            return ((FilterInputStream) this).in.available();
        } catch (IOException e3) {
            handleIOException(e3);
            return 0;
        }
    }

    public void checkOpen() {
        if (isClosed()) {
            throw new IOException("Closed");
        }
    }

    public void handleIOException(IOException iOException) {
        this.exceptionHandler.accept(iOException);
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i3) {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.mark(i3);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in != null && ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i3 = 1;
        try {
            beforeRead(1);
            int read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                i3 = -1;
            }
            afterRead(i3);
            return read;
        } catch (IOException e3) {
            handleIOException(e3);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e3) {
            handleIOException(e3);
        }
    }

    public c setReference(InputStream inputStream) {
        ((FilterInputStream) this).in = inputStream;
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j3) {
        try {
            return ((FilterInputStream) this).in.skip(j3);
        } catch (IOException e3) {
            handleIOException(e3);
            return 0L;
        }
    }

    public InputStream unwrap() {
        return ((FilterInputStream) this).in;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        try {
            byte[] bArr2 = s2.c.f4533a;
            beforeRead(bArr == null ? 0 : bArr.length);
            int read = ((FilterInputStream) this).in.read(bArr);
            afterRead(read);
            return read;
        } catch (IOException e3) {
            handleIOException(e3);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i3, int i4) {
        try {
            beforeRead(i4);
            int read = ((FilterInputStream) this).in.read(bArr, i3, i4);
            afterRead(read);
            return read;
        } catch (IOException e3) {
            handleIOException(e3);
            return -1;
        }
    }

    public void beforeRead(int i3) {
    }
}
