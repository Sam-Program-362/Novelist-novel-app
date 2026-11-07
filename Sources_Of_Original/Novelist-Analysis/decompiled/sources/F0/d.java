package F0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends N0.a {
    public static final Parcelable.Creator<d> CREATOR = new l(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f313l;

    public d(String str, boolean z3) {
        if (z3) {
            r.f(str);
        }
        this.f312k = z3;
        this.f313l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f312k == dVar.f312k && r.i(this.f313l, dVar.f313l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f312k), this.f313l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f312k ? 1 : 0);
        H2.h.K(parcel, 2, this.f313l);
        H2.h.R(parcel, iQ);
    }
}
