package V;

import i2.InterfaceC0301s;

/* loaded from: classes.dex */
public final class H extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f1321o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ T1.h f1322p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0079c f1323q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(Z1.p pVar, C0079c c0079c, R1.c cVar) {
        super(2, cVar);
        this.f1322p = (T1.h) pVar;
        this.f1323q = c0079c;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((H) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.h, Z1.p] */
    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new H(this.f1322p, this.f1323q, cVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T1.h, Z1.p] */
    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f1321o;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
            return obj;
        }
        H2.h.E(obj);
        Object obj2 = this.f1323q.f1390b;
        this.f1321o = 1;
        Object e3 = this.f1322p.e(obj2, this);
        S1.a aVar = S1.a.f1260k;
        return e3 == aVar ? aVar : e3;
    }
}
