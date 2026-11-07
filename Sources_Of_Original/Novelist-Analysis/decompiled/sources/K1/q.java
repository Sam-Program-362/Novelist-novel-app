package K1;

/* JADX INFO: loaded from: classes.dex */
public final class q extends T1.c {
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f747o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f748p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, R1.c cVar) {
        super(cVar);
        this.f748p = rVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.n = obj;
        this.f747o |= Integer.MIN_VALUE;
        return this.f748p.g(null, this);
    }
}
