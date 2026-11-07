package V;

/* JADX INFO: renamed from: V.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0091o extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1456o;

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0091o) i((R1.c) obj2, (j0) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        C0091o c0091o = new C0091o(2, cVar);
        c0091o.f1456o = obj;
        return c0091o;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        H2.h.E(obj);
        return Boolean.valueOf(!(((j0) this.f1456o) instanceof Z));
    }
}
