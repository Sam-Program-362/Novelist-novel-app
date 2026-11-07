package V;

/* JADX INFO: renamed from: V.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0082f extends T1.h implements Z1.l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1407o;

    @Override // Z1.l
    public final Object f(Object obj) {
        C0082f c0082f = new C0082f(1, (R1.c) obj);
        O1.g gVar = O1.g.f1211a;
        c0082f.m(gVar);
        return gVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f1407o;
        if (i3 == 0) {
            H2.h.E(obj);
            this.f1407o = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        H2.h.E(obj);
        return O1.g.f1211a;
    }
}
