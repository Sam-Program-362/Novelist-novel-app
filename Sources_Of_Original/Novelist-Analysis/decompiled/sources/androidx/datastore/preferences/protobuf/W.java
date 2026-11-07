package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f2012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f2013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f2014c;

    static {
        Class<?> cls;
        Class<?> cls2;
        S s3 = S.f2003c;
        d0 d0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2012a = cls;
        try {
            S s4 = S.f2003c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                d0Var = (d0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f2013b = d0Var;
        f2014c = new d0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iB0 += C0113l.b0(((Integer) list.get(i3)).intValue());
        }
        return iB0;
    }

    public static int b(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0113l.Z(i3) + 4) * size;
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0113l.Z(i3) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iB0 += C0113l.b0(((Integer) list.get(i3)).intValue());
        }
        return iB0;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iB0 += C0113l.b0(((Long) list.get(i3)).longValue());
        }
        return iB0;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue = ((Integer) list.get(i3)).intValue();
            iA0 += C0113l.a0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iA0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long jLongValue = ((Long) list.get(i3)).longValue();
            iB0 += C0113l.b0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iB0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iA0 += C0113l.a0(((Integer) list.get(i3)).intValue());
        }
        return iA0;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iB0 += C0113l.b0(((Long) list.get(i3)).longValue());
        }
        return iB0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(d0 d0Var, Object obj, Object obj2) {
        d0Var.getClass();
        AbstractC0122v abstractC0122v = (AbstractC0122v) obj;
        c0 c0Var = abstractC0122v.unknownFields;
        c0 c0Var2 = ((AbstractC0122v) obj2).unknownFields;
        c0 c0Var3 = c0.f2031f;
        if (!c0Var3.equals(c0Var2)) {
            if (c0Var3.equals(c0Var)) {
                int i3 = c0Var.f2032a + c0Var2.f2032a;
                int[] iArrCopyOf = Arrays.copyOf(c0Var.f2033b, i3);
                System.arraycopy(c0Var2.f2033b, 0, iArrCopyOf, c0Var.f2032a, c0Var2.f2032a);
                Object[] objArrCopyOf = Arrays.copyOf(c0Var.f2034c, i3);
                System.arraycopy(c0Var2.f2034c, 0, objArrCopyOf, c0Var.f2032a, c0Var2.f2032a);
                c0Var = new c0(i3, iArrCopyOf, objArrCopyOf, true);
            } else {
                c0Var.getClass();
                if (!c0Var2.equals(c0Var3)) {
                    if (!c0Var.f2036e) {
                        throw new UnsupportedOperationException();
                    }
                    int i4 = c0Var.f2032a + c0Var2.f2032a;
                    c0Var.a(i4);
                    System.arraycopy(c0Var2.f2033b, 0, c0Var.f2033b, c0Var.f2032a, c0Var2.f2032a);
                    System.arraycopy(c0Var2.f2034c, 0, c0Var.f2034c, c0Var.f2032a, c0Var2.f2032a);
                    c0Var.f2032a = i4;
                }
            }
        }
        abstractC0122v.unknownFields = c0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0113l.g0(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            Logger logger = C0113l.n;
            i5++;
        }
        c0113l.u0(i5);
        while (i4 < list.size()) {
            c0113l.e0(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    public static void n(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                double dDoubleValue = ((Double) list.get(i4)).doubleValue();
                c0113l.getClass();
                c0113l.l0(Double.doubleToRawLongBits(dDoubleValue), i3);
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            Logger logger = C0113l.n;
            i5 += 8;
        }
        c0113l.u0(i5);
        while (i4 < list.size()) {
            c0113l.m0(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void o(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0113l.n0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int iB0 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iB0 += C0113l.b0(((Integer) list.get(i5)).intValue());
        }
        c0113l.u0(iB0);
        while (i4 < list.size()) {
            c0113l.o0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void p(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0113l.j0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0113l.n;
            i5 += 4;
        }
        c0113l.u0(i5);
        while (i4 < list.size()) {
            c0113l.k0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void q(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0113l.l0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0113l.n;
            i5 += 8;
        }
        c0113l.u0(i5);
        while (i4 < list.size()) {
            c0113l.m0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void r(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                float fFloatValue = ((Float) list.get(i4)).floatValue();
                c0113l.getClass();
                c0113l.j0(i3, Float.floatToRawIntBits(fFloatValue));
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            Logger logger = C0113l.n;
            i5 += 4;
        }
        c0113l.u0(i5);
        while (i4 < list.size()) {
            c0113l.k0(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void s(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0113l.n0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int iB0 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iB0 += C0113l.b0(((Integer) list.get(i5)).intValue());
        }
        c0113l.u0(iB0);
        while (i4 < list.size()) {
            c0113l.o0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void t(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0113l.v0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int iB0 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iB0 += C0113l.b0(((Long) list.get(i5)).longValue());
        }
        c0113l.u0(iB0);
        while (i4 < list.size()) {
            c0113l.w0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void u(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0113l.j0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0113l.n;
            i5 += 4;
        }
        c0113l.u0(i5);
        while (i4 < list.size()) {
            c0113l.k0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void v(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0113l.l0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0113l.n;
            i5 += 8;
        }
        c0113l.u0(i5);
        while (i4 < list.size()) {
            c0113l.m0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void w(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c0113l.t0(i3, (iIntValue >> 31) ^ (iIntValue << 1));
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int iA0 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue2 = ((Integer) list.get(i5)).intValue();
            iA0 += C0113l.a0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0113l.u0(iA0);
        while (i4 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c0113l.u0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i4++;
        }
    }

    public static void x(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                long jLongValue = ((Long) list.get(i4)).longValue();
                c0113l.v0((jLongValue >> 63) ^ (jLongValue << 1), i3);
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int iB0 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long jLongValue2 = ((Long) list.get(i5)).longValue();
            iB0 += C0113l.b0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0113l.u0(iB0);
        while (i4 < list.size()) {
            long jLongValue3 = ((Long) list.get(i4)).longValue();
            c0113l.w0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i4++;
        }
    }

    public static void y(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0113l.t0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int iA0 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iA0 += C0113l.a0(((Integer) list.get(i5)).intValue());
        }
        c0113l.u0(iA0);
        while (i4 < list.size()) {
            c0113l.u0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void z(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113l c0113l = (C0113l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0113l.v0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0113l.s0(i3, 2);
        int iB0 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iB0 += C0113l.b0(((Long) list.get(i5)).longValue());
        }
        c0113l.u0(iB0);
        while (i4 < list.size()) {
            c0113l.w0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static Object j(Object obj, int i3, InterfaceC0123w interfaceC0123w, Object obj2, d0 d0Var) {
        return obj2;
    }
}
