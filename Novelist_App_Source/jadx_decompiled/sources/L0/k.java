package L0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Object f813a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f814b;

    /* renamed from: c, reason: collision with root package name */
    public int f815c;

    /* renamed from: d, reason: collision with root package name */
    public Object f816d;

    public static k b() {
        k kVar = new k();
        kVar.f814b = true;
        kVar.f815c = 0;
        return kVar;
    }

    public k a() {
        M0.r.a("execute parameter required", ((i) this.f816d) != null);
        J0.c[] cVarArr = (J0.c[]) this.f813a;
        boolean z3 = this.f814b;
        int i3 = this.f815c;
        k kVar = new k();
        kVar.f816d = this;
        kVar.f813a = cVarArr;
        boolean z4 = false;
        if (cVarArr != null && z3) {
            z4 = true;
        }
        kVar.f814b = z4;
        kVar.f815c = i3;
        return kVar;
    }
}
