package p024h2;

import O1.b;
import R1.f;
import R1.g;
import Z1.p;
import a2.h;
import i2.InterfaceC0202j;
import i2.N;
import i2.W;
import i2.r;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m2.l;
import n2.q;
import p012e2.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2914l;

    public /* synthetic */ m(Object obj, int i3) {
        this.f2913k = i3;
        this.f2914l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x010c A[LOOP:1: B:48:0x00db->B:59:0x010c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x013f A[LOOP:3: B:62:0x0112->B:73:0x013f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        Object next;
        String str;
        b bVar;
        String str2;
        Object next2;
        String str3;
        String str4;
        switch (this.f2913k) {
            case 0:
                List list = (List) this.f2914l;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                h.e(charSequence, "$this$DelimitedRangesSequence");
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str5 = (String) list.get(0);
                    int iC0 = d.c0(charSequence, str5, iIntValue, 4);
                    if (iC0 < 0) {
                        bVar = null;
                    } else {
                        bVar = new b(Integer.valueOf(iC0), str5);
                    }
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    boolean z3 = charSequence instanceof String;
                    int i3 = new c(iIntValue, charSequence.length(), 1).f2784l;
                    if (z3) {
                        if (iIntValue > i3) {
                            bVar = null;
                        } else {
                            int i4 = iIntValue;
                            while (true) {
                                Iterator it2 = list.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        bVar = new b(Integer.valueOf(i4), str3);
                                    } else if (i4 != i3) {
                                        i4++;
                                    } else {
                                        bVar = null;
                                    }
                                } while (!l.X(0, i4, str4.length(), str4, (String) charSequence, false));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    bVar = new b(Integer.valueOf(i4), str3);
                                } else if (i4 != i3) {
                                    i4++;
                                } else {
                                    bVar = null;
                                }
                            }
                        }
                    } else if (iIntValue > i3) {
                        bVar = null;
                    } else {
                        while (true) {
                            Iterator it3 = list.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    bVar = new b(Integer.valueOf(iIntValue), str);
                                } else if (iIntValue != i3) {
                                    iIntValue++;
                                } else {
                                    bVar = null;
                                }
                            } while (!d.e0(str2, charSequence, iIntValue, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                bVar = new b(Integer.valueOf(iIntValue), str);
                            } else if (iIntValue != i3) {
                                iIntValue++;
                            } else {
                                bVar = null;
                            }
                        }
                    }
                }
                if (bVar != null) {
                    return new b(bVar.f1203k, Integer.valueOf(((String) bVar.f1204l).length()));
                }
                return null;
            default:
                l lVar = (l) this.f2914l;
                int iIntValue2 = ((Integer) obj).intValue();
                f fVar = (f) obj2;
                g key = fVar.getKey();
                f fVarE = lVar.f4121o.e(key);
                if (key == r.f3022l) {
                    N n = (N) fVarE;
                    N n3 = (N) fVar;
                    while (true) {
                        N parent = null;
                        if (n3 == null) {
                            n3 = null;
                        } else if (n3 != n && (n3 instanceof q)) {
                            InterfaceC0202j interfaceC0202j = (InterfaceC0202j) W.f2991l.get((q) n3);
                            if (interfaceC0202j != null) {
                                parent = interfaceC0202j.getParent();
                            }
                            n3 = parent;
                        }
                    }
                    if (n3 != n) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + n3 + ", expected child of " + n + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (n != null) {
                        iIntValue2++;
                    }
                } else if (fVar != fVarE) {
                    iIntValue2 = Integer.MIN_VALUE;
                } else {
                    iIntValue2++;
                }
                return Integer.valueOf(iIntValue2);
        }
    }
}
