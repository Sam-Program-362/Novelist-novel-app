package r2;

import A0.j;
import B1.s;
import C1.f;
import android.content.ClipboardManager;
import android.content.Context;
import y1.C0500a;

/* loaded from: classes.dex */
public class b implements y1.b {

    /* renamed from: k, reason: collision with root package name */
    public s f4436k;

    /* renamed from: l, reason: collision with root package name */
    public j f4437l;

    /* renamed from: m, reason: collision with root package name */
    public s f4438m;

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        Context context = c0500a.f4728a;
        s sVar = new s();
        sVar.f144k = context;
        sVar.f145l = (ClipboardManager) context.getSystemService("clipboard");
        this.f4438m = sVar;
        f fVar = c0500a.f4730c;
        s sVar2 = new s(fVar, "net.cubiclab.clipboard/methods");
        this.f4436k = sVar2;
        sVar2.z(this.f4438m);
        j jVar = new j(fVar, "net.cubiclab.clipboard/events");
        this.f4437l = jVar;
        jVar.L(this.f4438m);
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        this.f4436k.z(null);
        this.f4437l.L(null);
        this.f4438m = null;
    }
}
