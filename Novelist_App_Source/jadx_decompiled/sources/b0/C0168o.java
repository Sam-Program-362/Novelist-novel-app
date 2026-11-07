package b0;

import a.AbstractC0102a;
import android.app.Dialog;
import android.view.View;

/* renamed from: b0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168o extends AbstractC0102a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2487m = 0;
    public final /* synthetic */ AbstractComponentCallbacksC0171s n;

    public C0168o(DialogInterfaceOnCancelListenerC0169p dialogInterfaceOnCancelListenerC0169p, C0168o c0168o) {
        super(18);
        this.n = dialogInterfaceOnCancelListenerC0169p;
    }

    @Override // a.AbstractC0102a
    public final View L(int i3) {
        switch (this.f2487m) {
            case 0:
                Dialog dialog = ((DialogInterfaceOnCancelListenerC0169p) this.n).f2497l0;
                if (dialog != null) {
                    return dialog.findViewById(i3);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.n + " does not have a view");
        }
    }

    @Override // a.AbstractC0102a
    public final boolean M() {
        switch (this.f2487m) {
            case 0:
                return ((DialogInterfaceOnCancelListenerC0169p) this.n).f2501p0;
            default:
                return false;
        }
    }

    public C0168o(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        super(18);
        this.n = abstractComponentCallbacksC0171s;
    }
}
