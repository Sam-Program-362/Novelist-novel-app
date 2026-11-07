package D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: D.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0023y implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f268a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0014o f270c;

    public ViewOnApplyWindowInsetsListenerC0023y(View view, InterfaceC0014o interfaceC0014o) {
        this.f269b = view;
        this.f270c = interfaceC0014o;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        h0 h0VarC = h0.c(windowInsets, view);
        int i3 = Build.VERSION.SDK_INT;
        InterfaceC0014o interfaceC0014o = this.f270c;
        if (i3 < 30) {
            AbstractC0024z.a(windowInsets, this.f269b);
            if (h0VarC.equals(this.f268a)) {
                return interfaceC0014o.c(h0VarC).b();
            }
        }
        this.f268a = h0VarC;
        h0 h0VarC2 = interfaceC0014o.c(h0VarC);
        if (i3 >= 30) {
            return h0VarC2.b();
        }
        Field field = G.f187a;
        view.requestApplyInsets();
        return h0VarC2.b();
    }
}
