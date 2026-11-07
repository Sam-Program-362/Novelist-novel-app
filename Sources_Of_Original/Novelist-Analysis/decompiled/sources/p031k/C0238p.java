package p031k;

import F0.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import it.returntrue.novelist.R;
import p004b1.Q;
import p017g.a;

/* JADX INFO: renamed from: k.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0238p extends ImageButton {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0236n f3745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Q f3746l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0238p(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        k0.a(context);
        j0.a(this, getContext());
        C0236n c0236n = new C0236n(this);
        this.f3745k = c0236n;
        c0236n.b(null, R.attr.toolbarNavigationButtonStyle);
        Q q3 = new Q(this);
        this.f3746l = q3;
        q3.w(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0236n c0236n = this.f3745k;
        if (c0236n != null) {
            c0236n.a();
        }
        Q q3 = this.f3746l;
        if (q3 != null) {
            q3.s();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        b bVar;
        C0236n c0236n = this.f3745k;
        if (c0236n == null || (bVar = c0236n.f3735e) == null) {
            return null;
        }
        return (ColorStateList) bVar.f302c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b bVar;
        C0236n c0236n = this.f3745k;
        if (c0236n == null || (bVar = c0236n.f3735e) == null) {
            return null;
        }
        return (PorterDuff.Mode) bVar.f303d;
    }

    public ColorStateList getSupportImageTintList() {
        b bVar;
        Q q3 = this.f3746l;
        if (q3 == null || (bVar = (b) q3.f2600m) == null) {
            return null;
        }
        return (ColorStateList) bVar.f302c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        b bVar;
        Q q3 = this.f3746l;
        if (q3 == null || (bVar = (b) q3.f2600m) == null) {
            return null;
        }
        return (PorterDuff.Mode) bVar.f303d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3746l.f2599l).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0236n c0236n = this.f3745k;
        if (c0236n != null) {
            c0236n.f3733c = -1;
            c0236n.d(null);
            c0236n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0236n c0236n = this.f3745k;
        if (c0236n != null) {
            c0236n.c(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        Q q3 = this.f3746l;
        if (q3 != null) {
            q3.s();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        Q q3 = this.f3746l;
        if (q3 != null) {
            q3.s();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        Q q3 = this.f3746l;
        ImageView imageView = (ImageView) q3.f2599l;
        if (i3 != 0) {
            Drawable drawableA = a.a(imageView.getContext(), i3);
            if (drawableA != null) {
                Rect rect = B.f3577a;
            }
            imageView.setImageDrawable(drawableA);
        } else {
            imageView.setImageDrawable(null);
        }
        q3.s();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        Q q3 = this.f3746l;
        if (q3 != null) {
            q3.s();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0236n c0236n = this.f3745k;
        if (c0236n != null) {
            c0236n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0236n c0236n = this.f3745k;
        if (c0236n != null) {
            c0236n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        Q q3 = this.f3746l;
        if (q3 != null) {
            if (((b) q3.f2600m) == null) {
                q3.f2600m = new b();
            }
            b bVar = (b) q3.f2600m;
            bVar.f302c = colorStateList;
            bVar.f301b = true;
            q3.s();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        Q q3 = this.f3746l;
        if (q3 != null) {
            if (((b) q3.f2600m) == null) {
                q3.f2600m = new b();
            }
            b bVar = (b) q3.f2600m;
            bVar.f303d = mode;
            bVar.f300a = true;
            q3.s();
        }
    }
}
