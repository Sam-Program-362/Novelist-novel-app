package p040n0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import it.returntrue.novelist.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f4133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f4134e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4137c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f4136b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4135a = new HashMap();

    public a(Context context) {
        this.f4137c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f4133d == null) {
            synchronized (f4134e) {
                try {
                    if (f4133d == null) {
                        f4133d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
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
                    boolean zHasNext = it2.hasNext();
                    hashSet = this.f4136b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it2.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
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
        HashMap map = this.f4135a;
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
        if (map.containsKey(cls)) {
            map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object objB = bVar.b(this.f4137c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new D0.a(th2);
            }
        }
        Trace.endSection();
    }
}
