package p003b0;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: b0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0158m implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0161p f2485k;

    public DialogInterfaceOnCancelListenerC0158m(DialogInterfaceOnCancelListenerC0161p dialogInterfaceOnCancelListenerC0161p) {
        this.f2485k = dialogInterfaceOnCancelListenerC0161p;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0161p dialogInterfaceOnCancelListenerC0161p = this.f2485k;
        Dialog dialog = dialogInterfaceOnCancelListenerC0161p.f2497l0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0161p.onCancel(dialog);
        }
    }
}
