package p002b;

import B1.p;
import M1.RunnableC0053b;
import Z1.a;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0138l;
import androidx.lifecycle.InterfaceC0144s;
import androidx.lifecycle.u;
import it.returntrue.novelist.R;
import p019g1.h;
import p038m0.e;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Dialog implements InterfaceC0144s, u, e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u f2322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f2323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final O1.e f2324m;
    public final O1.e n;

    public m(Context context, int i3) {
        super(context, i3);
        this.f2323l = new h(this);
        final int i4 = 0;
        this.f2324m = new O1.e(new a(this) { // from class: b.l

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ m f2321l;

            {
                this.f2321l = this;
            }

            @Override // Z1.a
            public final Object a() {
                switch (i4) {
                    case 0:
                        p022h0.a aVar = new p022h0.a();
                        this.f2321l.b().a().f2338c.c(aVar);
                        return aVar;
                    default:
                        return new t(new RunnableC0053b(this.f2321l, 5));
                }
            }
        });
        final int i5 = 1;
        this.n = new O1.e(new a(this) { // from class: b.l

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ m f2321l;

            {
                this.f2321l = this;
            }

            @Override // Z1.a
            public final Object a() {
                switch (i5) {
                    case 0:
                        p022h0.a aVar = new p022h0.a();
                        this.f2321l.b().a().f2338c.c(aVar);
                        return aVar;
                    default:
                        return new t(new RunnableC0053b(this.f2321l, 5));
                }
            }
        });
    }

    public static void a(m mVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a2.h.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // p002b.u
    public final t b() {
        return (t) this.n.a();
    }

    @Override // p038m0.e
    public final p c() {
        return (p) this.f2323l.f2843c;
    }

    public final void d() {
        Window window = getWindow();
        a2.h.b(window);
        View decorView = window.getDecorView();
        a2.h.d(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        a2.h.b(window2);
        View decorView2 = window2.getDecorView();
        a2.h.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        a2.h.b(window3);
        View decorView3 = window3.getDecorView();
        a2.h.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        a2.h.b(window4);
        View decorView4 = window4.getDecorView();
        a2.h.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0144s
    public final u h() {
        u uVar = this.f2322k;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        this.f2322k = uVar2;
        return uVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((p022h0.a) this.f2324m.a()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            t tVarB = b();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            a2.h.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            tVarB.b(onBackInvokedDispatcher);
        }
        this.f2323l.c(bundle);
        u uVar = this.f2322k;
        if (uVar == null) {
            uVar = new u(this);
            this.f2322k = uVar;
        }
        uVar.e(EnumC0138l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        a2.h.d(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f2323l.d(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        u uVar = this.f2322k;
        if (uVar == null) {
            uVar = new u(this);
            this.f2322k = uVar;
        }
        uVar.e(EnumC0138l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        u uVar = this.f2322k;
        if (uVar == null) {
            uVar = new u(this);
            this.f2322k = uVar;
        }
        uVar.e(EnumC0138l.ON_DESTROY);
        this.f2322k = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i3) {
        d();
        super.setContentView(i3);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        a2.h.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a2.h.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
