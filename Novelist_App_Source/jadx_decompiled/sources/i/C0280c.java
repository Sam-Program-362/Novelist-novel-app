package i;

import D.AbstractC0009j;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j.k;
import java.lang.reflect.Constructor;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2918A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0281d f2921D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2922a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2929h;

    /* renamed from: i, reason: collision with root package name */
    public int f2930i;

    /* renamed from: j, reason: collision with root package name */
    public int f2931j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2932k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2933l;

    /* renamed from: m, reason: collision with root package name */
    public int f2934m;
    public char n;

    /* renamed from: o, reason: collision with root package name */
    public int f2935o;

    /* renamed from: p, reason: collision with root package name */
    public char f2936p;

    /* renamed from: q, reason: collision with root package name */
    public int f2937q;

    /* renamed from: r, reason: collision with root package name */
    public int f2938r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2939s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2940t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public int f2941v;

    /* renamed from: w, reason: collision with root package name */
    public int f2942w;
    public String x;
    public String y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f2943z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2919B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f2920C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2923b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2924c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2925d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2926e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2927f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2928g = true;

    public C0280c(C0281d c0281d, Menu menu) {
        this.f2921D = c0281d;
        this.f2922a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2921D.f2948c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z3 = false;
        menuItem.setChecked(this.f2939s).setVisible(this.f2940t).setEnabled(this.u).setCheckable(this.f2938r >= 1).setTitleCondensed(this.f2933l).setIcon(this.f2934m);
        int i3 = this.f2941v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.y;
        C0281d c0281d = this.f2921D;
        if (str != null) {
            if (c0281d.f2948c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0281d.f2949d == null) {
                c0281d.f2949d = C0281d.a(c0281d.f2948c);
            }
            Object obj = c0281d.f2949d;
            String str2 = this.y;
            MenuItemOnMenuItemClickListenerC0279b menuItemOnMenuItemClickListenerC0279b = new MenuItemOnMenuItemClickListenerC0279b();
            menuItemOnMenuItemClickListenerC0279b.f2916a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0279b.f2917b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0279b.f2915c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0279b);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        if (this.f2938r >= 2 && (menuItem instanceof k)) {
            k kVar = (k) menuItem;
            kVar.x = (kVar.x & (-5)) | 4;
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0281d.f2944e, c0281d.f2946a));
            z3 = true;
        }
        int i4 = this.f2942w;
        if (i4 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        CharSequence charSequence = this.f2943z;
        boolean z4 = menuItem instanceof k;
        if (z4) {
            ((k) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0009j.j(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2918A;
        if (z4) {
            ((k) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0009j.r(menuItem, charSequence2);
        }
        char c3 = this.n;
        int i5 = this.f2935o;
        if (z4) {
            ((k) menuItem).setAlphabeticShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0009j.h(menuItem, c3, i5);
        }
        char c4 = this.f2936p;
        int i6 = this.f2937q;
        if (z4) {
            ((k) menuItem).setNumericShortcut(c4, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0009j.n(menuItem, c4, i6);
        }
        PorterDuff.Mode mode = this.f2920C;
        if (mode != null) {
            if (z4) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0009j.m(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2919B;
        if (colorStateList != null) {
            if (z4) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0009j.l(menuItem, colorStateList);
            }
        }
    }
}
