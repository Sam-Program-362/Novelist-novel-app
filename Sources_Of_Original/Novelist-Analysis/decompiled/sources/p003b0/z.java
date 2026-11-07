package p003b0;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import p002b.o;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2566a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2567b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f2568c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
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
            o oVar = (o) obj;
            oVar.c(oVar.f2333e && z3);
        }
    }
}
