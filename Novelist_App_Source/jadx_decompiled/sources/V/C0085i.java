package V;

/* renamed from: V.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085i extends T1.c {
    public B1.s n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1422o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B1.s f1423p;

    /* renamed from: q, reason: collision with root package name */
    public int f1424q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0085i(B1.s sVar, T1.c cVar) {
        super(cVar);
        this.f1423p = sVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1422o = obj;
        this.f1424q |= Integer.MIN_VALUE;
        return this.f1423p.g(this);
    }
}
