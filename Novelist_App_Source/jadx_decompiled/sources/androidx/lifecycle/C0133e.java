package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133e implements InterfaceC0145q {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2146k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2147l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f2148m;

    public C0133e(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC0145q interfaceC0145q) {
        a2.h.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f2147l = defaultLifecycleObserver;
        this.f2148m = interfaceC0145q;
    }

    @Override // androidx.lifecycle.InterfaceC0145q
    public final void d(InterfaceC0146s interfaceC0146s, EnumC0140l enumC0140l) {
        switch (this.f2146k) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f2147l;
                switch (AbstractC0132d.f2145a[enumC0140l.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.c(interfaceC0146s);
                        break;
                    case 2:
                        defaultLifecycleObserver.f(interfaceC0146s);
                        break;
                    case 3:
                        defaultLifecycleObserver.a(interfaceC0146s);
                        break;
                    case 4:
                        defaultLifecycleObserver.e(interfaceC0146s);
                        break;
                    case 5:
                        defaultLifecycleObserver.g(interfaceC0146s);
                        break;
                    case 6:
                        defaultLifecycleObserver.b(interfaceC0146s);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0145q interfaceC0145q = (InterfaceC0145q) this.f2148m;
                if (interfaceC0145q != null) {
                    interfaceC0145q.d(interfaceC0146s, enumC0140l);
                    return;
                }
                return;
            case 1:
                if (enumC0140l == EnumC0140l.ON_START) {
                    ((AbstractC0142n) this.f2147l).b(this);
                    ((B1.p) this.f2148m).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0129a) this.f2148m).f2138a;
                List list = (List) hashMap.get(enumC0140l);
                Object obj = this.f2147l;
                C0129a.a(list, interfaceC0146s, enumC0140l, obj);
                C0129a.a((List) hashMap.get(EnumC0140l.ON_ANY), interfaceC0146s, enumC0140l, obj);
                return;
        }
    }

    public C0133e(r rVar) {
        this.f2147l = rVar;
        C0131c c0131c = C0131c.f2142c;
        Class<?> cls = rVar.getClass();
        C0129a c0129a = (C0129a) c0131c.f2143a.get(cls);
        this.f2148m = c0129a == null ? c0131c.a(cls, null) : c0129a;
    }

    public C0133e(B1.p pVar, AbstractC0142n abstractC0142n) {
        this.f2147l = abstractC0142n;
        this.f2148m = pVar;
    }
}
