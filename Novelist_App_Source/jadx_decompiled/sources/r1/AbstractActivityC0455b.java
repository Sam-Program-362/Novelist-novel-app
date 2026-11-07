package r1;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0140l;
import androidx.lifecycle.InterfaceC0146s;
import h0.C0267j;
import h0.C0268k;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.D;
import j0.C0315a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import k.u0;
import org.apache.tika.utils.StringUtils;
import s1.C0467c;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0455b extends Activity implements InterfaceC0457d, InterfaceC0146s {

    /* renamed from: o, reason: collision with root package name */
    public static final int f4347o = View.generateViewId();

    /* renamed from: k, reason: collision with root package name */
    public boolean f4348k = false;

    /* renamed from: l, reason: collision with root package name */
    public C0458e f4349l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.u f4350m;
    public final OnBackInvokedCallback n;

    public AbstractActivityC0455b() {
        int i3 = Build.VERSION.SDK_INT;
        this.n = i3 < 33 ? null : i3 >= 34 ? new C0268k(this, 1) : new C0267j(this, 1);
        this.f4350m = new androidx.lifecycle.u(this);
    }

    public final String a() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int d() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        }
        if (stringExtra.equals("opaque")) {
            return 1;
        }
        if (stringExtra.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
    }

    public final String e() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String f() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle i3 = i();
            String string = i3 != null ? i3.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle i3 = i();
            if (i3 != null) {
                return i3.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0146s
    public final androidx.lifecycle.u h() {
        return this.f4350m;
    }

    public final Bundle i() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void j(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z3 && !this.f4348k) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.n);
                this.f4348k = true;
                return;
            }
            return;
        }
        if (z3 || !this.f4348k || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.n);
        this.f4348k = false;
    }

    public final boolean k() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (e() != null || this.f4349l.f4359g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean l() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : e() == null;
    }

    public final boolean m(String str) {
        C0458e c0458e = this.f4349l;
        if (c0458e == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + StringUtils.SPACE + str + " called after release.");
            return false;
        }
        if (c0458e.f4362j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + StringUtils.SPACE + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (m("onActivityResult")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            if (c0458e.f4354b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            C0315a c0315a = c0458e.f4354b.f4483d;
            if (!c0315a.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            N1.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                u0 u0Var = (u0) c0315a.f3511h;
                u0Var.getClass();
                Iterator it2 = new HashSet((HashSet) u0Var.f3797d).iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (((C1.o) it2.next()).a(i3, i4, intent) || z3) {
                            z3 = true;
                        }
                    }
                    Trace.endSection();
                    return;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (m("onBackPressed")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            C0467c c0467c = c0458e.f4354b;
            if (c0467c != null) {
                c0467c.f4488i.f82a.s("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:139|140|(1:142)|143|144|(1:146)|147|(1:149)(1:270)|150|(2:152|(1:154)(2:155|(1:157)(1:158)))|159|(4:161|162|163|(1:165)(2:254|(2:256|257)(2:258|259)))(1:269)|166|(1:168)|169|(1:171)|(1:173)(1:253)|174|(3:176|(1:178)(1:247)|179)(3:248|(1:250)(1:252)|251)|180|(8:182|(1:184)|185|(2:187|(3:189|(1:191)|192)(2:193|194))|195|(1:197)|198|199)|200|(1:202)|203|204|205|206|(2:(1:243)(1:210)|211)(1:244)|212|(2:215|213)|216|217|(2:220|218)|221|222|(2:225|223)|226|227|(2:230|228)|231|(2:234|232)|235|236|(8:238|(1:240)|185|(0)|195|(0)|198|199)(2:241|242)) */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04e0, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0672  */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.AbstractActivityC0455b.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (m("onDestroy")) {
            this.f4349l.e();
            this.f4349l.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.n);
            this.f4348k = false;
        }
        C0458e c0458e = this.f4349l;
        if (c0458e != null) {
            c0458e.f4353a = null;
            c0458e.f4354b = null;
            c0458e.f4355c = null;
            c0458e.f4356d = null;
            c0458e.f4357e = null;
            this.f4349l = null;
        }
        this.f4350m.e(EnumC0140l.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m("onNewIntent")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            C0467c c0467c = c0458e.f4354b;
            if (c0467c == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C0315a c0315a = c0467c.f4483d;
            if (c0315a.f()) {
                N1.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it2 = ((HashSet) ((u0) c0315a.f3511h).f3798e).iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            }
            String d3 = c0458e.d(intent);
            if (d3 == null || d3.isEmpty()) {
                return;
            }
            B1.c cVar = c0458e.f4354b.f4488i;
            cVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d3);
            cVar.f82a.s("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (m("onPause")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            c0458e.f4353a.getClass();
            C0467c c0467c = c0458e.f4354b;
            if (c0467c != null) {
                B1.f fVar = c0467c.f4486g;
                fVar.a(3, fVar.f87c);
            }
        }
        this.f4350m.e(EnumC0140l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (m("onPostResume")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            if (c0458e.f4354b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.f fVar = c0458e.f4356d;
            if (fVar != null) {
                fVar.b();
            }
            c0458e.f4354b.f4497s.j();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (m("onRequestPermissionsResult")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            if (c0458e.f4354b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            C0315a c0315a = c0458e.f4354b.f4483d;
            if (!c0315a.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            N1.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it2 = ((HashSet) ((u0) c0315a.f3511h).f3796c).iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        J1.n nVar = (J1.n) it2.next();
                        nVar.getClass();
                        boolean z4 = iArr.length > 0 && iArr[0] == 0;
                        if (i3 != 2345) {
                            if (i3 != 2355) {
                                if (z3) {
                                    z3 = true;
                                }
                            } else if (z4) {
                                nVar.j();
                            }
                        } else if (z4) {
                            nVar.i();
                        }
                        if (!z4 && (i3 == 2345 || i3 == 2355)) {
                            nVar.c("camera_access_denied", "The user did not allow camera access.");
                        }
                        z3 = true;
                    }
                    Trace.endSection();
                    return;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f4350m.e(EnumC0140l.ON_RESUME);
        if (m("onResume")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            c0458e.f4354b.f4481b.i();
            c0458e.f4353a.getClass();
            C0467c c0467c = c0458e.f4354b;
            if (c0467c != null) {
                B1.f fVar = c0467c.f4486g;
                fVar.a(2, fVar.f87c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (m("onSaveInstanceState")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            if (c0458e.f4353a.l()) {
                bundle.putByteArray("framework", (byte[]) c0458e.f4354b.f4490k.f136d);
            }
            c0458e.f4353a.getClass();
            Bundle bundle2 = new Bundle();
            C0315a c0315a = c0458e.f4354b.f4483d;
            if (c0315a.f()) {
                N1.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it2 = ((HashSet) ((u0) c0315a.f3511h).f3800g).iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (c0458e.f4353a.e() == null || c0458e.f4353a.k()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0458e.f4353a.f4348k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r6 = this;
            super.onStart()
            androidx.lifecycle.u r0 = r6.f4350m
            androidx.lifecycle.l r1 = androidx.lifecycle.EnumC0140l.ON_START
            r0.e(r1)
            java.lang.String r0 = "onStart"
            boolean r0 = r6.m(r0)
            if (r0 == 0) goto Lc0
            r1.e r0 = r6.f4349l
            r0.c()
            r1.b r1 = r0.f4353a
            java.lang.String r1 = r1.e()
            if (r1 == 0) goto L21
            goto Lb3
        L21:
            s1.c r1 = r0.f4354b
            t1.c r1 = r1.f4482c
            boolean r1 = r1.f4554p
            if (r1 == 0) goto L2b
            goto Lb3
        L2b:
            r1.b r1 = r0.f4353a
            java.lang.String r1 = r1.g()
            if (r1 != 0) goto L44
            r1.b r1 = r0.f4353a
            r1.getClass()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r1 = r0.d(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "/"
        L44:
            r1.b r2 = r0.f4353a
            r2.getClass()
            r3 = 0
            android.os.Bundle r2 = r2.i()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            if (r2 == 0) goto L57
            java.lang.String r4 = "io.flutter.EntrypointUri"
            java.lang.String r2 = r2.getString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            goto L58
        L57:
            r2 = r3
        L58:
            r1.b r4 = r0.f4353a
            r4.f()
            s1.c r4 = r0.f4354b
            B1.c r4 = r4.f4488i
            B1.s r4 = r4.f82a
            java.lang.String r5 = "setInitialRoute"
            r4.s(r5, r1, r3)
            r1.b r1 = r0.f4353a
            java.lang.String r1 = r1.a()
            if (r1 == 0) goto L76
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L84
        L76:
            A0.j r1 = A0.j.E()
            java.lang.Object r1 = r1.f57l
            w1.c r1 = (w1.c) r1
            g1.i r1 = r1.f4666e
            java.lang.Object r1 = r1.f2846c
            java.lang.String r1 = (java.lang.String) r1
        L84:
            if (r2 != 0) goto L92
            t1.b r2 = new t1.b
            r1.b r3 = r0.f4353a
            java.lang.String r3 = r3.f()
            r2.<init>(r1, r3)
            goto L9e
        L92:
            t1.b r3 = new t1.b
            r1.b r4 = r0.f4353a
            java.lang.String r4 = r4.f()
            r3.<init>(r1, r2, r4)
            r2 = r3
        L9e:
            s1.c r1 = r0.f4354b
            t1.c r1 = r1.f4482c
            r1.b r3 = r0.f4353a
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "dart_entrypoint_args"
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            java.util.List r3 = (java.util.List) r3
            r1.d(r2, r3)
        Lb3:
            java.lang.Integer r1 = r0.f4363k
            if (r1 == 0) goto Lc0
            r1.n r0 = r0.f4355c
            int r1 = r1.intValue()
            r0.setVisibility(r1)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.AbstractActivityC0455b.onStart():void");
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (m("onStop")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            c0458e.f4353a.getClass();
            C0467c c0467c = c0458e.f4354b;
            if (c0467c != null) {
                B1.f fVar = c0467c.f4486g;
                fVar.a(5, fVar.f87c);
            }
            c0458e.f4363k = Integer.valueOf(c0458e.f4355c.getVisibility());
            c0458e.f4355c.setVisibility(8);
            C0467c c0467c2 = c0458e.f4354b;
            if (c0467c2 != null) {
                c0467c2.f4481b.f(40);
            }
        }
        this.f4350m.e(EnumC0140l.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (m("onTrimMemory")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            C0467c c0467c = c0458e.f4354b;
            if (c0467c != null) {
                if (c0458e.f4361i && i3 >= 10) {
                    FlutterJNI flutterJNI = c0467c.f4482c.f4550k;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    B1.g gVar = c0458e.f4354b.f4495q;
                    gVar.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    ((B1.s) gVar.f90l).x(hashMap, null);
                }
                c0458e.f4354b.f4481b.f(i3);
                io.flutter.plugin.platform.s sVar = c0458e.f4354b.f4497s;
                if (i3 < 40) {
                    sVar.getClass();
                    return;
                }
                Iterator it2 = sVar.f3236t.values().iterator();
                while (it2.hasNext()) {
                    ((D) it2.next()).f3163h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (m("onUserLeaveHint")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            C0467c c0467c = c0458e.f4354b;
            if (c0467c == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C0315a c0315a = c0467c.f4483d;
            if (!c0315a.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            N1.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it2 = ((HashSet) ((u0) c0315a.f3511h).f3799f).iterator();
                if (!it2.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (m("onWindowFocusChanged")) {
            C0458e c0458e = this.f4349l;
            c0458e.c();
            c0458e.f4353a.getClass();
            C0467c c0467c = c0458e.f4354b;
            if (c0467c != null) {
                B1.f fVar = c0467c.f4486g;
                if (z3) {
                    fVar.a(fVar.f85a, true);
                } else {
                    fVar.a(fVar.f85a, false);
                }
            }
        }
    }
}
