package i2;

/* JADX INFO: renamed from: i2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0205m extends W implements InterfaceC0204l {
    public final Object R(T1.h hVar) throws Throwable {
        Object obj;
        do {
            obj = W.f2990k.get(this);
            if (!(obj instanceof K)) {
                if (obj instanceof C0207o) {
                    throw ((C0207o) obj).f3017a;
                }
                return AbstractC0212u.l(obj);
            }
        } while (N(obj) < 0);
        T t3 = new T(H2.h.s(hVar), this);
        t3.s();
        t3.u(new C(AbstractC0212u.f(this, true, new C0201i(t3, 2))));
        return t3.r();
    }
}
