package M0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i extends N0.a {
    public static final Parcelable.Creator<i> CREATOR = new F0.l(22);

    /* renamed from: k, reason: collision with root package name */
    public final int f960k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f961l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f962m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final int f963o;

    public i(int i3, boolean z3, boolean z4, int i4, int i5) {
        this.f960k = i3;
        this.f961l = z3;
        this.f962m = z4;
        this.n = i4;
        this.f963o = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f960k);
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(this.f961l ? 1 : 0);
        H2.h.P(parcel, 3, 4);
        parcel.writeInt(this.f962m ? 1 : 0);
        H2.h.P(parcel, 4, 4);
        parcel.writeInt(this.n);
        H2.h.P(parcel, 5, 4);
        parcel.writeInt(this.f963o);
        H2.h.R(parcel, Q2);
    }
}
