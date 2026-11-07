package j1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0146s;

/* renamed from: j1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330d implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* renamed from: k, reason: collision with root package name */
    public final Activity f3560k;

    public C0330d(Activity activity) {
        a2.h.e(activity, "thisActivity");
        this.f3560k = activity;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void b(InterfaceC0146s interfaceC0146s) {
        onActivityDestroyed(this.f3560k);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void g(InterfaceC0146s interfaceC0146s) {
        onActivityStopped(this.f3560k);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a2.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a2.h.e(activity, "activity");
        if (this.f3560k != activity || activity.getApplicationContext() == null) {
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        a2.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a2.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a2.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a2.h.e(activity, "activity");
        a2.h.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a2.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a2.h.e(activity, "activity");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void a(InterfaceC0146s interfaceC0146s) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void c(InterfaceC0146s interfaceC0146s) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void e(InterfaceC0146s interfaceC0146s) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void f(InterfaceC0146s interfaceC0146s) {
    }
}
