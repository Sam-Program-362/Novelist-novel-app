package b0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new V0.l(28);

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2391k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2392l;

    /* renamed from: m, reason: collision with root package name */
    public C0155b[] f2393m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public String f2394o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2395p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2396q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2397r;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f2391k);
        parcel.writeStringList(this.f2392l);
        parcel.writeTypedArray(this.f2393m, i3);
        parcel.writeInt(this.n);
        parcel.writeString(this.f2394o);
        parcel.writeStringList(this.f2395p);
        parcel.writeTypedList(this.f2396q);
        parcel.writeTypedList(this.f2397r);
    }
}
