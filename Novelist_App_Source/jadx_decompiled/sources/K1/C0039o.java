package K1;

/* renamed from: K1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039o implements l2.d {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f739k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l2.d f740l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y.d f741m;

    public /* synthetic */ C0039o(l2.d dVar, Y.d dVar2, int i3) {
        this.f739k = i3;
        this.f740l = dVar;
        this.f741m = dVar2;
    }

    @Override // l2.d
    public final Object h(l2.e eVar, R1.c cVar) {
        switch (this.f739k) {
            case 0:
                Object h3 = this.f740l.h(new C0038n(eVar, this.f741m, 0), cVar);
                if (h3 != S1.a.f1260k) {
                    break;
                }
                break;
            case 1:
                Object h4 = this.f740l.h(new C0038n(eVar, this.f741m, 1), cVar);
                if (h4 != S1.a.f1260k) {
                    break;
                }
                break;
            case 2:
                Object h5 = this.f740l.h(new C0038n(eVar, this.f741m, 2), cVar);
                if (h5 != S1.a.f1260k) {
                    break;
                }
                break;
            default:
                Object h6 = this.f740l.h(new C0038n(eVar, this.f741m, 3), cVar);
                if (h6 != S1.a.f1260k) {
                    break;
                }
                break;
        }
        return O1.g.f1211a;
    }
}
