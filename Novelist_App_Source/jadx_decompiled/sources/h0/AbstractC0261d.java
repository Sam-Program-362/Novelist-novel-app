package h0;

import B1.s;
import M1.K;
import android.util.Log;
import b.o;
import b.t;
import b0.AbstractComponentCallbacksC0171s;
import b0.C0165l;
import b0.I;
import b0.P;
import b0.T;
import b0.U;
import b0.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import l2.q;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0261d {

    /* renamed from: a, reason: collision with root package name */
    public s f2866a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2867b;

    public final void a() {
        s sVar = this.f2866a;
        if (sVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f2867b) {
            sVar.f(this, null);
        }
        C0262e c0262e = (C0262e) sVar.f145l;
        K k3 = (K) sVar.f144k;
        c0262e.getClass();
        if (equals(c0262e.f2875h) && -1 == c0262e.f2874g) {
            o oVar = c0262e.f2873f;
            if (oVar == null) {
                oVar = c0262e.c(-1);
            }
            c0262e.f2873f = null;
            c0262e.f2874g = 0;
            c0262e.f2875h = null;
            if (oVar == null) {
                ((t) k3.f1024l).f2342a.run();
            } else {
                I i3 = oVar.f2332d.f2569d;
                int i4 = 3;
                if (I.J(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + i3);
                }
                z zVar = i3.f2377i;
                ArrayList arrayList = i3.f2381m;
                i3.A(true);
                if (i3.f2376h != null) {
                    if (!arrayList.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(I.E(i3.f2376h));
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList.get(i5);
                            i5++;
                            if (obj != null) {
                                throw new ClassCastException();
                            }
                            Iterator it2 = linkedHashSet.iterator();
                            if (it2.hasNext()) {
                                throw null;
                            }
                        }
                    }
                    ArrayList arrayList2 = i3.f2376h.f2437a;
                    int size2 = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayList2.get(i6);
                        i6++;
                        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = ((P) obj2).f2423b;
                        if (abstractComponentCallbacksC0171s != null) {
                            abstractComponentCallbacksC0171s.f2549w = false;
                        }
                    }
                    Iterator it3 = i3.f(new ArrayList(Collections.singletonList(i3.f2376h)), 0, 1).iterator();
                    while (it3.hasNext()) {
                        C0165l c0165l = (C0165l) it3.next();
                        ArrayList arrayList3 = c0165l.f2482c;
                        if (I.J(i4)) {
                            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                        }
                        c0165l.e(arrayList3);
                        c0165l.getClass();
                        a2.h.e(arrayList3, "operations");
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            ((U) it4.next()).getClass();
                            P1.k.f0(arrayList4, null);
                        }
                        List l02 = P1.e.l0(P1.e.n0(arrayList4));
                        int size3 = l02.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            ((T) l02.get(i7)).a(c0165l.f2480a);
                            i7++;
                            i4 = i4;
                        }
                        int i8 = i4;
                        int size4 = arrayList3.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            c0165l.a((U) arrayList3.get(i9));
                        }
                        List l03 = P1.e.l0(arrayList3);
                        if (l03.size() > 0) {
                            ((U) l03.get(0)).getClass();
                            throw null;
                        }
                        i4 = i8;
                    }
                    i3.f2376h = null;
                    i3.e0();
                    if (I.J(i4)) {
                        Log.d("FragmentManager", "Op is being set to null");
                        Log.d("FragmentManager", "OnBackPressedCallback enabled=" + zVar.f2567b + " for  FragmentManager " + i3);
                    }
                } else if (zVar.f2567b) {
                    if (I.J(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    i3.Q();
                } else {
                    if (I.J(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    i3.f2375g.a().a();
                }
            }
            q qVar = c0262e.f2868a;
            qVar.getClass();
            qVar.c(null, C0263f.f2881m);
        }
        this.f2867b = false;
    }

    public void b(boolean z3) {
    }
}
