package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import io.flutter.view.TextureRegistry$ImageTextureEntry;

/* renamed from: io.flutter.plugin.platform.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310b implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0311c f3167a;

    public C0310b(C0311c c0311c) {
        this.f3167a = c0311c;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        try {
            image = imageReader.acquireLatestImage();
        } catch (IllegalStateException e3) {
            Log.e("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e3);
            image = null;
        }
        if (image == null) {
            return;
        }
        ((TextureRegistry$ImageTextureEntry) this.f3167a.f3170m).pushImage(image);
    }
}
