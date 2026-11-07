package D;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: D.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0018t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0017s f261a;

    public C0018t(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f261a = new r(nestedScrollView);
        } else {
            this.f261a = new B1.b(4);
        }
    }
}
