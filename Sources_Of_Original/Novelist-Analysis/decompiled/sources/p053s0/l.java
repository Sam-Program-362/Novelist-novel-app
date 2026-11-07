package p053s0;

import E2.a;
import H0.i;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f4477a;

    static {
        m eVar;
        try {
            eVar = new i((WebViewProviderFactoryBoundaryInterface) a.d(WebViewProviderFactoryBoundaryInterface.class, S0.a.s()), 27);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
        f4477a = eVar;
    }
}
