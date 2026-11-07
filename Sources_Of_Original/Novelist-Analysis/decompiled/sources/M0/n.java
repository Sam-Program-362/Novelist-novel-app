package M0;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class n extends N0.a {
    public static final Parcelable.Creator<n> CREATOR = new F0.l(20);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Account f973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f974m;
    public final GoogleSignInAccount n;

    public n(int i3, Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this.f972k = i3;
        this.f973l = account;
        this.f974m = i4;
        this.n = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f972k);
        H2.h.J(parcel, 2, this.f973l, i3);
        H2.h.P(parcel, 3, 4);
        parcel.writeInt(this.f974m);
        H2.h.J(parcel, 4, this.n, i3);
        H2.h.R(parcel, iQ);
    }
}
