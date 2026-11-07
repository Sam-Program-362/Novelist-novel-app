package p035l0;

import U.b;
import U.c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class A extends c {
    public static final Parcelable.Creator<A> CREATOR = new b(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Parcelable f3918m;

    public A(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3918m = parcel.readParcelable(classLoader == null ? t.class.getClassLoader() : classLoader);
    }

    @Override // U.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.f3918m, 0);
    }
}
