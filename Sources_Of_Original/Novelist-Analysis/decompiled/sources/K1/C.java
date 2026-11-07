package K1;

/* JADX INFO: loaded from: classes.dex */
public final class C extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y.d f665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f666q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Y.d dVar, boolean z3, R1.c cVar) {
        super(2, cVar);
        this.f665p = dVar;
        this.f666q = z3;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        C c3 = (C) i((R1.c) obj2, (Y.b) obj);
        O1.g gVar = O1.g.f1211a;
        c3.m(gVar);
        return gVar;
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        C c3 = new C(this.f665p, this.f666q, cVar);
        c3.f664o = obj;
        return c3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        Y.b bVar = (Y.b) this.f664o;
        H2.h.E(obj);
        bVar.d(this.f665p, Boolean.valueOf(this.f666q));
        return O1.g.f1211a;
    }
}
