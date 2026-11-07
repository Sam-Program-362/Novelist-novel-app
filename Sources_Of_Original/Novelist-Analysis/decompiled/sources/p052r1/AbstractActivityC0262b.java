package p052r1;

import B1.p;
import C1.o;
import J1.n;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.textservice.TextServicesManager;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.EnumC0138l;
import androidx.lifecycle.InterfaceC0144s;
import androidx.lifecycle.u;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.D;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.tika.utils.StringUtils;
import p004b1.Q;
import p022h0.j;
import p022h0.k;
import p029j0.a;
import p031k.u0;
import p054s1.c;
import p054s1.d;
import p054s1.e;
import p054s1.g;
import p054s1.h;
import p054s1.i;
import p057t1.b;

/* JADX INFO: renamed from: r1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0262b extends Activity implements d, InterfaceC0144s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f4347o = View.generateViewId();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4348k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f4349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u f4350m;
    public final OnBackInvokedCallback n;

    public AbstractActivityC0262b() {
        int i3 = Build.VERSION.SDK_INT;
        this.n = i3 < 33 ? null : i3 >= 34 ? new k(this, 1) : new j(this, 1);
        this.f4350m = new u(this);
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
            Bundle bundleI = i();
            String string = bundleI != null ? bundleI.getString("io.flutter.Entrypoint") : null;
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
            Bundle bundleI = i();
            if (bundleI != null) {
                return bundleI.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0144s
    public final u h() {
        return this.f4350m;
    }

    public final Bundle i() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void j(boolean z3) {
        if (z3 && !this.f4348k) {
            if (Build.VERSION.SDK_INT >= 33) {
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.n);
                this.f4348k = true;
                return;
            }
            return;
        }
        if (z3 || !this.f4348k || Build.VERSION.SDK_INT < 33) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.n);
        this.f4348k = false;
    }

    public final boolean k() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (e() != null || this.f4349l.f4359g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean l() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        return e() == null;
    }

    public final boolean m(String str) {
        e eVar = this.f4349l;
        if (eVar == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + StringUtils.SPACE + str + " called after release.");
            return false;
        }
        if (eVar.f4362j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + StringUtils.SPACE + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (!m("onActivityResult")) {
            return;
        }
        e eVar = this.f4349l;
        eVar.c();
        if (eVar.f4354b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Objects.toString(intent);
        a aVar = eVar.f4354b.f4483d;
        if (!aVar.f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return;
        }
        N1.a.b("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            u0 u0Var = (u0) aVar.f3511h;
            u0Var.getClass();
            Iterator it2 = new HashSet((HashSet) u0Var.f3797d).iterator();
            while (true) {
                boolean z3 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        Trace.endSection();
                        return;
                    } else if (((o) it2.next()).a(i3, i4, intent) || z3) {
                        z3 = true;
                    }
                }
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

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (m("onBackPressed")) {
            e eVar = this.f4349l;
            eVar.c();
            c cVar = eVar.f4354b;
            if (cVar != null) {
                cVar.f4488i.f82a.s("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:206:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:213:0x054a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0550  */
    /* JADX WARN: Code duplicated, block: B:218:0x0555  */
    /* JADX WARN: Code duplicated, block: B:222:0x05af A[LOOP:1: B:220:0x05a9->B:222:0x05af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x05c4 A[LOOP:2: B:224:0x05be->B:226:0x05c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:230:0x05d9 A[LOOP:3: B:228:0x05d3->B:230:0x05d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x05f4 A[LOOP:4: B:232:0x05ee->B:234:0x05f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:237:0x0608 A[LOOP:5: B:235:0x0602->B:237:0x0608, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:240:0x0620  */
    /* JADX WARN: Code duplicated, block: B:242:0x0624  */
    /* JADX WARN: Code duplicated, block: B:258:0x0681  */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        byte[] byteArray;
        io.flutter.embedding.engine.renderer.k kVar;
        boolean zIsEnabled;
        s sVar;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i3;
        int i4;
        int i5;
        r rVar;
        SparseArray sparseArray4;
        SparseArray sparseArray5;
        int i6;
        Iterator it2;
        boolean z3;
        int i7;
        try {
            Bundle bundleI = i();
            if (bundleI != null && (i7 = bundleI.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i7);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            j(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        e eVar = new e(this);
        this.f4349l = eVar;
        eVar.c();
        if (eVar.f4354b == null) {
            String strE = eVar.f4353a.e();
            if (strE != null) {
                if (i.f4527c == null) {
                    i.f4527c = new i(1);
                }
                c cVar = (c) i.f4527c.f4528a.get(strE);
                eVar.f4354b = cVar;
                eVar.f4359g = true;
                if (cVar == null) {
                    throw new IllegalStateException(p055t.a.b("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", strE, "'"));
                }
            } else {
                eVar.f4353a.getClass();
                eVar.f4354b = null;
                String stringExtra = eVar.f4353a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (i.f4526b == null) {
                        synchronized (i.class) {
                            try {
                                if (i.f4526b == null) {
                                    i.f4526b = new i(0);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    h hVar = (h) i.f4526b.f4528a.get(stringExtra);
                    if (hVar == null) {
                        throw new IllegalStateException(p055t.a.b("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", stringExtra, "'"));
                    }
                    AbstractActivityC0262b abstractActivityC0262b = eVar.f4353a;
                    abstractActivityC0262b.getClass();
                    g gVar = new g(abstractActivityC0262b);
                    eVar.a(gVar);
                    eVar.f4354b = hVar.a(gVar);
                    eVar.f4359g = false;
                } else {
                    AbstractActivityC0262b abstractActivityC0262b2 = eVar.f4353a;
                    abstractActivityC0262b2.getClass();
                    Intent intent = abstractActivityC0262b2.getIntent();
                    if (intent.getExtras() != null) {
                        for (String str : intent.getExtras().keySet()) {
                            d dVarA = e.a(str);
                            if (dVarA == null) {
                                dVarA = e.a("--".concat(str));
                            }
                            if (dVarA == null) {
                                dVarA = e.a("--" + str + "=");
                            }
                            if (dVarA != null) {
                                break;
                            }
                        }
                    }
                    AbstractActivityC0262b abstractActivityC0262b3 = eVar.f4353a;
                    abstractActivityC0262b3.getClass();
                    Intent intent2 = eVar.f4353a.getIntent();
                    ArrayList arrayList = new ArrayList();
                    if (intent2.getBooleanExtra("trace-startup", false)) {
                        arrayList.add("--trace-startup");
                    }
                    if (intent2.getBooleanExtra("start-paused", false)) {
                        arrayList.add("--start-paused");
                    }
                    int intExtra = intent2.getIntExtra("vm-service-port", 0);
                    if (intExtra > 0) {
                        arrayList.add("--vm-service-port=" + intExtra);
                    }
                    if (intent2.getBooleanExtra("disable-service-auth-codes", false)) {
                        arrayList.add("--disable-service-auth-codes");
                    }
                    if (intent2.getBooleanExtra("endless-trace-buffer", false)) {
                        arrayList.add("--endless-trace-buffer");
                    }
                    if (intent2.getBooleanExtra("use-test-fonts", false)) {
                        arrayList.add("--use-test-fonts");
                    }
                    if (intent2.getBooleanExtra("enable-dart-profiling", false)) {
                        arrayList.add("--enable-dart-profiling");
                    }
                    if (intent2.getBooleanExtra("profile-startup", false)) {
                        arrayList.add("--profile-startup");
                    }
                    if (intent2.getBooleanExtra("enable-software-rendering", false)) {
                        arrayList.add("--enable-software-rendering");
                    }
                    if (intent2.getBooleanExtra("skia-deterministic-rendering", false)) {
                        arrayList.add("--skia-deterministic-rendering");
                    }
                    if (intent2.getBooleanExtra("trace-skia", false)) {
                        arrayList.add("--trace-skia");
                    }
                    String stringExtra2 = intent2.getStringExtra("trace-skia-allowlist");
                    if (stringExtra2 != null) {
                        arrayList.add("--trace-skia-allowlist=".concat(stringExtra2));
                    }
                    if (intent2.getBooleanExtra("trace-systrace", false)) {
                        arrayList.add("--trace-systrace");
                    }
                    if (intent2.hasExtra("trace-to-file")) {
                        arrayList.add("--trace-to-file=" + intent2.getStringExtra("trace-to-file"));
                    }
                    if (intent2.hasExtra("profile-microtasks")) {
                        arrayList.add("--profile-microtasks");
                    }
                    if (intent2.hasExtra("enable-impeller")) {
                        if (intent2.getBooleanExtra("enable-impeller", false)) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (intent2.getBooleanExtra("enable-vulkan-validation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (intent2.hasExtra("enable-hcpp-and-surface-control")) {
                        if (intent2.getBooleanExtra("enable-hcpp-and-surface-control", false)) {
                            arrayList.add("--enable-hcpp-and-surface-control=true");
                        } else {
                            arrayList.add("--enable-hcpp-and-surface-control=false");
                        }
                    }
                    if (intent2.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
                        arrayList.add("--dump-skp-on-shader-compilation");
                    }
                    if (intent2.getBooleanExtra("cache-sksl", false)) {
                        arrayList.add("--cache-sksl");
                    }
                    if (intent2.getBooleanExtra("purge-persistent-cache", false)) {
                        arrayList.add("--purge-persistent-cache");
                    }
                    if (intent2.getBooleanExtra("verbose-logging", false)) {
                        arrayList.add("--verbose-logging");
                    }
                    if (intent2.hasExtra("dart-flags")) {
                        arrayList.add("--dart-flags=" + intent2.getStringExtra("dart-flags"));
                    }
                    HashSet hashSet = new HashSet(arrayList);
                    h hVar2 = new h(abstractActivityC0262b3, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0262b abstractActivityC0262b4 = eVar.f4353a;
                    abstractActivityC0262b4.getClass();
                    g gVar2 = new g(abstractActivityC0262b4);
                    gVar2.f4523e = false;
                    gVar2.f4524f = eVar.f4353a.l();
                    eVar.a(gVar2);
                    eVar.f4354b = hVar2.a(gVar2);
                    eVar.f4359g = false;
                }
            }
        }
        eVar.f4353a.getClass();
        a aVar = eVar.f4354b.f4483d;
        u uVar = eVar.f4353a.f4350m;
        aVar.getClass();
        N1.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            e eVar2 = (e) aVar.f3510g;
            if (eVar2 != null) {
                eVar2.b();
            }
            aVar.e();
            aVar.f3510g = eVar;
            AbstractActivityC0262b abstractActivityC0262b5 = eVar.f4353a;
            abstractActivityC0262b5.getClass();
            aVar.b(abstractActivityC0262b5, uVar);
            Trace.endSection();
            AbstractActivityC0262b abstractActivityC0262b6 = eVar.f4353a;
            abstractActivityC0262b6.getClass();
            AbstractActivityC0262b abstractActivityC0262b7 = eVar.f4353a;
            c cVar2 = eVar.f4354b;
            abstractActivityC0262b7.getClass();
            eVar.f4356d = new f(abstractActivityC0262b7, cVar2.f4491l, abstractActivityC0262b7);
            AbstractActivityC0262b abstractActivityC0262b8 = eVar.f4353a;
            c cVar3 = eVar.f4354b;
            abstractActivityC0262b8.getClass();
            int i8 = f4347o;
            B1.g gVar3 = cVar3.n;
            G1.a aVar2 = new G1.a();
            aVar2.f398b = abstractActivityC0262b6;
            aVar2.f397a = i8;
            aVar2.f399c = gVar3;
            gVar3.f90l = aVar2;
            eVar.f4357e = aVar2;
            AbstractActivityC0262b abstractActivityC0262b9 = eVar.f4353a;
            c cVar4 = eVar.f4354b;
            if (!abstractActivityC0262b9.f4349l.f4359g) {
                E2.a.K(cVar4);
            }
            eVar.f4362j = true;
            e eVar3 = this.f4349l;
            eVar3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                byteArray = bundle.getByteArray("framework");
            } else {
                byteArray = null;
            }
            if (eVar3.f4353a.l()) {
                p pVar = eVar3.f4354b.f4490k;
                pVar.f134b = true;
                B1.o oVar = (B1.o) pVar.f138f;
                if (oVar != null) {
                    oVar.d(p.b(byteArray));
                    pVar.f138f = null;
                    pVar.f136d = byteArray;
                } else if (pVar.f135c) {
                    ((B1.s) pVar.f137e).s("push", p.b(byteArray), new B1.o(pVar, byteArray, 0));
                } else {
                    pVar.f136d = byteArray;
                }
            }
            eVar3.f4353a.getClass();
            a aVar3 = eVar3.f4354b.f4483d;
            if (aVar3.f()) {
                N1.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it3 = ((HashSet) ((u0) aVar3.f3511h).f3800g).iterator();
                    if (it3.hasNext()) {
                        if (it3.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th2) {
                    try {
                        Trace.endSection();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f4350m.e(EnumC0138l.ON_CREATE);
            if (d() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            e eVar4 = this.f4349l;
            boolean z4 = (d() == 1 ? (char) 1 : (char) 2) == 1;
            eVar4.c();
            if (eVar4.f4353a.d() == 1) {
                AbstractActivityC0262b abstractActivityC0262b10 = eVar4.f4353a;
                abstractActivityC0262b10.getClass();
                h hVar3 = new h(abstractActivityC0262b10, eVar4.f4353a.d() != 1);
                eVar4.f4353a.getClass();
                AbstractActivityC0262b abstractActivityC0262b11 = eVar4.f4353a;
                abstractActivityC0262b11.getClass();
                eVar4.f4355c = new n(abstractActivityC0262b11, hVar3);
            } else {
                AbstractActivityC0262b abstractActivityC0262b12 = eVar4.f4353a;
                abstractActivityC0262b12.getClass();
                j jVar = new j(abstractActivityC0262b12);
                jVar.setOpaque(eVar4.f4353a.d() == 1);
                eVar4.f4353a.getClass();
                AbstractActivityC0262b abstractActivityC0262b13 = eVar4.f4353a;
                abstractActivityC0262b13.getClass();
                eVar4.f4355c = new n(abstractActivityC0262b13, jVar);
            }
            eVar4.f4355c.f4404q.add(eVar4.f4364l);
            eVar4.f4353a.getClass();
            n nVar = eVar4.f4355c;
            c cVar5 = eVar4.f4354b;
            io.flutter.embedding.engine.renderer.a aVar4 = nVar.f4394H;
            Objects.toString(cVar5);
            if (!nVar.c()) {
                nVar.f4406s = cVar5;
                kVar = cVar5.f4481b;
                nVar.f4405r = kVar.f3086d;
                nVar.f4402o.c(kVar);
                kVar.a(aVar4);
                if (nVar.f4399k) {
                    kVar.f3083a.addResizingFlutterUiListener(nVar.f4393G);
                }
                nVar.u = new A.c(nVar, nVar.f4406s.f4487h);
                c cVar6 = nVar.f4406s;
                nVar.f4408v = new io.flutter.plugin.editing.j(nVar, cVar6.f4496r, cVar6.f4492m, cVar6.f4497s, cVar6.f4498t);
                try {
                    TextServicesManager textServicesManager = (TextServicesManager) nVar.getContext().getSystemService("textservices");
                    nVar.f4388B = textServicesManager;
                    nVar.f4409w = new io.flutter.plugin.editing.g(textServicesManager, nVar.f4406s.f4494p);
                } catch (Exception unused2) {
                    Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
                }
                new Q(nVar, nVar.f4408v.f3137b, nVar.f4406s.f4492m);
                nVar.x = nVar.f4406s.f4484e;
                nVar.y = new A0.j(nVar);
                nVar.f4410z = new C0261a(nVar.f4406s.f4481b, false);
                io.flutter.view.i iVar = new io.flutter.view.i(nVar, cVar5.f4485f, (AccessibilityManager) nVar.getContext().getSystemService("accessibility"), nVar.getContext().getContentResolver(), cVar5.u);
                nVar.f4387A = iVar;
                iVar.f3361s = nVar.f4391E;
                zIsEnabled = iVar.f3346c.isEnabled();
                boolean zIsTouchExplorationEnabled = nVar.f4387A.f3346c.isTouchExplorationEnabled();
                if (nVar.f4406s.f4481b.f3083a.getIsSoftwareRenderingEnabled()) {
                    nVar.setWillNotDraw(false);
                } else {
                    if (!zIsEnabled || zIsTouchExplorationEnabled) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    nVar.setWillNotDraw(z3);
                }
                c cVar7 = nVar.f4406s;
                s sVar2 = cVar7.f4497s;
                sVar2.f3235s.f3166a = nVar.f4387A;
                sVar2.f3229l = new C0261a(cVar7.f4481b, true);
                c cVar8 = nVar.f4406s;
                r rVar2 = cVar8.f4498t;
                rVar2.f3214r.f3166a = nVar.f4387A;
                rVar2.f3209l = new C0261a(cVar8.f4481b, true);
                nVar.f4408v.f3137b.restartInput(nVar);
                nVar.d();
                nVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, nVar.f4392F);
                nVar.e();
                sVar = cVar5.f4497s;
                sparseArray = sVar.f3237v;
                sparseArray2 = sVar.f3238w;
                sparseArray3 = sVar.y;
                sVar.n = nVar;
                for (i3 = 0; i3 < sparseArray3.size(); i3++) {
                    sVar.n.addView((io.flutter.plugin.platform.j) sparseArray3.valueAt(i3));
                }
                for (i4 = 0; i4 < sparseArray2.size(); i4++) {
                    sVar.n.addView((p065x1.a) sparseArray2.valueAt(i4));
                }
                for (i5 = 0; i5 < sparseArray.size(); i5++) {
                    ((io.flutter.plugin.platform.g) sparseArray.valueAt(i5)).getClass();
                }
                rVar = cVar5.f4498t;
                sparseArray4 = rVar.f3215s;
                sparseArray5 = rVar.f3216t;
                rVar.n = nVar;
                for (i6 = 0; i6 < sparseArray5.size(); i6++) {
                    rVar.n.addView((p065x1.a) sparseArray5.valueAt(i6));
                }
                for (int i9 = 0; i9 < sparseArray4.size(); i9++) {
                    ((io.flutter.plugin.platform.g) sparseArray4.valueAt(i9)).getClass();
                }
                it2 = nVar.f4407t.iterator();
                if (!it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                if (nVar.f4405r) {
                    aVar4.b();
                }
            } else if (cVar5 != nVar.f4406s) {
                nVar.a();
                nVar.f4406s = cVar5;
                kVar = cVar5.f4481b;
                nVar.f4405r = kVar.f3086d;
                nVar.f4402o.c(kVar);
                kVar.a(aVar4);
                if (nVar.f4399k) {
                    kVar.f3083a.addResizingFlutterUiListener(nVar.f4393G);
                }
                nVar.u = new A.c(nVar, nVar.f4406s.f4487h);
                c cVar9 = nVar.f4406s;
                nVar.f4408v = new io.flutter.plugin.editing.j(nVar, cVar9.f4496r, cVar9.f4492m, cVar9.f4497s, cVar9.f4498t);
                TextServicesManager textServicesManager2 = (TextServicesManager) nVar.getContext().getSystemService("textservices");
                nVar.f4388B = textServicesManager2;
                nVar.f4409w = new io.flutter.plugin.editing.g(textServicesManager2, nVar.f4406s.f4494p);
                new Q(nVar, nVar.f4408v.f3137b, nVar.f4406s.f4492m);
                nVar.x = nVar.f4406s.f4484e;
                nVar.y = new A0.j(nVar);
                nVar.f4410z = new C0261a(nVar.f4406s.f4481b, false);
                io.flutter.view.i iVar2 = new io.flutter.view.i(nVar, cVar5.f4485f, (AccessibilityManager) nVar.getContext().getSystemService("accessibility"), nVar.getContext().getContentResolver(), cVar5.u);
                nVar.f4387A = iVar2;
                iVar2.f3361s = nVar.f4391E;
                zIsEnabled = iVar2.f3346c.isEnabled();
                boolean zIsTouchExplorationEnabled2 = nVar.f4387A.f3346c.isTouchExplorationEnabled();
                if (nVar.f4406s.f4481b.f3083a.getIsSoftwareRenderingEnabled()) {
                    if (zIsEnabled) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    nVar.setWillNotDraw(z3);
                } else {
                    nVar.setWillNotDraw(false);
                }
                c cVar10 = nVar.f4406s;
                s sVar3 = cVar10.f4497s;
                sVar3.f3235s.f3166a = nVar.f4387A;
                sVar3.f3229l = new C0261a(cVar10.f4481b, true);
                c cVar11 = nVar.f4406s;
                r rVar3 = cVar11.f4498t;
                rVar3.f3214r.f3166a = nVar.f4387A;
                rVar3.f3209l = new C0261a(cVar11.f4481b, true);
                nVar.f4408v.f3137b.restartInput(nVar);
                nVar.d();
                nVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, nVar.f4392F);
                nVar.e();
                sVar = cVar5.f4497s;
                sparseArray = sVar.f3237v;
                sparseArray2 = sVar.f3238w;
                sparseArray3 = sVar.y;
                sVar.n = nVar;
                while (i3 < sparseArray3.size()) {
                    sVar.n.addView((io.flutter.plugin.platform.j) sparseArray3.valueAt(i3));
                }
                while (i4 < sparseArray2.size()) {
                    sVar.n.addView((p065x1.a) sparseArray2.valueAt(i4));
                }
                while (i5 < sparseArray.size()) {
                    ((io.flutter.plugin.platform.g) sparseArray.valueAt(i5)).getClass();
                }
                rVar = cVar5.f4498t;
                sparseArray4 = rVar.f3215s;
                sparseArray5 = rVar.f3216t;
                rVar.n = nVar;
                while (i6 < sparseArray5.size()) {
                    rVar.n.addView((p065x1.a) sparseArray5.valueAt(i6));
                }
                while (i9 < sparseArray4.size()) {
                    ((io.flutter.plugin.platform.g) sparseArray4.valueAt(i9)).getClass();
                }
                it2 = nVar.f4407t.iterator();
                if (!it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                if (nVar.f4405r) {
                    aVar4.b();
                }
            }
            eVar4.f4355c.setId(i8);
            if (z4) {
                n nVar2 = eVar4.f4355c;
                if (eVar4.f4353a.d() != 1) {
                    throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                }
                if (eVar4.f4358f != null) {
                    nVar2.getViewTreeObserver().removeOnPreDrawListener(eVar4.f4358f);
                }
                eVar4.f4358f = new ViewTreeObserverOnPreDrawListenerC0263c(eVar4, nVar2);
                nVar2.getViewTreeObserver().addOnPreDrawListener(eVar4.f4358f);
            }
            setContentView(eVar4.f4355c);
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(1073741824);
            }
            window.getDecorView().setSystemUiVisibility(1280);
        } catch (Throwable th4) {
            try {
                Trace.endSection();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (m("onDestroy")) {
            this.f4349l.e();
            this.f4349l.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.n);
            this.f4348k = false;
        }
        e eVar = this.f4349l;
        if (eVar != null) {
            eVar.f4353a = null;
            eVar.f4354b = null;
            eVar.f4355c = null;
            eVar.f4356d = null;
            eVar.f4357e = null;
            this.f4349l = null;
        }
        this.f4350m.e(EnumC0138l.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m("onNewIntent")) {
            e eVar = this.f4349l;
            eVar.c();
            c cVar = eVar.f4354b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            a aVar = cVar.f4483d;
            if (aVar.f()) {
                N1.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it2 = ((HashSet) ((u0) aVar.f3511h).f3798e).iterator();
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
            String strD = eVar.d(intent);
            if (strD == null || strD.isEmpty()) {
                return;
            }
            B1.c cVar2 = eVar.f4354b.f4488i;
            cVar2.getClass();
            HashMap map = new HashMap();
            map.put("location", strD);
            cVar2.f82a.s("pushRouteInformation", map, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (m("onPause")) {
            e eVar = this.f4349l;
            eVar.c();
            eVar.f4353a.getClass();
            c cVar = eVar.f4354b;
            if (cVar != null) {
                B1.f fVar = cVar.f4486g;
                fVar.a(3, fVar.f87c);
            }
        }
        this.f4350m.e(EnumC0138l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (m("onPostResume")) {
            e eVar = this.f4349l;
            eVar.c();
            if (eVar.f4354b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            f fVar = eVar.f4356d;
            if (fVar != null) {
                fVar.b();
            }
            eVar.f4354b.f4497s.j();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (!m("onRequestPermissionsResult")) {
            return;
        }
        e eVar = this.f4349l;
        eVar.c();
        if (eVar.f4354b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Arrays.toString(strArr);
        Arrays.toString(iArr);
        a aVar = eVar.f4354b.f4483d;
        if (!aVar.f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return;
        }
        N1.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            Iterator it2 = ((HashSet) ((u0) aVar.f3511h).f3796c).iterator();
            while (true) {
                boolean z3 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        Trace.endSection();
                        return;
                    }
                    n nVar = (n) it2.next();
                    nVar.getClass();
                    boolean z4 = iArr.length > 0 && iArr[0] == 0;
                    if (i3 != 2345) {
                        if (i3 != 2355) {
                            if (z3) {
                            }
                        } else if (z4) {
                            nVar.j();
                        }
                        z3 = true;
                    } else if (z4) {
                        nVar.i();
                    }
                    if (!z4 && (i3 == 2345 || i3 == 2355)) {
                        nVar.c("camera_access_denied", "The user did not allow camera access.");
                    }
                    z3 = true;
                }
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

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f4350m.e(EnumC0138l.ON_RESUME);
        if (m("onResume")) {
            e eVar = this.f4349l;
            eVar.c();
            eVar.f4354b.f4481b.i();
            eVar.f4353a.getClass();
            c cVar = eVar.f4354b;
            if (cVar != null) {
                B1.f fVar = cVar.f4486g;
                fVar.a(2, fVar.f87c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (m("onSaveInstanceState")) {
            e eVar = this.f4349l;
            eVar.c();
            if (eVar.f4353a.l()) {
                bundle.putByteArray("framework", (byte[]) eVar.f4354b.f4490k.f136d);
            }
            eVar.f4353a.getClass();
            Bundle bundle2 = new Bundle();
            a aVar = eVar.f4354b.f4483d;
            if (aVar.f()) {
                N1.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it2 = ((HashSet) ((u0) aVar.f3511h).f3800g).iterator();
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
            if (eVar.f4353a.e() == null || eVar.f4353a.k()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", eVar.f4353a.f4348k);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        String string;
        super.onStart();
        this.f4350m.e(EnumC0138l.ON_START);
        if (m("onStart")) {
            e eVar = this.f4349l;
            eVar.c();
            if (eVar.f4353a.e() == null && !eVar.f4354b.f4482c.f4554p) {
                String strG = eVar.f4353a.g();
                if (strG == null) {
                    AbstractActivityC0262b abstractActivityC0262b = eVar.f4353a;
                    abstractActivityC0262b.getClass();
                    strG = eVar.d(abstractActivityC0262b.getIntent());
                    if (strG == null) {
                        strG = "/";
                    }
                }
                AbstractActivityC0262b abstractActivityC0262b2 = eVar.f4353a;
                abstractActivityC0262b2.getClass();
                try {
                    Bundle bundleI = abstractActivityC0262b2.i();
                    string = bundleI != null ? bundleI.getString("io.flutter.EntrypointUri") : null;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                eVar.f4353a.f();
                eVar.f4354b.f4488i.f82a.s("setInitialRoute", strG, null);
                String strA = eVar.f4353a.a();
                if (strA == null || strA.isEmpty()) {
                    strA = (String) ((p063w1.c) A0.j.E().f57l).f4666e.f2846c;
                }
                eVar.f4354b.f4482c.d(string == null ? new b(strA, eVar.f4353a.f()) : new b(strA, string, eVar.f4353a.f()), (List) eVar.f4353a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = eVar.f4363k;
            if (num != null) {
                eVar.f4355c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (m("onStop")) {
            e eVar = this.f4349l;
            eVar.c();
            eVar.f4353a.getClass();
            c cVar = eVar.f4354b;
            if (cVar != null) {
                B1.f fVar = cVar.f4486g;
                fVar.a(5, fVar.f87c);
            }
            eVar.f4363k = Integer.valueOf(eVar.f4355c.getVisibility());
            eVar.f4355c.setVisibility(8);
            c cVar2 = eVar.f4354b;
            if (cVar2 != null) {
                cVar2.f4481b.f(40);
            }
        }
        this.f4350m.e(EnumC0138l.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (m("onTrimMemory")) {
            e eVar = this.f4349l;
            eVar.c();
            c cVar = eVar.f4354b;
            if (cVar != null) {
                if (eVar.f4361i && i3 >= 10) {
                    FlutterJNI flutterJNI = cVar.f4482c.f4550k;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    B1.g gVar = eVar.f4354b.f4495q;
                    gVar.getClass();
                    HashMap map = new HashMap(1);
                    map.put("type", "memoryPressure");
                    ((B1.s) gVar.f90l).x(map, null);
                }
                eVar.f4354b.f4481b.f(i3);
                s sVar = eVar.f4354b.f4497s;
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
            e eVar = this.f4349l;
            eVar.c();
            c cVar = eVar.f4354b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            a aVar = cVar.f4483d;
            if (!aVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            N1.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it2 = ((HashSet) ((u0) aVar.f3511h).f3799f).iterator();
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
            e eVar = this.f4349l;
            eVar.c();
            eVar.f4353a.getClass();
            c cVar = eVar.f4354b;
            if (cVar != null) {
                B1.f fVar = cVar.f4486g;
                if (z3) {
                    fVar.a(fVar.f85a, true);
                } else {
                    fVar.a(fVar.f85a, false);
                }
            }
        }
    }
}
