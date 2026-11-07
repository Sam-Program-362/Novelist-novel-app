package Y0;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import org.apache.tika.fork.ContentHandlerProxy;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1595a;

    public static void k(Parcel parcel) {
        int i3 = p006c1.a.f2658a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(iDataAvail);
        throw new BadParcelableException(sb.toString());
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i3 = this.f1595a;
        return this;
    }

    public abstract boolean l(int i3, Parcel parcel, Parcel parcel2);

    public abstract boolean m(int i3, Parcel parcel, Parcel parcel2);

    public boolean n(int i3, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        boolean zOnTransact;
        switch (this.f1595a) {
            case 0:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return m(i3, parcel, parcel2);
            case 1:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return l(i3, parcel, parcel2);
            case 2:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return n(i3, parcel, parcel2);
            default:
                if (i3 > 16777215) {
                    zOnTransact = super.onTransact(i3, parcel, parcel2, i4);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (!zOnTransact) {
                    X0.f fVar = (X0.f) this;
                    switch (i3) {
                        case 1:
                            Status status = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            W0.l lVar = (W0.l) p006c1.a.a(parcel, W0.l.CREATOR);
                            k(parcel);
                            fVar.g(status, lVar);
                            break;
                        case 2:
                            Status status2 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            k(parcel);
                            a2.h.e(status2, "status");
                            throw new UnsupportedOperationException();
                        case 3:
                            Status status3 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            k(parcel);
                            a2.h.e(status3, "status");
                            throw new UnsupportedOperationException();
                        case 4:
                            Status status4 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            k(parcel);
                            a2.h.e(status4, "status");
                            throw new UnsupportedOperationException();
                        case 5:
                            Status status5 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            k(parcel);
                            a2.h.e(status5, "status");
                            throw new UnsupportedOperationException();
                        case 6:
                            Status status6 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            k(parcel);
                            a2.h.e(status6, "status");
                            throw new UnsupportedOperationException();
                        case 7:
                            Status status7 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            W0.f fVar2 = (W0.f) p006c1.a.a(parcel, W0.f.CREATOR);
                            k(parcel);
                            fVar.c(status7, fVar2);
                            break;
                        case 8:
                            Status status8 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            k(parcel);
                            a2.h.e(status8, "status");
                            throw new UnsupportedOperationException();
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            Status status9 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            W0.c cVar = (W0.c) p006c1.a.a(parcel, W0.c.CREATOR);
                            k(parcel);
                            fVar.h(status9, cVar);
                            break;
                        case 10:
                            Status status10 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            W0.q qVar = (W0.q) p006c1.a.a(parcel, W0.q.CREATOR);
                            k(parcel);
                            fVar.b(status10, qVar);
                            break;
                        case 11:
                            Status status11 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            k(parcel);
                            a2.h.e(status11, "status");
                            throw new UnsupportedOperationException();
                        case 12:
                            Status status12 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            k(parcel);
                            a2.h.e(status12, "status");
                            throw new UnsupportedOperationException();
                        case 13:
                            Status status13 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            k(parcel);
                            a2.h.e(status13, "status");
                            throw new UnsupportedOperationException();
                        case 14:
                            Status status14 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            k(parcel);
                            a2.h.e(status14, "status");
                            throw new UnsupportedOperationException();
                        case 15:
                            Status status15 = (Status) p006c1.a.a(parcel, Status.CREATOR);
                            k(parcel);
                            a2.h.e(status15, "status");
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
        }
    }

    public h(String str, int i3) {
        this.f1595a = i3;
        switch (i3) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
