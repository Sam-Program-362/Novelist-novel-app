package l2;

/* loaded from: classes.dex */
public final class h extends T1.c {
    public /* synthetic */ Object n;

    /* renamed from: o, reason: collision with root package name */
    public int f4046o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f4047p;

    /* renamed from: q, reason: collision with root package name */
    public Object f4048q;

    /* renamed from: r, reason: collision with root package name */
    public e f4049r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, R1.c cVar) {
        super(cVar);
        this.f4047p = iVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.n = obj;
        this.f4046o |= Integer.MIN_VALUE;
        return this.f4047p.h(null, this);
    }
}
