package o1;

import B1.s;
import M1.O;
import a2.h;
import android.app.Activity;
import android.content.Context;
import b1.C0192Q;
import java.util.concurrent.atomic.AtomicBoolean;
import k.u0;
import y1.C0500a;
import z1.InterfaceC0508a;
import z1.InterfaceC0509b;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441a implements y1.b, InterfaceC0508a {

    /* renamed from: k, reason: collision with root package name */
    public O f4213k;

    /* renamed from: l, reason: collision with root package name */
    public C0442b f4214l;

    /* renamed from: m, reason: collision with root package name */
    public s f4215m;

    @Override // z1.InterfaceC0508a
    public final void onAttachedToActivity(InterfaceC0509b interfaceC0509b) {
        h.e(interfaceC0509b, "binding");
        C0442b c0442b = this.f4214l;
        if (c0442b == null) {
            h.g("manager");
            throw null;
        }
        u0 u0Var = (u0) interfaceC0509b;
        u0Var.a(c0442b);
        O o2 = this.f4213k;
        if (o2 != null) {
            o2.f1031b = (Activity) u0Var.f3794a;
        } else {
            h.g("share");
            throw null;
        }
    }

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        h.e(c0500a, "binding");
        this.f4215m = new s(c0500a.f4730c, "dev.fluttercommunity.plus/share");
        Context context = c0500a.f4728a;
        h.d(context, "getApplicationContext(...)");
        C0442b c0442b = new C0442b();
        c0442b.f4217l = new AtomicBoolean(true);
        this.f4214l = c0442b;
        O o2 = new O(context, c0442b);
        this.f4213k = o2;
        C0442b c0442b2 = this.f4214l;
        if (c0442b2 == null) {
            h.g("manager");
            throw null;
        }
        C0192Q c0192q = new C0192Q(o2, c0442b2);
        s sVar = this.f4215m;
        if (sVar != null) {
            sVar.z(c0192q);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivity() {
        O o2 = this.f4213k;
        if (o2 != null) {
            o2.f1031b = null;
        } else {
            h.g("share");
            throw null;
        }
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        h.e(c0500a, "binding");
        s sVar = this.f4215m;
        if (sVar != null) {
            sVar.z(null);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }

    @Override // z1.InterfaceC0508a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0509b interfaceC0509b) {
        h.e(interfaceC0509b, "binding");
        onAttachedToActivity(interfaceC0509b);
    }
}
