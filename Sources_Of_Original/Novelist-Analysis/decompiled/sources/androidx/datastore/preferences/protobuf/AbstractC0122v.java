package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0122v extends AbstractC0102a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0122v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected c0 unknownFields;

    public AbstractC0122v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c0.f2031f;
    }

    public static AbstractC0122v d(Class cls) {
        AbstractC0122v abstractC0122v = defaultInstanceMap.get(cls);
        if (abstractC0122v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0122v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0122v != null) {
            return abstractC0122v;
        }
        AbstractC0122v abstractC0122v2 = (AbstractC0122v) ((AbstractC0122v) i0.d(cls)).c(6);
        if (abstractC0122v2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0122v2);
        return abstractC0122v2;
    }

    public static Object e(Method method, AbstractC0122v abstractC0122v, Object... objArr) {
        try {
            return method.invoke(abstractC0122v, objArr);
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

    public static final boolean f(AbstractC0122v abstractC0122v, boolean z3) {
        byte bByteValue = ((Byte) abstractC0122v.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        S s3 = S.f2003c;
        s3.getClass();
        boolean zE = s3.a(abstractC0122v.getClass()).e(abstractC0122v);
        if (z3) {
            abstractC0122v.c(2);
        }
        return zE;
    }

    public static void j(Class cls, AbstractC0122v abstractC0122v) {
        abstractC0122v.h();
        defaultInstanceMap.put(cls, abstractC0122v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0102a
    public final int a(V v3) {
        int iH;
        int iH2;
        if (g()) {
            if (v3 == null) {
                S s3 = S.f2003c;
                s3.getClass();
                iH2 = s3.a(getClass()).h(this);
            } else {
                iH2 = v3.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            throw new IllegalStateException(B1.e.g("serialized size must be non-negative, was ", iH2));
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3 & Integer.MAX_VALUE;
        }
        if (v3 == null) {
            S s4 = S.f2003c;
            s4.getClass();
            iH = s4.a(getClass()).h(this);
        } else {
            iH = v3.h(this);
        }
        k(iH);
        return iH;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0102a
    public final void b(C0113l c0113l) {
        S s3 = S.f2003c;
        s3.getClass();
        V vA = s3.a(getClass());
        E e3 = c0113l.f2078i;
        if (e3 == null) {
            e3 = new E(c0113l);
        }
        vA.b(this, e3);
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
        return s3.a(getClass()).f(this, (AbstractC0122v) obj);
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

    public final AbstractC0122v i() {
        return (AbstractC0122v) c(4);
    }

    public final void k(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException(B1.e.g("serialized size must be non-negative, was ", i3));
        }
        this.memoizedSerializedSize = (i3 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = L.f1983a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        L.c(this, sb, 0);
        return sb.toString();
    }
}
