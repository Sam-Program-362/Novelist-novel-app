package u0;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4585a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4586b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4587c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4588d;

    public b(Rect rect) {
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        this.f4585a = i3;
        this.f4586b = i4;
        this.f4587c = i5;
        this.f4588d = i6;
        if (i3 > i5) {
            throw new IllegalArgumentException(B1.e.i("Left must be less than or equal to right, left: ", i3, ", right: ", i5).toString());
        }
        if (i4 > i6) {
            throw new IllegalArgumentException(B1.e.i("top must be less than or equal to bottom, top: ", i4, ", bottom: ", i6).toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f4585a, this.f4586b, this.f4587c, this.f4588d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        a2.h.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f4585a == bVar.f4585a && this.f4586b == bVar.f4586b && this.f4587c == bVar.f4587c && this.f4588d == bVar.f4588d;
    }

    public final int hashCode() {
        return (((((this.f4585a * 31) + this.f4586b) * 31) + this.f4587c) * 31) + this.f4588d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f4585a + ',' + this.f4586b + ',' + this.f4587c + ',' + this.f4588d + "] }";
    }
}
