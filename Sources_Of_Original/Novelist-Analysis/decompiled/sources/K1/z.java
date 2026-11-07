package K1;

/* JADX INFO: loaded from: classes.dex */
public final class z extends T1.c {
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0038n f781p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0038n c0038n, R1.c cVar) {
        super(cVar);
        this.f781p = c0038n;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.n = obj;
        this.f780o |= Integer.MIN_VALUE;
        return this.f781p.g(null, this);
    }
}
