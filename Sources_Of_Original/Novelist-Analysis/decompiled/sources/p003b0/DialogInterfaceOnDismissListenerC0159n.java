package p003b0;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: b0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0159n implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0161p f2486k;

    public DialogInterfaceOnDismissListenerC0159n(DialogInterfaceOnCancelListenerC0161p dialogInterfaceOnCancelListenerC0161p) {
        this.f2486k = dialogInterfaceOnCancelListenerC0161p;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0161p dialogInterfaceOnCancelListenerC0161p = this.f2486k;
        Dialog dialog = dialogInterfaceOnCancelListenerC0161p.f2497l0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0161p.onDismiss(dialog);
        }
    }
}
