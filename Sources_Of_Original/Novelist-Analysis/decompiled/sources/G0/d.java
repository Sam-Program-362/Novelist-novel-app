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

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f396a;

    public /* synthetic */ d(int i3) {
        this.f396a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f396a) {
            case 0:
                int iW = E2.a.W(parcel);
                String strK = null;
                String strK2 = null;
                String strK3 = null;
                String strK4 = null;
                Uri uri = null;
                String strK5 = null;
                String strK6 = null;
                ArrayList arrayListN = null;
                String strK7 = null;
                String strK8 = null;
                long jI = 0;
                int iH = 0;
                while (parcel.dataPosition() < iW) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            iH = E2.a.H(parcel, i3);
                            break;
                        case 2:
                            strK = E2.a.k(parcel, i3);
                            break;
                        case 3:
                            strK2 = E2.a.k(parcel, i3);
                            break;
                        case 4:
                            strK3 = E2.a.k(parcel, i3);
                            break;
                        case 5:
                            strK4 = E2.a.k(parcel, i3);
                            break;
                        case 6:
                            uri = (Uri) E2.a.j(parcel, i3, Uri.CREATOR);
                            break;
                        case 7:
                            strK5 = E2.a.k(parcel, i3);
                            break;
                        case '\b':
                            jI = E2.a.I(parcel, i3);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            strK6 = E2.a.k(parcel, i3);
                            break;
                        case '\n':
                            arrayListN = E2.a.n(parcel, i3, Scope.CREATOR);
                            break;
                        case 11:
                            strK7 = E2.a.k(parcel, i3);
                            break;
                        case '\f':
                            strK8 = E2.a.k(parcel, i3);
                            break;
                        default:
                            E2.a.T(parcel, i3);
                            break;
                    }
                }
                E2.a.r(parcel, iW);
                return new GoogleSignInAccount(iH, strK, strK2, strK3, strK4, uri, strK5, jI, strK6, arrayListN, strK7, strK8);
            case 1:
                int iW2 = E2.a.W(parcel);
                ArrayList arrayListN2 = null;
                ArrayList arrayListN3 = null;
                Account account = null;
                String strK9 = null;
                String strK10 = null;
                String strK11 = null;
                int iH2 = 0;
                boolean zG = false;
                boolean zG2 = false;
                boolean zG3 = false;
                while (parcel.dataPosition() < iW2) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            iH2 = E2.a.H(parcel, i4);
                            break;
                        case 2:
                            arrayListN3 = E2.a.n(parcel, i4, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) E2.a.j(parcel, i4, Account.CREATOR);
                            break;
                        case 4:
                            zG = E2.a.G(parcel, i4);
                            break;
                        case 5:
                            zG2 = E2.a.G(parcel, i4);
                            break;
                        case 6:
                            zG3 = E2.a.G(parcel, i4);
                            break;
                        case 7:
                            strK9 = E2.a.k(parcel, i4);
                            break;
                        case '\b':
                            strK10 = E2.a.k(parcel, i4);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            arrayListN2 = E2.a.n(parcel, i4, H0.a.CREATOR);
                            break;
                        case '\n':
                            strK11 = E2.a.k(parcel, i4);
                            break;
                        default:
                            E2.a.T(parcel, i4);
                            break;
                    }
                }
                E2.a.r(parcel, iW2);
                return new GoogleSignInOptions(iH2, arrayListN3, account, zG, zG2, zG3, strK9, strK10, GoogleSignInOptions.c(arrayListN2), strK11);
            default:
                int iW3 = E2.a.W(parcel);
                String strK12 = StringUtils.EMPTY;
                GoogleSignInAccount googleSignInAccount = null;
                String strK13 = StringUtils.EMPTY;
                while (parcel.dataPosition() < iW3) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 4) {
                        strK12 = E2.a.k(parcel, i5);
                    } else if (c3 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) E2.a.j(parcel, i5, GoogleSignInAccount.CREATOR);
                    } else if (c3 != '\b') {
                        E2.a.T(parcel, i5);
                    } else {
                        strK13 = E2.a.k(parcel, i5);
                    }
                }
                E2.a.r(parcel, iW3);
                return new SignInAccount(strK12, googleSignInAccount, strK13);
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
