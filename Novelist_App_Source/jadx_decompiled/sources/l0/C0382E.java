package l0;

import D.C0001b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.plugin.platform.C0311c;

/* renamed from: l0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382E extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final C0383F f3930d;

    public C0382E(C0383F c0383f) {
        this.f3930d = c0383f;
    }

    @Override // D.C0001b
    public final void b(View view, E.h hVar) {
        this.f223a.onInitializeAccessibilityNodeInfo(view, hVar.f284a);
        C0383F c0383f = this.f3930d;
        RecyclerView recyclerView = c0383f.f3931d;
        RecyclerView recyclerView2 = c0383f.f3931d;
        if (recyclerView.l() || recyclerView2.getLayoutManager() == null) {
            return;
        }
        recyclerView2.getLayoutManager().getClass();
        RecyclerView.j(view);
    }

    @Override // D.C0001b
    public final boolean c(View view, int i3, Bundle bundle) {
        if (super.c(view, i3, bundle)) {
            return true;
        }
        C0383F c0383f = this.f3930d;
        RecyclerView recyclerView = c0383f.f3931d;
        RecyclerView recyclerView2 = c0383f.f3931d;
        if (!recyclerView.l() && recyclerView2.getLayoutManager() != null) {
            C0311c c0311c = recyclerView2.getLayoutManager().f4018b.f2242k;
        }
        return false;
    }
}
