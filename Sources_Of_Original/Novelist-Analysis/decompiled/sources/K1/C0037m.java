package K1;

/* JADX INFO: renamed from: K1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0037m extends T1.c {
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0038n f735p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037m(C0038n c0038n, R1.c cVar) {
        super(cVar);
        this.f735p = c0038n;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.n = obj;
        this.f734o |= Integer.MIN_VALUE;
        return this.f735p.g(null, this);
    }
}
