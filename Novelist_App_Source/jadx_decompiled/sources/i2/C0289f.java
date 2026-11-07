package i2;

/* renamed from: i2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0289f implements Z1.q {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2998k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2999l;

    public /* synthetic */ C0289f(Object obj, int i3) {
        this.f2998k = i3;
        this.f2999l = obj;
    }

    @Override // Z1.q
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f2998k) {
            case 0:
                ((M1.P) this.f2999l).f((Throwable) obj);
                break;
            case 1:
                q2.c cVar = (q2.c) this.f2999l;
                q2.c.f4313g.set(cVar, null);
                cVar.e(null);
                break;
            default:
                ((q2.g) this.f2999l).b();
                break;
        }
        return O1.g.f1211a;
    }

    public /* synthetic */ C0289f(q2.c cVar, q2.b bVar) {
        this.f2998k = 1;
        this.f2999l = cVar;
    }
}
