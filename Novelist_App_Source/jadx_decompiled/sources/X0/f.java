package X0;

import W0.l;
import W0.q;
import Y0.h;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class f extends h implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.e f1564c;

    public f(g1.e eVar, int i3) {
        this.f1563b = i3;
        this.f1564c = eVar;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override // X0.a
    public void b(Status status, q qVar) {
        a2.h.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // X0.a
    public void c(Status status, W0.f fVar) {
        a2.h.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // X0.a
    public void g(Status status, l lVar) {
        switch (this.f1563b) {
            case 1:
                a2.h.e(status, "status");
                H2.h.y(status, lVar, this.f1564c);
                return;
            default:
                a2.h.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // X0.a
    public void h(Status status, W0.c cVar) {
        switch (this.f1563b) {
            case 0:
                a2.h.e(status, "status");
                H2.h.y(status, cVar, this.f1564c);
                return;
            default:
                a2.h.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
