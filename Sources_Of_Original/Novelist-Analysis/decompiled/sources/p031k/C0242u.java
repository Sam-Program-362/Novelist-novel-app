package p031k;

import B.c;
import B.d;
import B1.e;
import E2.a;
import G.b;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p004b1.Q;

/* JADX INFO: renamed from: k.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0242u extends TextView implements b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0236n f3791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0241t f3792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q f3793m;
    public Future n;

    public C0242u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0236n c0236n = this.f3791k;
        if (c0236n != null) {
            c0236n.a();
        }
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            c0241t.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b.f362a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            return Math.round(c0241t.f3777i.f3808e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (b.f362a) {
            return super.getAutoSizeMinTextSize();
        }
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            return Math.round(c0241t.f3777i.f3807d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (b.f362a) {
            return super.getAutoSizeStepGranularity();
        }
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            return Math.round(c0241t.f3777i.f3806c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f362a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0241t c0241t = this.f3792l;
        return c0241t != null ? c0241t.f3777i.f3809f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f362a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            return c0241t.f3777i.f3804a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        F0.b bVar;
        C0236n c0236n = this.f3791k;
        if (c0236n == null || (bVar = c0236n.f3735e) == null) {
            return null;
        }
        return (ColorStateList) bVar.f302c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        F0.b bVar;
        C0236n c0236n = this.f3791k;
        if (c0236n == null || (bVar = c0236n.f3735e) == null) {
            return null;
        }
        return (PorterDuff.Mode) bVar.f303d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        F0.b bVar = this.f3792l.f3776h;
        if (bVar != null) {
            return (ColorStateList) bVar.f302c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        F0.b bVar = this.f3792l.f3776h;
        if (bVar != null) {
            return (PorterDuff.Mode) bVar.f303d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.n;
        if (future != null) {
            try {
                this.n = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                a.x(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        Q q3;
        if (Build.VERSION.SDK_INT >= 28 || (q3 = this.f3793m) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) q3.f2600m;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0242u) q3.f2599l).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public c getTextMetricsParamsCompat() {
        return a.x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        C0241t c0241t = this.f3792l;
        if (c0241t == null || b.f362a) {
            return;
        }
        c0241t.f3777i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        Future future = this.n;
        if (future != null) {
            try {
                this.n = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                a.x(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C0241t c0241t = this.f3792l;
        if (c0241t == null || b.f362a) {
            return;
        }
        C0246y c0246y = c0241t.f3777i;
        if (c0246y.f3804a != 0) {
            c0246y.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (b.f362a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
            return;
        }
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            C0246y c0246y = c0241t.f3777i;
            DisplayMetrics displayMetrics = c0246y.f3813j.getResources().getDisplayMetrics();
            c0246y.i(TypedValue.applyDimension(i6, i3, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (c0246y.g()) {
                c0246y.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (b.f362a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            C0246y c0246y = c0241t.f3777i;
            c0246y.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i3 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0246y.f3813j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArrCopyOf[i4] = Math.round(TypedValue.applyDimension(i3, iArr[i4], displayMetrics));
                    }
                }
                c0246y.f3809f = C0246y.b(iArrCopyOf);
                if (!c0246y.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0246y.f3810g = false;
            }
            if (c0246y.g()) {
                c0246y.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (b.f362a) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            C0246y c0246y = c0241t.f3777i;
            if (i3 == 0) {
                c0246y.f3804a = 0;
                c0246y.f3807d = -1.0f;
                c0246y.f3808e = -1.0f;
                c0246y.f3806c = -1.0f;
                c0246y.f3809f = new int[0];
                c0246y.f3805b = false;
                return;
            }
            if (i3 != 1) {
                c0246y.getClass();
                throw new IllegalArgumentException(e.g("Unknown auto-size text type: ", i3));
            }
            DisplayMetrics displayMetrics = c0246y.f3813j.getResources().getDisplayMetrics();
            c0246y.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0246y.g()) {
                c0246y.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0236n c0236n = this.f3791k;
        if (c0236n != null) {
            c0236n.f3733c = -1;
            c0236n.d(null);
            c0236n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0236n c0236n = this.f3791k;
        if (c0236n != null) {
            c0236n.c(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            c0241t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            c0241t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            c0241t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            c0241t.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.X(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i3);
        } else {
            a.O(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i3);
        } else {
            a.P(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i3 != fontMetricsInt) {
            setLineSpacing(i3 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        a.x(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0236n c0236n = this.f3791k;
        if (c0236n != null) {
            c0236n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0236n c0236n = this.f3791k;
        if (c0236n != null) {
            c0236n.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0241t c0241t = this.f3792l;
        if (c0241t.f3776h == null) {
            c0241t.f3776h = new F0.b();
        }
        F0.b bVar = c0241t.f3776h;
        bVar.f302c = colorStateList;
        bVar.f301b = colorStateList != null;
        c0241t.f3770b = bVar;
        c0241t.f3771c = bVar;
        c0241t.f3772d = bVar;
        c0241t.f3773e = bVar;
        c0241t.f3774f = bVar;
        c0241t.f3775g = bVar;
        c0241t.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0241t c0241t = this.f3792l;
        if (c0241t.f3776h == null) {
            c0241t.f3776h = new F0.b();
        }
        F0.b bVar = c0241t.f3776h;
        bVar.f303d = mode;
        bVar.f300a = mode != null;
        c0241t.f3770b = bVar;
        c0241t.f3771c = bVar;
        c0241t.f3772d = bVar;
        c0241t.f3773e = bVar;
        c0241t.f3774f = bVar;
        c0241t.f3775g = bVar;
        c0241t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            c0241t.e(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        Q q3;
        if (Build.VERSION.SDK_INT >= 28 || (q3 = this.f3793m) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            q3.f2600m = textClassifier;
        }
    }

    public void setTextFuture(Future<d> future) {
        this.n = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f75b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        getPaint().set(cVar.f74a);
        setBreakStrategy(cVar.f76c);
        setHyphenationFrequency(cVar.f77d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f3) {
        boolean z3 = b.f362a;
        if (z3) {
            super.setTextSize(i3, f3);
            return;
        }
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            C0246y c0246y = c0241t.f3777i;
            if (z3 || c0246y.f3804a != 0) {
                return;
            }
            c0246y.f(i3, f3);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typefaceCreate;
        if (typeface == null || i3 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            S0.a aVar = w.e.f4640a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i3);
        }
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        super.setTypeface(typeface, i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0242u(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        k0.a(context);
        j0.a(this, getContext());
        C0236n c0236n = new C0236n(this);
        this.f3791k = c0236n;
        c0236n.b(attributeSet, i3);
        C0241t c0241t = new C0241t(this);
        this.f3792l = c0241t;
        c0241t.d(attributeSet, i3);
        c0241t.b();
        Q q3 = new Q(6, false);
        q3.f2599l = this;
        this.f3793m = q3;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? p017g.a.a(context, i3) : null, i4 != 0 ? p017g.a.a(context, i4) : null, i5 != 0 ? p017g.a.a(context, i5) : null, i6 != 0 ? p017g.a.a(context, i6) : null);
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            c0241t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? p017g.a.a(context, i3) : null, i4 != 0 ? p017g.a.a(context, i4) : null, i5 != 0 ? p017g.a.a(context, i5) : null, i6 != 0 ? p017g.a.a(context, i6) : null);
        C0241t c0241t = this.f3792l;
        if (c0241t != null) {
            c0241t.b();
        }
    }
}
