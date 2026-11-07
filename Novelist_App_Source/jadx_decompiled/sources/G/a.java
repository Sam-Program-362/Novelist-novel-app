package G;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f353a;

    /* renamed from: b, reason: collision with root package name */
    public int f354b;

    /* renamed from: c, reason: collision with root package name */
    public float f355c;

    /* renamed from: d, reason: collision with root package name */
    public float f356d;

    /* renamed from: e, reason: collision with root package name */
    public long f357e;

    /* renamed from: f, reason: collision with root package name */
    public long f358f;

    /* renamed from: g, reason: collision with root package name */
    public long f359g;

    /* renamed from: h, reason: collision with root package name */
    public float f360h;

    /* renamed from: i, reason: collision with root package name */
    public int f361i;

    public final float a(long j3) {
        if (j3 < this.f357e) {
            return 0.0f;
        }
        long j4 = this.f359g;
        if (j4 < 0 || j3 < j4) {
            return d.b((j3 - r0) / this.f353a, 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.f360h;
        return (d.b((j3 - j4) / this.f361i, 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
