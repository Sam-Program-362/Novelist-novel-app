package p2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final b f4248k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f4249l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f4250m;
    public static final b n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f4251o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ b[] f4252p;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f4248k = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f4249l = bVar2;
        b bVar3 = new b("PARKING", 2);
        f4250m = bVar3;
        b bVar4 = new b("DORMANT", 3);
        n = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f4251o = bVar5;
        f4252p = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4252p.clone();
    }
}
