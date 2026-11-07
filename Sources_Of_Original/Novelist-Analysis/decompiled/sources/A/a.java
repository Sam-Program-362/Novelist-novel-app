package A;

import L0.y;
import M0.AbstractBinderC0045a;
import M0.F;
import M0.InterfaceC0050f;
import M0.r;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.z;
import i2.AbstractC0209q;
import i2.AbstractC0212u;
import java.util.Set;
import p031k.C0228f;
import p031k.C0231i;
import p031k.C0240s;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f0k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f1l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2m;

    public /* synthetic */ a(Object obj, Object obj2, int i3) {
        this.f0k = i3;
        this.f1l = obj;
        this.f2m = obj2;
    }

    private final void a() {
        Exception exc;
        synchronized (((p019g1.g) this.f2m).f2839c) {
            p019g1.c cVar = (p019g1.c) ((p019g1.g) this.f2m).f2840d;
            p019g1.i iVar = (p019g1.i) this.f1l;
            synchronized (iVar.f2845b) {
                exc = (Exception) iVar.f2848e;
            }
            r.f(exc);
            cVar.b(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0050f interfaceC0050f;
        InterfaceC0050f f3;
        boolean z3 = true;
        int i3 = 0;
        switch (this.f0k) {
            case 0:
                w.d dVar = (w.d) this.f1l;
                Typeface typeface = (Typeface) this.f2m;
                C0240s c0240s = (C0240s) dVar.f4639a;
                if (c0240s != null) {
                    c0240s.b(typeface);
                    return;
                }
                return;
            case 1:
                ((i) this.f1l).accept(this.f2m);
                return;
            case 2:
                J0.a aVar = (J0.a) this.f1l;
                L0.r rVar = (L0.r) this.f2m;
                K0.c cVar = rVar.f838a;
                L0.p pVar = (L0.p) rVar.f843f.f809j.get(rVar.f839b);
                if (pVar == null) {
                    return;
                }
                if (aVar.f540l != 0) {
                    pVar.o(aVar, null);
                    return;
                }
                rVar.f842e = true;
                if (cVar.l()) {
                    if (!rVar.f842e || (interfaceC0050f = rVar.f840c) == null) {
                        return;
                    }
                    cVar.f(interfaceC0050f, rVar.f841d);
                    return;
                }
                try {
                    cVar.f(null, cVar.b());
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    cVar.d("Failed to get service from broker.");
                    pVar.o(new J0.a(10, null, null), null);
                    return;
                }
            case 3:
                y yVar = (y) this.f2m;
                p015f1.f fVar = (p015f1.f) this.f1l;
                J0.a aVar2 = fVar.f2824l;
                if (aVar2.f540l == 0) {
                    M0.o oVar = fVar.f2825m;
                    r.f(oVar);
                    J0.a aVar3 = oVar.f977m;
                    if (aVar3.f540l != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar3)), new Exception());
                        yVar.f865h.b(aVar3);
                        yVar.f864g.k();
                        return;
                    }
                    L0.r rVar2 = yVar.f865h;
                    IBinder iBinder = oVar.f976l;
                    if (iBinder == null) {
                        f3 = null;
                    } else {
                        int i4 = AbstractBinderC0045a.f925b;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        f3 = iInterfaceQueryLocalInterface instanceof InterfaceC0050f ? (InterfaceC0050f) iInterfaceQueryLocalInterface : new F(iBinder);
                    }
                    Set set = yVar.f862e;
                    rVar2.getClass();
                    if (f3 == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        rVar2.b(new J0.a(4, null, null));
                    } else {
                        rVar2.f840c = f3;
                        rVar2.f841d = set;
                        if (rVar2.f842e) {
                            rVar2.f838a.f(f3, set);
                        }
                    }
                } else {
                    yVar.f865h.b(aVar2);
                }
                yVar.f864g.k();
                return;
            case 4:
                p018g0.a aVar4 = (p018g0.a) this.f2m;
                Object obj = this.f1l;
                if (!aVar4.f2830m.get()) {
                    H0.d dVar2 = aVar4.f2831o;
                    if (dVar2.f433g != aVar4) {
                        if (dVar2.f434h == aVar4) {
                            SystemClock.uptimeMillis();
                            dVar2.f434h = null;
                            dVar2.b();
                        }
                    } else if (!dVar2.f429c) {
                        SystemClock.uptimeMillis();
                        dVar2.f433g = null;
                        p014f0.a aVar5 = dVar2.f427a;
                        if (aVar5 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar5.h(obj);
                            } else {
                                synchronized (aVar5.f2175a) {
                                    if (aVar5.f2180f != z.f2174k) {
                                        z3 = false;
                                    }
                                    aVar5.f2180f = obj;
                                    break;
                                }
                                if (z3) {
                                    p034l.a aVarS = p034l.a.S();
                                    b bVar = aVar5.f2184j;
                                    p034l.c cVar2 = aVarS.f3913i;
                                    if (cVar2.f3917k == null) {
                                        synchronized (cVar2.f3915i) {
                                            try {
                                                if (cVar2.f3917k == null) {
                                                    cVar2.f3917k = p034l.c.S(Looper.getMainLooper());
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    cVar2.f3917k.post(bVar);
                                }
                            }
                        }
                    }
                    break;
                } else {
                    H0.d dVar3 = aVar4.f2831o;
                    if (dVar3.f434h == aVar4) {
                        SystemClock.uptimeMillis();
                        dVar3.f434h = null;
                        dVar3.b();
                    }
                }
                aVar4.f2829l = 3;
                return;
            case 5:
                synchronized (((p019g1.g) this.f2m).f2839c) {
                    ((p019g1.b) ((p019g1.g) this.f2m).f2840d).a((p019g1.i) this.f1l);
                    break;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                synchronized (((p019g1.g) this.f2m).f2839c) {
                    ((p019g1.d) ((p019g1.g) this.f2m).f2840d).c(((p019g1.i) this.f1l).c());
                    break;
                }
                return;
            case 8:
                C0228f c0228f = (C0228f) this.f1l;
                C0231i c0231i = (C0231i) this.f2m;
                ActionMenuView actionMenuView = c0231i.f3705q;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (c0228f.b()) {
                        c0231i.f3695B = c0228f;
                    } else if (c0228f.f3480e != null) {
                        c0228f.d(0, 0, false, false);
                        c0231i.f3695B = c0228f;
                    }
                }
                c0231i.f3697D = null;
                return;
            default:
                n2.g gVar = (n2.g) this.f2m;
                AbstractC0209q abstractC0209q = gVar.f4157m;
                while (true) {
                    try {
                        ((Runnable) this.f1l).run();
                    } catch (Throwable th2) {
                        AbstractC0212u.e(R1.i.f1255k, th2);
                    }
                    Runnable runnableH = gVar.h();
                    if (runnableH == null) {
                        return;
                    }
                    this.f1l = runnableH;
                    i3++;
                    if (i3 >= 16 && abstractC0209q.d(gVar)) {
                        abstractC0209q.c(gVar, this);
                        return;
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i3, boolean z3) {
        this.f0k = i3;
        this.f2m = obj;
        this.f1l = obj2;
    }
}
