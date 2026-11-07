package L0;

import M0.InterfaceC0046b;
import M0.InterfaceC0050f;
import java.util.Set;

/* loaded from: classes.dex */
public final class r implements InterfaceC0046b {

    /* renamed from: a, reason: collision with root package name */
    public final K0.c f838a;

    /* renamed from: b, reason: collision with root package name */
    public final C0041a f839b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0050f f840c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f841d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f842e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0044d f843f;

    public r(C0044d c0044d, K0.c cVar, C0041a c0041a) {
        this.f843f = c0044d;
        this.f838a = cVar;
        this.f839b = c0041a;
    }

    @Override // M0.InterfaceC0046b
    public final void a(J0.a aVar) {
        this.f843f.f812m.post(new A.a(this, aVar, 2, false));
    }

    public final void b(J0.a aVar) {
        p pVar = (p) this.f843f.f809j.get(this.f839b);
        if (pVar != null) {
            pVar.p(aVar);
        }
    }
}
