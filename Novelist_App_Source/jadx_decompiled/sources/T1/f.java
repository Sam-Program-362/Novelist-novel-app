package T1;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Method f1279a;

    /* renamed from: b, reason: collision with root package name */
    public Method f1280b;

    /* renamed from: c, reason: collision with root package name */
    public Method f1281c;

    public f(Method method, Method method2, Method method3) {
        this.f1279a = method;
        this.f1280b = method2;
        this.f1281c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
