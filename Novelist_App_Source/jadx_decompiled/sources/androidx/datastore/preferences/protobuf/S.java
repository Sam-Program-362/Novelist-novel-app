package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: c, reason: collision with root package name */
    public static final S f2003c = new S();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2005b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final E f2004a = new E();

    public final V a(Class cls) {
        V v3;
        Class cls2;
        AbstractC0126x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2005b;
        V v4 = (V) concurrentHashMap.get(cls);
        if (v4 != null) {
            return v4;
        }
        E e3 = this.f2004a;
        e3.getClass();
        Class cls3 = W.f2012a;
        if (!AbstractC0124v.class.isAssignableFrom(cls) && (cls2 = W.f2012a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        U a3 = ((D) e3.f1973a).a(cls);
        int i3 = a3.f2011d;
        AbstractC0104a abstractC0104a = a3.f2008a;
        if ((i3 & 2) == 2) {
            if (AbstractC0124v.class.isAssignableFrom(cls)) {
                v3 = new N(W.f2014c, AbstractC0119p.f2087a, abstractC0104a);
            } else {
                d0 d0Var = W.f2013b;
                C0118o c0118o = AbstractC0119p.f2088b;
                if (c0118o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                v3 = new N(d0Var, c0118o, abstractC0104a);
            }
        } else if (AbstractC0124v.class.isAssignableFrom(cls)) {
            C0118o c0118o2 = null;
            O o2 = P.f2002b;
            B b3 = C.f1970b;
            d0 d0Var2 = W.f2014c;
            if (X.j.a(a3.a()) != 1) {
                c0118o2 = AbstractC0119p.f2087a;
            }
            C0118o c0118o3 = c0118o2;
            I i4 = J.f1982b;
            int[] iArr = M.n;
            if (!(a3 instanceof U)) {
                a3.getClass();
                throw new ClassCastException();
            }
            v3 = M.v(a3, o2, b3, d0Var2, c0118o3, i4);
        } else {
            C0118o c0118o4 = null;
            O o3 = P.f2001a;
            B b4 = C.f1969a;
            d0 d0Var3 = W.f2013b;
            if (X.j.a(a3.a()) != 1 && (c0118o4 = AbstractC0119p.f2088b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0118o c0118o5 = c0118o4;
            I i5 = J.f1981a;
            int[] iArr2 = M.n;
            if (!(a3 instanceof U)) {
                a3.getClass();
                throw new ClassCastException();
            }
            v3 = M.v(a3, o3, b4, d0Var3, c0118o5, i5);
        }
        V v5 = (V) concurrentHashMap.putIfAbsent(cls, v3);
        return v5 != null ? v5 : v3;
    }
}
