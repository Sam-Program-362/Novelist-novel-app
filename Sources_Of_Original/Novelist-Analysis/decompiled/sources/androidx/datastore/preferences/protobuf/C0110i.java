package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0110i extends AbstractC0111j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileInputStream f2055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2062j = Integer.MAX_VALUE;

    public C0110i(FileInputStream fileInputStream) {
        Charset charset = AbstractC0124x.f2114a;
        this.f2055c = fileInputStream;
        this.f2056d = new byte[4096];
        this.f2057e = 0;
        this.f2059g = 0;
        this.f2061i = 0;
    }

    public final byte[] A(int i3) throws IOException {
        if (i3 == 0) {
            return AbstractC0124x.f2115b;
        }
        if (i3 < 0) {
            throw C0126z.d();
        }
        int i4 = this.f2061i;
        int i5 = this.f2059g;
        int i6 = i4 + i5 + i3;
        if (i6 - Integer.MAX_VALUE > 0) {
            throw new C0126z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i7 = this.f2062j;
        if (i6 > i7) {
            J((i7 - i4) - i5);
            throw C0126z.e();
        }
        int i8 = this.f2057e - i5;
        int i9 = i3 - i8;
        FileInputStream fileInputStream = this.f2055c;
        if (i9 >= 4096) {
            try {
                if (i9 > fileInputStream.available()) {
                    return null;
                }
            } catch (C0126z e3) {
                e3.f2116k = true;
                throw e3;
            }
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f2056d, this.f2059g, bArr, 0, i8);
        this.f2061i += this.f2057e;
        this.f2059g = 0;
        this.f2057e = 0;
        while (i8 < i3) {
            try {
                int i10 = fileInputStream.read(bArr, i8, i3 - i8);
                if (i10 == -1) {
                    throw C0126z.e();
                }
                this.f2061i += i10;
                i8 += i10;
            } catch (C0126z e4) {
                e4.f2116k = true;
                throw e4;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i3) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i3 > 0) {
            int iMin = Math.min(i3, 4096);
            byte[] bArr = new byte[iMin];
            int i4 = 0;
            while (i4 < iMin) {
                int i5 = this.f2055c.read(bArr, i4, iMin - i4);
                if (i5 == -1) {
                    throw C0126z.e();
                }
                this.f2061i += i5;
                i4 += i5;
            }
            i3 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() throws C0126z {
        int i3 = this.f2059g;
        if (this.f2057e - i3 < 4) {
            I(4);
            i3 = this.f2059g;
        }
        this.f2059g = i3 + 4;
        byte[] bArr = this.f2056d;
        return ((bArr[i3 + 3] & ForkServer.ERROR) << 24) | (bArr[i3] & ForkServer.ERROR) | ((bArr[i3 + 1] & ForkServer.ERROR) << 8) | ((bArr[i3 + 2] & ForkServer.ERROR) << 16);
    }

    public final long D() throws C0126z {
        int i3 = this.f2059g;
        if (this.f2057e - i3 < 8) {
            I(8);
            i3 = this.f2059g;
        }
        this.f2059g = i3 + 8;
        byte[] bArr = this.f2056d;
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }

    public final int E() {
        int i3;
        int i4 = this.f2059g;
        int i5 = this.f2057e;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f2056d;
            byte b3 = bArr[i4];
            if (b3 >= 0) {
                this.f2059g = i6;
                return b3;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b3;
                if (i8 < 0) {
                    i3 = i8 ^ (-128);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        i3 = i10 ^ 16256;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            i3 = (-2080896) ^ i12;
                        } else {
                            i9 = i4 + 5;
                            byte b4 = bArr[i11];
                            int i13 = (i12 ^ (b4 << 28)) ^ 266354560;
                            if (b4 < 0) {
                                i11 = i4 + 6;
                                if (bArr[i9] < 0) {
                                    i9 = i4 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i4 + 8;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 9;
                                            if (bArr[i11] < 0) {
                                                int i14 = i4 + 10;
                                                if (bArr[i9] >= 0) {
                                                    i7 = i14;
                                                    i3 = i13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i3 = i13;
                            }
                            i3 = i13;
                        }
                        i7 = i11;
                    }
                    i7 = i9;
                }
                this.f2059g = i7;
                return i3;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j3;
        long j4;
        long j5;
        long j6;
        int i3 = this.f2059g;
        int i4 = this.f2057e;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f2056d;
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                this.f2059g = i5;
                return b3;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b3;
                if (i7 < 0) {
                    j3 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        j3 = i9 ^ 16256;
                        i6 = i8;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            j6 = (-2080896) ^ i11;
                        } else {
                            long j7 = i11;
                            i6 = i3 + 5;
                            long j8 = j7 ^ (((long) bArr[i10]) << 28);
                            if (j8 >= 0) {
                                j5 = 266354560;
                            } else {
                                i10 = i3 + 6;
                                long j9 = j8 ^ (((long) bArr[i6]) << 35);
                                if (j9 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i6 = i3 + 7;
                                    j8 = j9 ^ (((long) bArr[i10]) << 42);
                                    if (j8 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j9 = j8 ^ (((long) bArr[i6]) << 49);
                                        if (j9 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i6 = i3 + 9;
                                            long j10 = (j9 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                int i12 = i3 + 10;
                                                if (bArr[i6] >= 0) {
                                                    i6 = i12;
                                                }
                                            }
                                            j3 = j10;
                                        }
                                    }
                                }
                                j6 = j4 ^ j9;
                            }
                            j3 = j5 ^ j8;
                        }
                        i6 = i10;
                        j3 = j6;
                    }
                }
                this.f2059g = i6;
                return j3;
            }
        }
        return G();
    }

    public final long G() throws C0126z {
        long j3 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.f2059g == this.f2057e) {
                I(1);
            }
            int i4 = this.f2059g;
            this.f2059g = i4 + 1;
            byte b3 = this.f2056d[i4];
            j3 |= ((long) (b3 & 127)) << i3;
            if ((b3 & 128) == 0) {
                return j3;
            }
        }
        throw C0126z.c();
    }

    public final void H() {
        int i3 = this.f2057e + this.f2058f;
        this.f2057e = i3;
        int i4 = this.f2061i + i3;
        int i5 = this.f2062j;
        if (i4 <= i5) {
            this.f2058f = 0;
            return;
        }
        int i6 = i4 - i5;
        this.f2058f = i6;
        this.f2057e = i3 - i6;
    }

    public final void I(int i3) throws C0126z {
        if (K(i3)) {
            return;
        }
        if (i3 <= (Integer.MAX_VALUE - this.f2061i) - this.f2059g) {
            throw C0126z.e();
        }
        throw new C0126z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i3) throws C0126z {
        int i4 = this.f2057e;
        int i5 = this.f2059g;
        int i6 = i4 - i5;
        if (i3 <= i6 && i3 >= 0) {
            this.f2059g = i5 + i3;
            return;
        }
        FileInputStream fileInputStream = this.f2055c;
        if (i3 < 0) {
            throw C0126z.d();
        }
        int i7 = this.f2061i;
        int i8 = i7 + i5;
        int i9 = i8 + i3;
        int i10 = this.f2062j;
        if (i9 > i10) {
            J((i10 - i7) - i5);
            throw C0126z.e();
        }
        this.f2061i = i8;
        this.f2057e = 0;
        this.f2059g = 0;
        while (i6 < i3) {
            long j3 = i3 - i6;
            try {
                try {
                    long jSkip = fileInputStream.skip(j3);
                    if (jSkip < 0 || jSkip > j3) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i6 += (int) jSkip;
                    }
                } catch (C0126z e3) {
                    e3.f2116k = true;
                    throw e3;
                }
            } catch (Throwable th) {
                this.f2061i += i6;
                H();
                throw th;
            }
        }
        this.f2061i += i6;
        H();
        if (i6 >= i3) {
            return;
        }
        int i11 = this.f2057e;
        int i12 = i11 - this.f2059g;
        this.f2059g = i11;
        I(1);
        while (true) {
            int i13 = i3 - i12;
            int i14 = this.f2057e;
            if (i13 <= i14) {
                this.f2059g = i13;
                return;
            } else {
                i12 += i14;
                this.f2059g = i14;
                I(1);
            }
        }
    }

    public final boolean K(int i3) throws IOException {
        FileInputStream fileInputStream = this.f2055c;
        int i4 = this.f2059g;
        int i5 = i4 + i3;
        int i6 = this.f2057e;
        if (i5 <= i6) {
            throw new IllegalStateException(B1.e.h("refillBuffer() called when ", i3, " bytes were already available in buffer"));
        }
        int i7 = this.f2061i;
        if (i3 <= (Integer.MAX_VALUE - i7) - i4 && i7 + i4 + i3 <= this.f2062j) {
            byte[] bArr = this.f2056d;
            if (i4 > 0) {
                if (i6 > i4) {
                    System.arraycopy(bArr, i4, bArr, 0, i6 - i4);
                }
                this.f2061i += i4;
                this.f2057e -= i4;
                this.f2059g = 0;
            }
            int i8 = this.f2057e;
            try {
                int i9 = fileInputStream.read(bArr, i8, Math.min(bArr.length - i8, (Integer.MAX_VALUE - this.f2061i) - i8));
                if (i9 == 0 || i9 < -1 || i9 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i9 + "\nThe InputStream implementation is buggy.");
                }
                if (i9 > 0) {
                    this.f2057e += i9;
                    H();
                    if (this.f2057e >= i3) {
                        return true;
                    }
                    return K(i3);
                }
            } catch (C0126z e3) {
                e3.f2116k = true;
                throw e3;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final void a(int i3) throws C0126z {
        if (this.f2060h != i3) {
            throw new C0126z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final int b() {
        return this.f2061i + this.f2059g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final boolean c() {
        return this.f2059g == this.f2057e && !K(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final void d(int i3) {
        this.f2062j = i3;
        H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final int e(int i3) throws C0126z {
        if (i3 < 0) {
            throw C0126z.d();
        }
        int i4 = this.f2061i + this.f2059g + i3;
        if (i4 < 0) {
            throw new C0126z("Failed to parse the message.");
        }
        int i5 = this.f2062j;
        if (i4 > i5) {
            throw C0126z.e();
        }
        this.f2062j = i4;
        H();
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final boolean f() {
        return F() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final C0108g g() throws IOException {
        int iE = E();
        int i3 = this.f2057e;
        int i4 = this.f2059g;
        int i5 = i3 - i4;
        byte[] bArr = this.f2056d;
        if (iE <= i5 && iE > 0) {
            C0108g c0108gC = C0108g.c(bArr, i4, iE);
            this.f2059g += iE;
            return c0108gC;
        }
        if (iE == 0) {
            return C0108g.f2044m;
        }
        if (iE < 0) {
            throw C0126z.d();
        }
        byte[] bArrA = A(iE);
        if (bArrA != null) {
            return C0108g.c(bArrA, 0, bArrA.length);
        }
        int i6 = this.f2059g;
        int i7 = this.f2057e;
        int length = i7 - i6;
        this.f2061i += i7;
        this.f2059g = 0;
        this.f2057e = 0;
        ArrayList arrayListB = B(iE - length);
        byte[] bArr2 = new byte[iE];
        System.arraycopy(bArr, i6, bArr2, 0, length);
        int size = arrayListB.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayListB.get(i8);
            i8++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0108g c0108g = C0108g.f2044m;
        return new C0108g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final int i() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final long k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final int m() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final long n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final int o() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final long p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final int q() {
        int iE = E();
        return (-(iE & 1)) ^ (iE >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final long r() {
        long jF = F();
        return (-(jF & 1)) ^ (jF >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final String s() throws C0126z {
        int iE = E();
        byte[] bArr = this.f2056d;
        if (iE > 0) {
            int i3 = this.f2057e;
            int i4 = this.f2059g;
            if (iE <= i3 - i4) {
                String str = new String(bArr, i4, iE, AbstractC0124x.f2114a);
                this.f2059g += iE;
                return str;
            }
        }
        if (iE == 0) {
            return StringUtils.EMPTY;
        }
        if (iE < 0) {
            throw C0126z.d();
        }
        if (iE > this.f2057e) {
            return new String(z(iE), AbstractC0124x.f2114a);
        }
        I(iE);
        String str2 = new String(bArr, this.f2059g, iE, AbstractC0124x.f2114a);
        this.f2059g += iE;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final String t() throws IOException {
        int iE = E();
        int i3 = this.f2059g;
        int i4 = this.f2057e;
        int i5 = i4 - i3;
        byte[] bArrZ = this.f2056d;
        if (iE <= i5 && iE > 0) {
            this.f2059g = i3 + iE;
        } else {
            if (iE == 0) {
                return StringUtils.EMPTY;
            }
            if (iE < 0) {
                throw C0126z.d();
            }
            i3 = 0;
            if (iE <= i4) {
                I(iE);
                this.f2059g = iE;
            } else {
                bArrZ = z(iE);
            }
        }
        return l0.f2083a.o(bArrZ, i3, iE);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final int u() throws C0126z {
        if (c()) {
            this.f2060h = 0;
            return 0;
        }
        int iE = E();
        this.f2060h = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw new C0126z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final int v() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final long w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0111j
    public final boolean x(int i3) throws C0126z {
        int i4 = i3 & 7;
        int i5 = 0;
        if (i4 != 0) {
            if (i4 == 1) {
                J(8);
                return true;
            }
            if (i4 == 2) {
                J(E());
                return true;
            }
            if (i4 == 3) {
                y();
                a(((i3 >>> 3) << 3) | 4);
                return true;
            }
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw C0126z.b();
            }
            J(4);
            return true;
        }
        int i6 = this.f2057e - this.f2059g;
        byte[] bArr = this.f2056d;
        if (i6 >= 10) {
            while (i5 < 10) {
                int i7 = this.f2059g;
                this.f2059g = i7 + 1;
                if (bArr[i7] < 0) {
                    i5++;
                }
            }
            throw C0126z.c();
        }
        while (i5 < 10) {
            if (this.f2059g == this.f2057e) {
                I(1);
            }
            int i8 = this.f2059g;
            this.f2059g = i8 + 1;
            if (bArr[i8] < 0) {
                i5++;
            }
        }
        throw C0126z.c();
        return true;
    }

    public final byte[] z(int i3) throws IOException {
        byte[] bArrA = A(i3);
        if (bArrA != null) {
            return bArrA;
        }
        int i4 = this.f2059g;
        int i5 = this.f2057e;
        int length = i5 - i4;
        this.f2061i += i5;
        this.f2059g = 0;
        this.f2057e = 0;
        ArrayList arrayListB = B(i3 - length);
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f2056d, i4, bArr, 0, length);
        int size = arrayListB.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListB.get(i6);
            i6++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}
