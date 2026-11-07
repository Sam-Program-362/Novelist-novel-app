package V0;

import W0.o;
import W0.p;
import W0.q;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import b0.C0155b;
import b0.C0156c;
import b0.E;
import b0.J;
import b0.N;
import b1.C0185J;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1528a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1528a) {
            case 0:
                int W = E2.a.W(parcel);
                boolean z3 = false;
                while (parcel.dataPosition() < W) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        E2.a.T(parcel, readInt);
                    } else {
                        z3 = E2.a.G(parcel, readInt);
                    }
                }
                E2.a.r(parcel, W);
                return new b(z3);
            case 1:
                int W2 = E2.a.W(parcel);
                byte[] bArr = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < W2) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 == 1) {
                        bArr = E2.a.g(parcel, readInt2);
                    } else if (c3 != 2) {
                        E2.a.T(parcel, readInt2);
                    } else {
                        bArr2 = E2.a.g(parcel, readInt2);
                    }
                }
                E2.a.r(parcel, W2);
                return new m(bArr == null ? null : C0185J.i(bArr, bArr.length), bArr2 != null ? C0185J.i(bArr2, bArr2.length) : null);
            case 2:
                int W3 = E2.a.W(parcel);
                boolean z4 = false;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < W3) {
                    int readInt3 = parcel.readInt();
                    char c4 = (char) readInt3;
                    if (c4 == 1) {
                        z4 = E2.a.G(parcel, readInt3);
                    } else if (c4 != 2) {
                        E2.a.T(parcel, readInt3);
                    } else {
                        bArr3 = E2.a.g(parcel, readInt3);
                    }
                }
                E2.a.r(parcel, W3);
                return new n(z4, bArr3 != null ? C0185J.i(bArr3, bArr3.length) : null);
            case 3:
                int W4 = E2.a.W(parcel);
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                while (parcel.dataPosition() < W4) {
                    int readInt4 = parcel.readInt();
                    char c5 = (char) readInt4;
                    if (c5 == 2) {
                        bArr4 = E2.a.g(parcel, readInt4);
                    } else if (c5 == 3) {
                        bArr5 = E2.a.g(parcel, readInt4);
                    } else if (c5 == 4) {
                        bArr6 = E2.a.g(parcel, readInt4);
                    } else if (c5 == 5) {
                        bArr7 = E2.a.g(parcel, readInt4);
                    } else if (c5 != 6) {
                        E2.a.T(parcel, readInt4);
                    } else {
                        bArr8 = E2.a.g(parcel, readInt4);
                    }
                }
                E2.a.r(parcel, W4);
                return new c(bArr4, bArr5, bArr6, bArr7, bArr8);
            case 4:
                int W5 = E2.a.W(parcel);
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                byte[] bArr11 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < W5) {
                    int readInt5 = parcel.readInt();
                    char c6 = (char) readInt5;
                    if (c6 == 2) {
                        bArr9 = E2.a.g(parcel, readInt5);
                    } else if (c6 == 3) {
                        bArr10 = E2.a.g(parcel, readInt5);
                    } else if (c6 == 4) {
                        bArr11 = E2.a.g(parcel, readInt5);
                    } else if (c6 != 5) {
                        E2.a.T(parcel, readInt5);
                    } else {
                        int J2 = E2.a.J(parcel, readInt5);
                        int dataPosition = parcel.dataPosition();
                        if (J2 == 0) {
                            strArr = null;
                        } else {
                            String[] createStringArray = parcel.createStringArray();
                            parcel.setDataPosition(dataPosition + J2);
                            strArr = createStringArray;
                        }
                    }
                }
                E2.a.r(parcel, W5);
                return new d(bArr9, bArr10, bArr11, strArr);
            case 5:
                int W6 = E2.a.W(parcel);
                int i3 = 0;
                String str = null;
                int i4 = 0;
                while (parcel.dataPosition() < W6) {
                    int readInt6 = parcel.readInt();
                    char c7 = (char) readInt6;
                    if (c7 == 2) {
                        i3 = E2.a.H(parcel, readInt6);
                    } else if (c7 == 3) {
                        str = E2.a.k(parcel, readInt6);
                    } else if (c7 != 4) {
                        E2.a.T(parcel, readInt6);
                    } else {
                        i4 = E2.a.H(parcel, readInt6);
                    }
                }
                E2.a.r(parcel, W6);
                return new e(i3, str, i4);
            case 6:
                try {
                    return h.a(parcel.readInt());
                } catch (g e3) {
                    throw new IllegalArgumentException(e3);
                }
            case 7:
                int W7 = E2.a.W(parcel);
                boolean z5 = false;
                while (parcel.dataPosition() < W7) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        E2.a.T(parcel, readInt7);
                    } else {
                        z5 = E2.a.G(parcel, readInt7);
                    }
                }
                E2.a.r(parcel, W7);
                return new W0.a(z5);
            case 8:
                int W8 = E2.a.W(parcel);
                while (parcel.dataPosition() < W8) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, W8);
                return new W0.b();
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                int W9 = E2.a.W(parcel);
                while (parcel.dataPosition() < W9) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, W9);
                return new W0.c();
            case 10:
                int W10 = E2.a.W(parcel);
                boolean z6 = false;
                while (parcel.dataPosition() < W10) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        E2.a.T(parcel, readInt8);
                    } else {
                        z6 = E2.a.G(parcel, readInt8);
                    }
                }
                E2.a.r(parcel, W10);
                return new W0.d(z6);
            case 11:
                int W11 = E2.a.W(parcel);
                boolean z7 = false;
                while (parcel.dataPosition() < W11) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        E2.a.T(parcel, readInt9);
                    } else {
                        z7 = E2.a.G(parcel, readInt9);
                    }
                }
                E2.a.r(parcel, W11);
                return new W0.e(z7);
            case 12:
                int W12 = E2.a.W(parcel);
                PendingIntent pendingIntent = null;
                W0.g gVar = null;
                while (parcel.dataPosition() < W12) {
                    int readInt10 = parcel.readInt();
                    char c8 = (char) readInt10;
                    if (c8 == 1) {
                        pendingIntent = (PendingIntent) E2.a.j(parcel, readInt10, PendingIntent.CREATOR);
                    } else if (c8 != 2) {
                        E2.a.T(parcel, readInt10);
                    } else {
                        gVar = (W0.g) E2.a.j(parcel, readInt10, W0.g.CREATOR);
                    }
                }
                E2.a.r(parcel, W12);
                return new W0.f(pendingIntent, gVar);
            case 13:
                int W13 = E2.a.W(parcel);
                String str2 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < W13) {
                    int readInt11 = parcel.readInt();
                    char c9 = (char) readInt11;
                    if (c9 == 1) {
                        str2 = E2.a.k(parcel, readInt11);
                    } else if (c9 != 2) {
                        E2.a.T(parcel, readInt11);
                    } else {
                        bundle = E2.a.f(parcel, readInt11);
                    }
                }
                E2.a.r(parcel, W13);
                return new W0.g(str2, bundle);
            case 14:
                int W14 = E2.a.W(parcel);
                String str3 = StringUtils.EMPTY;
                String str4 = str3;
                String str5 = str4;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                String str6 = null;
                while (parcel.dataPosition() < W14) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str3 = E2.a.k(parcel, readInt12);
                            break;
                        case 2:
                            bundle2 = E2.a.f(parcel, readInt12);
                            break;
                        case 3:
                            bundle3 = E2.a.f(parcel, readInt12);
                            break;
                        case 4:
                            str6 = E2.a.k(parcel, readInt12);
                            break;
                        case 5:
                            str4 = E2.a.k(parcel, readInt12);
                            break;
                        case 6:
                            str5 = E2.a.k(parcel, readInt12);
                            break;
                        default:
                            E2.a.T(parcel, readInt12);
                            break;
                    }
                }
                E2.a.r(parcel, W14);
                return new W0.h(str3, bundle2, bundle3, str6, str4, str5);
            case 15:
                int W15 = E2.a.W(parcel);
                Bundle bundle4 = null;
                while (parcel.dataPosition() < W15) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        E2.a.T(parcel, readInt13);
                    } else {
                        bundle4 = E2.a.f(parcel, readInt13);
                    }
                }
                E2.a.r(parcel, W15);
                return new W0.i(bundle4);
            case 16:
                int W16 = E2.a.W(parcel);
                Bundle bundle5 = null;
                while (parcel.dataPosition() < W16) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        E2.a.T(parcel, readInt14);
                    } else {
                        bundle5 = E2.a.f(parcel, readInt14);
                    }
                }
                E2.a.r(parcel, W16);
                return new W0.j(bundle5);
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                int W17 = E2.a.W(parcel);
                ArrayList arrayList = null;
                Bundle bundle6 = null;
                String str7 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < W17) {
                    int readInt15 = parcel.readInt();
                    char c10 = (char) readInt15;
                    if (c10 == 1) {
                        arrayList = E2.a.n(parcel, readInt15, W0.h.CREATOR);
                    } else if (c10 == 2) {
                        bundle6 = E2.a.f(parcel, readInt15);
                    } else if (c10 == 3) {
                        str7 = E2.a.k(parcel, readInt15);
                    } else if (c10 != 4) {
                        E2.a.T(parcel, readInt15);
                    } else {
                        resultReceiver = (ResultReceiver) E2.a.j(parcel, readInt15, ResultReceiver.CREATOR);
                    }
                }
                E2.a.r(parcel, W17);
                return new GetCredentialRequest(arrayList, bundle6, str7, resultReceiver);
            case 18:
                int W18 = E2.a.W(parcel);
                Bundle bundle7 = null;
                while (parcel.dataPosition() < W18) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        E2.a.T(parcel, readInt16);
                    } else {
                        bundle7 = E2.a.f(parcel, readInt16);
                    }
                }
                E2.a.r(parcel, W18);
                return new W0.k(bundle7);
            case 19:
                int W19 = E2.a.W(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < W19) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        E2.a.T(parcel, readInt17);
                    } else {
                        pendingIntent2 = (PendingIntent) E2.a.j(parcel, readInt17, PendingIntent.CREATOR);
                    }
                }
                E2.a.r(parcel, W19);
                return new W0.l(pendingIntent2);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                int W20 = E2.a.W(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < W20) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        E2.a.T(parcel, readInt18);
                    } else {
                        pendingIntent3 = (PendingIntent) E2.a.j(parcel, readInt18, PendingIntent.CREATOR);
                    }
                }
                E2.a.r(parcel, W20);
                return new W0.m(pendingIntent3);
            case 21:
                int W21 = E2.a.W(parcel);
                while (parcel.dataPosition() < W21) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, W21);
                return new W0.n();
            case 22:
                int W22 = E2.a.W(parcel);
                while (parcel.dataPosition() < W22) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, W22);
                return new o();
            case 23:
                int W23 = E2.a.W(parcel);
                while (parcel.dataPosition() < W23) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, W23);
                return new p();
            case 24:
                int W24 = E2.a.W(parcel);
                while (parcel.dataPosition() < W24) {
                    E2.a.T(parcel, parcel.readInt());
                }
                E2.a.r(parcel, W24);
                return new q();
            case 25:
                return new C0155b(parcel);
            case 26:
                return new C0156c(parcel);
            case 27:
                E e4 = new E();
                e4.f2349k = parcel.readString();
                e4.f2350l = parcel.readInt();
                return e4;
            case 28:
                J j3 = new J();
                j3.f2394o = null;
                j3.f2395p = new ArrayList();
                j3.f2396q = new ArrayList();
                j3.f2391k = parcel.createStringArrayList();
                j3.f2392l = parcel.createStringArrayList();
                j3.f2393m = (C0155b[]) parcel.createTypedArray(C0155b.CREATOR);
                j3.n = parcel.readInt();
                j3.f2394o = parcel.readString();
                j3.f2395p = parcel.createStringArrayList();
                j3.f2396q = parcel.createTypedArrayList(C0156c.CREATOR);
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
                return new C0155b[i3];
            case 26:
                return new C0156c[i3];
            case 27:
                return new E[i3];
            case 28:
                return new J[i3];
            default:
                return new N[i3];
        }
    }
}
