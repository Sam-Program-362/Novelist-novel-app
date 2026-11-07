package l0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: l0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387J {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3944a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f3945b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f3946c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f3947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3948e;

    public C0387J(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f3948e = staggeredGridLayoutManager;
        this.f3947d = i3;
    }

    public final int a(int i3) {
        int i4 = this.f3946c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f3944a.size() == 0) {
            return i3;
        }
        View view = (View) this.f3944a.get(r3.size() - 1);
        C0384G c0384g = (C0384G) view.getLayoutParams();
        this.f3946c = this.f3948e.f2263j.b(view);
        c0384g.getClass();
        return this.f3946c;
    }
}
