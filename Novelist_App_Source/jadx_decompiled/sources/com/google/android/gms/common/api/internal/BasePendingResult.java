package com.google.android.gms.common.api.internal;

import K0.l;
import K0.n;
import L0.D;
import L0.HandlerC0043c;
import L0.s;
import M0.r;
import S0.a;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends n> extends a {

    /* renamed from: l, reason: collision with root package name */
    public static final D f2729l = new D(0);

    /* renamed from: g, reason: collision with root package name */
    public n f2734g;

    /* renamed from: h, reason: collision with root package name */
    public Status f2735h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f2736i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2737j;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2730c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final CountDownLatch f2731d = new CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2732e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f2733f = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    public boolean f2738k = false;

    public BasePendingResult(l lVar) {
        new HandlerC0043c(lVar != null ? ((s) lVar).f844b.f650f : Looper.getMainLooper(), 0);
        new WeakReference(lVar);
    }

    public final void L(L0.l lVar) {
        synchronized (this.f2730c) {
            try {
                if (O()) {
                    lVar.a(this.f2735h);
                } else {
                    this.f2732e.add(lVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract n M(Status status);

    public final void N(Status status) {
        synchronized (this.f2730c) {
            try {
                if (!O()) {
                    P(M(status));
                    this.f2737j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean O() {
        return this.f2731d.getCount() == 0;
    }

    public final void P(n nVar) {
        synchronized (this.f2730c) {
            try {
                if (this.f2737j) {
                    return;
                }
                O();
                r.h("Results have already been set", !O());
                r.h("Result has already been consumed", !this.f2736i);
                this.f2734g = nVar;
                this.f2735h = nVar.a();
                this.f2731d.countDown();
                ArrayList arrayList = this.f2732e;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((L0.l) arrayList.get(i3)).a(this.f2735h);
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
