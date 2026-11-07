package p003b0;

import D0.a;
import java.lang.reflect.InvocationTargetException;
import p042o.j;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f2345b = new j(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f2346a;

    public B(I i3) {
        this.f2346a = i3;
    }

    public static Class b(String str, ClassLoader classLoader) throws ClassNotFoundException {
        j jVar = f2345b;
        j jVar2 = (j) jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new j(0);
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
            throw new a(p055t.a.b("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        } catch (ClassNotFoundException e4) {
            throw new a(p055t.a.b("Unable to instantiate fragment ", str, ": make sure class name exists"), e4);
        }
    }

    public final AbstractComponentCallbacksC0163s a(String str) {
        try {
            return (AbstractComponentCallbacksC0163s) c(str, this.f2346a.f2388v.n.getClassLoader()).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e3) {
            throw new a(p055t.a.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new a(p055t.a.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new a(p055t.a.b("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new a(p055t.a.b("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e6);
        }
    }
}
