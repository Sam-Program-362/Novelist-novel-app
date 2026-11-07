package com.google.android.gms.auth.api.signin.internal;

import B1.p;
import H0.d;
import H0.i;
import K0.l;
import M0.E;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.EnumC0138l;
import androidx.lifecycle.EnumC0139m;
import androidx.lifecycle.InterfaceC0144s;
import androidx.lifecycle.u;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Set;
import p002b.f;
import p002b.g;
import p002b.k;
import p003b0.AbstractComponentCallbacksC0163s;
import p003b0.C0165u;
import p003b0.C0167w;
import p003b0.I;
import p004b1.Q;
import p014f0.b;
import s.a;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class SignInHubActivity extends k implements a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static boolean f2706M = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f2709E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f2710F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f2712H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SignInConfiguration f2713I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f2714J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f2715K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Intent f2716L;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final i f2707C = new i(new C0165u(this), 17);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final u f2708D = new u(this);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f2711G = true;

    public SignInHubActivity() {
        ((p) this.n.f2843c).c("android:support:lifecycle", new f(this, 1));
        final int i3 = 0;
        e(new C.a(this) { // from class: b0.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
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

            /* JADX INFO: renamed from: b, reason: collision with root package name */
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
        p005c.a aVar = this.f2309l;
        aVar.getClass();
        k kVar = aVar.f2651b;
        if (kVar != null) {
            gVar.a(kVar);
        }
        aVar.f2650a.add(gVar);
        this.f2712H = false;
    }

    public static boolean j(I i3) {
        boolean zJ = false;
        for (AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s : i3.f2371c.n()) {
            if (abstractComponentCallbacksC0163s != null) {
                C0165u c0165u = abstractComponentCallbacksC0163s.f2517D;
                if ((c0165u == null ? null : c0165u.f2556q) != null) {
                    zJ |= j(abstractComponentCallbacksC0163s.g());
                }
                if (abstractComponentCallbacksC0163s.W.f2160c.compareTo(EnumC0139m.n) >= 0) {
                    abstractComponentCallbacksC0163s.W.g();
                    zJ = true;
                }
            }
        }
        return zJ;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f2709E);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2710F);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2711G);
        if (getApplication() != null) {
            Q.v(this).t(str3, printWriter);
        }
        ((C0165u) this.f2707C.f443l).f2555p.w(str, fileDescriptor, printWriter, strArr);
    }

    public final void k(Bundle bundle) {
        super.onCreate(bundle);
        this.f2708D.e(EnumC0138l.ON_CREATE);
        I i3 = ((C0165u) this.f2707C.f443l).f2555p;
        i3.f2360G = false;
        i3.f2361H = false;
        i3.f2367N.f2405g = false;
        i3.u(1);
    }

    public final void l() {
        super.onDestroy();
        ((C0165u) this.f2707C.f443l).f2555p.l();
        this.f2708D.e(EnumC0138l.ON_DESTROY);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        Q qV = Q.v(this);
        i iVar = new i(this, 10);
        InterfaceC0144s interfaceC0144s = (InterfaceC0144s) qV.f2599l;
        b bVar = (b) qV.f2600m;
        boolean z3 = bVar.f2814c;
        p042o.k kVar = bVar.f2813b;
        if (z3) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        p014f0.a aVar = (p014f0.a) kVar.b(0);
        if (aVar == null) {
            try {
                bVar.f2814c = true;
                Set set = l.f655a;
                synchronized (set) {
                }
                d dVar = new d(this, set);
                if (d.class.isMemberClass() && !Modifier.isStatic(d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar);
                }
                p014f0.a aVar2 = new p014f0.a(dVar);
                kVar.c(0, aVar2);
                bVar.f2814c = false;
                E e3 = new E(aVar2.f2810l, iVar);
                aVar2.d(interfaceC0144s, e3);
                E e4 = aVar2.n;
                if (e4 != null) {
                    aVar2.g(e4);
                }
                aVar2.f2811m = interfaceC0144s;
                aVar2.n = e3;
            } catch (Throwable th) {
                bVar.f2814c = false;
                throw th;
            }
        } else {
            E e5 = new E(aVar.f2810l, iVar);
            aVar.d(interfaceC0144s, e5);
            E e6 = aVar.n;
            if (e6 != null) {
                aVar.g(e6);
            }
            aVar.f2811m = interfaceC0144s;
            aVar.n = e5;
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
                i iVarW = i.w(this);
                GoogleSignInOptions googleSignInOptions = this.f2713I.f2705l;
                synchronized (iVarW) {
                    ((H0.b) iVarW.f443l).c(googleSignInAccount, googleSignInOptions);
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

    @Override // p002b.k, s.b, android.app.Activity
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
        C0167w c0167w = (C0167w) ((C0165u) this.f2707C.f443l).f2555p.f2374f.onCreateView(view, str, context, attributeSet);
        return c0167w == null ? super.onCreateView(view, str, context, attributeSet) : c0167w;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        l();
        f2706M = false;
    }

    @Override // p002b.k, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 6) {
            return ((C0165u) this.f2707C.f443l).f2555p.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f2710F = false;
        ((C0165u) this.f2707C.f443l).f2555p.u(5);
        this.f2708D.e(EnumC0138l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.f2708D.e(EnumC0138l.ON_RESUME);
        I i3 = ((C0165u) this.f2707C.f443l).f2555p;
        i3.f2360G = false;
        i3.f2361H = false;
        i3.f2367N.f2405g = false;
        i3.u(7);
    }

    @Override // p002b.k, android.app.Activity
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
        ((C0165u) iVar.f443l).f2555p.A(true);
    }

    @Override // p002b.k, s.b, android.app.Activity
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
        C0165u c0165u = (C0165u) iVar.f443l;
        super.onStart();
        this.f2711G = false;
        if (!this.f2709E) {
            this.f2709E = true;
            I i3 = c0165u.f2555p;
            i3.f2360G = false;
            i3.f2361H = false;
            i3.f2367N.f2405g = false;
            i3.u(4);
        }
        c0165u.f2555p.A(true);
        this.f2708D.e(EnumC0138l.ON_START);
        I i4 = c0165u.f2555p;
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
        } while (j(((C0165u) iVar.f443l).f2555p));
        I i3 = ((C0165u) iVar.f443l).f2555p;
        i3.f2361H = true;
        i3.f2367N.f2405g = true;
        i3.u(4);
        this.f2708D.e(EnumC0138l.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        C0167w c0167w = (C0167w) ((C0165u) this.f2707C.f443l).f2555p.f2374f.onCreateView(null, str, context, attributeSet);
        return c0167w == null ? super.onCreateView(str, context, attributeSet) : c0167w;
    }
}
