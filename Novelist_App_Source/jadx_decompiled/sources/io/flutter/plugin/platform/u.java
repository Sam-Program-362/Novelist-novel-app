package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class u extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public final C0309a f3242k;

    /* renamed from: l, reason: collision with root package name */
    public final View f3243l;

    public u(Context context, C0309a c0309a, View view) {
        super(context);
        this.f3242k = c0309a;
        this.f3243l = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.i iVar = this.f3242k.f3166a;
        if (iVar == null) {
            return false;
        }
        return iVar.a(this.f3243l, view, accessibilityEvent);
    }
}
