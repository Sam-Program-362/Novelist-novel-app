package p044o1;

import B1.s;
import M1.O;
import a2.h;
import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import p004b1.Q;
import p031k.u0;
import p067y1.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, p070z1.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public O f4213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f4214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s f4215m;

    @Override // p070z1.a
    public final void onAttachedToActivity(p070z1.b bVar) {
        h.e(bVar, "binding");
        b bVar2 = this.f4214l;
        if (bVar2 == null) {
            h.g("manager");
            throw null;
        }
        u0 u0Var = (u0) bVar;
        u0Var.a(bVar2);
        O o2 = this.f4213k;
        if (o2 != null) {
            o2.f1031b = (Activity) u0Var.f3794a;
        } else {
            h.g("share");
            throw null;
        }
    }

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        h.e(aVar, "binding");
        this.f4215m = new s(aVar.f4730c, "dev.fluttercommunity.plus/share");
        Context context = aVar.f4728a;
        h.d(context, "getApplicationContext(...)");
        b bVar = new b();
        bVar.f4217l = new AtomicBoolean(true);
        this.f4214l = bVar;
        O o2 = new O(context, bVar);
        this.f4213k = o2;
        b bVar2 = this.f4214l;
        if (bVar2 == null) {
            h.g("manager");
            throw null;
        }
        Q q3 = new Q(o2, bVar2);
        s sVar = this.f4215m;
        if (sVar != null) {
            sVar.z(q3);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }

    @Override // p070z1.a
    public final void onDetachedFromActivity() {
        O o2 = this.f4213k;
        if (o2 != null) {
            o2.f1031b = null;
        } else {
            h.g("share");
            throw null;
        }
    }

    @Override // p070z1.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
        h.e(aVar, "binding");
        s sVar = this.f4215m;
        if (sVar != null) {
            sVar.z(null);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }

    @Override // p070z1.a
    public final void onReattachedToActivityForConfigChanges(p070z1.b bVar) {
        h.e(bVar, "binding");
        onAttachedToActivity(bVar);
    }
}
