package org.apache.tika.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
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
        this.bytesRead += (long) i4;
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
        int iMin = Math.min(this.tailSize - this.currentIndex, i4);
        System.arraycopy(bArr, i3, this.tailBuffer, this.currentIndex, iMin);
        System.arraycopy(bArr, i3 + iMin, this.tailBuffer, 0, i4 - iMin);
        this.currentIndex = (this.currentIndex + i4) % this.tailSize;
    }

    private void replaceTailBuffer(byte[] bArr, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.tailSize;
        System.arraycopy(bArr, i5 - i6, this.tailBuffer, 0, i6);
        this.currentIndex = 0;
    }

    public byte[] getTail() {
        int iMin = (int) Math.min(this.tailSize, this.bytesRead);
        byte[] bArr = new byte[iMin];
        byte[] bArr2 = this.tailBuffer;
        int i3 = this.currentIndex;
        System.arraycopy(bArr2, i3, bArr, 0, iMin - i3);
        byte[] bArr3 = this.tailBuffer;
        int i4 = this.currentIndex;
        System.arraycopy(bArr3, 0, bArr, iMin - i4, i4);
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
    public int read() throws IOException {
        int i3 = super.read();
        if (i3 != -1) {
            appendByte((byte) i3);
        }
        return i3;
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
    public long skip(long j3) throws IOException {
        int iMin = (int) Math.min(j3, 4096L);
        byte[] bArr = new byte[iMin];
        long j4 = 0;
        int i3 = 0;
        while (j4 < j3 && i3 != -1) {
            i3 = read(bArr, 0, (int) Math.min(iMin, j3 - j4));
            if (i3 != -1) {
                j4 += (long) i3;
            }
        }
        if (i3 >= 0 || j4 != 0) {
            return j4;
        }
        return -1L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i3 = super.read(bArr);
        if (i3 > 0) {
            appendBuf(bArr, 0, i3);
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i3, int i4) throws IOException {
        int i5 = super.read(bArr, i3, i4);
        if (i5 > 0) {
            appendBuf(bArr, i3, i5);
        }
        return i5;
    }
}
