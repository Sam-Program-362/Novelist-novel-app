package V;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class F extends T1.h implements Z1.l {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1313o = 1;

    /* renamed from: p, reason: collision with root package name */
    public int f1314p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f1315q;

    /* renamed from: r, reason: collision with root package name */
    public Object f1316r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1317s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Serializable f1318t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(N n, R1.h hVar, Z1.p pVar, R1.c cVar) {
        super(1, cVar);
        this.f1315q = n;
        this.f1317s = hVar;
        this.f1318t = (T1.h) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T1.h, Z1.p] */
    @Override // Z1.l
    public final Object f(Object obj) {
        R1.c cVar = (R1.c) obj;
        switch (this.f1313o) {
            case 0:
                return new F((a2.o) this.f1317s, this.f1315q, (a2.n) this.f1318t, cVar).m(O1.g.f1211a);
            default:
                return new F(this.f1315q, (R1.h) this.f1317s, (Z1.p) this.f1318t, cVar).m(O1.g.f1211a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r7v3, types: [T1.h, Z1.p] */
    @Override // T1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.F.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(a2.o oVar, N n, a2.n nVar, R1.c cVar) {
        super(1, cVar);
        this.f1317s = oVar;
        this.f1315q = n;
        this.f1318t = nVar;
    }
}
