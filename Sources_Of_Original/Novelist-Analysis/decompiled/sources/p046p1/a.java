package p046p1;

import B1.s;
import M1.A;
import p067y1.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s f4239k;

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        s sVar = new s(aVar.f4730c, "sqlite3_flutter_libs");
        this.f4239k = sVar;
        sVar.z(new A(28));
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
        s sVar = this.f4239k;
        if (sVar != null) {
            sVar.z(null);
            this.f4239k = null;
        }
    }
}
