package p007d;

import M0.o;
import a2.h;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import p015f1.b;
import p015f1.e;
import p015f1.f;
import p035l0.C0260m;
import p035l0.H;
import p035l0.I;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2763a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2763a) {
            case 0:
                h.e(parcel, "parcel");
                return new b(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                int iW = E2.a.W(parcel);
                Intent intent = null;
                int iH = 0;
                int iH2 = 0;
                while (parcel.dataPosition() < iW) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iH = E2.a.H(parcel, i3);
                    } else if (c3 == 2) {
                        iH2 = E2.a.H(parcel, i3);
                    } else if (c3 != 3) {
                        E2.a.T(parcel, i3);
                    } else {
                        intent = (Intent) E2.a.j(parcel, i3, Intent.CREATOR);
                    }
                }
                E2.a.r(parcel, iW);
                return new b(iH, iH2, intent);
            case 2:
                int iW2 = E2.a.W(parcel);
                ArrayList arrayListL = null;
                String strK = null;
                while (parcel.dataPosition() < iW2) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        arrayListL = E2.a.l(parcel, i4);
                    } else if (c4 != 2) {
                        E2.a.T(parcel, i4);
                    } else {
                        strK = E2.a.k(parcel, i4);
                    }
                }
                E2.a.r(parcel, iW2);
                return new e(arrayListL, strK);
            case 3:
                int iW3 = E2.a.W(parcel);
                J0.a aVar = null;
                int iH3 = 0;
                o oVar = null;
                while (parcel.dataPosition() < iW3) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 1) {
                        iH3 = E2.a.H(parcel, i5);
                    } else if (c5 == 2) {
                        aVar = (J0.a) E2.a.j(parcel, i5, J0.a.CREATOR);
                    } else if (c5 != 3) {
                        E2.a.T(parcel, i5);
                    } else {
                        oVar = (o) E2.a.j(parcel, i5, o.CREATOR);
                    }
                }
                E2.a.r(parcel, iW3);
                return new f(iH3, aVar, oVar);
            case 4:
                C0260m c0260m = new C0260m();
                c0260m.f4009k = parcel.readInt();
                c0260m.f4010l = parcel.readInt();
                c0260m.f4011m = parcel.readInt() == 1;
                return c0260m;
            case 5:
                H h3 = new H();
                h3.f3932k = parcel.readInt();
                h3.f3933l = parcel.readInt();
                h3.n = parcel.readInt() == 1;
                int i6 = parcel.readInt();
                if (i6 > 0) {
                    int[] iArr = new int[i6];
                    h3.f3934m = iArr;
                    parcel.readIntArray(iArr);
                }
                return h3;
            case 6:
                I i7 = new I();
                i7.f3935k = parcel.readInt();
                i7.f3936l = parcel.readInt();
                int i8 = parcel.readInt();
                i7.f3937m = i8;
                if (i8 > 0) {
                    int[] iArr2 = new int[i8];
                    i7.n = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i9 = parcel.readInt();
                i7.f3938o = i9;
                if (i9 > 0) {
                    int[] iArr3 = new int[i9];
                    i7.f3939p = iArr3;
                    parcel.readIntArray(iArr3);
                }
                i7.f3941r = parcel.readInt() == 1;
                i7.f3942s = parcel.readInt() == 1;
                i7.f3943t = parcel.readInt() == 1;
                i7.f3940q = parcel.readArrayList(H.class.getClassLoader());
                return i7;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f2763a) {
            case 0:
                return new b[i3];
            case 1:
                return new b[i3];
            case 2:
                return new e[i3];
            case 3:
                return new f[i3];
            case 4:
                return new C0260m[i3];
            case 5:
                return new H[i3];
            case 6:
                return new I[i3];
            default:
                return new ParcelImpl[i3];
        }
    }
}
