package k2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f3867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f3868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f3869m;
    public static final /* synthetic */ a[] n;

    static {
        a aVar = new a("SUSPEND", 0);
        f3867k = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f3868l = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f3869m = aVar3;
        n = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) n.clone();
    }
}
