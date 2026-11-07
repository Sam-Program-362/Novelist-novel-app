package x1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.i;
import java.util.Iterator;
import r1.AbstractActivityC0455b;
import r1.C0454a;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498a extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public FlutterMutatorsStack f4712k;

    /* renamed from: l, reason: collision with root package name */
    public final float f4713l;

    /* renamed from: m, reason: collision with root package name */
    public int f4714m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public final C0454a f4715o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f4716p;

    /* renamed from: q, reason: collision with root package name */
    public i f4717q;

    public C0498a(AbstractActivityC0455b abstractActivityC0455b, float f3, C0454a c0454a) {
        super(abstractActivityC0455b, null);
        this.f4713l = f3;
        this.f4715o = c0454a;
        this.f4716p = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f4712k.getFinalMatrix());
        float f3 = this.f4713l;
        matrix.preScale(1.0f / f3, 1.0f / f3);
        matrix.postTranslate(-this.f4714m, -this.n);
        return matrix;
    }

    public final void a() {
        i iVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (iVar = this.f4717q) == null) {
            return;
        }
        this.f4717q = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it2 = this.f4712k.getFinalClippingPaths().iterator();
        while (it2.hasNext()) {
            Path path = new Path(it2.next());
            path.offset(-this.f4714m, -this.n);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f4712k.getFinalOpacity() * 255.0f);
        Paint paint = this.f4716p;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f4712k.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0454a c0454a = this.f4715o;
        if (c0454a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(getLeft(), getTop());
        c0454a.d(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f4717q == null) {
            i iVar = new i(onFocusChangeListener, this);
            this.f4717q = iVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(iVar);
        }
    }
}
