package k;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class P extends M implements N {

    /* renamed from: J, reason: collision with root package name */
    public static final Method f3635J;

    /* renamed from: I, reason: collision with root package name */
    public H0.i f3636I;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3635J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // k.N
    public final void c(j.j jVar, MenuItem menuItem) {
        H0.i iVar = this.f3636I;
        if (iVar != null) {
            iVar.c(jVar, menuItem);
        }
    }

    @Override // k.N
    public final void l(j.j jVar, j.k kVar) {
        H0.i iVar = this.f3636I;
        if (iVar != null) {
            iVar.l(jVar, kVar);
        }
    }
}
