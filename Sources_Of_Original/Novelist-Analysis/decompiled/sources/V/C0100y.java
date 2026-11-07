package V;

import i2.C0205m;
import i2.InterfaceC0210s;

/* JADX INFO: renamed from: V.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0100y extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f1486p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0100y(N n, R1.c cVar) {
        super(2, cVar);
        this.f1486p = n;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0100y) i((R1.c) obj2, (InterfaceC0210s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new C0100y(this.f1486p, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) throws Throwable {
        int i3 = this.f1485o;
        O1.g gVar = O1.g.f1211a;
        N n = this.f1486p;
        S1.a aVar = S1.a.f1260k;
        if (i3 == 0) {
            H2.h.E(obj);
            B1.s sVar = n.f1348s;
            this.f1485o = 1;
            Object objR = ((C0205m) sVar.f145l).R(this);
            if (objR != aVar) {
                objR = gVar;
            }
            if (objR != aVar) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
            return gVar;
        }
        H2.h.E(obj);
        l2.d dVar = n.g().f1427c;
        boolean z3 = dVar instanceof m2.i;
        k2.a aVar2 = k2.a.f3868l;
        l2.d dVarA = z3 ? m2.k.a((l2.c) ((m2.i) dVar), null, 0, aVar2, 1) : new m2.g(dVar, R1.i.f1255k, 0, aVar2);
        C0099x c0099x = new C0099x(n, 0);
        this.f1485o = 2;
        return dVarA.h(c0099x, this) == aVar ? aVar : gVar;
    }
}
