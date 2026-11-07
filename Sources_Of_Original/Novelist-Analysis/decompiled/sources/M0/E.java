package M0;

import android.view.KeyEvent;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes.dex */
public final class E implements androidx.lifecycle.A {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f923m;

    public E(String str, boolean z3) {
        this.f921k = 0;
        this.f923m = str;
        this.f922l = z3;
    }

    public void a(boolean z3) {
        if (this.f922l) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f922l = true;
        L0.k kVar = (L0.k) this.f923m;
        int i3 = kVar.f815c - 1;
        kVar.f815c = i3;
        boolean z4 = z3 | kVar.f814b;
        kVar.f814b = z4;
        if (i3 != 0 || z4) {
            return;
        }
        ((A0.j) kVar.f813a).G((KeyEvent) kVar.f816d);
    }

    @Override // androidx.lifecycle.A
    public void j(Object obj) {
        this.f922l = true;
        H0.i iVar = (H0.i) this.f923m;
        iVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) iVar.f443l;
        signInHubActivity.setResult(signInHubActivity.f2715K, signInHubActivity.f2716L);
        signInHubActivity.finish();
    }

    public String toString() {
        switch (this.f921k) {
            case 1:
                return ((H0.i) this.f923m).toString();
            default:
                return super.toString();
        }
    }

    public E(L0.k kVar) {
        this.f921k = 2;
        this.f923m = kVar;
        this.f922l = false;
    }

    public E(H0.d dVar, H0.i iVar) {
        this.f921k = 1;
        this.f922l = false;
        this.f923m = iVar;
    }
}
