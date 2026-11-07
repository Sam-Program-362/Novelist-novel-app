package io.flutter.embedding.engine;

import B1.g;
import C1.e;
import D.L;
import D1.a;
import H2.h;
import M1.N;
import M1.RunnableC0053b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaExtractor;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.AttachedSurfaceControl;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.m;
import io.flutter.plugin.platform.C0309a;
import io.flutter.plugin.platform.C0312d;
import io.flutter.plugin.platform.p;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.c;
import io.flutter.view.f;
import io.flutter.view.i;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;
import r1.AbstractActivityC0455b;
import r1.C0459f;
import r1.n;
import s1.InterfaceC0466b;
import s1.j;
import s1.k;
import s1.l;
import t1.C0477e;
import t1.C0479g;
import u1.InterfaceC0482a;
import v1.b;
import v1.d;
import x1.C0498a;

@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static l asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private k accessibilityDelegate;
    private InterfaceC0482a deferredComponentManager;
    private a localizationPlugin;
    private Long nativeShellHolderId;
    private t1.k platformMessageHandler;
    private s platformViewsController;
    private r platformViewsController2;
    private B1.r settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<InterfaceC0466b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.l> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<m> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j3) {
        l lVar = asyncWaitForVsyncDelegate;
        if (lVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        c cVar = (c) lVar;
        cVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        io.flutter.view.s sVar = (io.flutter.view.s) cVar.f3261a;
        io.flutter.view.r rVar = sVar.f3383c;
        if (rVar != null) {
            rVar.f3377a = j3;
            sVar.f3383c = null;
        } else {
            rVar = new io.flutter.view.r(sVar, j3);
        }
        choreographer.postFrameCallback(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j3) {
        b bVar;
        g gVar = 0;
        gVar = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        j jVar = new j(j3);
        d dVar = new d();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        int i3 = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
            dVar.f4628d = options.outMimeType;
            dVar.f4630f = options.outHeight;
            dVar.f4631g = options.outWidth;
        } catch (Exception e3) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e3);
        }
        if ("image/heif".equals(dVar.f4628d)) {
            try {
                v1.c cVar = new v1.c(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(cVar);
                h.w(dVar, mediaExtractor);
            } catch (Exception e4) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e4);
            }
            nativeImageHeaderCallback(jVar.f4529a, dVar.f4625a, dVar.f4626b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    Z.h hVar = new Z.h(byteArrayInputStream);
                    Z.d c3 = hVar.c("Orientation");
                    if (c3 != null) {
                        try {
                            i3 = c3.i(hVar.f1663g);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    dVar.f4629e = i3;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e5) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e5);
            }
        }
        if ("image/heif".equals(dVar.f4628d)) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 == 36) {
                bVar = new b(gVar, 0);
            } else if (i4 < 36) {
                bVar = new b(gVar, 1);
            }
            gVar = bVar;
        }
        if (gVar == 0) {
            gVar = new g(jVar, 22);
        }
        return gVar.l(byteBuffer, dVar);
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i3, ByteBuffer byteBuffer) {
        e eVar;
        t1.k kVar = this.platformMessageHandler;
        if (kVar == null || (eVar = (e) ((t1.j) kVar).f4575p.remove(Integer.valueOf(i3))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e3) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e3;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e3);
        } catch (Exception e4) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j3);

    private native void nativeDeferredComponentInstallFailure(int i3, String str, boolean z3);

    private native void nativeDestroy(long j3);

    private native void nativeDispatchEmptyPlatformMessage(long j3, String str, int i3);

    private native void nativeDispatchPlatformMessage(long j3, String str, ByteBuffer byteBuffer, int i3, int i4);

    private native void nativeDispatchPointerDataPacket(long j3, ByteBuffer byteBuffer, int i3);

    private native void nativeDispatchSemanticsAction(long j3, int i3, int i4, ByteBuffer byteBuffer, int i5);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i3);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i3);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i3);

    private native Bitmap nativeGetBitmap(long j3);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j3, int i3, int i4);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j3, int i3);

    private native void nativeInvokePlatformMessageResponseCallback(long j3, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeIsSurfaceControlEnabled(long j3);

    private native void nativeLoadDartDeferredLibrary(long j3, int i3, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j3);

    private native void nativeMarkTextureFrameAvailable(long j3, long j4);

    private native void nativeNotifyLowMemoryWarning(long j3);

    private native void nativeOnVsync(long j3, long j4, long j5);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j3, long j4, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z3);

    private native void nativeRegisterTexture(long j3, long j4, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j3, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j4);

    private native void nativeScheduleFrame(long j3);

    private native void nativeSetAccessibilityFeatures(long j3, int i3);

    private native void nativeSetSemanticsEnabled(long j3, boolean z3);

    private native void nativeSetViewportMetrics(long j3, float f3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25);

    private native FlutterJNI nativeSpawn(long j3, String str, String str2, String str3, List<String> list, long j4);

    private native void nativeSurfaceChanged(long j3, int i3, int i4);

    private native void nativeSurfaceCreated(long j3, Surface surface);

    private native void nativeSurfaceDestroyed(long j3);

    private native void nativeSurfaceWindowChanged(long j3, Surface surface);

    private native void nativeUnregisterTexture(long j3, long j4);

    private native void nativeUpdateDisplayMetrics(long j3);

    private native void nativeUpdateJavaAssetManager(long j3, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f3);

    private void onPreEngineRestart() {
        Iterator<InterfaceC0466b> it2 = this.engineLifecycleListeners.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((i) ((c) kVar).f3261a).f3356m = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            i iVar = (i) ((c) kVar).f3261a;
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.g b3 = iVar.b(byteBuffer.getInt());
                b3.f3289c = byteBuffer.getInt();
                b3.f3290d = i.d(byteBuffer, strArr);
                b3.f3291e = i.d(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((c) kVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(InterfaceC0466b interfaceC0466b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(interfaceC0466b);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(lVar);
    }

    public void addResizingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(mVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException(StringUtils.EMPTY);
        }
        ArrayList arrayList = rVar.f3217v;
        SurfaceControl.Transaction k3 = p.k();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            k3 = k3.merge(L.d(arrayList.get(i3)));
        }
        k3.apply();
        arrayList.clear();
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j3) {
        nativeCleanupMessageData(j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        if (r10 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        r4 = r0.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
    
        if (r5 >= r4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
    
        r6 = r0.get(r5);
        r5 = r5 + 1;
        r6 = (java.util.Locale) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0143, code lost:
    
        if (r3.getLanguage().equals(r6.toLanguageTag()) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        r4 = r0.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014b, code lost:
    
        if (r5 >= r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014d, code lost:
    
        r6 = r0.get(r5);
        r5 = r5 + 1;
        r6 = (java.util.Locale) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        if (r3.getLanguage().equals(r6.getLanguage()) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.computePlatformResolvedLocale(java.lang.String[]):java.lang.String[]");
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        Context context = sVar.n.getContext();
        int width = sVar.n.getWidth();
        int height = sVar.n.getHeight();
        C0309a c0309a = sVar.f3235s;
        C0312d c0312d = new C0312d(context, width, height, 2);
        c0312d.f3173r = c0309a;
        int i3 = sVar.f3239z;
        sVar.f3239z = i3 + 1;
        sVar.x.put(i3, c0312d);
        return new FlutterOverlaySurface(i3, c0312d.getSurface());
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (rVar.x == null) {
            SurfaceControl.Builder j3 = p.j();
            j3.setBufferSize(rVar.n.getWidth(), rVar.n.getHeight());
            j3.setFormat(1);
            j3.setName("Flutter Overlay Surface");
            j3.setOpaque(false);
            j3.setHidden(false);
            build = j3.build();
            rootSurfaceControl = rVar.n.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, PipesIterator.DEFAULT_QUEUE_SIZE);
            buildReparentTransaction.apply();
            rVar.x = p.i(build);
            rVar.y = build;
        }
        return new FlutterOverlaySurface(0, rVar.x);
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException(StringUtils.EMPTY);
        }
        SurfaceControl.Transaction k3 = p.k();
        rVar.f3217v.add(k3);
        return k3;
    }

    public void deferredComponentInstallFailure(int i3, String str, boolean z3) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i3, str, z3);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = rVar.x;
        if (surface != null) {
            surface.release();
            rVar.x = null;
            rVar.y = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        sVar.d();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i3);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i3, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i3, i4);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i3, f fVar) {
        dispatchSemanticsAction(i3, fVar, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException(StringUtils.EMPTY);
        }
        ArrayList arrayList = rVar.f3218w;
        SurfaceControl.Transaction k3 = p.k();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            k3 = k3.merge(L.d(arrayList.get(i3)));
        }
        arrayList.clear();
        rVar.n.invalidate();
        rootSurfaceControl = rVar.n.getRootSurfaceControl();
        rootSurfaceControl.applyTransactionOnDraw(k3);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getScaledFontSize(float r7, int r8) {
        /*
            r6 = this;
            B1.r r0 = r6.settingsChannel
            r1 = 0
            if (r0 != 0) goto L6
            goto L70
        L6:
            A0.j r0 = r0.f142a
            java.lang.Object r2 = r0.f57l
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            java.lang.Object r3 = r0.f58m
            B1.q r3 = (B1.q) r3
            if (r3 != 0) goto L1a
            java.lang.Object r3 = r2.poll()
            B1.q r3 = (B1.q) r3
            r0.f58m = r3
        L1a:
            java.lang.Object r3 = r0.f58m
            B1.q r3 = (B1.q) r3
            if (r3 == 0) goto L2d
            int r4 = r3.f140a
            if (r4 >= r8) goto L2d
            java.lang.Object r3 = r2.poll()
            B1.q r3 = (B1.q) r3
            r0.f58m = r3
            goto L1a
        L2d:
            java.lang.String r2 = "Cannot find config with generation: "
            java.lang.String r4 = "SettingsChannel"
            if (r3 != 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r2 = ", after exhausting the queue."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L47:
            r3 = r1
            goto L6b
        L49:
            int r5 = r3.f140a
            if (r5 == r8) goto L6b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r8)
            java.lang.String r2 = ", the oldest config is now: "
            r3.append(r2)
            java.lang.Object r0 = r0.f58m
            B1.q r0 = (B1.q) r0
            int r0 = r0.f140a
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r4, r0)
            goto L47
        L6b:
            if (r3 != 0) goto L6e
            goto L70
        L6e:
            android.util.DisplayMetrics r1 = r3.f141b
        L70:
            if (r1 != 0) goto L8d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "getScaledFontSize called with configurationId "
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r8 = ", which can't be found."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FlutterJNI"
            android.util.Log.e(r8, r7)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r7
        L8d:
            r8 = 2
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r1)
            float r8 = r1.density
            float r7 = r7 / r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.getScaledFontSize(float, int):float");
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i3, long j3) {
        C0479g c0479g;
        boolean z3;
        t1.k kVar = this.platformMessageHandler;
        if (kVar == null) {
            nativeCleanupMessageData(j3);
            return;
        }
        t1.j jVar = (t1.j) kVar;
        synchronized (jVar.n) {
            try {
                c0479g = (C0479g) jVar.f4572l.get(str);
                z3 = jVar.f4574o.get() && c0479g == null;
                if (z3) {
                    if (!jVar.f4573m.containsKey(str)) {
                        jVar.f4573m.put(str, new LinkedList());
                    }
                    ((List) jVar.f4573m.get(str)).add(new C0477e(j3, byteBuffer, i3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            return;
        }
        jVar.d(str, c0479g, byteBuffer, i3, j3);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (rVar.y == null) {
            return;
        }
        SurfaceControl.Transaction k3 = p.k();
        rVar.f3217v.add(k3);
        k3.setVisibility(rVar.y, false);
    }

    @SuppressLint({"NewApi"})
    public void hidePlatformView2(int i3) {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        if (rVar.a(i3)) {
            ((C0498a) rVar.f3216t.get(i3)).setVisibility(8);
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j3, i3);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i3) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i3);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [io.flutter.embedding.engine.FlutterJNI] */
    public void invokePlatformMessageResponseCallback(int i3, ByteBuffer byteBuffer, int i4) {
        FlutterJNI flutterJNI;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            flutterJNI = isAttached();
            try {
                if (flutterJNI != 0) {
                    FlutterJNI flutterJNI2 = this;
                    flutterJNI2.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i3, byteBuffer, i4);
                    flutterJNI = flutterJNI2;
                } else {
                    flutterJNI = this;
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
                }
                flutterJNI.shellHolderLock.readLock().unlock();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                flutterJNI.shellHolderLock.readLock().unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            flutterJNI = this;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i3) {
        return nativeFlutterTextUtilsIsEmoji(i3);
    }

    public boolean isCodePointEmojiModifier(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifier(i3);
    }

    public boolean isCodePointEmojiModifierBase(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i3);
    }

    public boolean isCodePointRegionalIndicator(int i3) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i3);
    }

    public boolean isCodePointVariantSelector(int i3) {
        return nativeFlutterTextUtilsIsVariationSelector(i3);
    }

    public void loadDartDeferredLibrary(int i3, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i3, strArr);
    }

    public void loadLibrary(Context context) {
        String[] strArr;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        long j3;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        N n = new N(14);
        B1.s sVar = new B1.s(3);
        sVar.n = n;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        sVar.t("Beginning load of %s...", "flutter");
        B1.b bVar = (B1.b) sVar.f145l;
        HashSet hashSet = (HashSet) sVar.f144k;
        if (hashSet.contains("flutter")) {
            sVar.t("%s already loaded previously!", "flutter");
        } else {
            A.c cVar = null;
            try {
                bVar.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                sVar.t("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e3) {
                sVar.t("Loading the library normally failed: %s", Log.getStackTraceString(e3));
                sVar.t("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File q3 = sVar.q(context);
                if (!q3.exists()) {
                    File dir = context.getDir("lib", 0);
                    File q4 = sVar.q(context);
                    bVar.getClass();
                    File[] listFiles = dir.listFiles(new D0.b(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(q4.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    B1.b bVar2 = (B1.b) sVar.f146m;
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName("flutter");
                    bVar2.getClass();
                    try {
                        A.c f3 = B1.b.f(context, strArr2, mapLibraryName, sVar);
                        try {
                            if (f3 == null) {
                                try {
                                    strArr = B1.b.i(context, mapLibraryName);
                                } catch (Exception e4) {
                                    strArr = new String[]{e4.toString()};
                                }
                                StringBuilder sb = new StringBuilder("Could not find '");
                                sb.append(mapLibraryName);
                                sb.append("'. Looked for: ");
                                sb.append(Arrays.toString(strArr2));
                                sb.append(", but only found: ");
                                throw new D0.a(B1.e.m(sb, Arrays.toString(strArr), "."));
                            }
                            ZipFile zipFile = (ZipFile) f3.f6l;
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                if (i3 < 5) {
                                    sVar.t("Found %s! Extracting...", mapLibraryName);
                                    try {
                                        if (q3.exists() || q3.createNewFile()) {
                                            try {
                                                inputStream2 = zipFile.getInputStream((ZipEntry) f3.f7m);
                                            } catch (FileNotFoundException unused) {
                                                inputStream2 = null;
                                            } catch (IOException unused2) {
                                                inputStream2 = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = null;
                                            }
                                            try {
                                                fileOutputStream2 = new FileOutputStream(q3);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    j3 = 0;
                                                    while (true) {
                                                        int read = inputStream2.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, 0, read);
                                                        j3 += read;
                                                    }
                                                    fileOutputStream2.flush();
                                                    fileOutputStream2.getFD().sync();
                                                } catch (FileNotFoundException unused3) {
                                                    B1.b.b(inputStream2);
                                                    B1.b.b(fileOutputStream2);
                                                    i3 = i4;
                                                } catch (IOException unused4) {
                                                    B1.b.b(inputStream2);
                                                    B1.b.b(fileOutputStream2);
                                                    i3 = i4;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    B1.b.b(inputStream);
                                                    B1.b.b(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused5) {
                                                fileOutputStream2 = null;
                                                B1.b.b(inputStream2);
                                                B1.b.b(fileOutputStream2);
                                                i3 = i4;
                                            } catch (IOException unused6) {
                                                fileOutputStream2 = null;
                                                B1.b.b(inputStream2);
                                                B1.b.b(fileOutputStream2);
                                                i3 = i4;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                B1.b.b(inputStream);
                                                B1.b.b(fileOutputStream);
                                                throw th;
                                            }
                                            if (j3 == q3.length()) {
                                                B1.b.b(inputStream2);
                                                B1.b.b(fileOutputStream2);
                                                q3.setReadable(true, false);
                                                q3.setExecutable(true, false);
                                                q3.setWritable(true);
                                                break;
                                            }
                                            B1.b.b(inputStream2);
                                            B1.b.b(fileOutputStream2);
                                        }
                                    } catch (IOException unused7) {
                                    }
                                    i3 = i4;
                                } else if (((N) sVar.n) != null) {
                                    lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                                }
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cVar = f3;
                            if (cVar != null) {
                                try {
                                    ((ZipFile) cVar.f6l).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                String absolutePath = q3.getAbsolutePath();
                bVar.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                sVar.t("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j3);
    }

    public void maybeResizeSurfaceView(int i3, int i4) {
        boolean z3;
        Iterator<m> it2 = this.flutterUiResizeListeners.iterator();
        while (it2.hasNext()) {
            View view = ((r1.l) it2.next()).f4383a.f4402o;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z4 = true;
                if (view.getHeight() != i4) {
                    layoutParams.height = i4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (view.getWidth() != i3) {
                    layoutParams.width = i3;
                } else {
                    z4 = z3;
                }
                if (z4) {
                    view.setLayoutParams(layoutParams);
                }
            } else {
                Log.e("FlutterView", "Flutter engine view not set.");
            }
        }
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        sVar.f3223C.clear();
        sVar.f3224D.clear();
    }

    public void onDisplayOverlaySurface(int i3, int i4, int i5, int i6, int i7) {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = sVar.x;
        if (sparseArray.get(i3) == null) {
            throw new IllegalStateException(B1.e.h("The overlay surface (id:", i3, ") doesn't exist"));
        }
        sVar.h();
        View view = (C0312d) sparseArray.get(i3);
        if (view.getParent() == null) {
            sVar.n.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        sVar.f3223C.add(Integer.valueOf(i3));
    }

    public void onDisplayPlatformView(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        sVar.h();
        SparseArray sparseArray = sVar.f3238w;
        SparseArray sparseArray2 = sVar.f3237v;
        io.flutter.plugin.platform.g gVar = (io.flutter.plugin.platform.g) sparseArray2.get(i3);
        if (gVar == null) {
            return;
        }
        if (sparseArray.get(i3) == null) {
            View view = gVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            AbstractActivityC0455b abstractActivityC0455b = sVar.f3230m;
            C0498a c0498a = new C0498a(abstractActivityC0455b, abstractActivityC0455b.getResources().getDisplayMetrics().density, sVar.f3229l);
            c0498a.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.l(sVar, i3, 0));
            sparseArray.put(i3, c0498a);
            view.setImportantForAccessibility(4);
            c0498a.addView(view);
            sVar.n.addView(c0498a);
        }
        C0498a c0498a2 = (C0498a) sparseArray.get(i3);
        c0498a2.f4712k = flutterMutatorsStack;
        c0498a2.f4714m = i4;
        c0498a2.n = i5;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7, 51);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        c0498a2.setLayoutParams(layoutParams);
        c0498a2.setWillNotDraw(false);
        c0498a2.setVisibility(0);
        c0498a2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i9);
        View view2 = ((io.flutter.plugin.platform.g) sparseArray2.get(i3)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        sVar.f3224D.add(Integer.valueOf(i3));
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        SurfaceControl surfaceControl;
        boolean isValid;
        SurfaceControl.Transaction alpha;
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (rVar.a(i3)) {
            C0498a c0498a = (C0498a) rVar.f3216t.get(i3);
            c0498a.f4712k = flutterMutatorsStack;
            c0498a.f4714m = i4;
            c0498a.n = i5;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7, 51);
            layoutParams.leftMargin = i4;
            layoutParams.topMargin = i5;
            c0498a.setLayoutParams(layoutParams);
            c0498a.setWillNotDraw(false);
            c0498a.setVisibility(0);
            c0498a.bringToFront();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i9, 51);
            View view = ((io.flutter.plugin.platform.g) rVar.f3215s.get(i3)).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams2);
                view.bringToFront();
                if (view instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) view;
                    HashSet hashSet = rVar.f3219z;
                    RectF rectF = new RectF(i4, i5, i6 + i4, i7 + i5);
                    Rect rect = new Rect();
                    rectF.roundOut(rect);
                    List<Path> finalClippingPaths = flutterMutatorsStack.getFinalClippingPaths();
                    if (finalClippingPaths != null && !finalClippingPaths.isEmpty()) {
                        RectF rectF2 = new RectF();
                        Iterator<Path> it2 = finalClippingPaths.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            it2.next().computeBounds(rectF2, true);
                            Rect rect2 = new Rect();
                            rectF2.roundOut(rect2);
                            if (!rect.intersect(rect2)) {
                                rect.setEmpty();
                                break;
                            }
                        }
                    }
                    rect.offset(-i4, -i5);
                    if (rect.width() < 0 || rect.height() < 0) {
                        rect.setEmpty();
                    }
                    float finalOpacity = flutterMutatorsStack.getFinalOpacity();
                    surfaceControl = surfaceView.getSurfaceControl();
                    if (surfaceControl == null) {
                        if (hashSet.contains(Integer.valueOf(i3))) {
                            return;
                        }
                        hashSet.add(Integer.valueOf(i3));
                        surfaceView.getHolder().addCallback(new q(rVar, surfaceView, finalOpacity, rect, i3));
                        return;
                    }
                    isValid = surfaceControl.isValid();
                    if (!isValid) {
                        surfaceView.getId();
                        return;
                    }
                    SurfaceControl.Transaction k3 = p.k();
                    rVar.f3217v.add(k3);
                    alpha = k3.setAlpha(surfaceControl, finalOpacity);
                    alpha.setCrop(surfaceControl, rect);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z3 = false;
        if (!sVar.f3221A || !sVar.f3224D.isEmpty()) {
            if (sVar.f3221A) {
                C0459f c0459f = sVar.n.n;
                if (c0459f != null ? c0459f.e() : false) {
                    z3 = true;
                }
            }
            sVar.e(z3);
            return;
        }
        sVar.f3221A = false;
        n nVar = sVar.n;
        RunnableC0053b runnableC0053b = new RunnableC0053b(sVar, 7);
        C0459f c0459f2 = nVar.n;
        if (c0459f2 == null || (r3 = nVar.f4403p) == 0) {
            return;
        }
        nVar.f4402o = r3;
        nVar.f4403p = null;
        io.flutter.embedding.engine.renderer.k kVar = nVar.f4406s.f4481b;
        if (kVar != null) {
            r3.b();
            kVar.a(new r1.m(nVar, kVar, runnableC0053b));
            return;
        }
        c0459f2.a();
        C0459f c0459f3 = nVar.n;
        if (c0459f3 != null) {
            c0459f3.f4365k.close();
            nVar.removeView(nVar.n);
            nVar.n = null;
        }
        runnableC0053b.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.l> it2 = this.flutterUiDisplayListeners.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.l> it2 = this.flutterUiDisplayListeners.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    public void onSurfaceChanged(int i3, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i3, i4);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j3, long j4, long j5) {
        nativeOnVsync(j3, j4, j5);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j3, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(textureRegistry$ImageConsumer), z3);
    }

    public void registerTexture(long j3, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(InterfaceC0466b interfaceC0466b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(interfaceC0466b);
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(lVar);
    }

    public void removeResizingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(mVar);
    }

    public void requestDartDeferredLibrary(int i3) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j3);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(k kVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = kVar;
    }

    public void setAccessibilityFeatures(int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i3);
        }
    }

    public void setAccessibilityFeaturesInNative(int i3) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i3);
    }

    public void setAsyncWaitForVsyncDelegate(l lVar) {
        asyncWaitForVsyncDelegate = lVar;
    }

    public void setDeferredComponentManager(InterfaceC0482a interfaceC0482a) {
        ensureRunningOnMainThread();
        if (interfaceC0482a != null) {
            interfaceC0482a.a();
        }
    }

    public void setLocalizationPlugin(a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(t1.k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(s sVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = sVar;
    }

    public void setPlatformViewsController2(r rVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = rVar;
    }

    public void setRefreshRateFPS(float f3) {
        refreshRateFPS = f3;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z3);
        }
    }

    public void setSemanticsEnabledInNative(boolean z3) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z3);
    }

    public void setSemanticsTreeEnabled(boolean z3) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar == null || z3) {
            return;
        }
        i iVar = (i) ((c) kVar).f3261a;
        iVar.f3350g.clear();
        io.flutter.view.h hVar = iVar.f3352i;
        if (hVar != null) {
            iVar.h(hVar.f3318b, 65536);
        }
        iVar.f3352i = null;
        iVar.f3358p = null;
        AccessibilityEvent e3 = iVar.e(0, 2048);
        e3.setContentChangeTypes(1);
        iVar.i(e3);
    }

    public void setSettingsChannel(B1.r rVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = rVar;
    }

    public void setViewportMetrics(float f3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f3, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, iArr, iArr2, iArr3, i18, i19, i20, i21, i22, i23, i24, i25);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (rVar.y == null) {
            return;
        }
        SurfaceControl.Transaction k3 = p.k();
        rVar.f3217v.add(k3);
        k3.setVisibility(rVar.y, true);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j3);
        Long l3 = nativeSpawn.nativeShellHolderId;
        if ((l3 == null || l3.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException(StringUtils.EMPTY);
        }
        synchronized (rVar) {
            rVar.f3218w.clear();
            rVar.f3218w.addAll(rVar.f3217v);
            rVar.f3217v.clear();
        }
    }

    public void unregisterTexture(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j3);
    }

    public void updateDisplayMetrics(int i3, float f3, float f4, float f5) {
        displayWidth = f3;
        displayHeight = f4;
        displayDensity = f5;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i3, f fVar, Object obj) {
        ByteBuffer byteBuffer;
        int i4;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = C1.q.f177a.a(obj);
            i4 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i4 = 0;
        }
        dispatchSemanticsAction(i3, fVar.f3286k, byteBuffer, i4);
    }

    public void dispatchSemanticsAction(int i3, int i4, ByteBuffer byteBuffer, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i3, i4, byteBuffer, i5);
    }
}
