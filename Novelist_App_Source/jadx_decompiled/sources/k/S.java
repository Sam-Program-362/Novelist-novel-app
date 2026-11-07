package k;

import M0.C0047c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import it.returntrue.novelist.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p.AbstractC0443a;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: g, reason: collision with root package name */
    public static S f3638g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f3640a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f3641b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f3642c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3643d;

    /* renamed from: e, reason: collision with root package name */
    public C0047c f3644e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f3637f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final Q f3639h = new Q(6);

    public static synchronized S b() {
        S s3;
        synchronized (S.class) {
            try {
                if (f3638g == null) {
                    f3638g = new S();
                }
                s3 = f3638g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s3;
    }

    public static synchronized PorterDuffColorFilter e(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (S.class) {
            Q q3 = f3639h;
            q3.getClass();
            int i4 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) q3.a(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i3) {
        Drawable drawable;
        Object obj;
        if (this.f3642c == null) {
            this.f3642c = new TypedValue();
        }
        TypedValue typedValue = this.f3642c;
        context.getResources().getValue(i3, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            o.g gVar = (o.g) this.f3641b.get(context);
            drawable = null;
            if (gVar != null) {
                int b3 = AbstractC0443a.b(gVar.f4197l, gVar.n, j3);
                if (b3 < 0 || (obj = gVar.f4198m[b3]) == o.h.f4199a) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b4 = AbstractC0443a.b(gVar.f4197l, gVar.n, j3);
                        if (b4 >= 0) {
                            Object[] objArr = gVar.f4198m;
                            Object obj2 = objArr[b4];
                            Object obj3 = o.h.f4199a;
                            if (obj2 != obj3) {
                                objArr[b4] = obj3;
                                gVar.f4196k = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f3644e != null && i3 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131230737)});
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    o.g gVar2 = (o.g) this.f3641b.get(context);
                    if (gVar2 == null) {
                        gVar2 = new o.g();
                        this.f3641b.put(context, gVar2);
                    }
                    gVar2.a(j3, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i3) {
        return d(context, i3);
    }

    public final synchronized Drawable d(Context context, int i3) {
        Drawable a3;
        try {
            if (!this.f3643d) {
                this.f3643d = true;
                Drawable c3 = c(context, R.drawable.abc_vector_test);
                if (c3 == null || (!(c3 instanceof p0.a) && !"android.graphics.drawable.VectorDrawable".equals(c3.getClass().getName()))) {
                    this.f3643d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a3 = a(context, i3);
            if (a3 == null) {
                a3 = context.getDrawable(i3);
            }
            if (a3 != null) {
                a3 = g(context, i3, a3);
            }
            if (a3 != null) {
                Rect rect = AbstractC0336B.f3577a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a3;
    }

    public final synchronized ColorStateList f(Context context, int i3) {
        ColorStateList colorStateList;
        o.k kVar;
        WeakHashMap weakHashMap = this.f3640a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (kVar = (o.k) weakHashMap.get(context)) == null) ? null : (ColorStateList) kVar.b(i3);
        if (colorStateList == null) {
            C0047c c0047c = this.f3644e;
            if (c0047c != null) {
                colorStateList2 = c0047c.c(context, i3);
            }
            if (colorStateList2 != null) {
                if (this.f3640a == null) {
                    this.f3640a = new WeakHashMap();
                }
                o.k kVar2 = (o.k) this.f3640a.get(context);
                if (kVar2 == null) {
                    kVar2 = new o.k();
                    this.f3640a.put(context, kVar2);
                }
                kVar2.a(i3, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r9, int r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.S.g(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
