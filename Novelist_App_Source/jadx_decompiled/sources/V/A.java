package V;

/* loaded from: classes.dex */
public final class A extends T1.c {
    public N n;

    /* renamed from: o, reason: collision with root package name */
    public j0 f1288o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1289p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1290q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f1291r;

    /* renamed from: s, reason: collision with root package name */
    public int f1292s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(N n, R1.c cVar) {
        super(cVar);
        this.f1291r = n;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1290q = obj;
        this.f1292s |= Integer.MIN_VALUE;
        return N.e(this.f1291r, false, this);
    }
}
