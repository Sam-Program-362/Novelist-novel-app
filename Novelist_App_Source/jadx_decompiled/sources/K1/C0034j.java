package K1;

import android.content.Context;
import i2.InterfaceC0301s;
import java.util.List;

/* renamed from: K1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034j extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f725o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L f726p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f727q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0034j(L l3, List list, R1.c cVar) {
        super(2, cVar);
        this.f726p = l3;
        this.f727q = list;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0034j) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new C0034j(this.f726p, this.f727q, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f725o;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
            return obj;
        }
        H2.h.E(obj);
        Context context = this.f726p.f697k;
        if (context == null) {
            a2.h.g("context");
            throw null;
        }
        B1.g a3 = M.a(context);
        C0033i c0033i = new C0033i(this.f727q, null);
        this.f725o = 1;
        Object d3 = a3.d(new Y.h(c0033i, null), this);
        S1.a aVar = S1.a.f1260k;
        return d3 == aVar ? aVar : d3;
    }
}
