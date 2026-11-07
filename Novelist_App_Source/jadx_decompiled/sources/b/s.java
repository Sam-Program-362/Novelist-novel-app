package b;

import androidx.lifecycle.AbstractC0142n;
import androidx.lifecycle.EnumC0140l;
import androidx.lifecycle.InterfaceC0145q;
import androidx.lifecycle.InterfaceC0146s;

/* loaded from: classes.dex */
public final class s implements InterfaceC0145q, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f2340k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0142n f2341l;

    public s(o oVar, t tVar, AbstractC0142n abstractC0142n) {
        this.f2340k = oVar;
        this.f2341l = abstractC0142n;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f2341l.b(this);
    }

    @Override // androidx.lifecycle.InterfaceC0145q
    public final void d(InterfaceC0146s interfaceC0146s, EnumC0140l enumC0140l) {
        EnumC0140l enumC0140l2 = EnumC0140l.ON_START;
        o oVar = this.f2340k;
        if (enumC0140l == enumC0140l2) {
            oVar.d(true);
        } else if (enumC0140l == EnumC0140l.ON_STOP) {
            oVar.d(false);
        }
        if (enumC0140l == EnumC0140l.ON_DESTROY) {
            oVar.b();
            this.f2341l.b(this);
        }
    }
}
