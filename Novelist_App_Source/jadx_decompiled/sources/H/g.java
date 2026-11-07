package H;

import D.f0;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;

/* loaded from: classes.dex */
public final class g implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f409a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f410b;

    public g(A.c cVar, h hVar) {
        this.f410b = cVar;
    }

    public final void onError(Throwable th) {
        String type;
        String message;
        switch (this.f409a) {
            case 0:
                a2.h.e(f0.d(th), "error");
                Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
                ((B1.a) this.f410b).b(new I.a(null));
                break;
            default:
                GetCredentialException l3 = f0.l(th);
                a2.h.e(l3, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                A.c cVar = (A.c) this.f410b;
                type = l3.getType();
                a2.h.d(type, "getType(...)");
                message = l3.getMessage();
                cVar.b(E2.a.U(message, type));
                break;
        }
    }

    public final void onResult(Object obj) {
        Credential credential;
        String type;
        Bundle data;
        switch (this.f409a) {
            case 0:
                Log.i("CredManProvService", "Clear result returned from framework: ");
                ((B1.a) this.f410b).onResult((Void) obj);
                break;
            default:
                GetCredentialResponse o2 = f0.o(obj);
                a2.h.e(o2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                A.c cVar = (A.c) this.f410b;
                credential = o2.getCredential();
                a2.h.d(credential, "getCredential(...)");
                type = credential.getType();
                a2.h.d(type, "getType(...)");
                data = credential.getData();
                a2.h.d(data, "getData(...)");
                cVar.onResult(new l(H2.h.j(type, data)));
                break;
        }
    }

    public g(B1.a aVar) {
        this.f410b = aVar;
    }
}
