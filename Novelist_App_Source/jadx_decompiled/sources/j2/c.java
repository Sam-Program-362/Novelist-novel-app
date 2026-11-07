package j2;

import R1.h;
import android.os.Handler;
import android.os.Looper;
import i2.A;
import i2.AbstractC0300q;
import i2.InterfaceC0306x;
import i2.N;
import i2.r;
import java.util.concurrent.CancellationException;
import n2.n;
import p2.e;

/* loaded from: classes.dex */
public final class c extends AbstractC0300q implements InterfaceC0306x {

    /* renamed from: m, reason: collision with root package name */
    public final Handler f3575m;
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final c f3576o;

    public c(Handler handler, boolean z3) {
        this.f3575m = handler;
        this.n = z3;
        this.f3576o = z3 ? this : new c(handler, true);
    }

    @Override // i2.AbstractC0300q
    public final void c(h hVar, Runnable runnable) {
        if (this.f3575m.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        N n = (N) hVar.e(r.f3022l);
        if (n != null) {
            n.b(cancellationException);
        }
        e eVar = A.f2964a;
        p2.d.f4262m.c(hVar, runnable);
    }

    @Override // i2.AbstractC0300q
    public final boolean d(h hVar) {
        return (this.n && a2.h.a(Looper.myLooper(), this.f3575m.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f3575m == this.f3575m && cVar.n == this.n;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3575m) ^ (this.n ? 1231 : 1237);
    }

    @Override // i2.AbstractC0300q
    public final String toString() {
        c cVar;
        String str;
        e eVar = A.f2964a;
        c cVar2 = n.f4173a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f3576o;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f3575m.toString();
        return this.n ? B1.e.j(handler, ".immediate") : handler;
    }
}
