package i2;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0284a extends W implements R1.c, InterfaceC0301s {

    /* renamed from: m, reason: collision with root package name */
    public final R1.h f2993m;

    public AbstractC0284a(R1.h hVar, boolean z3) {
        super(z3);
        C((N) hVar.e(r.f3022l));
        this.f2993m = hVar.i(this);
    }

    @Override // i2.W
    public final void B(D0.a aVar) {
        AbstractC0303u.e(this.f2993m, aVar);
    }

    @Override // i2.W
    public final void J(Object obj) {
        if (!(obj instanceof C0298o)) {
            S(obj);
        } else {
            C0298o c0298o = (C0298o) obj;
            R(c0298o.f3017a, C0298o.f3016b.get(c0298o) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(EnumC0302t enumC0302t, AbstractC0284a abstractC0284a, Z1.p pVar) {
        int ordinal = enumC0302t.ordinal();
        O1.g gVar = O1.g.f1211a;
        if (ordinal == 0) {
            try {
                n2.a.h(H2.h.s(((T1.a) pVar).i(this, abstractC0284a)), gVar);
                return;
            } finally {
                resumeWith(H2.h.i(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                H2.h.s(((T1.a) pVar).i(this, abstractC0284a)).resumeWith(gVar);
                return;
            }
            if (ordinal != 3) {
                throw new D0.a();
            }
            try {
                R1.h hVar = this.f2993m;
                Object l3 = n2.a.l(hVar, null);
                try {
                    a2.r.a(2, pVar);
                    Object e3 = pVar.e(abstractC0284a, this);
                    if (e3 != S1.a.f1260k) {
                        resumeWith(e3);
                    }
                } finally {
                    n2.a.g(hVar, l3);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // i2.InterfaceC0301s
    public final R1.h d() {
        return this.f2993m;
    }

    @Override // R1.c
    public final R1.h getContext() {
        return this.f2993m;
    }

    @Override // i2.W
    public final String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // R1.c
    public final void resumeWith(Object obj) {
        Throwable a3 = O1.d.a(obj);
        if (a3 != null) {
            obj = new C0298o(a3, false);
        }
        Object G3 = G(obj);
        if (G3 == AbstractC0303u.f3029d) {
            return;
        }
        n(G3);
    }

    public void S(Object obj) {
    }

    public void R(Throwable th, boolean z3) {
    }
}
