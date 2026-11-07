package V;

/* JADX INFO: loaded from: classes.dex */
public final class C extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Throwable f1296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f1298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f1299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
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
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // T1.a
    public final Object m(Object obj) {
        Throwable th;
        int iIntValue;
        j0 b0Var;
        boolean z3;
        ?? r3;
        ?? r4;
        boolean z4 = this.f1297p;
        N n = this.f1299r;
        S1.a aVar = S1.a.f1260k;
        try {
            if (z4 == 0) {
                H2.h.E(obj);
                boolean z5 = this.f1298q;
                this.f1298q = z5;
                this.f1297p = 1;
                obj = N.f(n, z5, this);
                z4 = z5;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (z4 != 1) {
                    if (z4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z6 = this.f1298q;
                    th = this.f1296o;
                    H2.h.E(obj);
                    r4 = z6;
                    iIntValue = ((Number) obj).intValue();
                    r3 = r4;
                    b0Var = new b0(th, iIntValue);
                    z3 = r3;
                    return new O1.b(b0Var, Boolean.valueOf(z3));
                }
                boolean z7 = this.f1298q;
                H2.h.E(obj);
                z4 = z7;
            }
            b0Var = (j0) obj;
            z3 = z4;
        } catch (Throwable th2) {
            if (z4 != 0) {
                i0 i0VarG = n.g();
                this.f1296o = th2;
                this.f1298q = z4;
                this.f1297p = 2;
                Integer numA = i0VarG.a();
                if (numA != aVar) {
                    th = th2;
                    obj = numA;
                    r4 = z4;
                }
                return aVar;
            }
            th = th2;
            iIntValue = this.f1300s;
            r3 = z4;
        }
        return new O1.b(b0Var, Boolean.valueOf(z3));
    }
}
