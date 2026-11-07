package p035l0;

import D.C0001b;
import E.h;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.plugin.platform.C0220c;

/* JADX INFO: loaded from: classes.dex */
public final class F extends C0001b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f3931d;

    public F(RecyclerView recyclerView) {
        this.f3931d = recyclerView;
        new E(this);
    }

    @Override // D.C0001b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f3931d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // D.C0001b
    public final void b(View view, h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f284a;
        this.f223a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f3931d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        t layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f4018b;
        C0220c c0220c = recyclerView2.f2242k;
        B b3 = recyclerView2.f2239h0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f4018b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f4018b.canScrollVertically(1) || layoutManager.f4018b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(c0220c, b3), layoutManager.q(c0220c, b3), false, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // D.C0001b
    public final boolean c(View view, int i3, Bundle bundle) {
        int iU;
        int iS;
        if (super.c(view, i3, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f3931d;
        if (!recyclerView.l() && recyclerView.getLayoutManager() != null) {
            t layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f4018b;
            C0220c c0220c = recyclerView2.f2242k;
            if (i3 == 4096) {
                iU = recyclerView2.canScrollVertically(1) ? (layoutManager.f4023g - layoutManager.u()) - layoutManager.r() : 0;
                if (layoutManager.f4018b.canScrollHorizontally(1)) {
                    iS = (layoutManager.f4022f - layoutManager.s()) - layoutManager.t();
                } else {
                    iS = 0;
                }
            } else if (i3 != 8192) {
                iS = 0;
                iU = 0;
            } else {
                iU = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f4023g - layoutManager.u()) - layoutManager.r()) : 0;
                if (layoutManager.f4018b.canScrollHorizontally(-1)) {
                    iS = -((layoutManager.f4022f - layoutManager.s()) - layoutManager.t());
                } else {
                    iS = 0;
                }
            }
            if (iU != 0 || iS != 0) {
                layoutManager.f4018b.r(iS, iU);
                return true;
            }
        }
        return false;
    }
}
