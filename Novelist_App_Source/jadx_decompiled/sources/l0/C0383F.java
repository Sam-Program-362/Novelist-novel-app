package l0;

import D.C0001b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.plugin.platform.C0311c;

/* renamed from: l0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383F extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f3931d;

    public C0383F(RecyclerView recyclerView) {
        this.f3931d = recyclerView;
        new C0382E(this);
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
    public final void b(View view, E.h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f284a;
        this.f223a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f3931d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0410t layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f4018b;
        C0311c c0311c = recyclerView2.f2242k;
        C0379B c0379b = recyclerView2.f2239h0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f4018b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f4018b.canScrollVertically(1) || layoutManager.f4018b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(c0311c, c0379b), layoutManager.q(c0311c, c0379b), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // D.C0001b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.c(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f3931d
            boolean r0 = r4.l()
            r1 = 0
            if (r0 != 0) goto L8c
            l0.t r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8c
            l0.t r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f4018b
            io.flutter.plugin.platform.c r2 = r0.f2242k
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r2) goto L2a
            r5 = r1
            r0 = r5
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.f4023g
            int r2 = r4.u()
            int r0 = r0 - r2
            int r2 = r4.r()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f4018b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.f4022f
            int r2 = r4.s()
            int r5 = r5 - r2
            int r2 = r4.t()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f4023g
            int r0 = r4.u()
            int r5 = r5 - r0
            int r0 = r4.r()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f4018b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.f4022f
            int r2 = r4.s()
            int r5 = r5 - r2
            int r2 = r4.t()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L86
            if (r5 != 0) goto L86
            goto L8c
        L86:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f4018b
            r4.r(r5, r0)
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C0383F.c(android.view.View, int, android.os.Bundle):boolean");
    }
}
