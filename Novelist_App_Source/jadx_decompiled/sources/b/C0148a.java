package b;

import h0.C0259b;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148a {

    /* renamed from: a, reason: collision with root package name */
    public final float f2279a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2280b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2282d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2283e;

    public C0148a(C0259b c0259b) {
        float f3 = c0259b.f2861c;
        float f4 = c0259b.f2862d;
        float f5 = c0259b.f2860b;
        int i3 = c0259b.f2859a;
        long j3 = c0259b.f2863e;
        this.f2279a = f3;
        this.f2280b = f4;
        this.f2281c = f5;
        this.f2282d = i3;
        this.f2283e = j3;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f2279a + ", touchY=" + this.f2280b + ", progress=" + this.f2281c + ", swipeEdge=" + this.f2282d + ", frameTimeMillis=" + this.f2283e + ')';
    }
}
