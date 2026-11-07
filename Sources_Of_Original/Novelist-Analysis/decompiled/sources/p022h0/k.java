package p022h0;

import B1.s;
import E2.a;
import a2.h;
import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l2.q;
import p002b.o;
import p003b0.C0157l;
import p003b0.I;
import p003b0.T;
import p003b0.U;
import p003b0.z;
import p052r1.AbstractActivityC0262b;
import p052r1.e;
import p054s1.c;

/* JADX INFO: loaded from: classes.dex */
public final class k implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2890b;

    public /* synthetic */ k(Object obj, int i3) {
        this.f2889a = i3;
        this.f2890b = obj;
    }

    public final void onBackCancelled() {
        switch (this.f2889a) {
            case 0:
                i iVar = (i) this.f2890b;
                s sVar = iVar.f2866a;
                if (sVar == null) {
                    throw new IllegalStateException("This input is not added to any dispatcher.");
                }
                if (!iVar.f2867b) {
                    sVar.f(iVar, null);
                }
                e eVar = (e) sVar.f145l;
                eVar.getClass();
                if (iVar.equals(eVar.f2875h) && -1 == eVar.f2874g) {
                    o oVarC = eVar.f2873f;
                    if (oVarC == null) {
                        oVarC = eVar.c(-1);
                    }
                    eVar.f2873f = null;
                    eVar.f2874g = 0;
                    eVar.f2875h = null;
                    if (oVarC != null) {
                        oVarC.a();
                    }
                    q qVar = eVar.f2868a;
                    qVar.getClass();
                    qVar.c(null, f.f2881m);
                }
                iVar.f2867b = false;
                return;
            default:
                AbstractActivityC0262b abstractActivityC0262b = (AbstractActivityC0262b) this.f2890b;
                if (abstractActivityC0262b.m("cancelBackGesture")) {
                    e eVar2 = abstractActivityC0262b.f4349l;
                    eVar2.c();
                    c cVar = eVar2.f4354b;
                    if (cVar != null) {
                        cVar.f4489j.f82a.s("cancelBackGesture", null, null);
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
                ((i) this.f2890b).a();
                break;
            default:
                AbstractActivityC0262b abstractActivityC0262b = (AbstractActivityC0262b) this.f2890b;
                if (abstractActivityC0262b.m("commitBackGesture")) {
                    e eVar = abstractActivityC0262b.f4349l;
                    eVar.c();
                    c cVar = eVar.f4354b;
                    if (cVar == null) {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
                    } else {
                        cVar.f4489j.f82a.s("commitBackGesture", null, null);
                    }
                }
                break;
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        switch (this.f2889a) {
            case 0:
                h.e(backEvent, "backEvent");
                i iVar = (i) this.f2890b;
                b bVarA = a.a(backEvent);
                s sVar = iVar.f2866a;
                if (sVar == null) {
                    throw new IllegalStateException("This input is not added to any dispatcher.");
                }
                if (iVar.f2867b) {
                    e eVar = (e) sVar.f145l;
                    eVar.getClass();
                    if (iVar.equals(eVar.f2875h) && -1 == eVar.f2874g) {
                        o oVarC = eVar.f2873f;
                        if (oVarC == null) {
                            oVarC = eVar.c(-1);
                        }
                        if (oVarC != null) {
                            z zVar = oVarC.f2332d;
                            p002b.a aVar = new p002b.a(bVarA);
                            I i3 = zVar.f2569d;
                            if (I.J(2)) {
                                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + i3);
                            }
                            if (i3.f2376h != null) {
                                for (C0157l c0157l : i3.f(new ArrayList(Collections.singletonList(i3.f2376h)), 0, 1)) {
                                    c0157l.getClass();
                                    if (I.J(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + aVar.f2281c);
                                    }
                                    ArrayList arrayList = c0157l.f2482c;
                                    ArrayList arrayList2 = new ArrayList();
                                    int size = arrayList.size();
                                    int i4 = 0;
                                    while (i4 < size) {
                                        Object obj = arrayList.get(i4);
                                        i4++;
                                        ((U) obj).getClass();
                                        P1.k.f0(arrayList2, null);
                                    }
                                    List listL0 = P1.e.l0(P1.e.n0(arrayList2));
                                    int size2 = listL0.size();
                                    for (int i5 = 0; i5 < size2; i5++) {
                                        ((T) listL0.get(i5)).b(aVar, c0157l.f2480a);
                                    }
                                }
                                Iterator it2 = i3.f2381m.iterator();
                                if (it2.hasNext()) {
                                    it2.next().getClass();
                                    throw new ClassCastException();
                                }
                            }
                        }
                        q qVar = eVar.f2868a;
                        g gVar = new g(bVarA);
                        qVar.getClass();
                        qVar.c(null, gVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                AbstractActivityC0262b abstractActivityC0262b = (AbstractActivityC0262b) this.f2890b;
                if (abstractActivityC0262b.m("updateBackGestureProgress")) {
                    e eVar2 = abstractActivityC0262b.f4349l;
                    eVar2.c();
                    c cVar = eVar2.f4354b;
                    if (cVar != null) {
                        cVar.f4489j.f82a.s("updateBackGestureProgress", B1.c.a(backEvent), null);
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
                h.e(backEvent, "backEvent");
                i iVar = (i) this.f2890b;
                b bVarA = a.a(backEvent);
                s sVar = iVar.f2866a;
                if (sVar == null) {
                    throw new IllegalStateException("This input is not added to any dispatcher.");
                }
                if (iVar.f2867b) {
                    return;
                }
                sVar.f(iVar, bVarA);
                iVar.f2867b = true;
                return;
            default:
                AbstractActivityC0262b abstractActivityC0262b = (AbstractActivityC0262b) this.f2890b;
                if (abstractActivityC0262b.m("startBackGesture")) {
                    e eVar = abstractActivityC0262b.f4349l;
                    eVar.c();
                    c cVar = eVar.f4354b;
                    if (cVar != null) {
                        cVar.f4489j.f82a.s("startBackGesture", B1.c.a(backEvent), null);
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
