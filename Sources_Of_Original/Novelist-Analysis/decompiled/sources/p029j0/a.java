package p029j0;

import J1.i;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.u;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p004b1.Q;
import p031k.u0;
import p052r1.AbstractActivityC0262b;
import p054s1.c;
import p054s1.e;
import p067y1.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Serializable f3509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f3510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f3511h;

    public a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        byte[] bArr;
        this.f3504a = false;
        this.f3505b = executor;
        this.f3506c = dVar;
        this.f3510g = str;
        this.f3509f = file;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31) {
            switch (i3) {
                case 24:
                case 25:
                    bArr = e.f3528h;
                    break;
                case 26:
                    bArr = e.f3527g;
                    break;
                case 27:
                    bArr = e.f3526f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f3525e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = e.f3524d;
        }
        this.f3507d = bArr;
    }

    public void a(b bVar) {
        HashMap map = (HashMap) this.f3505b;
        N1.a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            if (map.containsKey(bVar.getClass())) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((c) this.f3506c) + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            map.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((p067y1.a) this.f3508e);
            if (bVar instanceof p070z1.a) {
                p070z1.a aVar = (p070z1.a) bVar;
                ((HashMap) this.f3509f).put(bVar.getClass(), aVar);
                if (f()) {
                    aVar.onAttachedToActivity((u0) this.f3511h);
                }
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
    }

    public void b(AbstractActivityC0262b abstractActivityC0262b, u uVar) {
        u0 u0Var = new u0();
        u0Var.f3796c = new HashSet();
        u0Var.f3797d = new HashSet();
        u0Var.f3798e = new HashSet();
        u0Var.f3799f = new HashSet();
        new HashSet();
        u0Var.f3800g = new HashSet();
        u0Var.f3794a = abstractActivityC0262b;
        u0Var.f3795b = new HiddenLifecycleReference(uVar);
        this.f3511h = u0Var;
        Intent intent = abstractActivityC0262b.getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false;
        if (booleanExtra) {
            String str = e.f4511h.f4502b;
        } else {
            booleanExtra = ((p063w1.c) this.f3507d).f4662a;
        }
        c cVar = (c) this.f3506c;
        cVar.f4497s.f3226F = booleanExtra;
        Q q3 = cVar.u;
        k kVar = cVar.f4481b;
        p057t1.c cVar2 = cVar.f4482c;
        s sVar = (s) q3.f2599l;
        if (sVar.f3230m != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        sVar.f3230m = abstractActivityC0262b;
        sVar.f3232p = kVar;
        sVar.f3234r = new A.c(cVar2, 5);
        r rVar = (r) q3.f2600m;
        if (rVar.f3210m != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        rVar.f3210m = abstractActivityC0262b;
        A.c cVar3 = new A.c(cVar2, 4);
        rVar.f3213q = cVar3;
        cVar3.f7m = rVar.f3207A;
        sVar.f3234r.f7m = q3;
        for (p070z1.a aVar : ((HashMap) this.f3509f).values()) {
            if (this.f3504a) {
                aVar.onReattachedToActivityForConfigChanges((u0) this.f3511h);
            } else {
                aVar.onAttachedToActivity((u0) this.f3511h);
            }
        }
        this.f3504a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        N1.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it2 = ((HashMap) this.f3509f).values().iterator();
            while (it2.hasNext()) {
                ((p070z1.a) it2.next()).onDetachedFromActivity();
            }
            d();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void d() {
        c cVar = (c) this.f3506c;
        s sVar = cVar.f4497s;
        A.c cVar2 = sVar.f3234r;
        if (cVar2 != null) {
            cVar2.f7m = null;
        }
        sVar.d();
        sVar.f3234r = null;
        sVar.f3230m = null;
        sVar.f3232p = null;
        r rVar = cVar.f4498t;
        A.c cVar3 = rVar.f3213q;
        if (cVar3 != null) {
            cVar3.f7m = null;
        }
        Surface surface = rVar.x;
        if (surface != null) {
            surface.release();
            rVar.x = null;
            rVar.y = null;
        }
        rVar.f3213q = null;
        rVar.f3210m = null;
        this.f3510g = null;
        this.f3511h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((p052r1.e) this.f3510g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((d) this.f3506c).c();
            return null;
        }
    }

    public void h(int i3, Serializable serializable) {
        ((Executor) this.f3505b).execute(new i(this, i3, serializable, 5));
    }

    public a(Context context, c cVar, p063w1.c cVar2) {
        this.f3505b = new HashMap();
        this.f3509f = new HashMap();
        this.f3504a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f3506c = cVar;
        this.f3507d = cVar2;
        this.f3508e = new p067y1.a(context, cVar, cVar.f4482c, cVar.f4497s.f3228k, new H0.i(cVar2, 28));
    }
}
