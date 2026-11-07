package p002b;

import androidx.lifecycle.AbstractC0140n;
import androidx.lifecycle.EnumC0138l;
import androidx.lifecycle.InterfaceC0143q;
import androidx.lifecycle.InterfaceC0144s;

/* JADX INFO: loaded from: classes.dex */
public final class s implements InterfaceC0143q, AutoCloseable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f2340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0140n f2341l;

    public s(o oVar, t tVar, AbstractC0140n abstractC0140n) {
        this.f2340k = oVar;
        this.f2341l = abstractC0140n;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f2341l.b(this);
    }

    @Override // androidx.lifecycle.InterfaceC0143q
    public final void d(InterfaceC0144s interfaceC0144s, EnumC0138l enumC0138l) {
        EnumC0138l enumC0138l2 = EnumC0138l.ON_START;
        o oVar = this.f2340k;
        if (enumC0138l == enumC0138l2) {
            oVar.d(true);
        } else if (enumC0138l == EnumC0138l.ON_STOP) {
            oVar.d(false);
        }
        if (enumC0138l == EnumC0138l.ON_DESTROY) {
            oVar.b();
            this.f2341l.b(this);
        }
    }
}
