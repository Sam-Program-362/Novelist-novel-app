package T1;

import i2.C0199g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final R1.h f1277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient R1.c f1278m;

    public c(R1.c cVar, R1.h hVar) {
        super(cVar);
        this.f1277l = hVar;
    }

    @Override // R1.c
    public R1.h getContext() {
        R1.h hVar = this.f1277l;
        a2.h.b(hVar);
        return hVar;
    }

    @Override // T1.a
    public void n() {
        R1.c cVar = this.f1278m;
        if (cVar != null && cVar != this) {
            R1.f fVarE = getContext().e(R1.d.f1254k);
            a2.h.b(fVarE);
            n2.f fVar = (n2.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n2.f.f4152r;
            while (atomicReferenceFieldUpdater.get(fVar) == n2.a.f4142c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0199g c0199g = obj instanceof C0199g ? (C0199g) obj : null;
            if (c0199g != null) {
                c0199g.o();
            }
        }
        this.f1278m = b.f1276k;
    }

    public c(R1.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
