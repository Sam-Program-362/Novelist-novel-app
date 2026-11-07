package Y0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f1579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1580c;

    public /* synthetic */ a(IBinder iBinder, String str, int i3) {
        this.f1578a = i3;
        this.f1579b = iBinder;
        this.f1580c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f1578a) {
            case 0:
                break;
        }
        return this.f1579b;
    }

    public Parcel d() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f1580c);
        return parcelObtain;
    }

    public void e(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f1579b.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
