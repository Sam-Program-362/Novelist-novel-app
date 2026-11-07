package b0;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: b0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0166m implements DialogInterface.OnCancelListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0169p f2485k;

    public DialogInterfaceOnCancelListenerC0166m(DialogInterfaceOnCancelListenerC0169p dialogInterfaceOnCancelListenerC0169p) {
        this.f2485k = dialogInterfaceOnCancelListenerC0169p;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0169p dialogInterfaceOnCancelListenerC0169p = this.f2485k;
        Dialog dialog = dialogInterfaceOnCancelListenerC0169p.f2497l0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0169p.onCancel(dialog);
        }
    }
}
