package n2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4164a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4164a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int a3 = mVar.a(runnable);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                m c3 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c3) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4164a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c3 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c3) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) f4164a.get(this);
        mVar.getClass();
        long j3 = m.f4167f.get(mVar);
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4164a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d3 = mVar.d();
            if (d3 != m.f4168g) {
                return d3;
            }
            m c3 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c3) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
