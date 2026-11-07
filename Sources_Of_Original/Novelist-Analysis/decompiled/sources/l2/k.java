package l2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends T1.c {
    public K1.r n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f4057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f4058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K1.r f4059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4060r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(K1.r rVar, R1.c cVar) {
        super(cVar);
        this.f4059q = rVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f4058p = obj;
        this.f4060r |= Integer.MIN_VALUE;
        return this.f4059q.g(null, this);
    }
}
