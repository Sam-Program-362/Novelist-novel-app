package h0;

import B1.s;
import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import b.C0148a;
import b.o;
import b0.C0165l;
import b0.I;
import b0.T;
import b0.U;
import b0.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l2.q;
import r1.AbstractActivityC0455b;
import r1.C0458e;
import s1.C0467c;

/* renamed from: h0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268k implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2890b;

    public /* synthetic */ C0268k(Object obj, int i3) {
        this.f2889a = i3;
        this.f2890b = obj;
    }

    public final void onBackCancelled() {
        switch (this.f2889a) {
            case 0:
                C0266i c0266i = (C0266i) this.f2890b;
                s sVar = c0266i.f2866a;
                if (sVar == null) {
                    throw new IllegalStateException("This input is not added to any dispatcher.");
                }
                if (!c0266i.f2867b) {
                    sVar.f(c0266i, null);
                }
                C0262e c0262e = (C0262e) sVar.f145l;
                c0262e.getClass();
                if (c0266i.equals(c0262e.f2875h) && -1 == c0262e.f2874g) {
                    o oVar = c0262e.f2873f;
                    if (oVar == null) {
                        oVar = c0262e.c(-1);
                    }
                    c0262e.f2873f = null;
                    c0262e.f2874g = 0;
                    c0262e.f2875h = null;
                    if (oVar != null) {
                        oVar.a();
                    }
                    q qVar = c0262e.f2868a;
                    qVar.getClass();
                    qVar.c(null, C0263f.f2881m);
                }
                c0266i.f2867b = false;
                return;
            default:
                AbstractActivityC0455b abstractActivityC0455b = (AbstractActivityC0455b) this.f2890b;
                if (abstractActivityC0455b.m("cancelBackGesture")) {
                    C0458e c0458e = abstractActivityC0455b.f4349l;
                    c0458e.c();
                    C0467c c0467c = c0458e.f4354b;
                    if (c0467c != null) {
                        c0467c.f4489j.f82a.s("cancelBackGesture", null, null);
                        return;
                    } else {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
                        return;
                    }
                }
                return;
        }
    }

    public final void onBackInvoked() {
        switch (this.f2889a) {
            case 0:
                ((C0266i) this.f2890b).a();
                break;
            default:
                AbstractActivityC0455b abstractActivityC0455b = (AbstractActivityC0455b) this.f2890b;
                if (abstractActivityC0455b.m("commitBackGesture")) {
                    C0458e c0458e = abstractActivityC0455b.f4349l;
                    c0458e.c();
                    C0467c c0467c = c0458e.f4354b;
                    if (c0467c == null) {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
                        break;
                    } else {
                        c0467c.f4489j.f82a.s("commitBackGesture", null, null);
                        break;
                    }
                }
                break;
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        switch (this.f2889a) {
            case 0:
                a2.h.e(backEvent, "backEvent");
                C0266i c0266i = (C0266i) this.f2890b;
                C0259b a3 = E2.a.a(backEvent);
                s sVar = c0266i.f2866a;
                if (sVar == null) {
                    throw new IllegalStateException("This input is not added to any dispatcher.");
                }
                if (c0266i.f2867b) {
                    C0262e c0262e = (C0262e) sVar.f145l;
                    c0262e.getClass();
                    if (c0266i.equals(c0262e.f2875h) && -1 == c0262e.f2874g) {
                        o oVar = c0262e.f2873f;
                        if (oVar == null) {
                            oVar = c0262e.c(-1);
                        }
                        if (oVar != null) {
                            z zVar = oVar.f2332d;
                            C0148a c0148a = new C0148a(a3);
                            I i3 = zVar.f2569d;
                            if (I.J(2)) {
                                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + i3);
                            }
                            if (i3.f2376h != null) {
                                Iterator it2 = i3.f(new ArrayList(Collections.singletonList(i3.f2376h)), 0, 1).iterator();
                                while (it2.hasNext()) {
                                    C0165l c0165l = (C0165l) it2.next();
                                    c0165l.getClass();
                                    if (I.J(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c0148a.f2281c);
                                    }
                                    ArrayList arrayList = c0165l.f2482c;
                                    ArrayList arrayList2 = new ArrayList();
                                    int size = arrayList.size();
                                    int i4 = 0;
                                    while (i4 < size) {
                                        Object obj = arrayList.get(i4);
                                        i4++;
                                        ((U) obj).getClass();
                                        P1.k.f0(arrayList2, null);
                                    }
                                    List l02 = P1.e.l0(P1.e.n0(arrayList2));
                                    int size2 = l02.size();
                                    for (int i5 = 0; i5 < size2; i5++) {
                                        ((T) l02.get(i5)).b(c0148a, c0165l.f2480a);
                                    }
                                }
                                Iterator it3 = i3.f2381m.iterator();
                                if (it3.hasNext()) {
                                    it3.next().getClass();
                                    throw new ClassCastException();
                                }
                            }
                        }
                        q qVar = c0262e.f2868a;
                        C0264g c0264g = new C0264g(a3);
                        qVar.getClass();
                        qVar.c(null, c0264g);
                        return;
                    }
                    return;
                }
                return;
            default:
                AbstractActivityC0455b abstractActivityC0455b = (AbstractActivityC0455b) this.f2890b;
                if (abstractActivityC0455b.m("updateBackGestureProgress")) {
                    C0458e c0458e = abstractActivityC0455b.f4349l;
                    c0458e.c();
                    C0467c c0467c = c0458e.f4354b;
                    if (c0467c != null) {
                        c0467c.f4489j.f82a.s("updateBackGestureProgress", B1.c.a(backEvent), null);
                        return;
                    } else {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                        return;
                    }
                }
                return;
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        switch (this.f2889a) {
            case 0:
                a2.h.e(backEvent, "backEvent");
                C0266i c0266i = (C0266i) this.f2890b;
                C0259b a3 = E2.a.a(backEvent);
                s sVar = c0266i.f2866a;
                if (sVar == null) {
                    throw new IllegalStateException("This input is not added to any dispatcher.");
                }
                if (c0266i.f2867b) {
                    return;
                }
                sVar.f(c0266i, a3);
                c0266i.f2867b = true;
                return;
            default:
                AbstractActivityC0455b abstractActivityC0455b = (AbstractActivityC0455b) this.f2890b;
                if (abstractActivityC0455b.m("startBackGesture")) {
                    C0458e c0458e = abstractActivityC0455b.f4349l;
                    c0458e.c();
                    C0467c c0467c = c0458e.f4354b;
                    if (c0467c != null) {
                        c0467c.f4489j.f82a.s("startBackGesture", B1.c.a(backEvent), null);
                        return;
                    } else {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                        return;
                    }
                }
                return;
        }
    }
}
