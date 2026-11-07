package F0;

import M0.r;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h extends N0.a {
    public static final Parcelable.Creator<h> CREATOR = new l(3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PendingIntent f325k;

    public h(PendingIntent pendingIntent) {
        r.f(pendingIntent);
        this.f325k = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.J(parcel, 1, this.f325k, i3);
        H2.h.R(parcel, iQ);
    }
}
