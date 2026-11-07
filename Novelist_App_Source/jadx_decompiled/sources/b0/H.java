package b0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class H implements F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f2353a;

    public H(I i3) {
        this.f2353a = i3;
    }

    @Override // b0.F
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i3 = this.f2353a;
        ArrayList arrayList3 = i3.f2372d;
        C0154a c0154a = (C0154a) arrayList3.get(arrayList3.size() - 1);
        i3.f2376h = c0154a;
        ArrayList arrayList4 = c0154a.f2437a;
        int size = arrayList4.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList4.get(i5);
            i5++;
            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = ((P) obj).f2423b;
            if (abstractComponentCallbacksC0171s != null) {
                abstractComponentCallbacksC0171s.f2549w = true;
            }
        }
        boolean R2 = i3.R(arrayList, arrayList2, -1, 0);
        if (!i3.f2381m.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList.get(i6);
                i6++;
                linkedHashSet.addAll(I.E((C0154a) obj2));
            }
            ArrayList arrayList5 = i3.f2381m;
            int size3 = arrayList5.size();
            while (i4 < size3) {
                Object obj3 = arrayList5.get(i4);
                i4++;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        return R2;
    }
}
