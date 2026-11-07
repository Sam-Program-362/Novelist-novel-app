package F0;

import M0.C0048d;
import M0.C0049e;
import M0.C0051g;
import M0.o;
import M0.z;
import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f340a;

    public /* synthetic */ l(int i3) {
        this.f340a = i3;
    }

    public static void a(C0049e c0049e, Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        int i4 = c0049e.f938k;
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(i4);
        int i5 = c0049e.f939l;
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(i5);
        int i6 = c0049e.f940m;
        H2.h.P(parcel, 3, 4);
        parcel.writeInt(i6);
        H2.h.K(parcel, 4, c0049e.n);
        IBinder iBinder = c0049e.f941o;
        if (iBinder != null) {
            int iQ2 = H2.h.Q(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            H2.h.R(parcel, iQ2);
        }
        H2.h.M(parcel, 6, c0049e.f942p, i3);
        H2.h.G(parcel, 7, c0049e.f943q);
        H2.h.J(parcel, 8, c0049e.f944r, i3);
        H2.h.M(parcel, 10, c0049e.f945s, i3);
        H2.h.M(parcel, 11, c0049e.f946t, i3);
        boolean z3 = c0049e.u;
        H2.h.P(parcel, 12, 4);
        parcel.writeInt(z3 ? 1 : 0);
        int i7 = c0049e.f947v;
        H2.h.P(parcel, 13, 4);
        parcel.writeInt(i7);
        boolean z4 = c0049e.f948w;
        H2.h.P(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        H2.h.K(parcel, 15, c0049e.x);
        H2.h.R(parcel, iQ);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Integer numValueOf;
        switch (this.f340a) {
            case 0:
                int iW = E2.a.W(parcel);
                boolean zG = false;
                boolean zG2 = false;
                boolean zG3 = false;
                boolean zG4 = false;
                int iH = 0;
                ArrayList arrayListN = null;
                String strK = null;
                Account account = null;
                String strK2 = null;
                String strK3 = null;
                Bundle bundleF = null;
                while (parcel.dataPosition() < iW) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            arrayListN = E2.a.n(parcel, i3, Scope.CREATOR);
                            break;
                        case 2:
                            strK = E2.a.k(parcel, i3);
                            break;
                        case 3:
                            zG = E2.a.G(parcel, i3);
                            break;
                        case 4:
                            zG2 = E2.a.G(parcel, i3);
                            break;
                        case 5:
                            account = (Account) E2.a.j(parcel, i3, Account.CREATOR);
                            break;
                        case 6:
                            strK2 = E2.a.k(parcel, i3);
                            break;
                        case 7:
                            strK3 = E2.a.k(parcel, i3);
                            break;
                        case '\b':
                            zG3 = E2.a.G(parcel, i3);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            bundleF = E2.a.f(parcel, i3);
                            break;
                        case '\n':
                            zG4 = E2.a.G(parcel, i3);
                            break;
                        case 11:
                            iH = E2.a.H(parcel, i3);
                            break;
                        default:
                            E2.a.T(parcel, i3);
                            break;
                    }
                }
                E2.a.r(parcel, iW);
                return new AuthorizationRequest(arrayListN, strK, zG, zG2, account, strK2, strK3, zG3, bundleF, zG4, iH);
            case 1:
                int iW2 = E2.a.W(parcel);
                String strK4 = null;
                String strK5 = null;
                String strK6 = null;
                ArrayList arrayListL = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent = null;
                Bundle bundleF2 = null;
                while (parcel.dataPosition() < iW2) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            strK4 = E2.a.k(parcel, i4);
                            break;
                        case 2:
                            strK5 = E2.a.k(parcel, i4);
                            break;
                        case 3:
                            strK6 = E2.a.k(parcel, i4);
                            break;
                        case 4:
                            arrayListL = E2.a.l(parcel, i4);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) E2.a.j(parcel, i4, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent = (PendingIntent) E2.a.j(parcel, i4, PendingIntent.CREATOR);
                            break;
                        case 7:
                            bundleF2 = E2.a.f(parcel, i4);
                            break;
                        default:
                            E2.a.T(parcel, i4);
                            break;
                    }
                }
                E2.a.r(parcel, iW2);
                return new a(strK4, strK5, strK6, arrayListL, googleSignInAccount, pendingIntent, bundleF2);
            case 2:
                int iW3 = E2.a.W(parcel);
                boolean zG5 = false;
                int iH2 = 0;
                boolean zG6 = false;
                f fVar = null;
                c cVar = null;
                String strK7 = null;
                e eVar = null;
                d dVar = null;
                while (parcel.dataPosition() < iW3) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            fVar = (f) E2.a.j(parcel, i5, f.CREATOR);
                            break;
                        case 2:
                            cVar = (c) E2.a.j(parcel, i5, c.CREATOR);
                            break;
                        case 3:
                            strK7 = E2.a.k(parcel, i5);
                            break;
                        case 4:
                            zG5 = E2.a.G(parcel, i5);
                            break;
                        case 5:
                            iH2 = E2.a.H(parcel, i5);
                            break;
                        case 6:
                            eVar = (e) E2.a.j(parcel, i5, e.CREATOR);
                            break;
                        case 7:
                            dVar = (d) E2.a.j(parcel, i5, d.CREATOR);
                            break;
                        case '\b':
                            zG6 = E2.a.G(parcel, i5);
                            break;
                        default:
                            E2.a.T(parcel, i5);
                            break;
                    }
                }
                E2.a.r(parcel, iW3);
                return new g(fVar, cVar, strK7, zG5, iH2, eVar, dVar, zG6);
            case 3:
                int iW4 = E2.a.W(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iW4) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        E2.a.T(parcel, i6);
                    } else {
                        pendingIntent2 = (PendingIntent) E2.a.j(parcel, i6, PendingIntent.CREATOR);
                    }
                }
                E2.a.r(parcel, iW4);
                return new h(pendingIntent2);
            case 4:
                int iW5 = E2.a.W(parcel);
                boolean zG7 = false;
                String strK8 = null;
                while (parcel.dataPosition() < iW5) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        strK8 = E2.a.k(parcel, i7);
                    } else if (c3 != 2) {
                        E2.a.T(parcel, i7);
                    } else {
                        zG7 = E2.a.G(parcel, i7);
                    }
                }
                E2.a.r(parcel, iW5);
                return new m(strK8, zG7);
            case 5:
                int iW6 = E2.a.W(parcel);
                String strK9 = null;
                String strK10 = null;
                while (parcel.dataPosition() < iW6) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 1) {
                        strK9 = E2.a.k(parcel, i8);
                    } else if (c4 != 2) {
                        E2.a.T(parcel, i8);
                    } else {
                        strK10 = E2.a.k(parcel, i8);
                    }
                }
                E2.a.r(parcel, iW6);
                return new ClearTokenRequest(strK9, strK10);
            case 6:
                int iW7 = E2.a.W(parcel);
                String strK11 = null;
                String strK12 = null;
                String strK13 = null;
                String strK14 = null;
                ArrayList arrayListN2 = null;
                boolean zG8 = false;
                int iH3 = 0;
                while (parcel.dataPosition() < iW7) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            strK11 = E2.a.k(parcel, i9);
                            break;
                        case 2:
                            strK12 = E2.a.k(parcel, i9);
                            break;
                        case 3:
                            strK13 = E2.a.k(parcel, i9);
                            break;
                        case 4:
                            strK14 = E2.a.k(parcel, i9);
                            break;
                        case 5:
                            zG8 = E2.a.G(parcel, i9);
                            break;
                        case 6:
                            iH3 = E2.a.H(parcel, i9);
                            break;
                        case 7:
                            arrayListN2 = E2.a.n(parcel, i9, m.CREATOR);
                            break;
                        default:
                            E2.a.T(parcel, i9);
                            break;
                    }
                }
                E2.a.r(parcel, iW7);
                return new i(strK11, strK12, strK13, strK14, zG8, iH3, arrayListN2);
            case 7:
                int iW8 = E2.a.W(parcel);
                String strK15 = null;
                String strK16 = null;
                String strK17 = null;
                ArrayList arrayListL2 = null;
                ArrayList arrayListN3 = null;
                String strK18 = null;
                boolean zG9 = false;
                boolean zG10 = false;
                boolean zG11 = false;
                while (parcel.dataPosition() < iW8) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            zG9 = E2.a.G(parcel, i10);
                            break;
                        case 2:
                            strK15 = E2.a.k(parcel, i10);
                            break;
                        case 3:
                            strK16 = E2.a.k(parcel, i10);
                            break;
                        case 4:
                            zG10 = E2.a.G(parcel, i10);
                            break;
                        case 5:
                            strK17 = E2.a.k(parcel, i10);
                            break;
                        case 6:
                            arrayListL2 = E2.a.l(parcel, i10);
                            break;
                        case 7:
                            zG11 = E2.a.G(parcel, i10);
                            break;
                        case '\b':
                            arrayListN3 = E2.a.n(parcel, i10, m.CREATOR);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            strK18 = E2.a.k(parcel, i10);
                            break;
                        default:
                            E2.a.T(parcel, i10);
                            break;
                    }
                }
                E2.a.r(parcel, iW8);
                return new c(zG9, strK15, strK16, zG10, strK17, arrayListL2, zG11, arrayListN3, strK18);
            case 8:
                int iW9 = E2.a.W(parcel);
                String strK19 = null;
                boolean zG12 = false;
                while (parcel.dataPosition() < iW9) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        zG12 = E2.a.G(parcel, i11);
                    } else if (c5 != 2) {
                        E2.a.T(parcel, i11);
                    } else {
                        strK19 = E2.a.k(parcel, i11);
                    }
                }
                E2.a.r(parcel, iW9);
                return new d(strK19, zG12);
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                int iW10 = E2.a.W(parcel);
                byte[] bArrG = null;
                boolean zG13 = false;
                String strK20 = null;
                while (parcel.dataPosition() < iW10) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        zG13 = E2.a.G(parcel, i12);
                    } else if (c6 == 2) {
                        bArrG = E2.a.g(parcel, i12);
                    } else if (c6 != 3) {
                        E2.a.T(parcel, i12);
                    } else {
                        strK20 = E2.a.k(parcel, i12);
                    }
                }
                E2.a.r(parcel, iW10);
                return new e(zG13, bArrG, strK20);
            case 10:
                int iW11 = E2.a.W(parcel);
                boolean zG14 = false;
                while (parcel.dataPosition() < iW11) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        E2.a.T(parcel, i13);
                    } else {
                        zG14 = E2.a.G(parcel, i13);
                    }
                }
                E2.a.r(parcel, iW11);
                return new f(zG14);
            case 11:
                int iW12 = E2.a.W(parcel);
                ArrayList arrayListN4 = null;
                Account account2 = null;
                String strK21 = null;
                while (parcel.dataPosition() < iW12) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        arrayListN4 = E2.a.n(parcel, i14, Scope.CREATOR);
                    } else if (c7 == 2) {
                        account2 = (Account) E2.a.j(parcel, i14, Account.CREATOR);
                    } else if (c7 != 3) {
                        E2.a.T(parcel, i14);
                    } else {
                        strK21 = E2.a.k(parcel, i14);
                    }
                }
                E2.a.r(parcel, iW12);
                return new RevokeAccessRequest(arrayListN4, account2, strK21);
            case 12:
                int iW13 = E2.a.W(parcel);
                String strK22 = null;
                String strK23 = null;
                String strK24 = null;
                String strK25 = null;
                Uri uri = null;
                String strK26 = null;
                String strK27 = null;
                String strK28 = null;
                V0.i iVar = null;
                while (parcel.dataPosition() < iW13) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strK22 = E2.a.k(parcel, i15);
                            break;
                        case 2:
                            strK23 = E2.a.k(parcel, i15);
                            break;
                        case 3:
                            strK24 = E2.a.k(parcel, i15);
                            break;
                        case 4:
                            strK25 = E2.a.k(parcel, i15);
                            break;
                        case 5:
                            uri = (Uri) E2.a.j(parcel, i15, Uri.CREATOR);
                            break;
                        case 6:
                            strK26 = E2.a.k(parcel, i15);
                            break;
                        case 7:
                            strK27 = E2.a.k(parcel, i15);
                            break;
                        case '\b':
                            strK28 = E2.a.k(parcel, i15);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            iVar = (V0.i) E2.a.j(parcel, i15, V0.i.CREATOR);
                            break;
                        default:
                            E2.a.T(parcel, i15);
                            break;
                    }
                }
                E2.a.r(parcel, iW13);
                return new j(strK22, strK23, strK24, strK25, uri, strK26, strK27, strK28, iVar);
            case 13:
                G.g gVar = new G.g(parcel);
                gVar.f377k = parcel.readInt();
                return gVar;
            case 14:
                int iW14 = E2.a.W(parcel);
                Bundle bundleF3 = null;
                int iH4 = 0;
                int iH5 = 0;
                while (parcel.dataPosition() < iW14) {
                    int i16 = parcel.readInt();
                    char c8 = (char) i16;
                    if (c8 == 1) {
                        iH4 = E2.a.H(parcel, i16);
                    } else if (c8 == 2) {
                        iH5 = E2.a.H(parcel, i16);
                    } else if (c8 != 3) {
                        E2.a.T(parcel, i16);
                    } else {
                        bundleF3 = E2.a.f(parcel, i16);
                    }
                }
                E2.a.r(parcel, iW14);
                return new H0.a(iH4, iH5, bundleF3);
            case 15:
                int iW15 = E2.a.W(parcel);
                String strK29 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iW15) {
                    int i17 = parcel.readInt();
                    char c9 = (char) i17;
                    if (c9 == 2) {
                        strK29 = E2.a.k(parcel, i17);
                    } else if (c9 != 5) {
                        E2.a.T(parcel, i17);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) E2.a.j(parcel, i17, GoogleSignInOptions.CREATOR);
                    }
                }
                E2.a.r(parcel, iW15);
                return new SignInConfiguration(strK29, googleSignInOptions);
            case 16:
                int iW16 = E2.a.W(parcel);
                PendingIntent pendingIntent3 = null;
                String strK30 = null;
                Integer num = null;
                int iH6 = 0;
                int iH7 = 0;
                while (parcel.dataPosition() < iW16) {
                    int i18 = parcel.readInt();
                    char c10 = (char) i18;
                    if (c10 == 1) {
                        iH6 = E2.a.H(parcel, i18);
                    } else if (c10 == 2) {
                        iH7 = E2.a.H(parcel, i18);
                    } else if (c10 == 3) {
                        pendingIntent3 = (PendingIntent) E2.a.j(parcel, i18, PendingIntent.CREATOR);
                    } else if (c10 == 4) {
                        strK30 = E2.a.k(parcel, i18);
                    } else if (c10 != 5) {
                        E2.a.T(parcel, i18);
                    } else {
                        int iJ = E2.a.J(parcel, i18);
                        if (iJ == 0) {
                            numValueOf = null;
                        } else {
                            if (iJ != 4) {
                                String hexString = Integer.toHexString(iJ);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(iJ).length() + 4 + 1);
                                sb.append("Expected size ");
                                sb.append(4);
                                sb.append(" got ");
                                sb.append(iJ);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new D0.a(sb.toString(), parcel);
                            }
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                        num = numValueOf;
                    }
                }
                E2.a.r(parcel, iW16);
                return new J0.a(iH6, iH7, pendingIntent3, strK30, num);
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                int iW17 = E2.a.W(parcel);
                int iH8 = 0;
                boolean zG15 = false;
                long jI = -1;
                String strK31 = null;
                while (parcel.dataPosition() < iW17) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        strK31 = E2.a.k(parcel, i19);
                    } else if (c11 == 2) {
                        iH8 = E2.a.H(parcel, i19);
                    } else if (c11 == 3) {
                        jI = E2.a.I(parcel, i19);
                    } else if (c11 != 4) {
                        E2.a.T(parcel, i19);
                    } else {
                        zG15 = E2.a.G(parcel, i19);
                    }
                }
                E2.a.r(parcel, iW17);
                return new J0.c(strK31, iH8, jI, zG15);
            case 18:
                int iW18 = E2.a.W(parcel);
                ArrayList arrayListN5 = null;
                int iH9 = 0;
                while (parcel.dataPosition() < iW18) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        iH9 = E2.a.H(parcel, i20);
                    } else if (c12 != 2) {
                        E2.a.T(parcel, i20);
                    } else {
                        arrayListN5 = E2.a.n(parcel, i20, C0051g.CREATOR);
                    }
                }
                E2.a.r(parcel, iW18);
                return new M0.j(iH9, arrayListN5);
            case 19:
                int iW19 = E2.a.W(parcel);
                int iH10 = -1;
                int iH11 = 0;
                int iH12 = 0;
                int iH13 = 0;
                int iH14 = 0;
                String strK32 = null;
                String strK33 = null;
                long jI2 = 0;
                long jI3 = 0;
                while (parcel.dataPosition() < iW19) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iH11 = E2.a.H(parcel, i21);
                            break;
                        case 2:
                            iH12 = E2.a.H(parcel, i21);
                            break;
                        case 3:
                            iH13 = E2.a.H(parcel, i21);
                            break;
                        case 4:
                            jI2 = E2.a.I(parcel, i21);
                            break;
                        case 5:
                            jI3 = E2.a.I(parcel, i21);
                            break;
                        case 6:
                            strK32 = E2.a.k(parcel, i21);
                            break;
                        case 7:
                            strK33 = E2.a.k(parcel, i21);
                            break;
                        case '\b':
                            iH14 = E2.a.H(parcel, i21);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            iH10 = E2.a.H(parcel, i21);
                            break;
                        default:
                            E2.a.T(parcel, i21);
                            break;
                    }
                }
                E2.a.r(parcel, iW19);
                return new C0051g(iH11, iH12, iH13, jI2, jI3, strK32, strK33, iH14, iH10);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                int iW20 = E2.a.W(parcel);
                Account account3 = null;
                int iH15 = 0;
                int iH16 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < iW20) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 1) {
                        iH15 = E2.a.H(parcel, i22);
                    } else if (c13 == 2) {
                        account3 = (Account) E2.a.j(parcel, i22, Account.CREATOR);
                    } else if (c13 == 3) {
                        iH16 = E2.a.H(parcel, i22);
                    } else if (c13 != 4) {
                        E2.a.T(parcel, i22);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) E2.a.j(parcel, i22, GoogleSignInAccount.CREATOR);
                    }
                }
                E2.a.r(parcel, iW20);
                return new M0.n(iH15, account3, iH16, googleSignInAccount2);
            case 21:
                int iW21 = E2.a.W(parcel);
                int iH17 = 0;
                boolean zG16 = false;
                boolean zG17 = false;
                IBinder strongBinder = null;
                J0.a aVar = null;
                while (parcel.dataPosition() < iW21) {
                    int i23 = parcel.readInt();
                    char c14 = (char) i23;
                    if (c14 == 1) {
                        iH17 = E2.a.H(parcel, i23);
                    } else if (c14 == 2) {
                        int iJ2 = E2.a.J(parcel, i23);
                        int iDataPosition = parcel.dataPosition();
                        if (iJ2 == 0) {
                            strongBinder = null;
                        } else {
                            strongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(iDataPosition + iJ2);
                        }
                    } else if (c14 == 3) {
                        aVar = (J0.a) E2.a.j(parcel, i23, J0.a.CREATOR);
                    } else if (c14 == 4) {
                        zG16 = E2.a.G(parcel, i23);
                    } else if (c14 != 5) {
                        E2.a.T(parcel, i23);
                    } else {
                        zG17 = E2.a.G(parcel, i23);
                    }
                }
                E2.a.r(parcel, iW21);
                return new o(iH17, strongBinder, aVar, zG16, zG17);
            case 22:
                int iW22 = E2.a.W(parcel);
                int iH18 = 0;
                boolean zG18 = false;
                boolean zG19 = false;
                int iH19 = 0;
                int iH20 = 0;
                while (parcel.dataPosition() < iW22) {
                    int i24 = parcel.readInt();
                    char c15 = (char) i24;
                    if (c15 == 1) {
                        iH18 = E2.a.H(parcel, i24);
                    } else if (c15 == 2) {
                        zG18 = E2.a.G(parcel, i24);
                    } else if (c15 == 3) {
                        zG19 = E2.a.G(parcel, i24);
                    } else if (c15 == 4) {
                        iH19 = E2.a.H(parcel, i24);
                    } else if (c15 != 5) {
                        E2.a.T(parcel, i24);
                    } else {
                        iH20 = E2.a.H(parcel, i24);
                    }
                }
                E2.a.r(parcel, iW22);
                return new M0.i(iH18, zG18, zG19, iH19, iH20);
            case 23:
                int iW23 = E2.a.W(parcel);
                Bundle bundleF4 = null;
                C0048d c0048d = null;
                int iH21 = 0;
                J0.c[] cVarArr = null;
                while (parcel.dataPosition() < iW23) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 1) {
                        bundleF4 = E2.a.f(parcel, i25);
                    } else if (c16 == 2) {
                        cVarArr = (J0.c[]) E2.a.m(parcel, i25, J0.c.CREATOR);
                    } else if (c16 == 3) {
                        iH21 = E2.a.H(parcel, i25);
                    } else if (c16 != 4) {
                        E2.a.T(parcel, i25);
                    } else {
                        c0048d = (C0048d) E2.a.j(parcel, i25, C0048d.CREATOR);
                    }
                }
                E2.a.r(parcel, iW23);
                z zVar = new z();
                zVar.f999k = bundleF4;
                zVar.f1000l = cVarArr;
                zVar.f1001m = iH21;
                zVar.n = c0048d;
                return zVar;
            case 24:
                int iW24 = E2.a.W(parcel);
                M0.i iVar2 = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zG20 = false;
                boolean zG21 = false;
                int iH22 = 0;
                while (parcel.dataPosition() < iW24) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            iVar2 = (M0.i) E2.a.j(parcel, i26, M0.i.CREATOR);
                            break;
                        case 2:
                            zG20 = E2.a.G(parcel, i26);
                            break;
                        case 3:
                            zG21 = E2.a.G(parcel, i26);
                            break;
                        case 4:
                            int iJ3 = E2.a.J(parcel, i26);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iJ3 != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iJ3);
                            } else {
                                iArrCreateIntArray = null;
                            }
                            break;
                        case 5:
                            iH22 = E2.a.H(parcel, i26);
                            break;
                        case 6:
                            int iJ4 = E2.a.J(parcel, i26);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iJ4 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iJ4);
                            } else {
                                iArrCreateIntArray2 = null;
                            }
                            break;
                        default:
                            E2.a.T(parcel, i26);
                            break;
                    }
                }
                E2.a.r(parcel, iW24);
                return new C0048d(iVar2, zG20, zG21, iArrCreateIntArray, iH22, iArrCreateIntArray2);
            case 25:
                int iW25 = E2.a.W(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = C0049e.y;
                String strK34 = null;
                IBinder iBinder = null;
                Account account4 = null;
                String strK35 = null;
                int iH23 = 0;
                int iH24 = 0;
                int iH25 = 0;
                boolean zG22 = false;
                int iH26 = 0;
                boolean zG23 = false;
                J0.c[] cVarArr2 = C0049e.f937z;
                J0.c[] cVarArr3 = cVarArr2;
                while (parcel.dataPosition() < iW25) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            iH23 = E2.a.H(parcel, i27);
                            break;
                        case 2:
                            iH24 = E2.a.H(parcel, i27);
                            break;
                        case 3:
                            iH25 = E2.a.H(parcel, i27);
                            break;
                        case 4:
                            strK34 = E2.a.k(parcel, i27);
                            break;
                        case 5:
                            int iJ5 = E2.a.J(parcel, i27);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iJ5 != 0) {
                                IBinder strongBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition4 + iJ5);
                                iBinder = strongBinder2;
                            } else {
                                iBinder = null;
                            }
                            break;
                        case 6:
                            scopeArr = (Scope[]) E2.a.m(parcel, i27, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = E2.a.f(parcel, i27);
                            break;
                        case '\b':
                            account4 = (Account) E2.a.j(parcel, i27, Account.CREATOR);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        default:
                            E2.a.T(parcel, i27);
                            break;
                        case '\n':
                            cVarArr2 = (J0.c[]) E2.a.m(parcel, i27, J0.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (J0.c[]) E2.a.m(parcel, i27, J0.c.CREATOR);
                            break;
                        case '\f':
                            zG22 = E2.a.G(parcel, i27);
                            break;
                        case '\r':
                            iH26 = E2.a.H(parcel, i27);
                            break;
                        case 14:
                            zG23 = E2.a.G(parcel, i27);
                            break;
                        case 15:
                            strK35 = E2.a.k(parcel, i27);
                            break;
                    }
                }
                E2.a.r(parcel, iW25);
                return new C0049e(iH23, iH24, iH25, strK34, iBinder, scopeArr, bundle, account4, cVarArr2, cVarArr3, zG22, iH26, zG23, strK35);
            case 26:
                int iW26 = E2.a.W(parcel);
                String strK36 = null;
                String strK37 = null;
                byte[] bArrG2 = null;
                V0.d dVar2 = null;
                V0.c cVar2 = null;
                V0.e eVar2 = null;
                V0.a aVar2 = null;
                String strK38 = null;
                while (parcel.dataPosition() < iW26) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            strK36 = E2.a.k(parcel, i28);
                            break;
                        case 2:
                            strK37 = E2.a.k(parcel, i28);
                            break;
                        case 3:
                            bArrG2 = E2.a.g(parcel, i28);
                            break;
                        case 4:
                            dVar2 = (V0.d) E2.a.j(parcel, i28, V0.d.CREATOR);
                            break;
                        case 5:
                            cVar2 = (V0.c) E2.a.j(parcel, i28, V0.c.CREATOR);
                            break;
                        case 6:
                            eVar2 = (V0.e) E2.a.j(parcel, i28, V0.e.CREATOR);
                            break;
                        case 7:
                            aVar2 = (V0.a) E2.a.j(parcel, i28, V0.a.CREATOR);
                            break;
                        case '\b':
                            strK38 = E2.a.k(parcel, i28);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            E2.a.k(parcel, i28);
                            break;
                        default:
                            E2.a.T(parcel, i28);
                            break;
                    }
                }
                E2.a.r(parcel, iW26);
                return new V0.i(strK36, strK37, bArrG2, dVar2, cVar2, eVar2, aVar2, strK38);
            case 27:
                int iW27 = E2.a.W(parcel);
                ArrayList arrayListN6 = null;
                while (parcel.dataPosition() < iW27) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        E2.a.T(parcel, i29);
                    } else {
                        arrayListN6 = E2.a.n(parcel, i29, V0.k.CREATOR);
                    }
                }
                E2.a.r(parcel, iW27);
                return new V0.j(arrayListN6);
            case 28:
                int iW28 = E2.a.W(parcel);
                int iH27 = 0;
                short s3 = 0;
                short s4 = 0;
                while (parcel.dataPosition() < iW28) {
                    int i30 = parcel.readInt();
                    char c17 = (char) i30;
                    if (c17 == 1) {
                        iH27 = E2.a.H(parcel, i30);
                    } else if (c17 == 2) {
                        E2.a.a0(parcel, i30, 4);
                        s3 = (short) parcel.readInt();
                    } else if (c17 != 3) {
                        E2.a.T(parcel, i30);
                    } else {
                        E2.a.a0(parcel, i30, 4);
                        s4 = (short) parcel.readInt();
                    }
                }
                E2.a.r(parcel, iW28);
                return new V0.k(iH27, s3, s4);
            default:
                int iW29 = E2.a.W(parcel);
                V0.j jVar = null;
                V0.m mVar = null;
                V0.b bVar = null;
                V0.n nVar = null;
                String strK39 = null;
                while (parcel.dataPosition() < iW29) {
                    int i31 = parcel.readInt();
                    char c18 = (char) i31;
                    if (c18 == 1) {
                        jVar = (V0.j) E2.a.j(parcel, i31, V0.j.CREATOR);
                    } else if (c18 == 2) {
                        mVar = (V0.m) E2.a.j(parcel, i31, V0.m.CREATOR);
                    } else if (c18 == 3) {
                        bVar = (V0.b) E2.a.j(parcel, i31, V0.b.CREATOR);
                    } else if (c18 == 4) {
                        nVar = (V0.n) E2.a.j(parcel, i31, V0.n.CREATOR);
                    } else if (c18 != 5) {
                        E2.a.T(parcel, i31);
                    } else {
                        strK39 = E2.a.k(parcel, i31);
                    }
                }
                E2.a.r(parcel, iW29);
                return new V0.a(jVar, mVar, bVar, nVar, strK39);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f340a) {
            case 0:
                return new AuthorizationRequest[i3];
            case 1:
                return new a[i3];
            case 2:
                return new g[i3];
            case 3:
                return new h[i3];
            case 4:
                return new m[i3];
            case 5:
                return new ClearTokenRequest[i3];
            case 6:
                return new i[i3];
            case 7:
                return new c[i3];
            case 8:
                return new d[i3];
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                return new e[i3];
            case 10:
                return new f[i3];
            case 11:
                return new RevokeAccessRequest[i3];
            case 12:
                return new j[i3];
            case 13:
                return new G.g[i3];
            case 14:
                return new H0.a[i3];
            case 15:
                return new SignInConfiguration[i3];
            case 16:
                return new J0.a[i3];
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                return new J0.c[i3];
            case 18:
                return new M0.j[i3];
            case 19:
                return new C0051g[i3];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new M0.n[i3];
            case 21:
                return new o[i3];
            case 22:
                return new M0.i[i3];
            case 23:
                return new z[i3];
            case 24:
                return new C0048d[i3];
            case 25:
                return new C0049e[i3];
            case 26:
                return new V0.i[i3];
            case 27:
                return new V0.j[i3];
            case 28:
                return new V0.k[i3];
            default:
                return new V0.a[i3];
        }
    }
}
