package io.flutter.view;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f3263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f3264b;

    public e(i iVar, AccessibilityManager accessibilityManager) {
        this.f3264b = iVar;
        this.f3263a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        i iVar = this.f3264b;
        if (iVar.u) {
            return;
        }
        boolean z4 = false;
        if (!z3) {
            iVar.j(false);
            h hVar = iVar.f3358p;
            if (hVar != null) {
                iVar.h(hVar.f3318b, 256);
                iVar.f3358p = null;
            }
        }
        B1.a aVar = iVar.f3361s;
        if (aVar != null) {
            boolean isEnabled = this.f3263a.isEnabled();
            r1.n nVar = (r1.n) aVar.f80l;
            if (nVar.f4406s.f4481b.f3083a.getIsSoftwareRenderingEnabled()) {
                nVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z3) {
                z4 = true;
            }
            nVar.setWillNotDraw(z4);
        }
    }
}
