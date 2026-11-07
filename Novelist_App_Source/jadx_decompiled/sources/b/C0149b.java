package b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import h0.C0258a;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0149b implements Z1.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2284k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SignInHubActivity f2285l;

    public /* synthetic */ C0149b(SignInHubActivity signInHubActivity, int i3) {
        this.f2284k = i3;
        this.f2285l = signInHubActivity;
    }

    @Override // Z1.a
    public final Object a() {
        switch (this.f2284k) {
            case 0:
                this.f2285l.reportFullyDrawn();
                return O1.g.f1211a;
            case 1:
                SignInHubActivity signInHubActivity = this.f2285l;
                return new n(signInHubActivity.f2312p, new C0149b(signInHubActivity, 0));
            case 2:
                C0258a c0258a = new C0258a();
                this.f2285l.b().a().f2338c.c(c0258a);
                return c0258a;
            default:
                SignInHubActivity signInHubActivity2 = this.f2285l;
                t tVar = new t(new RunnableC0151d(signInHubActivity2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (a2.h.a(Looper.myLooper(), Looper.getMainLooper())) {
                        signInHubActivity2.f4439k.a(new C0150c(tVar, signInHubActivity2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new M.c(signInHubActivity2, tVar, 12));
                    }
                }
                return tVar;
        }
    }
}
