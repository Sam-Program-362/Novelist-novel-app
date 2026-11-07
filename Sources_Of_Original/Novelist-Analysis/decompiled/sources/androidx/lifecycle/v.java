package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f2167a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
        int iB0 = p024h2.d.b0(str, ".", 0, false);
        if (iB0 >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            int i3 = 0;
            do {
                sb2.append((CharSequence) str, i3, iB0);
                sb2.append("_");
                i3 = iB0 + 1;
                if (iB0 >= str.length()) {
                    break;
                }
                iB0 = p024h2.d.b0(str, ".", i3, false);
            } while (iB0 > 0);
            sb2.append((CharSequence) str, i3, str.length());
            str = sb2.toString();
            a2.h.d(str, "toString(...)");
        }
        return B1.e.m(sb, str, "_LifecycleAdapter");
    }

    /* JADX WARN: Code duplicated, block: B:60:0x010c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0118  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x013b A[SYNTHETIC] */
    public static int c(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i3;
        boolean z3;
        HashMap map = f2167a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i4 = 1;
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
                String strB = b(canonicalName);
                if (name.length() != 0) {
                    strB = name + '.' + strB;
                }
                declaredConstructor = Class.forName(strB).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            }
            HashMap map2 = f2168b;
            if (declaredConstructor != null) {
                map2.put(cls, E2.a.B(declaredConstructor));
            } else {
                C0129c c0129c = C0129c.f2142c;
                HashMap map3 = c0129c.f2144b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((B) declaredMethods[i5].getAnnotation(B.class)) != null) {
                                c0129c.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i5++;
                        }
                    } catch (NoClassDefFoundError e4) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && r.class.isAssignableFrom(superclass)) {
                        a2.h.d(superclass, "superclass");
                        if (c(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            a2.h.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            a2.h.d(interfaces, "klass.interfaces");
                            for (Class<?> cls2 : interfaces) {
                                if (cls2 == null && r.class.isAssignableFrom(cls2)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    a2.h.d(cls2, "intrface");
                                    if (c(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        a2.h.b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        a2.h.d(interfaces, "klass.interfaces");
                        while (i3 < r7) {
                            if (cls2 == null) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                a2.h.d(cls2, "intrface");
                                if (c(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    a2.h.b(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i4 = 2;
        }
        map.put(cls, Integer.valueOf(i4));
        return i4;
    }
}
