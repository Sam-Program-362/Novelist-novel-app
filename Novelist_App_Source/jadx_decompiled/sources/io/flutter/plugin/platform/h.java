package io.flutter.plugin.platform;

import android.view.Surface;

/* loaded from: classes.dex */
public interface h {
    void b(int i3, int i4);

    int getHeight();

    long getId();

    Surface getSurface();

    int getWidth();

    void release();

    default void scheduleFrame() {
    }
}
