package K1;

import V.InterfaceC0084h;
import android.content.Context;
import i2.InterfaceC0301s;

/* loaded from: classes.dex */
public final class y extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public a2.o f775o;

    /* renamed from: p, reason: collision with root package name */
    public int f776p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f777q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L f778r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a2.o f779s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, L l3, a2.o oVar, R1.c cVar) {
        super(2, cVar);
        this.f777q = str;
        this.f778r = l3;
        this.f779s = oVar;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((y) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new y(this.f777q, this.f778r, this.f779s, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        a2.o oVar;
        int i3 = this.f776p;
        if (i3 == 0) {
            H2.h.E(obj);
            Y.d dVar = new Y.d(this.f777q);
            Context context = this.f778r.f697k;
            if (context == null) {
                a2.h.g("context");
                throw null;
            }
            C0039o c0039o = new C0039o(((InterfaceC0084h) M.a(context).f90l).getData(), dVar, 2);
            oVar = this.f779s;
            this.f775o = oVar;
            this.f776p = 1;
            obj = l2.r.c(c0039o, this);
            S1.a aVar = S1.a.f1260k;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f775o;
            H2.h.E(obj);
        }
        oVar.f1713k = obj;
        return O1.g.f1211a;
    }
}
