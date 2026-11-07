package p058u0;

import O1.g;
import a2.e;
import a2.h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p069z0.b;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4590b;

    public c(e eVar, b bVar) {
        this.f4589a = eVar;
        this.f4590b = bVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        h.e(obj, "obj");
        h.e(method, "method");
        boolean zA = h.a(method.getName(), "accept");
        b bVar = this.f4590b;
        if (zA && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            e eVar = this.f4589a;
            if (eVar.d(obj2)) {
                h.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                bVar.f(obj2);
                return g.f1211a;
            }
            throw new ClassCastException("Value cannot be cast to " + eVar.b());
        }
        if (h.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (h.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(bVar.hashCode());
        }
        if (h.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return bVar.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
