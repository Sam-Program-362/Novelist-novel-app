package G0;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f396a;

    public /* synthetic */ d(int i3) {
        this.f396a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f396a) {
            case 0:
                int W = E2.a.W(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList = null;
                String str7 = null;
                String str8 = null;
                long j3 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < W) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i3 = E2.a.H(parcel, readInt);
                            break;
                        case 2:
                            str = E2.a.k(parcel, readInt);
                            break;
                        case 3:
                            str2 = E2.a.k(parcel, readInt);
                            break;
                        case 4:
                            str3 = E2.a.k(parcel, readInt);
                            break;
                        case 5:
                            str4 = E2.a.k(parcel, readInt);
                            break;
                        case 6:
                            uri = (Uri) E2.a.j(parcel, readInt, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = E2.a.k(parcel, readInt);
                            break;
                        case '\b':
                            j3 = E2.a.I(parcel, readInt);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            str6 = E2.a.k(parcel, readInt);
                            break;
                        case '\n':
                            arrayList = E2.a.n(parcel, readInt, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = E2.a.k(parcel, readInt);
                            break;
                        case '\f':
                            str8 = E2.a.k(parcel, readInt);
                            break;
                        default:
                            E2.a.T(parcel, readInt);
                            break;
                    }
                }
                E2.a.r(parcel, W);
                return new GoogleSignInAccount(i3, str, str2, str3, str4, uri, str5, j3, str6, arrayList, str7, str8);
            case 1:
                int W2 = E2.a.W(parcel);
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                Account account = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i4 = 0;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                while (parcel.dataPosition() < W2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i4 = E2.a.H(parcel, readInt2);
                            break;
                        case 2:
                            arrayList3 = E2.a.n(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) E2.a.j(parcel, readInt2, Account.CREATOR);
                            break;
                        case 4:
                            z3 = E2.a.G(parcel, readInt2);
                            break;
                        case 5:
                            z4 = E2.a.G(parcel, readInt2);
                            break;
                        case 6:
                            z5 = E2.a.G(parcel, readInt2);
                            break;
                        case 7:
                            str9 = E2.a.k(parcel, readInt2);
                            break;
                        case '\b':
                            str10 = E2.a.k(parcel, readInt2);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            arrayList2 = E2.a.n(parcel, readInt2, H0.a.CREATOR);
                            break;
                        case '\n':
                            str11 = E2.a.k(parcel, readInt2);
                            break;
                        default:
                            E2.a.T(parcel, readInt2);
                            break;
                    }
                }
                E2.a.r(parcel, W2);
                return new GoogleSignInOptions(i4, arrayList3, account, z3, z4, z5, str9, str10, GoogleSignInOptions.c(arrayList2), str11);
            default:
                int W3 = E2.a.W(parcel);
                String str12 = StringUtils.EMPTY;
                GoogleSignInAccount googleSignInAccount = null;
                String str13 = StringUtils.EMPTY;
                while (parcel.dataPosition() < W3) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 4) {
                        str12 = E2.a.k(parcel, readInt3);
                    } else if (c3 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) E2.a.j(parcel, readInt3, GoogleSignInAccount.CREATOR);
                    } else if (c3 != '\b') {
                        E2.a.T(parcel, readInt3);
                    } else {
                        str13 = E2.a.k(parcel, readInt3);
                    }
                }
                E2.a.r(parcel, W3);
                return new SignInAccount(str12, googleSignInAccount, str13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f396a) {
            case 0:
                return new GoogleSignInAccount[i3];
            case 1:
                return new GoogleSignInOptions[i3];
            default:
                return new SignInAccount[i3];
        }
    }
}
