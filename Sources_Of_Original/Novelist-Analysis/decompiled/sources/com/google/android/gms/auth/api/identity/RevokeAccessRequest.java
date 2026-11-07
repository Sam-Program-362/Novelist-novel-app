package com.google.android.gms.auth.api.identity;

import F0.l;
import H2.h;
import M0.r;
import N0.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RevokeAccessRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new l(11);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Y0.l f2676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Account f2677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2678m;

    /* JADX WARN: Multi-variable type inference failed */
    public RevokeAccessRequest(List list, Account account, String str) {
        this.f2676k = Y0.l.g((AbstractCollection) list);
        this.f2677l = account;
        this.f2678m = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            Y0.l lVar = this.f2676k;
            int size = lVar.size();
            Y0.l lVar2 = revokeAccessRequest.f2676k;
            if (size == lVar2.size() && lVar.containsAll(lVar2) && r.i(this.f2677l, revokeAccessRequest.f2677l) && r.i(this.f2678m, revokeAccessRequest.f2678m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2676k, this.f2677l, this.f2678m});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = h.Q(parcel, 20293);
        h.N(parcel, 1, this.f2676k);
        h.J(parcel, 2, this.f2677l, i3);
        h.K(parcel, 3, this.f2678m);
        h.R(parcel, iQ);
    }
}
