package com.google.android.gms.common.internal;

import A.b;
import J0.d;
import J0.e;
import K0.c;
import K0.j;
import K0.k;
import L0.p;
import M0.A;
import M0.C0047c;
import M0.C0049e;
import M0.D;
import M0.E;
import M0.F;
import M0.InterfaceC0046b;
import M0.InterfaceC0050f;
import M0.h;
import M0.q;
import M0.r;
import M0.u;
import M0.v;
import M0.w;
import M0.x;
import M0.y;
import M0.z;
import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a implements c {
    public static final J0.c[] x = new J0.c[0];

    /* renamed from: a, reason: collision with root package name */
    public volatile String f2739a;

    /* renamed from: b, reason: collision with root package name */
    public E f2740b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2741c;

    /* renamed from: d, reason: collision with root package name */
    public final D f2742d;

    /* renamed from: e, reason: collision with root package name */
    public final u f2743e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2744f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2745g;

    /* renamed from: h, reason: collision with root package name */
    public q f2746h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0046b f2747i;

    /* renamed from: j, reason: collision with root package name */
    public IInterface f2748j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2749k;

    /* renamed from: l, reason: collision with root package name */
    public w f2750l;

    /* renamed from: m, reason: collision with root package name */
    public int f2751m;
    public final h n;

    /* renamed from: o, reason: collision with root package name */
    public final h f2752o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2753p;

    /* renamed from: q, reason: collision with root package name */
    public final String f2754q;

    /* renamed from: r, reason: collision with root package name */
    public volatile String f2755r;

    /* renamed from: s, reason: collision with root package name */
    public J0.a f2756s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2757t;
    public volatile z u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicInteger f2758v;

    /* renamed from: w, reason: collision with root package name */
    public final Set f2759w;

    public a(Context context, Looper looper, int i3, C0047c c0047c, j jVar, k kVar, int i4) {
        synchronized (D.f912g) {
            try {
                if (D.f913h == null) {
                    D.f913h = new D(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        D d3 = D.f913h;
        Object obj = d.f549b;
        r.f(jVar);
        r.f(kVar);
        h hVar = new h(jVar);
        h hVar2 = new h(kVar);
        String str = (String) c0047c.f929d;
        this.f2739a = null;
        this.f2744f = new Object();
        this.f2745g = new Object();
        this.f2749k = new ArrayList();
        this.f2751m = 1;
        this.f2756s = null;
        this.f2757t = false;
        this.u = null;
        this.f2758v = new AtomicInteger(0);
        r.g(context, "Context must not be null");
        this.f2741c = context;
        r.g(looper, "Looper must not be null");
        r.g(d3, "Supervisor must not be null");
        this.f2742d = d3;
        this.f2743e = new u(this, looper);
        this.f2753p = i3;
        this.n = hVar;
        this.f2752o = hVar2;
        this.f2754q = str;
        Set set = (Set) c0047c.f927b;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (!set.contains((Scope) it2.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2759w = set;
    }

    @Override // K0.c
    public final boolean a() {
        boolean z3;
        synchronized (this.f2744f) {
            z3 = this.f2751m == 4;
        }
        return z3;
    }

    @Override // K0.c
    public final Set b() {
        return l() ? this.f2759w : Collections.EMPTY_SET;
    }

    @Override // K0.c
    public final void c(B1.a aVar) {
        ((p) aVar.f80l).f835m.f812m.post(new b(aVar, 3));
    }

    @Override // K0.c
    public final void d(String str) {
        this.f2739a = str;
        k();
    }

    @Override // K0.c
    public final void f(InterfaceC0050f interfaceC0050f, Set set) {
        Bundle p3 = p();
        String str = Build.VERSION.SDK_INT < 31 ? this.f2755r : this.f2755r;
        int i3 = this.f2753p;
        int i4 = e.f551a;
        Scope[] scopeArr = C0049e.y;
        Bundle bundle = new Bundle();
        J0.c[] cVarArr = C0049e.f937z;
        C0049e c0049e = new C0049e(6, i3, i4, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        c0049e.n = this.f2741c.getPackageName();
        c0049e.f943q = p3;
        if (set != null) {
            c0049e.f942p = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            c0049e.f944r = new Account("<<default account>>", "com.google");
            if (interfaceC0050f != null) {
                c0049e.f941o = ((F) interfaceC0050f).f924a;
            }
        }
        c0049e.f945s = x;
        c0049e.f946t = o();
        if (u()) {
            c0049e.f948w = true;
        }
        try {
            synchronized (this.f2745g) {
                try {
                    q qVar = this.f2746h;
                    if (qVar != null) {
                        qVar.d(new v(this, this.f2758v.get()), c0049e);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i5 = this.f2758v.get();
            u uVar = this.f2743e;
            uVar.sendMessage(uVar.obtainMessage(6, i5, 3));
        } catch (RemoteException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i6 = this.f2758v.get();
            x xVar = new x(this, 8, null, null);
            u uVar2 = this.f2743e;
            uVar2.sendMessage(uVar2.obtainMessage(1, i6, -1, xVar));
        } catch (SecurityException e5) {
            throw e5;
        } catch (RuntimeException e6) {
            e = e6;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i62 = this.f2758v.get();
            x xVar2 = new x(this, 8, null, null);
            u uVar22 = this.f2743e;
            uVar22.sendMessage(uVar22.obtainMessage(1, i62, -1, xVar2));
        }
    }

    @Override // K0.c
    public final boolean g() {
        boolean z3;
        synchronized (this.f2744f) {
            int i3 = this.f2751m;
            z3 = true;
            if (i3 != 2 && i3 != 3) {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // K0.c
    public final J0.c[] h() {
        z zVar = this.u;
        if (zVar == null) {
            return null;
        }
        return zVar.f1000l;
    }

    @Override // K0.c
    public final void i() {
        if (!a() || this.f2740b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // K0.c
    public final String j() {
        return this.f2739a;
    }

    @Override // K0.c
    public final void k() {
        this.f2758v.incrementAndGet();
        ArrayList arrayList = this.f2749k;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    M0.p pVar = (M0.p) arrayList.get(i3);
                    synchronized (pVar) {
                        pVar.f979a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2745g) {
            this.f2746h = null;
        }
        w(1, null);
    }

    @Override // K0.c
    public boolean l() {
        return false;
    }

    @Override // K0.c
    public final void m(InterfaceC0046b interfaceC0046b) {
        this.f2747i = interfaceC0046b;
        w(2, null);
    }

    public abstract IInterface n(IBinder iBinder);

    public J0.c[] o() {
        return x;
    }

    public Bundle p() {
        return new Bundle();
    }

    public final IInterface q() {
        IInterface iInterface;
        synchronized (this.f2744f) {
            try {
                if (this.f2751m == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f2748j;
                r.g(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String r();

    public abstract String s();

    public boolean t() {
        return e() >= 211700000;
    }

    public boolean u() {
        return this instanceof I0.a;
    }

    public final /* synthetic */ boolean v(int i3, int i4, IInterface iInterface) {
        synchronized (this.f2744f) {
            try {
                if (this.f2751m != i3) {
                    return false;
                }
                w(i4, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(int i3, IInterface iInterface) {
        E e3;
        r.b((i3 == 4) == (iInterface != null));
        synchronized (this.f2744f) {
            try {
                this.f2751m = i3;
                this.f2748j = iInterface;
                Bundle bundle = null;
                if (i3 == 1) {
                    w wVar = this.f2750l;
                    if (wVar != null) {
                        D d3 = this.f2742d;
                        String str = (String) this.f2740b.f923m;
                        r.f(str);
                        this.f2740b.getClass();
                        if (this.f2754q == null) {
                            this.f2741c.getClass();
                        }
                        d3.b(str, wVar, this.f2740b.f922l);
                        this.f2750l = null;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    w wVar2 = this.f2750l;
                    if (wVar2 != null && (e3 = this.f2740b) != null) {
                        String str2 = (String) e3.f923m;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        D d4 = this.f2742d;
                        String str3 = (String) this.f2740b.f923m;
                        r.f(str3);
                        this.f2740b.getClass();
                        if (this.f2754q == null) {
                            this.f2741c.getClass();
                        }
                        d4.b(str3, wVar2, this.f2740b.f922l);
                        this.f2758v.incrementAndGet();
                    }
                    w wVar3 = new w(this, this.f2758v.get());
                    this.f2750l = wVar3;
                    String s3 = s();
                    boolean t3 = t();
                    this.f2740b = new E(s3, t3);
                    if (t3 && e() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f2740b.f923m)));
                    }
                    D d5 = this.f2742d;
                    String str4 = (String) this.f2740b.f923m;
                    r.f(str4);
                    this.f2740b.getClass();
                    String str5 = this.f2754q;
                    if (str5 == null) {
                        str5 = this.f2741c.getClass().getName();
                    }
                    J0.a a3 = d5.a(new A(str4, this.f2740b.f922l), wVar3, str5);
                    if (!(a3.f540l == 0)) {
                        String str6 = (String) this.f2740b.f923m;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str6);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i4 = a3.f540l;
                        if (i4 == -1) {
                            i4 = 16;
                        }
                        if (a3.f541m != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", a3.f541m);
                        }
                        int i5 = this.f2758v.get();
                        y yVar = new y(this, i4, bundle);
                        u uVar = this.f2743e;
                        uVar.sendMessage(uVar.obtainMessage(7, i5, -1, yVar));
                    }
                } else if (i3 == 4) {
                    r.f(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
