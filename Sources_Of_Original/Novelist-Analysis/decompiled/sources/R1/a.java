package R1;

import Z1.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f1251k;

    public a(g gVar) {
        this.f1251k = gVar;
    }

    @Override // R1.h
    public /* bridge */ f e(g gVar) {
        return E2.a.s(this, gVar);
    }

    @Override // R1.h
    public final Object f(Object obj, p pVar) {
        return pVar.e(obj, this);
    }

    @Override // R1.f
    public final g getKey() {
        return this.f1251k;
    }

    @Override // R1.h
    public final h i(h hVar) {
        a2.h.e(hVar, "context");
        return hVar == i.f1255k ? this : (h) hVar.f(this, new N.d(4));
    }

    @Override // R1.h
    public /* bridge */ h j(g gVar) {
        return E2.a.D(this, gVar);
    }
}
