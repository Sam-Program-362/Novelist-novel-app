package i2;

/* JADX INFO: renamed from: i2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0193a extends W implements R1.c, InterfaceC0210s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final R1.h f2993m;

    public AbstractC0193a(R1.h hVar, boolean z3) {
        super(z3);
        C((N) hVar.e(r.f3022l));
        this.f2993m = hVar.i(this);
    }

    @Override // i2.W
    public final void B(D0.a aVar) {
        AbstractC0212u.e(this.f2993m, aVar);
    }

    @Override // i2.W
    public final void J(Object obj) {
        if (!(obj instanceof C0207o)) {
            S(obj);
        } else {
            C0207o c0207o = (C0207o) obj;
            R(c0207o.f3017a, C0207o.f3016b.get(c0207o) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(EnumC0211t enumC0211t, AbstractC0193a abstractC0193a, Z1.p pVar) {
        int iOrdinal = enumC0211t.ordinal();
        O1.g gVar = O1.g.f1211a;
        if (iOrdinal == 0) {
            try {
                n2.a.h(H2.h.s(((T1.a) pVar).i(this, abstractC0193a)), gVar);
                return;
            } catch (Throwable th) {
                resumeWith(H2.h.i(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                H2.h.s(((T1.a) pVar).i(this, abstractC0193a)).resumeWith(gVar);
                return;
            }
            if (iOrdinal != 3) {
                throw new D0.a();
            }
            try {
                R1.h hVar = this.f2993m;
                Object objL = n2.a.l(hVar, null);
                try {
                    a2.r.a(2, pVar);
                    Object objE = pVar.e(abstractC0193a, this);
                    n2.a.g(hVar, objL);
                    if (objE != S1.a.f1260k) {
                        resumeWith(objE);
                    }
                } catch (Throwable th2) {
                    n2.a.g(hVar, objL);
                    throw th2;
                }
            } catch (Throwable th3) {
                resumeWith(H2.h.i(th3));
            }
        }
    }

    @Override // i2.InterfaceC0210s
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
        Throwable thA = O1.d.a(obj);
        if (thA != null) {
            obj = new C0207o(thA, false);
        }
        Object objG = G(obj);
        if (objG == AbstractC0212u.f3029d) {
            return;
        }
        n(objG);
    }

    public void S(Object obj) {
    }

    public void R(Throwable th, boolean z3) {
    }
}
