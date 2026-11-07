package androidx.appcompat.widget;

import A0.j;
import D.G;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p031k.B;
import p031k.C0241t;
import p031k.i0;
import p031k.j0;
import p031k.x0;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final i0 W = new i0(Float.class, "thumbPos");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int[] f1836a0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f1837A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f1838B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f1839C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f1840D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f1841E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final VelocityTracker f1842F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f1843G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f1844H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f1845I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f1846J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f1847K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f1848L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f1849M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f1850N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f1851O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final TextPaint f1852P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ColorStateList f1853Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public StaticLayout f1854R;
    public StaticLayout S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final p021h.a f1855T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ObjectAnimator f1856U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final Rect f1857V;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f1858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f1859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f1860m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f1862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ColorStateList f1863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PorterDuff.Mode f1864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1866t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1867v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1868w;
    public boolean x;
    public CharSequence y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f1869z;

    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateList;
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, it.returntrue.novelist.R.attr.switchStyle);
        this.f1859l = null;
        this.f1860m = null;
        this.n = false;
        this.f1861o = false;
        this.f1863q = null;
        this.f1864r = null;
        this.f1865s = false;
        this.f1866t = false;
        this.f1842F = VelocityTracker.obtain();
        this.f1857V = new Rect();
        j0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1852P = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = p013f.a.f2806s;
        j jVarF = j.F(context, attributeSet, iArr, it.returntrue.novelist.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) jVarF.f58m;
        G.b(this, context, iArr, attributeSet, typedArray, it.returntrue.novelist.R.attr.switchStyle);
        Drawable drawableY = jVarF.y(2);
        this.f1858k = drawableY;
        if (drawableY != null) {
            drawableY.setCallback(this);
        }
        Drawable drawableY2 = jVarF.y(11);
        this.f1862p = drawableY2;
        if (drawableY2 != null) {
            drawableY2.setCallback(this);
        }
        this.y = typedArray.getText(0);
        this.f1869z = typedArray.getText(1);
        this.f1837A = typedArray.getBoolean(3, true);
        this.u = typedArray.getDimensionPixelSize(8, 0);
        this.f1867v = typedArray.getDimensionPixelSize(5, 0);
        this.f1868w = typedArray.getDimensionPixelSize(6, 0);
        this.x = typedArray.getBoolean(4, false);
        ColorStateList colorStateListX = jVarF.x(9);
        if (colorStateListX != null) {
            this.f1859l = colorStateListX;
            this.n = true;
        }
        PorterDuff.Mode modeC = B.c(typedArray.getInt(10, -1), null);
        if (this.f1860m != modeC) {
            this.f1860m = modeC;
            this.f1861o = true;
        }
        if (this.n || this.f1861o) {
            a();
        }
        ColorStateList colorStateListX2 = jVarF.x(12);
        if (colorStateListX2 != null) {
            this.f1863q = colorStateListX2;
            this.f1865s = true;
        }
        PorterDuff.Mode modeC2 = B.c(typedArray.getInt(13, -1), null);
        if (this.f1864r != modeC2) {
            this.f1864r = modeC2;
            this.f1866t = true;
        }
        if (this.f1865s || this.f1866t) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, p013f.a.f2807t);
            if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) != 0) {
                Object obj = p017g.a.f2826a;
                colorStateList = context.getColorStateList(resourceId);
                colorStateList = colorStateList == null ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            }
            if (colorStateList != null) {
                this.f1853Q = colorStateList;
            } else {
                this.f1853Q = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f3 = dimensionPixelSize;
                if (f3 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f3);
                    requestLayout();
                }
            }
            int i3 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i4 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i3 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i3 != 2) {
                typeface = i3 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i4 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i5 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i4;
                textPaint.setFakeBoldText((i5 & 1) != 0);
                textPaint.setTextSkewX((2 & i5) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                p021h.a aVar = new p021h.a();
                aVar.f2858k = context2.getResources().getConfiguration().locale;
                this.f1855T = aVar;
            } else {
                this.f1855T = null;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        new C0241t(this).d(attributeSet, it.returntrue.novelist.R.attr.switchStyle);
        jVarF.J();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1839C = viewConfiguration.getScaledTouchSlop();
        this.f1843G = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
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
        Rect rectB = drawable2 != null ? B.b(drawable2) : B.f3577a;
        return ((((this.f1845I - this.f1847K) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    public final void a() {
        Drawable drawable = this.f1858k;
        if (drawable != null) {
            if (this.n || this.f1861o) {
                Drawable drawableMutate = drawable.mutate();
                this.f1858k = drawableMutate;
                if (this.n) {
                    drawableMutate.setTintList(this.f1859l);
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
                Drawable drawableMutate = drawable.mutate();
                this.f1862p = drawableMutate;
                if (this.f1865s) {
                    drawableMutate.setTintList(this.f1863q);
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
        p021h.a aVar = this.f1855T;
        if (aVar != null) {
            charSequence = aVar.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f1852P;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
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
        Rect rectB = drawable != null ? B.b(drawable) : B.f3577a;
        Drawable drawable2 = this.f1862p;
        Rect rect = this.f1857V;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i9 = rect.left;
            thumbOffset += i9;
            if (rectB != null) {
                int i10 = rectB.left;
                if (i10 > i9) {
                    i5 += i10 - i9;
                }
                int i11 = rectB.top;
                int i12 = rect.top;
                i3 = i11 > i12 ? (i11 - i12) + i6 : i6;
                int i13 = rectB.right;
                int i14 = rect.right;
                if (i13 > i14) {
                    i7 -= i13 - i14;
                }
                int i15 = rectB.bottom;
                int i16 = rect.bottom;
                if (i15 > i16) {
                    i4 = i8 - (i15 - i16);
                }
                this.f1862p.setBounds(i5, i3, i7, i4);
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
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1836a0);
        }
        return iArrOnCreateDrawableState;
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
                Rect rectB = B.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
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
        canvas.restoreToCount(iSave2);
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
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z3, i3, i4, i5, i6);
        int iMax2 = 0;
        if (this.f1858k != null) {
            Drawable drawable = this.f1862p;
            Rect rect = this.f1857V;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = B.b(this.f1858k);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (x0.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f1845I + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f1845I) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i7 = this.f1846J;
            int i8 = height2 - (i7 / 2);
            height = i7 + i8;
            paddingTop = i8;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f1846J + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f1846J;
        }
        this.f1848L = paddingLeft;
        this.f1849M = paddingTop;
        this.f1851O = height;
        this.f1850N = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        if (this.f1837A) {
            if (this.f1854R == null) {
                this.f1854R = c(this.y);
            }
            if (this.S == null) {
                this.S = c(this.f1869z);
            }
        }
        Drawable drawable = this.f1858k;
        int intrinsicHeight2 = 0;
        Rect rect = this.f1857V;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1858k.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1858k.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f1837A) {
            iMax = (this.u * 2) + Math.max(this.f1854R.getWidth(), this.S.getWidth());
        } else {
            iMax = 0;
        }
        this.f1847K = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f1862p;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1862p.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f1858k;
        if (drawable3 != null) {
            Rect rectB = B.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = Math.max(this.f1867v, (this.f1847K * 2) + iMax2 + iMax3);
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f1845I = iMax4;
        this.f1846J = iMax5;
        super.onMeasure(i3, i4);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
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

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f3;
        VelocityTracker velocityTracker = this.f1842F;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.f1839C;
        if (actionMasked != 0) {
            float f4 = 0.0f;
            if (actionMasked == 1) {
                if (this.f1838B == 2) {
                    this.f1838B = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    zIsChecked = isChecked();
                    if (z3) {
                        velocityTracker.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f1843G) {
                            targetCheckedState = x0.a(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f1838B = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i4 = this.f1838B;
                if (i4 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f5 = i3;
                    if (Math.abs(x - this.f1840D) > f5 || Math.abs(y - this.f1841E) > f5) {
                        this.f1838B = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f1840D = x;
                        this.f1841E = y;
                        return true;
                    }
                } else if (i4 == 2) {
                    float x3 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f6 = x3 - this.f1840D;
                    if (thumbScrollRange != 0) {
                        f3 = f6 / thumbScrollRange;
                    } else {
                        f3 = f6 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (x0.a(this)) {
                        f3 = -f3;
                    }
                    float f7 = this.f1844H;
                    float f8 = f3 + f7;
                    if (f8 >= 0.0f) {
                        f4 = f8 > 1.0f ? 1.0f : f8;
                    }
                    if (f4 != f7) {
                        this.f1840D = x3;
                        setThumbPosition(f4);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f1838B == 2) {
                    this.f1838B = 0;
                    if (motionEvent.getAction() == 1) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    zIsChecked = isChecked();
                    if (z3) {
                        velocityTracker.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f1843G) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (x0.a(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f1838B = 0;
                velocityTracker.clear();
            }
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f1858k != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f1858k;
                Rect rect = this.f1857V;
                drawable.getPadding(rect);
                int i5 = this.f1849M - i3;
                int i6 = (this.f1848L + thumbOffset) - i3;
                int i7 = this.f1847K + i6 + rect.left + rect.right + i3;
                int i8 = this.f1851O + i3;
                if (x4 > i6 && x4 < i7 && y3 > i5 && y3 < i8) {
                    this.f1838B = 1;
                    this.f1840D = x4;
                    this.f1841E = y3;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        super.setChecked(z3);
        boolean zIsChecked = isChecked();
        if (getWindowToken() != null) {
            Field field = G.f187a;
            if (isLaidOut()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, W, zIsChecked ? 1.0f : 0.0f);
                this.f1856U = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                this.f1856U.setAutoCancel(true);
                this.f1856U.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1856U;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
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
        setThumbDrawable(p017g.a.a(getContext(), i3));
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
        setTrackDrawable(p017g.a.a(getContext(), i3));
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
