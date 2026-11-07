package V;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends T1.c {
    public B1.s n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q2.a f1392o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B1.s f1394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1395r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(B1.s sVar, T1.c cVar) {
        super(cVar);
        this.f1394q = sVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1393p = obj;
        this.f1395r |= Integer.MIN_VALUE;
        return this.f1394q.w(this);
    }
}
