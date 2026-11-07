package I1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements p019g1.d, p019g1.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f509k;

    public /* synthetic */ q(k kVar) {
        this.f509k = kVar;
    }

    @Override // p019g1.c
    public void b(Exception exc) {
        p000a.a.n(this.f509k, new d("revokeAccess failed", exc.getMessage()));
    }

    @Override // p019g1.d
    public void c(Object obj) {
        this.f509k.f(new O1.d(O1.g.f1211a));
    }
}
