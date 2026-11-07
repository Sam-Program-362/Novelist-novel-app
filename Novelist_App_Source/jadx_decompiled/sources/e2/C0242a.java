package e2;

import java.util.Iterator;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0242a implements Iterable, b2.a {

    /* renamed from: k, reason: collision with root package name */
    public final int f2783k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2784l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2785m;

    public C0242a(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2783k = i3;
        if (i5 > 0) {
            if (i3 < i4) {
                int i6 = i4 % i5;
                int i7 = i3 % i5;
                int i8 = ((i6 < 0 ? i6 + i5 : i6) - (i7 < 0 ? i7 + i5 : i7)) % i5;
                i4 -= i8 < 0 ? i8 + i5 : i8;
            }
        } else {
            if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i3 > i4) {
                int i9 = -i5;
                int i10 = i3 % i9;
                int i11 = i4 % i9;
                int i12 = ((i10 < 0 ? i10 + i9 : i10) - (i11 < 0 ? i11 + i9 : i11)) % i9;
                i4 += i12 < 0 ? i12 + i9 : i12;
            }
        }
        this.f2784l = i4;
        this.f2785m = i5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0242a)) {
            return false;
        }
        if (isEmpty() && ((C0242a) obj).isEmpty()) {
            return true;
        }
        C0242a c0242a = (C0242a) obj;
        return this.f2783k == c0242a.f2783k && this.f2784l == c0242a.f2784l && this.f2785m == c0242a.f2785m;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2783k * 31) + this.f2784l) * 31) + this.f2785m;
    }

    public boolean isEmpty() {
        int i3 = this.f2785m;
        int i4 = this.f2784l;
        int i5 = this.f2783k;
        return i3 > 0 ? i5 > i4 : i5 < i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2783k, this.f2784l, this.f2785m);
    }

    public String toString() {
        StringBuilder sb;
        int i3 = this.f2784l;
        int i4 = this.f2783k;
        int i5 = this.f2785m;
        if (i5 > 0) {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append("..");
            sb.append(i3);
            sb.append(" step ");
            sb.append(i5);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i3);
            sb.append(" step ");
            sb.append(-i5);
        }
        return sb.toString();
    }
}
