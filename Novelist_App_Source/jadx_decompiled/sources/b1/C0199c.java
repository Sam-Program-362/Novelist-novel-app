package b1;

import java.io.Serializable;
import java.util.Arrays;
import t.AbstractC0468a;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199c implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Object f2614k;

    public C0199c(Object obj) {
        this.f2614k = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0199c) {
            return AbstractC0197a.h(this.f2614k, ((C0199c) obj).f2614k);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2614k});
    }

    public final String toString() {
        return AbstractC0468a.b("Suppliers.ofInstance(", this.f2614k.toString(), ")");
    }
}
