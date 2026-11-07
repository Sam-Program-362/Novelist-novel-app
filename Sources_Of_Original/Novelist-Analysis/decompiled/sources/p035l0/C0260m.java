package p035l0;

import android.os.Parcel;
import android.os.Parcelable;
import p007d.a;

/* JADX INFO: renamed from: l0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0260m implements Parcelable {
    public static final Parcelable.Creator<C0260m> CREATOR = new a(4);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4011m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f4009k);
        parcel.writeInt(this.f4010l);
        parcel.writeInt(this.f4011m ? 1 : 0);
    }
}
