package D;

import android.graphics.Point;

/* renamed from: D.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016q {

    /* renamed from: a, reason: collision with root package name */
    public final int f257a;

    /* renamed from: b, reason: collision with root package name */
    public final int f258b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f259c;

    public C0016q(int i3, int i4, Point point) {
        int i5 = point.x;
        int i6 = point.y;
        this.f257a = i3;
        this.f258b = i4;
        this.f259c = new Point(i5, i6);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0016q) {
            C0016q c0016q = (C0016q) obj;
            if (this.f257a == c0016q.f257a && this.f258b == c0016q.f258b && this.f259c.equals(c0016q.f259c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f259c.hashCode() + (((this.f257a * 31) + this.f258b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i3 = this.f257a;
        sb.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.f258b);
        sb.append(", center=");
        sb.append(this.f259c);
        sb.append('}');
        return sb.toString();
    }
}
