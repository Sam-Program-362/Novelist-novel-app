package l2;

/* loaded from: classes.dex */
public final class b extends T1.c {
    public k2.q n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f4035o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f4036p;

    /* renamed from: q, reason: collision with root package name */
    public int f4037q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, T1.c cVar2) {
        super(cVar2);
        this.f4036p = cVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f4035o = obj;
        this.f4037q |= Integer.MIN_VALUE;
        return this.f4036p.a(null, this);
    }
}
