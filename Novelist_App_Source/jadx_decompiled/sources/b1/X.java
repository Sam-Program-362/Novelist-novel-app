package b1;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class X implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public final ByteArrayInputStream f2606k;

    /* renamed from: l, reason: collision with root package name */
    public W f2607l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f2608m = new byte[8];
    public final B1.g n = new B1.g(12);

    public X(ByteArrayInputStream byteArrayInputStream) {
        this.f2606k = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f3 = f();
        if (f3 < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (f3 > 0) {
            ((ArrayDeque) this.n.f90l).push(Long.valueOf(f3));
        }
        return f3;
    }

    public final long b() {
        boolean z3;
        d();
        byte b3 = this.f2607l.f2604a;
        if (b3 == 0) {
            z3 = true;
        } else {
            if (b3 != 32) {
                throw new IllegalStateException(B1.e.g("expected major type 0 or 1 but found ", (this.f2607l.f2604a >> 5) & 7));
            }
            z3 = false;
        }
        long f3 = f();
        if (f3 >= 0) {
            return z3 ? f3 : ~f3;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long c() {
        h((byte) -96);
        g();
        long f3 = f();
        if (f3 < 0 || f3 > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (f3 > 0) {
            ((ArrayDeque) this.n.f90l).push(Long.valueOf(f3 + f3));
        }
        return f3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2606k.close();
        this.n.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a0, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b1.W d() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.X.d():b1.W");
    }

    public final boolean e() {
        h((byte) -32);
        if (this.f2607l.f2605b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int f3 = (int) f();
        if (f3 == 20) {
            return false;
        }
        if (f3 == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final long f() {
        byte b3 = this.f2607l.f2605b;
        if (b3 < 24) {
            long j3 = b3;
            this.f2607l = null;
            return j3;
        }
        if (b3 == 24) {
            int read = this.f2606k.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.f2607l = null;
            return read & 255;
        }
        byte[] bArr = this.f2608m;
        if (b3 == 25) {
            i(bArr, 2);
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (b3 == 26) {
            i(bArr, 4);
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        if (b3 != 27) {
            W w3 = this.f2607l;
            throw new IOException(B1.e.i("invalid additional information ", w3.f2605b, " for major type ", (w3.f2604a >> 5) & 7));
        }
        i(bArr, 8);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public final void g() {
        d();
        if (this.f2607l.f2605b == 31) {
            throw new IllegalStateException(B1.e.g("expected definite length but found ", this.f2607l.f2605b));
        }
    }

    public final void h(byte b3) {
        d();
        if (this.f2607l.f2604a != b3) {
            throw new IllegalStateException(B1.e.i("expected major type ", (b3 >> 5) & 7, " but found ", (this.f2607l.f2604a >> 5) & 7));
        }
    }

    public final void i(byte[] bArr, int i3) {
        int i4 = 0;
        while (i4 != i3) {
            int read = this.f2606k.read(bArr, i4, i3 - i4);
            if (read == -1) {
                throw new EOFException();
            }
            i4 += read;
        }
        this.f2607l = null;
    }

    public final byte[] j() {
        g();
        long f3 = f();
        if (f3 < 0 || f3 > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.f2606k.available() < f3) {
            throw new EOFException();
        }
        int i3 = (int) f3;
        byte[] bArr = new byte[i3];
        i(bArr, i3);
        return bArr;
    }
}
