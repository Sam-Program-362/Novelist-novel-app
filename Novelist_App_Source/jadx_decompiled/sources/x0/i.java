package x0;

import Z1.p;
import android.app.Activity;
import j0.ExecutorC0317c;
import k2.q;
import y0.InterfaceC0499a;

/* loaded from: classes.dex */
public final class i extends T1.h implements p {

    /* renamed from: o, reason: collision with root package name */
    public int f4703o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f4704p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0492b f4705q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Activity f4706r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0492b c0492b, Activity activity, R1.c cVar) {
        super(2, cVar);
        this.f4705q = c0492b;
        this.f4706r = activity;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((i) i((R1.c) obj2, (q) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        i iVar = new i(this.f4705q, this.f4706r, cVar);
        iVar.f4704p = obj;
        return iVar;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f4703o;
        if (i3 == 0) {
            H2.h.E(obj);
            q qVar = (q) this.f4704p;
            r1.k kVar = new r1.k(qVar, 1);
            C0492b c0492b = this.f4705q;
            ((InterfaceC0499a) c0492b.f4689l).a(this.f4706r, new ExecutorC0317c(), kVar);
            X.b bVar = new X.b(c0492b, kVar, 1);
            this.f4703o = 1;
            Object b3 = k2.j.b(qVar, bVar, this);
            S1.a aVar = S1.a.f1260k;
            if (b3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
        }
        return O1.g.f1211a;
    }
}
