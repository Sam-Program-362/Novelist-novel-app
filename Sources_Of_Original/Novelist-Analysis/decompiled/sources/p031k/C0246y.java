package p031k;

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

/* JADX INFO: renamed from: k.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0246y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f3802l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f3803m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3804a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3805b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3806c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3807d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3808e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f3809f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3810g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f3811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f3812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f3813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0243v f3814k;

    static {
        new ConcurrentHashMap();
    }

    public C0246y(TextView textView) {
        this.f3812i = textView;
        this.f3813j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3814k = new C0244w();
        } else {
            this.f3814k = new C0243v();
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
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
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
                        float fC = c(rectF);
                        if (fC != this.f3812i.getTextSize()) {
                            f(0, fC);
                        }
                    } catch (Throwable th) {
                        throw th;
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
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f3811h, Math.round(rectF.right));
            builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            try {
                this.f3814k.b(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            StaticLayout staticLayoutBuild = builderObtain.build();
            if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && staticLayoutBuild.getHeight() <= rectF.bottom) {
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
        float fApplyDimension = TypedValue.applyDimension(i3, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f3812i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f3805b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (zIsInLayout) {
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
                int iFloor = ((int) Math.floor((this.f3808e - this.f3807d) / this.f3806c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i3 = 0; i3 < iFloor; i3++) {
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
        int[] iArr = this.f3809f;
        int length = iArr.length;
        boolean z3 = length > 0;
        this.f3810g = z3;
        if (z3) {
            this.f3804a = 1;
            this.f3807d = iArr[0];
            this.f3808e = iArr[length - 1];
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
