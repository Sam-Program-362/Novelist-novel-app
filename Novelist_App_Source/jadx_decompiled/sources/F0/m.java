package F0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends N0.a {
    public static final Parcelable.Creator<m> CREATOR = new l(4);

    /* renamed from: k, reason: collision with root package name */
    public final String f341k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f342l;

    public m(String str, boolean z3) {
        this.f341k = str;
        this.f342l = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f341k.equals(mVar.f341k) && this.f342l == mVar.f342l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f341k, Boolean.valueOf(this.f342l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.K(parcel, 1, this.f341k);
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(this.f342l ? 1 : 0);
        H2.h.R(parcel, Q2);
    }
}
