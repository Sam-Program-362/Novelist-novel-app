package androidx.lifecycle;

import h2.AbstractC0273d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f2167a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f2168b = new HashMap();

    public static void a(Constructor constructor, r rVar) {
        try {
            a2.h.d(constructor.newInstance(rVar), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int b02 = AbstractC0273d.b0(str, ".", 0, false);
        if (b02 >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            int i3 = 0;
            do {
                sb2.append((CharSequence) str, i3, b02);
                sb2.append("_");
                i3 = b02 + 1;
                if (b02 >= str.length()) {
                    break;
                }
                b02 = AbstractC0273d.b0(str, ".", i3, false);
            } while (b02 > 0);
            sb2.append((CharSequence) str, i3, str.length());
            str = sb2.toString();
            a2.h.d(str, "toString(...)");
        }
        return B1.e.m(sb, str, "_LifecycleAdapter");
    }

    public static int c(Class cls) {
        Constructor<?> constructor;
        boolean z3;
        HashMap hashMap = f2167a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : StringUtils.EMPTY;
                a2.h.d(name, "fullPackage");
                if (name.length() != 0) {
                    a2.h.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    a2.h.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                a2.h.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String b3 = b(canonicalName);
                if (name.length() != 0) {
                    b3 = name + '.' + b3;
                }
                constructor = Class.forName(b3).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            }
            HashMap hashMap2 = f2168b;
            if (constructor != null) {
                hashMap2.put(cls, E2.a.B(constructor));
            } else {
                C0131c c0131c = C0131c.f2142c;
                HashMap hashMap3 = c0131c.f2144b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z3 = false;
                                break;
                            }
                            if (((B) declaredMethods[i4].getAnnotation(B.class)) != null) {
                                c0131c.a(cls, declaredMethods);
                                z3 = true;
                                break;
                            }
                            i4++;
                        }
                    } catch (NoClassDefFoundError e4) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
                    }
                }
                if (!z3) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && r.class.isAssignableFrom(superclass)) {
                        a2.h.d(superclass, "superclass");
                        if (c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            a2.h.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    a2.h.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length2) {
                            Class<?> cls2 = interfaces[i5];
                            if (cls2 != null && r.class.isAssignableFrom(cls2)) {
                                a2.h.d(cls2, "intrface");
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                a2.h.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i5++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i3 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
