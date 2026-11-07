package s1;

import android.util.SparseArray;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.util.Iterator;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465a implements InterfaceC0466b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0467c f4478a;

    public C0465a(C0467c c0467c) {
        this.f4478a = c0467c;
    }

    @Override // s1.InterfaceC0466b
    public final void b() {
        C0467c c0467c = this.f4478a;
        Iterator it2 = c0467c.f4499v.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0466b) it2.next()).b();
        }
        s sVar = c0467c.f4497s;
        SparseArray sparseArray = sVar.f3237v;
        while (sparseArray.size() > 0) {
            sVar.f3227G.p(sparseArray.keyAt(0));
        }
        r rVar = c0467c.f4498t;
        SparseArray sparseArray2 = rVar.f3215s;
        while (sparseArray2.size() > 0) {
            rVar.f3207A.p(sparseArray2.keyAt(0));
        }
        c0467c.f4490k.f136d = null;
    }

    @Override // s1.InterfaceC0466b
    public final void a() {
    }
}
