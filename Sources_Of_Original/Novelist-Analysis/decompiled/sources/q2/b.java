package q2;

import Z1.q;
import i2.C0198f;
import i2.C0199g;
import i2.InterfaceC0197e;
import i2.i0;
import n2.r;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0197e, i0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0199g f4311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f4312l;

    public b(c cVar, C0199g c0199g) {
        this.f4312l = cVar;
        this.f4311k = c0199g;
    }

    @Override // i2.i0
    public final void a(r rVar, int i3) {
        this.f4311k.a(rVar, i3);
    }

    @Override // R1.c
    public final R1.h getContext() {
        return this.f4311k.f3004o;
    }

    @Override // i2.InterfaceC0197e
    public final B1.g k(Object obj, q qVar) {
        c cVar = this.f4312l;
        C0198f c0198f = new C0198f(cVar, this);
        B1.g gVarK = this.f4311k.k((O1.g) obj, c0198f);
        if (gVarK != null) {
            c.f4313g.set(cVar, null);
        }
        return gVarK;
    }

    @Override // i2.InterfaceC0197e
    public final void l(Object obj) {
        this.f4311k.l(obj);
    }

    @Override // R1.c
    public final void resumeWith(Object obj) {
        this.f4311k.resumeWith(obj);
    }
}
