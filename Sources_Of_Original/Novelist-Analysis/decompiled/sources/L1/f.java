package L1;

import android.app.Activity;
import android.util.Log;
import p031k.u0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements p067y1.b, p070z1.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public A0.j f875k;

    @Override // p070z1.a
    public final void onAttachedToActivity(p070z1.b bVar) {
        A0.j jVar = this.f875k;
        if (jVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            jVar.n = (Activity) ((u0) bVar).f3794a;
        }
    }

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        A0.j jVar = new A0.j(aVar.f4728a);
        this.f875k = jVar;
        d dVar = e.f874g;
        C1.f fVar = aVar.f4730c;
        dVar.getClass();
        d.a(fVar, jVar);
    }

    @Override // p070z1.a
    public final void onDetachedFromActivity() {
        A0.j jVar = this.f875k;
        if (jVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            jVar.n = null;
        }
    }

    @Override // p070z1.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
        if (this.f875k == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        d dVar = e.f874g;
        C1.f fVar = aVar.f4730c;
        dVar.getClass();
        d.a(fVar, null);
        this.f875k = null;
    }

    @Override // p070z1.a
    public final void onReattachedToActivityForConfigChanges(p070z1.b bVar) {
        onAttachedToActivity(bVar);
    }
}
