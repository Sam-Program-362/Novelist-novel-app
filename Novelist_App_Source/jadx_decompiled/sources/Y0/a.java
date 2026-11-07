package Y0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1578a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f1579b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1580c;

    public /* synthetic */ a(IBinder iBinder, String str, int i3) {
        this.f1578a = i3;
        this.f1579b = iBinder;
        this.f1580c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f1578a) {
        }
        return this.f1579b;
    }

    public Parcel d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1580c);
        return obtain;
    }

    public void e(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f1579b.transact(i3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
