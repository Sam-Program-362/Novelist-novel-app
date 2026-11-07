package D;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class K extends T {

    /* renamed from: g, reason: collision with root package name */
    public static Field f191g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f192h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Constructor f193i = null;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f194j = false;

    /* renamed from: e, reason: collision with root package name */
    public WindowInsets f195e;

    /* renamed from: f, reason: collision with root package name */
    public w.b f196f;

    public K() {
        this.f195e = j();
    }

    private static WindowInsets j() {
        if (!f192h) {
            try {
                f191g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f192h = true;
        }
        Field field = f191g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
            }
        }
        if (!f194j) {
            try {
                f193i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
            }
            f194j = true;
        }
        Constructor constructor = f193i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
            }
        }
        return null;
    }

    @Override // D.T
    public h0 b() {
        a();
        h0 c3 = h0.c(this.f195e, null);
        w.b[] bVarArr = this.f199b;
        d0 d0Var = c3.f241a;
        d0Var.u(bVarArr);
        d0Var.w(this.f196f);
        d0Var.t(null);
        d0Var.y(this.f200c);
        d0Var.z(this.f201d);
        return c3;
    }

    @Override // D.T
    public void f(w.b bVar) {
        this.f196f = bVar;
    }

    @Override // D.T
    public void h(w.b bVar) {
        WindowInsets windowInsets = this.f195e;
        if (windowInsets != null) {
            this.f195e = windowInsets.replaceSystemWindowInsets(bVar.f4635a, bVar.f4636b, bVar.f4637c, bVar.f4638d);
        }
    }

    public K(h0 h0Var) {
        super(h0Var);
        this.f195e = h0Var.b();
    }
}
