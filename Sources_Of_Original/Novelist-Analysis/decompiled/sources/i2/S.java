package i2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class S extends n2.j implements B, K {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public W f2980d;

    @Override // i2.K
    public final boolean a() {
        return true;
    }

    @Override // i2.B
    public final void b() {
        W wJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W.f2990k;
            Object obj = atomicReferenceFieldUpdater.get(wJ);
            if (obj instanceof S) {
                if (obj != this) {
                    return;
                }
                D d3 = AbstractC0212u.f3034i;
                while (!atomicReferenceFieldUpdater.compareAndSet(wJ, obj, d3)) {
                    if (atomicReferenceFieldUpdater.get(wJ) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof K) || ((K) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n2.j.f4161a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof n2.o) {
                    n2.j jVar = ((n2.o) obj2).f4174a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                a2.h.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                n2.j jVar2 = (n2.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = n2.j.f4163c;
                n2.o oVar = (n2.o) atomicReferenceFieldUpdater3.get(jVar2);
                if (oVar == null) {
                    oVar = new n2.o(jVar2);
                    atomicReferenceFieldUpdater3.set(jVar2, oVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                        jVar2.f();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    @Override // i2.K
    public final X d() {
        return null;
    }

    public N getParent() {
        return j();
    }

    public final W j() {
        W w3 = this.f2980d;
        if (w3 != null) {
            return w3;
        }
        a2.h.g("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // n2.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0212u.c(this) + "[job@" + AbstractC0212u.c(j()) + ']';
    }
}
