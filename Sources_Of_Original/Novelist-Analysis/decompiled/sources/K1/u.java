package K1;

import V.InterfaceC0084h;
import android.content.Context;
import i2.InterfaceC0210s;

/* JADX INFO: loaded from: classes.dex */
public final class u extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a2.o f759o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L f762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a2.o f763s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, L l3, a2.o oVar, R1.c cVar) {
        super(2, cVar);
        this.f761q = str;
        this.f762r = l3;
        this.f763s = oVar;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((u) i((R1.c) obj2, (InterfaceC0210s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new u(this.f761q, this.f762r, this.f763s, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        a2.o oVar;
        int i3 = this.f760p;
        if (i3 == 0) {
            H2.h.E(obj);
            Y.d dVar = new Y.d(this.f761q);
            Context context = this.f762r.f697k;
            if (context == null) {
                a2.h.g("context");
                throw null;
            }
            C0039o c0039o = new C0039o(((InterfaceC0084h) M.a(context).f90l).getData(), dVar, 1);
            oVar = this.f763s;
            this.f759o = oVar;
            this.f760p = 1;
            obj = l2.r.c(c0039o, this);
            S1.a aVar = S1.a.f1260k;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f759o;
            H2.h.E(obj);
        }
        oVar.f1713k = obj;
        return O1.g.f1211a;
    }
}
