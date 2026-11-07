package i2;

/* JADX INFO: renamed from: i2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0214w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3036a = 0;

    static {
        String property;
        int i3 = n2.t.f4178a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (!(property != null ? Boolean.parseBoolean(property) : false)) {
            RunnableC0213v runnableC0213v = RunnableC0213v.f3035t;
            return;
        }
        p2.e eVar = A.f2964a;
        j2.c cVar = n2.n.f4173a;
        j2.c cVar2 = cVar.f3576o;
        if (cVar == null) {
            RunnableC0213v runnableC0213v2 = RunnableC0213v.f3035t;
        }
    }
}
