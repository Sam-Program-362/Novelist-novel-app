package t0;

import a2.e;
import a2.h;
import android.app.Activity;
import java.lang.reflect.Proxy;
import u0.c;
import u0.d;
import z0.C0505b;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472a {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f4546a;

    public /* synthetic */ C0472a(ClassLoader classLoader) {
        this.f4546a = classLoader;
    }

    public d a(Object obj, e eVar, Activity activity, C0505b c0505b) {
        c cVar = new c(eVar, c0505b);
        Object newProxyInstance = Proxy.newProxyInstance(this.f4546a, new Class[]{b()}, cVar);
        h.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f4546a.loadClass("java.util.function.Consumer");
        h.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
