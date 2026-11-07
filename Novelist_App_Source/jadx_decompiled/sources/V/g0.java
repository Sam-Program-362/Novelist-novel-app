package V;

/* loaded from: classes.dex */
public final class g0 extends T1.c {
    public q2.c n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1418o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1419p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0 f1420q;

    /* renamed from: r, reason: collision with root package name */
    public int f1421r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, T1.c cVar) {
        super(cVar);
        this.f1420q = i0Var;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1419p = obj;
        this.f1421r |= Integer.MIN_VALUE;
        return this.f1420q.c(null, this);
    }
}
