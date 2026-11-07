package io.flutter.plugin.platform;

import D.i0;
import D.j0;
import D.k0;
import D.l0;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import r1.AbstractActivityC0455b;
import r1.InterfaceC0457d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f3176a;

    /* renamed from: b, reason: collision with root package name */
    public final A.c f3177b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0457d f3178c;

    /* renamed from: d, reason: collision with root package name */
    public B1.i f3179d;

    /* renamed from: e, reason: collision with root package name */
    public int f3180e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3181f = false;

    public f(AbstractActivityC0455b abstractActivityC0455b, A.c cVar, AbstractActivityC0455b abstractActivityC0455b2) {
        o oVar = new o(this, 1);
        this.f3176a = abstractActivityC0455b;
        this.f3177b = cVar;
        cVar.f7m = oVar;
        this.f3178c = abstractActivityC0455b2;
        this.f3180e = 1280;
    }

    public final void a(B1.i iVar) {
        Window window = this.f3176a.getWindow();
        window.getDecorView();
        int i3 = Build.VERSION.SDK_INT;
        E2.a l0Var = i3 >= 35 ? new l0(window) : i3 >= 30 ? new k0(window) : i3 >= 26 ? new j0(window) : new i0(window);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i5 = iVar.f93a;
        if (i5 != 0) {
            int a3 = X.j.a(i5);
            if (a3 == 0) {
                l0Var.N(false);
            } else if (a3 == 1) {
                l0Var.N(true);
            }
        }
        Integer num = (Integer) iVar.f95c;
        if (num != null && i4 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) iVar.f98f;
        if (bool != null && i4 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i4 >= 26) {
            int i6 = iVar.f94b;
            if (i6 != 0) {
                int a4 = X.j.a(i6);
                if (a4 == 0) {
                    l0Var.M(false);
                } else if (a4 == 1) {
                    l0Var.M(true);
                }
            }
            Integer num2 = (Integer) iVar.f96d;
            if (num2 != null && i4 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) iVar.f97e;
        if (num3 != null && i4 >= 28 && i4 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) iVar.f99g;
        if (bool2 != null && i4 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f3179d = iVar;
    }

    public final void b() {
        boolean z3 = this.f3181f;
        Activity activity = this.f3176a;
        if (z3) {
            S0.a.B(activity.getWindow(), false);
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(this.f3180e);
        }
        B1.i iVar = this.f3179d;
        if (iVar != null) {
            a(iVar);
        }
    }
}
