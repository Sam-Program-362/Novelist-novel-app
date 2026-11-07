package p056t0;

import a2.e;
import a2.h;
import android.app.Activity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import p058u0.c;
import p058u0.d;
import p069z0.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f4546a;

    public /* synthetic */ a(ClassLoader classLoader) {
        this.f4546a = classLoader;
    }

    public d a(Object obj, e eVar, Activity activity, b bVar) throws IllegalAccessException, InvocationTargetException {
        c cVar = new c(eVar, bVar);
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f4546a, new Class[]{b()}, cVar);
        h.d(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, objNewProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, objNewProxyInstance);
    }

    public Class b() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f4546a.loadClass("java.util.function.Consumer");
        h.d(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }
}
