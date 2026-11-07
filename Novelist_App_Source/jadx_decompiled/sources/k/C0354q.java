package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;
import b1.C0192Q;
import g.AbstractC0250a;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0354q extends ImageView {

    /* renamed from: k, reason: collision with root package name */
    public final C0351n f3747k;

    /* renamed from: l, reason: collision with root package name */
    public final C0192Q f3748l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0354q(Context context, int i3) {
        super(context, null, i3);
        k0.a(context);
        j0.a(this, getContext());
        C0351n c0351n = new C0351n(this);
        this.f3747k = c0351n;
        c0351n.b(null, i3);
        C0192Q c0192q = new C0192Q(this);
        this.f3748l = c0192q;
        c0192q.w(i3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0351n c0351n = this.f3747k;
        if (c0351n != null) {
            c0351n.a();
        }
        C0192Q c0192q = this.f3748l;
        if (c0192q != null) {
            c0192q.s();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        F0.b bVar;
        C0351n c0351n = this.f3747k;
        if (c0351n == null || (bVar = c0351n.f3735e) == null) {
            return null;
        }
        return (ColorStateList) bVar.f302c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        F0.b bVar;
        C0351n c0351n = this.f3747k;
        if (c0351n == null || (bVar = c0351n.f3735e) == null) {
            return null;
        }
        return (PorterDuff.Mode) bVar.f303d;
    }

    public ColorStateList getSupportImageTintList() {
        F0.b bVar;
        C0192Q c0192q = this.f3748l;
        if (c0192q == null || (bVar = (F0.b) c0192q.f2600m) == null) {
            return null;
        }
        return (ColorStateList) bVar.f302c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        F0.b bVar;
        C0192Q c0192q = this.f3748l;
        if (c0192q == null || (bVar = (F0.b) c0192q.f2600m) == null) {
            return null;
        }
        return (PorterDuff.Mode) bVar.f303d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3748l.f2599l).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0351n c0351n = this.f3747k;
        if (c0351n != null) {
            c0351n.f3733c = -1;
            c0351n.d(null);
            c0351n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0351n c0351n = this.f3747k;
        if (c0351n != null) {
            c0351n.c(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0192Q c0192q = this.f3748l;
        if (c0192q != null) {
            c0192q.s();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0192Q c0192q = this.f3748l;
        if (c0192q != null) {
            c0192q.s();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        C0192Q c0192q = this.f3748l;
        if (c0192q != null) {
            ImageView imageView = (ImageView) c0192q.f2599l;
            if (i3 != 0) {
                Drawable a3 = AbstractC0250a.a(imageView.getContext(), i3);
                if (a3 != null) {
                    Rect rect = AbstractC0336B.f3577a;
                }
                imageView.setImageDrawable(a3);
            } else {
                imageView.setImageDrawable(null);
            }
            c0192q.s();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0192Q c0192q = this.f3748l;
        if (c0192q != null) {
            c0192q.s();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0351n c0351n = this.f3747k;
        if (c0351n != null) {
            c0351n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0351n c0351n = this.f3747k;
        if (c0351n != null) {
            c0351n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0192Q c0192q = this.f3748l;
        if (c0192q != null) {
            if (((F0.b) c0192q.f2600m) == null) {
                c0192q.f2600m = new F0.b();
            }
            F0.b bVar = (F0.b) c0192q.f2600m;
            bVar.f302c = colorStateList;
            bVar.f301b = true;
            c0192q.s();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0192Q c0192q = this.f3748l;
        if (c0192q != null) {
            if (((F0.b) c0192q.f2600m) == null) {
                c0192q.f2600m = new F0.b();
            }
            F0.b bVar = (F0.b) c0192q.f2600m;
            bVar.f303d = mode;
            bVar.f300a = true;
            c0192q.s();
        }
    }
}
