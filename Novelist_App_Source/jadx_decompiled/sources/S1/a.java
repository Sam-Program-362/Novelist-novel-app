package S1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: k, reason: collision with root package name */
    public static final a f1260k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a[] f1261l;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f1260k = aVar;
        f1261l = new a[]{aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1261l.clone();
    }
}
