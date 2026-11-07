package j1;

import A0.j;
import B1.s;
import C1.m;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.AbstractC0142n;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashSet;
import k.u0;
import y1.C0500a;
import z1.InterfaceC0508a;
import z1.InterfaceC0509b;

/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331e implements m, y1.b, InterfaceC0508a {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0509b f3561k;

    /* renamed from: l, reason: collision with root package name */
    public C0329c f3562l;

    /* renamed from: m, reason: collision with root package name */
    public Application f3563m;
    public C0500a n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0142n f3564o;

    /* renamed from: p, reason: collision with root package name */
    public C0330d f3565p;

    /* renamed from: q, reason: collision with root package name */
    public Activity f3566q;

    /* renamed from: r, reason: collision with root package name */
    public s f3567r;

    /* JADX WARN: Removed duplicated region for block: B:82:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d A[Catch: all -> 0x0184, TryCatch #1 {all -> 0x0184, blocks: (B:74:0x0146, B:76:0x014d, B:79:0x0154, B:80:0x0173, B:83:0x0180, B:85:0x017d, B:86:0x016f), top: B:73:0x0146 }] */
    @Override // C1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(A.c r11, B1.o r12) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C0331e.k(A.c, B1.o):void");
    }

    @Override // z1.InterfaceC0508a
    public final void onAttachedToActivity(InterfaceC0509b interfaceC0509b) {
        a2.h.e(interfaceC0509b, "binding");
        this.f3561k = interfaceC0509b;
        C0500a c0500a = this.n;
        if (c0500a != null) {
            C1.f fVar = c0500a.f4730c;
            a2.h.d(fVar, "getBinaryMessenger(...)");
            Context context = c0500a.f4728a;
            a2.h.c(context, "null cannot be cast to non-null type android.app.Application");
            InterfaceC0509b interfaceC0509b2 = this.f3561k;
            a2.h.b(interfaceC0509b2);
            Activity activity = (Activity) ((u0) interfaceC0509b2).f3794a;
            a2.h.d(activity, "getActivity(...)");
            InterfaceC0509b interfaceC0509b3 = this.f3561k;
            a2.h.b(interfaceC0509b3);
            this.f3566q = activity;
            this.f3563m = (Application) context;
            this.f3562l = new C0329c(activity);
            s sVar = new s(fVar, "miguelruivo.flutter.plugins.filepicker");
            this.f3567r = sVar;
            sVar.z(this);
            C0329c c0329c = this.f3562l;
            if (c0329c != null) {
                new j(fVar, "miguelruivo.flutter.plugins.filepickerevent").L(new B1.g(c0329c, 14));
                this.f3565p = new C0330d(activity);
                u0 u0Var = (u0) interfaceC0509b3;
                u0Var.a(c0329c);
                AbstractC0142n lifecycle = ((HiddenLifecycleReference) u0Var.f3795b).getLifecycle();
                this.f3564o = lifecycle;
                C0330d c0330d = this.f3565p;
                if (c0330d == null || lifecycle == null) {
                    return;
                }
                lifecycle.a(c0330d);
            }
        }
    }

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        a2.h.e(c0500a, "binding");
        this.n = c0500a;
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivity() {
        InterfaceC0509b interfaceC0509b;
        C0329c c0329c = this.f3562l;
        if (c0329c != null && (interfaceC0509b = this.f3561k) != null) {
            ((HashSet) ((u0) interfaceC0509b).f3797d).remove(c0329c);
        }
        this.f3561k = null;
        C0330d c0330d = this.f3565p;
        if (c0330d != null) {
            AbstractC0142n abstractC0142n = this.f3564o;
            if (abstractC0142n != null) {
                abstractC0142n.b(c0330d);
            }
            Application application = this.f3563m;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(c0330d);
            }
        }
        this.f3564o = null;
        C0329c c0329c2 = this.f3562l;
        if (c0329c2 != null) {
            c0329c2.f3558r = null;
        }
        this.f3562l = null;
        s sVar = this.f3567r;
        if (sVar != null) {
            sVar.z(null);
        }
        this.f3567r = null;
        this.f3563m = null;
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        a2.h.e(c0500a, "binding");
        this.n = null;
    }

    @Override // z1.InterfaceC0508a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0509b interfaceC0509b) {
        a2.h.e(interfaceC0509b, "binding");
        onAttachedToActivity(interfaceC0509b);
    }
}
