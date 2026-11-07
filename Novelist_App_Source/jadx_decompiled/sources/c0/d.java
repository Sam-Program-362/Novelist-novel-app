package c0;

import a2.h;
import android.util.Log;
import b0.AbstractComponentCallbacksC0171s;
import b0.I;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2657a = c.f2656a;

    public static c a(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        while (abstractComponentCallbacksC0171s != null) {
            if (abstractComponentCallbacksC0171s.f2517D != null && abstractComponentCallbacksC0171s.u) {
                abstractComponentCallbacksC0171s.j();
            }
            abstractComponentCallbacksC0171s = abstractComponentCallbacksC0171s.f2519F;
        }
        return f2657a;
    }

    public static void b(a aVar) {
        if (I.J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f2652k.getClass().getName()), aVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, String str) {
        h.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0171s, "Attempting to reuse fragment " + abstractComponentCallbacksC0171s + " with previous ID " + str));
        a(abstractComponentCallbacksC0171s).getClass();
    }
}
