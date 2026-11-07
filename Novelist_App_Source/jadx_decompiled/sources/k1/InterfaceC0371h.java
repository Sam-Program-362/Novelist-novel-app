package k1;

/* renamed from: k1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0371h {
    void a();

    void b(C0369f c0369f);

    default void c(C0368e c0368e, Runnable runnable) {
        b(new C0369f(c0368e == null ? null : new H0.i(c0368e, 22), runnable));
    }

    void start();
}
