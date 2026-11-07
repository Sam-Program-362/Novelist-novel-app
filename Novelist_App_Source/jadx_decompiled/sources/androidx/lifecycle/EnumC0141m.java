package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0141m {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0141m f2150k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0141m f2151l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0141m f2152m;
    public static final EnumC0141m n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC0141m f2153o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC0141m[] f2154p;

    static {
        EnumC0141m enumC0141m = new EnumC0141m("DESTROYED", 0);
        f2150k = enumC0141m;
        EnumC0141m enumC0141m2 = new EnumC0141m("INITIALIZED", 1);
        f2151l = enumC0141m2;
        EnumC0141m enumC0141m3 = new EnumC0141m("CREATED", 2);
        f2152m = enumC0141m3;
        EnumC0141m enumC0141m4 = new EnumC0141m("STARTED", 3);
        n = enumC0141m4;
        EnumC0141m enumC0141m5 = new EnumC0141m("RESUMED", 4);
        f2153o = enumC0141m5;
        f2154p = new EnumC0141m[]{enumC0141m, enumC0141m2, enumC0141m3, enumC0141m4, enumC0141m5};
    }

    public static EnumC0141m valueOf(String str) {
        return (EnumC0141m) Enum.valueOf(EnumC0141m.class, str);
    }

    public static EnumC0141m[] values() {
        return (EnumC0141m[]) f2154p.clone();
    }
}
