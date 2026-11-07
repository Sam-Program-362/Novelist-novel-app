package i2;

/* renamed from: i2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294k extends S implements InterfaceC0293j {

    /* renamed from: e, reason: collision with root package name */
    public final W f3010e;

    public C0294k(W w3) {
        this.f3010e = w3;
    }

    @Override // i2.InterfaceC0293j
    public final boolean c(Throwable th) {
        return j().s(th);
    }

    @Override // i2.S
    public final boolean k() {
        return true;
    }

    @Override // i2.S
    public final void l(Throwable th) {
        this.f3010e.o(j());
    }
}
