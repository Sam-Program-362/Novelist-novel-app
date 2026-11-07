package p004b1;

import B1.e;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f2571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f2576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2577h;

    /* JADX WARN: Illegal instructions before constructor call */
    public A(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < cArr.length; i3++) {
            char c3 = cArr[i3];
            if (!(c3 < 128)) {
                throw new IllegalArgumentException(AbstractC0168a.d("Non-ASCII character: %s", Character.valueOf(c3)));
            }
            if (!(bArr[c3] == -1)) {
                throw new IllegalArgumentException(AbstractC0168a.d("Duplicate character: %s", Character.valueOf(c3)));
            }
            bArr[c3] = (byte) i3;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a3 = (A) obj;
        return this.f2577h == a3.f2577h && Arrays.equals(this.f2571b, a3.f2571b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2571b) + (true != this.f2577h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f2570a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[LOOP:0: B:16:0x005d->B:18:0x0061, LOOP_END] */
    public A(String str, char[] cArr, byte[] bArr, boolean z3) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        int i3;
        this.f2570a = str;
        cArr.getClass();
        this.f2571b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (E.f2583a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f2573d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i4 = 1 << (3 - iNumberOfTrailingZeros);
                        this.f2574e = i4;
                        this.f2575f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.f2572c = length - 1;
                        this.f2576g = bArr;
                        zArr = new boolean[i4];
                        for (i3 = 0; i3 < this.f2575f; i3++) {
                            int i5 = this.f2573d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[AbstractC0168a.a(i3 * 8, i5)] = true;
                        }
                        this.f2577h = z3;
                        return;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f2573d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i6 = 1 << (3 - iNumberOfTrailingZeros2);
                        this.f2574e = i6;
                        this.f2575f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                        this.f2572c = length - 1;
                        this.f2576g = bArr;
                        zArr = new boolean[i6];
                        while (i3 < this.f2575f) {
                            int i7 = this.f2573d;
                            RoundingMode roundingMode3 = RoundingMode.CEILING;
                            zArr[AbstractC0168a.a(i3 * 8, i7)] = true;
                        }
                        this.f2577h = z3;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                        this.f2573d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i8 = 1 << (3 - iNumberOfTrailingZeros3);
                        this.f2574e = i8;
                        this.f2575f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                        this.f2572c = length - 1;
                        this.f2576g = bArr;
                        zArr = new boolean[i8];
                        while (i3 < this.f2575f) {
                            int i9 = this.f2573d;
                            RoundingMode roundingMode4 = RoundingMode.CEILING;
                            zArr[AbstractC0168a.a(i3 * 8, i9)] = true;
                        }
                        this.f2577h = z3;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e3) {
            throw new IllegalArgumentException(e.g("Illegal alphabet length ", cArr.length), e3);
        }
    }
}
