package com.google.android.gms.auth.api.signin.internal;

import F0.l;
import H2.h;
import M0.r;
import N0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new l(15);

    /* renamed from: k, reason: collision with root package name */
    public final String f2704k;

    /* renamed from: l, reason: collision with root package name */
    public final GoogleSignInOptions f2705l;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        r.d(str);
        this.f2704k = str;
        this.f2705l = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        String str = signInConfiguration.f2704k;
        GoogleSignInOptions googleSignInOptions = signInConfiguration.f2705l;
        if (this.f2704k.equals(str)) {
            GoogleSignInOptions googleSignInOptions2 = this.f2705l;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = 1 * 31;
        String str = this.f2704k;
        int hashCode = (i3 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f2705l;
        return hashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = h.Q(parcel, 20293);
        h.K(parcel, 2, this.f2704k);
        h.J(parcel, 5, this.f2705l, i3);
        h.R(parcel, Q2);
    }
}
