package p003b0;

import B1.p;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import p000a.a;
import p002b.t;
import p002b.u;
import p038m0.e;
import p055t.d;

/* JADX INFO: renamed from: b0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0165u extends a implements d, T, u, e, M {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SignInHubActivity f2553m;
    public final SignInHubActivity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f2554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I f2555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ SignInHubActivity f2556q;

    public C0165u(SignInHubActivity signInHubActivity) {
        super(18);
        this.f2556q = signInHubActivity;
        Handler handler = new Handler();
        this.f2553m = signInHubActivity;
        this.n = signInHubActivity;
        this.f2554o = handler;
        this.f2555p = new I();
    }

    @Override // p000a.a
    public final View L(int i3) {
        return this.f2556q.findViewById(i3);
    }

    @Override // p000a.a
    public final boolean M() {
        Window window = this.f2556q.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p002b.u
    public final t b() {
        return this.f2556q.b();
    }

    @Override // p038m0.e
    public final p c() {
        return (p) this.f2556q.n.f2843c;
    }

    @Override // p055t.d
    public final void e(C.a aVar) {
        this.f2556q.e(aVar);
    }

    @Override // androidx.lifecycle.T
    public final S f() {
        return this.f2556q.f();
    }

    @Override // p055t.d
    public final void g(C.a aVar) {
        this.f2556q.g(aVar);
    }

    @Override // androidx.lifecycle.InterfaceC0144s
    public final androidx.lifecycle.u h() {
        return this.f2556q.f2708D;
    }

    @Override // p003b0.M
    public final void d() {
    }
}
