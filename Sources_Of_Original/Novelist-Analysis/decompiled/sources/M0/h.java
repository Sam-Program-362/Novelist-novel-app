package M0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC0046b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static h f957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f958c = new i(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f959a;

    public /* synthetic */ h(Object obj) {
        this.f959a = obj;
    }

    public static synchronized h b() {
        try {
            if (f957b == null) {
                f957b = new h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f957b;
    }

    @Override // M0.InterfaceC0046b
    public void a(J0.a aVar) {
        p015f1.a aVar2 = (p015f1.a) this.f959a;
        if (aVar.f540l == 0) {
            aVar2.f(null, aVar2.f2759w);
            return;
        }
        h hVar = aVar2.f2752o;
        if (hVar != null) {
            ((K0.k) hVar.f959a).j(aVar);
        }
    }
}
