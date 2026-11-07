package V;

import g1.C0254a;
import i2.AbstractC0303u;
import i2.C0296m;
import i2.InterfaceC0301s;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class I extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f1324o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1325p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f1326q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ T1.h f1327r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(N n, Z1.p pVar, R1.c cVar) {
        super(2, cVar);
        this.f1326q = n;
        this.f1327r = (T1.h) pVar;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((I) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T1.h, Z1.p] */
    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        I i3 = new I(this.f1326q, this.f1327r, cVar);
        i3.f1325p = obj;
        return i3;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [T1.h, Z1.p] */
    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f1324o;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
            return obj;
        }
        H2.h.E(obj);
        InterfaceC0301s interfaceC0301s = (InterfaceC0301s) this.f1325p;
        C0296m c0296m = new C0296m(true);
        c0296m.C(null);
        N n = this.f1326q;
        a0 a0Var = new a0(this.f1327r, c0296m, n.f1347r.g(), interfaceC0301s.d());
        B1.s sVar = n.f1350v;
        Object h3 = ((k2.c) sVar.f146m).h(a0Var);
        if (h3 instanceof k2.h) {
            k2.h hVar = (k2.h) h3;
            if (hVar == null) {
                hVar = null;
            }
            Throwable th = hVar != null ? hVar.f3904a : null;
            if (th == null) {
                throw new C0254a("Channel was closed normally");
            }
            throw th;
        }
        if (h3 instanceof k2.i) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) ((B1.g) sVar.n).f90l).getAndIncrement() == 0) {
            AbstractC0303u.g((InterfaceC0301s) sVar.f144k, new e0(sVar, null));
        }
        this.f1324o = 1;
        Object R2 = c0296m.R(this);
        S1.a aVar = S1.a.f1260k;
        return R2 == aVar ? aVar : R2;
    }
}
