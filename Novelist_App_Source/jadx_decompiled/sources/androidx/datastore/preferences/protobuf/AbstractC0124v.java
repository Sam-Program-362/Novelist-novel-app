package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0124v extends AbstractC0104a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0124v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected c0 unknownFields;

    public AbstractC0124v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c0.f2031f;
    }

    public static AbstractC0124v d(Class cls) {
        AbstractC0124v abstractC0124v = defaultInstanceMap.get(cls);
        if (abstractC0124v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0124v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0124v != null) {
            return abstractC0124v;
        }
        AbstractC0124v abstractC0124v2 = (AbstractC0124v) ((AbstractC0124v) i0.d(cls)).c(6);
        if (abstractC0124v2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0124v2);
        return abstractC0124v2;
    }

    public static Object e(Method method, AbstractC0124v abstractC0124v, Object... objArr) {
        try {
            return method.invoke(abstractC0124v, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(AbstractC0124v abstractC0124v, boolean z3) {
        byte byteValue = ((Byte) abstractC0124v.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        S s3 = S.f2003c;
        s3.getClass();
        boolean e3 = s3.a(abstractC0124v.getClass()).e(abstractC0124v);
        if (z3) {
            abstractC0124v.c(2);
        }
        return e3;
    }

    public static void j(Class cls, AbstractC0124v abstractC0124v) {
        abstractC0124v.h();
        defaultInstanceMap.put(cls, abstractC0124v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0104a
    public final int a(V v3) {
        int h3;
        int h4;
        if (g()) {
            if (v3 == null) {
                S s3 = S.f2003c;
                s3.getClass();
                h4 = s3.a(getClass()).h(this);
            } else {
                h4 = v3.h(this);
            }
            if (h4 >= 0) {
                return h4;
            }
            throw new IllegalStateException(B1.e.g("serialized size must be non-negative, was ", h4));
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3 & Integer.MAX_VALUE;
        }
        if (v3 == null) {
            S s4 = S.f2003c;
            s4.getClass();
            h3 = s4.a(getClass()).h(this);
        } else {
            h3 = v3.h(this);
        }
        k(h3);
        return h3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0104a
    public final void b(C0115l c0115l) {
        S s3 = S.f2003c;
        s3.getClass();
        V a3 = s3.a(getClass());
        E e3 = c0115l.f2078i;
        if (e3 == null) {
            e3 = new E(c0115l);
        }
        a3.b(this, e3);
    }

    public abstract Object c(int i3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        S s3 = S.f2003c;
        s3.getClass();
        return s3.a(getClass()).f(this, (AbstractC0124v) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            S s3 = S.f2003c;
            s3.getClass();
            return s3.a(getClass()).c(this);
        }
        if (this.memoizedHashCode == 0) {
            S s4 = S.f2003c;
            s4.getClass();
            this.memoizedHashCode = s4.a(getClass()).c(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC0124v i() {
        return (AbstractC0124v) c(4);
    }

    public final void k(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException(B1.e.g("serialized size must be non-negative, was ", i3));
        }
        this.memoizedSerializedSize = (i3 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = L.f1983a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        L.c(this, sb, 0);
        return sb.toString();
    }
}
