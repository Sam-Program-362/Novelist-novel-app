package H;

import D.f0;
import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CredentialManager f411a;

    public h(Context context) {
        a2.h.e(context, "context");
        this.f411a = f0.g(context.getSystemService("credential"));
    }

    @Override // H.e
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f411a != null;
    }

    @Override // H.e
    public final void onClearCredential(a aVar, CancellationSignal cancellationSignal, Executor executor, d dVar) {
        Log.i("CredManProvService", "In CredentialProviderFrameworkImpl onClearCredential");
        B1.a aVar2 = (B1.a) dVar;
        CredentialManager credentialManager = this.f411a;
        if (credentialManager == null) {
            aVar2.b(new I.a("Your device doesn't support credential manager", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION"));
            return;
        }
        g gVar = new g(aVar2);
        a2.h.b(credentialManager);
        f0.s();
        credentialManager.clearCredentialState(f0.e(new Bundle()), null, (ExecutorService) executor, gVar);
    }

    @Override // H.e
    public final void onGetCredential(Context context, k kVar, CancellationSignal cancellationSignal, Executor executor, d dVar) {
        GetCredentialRequest build;
        CredentialOption.Builder isSystemProviderRequired;
        CredentialOption.Builder allowedProviders;
        CredentialOption build2;
        a2.h.e(context, "context");
        a2.h.e(executor, "executor");
        A.c cVar = (A.c) dVar;
        CredentialManager credentialManager = this.f411a;
        if (credentialManager == null) {
            cVar.b(new I.i("Your device doesn't support credential manager"));
            return;
        }
        g gVar = new g(cVar, this);
        a2.h.b(credentialManager);
        f0.z();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder m3 = f0.m(bundle);
        for (m mVar : kVar.f412a) {
            f0.B();
            mVar.getClass();
            isSystemProviderRequired = f0.j(mVar.f414a, mVar.f415b).setIsSystemProviderRequired(true);
            allowedProviders = isSystemProviderRequired.setAllowedProviders(mVar.f416c);
            build2 = allowedProviders.build();
            m3.addCredentialOption(build2);
        }
        build = m3.build();
        a2.h.d(build, "build(...)");
        credentialManager.getCredential(context, build, (CancellationSignal) null, executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) gVar);
    }
}
