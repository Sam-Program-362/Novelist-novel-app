package androidx.lifecycle;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p010e0.a f2136a = new p010e0.a();

    public final void a() {
        p010e0.a aVar = this.f2136a;
        if (aVar != null && !aVar.f2779d) {
            aVar.f2779d = true;
            synchronized (aVar.f2776a) {
                try {
                    Iterator it2 = aVar.f2777b.values().iterator();
                    while (it2.hasNext()) {
                        p010e0.a.a((AutoCloseable) it2.next());
                    }
                    Iterator it3 = aVar.f2778c.iterator();
                    while (it3.hasNext()) {
                        p010e0.a.a((AutoCloseable) it3.next());
                    }
                    aVar.f2778c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
