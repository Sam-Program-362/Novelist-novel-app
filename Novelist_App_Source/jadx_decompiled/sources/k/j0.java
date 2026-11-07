package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import f.AbstractC0243a;
import g.AbstractC0250a;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3712a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3713b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3714c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3715d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3716e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3717f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f3718g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0243a.f2796h);
        try {
            if (!obtainStyledAttributes.hasValue(115)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i3) {
        ColorStateList d3 = d(context, i3);
        if (d3 != null && d3.isStateful()) {
            return d3.getColorForState(f3713b, d3.getDefaultColor());
        }
        ThreadLocal threadLocal = f3712a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f3 = typedValue.getFloat();
        int c3 = c(context, i3);
        int round = Math.round(Color.alpha(c3) * f3);
        int i4 = w.a.f4633a;
        if (round < 0 || round > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (c3 & 16777215) | (round << 24);
    }

    public static int c(Context context, int i3) {
        int[] iArr = f3718g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i3) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f3718g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                Object obj = AbstractC0250a.f2826a;
                colorStateList = context.getColorStateList(resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
            colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
