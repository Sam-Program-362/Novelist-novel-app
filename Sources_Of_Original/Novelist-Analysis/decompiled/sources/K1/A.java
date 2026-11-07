package K1;

/* JADX INFO: loaded from: classes.dex */
public final class A extends T1.c {
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B f661p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b3, R1.c cVar) {
        super(cVar);
        this.f661p = b3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.n = obj;
        this.f660o |= Integer.MIN_VALUE;
        return this.f661p.g(null, this);
    }
}
