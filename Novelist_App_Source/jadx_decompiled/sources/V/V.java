package V;

/* loaded from: classes.dex */
public final class V extends T1.c {
    public W n;

    /* renamed from: o, reason: collision with root package name */
    public Object f1369o;

    /* renamed from: p, reason: collision with root package name */
    public Object f1370p;

    /* renamed from: q, reason: collision with root package name */
    public Y f1371q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1372r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f1373s;

    /* renamed from: t, reason: collision with root package name */
    public int f1374t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w3, T1.c cVar) {
        super(cVar);
        this.f1373s = w3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1372r = obj;
        this.f1374t |= Integer.MIN_VALUE;
        return this.f1373s.b(null, this);
    }
}
