package V;

import i2.InterfaceC0301s;

/* renamed from: V.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100y extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f1485o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f1486p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0100y(N n, R1.c cVar) {
        super(2, cVar);
        this.f1486p = n;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0100y) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new C0100y(this.f1486p, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r9 == r5) goto L23;
     */
    @Override // T1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f1485o
            O1.g r1 = O1.g.f1211a
            r2 = 2
            r3 = 1
            V.N r4 = r8.f1486p
            S1.a r5 = S1.a.f1260k
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            H2.h.E(r9)
            return r1
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            H2.h.E(r9)
            goto L36
        L20:
            H2.h.E(r9)
            B1.s r9 = r4.f1348s
            r8.f1485o = r3
            java.lang.Object r9 = r9.f145l
            i2.m r9 = (i2.C0296m) r9
            java.lang.Object r9 = r9.R(r8)
            if (r9 != r5) goto L32
            goto L33
        L32:
            r9 = r1
        L33:
            if (r9 != r5) goto L36
            goto L63
        L36:
            V.i0 r9 = r4.g()
            B1.a r9 = r9.f1427c
            boolean r0 = r9 instanceof m2.i
            r6 = 0
            k2.a r7 = k2.a.f3868l
            if (r0 == 0) goto L4d
            m2.i r9 = (m2.i) r9
            r0 = 0
            l2.c r9 = (l2.c) r9
            l2.d r9 = m2.k.a(r9, r0, r6, r7, r3)
            goto L55
        L4d:
            m2.g r0 = new m2.g
            R1.i r3 = R1.i.f1255k
            r0.<init>(r9, r3, r6, r7)
            r9 = r0
        L55:
            V.x r0 = new V.x
            r3 = 0
            r0.<init>(r4, r3)
            r8.f1485o = r2
            java.lang.Object r9 = r9.h(r0, r8)
            if (r9 != r5) goto L64
        L63:
            return r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C0100y.m(java.lang.Object):java.lang.Object");
    }
}
