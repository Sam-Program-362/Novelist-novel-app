package i2;

/* loaded from: classes.dex */
public final class g0 extends n2.q {

    /* renamed from: o, reason: collision with root package name */
    public final ThreadLocal f3005o;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g0(R1.h r3, T1.h r4) {
        /*
            r2 = this;
            i2.h0 r0 = i2.h0.f3007k
            R1.f r1 = r3.e(r0)
            if (r1 != 0) goto Ld
            R1.h r0 = r3.i(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r4, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f3005o = r0
            R1.h r4 = r4.f1277l
            a2.h.b(r4)
            R1.d r0 = R1.d.f1254k
            R1.f r4 = r4.e(r0)
            boolean r4 = r4 instanceof i2.AbstractC0300q
            if (r4 != 0) goto L32
            r4 = 0
            java.lang.Object r4 = n2.a.l(r3, r4)
            n2.a.g(r3, r4)
            r2.V(r3, r4)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.g0.<init>(R1.h, T1.h):void");
    }

    public final boolean U() {
        boolean z3 = this.threadLocalIsSet && this.f3005o.get() == null;
        this.f3005o.remove();
        return !z3;
    }

    public final void V(R1.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f3005o.set(new O1.b(hVar, obj));
    }

    @Override // n2.q, i2.W
    public final void n(Object obj) {
        if (this.threadLocalIsSet) {
            O1.b bVar = (O1.b) this.f3005o.get();
            if (bVar != null) {
                n2.a.g((R1.h) bVar.f1203k, bVar.f1204l);
            }
            this.f3005o.remove();
        }
        Object h3 = AbstractC0303u.h(obj);
        R1.c cVar = this.n;
        R1.h context = cVar.getContext();
        Object l3 = n2.a.l(context, null);
        g0 m3 = l3 != n2.a.f4143d ? AbstractC0303u.m(cVar, context, l3) : null;
        try {
            this.n.resumeWith(h3);
            if (m3 == null || m3.U()) {
                n2.a.g(context, l3);
            }
        } catch (Throwable th) {
            if (m3 == null || m3.U()) {
                n2.a.g(context, l3);
            }
            throw th;
        }
    }
}
