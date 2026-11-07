package androidx.recyclerview.widget;

import B1.a;
import B1.e;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import io.flutter.plugin.platform.C0311c;
import l0.AbstractC0410t;
import l0.C0379B;
import l0.C0401k;
import l0.C0411u;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f2198p;

    /* renamed from: q, reason: collision with root package name */
    public final a f2199q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f2198p = -1;
        new SparseIntArray();
        new SparseIntArray();
        a aVar = new a(20);
        this.f2199q = aVar;
        new Rect();
        int i5 = AbstractC0410t.w(context, attributeSet, i3, i4).f4006c;
        if (i5 == this.f2198p) {
            return;
        }
        if (i5 < 1) {
            throw new IllegalArgumentException(e.g("Span count should be at least 1. Provided ", i5));
        }
        this.f2198p = i5;
        ((SparseIntArray) aVar.f80l).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(C0311c c0311c, C0379B c0379b, int i3) {
        boolean z3 = c0379b.f3921c;
        a aVar = this.f2199q;
        if (!z3) {
            aVar.getClass();
            return a.j(i3, this.f2198p);
        }
        RecyclerView recyclerView = (RecyclerView) c0311c.f3172p;
        C0379B c0379b2 = recyclerView.f2239h0;
        if (i3 < 0 || i3 >= c0379b2.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + c0379b2.a() + recyclerView.h());
        }
        int w3 = !c0379b2.f3921c ? i3 : recyclerView.f2246m.w(i3, 0);
        if (w3 != -1) {
            aVar.getClass();
            return a.j(w3, this.f2198p);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    @Override // l0.AbstractC0410t
    public final boolean d(C0411u c0411u) {
        return c0411u instanceof C0401k;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, l0.AbstractC0410t
    public final C0411u l() {
        return this.f2200h == 0 ? new C0401k(-2, -1) : new C0401k(-1, -2);
    }

    @Override // l0.AbstractC0410t
    public final C0411u m(Context context, AttributeSet attributeSet) {
        return new C0401k(context, attributeSet);
    }

    @Override // l0.AbstractC0410t
    public final C0411u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0401k((ViewGroup.MarginLayoutParams) layoutParams) : new C0401k(layoutParams);
    }

    @Override // l0.AbstractC0410t
    public final int q(C0311c c0311c, C0379B c0379b) {
        if (this.f2200h == 1) {
            return this.f2198p;
        }
        if (c0379b.a() < 1) {
            return 0;
        }
        return R(c0311c, c0379b, c0379b.a() - 1) + 1;
    }

    @Override // l0.AbstractC0410t
    public final int x(C0311c c0311c, C0379B c0379b) {
        if (this.f2200h == 0) {
            return this.f2198p;
        }
        if (c0379b.a() < 1) {
            return 0;
        }
        return R(c0311c, c0379b, c0379b.a() - 1) + 1;
    }
}
