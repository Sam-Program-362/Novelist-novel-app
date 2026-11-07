package D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* renamed from: D.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0023y implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public h0 f268a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0014o f270c;

    public ViewOnApplyWindowInsetsListenerC0023y(View view, InterfaceC0014o interfaceC0014o) {
        this.f269b = view;
        this.f270c = interfaceC0014o;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        h0 c3 = h0.c(windowInsets, view);
        int i3 = Build.VERSION.SDK_INT;
        InterfaceC0014o interfaceC0014o = this.f270c;
        if (i3 < 30) {
            AbstractC0024z.a(windowInsets, this.f269b);
            if (c3.equals(this.f268a)) {
                return interfaceC0014o.c(c3).b();
            }
        }
        this.f268a = c3;
        h0 c4 = interfaceC0014o.c(c3);
        if (i3 >= 30) {
            return c4.b();
        }
        Field field = G.f187a;
        view.requestApplyInsets();
        return c4.b();
    }
}
