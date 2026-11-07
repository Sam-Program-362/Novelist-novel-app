package D;

import android.credentials.ClearCredentialStateException;
import android.credentials.ClearCredentialStateRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f0 {
    public static /* synthetic */ void B() {
    }

    public static /* bridge */ /* synthetic */ ClearCredentialStateException d(Throwable th) {
        return (ClearCredentialStateException) th;
    }

    public static /* synthetic */ ClearCredentialStateRequest e(Bundle bundle) {
        return new ClearCredentialStateRequest(bundle);
    }

    public static /* bridge */ /* synthetic */ CredentialManager g(Object obj) {
        return (CredentialManager) obj;
    }

    public static /* synthetic */ CredentialOption.Builder j(Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle, bundle2);
    }

    public static /* bridge */ /* synthetic */ GetCredentialException l(Throwable th) {
        return (GetCredentialException) th;
    }

    public static /* synthetic */ GetCredentialRequest.Builder m(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse o(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void z() {
    }
}
