package a2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l implements p016f2.c, Z1.l {
    @Override // a2.c
    public final p016f2.a c() {
        p.f1714a.getClass();
        return this;
    }

    @Override // Z1.l
    public final Object f(Object obj) {
        j();
        throw null;
    }

    public final void j() {
        if (this.f1710q) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        p016f2.a aVarI = i();
        if (aVarI == this) {
            throw new Y1.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((k) ((p016f2.c) aVarI)).j();
    }
}
