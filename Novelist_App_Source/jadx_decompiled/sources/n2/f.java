package n2;

import i2.AbstractC0300q;
import i2.AbstractC0303u;
import i2.AbstractC0308z;
import i2.C0298o;
import i2.G;
import i2.e0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f extends AbstractC0308z implements T1.d, R1.c {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4152r = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final AbstractC0300q n;

    /* renamed from: o, reason: collision with root package name */
    public final T1.c f4153o;

    /* renamed from: p, reason: collision with root package name */
    public Object f4154p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f4155q;

    public f(AbstractC0300q abstractC0300q, T1.c cVar) {
        super(-1);
        this.n = abstractC0300q;
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

    @Override // i2.AbstractC0308z
    public final Object h() {
        Object obj = this.f4154p;
        this.f4154p = a.f4141b;
        return obj;
    }

    @Override // R1.c
    public final void resumeWith(Object obj) {
        Throwable a3 = O1.d.a(obj);
        Object c0298o = a3 == null ? obj : new C0298o(a3, false);
        T1.c cVar = this.f4153o;
        R1.h context = cVar.getContext();
        AbstractC0300q abstractC0300q = this.n;
        if (abstractC0300q.d(context)) {
            this.f4154p = c0298o;
            this.f3038m = 0;
            abstractC0300q.c(cVar.getContext(), this);
            return;
        }
        G a4 = e0.a();
        if (a4.f2971m >= 4294967296L) {
            this.f4154p = c0298o;
            this.f3038m = 0;
            P1.c cVar2 = a4.f2972o;
            if (cVar2 == null) {
                cVar2 = new P1.c();
                a4.f2972o = cVar2;
            }
            cVar2.addLast(this);
            return;
        }
        a4.l(true);
        try {
            R1.h context2 = cVar.getContext();
            Object l3 = a.l(context2, this.f4155q);
            try {
                cVar.resumeWith(obj);
                while (a4.n()) {
                }
            } finally {
                a.g(context2, l3);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.n + ", " + AbstractC0303u.k(this.f4153o) + ']';
    }

    @Override // i2.AbstractC0308z
    public final R1.c d() {
        return this;
    }
}
