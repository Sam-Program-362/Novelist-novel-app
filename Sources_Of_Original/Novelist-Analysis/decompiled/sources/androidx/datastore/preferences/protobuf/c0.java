package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f2031f = new c0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f2034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2035d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2036e;

    public c0(int i3, int[] iArr, Object[] objArr, boolean z3) {
        this.f2032a = i3;
        this.f2033b = iArr;
        this.f2034c = objArr;
        this.f2036e = z3;
    }

    public final void a(int i3) {
        int[] iArr = this.f2033b;
        if (i3 > iArr.length) {
            int i4 = this.f2032a;
            int i5 = (i4 / 2) + i4;
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f2033b = Arrays.copyOf(iArr, i3);
            this.f2034c = Arrays.copyOf(this.f2034c, i3);
        }
    }

    public final int b() {
        int iZ;
        int iB0;
        int iZ2;
        int i3 = this.f2035d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f2032a; i5++) {
            int i6 = this.f2033b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 == 1) {
                    ((Long) this.f2034c[i5]).getClass();
                    iZ2 = C0113l.Z(i7) + 8;
                } else if (i8 == 2) {
                    iZ2 = C0113l.X(i7, (C0108g) this.f2034c[i5]);
                } else if (i8 == 3) {
                    iZ = C0113l.Z(i7) * 2;
                    iB0 = ((c0) this.f2034c[i5]).b();
                } else {
                    if (i8 != 5) {
                        throw new IllegalStateException(C0126z.b());
                    }
                    ((Integer) this.f2034c[i5]).getClass();
                    iZ2 = C0113l.Z(i7) + 4;
                }
                i4 = iZ2 + i4;
            } else {
                long jLongValue = ((Long) this.f2034c[i5]).longValue();
                iZ = C0113l.Z(i7);
                iB0 = C0113l.b0(jLongValue);
            }
            i4 = iB0 + iZ + i4;
        }
        this.f2035d = i4;
        return i4;
    }

    public final void c(int i3, Object obj) {
        if (!this.f2036e) {
            throw new UnsupportedOperationException();
        }
        a(this.f2032a + 1);
        int[] iArr = this.f2033b;
        int i4 = this.f2032a;
        iArr[i4] = i3;
        this.f2034c[i4] = obj;
        this.f2032a = i4 + 1;
    }

    public final void d(E e3) {
        if (this.f2032a == 0) {
            return;
        }
        e3.getClass();
        C0113l c0113l = (C0113l) e3.f1973a;
        for (int i3 = 0; i3 < this.f2032a; i3++) {
            int i4 = this.f2033b[i3];
            Object obj = this.f2034c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                c0113l.v0(((Long) obj).longValue(), i5);
            } else if (i6 == 1) {
                c0113l.l0(((Long) obj).longValue(), i5);
            } else if (i6 == 2) {
                c0113l.h0(i5, (C0108g) obj);
            } else if (i6 == 3) {
                c0113l.s0(i5, 3);
                ((c0) obj).d(e3);
                c0113l.s0(i5, 4);
            } else {
                if (i6 != 5) {
                    throw new RuntimeException(C0126z.b());
                }
                c0113l.j0(i5, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i3 = this.f2032a;
        if (i3 == c0Var.f2032a) {
            int[] iArr = this.f2033b;
            int[] iArr2 = c0Var.f2033b;
            for (int i4 = 0; i4 < i3; i4++) {
                if (iArr[i4] == iArr2[i4]) {
                }
            }
            Object[] objArr = this.f2034c;
            Object[] objArr2 = c0Var.f2034c;
            int i5 = this.f2032a;
            for (int i6 = 0; i6 < i5; i6++) {
                if (objArr[i6].equals(objArr2[i6])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f2032a;
        int i4 = (527 + i3) * 31;
        int[] iArr = this.f2033b;
        int iHashCode = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i3; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i4 + i5) * 31;
        Object[] objArr = this.f2034c;
        int i8 = this.f2032a;
        for (int i9 = 0; i9 < i8; i9++) {
            iHashCode = (iHashCode * 31) + objArr[i9].hashCode();
        }
        return i7 + iHashCode;
    }
}
