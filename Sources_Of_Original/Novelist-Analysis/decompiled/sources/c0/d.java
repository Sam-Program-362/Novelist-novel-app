package c0;

import a2.h;
import android.util.Log;
import p003b0.AbstractComponentCallbacksC0163s;
import p003b0.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2657a = c.f2656a;

    public static c a(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        while (abstractComponentCallbacksC0163s != null) {
            if (abstractComponentCallbacksC0163s.f2517D != null && abstractComponentCallbacksC0163s.u) {
                abstractComponentCallbacksC0163s.j();
            }
            abstractComponentCallbacksC0163s = abstractComponentCallbacksC0163s.f2519F;
        }
        return f2657a;
    }

    public static void b(a aVar) {
        if (I.J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f2652k.getClass().getName()), aVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, String str) {
        h.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0163s, "Attempting to reuse fragment " + abstractComponentCallbacksC0163s + " with previous ID " + str));
        a(abstractComponentCallbacksC0163s).getClass();
    }
}
