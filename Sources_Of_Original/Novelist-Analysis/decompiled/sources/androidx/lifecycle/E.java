package androidx.lifecycle;

import M1.RunnableC0053b;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class E implements InterfaceC0144s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final E f2117s = new E();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2119l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f2121o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2120m = true;
    public boolean n = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f2122p = new u(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RunnableC0053b f2123q = new RunnableC0053b(this, 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B1.a f2124r = new B1.a(this, 14);

    public final void a() {
        int i3 = this.f2119l + 1;
        this.f2119l = i3;
        if (i3 == 1) {
            if (this.f2120m) {
                this.f2122p.e(EnumC0138l.ON_RESUME);
                this.f2120m = false;
            } else {
                Handler handler = this.f2121o;
                a2.h.b(handler);
                handler.removeCallbacks(this.f2123q);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0144s
    public final u h() {
        return this.f2122p;
    }
}
