package K1;

/* JADX INFO: loaded from: classes.dex */
public final class x extends T1.c {
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f773o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0038n f774p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0038n c0038n, R1.c cVar) {
        super(cVar);
        this.f774p = c0038n;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.n = obj;
        this.f773o |= Integer.MIN_VALUE;
        return this.f774p.g(null, this);
    }
}
