package p035l0;

/* JADX INFO: renamed from: l0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0249b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3955a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0249b f3956b;

    public final int a(int i3) {
        C0249b c0249b = this.f3956b;
        if (c0249b == null) {
            return i3 >= 64 ? Long.bitCount(this.f3955a) : Long.bitCount(this.f3955a & ((1 << i3) - 1));
        }
        if (i3 < 64) {
            return Long.bitCount(this.f3955a & ((1 << i3) - 1));
        }
        return Long.bitCount(this.f3955a) + c0249b.a(i3 - 64);
    }

    public final boolean b(int i3) {
        if (i3 < 64) {
            return (this.f3955a & (1 << i3)) != 0;
        }
        if (this.f3956b == null) {
            this.f3956b = new C0249b();
        }
        return this.f3956b.b(i3 - 64);
    }

    public final void c() {
        this.f3955a = 0L;
        C0249b c0249b = this.f3956b;
        if (c0249b != null) {
            c0249b.c();
        }
    }

    public final String toString() {
        if (this.f3956b == null) {
            return Long.toBinaryString(this.f3955a);
        }
        return this.f3956b.toString() + "xx" + Long.toBinaryString(this.f3955a);
    }
}
