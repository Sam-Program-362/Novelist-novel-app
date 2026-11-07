package z0;

import D.K;
import D.M;
import D.N;
import D.O;
import D.P;
import D.Q;
import D.S;
import D.h0;
import a2.h;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import x0.C0492b;
import x0.C0493c;
import x0.j;
import x0.k;
import x0.m;

/* loaded from: classes.dex */
public abstract class e {
    public static C0493c a(k kVar, FoldingFeature foldingFeature) {
        C0492b c0492b;
        C0492b c0492b2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c0492b = C0492b.f4686q;
        } else {
            if (type != 2) {
                return null;
            }
            c0492b = C0492b.f4687r;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0492b2 = C0492b.f4684o;
        } else {
            if (state != 2) {
                return null;
            }
            c0492b2 = C0492b.f4685p;
        }
        Rect bounds = foldingFeature.getBounds();
        h.d(bounds, "oemFeature.bounds");
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        if (i3 > i5) {
            throw new IllegalArgumentException(B1.e.i("Left must be less than or equal to right, left: ", i3, ", right: ", i5).toString());
        }
        if (i4 > i6) {
            throw new IllegalArgumentException(B1.e.i("top must be less than or equal to bottom, top: ", i4, ", bottom: ", i6).toString());
        }
        Rect a3 = kVar.f4708a.a();
        int i7 = i6 - i4;
        if (i7 == 0 && i5 - i3 == 0) {
            return null;
        }
        int i8 = i5 - i3;
        if (i8 != a3.width() && i7 != a3.height()) {
            return null;
        }
        if (i8 < a3.width() && i7 < a3.height()) {
            return null;
        }
        if (i8 == a3.width() && i7 == a3.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        h.d(bounds2, "oemFeature.bounds");
        return new C0493c(new u0.b(bounds2), c0492b, c0492b2);
    }

    public static j b(Context context, WindowLayoutInfo windowLayoutInfo) {
        k kVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        h.e(windowLayoutInfo, "info");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            if (i3 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i4 = m.f4711b;
            return c(m.a((Activity) context), windowLayoutInfo);
        }
        int i5 = m.f4711b;
        if (i3 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z3 = context2 instanceof Activity;
                if (!z3 && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        h.d(context2, "iterator.baseContext");
                    }
                }
                if (z3) {
                    kVar = m.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    h.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i6 = Build.VERSION.SDK_INT;
                    h0 b3 = (i6 >= 36 ? new S() : i6 >= 35 ? new Q() : i6 >= 34 ? new P() : i6 >= 31 ? new O() : i6 >= 30 ? new N() : i6 >= 29 ? new M() : new K()).b();
                    h.d(b3, "Builder().build()");
                    kVar = new k(new u0.b(rect), b3);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        h0 c3 = h0.c(windowInsets, null);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        h.d(bounds, "wm.currentWindowMetrics.bounds");
        kVar = new k(new u0.b(bounds), c3);
        return c(kVar, windowLayoutInfo);
    }

    public static j c(k kVar, WindowLayoutInfo windowLayoutInfo) {
        C0493c c0493c;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                c0493c = a(kVar, foldingFeature);
            } else {
                c0493c = null;
            }
            if (c0493c != null) {
                arrayList.add(c0493c);
            }
        }
        return new j(arrayList);
    }
}
