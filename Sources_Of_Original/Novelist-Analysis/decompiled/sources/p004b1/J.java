package p004b1;

import B1.e;
import androidx.datastore.preferences.protobuf.C0105d;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class J implements Iterable, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final J f2589m = new J(K.f2592a);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2590k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f2591l;

    static {
        int i3 = H.f2587a;
    }

    public J(byte[] bArr) {
        bArr.getClass();
        this.f2591l = bArr;
    }

    public static int g(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(e.h("Beginning index: ", i3, " < 0"));
        }
        if (i4 < i3) {
            throw new IndexOutOfBoundsException(e.i("Beginning index larger than ending index: ", i3, ", ", i4));
        }
        throw new IndexOutOfBoundsException(e.i("End index: ", i4, " >= ", i5));
    }

    public static J i(byte[] bArr, int i3) {
        g(0, i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return new J(bArr2);
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
        if (!(obj instanceof J) || d() != ((J) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof J)) {
            return obj.equals(this);
        }
        J j3 = (J) obj;
        int i3 = this.f2590k;
        int i4 = j3.f2590k;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        int iD = d();
        if (iD > j3.d()) {
            throw new IllegalArgumentException("Length too large: " + iD + d());
        }
        if (iD > j3.d()) {
            throw new IllegalArgumentException(e.i("Ran off end of other: 0, ", iD, ", ", j3.d()));
        }
        byte[] bArr = j3.f2591l;
        int iC = c() + iD;
        int iC2 = c();
        int iC3 = j3.c();
        while (iC2 < iC) {
            if (this.f2591l[iC2] != bArr[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
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
        int iD = d();
        int iC = c();
        byte[] bArr = K.f2592a;
        int i4 = iD;
        for (int i5 = iC; i5 < iC + iD; i5++) {
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
        return new C0105d(this);
    }

    public final byte[] j() {
        int iD = d();
        if (iD == 0) {
            return K.f2592a;
        }
        byte[] bArr = new byte[iD];
        e(bArr, iD);
        return bArr;
    }

    public final String toString() {
        J i3;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iD = d();
        if (d() <= 50) {
            strConcat = AbstractC0168a.c(this);
        } else {
            int iG = g(0, 47, d());
            if (iG == 0) {
                i3 = f2589m;
            } else {
                i3 = new I(this.f2591l, c(), iG);
            }
            strConcat = AbstractC0168a.c(i3).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iD);
        sb.append(" contents=\"");
        return e.m(sb, strConcat, "\">");
    }
}
