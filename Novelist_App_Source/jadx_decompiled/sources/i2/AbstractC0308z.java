package i2;

import java.util.concurrent.CancellationException;

/* renamed from: i2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0308z extends p2.i {

    /* renamed from: m, reason: collision with root package name */
    public int f3038m;

    public AbstractC0308z(int i3) {
        super(0L, false);
        this.f3038m = i3;
    }

    public abstract R1.c d();

    public Throwable e(Object obj) {
        C0298o c0298o = obj instanceof C0298o ? (C0298o) obj : null;
        if (c0298o != null) {
            return c0298o.f3017a;
        }
        return null;
    }

    public final void g(Throwable th) {
        AbstractC0303u.e(d().getContext(), new Y1.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (i2.N) r5.e(i2.r.f3022l);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            R1.c r0 = r11.d()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            a2.h.c(r0, r1)     // Catch: java.lang.Throwable -> L21
            n2.f r0 = (n2.f) r0     // Catch: java.lang.Throwable -> L21
            T1.c r1 = r0.f4153o     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.f4155q     // Catch: java.lang.Throwable -> L21
            R1.h r2 = r1.getContext()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = n2.a.l(r2, r0)     // Catch: java.lang.Throwable -> L21
            B1.g r3 = n2.a.f4143d     // Catch: java.lang.Throwable -> L21
            r4 = 0
            if (r0 == r3) goto L24
            i2.g0 r3 = i2.AbstractC0303u.m(r1, r2, r0)     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r0 = move-exception
            goto L8e
        L24:
            r3 = r4
        L25:
            R1.h r5 = r1.getContext()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = r11.h()     // Catch: java.lang.Throwable -> L48
            java.lang.Throwable r7 = r11.e(r6)     // Catch: java.lang.Throwable -> L48
            if (r7 != 0) goto L4a
            int r8 = r11.f3038m     // Catch: java.lang.Throwable -> L48
            r9 = 1
            if (r8 == r9) goto L3d
            r10 = 2
            if (r8 != r10) goto L3c
            goto L3d
        L3c:
            r9 = 0
        L3d:
            if (r9 == 0) goto L4a
            i2.r r4 = i2.r.f3022l     // Catch: java.lang.Throwable -> L48
            R1.f r4 = r5.e(r4)     // Catch: java.lang.Throwable -> L48
            i2.N r4 = (i2.N) r4     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r1 = move-exception
            goto L82
        L4a:
            if (r4 == 0) goto L63
            boolean r5 = r4.a()     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L63
            i2.W r4 = (i2.W) r4     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.CancellationException r4 = r4.w()     // Catch: java.lang.Throwable -> L48
            r11.b(r4)     // Catch: java.lang.Throwable -> L48
            O1.c r4 = H2.h.i(r4)     // Catch: java.lang.Throwable -> L48
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L48
            goto L74
        L63:
            if (r7 == 0) goto L6d
            O1.c r4 = H2.h.i(r7)     // Catch: java.lang.Throwable -> L48
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L48
            goto L74
        L6d:
            java.lang.Object r4 = r11.f(r6)     // Catch: java.lang.Throwable -> L48
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L48
        L74:
            if (r3 == 0) goto L7e
            boolean r1 = r3.U()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            n2.a.g(r2, r0)     // Catch: java.lang.Throwable -> L21
            return
        L82:
            if (r3 == 0) goto L8a
            boolean r3 = r3.U()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L8d
        L8a:
            n2.a.g(r2, r0)     // Catch: java.lang.Throwable -> L21
        L8d:
            throw r1     // Catch: java.lang.Throwable -> L21
        L8e:
            r11.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.AbstractC0308z.run():void");
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
