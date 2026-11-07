package p004b1;

import B1.e;
import B1.g;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Closeable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ByteArrayInputStream f2606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public W f2607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f2608m = new byte[8];
    public final g n = new g(12);

    public X(ByteArrayInputStream byteArrayInputStream) {
        this.f2606k = byteArrayInputStream;
    }

    public final long a() throws IOException {
        h((byte) -128);
        g();
        long jF = f();
        if (jF < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (jF > 0) {
            ((ArrayDeque) this.n.f90l).push(Long.valueOf(jF));
        }
        return jF;
    }

    public final long b() throws IOException {
        boolean z3;
        d();
        byte b3 = this.f2607l.f2604a;
        if (b3 == 0) {
            z3 = true;
        } else {
            if (b3 != 32) {
                throw new IllegalStateException(e.g("expected major type 0 or 1 but found ", (this.f2607l.f2604a >> 5) & 7));
            }
            z3 = false;
        }
        long jF = f();
        if (jF >= 0) {
            return z3 ? jF : ~jF;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long c() throws IOException {
        h((byte) -96);
        g();
        long jF = f();
        if (jF < 0 || jF > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jF > 0) {
            ((ArrayDeque) this.n.f90l).push(Long.valueOf(jF + jF));
        }
        return jF;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2606k.close();
        this.n.s();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p004b1.W d() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p004b1.X.d():b1.W");
    }

    public final boolean e() throws IOException {
        h((byte) -32);
        if (this.f2607l.f2605b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iF = (int) f();
        if (iF == 20) {
            return false;
        }
        if (iF == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final long f() throws IOException {
        byte b3 = this.f2607l.f2605b;
        if (b3 < 24) {
            long j3 = b3;
            this.f2607l = null;
            return j3;
        }
        if (b3 == 24) {
            int i3 = this.f2606k.read();
            if (i3 == -1) {
                throw new EOFException();
            }
            this.f2607l = null;
            return ((long) i3) & 255;
        }
        byte[] bArr = this.f2608m;
        if (b3 == 25) {
            i(bArr, 2);
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b3 == 26) {
            i(bArr, 4);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b3 != 27) {
            W w3 = this.f2607l;
            throw new IOException(e.i("invalid additional information ", w3.f2605b, " for major type ", (w3.f2604a >> 5) & 7));
        }
        i(bArr, 8);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((((long) bArr[4]) & 255) << 24) | ((((long) bArr[5]) & 255) << 16) | ((((long) bArr[6]) & 255) << 8) | (((long) bArr[7]) & 255);
    }

    public final void g() throws IOException {
        d();
        if (this.f2607l.f2605b == 31) {
            throw new IllegalStateException(e.g("expected definite length but found ", this.f2607l.f2605b));
        }
    }

    public final void h(byte b3) throws IOException {
        d();
        if (this.f2607l.f2604a != b3) {
            throw new IllegalStateException(e.i("expected major type ", (b3 >> 5) & 7, " but found ", (this.f2607l.f2604a >> 5) & 7));
        }
    }

    public final void i(byte[] bArr, int i3) throws IOException {
        int i4 = 0;
        while (i4 != i3) {
            int i5 = this.f2606k.read(bArr, i4, i3 - i4);
            if (i5 == -1) {
                throw new EOFException();
            }
            i4 += i5;
        }
        this.f2607l = null;
    }

    public final byte[] j() throws IOException {
        g();
        long jF = f();
        if (jF < 0 || jF > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.f2606k.available() < jF) {
            throw new EOFException();
        }
        int i3 = (int) jF;
        byte[] bArr = new byte[i3];
        i(bArr, i3);
        return bArr;
    }
}
