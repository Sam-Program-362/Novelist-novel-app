package x0;

import D.K;
import D.M;
import D.N;
import D.O;
import D.P;
import D.Q;
import D.S;
import D.h0;
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
import android.view.WindowMetrics;
import j0.AbstractC0322h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4711b = 0;

    static {
        new ArrayList(new P1.b(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static k a(Activity activity) {
        Rect rect;
        h0 b3;
        WindowMetrics currentWindowMetrics;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            a2.h.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i3 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                a2.h.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) invoke);
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
            b3 = (i6 >= 36 ? new S() : i6 >= 35 ? new Q() : i6 >= 34 ? new P() : i6 >= 31 ? new O() : i6 >= 30 ? new N() : i6 >= 29 ? new M() : new K()).b();
            a2.h.d(b3, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i6 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b3 = B0.b.f78a.a(activity);
        }
        return new k(new u0.b(rect), b3);
    }

    public static Rect b(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                a2.h.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                a2.h.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
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
        a2.h.d(defaultDisplay, "currentDisplay");
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
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (AbstractC0322h.n(obj2)) {
                    displayCutout = AbstractC0322h.h(obj2);
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
            if (displayCutout != null) {
                int i5 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i5 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i6 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i6 == safeInsetRight) {
                    int i7 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i7;
                }
                int i8 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i8 == safeInsetTop) {
                    rect.top = 0;
                }
                int i9 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i9 == safeInsetBottom) {
                    int i10 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i10;
                }
            }
        }
        return rect;
    }
}
