package H0;

import K0.l;
import K0.n;
import M0.r;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public final class g extends BasePendingResult {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f439m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, int i3) {
        super(lVar);
        this.f439m = i3;
        r.g(lVar, "GoogleApiClient must not be null");
        r.g(E0.a.f285a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ n M(Status status) {
        int i3 = this.f439m;
        return status;
    }

    public final void Q(K0.c cVar) {
        switch (this.f439m) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.q();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.y;
                Parcel parcelD = kVar.d();
                int i3 = Y0.n.f1605a;
                parcelD.writeStrongBinder(fVar);
                Y0.n.b(parcelD, googleSignInOptions);
                kVar.e(parcelD, 102);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.q();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.y;
                Parcel parcelD2 = kVar2.d();
                int i4 = Y0.n.f1605a;
                parcelD2.writeStrongBinder(fVar2);
                Y0.n.b(parcelD2, googleSignInOptions2);
                kVar2.e(parcelD2, 103);
                break;
        }
    }

    public final void R(Status status) {
        r.a("Failed result must not be success", !status.b());
        P(M(status));
    }
}
