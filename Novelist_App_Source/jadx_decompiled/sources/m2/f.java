package m2;

/* loaded from: classes.dex */
public final class f extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f4114o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f4115p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f4116q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, R1.c cVar) {
        super(2, cVar);
        this.f4116q = gVar;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((f) i((R1.c) obj2, (l2.e) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        f fVar = new f(this.f4116q, cVar);
        fVar.f4115p = obj;
        return fVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f4114o;
        O1.g gVar = O1.g.f1211a;
        if (i3 == 0) {
            H2.h.E(obj);
            l2.e eVar = (l2.e) this.f4115p;
            this.f4114o = 1;
            Object h3 = this.f4116q.n.h(eVar, this);
            S1.a aVar = S1.a.f1260k;
            if (h3 != aVar) {
                h3 = gVar;
            }
            if (h3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
        }
        return gVar;
    }
}
