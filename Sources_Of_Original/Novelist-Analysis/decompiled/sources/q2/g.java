package q2;

import M1.P;
import i2.C0198f;
import i2.C0199g;
import i2.InterfaceC0197e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n2.r;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4317b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4318c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4319d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4320e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4321f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0198f f4322a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g() {
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = 1;
        this.f4322a = new C0198f(this, 2);
    }

    public final void a(b bVar) {
        Object objB;
        i iVar;
        C0199g c0199g = bVar.f4311k;
        c cVar = bVar.f4312l;
        while (true) {
            int andDecrement = f4321f.getAndDecrement(this);
            if (andDecrement <= 1) {
                O1.g gVar = O1.g.f1211a;
                if (andDecrement > 0) {
                    c.f4313g.set(cVar, null);
                    c0199g.A(gVar, c0199g.f3038m, new C0198f(new P(cVar, bVar), 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4319d;
                i iVar2 = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f4320e.getAndIncrement(this);
                e eVar = e.f4315s;
                long j3 = andIncrement / ((long) h.f4328f);
                while (true) {
                    objB = n2.a.b(iVar2, j3, eVar);
                    if (n2.a.e(objB)) {
                        break;
                    }
                    r rVarC = n2.a.c(objB);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
                        iVar = iVar2;
                        if (rVar.f4176c >= rVarC.f4176c) {
                            break;
                        }
                        if (!rVarC.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                                if (!rVar.e()) {
                                    break;
                                }
                                rVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == rVar);
                        if (rVarC.e()) {
                            rVarC.d();
                        }
                        iVar2 = iVar;
                    }
                    iVar2 = iVar;
                }
                i iVar3 = (i) n2.a.c(objB);
                AtomicReferenceArray atomicReferenceArray = iVar3.f4329e;
                int i3 = (int) (andIncrement % ((long) h.f4328f));
                do {
                    if (atomicReferenceArray.compareAndSet(i3, null, bVar)) {
                        bVar.a(iVar3, i3);
                        return;
                    }
                } while (atomicReferenceArray.get(i3) == null);
                B1.g gVar2 = h.f4324b;
                B1.g gVar3 = h.f4325c;
                do {
                    if (atomicReferenceArray.compareAndSet(i3, gVar2, gVar3)) {
                        c.f4313g.set(cVar, null);
                        c0199g.A(gVar, c0199g.f3038m, new C0198f(new P(cVar, bVar), 0));
                        return;
                    }
                } while (atomicReferenceArray.get(i3) == gVar2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    public final void b() {
        boolean z3;
        int i3;
        Object objB;
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
            long j3 = andIncrement2 / ((long) h.f4328f);
            f fVar = f.f4316s;
            while (true) {
                objB = n2.a.b(iVar, j3, fVar);
                if (!n2.a.e(objB)) {
                    r rVarC = n2.a.c(objB);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
                        if (rVar.f4176c >= rVarC.f4176c) {
                            break;
                        }
                        if (!rVarC.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                                if (!rVar.e()) {
                                    break;
                                }
                                rVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == rVar);
                        if (rVarC.e()) {
                            rVarC.d();
                        }
                    }
                } else {
                    break;
                }
            }
            i iVar2 = (i) n2.a.c(objB);
            AtomicReferenceArray atomicReferenceArray = iVar2.f4329e;
            iVar2.a();
            boolean z4 = false;
            if (iVar2.f4176c <= j3) {
                int i4 = (int) (andIncrement2 % ((long) h.f4328f));
                Object andSet = atomicReferenceArray.getAndSet(i4, h.f4324b);
                if (andSet == null) {
                    int i5 = h.f4323a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            B1.g gVar = h.f4324b;
                            B1.g gVar2 = h.f4326d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i4, gVar, gVar2)) {
                                    z4 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i4) == gVar);
                            z3 = true ^ z4;
                            break;
                        }
                        if (atomicReferenceArray.get(i4) == h.f4325c) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else if (andSet == h.f4327e) {
                    z3 = false;
                } else {
                    if (!(andSet instanceof InterfaceC0197e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0197e interfaceC0197e = (InterfaceC0197e) andSet;
                    B1.g gVarK = interfaceC0197e.k(O1.g.f1211a, this.f4322a);
                    if (gVarK != null) {
                        interfaceC0197e.l(gVarK);
                    } else {
                        z3 = false;
                    }
                }
            } else {
                z3 = false;
            }
        } while (!z3);
    }
}
