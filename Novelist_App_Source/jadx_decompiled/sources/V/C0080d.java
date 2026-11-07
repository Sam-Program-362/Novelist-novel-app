package V;

import java.util.List;

/* renamed from: V.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080d extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f1396o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1397p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f1398q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0080d(List list, R1.c cVar) {
        super(2, cVar);
        this.f1398q = list;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0080d) i((R1.c) obj2, (C0087k) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        C0080d c0080d = new C0080d(this.f1398q, cVar);
        c0080d.f1397p = obj;
        return c0080d;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f1396o;
        if (i3 == 0) {
            H2.h.E(obj);
            C0087k c0087k = (C0087k) this.f1397p;
            this.f1396o = 1;
            Object a3 = S0.a.a(this.f1398q, c0087k, this);
            S1.a aVar = S1.a.f1260k;
            if (a3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
        }
        return O1.g.f1211a;
    }
}
