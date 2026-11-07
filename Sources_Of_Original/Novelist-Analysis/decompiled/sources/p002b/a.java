package p002b;

import p022h0.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2283e;

    public a(b bVar) {
        float f3 = bVar.f2861c;
        float f4 = bVar.f2862d;
        float f5 = bVar.f2860b;
        int i3 = bVar.f2859a;
        long j3 = bVar.f2863e;
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
