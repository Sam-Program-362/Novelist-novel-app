package V;

/* JADX INFO: renamed from: V.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0096u extends T1.h implements Z1.l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1472o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F f1473p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0096u(F f3, R1.c cVar) {
        super(1, cVar);
        this.f1473p = f3;
    }

    @Override // Z1.l
    public final Object f(Object obj) {
        return new C0096u(this.f1473p, (R1.c) obj).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f1472o;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
            return obj;
        }
        H2.h.E(obj);
        this.f1472o = 1;
        Object objF = this.f1473p.f(this);
        S1.a aVar = S1.a.f1260k;
        return objF == aVar ? aVar : objF;
    }
}
