package M;

import H.k;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements g1.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f896k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H.d f897l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Executor f898m;
    public final /* synthetic */ CancellationSignal n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f899o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f900p;

    public /* synthetic */ g(k kVar, R.b bVar, H.d dVar, Executor executor, CancellationSignal cancellationSignal) {
        this.f899o = kVar;
        this.f900p = bVar;
        this.f897l = dVar;
        this.f898m = executor;
        this.n = cancellationSignal;
    }

    @Override // g1.c
    public final void b(Exception exc) {
        switch (this.f896k) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$6((CredentialProviderPlayServicesImpl) this.f899o, (H.a) this.f900p, this.n, this.f898m, this.f897l, exc);
                break;
            default:
                k kVar = (k) this.f899o;
                Context context = ((R.b) this.f900p).f1246d;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                boolean b3 = h.b(kVar);
                H.d dVar = this.f897l;
                Executor executor = this.f898m;
                CancellationSignal cancellationSignal = this.n;
                if (!b3) {
                    Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
                    new O.d(context).e(kVar, cancellationSignal, executor, dVar);
                    break;
                } else {
                    Log.w("GetCredentialController", "Pre-u credman get flow failed for get sign in intent; retrying with gis flow");
                    new Q.b(context).f(kVar, cancellationSignal, executor, dVar);
                    break;
                }
        }
    }

    public /* synthetic */ g(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, H.a aVar, CancellationSignal cancellationSignal, Executor executor, H.d dVar) {
        this.f899o = credentialProviderPlayServicesImpl;
        this.f900p = aVar;
        this.n = cancellationSignal;
        this.f898m = executor;
        this.f897l = dVar;
    }
}
