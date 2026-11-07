package k;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class m0 implements View.OnClickListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3729k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3730l;

    public m0(r0 r0Var) {
        this.f3730l = r0Var;
        r0Var.f3750a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3729k) {
            case 0:
                n0 n0Var = ((Toolbar) this.f3730l).S;
                j.k kVar = n0Var == null ? null : n0Var.f3738l;
                if (kVar != null) {
                    kVar.collapseActionView();
                    break;
                }
                break;
            default:
                r0 r0Var = (r0) this.f3730l;
                if (r0Var.f3760k != null) {
                    r0Var.getClass();
                    break;
                }
                break;
        }
    }

    public m0(Toolbar toolbar) {
        this.f3730l = toolbar;
    }
}
