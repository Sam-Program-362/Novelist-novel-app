package D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f240b;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f241a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            f240b = a0.f221w;
        } else if (i3 >= 30) {
            f240b = Y.f219v;
        } else {
            f240b = d0.f234b;
        }
    }

    public h0(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            this.f241a = new c0(this, windowInsets);
            return;
        }
        if (i3 >= 34) {
            this.f241a = new a0(this, windowInsets);
            return;
        }
        if (i3 >= 31) {
            this.f241a = new Z(this, windowInsets);
            return;
        }
        if (i3 >= 30) {
            this.f241a = new Y(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f241a = new X(this, windowInsets);
        } else if (i3 >= 28) {
            this.f241a = new W(this, windowInsets);
        } else {
            this.f241a = new V(this, windowInsets);
        }
    }

    public static w.b a(w.b bVar, int i3, int i4, int i5, int i6) {
        int max = Math.max(0, bVar.f4635a - i3);
        int max2 = Math.max(0, bVar.f4636b - i4);
        int max3 = Math.max(0, bVar.f4637c - i5);
        int max4 = Math.max(0, bVar.f4638d - i6);
        return (max == i3 && max2 == i4 && max3 == i5 && max4 == i6) ? bVar : w.b.b(max, max2, max3, max4);
    }

    public static h0 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        h0 h0Var = new h0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = G.f187a;
            h0 a3 = A.a(view);
            d0 d0Var = h0Var.f241a;
            d0Var.v(a3);
            View rootView = view.getRootView();
            d0Var.d(rootView);
            d0Var.n(rootView);
            d0Var.o();
            d0Var.x(view.getWindowSystemUiVisibility());
        }
        return h0Var;
    }

    public final WindowInsets b() {
        d0 d0Var = this.f241a;
        if (d0Var instanceof U) {
            return ((U) d0Var).f206c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return Objects.equals(this.f241a, ((h0) obj).f241a);
        }
        return false;
    }

    public final int hashCode() {
        d0 d0Var = this.f241a;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.hashCode();
    }

    public h0() {
        this.f241a = new d0(this);
    }
}
