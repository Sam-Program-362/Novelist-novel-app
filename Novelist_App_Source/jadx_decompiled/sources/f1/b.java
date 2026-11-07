package f1;

import H2.h;
import K0.n;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import d.C0226a;

/* loaded from: classes.dex */
public final class b extends N0.a implements n {
    public static final Parcelable.Creator<b> CREATOR = new C0226a(1);

    /* renamed from: k, reason: collision with root package name */
    public final int f2818k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2819l;

    /* renamed from: m, reason: collision with root package name */
    public final Intent f2820m;

    public b(int i3, int i4, Intent intent) {
        this.f2818k = i3;
        this.f2819l = i4;
        this.f2820m = intent;
    }

    @Override // K0.n
    public final Status a() {
        return this.f2819l == 0 ? Status.f2721o : Status.f2725s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = h.Q(parcel, 20293);
        h.P(parcel, 1, 4);
        parcel.writeInt(this.f2818k);
        h.P(parcel, 2, 4);
        parcel.writeInt(this.f2819l);
        h.J(parcel, 3, this.f2820m, i3);
        h.R(parcel, Q2);
    }
}
