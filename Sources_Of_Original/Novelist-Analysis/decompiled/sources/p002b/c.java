package p002b;

import a2.h;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0138l;
import androidx.lifecycle.InterfaceC0143q;
import androidx.lifecycle.InterfaceC0144s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0143q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t f2286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f2287l;

    public /* synthetic */ c(t tVar, k kVar) {
        this.f2286k = tVar;
        this.f2287l = kVar;
    }

    @Override // androidx.lifecycle.InterfaceC0143q
    public final void d(InterfaceC0144s interfaceC0144s, EnumC0138l enumC0138l) {
        if (enumC0138l == EnumC0138l.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.f2287l.getOnBackInvokedDispatcher();
            h.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            this.f2286k.b(onBackInvokedDispatcher);
        }
    }
}
