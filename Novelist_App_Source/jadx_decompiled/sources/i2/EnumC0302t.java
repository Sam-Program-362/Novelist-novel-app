package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0302t {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0302t f3023k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0302t f3024l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0302t[] f3025m;

    static {
        EnumC0302t enumC0302t = new EnumC0302t("DEFAULT", 0);
        f3023k = enumC0302t;
        EnumC0302t enumC0302t2 = new EnumC0302t("LAZY", 1);
        EnumC0302t enumC0302t3 = new EnumC0302t("ATOMIC", 2);
        f3024l = enumC0302t3;
        f3025m = new EnumC0302t[]{enumC0302t, enumC0302t2, enumC0302t3, new EnumC0302t("UNDISPATCHED", 3)};
    }

    public static EnumC0302t valueOf(String str) {
        return (EnumC0302t) Enum.valueOf(EnumC0302t.class, str);
    }

    public static EnumC0302t[] values() {
        return (EnumC0302t[]) f3025m.clone();
    }
}
