package io.flutter.plugin.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import p052r1.AbstractActivityC0262b;
import p052r1.C0261a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends FrameLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3187m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0261a f3188o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f3189p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f3190q;

    public j(AbstractActivityC0262b abstractActivityC0262b) {
        super(abstractActivityC0262b);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h hVar = this.f3189p;
        if (hVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = hVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvasLockHardwareCanvas);
        } finally {
            this.f3189p.scheduleFrame();
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f3190q;
    }

    public int getRenderTargetHeight() {
        h hVar = this.f3189p;
        if (hVar != null) {
            return hVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        h hVar = this.f3189p;
        if (hVar != null) {
            return hVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3188o == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i3 = this.f3187m;
            this.f3185k = i3;
            int i4 = this.n;
            this.f3186l = i4;
            matrix.postTranslate(i3, i4);
        } else if (action != 2) {
            matrix.postTranslate(this.f3187m, this.n);
        } else {
            matrix.postTranslate(this.f3185k, this.f3186l);
            this.f3185k = this.f3187m;
            this.f3186l = this.n;
        }
        this.f3188o.d(motionEvent, matrix);
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

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f3187m = layoutParams.leftMargin;
        this.n = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        i iVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (iVar = this.f3190q) != null) {
            this.f3190q = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(iVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f3190q == null) {
            i iVar2 = new i(this, onFocusChangeListener);
            this.f3190q = iVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(iVar2);
        }
    }

    public void setTouchProcessor(C0261a c0261a) {
        this.f3188o = c0261a;
    }
}
