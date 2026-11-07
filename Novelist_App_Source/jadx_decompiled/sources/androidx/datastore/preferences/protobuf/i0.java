package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f2063a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f2064b;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f2065c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2066d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2067e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2068f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f2069g;

    static {
        Unsafe i3 = i();
        f2063a = i3;
        f2064b = AbstractC0106c.f2029a;
        boolean h3 = h(Long.TYPE);
        boolean h4 = h(Integer.TYPE);
        h0 h0Var = null;
        if (i3 != null) {
            if (!AbstractC0106c.a()) {
                h0Var = new g0(i3);
            } else if (h3) {
                h0Var = new f0(i3, 1);
            } else if (h4) {
                h0Var = new f0(i3, 0);
            }
        }
        f2065c = h0Var;
        f2066d = h0Var == null ? false : h0Var.r();
        f2067e = h0Var == null ? false : h0Var.q();
        f2068f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g3 = g();
        if (g3 != null && h0Var != null) {
            h0Var.i(g3);
        }
        f2069g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j3, Object obj) {
        return ((byte) ((f2065c.f((-4) & j3, obj) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j3, Object obj) {
        return ((byte) ((f2065c.f((-4) & j3, obj) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f2063a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int e(Class cls) {
        if (f2067e) {
            return f2065c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f2067e) {
            f2065c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0106c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean h(Class cls) {
        if (!AbstractC0106c.a()) {
            return false;
        }
        try {
            Class cls2 = f2064b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new e0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j3, byte b3) {
        f2065c.k(bArr, f2068f + j3, b3);
    }

    public static void k(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int f3 = f2065c.f(j4, obj);
        int i3 = ((~((int) j3)) & 3) << 3;
        m(obj, j4, ((255 & b3) << i3) | (f3 & (~(255 << i3))));
    }

    public static void l(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int i3 = (((int) j3) & 3) << 3;
        m(obj, j4, ((255 & b3) << i3) | (f2065c.f(j4, obj) & (~(255 << i3))));
    }

    public static void m(Object obj, long j3, int i3) {
        f2065c.n(obj, j3, i3);
    }

    public static void n(Object obj, long j3, long j4) {
        f2065c.o(obj, j3, j4);
    }

    public static void o(Object obj, long j3, Object obj2) {
        f2065c.p(obj, j3, obj2);
    }
}
