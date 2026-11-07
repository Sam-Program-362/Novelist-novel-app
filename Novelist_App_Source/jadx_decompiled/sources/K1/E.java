package K1;

import i2.InterfaceC0301s;

/* loaded from: classes.dex */
public final class E extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f671o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L f672p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f673q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f674r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(L l3, String str, String str2, R1.c cVar) {
        super(2, cVar);
        this.f672p = l3;
        this.f673q = str;
        this.f674r = str2;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((E) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new E(this.f672p, this.f673q, this.f674r, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f671o;
        if (i3 == 0) {
            H2.h.E(obj);
            this.f671o = 1;
            Object h3 = L.h(this.f672p, this.f673q, this.f674r, this);
            S1.a aVar = S1.a.f1260k;
            if (h3 == aVar) {
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
