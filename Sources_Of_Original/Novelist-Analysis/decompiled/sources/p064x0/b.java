package p064x0;

import p066y0.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f4683m;
    public static final b n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f4684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f4685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f4686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f4687r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f4689l;

    static {
        int i3 = 0;
        f4683m = new b("NONE", i3);
        n = new b("FULL", i3);
        int i4 = 1;
        f4684o = new b("FLAT", i4);
        f4685p = new b("HALF_OPENED", i4);
        int i5 = 2;
        f4686q = new b("FOLD", i5);
        f4687r = new b("HINGE", i5);
    }

    public /* synthetic */ b(String str, int i3) {
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

    public b(a aVar) {
        this.f4688k = 3;
        int i3 = m.f4711b;
        this.f4689l = aVar;
    }
}
