package b0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156c implements Parcelable {
    public static final Parcelable.Creator<C0156c> CREATOR = new V0.l(26);

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2465k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2466l;

    public C0156c(Parcel parcel) {
        this.f2465k = parcel.createStringArrayList();
        this.f2466l = parcel.createTypedArrayList(C0155b.CREATOR);
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
