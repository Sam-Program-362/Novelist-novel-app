package i2;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2997a = new ThreadLocal();

    public static G a() {
        ThreadLocal threadLocal = f2997a;
        G g3 = (G) threadLocal.get();
        if (g3 != null) {
            return g3;
        }
        C0196d c0196d = new C0196d(Thread.currentThread());
        threadLocal.set(c0196d);
        return c0196d;
    }
}
