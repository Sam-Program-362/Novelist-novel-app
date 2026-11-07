package V;

/* renamed from: V.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099x implements l2.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1483k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1484l;

    public /* synthetic */ C0099x(Object obj, int i3) {
        this.f1483k = i3;
        this.f1484l = obj;
    }

    @Override // l2.e
    public final Object g(Object obj, R1.c cVar) {
        Object e3;
        switch (this.f1483k) {
            case 0:
                N n = (N) this.f1484l;
                return ((n.f1347r.g() instanceof Z) || (e3 = N.e(n, true, cVar)) != S1.a.f1260k) ? O1.g.f1211a : e3;
            case 1:
                ((a2.o) this.f1484l).f1713k = obj;
                throw new m2.a(this);
            default:
                ((C.a) this.f1484l).accept(obj);
                return O1.g.f1211a;
        }
    }
}
