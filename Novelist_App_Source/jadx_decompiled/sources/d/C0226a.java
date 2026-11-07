package d;

import M0.o;
import a2.h;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import f1.e;
import f1.f;
import java.util.ArrayList;
import l0.C0385H;
import l0.C0386I;
import l0.C0403m;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2763a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2763a) {
            case 0:
                h.e(parcel, "parcel");
                return new C0227b(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                int W = E2.a.W(parcel);
                Intent intent = null;
                int i3 = 0;
                int i4 = 0;
                while (parcel.dataPosition() < W) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        i3 = E2.a.H(parcel, readInt);
                    } else if (c3 == 2) {
                        i4 = E2.a.H(parcel, readInt);
                    } else if (c3 != 3) {
                        E2.a.T(parcel, readInt);
                    } else {
                        intent = (Intent) E2.a.j(parcel, readInt, Intent.CREATOR);
                    }
                }
                E2.a.r(parcel, W);
                return new f1.b(i3, i4, intent);
            case 2:
                int W2 = E2.a.W(parcel);
                ArrayList arrayList = null;
                String str = null;
                while (parcel.dataPosition() < W2) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 1) {
                        arrayList = E2.a.l(parcel, readInt2);
                    } else if (c4 != 2) {
                        E2.a.T(parcel, readInt2);
                    } else {
                        str = E2.a.k(parcel, readInt2);
                    }
                }
                E2.a.r(parcel, W2);
                return new e(arrayList, str);
            case 3:
                int W3 = E2.a.W(parcel);
                J0.a aVar = null;
                int i5 = 0;
                o oVar = null;
                while (parcel.dataPosition() < W3) {
                    int readInt3 = parcel.readInt();
                    char c5 = (char) readInt3;
                    if (c5 == 1) {
                        i5 = E2.a.H(parcel, readInt3);
                    } else if (c5 == 2) {
                        aVar = (J0.a) E2.a.j(parcel, readInt3, J0.a.CREATOR);
                    } else if (c5 != 3) {
                        E2.a.T(parcel, readInt3);
                    } else {
                        oVar = (o) E2.a.j(parcel, readInt3, o.CREATOR);
                    }
                }
                E2.a.r(parcel, W3);
                return new f(i5, aVar, oVar);
            case 4:
                C0403m c0403m = new C0403m();
                c0403m.f4009k = parcel.readInt();
                c0403m.f4010l = parcel.readInt();
                c0403m.f4011m = parcel.readInt() == 1;
                return c0403m;
            case 5:
                C0385H c0385h = new C0385H();
                c0385h.f3932k = parcel.readInt();
                c0385h.f3933l = parcel.readInt();
                c0385h.n = parcel.readInt() == 1;
                int readInt4 = parcel.readInt();
                if (readInt4 > 0) {
                    int[] iArr = new int[readInt4];
                    c0385h.f3934m = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0385h;
            case 6:
                C0386I c0386i = new C0386I();
                c0386i.f3935k = parcel.readInt();
                c0386i.f3936l = parcel.readInt();
                int readInt5 = parcel.readInt();
                c0386i.f3937m = readInt5;
                if (readInt5 > 0) {
                    int[] iArr2 = new int[readInt5];
                    c0386i.n = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt6 = parcel.readInt();
                c0386i.f3938o = readInt6;
                if (readInt6 > 0) {
                    int[] iArr3 = new int[readInt6];
                    c0386i.f3939p = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0386i.f3941r = parcel.readInt() == 1;
                c0386i.f3942s = parcel.readInt() == 1;
                c0386i.f3943t = parcel.readInt() == 1;
                c0386i.f3940q = parcel.readArrayList(C0385H.class.getClassLoader());
                return c0386i;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f2763a) {
            case 0:
                return new C0227b[i3];
            case 1:
                return new f1.b[i3];
            case 2:
                return new e[i3];
            case 3:
                return new f[i3];
            case 4:
                return new C0403m[i3];
            case 5:
                return new C0385H[i3];
            case 6:
                return new C0386I[i3];
            default:
                return new ParcelImpl[i3];
        }
    }
}
