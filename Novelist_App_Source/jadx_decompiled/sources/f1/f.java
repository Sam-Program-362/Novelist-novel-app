package f1;

import H2.h;
import M0.o;
import android.os.Parcel;
import android.os.Parcelable;
import d.C0226a;

/* loaded from: classes.dex */
public final class f extends N0.a {
    public static final Parcelable.Creator<f> CREATOR = new C0226a(3);

    /* renamed from: k, reason: collision with root package name */
    public final int f2823k;

    /* renamed from: l, reason: collision with root package name */
    public final J0.a f2824l;

    /* renamed from: m, reason: collision with root package name */
    public final o f2825m;

    public f(int i3, J0.a aVar, o oVar) {
        this.f2823k = i3;
        this.f2824l = aVar;
        this.f2825m = oVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = h.Q(parcel, 20293);
        h.P(parcel, 1, 4);
        parcel.writeInt(this.f2823k);
        h.J(parcel, 2, this.f2824l, i3);
        h.J(parcel, 3, this.f2825m, i3);
        h.R(parcel, Q2);
    }
}
