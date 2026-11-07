package s2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f4534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f4535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ d[] f4536m;

    /* JADX INFO: Fake field, exist only in values array */
    d EF0;

    static {
        d dVar = new d("CR", 0);
        d dVar2 = new d("CRLF", 1);
        f4534k = dVar2;
        d dVar3 = new d("LF", 2);
        f4535l = dVar3;
        f4536m = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4536m.clone();
    }
}
