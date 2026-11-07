package m2;

/* JADX INFO: loaded from: classes.dex */
public final class q extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4130o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f4131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l2.e f4132q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l2.e eVar, R1.c cVar) {
        super(2, cVar);
        this.f4132q = eVar;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((q) i((R1.c) obj2, obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        q qVar = new q(this.f4132q, cVar);
        qVar.f4131p = obj;
        return qVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f4130o;
        if (i3 == 0) {
            H2.h.E(obj);
            Object obj2 = this.f4131p;
            this.f4130o = 1;
            Object objG = this.f4132q.g(obj2, this);
            S1.a aVar = S1.a.f1260k;
            if (objG == aVar) {
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
