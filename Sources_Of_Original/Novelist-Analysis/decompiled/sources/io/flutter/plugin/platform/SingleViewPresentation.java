package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C0218a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private u rootView;
    private boolean startFocused;
    private final x state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, g gVar, C0218a c0218a, int i3, View.OnFocusChangeListener onFocusChangeListener) {
        super(new v(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c0218a;
        this.viewId = i3;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        x xVar = new x();
        this.state = xVar;
        xVar.f3248a = gVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public x detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        u uVar = this.rootView;
        if (uVar != null) {
            uVar.removeAllViews();
        }
        return this.state;
    }

    public g getView() {
        return this.state.f3248a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        x xVar = this.state;
        if (xVar.f3250c == null) {
            xVar.f3250c = new t(getContext());
        }
        if (this.state.f3249b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            x xVar2 = this.state;
            xVar2.f3249b = new E(windowManager, xVar2.f3250c);
        }
        this.container = new FrameLayout(getContext());
        w wVar = new w(getContext(), this.state.f3249b, this.outerContext);
        View view = this.state.f3248a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(wVar);
        } else {
            Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        u uVar = new u(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = uVar;
        uVar.addView(this.container);
        this.rootView.addView(this.state.f3250c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C0218a c0218a, x xVar, View.OnFocusChangeListener onFocusChangeListener, boolean z3) {
        super(new v(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c0218a;
        this.state = xVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z3;
    }
}
