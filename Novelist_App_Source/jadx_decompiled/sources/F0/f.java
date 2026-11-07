package F0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends N0.a {
    public static final Parcelable.Creator<f> CREATOR = new l(10);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f317k;

    public f(boolean z3) {
        this.f317k = z3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && this.f317k == ((f) obj).f317k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f317k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f317k ? 1 : 0);
        H2.h.R(parcel, Q2);
    }
}
