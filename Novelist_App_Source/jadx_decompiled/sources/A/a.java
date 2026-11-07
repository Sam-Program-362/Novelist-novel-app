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
import f0.C0244a;
import g0.RunnableC0251a;
import i2.AbstractC0300q;
import i2.AbstractC0303u;
import java.util.Set;
import k.C0343f;
import k.C0346i;
import k.C0355s;
import l.C0377a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f0k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2m;

    public /* synthetic */ a(Object obj, Object obj2, int i3) {
        this.f0k = i3;
        this.f1l = obj;
        this.f2m = obj2;
    }

    private final void a() {
        Exception exc;
        synchronized (((g1.g) this.f2m).f2839c) {
            g1.c cVar = (g1.c) ((g1.g) this.f2m).f2840d;
            g1.i iVar = (g1.i) this.f1l;
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
                C0355s c0355s = (C0355s) dVar.f4639a;
                if (c0355s != null) {
                    c0355s.b(typeface);
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
                f1.f fVar = (f1.f) this.f1l;
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
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        f3 = queryLocalInterface instanceof InterfaceC0050f ? (InterfaceC0050f) queryLocalInterface : new F(iBinder);
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
                RunnableC0251a runnableC0251a = (RunnableC0251a) this.f2m;
                Object obj = this.f1l;
                if (runnableC0251a.f2830m.get()) {
                    H0.d dVar2 = runnableC0251a.f2831o;
                    if (dVar2.f434h == runnableC0251a) {
                        SystemClock.uptimeMillis();
                        dVar2.f434h = null;
                        dVar2.b();
                    }
                } else {
                    H0.d dVar3 = runnableC0251a.f2831o;
                    if (dVar3.f433g != runnableC0251a) {
                        if (dVar3.f434h == runnableC0251a) {
                            SystemClock.uptimeMillis();
                            dVar3.f434h = null;
                            dVar3.b();
                        }
                    } else if (!dVar3.f429c) {
                        SystemClock.uptimeMillis();
                        dVar3.f433g = null;
                        C0244a c0244a = dVar3.f427a;
                        if (c0244a != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                c0244a.h(obj);
                            } else {
                                synchronized (c0244a.f2175a) {
                                    if (c0244a.f2180f != z.f2174k) {
                                        z3 = false;
                                    }
                                    c0244a.f2180f = obj;
                                }
                                if (z3) {
                                    C0377a S = C0377a.S();
                                    b bVar = c0244a.f2184j;
                                    l.c cVar2 = S.f3913i;
                                    if (cVar2.f3917k == null) {
                                        synchronized (cVar2.f3915i) {
                                            try {
                                                if (cVar2.f3917k == null) {
                                                    cVar2.f3917k = l.c.S(Looper.getMainLooper());
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                    cVar2.f3917k.post(bVar);
                                }
                            }
                        }
                    }
                }
                runnableC0251a.f2829l = 3;
                return;
            case 5:
                synchronized (((g1.g) this.f2m).f2839c) {
                    ((g1.b) ((g1.g) this.f2m).f2840d).a((g1.i) this.f1l);
                }
                return;
            case 6:
                a();
                return;
            case 7:
                synchronized (((g1.g) this.f2m).f2839c) {
                    ((g1.d) ((g1.g) this.f2m).f2840d).c(((g1.i) this.f1l).c());
                }
                return;
            case 8:
                C0343f c0343f = (C0343f) this.f1l;
                C0346i c0346i = (C0346i) this.f2m;
                ActionMenuView actionMenuView = c0346i.f3705q;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (!c0343f.b()) {
                        if (c0343f.f3480e != null) {
                            c0343f.d(0, 0, false, false);
                        }
                    }
                    c0346i.f3695B = c0343f;
                }
                c0346i.f3697D = null;
                return;
            default:
                n2.g gVar = (n2.g) this.f2m;
                AbstractC0300q abstractC0300q = gVar.f4157m;
                while (true) {
                    try {
                        ((Runnable) this.f1l).run();
                    } catch (Throwable th) {
                        AbstractC0303u.e(R1.i.f1255k, th);
                    }
                    Runnable h3 = gVar.h();
                    if (h3 == null) {
                        return;
                    }
                    this.f1l = h3;
                    i3++;
                    if (i3 >= 16 && abstractC0300q.d(gVar)) {
                        abstractC0300q.c(gVar, this);
                        return;
                    }
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
