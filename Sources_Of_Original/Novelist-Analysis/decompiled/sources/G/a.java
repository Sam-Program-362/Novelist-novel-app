package G;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f361i;

    public final float a(long j3) {
        long j4 = this.f357e;
        if (j3 < j4) {
            return 0.0f;
        }
        long j5 = this.f359g;
        if (j5 < 0 || j3 < j5) {
            return d.b((j3 - j4) / this.f353a, 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.f360h;
        return (d.b((j3 - j5) / this.f361i, 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
