package V;

/* loaded from: classes.dex */
public final class L extends T1.c {
    public a2.n n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1332o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f1333p;

    /* renamed from: q, reason: collision with root package name */
    public int f1334q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n, T1.c cVar) {
        super(cVar);
        this.f1333p = n;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1332o = obj;
        this.f1334q |= Integer.MIN_VALUE;
        return this.f1333p.j(null, false, this);
    }
}
