package V0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends N0.a {
    public static final Parcelable.Creator<b> CREATOR = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1495k;

    public b(boolean z3) {
        this.f1495k = z3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && this.f1495k == ((b) obj).f1495k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1495k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f1495k ? 1 : 0);
        H2.h.R(parcel, Q2);
    }
}
