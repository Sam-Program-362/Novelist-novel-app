package p031k;

import F0.b;
import M0.C0047c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* JADX INFO: renamed from: k.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0237o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3740b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0237o f3741c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S f3742a;

    public static synchronized void b() {
        if (f3741c == null) {
            C0237o c0237o = new C0237o();
            f3741c = c0237o;
            c0237o.f3742a = S.b();
            S s3 = f3741c.f3742a;
            C0047c c0047c = new C0047c();
            synchronized (s3) {
                s3.f3644e = c0047c;
            }
        }
    }

    public static void c(Drawable drawable, b bVar, int[] iArr) {
        PorterDuff.Mode mode = S.f3637f;
        if (B.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z3 = bVar.f301b;
        if (!z3 && !bVar.f300a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z3 ? (ColorStateList) bVar.f302c : null;
        PorterDuff.Mode mode2 = bVar.f300a ? (PorterDuff.Mode) bVar.f303d : S.f3637f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = S.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable a(Context context, int i3) {
        return this.f3742a.c(context, i3);
    }
}
