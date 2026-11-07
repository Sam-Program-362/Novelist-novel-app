package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0131e implements InterfaceC0143q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2146k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f2147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f2148m;

    public C0131e(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC0143q interfaceC0143q) {
        a2.h.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f2147l = defaultLifecycleObserver;
        this.f2148m = interfaceC0143q;
    }

    @Override // androidx.lifecycle.InterfaceC0143q
    public final void d(InterfaceC0144s interfaceC0144s, EnumC0138l enumC0138l) {
        switch (this.f2146k) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f2147l;
                switch (AbstractC0130d.f2145a[enumC0138l.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.c(interfaceC0144s);
                        break;
                    case 2:
                        defaultLifecycleObserver.f(interfaceC0144s);
                        break;
                    case 3:
                        defaultLifecycleObserver.a(interfaceC0144s);
                        break;
                    case 4:
                        defaultLifecycleObserver.e(interfaceC0144s);
                        break;
                    case 5:
                        defaultLifecycleObserver.g(interfaceC0144s);
                        break;
                    case 6:
                        defaultLifecycleObserver.b(interfaceC0144s);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0143q interfaceC0143q = (InterfaceC0143q) this.f2148m;
                if (interfaceC0143q != null) {
                    interfaceC0143q.d(interfaceC0144s, enumC0138l);
                    return;
                }
                return;
            case 1:
                if (enumC0138l == EnumC0138l.ON_START) {
                    ((AbstractC0140n) this.f2147l).b(this);
                    ((B1.p) this.f2148m).d();
                    return;
                }
                return;
            default:
                HashMap map = ((C0127a) this.f2148m).f2138a;
                List list = (List) map.get(enumC0138l);
                Object obj = this.f2147l;
                C0127a.a(list, interfaceC0144s, enumC0138l, obj);
                C0127a.a((List) map.get(EnumC0138l.ON_ANY), interfaceC0144s, enumC0138l, obj);
                return;
        }
    }

    public C0131e(r rVar) {
        this.f2147l = rVar;
        C0129c c0129c = C0129c.f2142c;
        Class<?> cls = rVar.getClass();
        C0127a c0127a = (C0127a) c0129c.f2143a.get(cls);
        this.f2148m = c0127a == null ? c0129c.a(cls, null) : c0127a;
    }

    public C0131e(B1.p pVar, AbstractC0140n abstractC0140n) {
        this.f2147l = abstractC0140n;
        this.f2148m = pVar;
    }
}
