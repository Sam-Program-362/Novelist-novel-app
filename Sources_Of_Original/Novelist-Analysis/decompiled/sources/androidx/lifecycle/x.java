package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class x extends y implements InterfaceC0143q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0144s f2169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z f2170p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, InterfaceC0144s interfaceC0144s, A a3) {
        super(zVar, a3);
        this.f2170p = zVar;
        this.f2169o = interfaceC0144s;
    }

    @Override // androidx.lifecycle.InterfaceC0143q
    public final void d(InterfaceC0144s interfaceC0144s, EnumC0138l enumC0138l) {
        InterfaceC0144s interfaceC0144s2 = this.f2169o;
        EnumC0139m enumC0139m = interfaceC0144s2.h().f2160c;
        if (enumC0139m == EnumC0139m.f2150k) {
            this.f2170p.g(this.f2171k);
            return;
        }
        EnumC0139m enumC0139m2 = null;
        while (enumC0139m2 != enumC0139m) {
            h(k());
            enumC0139m2 = enumC0139m;
            enumC0139m = interfaceC0144s2.h().f2160c;
        }
    }

    @Override // androidx.lifecycle.y
    public final void i() {
        this.f2169o.h().b(this);
    }

    @Override // androidx.lifecycle.y
    public final boolean j(InterfaceC0144s interfaceC0144s) {
        return this.f2169o == interfaceC0144s;
    }

    @Override // androidx.lifecycle.y
    public final boolean k() {
        return this.f2169o.h().f2160c.compareTo(EnumC0139m.n) >= 0;
    }
}
