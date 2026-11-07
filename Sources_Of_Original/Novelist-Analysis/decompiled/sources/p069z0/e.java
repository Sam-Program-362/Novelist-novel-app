package p069z0;

import D.K;
import D.M;
import D.N;
import D.O;
import D.P;
import D.Q;
import D.S;
import D.T;
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
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import p064x0.b;
import p064x0.c;
import p064x0.j;
import p064x0.k;
import p064x0.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static c a(k kVar, FoldingFeature foldingFeature) {
        b bVar;
        b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = b.f4686q;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = b.f4687r;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = b.f4684o;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = b.f4685p;
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
        Rect rectA = kVar.f4708a.a();
        int i7 = i6 - i4;
        if (i7 == 0 && i5 - i3 == 0) {
            return null;
        }
        int i8 = i5 - i3;
        if (i8 != rectA.width() && i7 != rectA.height()) {
            return null;
        }
        if (i8 < rectA.width() && i7 < rectA.height()) {
            return null;
        }
        if (i8 == rectA.width() && i7 == rectA.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        h.d(bounds2, "oemFeature.bounds");
        return new c(new p058u0.b(bounds2), bVar, bVar2);
    }

    public static j b(Context context, WindowLayoutInfo windowLayoutInfo) throws Exception {
        boolean z3;
        T m3;
        k kVar;
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
        if (i3 >= 30) {
            WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
            h0 h0VarC = h0.c(windowManager.getCurrentWindowMetrics().getWindowInsets(), null);
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            h.d(bounds, "wm.currentWindowMetrics.bounds");
            kVar = new k(new p058u0.b(bounds), h0VarC);
        } else {
            Context baseContext = context;
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    throw new IllegalArgumentException("Context " + context + " is not a UiContext");
                }
                z3 = baseContext instanceof Activity;
                if (z3 || (baseContext instanceof InputMethodService)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
                h.d(baseContext, "iterator.baseContext");
            }
            if (z3) {
                kVar = m.a((Activity) context);
            } else {
                if (!(baseContext instanceof InputMethodService)) {
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
                if (i6 >= 36) {
                    m3 = new S();
                } else if (i6 >= 35) {
                    m3 = new Q();
                } else if (i6 >= 34) {
                    m3 = new P();
                } else if (i6 >= 31) {
                    m3 = new O();
                } else if (i6 >= 30) {
                    m3 = new N();
                } else {
                    m3 = i6 >= 29 ? new M() : new K();
                }
                h0 h0VarB = m3.b();
                h.d(h0VarB, "Builder().build()");
                kVar = new k(new p058u0.b(rect), h0VarB);
            }
        }
        return c(kVar, windowLayoutInfo);
    }

    public static j c(k kVar, WindowLayoutInfo windowLayoutInfo) {
        c cVarA;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                cVarA = a(kVar, foldingFeature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new j(arrayList);
    }
}
