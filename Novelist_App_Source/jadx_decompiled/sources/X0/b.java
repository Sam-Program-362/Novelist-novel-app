package X0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class b implements d, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f1561a;

    public b(IBinder iBinder) {
        this.f1561a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1561a;
    }

    public final void d(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f1561a.transact(i3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
