package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.XMLReaderUtils;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class M implements V {
    public static final int[] n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f1984o = i0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1985a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1986b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1987c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1988d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0104a f1989e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1990f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1991g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1992h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1993i;

    /* renamed from: j, reason: collision with root package name */
    public final O f1994j;

    /* renamed from: k, reason: collision with root package name */
    public final B f1995k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f1996l;

    /* renamed from: m, reason: collision with root package name */
    public final I f1997m;

    public M(int[] iArr, Object[] objArr, int i3, int i4, AbstractC0104a abstractC0104a, int[] iArr2, int i5, int i6, O o2, B b3, d0 d0Var, C0118o c0118o, I i7) {
        this.f1985a = iArr;
        this.f1986b = objArr;
        this.f1987c = i3;
        this.f1988d = i4;
        this.f1990f = abstractC0104a instanceof AbstractC0124v;
        this.f1991g = iArr2;
        this.f1992h = i5;
        this.f1993i = i6;
        this.f1994j = o2;
        this.f1995k = b3;
        this.f1996l = d0Var;
        this.f1989e = abstractC0104a;
        this.f1997m = i7;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int J(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0124v) {
            return ((AbstractC0124v) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.M v(androidx.datastore.preferences.protobuf.U r34, androidx.datastore.preferences.protobuf.O r35, androidx.datastore.preferences.protobuf.B r36, androidx.datastore.preferences.protobuf.d0 r37, androidx.datastore.preferences.protobuf.C0118o r38, androidx.datastore.preferences.protobuf.I r39) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.v(androidx.datastore.preferences.protobuf.U, androidx.datastore.preferences.protobuf.O, androidx.datastore.preferences.protobuf.B, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.I):androidx.datastore.preferences.protobuf.M");
    }

    public static long w(int i3) {
        return i3 & 1048575;
    }

    public static int x(long j3, Object obj) {
        return ((Integer) i0.f2065c.h(j3, obj)).intValue();
    }

    public static long y(long j3, Object obj) {
        return ((Long) i0.f2065c.h(j3, obj)).longValue();
    }

    public final void A(Object obj, long j3, C0114k c0114k, V v3, C0117n c0117n) {
        int u;
        this.f1995k.getClass();
        InterfaceC0125w a3 = B.a(j3, obj);
        AbstractC0113j abstractC0113j = c0114k.f2073a;
        int i3 = c0114k.f2074b;
        if ((i3 & 7) != 3) {
            throw C0128z.b();
        }
        do {
            AbstractC0124v newInstance = v3.newInstance();
            c0114k.b(newInstance, v3, c0117n);
            v3.d(newInstance);
            ((T) a3).add(newInstance);
            if (abstractC0113j.c() || c0114k.f2076d != 0) {
                return;
            } else {
                u = abstractC0113j.u();
            }
        } while (u == i3);
        c0114k.f2076d = u;
    }

    public final void B(Object obj, int i3, C0114k c0114k, V v3, C0117n c0117n) {
        int u;
        this.f1995k.getClass();
        InterfaceC0125w a3 = B.a(i3 & 1048575, obj);
        AbstractC0113j abstractC0113j = c0114k.f2073a;
        int i4 = c0114k.f2074b;
        if ((i4 & 7) != 2) {
            throw C0128z.b();
        }
        do {
            AbstractC0124v newInstance = v3.newInstance();
            c0114k.c(newInstance, v3, c0117n);
            v3.d(newInstance);
            ((T) a3).add(newInstance);
            if (abstractC0113j.c() || c0114k.f2076d != 0) {
                return;
            } else {
                u = abstractC0113j.u();
            }
        } while (u == i4);
        c0114k.f2076d = u;
    }

    public final void C(int i3, C0114k c0114k, Object obj) {
        AbstractC0113j abstractC0113j = c0114k.f2073a;
        if ((536870912 & i3) != 0) {
            c0114k.w(2);
            i0.o(obj, i3 & 1048575, abstractC0113j.t());
        } else if (!this.f1990f) {
            i0.o(obj, i3 & 1048575, c0114k.e());
        } else {
            c0114k.w(2);
            i0.o(obj, i3 & 1048575, abstractC0113j.s());
        }
    }

    public final void D(int i3, C0114k c0114k, Object obj) {
        int i4 = 536870912 & i3;
        B b3 = this.f1995k;
        if (i4 != 0) {
            b3.getClass();
            c0114k.s(B.a(i3 & 1048575, obj), true);
        } else {
            b3.getClass();
            c0114k.s(B.a(i3 & 1048575, obj), false);
        }
    }

    public final void F(int i3, Object obj) {
        int i4 = this.f1985a[i3 + 2];
        long j3 = 1048575 & i4;
        if (j3 == 1048575) {
            return;
        }
        i0.m(obj, j3, (1 << (i4 >>> 20)) | i0.f2065c.f(j3, obj));
    }

    public final void G(Object obj, int i3, int i4) {
        i0.m(obj, this.f1985a[i4 + 2] & 1048575, i3);
    }

    public final void H(Object obj, int i3, AbstractC0104a abstractC0104a) {
        f1984o.putObject(obj, K(i3) & 1048575, abstractC0104a);
        F(i3, obj);
    }

    public final void I(Object obj, int i3, int i4, AbstractC0104a abstractC0104a) {
        f1984o.putObject(obj, K(i4) & 1048575, abstractC0104a);
        G(obj, i3, i4);
    }

    public final int K(int i3) {
        return this.f1985a[i3 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void L(Object obj, E e3) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        M m3 = this;
        int[] iArr = m3.f1985a;
        int length = iArr.length;
        Unsafe unsafe = f1984o;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int K2 = m3.K(i9);
            int i11 = iArr[i9];
            int J2 = J(K2);
            if (J2 <= 17) {
                int i12 = iArr[i9 + 2];
                int i13 = i12 & i7;
                if (i13 != i8) {
                    i10 = i13 == i7 ? 0 : unsafe.getInt(obj, i13);
                    i8 = i13;
                }
                i3 = K2;
                i4 = 1 << (i12 >>> 20);
            } else {
                i3 = K2;
                i4 = 0;
            }
            long j3 = i3 & i7;
            switch (J2) {
                case 0:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        double d3 = i0.f2065c.d(j3, obj);
                        C0115l c0115l = (C0115l) e3.f1973a;
                        c0115l.getClass();
                        c0115l.l0(Double.doubleToRawLongBits(d3), i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        float e4 = i0.f2065c.e(j3, obj);
                        C0115l c0115l2 = (C0115l) e3.f1973a;
                        c0115l2.getClass();
                        c0115l2.j0(i11, Float.floatToRawIntBits(e4));
                    }
                    m3 = this;
                    break;
                case 2:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).v0(unsafe.getLong(obj, j3), i11);
                    }
                    m3 = this;
                    break;
                case 3:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).v0(unsafe.getLong(obj, j3), i11);
                    }
                    m3 = this;
                    break;
                case 4:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).n0(i11, unsafe.getInt(obj, j3));
                    }
                    m3 = this;
                    break;
                case 5:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).l0(unsafe.getLong(obj, j3), i11);
                    }
                    m3 = this;
                    break;
                case 6:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).j0(i11, unsafe.getInt(obj, j3));
                    }
                    m3 = this;
                    break;
                case 7:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).g0(i11, i0.f2065c.c(j3, obj));
                    }
                    m3 = this;
                    break;
                case 8:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((C0115l) e3.f1973a).q0((String) object, i11);
                        } else {
                            ((C0115l) e3.f1973a).h0(i11, (C0110g) object);
                        }
                    }
                    m3 = this;
                    break;
                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).p0(i11, (AbstractC0104a) unsafe.getObject(obj, j3), m3.l(i9));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).h0(i11, (C0110g) unsafe.getObject(obj, j3));
                    }
                    m3 = this;
                    break;
                case 11:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).t0(i11, unsafe.getInt(obj, j3));
                    }
                    m3 = this;
                    break;
                case 12:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).n0(i11, unsafe.getInt(obj, j3));
                    }
                    m3 = this;
                    break;
                case 13:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).j0(i11, unsafe.getInt(obj, j3));
                    }
                    m3 = this;
                    break;
                case 14:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        ((C0115l) e3.f1973a).l0(unsafe.getLong(obj, j3), i11);
                    }
                    m3 = this;
                    break;
                case 15:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        int i14 = unsafe.getInt(obj, j3);
                        ((C0115l) e3.f1973a).t0(i11, (i14 >> 31) ^ (i14 << 1));
                    }
                    m3 = this;
                    break;
                case 16:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        long j4 = unsafe.getLong(obj, j3);
                        ((C0115l) e3.f1973a).v0((j4 >> 63) ^ (j4 << 1), i11);
                    }
                    m3 = this;
                    break;
                case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                    if (m3.n(obj, i9, i8, i10, i4)) {
                        e3.a(i11, unsafe.getObject(obj, j3), m3.l(i9));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i5 = i8;
                    W.n(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 19:
                    i5 = i8;
                    W.r(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    i5 = i8;
                    W.t(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 21:
                    i5 = i8;
                    W.z(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 22:
                    i5 = i8;
                    W.s(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 23:
                    i5 = i8;
                    W.q(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 24:
                    i5 = i8;
                    W.p(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 25:
                    i5 = i8;
                    W.m(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 26:
                    i6 = i8;
                    int i15 = iArr[i9];
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls = W.f2012a;
                    if (list != null && !list.isEmpty()) {
                        e3.getClass();
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            ((C0115l) e3.f1973a).q0((String) list.get(i16), i15);
                        }
                    }
                    i8 = i6;
                    break;
                case 27:
                    i6 = i8;
                    int i17 = iArr[i9];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    V l3 = m3.l(i9);
                    Class cls2 = W.f2012a;
                    if (list2 != null && !list2.isEmpty()) {
                        e3.getClass();
                        for (int i18 = 0; i18 < list2.size(); i18++) {
                            ((C0115l) e3.f1973a).p0(i17, (AbstractC0104a) list2.get(i18), l3);
                        }
                    }
                    i8 = i6;
                    break;
                case 28:
                    i6 = i8;
                    int i19 = iArr[i9];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    Class cls3 = W.f2012a;
                    if (list3 != null && !list3.isEmpty()) {
                        e3.getClass();
                        for (int i20 = 0; i20 < list3.size(); i20++) {
                            ((C0115l) e3.f1973a).h0(i19, (C0110g) list3.get(i20));
                        }
                    }
                    i8 = i6;
                    break;
                case 29:
                    i5 = i8;
                    z3 = false;
                    W.y(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 30:
                    i5 = i8;
                    z3 = false;
                    W.o(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 31:
                    i5 = i8;
                    z3 = false;
                    W.u(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 32:
                    i5 = i8;
                    z3 = false;
                    W.v(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 33:
                    i5 = i8;
                    z3 = false;
                    W.w(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 34:
                    i5 = i8;
                    z3 = false;
                    W.x(iArr[i9], (List) unsafe.getObject(obj, j3), e3, false);
                    i8 = i5;
                    break;
                case 35:
                    i6 = i8;
                    W.n(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 36:
                    i6 = i8;
                    W.r(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 37:
                    i6 = i8;
                    W.t(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 38:
                    i6 = i8;
                    W.z(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 39:
                    i6 = i8;
                    W.s(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 40:
                    i6 = i8;
                    W.q(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 41:
                    i6 = i8;
                    W.p(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 42:
                    i6 = i8;
                    W.m(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 43:
                    i6 = i8;
                    W.y(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 44:
                    i6 = i8;
                    W.o(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 45:
                    i6 = i8;
                    W.u(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 46:
                    i6 = i8;
                    W.v(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 47:
                    i6 = i8;
                    W.w(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 48:
                    i6 = i8;
                    W.x(iArr[i9], (List) unsafe.getObject(obj, j3), e3, true);
                    i8 = i6;
                    break;
                case 49:
                    i6 = i8;
                    int i21 = iArr[i9];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    V l4 = m3.l(i9);
                    Class cls4 = W.f2012a;
                    if (list4 != null && !list4.isEmpty()) {
                        e3.getClass();
                        for (int i22 = 0; i22 < list4.size(); i22++) {
                            e3.a(i21, list4.get(i22), l4);
                        }
                    }
                    i8 = i6;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j3);
                    if (object2 != null) {
                        int i23 = 2;
                        Object obj2 = m3.f1986b[(i9 / 3) * 2];
                        m3.f1997m.getClass();
                        F f3 = ((G) obj2).f1977a;
                        C0115l c0115l3 = (C0115l) e3.f1973a;
                        c0115l3.getClass();
                        for (Map.Entry entry : ((H) object2).entrySet()) {
                            c0115l3.s0(i11, i23);
                            c0115l3.u0(G.a(f3, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0120q.b(c0115l3, f3.f1974a, 1, key);
                            i23 = 2;
                            C0120q.b(c0115l3, f3.f1975b, 2, value);
                            i8 = i8;
                        }
                    }
                    i6 = i8;
                    i8 = i6;
                    break;
                case 51:
                    if (m3.p(obj, i11, i9)) {
                        double doubleValue = ((Double) i0.f2065c.h(j3, obj)).doubleValue();
                        C0115l c0115l4 = (C0115l) e3.f1973a;
                        c0115l4.getClass();
                        c0115l4.l0(Double.doubleToRawLongBits(doubleValue), i11);
                    }
                    break;
                case 52:
                    if (m3.p(obj, i11, i9)) {
                        float floatValue = ((Float) i0.f2065c.h(j3, obj)).floatValue();
                        C0115l c0115l5 = (C0115l) e3.f1973a;
                        c0115l5.getClass();
                        c0115l5.j0(i11, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).v0(y(j3, obj), i11);
                    }
                    break;
                case 54:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).v0(y(j3, obj), i11);
                    }
                    break;
                case 55:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).n0(i11, x(j3, obj));
                    }
                    break;
                case 56:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).l0(y(j3, obj), i11);
                    }
                    break;
                case 57:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).j0(i11, x(j3, obj));
                    }
                    break;
                case 58:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).g0(i11, ((Boolean) i0.f2065c.h(j3, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (m3.p(obj, i11, i9)) {
                        Object object3 = unsafe.getObject(obj, j3);
                        if (object3 instanceof String) {
                            ((C0115l) e3.f1973a).q0((String) object3, i11);
                        } else {
                            ((C0115l) e3.f1973a).h0(i11, (C0110g) object3);
                        }
                    }
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).p0(i11, (AbstractC0104a) unsafe.getObject(obj, j3), m3.l(i9));
                    }
                    break;
                case 61:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).h0(i11, (C0110g) unsafe.getObject(obj, j3));
                    }
                    break;
                case 62:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).t0(i11, x(j3, obj));
                    }
                    break;
                case 63:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).n0(i11, x(j3, obj));
                    }
                    break;
                case 64:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).j0(i11, x(j3, obj));
                    }
                    break;
                case 65:
                    if (m3.p(obj, i11, i9)) {
                        ((C0115l) e3.f1973a).l0(y(j3, obj), i11);
                    }
                    break;
                case 66:
                    if (m3.p(obj, i11, i9)) {
                        int x = x(j3, obj);
                        ((C0115l) e3.f1973a).t0(i11, (x >> 31) ^ (x << 1));
                    }
                    break;
                case 67:
                    if (m3.p(obj, i11, i9)) {
                        long y = y(j3, obj);
                        ((C0115l) e3.f1973a).v0((y << 1) ^ (y >> 63), i11);
                    }
                    break;
                case 68:
                    if (m3.p(obj, i11, i9)) {
                        e3.a(i11, unsafe.getObject(obj, j3), m3.l(i9));
                    }
                    break;
            }
            i9 += 3;
            i7 = 1048575;
        }
        m3.f1996l.getClass();
        ((AbstractC0124v) obj).unknownFields.d(e3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.V
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!o(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f1985a;
            if (i3 >= iArr.length) {
                W.k(this.f1996l, obj, obj2);
                return;
            }
            int K2 = K(i3);
            long j3 = 1048575 & K2;
            int i4 = iArr[i3];
            switch (J(K2)) {
                case 0:
                    if (m(i3, obj2)) {
                        h0 h0Var = i0.f2065c;
                        obj3 = obj;
                        h0Var.l(obj3, j3, h0Var.d(j3, obj2));
                        F(i3, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (m(i3, obj2)) {
                        h0 h0Var2 = i0.f2065c;
                        h0Var2.m(obj, j3, h0Var2.e(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m(i3, obj2)) {
                        i0.n(obj, j3, i0.f2065c.g(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m(i3, obj2)) {
                        i0.n(obj, j3, i0.f2065c.g(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m(i3, obj2)) {
                        i0.n(obj, j3, i0.f2065c.g(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m(i3, obj2)) {
                        h0 h0Var3 = i0.f2065c;
                        h0Var3.j(obj, j3, h0Var3.c(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m(i3, obj2)) {
                        i0.o(obj, j3, i0.f2065c.h(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                    r(obj, obj2, i3);
                    obj3 = obj;
                    break;
                case 10:
                    if (m(i3, obj2)) {
                        i0.o(obj, j3, i0.f2065c.h(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m(i3, obj2)) {
                        i0.n(obj, j3, i0.f2065c.g(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m(i3, obj2)) {
                        i0.n(obj, j3, i0.f2065c.g(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                    r(obj, obj2, i3);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f1995k.getClass();
                    h0 h0Var4 = i0.f2065c;
                    InterfaceC0125w interfaceC0125w = (InterfaceC0125w) h0Var4.h(j3, obj);
                    InterfaceC0125w interfaceC0125w2 = (InterfaceC0125w) h0Var4.h(j3, obj2);
                    T t3 = (T) interfaceC0125w;
                    int i5 = t3.f2007m;
                    int i6 = ((T) interfaceC0125w2).f2007m;
                    if (i5 > 0 && i6 > 0) {
                        if (!((AbstractC0105b) interfaceC0125w).f2028k) {
                            interfaceC0125w = t3.c(i6 + i5);
                        }
                        ((AbstractC0105b) interfaceC0125w).addAll(interfaceC0125w2);
                    }
                    if (i5 > 0) {
                        interfaceC0125w2 = interfaceC0125w;
                    }
                    i0.o(obj, j3, interfaceC0125w2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = W.f2012a;
                    h0 h0Var5 = i0.f2065c;
                    Object h3 = h0Var5.h(j3, obj);
                    Object h4 = h0Var5.h(j3, obj2);
                    this.f1997m.getClass();
                    i0.o(obj, j3, I.a(h3, h4));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (p(obj2, i4, i3)) {
                        i0.o(obj, j3, i0.f2065c.h(j3, obj2));
                        G(obj, i4, i3);
                    }
                    obj3 = obj;
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    s(obj, obj2, i3);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(obj2, i4, i3)) {
                        i0.o(obj, j3, i0.f2065c.h(j3, obj2));
                        G(obj, i4, i3);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    s(obj, obj2, i3);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i3 += 3;
            obj = obj3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, E e3) {
        e3.getClass();
        L(obj, e3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(androidx.datastore.preferences.protobuf.AbstractC0124v r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.c(androidx.datastore.preferences.protobuf.v):int");
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj) {
        if (o(obj)) {
            if (obj instanceof AbstractC0124v) {
                AbstractC0124v abstractC0124v = (AbstractC0124v) obj;
                abstractC0124v.k(Integer.MAX_VALUE);
                abstractC0124v.memoizedHashCode = 0;
                abstractC0124v.h();
            }
            int[] iArr = this.f1985a;
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int K2 = K(i3);
                long j3 = 1048575 & K2;
                int J2 = J(K2);
                if (J2 != 9) {
                    if (J2 != 60 && J2 != 68) {
                        switch (J2) {
                            case 18:
                            case 19:
                            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f1995k.getClass();
                                AbstractC0105b abstractC0105b = (AbstractC0105b) ((InterfaceC0125w) i0.f2065c.h(j3, obj));
                                if (abstractC0105b.f2028k) {
                                    abstractC0105b.f2028k = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = f1984o;
                                Object object = unsafe.getObject(obj, j3);
                                if (object != null) {
                                    this.f1997m.getClass();
                                    ((H) object).f1980k = false;
                                    unsafe.putObject(obj, j3, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (p(obj, iArr[i3], i3)) {
                        l(i3).d(f1984o.getObject(obj, j3));
                    }
                }
                if (m(i3, obj)) {
                    l(i3).d(f1984o.getObject(obj, j3));
                }
            }
            this.f1996l.getClass();
            c0 c0Var = ((AbstractC0124v) obj).unknownFields;
            if (c0Var.f2036e) {
                c0Var.f2036e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean e(Object obj) {
        int i3;
        int i4;
        int i5;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f1992h) {
            int i9 = this.f1991g[i8];
            int[] iArr = this.f1985a;
            int i10 = iArr[i9];
            int K2 = K(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = f1984o.getInt(obj, i12);
                }
                i4 = i9;
                i5 = i7;
                i3 = i12;
            } else {
                int i14 = i7;
                i3 = i6;
                i4 = i9;
                i5 = i14;
            }
            if ((268435456 & K2) == 0 || n(obj, i4, i3, i5, i13)) {
                int J2 = J(K2);
                if (J2 == 9 || J2 == 17) {
                    if (n(obj, i4, i3, i5, i13)) {
                        if (!l(i4).e(i0.f2065c.h(K2 & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i8++;
                    i6 = i3;
                    i7 = i5;
                } else {
                    if (J2 != 27) {
                        if (J2 == 60 || J2 == 68) {
                            if (p(obj, i10, i4)) {
                                if (!l(i4).e(i0.f2065c.h(K2 & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i8++;
                            i6 = i3;
                            i7 = i5;
                        } else if (J2 != 49) {
                            if (J2 != 50) {
                                continue;
                            } else {
                                Object h3 = i0.f2065c.h(K2 & 1048575, obj);
                                this.f1997m.getClass();
                                H h4 = (H) h3;
                                if (h4.isEmpty()) {
                                    continue;
                                } else {
                                    if (((G) this.f1986b[(i4 / 3) * 2]).f1977a.f1975b.f2095k != r0.MESSAGE) {
                                        continue;
                                    } else {
                                        V v3 = null;
                                        for (Object obj2 : h4.values()) {
                                            if (v3 == null) {
                                                v3 = S.f2003c.a(obj2.getClass());
                                            }
                                            if (!v3.e(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i8++;
                            i6 = i3;
                            i7 = i5;
                        }
                    }
                    List list = (List) i0.f2065c.h(K2 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        V l3 = l(i4);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            if (l3.e(list.get(i15))) {
                            }
                        }
                    }
                    i8++;
                    i6 = i3;
                    i7 = i5;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(androidx.datastore.preferences.protobuf.AbstractC0124v r12, androidx.datastore.preferences.protobuf.AbstractC0124v r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.f(androidx.datastore.preferences.protobuf.v, androidx.datastore.preferences.protobuf.v):boolean");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.V
    public final void g(java.lang.Object r19, androidx.datastore.preferences.protobuf.C0114k r20, androidx.datastore.preferences.protobuf.C0117n r21) {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.g(java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.n):void");
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0124v abstractC0124v) {
        int i3;
        int Z2;
        int Z3;
        int Z4;
        int b02;
        int Z5;
        int b03;
        int Z6;
        int Z7;
        int X2;
        int Z8;
        int a3;
        int c3;
        int Z9;
        int size;
        int i4;
        int Z10;
        int Z11;
        int size2;
        int Z12;
        int a02;
        int i5;
        int i6;
        int Z13;
        int a03;
        M m3 = this;
        AbstractC0124v abstractC0124v2 = abstractC0124v;
        Unsafe unsafe = f1984o;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = m3.f1985a;
            if (i8 >= iArr.length) {
                m3.f1996l.getClass();
                return abstractC0124v2.unknownFields.b() + i10;
            }
            int K2 = m3.K(i8);
            int J2 = J(K2);
            int i11 = iArr[i8];
            int i12 = iArr[i8 + 2];
            int i13 = i12 & 1048575;
            if (J2 <= 17) {
                if (i13 != i7) {
                    i9 = i13 == 1048575 ? 0 : unsafe.getInt(abstractC0124v2, i13);
                    i7 = i13;
                }
                i3 = 1 << (i12 >>> 20);
            } else {
                i3 = 0;
            }
            long j3 = K2 & 1048575;
            if (J2 >= r.f2097l.f2100k) {
                int i14 = r.f2098m.f2100k;
            }
            switch (J2) {
                case 0:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        Z2 = C0115l.Z(i11);
                        c3 = Z2 + 8;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        Z3 = C0115l.Z(i11);
                        Z7 = Z3 + 4;
                        i10 += Z7;
                    }
                    m3 = this;
                    abstractC0124v2 = abstractC0124v;
                    break;
                case 2:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        long j4 = unsafe.getLong(abstractC0124v2, j3);
                        Z4 = C0115l.Z(i11);
                        b02 = C0115l.b0(j4);
                        i10 += b02 + Z4;
                    }
                    m3 = this;
                    break;
                case 3:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        long j5 = unsafe.getLong(abstractC0124v2, j3);
                        Z4 = C0115l.Z(i11);
                        b02 = C0115l.b0(j5);
                        i10 += b02 + Z4;
                    }
                    m3 = this;
                    break;
                case 4:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        int i15 = unsafe.getInt(abstractC0124v2, j3);
                        Z5 = C0115l.Z(i11);
                        b03 = C0115l.b0(i15);
                        X2 = b03 + Z5;
                        i10 += X2;
                    }
                    m3 = this;
                    break;
                case 5:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        Z6 = C0115l.Z(i11);
                        Z7 = Z6 + 8;
                        i10 += Z7;
                    }
                    m3 = this;
                    abstractC0124v2 = abstractC0124v;
                    break;
                case 6:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        Z3 = C0115l.Z(i11);
                        Z7 = Z3 + 4;
                        i10 += Z7;
                    }
                    m3 = this;
                    abstractC0124v2 = abstractC0124v;
                    break;
                case 7:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        Z7 = C0115l.Z(i11) + 1;
                        i10 += Z7;
                    }
                    m3 = this;
                    abstractC0124v2 = abstractC0124v;
                    break;
                case 8:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        Object object = unsafe.getObject(abstractC0124v2, j3);
                        i10 = (object instanceof C0110g ? C0115l.X(i11, (C0110g) object) : C0115l.Y((String) object) + C0115l.Z(i11)) + i10;
                    }
                    m3 = this;
                    break;
                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        Object object2 = unsafe.getObject(abstractC0124v2, j3);
                        V l3 = m3.l(i8);
                        Class cls = W.f2012a;
                        int Z14 = C0115l.Z(i11);
                        int a4 = ((AbstractC0104a) object2).a(l3);
                        i10 += C0115l.a0(a4) + a4 + Z14;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        X2 = C0115l.X(i11, (C0110g) unsafe.getObject(abstractC0124v2, j3));
                        i10 += X2;
                    }
                    m3 = this;
                    break;
                case 11:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        int i16 = unsafe.getInt(abstractC0124v2, j3);
                        Z5 = C0115l.Z(i11);
                        b03 = C0115l.a0(i16);
                        X2 = b03 + Z5;
                        i10 += X2;
                    }
                    m3 = this;
                    break;
                case 12:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        int i17 = unsafe.getInt(abstractC0124v2, j3);
                        Z5 = C0115l.Z(i11);
                        b03 = C0115l.b0(i17);
                        X2 = b03 + Z5;
                        i10 += X2;
                    }
                    m3 = this;
                    break;
                case 13:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        Z3 = C0115l.Z(i11);
                        Z7 = Z3 + 4;
                        i10 += Z7;
                    }
                    m3 = this;
                    abstractC0124v2 = abstractC0124v;
                    break;
                case 14:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        Z6 = C0115l.Z(i11);
                        Z7 = Z6 + 8;
                        i10 += Z7;
                    }
                    m3 = this;
                    abstractC0124v2 = abstractC0124v;
                    break;
                case 15:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        int i18 = unsafe.getInt(abstractC0124v2, j3);
                        Z5 = C0115l.Z(i11);
                        b03 = C0115l.a0((i18 >> 31) ^ (i18 << 1));
                        X2 = b03 + Z5;
                        i10 += X2;
                    }
                    m3 = this;
                    break;
                case 16:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        long j6 = unsafe.getLong(abstractC0124v2, j3);
                        Z4 = C0115l.Z(i11);
                        b02 = C0115l.b0((j6 << 1) ^ (j6 >> 63));
                        i10 += b02 + Z4;
                    }
                    m3 = this;
                    break;
                case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                    if (m3.n(abstractC0124v2, i8, i7, i9, i3)) {
                        AbstractC0104a abstractC0104a = (AbstractC0104a) unsafe.getObject(abstractC0124v2, j3);
                        V l4 = m3.l(i8);
                        Z8 = C0115l.Z(i11) * 2;
                        a3 = abstractC0104a.a(l4);
                        c3 = a3 + Z8;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c3 = W.c(i11, (List) unsafe.getObject(abstractC0124v2, j3));
                    i10 += c3;
                    break;
                case 19:
                    c3 = W.b(i11, (List) unsafe.getObject(abstractC0124v2, j3));
                    i10 += c3;
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    List list = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls2 = W.f2012a;
                    if (list.size() != 0) {
                        Z9 = (C0115l.Z(i11) * list.size()) + W.e(list);
                        i10 += Z9;
                        break;
                    }
                    Z9 = 0;
                    i10 += Z9;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls3 = W.f2012a;
                    size = list2.size();
                    if (size != 0) {
                        i4 = W.i(list2);
                        Z10 = C0115l.Z(i11);
                        Z9 = (Z10 * size) + i4;
                        i10 += Z9;
                        break;
                    }
                    Z9 = 0;
                    i10 += Z9;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls4 = W.f2012a;
                    size = list3.size();
                    if (size != 0) {
                        i4 = W.d(list3);
                        Z10 = C0115l.Z(i11);
                        Z9 = (Z10 * size) + i4;
                        i10 += Z9;
                        break;
                    }
                    Z9 = 0;
                    i10 += Z9;
                case 23:
                    c3 = W.c(i11, (List) unsafe.getObject(abstractC0124v2, j3));
                    i10 += c3;
                    break;
                case 24:
                    c3 = W.b(i11, (List) unsafe.getObject(abstractC0124v2, j3));
                    i10 += c3;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls5 = W.f2012a;
                    int size3 = list4.size();
                    i10 += size3 == 0 ? 0 : (C0115l.Z(i11) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls6 = W.f2012a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        Z9 = C0115l.Z(i11) * size4;
                        for (int i19 = 0; i19 < size4; i19++) {
                            Object obj = list5.get(i19);
                            if (obj instanceof C0110g) {
                                int size5 = ((C0110g) obj).size();
                                Z9 = C0115l.a0(size5) + size5 + Z9;
                            } else {
                                Z9 = C0115l.Y((String) obj) + Z9;
                            }
                        }
                        i10 += Z9;
                        break;
                    }
                    Z9 = 0;
                    i10 += Z9;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC0124v2, j3);
                    V l5 = m3.l(i8);
                    Class cls7 = W.f2012a;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        Z11 = C0115l.Z(i11) * size6;
                        for (int i20 = 0; i20 < size6; i20++) {
                            int a5 = ((AbstractC0104a) list6.get(i20)).a(l5);
                            Z11 += C0115l.a0(a5) + a5;
                        }
                        i10 += Z11;
                        break;
                    }
                    Z11 = 0;
                    i10 += Z11;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls8 = W.f2012a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        Z9 = C0115l.Z(i11) * size7;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int size8 = ((C0110g) list7.get(i21)).size();
                            Z9 += C0115l.a0(size8) + size8;
                        }
                        i10 += Z9;
                        break;
                    }
                    Z9 = 0;
                    i10 += Z9;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls9 = W.f2012a;
                    size = list8.size();
                    if (size != 0) {
                        i4 = W.h(list8);
                        Z10 = C0115l.Z(i11);
                        Z9 = (Z10 * size) + i4;
                        i10 += Z9;
                        break;
                    }
                    Z9 = 0;
                    i10 += Z9;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls10 = W.f2012a;
                    size = list9.size();
                    if (size != 0) {
                        i4 = W.a(list9);
                        Z10 = C0115l.Z(i11);
                        Z9 = (Z10 * size) + i4;
                        i10 += Z9;
                        break;
                    }
                    Z9 = 0;
                    i10 += Z9;
                case 31:
                    c3 = W.b(i11, (List) unsafe.getObject(abstractC0124v2, j3));
                    i10 += c3;
                    break;
                case 32:
                    c3 = W.c(i11, (List) unsafe.getObject(abstractC0124v2, j3));
                    i10 += c3;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls11 = W.f2012a;
                    size = list10.size();
                    if (size != 0) {
                        i4 = W.f(list10);
                        Z10 = C0115l.Z(i11);
                        Z9 = (Z10 * size) + i4;
                        i10 += Z9;
                        break;
                    }
                    Z9 = 0;
                    i10 += Z9;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls12 = W.f2012a;
                    size = list11.size();
                    if (size != 0) {
                        i4 = W.g(list11);
                        Z10 = C0115l.Z(i11);
                        Z9 = (Z10 * size) + i4;
                        i10 += Z9;
                        break;
                    }
                    Z9 = 0;
                    i10 += Z9;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls13 = W.f2012a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls14 = W.f2012a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = W.e((List) unsafe.getObject(abstractC0124v2, j3));
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = W.i((List) unsafe.getObject(abstractC0124v2, j3));
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = W.d((List) unsafe.getObject(abstractC0124v2, j3));
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls15 = W.f2012a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls16 = W.f2012a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls17 = W.f2012a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = W.h((List) unsafe.getObject(abstractC0124v2, j3));
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = W.a((List) unsafe.getObject(abstractC0124v2, j3));
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls18 = W.f2012a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0124v2, j3);
                    Class cls19 = W.f2012a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = W.f((List) unsafe.getObject(abstractC0124v2, j3));
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = W.g((List) unsafe.getObject(abstractC0124v2, j3));
                    if (size2 > 0) {
                        Z12 = C0115l.Z(i11);
                        a02 = C0115l.a0(size2);
                        i5 = a02 + Z12;
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC0124v2, j3);
                    V l6 = m3.l(i8);
                    Class cls20 = W.f2012a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i22 = 0; i22 < size9; i22++) {
                            i6 += ((AbstractC0104a) list19.get(i22)).a(l6) + (C0115l.Z(i11) * 2);
                        }
                    }
                    i10 += i6;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0124v2, j3);
                    Object obj2 = m3.f1986b[(i8 / 3) * 2];
                    m3.f1997m.getClass();
                    H h3 = (H) object3;
                    G g3 = (G) obj2;
                    if (!h3.isEmpty()) {
                        Z11 = 0;
                        for (Map.Entry entry : h3.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            g3.getClass();
                            int Z15 = C0115l.Z(i11);
                            int a6 = G.a(g3.f1977a, key, value);
                            Z11 += C0115l.a0(a6) + a6 + Z15;
                        }
                        i10 += Z11;
                        break;
                    }
                    Z11 = 0;
                    i10 += Z11;
                case 51:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        Z2 = C0115l.Z(i11);
                        c3 = Z2 + 8;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        Z13 = C0115l.Z(i11);
                        c3 = Z13 + 4;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        long y = y(j3, abstractC0124v2);
                        size2 = C0115l.Z(i11);
                        i5 = C0115l.b0(y);
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        long y3 = y(j3, abstractC0124v2);
                        size2 = C0115l.Z(i11);
                        i5 = C0115l.b0(y3);
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        int x = x(j3, abstractC0124v2);
                        Z8 = C0115l.Z(i11);
                        a3 = C0115l.b0(x);
                        c3 = a3 + Z8;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        Z2 = C0115l.Z(i11);
                        c3 = Z2 + 8;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        Z13 = C0115l.Z(i11);
                        c3 = Z13 + 4;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        c3 = C0115l.Z(i11) + 1;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        Object object4 = unsafe.getObject(abstractC0124v2, j3);
                        i10 = (object4 instanceof C0110g ? C0115l.X(i11, (C0110g) object4) : C0115l.Y((String) object4) + C0115l.Z(i11)) + i10;
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        Object object5 = unsafe.getObject(abstractC0124v2, j3);
                        V l7 = m3.l(i8);
                        Class cls21 = W.f2012a;
                        int Z16 = C0115l.Z(i11);
                        int a7 = ((AbstractC0104a) object5).a(l7);
                        a03 = C0115l.a0(a7) + a7 + Z16;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        c3 = C0115l.X(i11, (C0110g) unsafe.getObject(abstractC0124v2, j3));
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        int x3 = x(j3, abstractC0124v2);
                        Z8 = C0115l.Z(i11);
                        a3 = C0115l.a0(x3);
                        c3 = a3 + Z8;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        int x4 = x(j3, abstractC0124v2);
                        Z8 = C0115l.Z(i11);
                        a3 = C0115l.b0(x4);
                        c3 = a3 + Z8;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        Z13 = C0115l.Z(i11);
                        c3 = Z13 + 4;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        Z2 = C0115l.Z(i11);
                        c3 = Z2 + 8;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        int x5 = x(j3, abstractC0124v2);
                        Z8 = C0115l.Z(i11);
                        a3 = C0115l.a0((x5 >> 31) ^ (x5 << 1));
                        c3 = a3 + Z8;
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        long y4 = y(j3, abstractC0124v2);
                        size2 = C0115l.Z(i11);
                        i5 = C0115l.b0((y4 << 1) ^ (y4 >> 63));
                        a03 = i5 + size2;
                        i10 += a03;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m3.p(abstractC0124v2, i11, i8)) {
                        c3 = ((AbstractC0104a) unsafe.getObject(abstractC0124v2, j3)).a(m3.l(i8)) + (C0115l.Z(i11) * 2);
                        i10 += c3;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
        }
    }

    public final boolean i(AbstractC0124v abstractC0124v, AbstractC0124v abstractC0124v2, int i3) {
        return m(i3, abstractC0124v) == m(i3, abstractC0124v2);
    }

    public final void j(Object obj, Object obj2, int i3) {
        int i4 = this.f1985a[i3];
        if (i0.f2065c.h(K(i3) & 1048575, obj) == null) {
            return;
        }
        k(i3);
    }

    public final void k(int i3) {
        if (this.f1986b[((i3 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final V l(int i3) {
        int i4 = (i3 / 3) * 2;
        Object[] objArr = this.f1986b;
        V v3 = (V) objArr[i4];
        if (v3 != null) {
            return v3;
        }
        V a3 = S.f2003c.a((Class) objArr[i4 + 1]);
        objArr[i4] = a3;
        return a3;
    }

    public final boolean m(int i3, Object obj) {
        int i4 = this.f1985a[i3 + 2];
        long j3 = i4 & 1048575;
        if (j3 == 1048575) {
            int K2 = K(i3);
            long j4 = K2 & 1048575;
            switch (J(K2)) {
                case 0:
                    if (Double.doubleToRawLongBits(i0.f2065c.d(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(i0.f2065c.e(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (i0.f2065c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (i0.f2065c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (i0.f2065c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return i0.f2065c.c(j4, obj);
                case 8:
                    Object h3 = i0.f2065c.h(j4, obj);
                    if (h3 instanceof String) {
                        return !((String) h3).isEmpty();
                    }
                    if (h3 instanceof C0110g) {
                        return !C0110g.f2044m.equals(h3);
                    }
                    throw new IllegalArgumentException();
                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                    if (i0.f2065c.h(j4, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0110g.f2044m.equals(i0.f2065c.h(j4, obj));
                case 11:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (i0.f2065c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (i0.f2065c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                    if (i0.f2065c.h(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i4 >>> 20)) & i0.f2065c.f(j3, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean n(Object obj, int i3, int i4, int i5, int i6) {
        return i4 == 1048575 ? m(i3, obj) : (i5 & i6) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0124v newInstance() {
        this.f1994j.getClass();
        return ((AbstractC0124v) this.f1989e).i();
    }

    public final boolean p(Object obj, int i3, int i4) {
        return i0.f2065c.f((long) (this.f1985a[i4 + 2] & 1048575), obj) == i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C0117n r12, androidx.datastore.preferences.protobuf.C0114k r13) {
        /*
            r8 = this;
            int r10 = r8.K(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.h0 r10 = androidx.datastore.preferences.protobuf.i0.f2065c
            java.lang.Object r10 = r10.h(r0, r9)
            androidx.datastore.preferences.protobuf.I r2 = r8.f1997m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.H r10 = androidx.datastore.preferences.protobuf.H.f1979l
            androidx.datastore.preferences.protobuf.H r10 = r10.b()
            androidx.datastore.preferences.protobuf.i0.o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.H r3 = (androidx.datastore.preferences.protobuf.H) r3
            boolean r3 = r3.f1980k
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.H r3 = androidx.datastore.preferences.protobuf.H.f1979l
            androidx.datastore.preferences.protobuf.H r3 = r3.b()
            androidx.datastore.preferences.protobuf.I.a(r3, r10)
            androidx.datastore.preferences.protobuf.i0.o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.H r10 = (androidx.datastore.preferences.protobuf.H) r10
            androidx.datastore.preferences.protobuf.G r11 = (androidx.datastore.preferences.protobuf.G) r11
            androidx.datastore.preferences.protobuf.F r9 = r11.f1977a
            r11 = 2
            r13.w(r11)
            androidx.datastore.preferences.protobuf.j r0 = r13.f2073a
            int r1 = r0.v()
            int r1 = r0.e(r1)
            java.lang.Object r2 = r9.f1976c
            java.lang.String r3 = ""
            r4 = r2
        L53:
            int r5 = r13.a()     // Catch: java.lang.Throwable -> L77
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L99
            boolean r6 = r0.c()     // Catch: java.lang.Throwable -> L77
            if (r6 == 0) goto L63
            goto L99
        L63:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L84
            if (r5 == r11) goto L79
            boolean r5 = r13.x()     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.C0127y -> L8c
            if (r5 == 0) goto L71
            goto L53
        L71:
            androidx.datastore.preferences.protobuf.z r5 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.C0127y -> L8c
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.C0127y -> L8c
            throw r5     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.C0127y -> L8c
        L77:
            r9 = move-exception
            goto La0
        L79:
            androidx.datastore.preferences.protobuf.q0 r5 = r9.f1975b     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.C0127y -> L8c
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.C0127y -> L8c
            java.lang.Object r4 = r13.i(r5, r6, r12)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.C0127y -> L8c
            goto L53
        L84:
            androidx.datastore.preferences.protobuf.q0 r5 = r9.f1974a     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.C0127y -> L8c
            r6 = 0
            java.lang.Object r3 = r13.i(r5, r6, r6)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.C0127y -> L8c
            goto L53
        L8c:
            boolean r5 = r13.x()     // Catch: java.lang.Throwable -> L77
            if (r5 == 0) goto L93
            goto L53
        L93:
            androidx.datastore.preferences.protobuf.z r9 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L77
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L77
            throw r9     // Catch: java.lang.Throwable -> L77
        L99:
            r10.put(r3, r4)     // Catch: java.lang.Throwable -> L77
            r0.d(r1)
            return
        La0:
            r0.d(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.q(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.k):void");
    }

    public final void r(Object obj, Object obj2, int i3) {
        if (m(i3, obj2)) {
            long K2 = K(i3) & 1048575;
            Unsafe unsafe = f1984o;
            Object object = unsafe.getObject(obj2, K2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1985a[i3] + " is present but null: " + obj2);
            }
            V l3 = l(i3);
            if (!m(i3, obj)) {
                if (o(object)) {
                    AbstractC0124v newInstance = l3.newInstance();
                    l3.a(newInstance, object);
                    unsafe.putObject(obj, K2, newInstance);
                } else {
                    unsafe.putObject(obj, K2, object);
                }
                F(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, K2);
            if (!o(object2)) {
                AbstractC0124v newInstance2 = l3.newInstance();
                l3.a(newInstance2, object2);
                unsafe.putObject(obj, K2, newInstance2);
                object2 = newInstance2;
            }
            l3.a(object2, object);
        }
    }

    public final void s(Object obj, Object obj2, int i3) {
        int[] iArr = this.f1985a;
        int i4 = iArr[i3];
        if (p(obj2, i4, i3)) {
            long K2 = K(i3) & 1048575;
            Unsafe unsafe = f1984o;
            Object object = unsafe.getObject(obj2, K2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2);
            }
            V l3 = l(i3);
            if (!p(obj, i4, i3)) {
                if (o(object)) {
                    AbstractC0124v newInstance = l3.newInstance();
                    l3.a(newInstance, object);
                    unsafe.putObject(obj, K2, newInstance);
                } else {
                    unsafe.putObject(obj, K2, object);
                }
                G(obj, i4, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, K2);
            if (!o(object2)) {
                AbstractC0124v newInstance2 = l3.newInstance();
                l3.a(newInstance2, object2);
                unsafe.putObject(obj, K2, newInstance2);
                object2 = newInstance2;
            }
            l3.a(object2, object);
        }
    }

    public final Object t(int i3, Object obj) {
        V l3 = l(i3);
        long K2 = K(i3) & 1048575;
        if (!m(i3, obj)) {
            return l3.newInstance();
        }
        Object object = f1984o.getObject(obj, K2);
        if (o(object)) {
            return object;
        }
        AbstractC0124v newInstance = l3.newInstance();
        if (object != null) {
            l3.a(newInstance, object);
        }
        return newInstance;
    }

    public final Object u(Object obj, int i3, int i4) {
        V l3 = l(i4);
        if (!p(obj, i3, i4)) {
            return l3.newInstance();
        }
        Object object = f1984o.getObject(obj, K(i4) & 1048575);
        if (o(object)) {
            return object;
        }
        AbstractC0124v newInstance = l3.newInstance();
        if (object != null) {
            l3.a(newInstance, object);
        }
        return newInstance;
    }

    public final int z(int i3) {
        if (i3 >= this.f1987c && i3 <= this.f1988d) {
            int[] iArr = this.f1985a;
            int length = (iArr.length / 3) - 1;
            int i4 = 0;
            while (i4 <= length) {
                int i5 = (length + i4) >>> 1;
                int i6 = i5 * 3;
                int i7 = iArr[i6];
                if (i3 == i7) {
                    return i6;
                }
                if (i3 < i7) {
                    length = i5 - 1;
                } else {
                    i4 = i5 + 1;
                }
            }
        }
        return -1;
    }
}
