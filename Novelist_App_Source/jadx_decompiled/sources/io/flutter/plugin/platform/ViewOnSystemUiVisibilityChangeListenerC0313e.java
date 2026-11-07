package io.flutter.plugin.platform;

import android.view.View;

/* renamed from: io.flutter.plugin.platform.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC0313e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f3174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f3175b;

    public ViewOnSystemUiVisibilityChangeListenerC0313e(f fVar, View view) {
        this.f3175b = fVar;
        this.f3174a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i3) {
        this.f3174a.post(new J1.j(this, i3, 2));
    }
}
