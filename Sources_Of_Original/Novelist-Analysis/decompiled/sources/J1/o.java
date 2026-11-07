package J1;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0144s;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Activity f615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f616l;

    public o(p pVar, Activity activity) {
        this.f616l = pVar;
        this.f615k = activity;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void b(InterfaceC0144s interfaceC0144s) {
        onActivityDestroyed(this.f615k);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void g(InterfaceC0144s interfaceC0144s) {
        onActivityStopped(this.f615k);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f615k != activity || activity.getApplicationContext() == null) {
            return;
        }
        ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.f615k == activity) {
            n nVar = (n) this.f616l.f618l.f3796c;
            synchronized (nVar.f614v) {
                try {
                    A0.j jVar = nVar.u;
                    if (jVar == null) {
                        return;
                    }
                    q qVar = (q) jVar.f57l;
                    H.f fVar = nVar.n;
                    int i3 = qVar != null ? 1 : 2;
                    fVar.getClass();
                    int iA = X.j.a(i3);
                    if (iA == 0) {
                        fVar.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", "image").apply();
                    } else if (iA == 1) {
                        fVar.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", "video").apply();
                    }
                    if (qVar != null) {
                        SharedPreferences.Editor editorEdit = nVar.n.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
                        Double d3 = qVar.f619a;
                        if (d3 != null) {
                            editorEdit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(d3.doubleValue()));
                        }
                        Double d4 = qVar.f620b;
                        if (d4 != null) {
                            editorEdit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(d4.doubleValue()));
                        }
                        editorEdit.putInt("flutter_image_picker_image_quality", (int) qVar.f621c);
                        editorEdit.apply();
                    }
                    Uri uri = nVar.f613t;
                    if (uri != null) {
                        nVar.n.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
