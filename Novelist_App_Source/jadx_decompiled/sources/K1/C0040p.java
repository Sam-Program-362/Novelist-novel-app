package K1;

import V.InterfaceC0084h;
import android.content.Context;
import i2.InterfaceC0301s;

/* renamed from: K1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040p extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public a2.o f742o;

    /* renamed from: p, reason: collision with root package name */
    public int f743p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f744q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L f745r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a2.o f746s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040p(String str, L l3, a2.o oVar, R1.c cVar) {
        super(2, cVar);
        this.f744q = str;
        this.f745r = l3;
        this.f746s = oVar;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0040p) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new C0040p(this.f744q, this.f745r, this.f746s, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        a2.o oVar;
        int i3 = this.f743p;
        if (i3 == 0) {
            H2.h.E(obj);
            Y.d dVar = new Y.d(this.f744q);
            Context context = this.f745r.f697k;
            if (context == null) {
                a2.h.g("context");
                throw null;
            }
            C0039o c0039o = new C0039o(((InterfaceC0084h) M.a(context).f90l).getData(), dVar, 0);
            oVar = this.f746s;
            this.f742o = oVar;
            this.f743p = 1;
            obj = l2.r.c(c0039o, this);
            S1.a aVar = S1.a.f1260k;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f742o;
            H2.h.E(obj);
        }
        oVar.f1713k = obj;
        return O1.g.f1211a;
    }
}
