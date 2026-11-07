package K1;

/* JADX INFO: renamed from: K1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0039o implements l2.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l2.d f740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
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
                Object objH = this.f740l.h(new C0038n(eVar, this.f741m, 0), cVar);
                return objH == S1.a.f1260k ? objH : O1.g.f1211a;
            case 1:
                Object objH2 = this.f740l.h(new C0038n(eVar, this.f741m, 1), cVar);
                return objH2 == S1.a.f1260k ? objH2 : O1.g.f1211a;
            case 2:
                Object objH3 = this.f740l.h(new C0038n(eVar, this.f741m, 2), cVar);
                return objH3 == S1.a.f1260k ? objH3 : O1.g.f1211a;
            default:
                Object objH4 = this.f740l.h(new C0038n(eVar, this.f741m, 3), cVar);
                return objH4 == S1.a.f1260k ? objH4 : O1.g.f1211a;
        }
    }
}
