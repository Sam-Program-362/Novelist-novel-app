package p002b;

import B1.p;
import a2.h;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0138l;
import androidx.lifecycle.InterfaceC0143q;
import androidx.lifecycle.InterfaceC0144s;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0143q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2291l;

    public /* synthetic */ e(Object obj, int i3) {
        this.f2290k = i3;
        this.f2291l = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0143q
    public final void d(InterfaceC0144s interfaceC0144s, EnumC0138l enumC0138l) {
        Window window;
        View viewPeekDecorView;
        switch (this.f2290k) {
            case 0:
                SignInHubActivity signInHubActivity = (SignInHubActivity) this.f2291l;
                if (enumC0138l == EnumC0138l.ON_STOP && (window = signInHubActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                SignInHubActivity signInHubActivity2 = (SignInHubActivity) this.f2291l;
                if (enumC0138l == EnumC0138l.ON_DESTROY) {
                    signInHubActivity2.f2309l.f2651b = null;
                    if (!signInHubActivity2.isChangingConfigurations()) {
                        signInHubActivity2.f().a();
                    }
                    i iVar = signInHubActivity2.f2312p;
                    SignInHubActivity signInHubActivity3 = iVar.n;
                    signInHubActivity3.getWindow().getDecorView().removeCallbacks(iVar);
                    signInHubActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                }
                break;
            default:
                p pVar = (p) this.f2291l;
                h.e(pVar, "this$0");
                if (enumC0138l == EnumC0138l.ON_START) {
                    pVar.f135c = true;
                } else if (enumC0138l == EnumC0138l.ON_STOP) {
                    pVar.f135c = false;
                }
                break;
        }
    }
}
