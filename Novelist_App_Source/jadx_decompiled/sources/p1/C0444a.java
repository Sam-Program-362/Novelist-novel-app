package p1;

import B1.s;
import M1.A;
import y1.C0500a;
import y1.b;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0444a implements b {

    /* renamed from: k, reason: collision with root package name */
    public s f4239k;

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        s sVar = new s(c0500a.f4730c, "sqlite3_flutter_libs");
        this.f4239k = sVar;
        sVar.z(new A(28));
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        s sVar = this.f4239k;
        if (sVar != null) {
            sVar.z(null);
            this.f4239k = null;
        }
    }
}
