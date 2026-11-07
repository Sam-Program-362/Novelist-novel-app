package u0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import z0.C0505b;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final a2.e f4589a;

    /* renamed from: b, reason: collision with root package name */
    public final C0505b f4590b;

    public c(a2.e eVar, C0505b c0505b) {
        this.f4589a = eVar;
        this.f4590b = c0505b;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        a2.h.e(obj, "obj");
        a2.h.e(method, "method");
        boolean a3 = a2.h.a(method.getName(), "accept");
        C0505b c0505b = this.f4590b;
        if (a3 && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            a2.e eVar = this.f4589a;
            if (eVar.d(obj2)) {
                a2.h.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                c0505b.f(obj2);
                return O1.g.f1211a;
            }
            throw new ClassCastException("Value cannot be cast to " + eVar.b());
        }
        if (a2.h.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (a2.h.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(c0505b.hashCode());
        }
        if (a2.h.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return c0505b.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
