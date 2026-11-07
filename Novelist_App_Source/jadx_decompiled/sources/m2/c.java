package m2;

import i2.A;
import i2.AbstractC0303u;
import i2.EnumC0302t;
import i2.InterfaceC0301s;
import l2.r;

/* loaded from: classes.dex */
public final class c extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f4104o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f4105p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l2.e f4106q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f4107r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l2.e eVar, e eVar2, R1.c cVar) {
        super(2, cVar);
        this.f4106q = eVar;
        this.f4107r = eVar2;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((c) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        c cVar2 = new c(this.f4106q, this.f4107r, cVar);
        cVar2.f4105p = obj;
        return cVar2;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f4104o;
        O1.g gVar = O1.g.f1211a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
            return gVar;
        }
        H2.h.E(obj);
        InterfaceC0301s interfaceC0301s = (InterfaceC0301s) this.f4105p;
        e eVar = this.f4107r;
        R1.h hVar = eVar.f4111k;
        int i4 = eVar.f4112l;
        if (i4 == -3) {
            i4 = -2;
        }
        k2.a aVar = eVar.f4113m;
        Z1.p dVar = new d(eVar, null);
        k2.c a3 = k2.j.a(i4, aVar, 4);
        R1.h b3 = AbstractC0303u.b(interfaceC0301s.d(), hVar, true);
        p2.e eVar2 = A.f2964a;
        if (b3 != eVar2 && b3.e(R1.d.f1254k) == null) {
            b3 = b3.i(eVar2);
        }
        k2.p pVar = new k2.p(b3, a3);
        pVar.T(EnumC0302t.f3024l, pVar, dVar);
        this.f4104o = 1;
        Object b4 = r.b(this.f4106q, pVar, true, this);
        S1.a aVar2 = S1.a.f1260k;
        if (b4 != aVar2) {
            b4 = gVar;
        }
        return b4 == aVar2 ? aVar2 : gVar;
    }
}
