package N;

import O1.g;
import Z1.l;
import a2.o;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Z1.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1181m;

    public /* synthetic */ b(Object obj, Object obj2, int i3) {
        this.f1179k = i3;
        this.f1180l = obj;
        this.f1181m = obj2;
    }

    @Override // Z1.a
    public final Object a() {
        switch (this.f1179k) {
            case 0:
                ((l) this.f1180l).f(((o) this.f1181m).f1713k);
                break;
            case 1:
                ((Executor) this.f1180l).execute(new M.b((H.d) this.f1181m, 7));
                break;
            case 2:
                O.d dVar = (O.d) this.f1180l;
                dVar.d().execute(new M.c(dVar, (H.l) this.f1181m, 6));
                break;
            default:
                Q.b bVar = (Q.b) this.f1180l;
                bVar.e().execute(new M.c(bVar, (H.l) this.f1181m, 10));
                break;
        }
        return g.f1211a;
    }
}
