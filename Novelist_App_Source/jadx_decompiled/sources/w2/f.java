package w2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class f extends InputStream {

    /* renamed from: k, reason: collision with root package name */
    public volatile ByteArrayInputStream f4671k;

    /* renamed from: l, reason: collision with root package name */
    public volatile byte[] f4672l;

    /* renamed from: m, reason: collision with root package name */
    public int f4673m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f4674o;

    /* renamed from: p, reason: collision with root package name */
    public int f4675p;

    public final int a(ByteArrayInputStream byteArrayInputStream, byte[] bArr) {
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
                int read = byteArrayInputStream.read(bArr, i6, bArr.length - i6);
                int i7 = this.f4675p;
                if (read > 0) {
                    i7 += read;
                }
                this.f4673m = i7;
                return read;
            }
        }
        int read2 = byteArrayInputStream.read(bArr);
        if (read2 > 0) {
            this.f4674o = -1;
            this.f4675p = 0;
            this.f4673m = read2;
        }
        return read2;
    }

    @Override // java.io.InputStream
    public final int available() {
        ByteArrayInputStream byteArrayInputStream = this.f4671k;
        if (this.f4672l == null || byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        return byteArrayInputStream.available() + (this.f4673m - this.f4675p);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
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
    public final void reset() {
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
    public final long skip(long j3) {
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
        if (i6 - i7 >= j3 - j4) {
            this.f4675p = (((int) j3) - i5) + i7;
            return j3;
        }
        this.f4675p = i6;
        return r2 + i5;
    }

    @Override // java.io.InputStream
    public final int read() {
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

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077 A[SYNTHETIC] */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            byte[] r0 = r6.f4672l
            java.lang.String r1 = "Stream is closed"
            if (r0 == 0) goto L8e
            int r2 = r7.length
            int r2 = r2 - r9
            if (r8 > r2) goto L88
            if (r8 < 0) goto L88
            if (r9 < 0) goto L88
            if (r9 != 0) goto L12
            r7 = 0
            return r7
        L12:
            java.io.ByteArrayInputStream r2 = r6.f4671k
            if (r2 == 0) goto L82
            int r3 = r6.f4675p
            int r4 = r6.f4673m
            if (r3 >= r4) goto L36
            int r4 = r4 - r3
            if (r4 < r9) goto L20
            r4 = r9
        L20:
            java.lang.System.arraycopy(r0, r3, r7, r8, r4)
            int r3 = r6.f4675p
            int r3 = r3 + r4
            r6.f4675p = r3
            if (r4 == r9) goto L35
            int r3 = r2.available()
            if (r3 != 0) goto L31
            goto L35
        L31:
            int r8 = r8 + r4
            int r3 = r9 - r4
            goto L37
        L35:
            return r4
        L36:
            r3 = r9
        L37:
            int r4 = r6.f4674o
            r5 = -1
            if (r4 != r5) goto L4a
            int r4 = r0.length
            if (r3 < r4) goto L4a
            int r4 = r2.read(r7, r8, r3)
            if (r4 != r5) goto L74
            if (r3 != r9) goto L48
            goto L52
        L48:
            int r9 = r9 - r3
            return r9
        L4a:
            int r4 = r6.a(r2, r0)
            if (r4 != r5) goto L55
            if (r3 != r9) goto L53
        L52:
            return r5
        L53:
            int r9 = r9 - r3
            return r9
        L55:
            byte[] r4 = r6.f4672l
            if (r0 == r4) goto L64
            byte[] r0 = r6.f4672l
            if (r0 == 0) goto L5e
            goto L64
        L5e:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r1)
            throw r7
        L64:
            int r4 = r6.f4673m
            int r5 = r6.f4675p
            int r4 = r4 - r5
            if (r4 < r3) goto L6c
            r4 = r3
        L6c:
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)
            int r5 = r6.f4675p
            int r5 = r5 + r4
            r6.f4675p = r5
        L74:
            int r3 = r3 - r4
            if (r3 != 0) goto L78
            return r9
        L78:
            int r5 = r2.available()
            if (r5 != 0) goto L80
            int r9 = r9 - r3
            return r9
        L80:
            int r8 = r8 + r4
            goto L37
        L82:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r1)
            throw r7
        L88:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            r7.<init>()
            throw r7
        L8e:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.f.read(byte[], int, int):int");
    }
}
