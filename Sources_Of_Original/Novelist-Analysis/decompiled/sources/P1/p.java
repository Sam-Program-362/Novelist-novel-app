package P1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends H2.h {
    public static int S(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((i3 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final void T(HashMap map, O1.b[] bVarArr) {
        for (O1.b bVar : bVarArr) {
            map.put(bVar.f1203k, bVar.f1204l);
        }
    }

    public static Map U(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return n.f1220k;
        }
        if (size == 1) {
            O1.b bVar = (O1.b) arrayList.get(0);
            a2.h.e(bVar, "pair");
            Map mapSingletonMap = Collections.singletonMap(bVar.f1203k, bVar.f1204l);
            a2.h.d(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S(arrayList.size()));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            O1.b bVar2 = (O1.b) obj;
            linkedHashMap.put(bVar2.f1203k, bVar2.f1204l);
        }
        return linkedHashMap;
    }
}
