package D;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static Field f187a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f188b = false;

    static {
        new WeakHashMap();
    }

    public static void a(View view, h0 h0Var) {
        WindowInsets b3 = h0Var.b();
        if (b3 != null) {
            WindowInsets a3 = Build.VERSION.SDK_INT >= 30 ? E.a(view, b3) : AbstractC0022x.a(view, b3);
            if (a3.equals(b3)) {
                return;
            }
            h0.c(a3, view);
        }
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            D.b(view, context, iArr, attributeSet, typedArray, i3, 0);
        }
    }

    public static void c(ViewGroup viewGroup, C0001b c0001b) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c0001b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = D.a(viewGroup);
            } else {
                if (!f188b) {
                    if (f187a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f187a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f188b = true;
                        }
                    }
                    try {
                        Object obj = f187a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f188b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C0000a) {
                c0001b = new C0001b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(c0001b != null ? c0001b.f224b : null);
    }
}
