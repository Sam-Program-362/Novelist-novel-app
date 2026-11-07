package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: k.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361y {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f3802l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f3803m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f3804a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3805b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f3806c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f3807d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f3808e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3809f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f3810g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f3811h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f3812i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f3813j;

    /* renamed from: k, reason: collision with root package name */
    public final C0358v f3814k;

    static {
        new ConcurrentHashMap();
    }

    public C0361y(TextView textView) {
        this.f3812i = textView;
        this.f3813j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3814k = new C0359w();
        } else {
            this.f3814k = new C0358v();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i3 : iArr) {
                if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i4 = 0; i4 < size; i4++) {
                    iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f3803m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e3);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj2;
        }
    }

    public final void a() {
        if (this.f3804a != 0) {
            if (this.f3805b) {
                if (this.f3812i.getMeasuredHeight() <= 0 || this.f3812i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3814k.a(this.f3812i) ? 1048576 : (this.f3812i.getMeasuredWidth() - this.f3812i.getTotalPaddingLeft()) - this.f3812i.getTotalPaddingRight();
                int height = (this.f3812i.getHeight() - this.f3812i.getCompoundPaddingBottom()) - this.f3812i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3802l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c3 = c(rectF);
                        if (c3 != this.f3812i.getTextSize()) {
                            f(0, c3);
                        }
                    } finally {
                    }
                }
            }
            this.f3805b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f3809f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = length - 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 <= i3) {
            int i6 = (i4 + i3) / 2;
            int i7 = this.f3809f[i6];
            TextView textView = this.f3812i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f3811h;
            if (textPaint == null) {
                this.f3811h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f3811h.set(textView.getPaint());
            this.f3811h.setTextSize(i7);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment");
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f3811h, Math.round(rectF.right));
            obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            try {
                this.f3814k.b(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            StaticLayout build = obtain.build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                int i8 = i6 + 1;
                i5 = i4;
                i4 = i8;
            } else {
                i5 = i6 - 1;
                i3 = i5;
            }
        }
        return this.f3809f[i5];
    }

    public final void f(int i3, float f3) {
        Context context = this.f3813j;
        float applyDimension = TypedValue.applyDimension(i3, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f3812i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f3805b = false;
                try {
                    Method d3 = d("nullLayouts");
                    if (d3 != null) {
                        d3.invoke(textView, null);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (this.f3804a == 1) {
            if (!this.f3810g || this.f3809f.length == 0) {
                int floor = ((int) Math.floor((this.f3808e - this.f3807d) / this.f3806c)) + 1;
                int[] iArr = new int[floor];
                for (int i3 = 0; i3 < floor; i3++) {
                    iArr[i3] = Math.round((i3 * this.f3806c) + this.f3807d);
                }
                this.f3809f = b(iArr);
            }
            this.f3805b = true;
        } else {
            this.f3805b = false;
        }
        return this.f3805b;
    }

    public final boolean h() {
        boolean z3 = this.f3809f.length > 0;
        this.f3810g = z3;
        if (z3) {
            this.f3804a = 1;
            this.f3807d = r0[0];
            this.f3808e = r0[r1 - 1];
            this.f3806c = -1.0f;
        }
        return z3;
    }

    public final void i(float f3, float f4, float f5) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f4 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
        }
        this.f3804a = 1;
        this.f3807d = f3;
        this.f3808e = f4;
        this.f3806c = f5;
        this.f3810g = false;
    }
}
