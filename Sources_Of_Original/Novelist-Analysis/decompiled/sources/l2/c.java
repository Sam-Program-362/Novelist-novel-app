package l2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends m2.e {
    public final p064x0.i n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p064x0.i f4038o;

    public c(p064x0.i iVar, R1.h hVar, int i3, k2.a aVar) {
        super(hVar, i3, aVar);
        this.n = iVar;
        this.f4038o = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // m2.e
    public final Object a(k2.q qVar, R1.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i3 = bVar.f4037q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f4037q = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (T1.c) cVar);
            }
        } else {
            bVar = new b(this, (T1.c) cVar);
        }
        Object obj = bVar.f4035o;
        int i4 = bVar.f4037q;
        O1.g gVar = O1.g.f1211a;
        if (i4 == 0) {
            H2.h.E(obj);
            bVar.n = qVar;
            bVar.f4037q = 1;
            Object objE = this.n.e(qVar, bVar);
            S1.a aVar = S1.a.f1260k;
            if (objE != aVar) {
                objE = gVar;
            }
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = bVar.n;
            H2.h.E(obj);
        }
        if (((k2.p) qVar).n.s()) {
            return gVar;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // m2.e
    public final String toString() {
        return "block[" + this.n + "] -> " + super.toString();
    }
}
