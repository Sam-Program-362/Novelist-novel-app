package K0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f extends N0.a {
    public static final Parcelable.Creator<f> CREATOR = q.f658b;
    public static final f n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f638m;

    static {
        f fVar = new f(null, false);
        fVar.f638m = false;
        n = fVar;
    }

    public f(g gVar, boolean z3) {
        this.f636k = gVar;
        this.f637l = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return M0.r.i(this.f636k, fVar.f636k) && this.f638m == fVar.f638m && this.f637l == fVar.f637l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f636k, Boolean.valueOf(this.f638m), Boolean.valueOf(this.f637l)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f636k);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 31);
        sb.append("ApiMetadata(complianceOptions=");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        if (this.f638m) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.J(parcel, 1, this.f636k, i3);
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(this.f637l ? 1 : 0);
        H2.h.R(parcel, iQ);
    }
}
