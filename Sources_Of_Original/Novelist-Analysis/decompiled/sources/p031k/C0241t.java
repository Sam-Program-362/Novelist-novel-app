package p031k;

import A0.j;
import D.G;
import F0.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p013f.a;

/* JADX INFO: renamed from: k.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0241t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f3769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f3770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f3771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f3772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f3773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f3774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f3775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f3776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0246y f3777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3778j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3779k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f3780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3781m;

    public C0241t(TextView textView) {
        this.f3769a = textView;
        this.f3777i = new C0246y(textView);
    }

    public static b c(Context context, C0237o c0237o, int i3) {
        ColorStateList colorStateListF;
        synchronized (c0237o) {
            colorStateListF = c0237o.f3742a.f(context, i3);
        }
        if (colorStateListF == null) {
            return null;
        }
        b bVar = new b();
        bVar.f301b = true;
        bVar.f302c = colorStateListF;
        return bVar;
    }

    public final void a(Drawable drawable, b bVar) {
        if (drawable == null || bVar == null) {
            return;
        }
        C0237o.c(drawable, bVar, this.f3769a.getDrawableState());
    }

    public final void b() {
        b bVar = this.f3770b;
        TextView textView = this.f3769a;
        if (bVar != null || this.f3771c != null || this.f3772d != null || this.f3773e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f3770b);
            a(compoundDrawables[1], this.f3771c);
            a(compoundDrawables[2], this.f3772d);
            a(compoundDrawables[3], this.f3773e);
        }
        if (this.f3774f == null && this.f3775g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f3774f);
        a(compoundDrawablesRelative[2], this.f3775g);
    }

    /* JADX WARN: Code duplicated, block: B:220:0x035a  */
    public final void d(AttributeSet attributeSet, int i3) {
        C0237o c0237o;
        boolean z3;
        boolean z4;
        String string;
        String string2;
        float f3;
        float fApplyDimension;
        int i4;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        int[] iArr = a.f2795g;
        int[] iArr2 = a.f2807t;
        C0246y c0246y = this.f3777i;
        TextView textView = this.f3769a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0237o.f3740b;
        synchronized (C0237o.class) {
            try {
                if (C0237o.f3741c == null) {
                    C0237o.b();
                }
                c0237o = C0237o.f3741c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = a.f2794f;
        j jVarF = j.F(context, attributeSet, iArr3, i3);
        TextView textView2 = this.f3769a;
        G.b(textView2, textView2.getContext(), iArr3, attributeSet, (TypedArray) jVarF.f58m, i3);
        TypedArray typedArray = (TypedArray) jVarF.f58m;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f3770b = c(context, c0237o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f3771c = c(context, c0237o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f3772d = c(context, c0237o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f3773e = c(context, c0237o, typedArray.getResourceId(2, 0));
        }
        int i6 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f3774f = c(context, c0237o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f3775g = c(context, c0237o, typedArray.getResourceId(6, 0));
        }
        jVarF.J();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            j jVar = new j(context, typedArrayObtainStyledAttributes);
            if (z5 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z3 = false;
                z4 = false;
            } else {
                z3 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z4 = true;
            }
            f(context, jVar);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i6 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            jVar.J();
        } else {
            z3 = false;
            z4 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        j jVar2 = new j(context, typedArrayObtainStyledAttributes2);
        if (!z5 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z3 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z4 = true;
        }
        boolean z6 = z3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i6 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i6 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, jVar2);
        jVar2.J();
        if (!z5 && z4) {
            this.f3769a.setAllCaps(z6);
        }
        Typeface typeface = this.f3780l;
        if (typeface != null) {
            if (this.f3779k == -1) {
                textView.setTypeface(typeface, this.f3778j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            textView.setFontVariationSettings(string);
        }
        if (string2 != null) {
            textView.setTextLocales(LocaleList.forLanguageTags(string2));
        }
        Context context2 = c0246y.f3813j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        TextView textView3 = c0246y.f3812i;
        G.b(textView3, textView3.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes3, i3);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0246y.f3804a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(1)) {
            fApplyDimension = typedArrayObtainStyledAttributes3.getDimension(1, -1.0f);
            f3 = -1.0f;
        } else {
            f3 = -1.0f;
            fApplyDimension = -1.0f;
        }
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            i4 = 0;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            i4 = 0;
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr4[i7] = typedArrayObtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                c0246y.f3809f = C0246y.b(iArr4);
                c0246y.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (c0246y.f3804a == 1) {
            if (!c0246y.f3810g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f3) {
                    i5 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (fApplyDimension == f3) {
                    fApplyDimension = TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                if (dimension == f3) {
                    dimension = 1.0f;
                }
                c0246y.i(dimension2, fApplyDimension, dimension);
            }
            c0246y.g();
        }
        if (G.b.f362a && c0246y.f3804a != 0) {
            int[] iArr5 = c0246y.f3809f;
            if (iArr5.length > 0) {
                if (textView.getAutoSizeStepGranularity() != f3) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c0246y.f3807d), Math.round(c0246y.f3808e), Math.round(c0246y.f3806c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableA = resourceId4 != -1 ? c0237o.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? c0237o.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? c0237o.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? c0237o.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? c0237o.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? c0237o.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableA5 == null) {
                drawableA5 = compoundDrawablesRelative[i4];
            }
            if (drawableA2 == null) {
                drawableA2 = compoundDrawablesRelative[1];
            }
            if (drawableA6 == null) {
                drawableA6 = compoundDrawablesRelative[2];
            }
            if (drawableA4 == null) {
                drawableA4 = compoundDrawablesRelative[r3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA5, drawableA2, drawableA6, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[i4];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[i4];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawablesRelative2[r3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableA2, drawable2, drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, i4)) == 0) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            } else {
                Object obj = p017g.a.f2826a;
                colorStateList = context.getColorStateList(resourceId);
                if (colorStateList == null) {
                    colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
                }
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(B.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(14, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(17, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            E2.a.O(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            E2.a.P(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (dimensionPixelSize3 != fontMetricsInt) {
                textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
            }
        }
    }

    public final void e(Context context, int i3) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i3, a.f2807t);
        j jVar = new j(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f3769a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, jVar);
        if (i4 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        jVar.J();
        Typeface typeface = this.f3780l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3778j);
        }
    }

    public final void f(Context context, j jVar) {
        String string;
        int i3 = this.f3778j;
        TypedArray typedArray = (TypedArray) jVar.f58m;
        this.f3778j = typedArray.getInt(2, i3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(11, -1);
            this.f3779k = i5;
            if (i5 != -1) {
                this.f3778j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f3781m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 == 1) {
                    this.f3780l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f3780l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f3780l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3780l = null;
        int i7 = typedArray.hasValue(12) ? 12 : 10;
        int i8 = this.f3779k;
        int i9 = this.f3778j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceZ = jVar.z(i7, this.f3778j, new C0240s(this, i8, i9, new WeakReference(this.f3769a)));
                if (typefaceZ != null) {
                    if (i4 < 28 || this.f3779k == -1) {
                        this.f3780l = typefaceZ;
                    } else {
                        this.f3780l = Typeface.create(Typeface.create(typefaceZ, 0), this.f3779k, (this.f3778j & 2) != 0);
                    }
                }
                this.f3781m = this.f3780l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3780l != null || (string = typedArray.getString(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3779k == -1) {
            this.f3780l = Typeface.create(string, this.f3778j);
        } else {
            this.f3780l = Typeface.create(Typeface.create(string, 0), this.f3779k, (this.f3778j & 2) != 0);
        }
    }
}
