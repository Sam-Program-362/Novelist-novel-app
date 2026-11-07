package W0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l extends N0.a {
    public static final Parcelable.Creator<l> CREATOR = new V0.l(19);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PendingIntent f1549k;

    public l(PendingIntent pendingIntent) {
        a2.h.e(pendingIntent, "pendingIntent");
        this.f1549k = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        a2.h.e(parcel, "dest");
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.J(parcel, 1, this.f1549k, i3);
        H2.h.R(parcel, iQ);
    }
}
