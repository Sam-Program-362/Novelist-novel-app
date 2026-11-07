package J0;

import M0.r;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class b extends DialogFragment {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Dialog f543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DialogInterface.OnCancelListener f544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AlertDialog f545m;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f544l;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f543k;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f545m == null) {
            Activity activity = getActivity();
            r.f(activity);
            this.f545m = new AlertDialog.Builder(activity).create();
        }
        return this.f545m;
    }
}
