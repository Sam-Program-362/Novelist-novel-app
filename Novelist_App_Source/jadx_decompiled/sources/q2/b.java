package q2;

import Z1.q;
import i2.C0289f;
import i2.C0290g;
import i2.InterfaceC0288e;
import i2.i0;
import n2.r;

/* loaded from: classes.dex */
public final class b implements InterfaceC0288e, i0 {

    /* renamed from: k, reason: collision with root package name */
    public final C0290g f4311k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f4312l;

    public b(c cVar, C0290g c0290g) {
        this.f4312l = cVar;
        this.f4311k = c0290g;
    }

    @Override // i2.i0
    public final void a(r rVar, int i3) {
        this.f4311k.a(rVar, i3);
    }

    @Override // R1.c
    public final R1.h getContext() {
        return this.f4311k.f3004o;
    }

    @Override // i2.InterfaceC0288e
    public final B1.g k(Object obj, q qVar) {
        c cVar = this.f4312l;
        C0289f c0289f = new C0289f(cVar, this);
        B1.g k3 = this.f4311k.k((O1.g) obj, c0289f);
        if (k3 != null) {
            c.f4313g.set(cVar, null);
        }
        return k3;
    }

    @Override // i2.InterfaceC0288e
    public final void l(Object obj) {
        this.f4311k.l(obj);
    }

    @Override // R1.c
    public final void resumeWith(Object obj) {
        this.f4311k.resumeWith(obj);
    }
}
