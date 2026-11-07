package q2;

import i2.AbstractC0212u;
import i2.C0199g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4313g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = d.f4314a;

    public final Object c(T1.c cVar) throws Throwable {
        boolean zD = d();
        O1.g gVar = O1.g.f1211a;
        if (!zD) {
            C0199g c0199gD = AbstractC0212u.d(H2.h.s(cVar));
            try {
                a(new b(this, c0199gD));
                Object objR = c0199gD.r();
                S1.a aVar = S1.a.f1260k;
                if (objR != aVar) {
                    objR = gVar;
                }
                if (objR == aVar) {
                    return objR;
                }
            } catch (Throwable th) {
                c0199gD.y();
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
                    if (i3 <= 1) {
                        break;
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
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, gVar)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0212u.c(this));
        sb.append("[isLocked=");
        sb.append(Math.max(g.f4321f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f4313g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
