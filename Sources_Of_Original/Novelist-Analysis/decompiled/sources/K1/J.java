package K1;

import android.content.Context;
import i2.InterfaceC0210s;

/* JADX INFO: loaded from: classes.dex */
public final class J extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f689o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ L f691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f692r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(String str, L l3, long j3, R1.c cVar) {
        super(2, cVar);
        this.f690p = str;
        this.f691q = l3;
        this.f692r = j3;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((J) i((R1.c) obj2, (InterfaceC0210s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new J(this.f690p, this.f691q, this.f692r, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f689o;
        if (i3 == 0) {
            H2.h.E(obj);
            Y.d dVar = new Y.d(this.f690p);
            Context context = this.f691q.f697k;
            if (context == null) {
                a2.h.g("context");
                throw null;
            }
            B1.g gVarA = M.a(context);
            I i4 = new I(dVar, this.f692r, null);
            this.f689o = 1;
            Object objD = gVarA.d(new Y.h(i4, null), this);
            S1.a aVar = S1.a.f1260k;
            if (objD == aVar) {
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
