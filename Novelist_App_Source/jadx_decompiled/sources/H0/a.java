package H0;

import F0.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends N0.a {
    public static final Parcelable.Creator<a> CREATOR = new l(14);

    /* renamed from: k, reason: collision with root package name */
    public final int f417k;

    /* renamed from: l, reason: collision with root package name */
    public final int f418l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f419m;

    public a(int i3, int i4, Bundle bundle) {
        this.f417k = i3;
        this.f418l = i4;
        this.f419m = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f417k);
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(this.f418l);
        H2.h.G(parcel, 3, this.f419m);
        H2.h.R(parcel, Q2);
    }
}
