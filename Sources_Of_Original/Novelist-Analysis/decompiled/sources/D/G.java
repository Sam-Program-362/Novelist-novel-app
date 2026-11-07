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

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f187a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f188b = false;

    static {
        new WeakHashMap();
    }

    public static void a(View view, h0 h0Var) {
        WindowInsets windowInsetsB = h0Var.b();
        if (windowInsetsB != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? E.a(view, windowInsetsB) : AbstractC0022x.a(view, windowInsetsB);
            if (windowInsetsA.equals(windowInsetsB)) {
                return;
            }
            h0.c(windowInsetsA, view);
        }
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            D.b(view, context, iArr, attributeSet, typedArray, i3, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0029, B:17:0x0033), top: B:32:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    public static void c(ViewGroup viewGroup, C0001b c0001b) {
        View.AccessibilityDelegate accessibilityDelegateA;
        Object obj;
        if (c0001b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegateA = D.a(viewGroup);
            } else if (f188b) {
                accessibilityDelegateA = null;
            } else if (f187a == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f187a = declaredField;
                    declaredField.setAccessible(true);
                    try {
                        obj = f187a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegateA = (View.AccessibilityDelegate) obj;
                        } else {
                            accessibilityDelegateA = null;
                        }
                    } catch (Throwable unused) {
                        f188b = true;
                    }
                } catch (Throwable unused2) {
                    f188b = true;
                }
            } else {
                obj = f187a.get(viewGroup);
                if (obj instanceof View.AccessibilityDelegate) {
                    accessibilityDelegateA = (View.AccessibilityDelegate) obj;
                } else {
                    accessibilityDelegateA = null;
                }
            }
            if (accessibilityDelegateA instanceof C0000a) {
                c0001b = new C0001b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(c0001b != null ? c0001b.f224b : null);
    }
}
