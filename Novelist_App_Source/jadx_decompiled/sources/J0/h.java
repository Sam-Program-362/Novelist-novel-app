package J0;

import M0.r;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import b0.C0173u;
import b0.DialogInterfaceOnCancelListenerC0169p;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* loaded from: classes.dex */
public class h extends DialogInterfaceOnCancelListenerC0169p {

    /* renamed from: q0, reason: collision with root package name */
    public Dialog f559q0;

    /* renamed from: r0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f560r0;

    /* renamed from: s0, reason: collision with root package name */
    public AlertDialog f561s0;

    @Override // b0.DialogInterfaceOnCancelListenerC0169p
    public final Dialog B() {
        Dialog dialog = this.f559q0;
        if (dialog != null) {
            return dialog;
        }
        this.f2493h0 = false;
        if (this.f561s0 == null) {
            C0173u c0173u = this.f2517D;
            SignInHubActivity signInHubActivity = c0173u == null ? null : c0173u.n;
            r.f(signInHubActivity);
            this.f561s0 = new AlertDialog.Builder(signInHubActivity).create();
        }
        return this.f561s0;
    }

    @Override // b0.DialogInterfaceOnCancelListenerC0169p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f560r0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
