package V;

/* loaded from: classes.dex */
public final class C extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public Throwable f1296o;

    /* renamed from: p, reason: collision with root package name */
    public int f1297p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f1298q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f1299r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1300s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(N n, int i3, R1.c cVar) {
        super(2, cVar);
        this.f1299r = n;
        this.f1300s = i3;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C) i((R1.c) obj2, bool)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        C c3 = new C(this.f1299r, this.f1300s, cVar);
        c3.f1298q = ((Boolean) obj).booleanValue();
        return c3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // T1.a
    public final Object m(Object obj) {
        Throwable th;
        int i3;
        j0 j0Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = this.f1297p;
        N n = this.f1299r;
        S1.a aVar = S1.a.f1260k;
        try {
        } catch (Throwable th2) {
            if (z6 != 0) {
                i0 g3 = n.g();
                this.f1296o = th2;
                this.f1298q = z6;
                this.f1297p = 2;
                Integer a3 = g3.a();
                if (a3 != aVar) {
                    th = th2;
                    obj = a3;
                    z5 = z6;
                }
            } else {
                th = th2;
                i3 = this.f1300s;
                z4 = z6;
            }
        }
        if (z6 == 0) {
            H2.h.E(obj);
            boolean z7 = this.f1298q;
            this.f1298q = z7;
            this.f1297p = 1;
            obj = N.f(n, z7, this);
            z6 = z7;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z6 != 1) {
                if (z6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z8 = this.f1298q;
                th = this.f1296o;
                H2.h.E(obj);
                z5 = z8;
                i3 = ((Number) obj).intValue();
                z4 = z5;
                j0Var = new b0(th, i3);
                z3 = z4;
                return new O1.b(j0Var, Boolean.valueOf(z3));
            }
            boolean z9 = this.f1298q;
            H2.h.E(obj);
            z6 = z9;
        }
        j0Var = (j0) obj;
        z3 = z6;
        return new O1.b(j0Var, Boolean.valueOf(z3));
    }
}
