package q2;

import M1.P;
import i2.C0289f;
import i2.C0290g;
import i2.InterfaceC0288e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n2.r;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4317b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4318c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4319d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4320e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4321f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final C0289f f4322a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g() {
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = 1;
        this.f4322a = new C0289f(this, 2);
    }

    public final void a(b bVar) {
        Object b3;
        i iVar;
        C0290g c0290g = bVar.f4311k;
        c cVar = bVar.f4312l;
        while (true) {
            int andDecrement = f4321f.getAndDecrement(this);
            if (andDecrement <= 1) {
                O1.g gVar = O1.g.f1211a;
                if (andDecrement > 0) {
                    c.f4313g.set(cVar, null);
                    c0290g.A(gVar, c0290g.f3038m, new C0289f(new P(cVar, bVar), 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4319d;
                i iVar2 = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f4320e.getAndIncrement(this);
                e eVar = e.f4315s;
                long j3 = andIncrement / h.f4328f;
                while (true) {
                    b3 = n2.a.b(iVar2, j3, eVar);
                    if (!n2.a.e(b3)) {
                        r c3 = n2.a.c(b3);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            iVar = iVar2;
                            if (rVar.f4176c >= c3.f4176c) {
                                break;
                            }
                            if (!c3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c3)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (c3.e()) {
                                        c3.d();
                                    }
                                    iVar2 = iVar;
                                }
                            }
                            if (rVar.e()) {
                                rVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    iVar2 = iVar;
                }
                i iVar3 = (i) n2.a.c(b3);
                AtomicReferenceArray atomicReferenceArray = iVar3.f4329e;
                int i3 = (int) (andIncrement % h.f4328f);
                while (!atomicReferenceArray.compareAndSet(i3, null, bVar)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        B1.g gVar2 = h.f4324b;
                        B1.g gVar3 = h.f4325c;
                        while (!atomicReferenceArray.compareAndSet(i3, gVar2, gVar3)) {
                            if (atomicReferenceArray.get(i3) != gVar2) {
                                break;
                            }
                        }
                        c.f4313g.set(cVar, null);
                        c0290g.A(gVar, c0290g.f3038m, new C0289f(new P(cVar, bVar), 0));
                        return;
                    }
                }
                bVar.a(iVar3, i3);
                return;
            }
        }
    }

    public final void b() {
        boolean z3;
        int i3;
        Object b3;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4321f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z3 = true;
            if (andIncrement >= 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4317b;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f4318c.getAndIncrement(this);
            long j3 = andIncrement2 / h.f4328f;
            f fVar = f.f4316s;
            while (true) {
                b3 = n2.a.b(iVar, j3, fVar);
                if (!n2.a.e(b3)) {
                    r c3 = n2.a.c(b3);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
                        if (rVar.f4176c >= c3.f4176c) {
                            break;
                        }
                        if (!c3.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c3)) {
                            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                if (c3.e()) {
                                    c3.d();
                                }
                            }
                        }
                        if (rVar.e()) {
                            rVar.d();
                        }
                    }
                } else {
                    break;
                }
            }
            i iVar2 = (i) n2.a.c(b3);
            AtomicReferenceArray atomicReferenceArray = iVar2.f4329e;
            iVar2.a();
            boolean z4 = false;
            if (iVar2.f4176c <= j3) {
                int i4 = (int) (andIncrement2 % h.f4328f);
                Object andSet = atomicReferenceArray.getAndSet(i4, h.f4324b);
                if (andSet == null) {
                    int i5 = h.f4323a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            B1.g gVar = h.f4324b;
                            B1.g gVar2 = h.f4326d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i4, gVar, gVar2)) {
                                    z4 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i4) != gVar) {
                                    break;
                                }
                            }
                            z3 = true ^ z4;
                        } else if (atomicReferenceArray.get(i4) == h.f4325c) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else if (andSet != h.f4327e) {
                    if (!(andSet instanceof InterfaceC0288e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0288e interfaceC0288e = (InterfaceC0288e) andSet;
                    B1.g k3 = interfaceC0288e.k(O1.g.f1211a, this.f4322a);
                    if (k3 != null) {
                        interfaceC0288e.l(k3);
                    }
                }
            }
            z3 = false;
        } while (!z3);
    }
}
