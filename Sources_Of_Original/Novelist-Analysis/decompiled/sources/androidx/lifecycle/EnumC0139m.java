package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0139m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC0139m f2150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC0139m f2151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC0139m f2152m;
    public static final EnumC0139m n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0139m f2153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC0139m[] f2154p;

    static {
        EnumC0139m enumC0139m = new EnumC0139m("DESTROYED", 0);
        f2150k = enumC0139m;
        EnumC0139m enumC0139m2 = new EnumC0139m("INITIALIZED", 1);
        f2151l = enumC0139m2;
        EnumC0139m enumC0139m3 = new EnumC0139m("CREATED", 2);
        f2152m = enumC0139m3;
        EnumC0139m enumC0139m4 = new EnumC0139m("STARTED", 3);
        n = enumC0139m4;
        EnumC0139m enumC0139m5 = new EnumC0139m("RESUMED", 4);
        f2153o = enumC0139m5;
        f2154p = new EnumC0139m[]{enumC0139m, enumC0139m2, enumC0139m3, enumC0139m4, enumC0139m5};
    }

    public static EnumC0139m valueOf(String str) {
        return (EnumC0139m) Enum.valueOf(EnumC0139m.class, str);
    }

    public static EnumC0139m[] values() {
        return (EnumC0139m[]) f2154p.clone();
    }
}
