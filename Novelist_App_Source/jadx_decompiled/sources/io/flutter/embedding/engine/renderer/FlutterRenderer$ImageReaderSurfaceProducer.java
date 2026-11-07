package io.flutter.embedding.engine.renderer;

import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import io.flutter.view.q;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@Keep
/* loaded from: classes.dex */
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, p {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 7;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    q callback;
    private final long id;
    private boolean released;
    final /* synthetic */ k this$0;
    private boolean ignoringFence = false;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    boolean notifiedDestroy = false;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<f> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, f> perImageReaders = new HashMap<>();
    private ArrayList<d> lastDequeuedImage = new ArrayList<>();
    private f lastReaderDequeuedFrom = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(k kVar, long j3) {
        this.this$0 = kVar;
        this.id = j3;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (f fVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == fVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    fVar.f3051c = true;
                    fVar.f3049a.close();
                    fVar.f3050b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    ArrayList<d> arrayList = this.lastDequeuedImage;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        d dVar = arrayList.get(i3);
                        i3++;
                        dVar.f3046a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                f fVar2 = this.lastReaderDequeuedFrom;
                if (fVar2 != null) {
                    fVar2.f3051c = true;
                    fVar2.f3049a.close();
                    fVar2.f3050b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ImageReader createImageReader29() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 7, 256L);
        return newInstance;
    }

    private ImageReader createImageReader33() {
        ImageReader build;
        E.c.r();
        ImageReader.Builder i3 = E.c.i(this.requestedWidth, this.requestedHeight);
        i3.setMaxImages(7);
        i3.setImageFormat(34);
        i3.setUsage(256L);
        build = i3.build();
        return build;
    }

    private f getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    f peekLast = this.imageReaderQueue.peekLast();
                    if (peekLast.f3049a.getSurface().isValid()) {
                        return peekLast;
                    }
                }
                this.createNewReader = false;
                return getOrCreatePerImageReader(createImageReader());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private f getOrCreatePerImageReader(ImageReader imageReader) {
        f fVar = this.perImageReaders.get(imageReader);
        if (fVar != null) {
            return fVar;
        }
        f createPerImageReader = createPerImageReader(imageReader);
        this.perImageReaders.put(imageReader, createPerImageReader);
        this.imageReaderQueue.add(createPerImageReader);
        return createPerImageReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (this.released) {
            return;
        }
        this.this$0.f3083a.scheduleFrame();
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        this.this$0.h(this);
        this.this$0.f3089g.remove(this);
    }

    private void waitOnFence(Image image) {
        SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public Image acquireLatestImage() {
        d dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        Image image = dequeueImage.f3046a;
        maybeWaitOnFence(image);
        return image;
    }

    public ImageReader createImageReader() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            return createImageReader33();
        }
        if (i3 >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public f createPerImageReader(ImageReader imageReader) {
        return new f(this, imageReader);
    }

    public double deltaMillis(long j3) {
        return j3 / 1000000.0d;
    }

    public d dequeueImage() {
        d dVar;
        boolean z3;
        synchronized (this.lock) {
            try {
                Iterator<f> it2 = this.imageReaderQueue.iterator();
                dVar = null;
                while (true) {
                    z3 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    f next = it2.next();
                    ArrayDeque arrayDeque = next.f3050b;
                    d dVar2 = arrayDeque.isEmpty() ? null : (d) arrayDeque.removeFirst();
                    if (dVar2 == null) {
                        dVar = dVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f3046a.close();
                        }
                        this.lastDequeuedImage.add(dVar2);
                        this.lastReaderDequeuedFrom = next;
                        dVar = dVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<f> it3 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (!it3.next().f3050b.isEmpty()) {
                        z3 = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            this.this$0.f3087e.post(new c(this, 0));
        }
        return dVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            k kVar = this.this$0;
            kVar.f3087e.post(new i(this.id, kVar.f3083a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().f3049a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return false;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int i3;
        synchronized (this.lock) {
            try {
                Iterator<f> it2 = this.imageReaderQueue.iterator();
                i3 = 0;
                while (it2.hasNext()) {
                    i3 += it2.next().f3050b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i3;
    }

    public int numTrims() {
        int i3;
        synchronized (this.lock) {
            i3 = this.numTrims;
        }
        return i3;
    }

    public void onImage(ImageReader imageReader, Image image) {
        d dVar;
        synchronized (this.lock) {
            f orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            ArrayDeque arrayDeque = orCreatePerImageReader.f3050b;
            if (orCreatePerImageReader.f3051c) {
                dVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f3052d;
                System.nanoTime();
                d dVar2 = new d(flutterRenderer$ImageReaderSurfaceProducer, image);
                arrayDeque.add(dVar2);
                while (arrayDeque.size() > 2) {
                    ((d) arrayDeque.removeFirst()).f3046a.close();
                }
                dVar = dVar2;
            }
        }
        if (dVar == null) {
            return;
        }
        this.this$0.f3083a.scheduleFrame();
    }

    @Override // io.flutter.view.p
    public void onTrimMemory(int i3) {
        if (i3 < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        f peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ImageReader imageReader = peekFirst.f3049a;
            ArrayDeque arrayDeque = peekFirst.f3050b;
            if (!arrayDeque.isEmpty() || peekFirst.f3052d.lastReaderDequeuedFrom == peekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            this.perImageReaders.remove(imageReader);
            peekFirst.f3051c = true;
            imageReader.close();
            arrayDeque.clear();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        k kVar = this.this$0;
        kVar.f3083a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f3083a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(q qVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i3, int i4) {
        int max = Math.max(1, i3);
        int max2 = Math.max(1, i4);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }
}
