package M;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f882k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H.d f883l;

    public /* synthetic */ b(H.d dVar, int i3) {
        this.f882k = i3;
        this.f883l = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f882k) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(this.f883l);
                break;
            case 1:
                this.f883l.onResult(null);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(this.f883l);
                break;
            case 3:
                this.f883l.onResult(null);
                break;
            case 4:
                this.f883l.onResult(null);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(this.f883l);
                break;
            case 6:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(this.f883l);
                break;
            case 7:
                this.f883l.b(new I.e("No provider data returned."));
                break;
            default:
                this.f883l.b(new I.e("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
        }
    }
}
