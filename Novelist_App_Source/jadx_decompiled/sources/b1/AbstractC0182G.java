package b1;

import java.util.Comparator;
import java.util.Objects;

/* renamed from: b1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0182G {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f2586a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(AbstractC0182G.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = EnumC0181F.f2584k;
        }
        f2586a = comparator;
    }
}
