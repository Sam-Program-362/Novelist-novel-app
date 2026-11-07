package b;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0140l;
import androidx.lifecycle.InterfaceC0145q;
import androidx.lifecycle.InterfaceC0146s;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0145q {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2290k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2291l;

    public /* synthetic */ e(Object obj, int i3) {
        this.f2290k = i3;
        this.f2291l = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0145q
    public final void d(InterfaceC0146s interfaceC0146s, EnumC0140l enumC0140l) {
        Window window;
        View peekDecorView;
        switch (this.f2290k) {
            case 0:
                SignInHubActivity signInHubActivity = (SignInHubActivity) this.f2291l;
                if (enumC0140l == EnumC0140l.ON_STOP && (window = signInHubActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                SignInHubActivity signInHubActivity2 = (SignInHubActivity) this.f2291l;
                if (enumC0140l == EnumC0140l.ON_DESTROY) {
                    signInHubActivity2.f2309l.f2651b = null;
                    if (!signInHubActivity2.isChangingConfigurations()) {
                        signInHubActivity2.f().a();
                    }
                    i iVar = signInHubActivity2.f2312p;
                    SignInHubActivity signInHubActivity3 = iVar.n;
                    signInHubActivity3.getWindow().getDecorView().removeCallbacks(iVar);
                    signInHubActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                B1.p pVar = (B1.p) this.f2291l;
                a2.h.e(pVar, "this$0");
                if (enumC0140l != EnumC0140l.ON_START) {
                    if (enumC0140l == EnumC0140l.ON_STOP) {
                        pVar.f135c = false;
                        break;
                    }
                } else {
                    pVar.f135c = true;
                    break;
                }
                break;
        }
    }
}
