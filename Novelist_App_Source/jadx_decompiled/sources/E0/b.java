package E0;

import H0.e;
import H2.h;
import K0.j;
import K0.k;
import L0.p;
import M0.C0047c;
import Y0.o;
import Y0.q;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import f1.C0246a;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f286i;

    @Override // H2.h
    public K0.c a(Context context, Looper looper, C0047c c0047c, Object obj, j jVar, k kVar) {
        switch (this.f286i) {
            case 0:
                return new o(context, looper, c0047c, (c) obj, (p) jVar, (p) kVar);
            case 1:
                return new e(context, looper, c0047c, (GoogleSignInOptions) obj, (p) jVar, (p) kVar);
            case 6:
                c0047c.getClass();
                Integer num = (Integer) c0047c.f931f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C0246a(context, looper, c0047c, bundle, jVar, kVar);
            case 7:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.a(context, looper, c0047c, obj, jVar, kVar);
        }
    }

    @Override // H2.h
    public K0.c b(Context context, Looper looper, C0047c c0047c, Object obj, p pVar, p pVar2) {
        switch (this.f286i) {
            case 2:
                return new O0.c(context, looper, c0047c, (M0.k) obj, pVar, pVar2);
            case 3:
                a2.h.e(context, "context");
                a2.h.e(looper, "looper");
                a2.h.e((K0.a) obj, "apiOptions");
                return new X0.e(context, looper, 352, c0047c, pVar, pVar2, 0);
            case 4:
                return new Y0.e(context, looper, c0047c, pVar, pVar2);
            case 5:
                return new q(context, looper, c0047c, pVar, pVar2);
            default:
                return super.b(context, looper, c0047c, obj, pVar, pVar2);
        }
    }
}
