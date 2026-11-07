package a2;

import Z1.s;
import Z1.t;
import Z1.u;
import Z1.v;
import Z1.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p016f2.b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f1703b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f1704a;

    static {
        List listD0 = P1.f.d0(Z1.a.class, Z1.l.class, Z1.p.class, Z1.q.class, Z1.r.class, s.class, t.class, u.class, v.class, w.class, Z1.b.class, Z1.c.class, Z1.d.class, Z1.e.class, Z1.f.class, Z1.g.class, Z1.h.class, Z1.i.class, Z1.j.class, Z1.k.class, Z1.m.class, Z1.n.class, Z1.o.class);
        ArrayList arrayList = new ArrayList(P1.g.e0(listD0));
        int i3 = 0;
        for (Object obj : listD0) {
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
        String strB;
        Class cls = this.f1704a;
        h.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strB2 = r.b(cls.getName());
            return strB2 == null ? cls.getCanonicalName() : strB2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strB = r.b(componentType.getName())) != null) {
            strConcat = strB.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strD;
        Class cls = this.f1704a;
        h.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strD2 = r.d(cls.getName());
                return strD2 == null ? cls.getSimpleName() : strD2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strD = r.d(componentType.getName())) != null) {
                strConcat = strD.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return p024h2.d.g0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return p024h2.d.g0(simpleName, enclosingConstructor.getName() + '$');
        }
        int iIndexOf = simpleName.indexOf(36, 0);
        if (iIndexOf == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iIndexOf + 1, simpleName.length());
        h.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean d(Object obj) {
        Class clsU = this.f1704a;
        h.e(clsU, "jClass");
        Map map = f1703b;
        h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsU);
        if (num != null) {
            return r.c(num.intValue(), obj);
        }
        if (clsU.isPrimitive()) {
            clsU = E2.a.u(p.a(clsU));
        }
        return clsU.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && E2.a.u(this).equals(E2.a.u((p016f2.b) obj));
    }

    public final int hashCode() {
        return E2.a.u(this).hashCode();
    }

    public final String toString() {
        return this.f1704a.toString() + " (Kotlin reflection is not available)";
    }
}
