package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import f.AbstractC0243a;
import java.lang.reflect.Field;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351n {

    /* renamed from: a, reason: collision with root package name */
    public final View f3731a;

    /* renamed from: b, reason: collision with root package name */
    public final C0352o f3732b;

    /* renamed from: c, reason: collision with root package name */
    public int f3733c = -1;

    /* renamed from: d, reason: collision with root package name */
    public F0.b f3734d;

    /* renamed from: e, reason: collision with root package name */
    public F0.b f3735e;

    /* renamed from: f, reason: collision with root package name */
    public F0.b f3736f;

    public C0351n(View view) {
        C0352o c0352o;
        this.f3731a = view;
        PorterDuff.Mode mode = C0352o.f3740b;
        synchronized (C0352o.class) {
            try {
                if (C0352o.f3741c == null) {
                    C0352o.b();
                }
                c0352o = C0352o.f3741c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3732b = c0352o;
    }

    public final void a() {
        View view = this.f3731a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f3734d != null) {
                if (this.f3736f == null) {
                    this.f3736f = new F0.b();
                }
                F0.b bVar = this.f3736f;
                bVar.f302c = null;
                bVar.f301b = false;
                bVar.f303d = null;
                bVar.f300a = false;
                Field field = D.G.f187a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    bVar.f301b = true;
                    bVar.f302c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    bVar.f300a = true;
                    bVar.f303d = backgroundTintMode;
                }
                if (bVar.f301b || bVar.f300a) {
                    C0352o.c(background, bVar, view.getDrawableState());
                    return;
                }
            }
            F0.b bVar2 = this.f3735e;
            if (bVar2 != null) {
                C0352o.c(background, bVar2, view.getDrawableState());
                return;
            }
            F0.b bVar3 = this.f3734d;
            if (bVar3 != null) {
                C0352o.c(background, bVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i3) {
        ColorStateList f3;
        View view = this.f3731a;
        Context context = view.getContext();
        int[] iArr = AbstractC0243a.f2808v;
        A0.j F3 = A0.j.F(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) F3.f58m;
        View view2 = this.f3731a;
        D.G.b(view2, view2.getContext(), iArr, attributeSet, (TypedArray) F3.f58m, i3);
        try {
            if (typedArray.hasValue(0)) {
                this.f3733c = typedArray.getResourceId(0, -1);
                C0352o c0352o = this.f3732b;
                Context context2 = view.getContext();
                int i4 = this.f3733c;
                synchronized (c0352o) {
                    f3 = c0352o.f3742a.f(context2, i4);
                }
                if (f3 != null) {
                    d(f3);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(F3.x(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC0336B.c(typedArray.getInt(2, -1), null));
            }
            F3.J();
        } catch (Throwable th) {
            F3.J();
            throw th;
        }
    }

    public final void c(int i3) {
        ColorStateList colorStateList;
        this.f3733c = i3;
        C0352o c0352o = this.f3732b;
        if (c0352o != null) {
            Context context = this.f3731a.getContext();
            synchronized (c0352o) {
                colorStateList = c0352o.f3742a.f(context, i3);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3734d == null) {
                this.f3734d = new F0.b();
            }
            F0.b bVar = this.f3734d;
            bVar.f302c = colorStateList;
            bVar.f301b = true;
        } else {
            this.f3734d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f3735e == null) {
            this.f3735e = new F0.b();
        }
        F0.b bVar = this.f3735e;
        bVar.f302c = colorStateList;
        bVar.f301b = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f3735e == null) {
            this.f3735e = new F0.b();
        }
        F0.b bVar = this.f3735e;
        bVar.f303d = mode;
        bVar.f300a = true;
        a();
    }
}
