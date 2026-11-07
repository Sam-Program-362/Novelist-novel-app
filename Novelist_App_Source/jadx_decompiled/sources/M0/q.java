package M0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class q implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f985a;

    public q(IBinder iBinder) {
        this.f985a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f985a;
    }

    public final void d(v vVar, C0049e c0049e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(vVar);
            obtain.writeInt(1);
            F0.l.a(c0049e, obtain, 0);
            this.f985a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
