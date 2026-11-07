package p031k;

import A0.j;
import D.G;
import F0.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;
import p013f.a;

/* JADX INFO: renamed from: k.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0236n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0237o f3732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3733c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f3734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f3735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f3736f;

    public C0236n(View view) {
        C0237o c0237o;
        this.f3731a = view;
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
        this.f3732b = c0237o;
    }

    public final void a() {
        View view = this.f3731a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f3734d != null) {
                if (this.f3736f == null) {
                    this.f3736f = new b();
                }
                b bVar = this.f3736f;
                bVar.f302c = null;
                bVar.f301b = false;
                bVar.f303d = null;
                bVar.f300a = false;
                Field field = G.f187a;
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
                    C0237o.c(background, bVar, view.getDrawableState());
                    return;
                }
            }
            b bVar2 = this.f3735e;
            if (bVar2 != null) {
                C0237o.c(background, bVar2, view.getDrawableState());
                return;
            }
            b bVar3 = this.f3734d;
            if (bVar3 != null) {
                C0237o.c(background, bVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i3) {
        ColorStateList colorStateListF;
        View view = this.f3731a;
        Context context = view.getContext();
        int[] iArr = a.f2808v;
        j jVarF = j.F(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) jVarF.f58m;
        View view2 = this.f3731a;
        G.b(view2, view2.getContext(), iArr, attributeSet, (TypedArray) jVarF.f58m, i3);
        try {
            if (typedArray.hasValue(0)) {
                this.f3733c = typedArray.getResourceId(0, -1);
                C0237o c0237o = this.f3732b;
                Context context2 = view.getContext();
                int i4 = this.f3733c;
                synchronized (c0237o) {
                    colorStateListF = c0237o.f3742a.f(context2, i4);
                }
                if (colorStateListF != null) {
                    d(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(jVarF.x(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(B.c(typedArray.getInt(2, -1), null));
            }
            jVarF.J();
        } catch (Throwable th) {
            jVarF.J();
            throw th;
        }
    }

    public final void c(int i3) {
        ColorStateList colorStateListF;
        this.f3733c = i3;
        C0237o c0237o = this.f3732b;
        if (c0237o != null) {
            Context context = this.f3731a.getContext();
            synchronized (c0237o) {
                colorStateListF = c0237o.f3742a.f(context, i3);
            }
        } else {
            colorStateListF = null;
        }
        d(colorStateListF);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3734d == null) {
                this.f3734d = new b();
            }
            b bVar = this.f3734d;
            bVar.f302c = colorStateList;
            bVar.f301b = true;
        } else {
            this.f3734d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f3735e == null) {
            this.f3735e = new b();
        }
        b bVar = this.f3735e;
        bVar.f302c = colorStateList;
        bVar.f301b = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f3735e == null) {
            this.f3735e = new b();
        }
        b bVar = this.f3735e;
        bVar.f303d = mode;
        bVar.f300a = true;
        a();
    }
}
