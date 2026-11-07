package p035l0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3944a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3945b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3946c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3948e;

    public J(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
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
        ArrayList arrayList = this.f3944a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        G g3 = (G) view.getLayoutParams();
        this.f3946c = this.f3948e.f2263j.b(view);
        g3.getClass();
        return this.f3946c;
    }
}
