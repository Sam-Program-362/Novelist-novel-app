package i2;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements R1.f, R1.g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h0 f3007k = new h0();

    @Override // R1.h
    public final R1.f e(R1.g gVar) {
        return E2.a.s(this, gVar);
    }

    @Override // R1.h
    public final Object f(Object obj, Z1.p pVar) {
        return pVar.e(obj, this);
    }

    @Override // R1.h
    public final R1.h i(R1.h hVar) {
        a2.h.e(hVar, "context");
        return hVar == R1.i.f1255k ? this : (R1.h) hVar.f(this, new N.d(4));
    }

    @Override // R1.h
    public final R1.h j(R1.g gVar) {
        return E2.a.D(this, gVar);
    }

    @Override // R1.f
    public final R1.g getKey() {
        return this;
    }
}
