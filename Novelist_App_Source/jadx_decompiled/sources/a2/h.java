package a2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f1707a = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        f(nullPointerException, h.class.getName());
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        f(nullPointerException, h.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        f(nullPointerException, h.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = h.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            f(nullPointerException, h.class.getName());
            throw nullPointerException;
        }
    }

    public static void f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(stackTrace[i4].getClassName())) {
                i3 = i4;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3 + 1, length));
    }

    public static void g(String str) {
        D0.a aVar = new D0.a(AbstractC0468a.b("lateinit property ", str, " has not been initialized"));
        f(aVar, h.class.getName());
        throw aVar;
    }

    public static final Object[] h(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it2 = collection.iterator();
            if (it2.hasNext()) {
                Object[] objArr = new Object[size];
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    objArr[i3] = it2.next();
                    if (i4 >= objArr.length) {
                        if (!it2.hasNext()) {
                            return objArr;
                        }
                        int i5 = ((i4 * 3) + 1) >>> 1;
                        if (i5 <= i4) {
                            i5 = 2147483645;
                            if (i4 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i5);
                        d(objArr, "copyOf(...)");
                    } else if (!it2.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i4);
                        d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i3 = i4;
                }
            }
        }
        return f1707a;
    }

    public static final Object[] i(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i3 = 0;
        if (size != 0) {
            Iterator it2 = collection.iterator();
            if (it2.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i4 = i3 + 1;
                    objArr2[i3] = it2.next();
                    if (i4 >= objArr2.length) {
                        if (!it2.hasNext()) {
                            return objArr2;
                        }
                        int i5 = ((i4 * 3) + 1) >>> 1;
                        if (i5 <= i4) {
                            i5 = 2147483645;
                            if (i4 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i5);
                        d(objArr2, "copyOf(...)");
                    } else if (!it2.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i4] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i4);
                        d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i3 = i4;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
