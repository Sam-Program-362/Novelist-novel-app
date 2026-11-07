package androidx.appcompat.widget;

import D.G;
import android.R;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import g.AbstractC0250a;
import h.C0257a;
import java.lang.reflect.Field;
import k.AbstractC0336B;
import k.i0;
import k.x0;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final i0 W = new i0(Float.class, "thumbPos");

    /* renamed from: a0, reason: collision with root package name */
    public static final int[] f1836a0 = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public boolean f1837A;

    /* renamed from: B, reason: collision with root package name */
    public int f1838B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1839C;

    /* renamed from: D, reason: collision with root package name */
    public float f1840D;

    /* renamed from: E, reason: collision with root package name */
    public float f1841E;

    /* renamed from: F, reason: collision with root package name */
    public final VelocityTracker f1842F;

    /* renamed from: G, reason: collision with root package name */
    public final int f1843G;

    /* renamed from: H, reason: collision with root package name */
    public float f1844H;

    /* renamed from: I, reason: collision with root package name */
    public int f1845I;

    /* renamed from: J, reason: collision with root package name */
    public int f1846J;

    /* renamed from: K, reason: collision with root package name */
    public int f1847K;

    /* renamed from: L, reason: collision with root package name */
    public int f1848L;

    /* renamed from: M, reason: collision with root package name */
    public int f1849M;

    /* renamed from: N, reason: collision with root package name */
    public int f1850N;

    /* renamed from: O, reason: collision with root package name */
    public int f1851O;

    /* renamed from: P, reason: collision with root package name */
    public final TextPaint f1852P;

    /* renamed from: Q, reason: collision with root package name */
    public final ColorStateList f1853Q;

    /* renamed from: R, reason: collision with root package name */
    public StaticLayout f1854R;
    public StaticLayout S;

    /* renamed from: T, reason: collision with root package name */
    public final C0257a f1855T;

    /* renamed from: U, reason: collision with root package name */
    public ObjectAnimator f1856U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f1857V;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f1858k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1859l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f1860m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1861o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f1862p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f1863q;

    /* renamed from: r, reason: collision with root package name */
    public PorterDuff.Mode f1864r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1865s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1866t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public int f1867v;

    /* renamed from: w, reason: collision with root package name */
    public int f1868w;
    public boolean x;
    public CharSequence y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f1869z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x010c, code lost:
    
        if (r4 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchCompat(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private boolean getTargetCheckedState() {
        return this.f1844H > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((x0.a(this) ? 1.0f - this.f1844H : this.f1844H) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1862p;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1857V;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1858k;
        Rect b3 = drawable2 != null ? AbstractC0336B.b(drawable2) : AbstractC0336B.f3577a;
        return ((((this.f1845I - this.f1847K) - rect.left) - rect.right) - b3.left) - b3.right;
    }

    public final void a() {
        Drawable drawable = this.f1858k;
        if (drawable != null) {
            if (this.n || this.f1861o) {
                Drawable mutate = drawable.mutate();
                this.f1858k = mutate;
                if (this.n) {
                    mutate.setTintList(this.f1859l);
                }
                if (this.f1861o) {
                    this.f1858k.setTintMode(this.f1860m);
                }
                if (this.f1858k.isStateful()) {
                    this.f1858k.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1862p;
        if (drawable != null) {
            if (this.f1865s || this.f1866t) {
                Drawable mutate = drawable.mutate();
                this.f1862p = mutate;
                if (this.f1865s) {
                    mutate.setTintList(this.f1863q);
                }
                if (this.f1866t) {
                    this.f1862p.setTintMode(this.f1864r);
                }
                if (this.f1862p.isStateful()) {
                    this.f1862p.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        C0257a c0257a = this.f1855T;
        if (c0257a != null) {
            charSequence = c0257a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f1852P, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        int i4;
        int i5 = this.f1848L;
        int i6 = this.f1849M;
        int i7 = this.f1850N;
        int i8 = this.f1851O;
        int thumbOffset = getThumbOffset() + i5;
        Drawable drawable = this.f1858k;
        Rect b3 = drawable != null ? AbstractC0336B.b(drawable) : AbstractC0336B.f3577a;
        Drawable drawable2 = this.f1862p;
        Rect rect = this.f1857V;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i9 = rect.left;
            thumbOffset += i9;
            if (b3 != null) {
                int i10 = b3.left;
                if (i10 > i9) {
                    i5 += i10 - i9;
                }
                int i11 = b3.top;
                int i12 = rect.top;
                i3 = i11 > i12 ? (i11 - i12) + i6 : i6;
                int i13 = b3.right;
                int i14 = rect.right;
                if (i13 > i14) {
                    i7 -= i13 - i14;
                }
                int i15 = b3.bottom;
                int i16 = rect.bottom;
                if (i15 > i16) {
                    i4 = i8 - (i15 - i16);
                    this.f1862p.setBounds(i5, i3, i7, i4);
                }
            } else {
                i3 = i6;
            }
            i4 = i8;
            this.f1862p.setBounds(i5, i3, i7, i4);
        }
        Drawable drawable3 = this.f1858k;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i17 = thumbOffset - rect.left;
            int i18 = thumbOffset + this.f1847K + rect.right;
            this.f1858k.setBounds(i17, i6, i18, i8);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i17, i6, i18, i8);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f1858k;
        if (drawable != null) {
            drawable.setHotspot(f3, f4);
        }
        Drawable drawable2 = this.f1862p;
        if (drawable2 != null) {
            drawable2.setHotspot(f3, f4);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1858k;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1862p;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!x0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1845I;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1868w : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (x0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1845I;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1868w : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1837A;
    }

    public boolean getSplitTrack() {
        return this.x;
    }

    public int getSwitchMinWidth() {
        return this.f1867v;
    }

    public int getSwitchPadding() {
        return this.f1868w;
    }

    public CharSequence getTextOff() {
        return this.f1869z;
    }

    public CharSequence getTextOn() {
        return this.y;
    }

    public Drawable getThumbDrawable() {
        return this.f1858k;
    }

    public int getThumbTextPadding() {
        return this.u;
    }

    public ColorStateList getThumbTintList() {
        return this.f1859l;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1860m;
    }

    public Drawable getTrackDrawable() {
        return this.f1862p;
    }

    public ColorStateList getTrackTintList() {
        return this.f1863q;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1864r;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1858k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1862p;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1856U;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1856U.end();
        this.f1856U = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1836a0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1862p;
        Rect rect = this.f1857V;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.f1849M;
        int i4 = this.f1851O;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f1858k;
        if (drawable != null) {
            if (!this.x || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b3 = AbstractC0336B.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b3.left;
                rect.right -= b3.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1854R : this.S;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f1852P;
            ColorStateList colorStateList = this.f1853Q;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i5 + i6) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.y : this.f1869z;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int width;
        int i8;
        int i9;
        int i10;
        super.onLayout(z3, i3, i4, i5, i6);
        int i11 = 0;
        if (this.f1858k != null) {
            Drawable drawable = this.f1862p;
            Rect rect = this.f1857V;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b3 = AbstractC0336B.b(this.f1858k);
            i7 = Math.max(0, b3.left - rect.left);
            i11 = Math.max(0, b3.right - rect.right);
        } else {
            i7 = 0;
        }
        if (x0.a(this)) {
            i8 = getPaddingLeft() + i7;
            width = ((this.f1845I + i8) - i7) - i11;
        } else {
            width = (getWidth() - getPaddingRight()) - i11;
            i8 = (width - this.f1845I) + i7 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i12 = this.f1846J;
            int i13 = height - (i12 / 2);
            i9 = i12 + i13;
            i10 = i13;
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i9 = this.f1846J + i10;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.f1846J;
        }
        this.f1848L = i8;
        this.f1849M = i10;
        this.f1851O = i9;
        this.f1850N = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (this.f1837A) {
            if (this.f1854R == null) {
                this.f1854R = c(this.y);
            }
            if (this.S == null) {
                this.S = c(this.f1869z);
            }
        }
        Drawable drawable = this.f1858k;
        int i8 = 0;
        Rect rect = this.f1857V;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.f1858k.getIntrinsicWidth() - rect.left) - rect.right;
            i6 = this.f1858k.getIntrinsicHeight();
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (this.f1837A) {
            i7 = (this.u * 2) + Math.max(this.f1854R.getWidth(), this.S.getWidth());
        } else {
            i7 = 0;
        }
        this.f1847K = Math.max(i7, i5);
        Drawable drawable2 = this.f1862p;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i8 = this.f1862p.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.f1858k;
        if (drawable3 != null) {
            Rect b3 = AbstractC0336B.b(drawable3);
            i9 = Math.max(i9, b3.left);
            i10 = Math.max(i10, b3.right);
        }
        int max = Math.max(this.f1867v, (this.f1847K * 2) + i9 + i10);
        int max2 = Math.max(i8, i6);
        this.f1845I = max;
        this.f1846J = max2;
        super.onMeasure(i3, i4);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.y : this.f1869z;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        super.setChecked(z3);
        boolean isChecked = isChecked();
        if (getWindowToken() != null) {
            Field field = G.f187a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, W, isChecked ? 1.0f : 0.0f);
                this.f1856U = ofFloat;
                ofFloat.setDuration(250L);
                this.f1856U.setAutoCancel(true);
                this.f1856U.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1856U;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E2.a.X(callback, this));
    }

    public void setShowText(boolean z3) {
        if (this.f1837A != z3) {
            this.f1837A = z3;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z3) {
        this.x = z3;
        invalidate();
    }

    public void setSwitchMinWidth(int i3) {
        this.f1867v = i3;
        requestLayout();
    }

    public void setSwitchPadding(int i3) {
        this.f1868w = i3;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1852P;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1869z = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.y = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1858k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1858k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f3) {
        this.f1844H = f3;
        invalidate();
    }

    public void setThumbResource(int i3) {
        setThumbDrawable(AbstractC0250a.a(getContext(), i3));
    }

    public void setThumbTextPadding(int i3) {
        this.u = i3;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1859l = colorStateList;
        this.n = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1860m = mode;
        this.f1861o = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1862p;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1862p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i3) {
        setTrackDrawable(AbstractC0250a.a(getContext(), i3));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1863q = colorStateList;
        this.f1865s = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1864r = mode;
        this.f1866t = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1858k || drawable == this.f1862p;
    }
}
