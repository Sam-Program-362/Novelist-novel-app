package org.apache.tika.io;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class TailStream extends FilterInputStream {
    private static final int SKIP_SIZE = 4096;
    private long bytesRead;
    private int currentIndex;
    private byte[] markBuffer;
    private long markBytesRead;
    private int markIndex;
    private final byte[] tailBuffer;
    private final int tailSize;

    public TailStream(InputStream inputStream, int i3) {
        super(inputStream);
        this.tailSize = i3;
        this.tailBuffer = new byte[i3];
    }

    private void appendBuf(byte[] bArr, int i3, int i4) {
        if (i4 >= this.tailSize) {
            replaceTailBuffer(bArr, i3, i4);
        } else {
            copyToTailBuffer(bArr, i3, i4);
        }
        this.bytesRead += i4;
    }

    private void appendByte(byte b3) {
        byte[] bArr = this.tailBuffer;
        int i3 = this.currentIndex;
        int i4 = i3 + 1;
        this.currentIndex = i4;
        bArr[i3] = b3;
        if (i4 >= this.tailSize) {
            this.currentIndex = 0;
        }
        this.bytesRead++;
    }

    private void copyToTailBuffer(byte[] bArr, int i3, int i4) {
        int min = Math.min(this.tailSize - this.currentIndex, i4);
        System.arraycopy(bArr, i3, this.tailBuffer, this.currentIndex, min);
        System.arraycopy(bArr, i3 + min, this.tailBuffer, 0, i4 - min);
        this.currentIndex = (this.currentIndex + i4) % this.tailSize;
    }

    private void replaceTailBuffer(byte[] bArr, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.tailSize;
        System.arraycopy(bArr, i5 - i6, this.tailBuffer, 0, i6);
        this.currentIndex = 0;
    }

    public byte[] getTail() {
        int min = (int) Math.min(this.tailSize, this.bytesRead);
        byte[] bArr = new byte[min];
        byte[] bArr2 = this.tailBuffer;
        int i3 = this.currentIndex;
        System.arraycopy(bArr2, i3, bArr, 0, min - i3);
        byte[] bArr3 = this.tailBuffer;
        int i4 = this.currentIndex;
        System.arraycopy(bArr3, 0, bArr, min - i4, i4);
        return bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i3) {
        int i4 = this.tailSize;
        byte[] bArr = new byte[i4];
        this.markBuffer = bArr;
        System.arraycopy(this.tailBuffer, 0, bArr, 0, i4);
        this.markIndex = this.currentIndex;
        this.markBytesRead = this.bytesRead;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = super.read();
        if (read != -1) {
            appendByte((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        byte[] bArr = this.markBuffer;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.tailBuffer, 0, this.tailSize);
            this.currentIndex = this.markIndex;
            this.bytesRead = this.markBytesRead;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j3) {
        int min = (int) Math.min(j3, 4096L);
        byte[] bArr = new byte[min];
        long j4 = 0;
        int i3 = 0;
        while (j4 < j3 && i3 != -1) {
            i3 = read(bArr, 0, (int) Math.min(min, j3 - j4));
            if (i3 != -1) {
                j4 += i3;
            }
        }
        if (i3 >= 0 || j4 != 0) {
            return j4;
        }
        return -1L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        int read = super.read(bArr);
        if (read > 0) {
            appendBuf(bArr, 0, read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i3, int i4) {
        int read = super.read(bArr, i3, i4);
        if (read > 0) {
            appendBuf(bArr, i3, read);
        }
        return read;
    }
}
