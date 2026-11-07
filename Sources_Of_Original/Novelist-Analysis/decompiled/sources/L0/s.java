package L0;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public final class s extends K0.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K0.i f844b;

    public s(K0.i iVar) {
        this.f844b = iVar;
    }

    public final H0.g a(H0.g gVar) {
        boolean z3 = true;
        if (!gVar.f2738k && !((Boolean) BasePendingResult.f2729l.get()).booleanValue()) {
            z3 = false;
        }
        gVar.f2738k = z3;
        K0.i iVar = this.f844b;
        C0044d c0044d = iVar.f654j;
        c0044d.getClass();
        x xVar = new x(new z(gVar), c0044d.f808i.get(), iVar);
        Z0.d dVar = c0044d.f812m;
        dVar.sendMessage(dVar.obtainMessage(4, xVar));
        return gVar;
    }
}
