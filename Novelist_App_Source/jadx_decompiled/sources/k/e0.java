package k;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e0 extends U.c {
    public static final Parcelable.Creator<e0> CREATOR = new U.b(1);

    /* renamed from: m, reason: collision with root package name */
    public boolean f3664m;

    public e0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3664m = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3664m + "}";
    }

    @Override // U.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeValue(Boolean.valueOf(this.f3664m));
    }
}
