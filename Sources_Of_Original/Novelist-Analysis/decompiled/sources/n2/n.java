package n2;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2.c f4173a;

    static {
        String property;
        int i3 = t.f4178a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it2 = Arrays.asList(new j2.a()).iterator();
            a2.h.e(it2, "<this>");
            Iterator it3 = p020g2.e.L(new p020g2.a(new p020g2.g(it2))).iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    ((j2.a) next).getClass();
                    do {
                        ((j2.a) it3.next()).getClass();
                    } while (it3.hasNext());
                }
            }
            if (((j2.a) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            f4173a = new j2.c(j2.d.a(mainLooper), false);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
