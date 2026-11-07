package p002b;

import A0.j;
import B1.p;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.F;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0134h;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.u;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import it.returntrue.novelist.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p003b0.A;
import p005c.a;
import p008d0.c;
import p019g1.h;
import p038m0.e;
import p055t.d;
import s.b;
import s.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends b implements T, InterfaceC0134h, e, u, d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final O1.e f2307A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final O1.e f2308B;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f2309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f2310m;
    public final h n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public S f2311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f2312p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final O1.e f2313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f2314r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f2315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f2316t;
    public final CopyOnWriteArrayList u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList f2317v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f2318w;
    public final CopyOnWriteArrayList x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2319z;

    public k() {
        a aVar = new a();
        this.f2309l = aVar;
        SignInHubActivity signInHubActivity = (SignInHubActivity) this;
        this.f2310m = new j(new d(signInHubActivity, 0));
        h hVar = new h(this);
        this.n = hVar;
        this.f2312p = new i(signInHubActivity);
        this.f2313q = new O1.e(new b(signInHubActivity, 1));
        new AtomicInteger();
        this.f2314r = new j(signInHubActivity);
        this.f2315s = new CopyOnWriteArrayList();
        this.f2316t = new CopyOnWriteArrayList();
        this.u = new CopyOnWriteArrayList();
        this.f2317v = new CopyOnWriteArrayList();
        this.f2318w = new CopyOnWriteArrayList();
        this.x = new CopyOnWriteArrayList();
        this.f2307A = new O1.e(new b(signInHubActivity, 2));
        u uVar = this.f4439k;
        if (uVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        uVar.a(new e(signInHubActivity, 0));
        this.f4439k.a(new e(signInHubActivity, 1));
        this.f4439k.a(new p038m0.b(signInHubActivity, 3));
        hVar.b();
        L.d(this);
        ((p) hVar.f2843c).c("android:support:activity-result", new f(signInHubActivity, 0));
        g gVar = new g(signInHubActivity, 0);
        k kVar = aVar.f2651b;
        if (kVar != null) {
            gVar.a(kVar);
        }
        aVar.f2650a.add(gVar);
        this.f2308B = new O1.e(new b(signInHubActivity, 3));
    }

    public static void d(SignInHubActivity signInHubActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e3) {
            if (!a2.h.a(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e3;
            }
        } catch (NullPointerException e4) {
            if (!a2.h.a(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e4;
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0134h
    public final c a() {
        c cVar = new c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f2769a;
        if (getApplication() != null) {
            linkedHashMap.put(L.f2130d, getApplication());
        }
        linkedHashMap.put(L.f2127a, this);
        linkedHashMap.put(L.f2128b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(L.f2129c, extras);
        }
        return cVar;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        a2.h.d(decorView, "getDecorView(...)");
        this.f2312p.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // p002b.u
    public final t b() {
        return (t) this.f2308B.a();
    }

    @Override // p038m0.e
    public final p c() {
        return (p) this.n.f2843c;
    }

    @Override // p055t.d
    public final void e(C.a aVar) {
        a2.h.e(aVar, "listener");
        this.f2315s.add(aVar);
    }

    @Override // androidx.lifecycle.T
    public final S f() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f2311o == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f2311o = hVar.f2296a;
            }
            if (this.f2311o == null) {
                this.f2311o = new S();
            }
        }
        S s3 = this.f2311o;
        a2.h.b(s3);
        return s3;
    }

    @Override // p055t.d
    public final void g(C.a aVar) {
        a2.h.e(aVar, "listener");
        this.f2315s.remove(aVar);
    }

    @Override // androidx.lifecycle.InterfaceC0144s
    public final u h() {
        return this.f4439k;
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        a2.h.d(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        a2.h.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        a2.h.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        a2.h.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        a2.h.d(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        a2.h.d(decorView6, "getDecorView(...)");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((p022h0.a) this.f2307A.a()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        a2.h.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it2 = this.f2315s.iterator();
        a2.h.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            ((C.a) it2.next()).accept(configuration);
        }
    }

    @Override // s.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.n.c(bundle);
        a aVar = this.f2309l;
        aVar.getClass();
        aVar.f2651b = this;
        Iterator it2 = aVar.f2650a.iterator();
        while (it2.hasNext()) {
            ((g) it2.next()).a(this);
        }
        super.onCreate(bundle);
        int i3 = H.f2125l;
        F.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        a2.h.e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f2310m.f58m).iterator();
        while (it2.hasNext()) {
            ((A) it2.next()).f2344a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        a2.h.e(menuItem, "item");
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 != 0) {
            return false;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f2310m.f58m).iterator();
        while (it2.hasNext()) {
            if (((A) it2.next()).f2344a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.y) {
            return;
        }
        Iterator it2 = this.f2317v.iterator();
        a2.h.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            ((C.a) it2.next()).accept(new s.c(z3));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        a2.h.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it2 = this.u.iterator();
        a2.h.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            ((C.a) it2.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        a2.h.e(menu, "menu");
        Iterator it2 = ((CopyOnWriteArrayList) this.f2310m.f58m).iterator();
        while (it2.hasNext()) {
            ((A) it2.next()).f2344a.q();
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f2319z) {
            return;
        }
        Iterator it2 = this.f2318w.iterator();
        a2.h.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            ((C.a) it2.next()).accept(new i(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        a2.h.e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it2 = ((CopyOnWriteArrayList) this.f2310m.f58m).iterator();
        while (it2.hasNext()) {
            ((A) it2.next()).f2344a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        boolean z3;
        a2.h.e(strArr, "permissions");
        a2.h.e(iArr, "grantResults");
        Intent intentPutExtra = new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr);
        j jVar = this.f2314r;
        String str = (String) jVar.f2300a.get(Integer.valueOf(i3));
        if (str == null) {
            z3 = false;
        } else {
            p007d.d dVar = (p007d.d) jVar.f2304e.get(str);
            ArrayList arrayList = jVar.f2303d;
            if ((dVar != null ? dVar.f2766a : null) == null || !arrayList.contains(str)) {
                jVar.f2305f.remove(str);
                jVar.f2306g.putParcelable(str, new p007d.b(intentPutExtra, -1));
            } else {
                dVar.f2766a.e(dVar.f2767b.F(intentPutExtra, -1));
                arrayList.remove(str);
            }
            z3 = true;
        }
        if (z3) {
            return;
        }
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        S s3 = this.f2311o;
        if (s3 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            s3 = hVar.f2296a;
        }
        if (s3 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f2296a = s3;
        return hVar2;
    }

    @Override // s.b, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        a2.h.e(bundle, "outState");
        u uVar = this.f4439k;
        if (uVar != null) {
            uVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.n.d(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it2 = this.f2316t.iterator();
        a2.h.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            ((C.a) it2.next()).accept(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it2 = this.x.iterator();
        a2.h.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (E2.a.z()) {
                Trace.beginSection(E2.a.V("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f2313q.a();
            synchronized (nVar.f2326b) {
                try {
                    nVar.f2327c = true;
                    ArrayList arrayList = nVar.f2328d;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((Z1.a) obj).a();
                    }
                    nVar.f2328d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i3) {
        i();
        View decorView = getWindow().getDecorView();
        a2.h.d(decorView, "getDecorView(...)");
        this.f2312p.a(decorView);
        super.setContentView(i3);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3) {
        a2.h.e(intent, "intent");
        super.startActivityForResult(intent, i3);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6) throws IntentSender.SendIntentException {
        a2.h.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        a2.h.e(intent, "intent");
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) throws IntentSender.SendIntentException {
        a2.h.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        a2.h.e(configuration, "newConfig");
        this.y = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.y = false;
            Iterator it2 = this.f2317v.iterator();
            a2.h.d(it2, "iterator(...)");
            while (it2.hasNext()) {
                ((C.a) it2.next()).accept(new s.c(z3));
            }
        } catch (Throwable th) {
            this.y = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        a2.h.e(configuration, "newConfig");
        this.f2319z = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f2319z = false;
            Iterator it2 = this.f2318w.iterator();
            a2.h.d(it2, "iterator(...)");
            while (it2.hasNext()) {
                ((C.a) it2.next()).accept(new i(z3));
            }
        } catch (Throwable th) {
            this.f2319z = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        a2.h.d(decorView, "getDecorView(...)");
        this.f2312p.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        a2.h.d(decorView, "getDecorView(...)");
        this.f2312p.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
