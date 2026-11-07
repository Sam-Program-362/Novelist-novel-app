package androidx.lifecycle;

/* loaded from: classes.dex */
public final class x extends y implements InterfaceC0145q {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0146s f2169o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z f2170p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, InterfaceC0146s interfaceC0146s, A a3) {
        super(zVar, a3);
        this.f2170p = zVar;
        this.f2169o = interfaceC0146s;
    }

    @Override // androidx.lifecycle.InterfaceC0145q
    public final void d(InterfaceC0146s interfaceC0146s, EnumC0140l enumC0140l) {
        InterfaceC0146s interfaceC0146s2 = this.f2169o;
        EnumC0141m enumC0141m = interfaceC0146s2.h().f2160c;
        if (enumC0141m == EnumC0141m.f2150k) {
            this.f2170p.g(this.f2171k);
            return;
        }
        EnumC0141m enumC0141m2 = null;
        while (enumC0141m2 != enumC0141m) {
            h(k());
            enumC0141m2 = enumC0141m;
            enumC0141m = interfaceC0146s2.h().f2160c;
        }
    }

    @Override // androidx.lifecycle.y
    public final void i() {
        this.f2169o.h().b(this);
    }

    @Override // androidx.lifecycle.y
    public final boolean j(InterfaceC0146s interfaceC0146s) {
        return this.f2169o == interfaceC0146s;
    }

    @Override // androidx.lifecycle.y
    public final boolean k() {
        return this.f2169o.h().f2160c.compareTo(EnumC0141m.n) >= 0;
    }
}
