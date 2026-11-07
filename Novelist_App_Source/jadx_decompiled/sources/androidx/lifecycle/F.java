package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.H;

/* loaded from: classes.dex */
public abstract class F {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0140l enumC0140l) {
        u h3;
        a2.h.e(enumC0140l, "event");
        if (!(activity instanceof InterfaceC0146s) || (h3 = ((InterfaceC0146s) activity).h()) == null) {
            return;
        }
        h3.e(enumC0140l);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            H.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new H.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new H(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
