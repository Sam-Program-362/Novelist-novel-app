package w;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f4634e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4635a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4636b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4637c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4638d;

    public b(int i3, int i4, int i5, int i6) {
        this.f4635a = i3;
        this.f4636b = i4;
        this.f4637c = i5;
        this.f4638d = i6;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f4635a, bVar2.f4635a), Math.max(bVar.f4636b, bVar2.f4636b), Math.max(bVar.f4637c, bVar2.f4637c), Math.max(bVar.f4638d, bVar2.f4638d));
    }

    public static b b(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f4634e : new b(i3, i4, i5, i6);
    }

    public static b c(Insets insets) {
        int i3;
        int i4;
        int i5;
        int i6;
        i3 = insets.left;
        i4 = insets.top;
        i5 = insets.right;
        i6 = insets.bottom;
        return b(i3, i4, i5, i6);
    }

    public final Insets d() {
        return s.f.a(this.f4635a, this.f4636b, this.f4637c, this.f4638d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4638d == bVar.f4638d && this.f4635a == bVar.f4635a && this.f4637c == bVar.f4637c && this.f4636b == bVar.f4636b;
    }

    public final int hashCode() {
        return (((((this.f4635a * 31) + this.f4636b) * 31) + this.f4637c) * 31) + this.f4638d;
    }

    public final String toString() {
        return "Insets{left=" + this.f4635a + ", top=" + this.f4636b + ", right=" + this.f4637c + ", bottom=" + this.f4638d + '}';
    }
}
