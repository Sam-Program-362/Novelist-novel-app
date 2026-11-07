package h0;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2859a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2860b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2861c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2862d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2863e;

    public C0259b(int i3, float f3, float f4, float f5, long j3) {
        this.f2859a = i3;
        this.f2860b = f3;
        this.f2861c = f4;
        this.f2862d = f5;
        this.f2863e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0259b.class == obj.getClass()) {
            C0259b c0259b = (C0259b) obj;
            return this.f2861c == c0259b.f2861c && this.f2862d == c0259b.f2862d && this.f2860b == c0259b.f2860b && this.f2859a == c0259b.f2859a && this.f2863e == c0259b.f2863e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2863e) + ((Integer.hashCode(this.f2859a) + ((Float.hashCode(this.f2860b) + ((Float.hashCode(this.f2862d) + (Float.hashCode(this.f2861c) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f2861c + ", touchY=" + this.f2862d + ", progress=" + this.f2860b + ", swipeEdge=" + this.f2859a + ", frameTimeMillis=" + this.f2863e + ')';
    }
}
