package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ImageReader f3049a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f3050b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3051c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f3052d;

    public f(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, ImageReader imageReader) {
        this.f3052d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f3049a = imageReader;
        imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.e
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader2) {
                Image image;
                boolean z3;
                f fVar = f.this;
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer2 = fVar.f3052d;
                try {
                    image = imageReader2.acquireLatestImage();
                } catch (IllegalStateException e3) {
                    Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e3);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                z3 = flutterRenderer$ImageReaderSurfaceProducer2.released;
                if (z3 || fVar.f3051c) {
                    image.close();
                } else {
                    flutterRenderer$ImageReaderSurfaceProducer2.onImage(imageReader2, image);
                }
            }
        }, new Handler(Looper.getMainLooper()));
    }
}
