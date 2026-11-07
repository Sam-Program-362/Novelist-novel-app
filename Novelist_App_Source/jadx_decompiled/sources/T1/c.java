package T1;

import i2.C0290g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: l, reason: collision with root package name */
    public final R1.h f1277l;

    /* renamed from: m, reason: collision with root package name */
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
            R1.f e3 = getContext().e(R1.d.f1254k);
            a2.h.b(e3);
            n2.f fVar = (n2.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n2.f.f4152r;
            while (atomicReferenceFieldUpdater.get(fVar) == n2.a.f4142c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0290g c0290g = obj instanceof C0290g ? (C0290g) obj : null;
            if (c0290g != null) {
                c0290g.o();
            }
        }
        this.f1278m = b.f1276k;
    }

    public c(R1.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
