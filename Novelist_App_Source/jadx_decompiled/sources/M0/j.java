package M0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends N0.a {
    public static final Parcelable.Creator<j> CREATOR = new F0.l(18);

    /* renamed from: k, reason: collision with root package name */
    public final int f964k;

    /* renamed from: l, reason: collision with root package name */
    public List f965l;

    public j(int i3, List list) {
        this.f964k = i3;
        this.f965l = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f964k);
        H2.h.N(parcel, 2, this.f965l);
        H2.h.R(parcel, Q2);
    }
}
