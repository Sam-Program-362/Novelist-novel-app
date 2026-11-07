package io.flutter.plugin.platform;

import android.os.Build;

/* loaded from: classes.dex */
public final class y implements io.flutter.view.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f3251a;

    public y(z zVar) {
        this.f3251a = zVar;
    }

    @Override // io.flutter.view.p
    public final void onTrimMemory(int i3) {
        if (i3 != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f3251a.f3256p = true;
    }
}
