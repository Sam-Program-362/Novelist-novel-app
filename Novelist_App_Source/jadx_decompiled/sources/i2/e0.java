package i2;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2997a = new ThreadLocal();

    public static G a() {
        ThreadLocal threadLocal = f2997a;
        G g3 = (G) threadLocal.get();
        if (g3 != null) {
            return g3;
        }
        C0287d c0287d = new C0287d(Thread.currentThread());
        threadLocal.set(c0287d);
        return c0287d;
    }
}
