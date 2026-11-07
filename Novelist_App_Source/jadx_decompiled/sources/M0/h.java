package M0;

import f1.C0246a;

/* loaded from: classes.dex */
public final class h implements InterfaceC0046b {

    /* renamed from: b, reason: collision with root package name */
    public static h f957b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f958c = new i(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f959a;

    public /* synthetic */ h(Object obj) {
        this.f959a = obj;
    }

    public static synchronized h b() {
        h hVar;
        synchronized (h.class) {
            try {
                if (f957b == null) {
                    f957b = new h();
                }
                hVar = f957b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // M0.InterfaceC0046b
    public void a(J0.a aVar) {
        C0246a c0246a = (C0246a) this.f959a;
        if (aVar.f540l == 0) {
            c0246a.f(null, c0246a.f2759w);
            return;
        }
        h hVar = c0246a.f2752o;
        if (hVar != null) {
            ((K0.k) hVar.f959a).j(aVar);
        }
    }
}
