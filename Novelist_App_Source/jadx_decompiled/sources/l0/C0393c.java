package l0;

import java.util.ArrayList;

/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393c extends AbstractC0409s {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3957e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f3958f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3959g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3960h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f3961i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3962j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3963k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3964l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3965m;
    public ArrayList n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3966o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // l0.AbstractC0409s
    public final void a() {
        ArrayList arrayList = this.f3961i;
        ArrayList arrayList2 = this.f3962j;
        ArrayList arrayList3 = this.f3958f;
        ArrayList arrayList4 = this.f3963k;
        ArrayList arrayList5 = this.f3960h;
        ArrayList arrayList6 = this.f3957e;
        ArrayList arrayList7 = this.f3959g;
        int size = arrayList7.size() - 1;
        if (size >= 0) {
            B1.e.p(arrayList7.get(size));
            throw null;
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            if (arrayList6.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f4013a != null) {
                throw null;
            }
            arrayList6.remove(size2);
        }
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        int size4 = arrayList5.size() - 1;
        if (size4 >= 0) {
            B1.e.p(arrayList5.get(size4));
            throw null;
        }
        arrayList5.clear();
        if (b()) {
            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList2.get(size5);
                int size6 = arrayList8.size() - 1;
                if (size6 >= 0) {
                    B1.e.p(arrayList8.get(size6));
                    throw null;
                }
            }
            for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList.get(size7);
                int size8 = arrayList9.size() - 1;
                if (size8 >= 0) {
                    arrayList9.get(size8).getClass();
                    throw new ClassCastException();
                }
            }
            for (int size9 = arrayList4.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList4.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    B1.e.p(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.n);
            c(this.f3965m);
            c(this.f3964l);
            c(this.f3966o);
            ArrayList arrayList11 = this.f4014b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // l0.AbstractC0409s
    public final boolean b() {
        return (this.f3958f.isEmpty() && this.f3960h.isEmpty() && this.f3959g.isEmpty() && this.f3957e.isEmpty() && this.f3965m.isEmpty() && this.n.isEmpty() && this.f3964l.isEmpty() && this.f3966o.isEmpty() && this.f3962j.isEmpty() && this.f3961i.isEmpty() && this.f3963k.isEmpty()) ? false : true;
    }
}
