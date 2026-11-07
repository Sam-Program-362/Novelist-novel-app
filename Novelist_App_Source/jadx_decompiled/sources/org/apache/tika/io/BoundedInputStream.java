package org.apache.tika.io;

import java.io.InputStream;
import java.io.OutputStream;
import s2.c;

/* loaded from: classes.dex */
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
    public int read() {
        long j3 = this.max;
        if (j3 >= 0 && this.pos >= j3) {
            return -1;
        }
        int read = this.in.read();
        this.pos++;
        return read;
    }

    @Override // java.io.InputStream
    public byte[] readNBytes(int i3) {
        byte[] readNBytes;
        readNBytes = this.in.readNBytes(i3);
        return readNBytes;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.in.reset();
        this.pos = 0L;
    }

    @Override // java.io.InputStream
    public long skip(long j3) {
        long j4 = this.max;
        if (j4 >= 0) {
            j3 = Math.min(j3, j4 - this.pos);
        }
        long skip = this.in.skip(j3);
        this.pos += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) {
        return c.b(this, outputStream);
    }

    @Override // java.io.InputStream
    public int readNBytes(byte[] bArr, int i3, int i4) {
        int readNBytes;
        readNBytes = this.in.readNBytes(bArr, i3, i4);
        return readNBytes;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i3, int i4) {
        long j3 = this.max;
        if (j3 >= 0 && this.pos >= j3) {
            return -1;
        }
        int read = this.in.read(bArr, i3, (int) (j3 >= 0 ? Math.min(i4, j3 - this.pos) : i4));
        if (read == -1) {
            return -1;
        }
        this.pos += read;
        return read;
    }
}
