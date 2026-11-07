package androidx.lifecycle;

import d0.AbstractC0231b;
import d0.C0230a;
import e0.C0238a;
import java.util.Iterator;
import java.util.Map;
import m.C0422b;
import m.C0426f;
import m0.C0428b;
import m0.InterfaceC0430d;
import m0.InterfaceC0431e;

/* loaded from: classes.dex */
public abstract class L implements Q {

    /* renamed from: a, reason: collision with root package name */
    public static final M1.A f2127a = new M1.A(9);

    /* renamed from: b, reason: collision with root package name */
    public static final M1.A f2128b = new M1.A(10);

    /* renamed from: c, reason: collision with root package name */
    public static final M1.A f2129c = new M1.A(8);

    /* renamed from: d, reason: collision with root package name */
    public static final M1.A f2130d = new M1.A(11);

    public static final void c(P p3, B1.p pVar, AbstractC0142n abstractC0142n) {
        AutoCloseable autoCloseable;
        a2.h.e(pVar, "registry");
        a2.h.e(abstractC0142n, "lifecycle");
        C0238a c0238a = p3.f2136a;
        if (c0238a != null) {
            synchronized (c0238a.f2776a) {
                autoCloseable = (AutoCloseable) c0238a.f2777b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(InterfaceC0431e interfaceC0431e) {
        InterfaceC0430d interfaceC0430d;
        EnumC0141m enumC0141m = interfaceC0431e.h().f2160c;
        if (enumC0141m != EnumC0141m.f2151l && enumC0141m != EnumC0141m.f2152m) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it2 = ((C0426f) interfaceC0431e.c().f136d).iterator();
        while (true) {
            C0422b c0422b = (C0422b) it2;
            if (!c0422b.hasNext()) {
                interfaceC0430d = null;
                break;
            }
            Map.Entry entry = (Map.Entry) c0422b.next();
            a2.h.d(entry, "components");
            String str = (String) entry.getKey();
            interfaceC0430d = (InterfaceC0430d) entry.getValue();
            if (a2.h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC0430d == null) {
            M m3 = new M(interfaceC0431e.c(), (T) interfaceC0431e);
            interfaceC0431e.c().c("androidx.lifecycle.internal.SavedStateHandlesProvider", m3);
            interfaceC0431e.h().a(new C0428b(m3, 2));
        }
    }

    public static final N e(T t3) {
        K k3 = new K();
        S f3 = t3.f();
        AbstractC0231b a3 = t3 instanceof InterfaceC0136h ? ((InterfaceC0136h) t3).a() : C0230a.f2768b;
        a2.h.e(f3, "store");
        a2.h.e(a3, "defaultCreationExtras");
        return (N) new A0.j(f3, k3, a3).C(a2.p.a(N.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
