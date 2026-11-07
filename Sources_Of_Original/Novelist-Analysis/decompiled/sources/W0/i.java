package W0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i extends N0.a {
    public static final Parcelable.Creator<i> CREATOR = new V0.l(15);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f1546k;

    public i(Bundle bundle) {
        a2.h.e(bundle, "responseBundle");
        this.f1546k = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        a2.h.e(parcel, "dest");
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.G(parcel, 1, this.f1546k);
        H2.h.R(parcel, iQ);
    }
}
