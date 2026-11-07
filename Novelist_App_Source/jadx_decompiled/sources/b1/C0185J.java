package b1;

import androidx.datastore.preferences.protobuf.C0107d;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: b1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0185J implements Iterable, Serializable {

    /* renamed from: m, reason: collision with root package name */
    public static final C0185J f2589m = new C0185J(AbstractC0186K.f2592a);

    /* renamed from: k, reason: collision with root package name */
    public int f2590k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f2591l;

    static {
        int i3 = AbstractC0183H.f2587a;
    }

    public C0185J(byte[] bArr) {
        bArr.getClass();
        this.f2591l = bArr;
    }

    public static int g(int i3, int i4, int i5) {
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

    public static C0185J i(byte[] bArr, int i3) {
        g(0, i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return new C0185J(bArr2);
    }

    public byte a(int i3) {
        return this.f2591l[i3];
    }

    public byte b(int i3) {
        return this.f2591l[i3];
    }

    public int c() {
        return 0;
    }

    public int d() {
        return this.f2591l.length;
    }

    public void e(byte[] bArr, int i3) {
        System.arraycopy(this.f2591l, 0, bArr, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0185J) || d() != ((C0185J) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof C0185J)) {
            return obj.equals(this);
        }
        C0185J c0185j = (C0185J) obj;
        int i3 = this.f2590k;
        int i4 = c0185j.f2590k;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        int d3 = d();
        if (d3 > c0185j.d()) {
            throw new IllegalArgumentException("Length too large: " + d3 + d());
        }
        if (d3 > c0185j.d()) {
            throw new IllegalArgumentException(B1.e.i("Ran off end of other: 0, ", d3, ", ", c0185j.d()));
        }
        byte[] bArr = c0185j.f2591l;
        int c3 = c() + d3;
        int c4 = c();
        int c5 = c0185j.c();
        while (c4 < c3) {
            if (this.f2591l[c4] != bArr[c5]) {
                return false;
            }
            c4++;
            c5++;
        }
        return true;
    }

    public final ByteArrayInputStream f() {
        return new ByteArrayInputStream(this.f2591l, c(), d());
    }

    public final int hashCode() {
        int i3 = this.f2590k;
        if (i3 != 0) {
            return i3;
        }
        int d3 = d();
        int c3 = c();
        byte[] bArr = AbstractC0186K.f2592a;
        int i4 = d3;
        for (int i5 = c3; i5 < c3 + d3; i5++) {
            i4 = (i4 * 31) + this.f2591l[i5];
        }
        if (i4 == 0) {
            i4 = 1;
        }
        this.f2590k = i4;
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0107d(this);
    }

    public final byte[] j() {
        int d3 = d();
        if (d3 == 0) {
            return AbstractC0186K.f2592a;
        }
        byte[] bArr = new byte[d3];
        e(bArr, d3);
        return bArr;
    }

    public final String toString() {
        C0185J c0184i;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d3 = d();
        if (d() <= 50) {
            concat = AbstractC0197a.c(this);
        } else {
            int g3 = g(0, 47, d());
            if (g3 == 0) {
                c0184i = f2589m;
            } else {
                c0184i = new C0184I(this.f2591l, c(), g3);
            }
            concat = AbstractC0197a.c(c0184i).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d3);
        sb.append(" contents=\"");
        return B1.e.m(sb, concat, "\">");
    }
}
