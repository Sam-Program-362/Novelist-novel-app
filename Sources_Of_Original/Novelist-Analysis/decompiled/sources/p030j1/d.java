package p030j1;

import a2.h;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0144s;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Activity f3560k;

    public d(Activity activity) {
        h.e(activity, "thisActivity");
        this.f3560k = activity;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void b(InterfaceC0144s interfaceC0144s) {
        onActivityDestroyed(this.f3560k);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void g(InterfaceC0144s interfaceC0144s) {
        onActivityStopped(this.f3560k);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        h.e(activity, "activity");
        if (this.f3560k != activity || activity.getApplicationContext() == null) {
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        h.e(activity, "activity");
        h.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        h.e(activity, "activity");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void a(InterfaceC0144s interfaceC0144s) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void c(InterfaceC0144s interfaceC0144s) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void e(InterfaceC0144s interfaceC0144s) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void f(InterfaceC0144s interfaceC0144s) {
    }
}
