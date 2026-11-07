package V;

/* renamed from: V.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101z extends T1.c {
    public N n;

    /* renamed from: o, reason: collision with root package name */
    public int f1487o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1488p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f1489q;

    /* renamed from: r, reason: collision with root package name */
    public int f1490r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0101z(N n, T1.c cVar) {
        super(cVar);
        this.f1489q = n;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1488p = obj;
        this.f1490r |= Integer.MIN_VALUE;
        return this.f1489q.h(this);
    }
}
