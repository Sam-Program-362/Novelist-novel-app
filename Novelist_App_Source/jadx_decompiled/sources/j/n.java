package j;

import D.G;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import it.returntrue.novelist.R;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3476a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3477b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3478c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3479d;

    /* renamed from: e, reason: collision with root package name */
    public View f3480e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3482g;

    /* renamed from: h, reason: collision with root package name */
    public o f3483h;

    /* renamed from: i, reason: collision with root package name */
    public l f3484i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f3485j;

    /* renamed from: f, reason: collision with root package name */
    public int f3481f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final m f3486k = new m(this);

    public n(Context context, j jVar, View view, boolean z3, int i3, int i4) {
        this.f3476a = context;
        this.f3477b = jVar;
        this.f3480e = view;
        this.f3478c = z3;
        this.f3479d = i3;
    }

    public final l a() {
        l sVar;
        if (this.f3484i == null) {
            Context context = this.f3476a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new g(context, this.f3480e, this.f3479d, this.f3478c);
            } else {
                sVar = new s(this.f3476a, this.f3477b, this.f3480e, this.f3479d, this.f3478c);
            }
            sVar.l(this.f3477b);
            sVar.r(this.f3486k);
            sVar.n(this.f3480e);
            sVar.j(this.f3483h);
            sVar.o(this.f3482g);
            sVar.p(this.f3481f);
            this.f3484i = sVar;
        }
        return this.f3484i;
    }

    public final boolean b() {
        l lVar = this.f3484i;
        return lVar != null && lVar.h();
    }

    public void c() {
        this.f3484i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f3485j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i3, int i4, boolean z3, boolean z4) {
        l a3 = a();
        a3.s(z4);
        if (z3) {
            int i5 = this.f3481f;
            View view = this.f3480e;
            Field field = G.f187a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f3480e.getWidth();
            }
            a3.q(i3);
            a3.t(i4);
            int i6 = (int) ((this.f3476a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a3.f3474k = new Rect(i3 - i6, i4 - i6, i3 + i6, i4 + i6);
        }
        a3.a();
    }
}
