package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0140l {
    private static final /* synthetic */ EnumC0140l[] $VALUES;
    public static final C0138j Companion;
    public static final EnumC0140l ON_ANY;
    public static final EnumC0140l ON_CREATE;
    public static final EnumC0140l ON_DESTROY;
    public static final EnumC0140l ON_PAUSE;
    public static final EnumC0140l ON_RESUME;
    public static final EnumC0140l ON_START;
    public static final EnumC0140l ON_STOP;

    static {
        EnumC0140l enumC0140l = new EnumC0140l("ON_CREATE", 0);
        ON_CREATE = enumC0140l;
        EnumC0140l enumC0140l2 = new EnumC0140l("ON_START", 1);
        ON_START = enumC0140l2;
        EnumC0140l enumC0140l3 = new EnumC0140l("ON_RESUME", 2);
        ON_RESUME = enumC0140l3;
        EnumC0140l enumC0140l4 = new EnumC0140l("ON_PAUSE", 3);
        ON_PAUSE = enumC0140l4;
        EnumC0140l enumC0140l5 = new EnumC0140l("ON_STOP", 4);
        ON_STOP = enumC0140l5;
        EnumC0140l enumC0140l6 = new EnumC0140l("ON_DESTROY", 5);
        ON_DESTROY = enumC0140l6;
        EnumC0140l enumC0140l7 = new EnumC0140l("ON_ANY", 6);
        ON_ANY = enumC0140l7;
        $VALUES = new EnumC0140l[]{enumC0140l, enumC0140l2, enumC0140l3, enumC0140l4, enumC0140l5, enumC0140l6, enumC0140l7};
        Companion = new C0138j();
    }

    public static EnumC0140l valueOf(String str) {
        return (EnumC0140l) Enum.valueOf(EnumC0140l.class, str);
    }

    public static EnumC0140l[] values() {
        return (EnumC0140l[]) $VALUES.clone();
    }

    public final EnumC0141m a() {
        switch (AbstractC0139k.f2149a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0141m.f2152m;
            case 3:
            case 4:
                return EnumC0141m.n;
            case 5:
                return EnumC0141m.f2153o;
            case 6:
                return EnumC0141m.f2150k;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
