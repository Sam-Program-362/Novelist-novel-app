package Y0;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends K0.i {

    /* renamed from: l, reason: collision with root package name */
    public static final A.c f1581l = new A.c("Auth.Api.Identity.Authorization.API", new E0.b(5), new K0.d());

    /* renamed from: m, reason: collision with root package name */
    public static final A.c f1582m = new A.c("Auth.Api.Identity.SignIn.API", new E0.b(4), new K0.d());

    /* renamed from: k, reason: collision with root package name */
    public final String f1583k;

    public b(Context context, F0.k kVar) {
        super(context, f1581l, kVar, K0.h.f642c);
        this.f1583k = g.a();
    }

    public g1.i c(AuthorizationRequest authorizationRequest) {
        Bundle bundle;
        Object obj;
        String str;
        boolean z3;
        String str2;
        boolean z4;
        boolean z5;
        int i3;
        List list = authorizationRequest.f2665k;
        M0.r.a("requestedScopes cannot be null or empty", (list == null || list.isEmpty()) ? false : true);
        Bundle bundle2 = authorizationRequest.f2672s;
        String str3 = null;
        if (bundle2 != null) {
            Bundle bundle3 = null;
            for (String str4 : bundle2.keySet()) {
                String string = bundle2.getString(str4);
                int[] b3 = X.j.b(11);
                int length = b3.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i3 = 0;
                        break;
                    }
                    i3 = b3[i4];
                    if (B1.e.f(i3).equals(str4)) {
                        break;
                    }
                    i4++;
                }
                if (string != null && i3 != 0) {
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    bundle3.putString(B1.e.f(i3), string);
                }
            }
            bundle = bundle3;
        } else {
            bundle = null;
        }
        boolean z6 = authorizationRequest.f2671r;
        String str5 = authorizationRequest.f2669p;
        Account account = authorizationRequest.f2668o;
        String str6 = authorizationRequest.f2666l;
        if (str5 != null) {
            M0.r.d(str5);
        } else {
            str5 = null;
        }
        if (account == null) {
            account = null;
        }
        if (!authorizationRequest.n || str6 == null) {
            obj = str6;
            str = str5;
            z3 = false;
        } else {
            str3 = str6;
            obj = str3;
            str = str5;
            z3 = true;
        }
        if (!authorizationRequest.f2667m || obj == null) {
            str2 = str3;
            z4 = false;
            z5 = false;
        } else {
            M0.r.a("two different server client ids provided", str3 == null || str3.equals(obj));
            z4 = true;
            z5 = z6;
            str2 = obj;
        }
        AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(list, str2, z4, z3, account, str, this.f1583k, z5, bundle, authorizationRequest.f2673t, authorizationRequest.u);
        L0.k b4 = L0.k.b();
        b4.f813a = new J0.c[]{f.f1589b};
        b4.f816d = new A.c(this, authorizationRequest2, 25);
        b4.f814b = false;
        b4.f815c = 1534;
        return b(0, b4.a());
    }

    public F0.a d(Intent intent) {
        Status status = Status.f2723q;
        if (intent == null) {
            throw new K0.e(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : S0.a.p(byteArrayExtra, creator));
        if (status2 == null) {
            throw new K0.e(Status.f2725s);
        }
        if (!status2.b()) {
            throw new K0.e(status2);
        }
        Parcelable.Creator<F0.a> creator2 = F0.a.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
        F0.a aVar = (F0.a) (byteArrayExtra2 != null ? S0.a.p(byteArrayExtra2, creator2) : null);
        if (aVar != null) {
            return aVar;
        }
        throw new K0.e(status);
    }

    public F0.j e(Intent intent) {
        Status status = Status.f2723q;
        if (intent == null) {
            throw new K0.e(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : S0.a.p(byteArrayExtra, creator));
        if (status2 == null) {
            throw new K0.e(Status.f2725s);
        }
        if (!status2.b()) {
            throw new K0.e(status2);
        }
        Parcelable.Creator<F0.j> creator2 = F0.j.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        F0.j jVar = (F0.j) (byteArrayExtra2 != null ? S0.a.p(byteArrayExtra2, creator2) : null);
        if (jVar != null) {
            return jVar;
        }
        throw new K0.e(status);
    }

    public b(Context context, F0.n nVar) {
        super(context, f1582m, nVar, K0.h.f642c);
        this.f1583k = g.a();
    }
}
