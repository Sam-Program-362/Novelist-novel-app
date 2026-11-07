package K1;

import i2.InterfaceC0301s;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f764o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L f765p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f766q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(L l3, List list, R1.c cVar) {
        super(2, cVar);
        this.f765p = l3;
        this.f766q = list;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((v) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new v(this.f765p, this.f766q, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f764o;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
            return obj;
        }
        H2.h.E(obj);
        this.f764o = 1;
        Object k3 = L.k(this.f765p, this.f766q, this);
        S1.a aVar = S1.a.f1260k;
        return k3 == aVar ? aVar : k3;
    }
}
