package K0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g extends N0.a {
    public static final Parcelable.Creator<g> CREATOR = new q(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f641m;
    public final boolean n;

    public g(int i3, int i4, int i5, boolean z3) {
        this.f639k = i3;
        this.f640l = i4;
        this.f641m = i5;
        this.n = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f639k == gVar.f639k && this.f640l == gVar.f640l && this.f641m == gVar.f641m && this.n == gVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f639k), Integer.valueOf(this.f640l), Integer.valueOf(this.f641m), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        int i3 = this.f639k;
        int length = String.valueOf(i3).length();
        int i4 = this.f640l;
        int length2 = String.valueOf(i4).length();
        int i5 = this.f641m;
        int length3 = String.valueOf(i5).length();
        boolean z3 = this.n;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z3).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i3);
        sb.append(", dataOwnerProductId=");
        sb.append(i4);
        sb.append(", processingReason=");
        sb.append(i5);
        sb.append(", isUserData=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f639k);
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(this.f640l);
        H2.h.P(parcel, 3, 4);
        parcel.writeInt(this.f641m);
        H2.h.P(parcel, 4, 4);
        parcel.writeInt(this.n ? 1 : 0);
        H2.h.R(parcel, iQ);
    }
}
