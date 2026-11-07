package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0108g implements Iterable, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0108g f2044m = new C0108g(AbstractC0124x.f2115b);
    public static final C0106e n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2045k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f2046l;

    static {
        n = AbstractC0104c.a() ? new C0106e(1) : new C0106e(0);
    }

    public C0108g(byte[] bArr) {
        bArr.getClass();
        this.f2046l = bArr;
    }

    public static int b(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(B1.e.h("Beginning index: ", i3, " < 0"));
        }
        if (i4 < i3) {
            throw new IndexOutOfBoundsException(B1.e.i("Beginning index larger than ending index: ", i3, ", ", i4));
        }
        throw new IndexOutOfBoundsException(B1.e.i("End index: ", i4, " >= ", i5));
    }

    public static C0108g c(byte[] bArr, int i3, int i4) {
        byte[] bArrCopyOfRange;
        b(i3, i3 + i4, bArr.length);
        switch (n.f2040a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, i4 + i3);
                break;
            default:
                bArrCopyOfRange = new byte[i4];
                System.arraycopy(bArr, i3, bArrCopyOfRange, 0, i4);
                break;
        }
        return new C0108g(bArrCopyOfRange);
    }

    public byte a(int i3) {
        return this.f2046l[i3];
    }

    public void d(byte[] bArr, int i3) {
        System.arraycopy(this.f2046l, 0, bArr, 0, i3);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0108g) || size() != ((C0108g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0108g)) {
            return obj.equals(this);
        }
        C0108g c0108g = (C0108g) obj;
        int i3 = this.f2045k;
        int i4 = c0108g.f2045k;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        int size = size();
        if (size > c0108g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0108g.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0108g.size());
        }
        byte[] bArr = c0108g.f2046l;
        int iE = e() + size;
        int iE2 = e();
        int iE3 = c0108g.e();
        while (iE2 < iE) {
            if (this.f2046l[iE2] != bArr[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    public byte f(int i3) {
        return this.f2046l[i3];
    }

    public final int hashCode() {
        int i3 = this.f2045k;
        if (i3 != 0) {
            return i3;
        }
        int size = size();
        int iE = e();
        int i4 = size;
        for (int i5 = iE; i5 < iE + size; i5++) {
            i4 = (i4 * 31) + this.f2046l[i5];
        }
        if (i4 == 0) {
            i4 = 1;
        }
        this.f2045k = i4;
        return i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0105d(this);
    }

    public int size() {
        return this.f2046l.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = S0.a.r(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iB = b(0, 47, size());
            sb.append(S0.a.r(iB == 0 ? f2044m : new C0107f(this.f2046l, e(), iB)));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return B1.e.m(sb2, string, "\">");
    }
}
