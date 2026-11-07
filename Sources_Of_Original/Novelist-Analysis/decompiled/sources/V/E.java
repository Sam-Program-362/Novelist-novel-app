package V;

/* JADX INFO: loaded from: classes.dex */
public final class E extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1308o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1309p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f1310q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f1311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1312s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(N n, int i3, R1.c cVar) {
        super(2, cVar);
        this.f1311r = n;
        this.f1312s = i3;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) i((R1.c) obj2, bool)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        E e3 = new E(this.f1311r, this.f1312s, cVar);
        e3.f1310q = ((Boolean) obj).booleanValue();
        return e3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    @Override // T1.a
    public final Object m(Object obj) {
        boolean z3;
        Object obj2;
        int iIntValue;
        int iHashCode;
        int i3 = this.f1309p;
        N n = this.f1311r;
        S1.a aVar = S1.a.f1260k;
        if (i3 == 0) {
            H2.h.E(obj);
            z3 = this.f1310q;
            this.f1310q = z3;
            this.f1309p = 1;
            obj = n.i(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i3 == 1) {
            z3 = this.f1310q;
            H2.h.E(obj);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.f1308o;
            H2.h.E(obj);
        }
        iIntValue = ((Number) obj).intValue();
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new C0079c(obj2, iHashCode, iIntValue);
        if (z3) {
            i0 i0VarG = n.g();
            this.f1308o = obj;
            this.f1309p = 2;
            Integer numA = i0VarG.a();
            if (numA != aVar) {
                obj2 = obj;
                obj = numA;
                iIntValue = ((Number) obj).intValue();
            }
            return aVar;
        }
        obj2 = obj;
        iIntValue = this.f1312s;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new C0079c(obj2, iHashCode, iIntValue);
    }
}
