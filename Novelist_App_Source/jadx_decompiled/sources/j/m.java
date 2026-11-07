package j;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class m implements PopupWindow.OnDismissListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n f3475k;

    public m(n nVar) {
        this.f3475k = nVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3475k.c();
    }
}
