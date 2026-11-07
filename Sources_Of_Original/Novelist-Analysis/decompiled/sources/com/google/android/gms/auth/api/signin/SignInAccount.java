package com.google.android.gms.auth.api.signin;

import G0.d;
import H2.h;
import M0.r;
import N0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new d(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final GoogleSignInAccount f2702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2703m;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f2702l = googleSignInAccount;
        r.e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f2701k = str;
        r.e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f2703m = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = h.Q(parcel, 20293);
        h.K(parcel, 4, this.f2701k);
        h.J(parcel, 7, this.f2702l, i3);
        h.K(parcel, 8, this.f2703m);
        h.R(parcel, iQ);
    }
}
