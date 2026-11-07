package p052r1;

import E2.a;
import X.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.embedding.engine.renderer.n;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class f extends View implements n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageReader f4365k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Image f4366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f4367m;
    public k n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f4368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4370q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i3, int i4, int i5) {
        super(context, null);
        ImageReader imageReaderF = f(i3, i4);
        this.f4368o = false;
        this.f4370q = false;
        this.f4365k = imageReaderF;
        this.f4369p = i5;
        setAlpha(0.0f);
        this.f4368o = a.A(getContext());
    }

    public static ImageReader f(int i3, int i4) {
        if (i3 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i3 + ", set width=1");
            i3 = 1;
        }
        if (i4 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i4 + ", set height=1");
            i4 = 1;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i3, i4, 1, 3, 768L) : ImageReader.newInstance(i3, i4, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a() {
        if (this.f4370q) {
            setAlpha(0.0f);
            e();
            this.f4367m = null;
            Image image = this.f4366l;
            if (image != null) {
                image.close();
                this.f4366l = null;
            }
            invalidate();
            this.f4370q = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c(k kVar) {
        if (j.a(this.f4369p) == 0) {
            Surface surface = this.f4365k.getSurface();
            kVar.f3085c = surface;
            kVar.f3083a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.n = kVar;
        this.f4370q = true;
    }

    public final boolean e() {
        if (!this.f4370q) {
            return false;
        }
        Image imageAcquireLatestImage = this.f4365k.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            Image image = this.f4366l;
            if (image != null) {
                image.close();
                this.f4366l = null;
            }
            this.f4366l = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public final void g(int i3, int i4) {
        if (this.n == null) {
            return;
        }
        if (i3 == this.f4365k.getWidth() && i4 == this.f4365k.getHeight()) {
            return;
        }
        Image image = this.f4366l;
        if (image != null) {
            image.close();
            this.f4366l = null;
        }
        this.f4365k.close();
        this.f4365k = f(i3, i4);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public k getAttachedRenderer() {
        return this.n;
    }

    public ImageReader getImageReader() {
        return this.f4365k;
    }

    public Surface getSurface() {
        return this.f4365k.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Image image = this.f4366l;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                this.f4367m = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f4366l.getHeight();
                    Bitmap bitmap = this.f4367m;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f4367m.getHeight() != height) {
                        this.f4367m = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f4367m.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f4367m;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!this.f4368o) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i3), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i4), View.MeasureSpec.getMode(i4) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        if (!(i3 == this.f4365k.getWidth() && i4 == this.f4365k.getHeight()) && this.f4369p == 1 && this.f4370q) {
            g(i3, i4);
            k kVar = this.n;
            Surface surface = this.f4365k.getSurface();
            kVar.f3085c = surface;
            kVar.f3083a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
    }
}
