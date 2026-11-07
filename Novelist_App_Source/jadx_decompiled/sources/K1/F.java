package K1;

/* loaded from: classes.dex */
public final class F extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f675o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y.d f676p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ double f677q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Y.d dVar, double d3, R1.c cVar) {
        super(2, cVar);
        this.f676p = dVar;
        this.f677q = d3;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        F f3 = (F) i((R1.c) obj2, (Y.b) obj);
        O1.g gVar = O1.g.f1211a;
        f3.m(gVar);
        return gVar;
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        F f3 = new F(this.f676p, this.f677q, cVar);
        f3.f675o = obj;
        return f3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        Y.b bVar = (Y.b) this.f675o;
        H2.h.E(obj);
        bVar.d(this.f676p, new Double(this.f677q));
        return O1.g.f1211a;
    }
}
