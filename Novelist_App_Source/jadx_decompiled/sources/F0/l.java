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

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f340a;

    public /* synthetic */ l(int i3) {
        this.f340a = i3;
    }

    public static void a(C0049e c0049e, Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
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
            int Q3 = H2.h.Q(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            H2.h.R(parcel, Q3);
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
        H2.h.R(parcel, Q2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        switch (this.f340a) {
            case 0:
                int W = E2.a.W(parcel);
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                int i3 = 0;
                ArrayList arrayList = null;
                String str = null;
                Account account = null;
                String str2 = null;
                String str3 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < W) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            arrayList = E2.a.n(parcel, readInt, Scope.CREATOR);
                            break;
                        case 2:
                            str = E2.a.k(parcel, readInt);
                            break;
                        case 3:
                            z3 = E2.a.G(parcel, readInt);
                            break;
                        case 4:
                            z4 = E2.a.G(parcel, readInt);
                            break;
                        case 5:
                            account = (Account) E2.a.j(parcel, readInt, Account.CREATOR);
                            break;
                        case 6:
                            str2 = E2.a.k(parcel, readInt);
                            break;
                        case 7:
                            str3 = E2.a.k(parcel, readInt);
                            break;
                        case '\b':
                            z5 = E2.a.G(parcel, readInt);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            bundle = E2.a.f(parcel, readInt);
                            break;
                        case '\n':
                            z6 = E2.a.G(parcel, readInt);
                            break;
                        case 11:
                            i3 = E2.a.H(parcel, readInt);
                            break;
                        default:
                            E2.a.T(parcel, readInt);
                            break;
                    }
                }
                E2.a.r(parcel, W);
                return new AuthorizationRequest(arrayList, str, z3, z4, account, str2, str3, z5, bundle, z6, i3);
            case 1:
                int W2 = E2.a.W(parcel);
                String str4 = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < W2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            str4 = E2.a.k(parcel, readInt2);
                            break;
                        case 2:
                            str5 = E2.a.k(parcel, readInt2);
                            break;
                        case 3:
                            str6 = E2.a.k(parcel, readInt2);
                            break;
                        case 4:
                            arrayList2 = E2.a.l(parcel, readInt2);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) E2.a.j(parcel, readInt2, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent = (PendingIntent) E2.a.j(parcel, readInt2, PendingIntent.CREATOR);
                            break;
                        case 7:
                            bundle2 = E2.a.f(parcel, readInt2);
                            break;
                        default:
                            E2.a.T(parcel, readInt2);
                            break;
                    }
                }
                E2.a.r(parcel, W2);
                return new a(str4, str5, str6, arrayList2, googleSignInAccount, pendingIntent, bundle2);
            case 2:
                int W3 = E2.a.W(parcel);
                boolean z7 = false;
                int i4 = 0;
                boolean z8 = false;
                f fVar = null;
                c cVar = null;
                String str7 = null;
                e eVar = null;
                d dVar = null;
                while (parcel.dataPosition() < W3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            fVar = (f) E2.a.j(parcel, readInt3, f.CREATOR);
                            break;
                        case 2:
                            cVar = (c) E2.a.j(parcel, readInt3, c.CREATOR);
                            break;
                        case 3:
                            str7 = E2.a.k(parcel, readInt3);
                            break;
                        case 4:
                            z7 = E2.a.G(parcel, readInt3);
                            break;
                        case 5:
                            i4 = E2.a.H(parcel, readInt3);
                            break;
                        case 6:
                            eVar = (e) E2.a.j(parcel, readInt3, e.CREATOR);
                            break;
                        case 7:
                            dVar = (d) E2.a.j(parcel, readInt3, d.CREATOR);
                            break;
                        case '\b':
                            z8 = E2.a.G(parcel, readInt3);
                            break;
                        default:
                            E2.a.T(parcel, readInt3);
                            break;
                    }
                }
                E2.a.r(parcel, W3);
                return new g(fVar, cVar, str7, z7, i4, eVar, dVar, z8);
            case 3:
                int W4 = E2.a.W(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < W4) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        E2.a.T(parcel, readInt4);
                    } else {
                        pendingIntent2 = (PendingIntent) E2.a.j(parcel, readInt4, PendingIntent.CREATOR);
                    }
                }
                E2.a.r(parcel, W4);
                return new h(pendingIntent2);
            case 4:
                int W5 = E2.a.W(parcel);
                boolean z9 = false;
                String str8 = null;
                while (parcel.dataPosition() < W5) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        str8 = E2.a.k(parcel, readInt5);
                    } else if (c3 != 2) {
                        E2.a.T(parcel, readInt5);
                    } else {
                        z9 = E2.a.G(parcel, readInt5);
                    }
                }
                E2.a.r(parcel, W5);
                return new m(str8, z9);
            case 5:
                int W6 = E2.a.W(parcel);
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < W6) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 1) {
                        str9 = E2.a.k(parcel, readInt6);
                    } else if (c4 != 2) {
                        E2.a.T(parcel, readInt6);
                    } else {
                        str10 = E2.a.k(parcel, readInt6);
                    }
                }
                E2.a.r(parcel, W6);
                return new ClearTokenRequest(str9, str10);
            case 6:
                int W7 = E2.a.W(parcel);
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                ArrayList arrayList3 = null;
                boolean z10 = false;
                int i5 = 0;
                while (parcel.dataPosition() < W7) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str11 = E2.a.k(parcel, readInt7);
                            break;
                        case 2:
                            str12 = E2.a.k(parcel, readInt7);
                            break;
                        case 3:
                            str13 = E2.a.k(parcel, readInt7);
                            break;
                        case 4:
                            str14 = E2.a.k(parcel, readInt7);
                            break;
                        case 5:
                            z10 = E2.a.G(parcel, readInt7);
                            break;
                        case 6:
                            i5 = E2.a.H(parcel, readInt7);
                            break;
                        case 7:
                            arrayList3 = E2.a.n(parcel, readInt7, m.CREATOR);
                            break;
                        default:
                            E2.a.T(parcel, readInt7);
                            break;
                    }
                }
                E2.a.r(parcel, W7);
                return new i(str11, str12, str13, str14, z10, i5, arrayList3);
            case 7:
                int W8 = E2.a.W(parcel);
                String str15 = null;
                String str16 = null;
                String str17 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                String str18 = null;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                while (parcel.dataPosition() < W8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            z11 = E2.a.G(parcel, readInt8);
                            break;
                        case 2:
                            str15 = E2.a.k(parcel, readInt8);
                            break;
                        case 3:
                            str16 = E2.a.k(parcel, readInt8);
                            break;
                        case 4:
                            z12 = E2.a.G(parcel, readInt8);
                            break;
                        case 5:
                            str17 = E2.a.k(parcel, readInt8);
                            break;
                        case 6:
                            arrayList4 = E2.a.l(parcel, readInt8);
                            break;
                        case 7:
                            z13 = E2.a.G(parcel, readInt8);
                            break;
                        case '\b':
                            arrayList5 = E2.a.n(parcel, readInt8, m.CREATOR);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            str18 = E2.a.k(parcel, readInt8);
                            break;
                        default:
                            E2.a.T(parcel, readInt8);
                            break;
                    }
                }
                E2.a.r(parcel, W8);
                return new c(z11, str15, str16, z12, str17, arrayList4, z13, arrayList5, str18);
            case 8:
                int W9 = E2.a.W(parcel);
                String str19 = null;
                boolean z14 = false;
                while (parcel.dataPosition() < W9) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 == 1) {
                        z14 = E2.a.G(parcel, readInt9);
                    } else if (c5 != 2) {
                        E2.a.T(parcel, readInt9);
                    } else {
                        str19 = E2.a.k(parcel, readInt9);
                    }
                }
                E2.a.r(parcel, W9);
                return new d(str19, z14);
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                int W10 = E2.a.W(parcel);
                byte[] bArr = null;
                boolean z15 = false;
                String str20 = null;
                while (parcel.dataPosition() < W10) {
                    int readInt10 = parcel.readInt();
                    char c6 = (char) readInt10;
                    if (c6 == 1) {
                        z15 = E2.a.G(parcel, readInt10);
                    } else if (c6 == 2) {
                        bArr = E2.a.g(parcel, readInt10);
                    } else if (c6 != 3) {
                        E2.a.T(parcel, readInt10);
                    } else {
                        str20 = E2.a.k(parcel, readInt10);
                    }
                }
                E2.a.r(parcel, W10);
                return new e(z15, bArr, str20);
            case 10:
                int W11 = E2.a.W(parcel);
                boolean z16 = false;
                while (parcel.dataPosition() < W11) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        E2.a.T(parcel, readInt11);
                    } else {
                        z16 = E2.a.G(parcel, readInt11);
                    }
                }
                E2.a.r(parcel, W11);
                return new f(z16);
            case 11:
                int W12 = E2.a.W(parcel);
                ArrayList arrayList6 = null;
                Account account2 = null;
                String str21 = null;
                while (parcel.dataPosition() < W12) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 1) {
                        arrayList6 = E2.a.n(parcel, readInt12, Scope.CREATOR);
                    } else if (c7 == 2) {
                        account2 = (Account) E2.a.j(parcel, readInt12, Account.CREATOR);
                    } else if (c7 != 3) {
                        E2.a.T(parcel, readInt12);
                    } else {
                        str21 = E2.a.k(parcel, readInt12);
                    }
                }
                E2.a.r(parcel, W12);
                return new RevokeAccessRequest(arrayList6, account2, str21);
            case 12:
                int W13 = E2.a.W(parcel);
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                Uri uri = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                V0.i iVar = null;
                while (parcel.dataPosition() < W13) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            str22 = E2.a.k(parcel, readInt13);
                            break;
                        case 2:
                            str23 = E2.a.k(parcel, readInt13);
                            break;
                        case 3:
                            str24 = E2.a.k(parcel, readInt13);
                            break;
                        case 4:
                            str25 = E2.a.k(parcel, readInt13);
                            break;
                        case 5:
                            uri = (Uri) E2.a.j(parcel, readInt13, Uri.CREATOR);
                            break;
                        case 6:
                            str26 = E2.a.k(parcel, readInt13);
                            break;
                        case 7:
                            str27 = E2.a.k(parcel, readInt13);
                            break;
                        case '\b':
                            str28 = E2.a.k(parcel, readInt13);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            iVar = (V0.i) E2.a.j(parcel, readInt13, V0.i.CREATOR);
                            break;
                        default:
                            E2.a.T(parcel, readInt13);
                            break;
                    }
                }
                E2.a.r(parcel, W13);
                return new j(str22, str23, str24, str25, uri, str26, str27, str28, iVar);
            case 13:
                G.g gVar = new G.g(parcel);
                gVar.f377k = parcel.readInt();
                return gVar;
            case 14:
                int W14 = E2.a.W(parcel);
                Bundle bundle3 = null;
                int i6 = 0;
                int i7 = 0;
                while (parcel.dataPosition() < W14) {
                    int readInt14 = parcel.readInt();
                    char c8 = (char) readInt14;
                    if (c8 == 1) {
                        i6 = E2.a.H(parcel, readInt14);
                    } else if (c8 == 2) {
                        i7 = E2.a.H(parcel, readInt14);
                    } else if (c8 != 3) {
                        E2.a.T(parcel, readInt14);
                    } else {
                        bundle3 = E2.a.f(parcel, readInt14);
                    }
                }
                E2.a.r(parcel, W14);
                return new H0.a(i6, i7, bundle3);
            case 15:
                int W15 = E2.a.W(parcel);
                String str29 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < W15) {
                    int readInt15 = parcel.readInt();
                    char c9 = (char) readInt15;
                    if (c9 == 2) {
                        str29 = E2.a.k(parcel, readInt15);
                    } else if (c9 != 5) {
                        E2.a.T(parcel, readInt15);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) E2.a.j(parcel, readInt15, GoogleSignInOptions.CREATOR);
                    }
                }
                E2.a.r(parcel, W15);
                return new SignInConfiguration(str29, googleSignInOptions);
            case 16:
                int W16 = E2.a.W(parcel);
                PendingIntent pendingIntent3 = null;
                String str30 = null;
                Integer num = null;
                int i8 = 0;
                int i9 = 0;
                while (parcel.dataPosition() < W16) {
                    int readInt16 = parcel.readInt();
                    char c10 = (char) readInt16;
                    if (c10 == 1) {
                        i8 = E2.a.H(parcel, readInt16);
                    } else if (c10 == 2) {
                        i9 = E2.a.H(parcel, readInt16);
                    } else if (c10 == 3) {
                        pendingIntent3 = (PendingIntent) E2.a.j(parcel, readInt16, PendingIntent.CREATOR);
                    } else if (c10 == 4) {
                        str30 = E2.a.k(parcel, readInt16);
                    } else if (c10 != 5) {
                        E2.a.T(parcel, readInt16);
                    } else {
                        int J2 = E2.a.J(parcel, readInt16);
                        if (J2 == 0) {
                            valueOf = null;
                        } else {
                            if (J2 != 4) {
                                String hexString = Integer.toHexString(J2);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(J2).length() + 4 + 1);
                                sb.append("Expected size ");
                                sb.append(4);
                                sb.append(" got ");
                                sb.append(J2);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new D0.a(sb.toString(), parcel);
                            }
                            valueOf = Integer.valueOf(parcel.readInt());
                        }
                        num = valueOf;
                    }
                }
                E2.a.r(parcel, W16);
                return new J0.a(i8, i9, pendingIntent3, str30, num);
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                int W17 = E2.a.W(parcel);
                int i10 = 0;
                boolean z17 = false;
                long j3 = -1;
                String str31 = null;
                while (parcel.dataPosition() < W17) {
                    int readInt17 = parcel.readInt();
                    char c11 = (char) readInt17;
                    if (c11 == 1) {
                        str31 = E2.a.k(parcel, readInt17);
                    } else if (c11 == 2) {
                        i10 = E2.a.H(parcel, readInt17);
                    } else if (c11 == 3) {
                        j3 = E2.a.I(parcel, readInt17);
                    } else if (c11 != 4) {
                        E2.a.T(parcel, readInt17);
                    } else {
                        z17 = E2.a.G(parcel, readInt17);
                    }
                }
                E2.a.r(parcel, W17);
                return new J0.c(str31, i10, j3, z17);
            case 18:
                int W18 = E2.a.W(parcel);
                ArrayList arrayList7 = null;
                int i11 = 0;
                while (parcel.dataPosition() < W18) {
                    int readInt18 = parcel.readInt();
                    char c12 = (char) readInt18;
                    if (c12 == 1) {
                        i11 = E2.a.H(parcel, readInt18);
                    } else if (c12 != 2) {
                        E2.a.T(parcel, readInt18);
                    } else {
                        arrayList7 = E2.a.n(parcel, readInt18, C0051g.CREATOR);
                    }
                }
                E2.a.r(parcel, W18);
                return new M0.j(i11, arrayList7);
            case 19:
                int W19 = E2.a.W(parcel);
                int i12 = -1;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                String str32 = null;
                String str33 = null;
                long j4 = 0;
                long j5 = 0;
                while (parcel.dataPosition() < W19) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            i13 = E2.a.H(parcel, readInt19);
                            break;
                        case 2:
                            i14 = E2.a.H(parcel, readInt19);
                            break;
                        case 3:
                            i15 = E2.a.H(parcel, readInt19);
                            break;
                        case 4:
                            j4 = E2.a.I(parcel, readInt19);
                            break;
                        case 5:
                            j5 = E2.a.I(parcel, readInt19);
                            break;
                        case 6:
                            str32 = E2.a.k(parcel, readInt19);
                            break;
                        case 7:
                            str33 = E2.a.k(parcel, readInt19);
                            break;
                        case '\b':
                            i16 = E2.a.H(parcel, readInt19);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            i12 = E2.a.H(parcel, readInt19);
                            break;
                        default:
                            E2.a.T(parcel, readInt19);
                            break;
                    }
                }
                E2.a.r(parcel, W19);
                return new C0051g(i13, i14, i15, j4, j5, str32, str33, i16, i12);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                int W20 = E2.a.W(parcel);
                Account account3 = null;
                int i17 = 0;
                int i18 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < W20) {
                    int readInt20 = parcel.readInt();
                    char c13 = (char) readInt20;
                    if (c13 == 1) {
                        i17 = E2.a.H(parcel, readInt20);
                    } else if (c13 == 2) {
                        account3 = (Account) E2.a.j(parcel, readInt20, Account.CREATOR);
                    } else if (c13 == 3) {
                        i18 = E2.a.H(parcel, readInt20);
                    } else if (c13 != 4) {
                        E2.a.T(parcel, readInt20);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) E2.a.j(parcel, readInt20, GoogleSignInAccount.CREATOR);
                    }
                }
                E2.a.r(parcel, W20);
                return new M0.n(i17, account3, i18, googleSignInAccount2);
            case 21:
                int W21 = E2.a.W(parcel);
                int i19 = 0;
                boolean z18 = false;
                boolean z19 = false;
                IBinder iBinder = null;
                J0.a aVar = null;
                while (parcel.dataPosition() < W21) {
                    int readInt21 = parcel.readInt();
                    char c14 = (char) readInt21;
                    if (c14 == 1) {
                        i19 = E2.a.H(parcel, readInt21);
                    } else if (c14 == 2) {
                        int J3 = E2.a.J(parcel, readInt21);
                        int dataPosition = parcel.dataPosition();
                        if (J3 == 0) {
                            iBinder = null;
                        } else {
                            iBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition + J3);
                        }
                    } else if (c14 == 3) {
                        aVar = (J0.a) E2.a.j(parcel, readInt21, J0.a.CREATOR);
                    } else if (c14 == 4) {
                        z18 = E2.a.G(parcel, readInt21);
                    } else if (c14 != 5) {
                        E2.a.T(parcel, readInt21);
                    } else {
                        z19 = E2.a.G(parcel, readInt21);
                    }
                }
                E2.a.r(parcel, W21);
                return new o(i19, iBinder, aVar, z18, z19);
            case 22:
                int W22 = E2.a.W(parcel);
                int i20 = 0;
                boolean z20 = false;
                boolean z21 = false;
                int i21 = 0;
                int i22 = 0;
                while (parcel.dataPosition() < W22) {
                    int readInt22 = parcel.readInt();
                    char c15 = (char) readInt22;
                    if (c15 == 1) {
                        i20 = E2.a.H(parcel, readInt22);
                    } else if (c15 == 2) {
                        z20 = E2.a.G(parcel, readInt22);
                    } else if (c15 == 3) {
                        z21 = E2.a.G(parcel, readInt22);
                    } else if (c15 == 4) {
                        i21 = E2.a.H(parcel, readInt22);
                    } else if (c15 != 5) {
                        E2.a.T(parcel, readInt22);
                    } else {
                        i22 = E2.a.H(parcel, readInt22);
                    }
                }
                E2.a.r(parcel, W22);
                return new M0.i(i20, z20, z21, i21, i22);
            case 23:
                int W23 = E2.a.W(parcel);
                Bundle bundle4 = null;
                C0048d c0048d = null;
                int i23 = 0;
                J0.c[] cVarArr = null;
                while (parcel.dataPosition() < W23) {
                    int readInt23 = parcel.readInt();
                    char c16 = (char) readInt23;
                    if (c16 == 1) {
                        bundle4 = E2.a.f(parcel, readInt23);
                    } else if (c16 == 2) {
                        cVarArr = (J0.c[]) E2.a.m(parcel, readInt23, J0.c.CREATOR);
                    } else if (c16 == 3) {
                        i23 = E2.a.H(parcel, readInt23);
                    } else if (c16 != 4) {
                        E2.a.T(parcel, readInt23);
                    } else {
                        c0048d = (C0048d) E2.a.j(parcel, readInt23, C0048d.CREATOR);
                    }
                }
                E2.a.r(parcel, W23);
                z zVar = new z();
                zVar.f999k = bundle4;
                zVar.f1000l = cVarArr;
                zVar.f1001m = i23;
                zVar.n = c0048d;
                return zVar;
            case 24:
                int W24 = E2.a.W(parcel);
                M0.i iVar2 = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z22 = false;
                boolean z23 = false;
                int i24 = 0;
                while (parcel.dataPosition() < W24) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            iVar2 = (M0.i) E2.a.j(parcel, readInt24, M0.i.CREATOR);
                            break;
                        case 2:
                            z22 = E2.a.G(parcel, readInt24);
                            break;
                        case 3:
                            z23 = E2.a.G(parcel, readInt24);
                            break;
                        case 4:
                            int J4 = E2.a.J(parcel, readInt24);
                            int dataPosition2 = parcel.dataPosition();
                            if (J4 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + J4);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i24 = E2.a.H(parcel, readInt24);
                            break;
                        case 6:
                            int J5 = E2.a.J(parcel, readInt24);
                            int dataPosition3 = parcel.dataPosition();
                            if (J5 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + J5);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            E2.a.T(parcel, readInt24);
                            break;
                    }
                }
                E2.a.r(parcel, W24);
                return new C0048d(iVar2, z22, z23, iArr, i24, iArr2);
            case 25:
                int W25 = E2.a.W(parcel);
                Bundle bundle5 = new Bundle();
                Scope[] scopeArr = C0049e.y;
                String str34 = null;
                IBinder iBinder2 = null;
                Account account4 = null;
                String str35 = null;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                boolean z24 = false;
                int i28 = 0;
                boolean z25 = false;
                J0.c[] cVarArr2 = C0049e.f937z;
                J0.c[] cVarArr3 = cVarArr2;
                while (parcel.dataPosition() < W25) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            i25 = E2.a.H(parcel, readInt25);
                            break;
                        case 2:
                            i26 = E2.a.H(parcel, readInt25);
                            break;
                        case 3:
                            i27 = E2.a.H(parcel, readInt25);
                            break;
                        case 4:
                            str34 = E2.a.k(parcel, readInt25);
                            break;
                        case 5:
                            int J6 = E2.a.J(parcel, readInt25);
                            int dataPosition4 = parcel.dataPosition();
                            if (J6 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition4 + J6);
                                iBinder2 = readStrongBinder;
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) E2.a.m(parcel, readInt25, Scope.CREATOR);
                            break;
                        case 7:
                            bundle5 = E2.a.f(parcel, readInt25);
                            break;
                        case '\b':
                            account4 = (Account) E2.a.j(parcel, readInt25, Account.CREATOR);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        default:
                            E2.a.T(parcel, readInt25);
                            break;
                        case '\n':
                            cVarArr2 = (J0.c[]) E2.a.m(parcel, readInt25, J0.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (J0.c[]) E2.a.m(parcel, readInt25, J0.c.CREATOR);
                            break;
                        case '\f':
                            z24 = E2.a.G(parcel, readInt25);
                            break;
                        case '\r':
                            i28 = E2.a.H(parcel, readInt25);
                            break;
                        case 14:
                            z25 = E2.a.G(parcel, readInt25);
                            break;
                        case 15:
                            str35 = E2.a.k(parcel, readInt25);
                            break;
                    }
                }
                E2.a.r(parcel, W25);
                return new C0049e(i25, i26, i27, str34, iBinder2, scopeArr, bundle5, account4, cVarArr2, cVarArr3, z24, i28, z25, str35);
            case 26:
                int W26 = E2.a.W(parcel);
                String str36 = null;
                String str37 = null;
                byte[] bArr2 = null;
                V0.d dVar2 = null;
                V0.c cVar2 = null;
                V0.e eVar2 = null;
                V0.a aVar2 = null;
                String str38 = null;
                while (parcel.dataPosition() < W26) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 1:
                            str36 = E2.a.k(parcel, readInt26);
                            break;
                        case 2:
                            str37 = E2.a.k(parcel, readInt26);
                            break;
                        case 3:
                            bArr2 = E2.a.g(parcel, readInt26);
                            break;
                        case 4:
                            dVar2 = (V0.d) E2.a.j(parcel, readInt26, V0.d.CREATOR);
                            break;
                        case 5:
                            cVar2 = (V0.c) E2.a.j(parcel, readInt26, V0.c.CREATOR);
                            break;
                        case 6:
                            eVar2 = (V0.e) E2.a.j(parcel, readInt26, V0.e.CREATOR);
                            break;
                        case 7:
                            aVar2 = (V0.a) E2.a.j(parcel, readInt26, V0.a.CREATOR);
                            break;
                        case '\b':
                            str38 = E2.a.k(parcel, readInt26);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            E2.a.k(parcel, readInt26);
                            break;
                        default:
                            E2.a.T(parcel, readInt26);
                            break;
                    }
                }
                E2.a.r(parcel, W26);
                return new V0.i(str36, str37, bArr2, dVar2, cVar2, eVar2, aVar2, str38);
            case 27:
                int W27 = E2.a.W(parcel);
                ArrayList arrayList8 = null;
                while (parcel.dataPosition() < W27) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 1) {
                        E2.a.T(parcel, readInt27);
                    } else {
                        arrayList8 = E2.a.n(parcel, readInt27, V0.k.CREATOR);
                    }
                }
                E2.a.r(parcel, W27);
                return new V0.j(arrayList8);
            case 28:
                int W28 = E2.a.W(parcel);
                int i29 = 0;
                short s3 = 0;
                short s4 = 0;
                while (parcel.dataPosition() < W28) {
                    int readInt28 = parcel.readInt();
                    char c17 = (char) readInt28;
                    if (c17 == 1) {
                        i29 = E2.a.H(parcel, readInt28);
                    } else if (c17 == 2) {
                        E2.a.a0(parcel, readInt28, 4);
                        s3 = (short) parcel.readInt();
                    } else if (c17 != 3) {
                        E2.a.T(parcel, readInt28);
                    } else {
                        E2.a.a0(parcel, readInt28, 4);
                        s4 = (short) parcel.readInt();
                    }
                }
                E2.a.r(parcel, W28);
                return new V0.k(i29, s3, s4);
            default:
                int W29 = E2.a.W(parcel);
                V0.j jVar = null;
                V0.m mVar = null;
                V0.b bVar = null;
                V0.n nVar = null;
                String str39 = null;
                while (parcel.dataPosition() < W29) {
                    int readInt29 = parcel.readInt();
                    char c18 = (char) readInt29;
                    if (c18 == 1) {
                        jVar = (V0.j) E2.a.j(parcel, readInt29, V0.j.CREATOR);
                    } else if (c18 == 2) {
                        mVar = (V0.m) E2.a.j(parcel, readInt29, V0.m.CREATOR);
                    } else if (c18 == 3) {
                        bVar = (V0.b) E2.a.j(parcel, readInt29, V0.b.CREATOR);
                    } else if (c18 == 4) {
                        nVar = (V0.n) E2.a.j(parcel, readInt29, V0.n.CREATOR);
                    } else if (c18 != 5) {
                        E2.a.T(parcel, readInt29);
                    } else {
                        str39 = E2.a.k(parcel, readInt29);
                    }
                }
                E2.a.r(parcel, W29);
                return new V0.a(jVar, mVar, bVar, nVar, str39);
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
