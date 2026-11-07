package p003b0;

import V0.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: b0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0148c implements Parcelable {
    public static final Parcelable.Creator<C0148c> CREATOR = new l(26);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f2465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f2466l;

    public C0148c(Parcel parcel) {
        this.f2465k = parcel.createStringArrayList();
        this.f2466l = parcel.createTypedArrayList(C0147b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f2465k);
        parcel.writeTypedList(this.f2466l);
    }
}
