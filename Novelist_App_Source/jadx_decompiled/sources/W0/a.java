package W0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends N0.a {
    public static final Parcelable.Creator<a> CREATOR = new V0.l(7);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1534k;

    public a(boolean z3) {
        this.f1534k = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        a2.h.e(parcel, "dest");
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f1534k ? 1 : 0);
        H2.h.R(parcel, Q2);
    }
}
