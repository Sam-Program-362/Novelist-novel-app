package p064x0;

import O1.g;
import R1.c;
import T1.h;
import X.b;
import Z1.p;
import android.app.Activity;
import k2.j;
import k2.q;
import p052r1.k;
import p066y0.a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h implements p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f4704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f4705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Activity f4706r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, Activity activity, c cVar) {
        super(2, cVar);
        this.f4705q = bVar;
        this.f4706r = activity;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((i) i((c) obj2, (q) obj)).m(g.f1211a);
    }

    @Override // T1.a
    public final c i(c cVar, Object obj) {
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
            k kVar = new k(qVar, 1);
            b bVar = this.f4705q;
            ((a) bVar.f4689l).a(this.f4706r, new p029j0.c(), kVar);
            b bVar2 = new b(bVar, kVar, 1);
            this.f4703o = 1;
            Object objB = j.b(qVar, bVar2, this);
            S1.a aVar = S1.a.f1260k;
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
        }
        return g.f1211a;
    }
}
