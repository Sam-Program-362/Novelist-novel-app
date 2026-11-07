package V;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: V.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0083g extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Iterator f1412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f1413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f1416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1417t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083g(List list, ArrayList arrayList, R1.c cVar) {
        super(2, cVar);
        this.f1416s = list;
        this.f1417t = arrayList;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0083g) i((R1.c) obj2, obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        C0083g c0083g = new C0083g(this.f1416s, this.f1417t, cVar);
        c0083g.f1415r = obj;
        return c0083g;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        Iterator it2;
        List list;
        int i3 = this.f1414q;
        if (i3 == 0) {
            H2.h.E(obj);
            obj = this.f1415r;
            it2 = this.f1416s.iterator();
            list = this.f1417t;
        } else if (i3 == 1) {
            Object obj2 = this.f1413p;
            Iterator it3 = this.f1412o;
            List list2 = (List) this.f1415r;
            H2.h.E(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0082f(1, null));
                this.f1415r = list2;
                this.f1412o = it3;
                this.f1413p = null;
                this.f1414q = 2;
                throw null;
            }
            obj = obj2;
            it2 = it3;
            list = list2;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = this.f1412o;
            list = (List) this.f1415r;
            H2.h.E(obj);
        }
        if (!it2.hasNext()) {
            return obj;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        }
        this.f1415r = list;
        this.f1412o = it2;
        this.f1413p = obj;
        this.f1414q = 1;
        throw null;
    }
}
