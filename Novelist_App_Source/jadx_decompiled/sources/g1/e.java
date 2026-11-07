package g1;

import M0.r;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i f2835a = new i();

    public final void a(K0.e eVar) {
        i iVar = this.f2835a;
        iVar.getClass();
        synchronized (iVar.f2845b) {
            iVar.e();
            iVar.f2844a = true;
            iVar.f2848e = eVar;
        }
        ((h) iVar.f2847d).f(iVar);
    }

    public final void b(Object obj) {
        i iVar = this.f2835a;
        synchronized (iVar.f2845b) {
            iVar.e();
            iVar.f2844a = true;
            iVar.f2846c = obj;
        }
        ((h) iVar.f2847d).f(iVar);
    }

    public final void c(Exception exc) {
        i iVar = this.f2835a;
        iVar.getClass();
        r.g(exc, "Exception must not be null");
        synchronized (iVar.f2845b) {
            try {
                if (iVar.f2844a) {
                    return;
                }
                iVar.f2844a = true;
                iVar.f2848e = exc;
                ((h) iVar.f2847d).f(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
