package L1;

import android.app.Activity;
import android.util.Log;
import k.u0;
import y1.C0500a;
import z1.InterfaceC0508a;
import z1.InterfaceC0509b;

/* loaded from: classes.dex */
public final class f implements y1.b, InterfaceC0508a {

    /* renamed from: k, reason: collision with root package name */
    public A0.j f875k;

    @Override // z1.InterfaceC0508a
    public final void onAttachedToActivity(InterfaceC0509b interfaceC0509b) {
        A0.j jVar = this.f875k;
        if (jVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            jVar.n = (Activity) ((u0) interfaceC0509b).f3794a;
        }
    }

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        A0.j jVar = new A0.j(c0500a.f4728a);
        this.f875k = jVar;
        d dVar = e.f874g;
        C1.f fVar = c0500a.f4730c;
        dVar.getClass();
        d.a(fVar, jVar);
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivity() {
        A0.j jVar = this.f875k;
        if (jVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            jVar.n = null;
        }
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        if (this.f875k == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        d dVar = e.f874g;
        C1.f fVar = c0500a.f4730c;
        dVar.getClass();
        d.a(fVar, null);
        this.f875k = null;
    }

    @Override // z1.InterfaceC0508a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0509b interfaceC0509b) {
        onAttachedToActivity(interfaceC0509b);
    }
}
