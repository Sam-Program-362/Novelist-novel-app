package i2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: i2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0201i extends S {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3009f;

    public /* synthetic */ C0201i(Object obj, int i3) {
        this.f3008e = i3;
        this.f3009f = obj;
    }

    @Override // i2.S
    public final boolean k() {
        switch (this.f3008e) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override // i2.S
    public final void l(Throwable th) {
        switch (this.f3008e) {
            case 0:
                C0199g c0199g = (C0199g) this.f3009f;
                Throwable thQ = c0199g.q(j());
                if (c0199g.v()) {
                    n2.f fVar = (n2.f) c0199g.n;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n2.f.f4152r;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        B1.g gVar = n2.a.f4142c;
                        if (a2.h.a(obj, gVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, gVar, thQ)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != gVar) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                c0199g.n(thQ);
                if (!c0199g.v()) {
                    c0199g.o();
                }
                break;
            case 1:
                ((Z1.l) this.f3009f).f(th);
                break;
            default:
                T t3 = (T) this.f3009f;
                Object obj2 = W.f2990k.get(j());
                if (!(obj2 instanceof C0207o)) {
                    t3.resumeWith(AbstractC0212u.l(obj2));
                } else {
                    t3.resumeWith(H2.h.i(((C0207o) obj2).f3017a));
                }
                break;
        }
    }
}
