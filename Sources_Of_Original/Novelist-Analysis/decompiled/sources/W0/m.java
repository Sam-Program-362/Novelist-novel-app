package W0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m extends N0.a {
    public static final Parcelable.Creator<m> CREATOR = new V0.l(20);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PendingIntent f1550k;

    public m(PendingIntent pendingIntent) {
        a2.h.e(pendingIntent, "pendingIntent");
        this.f1550k = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        a2.h.e(parcel, "dest");
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.J(parcel, 1, this.f1550k, i3);
        H2.h.R(parcel, iQ);
    }
}
