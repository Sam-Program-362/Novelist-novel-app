package s0;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final m f4477a;

    static {
        m eVar;
        try {
            eVar = new H0.i((WebViewProviderFactoryBoundaryInterface) E2.a.d(WebViewProviderFactoryBoundaryInterface.class, S0.a.s()), 27);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
        f4477a = eVar;
    }
}
