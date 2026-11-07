package K1;

import i2.InterfaceC0210s;
import java.util.List;

/* JADX INFO: renamed from: K1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0036l extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L f732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f733q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0036l(L l3, List list, R1.c cVar) {
        super(2, cVar);
        this.f732p = l3;
        this.f733q = list;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0036l) i((R1.c) obj2, (InterfaceC0210s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new C0036l(this.f732p, this.f733q, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f731o;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
            return obj;
        }
        H2.h.E(obj);
        this.f731o = 1;
        Object objK = L.k(this.f732p, this.f733q, this);
        S1.a aVar = S1.a.f1260k;
        return objK == aVar ? aVar : objK;
    }
}
