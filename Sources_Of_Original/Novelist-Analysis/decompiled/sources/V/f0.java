package V;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends T1.c {
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q2.c f1408o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1409p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0 f1410q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1411r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, T1.c cVar) {
        super(cVar);
        this.f1410q = i0Var;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1409p = obj;
        this.f1411r |= Integer.MIN_VALUE;
        return this.f1410q.b(null, this);
    }
}
