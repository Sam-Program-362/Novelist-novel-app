package j0;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.u;
import b1.C0192Q;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
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
import k.u0;
import r1.AbstractActivityC0455b;
import r1.C0458e;
import s1.C0467c;
import t1.C0475c;
import y1.C0500a;
import z1.InterfaceC0508a;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3504a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3505b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3506c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3507d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3508e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f3509f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3510g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3511h;

    public C0315a(AssetManager assetManager, Executor executor, InterfaceC0318d interfaceC0318d, String str, File file) {
        byte[] bArr;
        this.f3504a = false;
        this.f3505b = executor;
        this.f3506c = interfaceC0318d;
        this.f3510g = str;
        this.f3509f = file;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31) {
            switch (i3) {
                case 24:
                case 25:
                    bArr = AbstractC0319e.f3528h;
                    break;
                case 26:
                    bArr = AbstractC0319e.f3527g;
                    break;
                case 27:
                    bArr = AbstractC0319e.f3526f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0319e.f3525e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC0319e.f3524d;
        }
        this.f3507d = bArr;
    }

    public void a(y1.b bVar) {
        HashMap hashMap = (HashMap) this.f3505b;
        N1.a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            if (hashMap.containsKey(bVar.getClass())) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((C0467c) this.f3506c) + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            hashMap.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((C0500a) this.f3508e);
            if (bVar instanceof InterfaceC0508a) {
                InterfaceC0508a interfaceC0508a = (InterfaceC0508a) bVar;
                ((HashMap) this.f3509f).put(bVar.getClass(), interfaceC0508a);
                if (f()) {
                    interfaceC0508a.onAttachedToActivity((u0) this.f3511h);
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

    public void b(AbstractActivityC0455b abstractActivityC0455b, u uVar) {
        u0 u0Var = new u0();
        u0Var.f3796c = new HashSet();
        u0Var.f3797d = new HashSet();
        u0Var.f3798e = new HashSet();
        u0Var.f3799f = new HashSet();
        new HashSet();
        u0Var.f3800g = new HashSet();
        u0Var.f3794a = abstractActivityC0455b;
        u0Var.f3795b = new HiddenLifecycleReference(uVar);
        this.f3511h = u0Var;
        Intent intent = abstractActivityC0455b.getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false;
        if (booleanExtra) {
            String str = s1.e.f4511h.f4502b;
        } else {
            booleanExtra = ((w1.c) this.f3507d).f4662a;
        }
        C0467c c0467c = (C0467c) this.f3506c;
        c0467c.f4497s.f3226F = booleanExtra;
        C0192Q c0192q = c0467c.u;
        io.flutter.embedding.engine.renderer.k kVar = c0467c.f4481b;
        C0475c c0475c = c0467c.f4482c;
        s sVar = (s) c0192q.f2599l;
        if (sVar.f3230m != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        sVar.f3230m = abstractActivityC0455b;
        sVar.f3232p = kVar;
        sVar.f3234r = new A.c(c0475c, 5);
        r rVar = (r) c0192q.f2600m;
        if (rVar.f3210m != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        rVar.f3210m = abstractActivityC0455b;
        A.c cVar = new A.c(c0475c, 4);
        rVar.f3213q = cVar;
        cVar.f7m = rVar.f3207A;
        sVar.f3234r.f7m = c0192q;
        for (InterfaceC0508a interfaceC0508a : ((HashMap) this.f3509f).values()) {
            if (this.f3504a) {
                interfaceC0508a.onReattachedToActivityForConfigChanges((u0) this.f3511h);
            } else {
                interfaceC0508a.onAttachedToActivity((u0) this.f3511h);
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
                ((InterfaceC0508a) it2.next()).onDetachedFromActivity();
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
        C0467c c0467c = (C0467c) this.f3506c;
        s sVar = c0467c.f4497s;
        A.c cVar = sVar.f3234r;
        if (cVar != null) {
            cVar.f7m = null;
        }
        sVar.d();
        sVar.f3234r = null;
        sVar.f3230m = null;
        sVar.f3232p = null;
        r rVar = c0467c.f4498t;
        A.c cVar2 = rVar.f3213q;
        if (cVar2 != null) {
            cVar2.f7m = null;
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
        return ((C0458e) this.f3510g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((InterfaceC0318d) this.f3506c).c();
            return null;
        }
    }

    public void h(int i3, Serializable serializable) {
        ((Executor) this.f3505b).execute(new J1.i(this, i3, serializable, 5));
    }

    public C0315a(Context context, C0467c c0467c, w1.c cVar) {
        this.f3505b = new HashMap();
        this.f3509f = new HashMap();
        this.f3504a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f3506c = c0467c;
        this.f3507d = cVar;
        this.f3508e = new C0500a(context, c0467c, c0467c.f4482c, c0467c.f4497s.f3228k, new H0.i(cVar, 28));
    }
}
