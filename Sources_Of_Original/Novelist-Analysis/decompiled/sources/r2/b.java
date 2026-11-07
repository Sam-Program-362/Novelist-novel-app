package r2;

import A0.j;
import B1.s;
import C1.f;
import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class b implements p067y1.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s f4436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f4437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s f4438m;

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        Context context = aVar.f4728a;
        s sVar = new s();
        sVar.f144k = context;
        sVar.f145l = (ClipboardManager) context.getSystemService("clipboard");
        this.f4438m = sVar;
        f fVar = aVar.f4730c;
        s sVar2 = new s(fVar, "net.cubiclab.clipboard/methods");
        this.f4436k = sVar2;
        sVar2.z(this.f4438m);
        j jVar = new j(fVar, "net.cubiclab.clipboard/events");
        this.f4437l = jVar;
        jVar.L(this.f4438m);
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
        this.f4436k.z(null);
        this.f4437l.L(null);
        this.f4438m = null;
    }
}
