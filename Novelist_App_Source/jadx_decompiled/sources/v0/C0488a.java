package v0;

import O1.g;
import R1.c;
import T1.h;
import V.C0099x;
import Z1.p;
import i2.InterfaceC0301s;
import l2.d;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488a extends h implements p {

    /* renamed from: o, reason: collision with root package name */
    public int f4619o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f4620p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C.a f4621q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488a(d dVar, C.a aVar, c cVar) {
        super(2, cVar);
        this.f4620p = dVar;
        this.f4621q = aVar;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0488a) i((c) obj2, (InterfaceC0301s) obj)).m(g.f1211a);
    }

    @Override // T1.a
    public final c i(c cVar, Object obj) {
        return new C0488a(this.f4620p, this.f4621q, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f4619o;
        if (i3 == 0) {
            H2.h.E(obj);
            C0099x c0099x = new C0099x(this.f4621q, 2);
            this.f4619o = 1;
            Object h3 = this.f4620p.h(c0099x, this);
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
        return g.f1211a;
    }
}
