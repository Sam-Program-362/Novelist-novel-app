package H0;

import Y0.n;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class f extends Y0.h implements j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i3) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 0);
        this.f437b = i3;
        this.f438c = gVar;
    }

    @Override // H0.j
    public void a(Status status) {
        switch (this.f437b) {
            case 0:
                this.f438c.P(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // H0.j
    public void f(Status status) {
        switch (this.f437b) {
            case 1:
                this.f438c.P(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // Y0.h
    public final boolean m(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 101:
                n.c(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) n.a(parcel, Status.CREATOR);
                n.c(parcel);
                a(status);
                break;
            case 103:
                Status status2 = (Status) n.a(parcel, Status.CREATOR);
                n.c(parcel);
                f(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
