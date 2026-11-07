package R;

import H.d;
import M.h;
import N.c;
import O1.g;
import Z1.l;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f1243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f1244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Executor f1245m;
    public final /* synthetic */ d n;

    public /* synthetic */ a(CancellationSignal cancellationSignal, b bVar, Executor executor, d dVar) {
        this.f1243k = cancellationSignal;
        this.f1244l = bVar;
        this.f1245m = executor;
        this.n = dVar;
    }

    @Override // Z1.l
    public final Object f(Object obj) {
        b bVar = this.f1244l;
        Context context = bVar.f1246d;
        W0.l lVar = (W0.l) obj;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        CancellationSignal cancellationSignal = this.f1243k;
        if (!h.a(cancellationSignal)) {
            Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
            c.a(bVar.f1250h, intent, "BEGIN_SIGN_IN");
            intent.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.f1549k);
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!h.a(cancellationSignal)) {
                    this.f1245m.execute(new M.b(this.n, 8));
                }
            }
        }
        return g.f1211a;
    }
}
