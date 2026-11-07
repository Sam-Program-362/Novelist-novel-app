package p2;

import i2.AbstractC0209q;
import i2.H;
import java.util.concurrent.Executor;
import n2.t;

/* JADX INFO: loaded from: classes.dex */
public final class d extends H implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f4262m = new d();
    public static final AbstractC0209q n;

    static {
        l lVar = l.f4274m;
        int i3 = t.f4178a;
        if (64 >= i3) {
            i3 = 64;
        }
        n = lVar.g(n2.a.j(i3, "kotlinx.coroutines.io.parallelism", 12));
    }

    @Override // i2.AbstractC0209q
    public final void c(R1.h hVar, Runnable runnable) {
        n.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(R1.i.f1255k, runnable);
    }

    @Override // i2.AbstractC0209q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
