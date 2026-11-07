package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0110g implements Iterable, Serializable {

    /* renamed from: m, reason: collision with root package name */
    public static final C0110g f2044m = new C0110g(AbstractC0126x.f2115b);
    public static final C0108e n;

    /* renamed from: k, reason: collision with root package name */
    public int f2045k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f2046l;

    static {
        n = AbstractC0106c.a() ? new C0108e(1) : new C0108e(0);
    }

    public C0110g(byte[] bArr) {
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

    public static C0110g c(byte[] bArr, int i3, int i4) {
        byte[] copyOfRange;
        b(i3, i3 + i4, bArr.length);
        switch (n.f2040a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i3, i4 + i3);
                break;
            default:
                copyOfRange = new byte[i4];
                System.arraycopy(bArr, i3, copyOfRange, 0, i4);
                break;
        }
        return new C0110g(copyOfRange);
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
        if (!(obj instanceof C0110g) || size() != ((C0110g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0110g)) {
            return obj.equals(this);
        }
        C0110g c0110g = (C0110g) obj;
        int i3 = this.f2045k;
        int i4 = c0110g.f2045k;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        int size = size();
        if (size > c0110g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0110g.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0110g.size());
        }
        byte[] bArr = c0110g.f2046l;
        int e3 = e() + size;
        int e4 = e();
        int e5 = c0110g.e();
        while (e4 < e3) {
            if (this.f2046l[e4] != bArr[e5]) {
                return false;
            }
            e4++;
            e5++;
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
        int e3 = e();
        int i4 = size;
        for (int i5 = e3; i5 < e3 + size; i5++) {
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
        return new C0107d(this);
    }

    public int size() {
        return this.f2046l.length;
    }

    public final String toString() {
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = S0.a.r(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int b3 = b(0, 47, size());
            sb2.append(S0.a.r(b3 == 0 ? f2044m : new C0109f(this.f2046l, e(), b3)));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return B1.e.m(sb3, sb, "\">");
    }
}
