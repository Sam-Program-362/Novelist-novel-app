package k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class r0 implements InterfaceC0335A {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f3750a;

    /* renamed from: b, reason: collision with root package name */
    public int f3751b;

    /* renamed from: c, reason: collision with root package name */
    public View f3752c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f3753d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f3754e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3755f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3756g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f3757h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f3758i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3759j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f3760k;

    /* renamed from: l, reason: collision with root package name */
    public int f3761l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f3762m;

    public final void a(int i3) {
        View view;
        Toolbar toolbar = this.f3750a;
        int i4 = this.f3751b ^ i3;
        this.f3751b = i3;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                Toolbar toolbar2 = this.f3750a;
                if ((this.f3751b & 4) != 0) {
                    Drawable drawable = this.f3755f;
                    if (drawable == null) {
                        drawable = this.f3762m;
                    }
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                c();
            }
            if ((i4 & 8) != 0) {
                if ((i3 & 8) != 0) {
                    toolbar.setTitle(this.f3757h);
                    toolbar.setSubtitle(this.f3758i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f3752c) == null) {
                return;
            }
            if ((i3 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f3750a;
        if ((this.f3751b & 4) != 0) {
            if (TextUtils.isEmpty(this.f3759j)) {
                toolbar.setNavigationContentDescription(this.f3761l);
            } else {
                toolbar.setNavigationContentDescription(this.f3759j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f3751b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) != 0) {
            drawable = this.f3754e;
            if (drawable == null) {
                drawable = this.f3753d;
            }
        } else {
            drawable = this.f3753d;
        }
        this.f3750a.setLogo(drawable);
    }
}
