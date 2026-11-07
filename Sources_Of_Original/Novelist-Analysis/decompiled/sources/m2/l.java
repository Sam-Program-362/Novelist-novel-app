package m2;

import i2.N;
import i2.W;
import i2.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class l extends T1.c implements l2.e {
    public final l2.e n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final R1.h f4121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public R1.h f4123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public R1.c f4124r;

    public l(l2.e eVar, R1.h hVar) {
        super(j.f4119k, R1.i.f1255k);
        this.n = eVar;
        this.f4121o = hVar;
        this.f4122p = ((Number) hVar.f(0, new N.d(8))).intValue();
    }

    @Override // T1.a, T1.d
    public final T1.d c() {
        R1.c cVar = this.f4124r;
        if (cVar instanceof T1.d) {
            return (T1.d) cVar;
        }
        return null;
    }

    @Override // l2.e
    public final Object g(Object obj, R1.c cVar) {
        try {
            Object objO = o(cVar, obj);
            return objO == S1.a.f1260k ? objO : O1.g.f1211a;
        } catch (Throwable th) {
            this.f4123q = new h(cVar.getContext(), th);
            throw th;
        }
    }

    @Override // T1.c, R1.c
    public final R1.h getContext() {
        R1.h hVar = this.f4123q;
        return hVar == null ? R1.i.f1255k : hVar;
    }

    @Override // T1.a
    public final StackTraceElement j() {
        return null;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        Throwable thA = O1.d.a(obj);
        if (thA != null) {
            this.f4123q = new h(getContext(), thA);
        }
        R1.c cVar = this.f4124r;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return S1.a.f1260k;
    }

    public final Object o(R1.c cVar, Object obj) {
        List listB;
        Comparable comparable;
        String strSubstring;
        R1.h context = cVar.getContext();
        N n = (N) context.e(r.f3022l);
        if (n != null && !n.a()) {
            throw ((W) n).w();
        }
        R1.h hVar = this.f4123q;
        if (hVar != context) {
            int i3 = 0;
            if (hVar instanceof h) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((h) hVar).f4118l + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                a2.h.e(str, "<this>");
                p024h2.c cVar2 = new p024h2.c(str);
                if (cVar2.hasNext()) {
                    Object next = cVar2.next();
                    if (cVar2.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (cVar2.hasNext()) {
                            arrayList.add(cVar2.next());
                        }
                        listB = arrayList;
                    } else {
                        listB = E2.a.B(next);
                    }
                } else {
                    listB = P1.m.f1219k;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listB) {
                    if (!p024h2.d.d0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(P1.g.e0(arrayList2));
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    String str2 = (String) obj3;
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        char cCharAt = str2.charAt(length2);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList3.add(Integer.valueOf(length2));
                }
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listB.size();
                int size2 = listB.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : listB) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str3 = (String) obj4;
                    if ((i3 == 0 || i3 == size2) && p024h2.d.d0(str3)) {
                        strSubstring = null;
                    } else {
                        a2.h.e(str3, "<this>");
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(B1.e.h("Requested character count ", iIntValue, " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                        a2.h.d(strSubstring, "substring(...)");
                    }
                    if (strSubstring != null) {
                        arrayList4.add(strSubstring);
                    }
                    i3 = i5;
                }
                StringBuilder sb = new StringBuilder(length3);
                P1.e.h0(arrayList4, sb, "\n", StringUtils.EMPTY, StringUtils.EMPTY, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.f(0, new p024h2.m(this, 1))).intValue() != this.f4122p) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f4121o + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f4123q = context;
        }
        this.f4124r = cVar;
        Z1.q qVar = n.f4126a;
        l2.e eVar = this.n;
        a2.h.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objD = qVar.d(eVar, obj, this);
        if (!a2.h.a(objD, S1.a.f1260k)) {
            this.f4124r = null;
        }
        return objD;
    }
}
