package p064x0;

import D.K;
import D.M;
import D.N;
import D.O;
import D.P;
import D.Q;
import D.S;
import D.T;
import D.h0;
import P1.b;
import a2.h;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4711b = 0;

    static {
        new ArrayList(new b(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static k a(Activity activity) throws Exception {
        Rect rect;
        T m3;
        h0 h0VarB;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            rect = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            h.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i3 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                h.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException e3) {
                Log.w("m", e3);
                rect = b(activity);
            } catch (NoSuchFieldException e4) {
                Log.w("m", e4);
                rect = b(activity);
            } catch (NoSuchMethodException e5) {
                Log.w("m", e5);
                rect = b(activity);
            } catch (InvocationTargetException e6) {
                Log.w("m", e6);
                rect = b(activity);
            }
        } else if (i3 >= 28) {
            rect = b(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i4 = rect.bottom + dimensionPixelSize;
                if (i4 == point.y) {
                    rect.bottom = i4;
                } else {
                    int i5 = rect.right + dimensionPixelSize;
                    if (i5 == point.x) {
                        rect.right = i5;
                    }
                }
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 30) {
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
            h0VarB = m3.b();
            h.d(h0VarB, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i6 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            h0VarB = B0.b.f78a.a(activity);
        }
        return new k(new p058u0.b(rect), h0VarB);
    }

    public static Rect b(Activity activity) {
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutH = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                h.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                h.c(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e3) {
            Log.w("m", e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e4) {
            Log.w("m", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e5) {
            Log.w("m", e5);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e6) {
            Log.w("m", e6);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        h.d(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i3 = rect.bottom + dimensionPixelSize;
            if (i3 == point.y) {
                rect.bottom = i3;
            } else {
                int i4 = rect.right + dimensionPixelSize;
                if (i4 == point.x) {
                    rect.right = i4;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (p029j0.h.n(obj2)) {
                    displayCutoutH = p029j0.h.h(obj2);
                }
            } catch (ClassNotFoundException e7) {
                Log.w("m", e7);
            } catch (IllegalAccessException e8) {
                Log.w("m", e8);
            } catch (InstantiationException e9) {
                Log.w("m", e9);
            } catch (NoSuchFieldException e10) {
                Log.w("m", e10);
            } catch (NoSuchMethodException e11) {
                Log.w("m", e11);
            } catch (InvocationTargetException e12) {
                Log.w("m", e12);
            }
            if (displayCutoutH != null) {
                if (rect.left == displayCutoutH.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutH.getSafeInsetRight()) {
                    rect.right = displayCutoutH.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutH.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutH.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutH.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }
}
