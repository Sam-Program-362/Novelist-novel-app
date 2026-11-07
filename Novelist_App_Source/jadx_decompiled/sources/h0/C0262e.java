package h0;

import B1.s;
import P1.m;
import b.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l2.o;
import l2.q;
import org.apache.tika.metadata.ClimateForcast;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262e {

    /* renamed from: a, reason: collision with root package name */
    public final q f2868a = new q(C0263f.f2881m);

    /* renamed from: b, reason: collision with root package name */
    public final q f2869b;

    /* renamed from: c, reason: collision with root package name */
    public final o f2870c;

    /* renamed from: d, reason: collision with root package name */
    public final P1.c f2871d;

    /* renamed from: e, reason: collision with root package name */
    public final P1.c f2872e;

    /* renamed from: f, reason: collision with root package name */
    public b.o f2873f;

    /* renamed from: g, reason: collision with root package name */
    public int f2874g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0261d f2875h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f2876i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f2877j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f2878k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2879l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2880m;
    public boolean n;

    public C0262e() {
        q qVar = new q(new C0260c());
        this.f2869b = qVar;
        this.f2870c = new o(qVar);
        this.f2871d = new P1.c();
        this.f2872e = new P1.c();
        this.f2876i = new LinkedHashSet();
        this.f2877j = new LinkedHashSet();
        this.f2878k = new LinkedHashSet();
    }

    public final void a(s sVar, AbstractC0261d abstractC0261d, int i3) {
        a2.h.e(sVar, "dispatcher");
        if (abstractC0261d.f2866a == null) {
            (i3 != 0 ? i3 != 1 ? this.f2876i : this.f2877j : this.f2878k).add(abstractC0261d);
            abstractC0261d.f2866a = sVar;
            a2.h.e((C0260c) this.f2870c.f4071k.a(), ClimateForcast.HISTORY);
            abstractC0261d.b(i3 != 0 ? i3 != 1 ? this.n : this.f2879l : this.f2880m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + abstractC0261d + "' is already added to dispatcher " + abstractC0261d.f2866a + '.').toString());
    }

    public final void b() {
        boolean z3;
        boolean z4;
        C0260c c0260c;
        P1.c cVar = this.f2871d;
        if (cVar == null || !cVar.isEmpty()) {
            Iterator it2 = cVar.iterator();
            while (it2.hasNext()) {
                if (((b.o) it2.next()).f2330b) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        P1.c cVar2 = this.f2872e;
        if (cVar2 == null || !cVar2.isEmpty()) {
            Iterator it3 = cVar2.iterator();
            while (it3.hasNext()) {
                if (((b.o) it3.next()).f2330b) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        boolean z5 = z3 || z4;
        boolean z6 = this.f2880m != z3;
        boolean z7 = this.f2879l != z4;
        boolean z8 = this.n != z5;
        LinkedHashSet linkedHashSet = this.f2878k;
        if (z6) {
            Iterator it4 = linkedHashSet.iterator();
            while (it4.hasNext()) {
                ((AbstractC0261d) it4.next()).b(z3);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f2877j;
        if (z7) {
            Iterator it5 = linkedHashSet2.iterator();
            while (it5.hasNext()) {
                ((AbstractC0261d) it5.next()).b(z4);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f2876i;
        if (z8) {
            Iterator it6 = linkedHashSet3.iterator();
            while (it6.hasNext()) {
                ((AbstractC0261d) it6.next()).b(z5);
            }
        }
        this.f2880m = z3;
        this.f2879l = z4;
        this.n = z5;
        b.o oVar = this.f2873f;
        if (oVar == null) {
            oVar = c(0);
        }
        b.o oVar2 = this.f2873f;
        if (oVar2 == null) {
            oVar2 = c(0);
        }
        if (a2.h.a(oVar2, oVar)) {
            if (oVar2 == null) {
                c0260c = new C0260c();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it7 = cVar.iterator();
                while (it7.hasNext()) {
                    ((b.o) it7.next()).getClass();
                }
                Iterator<E> it8 = cVar2.iterator();
                while (it8.hasNext()) {
                    ((b.o) it8.next()).getClass();
                }
                p pVar = oVar2.f2329a;
                Q1.c cVar3 = new Q1.c(10);
                cVar3.addAll(arrayList);
                cVar3.add(pVar);
                cVar3.addAll(m.f1219k);
                cVar3.f();
                cVar3.f1242m = true;
                if (cVar3.f1241l <= 0) {
                    cVar3 = Q1.c.n;
                }
                c0260c = new C0260c(arrayList.size(), cVar3);
            }
            q qVar = this.f2869b;
            if (a2.h.a((C0260c) qVar.a(), c0260c)) {
                return;
            }
            qVar.c(null, c0260c);
            Iterator it9 = linkedHashSet.iterator();
            while (it9.hasNext()) {
                ((AbstractC0261d) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet2.iterator();
            while (it10.hasNext()) {
                ((AbstractC0261d) it10.next()).getClass();
            }
            Iterator it11 = linkedHashSet3.iterator();
            while (it11.hasNext()) {
                ((AbstractC0261d) it11.next()).getClass();
            }
        }
    }

    public final b.o c(int i3) {
        Object obj;
        Object obj2;
        P1.c cVar = this.f2872e;
        P1.c cVar2 = this.f2871d;
        Object obj3 = null;
        if (i3 == -1) {
            Iterator it2 = cVar2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((b.o) obj).f2330b) {
                    break;
                }
            }
            b.o oVar = (b.o) obj;
            if (oVar != null) {
                return oVar;
            }
            Iterator it3 = cVar.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((b.o) next).f2330b) {
                    obj3 = next;
                    break;
                }
            }
            return (b.o) obj3;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i3 + "'.").toString());
            }
            Iterator it4 = cVar2.iterator();
            while (it4.hasNext()) {
                ((b.o) it4.next()).getClass();
            }
            Iterator it5 = cVar.iterator();
            while (it5.hasNext()) {
                ((b.o) it5.next()).getClass();
            }
            return null;
        }
        Iterator it6 = cVar2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (((b.o) obj2).f2330b) {
                break;
            }
        }
        b.o oVar2 = (b.o) obj2;
        if (oVar2 != null) {
            return oVar2;
        }
        Iterator it7 = cVar.iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            Object next2 = it7.next();
            if (((b.o) next2).f2330b) {
                obj3 = next2;
                break;
            }
        }
        return (b.o) obj3;
    }
}
