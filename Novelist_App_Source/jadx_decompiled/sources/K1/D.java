package K1;

import android.content.Context;
import i2.InterfaceC0301s;

/* loaded from: classes.dex */
public final class D extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f667o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f668p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ L f669q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f670r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(String str, L l3, boolean z3, R1.c cVar) {
        super(2, cVar);
        this.f668p = str;
        this.f669q = l3;
        this.f670r = z3;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((D) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new D(this.f668p, this.f669q, this.f670r, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f667o;
        if (i3 == 0) {
            H2.h.E(obj);
            Y.d dVar = new Y.d(this.f668p);
            Context context = this.f669q.f697k;
            if (context == null) {
                a2.h.g("context");
                throw null;
            }
            B1.g a3 = M.a(context);
            C c3 = new C(dVar, this.f670r, null);
            this.f667o = 1;
            Object d3 = a3.d(new Y.h(c3, null), this);
            S1.a aVar = S1.a.f1260k;
            if (d3 == aVar) {
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
