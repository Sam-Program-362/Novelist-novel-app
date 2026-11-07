package a2;

import Z1.s;
import Z1.t;
import Z1.u;
import Z1.v;
import Z1.w;
import f2.InterfaceC0248b;
import h2.AbstractC0273d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements InterfaceC0248b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1703b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f1704a;

    static {
        List d02 = P1.f.d0(Z1.a.class, Z1.l.class, Z1.p.class, Z1.q.class, Z1.r.class, s.class, t.class, u.class, v.class, w.class, Z1.b.class, Z1.c.class, Z1.d.class, Z1.e.class, Z1.f.class, Z1.g.class, Z1.h.class, Z1.i.class, Z1.j.class, Z1.k.class, Z1.m.class, Z1.n.class, Z1.o.class);
        ArrayList arrayList = new ArrayList(P1.g.e0(d02));
        int i3 = 0;
        for (Object obj : d02) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new O1.b((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        f1703b = P1.p.U(arrayList);
    }

    public e(Class cls) {
        h.e(cls, "jClass");
        this.f1704a = cls;
    }

    @Override // a2.d
    public final Class a() {
        return this.f1704a;
    }

    public final String b() {
        String b3;
        Class cls = this.f1704a;
        h.e(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String b4 = r.b(cls.getName());
            return b4 == null ? cls.getCanonicalName() : b4;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (b3 = r.b(componentType.getName())) != null) {
            str = b3.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String c() {
        String d3;
        Class cls = this.f1704a;
        h.e(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String d4 = r.d(cls.getName());
                return d4 == null ? cls.getSimpleName() : d4;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (d3 = r.d(componentType.getName())) != null) {
                str = d3.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC0273d.g0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return AbstractC0273d.g0(simpleName, enclosingConstructor.getName() + '$');
        }
        int indexOf = simpleName.indexOf(36, 0);
        if (indexOf == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(indexOf + 1, simpleName.length());
        h.d(substring, "substring(...)");
        return substring;
    }

    public final boolean d(Object obj) {
        Class cls = this.f1704a;
        h.e(cls, "jClass");
        Map map = f1703b;
        h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return r.c(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = E2.a.u(p.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && E2.a.u(this).equals(E2.a.u((InterfaceC0248b) obj));
    }

    public final int hashCode() {
        return E2.a.u(this).hashCode();
    }

    public final String toString() {
        return this.f1704a.toString() + " (Kotlin reflection is not available)";
    }
}
