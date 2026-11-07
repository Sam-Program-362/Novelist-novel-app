package f1;

import H2.h;
import K0.n;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import d.C0226a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends N0.a implements n {
    public static final Parcelable.Creator<e> CREATOR = new C0226a(2);

    /* renamed from: k, reason: collision with root package name */
    public final List f2821k;

    /* renamed from: l, reason: collision with root package name */
    public final String f2822l;

    public e(ArrayList arrayList, String str) {
        this.f2821k = arrayList;
        this.f2822l = str;
    }

    @Override // K0.n
    public final Status a() {
        return this.f2822l != null ? Status.f2721o : Status.f2725s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = h.Q(parcel, 20293);
        h.L(parcel, 1, this.f2821k);
        h.K(parcel, 2, this.f2822l);
        h.R(parcel, Q2);
    }
}
