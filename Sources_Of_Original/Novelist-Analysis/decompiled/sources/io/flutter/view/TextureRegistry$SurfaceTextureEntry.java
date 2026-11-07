package io.flutter.view;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    default void setOnFrameConsumedListener(o oVar) {
    }

    default void setOnTrimMemoryListener(p pVar) {
    }

    SurfaceTexture surfaceTexture();
}
