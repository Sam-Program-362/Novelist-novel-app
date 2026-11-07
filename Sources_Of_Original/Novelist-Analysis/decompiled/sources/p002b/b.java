package p002b;

import M.c;
import O1.g;
import Z1.a;
import a2.h;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SignInHubActivity f2285l;

    public /* synthetic */ b(SignInHubActivity signInHubActivity, int i3) {
        this.f2284k = i3;
        this.f2285l = signInHubActivity;
    }

    @Override // Z1.a
    public final Object a() {
        switch (this.f2284k) {
            case 0:
                this.f2285l.reportFullyDrawn();
                return g.f1211a;
            case 1:
                SignInHubActivity signInHubActivity = this.f2285l;
                return new n(signInHubActivity.f2312p, new b(signInHubActivity, 0));
            case 2:
                p022h0.a aVar = new p022h0.a();
                this.f2285l.b().a().f2338c.c(aVar);
                return aVar;
            default:
                SignInHubActivity signInHubActivity2 = this.f2285l;
                t tVar = new t(new d(signInHubActivity2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (h.a(Looper.myLooper(), Looper.getMainLooper())) {
                        signInHubActivity2.f4439k.a(new c(tVar, signInHubActivity2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new c(signInHubActivity2, tVar, 12));
                    }
                }
                return tVar;
        }
    }
}
