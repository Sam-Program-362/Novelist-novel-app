package b;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0140l;
import androidx.lifecycle.InterfaceC0145q;
import androidx.lifecycle.InterfaceC0146s;

/* renamed from: b.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0150c implements InterfaceC0145q {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t f2286k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f2287l;

    public /* synthetic */ C0150c(t tVar, k kVar) {
        this.f2286k = tVar;
        this.f2287l = kVar;
    }

    @Override // androidx.lifecycle.InterfaceC0145q
    public final void d(InterfaceC0146s interfaceC0146s, EnumC0140l enumC0140l) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (enumC0140l == EnumC0140l.ON_CREATE) {
            onBackInvokedDispatcher = this.f2287l.getOnBackInvokedDispatcher();
            a2.h.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            this.f2286k.b(onBackInvokedDispatcher);
        }
    }
}
