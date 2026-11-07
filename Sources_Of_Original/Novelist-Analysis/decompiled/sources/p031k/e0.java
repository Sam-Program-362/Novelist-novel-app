package p031k;

import U.b;
import U.c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends c {
    public static final Parcelable.Creator<e0> CREATOR = new b(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
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
