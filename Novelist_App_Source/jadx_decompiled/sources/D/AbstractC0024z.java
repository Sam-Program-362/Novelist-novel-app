package D;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import it.returntrue.novelist.R;

/* renamed from: D.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0024z {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static h0 b(View view, h0 h0Var, Rect rect) {
        WindowInsets b3 = h0Var.b();
        if (b3 != null) {
            return h0.c(view.computeSystemWindowInsets(b3, rect), view);
        }
        rect.setEmpty();
        return h0Var;
    }

    public static void c(View view, InterfaceC0014o interfaceC0014o) {
        ViewOnApplyWindowInsetsListenerC0023y viewOnApplyWindowInsetsListenerC0023y = interfaceC0014o != null ? new ViewOnApplyWindowInsetsListenerC0023y(view, interfaceC0014o) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC0023y);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC0023y != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0023y);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
