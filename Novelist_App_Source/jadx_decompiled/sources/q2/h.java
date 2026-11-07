package q2;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public static final B1.g f4324b;

    /* renamed from: c, reason: collision with root package name */
    public static final B1.g f4325c;

    /* renamed from: d, reason: collision with root package name */
    public static final B1.g f4326d;

    /* renamed from: e, reason: collision with root package name */
    public static final B1.g f4327e;

    /* renamed from: a, reason: collision with root package name */
    public static final int f4323a = n2.a.j(100, "kotlinx.coroutines.semaphore.maxSpinCycles", 12);

    /* renamed from: f, reason: collision with root package name */
    public static final int f4328f = n2.a.j(16, "kotlinx.coroutines.semaphore.segmentSize", 12);

    static {
        int i3 = 18;
        f4324b = new B1.g("PERMIT", i3);
        f4325c = new B1.g("TAKEN", i3);
        f4326d = new B1.g("BROKEN", i3);
        f4327e = new B1.g("CANCELLED", i3);
    }
}
