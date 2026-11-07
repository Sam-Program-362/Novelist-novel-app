package q;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends S0.a {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4285c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4286d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4287e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4288f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4289g;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4285c = atomicReferenceFieldUpdater;
        this.f4286d = atomicReferenceFieldUpdater2;
        this.f4287e = atomicReferenceFieldUpdater3;
        this.f4288f = atomicReferenceFieldUpdater4;
        this.f4289g = atomicReferenceFieldUpdater5;
    }

    @Override // S0.a
    public final boolean b(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4288f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, c.f4283b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // S0.a
    public final boolean c(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4289g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // S0.a
    public final boolean d(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4287e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // S0.a
    public final void y(f fVar, f fVar2) {
        this.f4286d.lazySet(fVar, fVar2);
    }

    @Override // S0.a
    public final void z(f fVar, Thread thread) {
        this.f4285c.lazySet(fVar, thread);
    }
}
