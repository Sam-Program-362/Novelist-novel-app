package p004b1;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f2586a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(G.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = F.f2584k;
        }
        f2586a = comparator;
    }
}
