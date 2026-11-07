package V;

/* loaded from: classes.dex */
public final class K extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f1329o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1330p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f1331q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(N n, R1.c cVar) {
        super(2, cVar);
        this.f1331q = n;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((K) i((R1.c) obj2, (a0) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        K k3 = new K(this.f1331q, cVar);
        k3.f1330p = obj;
        return k3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f1329o;
        if (i3 == 0) {
            H2.h.E(obj);
            a0 a0Var = (a0) this.f1330p;
            this.f1329o = 1;
            Object b3 = N.b(this.f1331q, a0Var, this);
            S1.a aVar = S1.a.f1260k;
            if (b3 == aVar) {
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
