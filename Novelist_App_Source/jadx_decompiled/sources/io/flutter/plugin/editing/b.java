package io.flutter.plugin.editing;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class b implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImeSyncDeferringInsetsCallback f3099a;

    public b(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        this.f3099a = imeSyncDeferringInsetsCallback;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f3099a;
        imeSyncDeferringInsetsCallback.view = view;
        if (imeSyncDeferringInsetsCallback.needsSave) {
            imeSyncDeferringInsetsCallback.lastWindowInsets = windowInsets;
            imeSyncDeferringInsetsCallback.needsSave = false;
        }
        if (!imeSyncDeferringInsetsCallback.animating) {
            return view.onApplyWindowInsets(windowInsets);
        }
        windowInsets2 = WindowInsets.CONSUMED;
        return windowInsets2;
    }
}
