package P1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends E2.a {
    public static p012e2.c c0(Collection collection) {
        a2.h.e(collection, "<this>");
        return new p012e2.c(0, collection.size() - 1, 1);
    }

    public static List d0(Object... objArr) {
        a2.h.e(objArr, "elements");
        if (objArr.length <= 0) {
            return m.f1219k;
        }
        List listAsList = Arrays.asList(objArr);
        a2.h.d(listAsList, "asList(...)");
        return listAsList;
    }
}
