package M0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class o extends N0.a {
    public static final Parcelable.Creator<o> CREATOR = new F0.l(21);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IBinder f976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final J0.a f977m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f978o;

    public o(int i3, IBinder iBinder, J0.a aVar, boolean z3, boolean z4) {
        this.f975k = i3;
        this.f976l = iBinder;
        this.f977m = aVar;
        this.n = z3;
        this.f978o = z4;
    }

    public final boolean equals(Object obj) {
        Object f3;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f977m.equals(oVar.f977m)) {
            return false;
        }
        Object f4 = null;
        IBinder iBinder = this.f976l;
        if (iBinder == null) {
            f3 = null;
        } else {
            int i3 = AbstractBinderC0045a.f925b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            f3 = iInterfaceQueryLocalInterface instanceof InterfaceC0050f ? (InterfaceC0050f) iInterfaceQueryLocalInterface : new F(iBinder);
        }
        IBinder iBinder2 = oVar.f976l;
        if (iBinder2 != null) {
            int i4 = AbstractBinderC0045a.f925b;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            f4 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0050f ? (InterfaceC0050f) iInterfaceQueryLocalInterface2 : new F(iBinder2);
        }
        return r.i(f3, f4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f975k);
        IBinder iBinder = this.f976l;
        if (iBinder != null) {
            int iQ2 = H2.h.Q(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            H2.h.R(parcel, iQ2);
        }
        H2.h.J(parcel, 3, this.f977m, i3);
        H2.h.P(parcel, 4, 4);
        parcel.writeInt(this.n ? 1 : 0);
        H2.h.P(parcel, 5, 4);
        parcel.writeInt(this.f978o ? 1 : 0);
        H2.h.R(parcel, iQ);
    }
}
