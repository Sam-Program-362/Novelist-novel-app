package p004b1;

import B1.e;
import K.c;
import M1.A;
import X1.b;
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
import p055t.a;

/* JADX INFO: renamed from: b1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0168a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f2611a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c f2612b;

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
        switch (E.f2583a[roundingMode.ordinal()]) {
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
                int iAbs = Math.abs(i6);
                int iAbs2 = iAbs - (Math.abs(i4) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i5;
                }
                if (iAbs2 <= 0) {
                    return i5;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i5 + i7;
    }

    public static int b(AbstractC0178k abstractC0178k) {
        Iterator it2 = abstractC0178k.iterator();
        int iHashCode = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static String c(J j3) {
        StringBuilder sb = new StringBuilder(j3.d());
        for (int i3 = 0; i3 < j3.d(); i3++) {
            byte bA = j3.a(i3);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
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
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
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
        int iIndexOf;
        String string;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = objArr.length;
            if (i4 >= length) {
                break;
            }
            Object obj = objArr[i4];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e3) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e3);
                    string = "<" + str2 + " threw " + e3.getClass().getName() + ">";
                }
            }
            objArr[i4] = string;
            i4++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i5 = 0;
        while (true) {
            length2 = objArr.length;
            if (i3 >= length2 || (iIndexOf = str.indexOf("%s", i5)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i5, iIndexOf);
            sb.append(objArr[i3]);
            i3++;
            i5 = iIndexOf + 2;
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
        String strD;
        if (i3 < 0 || i3 >= i4) {
            if (i3 < 0) {
                strD = d("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(e.g("negative size: ", i4));
                }
                strD = d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(a.b("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final void g(StringBuilder sb, Iterator it2, A a3) {
        if (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            sb.append(A.m(entry.getKey()));
            sb.append(" : ");
            sb.append(A.m(entry.getValue()));
            while (it2.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it2.next();
                sb.append(A.m(entry2.getKey()));
                sb.append(" : ");
                sb.append(A.m(entry2.getValue()));
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
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = r.f2636l;
            }
        } else {
            if (!(collection instanceof InterfaceC0191y)) {
                return false;
            }
            objComparator = ((AbstractC0183p) ((InterfaceC0191y) collection)).n;
        }
        return comparator.equals(objComparator);
    }

    public static byte[] j(byte[]... bArr) {
        int i3 = 0;
        int length = 0;
        while (true) {
            if (i3 >= bArr.length) {
                break;
            }
            length += bArr[i3].length;
            i3++;
        }
        byte[] bArr2 = new byte[length];
        int i4 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i4, length2);
            i4 += length2;
        }
        return bArr2;
    }

    public static final V k(X x) throws O {
        try {
            W wD = x.d();
            if (wD == null) {
                throw new O("Parser being asked to parse an empty input stream");
            }
            try {
                try {
                    byte b3 = wD.f2604a;
                    byte b4 = wD.f2605b;
                    int i3 = 0;
                    if (b3 == -128) {
                        long jA = x.a();
                        if (jA > 1000) {
                            throw new O("Parser being asked to read a large CBOR array");
                        }
                        l(b4, jA);
                        V[] vArr = new V[(int) jA];
                        while (i3 < jA) {
                            vArr[i3] = k(x);
                            i3++;
                        }
                        return new L(AbstractC0176i.j(vArr));
                    }
                    if (b3 != -96) {
                        if (b3 == -64) {
                            throw new O("Tags are currently unsupported");
                        }
                        if (b3 == -32) {
                            return new M(x.e());
                        }
                        if (b3 == 0 || b3 == 32) {
                            long jB = x.b();
                            l(b4, jB > 0 ? jB : ~jB);
                            return new P(jB);
                        }
                        if (b3 == 64) {
                            x.h((byte) 64);
                            byte[] bArrJ = x.j();
                            int length = bArrJ.length;
                            l(b4, length);
                            return new N(J.i(bArrJ, length));
                        }
                        if (b3 == 96) {
                            x.h((byte) 96);
                            String str = new String(x.j(), StandardCharsets.UTF_8);
                            l(b4, str.length());
                            return new T(str);
                        }
                        throw new O("Unidentifiable major type: " + ((b3 >> 5) & 7));
                    }
                    long jC = x.c();
                    if (jC > 1000) {
                        throw new O("Parser being asked to read a large CBOR map");
                    }
                    l(b4, jC);
                    int i4 = (int) jC;
                    Q[] qArr = new Q[i4];
                    V v3 = null;
                    int i5 = 0;
                    while (i5 < jC) {
                        V vK = k(x);
                        if (v3 != null && vK.compareTo(v3) <= 0) {
                            throw new b("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + v3.toString() + "\nCurrent key: " + vK.toString());
                        }
                        qArr[i5] = new Q(vK, k(x), 0);
                        i5++;
                        v3 = vK;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i3 < i4) {
                        Q q3 = qArr[i3];
                        if (treeMap.containsKey((V) q3.f2599l)) {
                            throw new b("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((V) q3.f2599l, (V) q3.f2600m);
                        i3++;
                    }
                    return new S(C0182o.b(treeMap));
                } catch (IOException | RuntimeException e3) {
                    e = e3;
                    throw new O(e);
                }
            } catch (RuntimeException e4) {
                e = e4;
                throw new O(e);
            }
        } catch (IOException e5) {
            throw new O(e5);
        }
    }

    public static final void l(byte b3, long j3) throws b {
        switch (b3) {
            case 24:
                if (j3 >= 24) {
                    return;
                }
                throw new b("Integer value " + j3 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j3 >= 256) {
                    return;
                }
                throw new b("Integer value " + j3 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j3 >= 65536) {
                    return;
                }
                throw new b("Integer value " + j3 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j3 >= 4294967296L) {
                    return;
                }
                throw new b("Integer value " + j3 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }

    public static void m(int i3, int i4, int i5) {
        String strN;
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            if (i3 < 0 || i3 > i5) {
                strN = n(i3, "start index", i5);
            } else {
                strN = (i4 < 0 || i4 > i5) ? n(i4, "end index", i5) : d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strN);
        }
    }

    public static String n(int i3, String str, int i4) {
        if (i3 < 0) {
            return d("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(e.g("negative size: ", i4));
    }
}
