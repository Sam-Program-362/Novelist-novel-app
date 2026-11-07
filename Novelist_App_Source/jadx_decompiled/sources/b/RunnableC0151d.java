package b;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: b.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0151d implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2288k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SignInHubActivity f2289l;

    public /* synthetic */ RunnableC0151d(SignInHubActivity signInHubActivity, int i3) {
        this.f2288k = i3;
        this.f2289l = signInHubActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2288k) {
            case 0:
                this.f2289l.invalidateOptionsMenu();
                break;
            default:
                k.d(this.f2289l);
                break;
        }
    }
}
