package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class L implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M1.A f2127a = new M1.A(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M1.A f2128b = new M1.A(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M1.A f2129c = new M1.A(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M1.A f2130d = new M1.A(11);

    public static final void c(P p3, B1.p pVar, AbstractC0140n abstractC0140n) {
        AutoCloseable autoCloseable;
        a2.h.e(pVar, "registry");
        a2.h.e(abstractC0140n, "lifecycle");
        p010e0.a aVar = p3.f2136a;
        if (aVar != null) {
            synchronized (aVar.f2776a) {
                autoCloseable = (AutoCloseable) aVar.f2777b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(p038m0.e eVar) {
        p038m0.d dVar;
        String str;
        EnumC0139m enumC0139m = eVar.h().f2160c;
        if (enumC0139m != EnumC0139m.f2151l && enumC0139m != EnumC0139m.f2152m) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it2 = ((p037m.f) eVar.c().f136d).iterator();
        do {
            p037m.b bVar = (p037m.b) it2;
            if (!bVar.hasNext()) {
                dVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            a2.h.d(entry, "components");
            str = (String) entry.getKey();
            dVar = (p038m0.d) entry.getValue();
        } while (!a2.h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        if (dVar == null) {
            M m3 = new M(eVar.c(), (T) eVar);
            eVar.c().c("androidx.lifecycle.internal.SavedStateHandlesProvider", m3);
            eVar.h().a(new p038m0.b(m3, 2));
        }
    }

    public static final N e(T t3) {
        K k3 = new K();
        S sF = t3.f();
        p008d0.b bVarA = t3 instanceof InterfaceC0134h ? ((InterfaceC0134h) t3).a() : p008d0.a.f2768b;
        a2.h.e(sF, "store");
        a2.h.e(bVarA, "defaultCreationExtras");
        return (N) new A0.j(sF, k3, bVarA).C(a2.p.a(N.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
