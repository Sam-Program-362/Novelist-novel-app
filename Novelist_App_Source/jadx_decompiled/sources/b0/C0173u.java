package b0;

import a.AbstractC0102a;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import m0.InterfaceC0431e;
import t.InterfaceC0471d;

/* renamed from: b0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173u extends AbstractC0102a implements InterfaceC0471d, androidx.lifecycle.T, b.u, InterfaceC0431e, M {

    /* renamed from: m, reason: collision with root package name */
    public final SignInHubActivity f2553m;
    public final SignInHubActivity n;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f2554o;

    /* renamed from: p, reason: collision with root package name */
    public final I f2555p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ SignInHubActivity f2556q;

    public C0173u(SignInHubActivity signInHubActivity) {
        super(18);
        this.f2556q = signInHubActivity;
        Handler handler = new Handler();
        this.f2553m = signInHubActivity;
        this.n = signInHubActivity;
        this.f2554o = handler;
        this.f2555p = new I();
    }

    @Override // a.AbstractC0102a
    public final View L(int i3) {
        return this.f2556q.findViewById(i3);
    }

    @Override // a.AbstractC0102a
    public final boolean M() {
        Window window = this.f2556q.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // b.u
    public final b.t b() {
        return this.f2556q.b();
    }

    @Override // m0.InterfaceC0431e
    public final B1.p c() {
        return (B1.p) this.f2556q.n.f2843c;
    }

    @Override // t.InterfaceC0471d
    public final void e(C.a aVar) {
        this.f2556q.e(aVar);
    }

    @Override // androidx.lifecycle.T
    public final androidx.lifecycle.S f() {
        return this.f2556q.f();
    }

    @Override // t.InterfaceC0471d
    public final void g(C.a aVar) {
        this.f2556q.g(aVar);
    }

    @Override // androidx.lifecycle.InterfaceC0146s
    public final androidx.lifecycle.u h() {
        return this.f2556q.f2708D;
    }

    @Override // b0.M
    public final void d() {
    }
}
