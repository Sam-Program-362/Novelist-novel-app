package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115l extends H2.h {
    public static final Logger n = Logger.getLogger(C0115l.class.getName());

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f2077o = i0.f2067e;

    /* renamed from: i, reason: collision with root package name */
    public E f2078i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f2079j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2080k;

    /* renamed from: l, reason: collision with root package name */
    public int f2081l;

    /* renamed from: m, reason: collision with root package name */
    public final V.l0 f2082m;

    public C0115l(V.l0 l0Var, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i3, 20);
        this.f2079j = new byte[max];
        this.f2080k = max;
        this.f2082m = l0Var;
    }

    public static int X(int i3, C0110g c0110g) {
        int Z2 = Z(i3);
        int size = c0110g.size();
        return a0(size) + size + Z2;
    }

    public static int Y(String str) {
        int length;
        try {
            length = l0.a(str);
        } catch (k0 unused) {
            length = str.getBytes(AbstractC0126x.f2114a).length;
        }
        return a0(length) + length;
    }

    public static int Z(int i3) {
        return a0(i3 << 3);
    }

    public static int a0(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int b0(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    @Override // H2.h
    public final void I(byte[] bArr, int i3, int i4) {
        f0(bArr, i3, i4);
    }

    public final void S(int i3) {
        int i4 = this.f2081l;
        int i5 = i4 + 1;
        this.f2081l = i5;
        byte[] bArr = this.f2079j;
        bArr[i4] = (byte) (i3 & 255);
        int i6 = i4 + 2;
        this.f2081l = i6;
        bArr[i5] = (byte) ((i3 >> 8) & 255);
        int i7 = i4 + 3;
        this.f2081l = i7;
        bArr[i6] = (byte) ((i3 >> 16) & 255);
        this.f2081l = i4 + 4;
        bArr[i7] = (byte) ((i3 >> 24) & 255);
    }

    public final void T(long j3) {
        int i3 = this.f2081l;
        int i4 = i3 + 1;
        this.f2081l = i4;
        byte[] bArr = this.f2079j;
        bArr[i3] = (byte) (j3 & 255);
        int i5 = i3 + 2;
        this.f2081l = i5;
        bArr[i4] = (byte) ((j3 >> 8) & 255);
        int i6 = i3 + 3;
        this.f2081l = i6;
        bArr[i5] = (byte) ((j3 >> 16) & 255);
        int i7 = i3 + 4;
        this.f2081l = i7;
        bArr[i6] = (byte) (255 & (j3 >> 24));
        int i8 = i3 + 5;
        this.f2081l = i8;
        bArr[i7] = (byte) (((int) (j3 >> 32)) & 255);
        int i9 = i3 + 6;
        this.f2081l = i9;
        bArr[i8] = (byte) (((int) (j3 >> 40)) & 255);
        int i10 = i3 + 7;
        this.f2081l = i10;
        bArr[i9] = (byte) (((int) (j3 >> 48)) & 255);
        this.f2081l = i3 + 8;
        bArr[i10] = (byte) (((int) (j3 >> 56)) & 255);
    }

    public final void U(int i3, int i4) {
        V((i3 << 3) | i4);
    }

    public final void V(int i3) {
        boolean z3 = f2077o;
        byte[] bArr = this.f2079j;
        if (z3) {
            while ((i3 & (-128)) != 0) {
                int i4 = this.f2081l;
                this.f2081l = i4 + 1;
                i0.j(bArr, i4, (byte) ((i3 | 128) & 255));
                i3 >>>= 7;
            }
            int i5 = this.f2081l;
            this.f2081l = i5 + 1;
            i0.j(bArr, i5, (byte) i3);
            return;
        }
        while ((i3 & (-128)) != 0) {
            int i6 = this.f2081l;
            this.f2081l = i6 + 1;
            bArr[i6] = (byte) ((i3 | 128) & 255);
            i3 >>>= 7;
        }
        int i7 = this.f2081l;
        this.f2081l = i7 + 1;
        bArr[i7] = (byte) i3;
    }

    public final void W(long j3) {
        boolean z3 = f2077o;
        byte[] bArr = this.f2079j;
        if (z3) {
            while ((j3 & (-128)) != 0) {
                int i3 = this.f2081l;
                this.f2081l = i3 + 1;
                i0.j(bArr, i3, (byte) ((((int) j3) | 128) & 255));
                j3 >>>= 7;
            }
            int i4 = this.f2081l;
            this.f2081l = i4 + 1;
            i0.j(bArr, i4, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i5 = this.f2081l;
            this.f2081l = i5 + 1;
            bArr[i5] = (byte) ((((int) j3) | 128) & 255);
            j3 >>>= 7;
        }
        int i6 = this.f2081l;
        this.f2081l = i6 + 1;
        bArr[i6] = (byte) j3;
    }

    public final void c0() {
        this.f2082m.write(this.f2079j, 0, this.f2081l);
        this.f2081l = 0;
    }

    public final void d0(int i3) {
        if (this.f2080k - this.f2081l < i3) {
            c0();
        }
    }

    public final void e0(byte b3) {
        if (this.f2081l == this.f2080k) {
            c0();
        }
        int i3 = this.f2081l;
        this.f2081l = i3 + 1;
        this.f2079j[i3] = b3;
    }

    public final void f0(byte[] bArr, int i3, int i4) {
        int i5 = this.f2081l;
        int i6 = this.f2080k;
        int i7 = i6 - i5;
        byte[] bArr2 = this.f2079j;
        if (i7 >= i4) {
            System.arraycopy(bArr, i3, bArr2, i5, i4);
            this.f2081l += i4;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i5, i7);
        int i8 = i3 + i7;
        int i9 = i4 - i7;
        this.f2081l = i6;
        c0();
        if (i9 > i6) {
            this.f2082m.write(bArr, i8, i9);
        } else {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            this.f2081l = i9;
        }
    }

    public final void g0(int i3, boolean z3) {
        d0(11);
        U(i3, 0);
        byte b3 = z3 ? (byte) 1 : (byte) 0;
        int i4 = this.f2081l;
        this.f2081l = i4 + 1;
        this.f2079j[i4] = b3;
    }

    public final void h0(int i3, C0110g c0110g) {
        s0(i3, 2);
        i0(c0110g);
    }

    public final void i0(C0110g c0110g) {
        u0(c0110g.size());
        I(c0110g.f2046l, c0110g.e(), c0110g.size());
    }

    public final void j0(int i3, int i4) {
        d0(14);
        U(i3, 5);
        S(i4);
    }

    public final void k0(int i3) {
        d0(4);
        S(i3);
    }

    public final void l0(long j3, int i3) {
        d0(18);
        U(i3, 1);
        T(j3);
    }

    public final void m0(long j3) {
        d0(8);
        T(j3);
    }

    public final void n0(int i3, int i4) {
        d0(20);
        U(i3, 0);
        if (i4 >= 0) {
            V(i4);
        } else {
            W(i4);
        }
    }

    public final void o0(int i3) {
        if (i3 >= 0) {
            u0(i3);
        } else {
            w0(i3);
        }
    }

    public final void p0(int i3, AbstractC0104a abstractC0104a, V v3) {
        s0(i3, 2);
        u0(abstractC0104a.a(v3));
        v3.b(abstractC0104a, this.f2078i);
    }

    public final void q0(String str, int i3) {
        s0(i3, 2);
        r0(str);
    }

    public final void r0(String str) {
        try {
            int length = str.length() * 3;
            int a02 = a0(length);
            int i3 = a02 + length;
            int i4 = this.f2080k;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int q3 = l0.f2083a.q(str, bArr, 0, length);
                u0(q3);
                f0(bArr, 0, q3);
                return;
            }
            if (i3 > i4 - this.f2081l) {
                c0();
            }
            int a03 = a0(str.length());
            int i5 = this.f2081l;
            byte[] bArr2 = this.f2079j;
            try {
                if (a03 == a02) {
                    int i6 = i5 + a03;
                    this.f2081l = i6;
                    int q4 = l0.f2083a.q(str, bArr2, i6, i4 - i6);
                    this.f2081l = i5;
                    V((q4 - i5) - a03);
                    this.f2081l = q4;
                } else {
                    int a3 = l0.a(str);
                    V(a3);
                    this.f2081l = l0.f2083a.q(str, bArr2, this.f2081l, a3);
                }
            } catch (k0 e3) {
                this.f2081l = i5;
                throw e3;
            } catch (ArrayIndexOutOfBoundsException e4) {
                throw new X1.b(e4);
            }
        } catch (k0 e5) {
            n.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
            byte[] bytes = str.getBytes(AbstractC0126x.f2114a);
            try {
                u0(bytes.length);
                I(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e6) {
                throw new X1.b(e6);
            }
        }
    }

    public final void s0(int i3, int i4) {
        u0((i3 << 3) | i4);
    }

    public final void t0(int i3, int i4) {
        d0(20);
        U(i3, 0);
        V(i4);
    }

    public final void u0(int i3) {
        d0(5);
        V(i3);
    }

    public final void v0(long j3, int i3) {
        d0(20);
        U(i3, 0);
        W(j3);
    }

    public final void w0(long j3) {
        d0(10);
        W(j3);
    }
}
