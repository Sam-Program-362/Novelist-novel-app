package p020g2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f2849a;

    public a(d dVar) {
        this.f2849a = new AtomicReference(dVar);
    }

    @Override // p020g2.d
    public final Iterator iterator() {
        d dVar = (d) this.f2849a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
