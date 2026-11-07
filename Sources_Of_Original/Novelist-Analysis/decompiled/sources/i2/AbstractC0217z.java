package i2;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: i2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0217z extends p2.i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3038m;

    public AbstractC0217z(int i3) {
        super(0L, false);
        this.f3038m = i3;
    }

    public abstract R1.c d();

    public Throwable e(Object obj) {
        C0207o c0207o = obj instanceof C0207o ? (C0207o) obj : null;
        if (c0207o != null) {
            return c0207o.f3017a;
        }
        return null;
    }

    public final void g(Throwable th) {
        AbstractC0212u.e(d().getContext(), new Y1.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            R1.c cVarD = d();
            a2.h.c(cVarD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            n2.f fVar = (n2.f) cVarD;
            T1.c cVar = fVar.f4153o;
            Object obj = fVar.f4155q;
            R1.h context = cVar.getContext();
            Object objL = n2.a.l(context, obj);
            N n = null;
            g0 g0VarM = objL != n2.a.f4143d ? AbstractC0212u.m(cVar, context, objL) : null;
            try {
                R1.h context2 = cVar.getContext();
                Object objH = h();
                Throwable thE = e(objH);
                if (thE == null) {
                    int i3 = this.f3038m;
                    boolean z3 = true;
                    if (i3 != 1 && i3 != 2) {
                        z3 = false;
                    }
                    if (z3) {
                        n = (N) context2.e(r.f3022l);
                    }
                }
                if (n != null && !n.a()) {
                    CancellationException cancellationExceptionW = ((W) n).w();
                    b(cancellationExceptionW);
                    cVar.resumeWith(H2.h.i(cancellationExceptionW));
                } else if (thE != null) {
                    cVar.resumeWith(H2.h.i(thE));
                } else {
                    cVar.resumeWith(f(objH));
                }
            } finally {
                if (g0VarM == null || g0VarM.U()) {
                    n2.a.g(context, objL);
                }
            }
        } catch (Throwable th) {
            g(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
