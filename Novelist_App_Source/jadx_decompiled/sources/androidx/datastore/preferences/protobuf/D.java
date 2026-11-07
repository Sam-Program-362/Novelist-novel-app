package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class D implements K {

    /* renamed from: a, reason: collision with root package name */
    public K[] f1971a;

    @Override // androidx.datastore.preferences.protobuf.K
    public final U a(Class cls) {
        for (K k3 : this.f1971a) {
            if (k3.b(cls)) {
                return k3.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean b(Class cls) {
        for (K k3 : this.f1971a) {
            if (k3.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
