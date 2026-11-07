package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class d implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3262a;

    public d(i iVar) {
        this.f3262a = iVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z3) {
        i iVar = this.f3262a;
        A0.j jVar = iVar.f3345b;
        if (iVar.u) {
            return;
        }
        if (z3) {
            ((FlutterJNI) jVar.f58m).setSemanticsEnabled(true);
        } else {
            iVar.j(false);
            ((FlutterJNI) jVar.f58m).setSemanticsEnabled(false);
        }
        B1.a aVar = iVar.f3361s;
        if (aVar != null) {
            boolean isTouchExplorationEnabled = iVar.f3346c.isTouchExplorationEnabled();
            r1.n nVar = (r1.n) aVar.f80l;
            if (nVar.f4406s.f4481b.f3083a.getIsSoftwareRenderingEnabled()) {
                nVar.setWillNotDraw(false);
            } else {
                nVar.setWillNotDraw((z3 || isTouchExplorationEnabled) ? false : true);
            }
        }
    }
}
