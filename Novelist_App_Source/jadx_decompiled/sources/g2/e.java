package g2;

import P1.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends f {
    public static List L(d dVar) {
        Iterator it2 = dVar.iterator();
        if (!it2.hasNext()) {
            return m.f1219k;
        }
        Object next = it2.next();
        if (!it2.hasNext()) {
            return E2.a.B(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }
}
