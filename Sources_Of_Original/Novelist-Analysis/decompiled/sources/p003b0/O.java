package p003b0;

import A.c;
import B1.e;
import B1.s;
import a2.h;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.EnumC0138l;
import androidx.lifecycle.EnumC0139m;
import c0.a;
import c0.d;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import it.returntrue.novelist.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;
import p004b1.Q;
import p038m0.b;
import p042o.k;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f2418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0163s f2419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2420d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2421e = -1;

    public O(c cVar, s sVar, AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        this.f2417a = cVar;
        this.f2418b = sVar;
        this.f2419c = abstractComponentCallbacksC0163s;
    }

    public final void a() {
        boolean zJ = I.J(3);
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (zJ) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0163s);
        }
        Bundle bundle = abstractComponentCallbacksC0163s.f2540l;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0163s.f2518E.P();
        abstractComponentCallbacksC0163s.f2539k = 3;
        abstractComponentCallbacksC0163s.f2527N = false;
        abstractComponentCallbacksC0163s.o();
        if (!abstractComponentCallbacksC0163s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0163s + " did not call through to super.onActivityCreated()");
        }
        if (I.J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0163s);
        }
        abstractComponentCallbacksC0163s.f2540l = null;
        I i3 = abstractComponentCallbacksC0163s.f2518E;
        i3.f2360G = false;
        i3.f2361H = false;
        i3.f2367N.f2405g = false;
        i3.u(4);
        this.f2417a.l(abstractComponentCallbacksC0163s, false);
    }

    public final void b() {
        boolean zJ = I.J(3);
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (zJ) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0163s);
        }
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = abstractComponentCallbacksC0163s.f2544q;
        O o2 = null;
        s sVar = this.f2418b;
        if (abstractComponentCallbacksC0163s2 != null) {
            O o3 = (O) ((HashMap) sVar.f145l).get(abstractComponentCallbacksC0163s2.f2542o);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0163s + " declared target fragment " + abstractComponentCallbacksC0163s.f2544q + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0163s.f2545r = abstractComponentCallbacksC0163s.f2544q.f2542o;
            abstractComponentCallbacksC0163s.f2544q = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0163s.f2545r;
            if (str != null && (o2 = (O) ((HashMap) sVar.f145l).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0163s);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(e.m(sb, abstractComponentCallbacksC0163s.f2545r, " that does not belong to this FragmentManager!"));
            }
        }
        if (o2 != null) {
            o2.j();
        }
        I i3 = abstractComponentCallbacksC0163s.f2516C;
        abstractComponentCallbacksC0163s.f2517D = i3.f2388v;
        abstractComponentCallbacksC0163s.f2519F = i3.x;
        c cVar = this.f2417a;
        cVar.s(abstractComponentCallbacksC0163s, false);
        ArrayList arrayList = abstractComponentCallbacksC0163s.f2537Z;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((C0162q) obj).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0163s.f2518E.b(abstractComponentCallbacksC0163s.f2517D, abstractComponentCallbacksC0163s.d(), abstractComponentCallbacksC0163s);
        abstractComponentCallbacksC0163s.f2539k = 0;
        abstractComponentCallbacksC0163s.f2527N = false;
        abstractComponentCallbacksC0163s.q(abstractComponentCallbacksC0163s.f2517D.n);
        if (!abstractComponentCallbacksC0163s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0163s + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0163s.f2516C.f2382o.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).d();
        }
        I i5 = abstractComponentCallbacksC0163s.f2518E;
        i5.f2360G = false;
        i5.f2361H = false;
        i5.f2367N.f2405g = false;
        i5.u(0);
        cVar.m(abstractComponentCallbacksC0163s, false);
    }

    public final int c() {
        C0157l c0157l;
        Object obj;
        Object obj2;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (abstractComponentCallbacksC0163s.f2516C == null) {
            return abstractComponentCallbacksC0163s.f2539k;
        }
        int iMin = this.f2421e;
        int iOrdinal = abstractComponentCallbacksC0163s.f2534V.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0163s.x) {
            if (abstractComponentCallbacksC0163s.y) {
                iMin = Math.max(this.f2421e, 2);
            } else {
                iMin = this.f2421e < 4 ? Math.min(iMin, abstractComponentCallbacksC0163s.f2539k) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0163s.u) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0163s.f2528O;
        if (viewGroup != null) {
            h.d(abstractComponentCallbacksC0163s.j().H(), "fragmentManager.specialEffectsControllerFactory");
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof C0157l) {
                c0157l = (C0157l) tag;
            } else {
                c0157l = new C0157l(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, c0157l);
            }
            c0157l.getClass();
            ArrayList arrayList = c0157l.f2481b;
            int size = arrayList.size();
            int i3 = 0;
            do {
                obj = null;
                if (i3 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i3);
                i3++;
                ((U) obj2).getClass();
            } while (!h.a(null, abstractComponentCallbacksC0163s));
            ArrayList arrayList2 = c0157l.f2482c;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj3 = arrayList2.get(i4);
                i4++;
                ((U) obj3).getClass();
                if (h.a(null, abstractComponentCallbacksC0163s)) {
                    obj = obj3;
                    break;
                }
            }
        }
        if (abstractComponentCallbacksC0163s.f2548v) {
            iMin = abstractComponentCallbacksC0163s.n() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0163s.f2529P && abstractComponentCallbacksC0163s.f2539k < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (abstractComponentCallbacksC0163s.f2549w && abstractComponentCallbacksC0163s.f2528O != null) {
            iMin = Math.max(iMin, 3);
        }
        if (I.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0163s);
        }
        return iMin;
    }

    public final void d() {
        Bundle bundle;
        boolean zJ = I.J(3);
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (zJ) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0163s);
        }
        Bundle bundle2 = abstractComponentCallbacksC0163s.f2540l;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0163s.f2532T) {
            abstractComponentCallbacksC0163s.f2539k = 1;
            Bundle bundle4 = abstractComponentCallbacksC0163s.f2540l;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0163s.f2518E.U(bundle);
            I i3 = abstractComponentCallbacksC0163s.f2518E;
            i3.f2360G = false;
            i3.f2361H = false;
            i3.f2367N.f2405g = false;
            i3.u(1);
            return;
        }
        c cVar = this.f2417a;
        cVar.t(abstractComponentCallbacksC0163s, false);
        abstractComponentCallbacksC0163s.f2518E.P();
        abstractComponentCallbacksC0163s.f2539k = 1;
        abstractComponentCallbacksC0163s.f2527N = false;
        abstractComponentCallbacksC0163s.W.a(new b(abstractComponentCallbacksC0163s, 4));
        abstractComponentCallbacksC0163s.r(bundle3);
        abstractComponentCallbacksC0163s.f2532T = true;
        if (abstractComponentCallbacksC0163s.f2527N) {
            abstractComponentCallbacksC0163s.W.e(EnumC0138l.ON_CREATE);
            cVar.n(abstractComponentCallbacksC0163s, false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0163s + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String resourceName;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (abstractComponentCallbacksC0163s.x) {
            return;
        }
        if (I.J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0163s);
        }
        Bundle bundle = abstractComponentCallbacksC0163s.f2540l;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterU = abstractComponentCallbacksC0163s.u(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0163s.f2528O;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i3 = abstractComponentCallbacksC0163s.f2521H;
            if (i3 != 0) {
                if (i3 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0163s + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0163s.f2516C.f2389w.L(i3);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0163s.f2550z) {
                        try {
                            resourceName = abstractComponentCallbacksC0163s.z().getResources().getResourceName(abstractComponentCallbacksC0163s.f2521H);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0163s.f2521H) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0163s);
                    }
                } else if (!(viewGroup instanceof C0167w)) {
                    c0.c cVar = d.f2657a;
                    d.b(new a(abstractComponentCallbacksC0163s, "Attempting to add fragment " + abstractComponentCallbacksC0163s + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    d.a(abstractComponentCallbacksC0163s).getClass();
                }
            }
        }
        abstractComponentCallbacksC0163s.f2528O = viewGroup;
        abstractComponentCallbacksC0163s.y(layoutInflaterU, viewGroup, bundle2);
        abstractComponentCallbacksC0163s.f2539k = 2;
    }

    public final void f() {
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163sH;
        boolean zJ = I.J(3);
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0163s);
        }
        boolean zIsChangingConfigurations = true;
        int i3 = 0;
        boolean z3 = abstractComponentCallbacksC0163s.f2548v && !abstractComponentCallbacksC0163s.n();
        s sVar = this.f2418b;
        if (z3) {
            sVar.A(abstractComponentCallbacksC0163s.f2542o, null);
        }
        if (!z3) {
            L l3 = (L) sVar.n;
            if (!((l3.f2400b.containsKey(abstractComponentCallbacksC0163s.f2542o) && l3.f2403e) ? l3.f2404f : true)) {
                String str = abstractComponentCallbacksC0163s.f2545r;
                if (str != null && (abstractComponentCallbacksC0163sH = sVar.h(str)) != null && abstractComponentCallbacksC0163sH.f2525L) {
                    abstractComponentCallbacksC0163s.f2544q = abstractComponentCallbacksC0163sH;
                }
                abstractComponentCallbacksC0163s.f2539k = 0;
                return;
            }
        }
        C0165u c0165u = abstractComponentCallbacksC0163s.f2517D;
        if (c0165u != null) {
            zIsChangingConfigurations = ((L) sVar.n).f2404f;
        } else {
            SignInHubActivity signInHubActivity = c0165u.n;
            if (signInHubActivity != null) {
                zIsChangingConfigurations = true ^ signInHubActivity.isChangingConfigurations();
            }
        }
        if (z3 || zIsChangingConfigurations) {
            ((L) sVar.n).c(abstractComponentCallbacksC0163s, false);
        }
        abstractComponentCallbacksC0163s.f2518E.l();
        abstractComponentCallbacksC0163s.W.e(EnumC0138l.ON_DESTROY);
        abstractComponentCallbacksC0163s.f2539k = 0;
        abstractComponentCallbacksC0163s.f2527N = false;
        abstractComponentCallbacksC0163s.f2532T = false;
        abstractComponentCallbacksC0163s.f2527N = true;
        if (!abstractComponentCallbacksC0163s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0163s + " did not call through to super.onDestroy()");
        }
        this.f2417a.p(abstractComponentCallbacksC0163s, false);
        ArrayList arrayListL = sVar.l();
        int size = arrayListL.size();
        while (i3 < size) {
            Object obj = arrayListL.get(i3);
            i3++;
            O o2 = (O) obj;
            if (o2 != null) {
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = o2.f2419c;
                if (abstractComponentCallbacksC0163s.f2542o.equals(abstractComponentCallbacksC0163s2.f2545r)) {
                    abstractComponentCallbacksC0163s2.f2544q = abstractComponentCallbacksC0163s;
                    abstractComponentCallbacksC0163s2.f2545r = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC0163s.f2545r;
        if (str2 != null) {
            abstractComponentCallbacksC0163s.f2544q = sVar.h(str2);
        }
        sVar.v(this);
    }

    public final void g() {
        boolean zJ = I.J(3);
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0163s);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0163s.f2528O;
        abstractComponentCallbacksC0163s.f2518E.u(1);
        abstractComponentCallbacksC0163s.f2539k = 1;
        abstractComponentCallbacksC0163s.f2527N = false;
        abstractComponentCallbacksC0163s.s();
        if (!abstractComponentCallbacksC0163s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0163s + " did not call through to super.onDestroyView()");
        }
        k kVar = ((p014f0.b) Q.v(abstractComponentCallbacksC0163s).f2600m).f2813b;
        int i3 = kVar.f4212m;
        for (int i4 = 0; i4 < i3; i4++) {
            ((p014f0.a) kVar.f4211l[i4]).i();
        }
        abstractComponentCallbacksC0163s.f2514A = false;
        this.f2417a.y(abstractComponentCallbacksC0163s, false);
        abstractComponentCallbacksC0163s.f2528O = null;
        abstractComponentCallbacksC0163s.f2535X.h(null);
        abstractComponentCallbacksC0163s.y = false;
    }

    public final void h() {
        boolean zJ = I.J(3);
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0163s);
        }
        abstractComponentCallbacksC0163s.f2539k = -1;
        abstractComponentCallbacksC0163s.f2527N = false;
        abstractComponentCallbacksC0163s.t();
        if (!abstractComponentCallbacksC0163s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0163s + " did not call through to super.onDetach()");
        }
        I i3 = abstractComponentCallbacksC0163s.f2518E;
        if (!i3.f2362I) {
            i3.l();
            abstractComponentCallbacksC0163s.f2518E = new I();
        }
        this.f2417a.q(abstractComponentCallbacksC0163s, false);
        abstractComponentCallbacksC0163s.f2539k = -1;
        abstractComponentCallbacksC0163s.f2517D = null;
        abstractComponentCallbacksC0163s.f2519F = null;
        abstractComponentCallbacksC0163s.f2516C = null;
        if (!abstractComponentCallbacksC0163s.f2548v || abstractComponentCallbacksC0163s.n()) {
            L l3 = (L) this.f2418b.n;
            if (!((l3.f2400b.containsKey(abstractComponentCallbacksC0163s.f2542o) && l3.f2403e) ? l3.f2404f : true)) {
                return;
            }
        }
        if (I.J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0163s);
        }
        abstractComponentCallbacksC0163s.l();
    }

    public final void i() {
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (abstractComponentCallbacksC0163s.x && abstractComponentCallbacksC0163s.y && !abstractComponentCallbacksC0163s.f2514A) {
            if (I.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0163s);
            }
            Bundle bundle = abstractComponentCallbacksC0163s.f2540l;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0163s.y(abstractComponentCallbacksC0163s.u(bundle2), null, bundle2);
        }
    }

    public final void j() {
        s sVar = this.f2418b;
        boolean z3 = this.f2420d;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (z3) {
            if (I.J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0163s);
                return;
            }
            return;
        }
        try {
            this.f2420d = true;
            boolean z4 = false;
            while (true) {
                int iC = c();
                int i3 = abstractComponentCallbacksC0163s.f2539k;
                if (iC == i3) {
                    if (!z4 && i3 == -1 && abstractComponentCallbacksC0163s.f2548v && !abstractComponentCallbacksC0163s.n()) {
                        if (I.J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0163s);
                        }
                        ((L) sVar.n).c(abstractComponentCallbacksC0163s, true);
                        sVar.v(this);
                        if (I.J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0163s);
                        }
                        abstractComponentCallbacksC0163s.l();
                    }
                    if (abstractComponentCallbacksC0163s.S) {
                        I i4 = abstractComponentCallbacksC0163s.f2516C;
                        if (i4 != null && abstractComponentCallbacksC0163s.u && I.K(abstractComponentCallbacksC0163s)) {
                            i4.f2359F = true;
                        }
                        abstractComponentCallbacksC0163s.S = false;
                        abstractComponentCallbacksC0163s.f2518E.o();
                    }
                    return;
                }
                if (iC <= i3) {
                    switch (i3 - 1) {
                        case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            abstractComponentCallbacksC0163s.f2539k = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0163s.y = false;
                            abstractComponentCallbacksC0163s.f2539k = 2;
                            break;
                        case 3:
                            if (I.J(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0163s);
                            }
                            abstractComponentCallbacksC0163s.f2539k = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            abstractComponentCallbacksC0163s.f2539k = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i3 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            abstractComponentCallbacksC0163s.f2539k = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            abstractComponentCallbacksC0163s.f2539k = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z4 = true;
            }
        } finally {
            this.f2420d = false;
        }
    }

    public final void k() {
        boolean zJ = I.J(3);
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0163s);
        }
        abstractComponentCallbacksC0163s.f2518E.u(5);
        abstractComponentCallbacksC0163s.W.e(EnumC0138l.ON_PAUSE);
        abstractComponentCallbacksC0163s.f2539k = 6;
        abstractComponentCallbacksC0163s.f2527N = true;
        this.f2417a.r(abstractComponentCallbacksC0163s, false);
    }

    public final void l(ClassLoader classLoader) {
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        Bundle bundle = abstractComponentCallbacksC0163s.f2540l;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0163s.f2540l.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0163s.f2540l.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC0163s.f2541m = abstractComponentCallbacksC0163s.f2540l.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC0163s.n = abstractComponentCallbacksC0163s.f2540l.getBundle("viewRegistryState");
            N n = (N) abstractComponentCallbacksC0163s.f2540l.getParcelable("state");
            if (n != null) {
                abstractComponentCallbacksC0163s.f2545r = n.f2415v;
                abstractComponentCallbacksC0163s.f2546s = n.f2416w;
                abstractComponentCallbacksC0163s.f2530Q = n.x;
            }
            if (abstractComponentCallbacksC0163s.f2530Q) {
                return;
            }
            abstractComponentCallbacksC0163s.f2529P = true;
        } catch (BadParcelableException e3) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC0163s, e3);
        }
    }

    public final void m() {
        boolean zJ = I.J(3);
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (zJ) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0163s);
        }
        r rVar = abstractComponentCallbacksC0163s.f2531R;
        View view = rVar == null ? null : rVar.f2512j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        abstractComponentCallbacksC0163s.e().f2512j = null;
        abstractComponentCallbacksC0163s.f2518E.P();
        abstractComponentCallbacksC0163s.f2518E.A(true);
        abstractComponentCallbacksC0163s.f2539k = 7;
        abstractComponentCallbacksC0163s.f2527N = false;
        abstractComponentCallbacksC0163s.f2527N = true;
        if (!abstractComponentCallbacksC0163s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0163s + " did not call through to super.onResume()");
        }
        abstractComponentCallbacksC0163s.W.e(EnumC0138l.ON_RESUME);
        I i3 = abstractComponentCallbacksC0163s.f2518E;
        i3.f2360G = false;
        i3.f2361H = false;
        i3.f2367N.f2405g = false;
        i3.u(7);
        this.f2417a.u(abstractComponentCallbacksC0163s, false);
        this.f2418b.A(abstractComponentCallbacksC0163s.f2542o, null);
        abstractComponentCallbacksC0163s.f2540l = null;
        abstractComponentCallbacksC0163s.f2541m = null;
        abstractComponentCallbacksC0163s.n = null;
    }

    public final void n() {
        boolean zJ = I.J(3);
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (zJ) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0163s);
        }
        abstractComponentCallbacksC0163s.f2518E.P();
        abstractComponentCallbacksC0163s.f2518E.A(true);
        abstractComponentCallbacksC0163s.f2539k = 5;
        abstractComponentCallbacksC0163s.f2527N = false;
        abstractComponentCallbacksC0163s.w();
        if (!abstractComponentCallbacksC0163s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0163s + " did not call through to super.onStart()");
        }
        abstractComponentCallbacksC0163s.W.e(EnumC0138l.ON_START);
        I i3 = abstractComponentCallbacksC0163s.f2518E;
        i3.f2360G = false;
        i3.f2361H = false;
        i3.f2367N.f2405g = false;
        i3.u(5);
        this.f2417a.w(abstractComponentCallbacksC0163s, false);
    }

    public final void o() {
        boolean zJ = I.J(3);
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2419c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0163s);
        }
        I i3 = abstractComponentCallbacksC0163s.f2518E;
        i3.f2361H = true;
        i3.f2367N.f2405g = true;
        i3.u(4);
        abstractComponentCallbacksC0163s.W.e(EnumC0138l.ON_STOP);
        abstractComponentCallbacksC0163s.f2539k = 4;
        abstractComponentCallbacksC0163s.f2527N = false;
        abstractComponentCallbacksC0163s.x();
        if (abstractComponentCallbacksC0163s.f2527N) {
            this.f2417a.x(abstractComponentCallbacksC0163s, false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0163s + " did not call through to super.onStop()");
    }

    public O(c cVar, s sVar, ClassLoader classLoader, B b3, Bundle bundle) {
        this.f2417a = cVar;
        this.f2418b = sVar;
        N n = (N) bundle.getParcelable("state");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163sA = b3.a(n.f2406k);
        abstractComponentCallbacksC0163sA.f2542o = n.f2407l;
        abstractComponentCallbacksC0163sA.x = n.f2408m;
        abstractComponentCallbacksC0163sA.f2550z = true;
        abstractComponentCallbacksC0163sA.f2520G = n.n;
        abstractComponentCallbacksC0163sA.f2521H = n.f2409o;
        abstractComponentCallbacksC0163sA.f2522I = n.f2410p;
        abstractComponentCallbacksC0163sA.f2525L = n.f2411q;
        abstractComponentCallbacksC0163sA.f2548v = n.f2412r;
        abstractComponentCallbacksC0163sA.f2524K = n.f2413s;
        abstractComponentCallbacksC0163sA.f2523J = n.f2414t;
        abstractComponentCallbacksC0163sA.f2534V = EnumC0139m.values()[n.u];
        abstractComponentCallbacksC0163sA.f2545r = n.f2415v;
        abstractComponentCallbacksC0163sA.f2546s = n.f2416w;
        abstractComponentCallbacksC0163sA.f2530Q = n.x;
        this.f2419c = abstractComponentCallbacksC0163sA;
        abstractComponentCallbacksC0163sA.f2540l = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        I i3 = abstractComponentCallbacksC0163sA.f2516C;
        if (i3 != null && (i3.f2360G || i3.f2361H)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        abstractComponentCallbacksC0163sA.f2543p = bundle2;
        if (I.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0163sA);
        }
    }

    public O(c cVar, s sVar, AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, Bundle bundle) {
        this.f2417a = cVar;
        this.f2418b = sVar;
        this.f2419c = abstractComponentCallbacksC0163s;
        abstractComponentCallbacksC0163s.f2541m = null;
        abstractComponentCallbacksC0163s.n = null;
        abstractComponentCallbacksC0163s.f2515B = 0;
        abstractComponentCallbacksC0163s.y = false;
        abstractComponentCallbacksC0163s.u = false;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = abstractComponentCallbacksC0163s.f2544q;
        abstractComponentCallbacksC0163s.f2545r = abstractComponentCallbacksC0163s2 != null ? abstractComponentCallbacksC0163s2.f2542o : null;
        abstractComponentCallbacksC0163s.f2544q = null;
        abstractComponentCallbacksC0163s.f2540l = bundle;
        abstractComponentCallbacksC0163s.f2543p = bundle.getBundle("arguments");
    }
}
