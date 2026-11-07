package com.google.android.gms.auth.api.identity;

import F0.l;
import H2.h;
import M0.r;
import N0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ClearTokenRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<ClearTokenRequest> CREATOR = new l(5);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2675l;

    public ClearTokenRequest(String str, String str2) {
        this.f2674k = str;
        this.f2675l = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClearTokenRequest) {
            ClearTokenRequest clearTokenRequest = (ClearTokenRequest) obj;
            if (r.i(this.f2674k, clearTokenRequest.f2674k) && r.i(this.f2675l, clearTokenRequest.f2675l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2674k, this.f2675l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = h.Q(parcel, 20293);
        h.K(parcel, 1, this.f2674k);
        h.K(parcel, 2, this.f2675l);
        h.R(parcel, iQ);
    }
}
