package A0;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import io.flutter.plugin.platform.B;
import io.flutter.plugin.platform.C;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k implements View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f59k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f60l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f61m;

    public k(View view, io.flutter.plugin.platform.n nVar) {
        this.f60l = view;
        this.f61m = nVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f59k) {
            case 0:
                a2.h.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f61m).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((l) this.f60l).c(iBinder, activity);
                    break;
                }
                break;
            default:
                View view2 = (View) this.f60l;
                view2.getViewTreeObserver().addOnDrawListener(new C(view2, new B(this, 0)));
                view2.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f59k) {
            case 0:
                a2.h.e(view, "view");
                break;
        }
    }

    public k(l lVar, Activity activity) {
        a2.h.e(lVar, "sidecarCompat");
        this.f60l = lVar;
        this.f61m = new WeakReference(activity);
    }

    private final void a(View view) {
    }
}
