package i2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: i2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292i extends S {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3008e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3009f;

    public /* synthetic */ C0292i(Object obj, int i3) {
        this.f3008e = i3;
        this.f3009f = obj;
    }

    @Override // i2.S
    public final boolean k() {
        switch (this.f3008e) {
        }
        return false;
    }

    @Override // i2.S
    public final void l(Throwable th) {
        switch (this.f3008e) {
            case 0:
                C0290g c0290g = (C0290g) this.f3009f;
                Throwable q3 = c0290g.q(j());
                if (c0290g.v()) {
                    n2.f fVar = (n2.f) c0290g.n;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n2.f.f4152r;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        B1.g gVar = n2.a.f4142c;
                        if (a2.h.a(obj, gVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, gVar, q3)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != gVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c0290g.n(q3);
                if (!c0290g.v()) {
                    c0290g.o();
                    break;
                }
                break;
            case 1:
                ((Z1.l) this.f3009f).f(th);
                break;
            default:
                T t3 = (T) this.f3009f;
                Object obj2 = W.f2990k.get(j());
                if (!(obj2 instanceof C0298o)) {
                    t3.resumeWith(AbstractC0303u.l(obj2));
                    break;
                } else {
                    t3.resumeWith(H2.h.i(((C0298o) obj2).f3017a));
                    break;
                }
        }
    }
}
