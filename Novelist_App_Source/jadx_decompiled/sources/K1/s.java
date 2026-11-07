package K1;

import V.InterfaceC0084h;
import android.content.Context;
import i2.InterfaceC0301s;

/* loaded from: classes.dex */
public final class s extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public a2.o f752o;

    /* renamed from: p, reason: collision with root package name */
    public int f753p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f754q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L f755r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a2.o f756s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, L l3, a2.o oVar, R1.c cVar) {
        super(2, cVar);
        this.f754q = str;
        this.f755r = l3;
        this.f756s = oVar;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((s) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new s(this.f754q, this.f755r, this.f756s, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        a2.o oVar;
        int i3 = this.f753p;
        if (i3 == 0) {
            H2.h.E(obj);
            Y.d dVar = new Y.d(this.f754q);
            L l3 = this.f755r;
            Context context = l3.f697k;
            if (context == null) {
                a2.h.g("context");
                throw null;
            }
            A0.j jVar = new A0.j(((InterfaceC0084h) M.a(context).f90l).getData(), dVar, l3, 8);
            oVar = this.f756s;
            this.f752o = oVar;
            this.f753p = 1;
            obj = l2.r.c(jVar, this);
            S1.a aVar = S1.a.f1260k;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f752o;
            H2.h.E(obj);
        }
        oVar.f1713k = obj;
        return O1.g.f1211a;
    }
}
