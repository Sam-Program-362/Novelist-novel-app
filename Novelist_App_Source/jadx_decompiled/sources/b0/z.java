package b0;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2566a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f2567b = false;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f2568c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f2569d;

    public z(I i3) {
        this.f2569d = i3;
    }

    public final void a(boolean z3) {
        this.f2567b = z3;
        ArrayList arrayList = this.f2566a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            b.o oVar = (b.o) obj;
            oVar.c(oVar.f2333e && z3);
        }
    }
}
