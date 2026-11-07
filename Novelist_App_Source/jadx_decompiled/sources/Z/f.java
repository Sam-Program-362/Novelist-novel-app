package Z;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f1622a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1623b;

    public f(long j3, long j4) {
        if (j4 == 0) {
            this.f1622a = 0L;
            this.f1623b = 1L;
        } else {
            this.f1622a = j3;
            this.f1623b = j4;
        }
    }

    public final String toString() {
        return this.f1622a + "/" + this.f1623b;
    }
}
