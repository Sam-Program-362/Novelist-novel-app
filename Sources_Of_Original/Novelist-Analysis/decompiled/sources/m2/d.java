package m2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f4109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f4110q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, R1.c cVar) {
        super(2, cVar);
        this.f4110q = eVar;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((d) i((R1.c) obj2, (k2.q) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        d dVar = new d(this.f4110q, cVar);
        dVar.f4109p = obj;
        return dVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f4108o;
        if (i3 == 0) {
            H2.h.E(obj);
            k2.q qVar = (k2.q) this.f4109p;
            this.f4108o = 1;
            Object objA = this.f4110q.a(qVar, this);
            S1.a aVar = S1.a.f1260k;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
        }
        return O1.g.f1211a;
    }
}
