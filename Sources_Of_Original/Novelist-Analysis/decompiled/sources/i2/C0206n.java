package i2;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: i2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0206n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f3012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z1.q f3013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f3015e;

    public C0206n(Object obj, C c3, Z1.q qVar, Object obj2, Throwable th) {
        this.f3011a = obj;
        this.f3012b = c3;
        this.f3013c = qVar;
        this.f3014d = obj2;
        this.f3015e = th;
    }

    public static C0206n a(C0206n c0206n, C c3, CancellationException cancellationException, int i3) {
        Object obj = c0206n.f3011a;
        if ((i3 & 2) != 0) {
            c3 = c0206n.f3012b;
        }
        C c4 = c3;
        Z1.q qVar = c0206n.f3013c;
        Object obj2 = c0206n.f3014d;
        Throwable th = cancellationException;
        if ((i3 & 16) != 0) {
            th = c0206n.f3015e;
        }
        c0206n.getClass();
        return new C0206n(obj, c4, qVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0206n)) {
            return false;
        }
        C0206n c0206n = (C0206n) obj;
        return a2.h.a(this.f3011a, c0206n.f3011a) && a2.h.a(this.f3012b, c0206n.f3012b) && a2.h.a(this.f3013c, c0206n.f3013c) && a2.h.a(this.f3014d, c0206n.f3014d) && a2.h.a(this.f3015e, c0206n.f3015e);
    }

    public final int hashCode() {
        Object obj = this.f3011a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C c3 = this.f3012b;
        int iHashCode2 = (iHashCode + (c3 == null ? 0 : c3.hashCode())) * 31;
        Z1.q qVar = this.f3013c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f3014d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3015e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f3011a + ", cancelHandler=" + this.f3012b + ", onCancellation=" + this.f3013c + ", idempotentResume=" + this.f3014d + ", cancelCause=" + this.f3015e + ')';
    }

    public /* synthetic */ C0206n(Object obj, C c3, Z1.q qVar, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : c3, (i3 & 4) != 0 ? null : qVar, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
