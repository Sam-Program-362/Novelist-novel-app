package V;

/* JADX INFO: renamed from: V.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0092p extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j0 f1458p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0092p(j0 j0Var, R1.c cVar) {
        super(2, cVar);
        this.f1458p = j0Var;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0092p) i((R1.c) obj2, (j0) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        C0092p c0092p = new C0092p(this.f1458p, cVar);
        c0092p.f1457o = obj;
        return c0092p;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        H2.h.E(obj);
        j0 j0Var = (j0) this.f1457o;
        return Boolean.valueOf((j0Var instanceof C0079c) && j0Var.f1434a <= this.f1458p.f1434a);
    }
}
