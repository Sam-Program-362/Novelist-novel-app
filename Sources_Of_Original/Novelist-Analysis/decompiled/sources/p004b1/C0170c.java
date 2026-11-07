package p004b1;

import java.io.Serializable;
import java.util.Arrays;
import p055t.a;

/* JADX INFO: renamed from: b1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0170c implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f2614k;

    public C0170c(Object obj) {
        this.f2614k = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0170c) {
            return AbstractC0168a.h(this.f2614k, ((C0170c) obj).f2614k);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2614k});
    }

    public final String toString() {
        return a.b("Suppliers.ofInstance(", this.f2614k.toString(), ")");
    }
}
