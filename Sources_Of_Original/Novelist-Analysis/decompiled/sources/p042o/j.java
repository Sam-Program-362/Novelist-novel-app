package p042o;

import B1.e;
import P1.d;
import a2.h;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p045p.a;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f4207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object[] f4208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4209m;

    public j(int i3) {
        this.f4207k = i3 == 0 ? a.f4237a : new int[i3];
        this.f4208l = i3 == 0 ? a.f4238b : new Object[i3 << 1];
    }

    public final int a(Object obj) {
        int i3 = this.f4209m * 2;
        Object[] objArr = this.f4208l;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i3, Object obj) {
        int i4 = this.f4209m;
        if (i4 == 0) {
            return -1;
        }
        int iA = a.a(i4, i3, this.f4207k);
        if (iA < 0 || h.a(obj, this.f4208l[iA << 1])) {
            return iA;
        }
        int i5 = iA + 1;
        while (i5 < i4 && this.f4207k[i5] == i3) {
            if (h.a(obj, this.f4208l[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f4207k[i6] == i3; i6--) {
            if (h.a(obj, this.f4208l[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f4209m > 0) {
            this.f4207k = a.f4237a;
            this.f4208l = a.f4238b;
            this.f4209m = 0;
        }
        if (this.f4209m > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i3 = this.f4209m;
        if (i3 == 0) {
            return -1;
        }
        int iA = a.a(i3, 0, this.f4207k);
        if (iA < 0 || this.f4208l[iA << 1] == null) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f4207k[i4] == 0) {
            if (this.f4208l[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f4207k[i5] == 0; i5--) {
            if (this.f4208l[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final Object e(int i3) {
        if (i3 < 0 || i3 >= this.f4209m) {
            throw new IllegalArgumentException(e.g("Expected index to be within 0..size()-1, but was ", i3).toString());
        }
        return this.f4208l[i3 << 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                int i3 = this.f4209m;
                if (i3 != ((j) obj).f4209m) {
                    return false;
                }
                j jVar = (j) obj;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object objE = e(i4);
                    Object objH = h(i4);
                    Object obj2 = jVar.get(objE);
                    if (objH == null) {
                        if (obj2 != null || !jVar.containsKey(objE)) {
                            return false;
                        }
                    } else if (!objH.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f4209m != ((Map) obj).size()) {
                return false;
            }
            int i5 = this.f4209m;
            for (int i6 = 0; i6 < i5; i6++) {
                Object objE2 = e(i6);
                Object objH2 = h(i6);
                Object obj3 = ((Map) obj).get(objE2);
                if (objH2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objE2)) {
                        return false;
                    }
                } else if (!objH2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i3) {
        int i4;
        if (i3 < 0 || i3 >= (i4 = this.f4209m)) {
            throw new IllegalArgumentException(e.g("Expected index to be within 0..size()-1, but was ", i3).toString());
        }
        Object[] objArr = this.f4208l;
        int i5 = i3 << 1;
        Object obj = objArr[i5 + 1];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i6 = i4 - 1;
        int[] iArr = this.f4207k;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i3 < i6) {
                int i7 = i3 + 1;
                d.W(i3, i7, i4, iArr, iArr);
                Object[] objArr2 = this.f4208l;
                d.X(i5, i7 << 1, i4 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f4208l;
            int i8 = i6 << 1;
            objArr3[i8] = null;
            objArr3[i8 + 1] = null;
        } else {
            int i9 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i9);
            h.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f4207k = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4208l, i9 << 1);
            h.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4208l = objArrCopyOf;
            if (i4 != this.f4209m) {
                throw new ConcurrentModificationException();
            }
            if (i3 > 0) {
                d.W(0, 0, i3, iArr, this.f4207k);
                d.X(0, 0, i5, objArr, this.f4208l);
            }
            if (i3 < i6) {
                int i10 = i3 + 1;
                d.W(i3, i10, i4, iArr, this.f4207k);
                d.X(i5, i10 << 1, i4 << 1, objArr, this.f4208l);
            }
        }
        if (i4 != this.f4209m) {
            throw new ConcurrentModificationException();
        }
        this.f4209m = i6;
        return obj;
    }

    public final Object g(int i3, Object obj) {
        if (i3 < 0 || i3 >= this.f4209m) {
            throw new IllegalArgumentException(e.g("Expected index to be within 0..size()-1, but was ", i3).toString());
        }
        int i4 = (i3 << 1) + 1;
        Object[] objArr = this.f4208l;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.f4208l[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.f4208l[(iC << 1) + 1] : obj2;
    }

    public final Object h(int i3) {
        if (i3 < 0 || i3 >= this.f4209m) {
            throw new IllegalArgumentException(e.g("Expected index to be within 0..size()-1, but was ", i3).toString());
        }
        return this.f4208l[(i3 << 1) + 1];
    }

    public final int hashCode() {
        int[] iArr = this.f4207k;
        Object[] objArr = this.f4208l;
        int i3 = this.f4209m;
        int i4 = 1;
        int i5 = 0;
        int iHashCode = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f4209m <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i3 = this.f4209m;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iB = obj != null ? b(iHashCode, obj) : d();
        if (iB >= 0) {
            int i4 = (iB << 1) + 1;
            Object[] objArr = this.f4208l;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~iB;
        int[] iArr = this.f4207k;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i6);
            h.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f4207k = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4208l, i6 << 1);
            h.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4208l = objArrCopyOf;
            if (i3 != this.f4209m) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.f4207k;
            int i7 = i5 + 1;
            d.W(i7, i5, i3, iArr2, iArr2);
            Object[] objArr2 = this.f4208l;
            d.X(i7 << 1, i5 << 1, this.f4209m << 1, objArr2, objArr2);
        }
        int i8 = this.f4209m;
        if (i3 == i8) {
            int[] iArr3 = this.f4207k;
            if (i5 < iArr3.length) {
                iArr3[i5] = iHashCode;
                Object[] objArr3 = this.f4208l;
                int i9 = i5 << 1;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.f4209m = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f4209m;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4209m * 28);
        sb.append('{');
        int i3 = this.f4209m;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object objE = e(i4);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objH = h(i4);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        h.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !h.a(obj2, h(iC))) {
            return false;
        }
        f(iC);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !h.a(obj2, h(iC))) {
            return false;
        }
        g(iC, obj3);
        return true;
    }
}
