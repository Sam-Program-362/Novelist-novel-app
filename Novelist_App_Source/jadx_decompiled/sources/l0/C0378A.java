package l0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378A extends U.c {
    public static final Parcelable.Creator<C0378A> CREATOR = new U.b(3);

    /* renamed from: m, reason: collision with root package name */
    public Parcelable f3918m;

    public C0378A(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3918m = parcel.readParcelable(classLoader == null ? AbstractC0410t.class.getClassLoader() : classLoader);
    }

    @Override // U.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.f3918m, 0);
    }
}
