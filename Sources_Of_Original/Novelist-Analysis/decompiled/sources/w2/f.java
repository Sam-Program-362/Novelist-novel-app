package w2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class f extends InputStream {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile ByteArrayInputStream f4671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile byte[] f4672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4673m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4675p;

    public final int a(ByteArrayInputStream byteArrayInputStream, byte[] bArr) throws IOException {
        int i3 = this.f4674o;
        if (i3 != -1) {
            int i4 = this.f4675p - i3;
            int i5 = this.n;
            if (i4 < i5) {
                if (i3 == 0 && i5 > bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i5) {
                        i5 = length;
                    }
                    byte[] bArr2 = new byte[i5];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f4672l = bArr2;
                    bArr = bArr2;
                } else if (i3 > 0) {
                    System.arraycopy(bArr, i3, bArr, 0, bArr.length - i3);
                }
                int i6 = this.f4675p - this.f4674o;
                this.f4675p = i6;
                this.f4674o = 0;
                this.f4673m = 0;
                int i7 = byteArrayInputStream.read(bArr, i6, bArr.length - i6);
                int i8 = this.f4675p;
                if (i7 > 0) {
                    i8 += i7;
                }
                this.f4673m = i8;
                return i7;
            }
        }
        int i9 = byteArrayInputStream.read(bArr);
        if (i9 > 0) {
            this.f4674o = -1;
            this.f4675p = 0;
            this.f4673m = i9;
        }
        return i9;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f4671k;
        if (this.f4672l == null || byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        return byteArrayInputStream.available() + (this.f4673m - this.f4675p);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4672l = null;
        ByteArrayInputStream byteArrayInputStream = this.f4671k;
        this.f4671k = null;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i3) {
        this.n = i3;
        this.f4674o = this.f4675p;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        if (this.f4672l == null) {
            throw new IOException("Stream is closed");
        }
        int i3 = this.f4674o;
        if (-1 == i3) {
            throw new IOException("Mark has been invalidated");
        }
        this.f4675p = i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j3) throws IOException {
        byte[] bArr = this.f4672l;
        ByteArrayInputStream byteArrayInputStream = this.f4671k;
        if (bArr == null) {
            throw new IOException("Stream is closed");
        }
        if (j3 < 1) {
            return 0L;
        }
        if (byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        int i3 = this.f4673m;
        int i4 = this.f4675p;
        int i5 = i3 - i4;
        long j4 = i5;
        if (j4 >= j3) {
            this.f4675p = i4 + ((int) j3);
            return j3;
        }
        this.f4675p = i3;
        if (this.f4674o == -1 || j3 > this.n) {
            return byteArrayInputStream.skip(j3 - j4) + j4;
        }
        if (a(byteArrayInputStream, bArr) == -1) {
            return j4;
        }
        int i6 = this.f4673m;
        int i7 = this.f4675p;
        int i8 = i6 - i7;
        if (i8 >= j3 - j4) {
            this.f4675p = (((int) j3) - i5) + i7;
            return j3;
        }
        this.f4675p = i6;
        return i8 + i5;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f4672l;
        ByteArrayInputStream byteArrayInputStream = this.f4671k;
        if (bArr == null || byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        if (this.f4675p < this.f4673m || a(byteArrayInputStream, bArr) != -1) {
            if (bArr != this.f4672l && (bArr = this.f4672l) == null) {
                throw new IOException("Stream is closed");
            }
            int i3 = this.f4673m;
            int i4 = this.f4675p;
            if (i3 - i4 > 0) {
                this.f4675p = i4 + 1;
                return bArr[i4] & ForkServer.ERROR;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0078  */
    /* JADX WARN: Code duplicated, block: B:60:0x0080 A[LOOP:0: B:26:0x0037->B:60:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x007e A[SYNTHETIC] */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) throws IOException {
        int i5;
        int i6;
        byte[] bArr2 = this.f4672l;
        if (bArr2 != null) {
            if (i3 > bArr.length - i4 || i3 < 0 || i4 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i4 == 0) {
                return 0;
            }
            ByteArrayInputStream byteArrayInputStream = this.f4671k;
            if (byteArrayInputStream != null) {
                int i7 = this.f4675p;
                int i8 = this.f4673m;
                if (i7 < i8) {
                    int i9 = i8 - i7;
                    if (i9 >= i4) {
                        i9 = i4;
                    }
                    System.arraycopy(bArr2, i7, bArr, i3, i9);
                    this.f4675p += i9;
                    if (i9 == i4 || byteArrayInputStream.available() == 0) {
                        return i9;
                    }
                    i3 += i9;
                    i5 = i4 - i9;
                } else {
                    i5 = i4;
                }
                while (true) {
                    if (this.f4674o == -1 && i5 >= bArr2.length) {
                        i6 = byteArrayInputStream.read(bArr, i3, i5);
                        if (i6 == -1) {
                            if (i5 == i4) {
                                break;
                            }
                            return i4 - i5;
                        }
                        i5 -= i6;
                        if (i5 == 0) {
                            return i4;
                        }
                        if (byteArrayInputStream.available() == 0) {
                            return i4 - i5;
                        }
                        i3 += i6;
                    } else {
                        if (a(byteArrayInputStream, bArr2) == -1) {
                            if (i5 == i4) {
                                break;
                            }
                            return i4 - i5;
                        }
                        if (bArr2 != this.f4672l && (bArr2 = this.f4672l) == null) {
                            throw new IOException("Stream is closed");
                        }
                        int i10 = this.f4673m;
                        int i11 = this.f4675p;
                        i6 = i10 - i11;
                        if (i6 >= i5) {
                            i6 = i5;
                        }
                        System.arraycopy(bArr2, i11, bArr, i3, i6);
                        this.f4675p += i6;
                        i5 -= i6;
                        if (i5 == 0) {
                            return i4;
                        }
                        if (byteArrayInputStream.available() == 0) {
                            return i4 - i5;
                        }
                        i3 += i6;
                    }
                }
                return -1;
            }
            throw new IOException("Stream is closed");
        }
        throw new IOException("Stream is closed");
    }
}
