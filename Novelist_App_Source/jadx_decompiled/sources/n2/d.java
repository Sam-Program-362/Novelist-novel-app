package n2;

import g2.C0255a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4150a;

    static {
        try {
            Iterator it2 = Arrays.asList(new j2.b()).iterator();
            a2.h.e(it2, "<this>");
            f4150a = g2.e.L(new C0255a(new g2.g(it2)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
