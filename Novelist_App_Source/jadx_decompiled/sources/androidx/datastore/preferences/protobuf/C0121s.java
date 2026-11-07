package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121s implements K {

    /* renamed from: b, reason: collision with root package name */
    public static final C0121s f2110b = new C0121s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2111a;

    public /* synthetic */ C0121s(int i3) {
        this.f2111a = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final U a(Class cls) {
        switch (this.f2111a) {
            case 0:
                if (!AbstractC0124v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (U) AbstractC0124v.d(cls.asSubclass(AbstractC0124v.class)).c(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean b(Class cls) {
        switch (this.f2111a) {
            case 0:
                return AbstractC0124v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
