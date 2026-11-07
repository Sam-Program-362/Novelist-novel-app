package V0;

import W0.o;
import W0.p;
import W0.q;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import p003b0.C0147b;
import p003b0.C0148c;
import p003b0.E;
import p003b0.N;
import p004b1.J;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1528a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1528a) {
            case 0:
                int iW = E2.a.W(parcel);
                boolean zG = false;
                while (parcel.dataPosition() < iW) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        E2.a.T(parcel, i3);
                    } else {
                        zG = E2.a.G(parcel, i3);
                    }
                }
                E2.a.r(parcel, iW);
                return new b(zG);
            case 1:
                int iW2 = E2.a.W(parcel);
                byte[] bArrG = null;
                byte[] bArrG2 = null;
                while (parcel.dataPosition() < iW2) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        bArrG = E2.a.g(parcel, i4);
                    } else if (c3 != 2) {
                        E2.a.T(parcel, i4);
                    } else {
                        bArrG2 = E2.a.g(parcel, i4);
                    }
                }
                E2.a.r(parcel, iW2);
                return new m(bArrG == null ? null : J.i(bArrG, bArrG.length), bArrG2 != null ? J.i(bArrG2, bArrG2.length) : null);
            case 2:
                int iW3 = E2.a.W(parcel);
                boolean zG2 = false;
                byte[] bArrG3 = null;
                while (parcel.dataPosition() < iW3) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        zG2 = E2.a.G(parcel, i5);
                    } else if (c4 != 2) {
                        E2.a.T(parcel, i5);
                    } else {
                        bArrG3 = E2.a.g(parcel, i5);
                    }
                }
                E2.a.r(parcel, iW3);
                return new n(zG2, bArrG3 != null ? J.i(bArrG3, bArrG3.length) : null);
            case 3:
                int iW4 = E2.a.W(parcel);
                byte[] bArrG4 = null;
                byte[] bArrG5 = null;
                byte[] bArrG6 = null;
                byte[] bArrG7 = null;
                byte[] bArrG8 = null;
                while (parcel.dataPosition() < iW4) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 2) {
                        bArrG4 = E2.a.g(parcel, i6);
                    } else if (c5 == 3) {
                        bArrG5 = E2.a.g(parcel, i6);
                    } else if (c5 == 4) {
                        bArrG6 = E2.a.g(parcel, i6);
                    } else if (c5 == 5) {
                        bArrG7 = E2.a.g(parcel, i6);
                    } else if (c5 != 6) {
                        E2.a.T(parcel, i6);
                    } else {
                        bArrG8 = E2.a.g(parcel, i6);
                    }
                }
                E2.a.r(parcel, iW4);
                return new c(bArrG4, bArrG5, bArrG6, bArrG7, bArrG8);
            case 4:
                int iW5 = E2.a.W(parcel);
                byte[] bArrG9 = null;
                byte[] bArrG10 = null;
                byte[] bArrG11 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iW5) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 2) {
                        bArrG9 = E2.a.g(parcel, i7);
                    } else if (c6 == 3) {
                        bArrG10 = E2.a.g(parcel, i7);
                    } else if (c6 == 4) {
                        bArrG11 = E2.a.g(parcel, i7);
                    } else if (c6 != 5) {
                        E2.a.T(parcel, i7);
                    } else {
                        int iJ = E2.a.J(parcel, i7);
                        int iDataPosition = parcel.dataPosition();
                        if (iJ == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iJ);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                E2.a.r(parcel, iW5);
                return new d(bArrG9, bArrG10, bArrG11, strArr);
            case 5:
                int iW6 = E2.a.W(parcel);
                int iH = 0;
                String strK = null;
                int iH2 = 0;
                while (parcel.dataPosition() < iW6) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 2) {
                        iH = E2.a.H(parcel, i8);
                    } else if (c7 == 3) {
                        strK = E2.a.k(parcel, i8);
                    } else if (c7 != 4) {
                        E2.a.T(parcel, i8);
                    } else {
                        iH2 = E2.a.H(parcel, i8);
                    }
                }
                E2.a.r(parcel, iW6);
                return new e(iH, strK, iH2);
            case 6:
                try {
                    return h.a(parcel.readInt());
                } catch (g e3) {
                    throw new IllegalArgumentException(e3);
                }
            case 7:
                int iW7 = E2.a.W(parcel);
                boolean zG3 = false;
                while (parcel.dataPosition() < iW7) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        E2.a.T(parcel, i9);
                    } else {
                        zG3 = E2.a.G(parcel, i9);
                    }
                }
                E2.a.r(parcel, iW7);
                return new W0.a(zG3);
            case 8:
                int iW8 = E2.a.W(parcel);
                while (parcel.dataPosition() < iW8) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, iW8);
                return new W0.b();
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                int iW9 = E2.a.W(parcel);
                while (parcel.dataPosition() < iW9) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, iW9);
                return new W0.c();
            case 10:
                int iW10 = E2.a.W(parcel);
                boolean zG4 = false;
                while (parcel.dataPosition() < iW10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        E2.a.T(parcel, i10);
                    } else {
                        zG4 = E2.a.G(parcel, i10);
                    }
                }
                E2.a.r(parcel, iW10);
                return new W0.d(zG4);
            case 11:
                int iW11 = E2.a.W(parcel);
                boolean zG5 = false;
                while (parcel.dataPosition() < iW11) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        E2.a.T(parcel, i11);
                    } else {
                        zG5 = E2.a.G(parcel, i11);
                    }
                }
                E2.a.r(parcel, iW11);
                return new W0.e(zG5);
            case 12:
                int iW12 = E2.a.W(parcel);
                PendingIntent pendingIntent = null;
                W0.g gVar = null;
                while (parcel.dataPosition() < iW12) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        pendingIntent = (PendingIntent) E2.a.j(parcel, i12, PendingIntent.CREATOR);
                    } else if (c8 != 2) {
                        E2.a.T(parcel, i12);
                    } else {
                        gVar = (W0.g) E2.a.j(parcel, i12, W0.g.CREATOR);
                    }
                }
                E2.a.r(parcel, iW12);
                return new W0.f(pendingIntent, gVar);
            case 13:
                int iW13 = E2.a.W(parcel);
                String strK2 = null;
                Bundle bundleF = null;
                while (parcel.dataPosition() < iW13) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        strK2 = E2.a.k(parcel, i13);
                    } else if (c9 != 2) {
                        E2.a.T(parcel, i13);
                    } else {
                        bundleF = E2.a.f(parcel, i13);
                    }
                }
                E2.a.r(parcel, iW13);
                return new W0.g(strK2, bundleF);
            case 14:
                int iW14 = E2.a.W(parcel);
                String strK3 = StringUtils.EMPTY;
                String strK4 = strK3;
                String strK5 = strK4;
                Bundle bundleF2 = null;
                Bundle bundleF3 = null;
                String strK6 = null;
                while (parcel.dataPosition() < iW14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strK3 = E2.a.k(parcel, i14);
                            break;
                        case 2:
                            bundleF2 = E2.a.f(parcel, i14);
                            break;
                        case 3:
                            bundleF3 = E2.a.f(parcel, i14);
                            break;
                        case 4:
                            strK6 = E2.a.k(parcel, i14);
                            break;
                        case 5:
                            strK4 = E2.a.k(parcel, i14);
                            break;
                        case 6:
                            strK5 = E2.a.k(parcel, i14);
                            break;
                        default:
                            E2.a.T(parcel, i14);
                            break;
                    }
                }
                E2.a.r(parcel, iW14);
                return new W0.h(strK3, bundleF2, bundleF3, strK6, strK4, strK5);
            case 15:
                int iW15 = E2.a.W(parcel);
                Bundle bundleF4 = null;
                while (parcel.dataPosition() < iW15) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        E2.a.T(parcel, i15);
                    } else {
                        bundleF4 = E2.a.f(parcel, i15);
                    }
                }
                E2.a.r(parcel, iW15);
                return new W0.i(bundleF4);
            case 16:
                int iW16 = E2.a.W(parcel);
                Bundle bundleF5 = null;
                while (parcel.dataPosition() < iW16) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        E2.a.T(parcel, i16);
                    } else {
                        bundleF5 = E2.a.f(parcel, i16);
                    }
                }
                E2.a.r(parcel, iW16);
                return new W0.j(bundleF5);
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                int iW17 = E2.a.W(parcel);
                ArrayList arrayListN = null;
                Bundle bundleF6 = null;
                String strK7 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iW17) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 1) {
                        arrayListN = E2.a.n(parcel, i17, W0.h.CREATOR);
                    } else if (c10 == 2) {
                        bundleF6 = E2.a.f(parcel, i17);
                    } else if (c10 == 3) {
                        strK7 = E2.a.k(parcel, i17);
                    } else if (c10 != 4) {
                        E2.a.T(parcel, i17);
                    } else {
                        resultReceiver = (ResultReceiver) E2.a.j(parcel, i17, ResultReceiver.CREATOR);
                    }
                }
                E2.a.r(parcel, iW17);
                return new GetCredentialRequest(arrayListN, bundleF6, strK7, resultReceiver);
            case 18:
                int iW18 = E2.a.W(parcel);
                Bundle bundleF7 = null;
                while (parcel.dataPosition() < iW18) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        E2.a.T(parcel, i18);
                    } else {
                        bundleF7 = E2.a.f(parcel, i18);
                    }
                }
                E2.a.r(parcel, iW18);
                return new W0.k(bundleF7);
            case 19:
                int iW19 = E2.a.W(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iW19) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        E2.a.T(parcel, i19);
                    } else {
                        pendingIntent2 = (PendingIntent) E2.a.j(parcel, i19, PendingIntent.CREATOR);
                    }
                }
                E2.a.r(parcel, iW19);
                return new W0.l(pendingIntent2);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                int iW20 = E2.a.W(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iW20) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        E2.a.T(parcel, i20);
                    } else {
                        pendingIntent3 = (PendingIntent) E2.a.j(parcel, i20, PendingIntent.CREATOR);
                    }
                }
                E2.a.r(parcel, iW20);
                return new W0.m(pendingIntent3);
            case 21:
                int iW21 = E2.a.W(parcel);
                while (parcel.dataPosition() < iW21) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, iW21);
                return new W0.n();
            case 22:
                int iW22 = E2.a.W(parcel);
                while (parcel.dataPosition() < iW22) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, iW22);
                return new o();
            case 23:
                int iW23 = E2.a.W(parcel);
                while (parcel.dataPosition() < iW23) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, iW23);
                return new p();
            case 24:
                int iW24 = E2.a.W(parcel);
                while (parcel.dataPosition() < iW24) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, iW24);
                return new q();
            case 25:
                return new C0147b(parcel);
            case 26:
                return new C0148c(parcel);
            case 27:
                E e4 = new E();
                e4.f2349k = parcel.readString();
                e4.f2350l = parcel.readInt();
                return e4;
            case 28:
                p003b0.J j3 = new p003b0.J();
                j3.f2394o = null;
                j3.f2395p = new ArrayList();
                j3.f2396q = new ArrayList();
                j3.f2391k = parcel.createStringArrayList();
                j3.f2392l = parcel.createStringArrayList();
                j3.f2393m = (C0147b[]) parcel.createTypedArray(C0147b.CREATOR);
                j3.n = parcel.readInt();
                j3.f2394o = parcel.readString();
                j3.f2395p = parcel.createStringArrayList();
                j3.f2396q = parcel.createTypedArrayList(C0148c.CREATOR);
                j3.f2397r = parcel.createTypedArrayList(E.CREATOR);
                return j3;
            default:
                return new N(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f1528a) {
            case 0:
                return new b[i3];
            case 1:
                return new m[i3];
            case 2:
                return new n[i3];
            case 3:
                return new c[i3];
            case 4:
                return new d[i3];
            case 5:
                return new e[i3];
            case 6:
                return new h[i3];
            case 7:
                return new W0.a[i3];
            case 8:
                return new W0.b[i3];
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                return new W0.c[i3];
            case 10:
                return new W0.d[i3];
            case 11:
                return new W0.e[i3];
            case 12:
                return new W0.f[i3];
            case 13:
                return new W0.g[i3];
            case 14:
                return new W0.h[i3];
            case 15:
                return new W0.i[i3];
            case 16:
                return new W0.j[i3];
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                return new GetCredentialRequest[i3];
            case 18:
                return new W0.k[i3];
            case 19:
                return new W0.l[i3];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new W0.m[i3];
            case 21:
                return new W0.n[i3];
            case 22:
                return new o[i3];
            case 23:
                return new p[i3];
            case 24:
                return new q[i3];
            case 25:
                return new C0147b[i3];
            case 26:
                return new C0148c[i3];
            case 27:
                return new E[i3];
            case 28:
                return new p003b0.J[i3];
            default:
                return new N[i3];
        }
    }
}
