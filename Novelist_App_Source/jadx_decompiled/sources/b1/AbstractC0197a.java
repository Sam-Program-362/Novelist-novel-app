package b1;

import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ContentHandlerProxy;
import t.AbstractC0468a;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0197a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2611a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile K.c f2612b;

    public static int a(int i3, int i4) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i4 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i5 = i3 / i4;
        int i6 = i3 - (i4 * i5);
        if (i6 == 0) {
            return i5;
        }
        int i7 = ((i3 ^ i4) >> 31) | 1;
        switch (AbstractC0180E.f2583a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i5;
            case 3:
                if (i7 >= 0) {
                    return i5;
                }
                break;
            case 4:
                break;
            case 5:
                if (i7 <= 0) {
                    return i5;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i6);
                int abs2 = abs - (Math.abs(i4) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i5;
                }
                if (abs2 <= 0) {
                    return i5;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i5 + i7;
    }

    public static int b(AbstractC0207k abstractC0207k) {
        Iterator it2 = abstractC0207k.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            i3 += next != null ? next.hashCode() : 0;
        }
        return i3;
    }

    public static String c(C0185J c0185j) {
        StringBuilder sb = new StringBuilder(c0185j.d());
        for (int i3 = 0; i3 < c0185j.d(); i3++) {
            byte a3 = c0185j.a(i3);
            if (a3 == 34) {
                sb.append("\\\"");
            } else if (a3 == 39) {
                sb.append("\\'");
            } else if (a3 != 92) {
                switch (a3) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a3 < 32 || a3 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a3 >>> 6) & 3) + 48));
                            sb.append((char) (((a3 >>> 3) & 7) + 48));
                            sb.append((char) ((a3 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a3);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String d(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = objArr.length;
            if (i4 >= length) {
                break;
            }
            Object obj = objArr[i4];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e3) {
                    String str3 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e3);
                    str2 = "<" + str3 + " threw " + e3.getClass().getName() + ">";
                }
            }
            objArr[i4] = str2;
            i4++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i5 = 0;
        while (true) {
            length2 = objArr.length;
            if (i3 >= length2 || (indexOf = str.indexOf("%s", i5)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i5, indexOf);
            sb.append(objArr[i3]);
            i3++;
            i5 = indexOf + 2;
        }
        sb.append((CharSequence) str, i5, str.length());
        if (i3 < length2) {
            sb.append(" [");
            sb.append(objArr[i3]);
            for (int i6 = i3 + 1; i6 < objArr.length; i6++) {
                sb.append(", ");
                sb.append(objArr[i6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void e(int i3, int i4) {
        String d3;
        if (i3 < 0 || i3 >= i4) {
            if (i3 < 0) {
                d3 = d("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(B1.e.g("negative size: ", i4));
                }
                d3 = d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(d3);
        }
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(AbstractC0468a.b("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final void g(StringBuilder sb, Iterator it2, M1.A a3) {
        if (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            sb.append(M1.A.m(entry.getKey()));
            sb.append(" : ");
            sb.append(M1.A.m(entry.getValue()));
            while (it2.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it2.next();
                sb.append(M1.A.m(entry2.getKey()));
                sb.append(" : ");
                sb.append(M1.A.m(entry2.getValue()));
            }
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean i(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = C0214r.f2636l;
            }
        } else {
            if (!(collection instanceof InterfaceC0221y)) {
                return false;
            }
            obj = ((AbstractC0212p) ((InterfaceC0221y) collection)).n;
        }
        return comparator.equals(obj);
    }

    public static byte[] j(byte[]... bArr) {
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= bArr.length) {
                break;
            }
            i4 += bArr[i3].length;
            i3++;
        }
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i5, length);
            i5 += length;
        }
        return bArr2;
    }

    public static final AbstractC0196V k(X x) {
        try {
            W d3 = x.d();
            if (d3 == null) {
                throw new C0190O("Parser being asked to parse an empty input stream");
            }
            try {
                try {
                    byte b3 = d3.f2604a;
                    byte b4 = d3.f2605b;
                    int i3 = 0;
                    if (b3 == Byte.MIN_VALUE) {
                        long a3 = x.a();
                        if (a3 > 1000) {
                            throw new C0190O("Parser being asked to read a large CBOR array");
                        }
                        l(b4, a3);
                        AbstractC0196V[] abstractC0196VArr = new AbstractC0196V[(int) a3];
                        while (i3 < a3) {
                            abstractC0196VArr[i3] = k(x);
                            i3++;
                        }
                        return new C0187L(AbstractC0205i.j(abstractC0196VArr));
                    }
                    if (b3 != -96) {
                        if (b3 == -64) {
                            throw new C0190O("Tags are currently unsupported");
                        }
                        if (b3 == -32) {
                            return new C0188M(x.e());
                        }
                        if (b3 == 0 || b3 == 32) {
                            long b5 = x.b();
                            l(b4, b5 > 0 ? b5 : ~b5);
                            return new C0191P(b5);
                        }
                        if (b3 == 64) {
                            x.h((byte) 64);
                            byte[] j3 = x.j();
                            int length = j3.length;
                            l(b4, length);
                            return new C0189N(C0185J.i(j3, length));
                        }
                        if (b3 == 96) {
                            x.h((byte) 96);
                            String str = new String(x.j(), StandardCharsets.UTF_8);
                            l(b4, str.length());
                            return new C0194T(str);
                        }
                        throw new C0190O("Unidentifiable major type: " + ((b3 >> 5) & 7));
                    }
                    long c3 = x.c();
                    if (c3 > 1000) {
                        throw new C0190O("Parser being asked to read a large CBOR map");
                    }
                    l(b4, c3);
                    int i4 = (int) c3;
                    C0192Q[] c0192qArr = new C0192Q[i4];
                    AbstractC0196V abstractC0196V = null;
                    int i5 = 0;
                    while (i5 < c3) {
                        AbstractC0196V k3 = k(x);
                        if (abstractC0196V != null && k3.compareTo(abstractC0196V) <= 0) {
                            throw new X1.b("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + abstractC0196V.toString() + "\nCurrent key: " + k3.toString());
                        }
                        c0192qArr[i5] = new C0192Q(k3, k(x), 0);
                        i5++;
                        abstractC0196V = k3;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i3 < i4) {
                        C0192Q c0192q = c0192qArr[i3];
                        if (treeMap.containsKey((AbstractC0196V) c0192q.f2599l)) {
                            throw new X1.b("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((AbstractC0196V) c0192q.f2599l, (AbstractC0196V) c0192q.f2600m);
                        i3++;
                    }
                    return new C0193S(C0211o.b(treeMap));
                } catch (IOException | RuntimeException e3) {
                    e = e3;
                    throw new C0190O(e);
                }
            } catch (RuntimeException e4) {
                e = e4;
                throw new C0190O(e);
            }
        } catch (IOException e5) {
            throw new C0190O(e5);
        }
    }

    public static final void l(byte b3, long j3) {
        switch (b3) {
            case 24:
                if (j3 >= 24) {
                    return;
                }
                throw new X1.b("Integer value " + j3 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j3 >= 256) {
                    return;
                }
                throw new X1.b("Integer value " + j3 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j3 >= 65536) {
                    return;
                }
                throw new X1.b("Integer value " + j3 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j3 >= 4294967296L) {
                    return;
                }
                throw new X1.b("Integer value " + j3 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }

    public static void m(int i3, int i4, int i5) {
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            throw new IndexOutOfBoundsException((i3 < 0 || i3 > i5) ? n(i3, "start index", i5) : (i4 < 0 || i4 > i5) ? n(i4, "end index", i5) : d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3)));
        }
    }

    public static String n(int i3, String str, int i4) {
        if (i3 < 0) {
            return d("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(B1.e.g("negative size: ", i4));
    }
}
