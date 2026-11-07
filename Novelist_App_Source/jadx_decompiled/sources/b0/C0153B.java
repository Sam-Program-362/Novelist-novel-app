package b0;

import java.lang.reflect.InvocationTargetException;
import t.AbstractC0468a;

/* renamed from: b0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153B {

    /* renamed from: b, reason: collision with root package name */
    public static final o.j f2345b = new o.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f2346a;

    public C0153B(I i3) {
        this.f2346a = i3;
    }

    public static Class b(String str, ClassLoader classLoader) {
        o.j jVar = f2345b;
        o.j jVar2 = (o.j) jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new o.j(0);
            jVar.put(classLoader, jVar2);
        }
        Class cls = (Class) jVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        jVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(String str, ClassLoader classLoader) {
        try {
            return b(str, classLoader);
        } catch (ClassCastException e3) {
            throw new D0.a(AbstractC0468a.b("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        } catch (ClassNotFoundException e4) {
            throw new D0.a(AbstractC0468a.b("Unable to instantiate fragment ", str, ": make sure class name exists"), e4);
        }
    }

    public final AbstractComponentCallbacksC0171s a(String str) {
        try {
            return (AbstractComponentCallbacksC0171s) c(str, this.f2346a.f2388v.n.getClassLoader()).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e3) {
            throw new D0.a(AbstractC0468a.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new D0.a(AbstractC0468a.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new D0.a(AbstractC0468a.b("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new D0.a(AbstractC0468a.b("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e6);
        }
    }
}
