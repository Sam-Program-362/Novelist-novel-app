package org.apache.tika.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import s2.c;

/* JADX INFO: loaded from: classes.dex */
public class BoundedInputStream extends InputStream {
    private static final int EOF = -1;
    private final InputStream in;
    private final long max;
    private long pos;

    public BoundedInputStream(long j3, InputStream inputStream) {
        this.max = j3;
        this.in = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.in.available();
    }

    public long getPos() {
        return this.pos;
    }

    public boolean hasHitBound() {
        return this.pos >= this.max;
    }

    @Override // java.io.InputStream
    public void mark(int i3) {
        this.in.mark(i3);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j3 = this.max;
        if (j3 >= 0 && this.pos >= j3) {
            return -1;
        }
        int i3 = this.in.read();
        this.pos++;
        return i3;
    }

    @Override // java.io.InputStream
    public byte[] readNBytes(int i3) {
        return this.in.readNBytes(i3);
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.in.reset();
        this.pos = 0L;
    }

    @Override // java.io.InputStream
    public long skip(long j3) throws IOException {
        long j4 = this.max;
        if (j4 >= 0) {
            j3 = Math.min(j3, j4 - this.pos);
        }
        long jSkip = this.in.skip(j3);
        this.pos += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) {
        return c.b(this, outputStream);
    }

    @Override // java.io.InputStream
    public int readNBytes(byte[] bArr, int i3, int i4) {
        return this.in.readNBytes(bArr, i3, i4);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i3, int i4) throws IOException {
        long j3 = this.max;
        if (j3 >= 0 && this.pos >= j3) {
            return -1;
        }
        int i5 = this.in.read(bArr, i3, (int) (j3 >= 0 ? Math.min(i4, j3 - this.pos) : i4));
        if (i5 == -1) {
            return -1;
        }
        this.pos += (long) i5;
        return i5;
    }
}
