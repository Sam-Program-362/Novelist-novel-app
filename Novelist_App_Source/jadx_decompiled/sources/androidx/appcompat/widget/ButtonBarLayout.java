package androidx.appcompat.widget;

import D.G;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import f.AbstractC0243a;
import it.returntrue.novelist.R;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public boolean f1786k;

    /* renamed from: l, reason: collision with root package name */
    public int f1787l;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1787l = -1;
        int[] iArr = AbstractC0243a.f2797i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        G.b(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f1786k = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z3) {
        setOrientation(z3 ? 1 : 0);
        setGravity(z3 ? 5 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z3 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z3;
        int i6;
        int size = View.MeasureSpec.getSize(i3);
        if (this.f1786k) {
            if (size > this.f1787l && getOrientation() == 1) {
                setStacked(false);
            }
            this.f1787l = size;
        }
        if (getOrientation() != 1 && View.MeasureSpec.getMode(i3) == 1073741824) {
            i5 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z3 = true;
        } else {
            i5 = i3;
            z3 = false;
        }
        super.onMeasure(i5, i4);
        if (this.f1786k && getOrientation() != 1 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z3 = true;
        }
        if (z3) {
            super.onMeasure(i3, i4);
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            i6 = -1;
            if (i7 >= childCount) {
                i7 = -1;
                break;
            } else if (getChildAt(i7).getVisibility() == 0) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            View childAt = getChildAt(i7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((getOrientation() == 1 ? 1 : 0) != 0) {
                int i8 = i7 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i8 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i8).getVisibility() == 0) {
                        i6 = i8;
                        break;
                    }
                    i8++;
                }
                r3 = i6 >= 0 ? getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                r3 = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = G.f187a;
        if (getMinimumHeight() != r3) {
            setMinimumHeight(r3);
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f1786k != z3) {
            this.f1786k = z3;
            if (!z3 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
