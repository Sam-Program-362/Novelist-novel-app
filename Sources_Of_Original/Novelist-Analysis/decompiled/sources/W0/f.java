package W0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends N0.a {
    public static final Parcelable.Creator<f> CREATOR = new V0.l(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PendingIntent f1537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f1538l;

    public f(PendingIntent pendingIntent, g gVar) {
        this.f1537k = pendingIntent;
        this.f1538l = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        a2.h.e(parcel, "dest");
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.J(parcel, 1, this.f1537k, i3);
        H2.h.J(parcel, 2, this.f1538l, i3);
        H2.h.R(parcel, iQ);
    }
}
