package M0;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class F implements InterfaceC0050f, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f924a;

    public F(IBinder iBinder) {
        this.f924a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f924a;
    }

    public final Account d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f924a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) a1.g.a(obtain, Account.CREATOR);
        } catch (RuntimeException e3) {
            throw e3;
        } finally {
            obtain.recycle();
        }
    }
}
