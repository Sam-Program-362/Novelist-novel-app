package M1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P implements Z1.l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1036l;

    public /* synthetic */ P(Object obj, int i3) {
        this.f1035k = i3;
        this.f1036l = obj;
    }

    @Override // Z1.l
    public final Object f(Object obj) {
        switch (this.f1035k) {
            case 0:
                ((Z1.l) this.f1036l).f(new Q(((O1.d) obj).f1206k));
                return O1.g.f1211a;
            case 1:
                O.d dVar = (O.d) this.f1036l;
                I.f fVar = (I.f) obj;
                a2.h.e(fVar, "e");
                dVar.d().execute(new O.a(dVar, fVar, 1));
                return O1.g.f1211a;
            case 2:
                Q.b bVar = (Q.b) this.f1036l;
                I.f fVar2 = (I.f) obj;
                a2.h.e(fVar2, "e");
                bVar.e().execute(new Q.a(bVar, fVar2, 0));
                return O1.g.f1211a;
            case 3:
                I1.l lVar = (I1.l) this.f1036l;
                a2.h.e(obj, "it");
                return lVar.a();
            default:
                ((q2.c) this.f1036l).e(null);
                return O1.g.f1211a;
        }
    }

    public /* synthetic */ P(q2.c cVar, q2.b bVar) {
        this.f1035k = 4;
        this.f1036l = cVar;
    }
}
