package L0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class B extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p019g1.e f785b;

    public B(p019g1.e eVar) {
        super(4);
        this.f785b = eVar;
    }

    @Override // L0.C
    public final void a(Status status) {
        this.f785b.c(new K0.e(status));
    }

    @Override // L0.C
    public final void b(Exception exc) {
        this.f785b.c(exc);
    }

    @Override // L0.C
    public final void c(p pVar) throws DeadObjectException {
        try {
            h(pVar);
        } catch (DeadObjectException e3) {
            a(C.e(e3));
            throw e3;
        } catch (RemoteException e4) {
            a(C.e(e4));
        } catch (RuntimeException e5) {
            this.f785b.c(e5);
        }
    }

    @Override // L0.u
    public final boolean f(p pVar) {
        if (pVar.f828f.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // L0.u
    public final J0.c[] g(p pVar) {
        if (pVar.f828f.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public final void h(p pVar) {
        if (pVar.f828f.remove(null) != null) {
            throw new ClassCastException();
        }
        p019g1.e eVar = this.f785b;
        Boolean bool = Boolean.FALSE;
        p019g1.i iVar = eVar.f2835a;
        synchronized (iVar.f2845b) {
            try {
                if (iVar.f2844a) {
                    return;
                }
                iVar.f2844a = true;
                iVar.f2846c = bool;
                ((p019g1.h) iVar.f2847d).f(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L0.C
    public final /* bridge */ /* synthetic */ void d(A.c cVar, boolean z3) {
    }
}
