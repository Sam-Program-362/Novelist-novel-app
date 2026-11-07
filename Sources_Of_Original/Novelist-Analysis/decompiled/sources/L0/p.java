package L0;

import M0.C0047c;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p implements K0.j, K0.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K0.c f824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0041a f825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A.c f826d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f831i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0044d f835m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f823a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f827e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f828f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f832j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public J0.a f833k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f834l = 0;

    public p(C0044d c0044d, K0.i iVar) {
        this.f835m = c0044d;
        Looper looper = c0044d.f812m.getLooper();
        A0.j jVarA = iVar.a();
        C0047c c0047c = new C0047c((String) jVarA.f58m, (String) jVarA.n, (p042o.f) jVarA.f57l);
        H2.h hVar = (H2.h) iVar.f647c.f6l;
        M0.r.f(hVar);
        K0.c cVarA = hVar.a(iVar.f645a, looper, c0047c, iVar.f648d, this, this);
        String str = iVar.f646b;
        if (str != null && (cVarA instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) cVarA).f2755r = str;
        }
        if (str != null && (cVarA instanceof h)) {
            B1.e.p(cVarA);
            throw null;
        }
        this.f824b = cVarA;
        this.f825c = iVar.f649e;
        this.f826d = new A.c(19);
        this.f829g = iVar.f651g;
        if (!cVarA.l()) {
            this.f830h = null;
            return;
        }
        Context context = c0044d.f804e;
        Z0.d dVar = c0044d.f812m;
        A0.j jVarA2 = iVar.a();
        this.f830h = new y(context, dVar, new C0047c((String) jVarA2.f58m, (String) jVarA2.n, (p042o.f) jVarA2.f57l));
    }

    public final void a(J0.a aVar) {
        HashSet hashSet = this.f827e;
        Iterator it2 = hashSet.iterator();
        if (!it2.hasNext()) {
            hashSet.clear();
        } else {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (M0.r.i(aVar, J0.a.f538p)) {
                this.f824b.i();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        M0.r.c(this.f835m.f812m);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z3) {
        M0.r.c(this.f835m.f812m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it2 = this.f823a.iterator();
        while (it2.hasNext()) {
            C c3 = (C) it2.next();
            if (!z3 || c3.f786a == 2) {
                if (status != null) {
                    c3.a(status);
                } else {
                    c3.b(exc);
                }
                it2.remove();
            }
        }
    }

    @Override // K0.j
    public final void d(int i3) {
        Looper looperMyLooper = Looper.myLooper();
        Z0.d dVar = this.f835m.f812m;
        if (looperMyLooper == dVar.getLooper()) {
            h(i3);
        } else {
            dVar.post(new o(this, i3));
        }
    }

    @Override // K0.j
    public final void e() {
        Looper looperMyLooper = Looper.myLooper();
        Z0.d dVar = this.f835m.f812m;
        if (looperMyLooper == dVar.getLooper()) {
            g();
        } else {
            dVar.post(new A.b(this, 2));
        }
    }

    public final void f() {
        LinkedList linkedList = this.f823a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C c3 = (C) arrayList.get(i3);
            if (!this.f824b.a()) {
                return;
            }
            if (k(c3)) {
                linkedList.remove(c3);
            }
        }
    }

    public final void g() {
        C0044d c0044d = this.f835m;
        M0.r.c(c0044d.f812m);
        this.f833k = null;
        a(J0.a.f538p);
        Z0.d dVar = c0044d.f812m;
        if (this.f831i) {
            C0041a c0041a = this.f825c;
            dVar.removeMessages(11, c0041a);
            dVar.removeMessages(9, c0041a);
            this.f831i = false;
        }
        Iterator it2 = this.f828f.values().iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        f();
        i();
    }

    public final void h(int i3) {
        C0044d c0044d = this.f835m;
        Z0.d dVar = c0044d.f812m;
        M0.r.c(c0044d.f812m);
        this.f833k = null;
        this.f831i = true;
        String strJ = this.f824b.j();
        A.c cVar = this.f826d;
        cVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i3 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i3 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strJ != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strJ);
        }
        cVar.A(true, new Status(20, sb.toString(), null, null));
        C0041a c0041a = this.f825c;
        dVar.sendMessageDelayed(Message.obtain(dVar, 9, c0041a), 5000L);
        dVar.sendMessageDelayed(Message.obtain(dVar, 11, c0041a), 120000L);
        ((SparseIntArray) c0044d.f806g.f6l).clear();
        Iterator it2 = this.f828f.values().iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void i() {
        C0044d c0044d = this.f835m;
        Z0.d dVar = c0044d.f812m;
        C0041a c0041a = this.f825c;
        dVar.removeMessages(12, c0041a);
        dVar.sendMessageDelayed(dVar.obtainMessage(12, c0041a), c0044d.f800a);
    }

    @Override // K0.k
    public final void j(J0.a aVar) {
        o(aVar, null);
    }

    public final boolean k(C c3) {
        J0.c cVar;
        if (!(c3 instanceof u)) {
            A.c cVar2 = this.f826d;
            K0.c cVar3 = this.f824b;
            c3.d(cVar2, cVar3.l());
            try {
                c3.c(this);
                return true;
            } catch (DeadObjectException unused) {
                d(1);
                cVar3.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        u uVar = (u) c3;
        J0.c[] cVarArrG = uVar.g(this);
        if (cVarArrG == null || cVarArrG.length == 0) {
            cVar = null;
            break;
        }
        J0.c[] cVarArrH = this.f824b.h();
        if (cVarArrH == null) {
            cVarArrH = new J0.c[0];
        }
        p042o.e eVar = new p042o.e(cVarArrH.length);
        for (J0.c cVar4 : cVarArrH) {
            eVar.put(cVar4.f546k, Long.valueOf(cVar4.b()));
        }
        int length = cVarArrG.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrG[i3];
            Long l3 = (Long) eVar.get(cVar.f546k);
            if (l3 == null || l3.longValue() < cVar.b()) {
                break;
            }
            i3++;
        }
        if (cVar == null) {
            A.c cVar5 = this.f826d;
            K0.c cVar6 = this.f824b;
            c3.d(cVar5, cVar6.l());
            try {
                c3.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                d(1);
                cVar6.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f824b.getClass().getName() + " could not execute call because it requires feature (" + cVar.f546k + ", " + cVar.b() + ").");
        if (!this.f835m.n || !uVar.f(this)) {
            uVar.b(new K0.o(cVar));
            return true;
        }
        q qVar = new q(this.f825c, cVar);
        int iIndexOf = this.f832j.indexOf(qVar);
        if (iIndexOf >= 0) {
            q qVar2 = (q) this.f832j.get(iIndexOf);
            this.f835m.f812m.removeMessages(15, qVar2);
            Z0.d dVar = this.f835m.f812m;
            dVar.sendMessageDelayed(Message.obtain(dVar, 15, qVar2), 5000L);
        } else {
            this.f832j.add(qVar);
            Z0.d dVar2 = this.f835m.f812m;
            dVar2.sendMessageDelayed(Message.obtain(dVar2, 15, qVar), 5000L);
            Z0.d dVar3 = this.f835m.f812m;
            dVar3.sendMessageDelayed(Message.obtain(dVar3, 16, qVar), 120000L);
            J0.a aVar = new J0.a(2, null, null);
            if (!l(aVar)) {
                this.f835m.c(aVar, this.f829g);
            }
        }
        return false;
    }

    public final boolean l(J0.a aVar) {
        synchronized (C0044d.f798q) {
        }
        return false;
    }

    public final void m() {
        C0044d c0044d = this.f835m;
        M0.r.c(c0044d.f812m);
        K0.c cVar = this.f824b;
        if (cVar.a() || cVar.g()) {
            return;
        }
        try {
            A.c cVar2 = c0044d.f806g;
            Context context = c0044d.f804e;
            SparseIntArray sparseIntArray = (SparseIntArray) cVar2.f6l;
            M0.r.f(context);
            int iE = cVar.e();
            int iB = ((SparseIntArray) cVar2.f6l).get(iE, -1);
            if (iB == -1) {
                iB = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i3);
                    if (iKeyAt > iE && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (iB == -1) {
                    iB = ((J0.d) cVar2.f7m).b(context, iE);
                }
                sparseIntArray.put(iE, iB);
            }
            if (iB != 0) {
                J0.a aVar = new J0.a(iB, null, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + aVar.toString());
                o(aVar, null);
                return;
            }
            r rVar = new r(c0044d, cVar, this.f825c);
            if (cVar.l()) {
                y yVar = this.f830h;
                M0.r.f(yVar);
                Handler handler = yVar.f860c;
                C0047c c0047c = yVar.f863f;
                p015f1.a aVar2 = yVar.f864g;
                if (aVar2 != null) {
                    aVar2.k();
                }
                c0047c.f931f = Integer.valueOf(System.identityHashCode(yVar));
                yVar.f864g = (p015f1.a) yVar.f861d.a(yVar.f859b, handler.getLooper(), c0047c, (p011e1.a) c0047c.f930e, yVar, yVar);
                yVar.f865h = rVar;
                Set set = yVar.f862e;
                if (set == null || set.isEmpty()) {
                    handler.post(new A.b(yVar, 4));
                } else {
                    p015f1.a aVar3 = yVar.f864g;
                    aVar3.getClass();
                    aVar3.m(new M0.h(aVar3));
                }
            }
            try {
                cVar.m(rVar);
            } catch (SecurityException e3) {
                o(new J0.a(10, null, null), e3);
            }
        } catch (IllegalStateException e4) {
            o(new J0.a(10, null, null), e4);
        }
    }

    public final void n(C c3) {
        M0.r.c(this.f835m.f812m);
        boolean zA = this.f824b.a();
        LinkedList linkedList = this.f823a;
        if (zA) {
            if (k(c3)) {
                i();
                return;
            } else {
                linkedList.add(c3);
                return;
            }
        }
        linkedList.add(c3);
        J0.a aVar = this.f833k;
        if (aVar == null || aVar.f540l == 0 || aVar.f541m == null) {
            m();
        } else {
            o(aVar, null);
        }
    }

    public final void o(J0.a aVar, RuntimeException runtimeException) {
        p015f1.a aVar2;
        M0.r.c(this.f835m.f812m);
        y yVar = this.f830h;
        if (yVar != null && (aVar2 = yVar.f864g) != null) {
            aVar2.k();
        }
        M0.r.c(this.f835m.f812m);
        this.f833k = null;
        ((SparseIntArray) this.f835m.f806g.f6l).clear();
        a(aVar);
        if ((this.f824b instanceof O0.c) && aVar.f540l != 24) {
            C0044d c0044d = this.f835m;
            c0044d.f801b = true;
            Z0.d dVar = c0044d.f812m;
            dVar.sendMessageDelayed(dVar.obtainMessage(19), 300000L);
        }
        if (aVar.f540l == 4) {
            b(C0044d.f797p);
            return;
        }
        if (this.f823a.isEmpty()) {
            this.f833k = aVar;
            return;
        }
        if (runtimeException != null) {
            M0.r.c(this.f835m.f812m);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f835m.n) {
            b(C0044d.d(this.f825c, aVar));
            return;
        }
        c(C0044d.d(this.f825c, aVar), null, true);
        if (this.f823a.isEmpty() || l(aVar) || this.f835m.c(aVar, this.f829g)) {
            return;
        }
        if (aVar.f540l == 18) {
            this.f831i = true;
        }
        if (!this.f831i) {
            b(C0044d.d(this.f825c, aVar));
            return;
        }
        C0044d c0044d2 = this.f835m;
        C0041a c0041a = this.f825c;
        Z0.d dVar2 = c0044d2.f812m;
        dVar2.sendMessageDelayed(Message.obtain(dVar2, 9, c0041a), 5000L);
    }

    public final void p(J0.a aVar) {
        M0.r.c(this.f835m.f812m);
        K0.c cVar = this.f824b;
        cVar.d("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(aVar));
        o(aVar, null);
    }

    public final void q() {
        M0.r.c(this.f835m.f812m);
        Status status = C0044d.f796o;
        b(status);
        this.f826d.A(false, status);
        for (g gVar : (g[]) this.f828f.keySet().toArray(new g[0])) {
            n(new B(new p019g1.e()));
        }
        a(new J0.a(4, null, null));
        K0.c cVar = this.f824b;
        if (cVar.a()) {
            cVar.c(new B1.a(this, 11));
        }
    }
}
