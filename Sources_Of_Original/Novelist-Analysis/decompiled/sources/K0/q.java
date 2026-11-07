package K0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f658b = new q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f659a;

    public /* synthetic */ q(int i3) {
        this.f659a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f659a) {
            case 0:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return f.n;
                }
                int iW = E2.a.W(parcel);
                boolean zG = false;
                g gVar = null;
                while (parcel.dataPosition() < iW) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        gVar = (g) E2.a.j(parcel, i3, g.CREATOR);
                    } else if (c3 != 2) {
                        E2.a.T(parcel, i3);
                    } else {
                        zG = E2.a.G(parcel, i3);
                    }
                }
                E2.a.r(parcel, iW);
                return new f(gVar, zG);
            case 1:
                int iW2 = E2.a.W(parcel);
                int iH = 0;
                boolean zG2 = true;
                int iH2 = 0;
                int iH3 = 0;
                while (parcel.dataPosition() < iW2) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        iH = E2.a.H(parcel, i4);
                    } else if (c4 == 2) {
                        iH2 = E2.a.H(parcel, i4);
                    } else if (c4 == 3) {
                        iH3 = E2.a.H(parcel, i4);
                    } else if (c4 != 4) {
                        E2.a.T(parcel, i4);
                    } else {
                        zG2 = E2.a.G(parcel, i4);
                    }
                }
                E2.a.r(parcel, iW2);
                return new g(iH, iH2, iH3, zG2);
            case 2:
                int iW3 = E2.a.W(parcel);
                String strK = null;
                int iH4 = 0;
                while (parcel.dataPosition() < iW3) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 1) {
                        iH4 = E2.a.H(parcel, i5);
                    } else if (c5 != 2) {
                        E2.a.T(parcel, i5);
                    } else {
                        strK = E2.a.k(parcel, i5);
                    }
                }
                E2.a.r(parcel, iW3);
                return new Scope(strK, iH4);
            default:
                int iW4 = E2.a.W(parcel);
                String strK2 = null;
                J0.a aVar = null;
                int iH5 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iW4) {
                    int i6 = parcel.readInt();
                    char c6 = (char) i6;
                    if (c6 == 1) {
                        iH5 = E2.a.H(parcel, i6);
                    } else if (c6 == 2) {
                        strK2 = E2.a.k(parcel, i6);
                    } else if (c6 == 3) {
                        pendingIntent = (PendingIntent) E2.a.j(parcel, i6, PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        E2.a.T(parcel, i6);
                    } else {
                        aVar = (J0.a) E2.a.j(parcel, i6, J0.a.CREATOR);
                    }
                }
                E2.a.r(parcel, iW4);
                return new Status(iH5, strK2, pendingIntent, aVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f659a) {
            case 0:
                return new f[i3];
            case 1:
                return new g[i3];
            case 2:
                return new Scope[i3];
            default:
                return new Status[i3];
        }
    }
}
