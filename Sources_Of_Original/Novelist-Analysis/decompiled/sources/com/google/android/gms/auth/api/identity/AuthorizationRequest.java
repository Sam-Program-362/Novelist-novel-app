package com.google.android.gms.auth.api.identity;

import F0.l;
import H2.h;
import M0.r;
import N0.a;
import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AuthorizationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new l(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f2665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f2667m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Account f2668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f2669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f2670q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f2671r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f2672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f2673t;
    public final int u;

    public AuthorizationRequest(List list, String str, boolean z3, boolean z4, Account account, String str2, String str3, boolean z5, Bundle bundle, boolean z6, int i3) {
        boolean z7 = false;
        if (list != null && !list.isEmpty()) {
            z7 = true;
        }
        r.a("requestedScopes cannot be null or empty", z7);
        this.f2665k = list;
        this.f2666l = str;
        this.f2667m = z3;
        this.n = z4;
        this.f2668o = account;
        this.f2669p = str2;
        this.f2670q = str3;
        this.f2671r = z5;
        this.f2672s = bundle;
        this.f2673t = z6;
        this.u = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.f2665k;
        int size = list.size();
        List list2 = authorizationRequest.f2665k;
        if (size == list2.size() && list.containsAll(list2)) {
            Bundle bundle = authorizationRequest.f2672s;
            Bundle bundle2 = this.f2672s;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!r.i(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f2667m == authorizationRequest.f2667m && this.f2671r == authorizationRequest.f2671r && this.n == authorizationRequest.n && this.f2673t == authorizationRequest.f2673t && this.u == authorizationRequest.u && r.i(this.f2666l, authorizationRequest.f2666l) && r.i(this.f2668o, authorizationRequest.f2668o) && r.i(this.f2669p, authorizationRequest.f2669p) && r.i(this.f2670q, authorizationRequest.f2670q)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2665k, this.f2666l, Boolean.valueOf(this.f2667m), Boolean.valueOf(this.f2671r), Boolean.valueOf(this.n), this.f2668o, this.f2669p, this.f2670q, this.f2672s, Boolean.valueOf(this.f2673t), Integer.valueOf(this.u)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = h.Q(parcel, 20293);
        h.N(parcel, 1, this.f2665k);
        h.K(parcel, 2, this.f2666l);
        h.P(parcel, 3, 4);
        parcel.writeInt(this.f2667m ? 1 : 0);
        h.P(parcel, 4, 4);
        parcel.writeInt(this.n ? 1 : 0);
        h.J(parcel, 5, this.f2668o, i3);
        h.K(parcel, 6, this.f2669p);
        h.K(parcel, 7, this.f2670q);
        h.P(parcel, 8, 4);
        parcel.writeInt(this.f2671r ? 1 : 0);
        h.G(parcel, 9, this.f2672s);
        h.P(parcel, 10, 4);
        parcel.writeInt(this.f2673t ? 1 : 0);
        h.P(parcel, 11, 4);
        parcel.writeInt(this.u);
        h.R(parcel, iQ);
    }
}
