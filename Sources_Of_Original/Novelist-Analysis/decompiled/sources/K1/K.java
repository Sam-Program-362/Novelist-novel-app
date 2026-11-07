package K1;

import i2.InterfaceC0210s;

/* JADX INFO: loaded from: classes.dex */
public final class K extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f693o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L f694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f696r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l3, String str, String str2, R1.c cVar) {
        super(2, cVar);
        this.f694p = l3;
        this.f695q = str;
        this.f696r = str2;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((K) i((R1.c) obj2, (InterfaceC0210s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new K(this.f694p, this.f695q, this.f696r, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f693o;
        if (i3 == 0) {
            H2.h.E(obj);
            this.f693o = 1;
            Object objH = L.h(this.f694p, this.f695q, this.f696r, this);
            S1.a aVar = S1.a.f1260k;
            if (objH == aVar) {
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
