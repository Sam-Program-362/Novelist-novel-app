package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S f2003c = new S();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2005b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f2004a = new E();

    public final V a(Class cls) {
        V v3;
        Class cls2;
        AbstractC0124x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2005b;
        V v4 = (V) concurrentHashMap.get(cls);
        if (v4 != null) {
            return v4;
        }
        E e3 = this.f2004a;
        e3.getClass();
        Class cls3 = W.f2012a;
        if (!AbstractC0122v.class.isAssignableFrom(cls) && (cls2 = W.f2012a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        U uA = ((D) e3.f1973a).a(cls);
        int i3 = uA.f2011d;
        AbstractC0102a abstractC0102a = uA.f2008a;
        if ((i3 & 2) == 2) {
            if (AbstractC0122v.class.isAssignableFrom(cls)) {
                v3 = new N(W.f2014c, AbstractC0117p.f2087a, abstractC0102a);
            } else {
                d0 d0Var = W.f2013b;
                C0116o c0116o = AbstractC0117p.f2088b;
                if (c0116o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                v3 = new N(d0Var, c0116o, abstractC0102a);
            }
        } else if (AbstractC0122v.class.isAssignableFrom(cls)) {
            C0116o c0116o2 = null;
            O o2 = P.f2002b;
            B b3 = C.f1970b;
            d0 d0Var2 = W.f2014c;
            if (X.j.a(uA.a()) != 1) {
                c0116o2 = AbstractC0117p.f2087a;
            }
            C0116o c0116o3 = c0116o2;
            I i4 = J.f1982b;
            int[] iArr = M.n;
            if (!(uA instanceof U)) {
                uA.getClass();
                throw new ClassCastException();
            }
            v3 = M.v(uA, o2, b3, d0Var2, c0116o3, i4);
        } else {
            C0116o c0116o4 = null;
            O o3 = P.f2001a;
            B b4 = C.f1969a;
            d0 d0Var3 = W.f2013b;
            if (X.j.a(uA.a()) != 1 && (c0116o4 = AbstractC0117p.f2088b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0116o c0116o5 = c0116o4;
            I i5 = J.f1981a;
            int[] iArr2 = M.n;
            if (!(uA instanceof U)) {
                uA.getClass();
                throw new ClassCastException();
            }
            v3 = M.v(uA, o3, b4, d0Var3, c0116o5, i5);
        }
        V v5 = (V) concurrentHashMap.putIfAbsent(cls, v3);
        return v5 != null ? v5 : v3;
    }
}
