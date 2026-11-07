package V;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: V.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0093q extends T1.h implements Z1.q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1459o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1460p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1461q;

    public /* synthetic */ C0093q(int i3, R1.c cVar) {
        super(i3, cVar);
    }

    @Override // Z1.q
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f1459o) {
            case 0:
                return new C0093q((N) this.f1461q, (R1.c) obj3).m(O1.g.f1211a);
            default:
                ((Boolean) obj2).getClass();
                C0093q c0093q = new C0093q(3, (R1.c) obj3);
                c0093q.f1461q = (P) obj;
                return c0093q.m(O1.g.f1211a);
        }
    }

    @Override // T1.a
    public final Object m(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        switch (this.f1459o) {
            case 0:
                int i3 = this.f1460p;
                if (i3 == 0) {
                    H2.h.E(obj);
                    N n = (N) this.f1461q;
                    this.f1460p = 1;
                    Object objA = N.a(n, this);
                    S1.a aVar = S1.a.f1260k;
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    H2.h.E(obj);
                }
                return O1.g.f1211a;
            default:
                int i4 = this.f1460p;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    H2.h.E(obj);
                    return obj;
                }
                H2.h.E(obj);
                P p3 = (P) this.f1461q;
                this.f1460p = 1;
                p3.getClass();
                Object objA2 = P.a(p3, this);
                S1.a aVar2 = S1.a.f1260k;
                return objA2 == aVar2 ? aVar2 : objA2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0093q(N n, R1.c cVar) {
        super(3, cVar);
        this.f1461q = n;
    }
}
