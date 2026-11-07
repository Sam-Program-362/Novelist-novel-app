package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0119s implements K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0119s f2110b = new C0119s(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2111a;

    public /* synthetic */ C0119s(int i3) {
        this.f2111a = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final U a(Class cls) {
        switch (this.f2111a) {
            case 0:
                if (!AbstractC0122v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (U) AbstractC0122v.d(cls.asSubclass(AbstractC0122v.class)).c(3);
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
                return AbstractC0122v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
