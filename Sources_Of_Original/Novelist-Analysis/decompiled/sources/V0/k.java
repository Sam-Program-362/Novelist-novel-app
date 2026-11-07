package V0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k extends N0.a {
    public static final Parcelable.Creator<k> CREATOR = new F0.l(28);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final short f1526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final short f1527m;

    public k(int i3, short s3, short s4) {
        this.f1525k = i3;
        this.f1526l = s3;
        this.f1527m = s4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1525k == kVar.f1525k && this.f1526l == kVar.f1526l && this.f1527m == kVar.f1527m;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1525k), Short.valueOf(this.f1526l), Short.valueOf(this.f1527m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f1525k);
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(this.f1526l);
        H2.h.P(parcel, 3, 4);
        parcel.writeInt(this.f1527m);
        H2.h.R(parcel, iQ);
    }
}
