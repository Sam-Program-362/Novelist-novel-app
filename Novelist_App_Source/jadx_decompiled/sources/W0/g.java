package W0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g extends N0.a {
    public static final Parcelable.Creator<g> CREATOR = new V0.l(13);

    /* renamed from: k, reason: collision with root package name */
    public final String f1539k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f1540l;

    public g(String str, Bundle bundle) {
        a2.h.e(str, "type");
        a2.h.e(bundle, "data");
        this.f1539k = str;
        this.f1540l = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        a2.h.e(parcel, "dest");
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.K(parcel, 1, this.f1539k);
        H2.h.G(parcel, 2, this.f1540l);
        H2.h.R(parcel, Q2);
    }
}
