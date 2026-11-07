package I1;

import a.AbstractC0102a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements g1.d, g1.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f508k;

    public /* synthetic */ p(k kVar) {
        this.f508k = kVar;
    }

    @Override // g1.c
    public void b(Exception exc) {
        AbstractC0102a.n(this.f508k, new d("clearAuthorizationToken failed", exc.getMessage()));
    }

    @Override // g1.d
    public void c(Object obj) {
        this.f508k.f(new O1.d(O1.g.f1211a));
    }
}
