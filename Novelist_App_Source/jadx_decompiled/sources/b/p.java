package b;

import androidx.lifecycle.InterfaceC0146s;
import b0.z;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final z f2334a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2335b;

    public p(z zVar, InterfaceC0146s interfaceC0146s) {
        a2.h.e(zVar, "callback");
        this.f2334a = zVar;
        this.f2335b = interfaceC0146s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return a2.h.a(this.f2334a, pVar.f2334a) && this.f2335b.equals(pVar.f2335b);
    }

    public final int hashCode() {
        return this.f2335b.hashCode() + (this.f2334a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f2334a + ", owner=" + this.f2335b + ')';
    }
}
