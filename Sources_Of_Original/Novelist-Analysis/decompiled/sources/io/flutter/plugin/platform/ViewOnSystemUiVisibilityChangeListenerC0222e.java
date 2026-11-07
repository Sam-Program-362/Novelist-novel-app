package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: renamed from: io.flutter.plugin.platform.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC0222e implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f3174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f3175b;

    public ViewOnSystemUiVisibilityChangeListenerC0222e(f fVar, View view) {
        this.f3175b = fVar;
        this.f3174a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i3) {
        this.f3174a.post(new J1.j(this, i3, 2));
    }
}
