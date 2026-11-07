package p2;

import java.util.concurrent.TimeUnit;
import n2.t;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f4269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f4272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f4273f;

    static {
        String property;
        int i3 = t.f4178a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f4268a = property;
        f4269b = n2.a.i("kotlinx.coroutines.scheduler.resolution.ns", PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH, 1L, Long.MAX_VALUE);
        int i4 = t.f4178a;
        if (i4 < 2) {
            i4 = 2;
        }
        f4270c = n2.a.j(i4, "kotlinx.coroutines.scheduler.core.pool.size", 8);
        f4271d = n2.a.j(2097150, "kotlinx.coroutines.scheduler.max.pool.size", 4);
        f4272e = TimeUnit.SECONDS.toNanos(n2.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f4273f = g.f4263a;
    }
}
