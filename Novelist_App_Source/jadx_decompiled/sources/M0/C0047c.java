package M0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import e1.C0240a;
import g.AbstractC0250a;
import it.returntrue.novelist.R;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k.AbstractC0336B;
import k.C0352o;
import k.S;
import k.j0;

/* renamed from: M0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f926a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f927b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f928c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f929d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f930e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f931f;

    public C0047c(String str, String str2, Set set) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f926a = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f928c = str;
        this.f929d = str2;
        this.f930e = C0240a.f2781k;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it2 = map.values().iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.f927b = Collections.unmodifiableSet(hashSet);
    }

    public static boolean a(int[] iArr, int i3) {
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i3) {
        int c3 = j0.c(context, R.attr.colorControlHighlight);
        int b3 = j0.b(context, R.attr.colorButtonNormal);
        int[] iArr = j0.f3713b;
        int[] iArr2 = j0.f3715d;
        int a3 = w.a.a(c3, i3);
        return new ColorStateList(new int[][]{iArr, iArr2, j0.f3714c, j0.f3717f}, new int[]{b3, a3, w.a.a(c3, i3), i3});
    }

    public static void d(Drawable drawable, int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter e3;
        if (AbstractC0336B.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0352o.f3740b;
        }
        PorterDuff.Mode mode2 = C0352o.f3740b;
        synchronized (C0352o.class) {
            e3 = S.e(i3, mode);
        }
        drawable.setColorFilter(e3);
    }

    public ColorStateList c(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            Object obj = AbstractC0250a.f2826a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i3 == 2131230790) {
            Object obj2 = AbstractC0250a.f2826a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i3 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d3 = j0.d(context, R.attr.colorSwitchThumbNormal);
            if (d3 == null || !d3.isStateful()) {
                iArr[0] = j0.f3713b;
                iArr2[0] = j0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = j0.f3716e;
                iArr2[1] = j0.c(context, R.attr.colorControlActivated);
                iArr[2] = j0.f3717f;
                iArr2[2] = j0.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = j0.f3713b;
                iArr[0] = iArr3;
                iArr2[0] = d3.getColorForState(iArr3, 0);
                iArr[1] = j0.f3716e;
                iArr2[1] = j0.c(context, R.attr.colorControlActivated);
                iArr[2] = j0.f3717f;
                iArr2[2] = d3.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
            return b(context, j0.c(context, R.attr.colorButtonNormal));
        }
        if (i3 == R.drawable.abc_btn_borderless_material) {
            return b(context, 0);
        }
        if (i3 == R.drawable.abc_btn_colored_material) {
            return b(context, j0.c(context, R.attr.colorAccent));
        }
        if (i3 == 2131230787 || i3 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = AbstractC0250a.f2826a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (a((int[]) this.f927b, i3)) {
            return j0.d(context, R.attr.colorControlNormal);
        }
        if (a((int[]) this.f930e, i3)) {
            Object obj4 = AbstractC0250a.f2826a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (a((int[]) this.f931f, i3)) {
            Object obj5 = AbstractC0250a.f2826a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i3 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = AbstractC0250a.f2826a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int[], java.io.Serializable] */
    public C0047c() {
        this.f926a = new int[]{2131230803, 2131230801, 2131230720};
        this.f927b = new int[]{2131230744, R.drawable.abc_seekbar_tick_mark_material, 2131230751, 2131230746, 2131230747, 2131230750, 2131230749};
        this.f928c = new int[]{2131230800, 2131230802, 2131230737, R.drawable.abc_text_cursor_material, 2131230794, 2131230796, 2131230798, 2131230795, 2131230797, 2131230799};
        this.f929d = new int[]{2131230775, R.drawable.abc_cab_background_internal_bg, 2131230774};
        this.f930e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f931f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }
}
