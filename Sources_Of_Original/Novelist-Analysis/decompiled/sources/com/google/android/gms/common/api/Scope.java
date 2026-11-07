package com.google.android.gms.common.api;

import H2.h;
import K0.q;
import M0.r;
import N0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new q(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2720l;

    public Scope(String str, int i3) {
        r.e(str, "scopeUri must not be null or empty");
        this.f2719k = i3;
        this.f2720l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2720l.equals(((Scope) obj).f2720l);
    }

    public final int hashCode() {
        return this.f2720l.hashCode();
    }

    public final String toString() {
        return this.f2720l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = h.Q(parcel, 20293);
        h.P(parcel, 1, 4);
        parcel.writeInt(this.f2719k);
        h.K(parcel, 2, this.f2720l);
        h.R(parcel, iQ);
    }
}
