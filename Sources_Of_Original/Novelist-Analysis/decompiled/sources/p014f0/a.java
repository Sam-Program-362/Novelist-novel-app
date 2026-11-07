package p014f0;

import H0.d;
import M0.E;
import androidx.lifecycle.A;
import androidx.lifecycle.InterfaceC0144s;
import androidx.lifecycle.z;

/* JADX INFO: loaded from: classes.dex */
public final class a extends z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f2810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC0144s f2811m;
    public E n;

    public a(d dVar) {
        this.f2810l = dVar;
        if (dVar.f427a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f427a = this;
    }

    @Override // androidx.lifecycle.z
    public final void e() {
        d dVar = this.f2810l;
        dVar.f428b = true;
        dVar.f430d = false;
        dVar.f429c = false;
        dVar.f435i.drainPermits();
        dVar.c();
    }

    @Override // androidx.lifecycle.z
    public final void f() {
        this.f2810l.f428b = false;
    }

    @Override // androidx.lifecycle.z
    public final void g(A a3) {
        super.g(a3);
        this.f2811m = null;
        this.n = null;
    }

    public final void i() {
        InterfaceC0144s interfaceC0144s = this.f2811m;
        E e3 = this.n;
        if (interfaceC0144s == null || e3 == null) {
            return;
        }
        super.g(e3);
        d(interfaceC0144s, e3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.f2810l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
