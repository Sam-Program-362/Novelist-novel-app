package p035l0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007d.a;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new a(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3937m;
    public int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f3939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f3940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3943t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3935k);
        parcel.writeInt(this.f3936l);
        parcel.writeInt(this.f3937m);
        if (this.f3937m > 0) {
            parcel.writeIntArray(this.n);
        }
        parcel.writeInt(this.f3938o);
        if (this.f3938o > 0) {
            parcel.writeIntArray(this.f3939p);
        }
        parcel.writeInt(this.f3941r ? 1 : 0);
        parcel.writeInt(this.f3942s ? 1 : 0);
        parcel.writeInt(this.f3943t ? 1 : 0);
        parcel.writeList(this.f3940q);
    }
}
