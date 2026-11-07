package k2;

import i2.AbstractC0284a;
import i2.AbstractC0303u;
import i2.C0298o;
import i2.O;
import i2.V;
import i2.W;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class p extends AbstractC0284a implements q, g {
    public final c n;

    public p(R1.h hVar, c cVar) {
        super(hVar, true);
        this.n = cVar;
    }

    @Override // i2.AbstractC0284a
    public final void R(Throwable th, boolean z3) {
        if (this.n.f(th, false) || z3) {
            return;
        }
        AbstractC0303u.e(this.f2993m, th);
    }

    @Override // i2.AbstractC0284a
    public final void S(Object obj) {
        this.n.f(null, false);
    }

    public final void U(o oVar) {
        c cVar = this.n;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f3880t;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, oVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    B1.g gVar = e.f3898q;
                    if (obj != gVar) {
                        if (obj == e.f3899r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    B1.g gVar2 = e.f3899r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, gVar, gVar2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != gVar) {
                            break;
                        }
                    }
                    oVar.f(cVar.m());
                    return;
                }
            }
        }
    }

    @Override // i2.W, i2.N
    public final void b(CancellationException cancellationException) {
        Object obj = W.f2990k.get(this);
        if (obj instanceof C0298o) {
            return;
        }
        if ((obj instanceof V) && ((V) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new O(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // k2.s
    public final Object g(R1.c cVar, Object obj) {
        return this.n.g(cVar, obj);
    }

    @Override // k2.s
    public final Object h(Object obj) {
        return this.n.h(obj);
    }

    @Override // i2.W
    public final void p(CancellationException cancellationException) {
        this.n.f(cancellationException, true);
        o(cancellationException);
    }
}
