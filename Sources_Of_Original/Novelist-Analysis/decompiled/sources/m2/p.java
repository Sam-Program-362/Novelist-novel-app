package m2;

/* JADX INFO: loaded from: classes.dex */
public final class p implements R1.c, T1.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final R1.c f4128k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final R1.h f4129l;

    public p(R1.c cVar, R1.h hVar) {
        this.f4128k = cVar;
        this.f4129l = hVar;
    }

    @Override // T1.d
    public final T1.d c() {
        R1.c cVar = this.f4128k;
        if (cVar instanceof T1.d) {
            return (T1.d) cVar;
        }
        return null;
    }

    @Override // R1.c
    public final R1.h getContext() {
        return this.f4129l;
    }

    @Override // R1.c
    public final void resumeWith(Object obj) {
        this.f4128k.resumeWith(obj);
    }
}
