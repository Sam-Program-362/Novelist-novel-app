package a2;

import f2.InterfaceC0247a;
import f2.InterfaceC0249c;

/* loaded from: classes.dex */
public final class k extends l implements InterfaceC0249c, Z1.l {
    @Override // a2.c
    public final InterfaceC0247a c() {
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
        InterfaceC0247a i3 = i();
        if (i3 == this) {
            throw new Y1.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((k) ((InterfaceC0249c) i3)).j();
    }
}
