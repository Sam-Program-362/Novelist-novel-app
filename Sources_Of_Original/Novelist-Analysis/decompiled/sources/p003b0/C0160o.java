package p003b0;

import android.app.Dialog;
import android.view.View;
import p000a.a;

/* JADX INFO: renamed from: b0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0160o extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2487m = 0;
    public final /* synthetic */ AbstractComponentCallbacksC0163s n;

    public C0160o(DialogInterfaceOnCancelListenerC0161p dialogInterfaceOnCancelListenerC0161p, C0160o c0160o) {
        super(18);
        this.n = dialogInterfaceOnCancelListenerC0161p;
    }

    @Override // p000a.a
    public final View L(int i3) {
        switch (this.f2487m) {
            case 0:
                Dialog dialog = ((DialogInterfaceOnCancelListenerC0161p) this.n).f2497l0;
                if (dialog != null) {
                    return dialog.findViewById(i3);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.n + " does not have a view");
        }
    }

    @Override // p000a.a
    public final boolean M() {
        switch (this.f2487m) {
            case 0:
                return ((DialogInterfaceOnCancelListenerC0161p) this.n).f2501p0;
            default:
                return false;
        }
    }

    public C0160o(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        super(18);
        this.n = abstractComponentCallbacksC0163s;
    }
}
