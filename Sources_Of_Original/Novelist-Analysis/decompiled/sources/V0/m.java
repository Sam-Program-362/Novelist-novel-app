package V0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p004b1.J;

/* JADX INFO: loaded from: classes.dex */
public final class m extends N0.a {
    public static final Parcelable.Creator<m> CREATOR = new l(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J f1529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final J f1530l;

    public m(J j3, J j4) {
        this.f1529k = j3;
        this.f1530l = j4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return r.i(this.f1529k, mVar.f1529k) && r.i(this.f1530l, mVar.f1530l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1529k, this.f1530l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        J j3 = this.f1529k;
        H2.h.H(parcel, 1, j3 == null ? null : j3.j());
        J j4 = this.f1530l;
        H2.h.H(parcel, 2, j4 != null ? j4.j() : null);
        H2.h.R(parcel, iQ);
    }
}
