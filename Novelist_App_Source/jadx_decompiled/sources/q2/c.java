package q2;

import i2.AbstractC0303u;
import i2.C0290g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c extends g implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4313g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = d.f4314a;

    public final Object c(T1.c cVar) {
        boolean d3 = d();
        O1.g gVar = O1.g.f1211a;
        if (!d3) {
            C0290g d4 = AbstractC0303u.d(H2.h.s(cVar));
            try {
                a(new b(this, d4));
                Object r3 = d4.r();
                S1.a aVar = S1.a.f1260k;
                if (r3 != aVar) {
                    r3 = gVar;
                }
                if (r3 == aVar) {
                    return r3;
                }
            } catch (Throwable th) {
                d4.y();
                throw th;
            }
        }
        return gVar;
    }

    public final boolean d() {
        int i3;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f4321f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
            } else {
                if (i4 <= 0) {
                    c3 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    f4313g.set(this, null);
                    c3 = 0;
                    break;
                }
            }
        }
        if (c3 == 0) {
            return true;
        }
        if (c3 == 1) {
            return false;
        }
        if (c3 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void e(Object obj) {
        while (Math.max(g.f4321f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4313g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            B1.g gVar = d.f4314a;
            if (obj2 != gVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, gVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0303u.c(this));
        sb.append("[isLocked=");
        sb.append(Math.max(g.f4321f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f4313g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
