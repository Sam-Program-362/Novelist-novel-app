package M0;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC0050f, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f924a;

    public F(IBinder iBinder) {
        this.f924a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f924a;
    }

    public final Account d() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.f924a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                Account account = (Account) a1.g.a(parcelObtain2, Account.CREATOR);
                parcelObtain2.recycle();
                return account;
            } catch (RuntimeException e3) {
                parcelObtain2.recycle();
                throw e3;
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
