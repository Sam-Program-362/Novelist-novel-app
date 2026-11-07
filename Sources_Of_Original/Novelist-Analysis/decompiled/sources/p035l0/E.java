package p035l0;

import D.C0001b;
import E.h;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.plugin.platform.C0220c;

/* JADX INFO: loaded from: classes.dex */
public final class E extends C0001b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f3930d;

    public E(F f3) {
        this.f3930d = f3;
    }

    @Override // D.C0001b
    public final void b(View view, h hVar) {
        this.f223a.onInitializeAccessibilityNodeInfo(view, hVar.f284a);
        F f3 = this.f3930d;
        RecyclerView recyclerView = f3.f3931d;
        RecyclerView recyclerView2 = f3.f3931d;
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
        F f3 = this.f3930d;
        RecyclerView recyclerView = f3.f3931d;
        RecyclerView recyclerView2 = f3.f3931d;
        if (!recyclerView.l() && recyclerView2.getLayoutManager() != null) {
            C0220c c0220c = recyclerView2.getLayoutManager().f4018b.f2242k;
        }
        return false;
    }
}
