package s1;

import android.content.Context;
import io.flutter.plugin.platform.s;
import java.util.ArrayList;
import java.util.List;
import r1.AbstractActivityC0455b;
import t1.C0474b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4525a = new ArrayList();

    public h(AbstractActivityC0455b abstractActivityC0455b, String[] strArr) {
        w1.c cVar = (w1.c) A0.j.E().f57l;
        if (cVar.f4663b) {
            return;
        }
        cVar.d(abstractActivityC0455b.getApplicationContext());
        cVar.a(abstractActivityC0455b.getApplicationContext(), strArr);
    }

    public final C0467c a(g gVar) {
        C0467c c0467c;
        Context context = gVar.f4519a;
        C0474b c0474b = gVar.f4520b;
        String str = gVar.f4521c;
        List<String> list = gVar.f4522d;
        s sVar = new s();
        boolean z3 = gVar.f4523e;
        boolean z4 = gVar.f4524f;
        if (c0474b == null) {
            w1.c cVar = (w1.c) A0.j.E().f57l;
            if (!cVar.f4663b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            c0474b = new C0474b((String) cVar.f4666e.f2846c, "main");
        }
        C0474b c0474b2 = c0474b;
        ArrayList arrayList = this.f4525a;
        if (arrayList.size() == 0) {
            c0467c = new C0467c(context, null, sVar, z3, z4);
            if (str != null) {
                c0467c.f4488i.f82a.s("setInitialRoute", str, null);
            }
            c0467c.f4482c.d(c0474b2, list);
        } else {
            C0467c c0467c2 = (C0467c) arrayList.get(0);
            if (!c0467c2.f4480a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            c0467c = new C0467c(context, c0467c2.f4480a.spawn(c0474b2.f4549c, c0474b2.f4548b, str, list, C0467c.y), sVar, z3, z4);
        }
        arrayList.add(c0467c);
        c0467c.f4499v.add(new f(this, c0467c));
        return c0467c;
    }
}
