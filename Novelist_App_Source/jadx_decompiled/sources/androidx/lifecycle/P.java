package androidx.lifecycle;

import e0.C0238a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public final C0238a f2136a = new C0238a();

    public final void a() {
        C0238a c0238a = this.f2136a;
        if (c0238a != null && !c0238a.f2779d) {
            c0238a.f2779d = true;
            synchronized (c0238a.f2776a) {
                try {
                    Iterator it2 = c0238a.f2777b.values().iterator();
                    while (it2.hasNext()) {
                        C0238a.a((AutoCloseable) it2.next());
                    }
                    Iterator it3 = c0238a.f2778c.iterator();
                    while (it3.hasNext()) {
                        C0238a.a((AutoCloseable) it3.next());
                    }
                    c0238a.f2778c.clear();
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
