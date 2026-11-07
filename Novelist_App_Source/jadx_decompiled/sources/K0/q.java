package K0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator {

    /* renamed from: b, reason: collision with root package name */
    public static final q f658b = new q(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f659a;

    public /* synthetic */ q(int i3) {
        this.f659a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f659a) {
            case 0:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(dataPosition - 4);
                    return f.n;
                }
                int W = E2.a.W(parcel);
                boolean z3 = false;
                g gVar = null;
                while (parcel.dataPosition() < W) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        gVar = (g) E2.a.j(parcel, readInt, g.CREATOR);
                    } else if (c3 != 2) {
                        E2.a.T(parcel, readInt);
                    } else {
                        z3 = E2.a.G(parcel, readInt);
                    }
                }
                E2.a.r(parcel, W);
                return new f(gVar, z3);
            case 1:
                int W2 = E2.a.W(parcel);
                int i3 = 0;
                boolean z4 = true;
                int i4 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < W2) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 1) {
                        i3 = E2.a.H(parcel, readInt2);
                    } else if (c4 == 2) {
                        i4 = E2.a.H(parcel, readInt2);
                    } else if (c4 == 3) {
                        i5 = E2.a.H(parcel, readInt2);
                    } else if (c4 != 4) {
                        E2.a.T(parcel, readInt2);
                    } else {
                        z4 = E2.a.G(parcel, readInt2);
                    }
                }
                E2.a.r(parcel, W2);
                return new g(i3, i4, i5, z4);
            case 2:
                int W3 = E2.a.W(parcel);
                String str = null;
                int i6 = 0;
                while (parcel.dataPosition() < W3) {
                    int readInt3 = parcel.readInt();
                    char c5 = (char) readInt3;
                    if (c5 == 1) {
                        i6 = E2.a.H(parcel, readInt3);
                    } else if (c5 != 2) {
                        E2.a.T(parcel, readInt3);
                    } else {
                        str = E2.a.k(parcel, readInt3);
                    }
                }
                E2.a.r(parcel, W3);
                return new Scope(str, i6);
            default:
                int W4 = E2.a.W(parcel);
                String str2 = null;
                J0.a aVar = null;
                int i7 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < W4) {
                    int readInt4 = parcel.readInt();
                    char c6 = (char) readInt4;
                    if (c6 == 1) {
                        i7 = E2.a.H(parcel, readInt4);
                    } else if (c6 == 2) {
                        str2 = E2.a.k(parcel, readInt4);
                    } else if (c6 == 3) {
                        pendingIntent = (PendingIntent) E2.a.j(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        E2.a.T(parcel, readInt4);
                    } else {
                        aVar = (J0.a) E2.a.j(parcel, readInt4, J0.a.CREATOR);
                    }
                }
                E2.a.r(parcel, W4);
                return new Status(i7, str2, pendingIntent, aVar);
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
