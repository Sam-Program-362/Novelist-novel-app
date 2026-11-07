package V;

/* JADX INFO: renamed from: V.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0098w extends T1.c {
    public N n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q2.c f1479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f1481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1482r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098w(N n, T1.c cVar) {
        super(cVar);
        this.f1481q = n;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1480p = obj;
        this.f1482r |= Integer.MIN_VALUE;
        return N.c(this.f1481q, this);
    }
}
