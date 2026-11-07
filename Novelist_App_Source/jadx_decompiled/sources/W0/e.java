package W0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends N0.a {
    public static final Parcelable.Creator<e> CREATOR = new V0.l(11);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1536k;

    public e(boolean z3) {
        this.f1536k = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        a2.h.e(parcel, "dest");
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f1536k ? 1 : 0);
        H2.h.R(parcel, Q2);
    }
}
