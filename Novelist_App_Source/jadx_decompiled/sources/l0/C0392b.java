package l0;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392b {

    /* renamed from: a, reason: collision with root package name */
    public long f3955a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0392b f3956b;

    public final int a(int i3) {
        C0392b c0392b = this.f3956b;
        if (c0392b == null) {
            return i3 >= 64 ? Long.bitCount(this.f3955a) : Long.bitCount(this.f3955a & ((1 << i3) - 1));
        }
        if (i3 < 64) {
            return Long.bitCount(this.f3955a & ((1 << i3) - 1));
        }
        return Long.bitCount(this.f3955a) + c0392b.a(i3 - 64);
    }

    public final boolean b(int i3) {
        if (i3 < 64) {
            return (this.f3955a & (1 << i3)) != 0;
        }
        if (this.f3956b == null) {
            this.f3956b = new C0392b();
        }
        return this.f3956b.b(i3 - 64);
    }

    public final void c() {
        this.f3955a = 0L;
        C0392b c0392b = this.f3956b;
        if (c0392b != null) {
            c0392b.c();
        }
    }

    public final String toString() {
        if (this.f3956b == null) {
            return Long.toBinaryString(this.f3955a);
        }
        return this.f3956b.toString() + "xx" + Long.toBinaryString(this.f3955a);
    }
}
