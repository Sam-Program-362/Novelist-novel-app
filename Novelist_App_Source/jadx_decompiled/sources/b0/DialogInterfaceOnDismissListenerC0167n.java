package b0;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: b0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0167n implements DialogInterface.OnDismissListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0169p f2486k;

    public DialogInterfaceOnDismissListenerC0167n(DialogInterfaceOnCancelListenerC0169p dialogInterfaceOnCancelListenerC0169p) {
        this.f2486k = dialogInterfaceOnCancelListenerC0169p;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0169p dialogInterfaceOnCancelListenerC0169p = this.f2486k;
        Dialog dialog = dialogInterfaceOnCancelListenerC0169p.f2497l0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0169p.onDismiss(dialog);
        }
    }
}
