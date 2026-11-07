package b0;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.EnumC0140l;
import androidx.lifecycle.EnumC0141m;
import b1.C0192Q;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import f0.C0244a;
import f0.C0245b;
import it.returntrue.novelist.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m0.C0428b;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final A.c f2417a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.s f2418b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0171s f2419c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2420d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f2421e = -1;

    public O(A.c cVar, B1.s sVar, AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        this.f2417a = cVar;
        this.f2418b = sVar;
        this.f2419c = abstractComponentCallbacksC0171s;
    }

    public final void a() {
        boolean J2 = I.J(3);
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (J2) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0171s);
        }
        Bundle bundle = abstractComponentCallbacksC0171s.f2540l;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0171s.f2518E.P();
        abstractComponentCallbacksC0171s.f2539k = 3;
        abstractComponentCallbacksC0171s.f2527N = false;
        abstractComponentCallbacksC0171s.o();
        if (!abstractComponentCallbacksC0171s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0171s + " did not call through to super.onActivityCreated()");
        }
        if (I.J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0171s);
        }
        abstractComponentCallbacksC0171s.f2540l = null;
        I i3 = abstractComponentCallbacksC0171s.f2518E;
        i3.f2360G = false;
        i3.f2361H = false;
        i3.f2367N.f2405g = false;
        i3.u(4);
        this.f2417a.l(abstractComponentCallbacksC0171s, false);
    }

    public final void b() {
        boolean J2 = I.J(3);
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (J2) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0171s);
        }
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = abstractComponentCallbacksC0171s.f2544q;
        O o2 = null;
        B1.s sVar = this.f2418b;
        if (abstractComponentCallbacksC0171s2 != null) {
            O o3 = (O) ((HashMap) sVar.f145l).get(abstractComponentCallbacksC0171s2.f2542o);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0171s + " declared target fragment " + abstractComponentCallbacksC0171s.f2544q + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0171s.f2545r = abstractComponentCallbacksC0171s.f2544q.f2542o;
            abstractComponentCallbacksC0171s.f2544q = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0171s.f2545r;
            if (str != null && (o2 = (O) ((HashMap) sVar.f145l).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0171s);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(B1.e.m(sb, abstractComponentCallbacksC0171s.f2545r, " that does not belong to this FragmentManager!"));
            }
        }
        if (o2 != null) {
            o2.j();
        }
        I i3 = abstractComponentCallbacksC0171s.f2516C;
        abstractComponentCallbacksC0171s.f2517D = i3.f2388v;
        abstractComponentCallbacksC0171s.f2519F = i3.x;
        A.c cVar = this.f2417a;
        cVar.s(abstractComponentCallbacksC0171s, false);
        ArrayList arrayList = abstractComponentCallbacksC0171s.f2537Z;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((C0170q) obj).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0171s.f2518E.b(abstractComponentCallbacksC0171s.f2517D, abstractComponentCallbacksC0171s.d(), abstractComponentCallbacksC0171s);
        abstractComponentCallbacksC0171s.f2539k = 0;
        abstractComponentCallbacksC0171s.f2527N = false;
        abstractComponentCallbacksC0171s.q(abstractComponentCallbacksC0171s.f2517D.n);
        if (!abstractComponentCallbacksC0171s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0171s + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0171s.f2516C.f2382o.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).d();
        }
        I i5 = abstractComponentCallbacksC0171s.f2518E;
        i5.f2360G = false;
        i5.f2361H = false;
        i5.f2367N.f2405g = false;
        i5.u(0);
        cVar.m(abstractComponentCallbacksC0171s, false);
    }

    public final int c() {
        C0165l c0165l;
        Object obj;
        Object obj2;
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (abstractComponentCallbacksC0171s.f2516C == null) {
            return abstractComponentCallbacksC0171s.f2539k;
        }
        int i3 = this.f2421e;
        int ordinal = abstractComponentCallbacksC0171s.f2534V.ordinal();
        if (ordinal == 1) {
            i3 = Math.min(i3, 0);
        } else if (ordinal == 2) {
            i3 = Math.min(i3, 1);
        } else if (ordinal == 3) {
            i3 = Math.min(i3, 5);
        } else if (ordinal != 4) {
            i3 = Math.min(i3, -1);
        }
        if (abstractComponentCallbacksC0171s.x) {
            i3 = abstractComponentCallbacksC0171s.y ? Math.max(this.f2421e, 2) : this.f2421e < 4 ? Math.min(i3, abstractComponentCallbacksC0171s.f2539k) : Math.min(i3, 1);
        }
        if (!abstractComponentCallbacksC0171s.u) {
            i3 = Math.min(i3, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0171s.f2528O;
        if (viewGroup != null) {
            a2.h.d(abstractComponentCallbacksC0171s.j().H(), "fragmentManager.specialEffectsControllerFactory");
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof C0165l) {
                c0165l = (C0165l) tag;
            } else {
                c0165l = new C0165l(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, c0165l);
            }
            c0165l.getClass();
            ArrayList arrayList = c0165l.f2481b;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                obj = null;
                if (i4 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i4);
                i4++;
                ((U) obj2).getClass();
                if (a2.h.a(null, abstractComponentCallbacksC0171s)) {
                    break;
                }
            }
            ArrayList arrayList2 = c0165l.f2482c;
            int size2 = arrayList2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    break;
                }
                Object obj3 = arrayList2.get(i5);
                i5++;
                ((U) obj3).getClass();
                if (a2.h.a(null, abstractComponentCallbacksC0171s)) {
                    obj = obj3;
                    break;
                }
            }
        }
        if (abstractComponentCallbacksC0171s.f2548v) {
            i3 = abstractComponentCallbacksC0171s.n() ? Math.min(i3, 1) : Math.min(i3, -1);
        }
        if (abstractComponentCallbacksC0171s.f2529P && abstractComponentCallbacksC0171s.f2539k < 5) {
            i3 = Math.min(i3, 4);
        }
        if (abstractComponentCallbacksC0171s.f2549w && abstractComponentCallbacksC0171s.f2528O != null) {
            i3 = Math.max(i3, 3);
        }
        if (I.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i3 + " for " + abstractComponentCallbacksC0171s);
        }
        return i3;
    }

    public final void d() {
        Bundle bundle;
        boolean J2 = I.J(3);
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (J2) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0171s);
        }
        Bundle bundle2 = abstractComponentCallbacksC0171s.f2540l;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0171s.f2532T) {
            abstractComponentCallbacksC0171s.f2539k = 1;
            Bundle bundle4 = abstractComponentCallbacksC0171s.f2540l;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0171s.f2518E.U(bundle);
            I i3 = abstractComponentCallbacksC0171s.f2518E;
            i3.f2360G = false;
            i3.f2361H = false;
            i3.f2367N.f2405g = false;
            i3.u(1);
            return;
        }
        A.c cVar = this.f2417a;
        cVar.t(abstractComponentCallbacksC0171s, false);
        abstractComponentCallbacksC0171s.f2518E.P();
        abstractComponentCallbacksC0171s.f2539k = 1;
        abstractComponentCallbacksC0171s.f2527N = false;
        abstractComponentCallbacksC0171s.W.a(new C0428b(abstractComponentCallbacksC0171s, 4));
        abstractComponentCallbacksC0171s.r(bundle3);
        abstractComponentCallbacksC0171s.f2532T = true;
        if (abstractComponentCallbacksC0171s.f2527N) {
            abstractComponentCallbacksC0171s.W.e(EnumC0140l.ON_CREATE);
            cVar.n(abstractComponentCallbacksC0171s, false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0171s + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String str;
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (abstractComponentCallbacksC0171s.x) {
            return;
        }
        if (I.J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0171s);
        }
        Bundle bundle = abstractComponentCallbacksC0171s.f2540l;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater u = abstractComponentCallbacksC0171s.u(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0171s.f2528O;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i3 = abstractComponentCallbacksC0171s.f2521H;
            if (i3 != 0) {
                if (i3 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0171s + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0171s.f2516C.f2389w.L(i3);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0171s.f2550z) {
                        try {
                            str = abstractComponentCallbacksC0171s.z().getResources().getResourceName(abstractComponentCallbacksC0171s.f2521H);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0171s.f2521H) + " (" + str + ") for fragment " + abstractComponentCallbacksC0171s);
                    }
                } else if (!(viewGroup instanceof C0175w)) {
                    c0.c cVar = c0.d.f2657a;
                    c0.d.b(new c0.a(abstractComponentCallbacksC0171s, "Attempting to add fragment " + abstractComponentCallbacksC0171s + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    c0.d.a(abstractComponentCallbacksC0171s).getClass();
                }
            }
        }
        abstractComponentCallbacksC0171s.f2528O = viewGroup;
        abstractComponentCallbacksC0171s.y(u, viewGroup, bundle2);
        abstractComponentCallbacksC0171s.f2539k = 2;
    }

    public final void f() {
        AbstractComponentCallbacksC0171s h3;
        boolean J2 = I.J(3);
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (J2) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0171s);
        }
        boolean z3 = true;
        int i3 = 0;
        boolean z4 = abstractComponentCallbacksC0171s.f2548v && !abstractComponentCallbacksC0171s.n();
        B1.s sVar = this.f2418b;
        if (z4) {
            sVar.A(abstractComponentCallbacksC0171s.f2542o, null);
        }
        if (!z4) {
            L l3 = (L) sVar.n;
            if (!((l3.f2400b.containsKey(abstractComponentCallbacksC0171s.f2542o) && l3.f2403e) ? l3.f2404f : true)) {
                String str = abstractComponentCallbacksC0171s.f2545r;
                if (str != null && (h3 = sVar.h(str)) != null && h3.f2525L) {
                    abstractComponentCallbacksC0171s.f2544q = h3;
                }
                abstractComponentCallbacksC0171s.f2539k = 0;
                return;
            }
        }
        C0173u c0173u = abstractComponentCallbacksC0171s.f2517D;
        if (c0173u != null) {
            z3 = ((L) sVar.n).f2404f;
        } else {
            SignInHubActivity signInHubActivity = c0173u.n;
            if (signInHubActivity != null) {
                z3 = true ^ signInHubActivity.isChangingConfigurations();
            }
        }
        if (z4 || z3) {
            ((L) sVar.n).c(abstractComponentCallbacksC0171s, false);
        }
        abstractComponentCallbacksC0171s.f2518E.l();
        abstractComponentCallbacksC0171s.W.e(EnumC0140l.ON_DESTROY);
        abstractComponentCallbacksC0171s.f2539k = 0;
        abstractComponentCallbacksC0171s.f2527N = false;
        abstractComponentCallbacksC0171s.f2532T = false;
        abstractComponentCallbacksC0171s.f2527N = true;
        if (!abstractComponentCallbacksC0171s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0171s + " did not call through to super.onDestroy()");
        }
        this.f2417a.p(abstractComponentCallbacksC0171s, false);
        ArrayList l4 = sVar.l();
        int size = l4.size();
        while (i3 < size) {
            Object obj = l4.get(i3);
            i3++;
            O o2 = (O) obj;
            if (o2 != null) {
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = o2.f2419c;
                if (abstractComponentCallbacksC0171s.f2542o.equals(abstractComponentCallbacksC0171s2.f2545r)) {
                    abstractComponentCallbacksC0171s2.f2544q = abstractComponentCallbacksC0171s;
                    abstractComponentCallbacksC0171s2.f2545r = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC0171s.f2545r;
        if (str2 != null) {
            abstractComponentCallbacksC0171s.f2544q = sVar.h(str2);
        }
        sVar.v(this);
    }

    public final void g() {
        boolean J2 = I.J(3);
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (J2) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0171s);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0171s.f2528O;
        abstractComponentCallbacksC0171s.f2518E.u(1);
        abstractComponentCallbacksC0171s.f2539k = 1;
        abstractComponentCallbacksC0171s.f2527N = false;
        abstractComponentCallbacksC0171s.s();
        if (!abstractComponentCallbacksC0171s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0171s + " did not call through to super.onDestroyView()");
        }
        o.k kVar = ((C0245b) C0192Q.v(abstractComponentCallbacksC0171s).f2600m).f2813b;
        int i3 = kVar.f4212m;
        for (int i4 = 0; i4 < i3; i4++) {
            ((C0244a) kVar.f4211l[i4]).i();
        }
        abstractComponentCallbacksC0171s.f2514A = false;
        this.f2417a.y(abstractComponentCallbacksC0171s, false);
        abstractComponentCallbacksC0171s.f2528O = null;
        abstractComponentCallbacksC0171s.f2535X.h(null);
        abstractComponentCallbacksC0171s.y = false;
    }

    public final void h() {
        boolean J2 = I.J(3);
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (J2) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0171s);
        }
        abstractComponentCallbacksC0171s.f2539k = -1;
        abstractComponentCallbacksC0171s.f2527N = false;
        abstractComponentCallbacksC0171s.t();
        if (!abstractComponentCallbacksC0171s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0171s + " did not call through to super.onDetach()");
        }
        I i3 = abstractComponentCallbacksC0171s.f2518E;
        if (!i3.f2362I) {
            i3.l();
            abstractComponentCallbacksC0171s.f2518E = new I();
        }
        this.f2417a.q(abstractComponentCallbacksC0171s, false);
        abstractComponentCallbacksC0171s.f2539k = -1;
        abstractComponentCallbacksC0171s.f2517D = null;
        abstractComponentCallbacksC0171s.f2519F = null;
        abstractComponentCallbacksC0171s.f2516C = null;
        if (!abstractComponentCallbacksC0171s.f2548v || abstractComponentCallbacksC0171s.n()) {
            L l3 = (L) this.f2418b.n;
            if (!((l3.f2400b.containsKey(abstractComponentCallbacksC0171s.f2542o) && l3.f2403e) ? l3.f2404f : true)) {
                return;
            }
        }
        if (I.J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0171s);
        }
        abstractComponentCallbacksC0171s.l();
    }

    public final void i() {
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (abstractComponentCallbacksC0171s.x && abstractComponentCallbacksC0171s.y && !abstractComponentCallbacksC0171s.f2514A) {
            if (I.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0171s);
            }
            Bundle bundle = abstractComponentCallbacksC0171s.f2540l;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0171s.y(abstractComponentCallbacksC0171s.u(bundle2), null, bundle2);
        }
    }

    public final void j() {
        B1.s sVar = this.f2418b;
        boolean z3 = this.f2420d;
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (z3) {
            if (I.J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0171s);
                return;
            }
            return;
        }
        try {
            this.f2420d = true;
            boolean z4 = false;
            while (true) {
                int c3 = c();
                int i3 = abstractComponentCallbacksC0171s.f2539k;
                if (c3 == i3) {
                    if (!z4 && i3 == -1 && abstractComponentCallbacksC0171s.f2548v && !abstractComponentCallbacksC0171s.n()) {
                        if (I.J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0171s);
                        }
                        ((L) sVar.n).c(abstractComponentCallbacksC0171s, true);
                        sVar.v(this);
                        if (I.J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0171s);
                        }
                        abstractComponentCallbacksC0171s.l();
                    }
                    if (abstractComponentCallbacksC0171s.S) {
                        I i4 = abstractComponentCallbacksC0171s.f2516C;
                        if (i4 != null && abstractComponentCallbacksC0171s.u && I.K(abstractComponentCallbacksC0171s)) {
                            i4.f2359F = true;
                        }
                        abstractComponentCallbacksC0171s.S = false;
                        abstractComponentCallbacksC0171s.f2518E.o();
                    }
                    this.f2420d = false;
                    return;
                }
                if (c3 <= i3) {
                    switch (i3 - 1) {
                        case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            abstractComponentCallbacksC0171s.f2539k = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0171s.y = false;
                            abstractComponentCallbacksC0171s.f2539k = 2;
                            break;
                        case 3:
                            if (I.J(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0171s);
                            }
                            abstractComponentCallbacksC0171s.f2539k = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            abstractComponentCallbacksC0171s.f2539k = 5;
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
                            abstractComponentCallbacksC0171s.f2539k = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            abstractComponentCallbacksC0171s.f2539k = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z4 = true;
            }
        } catch (Throwable th) {
            this.f2420d = false;
            throw th;
        }
    }

    public final void k() {
        boolean J2 = I.J(3);
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (J2) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0171s);
        }
        abstractComponentCallbacksC0171s.f2518E.u(5);
        abstractComponentCallbacksC0171s.W.e(EnumC0140l.ON_PAUSE);
        abstractComponentCallbacksC0171s.f2539k = 6;
        abstractComponentCallbacksC0171s.f2527N = true;
        this.f2417a.r(abstractComponentCallbacksC0171s, false);
    }

    public final void l(ClassLoader classLoader) {
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        Bundle bundle = abstractComponentCallbacksC0171s.f2540l;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0171s.f2540l.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0171s.f2540l.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC0171s.f2541m = abstractComponentCallbacksC0171s.f2540l.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC0171s.n = abstractComponentCallbacksC0171s.f2540l.getBundle("viewRegistryState");
            N n = (N) abstractComponentCallbacksC0171s.f2540l.getParcelable("state");
            if (n != null) {
                abstractComponentCallbacksC0171s.f2545r = n.f2415v;
                abstractComponentCallbacksC0171s.f2546s = n.f2416w;
                abstractComponentCallbacksC0171s.f2530Q = n.x;
            }
            if (abstractComponentCallbacksC0171s.f2530Q) {
                return;
            }
            abstractComponentCallbacksC0171s.f2529P = true;
        } catch (BadParcelableException e3) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC0171s, e3);
        }
    }

    public final void m() {
        boolean J2 = I.J(3);
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (J2) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0171s);
        }
        r rVar = abstractComponentCallbacksC0171s.f2531R;
        View view = rVar == null ? null : rVar.f2512j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        abstractComponentCallbacksC0171s.e().f2512j = null;
        abstractComponentCallbacksC0171s.f2518E.P();
        abstractComponentCallbacksC0171s.f2518E.A(true);
        abstractComponentCallbacksC0171s.f2539k = 7;
        abstractComponentCallbacksC0171s.f2527N = false;
        abstractComponentCallbacksC0171s.f2527N = true;
        if (!abstractComponentCallbacksC0171s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0171s + " did not call through to super.onResume()");
        }
        abstractComponentCallbacksC0171s.W.e(EnumC0140l.ON_RESUME);
        I i3 = abstractComponentCallbacksC0171s.f2518E;
        i3.f2360G = false;
        i3.f2361H = false;
        i3.f2367N.f2405g = false;
        i3.u(7);
        this.f2417a.u(abstractComponentCallbacksC0171s, false);
        this.f2418b.A(abstractComponentCallbacksC0171s.f2542o, null);
        abstractComponentCallbacksC0171s.f2540l = null;
        abstractComponentCallbacksC0171s.f2541m = null;
        abstractComponentCallbacksC0171s.n = null;
    }

    public final void n() {
        boolean J2 = I.J(3);
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (J2) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0171s);
        }
        abstractComponentCallbacksC0171s.f2518E.P();
        abstractComponentCallbacksC0171s.f2518E.A(true);
        abstractComponentCallbacksC0171s.f2539k = 5;
        abstractComponentCallbacksC0171s.f2527N = false;
        abstractComponentCallbacksC0171s.w();
        if (!abstractComponentCallbacksC0171s.f2527N) {
            throw new W("Fragment " + abstractComponentCallbacksC0171s + " did not call through to super.onStart()");
        }
        abstractComponentCallbacksC0171s.W.e(EnumC0140l.ON_START);
        I i3 = abstractComponentCallbacksC0171s.f2518E;
        i3.f2360G = false;
        i3.f2361H = false;
        i3.f2367N.f2405g = false;
        i3.u(5);
        this.f2417a.w(abstractComponentCallbacksC0171s, false);
    }

    public final void o() {
        boolean J2 = I.J(3);
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2419c;
        if (J2) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0171s);
        }
        I i3 = abstractComponentCallbacksC0171s.f2518E;
        i3.f2361H = true;
        i3.f2367N.f2405g = true;
        i3.u(4);
        abstractComponentCallbacksC0171s.W.e(EnumC0140l.ON_STOP);
        abstractComponentCallbacksC0171s.f2539k = 4;
        abstractComponentCallbacksC0171s.f2527N = false;
        abstractComponentCallbacksC0171s.x();
        if (abstractComponentCallbacksC0171s.f2527N) {
            this.f2417a.x(abstractComponentCallbacksC0171s, false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0171s + " did not call through to super.onStop()");
    }

    public O(A.c cVar, B1.s sVar, ClassLoader classLoader, C0153B c0153b, Bundle bundle) {
        this.f2417a = cVar;
        this.f2418b = sVar;
        N n = (N) bundle.getParcelable("state");
        AbstractComponentCallbacksC0171s a3 = c0153b.a(n.f2406k);
        a3.f2542o = n.f2407l;
        a3.x = n.f2408m;
        a3.f2550z = true;
        a3.f2520G = n.n;
        a3.f2521H = n.f2409o;
        a3.f2522I = n.f2410p;
        a3.f2525L = n.f2411q;
        a3.f2548v = n.f2412r;
        a3.f2524K = n.f2413s;
        a3.f2523J = n.f2414t;
        a3.f2534V = EnumC0141m.values()[n.u];
        a3.f2545r = n.f2415v;
        a3.f2546s = n.f2416w;
        a3.f2530Q = n.x;
        this.f2419c = a3;
        a3.f2540l = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        I i3 = a3.f2516C;
        if (i3 != null && (i3.f2360G || i3.f2361H)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        a3.f2543p = bundle2;
        if (I.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a3);
        }
    }

    public O(A.c cVar, B1.s sVar, AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, Bundle bundle) {
        this.f2417a = cVar;
        this.f2418b = sVar;
        this.f2419c = abstractComponentCallbacksC0171s;
        abstractComponentCallbacksC0171s.f2541m = null;
        abstractComponentCallbacksC0171s.n = null;
        abstractComponentCallbacksC0171s.f2515B = 0;
        abstractComponentCallbacksC0171s.y = false;
        abstractComponentCallbacksC0171s.u = false;
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = abstractComponentCallbacksC0171s.f2544q;
        abstractComponentCallbacksC0171s.f2545r = abstractComponentCallbacksC0171s2 != null ? abstractComponentCallbacksC0171s2.f2542o : null;
        abstractComponentCallbacksC0171s.f2544q = null;
        abstractComponentCallbacksC0171s.f2540l = bundle;
        abstractComponentCallbacksC0171s.f2543p = bundle.getBundle("arguments");
    }
}
