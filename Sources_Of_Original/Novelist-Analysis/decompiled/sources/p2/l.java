package p2;

import i2.AbstractC0209q;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0209q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l f4274m = new l();

    @Override // i2.AbstractC0209q
    public final void c(R1.h hVar, Runnable runnable) {
        e.n.f4264m.b(runnable, true);
    }

    @Override // i2.AbstractC0209q
    public final AbstractC0209q g(int i3) {
        n2.a.a(i3);
        return i3 >= k.f4271d ? this : super.g(i3);
    }

    @Override // i2.AbstractC0209q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
