package k;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q0 extends U.c {
    public static final Parcelable.Creator<q0> CREATOR = new U.b(2);

    /* renamed from: m, reason: collision with root package name */
    public int f3749m;
    public boolean n;

    public q0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3749m = parcel.readInt();
        this.n = parcel.readInt() != 0;
    }

    @Override // U.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f3749m);
        parcel.writeInt(this.n ? 1 : 0);
    }
}
