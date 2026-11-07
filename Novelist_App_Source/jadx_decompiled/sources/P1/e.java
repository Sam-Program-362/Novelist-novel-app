package P1;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public abstract class e extends k {
    public static Object g0(List list) {
        a2.h.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final void h0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Z1.l lVar) {
        a2.h.e(iterable, "<this>");
        sb.append(charSequence2);
        Iterator it2 = iterable.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.f(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) next.toString());
                }
            }
        }
        sb.append(charSequence3);
    }

    public static String i0(Collection collection, String str, String str2, String str3, Z1.l lVar, int i3) {
        String str4 = (i3 & 2) != 0 ? StringUtils.EMPTY : str2;
        String str5 = (i3 & 4) != 0 ? StringUtils.EMPTY : str3;
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        a2.h.e(collection, "<this>");
        StringBuilder sb = new StringBuilder();
        h0(collection, sb, str, str4, str5, "...", lVar);
        return sb.toString();
    }

    public static List j0(int i3, List list) {
        if (i3 < 0) {
            throw new IllegalArgumentException(B1.e.h("Requested element count ", i3, " is less than zero.").toString());
        }
        m mVar = m.f1219k;
        if (i3 == 0) {
            return mVar;
        }
        if (i3 >= list.size()) {
            return l0(list);
        }
        if (i3 == 1) {
            return E2.a.B(g0(list));
        }
        ArrayList arrayList = new ArrayList(i3);
        Iterator it2 = list.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i4++;
            if (i4 == i3) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : E2.a.B(arrayList.get(0)) : mVar;
    }

    public static final void k0(Iterable iterable, AbstractCollection abstractCollection) {
        a2.h.e(iterable, "<this>");
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            abstractCollection.add(it2.next());
        }
    }

    public static List l0(Iterable iterable) {
        ArrayList arrayList;
        a2.h.e(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        m mVar = m.f1219k;
        if (z3) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return mVar;
            }
            if (size != 1) {
                return m0(collection);
            }
            return E2.a.B(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z3) {
            arrayList = m0((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            k0(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : E2.a.B(arrayList.get(0)) : mVar;
    }

    public static ArrayList m0(Collection collection) {
        a2.h.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set n0(Collection collection) {
        a2.h.e(collection, "<this>");
        int size = collection.size();
        if (size == 0) {
            return o.f1221k;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(p.S(collection.size()));
            k0(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        a2.h.d(singleton, "singleton(...)");
        return singleton;
    }
}
