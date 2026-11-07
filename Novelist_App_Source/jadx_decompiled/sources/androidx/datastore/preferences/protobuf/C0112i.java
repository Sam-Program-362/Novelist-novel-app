package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112i extends AbstractC0113j {

    /* renamed from: c, reason: collision with root package name */
    public final FileInputStream f2055c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2056d;

    /* renamed from: e, reason: collision with root package name */
    public int f2057e;

    /* renamed from: f, reason: collision with root package name */
    public int f2058f;

    /* renamed from: g, reason: collision with root package name */
    public int f2059g;

    /* renamed from: h, reason: collision with root package name */
    public int f2060h;

    /* renamed from: i, reason: collision with root package name */
    public int f2061i;

    /* renamed from: j, reason: collision with root package name */
    public int f2062j = Integer.MAX_VALUE;

    public C0112i(FileInputStream fileInputStream) {
        Charset charset = AbstractC0126x.f2114a;
        this.f2055c = fileInputStream;
        this.f2056d = new byte[4096];
        this.f2057e = 0;
        this.f2059g = 0;
        this.f2061i = 0;
    }

    public final byte[] A(int i3) {
        if (i3 == 0) {
            return AbstractC0126x.f2115b;
        }
        if (i3 < 0) {
            throw C0128z.d();
        }
        int i4 = this.f2061i;
        int i5 = this.f2059g;
        int i6 = i4 + i5 + i3;
        if (i6 - Integer.MAX_VALUE > 0) {
            throw new C0128z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i7 = this.f2062j;
        if (i6 > i7) {
            J((i7 - i4) - i5);
            throw C0128z.e();
        }
        int i8 = this.f2057e - i5;
        int i9 = i3 - i8;
        FileInputStream fileInputStream = this.f2055c;
        if (i9 >= 4096) {
            try {
                if (i9 > fileInputStream.available()) {
                    return null;
                }
            } catch (C0128z e3) {
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
                int read = fileInputStream.read(bArr, i8, i3 - i8);
                if (read == -1) {
                    throw C0128z.e();
                }
                this.f2061i += read;
                i8 += read;
            } catch (C0128z e4) {
                e4.f2116k = true;
                throw e4;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i3) {
        ArrayList arrayList = new ArrayList();
        while (i3 > 0) {
            int min = Math.min(i3, 4096);
            byte[] bArr = new byte[min];
            int i4 = 0;
            while (i4 < min) {
                int read = this.f2055c.read(bArr, i4, min - i4);
                if (read == -1) {
                    throw C0128z.e();
                }
                this.f2061i += read;
                i4 += read;
            }
            i3 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i3 = this.f2059g;
        if (this.f2057e - i3 < 4) {
            I(4);
            i3 = this.f2059g;
        }
        this.f2059g = i3 + 4;
        byte[] bArr = this.f2056d;
        return ((bArr[i3 + 3] & ForkServer.ERROR) << 24) | (bArr[i3] & ForkServer.ERROR) | ((bArr[i3 + 1] & ForkServer.ERROR) << 8) | ((bArr[i3 + 2] & ForkServer.ERROR) << 16);
    }

    public final long D() {
        int i3 = this.f2059g;
        if (this.f2057e - i3 < 8) {
            I(8);
            i3 = this.f2059g;
        }
        this.f2059g = i3 + 8;
        byte[] bArr = this.f2056d;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
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
                            long j8 = j7 ^ (bArr[i10] << 28);
                            if (j8 >= 0) {
                                j5 = 266354560;
                            } else {
                                i10 = i3 + 6;
                                long j9 = j8 ^ (bArr[i6] << 35);
                                if (j9 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i6 = i3 + 7;
                                    j8 = j9 ^ (bArr[i10] << 42);
                                    if (j8 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j9 = j8 ^ (bArr[i6] << 49);
                                        if (j9 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i6 = i3 + 9;
                                            long j10 = (j9 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
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

    public final long G() {
        long j3 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.f2059g == this.f2057e) {
                I(1);
            }
            int i4 = this.f2059g;
            this.f2059g = i4 + 1;
            j3 |= (r3 & Byte.MAX_VALUE) << i3;
            if ((this.f2056d[i4] & 128) == 0) {
                return j3;
            }
        }
        throw C0128z.c();
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

    public final void I(int i3) {
        if (K(i3)) {
            return;
        }
        if (i3 <= (Integer.MAX_VALUE - this.f2061i) - this.f2059g) {
            throw C0128z.e();
        }
        throw new C0128z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i3) {
        int i4 = this.f2057e;
        int i5 = this.f2059g;
        int i6 = i4 - i5;
        if (i3 <= i6 && i3 >= 0) {
            this.f2059g = i5 + i3;
            return;
        }
        FileInputStream fileInputStream = this.f2055c;
        if (i3 < 0) {
            throw C0128z.d();
        }
        int i7 = this.f2061i;
        int i8 = i7 + i5;
        int i9 = i8 + i3;
        int i10 = this.f2062j;
        if (i9 > i10) {
            J((i10 - i7) - i5);
            throw C0128z.e();
        }
        this.f2061i = i8;
        this.f2057e = 0;
        this.f2059g = 0;
        while (i6 < i3) {
            long j3 = i3 - i6;
            try {
                try {
                    long skip = fileInputStream.skip(j3);
                    if (skip < 0 || skip > j3) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i6 += (int) skip;
                    }
                } catch (C0128z e3) {
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

    public final boolean K(int i3) {
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
                int read = fileInputStream.read(bArr, i8, Math.min(bArr.length - i8, (Integer.MAX_VALUE - this.f2061i) - i8));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.f2057e += read;
                    H();
                    if (this.f2057e >= i3) {
                        return true;
                    }
                    return K(i3);
                }
            } catch (C0128z e3) {
                e3.f2116k = true;
                throw e3;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final void a(int i3) {
        if (this.f2060h != i3) {
            throw new C0128z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final int b() {
        return this.f2061i + this.f2059g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final boolean c() {
        return this.f2059g == this.f2057e && !K(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final void d(int i3) {
        this.f2062j = i3;
        H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final int e(int i3) {
        if (i3 < 0) {
            throw C0128z.d();
        }
        int i4 = this.f2061i + this.f2059g + i3;
        if (i4 < 0) {
            throw new C0128z("Failed to parse the message.");
        }
        int i5 = this.f2062j;
        if (i4 > i5) {
            throw C0128z.e();
        }
        this.f2062j = i4;
        H();
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final boolean f() {
        return F() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final C0110g g() {
        int E3 = E();
        int i3 = this.f2057e;
        int i4 = this.f2059g;
        int i5 = i3 - i4;
        byte[] bArr = this.f2056d;
        if (E3 <= i5 && E3 > 0) {
            C0110g c3 = C0110g.c(bArr, i4, E3);
            this.f2059g += E3;
            return c3;
        }
        if (E3 == 0) {
            return C0110g.f2044m;
        }
        if (E3 < 0) {
            throw C0128z.d();
        }
        byte[] A2 = A(E3);
        if (A2 != null) {
            return C0110g.c(A2, 0, A2.length);
        }
        int i6 = this.f2059g;
        int i7 = this.f2057e;
        int i8 = i7 - i6;
        this.f2061i += i7;
        this.f2059g = 0;
        this.f2057e = 0;
        ArrayList B2 = B(E3 - i8);
        byte[] bArr2 = new byte[E3];
        System.arraycopy(bArr, i6, bArr2, 0, i8);
        int size = B2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = B2.get(i9);
            i9++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i8, bArr3.length);
            i8 += bArr3.length;
        }
        C0110g c0110g = C0110g.f2044m;
        return new C0110g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final int i() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final long k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final int m() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final long n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final int o() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final long p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final int q() {
        int E3 = E();
        return (-(E3 & 1)) ^ (E3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final long r() {
        long F3 = F();
        return (-(F3 & 1)) ^ (F3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final String s() {
        int E3 = E();
        byte[] bArr = this.f2056d;
        if (E3 > 0) {
            int i3 = this.f2057e;
            int i4 = this.f2059g;
            if (E3 <= i3 - i4) {
                String str = new String(bArr, i4, E3, AbstractC0126x.f2114a);
                this.f2059g += E3;
                return str;
            }
        }
        if (E3 == 0) {
            return StringUtils.EMPTY;
        }
        if (E3 < 0) {
            throw C0128z.d();
        }
        if (E3 > this.f2057e) {
            return new String(z(E3), AbstractC0126x.f2114a);
        }
        I(E3);
        String str2 = new String(bArr, this.f2059g, E3, AbstractC0126x.f2114a);
        this.f2059g += E3;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final String t() {
        int E3 = E();
        int i3 = this.f2059g;
        int i4 = this.f2057e;
        int i5 = i4 - i3;
        byte[] bArr = this.f2056d;
        if (E3 <= i5 && E3 > 0) {
            this.f2059g = i3 + E3;
        } else {
            if (E3 == 0) {
                return StringUtils.EMPTY;
            }
            if (E3 < 0) {
                throw C0128z.d();
            }
            i3 = 0;
            if (E3 <= i4) {
                I(E3);
                this.f2059g = E3;
            } else {
                bArr = z(E3);
            }
        }
        return l0.f2083a.o(bArr, i3, E3);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final int u() {
        if (c()) {
            this.f2060h = 0;
            return 0;
        }
        int E3 = E();
        this.f2060h = E3;
        if ((E3 >>> 3) != 0) {
            return E3;
        }
        throw new C0128z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final int v() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final long w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113j
    public final boolean x(int i3) {
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
                throw C0128z.b();
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
            throw C0128z.c();
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
        throw C0128z.c();
        return true;
    }

    public final byte[] z(int i3) {
        byte[] A2 = A(i3);
        if (A2 != null) {
            return A2;
        }
        int i4 = this.f2059g;
        int i5 = this.f2057e;
        int i6 = i5 - i4;
        this.f2061i += i5;
        this.f2059g = 0;
        this.f2057e = 0;
        ArrayList B2 = B(i3 - i6);
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f2056d, i4, bArr, 0, i6);
        int size = B2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = B2.get(i7);
            i7++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
            i6 += bArr2.length;
        }
        return bArr;
    }
}
