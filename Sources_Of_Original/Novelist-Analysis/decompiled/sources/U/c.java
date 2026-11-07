package U;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Parcelable f1286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f1285l = new a();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f1286k = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f1286k, i3);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1286k = parcelable == f1285l ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1286k = parcelable == null ? f1285l : parcelable;
    }
}
