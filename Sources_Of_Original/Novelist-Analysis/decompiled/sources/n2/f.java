package n2;

import i2.AbstractC0209q;
import i2.AbstractC0212u;
import i2.AbstractC0217z;
import i2.C0207o;
import i2.G;
import i2.e0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0217z implements T1.d, R1.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4152r = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final AbstractC0209q n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T1.c f4153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f4154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f4155q;

    public f(AbstractC0209q abstractC0209q, T1.c cVar) {
        super(-1);
        this.n = abstractC0209q;
        this.f4153o = cVar;
        this.f4154p = a.f4141b;
        this.f4155q = a.k(cVar.getContext());
    }

    @Override // T1.d
    public final T1.d c() {
        return this.f4153o;
    }

    @Override // R1.c
    public final R1.h getContext() {
        return this.f4153o.getContext();
    }

    @Override // i2.AbstractC0217z
    public final Object h() {
        Object obj = this.f4154p;
        this.f4154p = a.f4141b;
        return obj;
    }

    @Override // R1.c
    public final void resumeWith(Object obj) {
        Throwable thA = O1.d.a(obj);
        Object c0207o = thA == null ? obj : new C0207o(thA, false);
        T1.c cVar = this.f4153o;
        R1.h context = cVar.getContext();
        AbstractC0209q abstractC0209q = this.n;
        if (abstractC0209q.d(context)) {
            this.f4154p = c0207o;
            this.f3038m = 0;
            abstractC0209q.c(cVar.getContext(), this);
            return;
        }
        G gA = e0.a();
        if (gA.f2971m >= 4294967296L) {
            this.f4154p = c0207o;
            this.f3038m = 0;
            P1.c cVar2 = gA.f2972o;
            if (cVar2 == null) {
                cVar2 = new P1.c();
                gA.f2972o = cVar2;
            }
            cVar2.addLast(this);
            return;
        }
        gA.l(true);
        try {
            R1.h context2 = cVar.getContext();
            Object objL = a.l(context2, this.f4155q);
            try {
                cVar.resumeWith(obj);
                a.g(context2, objL);
                while (gA.n()) {
                }
            } catch (Throwable th) {
                a.g(context2, objL);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2);
            } finally {
                gA.h(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.n + ", " + AbstractC0212u.k(this.f4153o) + ']';
    }

    @Override // i2.AbstractC0217z
    public final R1.c d() {
        return this;
    }
}
