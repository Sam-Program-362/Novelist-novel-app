package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import f.AbstractC0243a;
import java.lang.ref.WeakReference;

/* renamed from: k.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356t {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3769a;

    /* renamed from: b, reason: collision with root package name */
    public F0.b f3770b;

    /* renamed from: c, reason: collision with root package name */
    public F0.b f3771c;

    /* renamed from: d, reason: collision with root package name */
    public F0.b f3772d;

    /* renamed from: e, reason: collision with root package name */
    public F0.b f3773e;

    /* renamed from: f, reason: collision with root package name */
    public F0.b f3774f;

    /* renamed from: g, reason: collision with root package name */
    public F0.b f3775g;

    /* renamed from: h, reason: collision with root package name */
    public F0.b f3776h;

    /* renamed from: i, reason: collision with root package name */
    public final C0361y f3777i;

    /* renamed from: j, reason: collision with root package name */
    public int f3778j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3779k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f3780l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3781m;

    public C0356t(TextView textView) {
        this.f3769a = textView;
        this.f3777i = new C0361y(textView);
    }

    public static F0.b c(Context context, C0352o c0352o, int i3) {
        ColorStateList f3;
        synchronized (c0352o) {
            f3 = c0352o.f3742a.f(context, i3);
        }
        if (f3 == null) {
            return null;
        }
        F0.b bVar = new F0.b();
        bVar.f301b = true;
        bVar.f302c = f3;
        return bVar;
    }

    public final void a(Drawable drawable, F0.b bVar) {
        if (drawable == null || bVar == null) {
            return;
        }
        C0352o.c(drawable, bVar, this.f3769a.getDrawableState());
    }

    public final void b() {
        F0.b bVar = this.f3770b;
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

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0357, code lost:
    
        if (r3 != null) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0356t.d(android.util.AttributeSet, int):void");
    }

    public final void e(Context context, int i3) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC0243a.f2807t);
        A0.j jVar = new A0.j(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f3769a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, jVar);
        if (i4 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        jVar.J();
        Typeface typeface = this.f3780l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3778j);
        }
    }

    public final void f(Context context, A0.j jVar) {
        String string;
        Typeface create;
        Typeface create2;
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
                Typeface z3 = jVar.z(i7, this.f3778j, new C0355s(this, i8, i9, new WeakReference(this.f3769a)));
                if (z3 != null) {
                    if (i4 < 28 || this.f3779k == -1) {
                        this.f3780l = z3;
                    } else {
                        create2 = Typeface.create(Typeface.create(z3, 0), this.f3779k, (this.f3778j & 2) != 0);
                        this.f3780l = create2;
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
            create = Typeface.create(Typeface.create(string, 0), this.f3779k, (this.f3778j & 2) != 0);
            this.f3780l = create;
        }
    }
}
