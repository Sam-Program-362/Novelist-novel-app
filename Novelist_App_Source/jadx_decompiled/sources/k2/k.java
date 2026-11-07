package k2;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class k extends n2.r {

    /* renamed from: e, reason: collision with root package name */
    public final c f3906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3907f;

    public k(long j3, k kVar, c cVar, int i3) {
        super(j3, kVar, i3);
        this.f3906e = cVar;
        this.f3907f = new AtomicReferenceArray(e.f3884b * 2);
    }

    @Override // n2.r
    public final int f() {
        return e.f3884b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        a2.h.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // n2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r5, R1.h r6) {
        /*
            r4 = this;
            int r6 = k2.e.f3884b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f3907f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.k(r5)
            boolean r1 = r6 instanceof i2.i0
            k2.c r2 = r4.f3906e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof k2.t
            if (r1 == 0) goto L21
            goto L62
        L21:
            B1.g r1 = k2.e.f3892j
            if (r6 == r1) goto L59
            B1.g r1 = k2.e.f3893k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            B1.g r1 = k2.e.f3889g
            if (r6 == r1) goto L11
            B1.g r1 = k2.e.f3888f
            if (r6 != r1) goto L33
            goto L11
        L33:
            B1.g r5 = k2.e.f3891i
            if (r6 == r5) goto L7c
            B1.g r5 = k2.e.f3886d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            B1.g r5 = k2.e.f3894l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.m(r5, r3)
            if (r0 == 0) goto L7c
            a2.h.b(r2)
            return
        L62:
            if (r0 == 0) goto L67
            B1.g r1 = k2.e.f3892j
            goto L69
        L67:
            B1.g r1 = k2.e.f3893k
        L69:
            boolean r6 = r4.j(r6, r1, r5)
            if (r6 == 0) goto L11
            r4.m(r5, r3)
            r6 = r0 ^ 1
            r4.l(r5, r6)
            if (r0 == 0) goto L7c
            a2.h.b(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.k.g(int, R1.h):void");
    }

    public final boolean j(Object obj, Object obj2, int i3) {
        AtomicReferenceArray atomicReferenceArray;
        int i4 = (i3 * 2) + 1;
        do {
            atomicReferenceArray = this.f3907f;
            if (atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i4) == obj);
        return false;
    }

    public final Object k(int i3) {
        return this.f3907f.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z3) {
        if (z3) {
            c cVar = this.f3906e;
            a2.h.b(cVar);
            cVar.C((this.f4176c * e.f3884b) + i3);
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f3907f.set(i3 * 2, obj);
    }

    public final void n(int i3, Object obj) {
        this.f3907f.set((i3 * 2) + 1, obj);
    }
}
