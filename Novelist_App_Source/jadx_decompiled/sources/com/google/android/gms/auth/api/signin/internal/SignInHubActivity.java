package com.google.android.gms.auth.api.signin.internal;

import B1.p;
import H0.b;
import H0.d;
import H0.i;
import K0.l;
import M0.E;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.EnumC0140l;
import androidx.lifecycle.EnumC0141m;
import androidx.lifecycle.InterfaceC0146s;
import androidx.lifecycle.u;
import b.f;
import b.g;
import b.k;
import b0.AbstractComponentCallbacksC0171s;
import b0.C0173u;
import b0.C0175w;
import b0.I;
import b1.C0192Q;
import c.C0223a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import f0.C0244a;
import f0.C0245b;
import java.lang.reflect.Modifier;
import java.util.Set;
import s.a;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends k implements a {

    /* renamed from: M, reason: collision with root package name */
    public static boolean f2706M = false;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2709E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2710F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2712H;

    /* renamed from: I, reason: collision with root package name */
    public SignInConfiguration f2713I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2714J;

    /* renamed from: K, reason: collision with root package name */
    public int f2715K;

    /* renamed from: L, reason: collision with root package name */
    public Intent f2716L;

    /* renamed from: C, reason: collision with root package name */
    public final i f2707C = new i(new C0173u(this), 17);

    /* renamed from: D, reason: collision with root package name */
    public final u f2708D = new u(this);

    /* renamed from: G, reason: collision with root package name */
    public boolean f2711G = true;

    public SignInHubActivity() {
        ((p) this.n.f2843c).c("android:support:lifecycle", new f(this, 1));
        final int i3 = 0;
        e(new C.a(this) { // from class: b0.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInHubActivity f2552b;

            {
                this.f2552b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        this.f2552b.f2707C.u();
                        break;
                    default:
                        this.f2552b.f2707C.u();
                        break;
                }
            }
        });
        final int i4 = 1;
        this.u.add(new C.a(this) { // from class: b0.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInHubActivity f2552b;

            {
                this.f2552b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.f2552b.f2707C.u();
                        break;
                    default:
                        this.f2552b.f2707C.u();
                        break;
                }
            }
        });
        g gVar = new g(this, 1);
        C0223a c0223a = this.f2309l;
        c0223a.getClass();
        k kVar = c0223a.f2651b;
        if (kVar != null) {
            gVar.a(kVar);
        }
        c0223a.f2650a.add(gVar);
        this.f2712H = false;
    }

    public static boolean j(I i3) {
        boolean z3 = false;
        for (AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s : i3.f2371c.n()) {
            if (abstractComponentCallbacksC0171s != null) {
                C0173u c0173u = abstractComponentCallbacksC0171s.f2517D;
                if ((c0173u == null ? null : c0173u.f2556q) != null) {
                    z3 |= j(abstractComponentCallbacksC0171s.g());
                }
                if (abstractComponentCallbacksC0171s.W.f2160c.compareTo(EnumC0141m.n) >= 0) {
                    abstractComponentCallbacksC0171s.W.g();
                    z3 = true;
                }
            }
        }
        return z3;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r0.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            super.dump(r3, r4, r5, r6)
            if (r6 == 0) goto L5d
            int r0 = r6.length
            if (r0 != 0) goto L9
            goto L5d
        L9:
            r0 = 0
            r0 = r6[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L4d;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L24;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L5d
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L5d
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L5d
            goto L5c
        L24:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L5d
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L5d
            goto L5c
        L34:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L3d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L46:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L5d
            goto L5c
        L4d:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L5d
        L56:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L5d
        L5c:
            return
        L5d:
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.f2709E
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.f2710F
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.f2711G
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto Lb4
            b1.Q r1 = b1.C0192Q.v(r2)
            r1.t(r0, r5)
        Lb4:
            H0.i r0 = r2.f2707C
            java.lang.Object r0 = r0.f443l
            b0.u r0 = (b0.C0173u) r0
            b0.I r0 = r0.f2555p
            r0.w(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final void k(Bundle bundle) {
        super.onCreate(bundle);
        this.f2708D.e(EnumC0140l.ON_CREATE);
        I i3 = ((C0173u) this.f2707C.f443l).f2555p;
        i3.f2360G = false;
        i3.f2361H = false;
        i3.f2367N.f2405g = false;
        i3.u(1);
    }

    public final void l() {
        super.onDestroy();
        ((C0173u) this.f2707C.f443l).f2555p.l();
        this.f2708D.e(EnumC0140l.ON_DESTROY);
    }

    public final void m() {
        C0192Q v3 = C0192Q.v(this);
        i iVar = new i(this, 10);
        InterfaceC0146s interfaceC0146s = (InterfaceC0146s) v3.f2599l;
        C0245b c0245b = (C0245b) v3.f2600m;
        boolean z3 = c0245b.f2814c;
        o.k kVar = c0245b.f2813b;
        if (z3) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C0244a c0244a = (C0244a) kVar.b(0);
        if (c0244a == null) {
            try {
                c0245b.f2814c = true;
                Set set = l.f655a;
                synchronized (set) {
                }
                d dVar = new d(this, set);
                if (d.class.isMemberClass() && !Modifier.isStatic(d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar);
                }
                C0244a c0244a2 = new C0244a(dVar);
                kVar.c(0, c0244a2);
                c0245b.f2814c = false;
                E e3 = new E(c0244a2.f2810l, iVar);
                c0244a2.d(interfaceC0146s, e3);
                E e4 = c0244a2.n;
                if (e4 != null) {
                    c0244a2.g(e4);
                }
                c0244a2.f2811m = interfaceC0146s;
                c0244a2.n = e3;
            } catch (Throwable th) {
                c0245b.f2814c = false;
                throw th;
            }
        } else {
            E e5 = new E(c0244a.f2810l, iVar);
            c0244a.d(interfaceC0146s, e5);
            E e6 = c0244a.n;
            if (e6 != null) {
                c0244a.g(e6);
            }
            c0244a.f2811m = interfaceC0146s;
            c0244a.n = e5;
        }
        f2706M = false;
    }

    public final void n(int i3) {
        Status status = new Status(i3, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f2706M = false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f2712H) {
            return;
        }
        setResult(0);
        if (i3 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f2702l) != null) {
                i w3 = i.w(this);
                GoogleSignInOptions googleSignInOptions = this.f2713I.f2705l;
                synchronized (w3) {
                    ((b) w3.f443l).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f2714J = true;
                this.f2715K = i4;
                this.f2716L = intent;
                m();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                n(intExtra);
                return;
            }
        }
        n(8);
    }

    @Override // b.k, s.b, android.app.Activity
    public final void onCreate(Bundle bundle) {
        k(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            n(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            n(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f2713I = signInConfiguration;
        if (bundle != null) {
            boolean z3 = bundle.getBoolean("signingInGoogleApiClients");
            this.f2714J = z3;
            if (z3) {
                this.f2715K = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.f2716L = intent2;
                    m();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (f2706M) {
            setResult(0);
            n(12502);
            return;
        }
        f2706M = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f2713I);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f2712H = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            n(17);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0175w c0175w = (C0175w) ((C0173u) this.f2707C.f443l).f2555p.f2374f.onCreateView(view, str, context, attributeSet);
        return c0175w == null ? super.onCreateView(view, str, context, attributeSet) : c0175w;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        l();
        f2706M = false;
    }

    @Override // b.k, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 6) {
            return ((C0173u) this.f2707C.f443l).f2555p.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f2710F = false;
        ((C0173u) this.f2707C.f443l).f2555p.u(5);
        this.f2708D.e(EnumC0140l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.f2708D.e(EnumC0140l.ON_RESUME);
        I i3 = ((C0173u) this.f2707C.f443l).f2555p;
        i3.f2360G = false;
        i3.f2361H = false;
        i3.f2367N.f2405g = false;
        i3.u(7);
    }

    @Override // b.k, android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        this.f2707C.u();
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        i iVar = this.f2707C;
        iVar.u();
        super.onResume();
        this.f2710F = true;
        ((C0173u) iVar.f443l).f2555p.A(true);
    }

    @Override // b.k, s.b, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f2714J);
        if (this.f2714J) {
            bundle.putInt("signInResultCode", this.f2715K);
            bundle.putParcelable("signInResultData", this.f2716L);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        i iVar = this.f2707C;
        iVar.u();
        C0173u c0173u = (C0173u) iVar.f443l;
        super.onStart();
        this.f2711G = false;
        if (!this.f2709E) {
            this.f2709E = true;
            I i3 = c0173u.f2555p;
            i3.f2360G = false;
            i3.f2361H = false;
            i3.f2367N.f2405g = false;
            i3.u(4);
        }
        c0173u.f2555p.A(true);
        this.f2708D.e(EnumC0140l.ON_START);
        I i4 = c0173u.f2555p;
        i4.f2360G = false;
        i4.f2361H = false;
        i4.f2367N.f2405g = false;
        i4.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2707C.u();
    }

    @Override // android.app.Activity
    public final void onStop() {
        i iVar;
        super.onStop();
        this.f2711G = true;
        do {
            iVar = this.f2707C;
        } while (j(((C0173u) iVar.f443l).f2555p));
        I i3 = ((C0173u) iVar.f443l).f2555p;
        i3.f2361H = true;
        i3.f2367N.f2405g = true;
        i3.u(4);
        this.f2708D.e(EnumC0140l.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        C0175w c0175w = (C0175w) ((C0173u) this.f2707C.f443l).f2555p.f2374f.onCreateView(null, str, context, attributeSet);
        return c0175w == null ? super.onCreateView(str, context, attributeSet) : c0175w;
    }
}
