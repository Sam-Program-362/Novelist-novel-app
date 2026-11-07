package i2;

/* JADX INFO: renamed from: i2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0203k extends S implements InterfaceC0202j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W f3010e;

    public C0203k(W w3) {
        this.f3010e = w3;
    }

    @Override // i2.InterfaceC0202j
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
