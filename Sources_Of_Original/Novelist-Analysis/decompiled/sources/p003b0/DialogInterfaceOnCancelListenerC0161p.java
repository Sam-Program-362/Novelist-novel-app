package p003b0;

import A.b;
import B1.e;
import B1.g;
import a2.h;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import it.returntrue.novelist.R;
import p000a.a;
import p002b.m;
import p037m.c;
import p037m.f;

/* JADX INFO: renamed from: b0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0161p extends AbstractComponentCallbacksC0163s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0158m f2488c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0159n f2489d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f2490e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f2491f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f2492g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f2493h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f2494i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f2495j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final g f2496k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Dialog f2497l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f2498m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f2499n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f2500o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f2501p0;

    public DialogInterfaceOnCancelListenerC0161p() {
        new b(this, 7);
        this.f2488c0 = new DialogInterfaceOnCancelListenerC0158m(this);
        this.f2489d0 = new DialogInterfaceOnDismissListenerC0159n(this);
        this.f2490e0 = 0;
        this.f2491f0 = 0;
        this.f2492g0 = true;
        this.f2493h0 = true;
        this.f2494i0 = -1;
        this.f2496k0 = new g(this, 10);
        this.f2501p0 = false;
    }

    public Dialog B() {
        if (I.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new m(z(), this.f2491f0);
    }

    @Override // p003b0.AbstractComponentCallbacksC0163s
    public final a d() {
        return new C0160o(this, new C0160o(this));
    }

    @Override // p003b0.AbstractComponentCallbacksC0163s
    public final void o() {
        this.f2527N = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f2498m0) {
            return;
        }
        if (I.J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f2499n0) {
            return;
        }
        this.f2499n0 = true;
        this.f2500o0 = false;
        Dialog dialog = this.f2497l0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2497l0.dismiss();
        }
        this.f2498m0 = true;
        if (this.f2494i0 >= 0) {
            I iJ = j();
            int i3 = this.f2494i0;
            if (i3 < 0) {
                throw new IllegalArgumentException(e.g("Bad id: ", i3));
            }
            iJ.y(new G(iJ, i3), true);
            this.f2494i0 = -1;
            return;
        }
        C0146a c0146a = new C0146a(j());
        c0146a.f2450o = true;
        I i4 = this.f2516C;
        if (i4 == null || i4 == c0146a.f2451p) {
            c0146a.b(new P(3, this));
            c0146a.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // p003b0.AbstractComponentCallbacksC0163s
    public final void q(Context context) {
        Object obj;
        super.q(context);
        z zVar = this.f2535X;
        zVar.getClass();
        z.a("observeForever");
        g gVar = this.f2496k0;
        w wVar = new w(zVar, gVar);
        f fVar = zVar.f2176b;
        c cVarA = fVar.a(gVar);
        if (cVarA != null) {
            obj = cVarA.f4088l;
        } else {
            c cVar = new c(gVar, wVar);
            fVar.n++;
            c cVar2 = fVar.f4094l;
            if (cVar2 == null) {
                fVar.f4093k = cVar;
                fVar.f4094l = cVar;
            } else {
                cVar2.f4089m = cVar;
                cVar.n = cVar2;
                fVar.f4094l = cVar;
            }
            obj = null;
        }
        y yVar = (y) obj;
        if (yVar instanceof x) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (yVar == null) {
            wVar.h(true);
        }
        if (this.f2500o0) {
            return;
        }
        this.f2499n0 = false;
    }

    @Override // p003b0.AbstractComponentCallbacksC0163s
    public final void r(Bundle bundle) {
        Bundle bundle2;
        this.f2527N = true;
        Bundle bundle3 = this.f2540l;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f2518E.U(bundle2);
            I i3 = this.f2518E;
            i3.f2360G = false;
            i3.f2361H = false;
            i3.f2367N.f2405g = false;
            i3.u(1);
        }
        I i4 = this.f2518E;
        if (i4.u < 1) {
            i4.f2360G = false;
            i4.f2361H = false;
            i4.f2367N.f2405g = false;
            i4.u(1);
        }
        new Handler();
        this.f2493h0 = this.f2521H == 0;
        if (bundle != null) {
            this.f2490e0 = bundle.getInt("android:style", 0);
            this.f2491f0 = bundle.getInt("android:theme", 0);
            this.f2492g0 = bundle.getBoolean("android:cancelable", true);
            this.f2493h0 = bundle.getBoolean("android:showsDialog", this.f2493h0);
            this.f2494i0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p003b0.AbstractComponentCallbacksC0163s
    public final void s() {
        this.f2527N = true;
        Dialog dialog = this.f2497l0;
        if (dialog != null) {
            this.f2498m0 = true;
            dialog.setOnDismissListener(null);
            this.f2497l0.dismiss();
            if (!this.f2499n0) {
                onDismiss(this.f2497l0);
            }
            this.f2497l0 = null;
            this.f2501p0 = false;
        }
    }

    @Override // p003b0.AbstractComponentCallbacksC0163s
    public final void t() {
        this.f2527N = true;
        if (!this.f2500o0 && !this.f2499n0) {
            this.f2499n0 = true;
        }
        this.f2535X.g(this.f2496k0);
    }

    @Override // p003b0.AbstractComponentCallbacksC0163s
    public final LayoutInflater u(Bundle bundle) {
        LayoutInflater layoutInflaterU = super.u(bundle);
        boolean z3 = this.f2493h0;
        if (z3 && !this.f2495j0) {
            if (z3 && !this.f2501p0) {
                try {
                    this.f2495j0 = true;
                    Dialog dialogB = B();
                    this.f2497l0 = dialogB;
                    SignInHubActivity signInHubActivity = null;
                    if (this.f2493h0) {
                        int i3 = this.f2490e0;
                        if (i3 == 1 || i3 == 2) {
                            dialogB.requestWindowFeature(1);
                        } else if (i3 == 3) {
                            Window window = dialogB.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogB.requestWindowFeature(1);
                        }
                        C0165u c0165u = this.f2517D;
                        if (c0165u != null) {
                            signInHubActivity = c0165u.n;
                        }
                        if (signInHubActivity != null) {
                            this.f2497l0.setOwnerActivity(signInHubActivity);
                        }
                        this.f2497l0.setCancelable(this.f2492g0);
                        this.f2497l0.setOnCancelListener(this.f2488c0);
                        this.f2497l0.setOnDismissListener(this.f2489d0);
                        this.f2501p0 = true;
                    } else {
                        this.f2497l0 = null;
                    }
                    this.f2495j0 = false;
                } catch (Throwable th) {
                    this.f2495j0 = false;
                    throw th;
                }
            }
            if (I.J(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f2497l0;
            if (dialog != null) {
                return layoutInflaterU.cloneInContext(dialog.getContext());
            }
        } else if (I.J(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f2493h0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterU;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterU;
    }

    @Override // p003b0.AbstractComponentCallbacksC0163s
    public final void v(Bundle bundle) {
        Dialog dialog = this.f2497l0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i3 = this.f2490e0;
        if (i3 != 0) {
            bundle.putInt("android:style", i3);
        }
        int i4 = this.f2491f0;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z3 = this.f2492g0;
        if (!z3) {
            bundle.putBoolean("android:cancelable", z3);
        }
        boolean z4 = this.f2493h0;
        if (!z4) {
            bundle.putBoolean("android:showsDialog", z4);
        }
        int i5 = this.f2494i0;
        if (i5 != -1) {
            bundle.putInt("android:backStackId", i5);
        }
    }

    @Override // p003b0.AbstractComponentCallbacksC0163s
    public final void w() {
        this.f2527N = true;
        Dialog dialog = this.f2497l0;
        if (dialog != null) {
            this.f2498m0 = false;
            dialog.show();
            View decorView = this.f2497l0.getWindow().getDecorView();
            h.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // p003b0.AbstractComponentCallbacksC0163s
    public final void x() {
        this.f2527N = true;
        Dialog dialog = this.f2497l0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p003b0.AbstractComponentCallbacksC0163s
    public final void y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.y(layoutInflater, viewGroup, bundle);
        if (this.f2497l0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2497l0.onRestoreInstanceState(bundle2);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
