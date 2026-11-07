package p031k;

import H0.i;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p028j.j;
import p028j.k;

/* JADX INFO: loaded from: classes.dex */
public final class P extends M implements N {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final Method f3635J;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public i f3636I;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3635J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p031k.N
    public final void c(j jVar, MenuItem menuItem) {
        i iVar = this.f3636I;
        if (iVar != null) {
            iVar.c(jVar, menuItem);
        }
    }

    @Override // p031k.N
    public final void l(j jVar, k kVar) {
        i iVar = this.f3636I;
        if (iVar != null) {
            iVar.l(jVar, kVar);
        }
    }
}
