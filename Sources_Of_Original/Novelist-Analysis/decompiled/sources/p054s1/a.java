package p054s1;

import android.util.SparseArray;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f4478a;

    public a(c cVar) {
        this.f4478a = cVar;
    }

    @Override // p054s1.b
    public final void b() {
        c cVar = this.f4478a;
        Iterator it2 = cVar.f4499v.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).b();
        }
        s sVar = cVar.f4497s;
        SparseArray sparseArray = sVar.f3237v;
        while (sparseArray.size() > 0) {
            sVar.f3227G.p(sparseArray.keyAt(0));
        }
        r rVar = cVar.f4498t;
        SparseArray sparseArray2 = rVar.f3215s;
        while (sparseArray2.size() > 0) {
            rVar.f3207A.p(sparseArray2.keyAt(0));
        }
        cVar.f4490k.f136d = null;
    }

    @Override // p054s1.b
    public final void a() {
    }
}
