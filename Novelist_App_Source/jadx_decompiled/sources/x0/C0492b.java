package x0;

import y0.InterfaceC0499a;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492b implements h {

    /* renamed from: m, reason: collision with root package name */
    public static final C0492b f4683m;
    public static final C0492b n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0492b f4684o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0492b f4685p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0492b f4686q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0492b f4687r;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4688k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4689l;

    static {
        int i3 = 0;
        f4683m = new C0492b("NONE", i3);
        n = new C0492b("FULL", i3);
        int i4 = 1;
        f4684o = new C0492b("FLAT", i4);
        f4685p = new C0492b("HALF_OPENED", i4);
        int i5 = 2;
        f4686q = new C0492b("FOLD", i5);
        f4687r = new C0492b("HINGE", i5);
    }

    public /* synthetic */ C0492b(String str, int i3) {
        this.f4688k = i3;
        this.f4689l = str;
    }

    public String toString() {
        switch (this.f4688k) {
            case 0:
                return (String) this.f4689l;
            case 1:
                return (String) this.f4689l;
            case 2:
                return (String) this.f4689l;
            default:
                return super.toString();
        }
    }

    public C0492b(InterfaceC0499a interfaceC0499a) {
        this.f4688k = 3;
        int i3 = m.f4711b;
        this.f4689l = interfaceC0499a;
    }
}
