package p020g2;

import E2.a;
import P1.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends f {
    public static List L(d dVar) {
        Iterator it2 = dVar.iterator();
        if (!it2.hasNext()) {
            return m.f1219k;
        }
        Object next = it2.next();
        if (!it2.hasNext()) {
            return a.B(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }
}
