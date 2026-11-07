package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0129c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0129c f2142c = new C0129c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2143a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2144b = new HashMap();

    public static void b(HashMap map, C0128b c0128b, EnumC0138l enumC0138l, Class cls) {
        EnumC0138l enumC0138l2 = (EnumC0138l) map.get(c0128b);
        if (enumC0138l2 == null || enumC0138l == enumC0138l2) {
            if (enumC0138l2 == null) {
                map.put(c0128b, enumC0138l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0128b.f2141b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0138l2 + ", new value " + enumC0138l);
    }

    public final C0127a a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f2143a;
        if (superclass != null) {
            C0127a c0127aA = (C0127a) map2.get(superclass);
            if (c0127aA == null) {
                c0127aA = a(superclass, null);
            }
            map.putAll(c0127aA.f2139b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0127a c0127aA2 = (C0127a) map2.get(cls2);
            if (c0127aA2 == null) {
                c0127aA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0127aA2.f2139b.entrySet()) {
                b(map, (C0128b) entry.getKey(), (EnumC0138l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            B b3 = (B) method.getAnnotation(B.class);
            if (b3 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!InterfaceC0144s.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                EnumC0138l enumC0138lValue = b3.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0138l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0138lValue != EnumC0138l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0128b(i3, method), enumC0138lValue, cls);
                z3 = true;
            }
        }
        C0127a c0127a = new C0127a(map);
        map2.put(cls, c0127a);
        this.f2144b.put(cls, Boolean.valueOf(z3));
        return c0127a;
    }
}
