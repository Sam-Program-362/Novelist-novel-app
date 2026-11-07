package T1;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a implements R1.c, d, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final R1.c f1275k;

    public a(R1.c cVar) {
        this.f1275k = cVar;
    }

    @Override // T1.d
    public d c() {
        R1.c cVar = this.f1275k;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public R1.c i(R1.c cVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement j() {
        int i3;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i3 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i3 = -1;
        }
        int i4 = i3 >= 0 ? eVar.l()[i3] : -1;
        f fVar = g.f1283b;
        f fVar2 = g.f1282a;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                g.f1283b = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.f1283b = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2 && (method = fVar.f1279a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = fVar.f1280b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = fVar.f1281c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i4);
    }

    public abstract Object m(Object obj);

    @Override // R1.c
    public final void resumeWith(Object obj) {
        R1.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            R1.c cVar2 = aVar.f1275k;
            a2.h.b(cVar2);
            try {
                obj = aVar.m(obj);
                if (obj == S1.a.f1260k) {
                    return;
                }
            } catch (Throwable th) {
                obj = H2.h.i(th);
            }
            aVar.n();
            if (!(cVar2 instanceof a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object j3 = j();
        if (j3 == null) {
            j3 = getClass().getName();
        }
        sb.append(j3);
        return sb.toString();
    }

    public void n() {
    }
}
