package n0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import it.returntrue.novelist.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0433a f4133d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f4134e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f4137c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f4136b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4135a = new HashMap();

    public C0433a(Context context) {
        this.f4137c = context.getApplicationContext();
    }

    public static C0433a c(Context context) {
        if (f4133d == null) {
            synchronized (f4134e) {
                try {
                    if (f4133d == null) {
                        f4133d = new C0433a(context);
                    }
                } finally {
                }
            }
        }
        return f4133d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f4137c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it2 = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    hashSet = this.f4136b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it2.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0434b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    b((Class) it3.next(), hashSet2);
                }
            } catch (ClassNotFoundException e3) {
                throw new D0.a(e3);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        HashMap hashMap = this.f4135a;
        if (E2.a.z()) {
            try {
                Trace.beginSection(E2.a.V(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0434b interfaceC0434b = (InterfaceC0434b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a3 = interfaceC0434b.a();
                if (!a3.isEmpty()) {
                    for (Class cls2 : a3) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object b3 = interfaceC0434b.b(this.f4137c);
                hashSet.remove(cls);
                hashMap.put(cls, b3);
            } catch (Throwable th2) {
                throw new D0.a(th2);
            }
        }
        Trace.endSection();
    }
}
