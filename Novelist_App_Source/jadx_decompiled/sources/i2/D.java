package i2;

/* loaded from: classes.dex */
public final class D implements K {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2966a;

    public D(boolean z3) {
        this.f2966a = z3;
    }

    @Override // i2.K
    public final boolean a() {
        return this.f2966a;
    }

    @Override // i2.K
    public final X d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f2966a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
