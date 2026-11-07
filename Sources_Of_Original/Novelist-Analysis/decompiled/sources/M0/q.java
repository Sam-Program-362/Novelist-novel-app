package M0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class q implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f985a;

    public q(IBinder iBinder) {
        this.f985a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f985a;
    }

    public final void d(v vVar, C0049e c0049e) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(vVar);
            parcelObtain.writeInt(1);
            F0.l.a(c0049e, parcelObtain, 0);
            this.f985a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
