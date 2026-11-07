package V0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import b1.C0185J;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends N0.a {
    public static final Parcelable.Creator<m> CREATOR = new l(1);

    /* renamed from: k, reason: collision with root package name */
    public final C0185J f1529k;

    /* renamed from: l, reason: collision with root package name */
    public final C0185J f1530l;

    public m(C0185J c0185j, C0185J c0185j2) {
        this.f1529k = c0185j;
        this.f1530l = c0185j2;
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
        int Q2 = H2.h.Q(parcel, 20293);
        C0185J c0185j = this.f1529k;
        H2.h.H(parcel, 1, c0185j == null ? null : c0185j.j());
        C0185J c0185j2 = this.f1530l;
        H2.h.H(parcel, 2, c0185j2 != null ? c0185j2.j() : null);
        H2.h.R(parcel, Q2);
    }
}
