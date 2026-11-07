package K1;

import V.C0079c;
import V.Z;
import V.b0;
import V.j0;
import V.k0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class B implements l2.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l2.e f663l;

    public /* synthetic */ B(l2.e eVar, int i3) {
        this.f662k = i3;
        this.f663l = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // l2.e
    public final Object g(Object obj, R1.c cVar) throws Throwable {
        A a3;
        V.r rVar;
        switch (this.f662k) {
            case 0:
                if (cVar instanceof A) {
                    a3 = (A) cVar;
                    int i3 = a3.f660o;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        a3.f660o = i3 - Integer.MIN_VALUE;
                    } else {
                        a3 = new A(this, cVar);
                    }
                } else {
                    a3 = new A(this, cVar);
                }
                Object obj2 = a3.n;
                int i4 = a3.f660o;
                if (i4 == 0) {
                    H2.h.E(obj2);
                    Set setKeySet = ((Y.b) obj).a().keySet();
                    a3.f660o = 1;
                    Object objG = this.f663l.g(setKeySet, a3);
                    S1.a aVar = S1.a.f1260k;
                    if (objG == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    H2.h.E(obj2);
                }
                return O1.g.f1211a;
            default:
                if (cVar instanceof V.r) {
                    rVar = (V.r) cVar;
                    int i5 = rVar.f1462o;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rVar.f1462o = i5 - Integer.MIN_VALUE;
                    } else {
                        rVar = new V.r(this, cVar);
                    }
                } else {
                    rVar = new V.r(this, cVar);
                }
                Object obj3 = rVar.n;
                int i6 = rVar.f1462o;
                if (i6 == 0) {
                    H2.h.E(obj3);
                    j0 j0Var = (j0) obj;
                    if (j0Var instanceof b0) {
                        throw ((b0) j0Var).f1389b;
                    }
                    if (!(j0Var instanceof C0079c)) {
                        if (j0Var instanceof Z ? true : j0Var instanceof k0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new D0.a();
                    }
                    Object obj4 = ((C0079c) j0Var).f1390b;
                    rVar.f1462o = 1;
                    Object objG2 = this.f663l.g(obj4, rVar);
                    S1.a aVar2 = S1.a.f1260k;
                    if (objG2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    H2.h.E(obj3);
                }
                return O1.g.f1211a;
        }
    }
}
