package m2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final R1.h f4111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k2.a f4113m;

    public e(R1.h hVar, int i3, k2.a aVar) {
        this.f4111k = hVar;
        this.f4112l = i3;
        this.f4113m = aVar;
    }

    public abstract Object a(k2.q qVar, R1.c cVar);

    @Override // l2.d
    public Object h(l2.e eVar, R1.c cVar) throws Throwable {
        c cVar2 = new c(eVar, this, null);
        n2.q qVar = new n2.q(cVar, cVar.getContext());
        Object objC = H2.h.C(qVar, qVar, cVar2);
        return objC == S1.a.f1260k ? objC : O1.g.f1211a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        R1.i iVar = R1.i.f1255k;
        R1.h hVar = this.f4111k;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i3 = this.f4112l;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        k2.a aVar = k2.a.f3867k;
        k2.a aVar2 = this.f4113m;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + P1.e.i0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
