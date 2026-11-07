package p022h0;

import B1.s;
import M1.K;
import P1.e;
import P1.k;
import a2.h;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import l2.q;
import p002b.o;
import p002b.t;
import p003b0.AbstractComponentCallbacksC0163s;
import p003b0.C0157l;
import p003b0.I;
import p003b0.P;
import p003b0.T;
import p003b0.U;
import p003b0.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f2866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2867b;

    public final void a() {
        s sVar = this.f2866a;
        if (sVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f2867b) {
            sVar.f(this, null);
        }
        e eVar = (e) sVar.f145l;
        K k3 = (K) sVar.f144k;
        eVar.getClass();
        if (equals(eVar.f2875h) && -1 == eVar.f2874g) {
            o oVarC = eVar.f2873f;
            if (oVarC == null) {
                oVarC = eVar.c(-1);
            }
            eVar.f2873f = null;
            eVar.f2874g = 0;
            eVar.f2875h = null;
            if (oVarC == null) {
                ((t) k3.f1024l).f2342a.run();
            } else {
                I i3 = oVarC.f2332d.f2569d;
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
                        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = ((P) obj2).f2423b;
                        if (abstractComponentCallbacksC0163s != null) {
                            abstractComponentCallbacksC0163s.f2549w = false;
                        }
                    }
                    for (C0157l c0157l : i3.f(new ArrayList(Collections.singletonList(i3.f2376h)), 0, 1)) {
                        ArrayList arrayList3 = c0157l.f2482c;
                        if (I.J(i4)) {
                            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                        }
                        c0157l.e(arrayList3);
                        c0157l.getClass();
                        h.e(arrayList3, "operations");
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            ((U) it3.next()).getClass();
                            k.f0(arrayList4, null);
                        }
                        List listL0 = e.l0(e.n0(arrayList4));
                        int size3 = listL0.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            ((T) listL0.get(i7)).a(c0157l.f2480a);
                            i7++;
                            i4 = i4;
                        }
                        int i8 = i4;
                        int size4 = arrayList3.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            c0157l.a((U) arrayList3.get(i9));
                        }
                        List listL1 = e.l0(arrayList3);
                        if (listL1.size() > 0) {
                            ((U) listL1.get(0)).getClass();
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
            q qVar = eVar.f2868a;
            qVar.getClass();
            qVar.c(null, f.f2881m);
        }
        this.f2867b = false;
    }

    public void b(boolean z3) {
    }
}
