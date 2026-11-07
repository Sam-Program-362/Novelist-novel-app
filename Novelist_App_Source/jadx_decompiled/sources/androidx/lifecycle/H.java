package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class H extends Fragment {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f2125l = 0;

    /* renamed from: k, reason: collision with root package name */
    public B1.a f2126k;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final G Companion = new G();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            a2.h.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            a2.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            a2.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            a2.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            a2.h.e(activity, "activity");
            int i3 = H.f2125l;
            F.a(activity, EnumC0140l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            a2.h.e(activity, "activity");
            int i3 = H.f2125l;
            F.a(activity, EnumC0140l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            a2.h.e(activity, "activity");
            int i3 = H.f2125l;
            F.a(activity, EnumC0140l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            a2.h.e(activity, "activity");
            int i3 = H.f2125l;
            F.a(activity, EnumC0140l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            a2.h.e(activity, "activity");
            int i3 = H.f2125l;
            F.a(activity, EnumC0140l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            a2.h.e(activity, "activity");
            int i3 = H.f2125l;
            F.a(activity, EnumC0140l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            a2.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            a2.h.e(activity, "activity");
            a2.h.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a2.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a2.h.e(activity, "activity");
        }
    }

    public final void a(EnumC0140l enumC0140l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            a2.h.d(activity, "activity");
            F.a(activity, enumC0140l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0140l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0140l.ON_DESTROY);
        this.f2126k = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0140l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        B1.a aVar = this.f2126k;
        if (aVar != null) {
            ((E) aVar.f80l).a();
        }
        a(EnumC0140l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        B1.a aVar = this.f2126k;
        if (aVar != null) {
            E e3 = (E) aVar.f80l;
            int i3 = e3.f2118k + 1;
            e3.f2118k = i3;
            if (i3 == 1 && e3.n) {
                e3.f2122p.e(EnumC0140l.ON_START);
                e3.n = false;
            }
        }
        a(EnumC0140l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0140l.ON_STOP);
    }
}
