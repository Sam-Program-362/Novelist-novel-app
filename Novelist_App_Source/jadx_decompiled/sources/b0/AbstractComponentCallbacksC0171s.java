package b0;

import a.AbstractC0102a;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0141m;
import androidx.lifecycle.InterfaceC0136h;
import androidx.lifecycle.InterfaceC0146s;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import m0.InterfaceC0431e;

/* renamed from: b0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0171s implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0146s, androidx.lifecycle.T, InterfaceC0136h, InterfaceC0431e {

    /* renamed from: b0, reason: collision with root package name */
    public static final Object f2513b0 = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f2514A;

    /* renamed from: B, reason: collision with root package name */
    public int f2515B;

    /* renamed from: C, reason: collision with root package name */
    public I f2516C;

    /* renamed from: D, reason: collision with root package name */
    public C0173u f2517D;

    /* renamed from: F, reason: collision with root package name */
    public AbstractComponentCallbacksC0171s f2519F;

    /* renamed from: G, reason: collision with root package name */
    public int f2520G;

    /* renamed from: H, reason: collision with root package name */
    public int f2521H;

    /* renamed from: I, reason: collision with root package name */
    public String f2522I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2523J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2524K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2525L;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2527N;

    /* renamed from: O, reason: collision with root package name */
    public ViewGroup f2528O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2529P;

    /* renamed from: R, reason: collision with root package name */
    public r f2531R;
    public boolean S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f2532T;

    /* renamed from: U, reason: collision with root package name */
    public String f2533U;

    /* renamed from: V, reason: collision with root package name */
    public EnumC0141m f2534V;
    public androidx.lifecycle.u W;

    /* renamed from: X, reason: collision with root package name */
    public final androidx.lifecycle.z f2535X;

    /* renamed from: Y, reason: collision with root package name */
    public g1.h f2536Y;

    /* renamed from: Z, reason: collision with root package name */
    public final ArrayList f2537Z;

    /* renamed from: a0, reason: collision with root package name */
    public final C0170q f2538a0;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f2540l;

    /* renamed from: m, reason: collision with root package name */
    public SparseArray f2541m;
    public Bundle n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f2543p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractComponentCallbacksC0171s f2544q;

    /* renamed from: s, reason: collision with root package name */
    public int f2546s;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2548v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2549w;
    public boolean x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2550z;

    /* renamed from: k, reason: collision with root package name */
    public int f2539k = -1;

    /* renamed from: o, reason: collision with root package name */
    public String f2542o = UUID.randomUUID().toString();

    /* renamed from: r, reason: collision with root package name */
    public String f2545r = null;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f2547t = null;

    /* renamed from: E, reason: collision with root package name */
    public I f2518E = new I();

    /* renamed from: M, reason: collision with root package name */
    public final boolean f2526M = true;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2530Q = true;

    public AbstractComponentCallbacksC0171s() {
        new A.b(this, 8);
        this.f2534V = EnumC0141m.f2153o;
        this.f2535X = new androidx.lifecycle.z();
        new AtomicInteger();
        this.f2537Z = new ArrayList();
        this.f2538a0 = new C0170q(this);
        k();
    }

    public final void A(int i3, int i4, int i5, int i6) {
        if (this.f2531R == null && i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return;
        }
        e().f2504b = i3;
        e().f2505c = i4;
        e().f2506d = i5;
        e().f2507e = i6;
    }

    @Override // androidx.lifecycle.InterfaceC0136h
    public final d0.c a() {
        Application application;
        Context applicationContext = z().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && I.J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + z().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        d0.c cVar = new d0.c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f2769a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.L.f2130d, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f2127a, this);
        linkedHashMap.put(androidx.lifecycle.L.f2128b, this);
        Bundle bundle = this.f2543p;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.L.f2129c, bundle);
        }
        return cVar;
    }

    @Override // m0.InterfaceC0431e
    public final B1.p c() {
        return (B1.p) this.f2536Y.f2843c;
    }

    public abstract AbstractC0102a d();

    public final r e() {
        if (this.f2531R == null) {
            r rVar = new r();
            Object obj = f2513b0;
            rVar.f2509g = obj;
            rVar.f2510h = obj;
            rVar.f2511i = obj;
            rVar.f2512j = null;
            this.f2531R = rVar;
        }
        return this.f2531R;
    }

    @Override // androidx.lifecycle.T
    public final androidx.lifecycle.S f() {
        if (this.f2516C == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f2516C.f2367N.f2402d;
        androidx.lifecycle.S s3 = (androidx.lifecycle.S) hashMap.get(this.f2542o);
        if (s3 != null) {
            return s3;
        }
        androidx.lifecycle.S s4 = new androidx.lifecycle.S();
        hashMap.put(this.f2542o, s4);
        return s4;
    }

    public final I g() {
        if (this.f2517D != null) {
            return this.f2518E;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // androidx.lifecycle.InterfaceC0146s
    public final androidx.lifecycle.u h() {
        return this.W;
    }

    public final int i() {
        EnumC0141m enumC0141m = this.f2534V;
        return (enumC0141m == EnumC0141m.f2151l || this.f2519F == null) ? enumC0141m.ordinal() : Math.min(enumC0141m.ordinal(), this.f2519F.i());
    }

    public final I j() {
        I i3 = this.f2516C;
        if (i3 != null) {
            return i3;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.W = new androidx.lifecycle.u(this);
        this.f2536Y = new g1.h(this);
        ArrayList arrayList = this.f2537Z;
        C0170q c0170q = this.f2538a0;
        if (arrayList.contains(c0170q)) {
            return;
        }
        if (this.f2539k >= 0) {
            c0170q.a();
        } else {
            arrayList.add(c0170q);
        }
    }

    public final void l() {
        k();
        this.f2533U = this.f2542o;
        this.f2542o = UUID.randomUUID().toString();
        this.u = false;
        this.f2548v = false;
        this.x = false;
        this.y = false;
        this.f2550z = false;
        this.f2515B = 0;
        this.f2516C = null;
        this.f2518E = new I();
        this.f2517D = null;
        this.f2520G = 0;
        this.f2521H = 0;
        this.f2522I = null;
        this.f2523J = false;
        this.f2524K = false;
    }

    public final boolean m() {
        if (this.f2523J) {
            return true;
        }
        I i3 = this.f2516C;
        if (i3 != null) {
            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2519F;
            i3.getClass();
            if (abstractComponentCallbacksC0171s == null ? false : abstractComponentCallbacksC0171s.m()) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        return this.f2515B > 0;
    }

    public abstract void o();

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f2527N = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0173u c0173u = this.f2517D;
        SignInHubActivity signInHubActivity = c0173u == null ? null : c0173u.f2553m;
        if (signInHubActivity != null) {
            signInHubActivity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f2527N = true;
    }

    public void p(int i3, int i4, Intent intent) {
        if (I.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i3 + " resultCode: " + i4 + " data: " + intent);
        }
    }

    public void q(Context context) {
        this.f2527N = true;
        C0173u c0173u = this.f2517D;
        if ((c0173u == null ? null : c0173u.f2553m) != null) {
            this.f2527N = true;
        }
    }

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t();

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f2542o);
        if (this.f2520G != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2520G));
        }
        if (this.f2522I != null) {
            sb.append(" tag=");
            sb.append(this.f2522I);
        }
        sb.append(")");
        return sb.toString();
    }

    public LayoutInflater u(Bundle bundle) {
        C0173u c0173u = this.f2517D;
        if (c0173u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        SignInHubActivity signInHubActivity = c0173u.f2556q;
        LayoutInflater cloneInContext = signInHubActivity.getLayoutInflater().cloneInContext(signInHubActivity);
        cloneInContext.setFactory2(this.f2518E.f2374f);
        return cloneInContext;
    }

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x();

    public void y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2518E.P();
        this.f2514A = true;
        f();
    }

    public final Context z() {
        C0173u c0173u = this.f2517D;
        SignInHubActivity signInHubActivity = c0173u == null ? null : c0173u.n;
        if (signInHubActivity != null) {
            return signInHubActivity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }
}
