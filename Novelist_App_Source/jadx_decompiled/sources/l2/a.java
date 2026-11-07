package l2;

/* loaded from: classes.dex */
public final class a extends T1.c {
    public m2.l n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f4032o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B1.a f4033p;

    /* renamed from: q, reason: collision with root package name */
    public int f4034q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(B1.a aVar, R1.c cVar) {
        super(cVar);
        this.f4033p = aVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f4032o = obj;
        this.f4034q |= Integer.MIN_VALUE;
        return this.f4033p.h(null, this);
    }
}
