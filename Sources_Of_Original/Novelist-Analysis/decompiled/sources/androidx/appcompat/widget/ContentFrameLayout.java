package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p031k.InterfaceC0247z;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TypedValue f1788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TypedValue f1789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TypedValue f1790m;
    public TypedValue n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TypedValue f1791o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TypedValue f1792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f1793q;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1793q = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1791o == null) {
            this.f1791o = new TypedValue();
        }
        return this.f1791o;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1792p == null) {
            this.f1792p = new TypedValue();
        }
        return this.f1792p;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1790m == null) {
            this.f1790m = new TypedValue();
        }
        return this.f1790m;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.n == null) {
            this.n = new TypedValue();
        }
        return this.n;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1788k == null) {
            this.f1788k = new TypedValue();
        }
        return this.f1788k;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1789l == null) {
            this.f1789l = new TypedValue();
        }
        return this.f1789l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int iMakeMeasureSpec;
        boolean z3;
        int iMakeMeasureSpec2;
        int i5;
        int i6;
        float fraction;
        int i7;
        int i8;
        float fraction2;
        int i9;
        int i10;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z4 = true;
        boolean z5 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        Rect rect = this.f1793q;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i3;
            z3 = false;
        } else {
            TypedValue typedValue = z5 ? this.n : this.f1790m;
            if (typedValue == null || (i9 = typedValue.type) == 0) {
                iMakeMeasureSpec = i3;
                z3 = false;
            } else {
                if (i9 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i9 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i11, i11);
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i3)), 1073741824);
                        z3 = true;
                    } else {
                        iMakeMeasureSpec = i3;
                        z3 = false;
                    }
                }
                i10 = (int) fraction3;
                if (i10 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i3)), 1073741824);
                    z3 = true;
                } else {
                    iMakeMeasureSpec = i3;
                    z3 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i4;
        } else {
            TypedValue typedValue2 = z5 ? this.f1791o : this.f1792p;
            if (typedValue2 == null || (i7 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i4;
            } else {
                if (i7 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i12 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i12, i12);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i4)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i4;
                    }
                }
                i8 = (int) fraction2;
                if (i8 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i4)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i4;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z3 || mode != Integer.MIN_VALUE) {
            z4 = false;
        } else {
            TypedValue typedValue3 = z5 ? this.f1789l : this.f1788k;
            if (typedValue3 == null || (i5 = typedValue3.type) == 0) {
                z4 = false;
            } else {
                if (i5 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i13 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i13, i13);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        i6 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i6) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                    } else {
                        z4 = false;
                    }
                }
                i6 = (int) fraction;
                if (i6 > 0) {
                    i6 -= rect.left + rect.right;
                }
                if (measuredWidth < i6) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else {
                    z4 = false;
                }
            }
        }
        if (z4) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC0247z interfaceC0247z) {
    }
}
