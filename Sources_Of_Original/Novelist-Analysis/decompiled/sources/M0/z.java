package M0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z extends N0.a {
    public static final Parcelable.Creator<z> CREATOR = new F0.l(23);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bundle f999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public J0.c[] f1000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1001m;
    public C0048d n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.G(parcel, 1, this.f999k);
        H2.h.M(parcel, 2, this.f1000l, i3);
        int i4 = this.f1001m;
        H2.h.P(parcel, 3, 4);
        parcel.writeInt(i4);
        H2.h.J(parcel, 4, this.n, i3);
        H2.h.R(parcel, iQ);
    }
}
