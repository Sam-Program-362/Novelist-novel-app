package L0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class A extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p019g1.e f783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B1.b f784d;

    public A(int i3, k kVar, p019g1.e eVar, B1.b bVar) {
        super(i3);
        this.f783c = eVar;
        this.f782b = kVar;
        this.f784d = bVar;
        if (i3 == 2 && kVar.f814b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // L0.C
    public final void a(Status status) {
        this.f784d.getClass();
        this.f783c.c(M0.r.j(status));
    }

    @Override // L0.C
    public final void b(Exception exc) {
        this.f783c.c(exc);
    }

    @Override // L0.C
    public final void c(p pVar) throws DeadObjectException {
        p019g1.e eVar = this.f783c;
        try {
            k kVar = this.f782b;
            ((i) ((k) kVar.f816d).f816d).accept(pVar.f824b, eVar);
        } catch (DeadObjectException e3) {
            throw e3;
        } catch (RemoteException e4) {
            a(C.e(e4));
        } catch (RuntimeException e5) {
            eVar.c(e5);
        }
    }

    @Override // L0.C
    public final void d(A.c cVar, boolean z3) {
        Boolean boolValueOf = Boolean.valueOf(z3);
        Map map = (Map) cVar.f7m;
        p019g1.e eVar = this.f783c;
        map.put(eVar, boolValueOf);
        p019g1.i iVar = eVar.f2835a;
        A.c cVar2 = new A.c(cVar, eVar, 18, false);
        iVar.getClass();
        ((p019g1.h) iVar.f2847d).e(new p019g1.g(p019g1.f.f2836a, cVar2));
        iVar.f();
    }

    @Override // L0.u
    public final boolean f(p pVar) {
        return this.f782b.f814b;
    }

    @Override // L0.u
    public final J0.c[] g(p pVar) {
        return (J0.c[]) this.f782b.f813a;
    }
}
