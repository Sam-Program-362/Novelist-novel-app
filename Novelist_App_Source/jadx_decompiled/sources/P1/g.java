package P1;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class g extends f {
    public static int e0(Iterable iterable) {
        a2.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
