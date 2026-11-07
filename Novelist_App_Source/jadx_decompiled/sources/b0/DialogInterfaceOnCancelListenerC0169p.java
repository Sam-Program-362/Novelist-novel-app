package b0;

import a.AbstractC0102a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import it.returntrue.novelist.R;
import m.C0423c;
import m.C0426f;

/* renamed from: b0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0169p extends AbstractComponentCallbacksC0171s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: c0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0166m f2488c0;

    /* renamed from: d0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0167n f2489d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f2490e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f2491f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f2492g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f2493h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f2494i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f2495j0;

    /* renamed from: k0, reason: collision with root package name */
    public final B1.g f2496k0;

    /* renamed from: l0, reason: collision with root package name */
    public Dialog f2497l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f2498m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f2499n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f2500o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f2501p0;

    public DialogInterfaceOnCancelListenerC0169p() {
        new A.b(this, 7);
        this.f2488c0 = new DialogInterfaceOnCancelListenerC0166m(this);
        this.f2489d0 = new DialogInterfaceOnDismissListenerC0167n(this);
        this.f2490e0 = 0;
        this.f2491f0 = 0;
        this.f2492g0 = true;
        this.f2493h0 = true;
        this.f2494i0 = -1;
        this.f2496k0 = new B1.g(this, 10);
        this.f2501p0 = false;
    }

    public Dialog B() {
        if (I.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new b.m(z(), this.f2491f0);
    }

    @Override // b0.AbstractComponentCallbacksC0171s
    public final AbstractC0102a d() {
        return new C0168o(this, new C0168o(this));
    }

    @Override // b0.AbstractComponentCallbacksC0171s
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
            I j3 = j();
            int i3 = this.f2494i0;
            if (i3 < 0) {
                throw new IllegalArgumentException(B1.e.g("Bad id: ", i3));
            }
            j3.y(new G(j3, i3), true);
            this.f2494i0 = -1;
            return;
        }
        C0154a c0154a = new C0154a(j());
        c0154a.f2450o = true;
        I i4 = this.f2516C;
        if (i4 == null || i4 == c0154a.f2451p) {
            c0154a.b(new P(3, this));
            c0154a.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // b0.AbstractComponentCallbacksC0171s
    public final void q(Context context) {
        Object obj;
        super.q(context);
        androidx.lifecycle.z zVar = this.f2535X;
        zVar.getClass();
        androidx.lifecycle.z.a("observeForever");
        B1.g gVar = this.f2496k0;
        androidx.lifecycle.w wVar = new androidx.lifecycle.w(zVar, gVar);
        C0426f c0426f = zVar.f2176b;
        C0423c a3 = c0426f.a(gVar);
        if (a3 != null) {
            obj = a3.f4088l;
        } else {
            C0423c c0423c = new C0423c(gVar, wVar);
            c0426f.n++;
            C0423c c0423c2 = c0426f.f4094l;
            if (c0423c2 == null) {
                c0426f.f4093k = c0423c;
                c0426f.f4094l = c0423c;
            } else {
                c0423c2.f4089m = c0423c;
                c0423c.n = c0423c2;
                c0426f.f4094l = c0423c;
            }
            obj = null;
        }
        androidx.lifecycle.y yVar = (androidx.lifecycle.y) obj;
        if (yVar instanceof androidx.lifecycle.x) {
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

    @Override // b0.AbstractComponentCallbacksC0171s
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

    @Override // b0.AbstractComponentCallbacksC0171s
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

    @Override // b0.AbstractComponentCallbacksC0171s
    public final void t() {
        this.f2527N = true;
        if (!this.f2500o0 && !this.f2499n0) {
            this.f2499n0 = true;
        }
        this.f2535X.g(this.f2496k0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0027, B:18:0x003f, B:22:0x0048, B:23:0x0050, B:25:0x0044, B:26:0x0031, B:28:0x0037, B:29:0x003c, B:30:0x0068), top: B:9:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0027, B:18:0x003f, B:22:0x0048, B:23:0x0050, B:25:0x0044, B:26:0x0031, B:28:0x0037, B:29:0x003c, B:30:0x0068), top: B:9:0x001a }] */
    @Override // b0.AbstractComponentCallbacksC0171s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater u(android.os.Bundle r9) {
        /*
            r8 = this;
            android.view.LayoutInflater r9 = super.u(r9)
            boolean r0 = r8.f2493h0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L99
            boolean r3 = r8.f2495j0
            if (r3 == 0) goto L11
            goto L99
        L11:
            if (r0 != 0) goto L14
            goto L70
        L14:
            boolean r0 = r8.f2501p0
            if (r0 != 0) goto L70
            r0 = 0
            r3 = 1
            r8.f2495j0 = r3     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r8.B()     // Catch: java.lang.Throwable -> L4e
            r8.f2497l0 = r4     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r8.f2493h0     // Catch: java.lang.Throwable -> L4e
            r6 = 0
            if (r5 == 0) goto L68
            int r5 = r8.f2490e0     // Catch: java.lang.Throwable -> L4e
            if (r5 == r3) goto L3c
            if (r5 == r2) goto L3c
            r7 = 3
            if (r5 == r7) goto L31
            goto L3f
        L31:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3c
            r7 = 24
            r5.addFlags(r7)     // Catch: java.lang.Throwable -> L4e
        L3c:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4e
        L3f:
            b0.u r4 = r8.f2517D     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L44
            goto L46
        L44:
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity r6 = r4.n     // Catch: java.lang.Throwable -> L4e
        L46:
            if (r6 == 0) goto L50
            android.app.Dialog r4 = r8.f2497l0     // Catch: java.lang.Throwable -> L4e
            r4.setOwnerActivity(r6)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r9 = move-exception
            goto L6d
        L50:
            android.app.Dialog r4 = r8.f2497l0     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r8.f2492g0     // Catch: java.lang.Throwable -> L4e
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r8.f2497l0     // Catch: java.lang.Throwable -> L4e
            b0.m r5 = r8.f2488c0     // Catch: java.lang.Throwable -> L4e
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r8.f2497l0     // Catch: java.lang.Throwable -> L4e
            b0.n r5 = r8.f2489d0     // Catch: java.lang.Throwable -> L4e
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r8.f2501p0 = r3     // Catch: java.lang.Throwable -> L4e
            goto L6a
        L68:
            r8.f2497l0 = r6     // Catch: java.lang.Throwable -> L4e
        L6a:
            r8.f2495j0 = r0
            goto L70
        L6d:
            r8.f2495j0 = r0
            throw r9
        L70:
            boolean r0 = b0.I.J(r2)
            if (r0 == 0) goto L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8c:
            android.app.Dialog r0 = r8.f2497l0
            if (r0 == 0) goto Ld4
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r9 = r9.cloneInContext(r0)
            return r9
        L99:
            boolean r0 = b0.I.J(r2)
            if (r0 == 0) goto Ld4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r2 = r8.f2493h0
            if (r2 != 0) goto Lc3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            return r9
        Lc3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Ld4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.DialogInterfaceOnCancelListenerC0169p.u(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // b0.AbstractComponentCallbacksC0171s
    public final void v(Bundle bundle) {
        Dialog dialog = this.f2497l0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
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

    @Override // b0.AbstractComponentCallbacksC0171s
    public final void w() {
        this.f2527N = true;
        Dialog dialog = this.f2497l0;
        if (dialog != null) {
            this.f2498m0 = false;
            dialog.show();
            View decorView = this.f2497l0.getWindow().getDecorView();
            a2.h.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // b0.AbstractComponentCallbacksC0171s
    public final void x() {
        this.f2527N = true;
        Dialog dialog = this.f2497l0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // b0.AbstractComponentCallbacksC0171s
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
