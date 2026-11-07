package p035l0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007d.a;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new a(5);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f3934m;
    public boolean n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3932k + ", mGapDir=" + this.f3933l + ", mHasUnwantedGapAfter=" + this.n + ", mGapPerSpan=" + Arrays.toString(this.f3934m) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3932k);
        parcel.writeInt(this.f3933l);
        parcel.writeInt(this.n ? 1 : 0);
        int[] iArr = this.f3934m;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f3934m);
        }
    }
}
