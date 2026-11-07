package V;

/* JADX INFO: renamed from: V.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0090n extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1452o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f1453p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0090n(N n, R1.c cVar) {
        super(2, cVar);
        this.f1453p = n;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0090n) i((R1.c) obj2, (l2.e) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new C0090n(this.f1453p, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) throws Throwable {
        int i3 = this.f1452o;
        if (i3 == 0) {
            H2.h.E(obj);
            this.f1452o = 1;
            Object objC = N.c(this.f1453p, this);
            S1.a aVar = S1.a.f1260k;
            if (objC == aVar) {
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
