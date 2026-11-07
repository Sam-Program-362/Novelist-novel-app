package L0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H0.g f866b;

    public z(H0.g gVar) {
        super(1);
        this.f866b = gVar;
    }

    @Override // L0.C
    public final void a(Status status) {
        try {
            this.f866b.R(status);
        } catch (IllegalStateException e3) {
            Log.w("ApiCallRunner", "Exception reporting failure", e3);
        }
    }

    @Override // L0.C
    public final void b(Exception exc) {
        try {
            this.f866b.R(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage(), null, null));
        } catch (IllegalStateException e3) {
            Log.w("ApiCallRunner", "Exception reporting failure", e3);
        }
    }

    @Override // L0.C
    public final void c(p pVar) throws DeadObjectException {
        try {
            H0.g gVar = this.f866b;
            K0.c cVar = pVar.f824b;
            gVar.getClass();
            try {
                gVar.Q(cVar);
            } catch (DeadObjectException e3) {
                gVar.R(new Status(8, e3.getLocalizedMessage(), null, null));
                throw e3;
            } catch (RemoteException e4) {
                gVar.R(new Status(8, e4.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e5) {
            b(e5);
        }
    }

    @Override // L0.C
    public final void d(A.c cVar, boolean z3) {
        Boolean boolValueOf = Boolean.valueOf(z3);
        Map map = (Map) cVar.f6l;
        H0.g gVar = this.f866b;
        map.put(gVar, boolValueOf);
        gVar.L(new l(cVar, gVar));
    }
}
