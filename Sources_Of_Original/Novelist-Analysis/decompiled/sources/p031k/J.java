package p031k;

import D.G;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M f3610l;

    public /* synthetic */ J(M m3, int i3) {
        this.f3609k = i3;
        this.f3610l = m3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.f3609k;
        M m3 = this.f3610l;
        switch (i3) {
            case 0:
                O o2 = m3.f3623m;
                if (o2 != null) {
                    o2.setListSelectionHidden(true);
                    o2.requestLayout();
                }
                break;
            default:
                O o3 = m3.f3623m;
                if (o3 != null) {
                    Field field = G.f187a;
                    if (o3.isAttachedToWindow() && m3.f3623m.getCount() > m3.f3623m.getChildCount() && m3.f3623m.getChildCount() <= Integer.MAX_VALUE) {
                        m3.f3620F.setInputMethodMode(2);
                        m3.a();
                        break;
                    }
                }
                break;
        }
    }
}
