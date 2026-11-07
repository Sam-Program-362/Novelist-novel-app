package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2012a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f2013b;

    /* renamed from: c, reason: collision with root package name */
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
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0115l.b0(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int b(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0115l.Z(i3) + 4) * size;
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0115l.Z(i3) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0115l.b0(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0115l.b0(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = ((Integer) list.get(i4)).intValue();
            i3 += C0115l.a0((intValue >> 31) ^ (intValue << 1));
        }
        return i3;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long longValue = ((Long) list.get(i4)).longValue();
            i3 += C0115l.b0((longValue >> 63) ^ (longValue << 1));
        }
        return i3;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0115l.a0(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0115l.b0(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static void k(d0 d0Var, Object obj, Object obj2) {
        d0Var.getClass();
        AbstractC0124v abstractC0124v = (AbstractC0124v) obj;
        c0 c0Var = abstractC0124v.unknownFields;
        c0 c0Var2 = ((AbstractC0124v) obj2).unknownFields;
        c0 c0Var3 = c0.f2031f;
        if (!c0Var3.equals(c0Var2)) {
            if (c0Var3.equals(c0Var)) {
                int i3 = c0Var.f2032a + c0Var2.f2032a;
                int[] copyOf = Arrays.copyOf(c0Var.f2033b, i3);
                System.arraycopy(c0Var2.f2033b, 0, copyOf, c0Var.f2032a, c0Var2.f2032a);
                Object[] copyOf2 = Arrays.copyOf(c0Var.f2034c, i3);
                System.arraycopy(c0Var2.f2034c, 0, copyOf2, c0Var.f2032a, c0Var2.f2032a);
                c0Var = new c0(i3, copyOf, copyOf2, true);
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
        abstractC0124v.unknownFields = c0Var;
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
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0115l.g0(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            Logger logger = C0115l.n;
            i5++;
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.e0(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    public static void n(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                double doubleValue = ((Double) list.get(i4)).doubleValue();
                c0115l.getClass();
                c0115l.l0(Double.doubleToRawLongBits(doubleValue), i3);
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            Logger logger = C0115l.n;
            i5 += 8;
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.m0(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void o(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0115l.n0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0115l.b0(((Integer) list.get(i6)).intValue());
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.o0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void p(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0115l.j0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0115l.n;
            i5 += 4;
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.k0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void q(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0115l.l0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0115l.n;
            i5 += 8;
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.m0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void r(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                float floatValue = ((Float) list.get(i4)).floatValue();
                c0115l.getClass();
                c0115l.j0(i3, Float.floatToRawIntBits(floatValue));
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            Logger logger = C0115l.n;
            i5 += 4;
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.k0(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void s(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0115l.n0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0115l.b0(((Integer) list.get(i6)).intValue());
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.o0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void t(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0115l.v0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0115l.b0(((Long) list.get(i6)).longValue());
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.w0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void u(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0115l.j0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0115l.n;
            i5 += 4;
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.k0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void v(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0115l.l0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0115l.n;
            i5 += 8;
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.m0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void w(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                int intValue = ((Integer) list.get(i4)).intValue();
                c0115l.t0(i3, (intValue >> 31) ^ (intValue << 1));
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue2 = ((Integer) list.get(i6)).intValue();
            i5 += C0115l.a0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            int intValue3 = ((Integer) list.get(i4)).intValue();
            c0115l.u0((intValue3 >> 31) ^ (intValue3 << 1));
            i4++;
        }
    }

    public static void x(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                long longValue = ((Long) list.get(i4)).longValue();
                c0115l.v0((longValue >> 63) ^ (longValue << 1), i3);
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long longValue2 = ((Long) list.get(i6)).longValue();
            i5 += C0115l.b0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            long longValue3 = ((Long) list.get(i4)).longValue();
            c0115l.w0((longValue3 >> 63) ^ (longValue3 << 1));
            i4++;
        }
    }

    public static void y(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0115l.t0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0115l.a0(((Integer) list.get(i6)).intValue());
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.u0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void z(int i3, List list, E e3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0115l c0115l = (C0115l) e3.f1973a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0115l.v0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0115l.s0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0115l.b0(((Long) list.get(i6)).longValue());
        }
        c0115l.u0(i5);
        while (i4 < list.size()) {
            c0115l.w0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static Object j(Object obj, int i3, InterfaceC0125w interfaceC0125w, Object obj2, d0 d0Var) {
        return obj2;
    }
}
