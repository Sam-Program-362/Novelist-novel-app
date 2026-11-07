package p054s1;

import A0.j;
import android.content.Context;
import io.flutter.plugin.platform.s;
import java.util.ArrayList;
import java.util.List;
import p052r1.AbstractActivityC0262b;
import p057t1.b;
import p063w1.c;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4525a = new ArrayList();

    public h(AbstractActivityC0262b abstractActivityC0262b, String[] strArr) {
        c cVar = (c) j.E().f57l;
        if (cVar.f4663b) {
            return;
        }
        cVar.d(abstractActivityC0262b.getApplicationContext());
        cVar.a(abstractActivityC0262b.getApplicationContext(), strArr);
    }

    public final c a(g gVar) {
        c cVar;
        Context context = gVar.f4519a;
        b bVar = gVar.f4520b;
        String str = gVar.f4521c;
        List<String> list = gVar.f4522d;
        s sVar = new s();
        boolean z3 = gVar.f4523e;
        boolean z4 = gVar.f4524f;
        if (bVar == null) {
            c cVar2 = (c) j.E().f57l;
            if (!cVar2.f4663b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            bVar = new b((String) cVar2.f4666e.f2846c, "main");
        }
        b bVar2 = bVar;
        ArrayList arrayList = this.f4525a;
        if (arrayList.size() == 0) {
            cVar = new c(context, null, sVar, z3, z4);
            if (str != null) {
                cVar.f4488i.f82a.s("setInitialRoute", str, null);
            }
            cVar.f4482c.d(bVar2, list);
        } else {
            c cVar3 = (c) arrayList.get(0);
            if (!cVar3.f4480a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            cVar = new c(context, cVar3.f4480a.spawn(bVar2.f4549c, bVar2.f4548b, str, list, c.y), sVar, z3, z4);
        }
        arrayList.add(cVar);
        cVar.f4499v.add(new f(this, cVar));
        return cVar;
    }
}
