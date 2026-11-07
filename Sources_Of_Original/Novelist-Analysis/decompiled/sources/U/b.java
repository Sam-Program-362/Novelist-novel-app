package U;

import android.os.Parcel;
import android.os.Parcelable;
import p031k.e0;
import p031k.q0;
import p035l0.A;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1284a;

    public /* synthetic */ b(int i3) {
        this.f1284a = i3;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1284a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f1285l;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new e0(parcel, classLoader);
            case 2:
                return new q0(parcel, classLoader);
            default:
                return new A(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f1284a) {
            case 0:
                return new c[i3];
            case 1:
                return new e0[i3];
            case 2:
                return new q0[i3];
            default:
                return new A[i3];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1284a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f1285l;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new e0(parcel, null);
            case 2:
                return new q0(parcel, null);
            default:
                return new A(parcel, null);
        }
    }
}
