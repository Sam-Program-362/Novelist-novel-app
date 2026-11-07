package p022h0;

import B1.s;
import P1.c;
import P1.m;
import a2.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l2.o;
import l2.q;
import org.apache.tika.metadata.ClimateForcast;
import p002b.p;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f2868a = new q(f.f2881m);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f2869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f2870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f2871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f2872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p002b.o f2873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f2875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f2876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f2877j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f2878k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2880m;
    public boolean n;

    public e() {
        q qVar = new q(new c());
        this.f2869b = qVar;
        this.f2870c = new o(qVar);
        this.f2871d = new c();
        this.f2872e = new c();
        this.f2876i = new LinkedHashSet();
        this.f2877j = new LinkedHashSet();
        this.f2878k = new LinkedHashSet();
    }

    public final void a(s sVar, d dVar, int i3) {
        LinkedHashSet linkedHashSet;
        boolean z3;
        h.e(sVar, "dispatcher");
        if (dVar.f2866a != null) {
            throw new IllegalArgumentException(("Input '" + dVar + "' is already added to dispatcher " + dVar.f2866a + '.').toString());
        }
        if (i3 != 0) {
            linkedHashSet = i3 != 1 ? this.f2876i : this.f2877j;
        } else {
            linkedHashSet = this.f2878k;
        }
        linkedHashSet.add(dVar);
        dVar.f2866a = sVar;
        h.e((c) this.f2870c.f4071k.a(), ClimateForcast.HISTORY);
        if (i3 != 0) {
            z3 = i3 != 1 ? this.n : this.f2879l;
        } else {
            z3 = this.f2880m;
        }
        dVar.b(z3);
    }

    public final void b() {
        boolean z3;
        boolean z4;
        c cVar;
        c cVar2 = this.f2871d;
        if (cVar2 != null && cVar2.isEmpty()) {
            z3 = false;
            break;
        }
        Iterator it2 = cVar2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = false;
                break;
            } else if (((p002b.o) it2.next()).f2330b) {
                z3 = true;
                break;
            }
        }
        c cVar3 = this.f2872e;
        if (cVar3 != null && cVar3.isEmpty()) {
            z4 = false;
            break;
        }
        Iterator it3 = cVar3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = false;
                break;
            } else if (((p002b.o) it3.next()).f2330b) {
                z4 = true;
                break;
            }
        }
        boolean z5 = z3 || z4;
        boolean z6 = this.f2880m != z3;
        boolean z7 = this.f2879l != z4;
        boolean z8 = this.n != z5;
        LinkedHashSet linkedHashSet = this.f2878k;
        if (z6) {
            Iterator it4 = linkedHashSet.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).b(z3);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f2877j;
        if (z7) {
            Iterator it5 = linkedHashSet2.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).b(z4);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f2876i;
        if (z8) {
            Iterator it6 = linkedHashSet3.iterator();
            while (it6.hasNext()) {
                ((d) it6.next()).b(z5);
            }
        }
        this.f2880m = z3;
        this.f2879l = z4;
        this.n = z5;
        p002b.o oVarC = this.f2873f;
        if (oVarC == null) {
            oVarC = c(0);
        }
        p002b.o oVarC2 = this.f2873f;
        if (oVarC2 == null) {
            oVarC2 = c(0);
        }
        if (h.a(oVarC2, oVarC)) {
            if (oVarC2 == null) {
                cVar = new c();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it7 = cVar2.iterator();
                while (it7.hasNext()) {
                    ((p002b.o) it7.next()).getClass();
                }
                Iterator<E> it8 = cVar3.iterator();
                while (it8.hasNext()) {
                    ((p002b.o) it8.next()).getClass();
                }
                p pVar = oVarC2.f2329a;
                Q1.c cVar4 = new Q1.c(10);
                cVar4.addAll(arrayList);
                cVar4.add(pVar);
                cVar4.addAll(m.f1219k);
                cVar4.f();
                cVar4.f1242m = true;
                if (cVar4.f1241l <= 0) {
                    cVar4 = Q1.c.n;
                }
                cVar = new c(arrayList.size(), cVar4);
            }
            q qVar = this.f2869b;
            if (h.a((c) qVar.a(), cVar)) {
                return;
            }
            qVar.c(null, cVar);
            Iterator it9 = linkedHashSet.iterator();
            while (it9.hasNext()) {
                ((d) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet2.iterator();
            while (it10.hasNext()) {
                ((d) it10.next()).getClass();
            }
            Iterator it11 = linkedHashSet3.iterator();
            while (it11.hasNext()) {
                ((d) it11.next()).getClass();
            }
        }
    }

    public final p002b.o c(int i3) {
        Object next;
        Object next2;
        c cVar = this.f2872e;
        c cVar2 = this.f2871d;
        Object obj = null;
        if (i3 == -1) {
            Iterator it2 = cVar2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((p002b.o) next).f2330b);
            p002b.o oVar = (p002b.o) next;
            if (oVar != null) {
                return oVar;
            }
            for (Object obj2 : cVar) {
                if (((p002b.o) obj2).f2330b) {
                    obj = obj2;
                    break;
                }
            }
            return (p002b.o) obj;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i3 + "'.").toString());
            }
            Iterator it3 = cVar2.iterator();
            while (it3.hasNext()) {
                ((p002b.o) it3.next()).getClass();
            }
            Iterator it4 = cVar.iterator();
            while (it4.hasNext()) {
                ((p002b.o) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = cVar2.iterator();
        do {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
        } while (!((p002b.o) next2).f2330b);
        p002b.o oVar2 = (p002b.o) next2;
        if (oVar2 != null) {
            return oVar2;
        }
        for (Object obj3 : cVar) {
            if (((p002b.o) obj3).f2330b) {
                obj = obj3;
                break;
            }
        }
        return (p002b.o) obj;
    }
}
