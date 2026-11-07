package I1;

import D.C0002c;
import android.app.Activity;
import java.util.HashSet;
import p031k.u0;

/* JADX INFO: loaded from: classes.dex */
public class t implements p067y1.b, p070z1.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s f518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1.f f519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p070z1.b f520m;

    @Override // p070z1.a
    public final void onAttachedToActivity(p070z1.b bVar) {
        this.f520m = bVar;
        u0 u0Var = (u0) bVar;
        u0Var.a(this.f518k);
        this.f518k.f516o = (Activity) u0Var.f3794a;
    }

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        C1.f fVar = aVar.f4730c;
        s sVar = new s(aVar.f4728a, new C0002c(2), new C0002c(3), new C0002c(4));
        this.f519l = fVar;
        this.f518k = sVar;
        o.f507b.getClass();
        n.b(fVar, sVar);
    }

    @Override // p070z1.a
    public final void onDetachedFromActivity() {
        p070z1.b bVar = this.f520m;
        ((HashSet) ((u0) bVar).f3797d).remove(this.f518k);
        this.f518k.f516o = null;
        this.f520m = null;
    }

    @Override // p070z1.a
    public final void onDetachedFromActivityForConfigChanges() {
        p070z1.b bVar = this.f520m;
        ((HashSet) ((u0) bVar).f3797d).remove(this.f518k);
        this.f518k.f516o = null;
        this.f520m = null;
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
        this.f518k = null;
        C1.f fVar = this.f519l;
        if (fVar != null) {
            o.f507b.getClass();
            n.b(fVar, null);
            this.f519l = null;
        }
    }

    @Override // p070z1.a
    public final void onReattachedToActivityForConfigChanges(p070z1.b bVar) {
        this.f520m = bVar;
        u0 u0Var = (u0) bVar;
        u0Var.a(this.f518k);
        this.f518k.f516o = (Activity) u0Var.f3794a;
    }
}
