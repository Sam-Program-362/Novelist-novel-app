package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0211t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC0211t f3023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC0211t f3024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0211t[] f3025m;

    static {
        EnumC0211t enumC0211t = new EnumC0211t("DEFAULT", 0);
        f3023k = enumC0211t;
        EnumC0211t enumC0211t2 = new EnumC0211t("LAZY", 1);
        EnumC0211t enumC0211t3 = new EnumC0211t("ATOMIC", 2);
        f3024l = enumC0211t3;
        f3025m = new EnumC0211t[]{enumC0211t, enumC0211t2, enumC0211t3, new EnumC0211t("UNDISPATCHED", 3)};
    }

    public static EnumC0211t valueOf(String str) {
        return (EnumC0211t) Enum.valueOf(EnumC0211t.class, str);
    }

    public static EnumC0211t[] values() {
        return (EnumC0211t[]) f3025m.clone();
    }
}
