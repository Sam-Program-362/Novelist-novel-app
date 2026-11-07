package r1;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterJNI;
import j0.C0315a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import s1.C0467c;
import s1.InterfaceC0466b;
import t1.C0474b;
import y1.C0500a;
import z1.InterfaceC0508a;

/* renamed from: r1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458e {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0455b f4353a;

    /* renamed from: b, reason: collision with root package name */
    public C0467c f4354b;

    /* renamed from: c, reason: collision with root package name */
    public n f4355c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.f f4356d;

    /* renamed from: e, reason: collision with root package name */
    public G1.a f4357e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0456c f4358f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4359g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4360h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4362j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f4363k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f4364l = new io.flutter.embedding.engine.renderer.a(this, 1);

    /* renamed from: i, reason: collision with root package name */
    public boolean f4361i = false;

    public C0458e(AbstractActivityC0455b abstractActivityC0455b) {
        this.f4353a = abstractActivityC0455b;
    }

    public final void a(s1.g gVar) {
        String a3 = this.f4353a.a();
        if (a3 == null || a3.isEmpty()) {
            a3 = (String) ((w1.c) A0.j.E().f57l).f4666e.f2846c;
        }
        C0474b c0474b = new C0474b(a3, this.f4353a.f());
        String g3 = this.f4353a.g();
        if (g3 == null) {
            AbstractActivityC0455b abstractActivityC0455b = this.f4353a;
            abstractActivityC0455b.getClass();
            g3 = d(abstractActivityC0455b.getIntent());
            if (g3 == null) {
                g3 = "/";
            }
        }
        gVar.f4520b = c0474b;
        gVar.f4521c = g3;
        gVar.f4522d = (List) this.f4353a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f4353a.k()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f4353a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0455b abstractActivityC0455b = this.f4353a;
        abstractActivityC0455b.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0455b + " connection to the engine " + abstractActivityC0455b.f4349l.f4354b + " evicted by another attaching activity");
        C0458e c0458e = abstractActivityC0455b.f4349l;
        if (c0458e != null) {
            c0458e.e();
            abstractActivityC0455b.f4349l.f();
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
        AbstractActivityC0455b abstractActivityC0455b = this.f4353a;
        abstractActivityC0455b.getClass();
        try {
            Bundle i3 = abstractActivityC0455b.i();
            z3 = (i3 == null || !i3.containsKey("flutter_deeplinking_enabled")) ? true : i3.getBoolean("flutter_deeplinking_enabled");
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
            AbstractActivityC0455b abstractActivityC0455b = this.f4353a;
            abstractActivityC0455b.getClass();
            if (abstractActivityC0455b.isChangingConfigurations()) {
                C0315a c0315a = this.f4354b.f4483d;
                if (c0315a.f()) {
                    N1.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        c0315a.f3504a = true;
                        Iterator it2 = ((HashMap) c0315a.f3509f).values().iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC0508a) it2.next()).onDetachedFromActivityForConfigChanges();
                        }
                        c0315a.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f4354b.f4483d.c();
            }
            io.flutter.plugin.platform.f fVar = this.f4356d;
            if (fVar != null) {
                fVar.f3177b.f7m = null;
                this.f4356d = null;
            }
            G1.a aVar = this.f4357e;
            if (aVar != null) {
                ((B1.g) aVar.f399c).f90l = null;
                aVar.f398b = null;
                this.f4357e = null;
            }
            this.f4353a.getClass();
            C0467c c0467c = this.f4354b;
            if (c0467c != null) {
                B1.f fVar2 = c0467c.f4486g;
                fVar2.a(1, fVar2.f87c);
            }
            if (this.f4353a.k()) {
                C0467c c0467c2 = this.f4354b;
                FlutterJNI flutterJNI = c0467c2.f4480a;
                Iterator it3 = c0467c2.f4499v.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC0466b) it3.next()).a();
                }
                C0315a c0315a2 = c0467c2.f4483d;
                c0315a2.e();
                HashMap hashMap = (HashMap) c0315a2.f3505b;
                Iterator it4 = new HashSet(hashMap.keySet()).iterator();
                while (it4.hasNext()) {
                    Class cls = (Class) it4.next();
                    y1.b bVar = (y1.b) hashMap.get(cls);
                    if (bVar != null) {
                        N1.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (bVar instanceof InterfaceC0508a) {
                                if (c0315a2.f()) {
                                    ((InterfaceC0508a) bVar).onDetachedFromActivity();
                                }
                                ((HashMap) c0315a2.f3509f).remove(cls);
                            }
                            bVar.onDetachedFromEngine((C0500a) c0315a2.f3508e);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                io.flutter.plugin.platform.s sVar = c0467c2.f4497s;
                SparseArray sparseArray = sVar.f3237v;
                while (sparseArray.size() > 0) {
                    sVar.f3227G.p(sparseArray.keyAt(0));
                }
                io.flutter.plugin.platform.r rVar = c0467c2.f4498t;
                SparseArray sparseArray2 = rVar.f3215s;
                while (sparseArray2.size() > 0) {
                    rVar.f3207A.p(sparseArray2.keyAt(0));
                }
                c0467c2.f4482c.f4550k.setPlatformMessageHandler(null);
                flutterJNI.removeEngineLifecycleListener(c0467c2.x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                A0.j.E().getClass();
                C0467c.f4479z.remove(Long.valueOf(c0467c2.f4500w));
                if (this.f4353a.e() != null) {
                    if (s1.i.f4527c == null) {
                        s1.i.f4527c = new s1.i(1);
                    }
                    s1.i iVar = s1.i.f4527c;
                    iVar.f4528a.remove(this.f4353a.e());
                }
                this.f4354b = null;
            }
            this.f4362j = false;
        }
    }
}
