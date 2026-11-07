package b;

import M1.RunnableC0053b;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0140l;
import androidx.lifecycle.InterfaceC0146s;
import h0.C0258a;
import it.returntrue.novelist.R;
import m0.InterfaceC0431e;

/* loaded from: classes.dex */
public final class m extends Dialog implements InterfaceC0146s, u, InterfaceC0431e {

    /* renamed from: k, reason: collision with root package name */
    public androidx.lifecycle.u f2322k;

    /* renamed from: l, reason: collision with root package name */
    public final g1.h f2323l;

    /* renamed from: m, reason: collision with root package name */
    public final O1.e f2324m;
    public final O1.e n;

    public m(Context context, int i3) {
        super(context, i3);
        this.f2323l = new g1.h(this);
        final int i4 = 0;
        this.f2324m = new O1.e(new Z1.a(this) { // from class: b.l

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ m f2321l;

            {
                this.f2321l = this;
            }

            @Override // Z1.a
            public final Object a() {
                switch (i4) {
                    case 0:
                        C0258a c0258a = new C0258a();
                        this.f2321l.b().a().f2338c.c(c0258a);
                        return c0258a;
                    default:
                        return new t(new RunnableC0053b(this.f2321l, 5));
                }
            }
        });
        final int i5 = 1;
        this.n = new O1.e(new Z1.a(this) { // from class: b.l

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ m f2321l;

            {
                this.f2321l = this;
            }

            @Override // Z1.a
            public final Object a() {
                switch (i5) {
                    case 0:
                        C0258a c0258a = new C0258a();
                        this.f2321l.b().a().f2338c.c(c0258a);
                        return c0258a;
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

    @Override // b.u
    public final t b() {
        return (t) this.n.a();
    }

    @Override // m0.InterfaceC0431e
    public final B1.p c() {
        return (B1.p) this.f2323l.f2843c;
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

    @Override // androidx.lifecycle.InterfaceC0146s
    public final androidx.lifecycle.u h() {
        androidx.lifecycle.u uVar = this.f2322k;
        if (uVar != null) {
            return uVar;
        }
        androidx.lifecycle.u uVar2 = new androidx.lifecycle.u(this);
        this.f2322k = uVar2;
        return uVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((C0258a) this.f2324m.a()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            t b3 = b();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            a2.h.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            b3.b(onBackInvokedDispatcher);
        }
        this.f2323l.c(bundle);
        androidx.lifecycle.u uVar = this.f2322k;
        if (uVar == null) {
            uVar = new androidx.lifecycle.u(this);
            this.f2322k = uVar;
        }
        uVar.e(EnumC0140l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        a2.h.d(onSaveInstanceState, "onSaveInstanceState(...)");
        this.f2323l.d(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.u uVar = this.f2322k;
        if (uVar == null) {
            uVar = new androidx.lifecycle.u(this);
            this.f2322k = uVar;
        }
        uVar.e(EnumC0140l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        androidx.lifecycle.u uVar = this.f2322k;
        if (uVar == null) {
            uVar = new androidx.lifecycle.u(this);
            this.f2322k = uVar;
        }
        uVar.e(EnumC0140l.ON_DESTROY);
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
