package V;

/* JADX INFO: renamed from: V.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0095t extends T1.c {
    public N n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q2.c f1468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f1470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1471r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0095t(N n, T1.c cVar) {
        super(cVar);
        this.f1470q = n;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1469p = obj;
        this.f1471r |= Integer.MIN_VALUE;
        return N.a(this.f1470q, this);
    }
}
