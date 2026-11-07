package b0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class E implements Parcelable {
    public static final Parcelable.Creator<E> CREATOR = new V0.l(27);

    /* renamed from: k, reason: collision with root package name */
    public String f2349k;

    /* renamed from: l, reason: collision with root package name */
    public int f2350l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f2349k);
        parcel.writeInt(this.f2350l);
    }
}
