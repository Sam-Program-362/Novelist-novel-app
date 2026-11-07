package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0132f {
    final /* synthetic */ E this$0;

    public static final class a extends AbstractC0132f {
        final /* synthetic */ E this$0;

        public a(E e3) {
            this.this$0 = e3;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            a2.h.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            a2.h.e(activity, "activity");
            E e3 = this.this$0;
            int i3 = e3.f2118k + 1;
            e3.f2118k = i3;
            if (i3 == 1 && e3.n) {
                e3.f2122p.e(EnumC0138l.ON_START);
                e3.n = false;
            }
        }
    }

    public D(E e3) {
        this.this$0 = e3;
    }

    @Override // androidx.lifecycle.AbstractC0132f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        a2.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = H.f2125l;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            a2.h.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((H) fragmentFindFragmentByTag).f2126k = this.this$0.f2124r;
        }
    }

    @Override // androidx.lifecycle.AbstractC0132f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a2.h.e(activity, "activity");
        E e3 = this.this$0;
        int i3 = e3.f2119l - 1;
        e3.f2119l = i3;
        if (i3 == 0) {
            Handler handler = e3.f2121o;
            a2.h.b(handler);
            handler.postDelayed(e3.f2123q, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        a2.h.e(activity, "activity");
        C.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0132f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a2.h.e(activity, "activity");
        E e3 = this.this$0;
        int i3 = e3.f2118k - 1;
        e3.f2118k = i3;
        if (i3 == 0 && e3.f2120m) {
            e3.f2122p.e(EnumC0138l.ON_STOP);
            e3.n = true;
        }
    }
}
