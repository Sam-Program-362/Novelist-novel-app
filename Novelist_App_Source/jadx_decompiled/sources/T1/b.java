package T1;

/* loaded from: classes.dex */
public final class b implements R1.c {

    /* renamed from: k, reason: collision with root package name */
    public static final b f1276k = new b();

    @Override // R1.c
    public final R1.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // R1.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
