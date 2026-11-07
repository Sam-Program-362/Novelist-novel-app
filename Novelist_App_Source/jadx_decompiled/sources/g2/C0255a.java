package g2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2849a;

    public C0255a(d dVar) {
        this.f2849a = new AtomicReference(dVar);
    }

    @Override // g2.d
    public final Iterator iterator() {
        d dVar = (d) this.f2849a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
