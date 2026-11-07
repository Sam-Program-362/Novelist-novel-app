package p2;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {
    public static final e n;

    static {
        int i3 = k.f4270c;
        int i4 = k.f4271d;
        long j3 = k.f4272e;
        String str = k.f4268a;
        e eVar = new e();
        eVar.f4264m = new c(i3, i4, j3, str);
        n = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // i2.AbstractC0209q
    public final String toString() {
        return "Dispatchers.Default";
    }
}
