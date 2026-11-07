package V;

/* JADX INFO: loaded from: classes.dex */
public final class U extends T1.c {
    public W n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public P f1364o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f1367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1368s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w3, T1.c cVar) {
        super(cVar);
        this.f1367r = w3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1366q = obj;
        this.f1368s |= Integer.MIN_VALUE;
        return this.f1367r.a(null, this);
    }
}
