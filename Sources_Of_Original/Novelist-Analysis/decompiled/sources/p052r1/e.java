package p052r1;

import A0.j;
import G1.a;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p054s1.c;
import p054s1.g;
import p054s1.i;
import p057t1.b;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractActivityC0262b f4353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f4354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f4355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f4356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f4357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0263c f4358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4360h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f4363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f4364l = new io.flutter.embedding.engine.renderer.a(this, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4361i = false;

    public e(AbstractActivityC0262b abstractActivityC0262b) {
        this.f4353a = abstractActivityC0262b;
    }

    public final void a(g gVar) {
        String strA = this.f4353a.a();
        if (strA == null || strA.isEmpty()) {
            strA = (String) ((p063w1.c) j.E().f57l).f4666e.f2846c;
        }
        b bVar = new b(strA, this.f4353a.f());
        String strG = this.f4353a.g();
        if (strG == null) {
            AbstractActivityC0262b abstractActivityC0262b = this.f4353a;
            abstractActivityC0262b.getClass();
            strG = d(abstractActivityC0262b.getIntent());
            if (strG == null) {
                strG = "/";
            }
        }
        gVar.f4520b = bVar;
        gVar.f4521c = strG;
        gVar.f4522d = (List) this.f4353a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f4353a.k()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f4353a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0262b abstractActivityC0262b = this.f4353a;
        abstractActivityC0262b.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0262b + " connection to the engine " + abstractActivityC0262b.f4349l.f4354b + " evicted by another attaching activity");
        e eVar = abstractActivityC0262b.f4349l;
        if (eVar != null) {
            eVar.e();
            abstractActivityC0262b.f4349l.f();
        }
    }

    public final void c() {
        if (this.f4353a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z3;
        Uri data;
        AbstractActivityC0262b abstractActivityC0262b = this.f4353a;
        abstractActivityC0262b.getClass();
        try {
            Bundle bundleI = abstractActivityC0262b.i();
            z3 = (bundleI == null || !bundleI.containsKey("flutter_deeplinking_enabled")) ? true : bundleI.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z3 = false;
        }
        if (!z3 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f4358f != null) {
            this.f4355c.getViewTreeObserver().removeOnPreDrawListener(this.f4358f);
            this.f4358f = null;
        }
        n nVar = this.f4355c;
        if (nVar != null) {
            nVar.a();
            n nVar2 = this.f4355c;
            nVar2.f4404q.remove(this.f4364l);
        }
    }

    public final void f() {
        if (this.f4362j) {
            c();
            this.f4353a.getClass();
            this.f4353a.getClass();
            AbstractActivityC0262b abstractActivityC0262b = this.f4353a;
            abstractActivityC0262b.getClass();
            if (abstractActivityC0262b.isChangingConfigurations()) {
                p029j0.a aVar = this.f4354b.f4483d;
                if (aVar.f()) {
                    N1.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        aVar.f3504a = true;
                        Iterator it2 = ((HashMap) aVar.f3509f).values().iterator();
                        while (it2.hasNext()) {
                            ((p070z1.a) it2.next()).onDetachedFromActivityForConfigChanges();
                        }
                        aVar.d();
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
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f4354b.f4483d.c();
            }
            f fVar = this.f4356d;
            if (fVar != null) {
                fVar.f3177b.f7m = null;
                this.f4356d = null;
            }
            a aVar2 = this.f4357e;
            if (aVar2 != null) {
                ((B1.g) aVar2.f399c).f90l = null;
                aVar2.f398b = null;
                this.f4357e = null;
            }
            this.f4353a.getClass();
            c cVar = this.f4354b;
            if (cVar != null) {
                B1.f fVar2 = cVar.f4486g;
                fVar2.a(1, fVar2.f87c);
            }
            if (this.f4353a.k()) {
                c cVar2 = this.f4354b;
                FlutterJNI flutterJNI = cVar2.f4480a;
                Iterator it3 = cVar2.f4499v.iterator();
                while (it3.hasNext()) {
                    ((p054s1.b) it3.next()).a();
                }
                p029j0.a aVar3 = cVar2.f4483d;
                aVar3.e();
                HashMap map = (HashMap) aVar3.f3505b;
                for (Class cls : new HashSet(map.keySet())) {
                    p067y1.b bVar = (p067y1.b) map.get(cls);
                    if (bVar != null) {
                        N1.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (bVar instanceof p070z1.a) {
                                if (aVar3.f()) {
                                    ((p070z1.a) bVar).onDetachedFromActivity();
                                }
                                ((HashMap) aVar3.f3509f).remove(cls);
                            }
                            bVar.onDetachedFromEngine((p067y1.a) aVar3.f3508e);
                            map.remove(cls);
                            Trace.endSection();
                        } catch (Throwable th3) {
                            try {
                                Trace.endSection();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                }
                map.clear();
                s sVar = cVar2.f4497s;
                SparseArray sparseArray = sVar.f3237v;
                while (sparseArray.size() > 0) {
                    sVar.f3227G.p(sparseArray.keyAt(0));
                }
                r rVar = cVar2.f4498t;
                SparseArray sparseArray2 = rVar.f3215s;
                while (sparseArray2.size() > 0) {
                    rVar.f3207A.p(sparseArray2.keyAt(0));
                }
                cVar2.f4482c.f4550k.setPlatformMessageHandler(null);
                flutterJNI.removeEngineLifecycleListener(cVar2.x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                j.E().getClass();
                c.f4479z.remove(Long.valueOf(cVar2.f4500w));
                if (this.f4353a.e() != null) {
                    if (i.f4527c == null) {
                        i.f4527c = new i(1);
                    }
                    i iVar = i.f4527c;
                    iVar.f4528a.remove(this.f4353a.e());
                }
                this.f4354b = null;
            }
            this.f4362j = false;
        }
    }
}
