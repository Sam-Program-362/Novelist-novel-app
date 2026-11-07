package V;

/* loaded from: classes.dex */
public final class r extends T1.c {
    public /* synthetic */ Object n;

    /* renamed from: o, reason: collision with root package name */
    public int f1462o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K1.B f1463p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(K1.B b3, R1.c cVar) {
        super(cVar);
        this.f1463p = b3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.n = obj;
        this.f1462o |= Integer.MIN_VALUE;
        return this.f1463p.g(null, this);
    }
}
