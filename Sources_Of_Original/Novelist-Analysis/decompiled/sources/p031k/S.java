package p031k;

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
import p042o.g;
import p042o.h;
import p042o.k;
import p045p.a;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static S f3638g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f3640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f3641b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f3642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0047c f3644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f3637f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Q f3639h = new Q(6);

    public static synchronized S b() {
        try {
            if (f3638g == null) {
                f3638g = new S();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3638g;
    }

    public static synchronized PorterDuffColorFilter e(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        Q q3 = f3639h;
        q3.getClass();
        int i4 = (31 + i3) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) q3.a(Integer.valueOf(mode.hashCode() + i4));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i3) {
        Drawable drawableNewDrawable;
        Object obj;
        if (this.f3642c == null) {
            this.f3642c = new TypedValue();
        }
        TypedValue typedValue = this.f3642c;
        context.getResources().getValue(i3, typedValue, true);
        long j3 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            g gVar = (g) this.f3641b.get(context);
            drawableNewDrawable = null;
            if (gVar != null) {
                int iB = a.b(gVar.f4197l, gVar.n, j3);
                if (iB < 0 || (obj = gVar.f4198m[iB]) == h.f4199a) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawableNewDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int iB2 = a.b(gVar.f4197l, gVar.n, j3);
                        if (iB2 >= 0) {
                            Object[] objArr = gVar.f4198m;
                            Object obj2 = objArr[iB2];
                            Object obj3 = h.f4199a;
                            if (obj2 != obj3) {
                                objArr[iB2] = obj3;
                                gVar.f4196k = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
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
                    g gVar2 = (g) this.f3641b.get(context);
                    if (gVar2 == null) {
                        gVar2 = new g();
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
        Drawable drawableA;
        try {
            if (!this.f3643d) {
                this.f3643d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof p0.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f3643d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i3);
            if (drawableA == null) {
                drawableA = context.getDrawable(i3);
            }
            if (drawableA != null) {
                drawableA = g(context, i3, drawableA);
            }
            if (drawableA != null) {
                Rect rect = B.f3577a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i3) {
        ColorStateList colorStateList;
        k kVar;
        WeakHashMap weakHashMap = this.f3640a;
        ColorStateList colorStateListC = null;
        colorStateList = (weakHashMap == null || (kVar = (k) weakHashMap.get(context)) == null) ? null : (ColorStateList) kVar.b(i3);
        if (colorStateList == null) {
            C0047c c0047c = this.f3644e;
            if (c0047c != null) {
                colorStateListC = c0047c.c(context, i3);
            }
            if (colorStateListC != null) {
                if (this.f3640a == null) {
                    this.f3640a = new WeakHashMap();
                }
                k kVar2 = (k) this.f3640a.get(context);
                if (kVar2 == null) {
                    kVar2 = new k();
                    this.f3640a.put(context, kVar2);
                }
                kVar2.a(i3, colorStateListC);
            }
            colorStateList = colorStateListC;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Drawable g(Context context, int i3, Drawable drawable) {
        int i4;
        int iRound;
        Drawable drawableMutate;
        int iC;
        ColorStateList colorStateListF = f(context, i3);
        if (colorStateListF != null) {
            if (B.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(colorStateListF);
            PorterDuff.Mode mode = null;
            if (this.f3644e != null && i3 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
            return drawable;
        }
        if (this.f3644e != null) {
            if (i3 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC2 = j0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0237o.f3740b;
                C0047c.d(drawableFindDrawableByLayerId, iC2, mode2);
                C0047c.d(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), j0.c(context, R.attr.colorControlNormal), mode2);
                C0047c.d(layerDrawable.findDrawableByLayerId(android.R.id.progress), j0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i3 == R.drawable.abc_ratingbar_material || i3 == R.drawable.abc_ratingbar_indicator_material || i3 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = j0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0237o.f3740b;
                C0047c.d(drawableFindDrawableByLayerId2, iB, mode3);
                C0047c.d(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), j0.c(context, R.attr.colorControlActivated), mode3);
                C0047c.d(layerDrawable2.findDrawableByLayerId(android.R.id.progress), j0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0047c c0047c = this.f3644e;
        if (c0047c != null) {
            PorterDuff.Mode mode4 = C0237o.f3740b;
            boolean z3 = true;
            if (C0047c.a((int[]) c0047c.f926a, i3)) {
                i4 = R.attr.colorControlNormal;
            } else if (C0047c.a((int[]) c0047c.f928c, i3)) {
                i4 = R.attr.colorControlActivated;
            } else {
                if (C0047c.a((int[]) c0047c.f929d, i3)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i3 == 2131230763) {
                        iRound = Math.round(40.8f);
                        i4 = 16842800;
                    } else if (i3 != R.drawable.abc_dialog_material_background) {
                        z3 = false;
                        i4 = 0;
                    }
                    if (z3) {
                        if (B.a(drawable)) {
                            drawableMutate = drawable.mutate();
                        } else {
                            drawableMutate = drawable;
                        }
                        iC = j0.c(context, i4);
                        synchronized (C0237o.class) {
                            PorterDuffColorFilter porterDuffColorFilterE = e(iC, mode4);
                        }
                        drawableMutate.setColorFilter(porterDuffColorFilterE);
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                    }
                }
                i4 = 16842801;
            }
            iRound = -1;
            if (z3) {
                if (B.a(drawable)) {
                    drawableMutate = drawable.mutate();
                } else {
                    drawableMutate = drawable;
                }
                iC = j0.c(context, i4);
                synchronized (C0237o.class) {
                    PorterDuffColorFilter porterDuffColorFilterE2 = e(iC, mode4);
                    drawableMutate.setColorFilter(porterDuffColorFilterE2);
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                }
            }
        }
        return drawable;
    }
}
