package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0131c f2142c = new C0131c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2143a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2144b = new HashMap();

    public static void b(HashMap hashMap, C0130b c0130b, EnumC0140l enumC0140l, Class cls) {
        EnumC0140l enumC0140l2 = (EnumC0140l) hashMap.get(c0130b);
        if (enumC0140l2 == null || enumC0140l == enumC0140l2) {
            if (enumC0140l2 == null) {
                hashMap.put(c0130b, enumC0140l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0130b.f2141b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0140l2 + ", new value " + enumC0140l);
    }

    public final C0129a a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f2143a;
        if (superclass != null) {
            C0129a c0129a = (C0129a) hashMap2.get(superclass);
            if (c0129a == null) {
                c0129a = a(superclass, null);
            }
            hashMap.putAll(c0129a.f2139b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0129a c0129a2 = (C0129a) hashMap2.get(cls2);
            if (c0129a2 == null) {
                c0129a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0129a2.f2139b.entrySet()) {
                b(hashMap, (C0130b) entry.getKey(), (EnumC0140l) entry.getValue(), cls);
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
                    if (!InterfaceC0146s.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                EnumC0140l value = b3.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0140l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0140l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0130b(i3, method), value, cls);
                z3 = true;
            }
        }
        C0129a c0129a3 = new C0129a(hashMap);
        hashMap2.put(cls, c0129a3);
        this.f2144b.put(cls, Boolean.valueOf(z3));
        return c0129a3;
    }
}
