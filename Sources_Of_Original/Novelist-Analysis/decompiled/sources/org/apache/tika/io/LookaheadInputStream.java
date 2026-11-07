package org.apache.tika.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public class LookaheadInputStream extends InputStream {
    private final byte[] buffer;
    private InputStream stream;
    private int buffered = 0;
    private int position = 0;
    private int mark = 0;

    public LookaheadInputStream(InputStream inputStream, int i3) {
        this.stream = inputStream;
        this.buffer = new byte[i3];
        if (inputStream != null) {
            inputStream.mark(i3);
        }
    }

    private void fill() throws IOException {
        InputStream inputStream;
        if (available() == 0) {
            int i3 = this.buffered;
            byte[] bArr = this.buffer;
            if (i3 >= bArr.length || (inputStream = this.stream) == null) {
                return;
            }
            int i4 = inputStream.read(bArr, i3, bArr.length - i3);
            if (i4 != -1) {
                this.buffered += i4;
            } else {
                close();
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.buffered - this.position;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.stream;
        if (inputStream != null) {
            inputStream.reset();
            this.stream = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i3) {
        this.mark = this.position;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        fill();
        int i3 = this.buffered;
        int i4 = this.position;
        if (i3 <= i4) {
            return -1;
        }
        byte[] bArr = this.buffer;
        this.position = i4 + 1;
        return bArr[i4] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.position = this.mark;
    }

    @Override // java.io.InputStream
    public long skip(long j3) throws IOException {
        fill();
        long jMin = Math.min(j3, available());
        this.position = (int) (((long) this.position) + jMin);
        return jMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i3, int i4) throws IOException {
        fill();
        int i5 = this.buffered;
        int i6 = this.position;
        if (i5 <= i6) {
            return -1;
        }
        int iMin = Math.min(i4, i5 - i6);
        System.arraycopy(this.buffer, this.position, bArr, i3, iMin);
        this.position += iMin;
        return iMin;
    }
}
