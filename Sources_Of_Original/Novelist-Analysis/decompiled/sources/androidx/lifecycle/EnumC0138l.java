package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0138l {
    private static final /* synthetic */ EnumC0138l[] $VALUES;
    public static final C0136j Companion;
    public static final EnumC0138l ON_ANY;
    public static final EnumC0138l ON_CREATE;
    public static final EnumC0138l ON_DESTROY;
    public static final EnumC0138l ON_PAUSE;
    public static final EnumC0138l ON_RESUME;
    public static final EnumC0138l ON_START;
    public static final EnumC0138l ON_STOP;

    static {
        EnumC0138l enumC0138l = new EnumC0138l("ON_CREATE", 0);
        ON_CREATE = enumC0138l;
        EnumC0138l enumC0138l2 = new EnumC0138l("ON_START", 1);
        ON_START = enumC0138l2;
        EnumC0138l enumC0138l3 = new EnumC0138l("ON_RESUME", 2);
        ON_RESUME = enumC0138l3;
        EnumC0138l enumC0138l4 = new EnumC0138l("ON_PAUSE", 3);
        ON_PAUSE = enumC0138l4;
        EnumC0138l enumC0138l5 = new EnumC0138l("ON_STOP", 4);
        ON_STOP = enumC0138l5;
        EnumC0138l enumC0138l6 = new EnumC0138l("ON_DESTROY", 5);
        ON_DESTROY = enumC0138l6;
        EnumC0138l enumC0138l7 = new EnumC0138l("ON_ANY", 6);
        ON_ANY = enumC0138l7;
        $VALUES = new EnumC0138l[]{enumC0138l, enumC0138l2, enumC0138l3, enumC0138l4, enumC0138l5, enumC0138l6, enumC0138l7};
        Companion = new C0136j();
    }

    public static EnumC0138l valueOf(String str) {
        return (EnumC0138l) Enum.valueOf(EnumC0138l.class, str);
    }

    public static EnumC0138l[] values() {
        return (EnumC0138l[]) $VALUES.clone();
    }

    public final EnumC0139m a() {
        switch (AbstractC0137k.f2149a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0139m.f2152m;
            case 3:
            case 4:
                return EnumC0139m.n;
            case 5:
                return EnumC0139m.f2153o;
            case 6:
                return EnumC0139m.f2150k;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
