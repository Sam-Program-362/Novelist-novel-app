package p033k1;

import H0.i;

/* JADX INFO: loaded from: classes.dex */
public interface h {
    void a();

    void b(f fVar);

    default void c(e eVar, Runnable runnable) {
        b(new f(eVar == null ? null : new i(eVar, 22), runnable));
    }

    void start();
}
